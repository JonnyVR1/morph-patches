package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONScanner;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p153l.p7f;
import p153l.qkq;
import p153l.wkq;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDateDeserializer extends ContextObjectDeserializer implements ObjectDeserializer {
    public abstract <T> T cast(DefaultJSONParser defaultJSONParser, Type type, Object obj, Object obj2);

    @Override // com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj, String str, int i) throws Throwable {
        Object objValueOf;
        SimpleDateFormat simpleDateFormat;
        Object obj2;
        SimpleDateFormat simpleDateFormat2;
        Object obj3;
        Object time;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() == 2) {
            long jLongValue = jSONLexer.longValue();
            jSONLexer.nextToken(16);
            if ("unixtime".equals(str)) {
                jLongValue *= 1000;
            }
            objValueOf = Long.valueOf(jLongValue);
        } else {
            Object obj4 = null;
            if (jSONLexer.token() == 4) {
                String strStringVal = jSONLexer.stringVal();
                if (str != null) {
                    try {
                        simpleDateFormat = new SimpleDateFormat(str, defaultJSONParser.lexer.getLocale());
                    } catch (IllegalArgumentException e) {
                        if (str.contains(p7f.GPS_DIRECTION_TRUE)) {
                            try {
                                simpleDateFormat = new SimpleDateFormat(str.replaceAll(p7f.GPS_DIRECTION_TRUE, "'T'"), defaultJSONParser.lexer.getLocale());
                            } catch (IllegalArgumentException unused) {
                                throw e;
                            }
                        } else {
                            simpleDateFormat = null;
                        }
                    }
                    if (JSON.defaultTimeZone != null) {
                        simpleDateFormat.setTimeZone(defaultJSONParser.lexer.getTimeZone());
                    }
                    try {
                        obj2 = simpleDateFormat.parse(strStringVal);
                    } catch (ParseException unused2) {
                        obj2 = null;
                    }
                    if (obj2 == null && JSON.defaultLocale == Locale.CHINA) {
                        try {
                            simpleDateFormat2 = new SimpleDateFormat(str, Locale.US);
                        } catch (IllegalArgumentException e2) {
                            simpleDateFormat2 = simpleDateFormat;
                            if (str.contains(p7f.GPS_DIRECTION_TRUE)) {
                                try {
                                    simpleDateFormat2 = new SimpleDateFormat(str.replaceAll(p7f.GPS_DIRECTION_TRUE, "'T'"), defaultJSONParser.lexer.getLocale());
                                } catch (IllegalArgumentException unused3) {
                                    throw e2;
                                }
                            }
                        }
                        simpleDateFormat2.setTimeZone(defaultJSONParser.lexer.getTimeZone());
                        try {
                            obj2 = simpleDateFormat2.parse(strStringVal);
                        } catch (ParseException unused4) {
                            obj2 = null;
                        }
                    }
                    if (obj2 != null) {
                        obj4 = obj2;
                    } else if (str.equals("yyyy-MM-dd'T'HH:mm:ss.SSS") && strStringVal.length() == 19) {
                        try {
                            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", JSON.defaultLocale);
                            simpleDateFormat3.setTimeZone(JSON.defaultTimeZone);
                            obj4 = simpleDateFormat3.parse(strStringVal);
                        } catch (ParseException unused5) {
                        }
                    }
                }
                if (obj4 == null) {
                    jSONLexer.nextToken(16);
                    if (jSONLexer.isEnabled(Feature.AllowISO8601DateFormat)) {
                        JSONScanner jSONScanner = new JSONScanner(strStringVal);
                        if (jSONScanner.scanISO8601DateIfMatch()) {
                            obj3 = strStringVal;
                            time = strStringVal;
                            time = jSONScanner.getCalendar().getTime();
                        }
                        obj3 = strStringVal;
                        time = strStringVal;
                        jSONScanner.close();
                        obj3 = time;
                    }
                    obj3 = strStringVal;
                    objValueOf = obj3;
                } else {
                    objValueOf = obj4;
                }
            } else if (jSONLexer.token() == 8) {
                jSONLexer.nextToken();
                objValueOf = obj4;
            } else if (jSONLexer.token() == 12) {
                jSONLexer.nextToken();
                if (jSONLexer.token() != 4) {
                    qkq.m176968a("syntax error");
                    return null;
                }
                if (JSON.DEFAULT_TYPE_KEY.equals(jSONLexer.stringVal())) {
                    jSONLexer.nextToken();
                    defaultJSONParser.accept(17);
                    Type typeCheckAutoType = defaultJSONParser.getConfig().checkAutoType(jSONLexer.stringVal(), null, jSONLexer.getFeatures());
                    if (typeCheckAutoType != null) {
                        type = typeCheckAutoType;
                    }
                    defaultJSONParser.accept(4);
                    defaultJSONParser.accept(16);
                }
                jSONLexer.nextTokenWithColon(2);
                if (jSONLexer.token() != 2) {
                    wkq.m206856a("syntax error : ", jSONLexer.tokenName());
                    return null;
                }
                long jLongValue2 = jSONLexer.longValue();
                jSONLexer.nextToken();
                Object objValueOf2 = Long.valueOf(jLongValue2);
                defaultJSONParser.accept(13);
                objValueOf = objValueOf2;
            } else if (defaultJSONParser.getResolveStatus() == 2) {
                defaultJSONParser.setResolveStatus(0);
                defaultJSONParser.accept(16);
                if (jSONLexer.token() != 4) {
                    qkq.m176968a("syntax error");
                    return null;
                }
                if (!"val".equals(jSONLexer.stringVal())) {
                    qkq.m176968a("syntax error");
                    return null;
                }
                jSONLexer.nextToken();
                defaultJSONParser.accept(17);
                Object obj5 = defaultJSONParser.parse();
                defaultJSONParser.accept(13);
                objValueOf = obj5;
            } else {
                objValueOf = defaultJSONParser.parse();
            }
        }
        return (T) cast(defaultJSONParser, type, obj, objValueOf);
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        return (T) deserialze(defaultJSONParser, type, obj, null, 0);
    }
}
