package com.puli.controller;

import com.puli.entity.Probability;
import com.puli.service.ProbabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/3/23.
 */
@RestController
public class IndexController {
    @Autowired
    private ProbabilityService probabilityService;

    @RequestMapping("/add")
    public String addIndex(Probability probability){

        Probability p =probabilityService.save(probability);
        return p!=null&&p.equals(null)? "添加成功！^_^!":"添加失败！";
    }
}
