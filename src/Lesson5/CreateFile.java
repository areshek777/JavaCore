package Lesson5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CreateFile {

    public static ArrayList<File> fIle = new ArrayList<>();
    public static final String pathFile = "src/Lesson5/test.csv";
    public static final String title = "value1"+ ";" + "value2" + ";" + "value3" + ";"+ System.getProperty("line.separator");

    public static void main(String[] args) throws IOException {
        createFile();
        writeFile();
        AppData appData = readFile();
        System.out.println(appData);

    }

    public static void createFile(){
        Random random = new Random();
        for(int i=1;i<5;i++){
            fIle.add(new File(i, random.nextInt(500), random.nextInt(100)));
        }
    }

    public static void writeFile() throws IOException {
        try (FileOutputStream fileOutput = new FileOutputStream(pathFile)){
            for(byte titleChar :title.getBytes(StandardCharsets.UTF_8)){
                fileOutput.write(titleChar);
            }
            for(File valueColumn : fIle){
                String column = valueColumn.getValue1() + ";" + valueColumn.getValue2()
                        + ";" + valueColumn.getValue3() + ";"+ System.getProperty("line.separator");
                for(byte writeColumn :column.getBytes(StandardCharsets.UTF_8)){
                    fileOutput.write(writeColumn);
                }
            }
        }
    }

    public static AppData readFile() throws IOException {
        AppData readValue = new AppData();
        List<List<String>> reports = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {
            String line = br.readLine();
            readValue.setHeader( line.split(";"));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                reports.add(Arrays.asList(values));
            }
        };

        int[][] result = new int[reports.size()][3];

        for(int i=0;i<reports.size();i++){
            for(int j=0;j<reports.get(i).size();j++){
                result[i][j] = Integer.valueOf(reports.get(i).get(j));
            }
        }
        readValue.setData(result);

        return readValue;


    }


}