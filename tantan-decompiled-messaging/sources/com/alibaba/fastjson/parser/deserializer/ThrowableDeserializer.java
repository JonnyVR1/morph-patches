package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.ParserConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import p149l.piq;
import p149l.riq;

/* JADX INFO: loaded from: classes.dex */
public class ThrowableDeserializer extends JavaBeanDeserializer {
    public ThrowableDeserializer(ParserConfig parserConfig, Class<?> cls) {
        super(parserConfig, cls, cls);
    }

    private Throwable createException(String str, Throwable th, Class<?> cls) throws Exception {
        Constructor<?> constructor = null;
        Constructor<?> constructor2 = null;
        Constructor<?> constructor3 = null;
        for (Constructor<?> constructor4 : cls.getConstructors()) {
            Class<?>[] parameterTypes = constructor4.getParameterTypes();
            if (parameterTypes.length == 0) {
                constructor3 = constructor4;
            } else if (parameterTypes.length == 1 && parameterTypes[0] == String.class) {
                constructor2 = constructor4;
            } else if (parameterTypes.length == 2 && parameterTypes[0] == String.class && parameterTypes[1] == Throwable.class) {
                constructor = constructor4;
            }
        }
        if (constructor != null) {
            return (Throwable) constructor.newInstance(str, th);
        }
        if (constructor2 != null) {
            return (Throwable) constructor2.newInstance(str);
        }
        if (constructor3 != null) {
            return (Throwable) constructor3.newInstance(null);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0127  */
    @Override // com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) throws Throwable {
        Class<?> clsCheckAutoType;
        Object obj2;
        JavaBeanDeserializer javaBeanDeserializer;
        ThrowableDeserializer throwableDeserializer = this;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() == 8) {
            jSONLexer.nextToken();
            return null;
        }
        if (defaultJSONParser.getResolveStatus() == 2) {
            defaultJSONParser.setResolveStatus(0);
        } else if (jSONLexer.token() != 12) {
            riq.m179531a("syntax error");
            return null;
        }
        if (type == null || !(type instanceof Class)) {
            clsCheckAutoType = null;
        } else {
            clsCheckAutoType = (Class) type;
            if (!Throwable.class.isAssignableFrom(clsCheckAutoType)) {
                clsCheckAutoType = null;
            }
        }
        HashMap map = null;
        Throwable th = null;
        String strStringVal = null;
        StackTraceElement[] stackTraceElementArr = null;
        while (true) {
            String strScanSymbol = jSONLexer.scanSymbol(defaultJSONParser.getSymbolTable());
            if (strScanSymbol == null) {
                if (jSONLexer.token() == 13) {
                    jSONLexer.nextToken(16);
                    break;
                }
                if (jSONLexer.token() != 16 || !jSONLexer.isEnabled(Feature.AllowArbitraryCommas)) {
                }
            }
            jSONLexer.nextTokenWithColon(4);
            if (JSON.DEFAULT_TYPE_KEY.equals(strScanSymbol)) {
                if (jSONLexer.token() != 4) {
                    riq.m179531a("syntax error");
                    return null;
                }
                clsCheckAutoType = defaultJSONParser.getConfig().checkAutoType(jSONLexer.stringVal(), Throwable.class, jSONLexer.getFeatures());
                jSONLexer.nextToken(16);
            } else if ("message".equals(strScanSymbol)) {
                if (jSONLexer.token() == 8) {
                    strStringVal = null;
                } else {
                    if (jSONLexer.token() != 4) {
                        riq.m179531a("syntax error");
                        return null;
                    }
                    strStringVal = jSONLexer.stringVal();
                }
                jSONLexer.nextToken();
            } else if ("cause".equals(strScanSymbol)) {
                th = (Throwable) throwableDeserializer.deserialze(defaultJSONParser, null, "cause");
            } else if ("stackTrace".equals(strScanSymbol)) {
                stackTraceElementArr = (StackTraceElement[]) defaultJSONParser.parseObject((Class) StackTraceElement[].class);
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                map.put(strScanSymbol, defaultJSONParser.parse());
            }
            if (jSONLexer.token() == 13) {
                jSONLexer.nextToken(16);
                break;
            }
        }
        if (clsCheckAutoType == null) {
            obj2 = (T) new Exception(strStringVal, th);
        } else {
            if (!Throwable.class.isAssignableFrom(clsCheckAutoType)) {
                riq.m179531a("type not match, not Throwable. ".concat(clsCheckAutoType.getName()));
                return null;
            }
            try {
                obj2 = (T) throwableDeserializer.createException(strStringVal, th, clsCheckAutoType);
                if (obj2 == null) {
                    obj2 = (T) new Exception(strStringVal, th);
                }
            } catch (Exception e) {
                piq.m169752a("create instance error", e);
                return null;
            }
        }
        if (stackTraceElementArr != null) {
            ((Throwable) obj2).setStackTrace(stackTraceElementArr);
        }
        if (map != null) {
            if (clsCheckAutoType == null) {
                javaBeanDeserializer = throwableDeserializer;
                javaBeanDeserializer = null;
            } else if (clsCheckAutoType != throwableDeserializer.clazz) {
                ObjectDeserializer deserializer = defaultJSONParser.getConfig().getDeserializer(clsCheckAutoType);
                if (deserializer instanceof JavaBeanDeserializer) {
                    javaBeanDeserializer = throwableDeserializer;
                    javaBeanDeserializer = (JavaBeanDeserializer) deserializer;
                } else {
                    javaBeanDeserializer = throwableDeserializer;
                    javaBeanDeserializer = null;
                }
            }
            if (javaBeanDeserializer != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    FieldDeserializer fieldDeserializer = javaBeanDeserializer.getFieldDeserializer(str);
                    if (fieldDeserializer != null) {
                        fieldDeserializer.setValue(obj2, value);
                    }
                }
            }
        }
        return (T) obj2;
    }

    @Override // com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 12;
    }
}
