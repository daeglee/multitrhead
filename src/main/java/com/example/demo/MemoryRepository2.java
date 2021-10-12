package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryRepository2 {
    ArrayList<String> stringArrayList = new ArrayList<>();

    public void save(String data){
        stringArrayList.add(data);
    }

    public List<String> findAll(){
        return stringArrayList;
    }

    public String findByIndex(int index){
       return stringArrayList.get(index);
    }

    public void setStringArrayList(ArrayList<String> arrayList){
        stringArrayList = arrayList;
    }
}
