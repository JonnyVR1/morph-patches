package p149l;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzelp;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzflg;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class u9v0 implements j3v0 {

    /* JADX INFO: renamed from: a */
    public final l3v0 f175508a;

    /* JADX INFO: renamed from: b */
    public final o3v0 f175509b;

    /* JADX INFO: renamed from: c */
    public final f3w0 f175510c;

    /* JADX INFO: renamed from: d */
    public final rmw0 f175511d;

    public u9v0(f3w0 f3w0Var, rmw0 rmw0Var, l3v0 l3v0Var, o3v0 o3v0Var) {
        this.f175510c = f3w0Var;
        this.f175511d = rmw0Var;
        this.f175509b = o3v0Var;
        this.f175508a = l3v0Var;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public static final String m192664e(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    @Override // p149l.j3v0
    /* JADX INFO: renamed from: a */
    public final boolean mo120127a(vxv0 vxv0Var, kxv0 kxv0Var) {
        return !kxv0Var.f125223u.isEmpty();
    }

    @Override // p149l.j3v0
    /* JADX INFO: renamed from: b */
    public final gnr mo120128b(final vxv0 vxv0Var, final kxv0 kxv0Var) {
        final m3v0 m3v0VarMo148409a;
        Iterator it = kxv0Var.f125223u.iterator();
        while (true) {
            if (!it.hasNext()) {
                m3v0VarMo148409a = null;
                break;
            }
            try {
                m3v0VarMo148409a = this.f175508a.mo148409a((String) it.next(), kxv0Var.f125226w);
                break;
            } catch (zzfho unused) {
            }
        }
        if (m3v0VarMo148409a == null) {
            return jmw0.m142234g(new zzelp("Unable to instantiate mediation adapter class."));
        }
        n3t0 n3t0Var = new n3t0();
        m3v0VarMo148409a.f131188c.mo99729P3(new t9v0(this, m3v0VarMo148409a, n3t0Var));
        if (kxv0Var.f125170N) {
            Bundle bundle = vxv0Var.f183477a.f166831a.f115494d.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        f3w0 f3w0Var = this.f175510c;
        return l2w0.m148324d(new f2w0() { // from class: l.r9v0
            @Override // p149l.f2w0
            public final void zza() throws Exception {
                this.f158452a.m192666d(vxv0Var, kxv0Var, m3v0VarMo148409a);
            }
        }, this.f175511d, zzflg.ADAPTER_LOAD_AD_SYN, f3w0Var).m206874b(zzflg.ADAPTER_LOAD_AD_ACK).m206876d(n3t0Var).m206874b(zzflg.ADAPTER_WRAP_ADAPTER).m206877e(new e2w0() { // from class: l.s9v0
            @Override // p149l.e2w0
            public final Object zza(Object obj) {
                return this.f163240a.m192665c(vxv0Var, kxv0Var, m3v0VarMo148409a, (Void) obj);
            }
        }).m206873a();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object m192665c(vxv0 vxv0Var, kxv0 kxv0Var, m3v0 m3v0Var, Void r4) throws Exception {
        return this.f175509b.mo95161a(vxv0Var, kxv0Var, m3v0Var);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m192666d(vxv0 vxv0Var, kxv0 kxv0Var, m3v0 m3v0Var) throws Exception {
        this.f175509b.mo95162b(vxv0Var, kxv0Var, m3v0Var);
    }
}
