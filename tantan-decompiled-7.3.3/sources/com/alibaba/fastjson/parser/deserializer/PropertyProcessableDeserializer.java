package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import java.lang.reflect.Type;
import p153l.qkq;

/* JADX INFO: loaded from: classes.dex */
public class PropertyProcessableDeserializer implements ObjectDeserializer {
    public final Class<PropertyProcessable> type;

    public PropertyProcessableDeserializer(Class<PropertyProcessable> cls) {
        this.type = cls;
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        try {
            return (T) defaultJSONParser.parse(this.type.newInstance(), obj);
        } catch (Exception unused) {
            qkq.m176968a("craete instance error");
            return null;
        }
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 12;
    }
}
