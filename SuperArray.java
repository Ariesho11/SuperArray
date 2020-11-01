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
    return s;
  }
}
