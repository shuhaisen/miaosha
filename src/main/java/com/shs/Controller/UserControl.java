package com.shs.Controller;import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.shs.Service.CoService;

@Controller
public class UserControl {
	@Autowired
	private CoService spservice;
	
	@RequestMapping("/goumai")
	@ResponseBody
	public String GouMai() {
		if (spservice.updateSpByid("001"))
			return "购买成功";
		else return "购买失败";		
	}
}
