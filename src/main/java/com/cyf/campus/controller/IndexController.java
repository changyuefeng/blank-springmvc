package com.cyf.campus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cyf.campus.dao.SysUserMapper;
import com.cyf.campus.model.SysUser;

@Controller
@RequestMapping("")
public class IndexController {

     @Autowired
     private SysUserMapper sysUserMapper;

    @RequestMapping
    public String index(ModelMap model) {

        // 从testTable中查找ID为1的记录
         SysUser sysUser = sysUserMapper.selectByPrimaryKey(1L);

        model.addAttribute("hello", "hello to spring mvc");
         model.addAttribute("username", sysUser.getUserName());
        return "index";
    }

}
