package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONToken;
import com.p046p1.mobile.putong.core.data.IntlPayMethod;
import com.vivo.push.PushClientConstants;
import java.lang.reflect.Type;
import p149l.riq;
import p149l.siq;
import p149l.xiq;

/* JADX INFO: loaded from: classes.dex */
public class StackTraceElementDeserializer implements ObjectDeserializer {
    public static final StackTraceElementDeserializer instance = new StackTraceElementDeserializer();

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() == 8) {
            jSONLexer.nextToken();
            return null;
        }
        if (jSONLexer.token() != 12 && jSONLexer.token() != 16) {
            xiq.m209674a("syntax error: ", JSONToken.name(jSONLexer.token()));
            return null;
        }
        int iIntValue = 0;
        String strStringVal = null;
        String strStringVal2 = null;
        String strStringVal3 = null;
        while (true) {
            String strScanSymbol = jSONLexer.scanSymbol(defaultJSONParser.getSymbolTable());
            if (strScanSymbol == null) {
                if (jSONLexer.token() == 13) {
                    jSONLexer.nextToken(16);
                    break;
                }
                if (jSONLexer.token() != 16 || !jSONLexer.isEnabled(Feature.AllowArbitraryCommas)) {
                }
            }
            jSONLexer.nextTokenWithColon(4);
            if (PushClientConstants.TAG_CLASS_NAME.equals(strScanSymbol)) {
                if (jSONLexer.token() == 8) {
                    strStringVal = null;
                } else {
                    if (jSONLexer.token() != 4) {
                        riq.m179531a("syntax error");
                        return null;
                    }
                    strStringVal = jSONLexer.stringVal();
                }
            } else if ("methodName".equals(strScanSymbol)) {
                if (jSONLexer.token() == 8) {
                    strStringVal2 = null;
                } else {
                    if (jSONLexer.token() != 4) {
                        riq.m179531a("syntax error");
                        return null;
                    }
                    strStringVal2 = jSONLexer.stringVal();
                }
            } else if ("fileName".equals(strScanSymbol)) {
                if (jSONLexer.token() == 8) {
                    strStringVal3 = null;
                } else {
                    if (jSONLexer.token() != 4) {
                        riq.m179531a("syntax error");
                        return null;
                    }
                    strStringVal3 = jSONLexer.stringVal();
                }
            } else if ("lineNumber".equals(strScanSymbol)) {
                if (jSONLexer.token() == 8) {
                    iIntValue = 0;
                } else {
                    if (jSONLexer.token() != 2) {
                        riq.m179531a("syntax error");
                        return null;
                    }
                    iIntValue = jSONLexer.intValue();
                }
            } else if (IntlPayMethod.nativeMethod.equals(strScanSymbol)) {
                if (jSONLexer.token() != 8 && jSONLexer.token() != 6 && jSONLexer.token() != 7) {
                    riq.m179531a("syntax error");
                    return null;
                }
                jSONLexer.nextToken(16);
            } else if (strScanSymbol == JSON.DEFAULT_TYPE_KEY) {
                if (jSONLexer.token() == 4) {
                    String strStringVal4 = jSONLexer.stringVal();
                    if (!strStringVal4.equals("java.lang.StackTraceElement")) {
                        riq.m179531a("syntax error : ".concat(strStringVal4));
                        return null;
                    }
                } else if (jSONLexer.token() != 8) {
                    riq.m179531a("syntax error");
                    return null;
                }
            } else if ("moduleName".equals(strScanSymbol)) {
                if (jSONLexer.token() != 8) {
                    if (jSONLexer.token() != 4) {
                        riq.m179531a("syntax error");
                        return null;
                    }
                    jSONLexer.stringVal();
                }
            } else if ("moduleVersion".equals(strScanSymbol)) {
                if (jSONLexer.token() != 8) {
                    if (jSONLexer.token() != 4) {
                        riq.m179531a("syntax error");
                        return null;
                    }
                    jSONLexer.stringVal();
                }
            } else {
                if (!"classLoaderName".equals(strScanSymbol)) {
                    siq.m184351a("syntax error : ", strScanSymbol);
                    return null;
                }
                if (jSONLexer.token() != 8) {
                    if (jSONLexer.token() != 4) {
                        riq.m179531a("syntax error");
                        return null;
                    }
                    jSONLexer.stringVal();
                }
            }
            if (jSONLexer.token() == 13) {
                jSONLexer.nextToken(16);
                break;
            }
        }
        return (T) new StackTraceElement(strStringVal, strStringVal2, strStringVal3, iIntValue);
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 12;
    }
}
