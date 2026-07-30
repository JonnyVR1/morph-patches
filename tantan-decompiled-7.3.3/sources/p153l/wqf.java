package p153l;

import androidx.datastore.preferences.protobuf.AbstractC0343m;
import androidx.datastore.preferences.protobuf.C0345n;

/* JADX INFO: loaded from: classes.dex */
public final class wqf {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0343m<?> f190398a = new C0345n();

    /* JADX INFO: renamed from: b */
    public static final AbstractC0343m<?> f190399b = m207516c();

    /* JADX INFO: renamed from: a */
    public static AbstractC0343m<?> m207514a() {
        AbstractC0343m<?> abstractC0343m = f190399b;
        if (abstractC0343m != null) {
            return abstractC0343m;
        }
        wtq0.m207906a("Protobuf runtime is not correctly loaded.");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC0343m<?> m207515b() {
        return f190398a;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC0343m<?> m207516c() {
        try {
            return (AbstractC0343m) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
