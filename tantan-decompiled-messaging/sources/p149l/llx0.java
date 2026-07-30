package p149l;

import com.google.android.gms.internal.play_billing.AbstractC2380d0;
import com.google.android.gms.internal.play_billing.C2388h0;
import com.google.android.gms.internal.play_billing.C2390i0;
import com.google.android.gms.internal.play_billing.C2392j0;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
public final class llx0 implements tox0 {

    /* JADX INFO: renamed from: b */
    public static final jmx0 f128759b = new blx0();

    /* JADX INFO: renamed from: a */
    public final jmx0 f128760a;

    public llx0() {
        mex0 mex0VarM154339a = mex0.m154339a();
        aox0 aox0Var = aox0.f70954c;
        glx0 glx0Var = new glx0(mex0VarM154339a, f128759b);
        Charset charset = mix0.f134047a;
        this.f128760a = glx0Var;
    }

    @Override // p149l.tox0
    public final oox0 zza(Class cls) {
        erx0 erx0Var = C2392j0.f10351a;
        if (!AbstractC2380d0.class.isAssignableFrom(cls)) {
            aox0 aox0Var = aox0.f70954c;
        }
        fmx0 fmx0VarZzb = this.f128760a.zzb(cls);
        if (fmx0VarZzb.zzb()) {
            aox0 aox0Var2 = aox0.f70954c;
            return C2390i0.m14830f(C2392j0.m14853r(), w7x0.m202084a(), fmx0VarZzb.zza());
        }
        aox0 aox0Var3 = aox0.f70954c;
        return C2388h0.m14802w(cls, fmx0VarZzb, rnx0.m180211a(), tkx0.m189540a(), C2392j0.m14853r(), fmx0VarZzb.zzc() + (-1) != 1 ? w7x0.m202084a() : null, bmx0.m102713a());
    }
}
