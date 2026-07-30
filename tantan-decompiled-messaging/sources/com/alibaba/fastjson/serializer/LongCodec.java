package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.TypeUtils;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p149l.kzv;

/* JADX INFO: loaded from: classes.dex */
public class LongCodec implements ObjectSerializer, ObjectDeserializer {
    public static LongCodec instance = new LongCodec();

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        Object objCastToLong;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        try {
            int i = jSONLexer.token();
            if (i == 2) {
                long jLongValue = jSONLexer.longValue();
                jSONLexer.nextToken(16);
                objCastToLong = (T) Long.valueOf(jLongValue);
            } else if (i == 3) {
                Object objValueOf = Long.valueOf(TypeUtils.longValue(jSONLexer.decimalValue()));
                jSONLexer.nextToken(16);
                objCastToLong = (T) objValueOf;
            } else {
                if (i == 12) {
                    JSONObject jSONObject = new JSONObject(true);
                    defaultJSONParser.parseObject((Map) jSONObject);
                    objCastToLong = (T) TypeUtils.castToLong(jSONObject);
                } else {
                    objCastToLong = TypeUtils.castToLong(defaultJSONParser.parse());
                }
                if (objCastToLong == null) {
                    return null;
                }
            }
            return type == AtomicLong.class ? (T) new AtomicLong(((Long) objCastToLong).longValue()) : (T) objCastToLong;
        } catch (Exception e) {
            kzv.m147955a("parseLong error, field : ", obj, e);
            return null;
        }
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 2;
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i) throws IOException {
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (obj == null) {
            serializeWriter.writeNull(SerializerFeature.WriteNullNumberAsZero);
            return;
        }
        long jLongValue = ((Long) obj).longValue();
        serializeWriter.writeLong(jLongValue);
        if (!serializeWriter.isEnabled(SerializerFeature.WriteClassName) || jLongValue > 2147483647L || jLongValue < -2147483648L || type == Long.class || type == Long.TYPE) {
            return;
        }
        serializeWriter.write(76);
    }
}
