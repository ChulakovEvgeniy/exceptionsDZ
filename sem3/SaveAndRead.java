package sem3;

import java.io.*;
import java.nio.file.Path;

public class SaveAndRead{

    public void save(ListHuman humanList, String filePath)throws Exception{
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
        for (int i = 0; i < humanList.size(); i++) {
            String human = humanList.get(i);
            System.out.println(human);
            bw.write(human +"\n");
            }
        bw.close();
        }
    public String read(String filePath)throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        StringBuilder stringBuilder = new StringBuilder();
        String text;
        while ((text = br.readLine()) != null){
            stringBuilder.append(text + "\n");
        }
        br.close();
        return stringBuilder.toString();
    }
}
