package p153l;

import androidx.datastore.preferences.protobuf.C0320a0;
import androidx.datastore.preferences.protobuf.InterfaceC0358z;

/* JADX INFO: loaded from: classes.dex */
public final class zww {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0358z f206388a = m221960c();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0358z f206389b = new C0320a0();

    /* JADX INFO: renamed from: a */
    public static InterfaceC0358z m221958a() {
        return f206388a;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC0358z m221959b() {
        return f206389b;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0358z m221960c() {
        try {
            return (InterfaceC0358z) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
