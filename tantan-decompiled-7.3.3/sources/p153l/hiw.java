package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import com.immomo.momosec.jni.MNative;

/* JADX INFO: loaded from: classes7.dex */
public class hiw {

    /* JADX INFO: renamed from: a */
    private static hiw f110099a;

    /* JADX INFO: renamed from: b */
    private static String f110100b;

    /* JADX INFO: renamed from: c */
    private static String f110101c;

    private hiw() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m135175a(String str, String str2, int i) {
        if (str == null || str2 == null) {
            return null;
        }
        int i2 = 0;
        try {
            if (i == 1) {
                String strM20277m = null;
                while (i2 < 2) {
                    strM20277m = MNative.m20274b().m20277m(str2, str);
                    i2++;
                    if (strM20277m != null) {
                        break;
                    }
                }
                return strM20277m;
            }
            if (i == 2) {
                String strM20276h = null;
                while (i2 < 2) {
                    strM20276h = MNative.m20274b().m20276h(str2, str);
                    i2++;
                    if (strM20276h != null) {
                        break;
                    }
                }
                return strM20276h;
            }
            return null;
        } catch (Exception e) {
            mmw.m159100a(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static hiw m135176e() {
        hiw hiwVar;
        synchronized (MNative.class) {
            try {
                if (f110099a == null) {
                    f110099a = new hiw();
                }
                hiwVar = f110099a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hiwVar;
    }

    /* JADX INFO: renamed from: h */
    public static void m135177h(Context context) {
        synchronized (MNative.class) {
            giw.m130386c(context);
            f110100b = MNative.m20274b().m20278o();
        }
    }

    /* JADX INFO: renamed from: i */
    private void m135178i(Context context, String str) {
        f110101c = str;
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("ssconfig", 0).edit();
        editorEdit.putString("uuid", str);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: b */
    public boolean m135179b(String str, String str2) {
        m135178i(giw.m130385b(), MNative.m20274b().m20275a(m135182f(), str, str2));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public synchronized String m135180c(Context context, String str) {
        try {
            String strM135183g = m135183g(context);
            if (strM135183g != null && str != null) {
                return MNative.m20274b().m20277m(str, strM135183g);
            }
            return null;
        } catch (Exception e) {
            mmw.m159100a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized String m135181d(Context context, String str) {
        try {
            String strM135183g = m135183g(context);
            if (strM135183g != null && str != null) {
                int i = 0;
                String strM20276h = null;
                while (i < 2) {
                    strM20276h = MNative.m20274b().m20276h(str, strM135183g);
                    i++;
                    if (strM20276h != null) {
                        break;
                    }
                }
                return strM20276h;
            }
            return null;
        } catch (Exception e) {
            mmw.m159100a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public String m135182f() {
        return f110100b;
    }

    /* JADX INFO: renamed from: g */
    public String m135183g(Context context) {
        String str = f110101c;
        if (str != null) {
            return str;
        }
        String string = context.getSharedPreferences("ssconfig", 0).getString("uuid", "error");
        if (string.equals("error")) {
            return null;
        }
        return string;
    }
}
