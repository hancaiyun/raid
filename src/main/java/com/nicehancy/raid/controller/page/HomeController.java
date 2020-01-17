package com.nicehancy.raid.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 主页面
 * <p>
 * <p/>
 *
 * @author hancaiyun
 * @since 2020/1/17 14:16
 **/
@Controller
public class HomeController {

    /**
     * 主页面
     * @return      主页视图
     */
    @RequestMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("index");
    }

    /**
     * 游戏预览页面
     * @return      主页视图
     */
    @RequestMapping("/game-review")
    public ModelAndView gameReview(){
        return new ModelAndView("game-review");
    }

    /**
     * 联系我们页面
     * @return      主页视图
     */
    @RequestMapping("/contact")
    public ModelAndView contact(){
        return new ModelAndView("contact");
    }

    /**
     *
     * @return      主页视图
     */
    @RequestMapping("/post")
    public ModelAndView post(){
        return new ModelAndView("post");
    }

    /**
     *
     * @return      主页视图
     */
    @RequestMapping("/single-game-review")
    public ModelAndView singleGameReview(){
        return new ModelAndView("single-game-review");
    }

    /**
     *
     * @return      主页视图
     */
    @RequestMapping("/single-post")
    public ModelAndView singlePost(){
        return new ModelAndView("single-post");
    }
}
