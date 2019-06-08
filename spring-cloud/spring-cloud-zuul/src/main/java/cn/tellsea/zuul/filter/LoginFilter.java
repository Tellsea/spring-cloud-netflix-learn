package cn.tellsea.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class LoginFilter extends ZuulFilter {

    // 类型
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    // 优先级
    @Override
    public int filterOrder() {
        return FilterConstants.PRE_DECORATION_FILTER_ORDER - 1;
    }

    // 要不要过滤
    @Override
    public boolean shouldFilter() {
        return true;
    }

    // 业务逻辑
    @Override
    public Object run() throws ZuulException {
        // 获取请求参数
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String token = request.getParameter("access-token");
        // 判断是否携带了token
        /*if (StringUtils.isBlank(token)) {
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(HttpStatus.FORBIDDEN.value());
            try {
                ctx.getResponse().getWriter().write("Request access-token is empty");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        return null;
    }
}
