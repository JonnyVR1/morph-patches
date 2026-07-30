package p149l;

import com.google.protobuf.C3410h;

/* JADX INFO: loaded from: classes7.dex */
public final class npf {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f139962a = m160477c();

    /* JADX INFO: renamed from: a */
    public static C3410h m160475a() {
        if (f139962a != null) {
            try {
                return m160476b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C3410h.f11590c;
    }

    /* JADX INFO: renamed from: b */
    public static final C3410h m160476b(String str) throws Exception {
        return (C3410h) f139962a.getMethod(str, null).invoke(null, null);
    }

    /* JADX INFO: renamed from: c */
    public static Class<?> m160477c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
