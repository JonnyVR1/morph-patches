package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p153l.i1w;
import p153l.qkq;
import p153l.rkq;
import p153l.wkq;

/* JADX INFO: loaded from: classes.dex */
public class MapDeserializer implements ObjectDeserializer {
    public static MapDeserializer instance = new MapDeserializer();

    public static Map parseMap(DefaultJSONParser defaultJSONParser, Map<String, Object> map, Type type, Object obj) {
        String strScanSymbolUnQuoted;
        Object object;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        int i = jSONLexer.token();
        int i2 = 0;
        if (i != 12) {
            String str = "syntax error, expect {, actual " + jSONLexer.tokenName();
            if (obj instanceof String) {
                str = str.concat(", fieldName ") + obj;
            }
            String str2 = str.concat(", ") + jSONLexer.info();
            if (i != 4) {
                JSONArray jSONArray = new JSONArray();
                defaultJSONParser.parseArray(jSONArray, obj);
                if (jSONArray.size() == 1) {
                    Object obj2 = jSONArray.get(0);
                    if (obj2 instanceof JSONObject) {
                        return (JSONObject) obj2;
                    }
                }
            }
            qkq.m176968a(str2);
            return null;
        }
        ParseContext context = defaultJSONParser.getContext();
        while (true) {
            try {
                jSONLexer.skipWhitespace();
                char current = jSONLexer.getCurrent();
                if (jSONLexer.isEnabled(Feature.AllowArbitraryCommas)) {
                    while (current == ',') {
                        jSONLexer.next();
                        jSONLexer.skipWhitespace();
                        current = jSONLexer.getCurrent();
                    }
                }
                if (current == '\"') {
                    strScanSymbolUnQuoted = jSONLexer.scanSymbol(defaultJSONParser.getSymbolTable(), '\"');
                    jSONLexer.skipWhitespace();
                    if (jSONLexer.getCurrent() != ':') {
                        throw new JSONException("expect ':' at " + jSONLexer.pos());
                    }
                } else {
                    if (current == '}') {
                        jSONLexer.next();
                        jSONLexer.resetStringPosition();
                        jSONLexer.nextToken(16);
                        defaultJSONParser.setContext(context);
                        return map;
                    }
                    if (current == '\'') {
                        if (!jSONLexer.isEnabled(Feature.AllowSingleQuotes)) {
                            throw new JSONException("syntax error");
                        }
                        strScanSymbolUnQuoted = jSONLexer.scanSymbol(defaultJSONParser.getSymbolTable(), '\'');
                        jSONLexer.skipWhitespace();
                        if (jSONLexer.getCurrent() != ':') {
                            throw new JSONException("expect ':' at " + jSONLexer.pos());
                        }
                    } else {
                        if (!jSONLexer.isEnabled(Feature.AllowUnQuotedFieldNames)) {
                            throw new JSONException("syntax error");
                        }
                        strScanSymbolUnQuoted = jSONLexer.scanSymbolUnQuoted(defaultJSONParser.getSymbolTable());
                        jSONLexer.skipWhitespace();
                        char current2 = jSONLexer.getCurrent();
                        if (current2 != ':') {
                            throw new JSONException("expect ':' at " + jSONLexer.pos() + ", actual " + current2);
                        }
                    }
                }
                jSONLexer.next();
                jSONLexer.skipWhitespace();
                jSONLexer.getCurrent();
                jSONLexer.resetStringPosition();
                if (strScanSymbolUnQuoted != JSON.DEFAULT_TYPE_KEY || jSONLexer.isEnabled(Feature.DisableSpecialKeyDetect)) {
                    jSONLexer.nextToken();
                    if (i2 != 0) {
                        defaultJSONParser.setContext(context);
                    }
                    if (jSONLexer.token() == 8) {
                        jSONLexer.nextToken();
                        object = null;
                    } else {
                        object = defaultJSONParser.parseObject(type, strScanSymbolUnQuoted);
                    }
                    map.put(strScanSymbolUnQuoted, object);
                    defaultJSONParser.checkMapResolve(map, strScanSymbolUnQuoted);
                    defaultJSONParser.setContext(context, object, strScanSymbolUnQuoted);
                    defaultJSONParser.setContext(context);
                    int i3 = jSONLexer.token();
                    if (i3 == 20 || i3 == 15) {
                        break;
                        break;
                    }
                    if (i3 == 13) {
                        jSONLexer.nextToken();
                        defaultJSONParser.setContext(context);
                        return map;
                    }
                } else {
                    String strScanSymbol = jSONLexer.scanSymbol(defaultJSONParser.getSymbolTable(), '\"');
                    ParserConfig config = defaultJSONParser.getConfig();
                    Class<?> clsCheckAutoType = config.checkAutoType(strScanSymbol, null, jSONLexer.getFeatures());
                    if (!Map.class.isAssignableFrom(clsCheckAutoType)) {
                        ObjectDeserializer deserializer = config.getDeserializer(clsCheckAutoType);
                        jSONLexer.nextToken(16);
                        defaultJSONParser.setResolveStatus(2);
                        if (context != null && !(obj instanceof Integer)) {
                            defaultJSONParser.popContext();
                        }
                        Map map2 = (Map) deserializer.deserialze(defaultJSONParser, clsCheckAutoType, obj);
                        defaultJSONParser.setContext(context);
                        return map2;
                    }
                    jSONLexer.nextToken(16);
                    if (jSONLexer.token() == 13) {
                        jSONLexer.nextToken(16);
                        defaultJSONParser.setContext(context);
                        return map;
                    }
                }
                i2++;
            } catch (Throwable th) {
                defaultJSONParser.setContext(context);
                throw th;
            }
        }
        defaultJSONParser.setContext(context);
        return map;
    }

