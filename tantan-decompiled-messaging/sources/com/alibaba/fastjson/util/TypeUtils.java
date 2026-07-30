package com.alibaba.fastjson.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.EnumDeserializer;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.CalendarCodec;
import com.alibaba.fastjson.serializer.SerializeBeanInfo;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.meituan.robust.Constants;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import com.vivo.push.PushClientConstants;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.AccessControlException;
import java.sql.Clob;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.KClassImpl;
import p149l.b2s;
import p149l.ig3;
import p149l.j6f;
import p149l.ma5;
import p149l.na5;
import p149l.piq;
import p149l.riq;
import p149l.siq;

/* JADX INFO: loaded from: classes.dex */
public class TypeUtils {
    private static Class<? extends Annotation> class_ManyToMany = null;
    private static boolean class_ManyToMany_error = false;
    private static Class<? extends Annotation> class_OneToMany = null;
    private static boolean class_OneToMany_error = false;
    public static boolean compatibleWithFieldName = false;
    public static boolean compatibleWithJavaBean = false;
    private static volatile Map<Class, String[]> kotlinIgnores = null;
    private static volatile boolean kotlinIgnores_error = false;
    private static volatile boolean kotlin_class_klass_error = false;
    private static volatile boolean kotlin_error = false;
    private static volatile Constructor kotlin_kclass_constructor = null;
    private static volatile Method kotlin_kclass_getConstructors = null;
    private static volatile Method kotlin_kfunction_getParameters = null;
    private static volatile Method kotlin_kparameter_getName = null;
    private static volatile Class kotlin_metadata = null;
    private static volatile boolean kotlin_metadata_error = false;
    private static Method method_HibernateIsInitialized = null;
    private static boolean method_HibernateIsInitialized_error = false;
    private static Class<?> optionalClass = null;
    private static boolean optionalClassInited = false;
    private static Method oracleDateMethod = null;
    private static boolean oracleDateMethodInited = false;
    private static Method oracleTimestampMethod = null;
    private static boolean oracleTimestampMethodInited = false;
    private static Class<?> pathClass = null;
    private static boolean setAccessibleEnable = true;
    private static Class<? extends Annotation> transientClass = null;
    private static boolean transientClassInited = false;
    private static ConcurrentMap<String, Class<?>> mappings = new ConcurrentHashMap(256, 0.75f, 1);
    private static boolean pathClass_error = false;
    private static Class<? extends Annotation> class_JacksonCreator = null;
    private static boolean class_JacksonCreator_error = false;
    private static volatile Class class_Clob = null;
    private static volatile boolean class_Clob_error = false;
    private static volatile Class class_XmlAccessType = null;
    private static volatile Class class_XmlAccessorType = null;
    private static volatile boolean classXmlAccessorType_error = false;
    private static volatile Method method_XmlAccessorType_value = null;
    private static volatile Field field_XmlAccessType_FIELD = null;
    private static volatile Object field_XmlAccessType_FIELD_VALUE = null;

    static {
        try {
            compatibleWithJavaBean = "true".equals(IOUtils.getStringProperty(IOUtils.FASTJSON_COMPATIBLEWITHJAVABEAN));
            compatibleWithFieldName = "true".equals(IOUtils.getStringProperty(IOUtils.FASTJSON_COMPATIBLEWITHFIELDNAME));
        } catch (Throwable unused) {
        }
        addBaseClassMappings();
    }

    private static void addBaseClassMappings() {
        mappings.put(Constants.BYTE, Byte.TYPE);
        mappings.put(Constants.SHORT, Short.TYPE);
        mappings.put(Constants.INT, Integer.TYPE);
        mappings.put(Constants.LONG, Long.TYPE);
        mappings.put(Constants.FLOAT, Float.TYPE);
        mappings.put(Constants.DOUBLE, Double.TYPE);
        mappings.put(Constants.BOOLEAN, Boolean.TYPE);
        mappings.put(Constants.CHAR, Character.TYPE);
        mappings.put("[byte", byte[].class);
        mappings.put("[short", short[].class);
        mappings.put("[int", int[].class);
        mappings.put("[long", long[].class);
        mappings.put("[float", float[].class);
        mappings.put("[double", double[].class);
        mappings.put("[boolean", boolean[].class);
        mappings.put("[char", char[].class);
        mappings.put("[B", byte[].class);
        mappings.put("[S", short[].class);
        mappings.put("[I", int[].class);
        mappings.put("[J", long[].class);
        mappings.put("[F", float[].class);
        mappings.put("[D", double[].class);
        mappings.put("[C", char[].class);
        mappings.put("[Z", boolean[].class);
        Class<?>[] clsArr = {Object.class, Cloneable.class, loadClass("java.lang.AutoCloseable"), Exception.class, RuntimeException.class, IllegalAccessError.class, IllegalAccessException.class, IllegalArgumentException.class, IllegalMonitorStateException.class, IllegalStateException.class, IllegalThreadStateException.class, IndexOutOfBoundsException.class, InstantiationError.class, InstantiationException.class, InternalError.class, InterruptedException.class, LinkageError.class, NegativeArraySizeException.class, NoClassDefFoundError.class, NoSuchFieldError.class, NoSuchFieldException.class, NoSuchMethodError.class, NoSuchMethodException.class, NullPointerException.class, NumberFormatException.class, OutOfMemoryError.class, SecurityException.class, StackOverflowError.class, StringIndexOutOfBoundsException.class, TypeNotPresentException.class, VerifyError.class, StackTraceElement.class, HashMap.class, Hashtable.class, TreeMap.class, java.util.IdentityHashMap.class, WeakHashMap.class, LinkedHashMap.class, HashSet.class, LinkedHashSet.class, TreeSet.class, ArrayList.class, TimeUnit.class, ConcurrentHashMap.class, AtomicInteger.class, AtomicLong.class, Collections.EMPTY_MAP.getClass(), Boolean.class, Character.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, Number.class, String.class, BigDecimal.class, BigInteger.class, BitSet.class, Calendar.class, Date.class, Locale.class, UUID.class, Time.class, java.sql.Date.class, Timestamp.class, SimpleDateFormat.class, JSONObject.class, JSONPObject.class, JSONArray.class};
        for (int i = 0; i < 71; i++) {
            Class<?> cls = clsArr[i];
            if (cls != null) {
                mappings.put(cls.getName(), cls);
            }
        }
    }

    public static void addMapping(String str, Class<?> cls) {
        mappings.put(str, cls);
    }

