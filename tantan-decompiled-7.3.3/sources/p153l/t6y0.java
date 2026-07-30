package p153l;

import com.google.android.gms.internal.measurement.C2376w0;
import com.google.android.gms.internal.measurement.C2378x0;

/* JADX INFO: loaded from: classes6.dex */
public final class t6y0 implements jcy0 {

    /* JADX INFO: renamed from: b */
    public static final l8y0 f172386b = new o6y0();

    /* JADX INFO: renamed from: a */
    public final l8y0 f172387a;

    public t6y0() {
        this(new y6y0(e2y0.m119201a(), f172386b));
    }

    @Override // p153l.jcy0
    public final <T> ocy0<T> zza(Class<T> cls) {
        vcy0.m200877l(cls);
        h9y0 h9y0VarZza = this.f172387a.zza(cls);
        if (h9y0VarZza.zzc()) {
            return C2378x0.m14539g(vcy0.m200873h(), i0y0.m138046a(), h9y0VarZza.zza());
        }
        return C2376w0.m14493k(cls, h9y0VarZza, dby0.m115178a(), j6y0.m143736a(), vcy0.m200873h(), c7y0.f80167a[h9y0VarZza.zzb().ordinal()] != 1 ? i0y0.m138046a() : null, z7y0.m218926a());
    }

    public t6y0(l8y0 l8y0Var) {
        this.f172387a = (l8y0) i2y0.m138254f(l8y0Var, "messageInfoFactory");
    }
}