    public Map<Object, Object> createMap(Type type, int i) {
        if (type == Properties.class) {
            return new Properties();
        }
        if (type == Hashtable.class) {
            return new Hashtable();
        }
        if (type == IdentityHashMap.class) {
            return new IdentityHashMap();
        }
        if (type == SortedMap.class || type == TreeMap.class) {
            return new TreeMap();
        }
        if (type == ConcurrentMap.class || type == ConcurrentHashMap.class) {
            return new ConcurrentHashMap();
        }
        if (type == Map.class) {
            return (Feature.OrderedField.mask & i) != 0 ? new LinkedHashMap() : new HashMap();
        }
        if (type == HashMap.class) {
            return new HashMap();
        }
        if (type == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            return EnumMap.class.equals(rawType) ? new EnumMap((Class) parameterizedType.getActualTypeArguments()[0]) : createMap(rawType, i);
        }
        Class cls = (Class) type;
        if (cls.isInterface()) {
            rkq.m181878a("unsupport type ", type);
            return null;
        }
        if ("java.util.Collections$UnmodifiableMap".equals(cls.getName())) {
            return new HashMap();
        }
        try {
            return (Map) cls.newInstance();
        } catch (Exception e) {
            i1w.m138155a("unsupport type ", type, e);
            return null;
        }
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        if (type == JSONObject.class && defaultJSONParser.getFieldTypeResolver() == null) {
            return (T) defaultJSONParser.parseObject();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() == 8) {
            jSONLexer.nextToken(16);
            return null;
        }
        boolean z = (type instanceof Class) && "java.util.Collections$UnmodifiableMap".equals(((Class) type).getName());
        Map<Object, Object> mapCreateMap = (jSONLexer.getFeatures() & Feature.OrderedField.mask) != 0 ? createMap(type, jSONLexer.getFeatures()) : createMap(type);
        ParseContext context = defaultJSONParser.getContext();
        try {
            defaultJSONParser.setContext(context, mapCreateMap, obj);
            Map map = (T) deserialze(defaultJSONParser, type, obj, mapCreateMap);
            if (z) {
                map = (T) Collections.unmodifiableMap(map);
            }
            return (T) map;
        } finally {
            defaultJSONParser.setContext(context);
        }
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 12;
    }

