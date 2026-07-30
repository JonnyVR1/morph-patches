package com.alibaba.fastjson.support.hsf;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.SymbolTable;
import com.alibaba.fastjson.util.TypeUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public class HSFJSONUtils {
    static final SymbolTable typeSymbolTable = new SymbolTable(1024);
    static final char[] fieldName_argsTypes = "\"argsTypes\"".toCharArray();
    static final char[] fieldName_argsObjs = "\"argsObjs\"".toCharArray();
    static final char[] fieldName_type = "\"@type\":".toCharArray();

    public static Object[] parseInvocationArguments(String str, MethodLocator methodLocator) {
        DefaultJSONParser defaultJSONParser = new DefaultJSONParser(str);
        JSONLexerBase jSONLexerBase = (JSONLexerBase) defaultJSONParser.getLexer();
        Object[] objArr = null;
        ParseContext context = defaultJSONParser.setContext(null, null);
        int i = jSONLexerBase.token();
        int i2 = 0;
        if (i != 12) {
            if (i != 14) {
                return null;
            }
            String[] strArrScanFieldStringArray = jSONLexerBase.scanFieldStringArray(null, -1, typeSymbolTable);
            jSONLexerBase.skipWhitespace();
            char current = jSONLexerBase.getCurrent();
            if (current != ']') {
                if (current == ',') {
                    jSONLexerBase.next();
                    jSONLexerBase.skipWhitespace();
                }
                jSONLexerBase.nextToken(14);
                Object[] array = defaultJSONParser.parseArray(methodLocator.findMethod(strArrScanFieldStringArray).getGenericParameterTypes());
                jSONLexerBase.close();
                return array;
            }
            Type[] genericParameterTypes = methodLocator.findMethod(null).getGenericParameterTypes();
            Object[] objArr2 = new Object[strArrScanFieldStringArray.length];
            while (i2 < strArrScanFieldStringArray.length) {
                Type type = genericParameterTypes[i2];
                String str2 = strArrScanFieldStringArray[i2];
                if (type != String.class) {
                    objArr2[i2] = TypeUtils.cast(str2, type, defaultJSONParser.getConfig());
                } else {
                    objArr2[i2] = str2;
                }
                i2++;
            }
            return objArr2;
        }
        char[] cArr = fieldName_argsTypes;
        SymbolTable symbolTable = typeSymbolTable;
        String[] strArrScanFieldStringArray2 = jSONLexerBase.scanFieldStringArray(cArr, -1, symbolTable);
        if (strArrScanFieldStringArray2 == null && jSONLexerBase.matchStat == -2 && "com.alibaba.fastjson.JSONObject".equals(jSONLexerBase.scanFieldString(fieldName_type))) {
            strArrScanFieldStringArray2 = jSONLexerBase.scanFieldStringArray(cArr, -1, symbolTable);
        }
        Method methodFindMethod = methodLocator.findMethod(strArrScanFieldStringArray2);
        if (methodFindMethod == null) {
            jSONLexerBase.close();
            JSONObject object = JSON.parseObject(str);
            Method methodFindMethod2 = methodLocator.findMethod((String[]) object.getObject("argsTypes", String[].class));
            JSONArray jSONArray = object.getJSONArray("argsObjs");
            if (jSONArray == null) {
                return null;
            }
            Type[] genericParameterTypes2 = methodFindMethod2.getGenericParameterTypes();
            Object[] objArr3 = new Object[genericParameterTypes2.length];
            while (i2 < genericParameterTypes2.length) {
                objArr3[i2] = jSONArray.getObject(i2, genericParameterTypes2[i2]);
                i2++;
            }
            return objArr3;
        }
        Type[] genericParameterTypes3 = methodFindMethod.getGenericParameterTypes();
        jSONLexerBase.skipWhitespace();
        if (jSONLexerBase.getCurrent() == ',') {
            jSONLexerBase.next();
        }
        if (jSONLexerBase.matchField2(fieldName_argsObjs)) {
            jSONLexerBase.nextToken();
            ParseContext context2 = defaultJSONParser.setContext(context, null, "argsObjs");
            Object[] array2 = defaultJSONParser.parseArray(genericParameterTypes3);
            context2.object = array2;
            defaultJSONParser.accept(13);
            defaultJSONParser.handleResovleTask(null);
            objArr = array2;
        }
        defaultJSONParser.close();
        return objArr;
    }
}
