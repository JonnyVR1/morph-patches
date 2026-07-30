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
import p149l.g0y0;
import p149l.q5y0;
import p149l.y5y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2351v0 {

    /* JADX INFO: renamed from: a */
    public static final char[] f10271a;

    static {
        char[] cArr = new char[80];
        f10271a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static String m14410a(g0y0 g0y0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m14413d(g0y0Var, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static void m14411b(int i, StringBuilder sb) {
        while (i > 0) {
            char[] cArr = f10271a;
            int length = i > cArr.length ? cArr.length : i;
            sb.append(cArr, 0, length);
            i -= length;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m14412c(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m14412c(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m14412c(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m14411b(i, sb);
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
            sb.append(q5y0.m173104a(zzik.zza((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzik) {
            sb.append(": \"");
            sb.append(q5y0.m173104a((zzik) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC2349u0) {
            sb.append(" {");
            m14413d((AbstractC2349u0) obj, sb, i + 2);
            sb.append(SignParameters.NEW_LINE);
            m14411b(i, sb);
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
        m14412c(sb, i3, Constants.KEY_KEY, entry.getKey());
        m14412c(sb, i3, "value", entry.getValue());
        sb.append(SignParameters.NEW_LINE);
        m14411b(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0180  */
    /* JADX WARN: Code duplicated, block: B:67:0x0183  */
    /* JADX INFO: renamed from: d */
    public static void m14413d(g0y0 g0y0Var, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = g0y0Var.getClass().getDeclaredMethods();
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
                    m14412c(sb, i, strSubstring.substring(0, strSubstring.length() - 4), AbstractC2349u0.m14344l(method2, g0y0Var, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m14412c(sb, i, strSubstring.substring(0, strSubstring.length() - 3), AbstractC2349u0.m14344l(method, g0y0Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM14344l = AbstractC2349u0.m14344l(method4, g0y0Var, new Object[0]);
                    if (method5 == null) {
                        zBooleanValue = true;
                        if (objM14344l instanceof Boolean) {
                            if (((Boolean) objM14344l).booleanValue()) {
                                zEquals = false;
                            } else {
                                zEquals = true;
                            }
                        } else if (objM14344l instanceof Integer) {
                            if (((Integer) objM14344l).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM14344l instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objM14344l).floatValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM14344l instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) objM14344l).doubleValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM14344l instanceof String) {
                            zEquals = objM14344l.equals("");
                        } else if (objM14344l instanceof zzik) {
                            zEquals = objM14344l.equals(zzik.zza);
                        } else if (!(objM14344l instanceof g0y0) ? !((objM14344l instanceof Enum) && ((Enum) objM14344l).ordinal() == 0) : objM14344l != ((g0y0) objM14344l).mo14359b()) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) AbstractC2349u0.m14344l(method5, g0y0Var, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        m14412c(sb, i, strSubstring, objM14344l);
                    }
                }
            }
            i2 = i3;
        }
        if (g0y0Var instanceof AbstractC2349u0.d) {
            Iterator<Map.Entry<T, Object>> itM171089p = ((AbstractC2349u0.d) g0y0Var).zzc.m171089p();
            if (itM171089p.hasNext()) {
                throw new NoSuchMethodError();
            }
        }
        y5y0 y5y0Var = ((AbstractC2349u0) g0y0Var).zzb;
        if (y5y0Var != null) {
            y5y0Var.m213029g(sb, i);
        }
    }
}
