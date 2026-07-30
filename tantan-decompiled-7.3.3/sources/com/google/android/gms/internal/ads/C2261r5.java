package com.google.android.gms.internal.ads;

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
import p153l.fkx0;
import p153l.nlx0;
import p153l.plx0;
import p153l.uhx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2261r5 {

    /* JADX INFO: renamed from: a */
    public static final char[] f10067a;

    static {
        char[] cArr = new char[80];
        f10067a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static String m13287a(fkx0 fkx0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m13290d(fkx0Var, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static void m13288b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m13288b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m13288b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m13289c(i, sb);
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
            sb.append(nlx0.m163784a(zzgyl.zzw((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzgyl) {
            sb.append(": \"");
            sb.append(nlx0.m163784a((zzgyl) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC2245p5) {
            sb.append(" {");
            m13290d((AbstractC2245p5) obj, sb, i + 2);
            sb.append(SignParameters.NEW_LINE);
            m13289c(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        m13288b(sb, i3, Constants.KEY_KEY, entry.getKey());
        m13288b(sb, i3, "value", entry.getValue());
        sb.append(SignParameters.NEW_LINE);
        m13289c(i, sb);
        sb.append("}");
    }

    /* JADX INFO: renamed from: c */
    public static void m13289c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f10067a, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f6  */
    /* JADX INFO: renamed from: d */
    public static void m13290d(fkx0 fkx0Var, StringBuilder sb, int i) {
        int i2;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = fkx0Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
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
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                m13288b(sb, i, strSubstring.substring(0, strSubstring.length() - 4), AbstractC2245p5.m13228y(method2, fkx0Var, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m13288b(sb, i, strSubstring.substring(0, strSubstring.length() - 3), AbstractC2245p5.m13228y(method, fkx0Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM13228y = AbstractC2245p5.m13228y(method4, fkx0Var, new Object[0]);
                    if (method5 == null) {
                        if (objM13228y instanceof Boolean) {
                            if (((Boolean) objM13228y).booleanValue()) {
                                m13288b(sb, i, strSubstring, objM13228y);
                            }
                        } else if (objM13228y instanceof Integer) {
                            if (((Integer) objM13228y).intValue() != 0) {
                                m13288b(sb, i, strSubstring, objM13228y);
                            }
                        } else if (objM13228y instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objM13228y).floatValue()) != 0) {
                                m13288b(sb, i, strSubstring, objM13228y);
                            }
                        } else if (!(objM13228y instanceof Double)) {
                            if (objM13228y instanceof String) {
                                zEquals = objM13228y.equals("");
                            } else if (objM13228y instanceof zzgyl) {
                                zEquals = objM13228y.equals(zzgyl.zzb);
                            } else if (objM13228y instanceof fkx0) {
                                if (objM13228y != ((fkx0) objM13228y).mo13236a()) {
                                    m13288b(sb, i, strSubstring, objM13228y);
                                }
                            } else if (!(objM13228y instanceof Enum) || ((Enum) objM13228y).ordinal() != 0) {
                                m13288b(sb, i, strSubstring, objM13228y);
                            }
                            if (!zEquals) {
                                m13288b(sb, i, strSubstring, objM13228y);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objM13228y).doubleValue()) != 0) {
                            m13288b(sb, i, strSubstring, objM13228y);
                        }
                    } else if (((Boolean) AbstractC2245p5.m13228y(method5, fkx0Var, new Object[0])).booleanValue()) {
                        m13288b(sb, i, strSubstring, objM13228y);
                    }
                }
            }
            i2 = 3;
        }
        if (fkx0Var instanceof uhx0) {
            throw null;
        }
        plx0 plx0Var = ((AbstractC2245p5) fkx0Var).zzc;
        if (plx0Var != null) {
            plx0Var.m172897i(sb, i);
        }
    }
}
