package com.alibaba.fastjson.support.spring;

import com.alibaba.fastjson.support.spring.annotation.FastJsonFilter;
import com.alibaba.fastjson.support.spring.annotation.FastJsonView;
import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.Order;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/* JADX INFO: loaded from: classes.dex */
@ControllerAdvice
@Order
public class FastJsonViewResponseBodyAdvice implements ResponseBodyAdvice<Object> {
    private FastJsonContainer getOrCreateContainer(Object obj) {
        return obj instanceof FastJsonContainer ? (FastJsonContainer) obj : new FastJsonContainer(obj);
    }

    public FastJsonContainer beforeBodyWrite(Object obj, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> cls, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        FastJsonContainer orCreateContainer = getOrCreateContainer(obj);
        beforeBodyWriteInternal(orCreateContainer, mediaType, methodParameter, serverHttpRequest, serverHttpResponse);
        return orCreateContainer;
    }

    public void beforeBodyWriteInternal(FastJsonContainer fastJsonContainer, MediaType mediaType, MethodParameter methodParameter, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        FastJsonView fastJsonView = (FastJsonView) methodParameter.getMethodAnnotation(FastJsonView.class);
        FastJsonFilter[] fastJsonFilterArrInclude = fastJsonView.include();
        FastJsonFilter[] fastJsonFilterArrExclude = fastJsonView.exclude();
        PropertyPreFilters propertyPreFilters = new PropertyPreFilters();
        for (FastJsonFilter fastJsonFilter : fastJsonFilterArrInclude) {
            propertyPreFilters.addFilter(fastJsonFilter.clazz(), fastJsonFilter.props());
        }
        for (FastJsonFilter fastJsonFilter2 : fastJsonFilterArrExclude) {
            propertyPreFilters.addFilter(fastJsonFilter2.clazz(), new String[0]).addExcludes(fastJsonFilter2.props());
        }
        fastJsonContainer.setFilters(propertyPreFilters);
    }

    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> cls) {
        return FastJsonHttpMessageConverter.class.isAssignableFrom(cls) && methodParameter.hasMethodAnnotation(FastJsonView.class);
    }

    /* JADX INFO: renamed from: beforeBodyWrite, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m223789beforeBodyWrite(Object obj, MethodParameter methodParameter, MediaType mediaType, Class cls, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        return beforeBodyWrite(obj, methodParameter, mediaType, (Class<? extends HttpMessageConverter<?>>) cls, serverHttpRequest, serverHttpResponse);
    }
}
