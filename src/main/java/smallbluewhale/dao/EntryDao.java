package smallbluewhale.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import smallbluewhale.entity.Entry;

import java.util.List;

@Mapper
public interface EntryDao {
    List<Entry> getEntryByKeyWord(@Param("keyword") String keyword);
}
