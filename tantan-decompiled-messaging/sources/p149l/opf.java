package p149l;

import androidx.datastore.preferences.protobuf.C0340l;

/* JADX INFO: loaded from: classes.dex */
public final class opf {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f144991a = m165359c();

    /* JADX INFO: renamed from: a */
    public static C0340l m165357a() {
        if (f144991a != null) {
            try {
                return m165358b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C0340l.f1714e;
    }

    /* JADX INFO: renamed from: b */
    public static final C0340l m165358b(String str) throws Exception {
        return (C0340l) f144991a.getDeclaredMethod(str, null).invoke(null, null);
    }

    /* JADX INFO: renamed from: c */
    public static Class<?> m165359c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
