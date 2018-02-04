import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.File;

public class Show_Uid implements DataImple, Color{
	public static void Read_Uid() {
    try{
      ObjectInputStream input = new ObjectInputStream(new FileInputStream(Uid_Dir)); 
      while(true)
      {
        System.out.println(ANSI_RED+"[최근 결과로 얻어진 Setuid 파일 존재]==> "+ANSI_RESET+input.readObject());
      }
    }catch(Exception e){

    }
    System.out.println();
	}
}
