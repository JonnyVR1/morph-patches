package p153l;

import androidx.datastore.preferences.protobuf.C0341l;

/* JADX INFO: loaded from: classes.dex */
public final class vqf {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f185348a = m202380c();

    /* JADX INFO: renamed from: a */
    public static C0341l m202378a() {
        if (f185348a != null) {
            try {
                return m202379b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C0341l.f1714e;
    }

    /* JADX INFO: renamed from: b */
    public static final C0341l m202379b(String str) throws Exception {
        return (C0341l) f185348a.getDeclaredMethod(str, null).invoke(null, null);
    }

    /* JADX INFO: renamed from: c */
    public static Class<?> m202380c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
