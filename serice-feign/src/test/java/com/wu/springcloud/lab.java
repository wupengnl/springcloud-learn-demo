package com.wu.springcloud;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wupeng
 * @version v1.0
 * @create 2017-09-05 15:45
 * @decription
 **/
public class lab {
    @Test
    public void test(){
        Map<String,Object> map=new HashMap<String,Object>();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        map.put("list",list);
        List<Integer> list1 = new ArrayList<Integer>();
        for(Map.Entry<String,Object> entry : map.entrySet()){
            String value = entry.getKey();
            Object obj = entry.getValue();
            if(obj instanceof List){
                list1 = (List<Integer>) obj;
            }
            for (Integer xx : list1){
                System.out.println(xx);
            }

        }

    }
}

