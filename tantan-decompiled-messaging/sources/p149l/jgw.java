package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import com.immomo.momosec.jni.MNative;

/* JADX INFO: loaded from: classes7.dex */
public class jgw {

    /* JADX INFO: renamed from: a */
    private static jgw f117853a;

    /* JADX INFO: renamed from: b */
    private static String f117854b;

    /* JADX INFO: renamed from: c */
    private static String f117855c;

    private jgw() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m141350a(String str, String str2, int i) {
        if (str == null || str2 == null) {
            return null;
        }
        int i2 = 0;
        try {
            if (i == 1) {
                String strM19297m = null;
                while (i2 < 2) {
                    strM19297m = MNative.m19294b().m19297m(str2, str);
                    i2++;
                    if (strM19297m != null) {
                        break;
                    }
                }
                return strM19297m;
            }
            if (i == 2) {
                String strM19296h = null;
                while (i2 < 2) {
                    strM19296h = MNative.m19294b().m19296h(str2, str);
                    i2++;
                    if (strM19296h != null) {
                        break;
                    }
                }
                return strM19296h;
            }
            return null;
        } catch (Exception e) {
            njw.m159796a(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static jgw m141351e() {
        jgw jgwVar;
        synchronized (MNative.class) {
            try {
                if (f117853a == null) {
                    f117853a = new jgw();
                }
                jgwVar = f117853a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jgwVar;
    }

    /* JADX INFO: renamed from: h */
    public static void m141352h(Context context) {
        synchronized (MNative.class) {
            igw.m136178c(context);
            f117854b = MNative.m19294b().m19298o();
        }
    }

    /* JADX INFO: renamed from: i */
    private void m141353i(Context context, String str) {
        f117855c = str;
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("ssconfig", 0).edit();
        editorEdit.putString("uuid", str);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: b */
    public boolean m141354b(String str, String str2) {
        m141353i(igw.m136177b(), MNative.m19294b().m19295a(m141357f(), str, str2));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public synchronized String m141355c(Context context, String str) {
        try {
            String strM141358g = m141358g(context);
            if (strM141358g != null && str != null) {
                return MNative.m19294b().m19297m(str, strM141358g);
            }
            return null;
        } catch (Exception e) {
            njw.m159796a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized String m141356d(Context context, String str) {
        try {
            String strM141358g = m141358g(context);
            if (strM141358g != null && str != null) {
                int i = 0;
                String strM19296h = null;
                while (i < 2) {
                    strM19296h = MNative.m19294b().m19296h(str, strM141358g);
                    i++;
                    if (strM19296h != null) {
                        break;
                    }
                }
                return strM19296h;
            }
            return null;
        } catch (Exception e) {
            njw.m159796a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public String m141357f() {
        return f117854b;
    }

    /* JADX INFO: renamed from: g */
    public String m141358g(Context context) {
        String str = f117855c;
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
