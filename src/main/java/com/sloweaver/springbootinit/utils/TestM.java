package com.sloweaver.springbootinit.utils;

import cn.hutool.json.JSON;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *  @author sloweaver
 *  @date 2023/03/25
 */
@Service
public class TestM {

    /**
     * 使用对象的序列化进而实现深拷贝
     * @param obj
     * @param <T>
     * @return
     */
    private static <T extends Serializable> T clone2(T obj) {
        T cloneObj = null;
        try {
            ByteOutputStream bos = new ByteOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(obj);
            oos.close();
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            cloneObj = (T) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cloneObj;
    }
    public static HashMap<String,String> cretaemap (String key,String value){
        HashMap<String, String> sites = new HashMap<>();
        sites.put(key,value);
        return sites;
    }
    public static HashMap<String, HashMap<String,String>> copyMap (HashMap<String,HashMap<String,String>> oldMap){
        HashMap<String, HashMap<String,String>> newMap = new HashMap<>();
        for (String s : oldMap.keySet()) {
            newMap.put(s,oldMap.get(s));
        }
        return newMap;
    }

    public void hello() {
        System.out.println("hello world");
    }


    public static void main(String[] args) {
        HashMap<String, HashMap<String,String>> sites = new HashMap<>();
        sites.put("one1", cretaemap("one","第一个"));
        sites.put("two1", cretaemap("two","第二个"));
        sites.put("three1", cretaemap("three","第三个"));
        System.out.println("HashMap: " + sites);
        HashMap<String, HashMap<String,String>> clonesites = copyMap(sites);

        HashMap<String, HashMap<String,String>> clonesites2 = sites;
        System.out.println("clonesites2改前: " + clonesites2);
        sites.put("three1", cretaemap("three","第三个改后"));
        System.out.println("HashMap改后: " + sites);
        System.out.println("Cloned HashMap改后: " + clonesites);
        System.out.println("clonesites2后: " + clonesites2);
        clonesites2.put("three1", cretaemap("three","gogo"));
        System.out.println("clonesites2后sites: " + sites);
        System.out.println("Cloned HashMap改后: " + clonesites);

        //String str = System.getProperty("user.home");
        //System.out.println(str);
        //TextTranslate.translate();
    }
}
