package com.example.billing.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *模板渲染
 *在之前所有的@RequestMapping注解的方法中，返回值字符串都被直接传送到浏览器端并显示给用户。
 *但是为了能够呈现更加丰富、美观的页面，我们需要将HTML代码返回给浏览器，浏览器再进行页面的渲染、显示。
 *一种很直观的方法是在处理请求的方法中，直接返回HTML代码，但是这样做的问题在于——一个复杂的页面HTML代码往往也非常复杂
 *，并且嵌入在Java代码中十分不利于维护。更好的做法是将页面的HTML代码写在模板文件中，渲染后再返回给用户。
 *为了能够进行模板渲染，需要将@RestController改成@Controller：
 */

@Controller
public class TestController1 {
	
	/**
	 * 返回值"hello"并非直接将字符串返回给浏览器，而是寻找名字为hello的模板进行渲染
	 * 需要在默认的模板文件夹src/main/resources/templates/目录下添加一个模板文件hello.html
	 * 处理静态文件
	 * 浏览器页面使用HTML作为描述语言，那么必然也脱离不了CSS以及JavaScript。
	 * 为了能够浏览器能够正确加载类似/css/style.css, /js/main.js等资源，
	 * 默认情况下我们只需要在src/main/resources/static目录下添加css/style.css和js/main.js文件后，
	 * Spring MVC能够自动将他们发布，通过访问/css/style.css, /js/main.js也就可以正确加载这些资源。
	 * @param name
	 * @param model
	 * @return
	 */
    @RequestMapping("/test/{name}")
    public String hello(@PathVariable("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }	
}