    public Object deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj, Map map) {
        Type type2;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type type3 = parameterizedType.getActualTypeArguments()[0];
            if (map.getClass().getName().equals("org.springframework.util.LinkedMultiValueMap")) {
                type2 = List.class;
            } else {
                type2 = parameterizedType.getActualTypeArguments()[1];
            }
            if (String.class == type3) {
                return parseMap(defaultJSONParser, map, type2, obj);
            }
            return parseMap(defaultJSONParser, map, type3, type2, obj);
        }
        return defaultJSONParser.parseObject(map, obj);
    }

    public Map<Object, Object> createMap(Type type) {
        return createMap(type, JSON.DEFAULT_GENERATE_FEATURE);
    }

    public static Object parseMap(DefaultJSONParser defaultJSONParser, Map<Object, Object> map, Type type, Type type2, Object obj) {
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object obj2 = null;
        if (jSONLexer.token() != 12 && jSONLexer.token() != 16) {
            wkq.m206856a("syntax error, expect {, actual ", jSONLexer.tokenName());
            return null;
        }
        ObjectDeserializer deserializer = defaultJSONParser.getConfig().getDeserializer(type);
        ObjectDeserializer deserializer2 = defaultJSONParser.getConfig().getDeserializer(type2);
        jSONLexer.nextToken(deserializer.getFastMatchToken());
        ParseContext context = defaultJSONParser.getContext();
        while (jSONLexer.token() != 13) {
            try {
                if (jSONLexer.token() == 4 && jSONLexer.isRef() && !jSONLexer.isEnabled(Feature.DisableSpecialKeyDetect)) {
                    jSONLexer.nextTokenWithColon(4);
                    if (jSONLexer.token() == 4) {
                        String strStringVal = jSONLexer.stringVal();
                        if ("..".equals(strStringVal)) {
                            obj2 = context.parent.object;
                        } else if ("$".equals(strStringVal)) {
                            ParseContext parseContext = context;
                            while (true) {
                                ParseContext parseContext2 = parseContext.parent;
                                if (parseContext2 == null) {
                                    break;
                                }
                                parseContext = parseContext2;
                            }
                            obj2 = parseContext.object;
                        } else {
                            defaultJSONParser.addResolveTask(new DefaultJSONParser.ResolveTask(context, strStringVal));
                            defaultJSONParser.setResolveStatus(1);
                        }
                        jSONLexer.nextToken(13);
                        if (jSONLexer.token() == 13) {
                            jSONLexer.nextToken(16);
                            defaultJSONParser.setContext(context);
                            return obj2;
                        }
                        throw new JSONException("illegal ref");
                    }
                    throw new JSONException("illegal ref, " + JSONToken.name(jSONLexer.token()));
                }
                if (map.size() == 0 && jSONLexer.token() == 4 && JSON.DEFAULT_TYPE_KEY.equals(jSONLexer.stringVal()) && !jSONLexer.isEnabled(Feature.DisableSpecialKeyDetect)) {
                    jSONLexer.nextTokenWithColon(4);
                    jSONLexer.nextToken(16);
                    if (jSONLexer.token() == 13) {
                        jSONLexer.nextToken();
                        defaultJSONParser.setContext(context);
                        return map;
                    }
                    jSONLexer.nextToken(deserializer.getFastMatchToken());
                }
                Object objDeserialze = deserializer.deserialze(defaultJSONParser, type, null);
                if (jSONLexer.token() == 17) {
                    jSONLexer.nextToken(deserializer2.getFastMatchToken());
                    Object objDeserialze2 = deserializer2.deserialze(defaultJSONParser, type2, objDeserialze);
                    defaultJSONParser.checkMapResolve(map, objDeserialze);
                    map.put(objDeserialze, objDeserialze2);
                    if (jSONLexer.token() == 16) {
                        jSONLexer.nextToken(deserializer.getFastMatchToken());
                    }
                } else {
                    throw new JSONException("syntax error, expect :, actual " + jSONLexer.token());
                }
            } catch (Throwable th) {
                defaultJSONParser.setContext(context);
                throw th;
            }
        }
        jSONLexer.nextToken(16);
        defaultJSONParser.setContext(context);
        return map;
    }
}
