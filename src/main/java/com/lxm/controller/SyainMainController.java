package com.lxm.controller;

import com.github.pagehelper.PageInfo;
import com.lxm.model.SyainMain;
import com.lxm.service.SyainMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/syain")
public class SyainMainController {
    @Autowired
    private SyainMainService syainMainService;

    @RequestMapping("/show")
    public ModelAndView show(@RequestParam(defaultValue = "1") int page,@RequestParam(defaultValue = "４") int pageSize, ModelAndView mv)throws Exception{

        List<SyainMain> SyainMains=syainMainService.selectAll(page,pageSize);
        PageInfo<SyainMain> pageInfo=new PageInfo(SyainMains);
        //System.out.println("总数量：" + pageInfo.getTotal());
        //System.out.println("当前页查询记录：" + pageInfo.getList().size());
        //System.out.println("当前页码：" + pageInfo.getPageNum());
        //System.out.println("每页显示数量：" + pageInfo.getPageSize());
        //System.out.println("总页：" + pageInfo.getPages());
        mv.addObject("pageInfo",pageInfo);
        //System.out.println(SyainMains);
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping("/update")
    public String update(SyainMain syainMain)throws Exception{
        //System.out.println(syainMain);
        syainMainService.update(syainMain);
        System.out.println("2"+syainMain);
        return "forward:/syain/show";
    }
    @RequestMapping("/edit")
    @ResponseBody
    public SyainMain edit(String id) throws Exception{
        //System.out.println(id);
        int int_id=Integer.parseInt(id);
        SyainMain syainMain= syainMainService.selectById(int_id);
        //System.out.println(syainMain);
        return syainMain;


    }
    @RequestMapping("/insert")
    public String insert(SyainMain syainMain)throws Exception{
        System.out.println(syainMain);
        syainMainService.insert(syainMain);
        System.out.println(syainMain);
        return "forward:/syain/show";
    }

    @RequestMapping("/toadd")
    public ModelAndView toadd( ModelAndView mv)throws Exception{
        mv.setViewName("add");
        return mv;
    }
    @RequestMapping("/delete")
    public String delete(String id)throws Exception{
        int int_id=Integer.parseInt(id);
        syainMainService.delete(int_id);
        return "forward:/syain/show";
    }

    @RequestMapping("/select")
    public ModelAndView selectPart(ModelAndView mv, SyainMain syainMain)throws Exception {
        //System.out.println(syainMain);

        List<SyainMain> SyainMains = syainMainService.selectPart(syainMain);
        PageInfo<SyainMain> pageInfo=new PageInfo(SyainMains);
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("show");
        //System.out.println(pageInfo);
        return mv;
    }

}
