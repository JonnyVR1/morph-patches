package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.TypeUtils;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import p149l.kzv;

/* JADX INFO: loaded from: classes.dex */
public class FloatCodec implements ObjectSerializer, ObjectDeserializer {
    public static FloatCodec instance = new FloatCodec();
    private NumberFormat decimalFormat;

    public FloatCodec(String str) {
        this(new DecimalFormat(str));
    }

    public static <T> T deserialze(DefaultJSONParser defaultJSONParser) {
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() == 2) {
            String strNumberString = jSONLexer.numberString();
            jSONLexer.nextToken(16);
            return (T) Float.valueOf(Float.parseFloat(strNumberString));
        }
        if (jSONLexer.token() == 3) {
            float fFloatValue = jSONLexer.floatValue();
            jSONLexer.nextToken(16);
            return (T) Float.valueOf(fFloatValue);
        }
        Object obj = defaultJSONParser.parse();
        if (obj == null) {
            return null;
        }
        return (T) TypeUtils.castToFloat(obj);
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
        float fFloatValue = ((Float) obj).floatValue();
        NumberFormat numberFormat = this.decimalFormat;
        if (numberFormat != null) {
            serializeWriter.write(numberFormat.format(fFloatValue));
        } else {
            serializeWriter.writeFloat(fFloatValue, true);
        }
    }

    public FloatCodec(DecimalFormat decimalFormat) {
        this.decimalFormat = decimalFormat;
    }

    public FloatCodec() {
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        try {
            return (T) deserialze(defaultJSONParser);
        } catch (Exception e) {
            kzv.m147955a("parseLong error, field : ", obj, e);
            return null;
        }
    }
}
