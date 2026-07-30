package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.util.TypeUtils;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import p149l.kzv;

/* JADX INFO: loaded from: classes.dex */
public class NumberDeserializer implements ObjectDeserializer {
    public static final NumberDeserializer instance = new NumberDeserializer();

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        int i = jSONLexer.token();
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Double.TYPE;
        if (i == 2) {
            if (type == cls3 || type == Double.class) {
                String strNumberString = jSONLexer.numberString();
                jSONLexer.nextToken(16);
                return (T) Double.valueOf(Double.parseDouble(strNumberString));
            }
            long jLongValue = jSONLexer.longValue();
            jSONLexer.nextToken(16);
            if (type == cls2 || type == Short.class) {
                if (jLongValue <= 32767 && jLongValue >= -32768) {
                    return (T) Short.valueOf((short) jLongValue);
                }
                throw new JSONException("short overflow : " + jLongValue);
            }
            if (type != cls && type != Byte.class) {
                return (jLongValue < -2147483648L || jLongValue > 2147483647L) ? (T) Long.valueOf(jLongValue) : (T) Integer.valueOf((int) jLongValue);
            }
            if (jLongValue <= 127 && jLongValue >= -128) {
                return (T) Byte.valueOf((byte) jLongValue);
            }
            throw new JSONException("short overflow : " + jLongValue);
        }
        if (jSONLexer.token() == 3) {
            if (type == cls3 || type == Double.class) {
                String strNumberString2 = jSONLexer.numberString();
                jSONLexer.nextToken(16);
                return (T) Double.valueOf(Double.parseDouble(strNumberString2));
            }
            if (type == cls2 || type == Short.class) {
                BigDecimal bigDecimalDecimalValue = jSONLexer.decimalValue();
                jSONLexer.nextToken(16);
                return (T) Short.valueOf(TypeUtils.shortValue(bigDecimalDecimalValue));
            }
            if (type == cls || type == Byte.class) {
                BigDecimal bigDecimalDecimalValue2 = jSONLexer.decimalValue();
                jSONLexer.nextToken(16);
                return (T) Byte.valueOf(TypeUtils.byteValue(bigDecimalDecimalValue2));
            }
            T t = (T) jSONLexer.decimalValue();
            jSONLexer.nextToken(16);
            return t;
        }
        if (jSONLexer.token() == 18 && "NaN".equals(jSONLexer.stringVal())) {
            jSONLexer.nextToken();
            if (type == Double.class) {
                return (T) Double.valueOf(Double.NaN);
            }
            if (type == Float.class) {
                return (T) Float.valueOf(Float.NaN);
            }
            return null;
        }
        Object obj2 = defaultJSONParser.parse();
        if (obj2 == null) {
            return null;
        }
        if (type == cls3 || type == Double.class) {
            try {
                return (T) TypeUtils.castToDouble(obj2);
            } catch (Exception e) {
                kzv.m147955a("parseDouble error, field : ", obj, e);
                return null;
            }
        }
        if (type == cls2 || type == Short.class) {
            try {
                return (T) TypeUtils.castToShort(obj2);
            } catch (Exception e2) {
                kzv.m147955a("parseShort error, field : ", obj, e2);
                return null;
            }
        }
        if (type != cls && type != Byte.class) {
            return (T) TypeUtils.castToBigDecimal(obj2);
        }
        try {
            return (T) TypeUtils.castToByte(obj2);
        } catch (Exception e3) {
            kzv.m147955a("parseByte error, field : ", obj, e3);
            return null;
        }
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 2;
    }
}
