package com.google.protobuf;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import p149l.bpj0;
import p149l.tii0;

/* JADX INFO: renamed from: com.google.protobuf.r */
/* JADX INFO: loaded from: classes7.dex */
public final class C3420r {
    /* JADX INFO: renamed from: a */
    public static final String m17282a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m17283b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue() == 0.0f;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        if (obj instanceof String) {
            return obj.equals("");
        }
        if (obj instanceof ByteString) {
            return obj.equals(ByteString.EMPTY);
        }
        if (obj instanceof InterfaceC3419q) {
            return obj == ((InterfaceC3419q) obj).getDefaultInstanceForType();
        }
        return (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    /* JADX INFO: renamed from: c */
    public static final void m17284c(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m17284c(sb, i, str, it.next());
            }
            return;
        }
        sb.append('\n');
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(tii0.m189201c((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(tii0.m189199a((ByteString) obj));
            sb.append('\"');
        } else {
            if (!(obj instanceof GeneratedMessageLite)) {
                sb.append(": ");
                sb.append(obj.toString());
                return;
            }
            sb.append(" {");
            m17285d((GeneratedMessageLite) obj, sb, i + 2);
            sb.append(SignParameters.NEW_LINE);
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append("}");
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m17285d(InterfaceC3419q interfaceC3419q, StringBuilder sb, int i) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : interfaceC3419q.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String strReplaceFirst = ((String) it.next()).replaceFirst("get", "");
            boolean zBooleanValue = true;
            if (strReplaceFirst.endsWith("List") && !strReplaceFirst.endsWith("OrBuilderList")) {
                String str = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 4);
                Method method2 = (Method) map.get("get".concat(strReplaceFirst));
                if (method2 != null) {
                    m17284c(sb, i, m17282a(str), GeneratedMessageLite.invokeOrDie(method2, interfaceC3419q, new Object[0]));
                }
            }
            if (((Method) map2.get("set".concat(strReplaceFirst))) != null && (!strReplaceFirst.endsWith("Bytes") || !map.containsKey("get".concat(strReplaceFirst.substring(0, strReplaceFirst.length() - 5))))) {
                String str2 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1);
                Method method3 = (Method) map.get("get".concat(strReplaceFirst));
                Method method4 = (Method) map.get("has".concat(strReplaceFirst));
                if (method3 != null) {
                    Object objInvokeOrDie = GeneratedMessageLite.invokeOrDie(method3, interfaceC3419q, new Object[0]);
                    if (method4 != null) {
                        zBooleanValue = ((Boolean) GeneratedMessageLite.invokeOrDie(method4, interfaceC3419q, new Object[0])).booleanValue();
                    } else if (m17283b(objInvokeOrDie)) {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        m17284c(sb, i, m17282a(str2), objInvokeOrDie);
                    }
                }
            }
        }
        if (interfaceC3419q instanceof GeneratedMessageLite.ExtendableMessage) {
            Iterator<Map.Entry<FieldDescriptorType, Object>> itM17183r = ((GeneratedMessageLite.ExtendableMessage) interfaceC3419q).extensions.m17183r();
            while (itM17183r.hasNext()) {
                Map.Entry entry = (Map.Entry) itM17183r.next();
                m17284c(sb, i, "[" + ((GeneratedMessageLite.C3382d) entry.getKey()).getNumber() + Constants.AES_SUFFIX, entry.getValue());
            }
        }
        bpj0 bpj0Var = ((GeneratedMessageLite) interfaceC3419q).unknownFields;
        if (bpj0Var != null) {
            bpj0Var.m103077k(sb, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m17286e(InterfaceC3419q interfaceC3419q, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m17285d(interfaceC3419q, sb, 0);
        return sb.toString();
    }
}
