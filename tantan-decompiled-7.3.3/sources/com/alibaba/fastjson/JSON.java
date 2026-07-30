package com.alibaba.fastjson;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider;
import com.alibaba.fastjson.parser.deserializer.FieldTypeResolver;
import com.alibaba.fastjson.parser.deserializer.ParseProcess;
import com.alibaba.fastjson.serializer.JSONSerializable;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.TypeUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import p153l.okq;

/* JADX INFO: loaded from: classes.dex */
public abstract class JSON implements JSONStreamAware, JSONAware {
    public static final String VERSION = "1.2.62";
    private static final ThreadLocal<byte[]> bytesLocal;
    private static final ThreadLocal<char[]> charsLocal;
    public static TimeZone defaultTimeZone = TimeZone.getDefault();
    public static Locale defaultLocale = Locale.getDefault();
    public static String DEFAULT_TYPE_KEY = "@type";
    static final SerializeFilter[] emptyFilters = new SerializeFilter[0];
    public static String DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final ConcurrentHashMap<Type, Type> mixInsMapper = new ConcurrentHashMap<>(16);
    public static int DEFAULT_PARSER_FEATURE = ((((((Feature.AutoCloseSource.getMask() | Feature.InternFieldNames.getMask()) | Feature.UseBigDecimal.getMask()) | Feature.AllowUnQuotedFieldNames.getMask()) | Feature.AllowSingleQuotes.getMask()) | Feature.AllowArbitraryCommas.getMask()) | Feature.SortFeidFastMatch.getMask()) | Feature.IgnoreNotMatch.getMask();
    public static int DEFAULT_GENERATE_FEATURE = ((SerializerFeature.QuoteFieldNames.getMask() | SerializerFeature.SkipTransientField.getMask()) | SerializerFeature.WriteEnumUsingName.getMask()) | SerializerFeature.SortField.getMask();

    static {
        config(IOUtils.DEFAULT_PROPERTIES);
        bytesLocal = new ThreadLocal<>();
        charsLocal = new ThreadLocal<>();
    }

    public static void addMixInAnnotations(Type type, Type type2) {
        if (type == null || type2 == null) {
            return;
        }
        mixInsMapper.put(type, type2);
    }

    private static byte[] allocateBytes(int i) {
        ThreadLocal<byte[]> threadLocal = bytesLocal;
        byte[] bArr = threadLocal.get();
        if (bArr != null) {
            return bArr.length < i ? new byte[i] : bArr;
        }
        if (i > 65536) {
            return new byte[i];
        }
        byte[] bArr2 = new byte[65536];
        threadLocal.set(bArr2);
        return bArr2;
    }

    private static char[] allocateChars(int i) {
        ThreadLocal<char[]> threadLocal = charsLocal;
        char[] cArr = threadLocal.get();
        if (cArr != null) {
            return cArr.length < i ? new char[i] : cArr;
        }
        if (i > 65536) {
            return new char[i];
        }
        char[] cArr2 = new char[65536];
        threadLocal.set(cArr2);
        return cArr2;
    }

    public static void clearMixInAnnotations() {
        mixInsMapper.clear();
    }

    private static void config(Properties properties) {
        String property = properties.getProperty("fastjson.serializerFeatures.MapSortField");
        int mask = SerializerFeature.MapSortField.getMask();
        if ("true".equals(property)) {
            DEFAULT_GENERATE_FEATURE |= mask;
        } else if ("false".equals(property)) {
            DEFAULT_GENERATE_FEATURE &= ~mask;
        }
        if ("true".equals(properties.getProperty("parser.features.NonStringKeyAsString"))) {
            DEFAULT_PARSER_FEATURE |= Feature.NonStringKeyAsString.getMask();
        }
        if ("true".equals(properties.getProperty("parser.features.ErrorOnEnumNotMatch")) || "true".equals(properties.getProperty("fastjson.parser.features.ErrorOnEnumNotMatch"))) {
            DEFAULT_PARSER_FEATURE |= Feature.ErrorOnEnumNotMatch.getMask();
        }
        if ("false".equals(properties.getProperty("fastjson.asmEnable"))) {
            ParserConfig.getGlobalInstance().setAsmEnable(false);
            SerializeConfig.getGlobalInstance().setAsmEnable(false);
        }
    }

