
  import java.util.*;
  import java.io.*;
  import java.lang.*;//standalone

public class Setuid implements DataImple,Date_cur{
    private static ObjectOutputStream out_data;
    private static FileOutputStream fos;
    private static int count;
    
    public static  String send_args;
	  
static {
      if(!path.exists()) 
	 path.mkdirs();

      if(!ver.exists())
        ver.mkdirs();
  
     if(!Uid_Dir.getParentFile().exists())
        Uid_Dir.getParentFile().mkdirs();

     for(File t : ver.listFiles())
       if(t.isFile())
         count++;

     System.out.println("\nRunTime : "+(count+1));
     System.out.println("Executed Time : "+dayTime.format(new Date(System.currentTimeMillis())));
   try{
     if(count==0){
        String str = ver.getAbsolutePath()+"/1";
        new File(str).createNewFile();
     }
     if(!Uid_Dir.exists())
       Uid_Dir.createNewFile();
   }catch(IOException ie){}

     Show_Uid.Read_Uid();
    }

public static void Save_Instance() {
    try {			 
      
      String  buf = ver.getAbsolutePath()+"/"+count;
      File file_t = new File(buf);

       int t_crease = Integer.parseInt(file_t.getName());
       t_crease++;
       fos = new FileOutputStream(ver.getAbsolutePath()+"/"+t_crease);
       fos.close();
      ////////////////////////////////
			 out_data = new ObjectOutputStream(new FileOutputStream(String.valueOf(path.getCanonicalPath()+"/log_"+t_crease)));
		   	 out_data.writeObject(Search.renewal());
			 out_data.close();//close
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
	 
	 public static void main(String[] args) {
		if(args.length==2) {
        		send_args = args[1];
			
		if(args[0].equalsIgnoreCase("setuid")){
		       Search.getInstance().Search_Setuid(args[1]);
	      }
			}else{
	      Search.renewal().add(ANSI_PURPLE+"args.length is over than 2 or lower than 2"+ANSI_RESET);
	      System.out.println(Search.renewal().get(0));
	    }
		Save_Instance();//call method 
		
	    System.out.println(ANSI_RESET+"");
	    System.out.println("Thanks for using my program!!\n"
	                       +"**Made by rppt**\n");
	  }
}

