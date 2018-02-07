
	/**
	 * 
	 * Made by rppt 
	 * date 2018-01-25
	 * Using-Way : Find Setuid File
	 *
	 * */

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.ArrayList;
  	import java.io.File;
	
	class Search implements DataImple,Date_cur{
		private String root;
		private String cmd;
		private Process ps;
		private InputStreamReader in_read;
		private BufferedReader bf;
		private final ArrayList<String> file_list = new ArrayList<>();
    		private static String Send_Dir_s;

	  public class Access2_find {
	    public void check_str() 
	      {
	        int size = file_list.size();
	        int uid_count = 0;
	        String per_str;
     
	        for(int i=0; i<size; i++)
	        {
	          if((per_str = file_list.get(i).split("\\s+")[0]).contains("s") || (per_str = file_list.get(i).split("\\s+")[0]).contains("S")){
              	    Send_Dir_s = Setuid.send_args;//reference
	            Setuid_Dir.Save_args(Send_Dir_s);
	            data_set.add(String.valueOf(ANSI_CYAN+"[Setuid] : "+ANSI_RESET+file_list.get(i)+ANSI_RESET));
	            System.out.println(ANSI_RED+"permission["+(i)+"] : "+per_str+ANSI_RESET);
	            uid_count++;
	          }else
	          {
	            System.out.println("permission["+(i)+"] : "+per_str);
	          }
	        }
	        if(uid_count>=1){
	        System.out.println(ANSI_YELLOW+"\nEnd of finding SETUID +per 4000 <= x");
	        System.out.println(ANSI_YELLOW+"**SetUID**");

	        for(int i=0; i<data_set.size(); i++)
	          System.out.println(data_set.get(i));
	        }else{
	        	  data_set.add("\n"+Setuid.ANSI_RED+"Setuid File is not Found!!"+ANSI_RESET);
	          System.out.println(data_set.get(0));
	          return;
	        }
	      }
	  }
		public Search(String root, String cmd) {
			this.root = root;
			this.cmd = cmd;
		}
		public static Search getInstance() {
			return new Search("/", "ls -l ");
		}
		
	public ArrayList<String> Search_Setuid(String args_file) {
			String temp;
	  
	    if(new File(args_file).exists())
	      {
	        cmd += args_file;
	      }else
	      {
	    	  	data_set.add(ANSI_GREEN+"args[1] files not found!!"+ANSI_RESET);

	        System.out.println(data_set.get(0));
	        return data_set;
	      }

	    //try
			try {
        			ps =Runtime.getRuntime().exec(cmd);
				in_read = new InputStreamReader(ps.getInputStream());
				bf = new BufferedReader(in_read);
				
				while((temp = bf.readLine()) != null) {
					file_list.add(temp);
				}

	      			this.new Access2_find().check_str();
			} catch (IOException e) {
				e.printStackTrace();
			}//catch
		  return data_set;
		}
		public static ArrayList<String> renewal(){
			return data_set;
		}
	}
