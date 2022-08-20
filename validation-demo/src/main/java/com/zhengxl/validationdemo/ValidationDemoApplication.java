package com.zhengxl.validationdemo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class ValidationDemoApplication {

    // @see https://blog.csdn.net/lchmyhua88/article/details/116535988
    public static void main(String[] args) {
        SpringApplication.run(ValidationDemoApplication.class, args);
        String jsonString="[{\"input4\":\"40\",\"input3\":\"301\",\"input2\":\"20\",\"input1\":\"10\"}]";
        // String jsonString="[{'input4':40,'input3':'301','input2':20,'input1':10}]";
        JSONArray jsonArray=JSONArray.parseArray(jsonString);
        for(int i=0;i<jsonArray.size();i++){
            JSONObject object= (JSONObject) jsonArray.get(i);
            System.out.println(object.get("input3"));
        }

        String data = "{\"total\":1,\"rows\":[{\"id\":17,\"invt_id\":20,\"seq_no\":\"201800000000027014\",\"goods_seq_no\":1,\"entry_goods_seqno\":\"\",\"list_goods_seqno\":\"123\",\"apply_goods_seqno\":123},{\"id\":18,\"invt_id\":20,\"seq_no\":\"201800000000027014\",\"goods_seq_no\":1,\"entry_goods_seqno\":\"\",\"list_goods_seqno\":\"123\"}]}";


        JSONObject jsonObject = JSONObject.parseObject(data);
        System.out.println(jsonObject);
        System.out.println(jsonObject.getString("rows"));
        List list = Collections.singletonList(jsonObject.getString("rows"));

        System.out.println(list);

        // @see https://www.cnblogs.com/chenyanbin/p/11624500.html
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.toList());
        for (int i=0; i< filtered.size(); i++) {
            System.out.println(filtered.get(i));
        }
    }

}
