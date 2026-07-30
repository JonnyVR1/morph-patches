package com.alibaba.fastjson.parser.deserializer;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public interface PropertyProcessable extends ParseProcess {
    void apply(String str, Object obj);

    Type getType(String str);
}
