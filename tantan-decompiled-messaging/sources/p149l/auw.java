package p149l;

import androidx.datastore.preferences.protobuf.C0319a0;
import androidx.datastore.preferences.protobuf.InterfaceC0357z;

/* JADX INFO: loaded from: classes.dex */
public final class auw {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0357z f71866a = m99093c();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0357z f71867b = new C0319a0();

    /* JADX INFO: renamed from: a */
    public static InterfaceC0357z m99091a() {
        return f71866a;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC0357z m99092b() {
        return f71867b;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0357z m99093c() {
        try {
            return (InterfaceC0357z) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
