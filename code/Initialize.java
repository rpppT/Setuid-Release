import java.util.*;
import java.io.*;

public class Initialize{
  public Initialize(File file)
  {
    this.Initialize(file);
  }
  public static void main(String [] args)
  {
    System.out.println("프로그램 초기 상태로 만듭니다.");
    File file = new File(System.getProperty("user.home")+"/Setuid");
    new Initialize(file); 
  }
  public void Initialize(File file)
  {
    try{
    Process ps = Runtime.getRuntime().exec("rm -rfv "+file.getAbsolutePath());
    BufferedReader buffer_read = new BufferedReader(new InputStreamReader(ps.getInputStream()));
    String t_data;

    while((t_data = buffer_read.readLine())!=null)
      System.out.println("Processing ==> "+t_data);

      System.out.println("Completed!!!");
    }catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
