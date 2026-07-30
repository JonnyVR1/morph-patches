package com.alibaba.fastjson.serializer;

import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface AutowiredObjectSerializer extends ObjectSerializer {
    Set<Type> getAutowiredFor();
}
