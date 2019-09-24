package vi;

import java.io.*;

public class split {
    public static void main(String args[]){

        try{
            String thisline = "";
            String writeContent = "";
            String []split;
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("/Users/apple/IdeaProjects/Baitap/src/vi/file/nameVar.txt")));
            BufferedWriter bwContent = new BufferedWriter(new FileWriter(new File("/Users/apple/IdeaProjects/Baitap/src/vi/file/contentVar.txt")));
            BufferedReader br = new BufferedReader(new FileReader(new File("/Users/apple/IdeaProjects/Baitap/src/vi/file/assign.php")));
            while ((thisline = br.readLine()) != null){
                writeContent += thisline+"\n";
            }

            writeContent =  writeContent.trim();
            writeContent = writeContent.replace("';","'@");
           // System.out.println(writeContent);
            System.out.println(writeContent);
            split = writeContent.split("@");
            for(int i = 0 ; i < split.length ; i++){
                if(split[i].indexOf("=") == -1){
                    //bw.write(split[i].split("=")[0]);
                    bwContent.write(split[i]+"@"+"\n");
                }else{
                    //System.out.println(split[i].split("=")[0]);
                    bw.write(split[i].split("=")[0]);
                   // System.out.println(split[i].split("=")[1]);
                    bwContent.write(split[i].split("=")[1]+"@"+"\n");

                }


                //if(split[i].indexOf(';') !=(split[i].length()-1)){

               // }

            }
            bw.close();
            bwContent.close();


        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
