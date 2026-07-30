package com.alibaba.fastjson.asm;

import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.util.ASMUtils;
import com.meituan.robust.Constants;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import p149l.b2s;
import p149l.j6f;

/* JADX INFO: loaded from: classes.dex */
public class TypeCollector {
    private static String JSONType = ASMUtils.desc((Class<?>) JSONType.class);
    private static final Map<String, String> primitives = new HashMap<String, String>() { // from class: com.alibaba.fastjson.asm.TypeCollector.1
        {
            put(Constants.INT, "I");
            put(Constants.BOOLEAN, "Z");
            put(Constants.BYTE, "B");
            put(Constants.CHAR, b2s.C_ZONE);
            put(Constants.SHORT, j6f.LATITUDE_SOUTH);
            put(Constants.FLOAT, "F");
            put(Constants.LONG, "J");
            put(Constants.DOUBLE, "D");
        }
    };
    protected MethodCollector collector = null;
    protected boolean jsonType;
    private final String methodName;
    private final Class<?>[] parameterTypes;

    public TypeCollector(String str, Class<?>[] clsArr) {
        this.methodName = str;
        this.parameterTypes = clsArr;
    }

    private boolean correctTypeName(Type type, String str) {
        String className = type.getClassName();
        String strConcat = "";
        while (className.endsWith(WeJson.EMPTY_ARR)) {
            strConcat = strConcat.concat("[");
            className = className.substring(0, className.length() - 2);
        }
        if (!strConcat.equals("")) {
            Map<String, String> map = primitives;
            if (map.containsKey(className)) {
                className = strConcat + map.get(className);
            } else {
                className = strConcat + "L" + className + Constants.PACKNAME_END;
            }
        }
        return className.equals(str);
    }

    public String[] getParameterNamesForMethod() {
        MethodCollector methodCollector = this.collector;
        return (methodCollector == null || !methodCollector.debugInfoPresent) ? new String[0] : methodCollector.getResult().split(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
    }

    public boolean hasJsonType() {
        return this.jsonType;
    }

    public boolean matched() {
        return this.collector != null;
    }

    public void visitAnnotation(String str) {
        if (JSONType.equals(str)) {
            this.jsonType = true;
        }
    }

    public MethodCollector visitMethod(int i, String str, String str2) {
        if (this.collector != null || !str.equals(this.methodName)) {
            return null;
        }
        Type[] argumentTypes = Type.getArgumentTypes(str2);
        int i2 = 0;
        for (Type type : argumentTypes) {
            String className = type.getClassName();
            if (className.equals(Constants.LONG) || className.equals(Constants.DOUBLE)) {
                i2++;
            }
        }
        if (argumentTypes.length != this.parameterTypes.length) {
            return null;
        }
        for (int i3 = 0; i3 < argumentTypes.length; i3++) {
            if (!correctTypeName(argumentTypes[i3], this.parameterTypes[i3].getName())) {
                return null;
            }
        }
        MethodCollector methodCollector = new MethodCollector(!Modifier.isStatic(i) ? 1 : 0, argumentTypes.length + i2);
        this.collector = methodCollector;
        return methodCollector;
    }
}
