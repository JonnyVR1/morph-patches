package p153l;

import androidx.datastore.preferences.protobuf.C0341l;
import androidx.datastore.preferences.protobuf.C0351s;
import androidx.datastore.preferences.protobuf.InterfaceC0334h0;
import androidx.datastore.preferences.protobuf.InterfaceC0336i0;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class g7b0 {
    private static final g7b0 INSTANCE = new g7b0();

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap<Class<?>, InterfaceC0336i0<?>> f102525b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final x2e0 f102524a = new xuw();

    /* JADX INFO: renamed from: a */
    public static g7b0 m129308a() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public <T> void m129309b(T t, InterfaceC0334h0 interfaceC0334h0, C0341l c0341l) throws IOException {
        m129312e(t).mo1907e(t, interfaceC0334h0, c0341l);
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC0336i0<?> m129310c(Class<?> cls, InterfaceC0336i0<?> interfaceC0336i0) {
        C0351s.m2341b(cls, "messageType");
        C0351s.m2341b(interfaceC0336i0, "schema");
        return this.f102525b.putIfAbsent(cls, interfaceC0336i0);
    }

    /* JADX INFO: renamed from: d */
    public <T> InterfaceC0336i0<T> m129311d(Class<T> cls) {
        C0351s.m2341b(cls, "messageType");
        InterfaceC0336i0<T> interfaceC0336i0Mo209144a = (InterfaceC0336i0) this.f102525b.get(cls);
        if (interfaceC0336i0Mo209144a == null) {
            interfaceC0336i0Mo209144a = this.f102524a.mo209144a(cls);
            InterfaceC0336i0<T> interfaceC0336i0 = (InterfaceC0336i0<T>) m129310c(cls, interfaceC0336i0Mo209144a);
            if (interfaceC0336i0 != null) {
                return interfaceC0336i0;
            }
        }
        return interfaceC0336i0Mo209144a;
    }

    /* JADX INFO: renamed from: e */
    public <T> InterfaceC0336i0<T> m129312e(T t) {
        return m129311d(t.getClass());
    }
}
