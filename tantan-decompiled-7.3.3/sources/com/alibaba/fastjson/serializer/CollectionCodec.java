package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public class CollectionCodec implements ObjectSerializer, ObjectDeserializer {
    public static final CollectionCodec instance = new CollectionCodec();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, com.alibaba.fastjson.JSONArray, java.util.Collection] */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        if (defaultJSONParser.lexer.token() == 8) {
            defaultJSONParser.lexer.nextToken(16);
            return null;
        }
        if (type == JSONArray.class) {
            ?? r1 = (T) new JSONArray();
            defaultJSONParser.parseArray((Collection) r1);
            return r1;
        }
        ?? r2 = (T) TypeUtils.createCollection(type);
        defaultJSONParser.parseArray(TypeUtils.getCollectionItemType(type), r2, obj);
        return r2;
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 14;
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i) throws Throwable {
        JSONSerializer jSONSerializer2;
        Throwable th;
        int i2;
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (obj == null) {
            serializeWriter.writeNull(SerializerFeature.WriteNullListAsEmpty);
            return;
        }
        SerializerFeature serializerFeature = SerializerFeature.WriteClassName;
        Type collectionItemType = (serializeWriter.isEnabled(serializerFeature) || SerializerFeature.isEnabled(i, serializerFeature)) ? TypeUtils.getCollectionItemType(type) : null;
        Collection collection = (Collection) obj;
        SerialContext serialContext = jSONSerializer.context;
        int i3 = 0;
        jSONSerializer.setContext(serialContext, obj, obj2, 0);
        if (serializeWriter.isEnabled(serializerFeature)) {
            if (HashSet.class == collection.getClass()) {
                serializeWriter.append((CharSequence) "Set");
            } else if (TreeSet.class == collection.getClass()) {
                serializeWriter.append((CharSequence) "TreeSet");
            }
        }
        try {
            serializeWriter.append('[');
            for (Object obj3 : collection) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    try {
                        serializeWriter.append(',');
                    } catch (Throwable th2) {
                        th = th2;
                        jSONSerializer2 = jSONSerializer;
                        jSONSerializer2.context = serialContext;
                        throw th;
                    }
                }
                if (obj3 == null) {
                    serializeWriter.writeNull();
                } else {
                    Class<?> cls = obj3.getClass();
                    if (cls == Integer.class) {
                        serializeWriter.writeInt(((Integer) obj3).intValue());
                    } else {
                        if (cls == Long.class) {
                            serializeWriter.writeLong(((Long) obj3).longValue());
                            if (serializeWriter.isEnabled(SerializerFeature.WriteClassName)) {
                                serializeWriter.write(76);
                            }
                        } else {
                            ObjectSerializer objectWriter = jSONSerializer.getObjectWriter(cls);
                            if (SerializerFeature.isEnabled(i, SerializerFeature.WriteClassName) && (objectWriter instanceof JavaBeanSerializer)) {
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                                try {
                                    ((JavaBeanSerializer) objectWriter).writeNoneASM(jSONSerializer2, obj3, Integer.valueOf(i3), collectionItemType, i2);
                                } catch (Throwable th3) {
                                    th = th3;
                                    th = th;
                                    jSONSerializer2.context = serialContext;
                                    throw th;
                                }
                            } else {
                                jSONSerializer2 = jSONSerializer;
                                i2 = i;
                                objectWriter.write(jSONSerializer2, obj3, Integer.valueOf(i3), collectionItemType, i2);
                            }
                        }
                        i3 = i4;
                        jSONSerializer = jSONSerializer2;
                        i = i2;
                    }
                }
                jSONSerializer2 = jSONSerializer;
                i2 = i;
                i3 = i4;
                jSONSerializer = jSONSerializer2;
                i = i2;
            }
            jSONSerializer2 = jSONSerializer;
            serializeWriter.append(']');
            jSONSerializer2.context = serialContext;
        } catch (Throwable th4) {
            th = th4;
            jSONSerializer2 = jSONSerializer;
        }
    }
}
