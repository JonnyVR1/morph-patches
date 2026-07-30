package p153l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaqj;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class h7s0 extends vwr0 {

    /* JADX INFO: renamed from: d */
    public final Context f108156d;

    public h7s0(Context context, uwr0 uwr0Var) {
        super(uwr0Var);
        this.f108156d = context;
    }

    /* JADX INFO: renamed from: b */
    public static mwr0 m133835b(Context context) {
        mwr0 mwr0Var = new mwr0(new cxr0(new File(context.getCacheDir(), "admob_volley"), 20971520), new h7s0(context, new txr0()), 4);
        mwr0Var.m160594d();
        return mwr0Var;
    }

    @Override // p153l.vwr0, p153l.tvr0
    /* JADX INFO: renamed from: a */
    public final vvr0 mo122393a(jwr0 jwr0Var) throws zzaqj {
        if (jwr0Var.zza() == 0) {
            if (Pattern.matches((String) jas0.m144075c().m176505a(sgs0.f168466s4), jwr0Var.m147202o())) {
                Context context = this.f108156d;
                k6s0.m148569b();
                if (obt0.m167044u(context, 13400000)) {
                    vvr0 vvr0VarMo122393a = new ess0(this.f108156d).mo122393a(jwr0Var);
                    if (vvr0VarMo122393a != null) {
                        d2v0.m113737k("Got gmscore asset response: ".concat(String.valueOf(jwr0Var.m147202o())));
                        return vvr0VarMo122393a;
                    }
                    d2v0.m113737k("Failed to get gmscore asset response: ".concat(String.valueOf(jwr0Var.m147202o())));
                }
            }
        }
        return super.mo122393a(jwr0Var);
    }
}
