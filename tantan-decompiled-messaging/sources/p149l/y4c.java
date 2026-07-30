package p149l;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class y4c {

    /* JADX INFO: renamed from: b */
    private static final x4c.InterfaceC21025a<?> f195925b = new C21305a();

    /* JADX INFO: renamed from: a */
    private final Map<Class<?>, x4c.InterfaceC21025a<?>> f195926a = new HashMap();

    /* JADX INFO: renamed from: l.y4c$a */
    public class C21305a implements x4c.InterfaceC21025a<Object> {
        @Override // p149l.x4c.InterfaceC21025a
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<Object> mo112977a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // p149l.x4c.InterfaceC21025a
        @NonNull
        /* JADX INFO: renamed from: b */
        public x4c<Object> mo112978b(@NonNull Object obj) {
            return new C21306b(obj);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public synchronized <T> x4c<T> m212890a(@NonNull T t) {
        x4c.InterfaceC21025a<?> interfaceC21025a;
        try {
            qf80.m174276d(t);
            interfaceC21025a = this.f195926a.get(t.getClass());
            if (interfaceC21025a == null) {
                for (x4c.InterfaceC21025a<?> interfaceC21025a2 : this.f195926a.values()) {
                    if (interfaceC21025a2.mo112977a().isAssignableFrom(t.getClass())) {
                        interfaceC21025a = interfaceC21025a2;
                        break;
                    }
                }
            }
            if (interfaceC21025a == null) {
                interfaceC21025a = f195925b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (x4c<T>) interfaceC21025a.mo112978b(t);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m212891b(@NonNull x4c.InterfaceC21025a<?> interfaceC21025a) {
        this.f195926a.put(interfaceC21025a.mo112977a(), interfaceC21025a);
    }

    /* JADX INFO: renamed from: l.y4c$b */
    public static final class C21306b implements x4c<Object> {

        /* JADX INFO: renamed from: a */
        private final Object f195927a;

        public C21306b(@NonNull Object obj) {
            this.f195927a = obj;
        }

        @Override // p149l.x4c
        @NonNull
        /* JADX INFO: renamed from: a */
        public Object mo112975a() {
            return this.f195927a;
        }

        @Override // p149l.x4c
        public void cleanup() {
        }
    }
}
