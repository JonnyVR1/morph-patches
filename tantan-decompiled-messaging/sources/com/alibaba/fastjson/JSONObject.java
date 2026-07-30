package com.alibaba.fastjson;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.TypeUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.io.NotActiveException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p149l.ig3;
import p149l.qq3;
import p149l.riq;

/* JADX INFO: loaded from: classes.dex */
public class JSONObject extends JSON implements Map<String, Object>, Cloneable, Serializable, InvocationHandler {
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private static final long serialVersionUID = 1;
    private final Map<String, Object> map;

    public static class SecureObjectInputStream extends ObjectInputStream {
        static Field[] fields;
        static volatile boolean fields_error;

        public SecureObjectInputStream(ObjectInputStream objectInputStream) throws IOException {
            super(objectInputStream);
            int i = 0;
            while (true) {
                try {
                    Field[] fieldArr = fields;
                    if (i >= fieldArr.length) {
                        return;
                    }
                    Field field = fieldArr[i];
                    field.set(this, field.get(objectInputStream));
                    i++;
                } catch (IllegalAccessException unused) {
                    fields_error = true;
                    return;
                }
            }
        }

        public static void ensureFields() {
            if (fields != null || fields_error) {
                return;
            }
            try {
                Field[] declaredFields = ObjectInputStream.class.getDeclaredFields();
                String[] strArr = {"bin", "passHandle", "handles", "curContext"};
                Field[] fieldArr = new Field[4];
                for (int i = 0; i < 4; i++) {
                    Field field = TypeUtils.getField(ObjectInputStream.class, strArr[i], declaredFields);
                    field.setAccessible(true);
                    fieldArr[i] = field;
                }
                fields = fieldArr;
            } catch (Throwable unused) {
                fields_error = true;
            }
        }

        @Override // java.io.ObjectInputStream
        public void readStreamHeader() throws IOException {
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws Throwable {
            String name = objectStreamClass.getName();
            if (name.length() > 2) {
                int iLastIndexOf = name.lastIndexOf(91);
                if (iLastIndexOf != -1) {
                    name = name.substring(iLastIndexOf + 1);
                }
                if (name.length() > 2 && name.charAt(0) == 'L' && name.charAt(name.length() - 1) == ';') {
                    name = name.substring(1, name.length() - 1);
                }
                ParserConfig.global.checkAutoType(name, null, Feature.SupportAutoType.mask);
            }
            return super.resolveClass(objectStreamClass);
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveProxyClass(String[] strArr) throws IOException, ClassNotFoundException {
            for (String str : strArr) {
                ParserConfig.global.checkAutoType(str, null);
            }
            return super.resolveProxyClass(strArr);
        }
    }

    public JSONObject(int i, boolean z) {
        if (z) {
            this.map = new LinkedHashMap(i);
        } else {
            this.map = new HashMap(i);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        SecureObjectInputStream.ensureFields();
        if (SecureObjectInputStream.fields != null && !SecureObjectInputStream.fields_error) {
            try {
                new SecureObjectInputStream(objectInputStream).defaultReadObject();
                return;
            } catch (NotActiveException unused) {
            }
        }
        objectInputStream.defaultReadObject();
        for (Map.Entry<String, Object> entry : this.map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                ParserConfig.global.checkAutoType(key.getClass());
            }
            Object value = entry.getValue();
            if (value != null) {
                ParserConfig.global.checkAutoType(value.getClass());
            }
        }
    }

    @Override // java.util.Map
    public void clear() {
        this.map.clear();
    }

    public Object clone() {
        return new JSONObject((Map<String, Object>) (this.map instanceof LinkedHashMap ? new LinkedHashMap(this.map) : new HashMap(this.map)));
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.map.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, Object>> entrySet() {
        return this.map.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return this.map.equals(obj);
    }

    public JSONObject fluentClear() {
        this.map.clear();
        return this;
    }

    public JSONObject fluentPut(String str, Object obj) {
        this.map.put(str, obj);
        return this;
    }

    public JSONObject fluentPutAll(Map<? extends String, ? extends Object> map) {
        this.map.putAll(map);
        return this;
    }

    public JSONObject fluentRemove(Object obj) {
        this.map.remove(obj);
        return this;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        Object obj2 = this.map.get(obj);
        return (obj2 == null && (obj instanceof Number)) ? this.map.get(obj.toString()) : obj2;
    }

    public BigDecimal getBigDecimal(String str) {
        return TypeUtils.castToBigDecimal(get(str));
    }

    public BigInteger getBigInteger(String str) {
        return TypeUtils.castToBigInteger(get(str));
    }

    public Boolean getBoolean(String str) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        return TypeUtils.castToBoolean(obj);
    }

    public boolean getBooleanValue(String str) {
        Boolean boolCastToBoolean = TypeUtils.castToBoolean(get(str));
        if (boolCastToBoolean == null) {
            return false;
        }
        return boolCastToBoolean.booleanValue();
    }

    public Byte getByte(String str) {
        return TypeUtils.castToByte(get(str));
    }

    public byte getByteValue(String str) {
        Byte bCastToByte = TypeUtils.castToByte(get(str));
        if (bCastToByte == null) {
            return (byte) 0;
        }
        return bCastToByte.byteValue();
    }

    public byte[] getBytes(String str) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        return TypeUtils.castToBytes(obj);
    }

