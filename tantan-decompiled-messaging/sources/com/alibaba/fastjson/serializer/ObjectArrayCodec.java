package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.TypeUtils;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes.dex */
public class ObjectArrayCodec implements ObjectSerializer, ObjectDeserializer {
    public static final ObjectArrayCodec instance = new ObjectArrayCodec();

    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    private <T> T toObjectArray(DefaultJSONParser defaultJSONParser, Class<?> cls, JSONArray jSONArray) {
        Object objCast;
        if (jSONArray == null) {
            return null;
        }
        int size = jSONArray.size();
        T t = (T) Array.newInstance(cls, size);
        for (int i = 0; i < size; i++) {
            Object objectArray = jSONArray.get(i);
            if (objectArray == jSONArray) {
                Array.set(t, i, t);
            } else if (cls.isArray()) {
                if (!cls.isInstance(objectArray)) {
                    objectArray = toObjectArray(defaultJSONParser, cls, (JSONArray) objectArray);
                }
                Array.set(t, i, objectArray);
            } else {
                if (objectArray instanceof JSONArray) {
                    JSONArray jSONArray2 = (JSONArray) objectArray;
                    int size2 = jSONArray2.size();
                    boolean z = false;
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (jSONArray2.get(i2) == jSONArray) {
                            jSONArray2.set(i, t);
                            z = true;
                        }
                    }
                    if (z) {
                        objCast = jSONArray2.toArray();
                    } else {
                        objCast = null;
                    }
                } else {
                    objCast = null;
                }
                if (objCast == null) {
                    objCast = TypeUtils.cast(objectArray, (Class<Object>) cls, defaultJSONParser.getConfig());
                }
                Array.set(t, i, objCast);
            }
        }
        jSONArray.setRelatedArray(t);
        jSONArray.setComponentType(cls);
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, byte[]] */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        Type componentType;
        Class cls;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        int i = jSONLexer.token();
        Type type2 = null;
        if (i == 8) {
            jSONLexer.nextToken(16);
            return null;
        }
        if (i == 4 || i == 26) {
            ?? r7 = (T) jSONLexer.bytesValue();
            jSONLexer.nextToken(16);
            if (r7.length != 0 || type == byte[].class) {
                return r7;
            }
            return null;
        }
        if (type instanceof GenericArrayType) {
            componentType = ((GenericArrayType) type).getGenericComponentType();
            if (componentType instanceof TypeVariable) {
                TypeVariable typeVariable = (TypeVariable) componentType;
                Type type3 = defaultJSONParser.getContext().type;
                if (type3 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type3;
                    Type rawType = parameterizedType.getRawType();
                    if (rawType instanceof Class) {
                        TypeVariable<Class<T>>[] typeParameters = ((Class) rawType).getTypeParameters();
                        for (int i2 = 0; i2 < typeParameters.length; i2++) {
                            if (typeParameters[i2].getName().equals(typeVariable.getName())) {
                                type2 = parameterizedType.getActualTypeArguments()[i2];
                            }
                        }
                    }
                    cls = type2 instanceof Class ? (Class) type2 : Object.class;
                } else {
                    cls = TypeUtils.getClass(typeVariable.getBounds()[0]);
                }
            } else {
                cls = TypeUtils.getClass(componentType);
            }
        } else {
            componentType = ((Class) type).getComponentType();
            cls = componentType;
        }
        JSONArray jSONArray = new JSONArray();
        defaultJSONParser.parseArray(componentType, jSONArray, obj);
        return (T) toObjectArray(defaultJSONParser, cls, jSONArray);
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 14;
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public final void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i) throws IOException {
        SerializeWriter serializeWriter = jSONSerializer.out;
        Object[] objArr = (Object[]) obj;
        if (obj == null) {
            serializeWriter.writeNull(SerializerFeature.WriteNullListAsEmpty);
            return;
        }
        int length = objArr.length;
        int i2 = length - 1;
        if (i2 == -1) {
            serializeWriter.append((CharSequence) WeJson.EMPTY_ARR);
            return;
        }
        SerialContext serialContext = jSONSerializer.context;
        jSONSerializer.setContext(serialContext, obj, obj2, 0);
        try {
            serializeWriter.append('[');
            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                jSONSerializer.incrementIndent();
                jSONSerializer.println();
                for (int i3 = 0; i3 < length; i3++) {
                    if (i3 != 0) {
                        serializeWriter.write(44);
                        jSONSerializer.println();
                    }
                    jSONSerializer.write(objArr[i3]);
                }
                jSONSerializer.decrementIdent();
                jSONSerializer.println();
                serializeWriter.write(93);
                return;
            }
            Class<?> cls = null;
            ObjectSerializer objectWriter = null;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj3 = objArr[i4];
                if (obj3 == null) {
                    serializeWriter.append((CharSequence) "null,");
                } else {
                    if (jSONSerializer.containsReference(obj3)) {
                        jSONSerializer.writeReference(obj3);
                    } else {
                        Class<?> cls2 = obj3.getClass();
                        if (cls2 == cls) {
                            objectWriter.write(jSONSerializer, obj3, Integer.valueOf(i4), null, 0);
                        } else {
                            objectWriter = jSONSerializer.getObjectWriter(cls2);
                            objectWriter.write(jSONSerializer, obj3, Integer.valueOf(i4), null, 0);
                            cls = cls2;
                        }
                    }
                    serializeWriter.append(',');
                }
            }
            Object obj4 = objArr[i2];
            if (obj4 == null) {
                serializeWriter.append((CharSequence) "null]");
            } else {
                if (jSONSerializer.containsReference(obj4)) {
                    jSONSerializer.writeReference(obj4);
                } else {
                    jSONSerializer.writeWithFieldName(obj4, Integer.valueOf(i2));
                }
                serializeWriter.append(']');
            }
        } finally {
            jSONSerializer.context = serialContext;
        }
    }
}
