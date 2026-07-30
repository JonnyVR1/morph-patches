package p149l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaqj;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class byr0 extends pnr0 {

    /* JADX INFO: renamed from: d */
    public final Context f77962d;

    public byr0(Context context, onr0 onr0Var) {
        super(onr0Var);
        this.f77962d = context;
    }

    /* JADX INFO: renamed from: b */
    public static gnr0 m104508b(Context context) {
        gnr0 gnr0Var = new gnr0(new wnr0(new File(context.getCacheDir(), "admob_volley"), 20971520), new byr0(context, new nor0()), 4);
        gnr0Var.m127184d();
        return gnr0Var;
    }

    @Override // p149l.pnr0, p149l.nmr0
    /* JADX INFO: renamed from: a */
    public final pmr0 mo104509a(dnr0 dnr0Var) throws zzaqj {
        if (dnr0Var.zza() == 0) {
            if (Pattern.matches((String) d1s0.m109677c().m144697a(m7s0.f132395s4), dnr0Var.m112664o())) {
                Context context = this.f77962d;
                exr0.m118703b();
                if (i2t0.m134091u(context, 13400000)) {
                    pmr0 pmr0VarMo104509a = new yis0(this.f77962d).mo104509a(dnr0Var);
                    if (pmr0VarMo104509a != null) {
                        xsu0.m210834k("Got gmscore asset response: ".concat(String.valueOf(dnr0Var.m112664o())));
                        return pmr0VarMo104509a;
                    }
                    xsu0.m210834k("Failed to get gmscore asset response: ".concat(String.valueOf(dnr0Var.m112664o())));
                }
            }
        }
        return super.mo104509a(dnr0Var);
    }
}
