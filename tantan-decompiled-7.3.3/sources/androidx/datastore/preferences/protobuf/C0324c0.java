package androidx.datastore.preferences.protobuf;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import p153l.uri0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0324c0 {
    /* JADX INFO: renamed from: a */
    public static final String m1822a(String str) {
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
    public static boolean m1823b(Object obj) {
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
        if (obj instanceof InterfaceC0322b0) {
            return obj == ((InterfaceC0322b0) obj).getDefaultInstanceForType();
        }
        return (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    /* JADX INFO: renamed from: c */
    public static final void m1824c(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m1824c(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m1824c(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(uri0.m197614c((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(uri0.m197612a((ByteString) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            m1825d((GeneratedMessageLite) obj, sb, i + 2);
            sb.append(SignParameters.NEW_LINE);
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i + 2;
        m1824c(sb, i4, Constants.KEY_KEY, entry.getKey());
        m1824c(sb, i4, "value", entry.getValue());
        sb.append(SignParameters.NEW_LINE);
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    /* JADX INFO: renamed from: d */
    public static void m1825d(InterfaceC0322b0 interfaceC0322b0, StringBuilder sb, int i) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC0322b0.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strReplaceFirst = str.replaceFirst("get", "");
            boolean zBooleanValue = true;
            if (strReplaceFirst.endsWith("List") && !strReplaceFirst.endsWith("OrBuilderList") && !strReplaceFirst.equals("List")) {
                String str2 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 4);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m1824c(sb, i, m1822a(str2), GeneratedMessageLite.m1627s(method2, interfaceC0322b0, new Object[0]));
                }
            }
            if (strReplaceFirst.endsWith("Map") && !strReplaceFirst.equals("Map")) {
                String str3 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m1824c(sb, i, m1822a(str3), GeneratedMessageLite.m1627s(method3, interfaceC0322b0, new Object[0]));
                }
            }
            if (((Method) map2.get("set".concat(strReplaceFirst))) != null && (!strReplaceFirst.endsWith("Bytes") || !map.containsKey("get".concat(strReplaceFirst.substring(0, strReplaceFirst.length() - 5))))) {
                String str4 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1);
                Method method4 = (Method) map.get("get".concat(strReplaceFirst));
                Method method5 = (Method) map.get("has".concat(strReplaceFirst));
                if (method4 != null) {
                    Object objM1627s = GeneratedMessageLite.m1627s(method4, interfaceC0322b0, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) GeneratedMessageLite.m1627s(method5, interfaceC0322b0, new Object[0])).booleanValue();
                    } else if (m1823b(objM1627s)) {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        m1824c(sb, i, m1822a(str4), objM1627s);
                    }
                }
            }
        }
        if (interfaceC0322b0 instanceof GeneratedMessageLite.AbstractC0295c) {
            Iterator<Map.Entry<T, Object>> itM2314s = ((GeneratedMessageLite.AbstractC0295c) interfaceC0322b0).extensions.m2314s();
            while (itM2314s.hasNext()) {
                Map.Entry entry = (Map.Entry) itM2314s.next();
                m1824c(sb, i, "[" + ((GeneratedMessageLite.C0296d) entry.getKey()).getNumber() + Constants.AES_SUFFIX, entry.getValue());
            }
        }
        C0344m0 c0344m0 = ((GeneratedMessageLite) interfaceC0322b0).unknownFields;
        if (c0344m0 != null) {
            c0344m0.m2273m(sb, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m1826e(InterfaceC0322b0 interfaceC0322b0, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m1825d(interfaceC0322b0, sb, 0);
        return sb.toString();
    }
}
