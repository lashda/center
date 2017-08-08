package com.sunlitkid.center.operator.listener;

import com.alibaba.fastjson.JSONObject;
import com.sunlitkid.center.operator.listener.task.TemperatureTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by sunke on 2017/8/1.
 */
@Service
public class CenterListener {
    static Timer timer = new Timer();
    static{
        startListeners();
    }
    public static void startListeners(){
        try{
            //温度listener
            timer.schedule(new TemperatureTask() ,new Date(),1000);





        }catch (IllegalStateException e){
        }
    }
}
