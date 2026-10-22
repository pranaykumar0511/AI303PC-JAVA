import java.util.Scanner;
public class praactice{
  public static void main(String[] args){
    String str = "WNEENESENNNN";
    int x=0;
    int y=0;

    for (int i=0;i<str.length();i++){
      char curr = str.charAt(i);
      if(curr.equals("W")){
        x--;
      }else if (curr.equals("N")){
        y++;
      }else if (curr.equals("E")){
        x++;
      }else {
        y--;
      }
    }
    float dist = Math.sqrt(y*y-x*x);
    }
  }
