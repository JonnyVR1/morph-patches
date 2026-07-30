package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.TypeUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p149l.k860;
import p149l.piq;
import p149l.riq;
import p149l.xiq;

/* JADX INFO: loaded from: classes.dex */
public class JavaBeanDeserializer implements ObjectDeserializer {
    private final Map<String, FieldDeserializer> alterNameFieldDeserializers;
    public final JavaBeanInfo beanInfo;
    protected final Class<?> clazz;
    private ConcurrentMap<String, Object> extraFieldDeserializers;
    private Map<String, FieldDeserializer> fieldDeserializerMap;
    private final FieldDeserializer[] fieldDeserializers;
    private transient long[] hashArray;
    private transient short[] hashArrayMapping;
    private transient long[] smartMatchHashArray;
    private transient short[] smartMatchHashArrayMapping;
    protected final FieldDeserializer[] sortedFieldDeserializers;

    public JavaBeanDeserializer(ParserConfig parserConfig, JavaBeanInfo javaBeanInfo) {
        this.clazz = javaBeanInfo.clazz;
        this.beanInfo = javaBeanInfo;
        FieldInfo[] fieldInfoArr = javaBeanInfo.sortedFields;
        this.sortedFieldDeserializers = new FieldDeserializer[fieldInfoArr.length];
        int length = fieldInfoArr.length;
        HashMap map = null;
        for (int i = 0; i < length; i++) {
            FieldInfo fieldInfo = javaBeanInfo.sortedFields[i];
            FieldDeserializer fieldDeserializerCreateFieldDeserializer = parserConfig.createFieldDeserializer(parserConfig, javaBeanInfo, fieldInfo);
            this.sortedFieldDeserializers[i] = fieldDeserializerCreateFieldDeserializer;
            if (length > 128) {
                if (this.fieldDeserializerMap == null) {
                    this.fieldDeserializerMap = new HashMap();
                }
                this.fieldDeserializerMap.put(fieldInfo.name, fieldDeserializerCreateFieldDeserializer);
            }
            for (String str : fieldInfo.alternateNames) {
                if (map == null) {
                    map = new HashMap();
                }
                map.put(str, fieldDeserializerCreateFieldDeserializer);
            }
        }
        this.alterNameFieldDeserializers = map;
        FieldInfo[] fieldInfoArr2 = javaBeanInfo.fields;
        this.fieldDeserializers = new FieldDeserializer[fieldInfoArr2.length];
        int length2 = fieldInfoArr2.length;
        for (int i2 = 0; i2 < length2; i2++) {
            this.fieldDeserializers[i2] = getFieldDeserializer(javaBeanInfo.fields[i2].name);
        }
    }

    private Object createFactoryInstance(ParserConfig parserConfig, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        return this.beanInfo.factoryMethod.invoke(null, obj);
    }

    public static JavaBeanDeserializer getSeeAlso(ParserConfig parserConfig, JavaBeanInfo javaBeanInfo, String str) {
        JSONType jSONType = javaBeanInfo.jsonType;
        if (jSONType == null) {
            return null;
        }
        for (Class<?> cls : jSONType.seeAlso()) {
            ObjectDeserializer deserializer = parserConfig.getDeserializer(cls);
            if (deserializer instanceof JavaBeanDeserializer) {
                JavaBeanDeserializer javaBeanDeserializer = (JavaBeanDeserializer) deserializer;
                JavaBeanInfo javaBeanInfo2 = javaBeanDeserializer.beanInfo;
                if (javaBeanInfo2.typeName.equals(str)) {
                    return javaBeanDeserializer;
                }
                JavaBeanDeserializer seeAlso = getSeeAlso(parserConfig, javaBeanInfo2, str);
                if (seeAlso != null) {
                    return seeAlso;
                }
            }
        }
        return null;
    }

    public static boolean isSetFlag(int i, int[] iArr) {
        if (iArr == null) {
            return false;
        }
        int i2 = i / 32;
        int i3 = i % 32;
        if (i2 < iArr.length) {
            if (((1 << i3) & iArr[i2]) != 0) {
                return true;
            }
        }
        return false;
    }

    public static void parseArray(Collection collection, ObjectDeserializer objectDeserializer, DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        JSONLexerBase jSONLexerBase = (JSONLexerBase) defaultJSONParser.lexer;
        int i = jSONLexerBase.token();
        if (i == 8) {
            jSONLexerBase.nextToken(16);
            jSONLexerBase.token();
            return;
        }
        if (i != 14) {
            defaultJSONParser.throwException(i);
        }
        if (jSONLexerBase.getCurrent() == '[') {
            jSONLexerBase.next();
            jSONLexerBase.setToken(14);
        } else {
            jSONLexerBase.nextToken(14);
        }
        if (jSONLexerBase.token() == 15) {
            jSONLexerBase.nextToken();
            return;
        }
        int i2 = 0;
        while (true) {
            collection.add(objectDeserializer.deserialze(defaultJSONParser, type, Integer.valueOf(i2)));
            i2++;
            if (jSONLexerBase.token() != 16) {
                break;
            }
            if (jSONLexerBase.getCurrent() == '[') {
                jSONLexerBase.next();
                jSONLexerBase.setToken(14);
            } else {
                jSONLexerBase.nextToken(14);
            }
        }
        int i3 = jSONLexerBase.token();
        if (i3 != 15) {
            defaultJSONParser.throwException(i3);
        }
        if (jSONLexerBase.getCurrent() != ',') {
            jSONLexerBase.nextToken(16);
        } else {
            jSONLexerBase.next();
            jSONLexerBase.setToken(16);
        }
    }

