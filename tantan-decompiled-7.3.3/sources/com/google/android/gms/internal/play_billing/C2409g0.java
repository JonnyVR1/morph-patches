package com.google.android.gms.internal.play_billing;

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
import p153l.c0y0;
import p153l.o0y0;
import p153l.srx0;
import p153l.yvx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2409g0 {

    /* JADX INFO: renamed from: a */
    public static final char[] f10363a;

    static {
        char[] cArr = new char[80];
        f10363a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static String m14843a(yvx0 yvx0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m14846d(yvx0Var, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static void m14844b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m14844b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m14844b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m14845c(i, sb);
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
            sb.append(c0y0.m107473a(new zzgi(((String) obj).getBytes(srx0.f170385a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzgk) {
            sb.append(": \"");
            sb.append(c0y0.m107473a((zzgk) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC2403d0) {
            sb.append(" {");
            m14846d((AbstractC2403d0) obj, sb, i + 2);
            sb.append(SignParameters.NEW_LINE);
            m14845c(i, sb);
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
        m14844b(sb, i3, Constants.KEY_KEY, entry.getKey());
        m14844b(sb, i3, "value", entry.getValue());
        sb.append(SignParameters.NEW_LINE);
        m14845c(i, sb);
        sb.append("}");
    }

    /* JADX INFO: renamed from: c */
    public static void m14845c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f10363a, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f6  */
    /* JADX INFO: renamed from: d */
    public static void m14846d(yvx0 yvx0Var, StringBuilder sb, int i) {
        int i2;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = yvx0Var.getClass().getDeclaredMethods();
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
                m14844b(sb, i, strSubstring.substring(0, strSubstring.length() - 4), AbstractC2403d0.m14816r(method2, yvx0Var, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m14844b(sb, i, strSubstring.substring(0, strSubstring.length() - 3), AbstractC2403d0.m14816r(method, yvx0Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM14816r = AbstractC2403d0.m14816r(method4, yvx0Var, new Object[0]);
                    if (method5 == null) {
                        if (objM14816r instanceof Boolean) {
                            if (((Boolean) objM14816r).booleanValue()) {
                                m14844b(sb, i, strSubstring, objM14816r);
                            }
                        } else if (objM14816r instanceof Integer) {
                            if (((Integer) objM14816r).intValue() != 0) {
                                m14844b(sb, i, strSubstring, objM14816r);
                            }
                        } else if (objM14816r instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objM14816r).floatValue()) != 0) {
                                m14844b(sb, i, strSubstring, objM14816r);
                            }
                        } else if (!(objM14816r instanceof Double)) {
                            if (objM14816r instanceof String) {
                                zEquals = objM14816r.equals("");
                            } else if (objM14816r instanceof zzgk) {
                                zEquals = objM14816r.equals(zzgk.zzb);
                            } else if (objM14816r instanceof yvx0) {
                                if (objM14816r != ((yvx0) objM14816r).zzi()) {
                                    m14844b(sb, i, strSubstring, objM14816r);
                                }
                            } else if (!(objM14816r instanceof Enum) || ((Enum) objM14816r).ordinal() != 0) {
                                m14844b(sb, i, strSubstring, objM14816r);
                            }
                            if (!zEquals) {
                                m14844b(sb, i, strSubstring, objM14816r);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objM14816r).doubleValue()) != 0) {
                            m14844b(sb, i, strSubstring, objM14816r);
                        }
                    } else if (((Boolean) AbstractC2403d0.m14816r(method5, yvx0Var, new Object[0])).booleanValue()) {
                        m14844b(sb, i, strSubstring, objM14816r);
                    }
                }
            }
            i2 = 3;
        }
        if (yvx0Var instanceof AbstractC2401c0) {
            Iterator itM216461e = ((AbstractC2401c0) yvx0Var).zzb.m216461e();
            if (itM216461e.hasNext()) {
                throw null;
            }
        }
        o0y0 o0y0Var = ((AbstractC2403d0) yvx0Var).zzc;
        if (o0y0Var != null) {
            o0y0Var.m165563i(sb, i);
        }
    }
}
