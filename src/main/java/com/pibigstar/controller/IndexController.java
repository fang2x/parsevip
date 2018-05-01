package com.pibigstar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("music/kugou")
	public String toKuGouMusic() {
		return "index";
	}
	@RequestMapping("music/QQ")
	public String toQQMusic() {
		return "QQMusic";
	}
	@RequestMapping("video/tengxun")
	public String toTengXunVideo() {
		return "tengxun";
	}
	@RequestMapping("video/renren")
	public String toRenRenVideo() {
		return "renren";
	}
	@RequestMapping("message")
	public String toMessage() {
		return "message";
	}

}