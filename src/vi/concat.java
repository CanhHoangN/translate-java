package vi;

import java.io.*;

public class concat {
    public static void main(String args[]){
        try{
            String thisline = "";
            String arrViString[];
            String viString = "";
            BufferedReader brVi = new BufferedReader(new FileReader(new File("/Users/apple/IdeaProjects/Baitap/src/split/file/viVar.txt")));
            BufferedReader brName = new BufferedReader(new FileReader(new File("/Users/apple/IdeaProjects/Baitap/src/split/file/nameVar.txt")));
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("/Users/apple/IdeaProjects/Baitap/src/split/file/result.txt")));
            while ((thisline = brVi.readLine()) != null){
                viString += thisline+"\n";
            }
            viString = viString.trim();
            arrViString = viString.split("@");
            System.out.println(arrViString.length);
           // System.out.println(arrViString[545].trim());

            int i = 0;
            while ((thisline = brName.readLine()) != null){
                //System.out.println(arrViString[i]);
                String st = thisline.trim();
                System.out.println(st);
                bw.write(st+" = "+arrViString[i].trim()+";"+"\n");
                i++;
               // System.out.println(arrViString[i].trim());
            }
            System.out.println(i);
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
