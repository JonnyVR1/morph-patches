package p153l;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes6.dex */
public final class vby0 {

    /* JADX INFO: renamed from: c */
    public static final vby0 f183298c = new vby0();

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap<Class<?>, ocy0<?>> f183300b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final jcy0 f183299a = new t6y0();

    /* JADX INFO: renamed from: a */
    public static vby0 m200747a() {
        return f183298c;
    }

    /* JADX INFO: renamed from: b */
    public final <T> ocy0<T> m200748b(Class<T> cls) {
        i2y0.m138254f(cls, "messageType");
        ocy0<T> ocy0VarZza = (ocy0) this.f183300b.get(cls);
        if (ocy0VarZza == null) {
            ocy0VarZza = this.f183299a.zza(cls);
            i2y0.m138254f(cls, "messageType");
            i2y0.m138254f(ocy0VarZza, "schema");
            ocy0<T> ocy0Var = (ocy0) this.f183300b.putIfAbsent(cls, ocy0VarZza);
            if (ocy0Var != null) {
                return ocy0Var;
            }
        }
        return ocy0VarZza;
    }

    /* JADX INFO: renamed from: c */
    public final <T> ocy0<T> m200749c(T t) {
        return m200748b(t.getClass());
    }
}
