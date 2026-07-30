package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import p149l.piq;

/* JADX INFO: loaded from: classes.dex */
public class EnumDeserializer implements ObjectDeserializer {
    protected final Class<?> enumClass;
    protected long[] enumNameHashCodes;
    protected final Enum[] enums;
    protected final Enum[] ordinalEnums;

    public EnumDeserializer(Class<?> cls) {
        JSONField jSONField;
        this.enumClass = cls;
        this.ordinalEnums = (Enum[]) cls.getEnumConstants();
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            Enum[] enumArr = this.ordinalEnums;
            if (i >= enumArr.length) {
                break;
            }
            Enum r5 = enumArr[i];
            String strName = r5.name();
            JSONField jSONField2 = null;
            try {
                jSONField = (JSONField) TypeUtils.getAnnotation(cls.getField(strName), JSONField.class);
                if (jSONField != null) {
                    try {
                        String strName2 = jSONField.name();
                        if (strName2 != null && strName2.length() > 0) {
                            strName = strName2;
                        }
                    } catch (Exception unused) {
                        jSONField2 = jSONField;
                        jSONField = jSONField2;
                    }
                }
            } catch (Exception unused2) {
            }
            int i2 = 0;
            long j = -3750763034362895579L;
            long j2 = -3750763034362895579L;
            while (i2 < strName.length()) {
                int iCharAt = strName.charAt(i2);
                int i3 = i;
                long j3 = ((long) iCharAt) ^ j;
                if (iCharAt >= 65 && iCharAt <= 90) {
                    iCharAt += 32;
                }
                j2 = (((long) iCharAt) ^ j2) * 1099511628211L;
                i2++;
                j = j3 * 1099511628211L;
                i = i3;
            }
            int i4 = i;
            map.put(Long.valueOf(j), r5);
            if (j != j2) {
                map.put(Long.valueOf(j2), r5);
            }
            if (jSONField != null) {
                for (String str : jSONField.alternateNames()) {
                    long jCharAt = -3750763034362895579L;
                    for (int i5 = 0; i5 < str.length(); i5++) {
                        jCharAt = (jCharAt ^ ((long) str.charAt(i5))) * 1099511628211L;
                    }
                    if (jCharAt != j && jCharAt != j2) {
                        map.put(Long.valueOf(jCharAt), r5);
                    }
                }
            }
            i = i4 + 1;
        }
        this.enumNameHashCodes = new long[map.size()];
        Iterator it = map.keySet().iterator();
        int i6 = 0;
        while (it.hasNext()) {
            this.enumNameHashCodes[i6] = ((Long) it.next()).longValue();
            i6++;
        }
        Arrays.sort(this.enumNameHashCodes);
        this.enums = new Enum[this.enumNameHashCodes.length];
        int i7 = 0;
        while (true) {
            long[] jArr = this.enumNameHashCodes;
            if (i7 >= jArr.length) {
                return;
            }
            this.enums[i7] = (Enum) map.get(Long.valueOf(jArr[i7]));
            i7++;
        }
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        try {
            JSONLexer jSONLexer = defaultJSONParser.lexer;
            int i = jSONLexer.token();
            if (i == 2) {
                int iIntValue = jSONLexer.intValue();
                jSONLexer.nextToken(16);
                if (iIntValue >= 0) {
                    Object[] objArr = this.ordinalEnums;
                    if (iIntValue <= objArr.length) {
                        return (T) objArr[iIntValue];
                    }
                }
                throw new JSONException("parse enum " + this.enumClass.getName() + " error, value : " + iIntValue);
            }
            if (i != 4) {
                if (i == 8) {
                    jSONLexer.nextToken(16);
                    return null;
                }
                throw new JSONException("parse enum " + this.enumClass.getName() + " error, value : " + defaultJSONParser.parse());
            }
            String strStringVal = jSONLexer.stringVal();
            jSONLexer.nextToken(16);
            if (strStringVal.length() == 0) {
                return null;
            }
            long j = -3750763034362895579L;
            long j2 = -3750763034362895579L;
            for (int i2 = 0; i2 < strStringVal.length(); i2++) {
                int iCharAt = strStringVal.charAt(i2);
                long j3 = j ^ ((long) iCharAt);
                if (iCharAt >= 65 && iCharAt <= 90) {
                    iCharAt += 32;
                }
                j = j3 * 1099511628211L;
                j2 = (j2 ^ ((long) iCharAt)) * 1099511628211L;
            }
            T t = (T) getEnumByHashCode(j);
            if (t == null && j2 != j) {
                t = (T) getEnumByHashCode(j2);
            }
            if (t == null && jSONLexer.isEnabled(Feature.ErrorOnEnumNotMatch)) {
                throw new JSONException("not match enum value, " + this.enumClass.getName() + " : " + strStringVal);
            }
            return t;
        } catch (JSONException e) {
            throw e;
        } catch (Exception e2) {
            piq.m169752a(e2.getMessage(), e2);
            return null;
        }
    }

    public Enum getEnumByHashCode(long j) {
        int iBinarySearch;
        if (this.enums != null && (iBinarySearch = Arrays.binarySearch(this.enumNameHashCodes, j)) >= 0) {
            return this.enums[iBinarySearch];
        }
        return null;
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 2;
    }

    public Enum<?> valueOf(int i) {
        return this.ordinalEnums[i];
    }
}
