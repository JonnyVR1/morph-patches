package com.alibaba.fastjson.serializer;

/* JADX INFO: loaded from: classes.dex */
public interface ValueFilter extends SerializeFilter {
    Object process(Object obj, String str, Object obj2);
}
