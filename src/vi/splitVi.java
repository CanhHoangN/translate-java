package vi;

import java.io.*;

public class splitVi {
    public static void main(String args[]){
        try{
            String thisline = "";
            String writeContent = "";
            String []split;
           // BufferedWriter bw = new BufferedWriter(new FileWriter(new File("/Users/apple/IdeaProjects/Baitap/src/split/file/nameVar.txt")));
            BufferedWriter bwContent = new BufferedWriter(new FileWriter(new File("/Users/apple/IdeaProjects/Baitap/src/vi/file/contentVarVi.txt")));
            BufferedReader br = new BufferedReader(new FileReader(new File("/Users/apple/IdeaProjects/Baitap/src/vi/file/assign_vi.php")));
            while ((thisline = br.readLine()) != null){
                writeContent += thisline+"\n";
            }

            writeContent =  writeContent.trim();
            writeContent = writeContent.replace("';","'@");

            split = writeContent.split("@");
            for(int i = 0 ; i < split.length ; i++){
                if(split[i].indexOf("=") == -1){
                    bwContent.write(split[i]+"@"+"\n");
                }else{
                    bwContent.write(split[i].split("=")[1]+"@"+"\n");

                }

            }
            bwContent.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
