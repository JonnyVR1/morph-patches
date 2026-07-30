package com.google.android.gms.internal.measurement;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p153l.efy0;
import p153l.m9y0;
import p153l.wey0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2374v0 {

    /* JADX INFO: renamed from: a */
    public static final char[] f10308a;

    static {
        char[] cArr = new char[80];
        f10308a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static String m14464a(m9y0 m9y0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m14467d(m9y0Var, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static void m14465b(int i, StringBuilder sb) {
        while (i > 0) {
            char[] cArr = f10308a;
            int length = i > cArr.length ? cArr.length : i;
            sb.append(cArr, 0, length);
            i -= length;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m14466c(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m14466c(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m14466c(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m14465b(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(wey0.m206040a(zzik.zza((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzik) {
            sb.append(": \"");
            sb.append(wey0.m206040a((zzik) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC2372u0) {
            sb.append(" {");
            m14467d((AbstractC2372u0) obj, sb, i + 2);
            sb.append(SignParameters.NEW_LINE);
            m14465b(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        m14466c(sb, i3, Constants.KEY_KEY, entry.getKey());
        m14466c(sb, i3, "value", entry.getValue());
        sb.append(SignParameters.NEW_LINE);
        m14465b(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0180  */
    /* JADX WARN: Code duplicated, block: B:67:0x0183  */
    /* JADX INFO: renamed from: d */
    public static void m14467d(m9y0 m9y0Var, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = m9y0Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    m14466c(sb, i, strSubstring.substring(0, strSubstring.length() - 4), AbstractC2372u0.m14398l(method2, m9y0Var, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m14466c(sb, i, strSubstring.substring(0, strSubstring.length() - 3), AbstractC2372u0.m14398l(method, m9y0Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM14398l = AbstractC2372u0.m14398l(method4, m9y0Var, new Object[0]);
                    if (method5 == null) {
                        zBooleanValue = true;
                        if (objM14398l instanceof Boolean) {
                            if (((Boolean) objM14398l).booleanValue()) {
                                zEquals = false;
                            } else {
                                zEquals = true;
                            }
                        } else if (objM14398l instanceof Integer) {
                            if (((Integer) objM14398l).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM14398l instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objM14398l).floatValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM14398l instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) objM14398l).doubleValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM14398l instanceof String) {
                            zEquals = objM14398l.equals("");
                        } else if (objM14398l instanceof zzik) {
                            zEquals = objM14398l.equals(zzik.zza);
                        } else if (!(objM14398l instanceof m9y0) ? !((objM14398l instanceof Enum) && ((Enum) objM14398l).ordinal() == 0) : objM14398l != ((m9y0) objM14398l).mo14413b()) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) AbstractC2372u0.m14398l(method5, m9y0Var, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        m14466c(sb, i, strSubstring, objM14398l);
                    }
                }
            }
            i2 = i3;
        }
        if (m9y0Var instanceof AbstractC2372u0.d) {
            Iterator<Map.Entry<T, Object>> itM198959p = ((AbstractC2372u0.d) m9y0Var).zzc.m198959p();
            if (itM198959p.hasNext()) {
                throw new NoSuchMethodError();
            }
        }
        efy0 efy0Var = ((AbstractC2372u0) m9y0Var).zzb;
        if (efy0Var != null) {
            efy0Var.m120744g(sb, i);
        }
    }
}
