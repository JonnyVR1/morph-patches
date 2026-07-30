package p149l;

import androidx.datastore.preferences.protobuf.AbstractC0342m;
import androidx.datastore.preferences.protobuf.C0344n;

/* JADX INFO: loaded from: classes.dex */
public final class ppf {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0342m<?> f150642a = new C0344n();

    /* JADX INFO: renamed from: b */
    public static final AbstractC0342m<?> f150643b = m170716c();

    /* JADX INFO: renamed from: a */
    public static AbstractC0342m<?> m170714a() {
        AbstractC0342m<?> abstractC0342m = f150643b;
        if (abstractC0342m != null) {
            return abstractC0342m;
        }
        qkq0.m175383a("Protobuf runtime is not correctly loaded.");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC0342m<?> m170715b() {
        return f150642a;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC0342m<?> m170716c() {
        try {
            return (AbstractC0342m) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
