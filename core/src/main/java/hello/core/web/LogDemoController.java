package hello.core.web;

import hello.core.common.MyLogger;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class LogDemoController {

	private final LogDemoService logDemoService;
	// private final ObjectProvider<MyLogger> myLoggerProvider;
	private final MyLogger myLogger;

	@RequestMapping("log-demo")
	@ResponseBody
	public String logDemo(HttpServletRequest request) {
		String requestURL = request.getRequestURL().toString();
		// MyLogger myLogger = myLoggerProvider.getObject();
		System.out.println("myLogger = " + myLogger);
		myLogger.setRequestURL(requestURL);

		myLogger.log("controller test");
		logDemoService.logic("testId");
		return "OK";
	}
}