    public static Type getMixInAnnotations(Type type) {
        if (type != null) {
            return mixInsMapper.get(type);
        }
        return null;
    }

    public static <T> void handleResovleTask(DefaultJSONParser defaultJSONParser, T t) {
        defaultJSONParser.handleResovleTask(t);
    }

    public static boolean isValid(String str) {
        if (str != null && str.length() != 0) {
            JSONScanner jSONScanner = new JSONScanner(str);
            try {
                jSONScanner.nextToken();
                int i = jSONScanner.token();
                if (i != 12) {
                    if (i != 14) {
                        switch (i) {
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                jSONScanner.nextToken();
                                break;
                            default:
                                return false;
                        }
                    } else {
                        jSONScanner.skipArray(true);
                    }
                } else {
                    if (jSONScanner.getCurrent() == 26) {
                        return false;
                    }
                    jSONScanner.skipObject(true);
                }
                return jSONScanner.token() == 20;
            } catch (Exception unused) {
            } finally {
                jSONScanner.close();
            }
        }
        return false;
    }

    public static boolean isValidArray(String str) {
        if (str != null && str.length() != 0) {
            JSONScanner jSONScanner = new JSONScanner(str);
            try {
                jSONScanner.nextToken();
                if (jSONScanner.token() != 14) {
                    return false;
                }
                jSONScanner.skipArray(true);
                return jSONScanner.token() == 20;
            } catch (Exception unused) {
            } finally {
                jSONScanner.close();
            }
        }
        return false;
    }

    public static boolean isValidObject(String str) {
        if (str != null && str.length() != 0) {
            JSONScanner jSONScanner = new JSONScanner(str);
            try {
                jSONScanner.nextToken();
                if (jSONScanner.token() != 12) {
                    return false;
                }
                if (jSONScanner.getCurrent() == 26) {
                    return false;
                }
                jSONScanner.skipObject(true);
                return jSONScanner.token() == 20;
            } catch (Exception unused) {
            } finally {
                jSONScanner.close();
            }
        }
        return false;
    }

    public static Object parse(byte[] bArr, int i, int i2, CharsetDecoder charsetDecoder, int i3) {
        charsetDecoder.reset();
        char[] cArrAllocateChars = allocateChars((int) (((double) i2) * ((double) charsetDecoder.maxCharsPerByte())));
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        CharBuffer charBufferWrap = CharBuffer.wrap(cArrAllocateChars);
        IOUtils.decode(charsetDecoder, byteBufferWrap, charBufferWrap);
        DefaultJSONParser defaultJSONParser = new DefaultJSONParser(cArrAllocateChars, charBufferWrap.position(), ParserConfig.getGlobalInstance(), i3);
        Object obj = defaultJSONParser.parse();
        defaultJSONParser.handleResovleTask(obj);
        defaultJSONParser.close();
        return obj;
    }

    public static <T> List<T> parseArray(String str, Class<T> cls) {
        ArrayList arrayList = null;
        if (str == null) {
            return null;
        }
        DefaultJSONParser defaultJSONParser = new DefaultJSONParser(str, ParserConfig.getGlobalInstance());
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        int i = jSONLexer.token();
        if (i == 8) {
            jSONLexer.nextToken();
        } else if (i != 20 || !jSONLexer.isBlankInput()) {
            arrayList = new ArrayList();
            defaultJSONParser.parseArray((Class<?>) cls, (Collection) arrayList);
            defaultJSONParser.handleResovleTask(arrayList);
        }
        defaultJSONParser.close();
        return arrayList;
    }

