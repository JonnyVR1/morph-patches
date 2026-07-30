package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.TypeUtils;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class BigIntegerCodec implements ObjectSerializer, ObjectDeserializer {
    private static final BigInteger LOW = BigInteger.valueOf(-9007199254740991L);
    private static final BigInteger HIGH = BigInteger.valueOf(9007199254740991L);
    public static final BigIntegerCodec instance = new BigIntegerCodec();

    public static <T> T deserialze(DefaultJSONParser defaultJSONParser) {
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() == 2) {
            String strNumberString = jSONLexer.numberString();
            jSONLexer.nextToken(16);
            return (T) new BigInteger(strNumberString);
        }
        Object obj = defaultJSONParser.parse();
        if (obj == null) {
            return null;
        }
        return (T) TypeUtils.castToBigInteger(obj);
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
        BigInteger bigInteger = (BigInteger) obj;
        String string = bigInteger.toString();
        if (string.length() < 16 || !SerializerFeature.isEnabled(i, serializeWriter.features, SerializerFeature.BrowserCompatible) || (bigInteger.compareTo(LOW) >= 0 && bigInteger.compareTo(HIGH) <= 0)) {
            serializeWriter.write(string);
        } else {
            serializeWriter.writeString(string);
        }
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        return (T) deserialze(defaultJSONParser);
    }
}
