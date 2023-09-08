package sem3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

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
        String text = "0";
        while (text != ""){
            text = br.readLine();
            stringBuilder.append(text);
        }
        br.close();
        return stringBuilder.toString();
    }
}