    public static SerializeBeanInfo buildBeanInfo(Class<?> cls, Map<String, String> map, PropertyNamingStrategy propertyNamingStrategy, boolean z) {
        PropertyNamingStrategy propertyNamingStrategy2;
        int i;
        String[] strArr;
        String str;
        String str2;
        Class<?> cls2;
        Map<String, String> map2;
        List<FieldInfo> listComputeGetters;
        List arrayList;
        JSONType jSONType = (JSONType) getAnnotation(cls, JSONType.class);
        if (jSONType != null) {
            String[] strArrOrders = jSONType.orders();
            String strTypeName = jSONType.typeName();
            if (strTypeName.length() == 0) {
                strTypeName = null;
            }
            PropertyNamingStrategy propertyNamingStrategyNaming = jSONType.naming();
            if (propertyNamingStrategyNaming != PropertyNamingStrategy.CamelCase) {
                propertyNamingStrategy = propertyNamingStrategyNaming;
            }
            int iM4802of = SerializerFeature.m4802of(jSONType.serialzeFeatures());
            String strTypeKey = null;
            for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                JSONType jSONType2 = (JSONType) getAnnotation(superclass, JSONType.class);
                if (jSONType2 == null) {
                    break;
                }
                strTypeKey = jSONType2.typeKey();
                if (strTypeKey.length() != 0) {
                    break;
                }
            }
            for (Class<?> cls3 : cls.getInterfaces()) {
                JSONType jSONType3 = (JSONType) getAnnotation(cls3, JSONType.class);
                if (jSONType3 != null) {
                    strTypeKey = jSONType3.typeKey();
                    if (strTypeKey.length() != 0) {
                        break;
                    }
                }
            }
            propertyNamingStrategy2 = propertyNamingStrategy;
            str2 = (strTypeKey == null || strTypeKey.length() != 0) ? strTypeKey : null;
            strArr = strArrOrders;
            str = strTypeName;
            i = iM4802of;
        } else {
            propertyNamingStrategy2 = propertyNamingStrategy;
            i = 0;
            strArr = null;
            str = null;
            str2 = null;
        }
        HashMap map3 = new HashMap();
        ParserConfig.parserAllFieldToCache(cls, map3);
        if (z) {
            listComputeGetters = computeGettersWithFieldBase(cls, map, false, propertyNamingStrategy2);
            cls2 = cls;
            map2 = map;
        } else {
            cls2 = cls;
            map2 = map;
            listComputeGetters = computeGetters(cls2, jSONType, map2, map3, false, propertyNamingStrategy2);
        }
        FieldInfo[] fieldInfoArr = new FieldInfo[listComputeGetters.size()];
        listComputeGetters.toArray(fieldInfoArr);
        if (strArr == null || strArr.length == 0) {
            arrayList = new ArrayList(listComputeGetters);
            Collections.sort(arrayList);
        } else {
            arrayList = z ? computeGettersWithFieldBase(cls2, map2, true, propertyNamingStrategy2) : computeGetters(cls2, jSONType, map2, map3, true, propertyNamingStrategy2);
        }
        FieldInfo[] fieldInfoArr2 = new FieldInfo[arrayList.size()];
        arrayList.toArray(fieldInfoArr2);
        if (Arrays.equals(fieldInfoArr2, fieldInfoArr)) {
            fieldInfoArr2 = fieldInfoArr;
        }
        return new SerializeBeanInfo(cls2, jSONType, str, str2, i, fieldInfoArr, fieldInfoArr2);
    }

    public static byte byteValue(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return (byte) 0;
        }
        int iScale = bigDecimal.scale();
        return (iScale < -100 || iScale > 100) ? bigDecimal.byteValueExact() : bigDecimal.byteValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T cast(Object obj, Class<T> cls, ParserConfig parserConfig) {
        Object obj2;
        Class<T> cls2 = Boolean.TYPE;
        Class<T> cls3 = Double.TYPE;
        Class<T> cls4 = Float.TYPE;
        Class<T> cls5 = Byte.TYPE;
        Class<T> cls6 = Short.TYPE;
        Class<T> cls7 = Long.TYPE;
        Class<T> cls8 = Integer.TYPE;
        int i = 0;
        if (obj == 0) {
            if (cls == cls8) {
                return (T) 0;
            }
            if (cls == cls7) {
                return (T) 0L;
            }
            if (cls == cls6) {
                return (T) (short) 0;
            }
            if (cls == cls5) {
                return (T) (byte) 0;
            }
            if (cls == cls4) {
                return (T) Float.valueOf(0.0f);
            }
            if (cls == cls3) {
                return (T) Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }
            if (cls == cls2) {
                return (T) Boolean.FALSE;
            }
            return null;
        }
        if (cls == null) {
            ig3.m135964a("clazz is null");
            return null;
        }
        if (cls != obj.getClass()) {
            if (!(obj instanceof Map)) {
                if (cls.isArray()) {
                    if (obj instanceof Collection) {
                        Collection collection = (Collection) obj;
                        T t = (T) Array.newInstance(cls.getComponentType(), collection.size());
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            Array.set(t, i, cast(it.next(), (Class) cls.getComponentType(), parserConfig));
                            i++;
                        }
                        return t;
                    }
                    if (cls == byte[].class) {
                        return (T) castToBytes(obj);
                    }
                }
                if (!cls.isAssignableFrom(obj.getClass())) {
                    if (cls == cls2 || cls == Boolean.class) {
                        return (T) castToBoolean(obj);
                    }
                    if (cls == cls5 || cls == Byte.class) {
                        return (T) castToByte(obj);
                    }
                    if (cls == Character.TYPE || cls == Character.class) {
                        return (T) castToChar(obj);
                    }
                    if (cls == cls6 || cls == Short.class) {
                        return (T) castToShort(obj);
                    }
                    if (cls == cls8 || cls == Integer.class) {
                        return (T) castToInt(obj);
                    }
                    if (cls == cls7 || cls == Long.class) {
                        return (T) castToLong(obj);
                    }
                    if (cls == cls4 || cls == Float.class) {
                        return (T) castToFloat(obj);
                    }
                    if (cls == cls3 || cls == Double.class) {
                        return (T) castToDouble(obj);
                    }
                    if (cls == String.class) {
                        return (T) castToString(obj);
                    }
                    if (cls == BigDecimal.class) {
                        return (T) castToBigDecimal(obj);
                    }
                    if (cls == BigInteger.class) {
                        return (T) castToBigInteger(obj);
                    }
                    if (cls == Date.class) {
                        return (T) castToDate(obj);
                    }
                    if (cls == java.sql.Date.class) {
                        return (T) castToSqlDate(obj);
                    }
                    if (cls == Time.class) {
                        return (T) castToSqlTime(obj);
                    }
                    if (cls == Timestamp.class) {
                        return (T) castToTimestamp(obj);
                    }
                    if (cls.isEnum()) {
                        return (T) castToEnum(obj, cls, parserConfig);
                    }
                    if (Calendar.class.isAssignableFrom(cls)) {
                        Date dateCastToDate = castToDate(obj);
                        if (cls == Calendar.class) {
                            obj2 = (T) Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
                        } else {
                            try {
                                obj2 = (T) ((Calendar) cls.newInstance());
                            } catch (Exception e) {
                                piq.m169752a("can not cast to : ".concat(cls.getName()), e);
                                return null;
                            }
                        }
                        ((Calendar) obj2).setTime(dateCastToDate);
                        return (T) obj2;
                    }
                    String name = cls.getName();
                    if (name.equals("javax.xml.datatype.XMLGregorianCalendar")) {
                        Date dateCastToDate2 = castToDate(obj);
                        Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
                        calendar.setTime(dateCastToDate2);
                        return (T) CalendarCodec.instance.createXMLGregorianCalendar(calendar);
                    }
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                            return null;
                        }
                        if (cls == Currency.class) {
                            return (T) Currency.getInstance(str);
                        }
                        if (cls == Locale.class) {
                            return (T) toLocale(str);
                        }
                        if (name.startsWith("java.time.")) {
                            return (T) JSON.parseObject(JSON.toJSONString(str), cls);
                        }
                    }
                    if (parserConfig.get(cls) != null) {
                        return (T) JSON.parseObject(JSON.toJSONString(obj), cls);
                    }
                    riq.m179531a("can not cast to : ".concat(cls.getName()));
                    return null;
                }
            } else if (cls != Map.class) {
                Map map = (Map) obj;
                if (cls != Object.class || map.containsKey(JSON.DEFAULT_TYPE_KEY)) {
                    return (T) castToJavaBean(map, cls, parserConfig);
                }
            }
        }
        return obj;
    }

    public static BigDecimal castToBigDecimal(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        if (obj instanceof BigInteger) {
            return new BigDecimal((BigInteger) obj);
        }
        String string = obj.toString();
        if (string.length() == 0) {
            return null;
        }
        if ((obj instanceof Map) && ((Map) obj).size() == 0) {
            return null;
        }
        return new BigDecimal(string);
    }

    public static BigInteger castToBigInteger(Object obj) {
        BigDecimal bigDecimal;
        int iScale;
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return BigInteger.valueOf(((Number) obj).longValue());
        }
        if ((obj instanceof BigDecimal) && (iScale = (bigDecimal = (BigDecimal) obj).scale()) > -1000 && iScale < 1000) {
            return bigDecimal.toBigInteger();
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string) || "NULL".equals(string)) {
            return null;
        }
        return new BigInteger(string);
    }

    public static Boolean castToBoolean(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof BigDecimal) {
            return Boolean.valueOf(intValue((BigDecimal) obj) == 1);
        }
        if (obj instanceof Number) {
            return Boolean.valueOf(((Number) obj).intValue() == 1);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                return null;
            }
            if ("true".equalsIgnoreCase(str) || "1".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equalsIgnoreCase(str) || "0".equals(str)) {
                return Boolean.FALSE;
            }
            if ("Y".equalsIgnoreCase(str) || j6f.GPS_DIRECTION_TRUE.equals(str)) {
                return Boolean.TRUE;
            }
            if ("F".equalsIgnoreCase(str) || "N".equals(str)) {
                return Boolean.FALSE;
            }
        }
        siq.m184351a("can not cast to boolean, value : ", obj);
        return null;
    }

    public static Byte castToByte(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigDecimal) {
            return Byte.valueOf(byteValue((BigDecimal) obj));
        }
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (!(obj instanceof String)) {
            siq.m184351a("can not cast to byte, value : ", obj);
            return null;
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
            return null;
        }
        return Byte.valueOf(Byte.parseByte(str));
    }

    public static byte[] castToBytes(Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            return IOUtils.decodeBase64((String) obj);
        }
        siq.m184351a("can not cast to byte[], value : ", obj);
        return null;
    }

    public static Character castToChar(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return (Character) obj;
        }
        if (!(obj instanceof String)) {
            siq.m184351a("can not cast to char, value : ", obj);
            return null;
        }
        String str = (String) obj;
        if (str.length() == 0) {
            return null;
        }
        if (str.length() == 1) {
            return Character.valueOf(str.charAt(0));
        }
        siq.m184351a("can not cast to char, value : ", obj);
        return null;
    }

    public static Date castToDate(Object obj, String str) {
        long j;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof Calendar) {
            return ((Calendar) obj).getTime();
        }
        if (obj instanceof BigDecimal) {
            return new Date(longValue((BigDecimal) obj));
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if ("unixtime".equals(str)) {
                jLongValue *= 1000;
            }
            return new Date(jLongValue);
        }
        if (obj instanceof String) {
            String strSubstring = (String) obj;
            JSONScanner jSONScanner = new JSONScanner(strSubstring);
            try {
                if (jSONScanner.scanISO8601DateIfMatch(false)) {
                    Date time = jSONScanner.getCalendar().getTime();
                    jSONScanner.close();
                    return time;
                }
                jSONScanner.close();
                if (strSubstring.startsWith("/Date(") && strSubstring.endsWith(")/")) {
                    strSubstring = strSubstring.substring(6, strSubstring.length() - 2);
                }
                if (strSubstring.indexOf(45) > 0 || strSubstring.indexOf(43) > 0) {
                    if (str == null) {
                        if (strSubstring.length() == JSON.DEFFAULT_DATE_FORMAT.length() || (strSubstring.length() == 22 && JSON.DEFFAULT_DATE_FORMAT.equals("yyyyMMddHHmmssSSSZ"))) {
                            str = JSON.DEFFAULT_DATE_FORMAT;
                        } else if (strSubstring.length() == 10) {
                            str = "yyyy-MM-dd";
                        } else if (strSubstring.length() == 19) {
                            str = "yyyy-MM-dd HH:mm:ss";
                        } else if (strSubstring.length() == 29 && strSubstring.charAt(26) == ':' && strSubstring.charAt(28) == '0') {
                            str = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
                        } else {
                            str = (strSubstring.length() == 23 && strSubstring.charAt(19) == ',') ? "yyyy-MM-dd HH:mm:ss,SSS" : "yyyy-MM-dd HH:mm:ss.SSS";
                        }
                    }
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, JSON.defaultLocale);
                    simpleDateFormat.setTimeZone(JSON.defaultTimeZone);
                    try {
                        return simpleDateFormat.parse(strSubstring);
                    } catch (ParseException unused) {
                        riq.m179531a("can not cast to Date, value : ".concat(strSubstring));
                        return null;
                    }
                }
                if (strSubstring.length() == 0) {
                    return null;
                }
                j = Long.parseLong(strSubstring);
            } catch (Throwable th) {
                jSONScanner.close();
                throw th;
            }
        } else {
            j = -1;
        }
        if (j != -1) {
            return new Date(j);
        }
        Class<?> cls = obj.getClass();
        if ("oracle.sql.TIMESTAMP".equals(cls.getName())) {
            if (oracleTimestampMethod == null && !oracleTimestampMethodInited) {
                try {
                    oracleTimestampMethod = cls.getMethod("toJdbc", null);
                } catch (NoSuchMethodException unused2) {
                } finally {
                    oracleTimestampMethodInited = true;
                }
            }
            try {
                return (Date) oracleTimestampMethod.invoke(obj, null);
            } catch (Exception e) {
                piq.m169752a("can not cast oracle.sql.TIMESTAMP to Date", e);
                return null;
            }
        }
        if (!"oracle.sql.DATE".equals(cls.getName())) {
            siq.m184351a("can not cast to Date, value : ", obj);
            return null;
        }
        if (oracleDateMethod == null && !oracleDateMethodInited) {
            try {
                oracleDateMethod = cls.getMethod("toJdbc", null);
            } catch (NoSuchMethodException unused3) {
            } finally {
                oracleDateMethodInited = true;
            }
        }
        try {
            return (Date) oracleDateMethod.invoke(obj, null);
        } catch (Exception e2) {
            piq.m169752a("can not cast oracle.sql.DATE to Date", e2);
            return null;
        }
    }

    public static Double castToDouble(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            siq.m184351a("can not cast to double, value : ", obj);
            return null;
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string) || "NULL".equals(string)) {
            return null;
        }
        if (string.indexOf(44) != 0) {
            string = string.replaceAll(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA, "");
        }
        return Double.valueOf(Double.parseDouble(string));
    }

    public static <T> T castToEnum(Object obj, Class<T> cls, ParserConfig parserConfig) {
        try {
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() == 0) {
                    return null;
                }
                if (parserConfig == null) {
                    parserConfig = ParserConfig.getGlobalInstance();
                }
                ObjectDeserializer deserializer = parserConfig.getDeserializer(cls);
                return deserializer instanceof EnumDeserializer ? (T) ((EnumDeserializer) deserializer).getEnumByHashCode(fnv1a_64(str)) : (T) Enum.valueOf(cls, str);
            }
            if (obj instanceof BigDecimal) {
                int iIntValue = intValue((BigDecimal) obj);
                T[] enumConstants = cls.getEnumConstants();
                if (iIntValue < enumConstants.length) {
                    return enumConstants[iIntValue];
                }
            }
            if (obj instanceof Number) {
                int iIntValue2 = ((Number) obj).intValue();
                T[] enumConstants2 = cls.getEnumConstants();
                if (iIntValue2 < enumConstants2.length) {
                    return enumConstants2[iIntValue2];
                }
            }
            riq.m179531a("can not cast to : ".concat(cls.getName()));
            return null;
        } catch (Exception e) {
            piq.m169752a("can not cast to : ".concat(cls.getName()), e);
            return null;
        }
    }

    public static Float castToFloat(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (!(obj instanceof String)) {
            siq.m184351a("can not cast to float, value : ", obj);
            return null;
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string) || "NULL".equals(string)) {
            return null;
        }
        if (string.indexOf(44) != 0) {
            string = string.replaceAll(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA, "");
        }
        return Float.valueOf(Float.parseFloat(string));
    }

    public static Integer castToInt(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof BigDecimal) {
            return Integer.valueOf(intValue((BigDecimal) obj));
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            String strReplaceAll = (String) obj;
            if (strReplaceAll.length() == 0 || "null".equals(strReplaceAll) || "NULL".equals(strReplaceAll)) {
                return null;
            }
            if (strReplaceAll.indexOf(44) != 0) {
                strReplaceAll = strReplaceAll.replaceAll(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA, "");
            }
            return Integer.valueOf(Integer.parseInt(strReplaceAll));
        }
        if (obj instanceof Boolean) {
            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.size() == 2 && map.containsKey("andIncrement") && map.containsKey("andDecrement")) {
                Iterator it = map.values().iterator();
                it.next();
                return castToInt(it.next());
            }
        }
        siq.m184351a("can not cast to int, value : ", obj);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T castToJavaBean(Map<String, Object> map, Class<T> cls, ParserConfig parserConfig) {
        int iIntValueExact;
        try {
            if (cls == StackTraceElement.class) {
                String str = (String) map.get(PushClientConstants.TAG_CLASS_NAME);
                String str2 = (String) map.get("methodName");
                String str3 = (String) map.get("fileName");
                Number number = (Number) map.get("lineNumber");
                if (number == null) {
                    iIntValueExact = 0;
                } else {
                    iIntValueExact = number instanceof BigDecimal ? ((BigDecimal) number).intValueExact() : number.intValue();
                }
                return (T) new StackTraceElement(str, str2, str3, iIntValueExact);
            }
            Object obj = map.get(JSON.DEFAULT_TYPE_KEY);
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (parserConfig == null) {
                    parserConfig = ParserConfig.global;
                }
                Class<?> clsCheckAutoType = parserConfig.checkAutoType(str4, null);
                if (clsCheckAutoType == null) {
                    throw new ClassNotFoundException(str4.concat(" not found"));
                }
                if (!clsCheckAutoType.equals(cls)) {
                    return (T) castToJavaBean(map, clsCheckAutoType, parserConfig);
                }
            }
            if (cls.isInterface()) {
                JSONObject jSONObject = map instanceof JSONObject ? (JSONObject) map : new JSONObject(map);
                if (parserConfig == null) {
                    parserConfig = ParserConfig.getGlobalInstance();
                }
                return parserConfig.get(cls) != null ? (T) JSON.parseObject(JSON.toJSONString(jSONObject), cls) : (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, jSONObject);
            }
            if (cls == Locale.class) {
                Object obj2 = map.get(IjkMediaMeta.IJKM_KEY_LANGUAGE);
                Object obj3 = map.get("country");
                if (obj2 instanceof String) {
                    String str5 = (String) obj2;
                    if (obj3 instanceof String) {
                        return (T) new Locale(str5, (String) obj3);
                    }
                    if (obj3 == null) {
                        return (T) new Locale(str5);
                    }
                }
            }
            if (cls == String.class && (map instanceof JSONObject)) {
                return (T) map.toString();
            }
            if (cls == JSON.class && (map instanceof JSONObject)) {
                return map;
            }
            if (cls == LinkedHashMap.class && (map instanceof JSONObject)) {
                T t = (T) ((JSONObject) map).getInnerMap();
                if (t instanceof LinkedHashMap) {
                    return t;
                }
                new LinkedHashMap().putAll(t);
            }
            if (cls.isInstance(map)) {
                return map;
            }
            if (cls == JSONObject.class) {
                return (T) new JSONObject(map);
            }
            if (parserConfig == null) {
                parserConfig = ParserConfig.getGlobalInstance();
            }
            ObjectDeserializer deserializer = parserConfig.getDeserializer(cls);
            JavaBeanDeserializer javaBeanDeserializer = deserializer instanceof JavaBeanDeserializer ? (JavaBeanDeserializer) deserializer : null;
            if (javaBeanDeserializer != null) {
                return (T) javaBeanDeserializer.createInstance(map, parserConfig);
            }
            throw new JSONException("can not get javaBeanDeserializer. ".concat(cls.getName()));
        } catch (Exception e) {
            piq.m169752a(e.getMessage(), e);
            return null;
        }
    }

    public static Long castToLong(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigDecimal) {
            return Long.valueOf(longValue((BigDecimal) obj));
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            String strReplaceAll = (String) obj;
            if (strReplaceAll.length() == 0 || "null".equals(strReplaceAll) || "NULL".equals(strReplaceAll)) {
                return null;
            }
            if (strReplaceAll.indexOf(44) != 0) {
                strReplaceAll = strReplaceAll.replaceAll(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA, "");
            }
            try {
                return Long.valueOf(Long.parseLong(strReplaceAll));
            } catch (NumberFormatException unused) {
                JSONScanner jSONScanner = new JSONScanner(strReplaceAll);
                Calendar calendar = jSONScanner.scanISO8601DateIfMatch(false) ? jSONScanner.getCalendar() : null;
                jSONScanner.close();
                if (calendar != null) {
                    return Long.valueOf(calendar.getTimeInMillis());
                }
            }
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.size() == 2 && map.containsKey("andIncrement") && map.containsKey("andDecrement")) {
                Iterator it = map.values().iterator();
                it.next();
                return castToLong(it.next());
            }
        }
        siq.m184351a("can not cast to long, value : ", obj);
        return null;
    }

    public static Short castToShort(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigDecimal) {
            return Short.valueOf(shortValue((BigDecimal) obj));
        }
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        if (!(obj instanceof String)) {
            siq.m184351a("can not cast to short, value : ", obj);
            return null;
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
            return null;
        }
        return Short.valueOf(Short.parseShort(str));
    }

    public static java.sql.Date castToSqlDate(Object obj) {
        long jLongValue;
        if (obj == null) {
            return null;
        }
        if (obj instanceof java.sql.Date) {
            return (java.sql.Date) obj;
        }
        if (obj instanceof Date) {
            return new java.sql.Date(((Date) obj).getTime());
        }
        if (obj instanceof Calendar) {
            return new java.sql.Date(((Calendar) obj).getTimeInMillis());
        }
        if (obj instanceof BigDecimal) {
            jLongValue = longValue((BigDecimal) obj);
        } else {
            jLongValue = obj instanceof Number ? ((Number) obj).longValue() : 0L;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() != 0 && !"null".equals(str) && !"NULL".equals(str)) {
                if (isNumber(str)) {
                    jLongValue = Long.parseLong(str);
                } else {
                    JSONScanner jSONScanner = new JSONScanner(str);
                    if (jSONScanner.scanISO8601DateIfMatch(false)) {
                        jLongValue = jSONScanner.getCalendar().getTime().getTime();
                    } else {
                        riq.m179531a("can not cast to Timestamp, value : ".concat(str));
                    }
                }
            }
            return null;
        }
        if (jLongValue > 0) {
            return new java.sql.Date(jLongValue);
        }
        siq.m184351a("can not cast to Date, value : ", obj);
        return null;
    }

    public static Time castToSqlTime(Object obj) {
        long jLongValue;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Time) {
            return (Time) obj;
        }
        if (obj instanceof Date) {
            return new Time(((Date) obj).getTime());
        }
        if (obj instanceof Calendar) {
            return new Time(((Calendar) obj).getTimeInMillis());
        }
        if (obj instanceof BigDecimal) {
            jLongValue = longValue((BigDecimal) obj);
        } else {
            jLongValue = obj instanceof Number ? ((Number) obj).longValue() : 0L;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() != 0 && !"null".equalsIgnoreCase(str)) {
                if (isNumber(str)) {
                    jLongValue = Long.parseLong(str);
                } else {
                    JSONScanner jSONScanner = new JSONScanner(str);
                    if (jSONScanner.scanISO8601DateIfMatch(false)) {
                        jLongValue = jSONScanner.getCalendar().getTime().getTime();
                    } else {
                        riq.m179531a("can not cast to Timestamp, value : ".concat(str));
                    }
                }
            }
            return null;
        }
        if (jLongValue > 0) {
            return new Time(jLongValue);
        }
        siq.m184351a("can not cast to Date, value : ", obj);
        return null;
    }

    public static String castToString(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static Timestamp castToTimestamp(Object obj) {
        long jLongValue;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Calendar) {
            return new Timestamp(((Calendar) obj).getTimeInMillis());
        }
        if (obj instanceof Timestamp) {
            return (Timestamp) obj;
        }
        if (obj instanceof Date) {
            return new Timestamp(((Date) obj).getTime());
        }
        if (obj instanceof BigDecimal) {
            jLongValue = longValue((BigDecimal) obj);
        } else {
            jLongValue = obj instanceof Number ? ((Number) obj).longValue() : 0L;
        }
        if (obj instanceof String) {
            String strSubstring = (String) obj;
            if (strSubstring.length() != 0 && !"null".equals(strSubstring) && !"NULL".equals(strSubstring)) {
                if (strSubstring.endsWith(".000000000")) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 10);
                } else if (strSubstring.endsWith(".000000")) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 7);
                }
                if (isNumber(strSubstring)) {
                    jLongValue = Long.parseLong(strSubstring);
                } else {
                    JSONScanner jSONScanner = new JSONScanner(strSubstring);
                    if (jSONScanner.scanISO8601DateIfMatch(false)) {
                        jLongValue = jSONScanner.getCalendar().getTime().getTime();
                    } else {
                        riq.m179531a("can not cast to Timestamp, value : ".concat(strSubstring));
                    }
                }
            }
            return null;
        }
        if (jLongValue > 0) {
            return new Timestamp(jLongValue);
        }
        siq.m184351a("can not cast to Timestamp, value : ", obj);
        return null;
    }

    public static Type checkPrimitiveArray(GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        String strConcat = "[";
        while (genericComponentType instanceof GenericArrayType) {
            genericComponentType = ((GenericArrayType) genericComponentType).getGenericComponentType();
            strConcat = strConcat.concat(strConcat);
        }
        if (!(genericComponentType instanceof Class)) {
            return genericArrayType;
        }
        Class cls = (Class) genericComponentType;
        if (!cls.isPrimitive()) {
            return genericArrayType;
        }
        try {
            if (cls == Boolean.TYPE) {
                return Class.forName(strConcat + "Z");
            }
            if (cls == Character.TYPE) {
                return Class.forName(strConcat + b2s.C_ZONE);
            }
            if (cls == Byte.TYPE) {
                return Class.forName(strConcat + "B");
            }
            if (cls == Short.TYPE) {
                return Class.forName(strConcat + j6f.LATITUDE_SOUTH);
            }
            if (cls == Integer.TYPE) {
                return Class.forName(strConcat + "I");
            }
            if (cls == Long.TYPE) {
                return Class.forName(strConcat + "J");
            }
            if (cls == Float.TYPE) {
                return Class.forName(strConcat + "F");
            }
            if (cls != Double.TYPE) {
                return genericArrayType;
            }
            return Class.forName(strConcat + "D");
        } catch (ClassNotFoundException unused) {
            return genericArrayType;
        }
    }

    public static void clearClassMapping() {
        mappings.clear();
        addBaseClassMappings();
    }

    private static void computeFields(Class<?> cls, Map<String, String> map, PropertyNamingStrategy propertyNamingStrategy, Map<String, FieldInfo> map2, Field[] fieldArr) {
        int i;
        int i2;
        int i3;
        String strLabel;
        for (Field field : fieldArr) {
            if (!Modifier.isStatic(field.getModifiers())) {
                JSONField jSONField = (JSONField) getAnnotation(field, JSONField.class);
                String name = field.getName();
                if (jSONField == null) {
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                    strLabel = null;
                } else if (jSONField.serialize()) {
                    int iOrdinal = jSONField.ordinal();
                    int iM4802of = SerializerFeature.m4802of(jSONField.serialzeFeatures());
                    int iM4801of = Feature.m4801of(jSONField.parseFeatures());
                    if (jSONField.name().length() != 0) {
                        name = jSONField.name();
                    }
                    strLabel = jSONField.label().length() != 0 ? jSONField.label() : null;
                    i = iOrdinal;
                    i2 = iM4802of;
                    i3 = iM4801of;
                }
                if (map == null || (name = map.get(name)) != null) {
                    if (propertyNamingStrategy != null) {
                        name = propertyNamingStrategy.translate(name);
                    }
                    String str = name;
                    if (!map2.containsKey(str)) {
                        map2.put(str, new FieldInfo(str, null, field, cls, null, i, i2, i3, null, jSONField, strLabel));
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x029d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x029f  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:156:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:158:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:161:0x02df  */
    /* JADX WARN: Code duplicated, block: B:163:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:165:0x0305  */
    /* JADX WARN: Code duplicated, block: B:171:0x031c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0325  */
    /* JADX WARN: Code duplicated, block: B:176:0x032b  */
    /* JADX WARN: Code duplicated, block: B:180:0x0337  */
    /* JADX WARN: Code duplicated, block: B:189:0x0368  */
    /* JADX WARN: Code duplicated, block: B:220:0x03f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:221:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:223:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:225:0x0400  */
    /* JADX WARN: Code duplicated, block: B:227:0x040a  */
    /* JADX WARN: Code duplicated, block: B:230:0x0412  */
    /* JADX WARN: Code duplicated, block: B:232:0x0430  */
    /* JADX WARN: Code duplicated, block: B:234:0x0436  */
    /* JADX WARN: Code duplicated, block: B:237:0x0442 A[PHI: r0
      0x0442: PHI (r0v27 java.lang.String) = (r0v17 java.lang.String), (r0v29 java.lang.String) binds: [B:231:0x042e, B:233:0x0434] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:240:0x044e  */
    /* JADX WARN: Code duplicated, block: B:242:0x0454  */
    /* JADX WARN: Code duplicated, block: B:243:0x0457  */
    /* JADX WARN: Code duplicated, block: B:250:0x046a  */
    /* JADX WARN: Code duplicated, block: B:254:0x0476  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e1 A[PHI: r6 r8 r20
      0x00e1: PHI (r6v16 java.lang.String[]) = (r6v1 java.lang.String[]), (r6v1 java.lang.String[]), (r6v18 java.lang.String[]) binds: [B:36:0x00a5, B:38:0x00af, B:40:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r8v16 java.lang.annotation.Annotation[][]) = 
      (r8v1 java.lang.annotation.Annotation[][])
      (r8v1 java.lang.annotation.Annotation[][])
      (r8v18 java.lang.annotation.Annotation[][])
     binds: [B:36:0x00a5, B:38:0x00af, B:40:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r20v2 java.lang.reflect.Constructor<?>[]) = 
      (r20v0 java.lang.reflect.Constructor<?>[])
      (r20v7 java.lang.reflect.Constructor<?>[])
      (r20v7 java.lang.reflect.Constructor<?>[])
     binds: [B:36:0x00a5, B:38:0x00af, B:40:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x0167  */
    public static List<FieldInfo> computeGetters(Class<?> cls, JSONType jSONType, Map<String, String> map, Map<String, Field> map2, boolean z, PropertyNamingStrategy propertyNamingStrategy) {
        Method[] methodArr;
        int i;
        int i2;
        int i3;
        int iOrdinal;
        int iM4802of;
        int iM4801of;
        String str;
        int i4;
        String strSubstring;
        Field fieldFromCache;
        JSONField jSONField;
        String str2;
        JSONField jSONField2;
        int i5;
        Field fieldFromCache2;
        String strTranslate;
        Method method;
        JSONField jSONField3;
        JSONField jSONField4;
        String strName;
        char cCharAt;
        int i6;
        Field fieldFromCache3;
        Constructor koltinConstructor;
        Map<String, String> map3 = map;
        PropertyNamingStrategy propertyNamingStrategy2 = propertyNamingStrategy;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zIsKotlin = isKotlin(cls);
        Method[] methods = cls.getMethods();
        int length = methods.length;
        Constructor<?>[] constructorArr = null;
        String[] koltinConstructorParameters = null;
        short[] sArr = null;
        Annotation[][] parameterAnnotations = null;
        int i7 = 0;
        while (i7 < length) {
            Method method2 = methods[i7];
            String name = method2.getName();
            if (Modifier.isStatic(method2.getModifiers()) || method2.getReturnType().equals(Void.TYPE) || method2.getParameterTypes().length != 0 || method2.getReturnType() == ClassLoader.class || ((name.equals("getMetaClass") && method2.getReturnType().getName().equals("groovy.lang.MetaClass")) || ((name.equals("getSuppressed") && method2.getDeclaringClass() == Throwable.class) || (zIsKotlin && isKotlinIgnore(cls, name))))) {
                methodArr = methods;
                i = length;
                i2 = i7;
            } else {
                Boolean bool = Boolean.FALSE;
                JSONField superMethodAnnotation = (JSONField) getAnnotation(method2, JSONField.class);
                if (superMethodAnnotation == null) {
                    superMethodAnnotation = getSuperMethodAnnotation(cls, method2);
                }
                Method[] methodArr2 = methods;
                Constructor<?>[] declaredConstructors = constructorArr;
                if (superMethodAnnotation == null && zIsKotlin) {
                    if (declaredConstructors == null && (koltinConstructor = getKoltinConstructor((declaredConstructors = cls.getDeclaredConstructors()))) != null) {
                        parameterAnnotations = getParameterAnnotations(koltinConstructor);
                        koltinConstructorParameters = getKoltinConstructorParameters(cls);
                        if (koltinConstructorParameters != null) {
                            String[] strArr = new String[koltinConstructorParameters.length];
                            System.arraycopy(koltinConstructorParameters, 0, strArr, 0, koltinConstructorParameters.length);
                            Arrays.sort(strArr);
                            short[] sArr2 = new short[koltinConstructorParameters.length];
                            for (short s = 0; s < koltinConstructorParameters.length; s = (short) (s + 1)) {
                                sArr2[Arrays.binarySearch(strArr, koltinConstructorParameters[s])] = s;
                            }
                            koltinConstructorParameters = strArr;
                            sArr = sArr2;
                        }
                    }
                    Constructor<?>[] constructorArr2 = declaredConstructors;
                    if (koltinConstructorParameters == null || sArr == null || !name.startsWith("get")) {
                        i3 = i7;
                    } else {
                        String strDecapitalize = decapitalize(name.substring(3));
                        int iBinarySearch = Arrays.binarySearch(koltinConstructorParameters, strDecapitalize);
                        i3 = i7;
                        if (iBinarySearch >= 0) {
                            i6 = iBinarySearch;
                            break;
                        }
                        i6 = 0;
                        while (true) {
                            if (i6 >= koltinConstructorParameters.length) {
                                i6 = iBinarySearch;
                                break;
                            }
                            if (strDecapitalize.equalsIgnoreCase(koltinConstructorParameters[i6])) {
                                break;
                            }
                            i6++;
                        }
                        if (i6 >= 0) {
                            Annotation[] annotationArr = parameterAnnotations[sArr[i6]];
                            if (annotationArr != null) {
                                int length2 = annotationArr.length;
                                int i8 = 0;
                                while (i8 < length2) {
                                    int i9 = i8;
                                    Annotation annotation = annotationArr[i9];
                                    int i10 = length2;
                                    if (annotation instanceof JSONField) {
                                        superMethodAnnotation = (JSONField) annotation;
                                        break;
                                    }
                                    i8 = i9 + 1;
                                    length2 = i10;
                                }
                            }
                            if (superMethodAnnotation == null && (fieldFromCache3 = ParserConfig.getFieldFromCache(strDecapitalize, map2)) != null) {
                                superMethodAnnotation = (JSONField) getAnnotation(fieldFromCache3, JSONField.class);
                            }
                        }
                    }
                    declaredConstructors = constructorArr2;
                } else {
                    length = length;
                    bool = bool;
                    i3 = i7;
                }
                short[] sArr3 = sArr;
                Annotation[][] annotationArr2 = parameterAnnotations;
                Method method3 = method2;
                JSONField jSONField5 = superMethodAnnotation;
                String[] strArr2 = koltinConstructorParameters;
                String strLabel = null;
                if (jSONField5 != null) {
                    if (jSONField5.serialize()) {
                        iOrdinal = jSONField5.ordinal();
                        iM4802of = SerializerFeature.m4802of(jSONField5.serialzeFeatures());
                        iM4801of = Feature.m4801of(jSONField5.parseFeatures());
                        if (jSONField5.name().length() != 0) {
                            String strName2 = jSONField5.name();
                            if (map3 == null || (strName2 = map3.get(strName2)) != null) {
                                String str3 = strName2;
                                i2 = i3;
                                i = length;
                                methodArr = methodArr2;
                                linkedHashMap.put(str3, new FieldInfo(str3, method3, null, cls, null, iOrdinal, iM4802of, iM4801of, jSONField5, null, null));
                            } else {
                                i2 = i3;
                                i = length;
                                methodArr = methodArr2;
                            }
                        } else {
                            i2 = i3;
                            i = length;
                            methodArr = methodArr2;
                            if (jSONField5.label().length() != 0) {
                                strLabel = jSONField5.label();
                            }
                        }
                    } else {
                        i2 = i3;
                        i = length;
                        methodArr = methodArr2;
                    }
                    koltinConstructorParameters = strArr2;
                    constructorArr = declaredConstructors;
                    sArr = sArr3;
                    parameterAnnotations = annotationArr2;
                } else {
                    i2 = i3;
                    i = length;
                    methodArr = methodArr2;
                    iOrdinal = 0;
                    iM4802of = 0;
                    iM4801of = 0;
                }
                if (name.startsWith("get")) {
                    if (name.length() >= 4 && !name.equals("getClass") && (!name.equals("getDeclaringClass") || !cls.isEnum())) {
                        char cCharAt2 = name.charAt(3);
                        if (Character.isUpperCase(cCharAt2)) {
                            i5 = 3;
                        } else if (cCharAt2 > 512) {
                            i5 = 3;
                        } else {
                            if (cCharAt2 == '_') {
                                strTranslate = name.substring(4);
                                fieldFromCache2 = map2.get(strTranslate);
                                if (fieldFromCache2 == null) {
                                    String strSubstring2 = name.substring(3);
                                    Field fieldFromCache4 = ParserConfig.getFieldFromCache(strSubstring2, map2);
                                    if (fieldFromCache4 != null) {
                                        strTranslate = strSubstring2;
                                    }
                                    fieldFromCache2 = fieldFromCache4;
                                }
                            } else {
                                if (cCharAt2 == 'f') {
                                    strTranslate = name.substring(3);
                                } else if (name.length() < 5 || !Character.isUpperCase(name.charAt(4))) {
                                    strTranslate = name.substring(3);
                                    fieldFromCache2 = ParserConfig.getFieldFromCache(strTranslate, map2);
                                    if (fieldFromCache2 != null) {
                                    }
                                } else {
                                    strTranslate = decapitalize(name.substring(3));
                                }
                                fieldFromCache2 = null;
                            }
                            if (!isJSONTypeIgnore(cls, strTranslate)) {
                                if (fieldFromCache2 == null) {
                                    fieldFromCache2 = ParserConfig.getFieldFromCache(strTranslate, map2);
                                }
                                if (fieldFromCache2 == null) {
                                    method = method3;
                                    if (strTranslate.length() <= 1 && (cCharAt = strTranslate.charAt(1)) >= 'A' && cCharAt <= 'Z') {
                                        fieldFromCache2 = ParserConfig.getFieldFromCache(decapitalize(name.substring(3)), map2);
                                    }
                                    if (fieldFromCache2 != null) {
                                        jSONField4 = (JSONField) getAnnotation(fieldFromCache2, JSONField.class);
                                        if (jSONField4 != null) {
                                            if (jSONField4.serialize()) {
                                                iOrdinal = jSONField4.ordinal();
                                                iM4802of = SerializerFeature.m4802of(jSONField4.serialzeFeatures());
                                                iM4801of = Feature.m4801of(jSONField4.parseFeatures());
                                                if (jSONField4.name().length() != 0) {
                                                    Boolean bool2 = Boolean.TRUE;
                                                    strName = jSONField4.name();
                                                    if (map3 != null || (strName = map3.get(strName)) != null) {
                                                        bool = bool2;
                                                        strTranslate = strName;
                                                    }
                                                }
                                                if (jSONField4.label().length() != 0) {
                                                    strLabel = jSONField4.label();
                                                }
                                            }
                                        }
                                        jSONField3 = jSONField4;
                                    } else {
                                        jSONField3 = null;
                                    }
                                    Boolean bool3 = bool;
                                    if (map3 != null || (strTranslate = map3.get(strTranslate)) != null) {
                                        if (propertyNamingStrategy2 != null && !bool3.booleanValue()) {
                                            strTranslate = propertyNamingStrategy2.translate(strTranslate);
                                        }
                                        str = name;
                                        i4 = 3;
                                        String str4 = strTranslate;
                                        method3 = method;
                                        linkedHashMap.put(str4, new FieldInfo(str4, method3, fieldFromCache2, cls, null, iOrdinal, iM4802of, iM4801of, jSONField5, jSONField3, strLabel));
                                    }
                                } else {
                                    method = method3;
                                }
                                if (fieldFromCache2 != null) {
                                    jSONField4 = (JSONField) getAnnotation(fieldFromCache2, JSONField.class);
                                    if (jSONField4 != null) {
                                        if (jSONField4.serialize()) {
                                            iOrdinal = jSONField4.ordinal();
                                            iM4802of = SerializerFeature.m4802of(jSONField4.serialzeFeatures());
                                            iM4801of = Feature.m4801of(jSONField4.parseFeatures());
                                            if (jSONField4.name().length() != 0) {
                                                Boolean bool4 = Boolean.TRUE;
                                                strName = jSONField4.name();
                                                if (map3 != null) {
                                                }
                                                bool = bool4;
                                                strTranslate = strName;
                                            }
                                            if (jSONField4.label().length() != 0) {
                                                strLabel = jSONField4.label();
                                            }
                                        }
                                    }
                                    jSONField3 = jSONField4;
                                } else {
                                    jSONField3 = null;
                                }
                                Boolean bool5 = bool;
                                if (map3 != null) {
                                }
                                if (propertyNamingStrategy2 != null) {
                                    strTranslate = propertyNamingStrategy2.translate(strTranslate);
                                }
                                str = name;
                                i4 = 3;
                                String str5 = strTranslate;
                                method3 = method;
                                linkedHashMap.put(str5, new FieldInfo(str5, method3, fieldFromCache2, cls, null, iOrdinal, iM4802of, iM4801of, jSONField5, jSONField3, strLabel));
                            }
                        }
                        strTranslate = getPropertyNameByCompatibleFieldName(map2, name, compatibleWithJavaBean ? decapitalize(name.substring(i5)) : Character.toLowerCase(name.charAt(i5)) + name.substring(4), i5);
                        fieldFromCache2 = null;
                        if (!isJSONTypeIgnore(cls, strTranslate)) {
                            if (fieldFromCache2 == null) {
                                fieldFromCache2 = ParserConfig.getFieldFromCache(strTranslate, map2);
                            }
                            if (fieldFromCache2 == null) {
                                method = method3;
                                if (strTranslate.length() <= 1) {
                                }
                                if (fieldFromCache2 != null) {
                                    jSONField4 = (JSONField) getAnnotation(fieldFromCache2, JSONField.class);
                                    if (jSONField4 != null) {
                                        if (jSONField4.serialize()) {
                                            iOrdinal = jSONField4.ordinal();
                                            iM4802of = SerializerFeature.m4802of(jSONField4.serialzeFeatures());
                                            iM4801of = Feature.m4801of(jSONField4.parseFeatures());
                                            if (jSONField4.name().length() != 0) {
                                                Boolean bool6 = Boolean.TRUE;
                                                strName = jSONField4.name();
                                                if (map3 != null) {
                                                }
                                                bool = bool6;
                                                strTranslate = strName;
                                            }
                                            if (jSONField4.label().length() != 0) {
                                                strLabel = jSONField4.label();
                                            }
                                        }
                                    }
                                    jSONField3 = jSONField4;
                                } else {
                                    jSONField3 = null;
                                }
                                Boolean bool7 = bool;
                                if (map3 != null) {
                                }
                                if (propertyNamingStrategy2 != null) {
                                    strTranslate = propertyNamingStrategy2.translate(strTranslate);
                                }
                                str = name;
                                i4 = 3;
                                String str6 = strTranslate;
                                method3 = method;
                                linkedHashMap.put(str6, new FieldInfo(str6, method3, fieldFromCache2, cls, null, iOrdinal, iM4802of, iM4801of, jSONField5, jSONField3, strLabel));
                            } else {
                                method = method3;
                            }
                            if (fieldFromCache2 != null) {
                                jSONField4 = (JSONField) getAnnotation(fieldFromCache2, JSONField.class);
                                if (jSONField4 != null) {
                                    if (jSONField4.serialize()) {
                                        iOrdinal = jSONField4.ordinal();
                                        iM4802of = SerializerFeature.m4802of(jSONField4.serialzeFeatures());
                                        iM4801of = Feature.m4801of(jSONField4.parseFeatures());
                                        if (jSONField4.name().length() != 0) {
                                            Boolean bool8 = Boolean.TRUE;
                                            strName = jSONField4.name();
                                            if (map3 != null) {
                                            }
                                            bool = bool8;
                                            strTranslate = strName;
                                        }
                                        if (jSONField4.label().length() != 0) {
                                            strLabel = jSONField4.label();
                                        }
                                    }
                                }
                                jSONField3 = jSONField4;
                            } else {
                                jSONField3 = null;
                            }
                            Boolean bool9 = bool;
                            if (map3 != null) {
                            }
                            if (propertyNamingStrategy2 != null) {
                                strTranslate = propertyNamingStrategy2.translate(strTranslate);
                            }
                            str = name;
                            i4 = 3;
                            String str7 = strTranslate;
                            method3 = method;
                            linkedHashMap.put(str7, new FieldInfo(str7, method3, fieldFromCache2, cls, null, iOrdinal, iM4802of, iM4801of, jSONField5, jSONField3, strLabel));
                        }
                    }
                    koltinConstructorParameters = strArr2;
                    constructorArr = declaredConstructors;
                    sArr = sArr3;
                    parameterAnnotations = annotationArr2;
                } else {
                    str = name;
                    i4 = 3;
                }
                if (str.startsWith("is") && str.length() >= i4 && (method3.getReturnType() == Boolean.TYPE || method3.getReturnType() == Boolean.class)) {
                    char cCharAt3 = str.charAt(2);
                    if (Character.isUpperCase(cCharAt3)) {
                        strSubstring = getPropertyNameByCompatibleFieldName(map2, str, compatibleWithJavaBean ? decapitalize(str.substring(2)) : Character.toLowerCase(str.charAt(2)) + str.substring(i4), 2);
                    } else {
                        if (cCharAt3 == '_') {
                            String strSubstring3 = str.substring(i4);
                            fieldFromCache = map2.get(strSubstring3);
                            if (fieldFromCache != null || (fieldFromCache = ParserConfig.getFieldFromCache((strSubstring = str.substring(2)), map2)) == null) {
                                strSubstring = strSubstring3;
                            }
                        } else {
                            if (cCharAt3 == 'f') {
                                strSubstring = str.substring(2);
                            } else {
                                strSubstring = str.substring(2);
                                fieldFromCache = ParserConfig.getFieldFromCache(strSubstring, map2);
                                if (fieldFromCache == null) {
                                }
                            }
                            map3 = map;
                            propertyNamingStrategy2 = propertyNamingStrategy;
                        }
                        if (isJSONTypeIgnore(cls, strSubstring)) {
                            map3 = map;
                            propertyNamingStrategy2 = propertyNamingStrategy;
                        } else {
                            if (fieldFromCache == null) {
                                fieldFromCache = ParserConfig.getFieldFromCache(strSubstring, map2);
                            }
                            if (fieldFromCache == null) {
                                fieldFromCache = ParserConfig.getFieldFromCache(str, map2);
                            }
                            if (fieldFromCache != null) {
                                jSONField2 = (JSONField) getAnnotation(fieldFromCache, JSONField.class);
                                if (jSONField2 != null) {
                                    if (jSONField2.serialize()) {
                                        iOrdinal = jSONField2.ordinal();
                                        iM4802of = SerializerFeature.m4802of(jSONField2.serialzeFeatures());
                                        iM4801of = Feature.m4801of(jSONField2.parseFeatures());
                                        if (jSONField2.name().length() != 0) {
                                            strSubstring = jSONField2.name();
                                            if (map != null) {
                                                map3 = map;
                                                strSubstring = map3.get(strSubstring);
                                                if (strSubstring == null) {
                                                }
                                            } else {
                                                map3 = map;
                                            }
                                            if (jSONField2.label().length() != 0) {
                                                strLabel = jSONField2.label();
                                            }
                                        } else {
                                            map3 = map;
                                            if (jSONField2.label().length() != 0) {
                                                strLabel = jSONField2.label();
                                            }
                                        }
                                    } else {
                                        map3 = map;
                                    }
                                    propertyNamingStrategy2 = propertyNamingStrategy;
                                } else {
                                    map3 = map;
                                }
                                jSONField = jSONField2;
                            } else {
                                map3 = map;
                                jSONField = null;
                            }
                            if (map3 == null && (strSubstring = map3.get(strSubstring)) == null) {
                                propertyNamingStrategy2 = propertyNamingStrategy;
                            } else {
                                propertyNamingStrategy2 = propertyNamingStrategy;
                                if (propertyNamingStrategy != null) {
                                    strSubstring = propertyNamingStrategy2.translate(strSubstring);
                                }
                                str2 = strSubstring;
                                if (!linkedHashMap.containsKey(str2)) {
                                    linkedHashMap.put(str2, new FieldInfo(str2, method3, fieldFromCache, cls, null, iOrdinal, iM4802of, iM4801of, jSONField5, jSONField, strLabel));
                                }
                            }
                        }
                    }
                    fieldFromCache = null;
                    if (isJSONTypeIgnore(cls, strSubstring)) {
                        if (fieldFromCache == null) {
                            fieldFromCache = ParserConfig.getFieldFromCache(strSubstring, map2);
                        }
                        if (fieldFromCache == null) {
                            fieldFromCache = ParserConfig.getFieldFromCache(str, map2);
                        }
                        if (fieldFromCache != null) {
                            jSONField2 = (JSONField) getAnnotation(fieldFromCache, JSONField.class);
                            if (jSONField2 != null) {
                                if (jSONField2.serialize()) {
                                    map3 = map;
                                } else {
                                    iOrdinal = jSONField2.ordinal();
                                    iM4802of = SerializerFeature.m4802of(jSONField2.serialzeFeatures());
                                    iM4801of = Feature.m4801of(jSONField2.parseFeatures());
                                    if (jSONField2.name().length() != 0) {
                                        strSubstring = jSONField2.name();
                                        if (map != null) {
                                            map3 = map;
                                            strSubstring = map3.get(strSubstring);
                                            if (strSubstring == null) {
                                            }
                                        } else {
                                            map3 = map;
                                        }
                                        if (jSONField2.label().length() != 0) {
                                            strLabel = jSONField2.label();
                                        }
                                    } else {
                                        map3 = map;
                                        if (jSONField2.label().length() != 0) {
                                            strLabel = jSONField2.label();
                                        }
                                    }
                                }
                                propertyNamingStrategy2 = propertyNamingStrategy;
                            } else {
                                map3 = map;
                            }
                            jSONField = jSONField2;
                        } else {
                            map3 = map;
                            jSONField = null;
                        }
                        if (map3 == null) {
                        }
                        propertyNamingStrategy2 = propertyNamingStrategy;
                        if (propertyNamingStrategy != null) {
                            strSubstring = propertyNamingStrategy2.translate(strSubstring);
                        }
                        str2 = strSubstring;
                        if (!linkedHashMap.containsKey(str2)) {
                            linkedHashMap.put(str2, new FieldInfo(str2, method3, fieldFromCache, cls, null, iOrdinal, iM4802of, iM4801of, jSONField5, jSONField, strLabel));
                        }
                    } else {
                        map3 = map;
                        propertyNamingStrategy2 = propertyNamingStrategy;
                    }
                } else {
                    map3 = map;
                    propertyNamingStrategy2 = propertyNamingStrategy;
                }
                koltinConstructorParameters = strArr2;
                constructorArr = declaredConstructors;
                sArr = sArr3;
                parameterAnnotations = annotationArr2;
            }
            i7 = i2 + 1;
            methods = methodArr;
            length = i;
        }
        computeFields(cls, map3, propertyNamingStrategy2, linkedHashMap, cls.getFields());
        return getFieldInfos(cls, z, linkedHashMap);
    }

    public static List<FieldInfo> computeGettersWithFieldBase(Class<?> cls, Map<String, String> map, boolean z, PropertyNamingStrategy propertyNamingStrategy) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            computeFields(superclass, map, propertyNamingStrategy, linkedHashMap, superclass.getDeclaredFields());
        }
        return getFieldInfos(cls, z, linkedHashMap);
    }

    private static Map<TypeVariable, Type> createActualTypeMap(TypeVariable[] typeVariableArr, Type[] typeArr) {
        int length = typeVariableArr.length;
        HashMap map = new HashMap(length);
        for (int i = 0; i < length; i++) {
            map.put(typeVariableArr[i], typeArr[i]);
        }
        return map;
    }

    public static Collection createCollection(Type type) {
        Class<?> rawClass = getRawClass(type);
        if (rawClass == AbstractCollection.class || rawClass == Collection.class) {
            return new ArrayList();
        }
        if (rawClass.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        }
        if (rawClass.isAssignableFrom(LinkedHashSet.class)) {
            return new LinkedHashSet();
        }
        if (rawClass.isAssignableFrom(TreeSet.class)) {
            return new TreeSet();
        }
        if (rawClass.isAssignableFrom(ArrayList.class)) {
            return new ArrayList();
        }
        if (rawClass.isAssignableFrom(EnumSet.class)) {
            return EnumSet.noneOf((Class) (type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class));
        }
        if (rawClass.isAssignableFrom(Queue.class)) {
            return new LinkedList();
        }
        try {
            return (Collection) rawClass.newInstance();
        } catch (Exception unused) {
            riq.m179531a("create instance error, class ".concat(rawClass.getName()));
            return null;
        }
    }

    public static String decapitalize(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        if (str.length() > 1 && Character.isUpperCase(str.charAt(1)) && Character.isUpperCase(str.charAt(0))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return new String(charArray);
    }

    public static long fnv1a_64(String str) {
        long jCharAt = -3750763034362895579L;
        for (int i = 0; i < str.length(); i++) {
            jCharAt = (jCharAt ^ ((long) str.charAt(i))) * 1099511628211L;
        }
        return jCharAt;
    }

    public static long fnv1a_64_lower(String str) {
        long j = -3750763034362895579L;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '_' && cCharAt != '-') {
                if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    cCharAt = (char) (cCharAt + ' ');
                }
                j = (j ^ ((long) cCharAt)) * 1099511628211L;
            }
        }
        return j;
    }

    private static Type getActualType(Type type, Map<TypeVariable, Type> map) {
        if (type instanceof TypeVariable) {
            return map.get(type);
        }
        if (type instanceof ParameterizedType) {
            return makeParameterizedType(getRawClass(type), ((ParameterizedType) type).getActualTypeArguments(), map);
        }
        return type instanceof GenericArrayType ? new GenericArrayTypeImpl(getActualType(((GenericArrayType) type).getGenericComponentType(), map)) : type;
    }

    public static <A extends Annotation> A getAnnotation(Class<?> cls, Class<A> cls2) {
        A a = (A) cls.getAnnotation(cls2);
        Type mixInAnnotations = JSON.getMixInAnnotations(cls);
        Class cls3 = mixInAnnotations instanceof Class ? (Class) mixInAnnotations : null;
        if (cls3 != null) {
            A a2 = (A) cls3.getAnnotation(cls2);
            if (a2 == null && cls3.getAnnotations().length > 0) {
                for (Annotation annotation : cls3.getAnnotations()) {
                    a2 = (A) annotation.annotationType().getAnnotation(cls2);
                    if (a2 != null) {
                        break;
                    }
                }
            }
            if (a2 != null) {
                return a2;
            }
        }
        if (a == null && cls.getAnnotations().length > 0) {
            for (Annotation annotation2 : cls.getAnnotations()) {
                a = (A) annotation2.annotationType().getAnnotation(cls2);
                if (a != null) {
                    return a;
                }
            }
        }
        return a;
    }

    public static Class<?> getClass(Type type) {
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return getClass(((ParameterizedType) type).getRawType());
        }
        if (type instanceof TypeVariable) {
            Type type2 = ((TypeVariable) type).getBounds()[0];
            return type2 instanceof Class ? (Class) type2 : getClass(type2);
        }
        if (!(type instanceof WildcardType)) {
            return Object.class;
        }
        Type[] upperBounds = ((WildcardType) type).getUpperBounds();
        return upperBounds.length == 1 ? getClass(upperBounds[0]) : Object.class;
    }

    public static Class<?> getClassFromMapping(String str) {
        return mappings.get(str);
    }

    public static Class<?> getCollectionItemClass(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return Object.class;
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
            if (upperBounds.length == 1) {
                type2 = upperBounds[0];
            }
        }
        if (!(type2 instanceof Class)) {
            riq.m179531a("can not create ASMParser");
            return null;
        }
        Class<?> cls = (Class) type2;
        if (Modifier.isPublic(cls.getModifiers())) {
            return cls;
        }
        riq.m179531a("can not create ASMParser");
        return null;
    }

    private static Type getCollectionItemType(ParameterizedType parameterizedType) {
        Type rawType = parameterizedType.getRawType();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (rawType == Collection.class) {
            return getWildcardTypeUpperBounds(actualTypeArguments[0]);
        }
        Class cls = (Class) rawType;
        Map<TypeVariable, Type> mapCreateActualTypeMap = createActualTypeMap(cls.getTypeParameters(), actualTypeArguments);
        Type collectionSuperType = getCollectionSuperType(cls);
        if (!(collectionSuperType instanceof ParameterizedType)) {
            return getCollectionItemType((Class<?>) collectionSuperType);
        }
        Class<?> rawClass = getRawClass(collectionSuperType);
        Type[] actualTypeArguments2 = ((ParameterizedType) collectionSuperType).getActualTypeArguments();
        return actualTypeArguments2.length > 0 ? getCollectionItemType(makeParameterizedType(rawClass, actualTypeArguments2, mapCreateActualTypeMap)) : getCollectionItemType(rawClass);
    }

    private static Type getCollectionSuperType(Class<?> cls) {
        Type type = null;
        for (Type type2 : cls.getGenericInterfaces()) {
            Class<?> rawClass = getRawClass(type2);
            if (rawClass == Collection.class) {
                return type2;
            }
            if (Collection.class.isAssignableFrom(rawClass)) {
                type = type2;
            }
        }
        return type == null ? cls.getGenericSuperclass() : type;
    }

    public static Field getField(Class<?> cls, String str, Field[] fieldArr) {
        char cCharAt;
        char cCharAt2;
        for (Field field : fieldArr) {
            String name = field.getName();
            if (str.equals(name) || (str.length() > 2 && (cCharAt = str.charAt(0)) >= 'a' && cCharAt <= 'z' && (cCharAt2 = str.charAt(1)) >= 'A' && cCharAt2 <= 'Z' && str.equalsIgnoreCase(name))) {
                return field;
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null || superclass == Object.class) {
            return null;
        }
        return getField(superclass, str, superclass.getDeclaredFields());
    }

    private static List<FieldInfo> getFieldInfos(Class<?> cls, boolean z, Map<String, FieldInfo> map) {
        ArrayList arrayList = new ArrayList();
        JSONType jSONType = (JSONType) getAnnotation(cls, JSONType.class);
        String[] strArrOrders = jSONType != null ? jSONType.orders() : null;
        if (strArrOrders == null || strArrOrders.length <= 0) {
            Iterator<FieldInfo> it = map.values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            if (z) {
                Collections.sort(arrayList);
            }
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList.size());
            for (FieldInfo fieldInfo : map.values()) {
                linkedHashMap.put(fieldInfo.name, fieldInfo);
            }
            for (String str : strArrOrders) {
                FieldInfo fieldInfo2 = (FieldInfo) linkedHashMap.get(str);
                if (fieldInfo2 != null) {
                    arrayList.add(fieldInfo2);
                    linkedHashMap.remove(str);
                }
            }
            Iterator it2 = linkedHashMap.values().iterator();
            while (it2.hasNext()) {
                arrayList.add((FieldInfo) it2.next());
            }
        }
        return arrayList;
    }

    public static Type getGenericParamType(Type type) {
        return (!(type instanceof ParameterizedType) && (type instanceof Class)) ? getGenericParamType(((Class) type).getGenericSuperclass()) : type;
    }

    public static Constructor getKoltinConstructor(Constructor[] constructorArr, String[] strArr) {
        Constructor constructor = null;
        for (Constructor constructor2 : constructorArr) {
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            if ((strArr == null || parameterTypes.length == strArr.length) && ((parameterTypes.length <= 0 || !parameterTypes[parameterTypes.length - 1].getName().equals("kotlin.jvm.internal.DefaultConstructorMarker")) && (constructor == null || constructor.getParameterTypes().length < parameterTypes.length))) {
                constructor = constructor2;
            }
        }
        return constructor;
    }

    public static String[] getKoltinConstructorParameters(Class cls) {
        if (kotlin_kclass_constructor == null && !kotlin_class_klass_error) {
            try {
                KClassImpl.Companion companion = KClassImpl.INSTANCE;
                kotlin_kclass_constructor = KClassImpl.class.getConstructor(Class.class);
            } catch (Throwable unused) {
                kotlin_class_klass_error = true;
            }
        }
        if (kotlin_kclass_constructor == null) {
            return null;
        }
        if (kotlin_kclass_getConstructors == null && !kotlin_class_klass_error) {
            try {
                KClassImpl.Companion companion2 = KClassImpl.INSTANCE;
                kotlin_kclass_getConstructors = KClassImpl.class.getMethod("getConstructors", null);
            } catch (Throwable unused2) {
                kotlin_class_klass_error = true;
            }
        }
        if (kotlin_kfunction_getParameters == null && !kotlin_class_klass_error) {
            try {
                kotlin_kfunction_getParameters = KFunction.class.getMethod("getParameters", null);
            } catch (Throwable unused3) {
                kotlin_class_klass_error = true;
            }
        }
        if (kotlin_kparameter_getName == null && !kotlin_class_klass_error) {
            try {
                kotlin_kparameter_getName = KParameter.class.getMethod("getName", null);
            } catch (Throwable unused4) {
                kotlin_class_klass_error = true;
            }
        }
        if (kotlin_error) {
            return null;
        }
        try {
            Iterator it = ((Iterable) kotlin_kclass_getConstructors.invoke(kotlin_kclass_constructor.newInstance(cls), null)).iterator();
            Object obj = null;
            while (it.hasNext()) {
                Object next = it.next();
                List list = (List) kotlin_kfunction_getParameters.invoke(next, null);
                if (obj == null || list.size() != 0) {
                    obj = next;
                }
                it.hasNext();
            }
            List list2 = (List) kotlin_kfunction_getParameters.invoke(obj, null);
            String[] strArr = new String[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                strArr[i] = (String) kotlin_kparameter_getName.invoke(list2.get(i), null);
            }
            return strArr;
        } catch (Throwable th) {
            th.printStackTrace();
            kotlin_error = true;
            return null;
        }
    }

    public static Annotation[][] getParameterAnnotations(Constructor constructor) {
        Annotation[][] parameterAnnotations;
        Constructor declaredConstructor;
        Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
        Type mixInAnnotations = JSON.getMixInAnnotations(constructor.getDeclaringClass());
        Constructor constructor2 = null;
        Class cls = mixInAnnotations instanceof Class ? (Class) mixInAnnotations : null;
        if (cls != null) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            ArrayList arrayList = new ArrayList(2);
            for (Class<?> enclosingClass = cls.getEnclosingClass(); enclosingClass != null; enclosingClass = enclosingClass.getEnclosingClass()) {
                arrayList.add(enclosingClass);
            }
            int size = arrayList.size();
            for (Class superclass = cls; superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                try {
                    if (size != 0) {
                        Class<?>[] clsArr = new Class[parameterTypes.length + size];
                        System.arraycopy(parameterTypes, 0, clsArr, size, parameterTypes.length);
                        for (int i = size; i > 0; i--) {
                            int i2 = i - 1;
                            clsArr[i2] = (Class) arrayList.get(i2);
                        }
                        declaredConstructor = cls.getDeclaredConstructor(clsArr);
                    } else {
                        declaredConstructor = cls.getDeclaredConstructor(parameterTypes);
                    }
                    constructor2 = declaredConstructor;
                    break;
                } catch (NoSuchMethodException unused) {
                    size--;
                }
            }
            if (constructor2 != null && (parameterAnnotations = constructor2.getParameterAnnotations()) != null) {
                return parameterAnnotations;
            }
        }
        return parameterAnnotations2;
    }

    public static int getParserFeatures(Class<?> cls) {
        JSONType jSONType = (JSONType) getAnnotation(cls, JSONType.class);
        if (jSONType == null) {
            return 0;
        }
        return Feature.m4801of(jSONType.parseFeatures());
    }

    private static String getPropertyNameByCompatibleFieldName(Map<String, Field> map, String str, String str2, int i) {
        if (compatibleWithFieldName && !map.containsKey(str2)) {
            String strSubstring = str.substring(i);
            if (map.containsKey(strSubstring)) {
                return strSubstring;
            }
        }
        return str2;
    }

    public static Class<?> getRawClass(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return getRawClass(((ParameterizedType) type).getRawType());
        }
        riq.m179531a("TODO");
        return null;
    }

    public static int getSerializeFeatures(Class<?> cls) {
        JSONType jSONType = (JSONType) getAnnotation(cls, JSONType.class);
        if (jSONType == null) {
            return 0;
        }
        return SerializerFeature.m4802of(jSONType.serialzeFeatures());
    }

    public static JSONField getSuperMethodAnnotation(Class<?> cls, Method method) {
        Class<?>[] interfaces = cls.getInterfaces();
        if (interfaces.length > 0) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> cls2 : interfaces) {
                for (Method method2 : cls2.getMethods()) {
                    Class<?>[] parameterTypes2 = method2.getParameterTypes();
                    if (parameterTypes2.length == parameterTypes.length && method2.getName().equals(method.getName())) {
                        int i = 0;
                        while (true) {
                            if (i >= parameterTypes.length) {
                                JSONField jSONField = (JSONField) getAnnotation(method2, JSONField.class);
                                if (jSONField == null) {
                                    break;
                                }
                                return jSONField;
                            }
                            if (!parameterTypes2[i].equals(parameterTypes[i])) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && Modifier.isAbstract(superclass.getModifiers())) {
            Class<?>[] parameterTypes3 = method.getParameterTypes();
            for (Method method3 : superclass.getMethods()) {
                Class<?>[] parameterTypes4 = method3.getParameterTypes();
                if (parameterTypes4.length == parameterTypes3.length && method3.getName().equals(method.getName())) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= parameterTypes3.length) {
                            JSONField jSONField2 = (JSONField) getAnnotation(method3, JSONField.class);
                            if (jSONField2 == null) {
                                break;
                            }
                            return jSONField2;
                        }
                        if (!parameterTypes4[i2].equals(parameterTypes3[i2])) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return null;
    }

    private static Type getWildcardTypeUpperBounds(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        Type[] upperBounds = ((WildcardType) type).getUpperBounds();
        return upperBounds.length > 0 ? upperBounds[0] : Object.class;
    }

    public static Annotation getXmlAccessorType(Class cls) {
        if (class_XmlAccessorType == null && !classXmlAccessorType_error) {
            try {
                class_XmlAccessorType = Class.forName("javax.xml.bind.annotation.XmlAccessorType");
            } catch (Throwable unused) {
                classXmlAccessorType_error = true;
            }
        }
        if (class_XmlAccessorType == null) {
            return null;
        }
        return getAnnotation((Class<?>) cls, class_XmlAccessorType);
    }

    public static int intValue(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return 0;
        }
        int iScale = bigDecimal.scale();
        return (iScale < -100 || iScale > 100) ? bigDecimal.intValueExact() : bigDecimal.intValue();
    }

    public static boolean isAnnotationPresentManyToMany(Method method) {
        if (method == null) {
            return false;
        }
        if (class_ManyToMany == null && !class_ManyToMany_error) {
            try {
                class_ManyToMany = Class.forName("javax.persistence.ManyToMany");
            } catch (Throwable unused) {
                class_ManyToMany_error = true;
            }
        }
        if (class_ManyToMany != null) {
            return method.isAnnotationPresent(class_OneToMany) || method.isAnnotationPresent(class_ManyToMany);
        }
        return false;
    }

    public static boolean isAnnotationPresentOneToMany(Method method) {
        if (method == null) {
            return false;
        }
        if (class_OneToMany == null && !class_OneToMany_error) {
            try {
                class_OneToMany = Class.forName("javax.persistence.OneToMany");
            } catch (Throwable unused) {
                class_OneToMany_error = true;
            }
        }
        Class<? extends Annotation> cls = class_OneToMany;
        return cls != null && method.isAnnotationPresent(cls);
    }

    public static boolean isClob(Class cls) {
        if (class_Clob == null && !class_Clob_error) {
            try {
                class_Clob = Clob.class;
            } catch (Throwable unused) {
                class_Clob_error = true;
            }
        }
        if (class_Clob == null) {
            return false;
        }
        return class_Clob.isAssignableFrom(cls);
    }

    public static boolean isGenericParamType(Type type) {
        Type genericSuperclass;
        if (type instanceof ParameterizedType) {
            return true;
        }
        return (type instanceof Class) && (genericSuperclass = ((Class) type).getGenericSuperclass()) != Object.class && isGenericParamType(genericSuperclass);
    }

    public static boolean isHibernateInitialized(Object obj) {
        if (obj == null) {
            return false;
        }
        if (method_HibernateIsInitialized == null && !method_HibernateIsInitialized_error) {
            try {
                method_HibernateIsInitialized = Class.forName("org.hibernate.Hibernate").getMethod("isInitialized", Object.class);
            } catch (Throwable unused) {
                method_HibernateIsInitialized_error = true;
            }
        }
        Method method = method_HibernateIsInitialized;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(null, obj)).booleanValue();
            } catch (Throwable unused2) {
            }
        }
        return true;
    }

    private static boolean isJSONTypeIgnore(Class<?> cls, String str) {
        JSONType jSONType = (JSONType) getAnnotation(cls, JSONType.class);
        if (jSONType != null) {
            String[] strArrIncludes = jSONType.includes();
            if (strArrIncludes.length > 0) {
                for (String str2 : strArrIncludes) {
                    if (str.equals(str2)) {
                        return false;
                    }
                }
                return true;
            }
            for (String str3 : jSONType.ignores()) {
                if (str.equals(str3)) {
                    return true;
                }
            }
        }
        if (cls.getSuperclass() == Object.class || cls.getSuperclass() == null) {
            return false;
        }
        return isJSONTypeIgnore(cls.getSuperclass(), str);
    }

    public static boolean isJacksonCreator(Method method) {
        if (method == null) {
            return false;
        }
        if (class_JacksonCreator == null && !class_JacksonCreator_error) {
            try {
                class_JacksonCreator = Class.forName("com.fasterxml.jackson.annotation.JsonCreator");
            } catch (Throwable unused) {
                class_JacksonCreator_error = true;
            }
        }
        Class<? extends Annotation> cls = class_JacksonCreator;
        return cls != null && method.isAnnotationPresent(cls);
    }

    public static boolean isKotlin(Class cls) {
        if (kotlin_metadata == null && !kotlin_metadata_error) {
            try {
                kotlin_metadata = Metadata.class;
            } catch (Throwable unused) {
                kotlin_metadata_error = true;
            }
        }
        return kotlin_metadata != null && cls.isAnnotationPresent(kotlin_metadata);
    }

    private static boolean isKotlinIgnore(Class cls, String str) {
        if (kotlinIgnores == null && !kotlinIgnores_error) {
            try {
                HashMap map = new HashMap();
                CharRange.Companion companion = CharRange.INSTANCE;
                map.put(CharRange.class, new String[]{"getEndInclusive", "isEmpty"});
                IntRange.Companion companion2 = IntRange.INSTANCE;
                map.put(IntRange.class, new String[]{"getEndInclusive", "isEmpty"});
                LongRange.Companion companion3 = LongRange.INSTANCE;
                map.put(LongRange.class, new String[]{"getEndInclusive", "isEmpty"});
                map.put(na5.class, new String[]{"getEndInclusive", "isEmpty"});
                map.put(ma5.class, new String[]{"getEndInclusive", "isEmpty"});
                kotlinIgnores = map;
            } catch (Throwable unused) {
                kotlinIgnores_error = true;
            }
        }
        if (kotlinIgnores == null) {
            return false;
        }
        String[] strArr = kotlinIgnores.get(cls);
        return strArr != null && Arrays.binarySearch(strArr, str) >= 0;
    }

    public static boolean isNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '+' || cCharAt == '-') {
                if (i != 0) {
                    return false;
                }
            } else if (cCharAt < '0' || cCharAt > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean isPath(Class<?> cls) {
        if (pathClass == null && !pathClass_error) {
            try {
                pathClass = Class.forName("java.nio.file.Path");
            } catch (Throwable unused) {
                pathClass_error = true;
            }
        }
        Class<?> cls2 = pathClass;
        if (cls2 != null) {
            return cls2.isAssignableFrom(cls);
        }
        return false;
    }

    public static boolean isProxy(Class<?> cls) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            String name = cls2.getName();
            if (name.equals("net.sf.cglib.proxy.Factory") || name.equals("org.springframework.cglib.proxy.Factory") || name.equals("javassist.util.proxy.ProxyObject") || name.equals("org.apache.ibatis.javassist.util.proxy.ProxyObject") || name.equals("org.hibernate.proxy.HibernateProxy")) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTransient(Method method) {
        if (method == null) {
            return false;
        }
        if (!transientClassInited) {
            try {
                transientClass = Class.forName("java.beans.Transient");
            } catch (Exception unused) {
            } finally {
                transientClassInited = true;
            }
        }
        Class<? extends Annotation> cls = transientClass;
        return (cls == null || getAnnotation(method, cls) == null) ? false : true;
    }

    public static boolean isXmlField(Class cls) {
        Annotation annotation;
        Object objInvoke;
        if (class_XmlAccessorType == null && !classXmlAccessorType_error) {
            try {
                class_XmlAccessorType = Class.forName("javax.xml.bind.annotation.XmlAccessorType");
            } catch (Throwable unused) {
                classXmlAccessorType_error = true;
            }
        }
        if (class_XmlAccessorType == null || (annotation = getAnnotation((Class<?>) cls, (Class<Annotation>) class_XmlAccessorType)) == null) {
            return false;
        }
        if (method_XmlAccessorType_value == null && !classXmlAccessorType_error) {
            try {
                method_XmlAccessorType_value = class_XmlAccessorType.getMethod("value", null);
            } catch (Throwable unused2) {
                classXmlAccessorType_error = true;
            }
        }
        if (method_XmlAccessorType_value == null) {
            return false;
        }
        if (classXmlAccessorType_error) {
            objInvoke = null;
        } else {
            try {
                objInvoke = method_XmlAccessorType_value.invoke(annotation, null);
            } catch (Throwable unused3) {
                classXmlAccessorType_error = true;
                objInvoke = null;
            }
        }
        if (objInvoke == null) {
            return false;
        }
        if (class_XmlAccessType == null && !classXmlAccessorType_error) {
            try {
                class_XmlAccessType = Class.forName("javax.xml.bind.annotation.XmlAccessType");
                field_XmlAccessType_FIELD = class_XmlAccessType.getField("FIELD");
                field_XmlAccessType_FIELD_VALUE = field_XmlAccessType_FIELD.get(null);
            } catch (Throwable unused4) {
                classXmlAccessorType_error = true;
            }
        }
        return objInvoke == field_XmlAccessType_FIELD_VALUE;
    }

    public static Class<?> loadClass(String str, ClassLoader classLoader, boolean z) {
        if (str == null || str.length() == 0 || str.length() > 128) {
            return null;
        }
        Class<?> clsLoadClass = mappings.get(str);
        if (clsLoadClass != null) {
            return clsLoadClass;
        }
        if (str.charAt(0) == '[') {
            return Array.newInstance(loadClass(str.substring(1), classLoader), 0).getClass();
        }
        if (str.startsWith("L") && str.endsWith(Constants.PACKNAME_END)) {
            return loadClass(str.substring(1, str.length() - 1), classLoader);
        }
        if (classLoader != null) {
            try {
                clsLoadClass = classLoader.loadClass(str);
                if (!z) {
                    return clsLoadClass;
                }
                mappings.put(str, clsLoadClass);
                return clsLoadClass;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null && contextClassLoader != classLoader) {
            clsLoadClass = contextClassLoader.loadClass(str);
            if (z) {
                mappings.put(str, clsLoadClass);
            }
            return clsLoadClass;
        }
        try {
            clsLoadClass = Class.forName(str);
            if (z) {
                mappings.put(str, clsLoadClass);
            }
        } catch (Throwable unused) {
        }
        return clsLoadClass;
    }

    public static long longExtractValue(Number number) {
        return number instanceof BigDecimal ? ((BigDecimal) number).longValueExact() : number.longValue();
    }

    public static long longValue(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return 0L;
        }
        int iScale = bigDecimal.scale();
        return (iScale < -100 || iScale > 100) ? bigDecimal.longValueExact() : bigDecimal.longValue();
    }

    private static ParameterizedType makeParameterizedType(Class<?> cls, Type[] typeArr, Map<TypeVariable, Type> map) {
        int length = typeArr.length;
        Type[] typeArr2 = new Type[length];
        for (int i = 0; i < length; i++) {
            typeArr2[i] = getActualType(typeArr[i], map);
        }
        return new ParameterizedTypeImpl(typeArr2, null, cls);
    }

    public static double parseDouble(String str) {
        double d;
        double d2;
        int length = str.length();
        if (length > 10) {
            return Double.parseDouble(str);
        }
        long j = 0;
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '-' && i2 == 0) {
                z = true;
            } else if (cCharAt == '.') {
                if (i != 0) {
                    return Double.parseDouble(str);
                }
                i = (length - i2) - 1;
            } else {
                if (cCharAt < '0' || cCharAt > '9') {
                    return Double.parseDouble(str);
                }
                j = (j * 10) + ((long) (cCharAt - '0'));
            }
        }
        if (z) {
            j = -j;
        }
        switch (i) {
            case 0:
                return j;
            case 1:
                d = j;
                d2 = 10.0d;
                break;
            case 2:
                d = j;
                d2 = 100.0d;
                break;
            case 3:
                d = j;
                d2 = 1000.0d;
                break;
            case 4:
                d = j;
                d2 = 10000.0d;
                break;
            case 5:
                d = j;
                d2 = 100000.0d;
                break;
            case 6:
                d = j;
                d2 = 1000000.0d;
                break;
            case 7:
                d = j;
                d2 = 1.0E7d;
                break;
            case 8:
                d = j;
                d2 = 1.0E8d;
                break;
            case 9:
                d = j;
                d2 = 1.0E9d;
                break;
            default:
                return Double.parseDouble(str);
        }
        return d / d2;
    }

    public static float parseFloat(String str) {
        float f;
        float f2;
        int length = str.length();
        if (length >= 10) {
            return Float.parseFloat(str);
        }
        long j = 0;
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '-' && i2 == 0) {
                z = true;
            } else if (cCharAt == '.') {
                if (i != 0) {
                    return Float.parseFloat(str);
                }
                i = (length - i2) - 1;
            } else {
                if (cCharAt < '0' || cCharAt > '9') {
                    return Float.parseFloat(str);
                }
                j = (j * 10) + ((long) (cCharAt - '0'));
            }
        }
        if (z) {
            j = -j;
        }
        switch (i) {
            case 0:
                return j;
            case 1:
                f = j;
                f2 = 10.0f;
                break;
            case 2:
                f = j;
                f2 = 100.0f;
                break;
            case 3:
                f = j;
                f2 = 1000.0f;
                break;
            case 4:
                f = j;
                f2 = 10000.0f;
                break;
            case 5:
                f = j;
                f2 = 100000.0f;
                break;
            case 6:
                f = j;
                f2 = 1000000.0f;
                break;
            case 7:
                f = j;
                f2 = 1.0E7f;
                break;
            case 8:
                f = j;
                f2 = 1.0E8f;
                break;
            case 9:
                f = j;
                f2 = 1.0E9f;
                break;
            default:
                return Float.parseFloat(str);
        }
        return f / f2;
    }

    public static void setAccessible(AccessibleObject accessibleObject) {
        if (setAccessibleEnable && !accessibleObject.isAccessible()) {
            try {
                accessibleObject.setAccessible(true);
            } catch (AccessControlException unused) {
                setAccessibleEnable = false;
            }
        }
    }

    public static short shortValue(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return (short) 0;
        }
        int iScale = bigDecimal.scale();
        return (iScale < -100 || iScale > 100) ? bigDecimal.shortValueExact() : bigDecimal.shortValue();
    }

    public static Locale toLocale(String str) {
        String[] strArrSplit = str.split("_");
        if (strArrSplit.length == 1) {
            return new Locale(strArrSplit[0]);
        }
        return strArrSplit.length == 2 ? new Locale(strArrSplit[0], strArrSplit[1]) : new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
    }

    public static Type unwrapOptional(Type type) {
        if (!optionalClassInited) {
            try {
                optionalClass = Class.forName("java.util.Optional");
            } catch (Exception unused) {
            } finally {
                optionalClassInited = true;
            }
        }
        if (!(type instanceof ParameterizedType)) {
            return type;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        return parameterizedType.getRawType() == optionalClass ? parameterizedType.getActualTypeArguments()[0] : type;
    }

    public static Constructor getKoltinConstructor(Constructor[] constructorArr) {
        return getKoltinConstructor(constructorArr, null);
    }

    private static Type getCollectionItemType(Class<?> cls) {
        return cls.getName().startsWith("java.") ? Object.class : getCollectionItemType(getCollectionSuperType(cls));
    }

    public static Type getCollectionItemType(Type type) {
        if (type instanceof ParameterizedType) {
            return getCollectionItemType((ParameterizedType) type);
        }
        if (type instanceof Class) {
            return getCollectionItemType((Class<?>) type);
        }
        return Object.class;
    }

    public static <A extends Annotation> A getAnnotation(Field field, Class<A> cls) {
        A a;
        A a2 = (A) field.getAnnotation(cls);
        Type mixInAnnotations = JSON.getMixInAnnotations(field.getDeclaringClass());
        Field declaredField = null;
        Class superclass = mixInAnnotations instanceof Class ? (Class) mixInAnnotations : null;
        if (superclass != null) {
            String name = field.getName();
            while (superclass != null && superclass != Object.class) {
                try {
                    declaredField = superclass.getDeclaredField(name);
                    break;
                } catch (NoSuchFieldException unused) {
                    superclass = superclass.getSuperclass();
                }
            }
            if (declaredField != null && (a = (A) declaredField.getAnnotation(cls)) != null) {
                return a;
            }
        }
        return a2;
    }

    public static <A extends Annotation> A getAnnotation(Method method, Class<A> cls) {
        A a;
        A a2 = (A) method.getAnnotation(cls);
        Type mixInAnnotations = JSON.getMixInAnnotations(method.getDeclaringClass());
        Method declaredMethod = null;
        Class superclass = mixInAnnotations instanceof Class ? (Class) mixInAnnotations : null;
        if (superclass != null) {
            String name = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            while (superclass != null && superclass != Object.class) {
                try {
                    declaredMethod = superclass.getDeclaredMethod(name, parameterTypes);
                    break;
                } catch (NoSuchMethodException unused) {
                    superclass = superclass.getSuperclass();
                }
            }
            if (declaredMethod != null && (a = (A) declaredMethod.getAnnotation(cls)) != null) {
                return a;
            }
        }
        return a2;
    }

    public static Annotation[][] getParameterAnnotations(Method method) {
        Annotation[][] parameterAnnotations;
        Annotation[][] parameterAnnotations2 = method.getParameterAnnotations();
        Type mixInAnnotations = JSON.getMixInAnnotations(method.getDeclaringClass());
        Method declaredMethod = null;
        Class superclass = mixInAnnotations instanceof Class ? (Class) mixInAnnotations : null;
        if (superclass != null) {
            String name = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            while (superclass != null && superclass != Object.class) {
                try {
                    declaredMethod = superclass.getDeclaredMethod(name, parameterTypes);
                    break;
                } catch (NoSuchMethodException unused) {
                    superclass = superclass.getSuperclass();
                }
            }
            if (declaredMethod != null && (parameterAnnotations = declaredMethod.getParameterAnnotations()) != null) {
                return parameterAnnotations;
            }
        }
        return parameterAnnotations2;
    }

    public static List<FieldInfo> computeGetters(Class<?> cls, Map<String, String> map, boolean z) {
        JSONType jSONType = (JSONType) getAnnotation(cls, JSONType.class);
        HashMap map2 = new HashMap();
        ParserConfig.parserAllFieldToCache(cls, map2);
        return computeGetters(cls, jSONType, map, map2, z, PropertyNamingStrategy.CamelCase);
    }

    public static List<FieldInfo> computeGetters(Class<?> cls, Map<String, String> map) {
        return computeGetters(cls, map, true);
    }

    public static Class<?> loadClass(String str, ClassLoader classLoader) {
        return loadClass(str, classLoader, false);
    }

    public static Class<?> loadClass(String str) {
        return loadClass(str, null);
    }

    public static SerializeBeanInfo buildBeanInfo(Class<?> cls, Map<String, String> map, PropertyNamingStrategy propertyNamingStrategy) {
        return buildBeanInfo(cls, map, propertyNamingStrategy, false);
    }

    public static <T> T castToJavaBean(Object obj, Class<T> cls) {
        return (T) cast(obj, (Class) cls, ParserConfig.getGlobalInstance());
    }

    public static Date castToDate(Object obj) {
        return castToDate(obj, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T cast(Object obj, Type type, ParserConfig parserConfig) {
        if (obj == 0) {
            return null;
        }
        if (type instanceof Class) {
            return (T) cast(obj, (Class) type, parserConfig);
        }
        if (type instanceof ParameterizedType) {
            return (T) cast(obj, (ParameterizedType) type, parserConfig);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                return null;
            }
        }
        if (type instanceof TypeVariable) {
            return obj;
        }
        siq.m184351a("can not cast to : ", type);
        return null;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [T, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v6, types: [T, java.util.HashMap, java.util.Map] */
    public static <T> T cast(Object obj, ParameterizedType parameterizedType, ParserConfig parserConfig) {
        Object objCast;
        T t;
        Object objCast2;
        Type rawType = parameterizedType.getRawType();
        if (rawType == List.class || rawType == ArrayList.class) {
            Type type = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof List) {
                List list = (List) obj;
                ?? r10 = (T) new ArrayList(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Object obj2 = list.get(i);
                    if (type instanceof Class) {
                        if (obj2 != null && obj2.getClass() == JSONObject.class) {
                            objCast = ((JSONObject) obj2).toJavaObject((Class) type, parserConfig, 0);
                        } else {
                            objCast = cast(obj2, (Class<Object>) type, parserConfig);
                        }
                    } else {
                        objCast = cast(obj2, type, parserConfig);
                    }
                    r10.add(objCast);
                }
                return r10;
            }
        }
        if (rawType == Set.class || rawType == HashSet.class || rawType == TreeSet.class || rawType == Collection.class || rawType == List.class || rawType == ArrayList.class) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof Iterable) {
                if (rawType != Set.class && rawType != HashSet.class) {
                    if (rawType == TreeSet.class) {
                        t = (T) new TreeSet();
                    } else {
                        t = (T) new ArrayList();
                    }
                } else {
                    t = (T) new HashSet();
                }
                for (T t2 : (Iterable) obj) {
                    if (type2 instanceof Class) {
                        if (t2 != null && t2.getClass() == JSONObject.class) {
                            objCast2 = ((JSONObject) t2).toJavaObject((Class) type2, parserConfig, 0);
                        } else {
                            objCast2 = cast((Object) t2, (Class<Object>) type2, parserConfig);
                        }
                    } else {
                        objCast2 = cast(t2, type2, parserConfig);
                    }
                    ((Collection) t).add(objCast2);
                }
                return t;
            }
        }
        if (rawType == Map.class || rawType == HashMap.class) {
            Type type3 = parameterizedType.getActualTypeArguments()[0];
            Type type4 = parameterizedType.getActualTypeArguments()[1];
            if (obj instanceof Map) {
                ?? r11 = (T) new HashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    r11.put(cast(entry.getKey(), type3, parserConfig), cast(entry.getValue(), type4, parserConfig));
                }
                return r11;
            }
        }
        if ((obj instanceof String) && ((String) obj).length() == 0) {
            return null;
        }
        if (parameterizedType.getActualTypeArguments().length == 1 && (parameterizedType.getActualTypeArguments()[0] instanceof WildcardType)) {
            return (T) cast(obj, rawType, parserConfig);
        }
        if (rawType == Map.Entry.class && (obj instanceof Map)) {
            Map map = (Map) obj;
            if (map.size() == 1) {
                return (T) ((Map.Entry) map.entrySet().iterator().next());
            }
        }
        if (rawType instanceof Class) {
            if (parserConfig == null) {
                parserConfig = ParserConfig.global;
            }
            ObjectDeserializer deserializer = parserConfig.getDeserializer(rawType);
            if (deserializer != null) {
                return (T) deserializer.deserialze(new DefaultJSONParser(JSON.toJSONString(obj), parserConfig), parameterizedType, null);
            }
        }
        siq.m184351a("can not cast to : ", parameterizedType);
        return null;
    }
}
