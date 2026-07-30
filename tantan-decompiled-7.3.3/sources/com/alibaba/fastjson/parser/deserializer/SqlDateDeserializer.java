package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.util.TypeUtils;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;
import p153l.qkq;
import p153l.rkq;

/* JADX INFO: loaded from: classes.dex */
public class SqlDateDeserializer extends AbstractDateDeserializer implements ObjectDeserializer {
    public static final SqlDateDeserializer instance = new SqlDateDeserializer();
    public static final SqlDateDeserializer instance_timestamp = new SqlDateDeserializer(true);
    private boolean timestamp = false;

    public SqlDateDeserializer() {
    }

    @Override // com.alibaba.fastjson.parser.deserializer.AbstractDateDeserializer
    public <T> T cast(DefaultJSONParser defaultJSONParser, Type type, Object obj, Object obj2) {
        long timeInMillis;
        if (this.timestamp) {
            return (T) castTimestamp(defaultJSONParser, type, obj, obj2);
        }
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof Date) {
            return (T) new java.sql.Date(((Date) obj2).getTime());
        }
        if (obj2 instanceof BigDecimal) {
            return (T) new java.sql.Date(TypeUtils.longValue((BigDecimal) obj2));
        }
        if (obj2 instanceof Number) {
            return (T) new java.sql.Date(((Number) obj2).longValue());
        }
        if (!(obj2 instanceof String)) {
            rkq.m181878a("parse error : ", obj2);
            return null;
        }
        String str = (String) obj2;
        if (str.length() == 0) {
            return null;
        }
        JSONScanner jSONScanner = new JSONScanner(str);
        try {
            if (jSONScanner.scanISO8601DateIfMatch()) {
                timeInMillis = jSONScanner.getCalendar().getTimeInMillis();
            } else {
                try {
                    T t = (T) new java.sql.Date(defaultJSONParser.getDateFormat().parse(str).getTime());
                    jSONScanner.close();
                    return t;
                } catch (ParseException unused) {
                    timeInMillis = Long.parseLong(str);
                }
            }
            jSONScanner.close();
            return (T) new java.sql.Date(timeInMillis);
        } catch (Throwable th) {
            jSONScanner.close();
            throw th;
        }
    }

    public <T> T castTimestamp(DefaultJSONParser defaultJSONParser, Type type, Object obj, Object obj2) {
        long timeInMillis;
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof Date) {
            return (T) new Timestamp(((Date) obj2).getTime());
        }
        if (obj2 instanceof BigDecimal) {
            return (T) new Timestamp(TypeUtils.longValue((BigDecimal) obj2));
        }
        if (obj2 instanceof Number) {
            return (T) new Timestamp(((Number) obj2).longValue());
        }
        if (!(obj2 instanceof String)) {
            qkq.m176968a("parse error");
            return null;
        }
        String str = (String) obj2;
        if (str.length() == 0) {
            return null;
        }
        JSONScanner jSONScanner = new JSONScanner(str);
        try {
            if (jSONScanner.scanISO8601DateIfMatch(false)) {
                timeInMillis = jSONScanner.getCalendar().getTimeInMillis();
            } else {
                try {
                    T t = (T) new Timestamp(defaultJSONParser.getDateFormat().parse(str).getTime());
                    jSONScanner.close();
                    return t;
                } catch (ParseException unused) {
                    timeInMillis = Long.parseLong(str);
                }
            }
            jSONScanner.close();
            return (T) new Timestamp(timeInMillis);
        } catch (Throwable th) {
            jSONScanner.close();
            throw th;
        }
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 2;
    }

    public SqlDateDeserializer(boolean z) {
    }
}