    public Date getDate(String str) {
        return TypeUtils.castToDate(get(str));
    }

    public Double getDouble(String str) {
        return TypeUtils.castToDouble(get(str));
    }

    public double getDoubleValue(String str) {
        Double dCastToDouble = TypeUtils.castToDouble(get(str));
        return dCastToDouble == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : dCastToDouble.doubleValue();
    }

    public Float getFloat(String str) {
        return TypeUtils.castToFloat(get(str));
    }

    public float getFloatValue(String str) {
        Float fCastToFloat = TypeUtils.castToFloat(get(str));
        if (fCastToFloat == null) {
            return 0.0f;
        }
        return fCastToFloat.floatValue();
    }

    public Map<String, Object> getInnerMap() {
        return this.map;
    }

    public int getIntValue(String str) {
        Integer numCastToInt = TypeUtils.castToInt(get(str));
        if (numCastToInt == null) {
            return 0;
        }
        return numCastToInt.intValue();
    }

    public Integer getInteger(String str) {
        return TypeUtils.castToInt(get(str));
    }

    public JSONArray getJSONArray(String str) {
        Object obj = this.map.get(str);
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        if (obj instanceof List) {
            return new JSONArray((List<Object>) obj);
        }
        return obj instanceof String ? (JSONArray) JSON.parse((String) obj) : (JSONArray) JSON.toJSON(obj);
    }

    public JSONObject getJSONObject(String str) {
        Object obj = this.map.get(str);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        if (obj instanceof Map) {
            return new JSONObject((Map<String, Object>) obj);
        }
        return obj instanceof String ? JSON.parseObject((String) obj) : (JSONObject) JSON.toJSON(obj);
    }

    public Long getLong(String str) {
        return TypeUtils.castToLong(get(str));
    }

    public long getLongValue(String str) {
        Long lCastToLong = TypeUtils.castToLong(get(str));
        if (lCastToLong == null) {
            return 0L;
        }
        return lCastToLong.longValue();
    }

    public <T> T getObject(String str, TypeReference typeReference) {
        T t = (T) this.map.get(str);
        return typeReference == null ? t : (T) TypeUtils.cast(t, typeReference.getType(), ParserConfig.getGlobalInstance());
    }

    public Short getShort(String str) {
        return TypeUtils.castToShort(get(str));
    }

    public short getShortValue(String str) {
        Short shCastToShort = TypeUtils.castToShort(get(str));
        if (shCastToShort == null) {
            return (short) 0;
        }
        return shCastToShort.shortValue();
    }

    public java.sql.Date getSqlDate(String str) {
        return TypeUtils.castToSqlDate(get(str));
    }

