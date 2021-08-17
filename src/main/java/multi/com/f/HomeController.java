package multi.com.f;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import multi.com.f.dto.MemberDto;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String hello() {
		return "gg";
	}
	
	@RequestMapping("/member")
	public MemberDto getMember() {
		return new MemberDto("aaa","111","aaa","aaa",0);
	}
	
	@RequestMapping("/memberlist")
	public List<MemberDto>memberlist(){
		List<MemberDto>list=new ArrayList<>();
		list.add(new MemberDto("aaa","111","aaa","aaa",3));
		list.add(new MemberDto("bbb","222","bbb","bbb",3));
		list.add(new MemberDto("ccc","333","ccc","ccc",3));
		return list;
		
	}
}
