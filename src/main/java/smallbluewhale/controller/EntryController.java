package smallbluewhale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import smallbluewhale.dao.EntryDao;
import smallbluewhale.entity.Entry;

import javax.annotation.Resource;
import java.util.List;

//此控制器处理对/api/entry/**的请求
//即所有搜索百科条目的请求
@RestController
@RequestMapping("/api/entry")
public class EntryController {
    @Autowired
    private EntryDao entryDao;

    //url:/api/entry/entrybykeyword?keyword=.... 请求方式get post都可
    //现在可供测试的url：
    // http://localhost:8080/api/entry/entrybykeyword?keyword=补办
    @RequestMapping("/entrybykeyword")
    List<Entry> searchEntryByKeyword(@RequestParam String keyword){
        keyword="\"%"+keyword+"%\"";
        return entryDao.getEntryByKeyWord(keyword);
    }

}
