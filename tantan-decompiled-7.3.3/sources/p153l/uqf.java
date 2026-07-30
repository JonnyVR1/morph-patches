package p153l;

import com.google.protobuf.C3433h;

/* JADX INFO: loaded from: classes7.dex */
public final class uqf {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f180450a = m197332c();

    /* JADX INFO: renamed from: a */
    public static C3433h m197330a() {
        if (f180450a != null) {
            try {
                return m197331b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C3433h.f11627c;
    }

    /* JADX INFO: renamed from: b */
    public static final C3433h m197331b(String str) throws Exception {
        return (C3433h) f180450a.getMethod(str, null).invoke(null, null);
    }

    /* JADX INFO: renamed from: c */
    public static Class<?> m197332c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
