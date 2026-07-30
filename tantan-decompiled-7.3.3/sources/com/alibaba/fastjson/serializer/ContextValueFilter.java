package com.alibaba.fastjson.serializer;

/* JADX INFO: loaded from: classes.dex */
public interface ContextValueFilter extends SerializeFilter {
    Object process(BeanContext beanContext, Object obj, String str, Object obj2);
}