    public String getString(String str) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public Timestamp getTimestamp(String str) {
        return TypeUtils.castToTimestamp(get(str));
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.map.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length;
        Class<?> cls = Void.TYPE;
        if (length == 1) {
            if (method.getName().equals("equals")) {
                return Boolean.valueOf(equals(objArr[0]));
            }
            if (method.getReturnType() != cls) {
                riq.m179531a("illegal setter");
                return null;
            }
            JSONField jSONField = (JSONField) TypeUtils.getAnnotation(method, JSONField.class);
            String strName = (jSONField == null || jSONField.name().length() == 0) ? null : jSONField.name();
            if (strName == null) {
                String name = method.getName();
                if (!name.startsWith("set")) {
                    riq.m179531a("illegal setter");
                    return null;
                }
                String strSubstring = name.substring(3);
                if (strSubstring.length() == 0) {
                    riq.m179531a("illegal setter");
                    return null;
                }
                strName = Character.toLowerCase(strSubstring.charAt(0)) + strSubstring.substring(1);
            }
            this.map.put(strName, objArr[0]);
            return null;
        }
        if (parameterTypes.length != 0) {
            qq3.m175877a(method.toGenericString());
            return null;
        }
        if (method.getReturnType() == cls) {
            riq.m179531a("illegal getter");
            return null;
        }
        JSONField jSONField2 = (JSONField) TypeUtils.getAnnotation(method, JSONField.class);
        String strName2 = (jSONField2 == null || jSONField2.name().length() == 0) ? null : jSONField2.name();
        if (strName2 == null) {
            String name2 = method.getName();
            if (name2.startsWith("get")) {
                String strSubstring2 = name2.substring(3);
                if (strSubstring2.length() == 0) {
                    riq.m179531a("illegal getter");
                    return null;
                }
                strName2 = Character.toLowerCase(strSubstring2.charAt(0)) + strSubstring2.substring(1);
            } else {
                if (!name2.startsWith("is")) {
                    if (name2.startsWith("hashCode")) {
                        return Integer.valueOf(hashCode());
                    }
                    if (name2.startsWith("toString")) {
                        return toString();
                    }
                    riq.m179531a("illegal getter");
                    return null;
                }
                String strSubstring3 = name2.substring(2);
                if (strSubstring3.length() == 0) {
                    riq.m179531a("illegal getter");
                    return null;
                }
                strName2 = Character.toLowerCase(strSubstring3.charAt(0)) + strSubstring3.substring(1);
            }
        }
        return TypeUtils.cast(this.map.get(strName2), method.getGenericReturnType(), ParserConfig.getGlobalInstance());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        return this.map.keySet();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends Object> map) {
        this.map.putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this.map.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.map.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson.JSON
    public <T> T toJavaObject(Class<T> cls) {
        if (cls == Map.class || cls == JSONObject.class || cls == JSON.class) {
            return this;
        }
        return (cls != Object.class || containsKey(JSON.DEFAULT_TYPE_KEY)) ? (T) TypeUtils.castToJavaBean(this, cls, ParserConfig.getGlobalInstance()) : this;
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        return this.map.values();
    }

    @Override // java.util.Map
    public Object put(String str, Object obj) {
        return this.map.put(str, obj);
    }

    public JSONObject(Map<String, Object> map) {
        if (map != null) {
            this.map = map;
        } else {
            ig3.m135964a("map is null.");
            throw null;
        }
    }

    public <T> T getObject(String str, Type type) {
        return (T) TypeUtils.cast(this.map.get(str), type, ParserConfig.getGlobalInstance());
    }

    public JSONObject(boolean z) {
        this(16, z);
    }

    public <T> T getObject(String str, Class<T> cls) {
        return (T) TypeUtils.castToJavaBean(this.map.get(str), cls);
    }

    public JSONObject(int i) {
        this(i, false);
    }

    public JSONObject() {
        this(16, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T toJavaObject(Class<T> cls, ParserConfig parserConfig, int i) {
        return (cls != Map.class && (cls != Object.class || containsKey(JSON.DEFAULT_TYPE_KEY))) ? (T) TypeUtils.castToJavaBean(this, cls, parserConfig) : this;
    }
}
