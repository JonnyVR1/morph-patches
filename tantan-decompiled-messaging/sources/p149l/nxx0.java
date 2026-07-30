package p149l;

import com.google.android.gms.internal.measurement.C2353w0;
import com.google.android.gms.internal.measurement.C2355x0;

/* JADX INFO: loaded from: classes6.dex */
public final class nxx0 implements d3y0 {

    /* JADX INFO: renamed from: b */
    public static final fzx0 f141072b = new ixx0();

    /* JADX INFO: renamed from: a */
    public final fzx0 f141073a;

    public nxx0() {
        this(new sxx0(ysx0.m215956a(), f141072b));
    }

    @Override // p149l.d3y0
    public final <T> i3y0<T> zza(Class<T> cls) {
        p3y0.m167317l(cls);
        b0y0 b0y0VarZza = this.f141073a.zza(cls);
        if (b0y0VarZza.zzc()) {
            return C2355x0.m14485g(p3y0.m167313h(), crx0.m108459a(), b0y0VarZza.zza());
        }
        return C2353w0.m14439k(cls, b0y0VarZza, x1y0.m206767a(), dxx0.m114041a(), p3y0.m167313h(), wxx0.f188532a[b0y0VarZza.zzb().ordinal()] != 1 ? crx0.m108459a() : null, tyx0.m191113a());
    }

    public nxx0(fzx0 fzx0Var) {
        this.f141073a = (fzx0) ctx0.m108708f(fzx0Var, "messageInfoFactory");
    }
}
