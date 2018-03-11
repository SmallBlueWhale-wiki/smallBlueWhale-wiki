package smallbluewhale.entity;


public class Entry {

  private long entryId;
  private String largeCategory;
  private String smallCategory;
  private String keyWord;
  private String answer;


  public long getEntryId() {
    return entryId;
  }

  public void setEntryId(long entryId) {
    this.entryId = entryId;
  }


  public String getLargeCategory() {
    return largeCategory;
  }

  public void setLargeCategory(String largeCategory) {
    this.largeCategory = largeCategory;
  }


  public String getSmallCategory() {
    return smallCategory;
  }

  public void setSmallCategory(String smallCategory) {
    this.smallCategory = smallCategory;
  }


  public String getKeyWord() {
    return keyWord;
  }

  public void setKeyWord(String keyWord) {
    this.keyWord = keyWord;
  }


  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

}
