package vi;

import java.io.*;

public class writeToTxt {
    public static void main(String args[]){
        String []arrEn;
        String []arrVi;
        String stEn = "";
        String stVi = "";
        String thisLine = "";
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("/Users/apple/IdeaProjects/Baitap/src/vi/file/demo.txt")));
            BufferedReader en = new BufferedReader(new FileReader(new File("/Users/apple/IdeaProjects/Baitap/src/vi/file/contentVar.txt")));
            BufferedReader vi = new BufferedReader(new FileReader(new File("/Users/apple/IdeaProjects/Baitap/src/vi/file/viVar.txt")));

            while((thisLine = en.readLine()) != null){
                stEn += thisLine;
            }
            while ((thisLine = vi.readLine()) != null){
                stVi += thisLine;
            }

            arrEn = stEn.split("@");
            arrVi = stVi.split("@");

            bw.write(String.format("%-1500s %-40s%n", "English", "Vietnamese"));
            for(int i = 0; i < arrEn.length ; i++){
                bw.write(String.format("%-1500s %-40s%n",arrEn[i], arrVi[i]));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
