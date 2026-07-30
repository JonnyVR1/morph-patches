package p149l;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes6.dex */
public final class p2y0 {

    /* JADX INFO: renamed from: c */
    public static final p2y0 f146939c = new p2y0();

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap<Class<?>, i3y0<?>> f146941b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final d3y0 f146940a = new nxx0();

    /* JADX INFO: renamed from: a */
    public static p2y0 m167229a() {
        return f146939c;
    }

    /* JADX INFO: renamed from: b */
    public final <T> i3y0<T> m167230b(Class<T> cls) {
        ctx0.m108708f(cls, "messageType");
        i3y0<T> i3y0VarZza = (i3y0) this.f146941b.get(cls);
        if (i3y0VarZza == null) {
            i3y0VarZza = this.f146940a.zza(cls);
            ctx0.m108708f(cls, "messageType");
            ctx0.m108708f(i3y0VarZza, "schema");
            i3y0<T> i3y0Var = (i3y0) this.f146941b.putIfAbsent(cls, i3y0VarZza);
            if (i3y0Var != null) {
                return i3y0Var;
            }
        }
        return i3y0VarZza;
    }

    /* JADX INFO: renamed from: c */
    public final <T> i3y0<T> m167231c(T t) {
        return m167230b(t.getClass());
    }
}
