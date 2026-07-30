package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public class StringCodec implements ObjectSerializer, ObjectDeserializer {
    public static StringCodec instance = new StringCodec();

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        if (type == StringBuffer.class) {
            JSONLexer jSONLexer = defaultJSONParser.lexer;
            if (jSONLexer.token() == 4) {
                String strStringVal = jSONLexer.stringVal();
                jSONLexer.nextToken(16);
                return (T) new StringBuffer(strStringVal);
            }
            Object obj2 = defaultJSONParser.parse();
            if (obj2 == null) {
                return null;
            }
            return (T) new StringBuffer(obj2.toString());
        }
        if (type != StringBuilder.class) {
            return (T) deserialze(defaultJSONParser);
        }
        JSONLexer jSONLexer2 = defaultJSONParser.lexer;
        if (jSONLexer2.token() == 4) {
            String strStringVal2 = jSONLexer2.stringVal();
            jSONLexer2.nextToken(16);
            return (T) new StringBuilder(strStringVal2);
        }
        Object obj3 = defaultJSONParser.parse();
        if (obj3 == null) {
            return null;
        }
        return (T) new StringBuilder(obj3.toString());
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 4;
    }

    public void write(JSONSerializer jSONSerializer, String str) {
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (str == null) {
            serializeWriter.writeNull(SerializerFeature.WriteNullStringAsEmpty);
        } else {
            serializeWriter.writeString(str);
        }
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i) throws IOException {
        write(jSONSerializer, (String) obj);
    }

    public static <T> T deserialze(DefaultJSONParser defaultJSONParser) {
        JSONLexer lexer = defaultJSONParser.getLexer();
        if (lexer.token() == 4) {
            T t = (T) lexer.stringVal();
            lexer.nextToken(16);
            return t;
        }
        if (lexer.token() == 2) {
            T t2 = (T) lexer.numberString();
            lexer.nextToken(16);
            return t2;
        }
        Object obj = defaultJSONParser.parse();
        if (obj == null) {
            return null;
        }
        return (T) obj.toString();
    }
}