    public static <T> T parseObject(String str, Type type, ParserConfig parserConfig, ParseProcess parseProcess, int i, Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (featureArr != null) {
            for (Feature feature : featureArr) {
                i |= feature.mask;
            }
        }
        DefaultJSONParser defaultJSONParser = new DefaultJSONParser(str, parserConfig, i);
        if (parseProcess != null) {
            if (parseProcess instanceof ExtraTypeProvider) {
                defaultJSONParser.getExtraTypeProviders().add((ExtraTypeProvider) parseProcess);
            }
            if (parseProcess instanceof ExtraProcessor) {
                defaultJSONParser.getExtraProcessors().add((ExtraProcessor) parseProcess);
            }
            if (parseProcess instanceof FieldTypeResolver) {
                defaultJSONParser.setFieldTypeResolver((FieldTypeResolver) parseProcess);
            }
        }
        T t = (T) defaultJSONParser.parseObject(type, (Object) null);
        defaultJSONParser.handleResovleTask(t);
        defaultJSONParser.close();
        return t;
    }

    public static void removeMixInAnnotations(Type type) {
        if (type != null) {
            mixInsMapper.remove(type);
        }
    }

    public static void setDefaultTypeKey(String str) {
        DEFAULT_TYPE_KEY = str;
        ParserConfig.global.symbolTable.addSymbol(str, 0, str.length(), str.hashCode(), true);
    }

