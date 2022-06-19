package test2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * 将一个目录下所有TXT文档内的单词按出现频次倒序输出，包括出现次数，要求代码可运行。
 *
 * @Author: shican.sc
 * @Date: 2022/6/19 21:28
 * @see
 */
public class Test2 {

    //思路
    //1）读TXT文档
    //2）通过空格号隔开每一个单词，使用hash表存储单词和
    private static Map<String, Integer> mapper = new ConcurrentHashMap<>();
    public static void main(String[] args) {
        countWord("/Users/shican/IdeaProjects/shican-test/amber/test2/test/test.txt");

        //将map按value进行降序
        Map<String, Integer> collect = mapper.entrySet().stream().sorted((entry1, entry2) -> {
            return entry2.getValue() - entry1.getValue();
        }).collect(Collectors.toMap(Map.Entry::getKey,
                Map.Entry::getValue));

        collect.forEach((key,value) -> {
            System.out.println(key + ": " + value);
        });
    }


    /**
     * 把txt文档保存到String字符串中，并打印出来。
     * @param filename
     */
    public static void countWord(String filename) {
        try {
            FileReader read = new FileReader(filename);
            BufferedReader br = new BufferedReader(read);
            String row;
            while ((row = br.readLine()) != null) {
                if (null == row || "".equals(row)) {
                    continue;
                }

                for(String str :row.split(" ")){
                    if (mapper.containsKey(str)) {
                        mapper.put(str, mapper.get(str)+1);
                    }else{
                        mapper.put(str, 1);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
