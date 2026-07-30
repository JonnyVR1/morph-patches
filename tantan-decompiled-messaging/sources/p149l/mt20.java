package p149l;

import androidx.datastore.preferences.protobuf.C0329f0;

/* JADX INFO: loaded from: classes.dex */
public final class mt20 {

    /* JADX INFO: renamed from: a */
    public static final lt20 f135550a = m156179c();

    /* JADX INFO: renamed from: b */
    public static final lt20 f135551b = new C0329f0();

    /* JADX INFO: renamed from: a */
    public static lt20 m156177a() {
        return f135550a;
    }

    /* JADX INFO: renamed from: b */
    public static lt20 m156178b() {
        return f135551b;
    }

    /* JADX INFO: renamed from: c */
    public static lt20 m156179c() {
        try {
            return (lt20) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