    public static Object toJSON(Object obj, SerializeConfig serializeConfig) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSON) {
            return obj;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            int size = map.size();
            JSONObject jSONObject = new JSONObject((Map<String, Object>) (map instanceof LinkedHashMap ? new LinkedHashMap(size) : map instanceof TreeMap ? new TreeMap() : new HashMap(size)));
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put(TypeUtils.castToString(entry.getKey()), toJSON(entry.getValue(), serializeConfig));
            }
            return jSONObject;
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            JSONArray jSONArray = new JSONArray(collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                jSONArray.add(toJSON(it.next(), serializeConfig));
            }
            return jSONArray;
        }
        if (obj instanceof JSONSerializable) {
            return parse(toJSONString(obj));
        }
        Class<?> cls = obj.getClass();
        if (cls.isEnum()) {
            return ((Enum) obj).name();
        }
        if (cls.isArray()) {
            int length = Array.getLength(obj);
            JSONArray jSONArray2 = new JSONArray(length);
            for (int i = 0; i < length; i++) {
                jSONArray2.add(toJSON(Array.get(obj, i)));
            }
            return jSONArray2;
        }
        if (ParserConfig.isPrimitive2(cls)) {
            return obj;
        }
        ObjectSerializer objectWriter = serializeConfig.getObjectWriter(cls);
        if (!(objectWriter instanceof JavaBeanSerializer)) {
            return parse(toJSONString(obj));
        }
        JavaBeanSerializer javaBeanSerializer = (JavaBeanSerializer) objectWriter;
        JSONObject jSONObject2 = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry2 : javaBeanSerializer.getFieldValuesMap(obj).entrySet()) {
                jSONObject2.put(entry2.getKey(), toJSON(entry2.getValue(), serializeConfig));
            }
            return jSONObject2;
        } catch (Exception e) {
            okq.m168043a("toJSON error", e);
            return null;
        }
    }

    public static byte[] toJSONBytes(Charset charset, Object obj, SerializeConfig serializeConfig, SerializeFilter[] serializeFilterArr, String str, int i, SerializerFeature... serializerFeatureArr) {
        SerializeWriter serializeWriter = new SerializeWriter(null, i, serializerFeatureArr);
        try {
            JSONSerializer jSONSerializer = new JSONSerializer(serializeWriter, serializeConfig);
            if (str != null && str.length() != 0) {
                jSONSerializer.setDateFormat(str);
                jSONSerializer.config(SerializerFeature.WriteDateUseDateFormat, true);
            }
            if (serializeFilterArr != null) {
                for (SerializeFilter serializeFilter : serializeFilterArr) {
                    jSONSerializer.addFilter(serializeFilter);
                }
            }
            jSONSerializer.write(obj);
            return serializeWriter.toBytes(charset);
        } finally {
            serializeWriter.close();
        }
    }

    public static String toJSONString(Object obj, SerializeConfig serializeConfig, SerializeFilter[] serializeFilterArr, String str, int i, SerializerFeature... serializerFeatureArr) {
        SerializeWriter serializeWriter = new SerializeWriter(null, i, serializerFeatureArr);
        try {
            JSONSerializer jSONSerializer = new JSONSerializer(serializeWriter, serializeConfig);
            if (str != null && str.length() != 0) {
                jSONSerializer.setDateFormat(str);
                jSONSerializer.config(SerializerFeature.WriteDateUseDateFormat, true);
            }
            if (serializeFilterArr != null) {
                for (SerializeFilter serializeFilter : serializeFilterArr) {
                    jSONSerializer.addFilter(serializeFilter);
                }
            }
            jSONSerializer.write(obj);
            return serializeWriter.toString();
        } finally {
            serializeWriter.close();
        }
    }

    public static String toJSONStringWithDateFormat(Object obj, String str, SerializerFeature... serializerFeatureArr) {
        return toJSONString(obj, SerializeConfig.globalInstance, null, str, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
    }

    public static String toJSONStringZ(Object obj, SerializeConfig serializeConfig, SerializerFeature... serializerFeatureArr) {
        return toJSONString(obj, serializeConfig, emptyFilters, null, 0, serializerFeatureArr);
    }

    public static final int writeJSONString(OutputStream outputStream, Charset charset, Object obj, SerializeConfig serializeConfig, SerializeFilter[] serializeFilterArr, String str, int i, SerializerFeature... serializerFeatureArr) throws IOException {
        SerializeWriter serializeWriter = new SerializeWriter(null, i, serializerFeatureArr);
        try {
            JSONSerializer jSONSerializer = new JSONSerializer(serializeWriter, serializeConfig);
            if (str != null && str.length() != 0) {
                jSONSerializer.setDateFormat(str);
                jSONSerializer.config(SerializerFeature.WriteDateUseDateFormat, true);
            }
            if (serializeFilterArr != null) {
                for (SerializeFilter serializeFilter : serializeFilterArr) {
                    jSONSerializer.addFilter(serializeFilter);
                }
            }
            jSONSerializer.write(obj);
            return serializeWriter.writeToEx(outputStream, charset);
        } finally {
            serializeWriter.close();
        }
    }

    public static void writeJSONStringTo(Object obj, Writer writer, SerializerFeature... serializerFeatureArr) {
        writeJSONString(writer, obj, serializerFeatureArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T toJavaObject(Class<T> cls) {
        return (cls == JSONArray.class || cls == JSON.class || cls == Collection.class || cls == List.class) ? this : (T) TypeUtils.cast((Object) this, (Class) cls, ParserConfig.getGlobalInstance());
    }

    public String toString(SerializerFeature... serializerFeatureArr) {
        SerializeWriter serializeWriter = new SerializeWriter(null, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
        try {
            new JSONSerializer(serializeWriter).write(this);
            return serializeWriter.toString();
        } finally {
            serializeWriter.close();
        }
    }

    public static <T> T toJavaObject(JSON json, Class<T> cls) {
        return (T) TypeUtils.cast((Object) json, (Class) cls, ParserConfig.getGlobalInstance());
    }

    public <T> T toJavaObject(Type type) {
        return (T) TypeUtils.cast(this, type, ParserConfig.getGlobalInstance());
    }

    public <T> T toJavaObject(TypeReference typeReference) {
        return (T) TypeUtils.cast(this, typeReference != null ? typeReference.getType() : null, ParserConfig.getGlobalInstance());
    }

    public String toString() {
        return toJSONString();
    }

    public static Object parse(String str, ParserConfig parserConfig) {
        return parse(str, parserConfig, DEFAULT_PARSER_FEATURE);
    }

    public static Object parse(String str, ParserConfig parserConfig, int i) {
        if (str == null) {
            return null;
        }
        DefaultJSONParser defaultJSONParser = new DefaultJSONParser(str, parserConfig, i);
        Object obj = defaultJSONParser.parse();
        defaultJSONParser.handleResovleTask(obj);
        defaultJSONParser.close();
        return obj;
    }

    public static JSONArray parseArray(String str) {
        JSONArray jSONArray = null;
        if (str == null) {
            return null;
        }
        DefaultJSONParser defaultJSONParser = new DefaultJSONParser(str, ParserConfig.getGlobalInstance());
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() == 8) {
            jSONLexer.nextToken();
        } else if (jSONLexer.token() != 20) {
            jSONArray = new JSONArray();
            defaultJSONParser.parseArray(jSONArray);
            defaultJSONParser.handleResovleTask(jSONArray);
        }
        defaultJSONParser.close();
        return jSONArray;
    }

    public static Object parse(String str, int i) {
        return parse(str, ParserConfig.getGlobalInstance(), i);
    }

    public static Object parse(byte[] bArr, Feature... featureArr) {
        char[] cArrAllocateChars = allocateChars(bArr.length);
        int iDecodeUTF8 = IOUtils.decodeUTF8(bArr, 0, bArr.length, cArrAllocateChars);
        if (iDecodeUTF8 < 0) {
            return null;
        }
        return parse(new String(cArrAllocateChars, 0, iDecodeUTF8), featureArr);
    }

    public static Object parse(byte[] bArr, int i, int i2, CharsetDecoder charsetDecoder, Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        int iConfig = DEFAULT_PARSER_FEATURE;
        for (Feature feature : featureArr) {
            iConfig = Feature.config(iConfig, feature, true);
        }
        return parse(bArr, i, i2, charsetDecoder, iConfig);
    }

    public static byte[] toJSONBytes(Object obj, SerializeFilter serializeFilter, SerializerFeature... serializerFeatureArr) {
        return toJSONBytes(obj, SerializeConfig.globalInstance, new SerializeFilter[]{serializeFilter}, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
    }

    public static String toJSONString(Object obj, SerializerFeature... serializerFeatureArr) {
        return toJSONString(obj, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
    }

    public static void writeJSONString(Writer writer, Object obj, int i, SerializerFeature... serializerFeatureArr) {
        SerializeWriter serializeWriter = new SerializeWriter(writer, i, serializerFeatureArr);
        try {
            new JSONSerializer(serializeWriter).write(obj);
        } finally {
            serializeWriter.close();
        }
    }

    public static byte[] toJSONBytes(Object obj, int i, SerializerFeature... serializerFeatureArr) {
        return toJSONBytes(obj, SerializeConfig.globalInstance, i, serializerFeatureArr);
    }

    public static String toJSONString(Object obj, int i, SerializerFeature... serializerFeatureArr) {
        SerializeWriter serializeWriter = new SerializeWriter(null, i, serializerFeatureArr);
        try {
            new JSONSerializer(serializeWriter).write(obj);
            return serializeWriter.toString();
        } finally {
            serializeWriter.close();
        }
    }

    public static List<Object> parseArray(String str, Type[] typeArr) {
        if (str == null) {
            return null;
        }
        DefaultJSONParser defaultJSONParser = new DefaultJSONParser(str, ParserConfig.getGlobalInstance());
        Object[] array = defaultJSONParser.parseArray(typeArr);
        List<Object> listAsList = array != null ? Arrays.asList(array) : null;
        defaultJSONParser.handleResovleTask(listAsList);
        defaultJSONParser.close();
        return listAsList;
    }

    public static byte[] toJSONBytes(Object obj, SerializeConfig serializeConfig, SerializerFeature... serializerFeatureArr) {
        return toJSONBytes(obj, serializeConfig, emptyFilters, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
    }

    public static byte[] toJSONBytes(Object obj, SerializeConfig serializeConfig, int i, SerializerFeature... serializerFeatureArr) {
        return toJSONBytes(obj, serializeConfig, emptyFilters, i, serializerFeatureArr);
    }

    public static Object parse(String str) {
        return parse(str, DEFAULT_PARSER_FEATURE);
    }

    public static byte[] toJSONBytes(Object obj, SerializeFilter[] serializeFilterArr, SerializerFeature... serializerFeatureArr) {
        return toJSONBytes(obj, SerializeConfig.globalInstance, serializeFilterArr, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
    }

    public static Object parse(String str, Feature... featureArr) {
        int iConfig = DEFAULT_PARSER_FEATURE;
        for (Feature feature : featureArr) {
            iConfig = Feature.config(iConfig, feature, true);
        }
        return parse(str, iConfig);
    }

    public static byte[] toJSONBytes(Object obj, SerializeConfig serializeConfig, SerializeFilter serializeFilter, SerializerFeature... serializerFeatureArr) {
        return toJSONBytes(obj, serializeConfig, new SerializeFilter[]{serializeFilter}, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
    }

    public static final int writeJSONString(OutputStream outputStream, Object obj, SerializerFeature... serializerFeatureArr) throws IOException {
        return writeJSONString(outputStream, obj, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
    }

    public static byte[] toJSONBytes(Object obj, SerializeConfig serializeConfig, SerializeFilter[] serializeFilterArr, int i, SerializerFeature... serializerFeatureArr) {
        return toJSONBytes(obj, serializeConfig, serializeFilterArr, null, i, serializerFeatureArr);
    }

    public static final int writeJSONString(OutputStream outputStream, Object obj, int i, SerializerFeature... serializerFeatureArr) throws IOException {
        return writeJSONString(outputStream, IOUtils.UTF8, obj, SerializeConfig.globalInstance, null, null, i, serializerFeatureArr);
    }

    public static byte[] toJSONBytes(Object obj, SerializeConfig serializeConfig, SerializeFilter[] serializeFilterArr, String str, int i, SerializerFeature... serializerFeatureArr) {
        return toJSONBytes(IOUtils.UTF8, obj, serializeConfig, serializeFilterArr, str, i, serializerFeatureArr);
    }

    public static String toJSONString(Object obj, SerializeFilter serializeFilter, SerializerFeature... serializerFeatureArr) {
        return toJSONString(obj, SerializeConfig.globalInstance, new SerializeFilter[]{serializeFilter}, null, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
    }

    public static final int writeJSONString(OutputStream outputStream, Charset charset, Object obj, SerializerFeature... serializerFeatureArr) throws IOException {
        return writeJSONString(outputStream, charset, obj, SerializeConfig.globalInstance, null, null, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
    }

    public static byte[] toJSONBytes(Object obj, SerializerFeature... serializerFeatureArr) {
        return toJSONBytes(obj, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
    }

    public static String toJSONString(Object obj, SerializeFilter[] serializeFilterArr, SerializerFeature... serializerFeatureArr) {
        return toJSONString(obj, SerializeConfig.globalInstance, serializeFilterArr, null, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
    }

    public static void writeJSONString(Writer writer, Object obj, SerializerFeature... serializerFeatureArr) {
        writeJSONString(writer, obj, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
    }

    public static String toJSONString(Object obj, SerializeConfig serializeConfig, SerializerFeature... serializerFeatureArr) {
        return toJSONString(obj, serializeConfig, (SerializeFilter) null, serializerFeatureArr);
    }

    @Override // com.alibaba.fastjson.JSONStreamAware
    public void writeJSONString(Appendable appendable) {
        SerializeWriter serializeWriter = new SerializeWriter();
        try {
            try {
                new JSONSerializer(serializeWriter).write(this);
                appendable.append(serializeWriter.toString());
                serializeWriter.close();
            } catch (IOException e) {
                throw new JSONException(e.getMessage(), e);
            }
        } catch (Throwable th) {
            serializeWriter.close();
            throw th;
        }
    }

    public static String toJSONString(Object obj, SerializeConfig serializeConfig, SerializeFilter serializeFilter, SerializerFeature... serializerFeatureArr) {
        return toJSONString(obj, serializeConfig, new SerializeFilter[]{serializeFilter}, null, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
    }

    public static String toJSONString(Object obj, SerializeConfig serializeConfig, SerializeFilter[] serializeFilterArr, SerializerFeature... serializerFeatureArr) {
        return toJSONString(obj, serializeConfig, serializeFilterArr, null, DEFAULT_GENERATE_FEATURE, serializerFeatureArr);
    }

    public static String toJSONString(Object obj) {
        return toJSONString(obj, emptyFilters, new SerializerFeature[0]);
    }

    public static String toJSONString(Object obj, boolean z) {
        if (!z) {
            return toJSONString(obj);
        }
        return toJSONString(obj, SerializerFeature.PrettyFormat);
    }

    @Override // com.alibaba.fastjson.JSONAware
    public String toJSONString() {
        SerializeWriter serializeWriter = new SerializeWriter();
        try {
            new JSONSerializer(serializeWriter).write(this);
            return serializeWriter.toString();
        } finally {
            serializeWriter.close();
        }
    }

    public static JSONObject parseObject(String str) {
        Object obj = parse(str);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        try {
            return (JSONObject) toJSON(obj);
        } catch (RuntimeException e) {
            okq.m168043a("can not cast to JSONObject.", e);
            return null;
        }
    }

    public static <T> T parseObject(String str, TypeReference<T> typeReference, Feature... featureArr) {
        return (T) parseObject(str, typeReference.type, ParserConfig.global, DEFAULT_PARSER_FEATURE, featureArr);
    }

    public static <T> T parseObject(String str, Class<T> cls, Feature... featureArr) {
        return (T) parseObject(str, cls, ParserConfig.global, (ParseProcess) null, DEFAULT_PARSER_FEATURE, featureArr);
    }

    public static <T> T parseObject(String str, Class<T> cls, ParseProcess parseProcess, Feature... featureArr) {
        return (T) parseObject(str, cls, ParserConfig.global, parseProcess, DEFAULT_PARSER_FEATURE, featureArr);
    }

    public static <T> T parseObject(String str, Type type, Feature... featureArr) {
        return (T) parseObject(str, type, ParserConfig.global, DEFAULT_PARSER_FEATURE, featureArr);
    }

    public static <T> T parseObject(String str, Type type, ParseProcess parseProcess, Feature... featureArr) {
        return (T) parseObject(str, type, ParserConfig.global, parseProcess, DEFAULT_PARSER_FEATURE, featureArr);
    }

    public static <T> T parseObject(String str, Type type, int i, Feature... featureArr) {
        if (str == null) {
            return null;
        }
        for (Feature feature : featureArr) {
            i = Feature.config(i, feature, true);
        }
        DefaultJSONParser defaultJSONParser = new DefaultJSONParser(str, ParserConfig.getGlobalInstance(), i);
        T t = (T) defaultJSONParser.parseObject(type);
        defaultJSONParser.handleResovleTask(t);
        defaultJSONParser.close();
        return t;
    }

    public static <T> T parseObject(String str, Type type, ParserConfig parserConfig, Feature... featureArr) {
        return (T) parseObject(str, type, parserConfig, (ParseProcess) null, DEFAULT_PARSER_FEATURE, featureArr);
    }

    public static <T> T parseObject(String str, Type type, ParserConfig parserConfig, int i, Feature... featureArr) {
        return (T) parseObject(str, type, parserConfig, (ParseProcess) null, i, featureArr);
    }

    public static JSONObject parseObject(String str, Feature... featureArr) {
        return (JSONObject) parse(str, featureArr);
    }

    public static <T> T parseObject(byte[] bArr, Type type, Feature... featureArr) {
        return (T) parseObject(bArr, 0, bArr.length, IOUtils.UTF8, type, featureArr);
    }

    public static <T> T parseObject(byte[] bArr, int i, int i2, Charset charset, Type type, Feature... featureArr) {
        return (T) parseObject(bArr, i, i2, charset, type, ParserConfig.global, null, DEFAULT_PARSER_FEATURE, featureArr);
    }

    public static <T> T parseObject(byte[] bArr, Charset charset, Type type, ParserConfig parserConfig, ParseProcess parseProcess, int i, Feature... featureArr) {
        return (T) parseObject(bArr, 0, bArr.length, charset, type, parserConfig, parseProcess, i, featureArr);
    }

    public static <T> T parseObject(byte[] bArr, int i, int i2, Charset charset, Type type, ParserConfig parserConfig, ParseProcess parseProcess, int i3, Feature... featureArr) {
        String str;
        if (charset == null) {
            charset = IOUtils.UTF8;
        }
        if (charset == IOUtils.UTF8) {
            char[] cArrAllocateChars = allocateChars(bArr.length);
            int iDecodeUTF8 = IOUtils.decodeUTF8(bArr, i, i2, cArrAllocateChars);
            if (iDecodeUTF8 < 0) {
                return null;
            }
            str = new String(cArrAllocateChars, 0, iDecodeUTF8);
        } else {
            if (i2 < 0) {
                return null;
            }
            str = new String(bArr, i, i2, charset);
        }
        return (T) parseObject(str, type, parserConfig, parseProcess, i3, featureArr);
    }

    public static <T> T parseObject(byte[] bArr, int i, int i2, CharsetDecoder charsetDecoder, Type type, Feature... featureArr) {
        charsetDecoder.reset();
        char[] cArrAllocateChars = allocateChars((int) (((double) i2) * ((double) charsetDecoder.maxCharsPerByte())));
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        CharBuffer charBufferWrap = CharBuffer.wrap(cArrAllocateChars);
        IOUtils.decode(charsetDecoder, byteBufferWrap, charBufferWrap);
        return (T) parseObject(cArrAllocateChars, charBufferWrap.position(), type, featureArr);
    }

    public static <T> T parseObject(char[] cArr, int i, Type type, Feature... featureArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        int iConfig = DEFAULT_PARSER_FEATURE;
        for (Feature feature : featureArr) {
            iConfig = Feature.config(iConfig, feature, true);
        }
        DefaultJSONParser defaultJSONParser = new DefaultJSONParser(cArr, i, ParserConfig.getGlobalInstance(), iConfig);
        T t = (T) defaultJSONParser.parseObject(type);
        defaultJSONParser.handleResovleTask(t);
        defaultJSONParser.close();
        return t;
    }

    public static <T> T parseObject(InputStream inputStream, Type type, Feature... featureArr) throws IOException {
        return (T) parseObject(inputStream, IOUtils.UTF8, type, featureArr);
    }

    public static <T> T parseObject(InputStream inputStream, Charset charset, Type type, Feature... featureArr) throws IOException {
        return (T) parseObject(inputStream, charset, type, ParserConfig.global, featureArr);
    }

    public static <T> T parseObject(InputStream inputStream, Charset charset, Type type, ParserConfig parserConfig, Feature... featureArr) throws IOException {
        return (T) parseObject(inputStream, charset, type, parserConfig, (ParseProcess) null, DEFAULT_PARSER_FEATURE, featureArr);
    }

    public static <T> T parseObject(InputStream inputStream, Charset charset, Type type, ParserConfig parserConfig, ParseProcess parseProcess, int i, Feature... featureArr) throws IOException {
        if (charset == null) {
            charset = IOUtils.UTF8;
        }
        Charset charset2 = charset;
        byte[] bArrAllocateBytes = allocateBytes(65536);
        int i2 = 0;
        while (true) {
            int i3 = inputStream.read(bArrAllocateBytes, i2, bArrAllocateBytes.length - i2);
            if (i3 == -1) {
                return (T) parseObject(bArrAllocateBytes, 0, i2, charset2, type, parserConfig, parseProcess, i, featureArr);
            }
            Type type2 = type;
            ParserConfig parserConfig2 = parserConfig;
            ParseProcess parseProcess2 = parseProcess;
            int i4 = i;
            Feature[] featureArr2 = featureArr;
            i2 += i3;
            if (i2 == bArrAllocateBytes.length) {
                byte[] bArr = new byte[(bArrAllocateBytes.length * 3) / 2];
                System.arraycopy(bArrAllocateBytes, 0, bArr, 0, bArrAllocateBytes.length);
                bArrAllocateBytes = bArr;
            }
            type = type2;
            parserConfig = parserConfig2;
            parseProcess = parseProcess2;
            i = i4;
            featureArr = featureArr2;
        }
    }

    public static <T> T parseObject(String str, Class<T> cls) {
        return (T) parseObject(str, (Class) cls, new Feature[0]);
    }

    public static Object toJSON(Object obj, ParserConfig parserConfig) {
        return toJSON(obj, SerializeConfig.globalInstance);
    }

    public static Object toJSON(Object obj) {
        return toJSON(obj, SerializeConfig.globalInstance);
    }
}