    public void check(JSONLexer jSONLexer, int i) {
        if (jSONLexer.token() == i) {
            return;
        }
        riq.m179531a("syntax error");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[PHI: r17
      0x00ed: PHI (r17v2 boolean) = (r17v1 boolean), (r17v4 boolean), (r17v4 boolean), (r17v4 boolean), (r17v4 boolean) binds: [B:23:0x0065, B:56:0x00e1, B:58:0x00e7, B:50:0x00ca, B:39:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x0105  */
    public Object createInstance(Map<String, Object> map, ParserConfig parserConfig) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        JavaBeanInfo javaBeanInfo;
        FieldInfo[] fieldInfoArr;
        Constructor<?> constructor;
        FieldInfo[] fieldInfoArr2;
        Integer num;
        boolean z;
        String str;
        Object objCast;
        JavaBeanInfo javaBeanInfo2 = this.beanInfo;
        Constructor<?> constructor2 = javaBeanInfo2.creatorConstructor;
        Class<?> cls = Double.TYPE;
        Class<?> cls2 = Float.TYPE;
        Class<?> cls3 = Long.TYPE;
        Class<?> cls4 = Integer.TYPE;
        Class<?> cls5 = Boolean.TYPE;
        boolean z2 = false;
        if (constructor2 != null || javaBeanInfo2.factoryMethod != null) {
            FieldInfo[] fieldInfoArr3 = javaBeanInfo2.fields;
            int length = fieldInfoArr3.length;
            Object[] objArr = new Object[length];
            HashMap map2 = null;
            for (int i = 0; i < length; i++) {
                FieldInfo fieldInfo = fieldInfoArr3[i];
                Object objValueOf = map.get(fieldInfo.name);
                if (objValueOf == null) {
                    Class<?> cls6 = fieldInfo.fieldClass;
                    if (cls6 == cls4) {
                        objValueOf = 0;
                    } else if (cls6 == cls3) {
                        objValueOf = 0L;
                    } else if (cls6 == Short.TYPE) {
                        objValueOf = (short) 0;
                    } else if (cls6 == Byte.TYPE) {
                        objValueOf = (byte) 0;
                    } else if (cls6 == cls2) {
                        objValueOf = Float.valueOf(0.0f);
                    } else if (cls6 == cls) {
                        objValueOf = Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                    } else if (cls6 == Character.TYPE) {
                        objValueOf = '0';
                    } else if (cls6 == cls5) {
                        objValueOf = Boolean.FALSE;
                    }
                    if (map2 == null) {
                        map2 = new HashMap();
                    }
                    map2.put(fieldInfo.name, Integer.valueOf(i));
                }
                objArr[i] = objValueOf;
            }
            if (map2 != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    FieldDeserializer fieldDeserializerSmartMatch = smartMatch(key);
                    if (fieldDeserializerSmartMatch != null && (num = (Integer) map2.get(fieldDeserializerSmartMatch.fieldInfo.name)) != null) {
                        objArr[num.intValue()] = value;
                    }
                }
            }
            JavaBeanInfo javaBeanInfo3 = this.beanInfo;
            if (javaBeanInfo3.creatorConstructor == null) {
                Method method = javaBeanInfo3.factoryMethod;
                if (method == null) {
                    return null;
                }
                try {
                    return method.invoke(null, objArr);
                } catch (Exception e) {
                    throw new JSONException("create factory method error, " + this.beanInfo.factoryMethod.toString(), e);
                }
            }
            if (javaBeanInfo3.f210112kotlin) {
                for (int i2 = 0; i2 < length; i2++) {
                    if (objArr[i2] == null && (fieldInfoArr = (javaBeanInfo = this.beanInfo).fields) != null && i2 < fieldInfoArr.length) {
                        if (fieldInfoArr[i2].fieldClass != String.class || (constructor = javaBeanInfo.kotlinDefaultConstructor) == null) {
                            break;
                            break;
                        }
                        try {
                            Object objNewInstance = constructor.newInstance(null);
                            for (int i3 = 0; i3 < length; i3++) {
                                Object obj = objArr[i3];
                                if (obj != null && (fieldInfoArr2 = this.beanInfo.fields) != null && i3 < fieldInfoArr2.length) {
                                    fieldInfoArr2[i3].set(objNewInstance, obj);
                                }
                            }
                            return objNewInstance;
                        } catch (Exception e2) {
                            throw new JSONException("create instance error, " + this.beanInfo.creatorConstructor.toGenericString(), e2);
                        }
                    }
                }
            }
            try {
                return this.beanInfo.creatorConstructor.newInstance(objArr);
            } catch (Exception e3) {
                throw new JSONException("create instance error, " + this.beanInfo.creatorConstructor.toGenericString(), e3);
            }
        }
        Object objCreateInstance = createInstance((DefaultJSONParser) null, this.clazz);
        for (Map.Entry<String, Object> entry2 : map.entrySet()) {
            String key2 = entry2.getKey();
            Object value2 = entry2.getValue();
            FieldDeserializer fieldDeserializerSmartMatch2 = smartMatch(key2);
            if (fieldDeserializerSmartMatch2 != null) {
                FieldInfo fieldInfo2 = fieldDeserializerSmartMatch2.fieldInfo;
                Field field = fieldInfo2.field;
                Type type = fieldInfo2.fieldType;
                if (field == null) {
                    z = z2;
                    str = fieldInfo2.format;
                    if (str == null && type == Date.class) {
                        objCast = TypeUtils.castToDate(value2, str);
                    } else if (type instanceof ParameterizedType) {
                        objCast = TypeUtils.cast(value2, (ParameterizedType) type, parserConfig);
                    } else {
                        objCast = TypeUtils.cast(value2, type, parserConfig);
                    }
                    fieldDeserializerSmartMatch2.setValue(objCreateInstance, objCast);
                    z2 = z;
                } else {
                    Class<?> type2 = field.getType();
                    if (type2 == cls5) {
                        if (value2 == Boolean.FALSE) {
                            field.setBoolean(objCreateInstance, z2);
                        } else if (value2 == Boolean.TRUE) {
                            field.setBoolean(objCreateInstance, true);
                        } else {
                            z = z2;
                            str = fieldInfo2.format;
                            if (str == null) {
                                if (type instanceof ParameterizedType) {
                                    objCast = TypeUtils.cast(value2, (ParameterizedType) type, parserConfig);
                                } else {
                                    objCast = TypeUtils.cast(value2, type, parserConfig);
                                }
                            } else if (type instanceof ParameterizedType) {
                                objCast = TypeUtils.cast(value2, (ParameterizedType) type, parserConfig);
                            } else {
                                objCast = TypeUtils.cast(value2, type, parserConfig);
                            }
                            fieldDeserializerSmartMatch2.setValue(objCreateInstance, objCast);
                            z2 = z;
                        }
                    } else if (type2 == cls4) {
                        if (value2 instanceof Number) {
                            field.setInt(objCreateInstance, ((Number) value2).intValue());
                        } else {
                            z = z2;
                            str = fieldInfo2.format;
                            if (str == null) {
                                if (type instanceof ParameterizedType) {
                                    objCast = TypeUtils.cast(value2, (ParameterizedType) type, parserConfig);
                                } else {
                                    objCast = TypeUtils.cast(value2, type, parserConfig);
                                }
                            } else if (type instanceof ParameterizedType) {
                                objCast = TypeUtils.cast(value2, (ParameterizedType) type, parserConfig);
                            } else {
                                objCast = TypeUtils.cast(value2, type, parserConfig);
                            }
                            fieldDeserializerSmartMatch2.setValue(objCreateInstance, objCast);
                            z2 = z;
                        }
                    } else if (type2 != cls3) {
                        z = z2;
                        if (type2 == cls2) {
                            if (value2 instanceof Number) {
                                field.setFloat(objCreateInstance, ((Number) value2).floatValue());
                            } else if (value2 instanceof String) {
                                String str2 = (String) value2;
                                field.setFloat(objCreateInstance, str2.length() <= 10 ? TypeUtils.parseFloat(str2) : Float.parseFloat(str2));
                            } else {
                                str = fieldInfo2.format;
                                if (str == null) {
                                    if (type instanceof ParameterizedType) {
                                        objCast = TypeUtils.cast(value2, (ParameterizedType) type, parserConfig);
                                    } else {
                                        objCast = TypeUtils.cast(value2, type, parserConfig);
                                    }
                                } else if (type instanceof ParameterizedType) {
                                    objCast = TypeUtils.cast(value2, (ParameterizedType) type, parserConfig);
                                } else {
                                    objCast = TypeUtils.cast(value2, type, parserConfig);
                                }
                                fieldDeserializerSmartMatch2.setValue(objCreateInstance, objCast);
                            }
                        } else if (type2 == cls) {
                            if (value2 instanceof Number) {
                                field.setDouble(objCreateInstance, ((Number) value2).doubleValue());
                            } else if (value2 instanceof String) {
                                String str3 = (String) value2;
                                field.setDouble(objCreateInstance, str3.length() <= 10 ? TypeUtils.parseDouble(str3) : Double.parseDouble(str3));
                            } else {
                                str = fieldInfo2.format;
                                if (str == null) {
                                    if (type instanceof ParameterizedType) {
                                        objCast = TypeUtils.cast(value2, (ParameterizedType) type, parserConfig);
                                    } else {
                                        objCast = TypeUtils.cast(value2, type, parserConfig);
                                    }
                                } else if (type instanceof ParameterizedType) {
                                    objCast = TypeUtils.cast(value2, (ParameterizedType) type, parserConfig);
                                } else {
                                    objCast = TypeUtils.cast(value2, type, parserConfig);
                                }
                                fieldDeserializerSmartMatch2.setValue(objCreateInstance, objCast);
                            }
                        } else if (value2 == null || type != value2.getClass()) {
                            str = fieldInfo2.format;
                            if (str == null) {
                                if (type instanceof ParameterizedType) {
                                    objCast = TypeUtils.cast(value2, (ParameterizedType) type, parserConfig);
                                } else {
                                    objCast = TypeUtils.cast(value2, type, parserConfig);
                                }
                            } else if (type instanceof ParameterizedType) {
                                objCast = TypeUtils.cast(value2, (ParameterizedType) type, parserConfig);
                            } else {
                                objCast = TypeUtils.cast(value2, type, parserConfig);
                            }
                            fieldDeserializerSmartMatch2.setValue(objCreateInstance, objCast);
                        } else {
                            field.set(objCreateInstance, value2);
                        }
                        z2 = z;
                    } else if (value2 instanceof Number) {
                        field.setLong(objCreateInstance, ((Number) value2).longValue());
                    } else {
                        z = z2;
                        str = fieldInfo2.format;
                        if (str == null) {
                            if (type instanceof ParameterizedType) {
                                objCast = TypeUtils.cast(value2, (ParameterizedType) type, parserConfig);
                            } else {
                                objCast = TypeUtils.cast(value2, type, parserConfig);
                            }
                        } else if (type instanceof ParameterizedType) {
                            objCast = TypeUtils.cast(value2, (ParameterizedType) type, parserConfig);
                        } else {
                            objCast = TypeUtils.cast(value2, type, parserConfig);
                        }
                        fieldDeserializerSmartMatch2.setValue(objCreateInstance, objCast);
                        z2 = z;
                    }
                }
            }
        }
        Method method2 = this.beanInfo.buildMethod;
        if (method2 == null) {
            return objCreateInstance;
        }
        try {
            return method2.invoke(objCreateInstance, null);
        } catch (Exception e4) {
            piq.m169752a("build object error", e4);
            return null;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 26441. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r44, java.lang.reflect.Type r45, java.lang.Object r46, java.lang.Object r47, int r48, int[] r49) {
        /*
            Method dump skipped, instruction units count: 2644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer.deserialze(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object, java.lang.Object, int, int[]):java.lang.Object");
    }

    public <T> T deserialzeArrayMapping(DefaultJSONParser defaultJSONParser, Type type, Object obj, Object obj2) {
        Enum<?> enumScanEnum;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() != 14) {
            riq.m179531a("error");
            return null;
        }
        String strScanTypeName = jSONLexer.scanTypeName(defaultJSONParser.symbolTable);
        if (strScanTypeName != null) {
            ObjectDeserializer seeAlso = getSeeAlso(defaultJSONParser.getConfig(), this.beanInfo, strScanTypeName);
            if (seeAlso == null) {
                seeAlso = defaultJSONParser.getConfig().getDeserializer(defaultJSONParser.getConfig().checkAutoType(strScanTypeName, TypeUtils.getClass(type), jSONLexer.getFeatures()));
            }
            if (seeAlso instanceof JavaBeanDeserializer) {
                return (T) ((JavaBeanDeserializer) seeAlso).deserialzeArrayMapping(defaultJSONParser, type, obj, obj2);
            }
        }
        T t = (T) createInstance(defaultJSONParser, type);
        int length = this.sortedFieldDeserializers.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char c = i == length + (-1) ? ']' : ',';
            FieldDeserializer fieldDeserializer = this.sortedFieldDeserializers[i];
            Class<?> cls = fieldDeserializer.fieldInfo.fieldClass;
            if (cls == Integer.TYPE) {
                fieldDeserializer.setValue((Object) t, jSONLexer.scanInt(c));
            } else if (cls == String.class) {
                fieldDeserializer.setValue((Object) t, jSONLexer.scanString(c));
            } else if (cls == Long.TYPE) {
                fieldDeserializer.setValue(t, jSONLexer.scanLong(c));
            } else if (cls.isEnum()) {
                char current = jSONLexer.getCurrent();
                if (current == '\"' || current == 'n') {
                    enumScanEnum = jSONLexer.scanEnum(cls, defaultJSONParser.getSymbolTable(), c);
                } else if (current < '0' || current > '9') {
                    enumScanEnum = scanEnum(jSONLexer, c);
                } else {
                    enumScanEnum = ((EnumDeserializer) ((DefaultFieldDeserializer) fieldDeserializer).getFieldValueDeserilizer(defaultJSONParser.getConfig())).valueOf(jSONLexer.scanInt(c));
                }
                fieldDeserializer.setValue(t, enumScanEnum);
            } else if (cls == Boolean.TYPE) {
                fieldDeserializer.setValue(t, jSONLexer.scanBoolean(c));
            } else if (cls == Float.TYPE) {
                fieldDeserializer.setValue(t, Float.valueOf(jSONLexer.scanFloat(c)));
            } else if (cls == Double.TYPE) {
                fieldDeserializer.setValue(t, Double.valueOf(jSONLexer.scanDouble(c)));
            } else if (cls == Date.class && jSONLexer.getCurrent() == '1') {
                fieldDeserializer.setValue(t, new Date(jSONLexer.scanLong(c)));
            } else if (cls == BigDecimal.class) {
                fieldDeserializer.setValue(t, jSONLexer.scanDecimal(c));
            } else {
                jSONLexer.nextToken(14);
                FieldInfo fieldInfo = fieldDeserializer.fieldInfo;
                fieldDeserializer.setValue(t, defaultJSONParser.parseObject(fieldInfo.fieldType, fieldInfo.name));
                if (jSONLexer.token() == 15) {
                    break;
                }
                check(jSONLexer, c == ']' ? 15 : 16);
            }
            i++;
        }
        jSONLexer.nextToken(16);
        return t;
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 12;
    }

    public FieldDeserializer getFieldDeserializer(long j) {
        int i = 0;
        if (this.hashArray == null) {
            long[] jArr = new long[this.sortedFieldDeserializers.length];
            int i2 = 0;
            while (true) {
                FieldDeserializer[] fieldDeserializerArr = this.sortedFieldDeserializers;
                if (i2 >= fieldDeserializerArr.length) {
                    break;
                }
                jArr[i2] = TypeUtils.fnv1a_64(fieldDeserializerArr[i2].fieldInfo.name);
                i2++;
            }
            Arrays.sort(jArr);
            this.hashArray = jArr;
        }
        int iBinarySearch = Arrays.binarySearch(this.hashArray, j);
        if (iBinarySearch < 0) {
            return null;
        }
        if (this.hashArrayMapping == null) {
            short[] sArr = new short[this.hashArray.length];
            Arrays.fill(sArr, (short) -1);
            while (true) {
                FieldDeserializer[] fieldDeserializerArr2 = this.sortedFieldDeserializers;
                if (i >= fieldDeserializerArr2.length) {
                    break;
                }
                int iBinarySearch2 = Arrays.binarySearch(this.hashArray, TypeUtils.fnv1a_64(fieldDeserializerArr2[i].fieldInfo.name));
                if (iBinarySearch2 >= 0) {
                    sArr[iBinarySearch2] = (short) i;
                }
                i++;
            }
            this.hashArrayMapping = sArr;
        }
        short s = this.hashArrayMapping[iBinarySearch];
        if (s != -1) {
            return this.sortedFieldDeserializers[s];
        }
        return null;
    }

    public Type getFieldType(int i) {
        return this.sortedFieldDeserializers[i].fieldInfo.fieldType;
    }

    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    public boolean parseField(DefaultJSONParser defaultJSONParser, String str, Object obj, Type type, Map<String, Object> map, int[] iArr) {
        ?? r17;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        int i = Feature.DisableFieldSmartMatch.mask;
        FieldDeserializer fieldDeserializer = (jSONLexer.isEnabled(i) || (i & this.beanInfo.parserFeatures) != 0) ? getFieldDeserializer(str) : smartMatch(str, iArr);
        int i2 = Feature.SupportNonPublicField.mask;
        if (fieldDeserializer != null || (!jSONLexer.isEnabled(i2) && (i2 & this.beanInfo.parserFeatures) == 0)) {
            r17 = 1;
        } else {
            if (this.extraFieldDeserializers == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(1, 0.75f, 1);
                for (Class<?> superclass = this.clazz; superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                    for (Field field : superclass.getDeclaredFields()) {
                        String name = field.getName();
                        if (getFieldDeserializer(name) == null) {
                            int modifiers = field.getModifiers();
                            if ((modifiers & 16) == 0 && (modifiers & 8) == 0) {
                                concurrentHashMap.put(name, field);
                            }
                        }
                    }
                }
                this.extraFieldDeserializers = concurrentHashMap;
            }
            Object obj2 = this.extraFieldDeserializers.get(str);
            if (obj2 == null) {
                r17 = 1;
            } else if (obj2 instanceof FieldDeserializer) {
                fieldDeserializer = (FieldDeserializer) obj2;
                r17 = 1;
            } else {
                Field field2 = (Field) obj2;
                field2.setAccessible(true);
                r17 = 1;
                DefaultFieldDeserializer defaultFieldDeserializer = new DefaultFieldDeserializer(defaultJSONParser.getConfig(), this.clazz, new FieldInfo(str, field2.getDeclaringClass(), field2.getType(), field2.getGenericType(), field2, 0, 0, 0));
                this.extraFieldDeserializers.put(str, defaultFieldDeserializer);
                fieldDeserializer = defaultFieldDeserializer;
            }
        }
        if (fieldDeserializer != null) {
            int i3 = 0;
            while (true) {
                FieldDeserializer[] fieldDeserializerArr = this.sortedFieldDeserializers;
                if (i3 >= fieldDeserializerArr.length) {
                    i3 = -1;
                    break;
                }
                if (fieldDeserializerArr[i3] == fieldDeserializer) {
                    break;
                }
                i3++;
            }
            if (i3 != -1 && iArr != null && str.startsWith("_") && isSetFlag(i3, iArr)) {
                defaultJSONParser.parseExtra(obj, str);
                return false;
            }
            jSONLexer.nextTokenWithColon(fieldDeserializer.getFastMatchToken());
            fieldDeserializer.parseField(defaultJSONParser, obj, type, map);
            if (iArr != null) {
                int i4 = i3 / 32;
                iArr[i4] = iArr[i4] | (r17 << (i3 % 32));
            }
            return r17;
        }
        if (!jSONLexer.isEnabled(Feature.IgnoreNotMatch)) {
            k860.m144904a("setter not found, class ", this.clazz.getName(), ", property ", str);
            return false;
        }
        int i5 = 0;
        int i6 = -1;
        while (true) {
            FieldDeserializer[] fieldDeserializerArr2 = this.sortedFieldDeserializers;
            if (i5 >= fieldDeserializerArr2.length) {
                break;
            }
            FieldDeserializer fieldDeserializer2 = fieldDeserializerArr2[i5];
            FieldInfo fieldInfo = fieldDeserializer2.fieldInfo;
            if (fieldInfo.unwrapped && (fieldDeserializer2 instanceof DefaultFieldDeserializer)) {
                if (fieldInfo.field != null) {
                    DefaultFieldDeserializer defaultFieldDeserializer2 = (DefaultFieldDeserializer) fieldDeserializer2;
                    ObjectDeserializer fieldValueDeserilizer = defaultFieldDeserializer2.getFieldValueDeserilizer(defaultJSONParser.getConfig());
                    if (fieldValueDeserilizer instanceof JavaBeanDeserializer) {
                        FieldDeserializer fieldDeserializer3 = ((JavaBeanDeserializer) fieldValueDeserilizer).getFieldDeserializer(str);
                        if (fieldDeserializer3 != null) {
                            try {
                                Object objCreateInstance = fieldInfo.field.get(obj);
                                if (objCreateInstance == null) {
                                    objCreateInstance = ((JavaBeanDeserializer) fieldValueDeserilizer).createInstance(defaultJSONParser, fieldInfo.fieldType);
                                    fieldDeserializer2.setValue(obj, objCreateInstance);
                                }
                                jSONLexer.nextTokenWithColon(defaultFieldDeserializer2.getFastMatchToken());
                                fieldDeserializer3.parseField(defaultJSONParser, objCreateInstance, type, map);
                                i6 = i5;
                            } catch (Exception e) {
                                piq.m169752a("parse unwrapped field error.", e);
                                return false;
                            }
                        } else {
                            continue;
                        }
                    } else if (fieldValueDeserilizer instanceof MapDeserializer) {
                        MapDeserializer mapDeserializer = (MapDeserializer) fieldValueDeserilizer;
                        try {
                            Map<Object, Object> mapCreateMap = (Map) fieldInfo.field.get(obj);
                            if (mapCreateMap == null) {
                                mapCreateMap = mapDeserializer.createMap(fieldInfo.fieldType);
                                fieldDeserializer2.setValue(obj, mapCreateMap);
                            }
                            jSONLexer.nextTokenWithColon();
                            mapCreateMap.put(str, defaultJSONParser.parse(str));
                            i6 = i5;
                        } catch (Exception e2) {
                            piq.m169752a("parse unwrapped field error.", e2);
                            return false;
                        }
                    } else {
                        continue;
                    }
                } else if (fieldInfo.method.getParameterTypes().length == 2) {
                    jSONLexer.nextTokenWithColon();
                    try {
                        fieldInfo.method.invoke(obj, str, defaultJSONParser.parse(str));
                        i6 = i5;
                    } catch (Exception e3) {
                        piq.m169752a("parse unwrapped field error.", e3);
                        return false;
                    }
                } else {
                    continue;
                }
            }
            i5++;
        }
        if (i6 == -1) {
            defaultJSONParser.parseExtra(obj, str);
            return false;
        }
        if (iArr != null) {
            int i7 = i6 / 32;
            iArr[i7] = iArr[i7] | (r17 << (i6 % 32));
        }
        return r17;
    }

    public Object parseRest(DefaultJSONParser defaultJSONParser, Type type, Object obj, Object obj2, int i) {
        return parseRest(defaultJSONParser, type, obj, obj2, i, new int[0]);
    }

    public Enum scanEnum(JSONLexerBase jSONLexerBase, char[] cArr, ObjectDeserializer objectDeserializer) {
        EnumDeserializer enumDeserializer = objectDeserializer instanceof EnumDeserializer ? (EnumDeserializer) objectDeserializer : null;
        if (enumDeserializer == null) {
            jSONLexerBase.matchStat = -1;
            return null;
        }
        long jScanEnumSymbol = jSONLexerBase.scanEnumSymbol(cArr);
        if (jSONLexerBase.matchStat <= 0) {
            return null;
        }
        Enum enumByHashCode = enumDeserializer.getEnumByHashCode(jScanEnumSymbol);
        if (enumByHashCode == null) {
            if (jScanEnumSymbol == -3750763034362895579L) {
                return null;
            }
            if (jSONLexerBase.isEnabled(Feature.ErrorOnEnumNotMatch)) {
                xiq.m209674a("not match enum value, ", enumDeserializer.enumClass);
                return null;
            }
        }
        return enumByHashCode;
    }

    public FieldDeserializer smartMatch(String str, int[] iArr) {
        boolean zStartsWith;
        if (str == null) {
            return null;
        }
        FieldDeserializer fieldDeserializer = getFieldDeserializer(str, iArr);
        if (fieldDeserializer == null) {
            long jFnv1a_64_lower = TypeUtils.fnv1a_64_lower(str);
            int i = 0;
            if (this.smartMatchHashArray == null) {
                long[] jArr = new long[this.sortedFieldDeserializers.length];
                int i2 = 0;
                while (true) {
                    FieldDeserializer[] fieldDeserializerArr = this.sortedFieldDeserializers;
                    if (i2 >= fieldDeserializerArr.length) {
                        break;
                    }
                    jArr[i2] = TypeUtils.fnv1a_64_lower(fieldDeserializerArr[i2].fieldInfo.name);
                    i2++;
                }
                Arrays.sort(jArr);
                this.smartMatchHashArray = jArr;
            }
            int iBinarySearch = Arrays.binarySearch(this.smartMatchHashArray, jFnv1a_64_lower);
            if (iBinarySearch < 0) {
                zStartsWith = str.startsWith("is");
                if (zStartsWith) {
                    iBinarySearch = Arrays.binarySearch(this.smartMatchHashArray, TypeUtils.fnv1a_64_lower(str.substring(2)));
                }
            } else {
                zStartsWith = false;
            }
            if (iBinarySearch >= 0) {
                if (this.smartMatchHashArrayMapping == null) {
                    short[] sArr = new short[this.smartMatchHashArray.length];
                    Arrays.fill(sArr, (short) -1);
                    while (true) {
                        FieldDeserializer[] fieldDeserializerArr2 = this.sortedFieldDeserializers;
                        if (i >= fieldDeserializerArr2.length) {
                            break;
                        }
                        int iBinarySearch2 = Arrays.binarySearch(this.smartMatchHashArray, TypeUtils.fnv1a_64_lower(fieldDeserializerArr2[i].fieldInfo.name));
                        if (iBinarySearch2 >= 0) {
                            sArr[iBinarySearch2] = (short) i;
                        }
                        i++;
                    }
                    this.smartMatchHashArrayMapping = sArr;
                }
                short s = this.smartMatchHashArrayMapping[iBinarySearch];
                if (s != -1 && !isSetFlag(s, iArr)) {
                    fieldDeserializer = this.sortedFieldDeserializers[s];
                }
            }
            if (fieldDeserializer != null) {
                FieldInfo fieldInfo = fieldDeserializer.fieldInfo;
                if ((fieldInfo.parserFeatures & Feature.DisableFieldSmartMatch.mask) != 0) {
                    return null;
                }
                Class<?> cls = fieldInfo.fieldClass;
                if (zStartsWith && cls != Boolean.TYPE && cls != Boolean.class) {
                    return null;
                }
            }
        }
        return fieldDeserializer;
    }

    public Object parseRest(DefaultJSONParser defaultJSONParser, Type type, Object obj, Object obj2, int i, int[] iArr) {
        return deserialze(defaultJSONParser, type, obj, obj2, i, iArr);
    }

    public Enum<?> scanEnum(JSONLexer jSONLexer, char c) {
        throw new JSONException("illegal enum. " + jSONLexer.info());
    }

    public FieldDeserializer getFieldDeserializer(String str, int[] iArr) {
        FieldDeserializer fieldDeserializer;
        if (str == null) {
            return null;
        }
        Map<String, FieldDeserializer> map = this.fieldDeserializerMap;
        if (map != null && (fieldDeserializer = map.get(str)) != null) {
            return fieldDeserializer;
        }
        int length = this.sortedFieldDeserializers.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            int iCompareTo = this.sortedFieldDeserializers[i2].fieldInfo.name.compareTo(str);
            if (iCompareTo < 0) {
                i = i2 + 1;
            } else {
                if (iCompareTo <= 0) {
                    if (isSetFlag(i2, iArr)) {
                        return null;
                    }
                    return this.sortedFieldDeserializers[i2];
                }
                length = i2 - 1;
            }
        }
        Map<String, FieldDeserializer> map2 = this.alterNameFieldDeserializers;
        if (map2 != null) {
            return map2.get(str);
        }
        return null;
    }

    public JavaBeanDeserializer(ParserConfig parserConfig, Class<?> cls, Type type) {
        this(parserConfig, JavaBeanInfo.build(cls, type, parserConfig.propertyNamingStrategy, parserConfig.fieldBased, parserConfig.compatibleWithJavaBean, parserConfig.isJacksonCompatible()));
    }

    public FieldDeserializer getFieldDeserializer(String str) {
        return getFieldDeserializer(str, null);
    }

    public JavaBeanDeserializer(ParserConfig parserConfig, Class<?> cls) {
        this(parserConfig, cls, cls);
    }

    public FieldDeserializer smartMatch(String str) {
        return smartMatch(str, null);
    }

    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj, int i) {
        return (T) deserialze(defaultJSONParser, type, obj, null, i, null);
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        return (T) deserialze(defaultJSONParser, type, obj, 0);
    }

    public boolean parseField(DefaultJSONParser defaultJSONParser, String str, Object obj, Type type, Map<String, Object> map) {
        return parseField(defaultJSONParser, str, obj, type, map, null);
    }

    public Object createInstance(DefaultJSONParser defaultJSONParser, Type type) {
        Object objNewInstance;
        ParseContext parseContext;
        if ((type instanceof Class) && this.clazz.isInterface()) {
            return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{(Class) type}, new JSONObject());
        }
        JavaBeanInfo javaBeanInfo = this.beanInfo;
        Constructor<?> constructor = javaBeanInfo.defaultConstructor;
        if (constructor == null && javaBeanInfo.factoryMethod == null) {
            return null;
        }
        Method method = javaBeanInfo.factoryMethod;
        if (method != null && javaBeanInfo.defaultConstructorParameterSize > 0) {
            return null;
        }
        try {
            if (javaBeanInfo.defaultConstructorParameterSize != 0) {
                ParseContext context = defaultJSONParser.getContext();
                if (context != null && context.object != null) {
                    if (type instanceof Class) {
                        String name = ((Class) type).getName();
                        String strSubstring = name.substring(0, name.lastIndexOf(36));
                        Object obj = context.object;
                        String name2 = obj.getClass().getName();
                        if (!name2.equals(strSubstring) && (parseContext = context.parent) != null && parseContext.object != null && ("java.util.ArrayList".equals(name2) || "java.util.List".equals(name2) || "java.util.Collection".equals(name2) || "java.util.Map".equals(name2) || "java.util.HashMap".equals(name2))) {
                            obj = parseContext.object.getClass().getName().equals(strSubstring) ? parseContext.object : null;
                        }
                        if (obj != null && (!(obj instanceof Collection) || !((Collection) obj).isEmpty())) {
                            objNewInstance = constructor.newInstance(obj);
                        } else {
                            throw new JSONException("can't create non-static inner class instance.");
                        }
                    } else {
                        throw new JSONException("can't create non-static inner class instance.");
                    }
                } else {
                    throw new JSONException("can't create non-static inner class instance.");
                }
            } else if (constructor != null) {
                objNewInstance = constructor.newInstance(null);
            } else {
                objNewInstance = method.invoke(null, null);
            }
            if (defaultJSONParser != null && defaultJSONParser.lexer.isEnabled(Feature.InitStringFieldAsEmpty)) {
                for (FieldInfo fieldInfo : this.beanInfo.fields) {
                    if (fieldInfo.fieldClass == String.class) {
                        try {
                            fieldInfo.set(objNewInstance, "");
                        } catch (Exception e) {
                            piq.m169752a("create instance error, class ".concat(this.clazz.getName()), e);
                            return null;
                        }
                    }
                }
            }
            return objNewInstance;
        } catch (JSONException e2) {
            throw e2;
        } catch (Exception e3) {
            piq.m169752a("create instance error, class ".concat(this.clazz.getName()), e3);
            return null;
        }
    }
}
