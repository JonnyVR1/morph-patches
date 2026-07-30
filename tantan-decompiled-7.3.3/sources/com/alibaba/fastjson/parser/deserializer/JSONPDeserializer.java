package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.JSONPObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexerBase;
import java.lang.reflect.Type;
import p153l.wkq;

/* JADX INFO: loaded from: classes.dex */
public class JSONPDeserializer implements ObjectDeserializer {
    public static final JSONPDeserializer instance = new JSONPDeserializer();

    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.alibaba.fastjson.JSONPObject] */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        int i;
        JSONLexerBase jSONLexerBase = (JSONLexerBase) defaultJSONParser.getLexer();
        String strScanSymbolUnQuoted = jSONLexerBase.scanSymbolUnQuoted(defaultJSONParser.getSymbolTable());
        jSONLexerBase.nextToken();
        int i2 = jSONLexerBase.token();
        if (i2 == 25) {
            String str = strScanSymbolUnQuoted + ".";
            strScanSymbolUnQuoted = str + jSONLexerBase.scanSymbolUnQuoted(defaultJSONParser.getSymbolTable());
            jSONLexerBase.nextToken();
            i2 = jSONLexerBase.token();
        }
        ?? r0 = (T) new JSONPObject(strScanSymbolUnQuoted);
        if (i2 != 10) {
            wkq.m206856a("illegal jsonp : ", jSONLexerBase.info());
            return null;
        }
        jSONLexerBase.nextToken();
        while (true) {
            r0.addParameter(defaultJSONParser.parse());
            i = jSONLexerBase.token();
            if (i != 16) {
                break;
            }
            jSONLexerBase.nextToken();
        }
        if (i != 11) {
            wkq.m206856a("illegal jsonp : ", jSONLexerBase.info());
            return null;
        }
        jSONLexerBase.nextToken();
        if (jSONLexerBase.token() == 24) {
            jSONLexerBase.nextToken();
        }
        return r0;
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 0;
    }
}
