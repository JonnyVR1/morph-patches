package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import p149l.riq;

/* JADX INFO: loaded from: classes.dex */
public class CharArrayCodec implements ObjectDeserializer {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T deserialze(DefaultJSONParser defaultJSONParser) {
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() == 4) {
            String strStringVal = jSONLexer.stringVal();
            jSONLexer.nextToken(16);
            return (T) strStringVal.toCharArray();
        }
        if (jSONLexer.token() == 2) {
            Number numberIntegerValue = jSONLexer.integerValue();
            jSONLexer.nextToken(16);
            return (T) numberIntegerValue.toString().toCharArray();
        }
        Object obj = defaultJSONParser.parse();
        if (obj instanceof String) {
            return (T) ((String) obj).toCharArray();
        }
        if (!(obj instanceof Collection)) {
            if (obj == null) {
                return null;
            }
            return (T) JSON.toJSONString(obj).toCharArray();
        }
        Collection collection = (Collection) obj;
        for (Object obj2 : collection) {
            if ((obj2 instanceof String) && ((String) obj2).length() != 1) {
                riq.m179531a("can not cast to char[]");
                return null;
            }
        }
        char[] cArr = new char[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            cArr[i] = ((String) it.next()).charAt(0);
            i++;
        }
        return cArr;
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 4;
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        return (T) deserialze(defaultJSONParser);
    }
}
