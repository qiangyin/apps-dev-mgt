package com.cloudzone.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yintongjiang
 * @params
 * @since 2018/4/18
 */
@RestController
@RequestMapping("/arch")
public class ArchController {

    /**
     * 获取技术架构列表
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.GET,
            produces = "application/json;charset=UTF-8")
    public Object selectLangs() {
        return "{\n" +
                "  \"name\": \"主体框架\",\n" +
                "  \"children\": [\n" +
                "    {\n" +
                "      \"name\": \"小程序(apps-dev-mgt)\",\n" +
                "      \"children\": [\n" +
                "        {\n" +
                "          \"name\": \"main(源码)\",\n" +
                "          \"children\": [\n" +
                "            {\n" +
                "              \"name\": \"java(后台java代码)\",\n" +
                "              \"children\": [\n" +
                "                {\n" +
                "                  \"name\": \"common(公共包,entity,utils,常量)\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"name\": \"controller(控制器)\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"name\": \"mapper(数据库操作接口)\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"name\": \"service(业务逻辑层)\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"name\": \"Application(引用启动入口)\"\n" +
                "                }\n" +
                "              ]\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"resources\",\n" +
                "              \"children\": [\n" +
                "                {\n" +
                "                  \"name\": \"mapping(数据库操作SQL包)\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"name\": \"static.Bootstrap(前端JS和CSS引用包)\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"name\": \"views(前端页面包)\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"name\": \"application.properties(项目配置)\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"name\": \"log4j2.xml(日志配置)\"\n" +
                "                }\n" +
                "              ]\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"test(单元测试)\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";
    }

}
