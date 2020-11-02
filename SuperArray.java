public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
  }

  public int size(){
    int s = 0;
    for(int i = 0; i < data.length; i++){
      if(data[i] != null) s++;
    }
    s = size;
    return s;
  }

  public boolean add(String element){
    for(int i = 0; i < data.length; i++){
      if(data[i] == null) {
        data[i] = element;
        return true;
      }
    }
    return false;
  }

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    String prev = data[index];
    data[index] = element;
    return prev;
  }

  private void resize(){
    String[] na = new String[data.length+10];
    for(int i = 0; i < data.length; i++){
      na[i] = data[i];
    }
    data = na;
  }

}
