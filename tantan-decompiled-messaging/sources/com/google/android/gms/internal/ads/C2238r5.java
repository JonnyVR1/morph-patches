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
import p149l.hcx0;
import p149l.jcx0;
import p149l.o8x0;
import p149l.zax0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2238r5 {

    /* JADX INFO: renamed from: a */
    public static final char[] f10030a;

    static {
        char[] cArr = new char[80];
        f10030a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static String m13233a(zax0 zax0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m13236d(zax0Var, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static void m13234b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m13234b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m13234b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m13235c(i, sb);
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
            sb.append(hcx0.m130523a(zzgyl.zzw((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzgyl) {
            sb.append(": \"");
            sb.append(hcx0.m130523a((zzgyl) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC2222p5) {
            sb.append(" {");
            m13236d((AbstractC2222p5) obj, sb, i + 2);
            sb.append(SignParameters.NEW_LINE);
            m13235c(i, sb);
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
        m13234b(sb, i3, Constants.KEY_KEY, entry.getKey());
        m13234b(sb, i3, "value", entry.getValue());
        sb.append(SignParameters.NEW_LINE);
        m13235c(i, sb);
        sb.append("}");
    }

    /* JADX INFO: renamed from: c */
    public static void m13235c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f10030a, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f6  */
    /* JADX INFO: renamed from: d */
    public static void m13236d(zax0 zax0Var, StringBuilder sb, int i) {
        int i2;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zax0Var.getClass().getDeclaredMethods();
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
                m13234b(sb, i, strSubstring.substring(0, strSubstring.length() - 4), AbstractC2222p5.m13174y(method2, zax0Var, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m13234b(sb, i, strSubstring.substring(0, strSubstring.length() - 3), AbstractC2222p5.m13174y(method, zax0Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM13174y = AbstractC2222p5.m13174y(method4, zax0Var, new Object[0]);
                    if (method5 == null) {
                        if (objM13174y instanceof Boolean) {
                            if (((Boolean) objM13174y).booleanValue()) {
                                m13234b(sb, i, strSubstring, objM13174y);
                            }
                        } else if (objM13174y instanceof Integer) {
                            if (((Integer) objM13174y).intValue() != 0) {
                                m13234b(sb, i, strSubstring, objM13174y);
                            }
                        } else if (objM13174y instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objM13174y).floatValue()) != 0) {
                                m13234b(sb, i, strSubstring, objM13174y);
                            }
                        } else if (!(objM13174y instanceof Double)) {
                            if (objM13174y instanceof String) {
                                zEquals = objM13174y.equals("");
                            } else if (objM13174y instanceof zzgyl) {
                                zEquals = objM13174y.equals(zzgyl.zzb);
                            } else if (objM13174y instanceof zax0) {
                                if (objM13174y != ((zax0) objM13174y).mo13182a()) {
                                    m13234b(sb, i, strSubstring, objM13174y);
                                }
                            } else if (!(objM13174y instanceof Enum) || ((Enum) objM13174y).ordinal() != 0) {
                                m13234b(sb, i, strSubstring, objM13174y);
                            }
                            if (!zEquals) {
                                m13234b(sb, i, strSubstring, objM13174y);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objM13174y).doubleValue()) != 0) {
                            m13234b(sb, i, strSubstring, objM13174y);
                        }
                    } else if (((Boolean) AbstractC2222p5.m13174y(method5, zax0Var, new Object[0])).booleanValue()) {
                        m13234b(sb, i, strSubstring, objM13174y);
                    }
                }
            }
            i2 = 3;
        }
        if (zax0Var instanceof o8x0) {
            throw null;
        }
        jcx0 jcx0Var = ((AbstractC2222p5) zax0Var).zzc;
        if (jcx0Var != null) {
            jcx0Var.m141005i(sb, i);
        }
    }
}
