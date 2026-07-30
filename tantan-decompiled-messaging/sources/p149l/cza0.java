package p149l;

import androidx.datastore.preferences.protobuf.C0340l;
import androidx.datastore.preferences.protobuf.C0350s;
import androidx.datastore.preferences.protobuf.InterfaceC0333h0;
import androidx.datastore.preferences.protobuf.InterfaceC0335i0;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class cza0 {
    private static final cza0 INSTANCE = new cza0();

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap<Class<?>, InterfaceC0335i0<?>> f83078b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final tud0 f83077a = new yrw();

    /* JADX INFO: renamed from: a */
    public static cza0 m109400a() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public <T> void m109401b(T t, InterfaceC0333h0 interfaceC0333h0, C0340l c0340l) throws IOException {
        m109404e(t).mo1906e(t, interfaceC0333h0, c0340l);
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC0335i0<?> m109402c(Class<?> cls, InterfaceC0335i0<?> interfaceC0335i0) {
        C0350s.m2340b(cls, "messageType");
        C0350s.m2340b(interfaceC0335i0, "schema");
        return this.f83078b.putIfAbsent(cls, interfaceC0335i0);
    }

    /* JADX INFO: renamed from: d */
    public <T> InterfaceC0335i0<T> m109403d(Class<T> cls) {
        C0350s.m2340b(cls, "messageType");
        InterfaceC0335i0<T> interfaceC0335i0Mo190687a = (InterfaceC0335i0) this.f83078b.get(cls);
        if (interfaceC0335i0Mo190687a == null) {
            interfaceC0335i0Mo190687a = this.f83077a.mo190687a(cls);
            InterfaceC0335i0<T> interfaceC0335i0 = (InterfaceC0335i0<T>) m109402c(cls, interfaceC0335i0Mo190687a);
            if (interfaceC0335i0 != null) {
                return interfaceC0335i0;
            }
        }
        return interfaceC0335i0Mo190687a;
    }

    /* JADX INFO: renamed from: e */
    public <T> InterfaceC0335i0<T> m109404e(T t) {
        return m109403d(t.getClass());
    }
}
