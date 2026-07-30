package p153l;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzelp;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzflg;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class ajv0 implements pcv0 {

    /* JADX INFO: renamed from: a */
    public final rcv0 f71883a;

    /* JADX INFO: renamed from: b */
    public final ucv0 f71884b;

    /* JADX INFO: renamed from: c */
    public final lcw0 f71885c;

    /* JADX INFO: renamed from: d */
    public final xvw0 f71886d;

    public ajv0(lcw0 lcw0Var, xvw0 xvw0Var, rcv0 rcv0Var, ucv0 ucv0Var) {
        this.f71885c = lcw0Var;
        this.f71886d = xvw0Var;
        this.f71884b = ucv0Var;
        this.f71883a = rcv0Var;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public static final String m98487e(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    @Override // p153l.pcv0
    /* JADX INFO: renamed from: a */
    public final boolean mo98488a(b7w0 b7w0Var, q6w0 q6w0Var) {
        return !q6w0Var.f155913u.isEmpty();
    }

    @Override // p153l.pcv0
    /* JADX INFO: renamed from: b */
    public final hpr mo98489b(final b7w0 b7w0Var, final q6w0 q6w0Var) {
        final scv0 scv0VarMo115957a;
        Iterator it = q6w0Var.f155913u.iterator();
        while (true) {
            if (!it.hasNext()) {
                scv0VarMo115957a = null;
                break;
            }
            try {
                scv0VarMo115957a = this.f71883a.mo115957a((String) it.next(), q6w0Var.f155916w);
                break;
            } catch (zzfho unused) {
            }
        }
        if (scv0VarMo115957a == null) {
            return pvw0.m173980g(new zzelp("Unable to instantiate mediation adapter class."));
        }
        tct0 tct0Var = new tct0();
        scv0VarMo115957a.f167349c.mo129463P3(new ziv0(this, scv0VarMo115957a, tct0Var));
        if (q6w0Var.f155860N) {
            Bundle bundle = b7w0Var.f75342a.f197721a.f145318d.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        lcw0 lcw0Var = this.f71885c;
        return rbw0.m180768d(new lbw0() { // from class: l.xiv0
            @Override // p153l.lbw0
            public final void zza() throws Exception {
                this.f194518a.m98491d(b7w0Var, q6w0Var, scv0VarMo115957a);
            }
        }, this.f71886d, zzflg.ADAPTER_LOAD_AD_SYN, lcw0Var).m115304b(zzflg.ADAPTER_LOAD_AD_ACK).m115306d(tct0Var).m115304b(zzflg.ADAPTER_WRAP_ADAPTER).m115307e(new kbw0() { // from class: l.yiv0
            @Override // p153l.kbw0
            public final Object zza(Object obj) {
                return this.f200245a.m98490c(b7w0Var, q6w0Var, scv0VarMo115957a, (Void) obj);
            }
        }).m115303a();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object m98490c(b7w0 b7w0Var, q6w0 q6w0Var, scv0 scv0Var, Void r4) throws Exception {
        return this.f71884b.mo104242a(b7w0Var, q6w0Var, scv0Var);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m98491d(b7w0 b7w0Var, q6w0 q6w0Var, scv0 scv0Var) throws Exception {
        this.f71884b.mo104243b(b7w0Var, q6w0Var, scv0Var);
    }
}
