package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class ReferenceCodec implements ObjectSerializer, ObjectDeserializer {
    public static final ReferenceCodec instance = new ReferenceCodec();

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Object object = defaultJSONParser.parseObject(parameterizedType.getActualTypeArguments()[0]);
        Type rawType = parameterizedType.getRawType();
        if (rawType == AtomicReference.class) {
            return (T) new AtomicReference(object);
        }
        if (rawType == WeakReference.class) {
            return (T) new WeakReference(object);
        }
        if (rawType == SoftReference.class) {
            return (T) new SoftReference(object);
        }
        throw new UnsupportedOperationException(rawType.toString());
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 12;
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i) throws IOException {
        jSONSerializer.write(obj instanceof AtomicReference ? ((AtomicReference) obj).get() : ((Reference) obj).get());
    }
}
