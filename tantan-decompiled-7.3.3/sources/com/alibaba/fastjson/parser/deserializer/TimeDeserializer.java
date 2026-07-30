package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.util.TypeUtils;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.sql.Time;
import p153l.qkq;

/* JADX INFO: loaded from: classes.dex */
public class TimeDeserializer implements ObjectDeserializer {
    public static final TimeDeserializer instance = new TimeDeserializer();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        long timeInMillis;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() == 16) {
            jSONLexer.nextToken(4);
            if (jSONLexer.token() != 4) {
                qkq.m176968a("syntax error");
                return null;
            }
            jSONLexer.nextTokenWithColon(2);
            if (jSONLexer.token() != 2) {
                qkq.m176968a("syntax error");
                return null;
            }
            long jLongValue = jSONLexer.longValue();
            jSONLexer.nextToken(13);
            if (jSONLexer.token() == 13) {
                jSONLexer.nextToken(16);
                return (T) new Time(jLongValue);
            }
            qkq.m176968a("syntax error");
            return null;
        }
        T t = (T) defaultJSONParser.parse();
        if (t == 0) {
            return null;
        }
        if (t instanceof Time) {
            return t;
        }
        if (t instanceof BigDecimal) {
            return (T) new Time(TypeUtils.longValue((BigDecimal) t));
        }
        if (t instanceof Number) {
            return (T) new Time(((Number) t).longValue());
        }
        if (!(t instanceof String)) {
            qkq.m176968a("parse error");
            return null;
        }
        String str = (String) t;
        if (str.length() == 0) {
            return null;
        }
        JSONScanner jSONScanner = new JSONScanner(str);
        if (jSONScanner.scanISO8601DateIfMatch()) {
            timeInMillis = jSONScanner.getCalendar().getTimeInMillis();
        } else {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt < '0' || cCharAt > '9') {
                    jSONScanner.close();
                    return (T) Time.valueOf(str);
                }
            }
            timeInMillis = Long.parseLong(str);
        }
        jSONScanner.close();
        return (T) new Time(timeInMillis);
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 2;
    }
}
