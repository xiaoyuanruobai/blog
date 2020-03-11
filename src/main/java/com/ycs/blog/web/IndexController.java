package com.ycs.blog.web;


import com.ycs.blog.NotFoundException;
import net.bytebuddy.TypeCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        String blog=null;
        if (blog==null){
            throw  new NotFoundException("博客不存在");
        }
        return "index";
    }
    @GetMapping("/blog")
    public String blog(){
        return "blog";
    }
}
