package com.sj.web;

import com.sj.utils.ThreadLocalUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by chenguang on 2019/8/4.
 */
@Component
public class AccessInterceptor implements HandlerInterceptor {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        logger.info("开始进入拦截器");
        HttpSession session = httpServletRequest.getSession();
       /* Operator operator = (Operator) session.getAttribute("loginInfo");
        if (operator == null) {
            logger.info(String.format("session已失效，id为%s", session.getId()));
            //httpServletResponse.sendRedirect("http://192.168.99.34:9528");
            ApiResponse apiResponse = ApiResponse.error(BaseStatus.System.NOT_LOGIN);
            returnJson(httpServletResponse, JSONObject.toJSONString(apiResponse));
            return false;
        }*/
       Operator operator  = new Operator("test","123");
        ThreadLocalUtil.setOperator(operator);
        return true;
    }

    private void returnJson(HttpServletResponse response, String json) throws Exception {
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        try {
            writer = response.getWriter();
            writer.print(json);

        } catch (IOException e) {
            logger.error("response error", e);
        } finally {
            if (writer != null)
                writer.close();
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
