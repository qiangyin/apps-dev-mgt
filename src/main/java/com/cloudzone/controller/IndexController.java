package com.cloudzone.controller;

import com.cloudzone.common.entity.User;
import com.cloudzone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("aaa", "122");
        return "login";
    }

    @RequestMapping("/login")
    public String login(User userVO, HttpServletRequest request) {
        if ("张三".equals(userVO.getUserName()) && "123456".equals(userVO.getPassword())) {
            request.getSession().setAttribute("张三", "123456");
            return "index";
        } else {
            return "login";
        }
        //        UserExample userExample = new UserExample();
        //        userExample.createCriteria().andUserNameEqualTo(userVO.getUserName()).andPasswordEqualTo(userVO.getPassword());
        //        List<User> userList = userService.selectByExample(userExample);
        //        if (userList.isEmpty()) {
        //            return "login";
        //        } else {
        //            return "index";
        //        }
    }

    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        if (null != request.getSession().getAttribute("张三")) {
            return "index";
        } else {
            return "login";
        }
    }

    @RequestMapping("/system")
    public String system() {
        return "system";
    }

    @RequestMapping("/add_role")
    public String addRole() {
        return "add_role";
    }

    @RequestMapping("/role_list")
    public String roleList() {
        return "role_list";
    }

    @RequestMapping("/app_list")
    public String appList() {
        return "app_list";
    }

    @RequestMapping("/user_list")
    public String userList() {
        return "user_list";
    }

    @RequestMapping("/add_app")
    public String addApp() {
        return "add_app";
    }

    @RequestMapping("/common")
    public String common() {
        return "common";
    }

    @RequestMapping("/shop_list")
    public String shopList() {
        return "shop_list";
    }

    @RequestMapping("/com_lottery")
    public String comLottery() {
        return "com_lottery";
    }

    @RequestMapping("/add_lottery")
    public String addLottery() {
        return "add_lottery";
    }

    @RequestMapping("/temp_list")
    public String tempList() {
        return "temp_list";
    }

    @RequestMapping("/ind_search")
    public String indSearch() {
        return "ind_search";
    }

    @RequestMapping("/suc_list")
    public String sucList() {
        return "suc_list";
    }

    @RequestMapping("/add_suc")
    public String addSuc() {
        return "add_suc";
    }

    @RequestMapping("/architecture")
    public String Achitecture() {
        return "architecture";
    }

    @RequestMapping("/share")
    public String share() {
        return "share";
    }

    @RequestMapping("/add_user")
    public String addUser() {
        return "add_user";
    }

    @RequestMapping("/add_activity")
    public String addActivity() {
        return "add_activity";
    }

    @RequestMapping("/add_temp")
    public String addTemp() {
        return "add_temp";
    }
}
