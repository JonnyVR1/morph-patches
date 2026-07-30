package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.serializer.BeanContext;
import com.alibaba.fastjson.util.FieldInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public abstract class FieldDeserializer {
    protected BeanContext beanContext;
    protected final Class<?> clazz;
    public final FieldInfo fieldInfo;

    public FieldDeserializer(Class<?> cls, FieldInfo fieldInfo) {
        this.clazz = cls;
        this.fieldInfo = fieldInfo;
    }

    public int getFastMatchToken() {
        return 0;
    }

    public abstract void parseField(DefaultJSONParser defaultJSONParser, Object obj, Type type, Map<String, Object> map);

    public void setValue(Object obj, Object obj2) {
        String str;
        if (obj2 == null && this.fieldInfo.fieldClass.isPrimitive()) {
            return;
        }
        FieldInfo fieldInfo = this.fieldInfo;
        if (fieldInfo.fieldClass == String.class && (str = fieldInfo.format) != null && str.equals("trim")) {
            obj2 = ((String) obj2).trim();
        }
        try {
            FieldInfo fieldInfo2 = this.fieldInfo;
            Method method = fieldInfo2.method;
            if (method != null) {
                if (!fieldInfo2.getOnly) {
                    method.invoke(obj, obj2);
                    return;
                }
                Class<?> cls = fieldInfo2.fieldClass;
                if (cls == AtomicInteger.class) {
                    AtomicInteger atomicInteger = (AtomicInteger) method.invoke(obj, null);
                    if (atomicInteger != null) {
                        atomicInteger.set(((AtomicInteger) obj2).get());
                        return;
                    }
                    return;
                }
                if (cls == AtomicLong.class) {
                    AtomicLong atomicLong = (AtomicLong) method.invoke(obj, null);
                    if (atomicLong != null) {
                        atomicLong.set(((AtomicLong) obj2).get());
                        return;
                    }
                    return;
                }
                if (cls == AtomicBoolean.class) {
                    AtomicBoolean atomicBoolean = (AtomicBoolean) method.invoke(obj, null);
                    if (atomicBoolean != null) {
                        atomicBoolean.set(((AtomicBoolean) obj2).get());
                        return;
                    }
                    return;
                }
                if (Map.class.isAssignableFrom(method.getReturnType())) {
                    Map map = (Map) method.invoke(obj, null);
                    if (map != null && map != Collections.EMPTY_MAP && !map.getClass().getName().startsWith("java.util.Collections$Unmodifiable")) {
                        map.putAll((Map) obj2);
                        return;
                    }
                    return;
                }
                Collection collection = (Collection) method.invoke(obj, null);
                if (collection != null && obj2 != null && collection != Collections.EMPTY_SET && collection != Collections.EMPTY_LIST && !collection.getClass().getName().startsWith("java.util.Collections$Unmodifiable")) {
                    collection.clear();
                    collection.addAll((Collection) obj2);
                    return;
                }
                return;
            }
            Field field = fieldInfo2.field;
            if (!fieldInfo2.getOnly) {
                if (field != null) {
                    field.set(obj, obj2);
                    return;
                }
                return;
            }
            Class<?> cls2 = fieldInfo2.fieldClass;
            if (cls2 == AtomicInteger.class) {
                AtomicInteger atomicInteger2 = (AtomicInteger) field.get(obj);
                if (atomicInteger2 != null) {
                    atomicInteger2.set(((AtomicInteger) obj2).get());
                    return;
                }
                return;
            }
            if (cls2 == AtomicLong.class) {
                AtomicLong atomicLong2 = (AtomicLong) field.get(obj);
                if (atomicLong2 != null) {
                    atomicLong2.set(((AtomicLong) obj2).get());
                    return;
                }
                return;
            }
            if (cls2 == AtomicBoolean.class) {
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) field.get(obj);
                if (atomicBoolean2 != null) {
                    atomicBoolean2.set(((AtomicBoolean) obj2).get());
                    return;
                }
                return;
            }
            if (Map.class.isAssignableFrom(cls2)) {
                Map map2 = (Map) field.get(obj);
                if (map2 != null && map2 != Collections.EMPTY_MAP && !map2.getClass().getName().startsWith("java.util.Collections$Unmodifiable")) {
                    map2.putAll((Map) obj2);
                    return;
                }
                return;
            }
            Collection collection2 = (Collection) field.get(obj);
            if (collection2 != null && obj2 != null && collection2 != Collections.EMPTY_SET && collection2 != Collections.EMPTY_LIST && !collection2.getClass().getName().startsWith("java.util.Collections$Unmodifiable")) {
                collection2.clear();
                collection2.addAll((Collection) obj2);
            }
        } catch (Exception e) {
            throw new JSONException("set property error, " + this.clazz.getName() + "#" + this.fieldInfo.name, e);
        }
    }

    public void setWrappedValue(String str, Object obj) {
        throw new JSONException("TODO");
    }

    public void setValue(Object obj, int i) {
        setValue(obj, Integer.valueOf(i));
    }

    public void setValue(Object obj, long j) {
        setValue(obj, Long.valueOf(j));
    }

    public void setValue(Object obj, String str) {
        setValue(obj, (Object) str);
    }

    public void setValue(Object obj, boolean z) {
        setValue(obj, Boolean.valueOf(z));
    }
}
