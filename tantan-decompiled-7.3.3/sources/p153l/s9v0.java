package p153l;

import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class s9v0 implements k8u0, s6u0 {

    /* JADX INFO: renamed from: c */
    public static final Object f166983c = new Object();

    /* JADX INFO: renamed from: d */
    public static int f166984d;

    /* JADX INFO: renamed from: a */
    public final grw0 f166985a;

    /* JADX INFO: renamed from: b */
    public final cav0 f166986b;

    public s9v0(cav0 cav0Var, grw0 grw0Var) {
        this.f166986b = cav0Var;
        this.f166985a = grw0Var;
    }

    /* JADX INFO: renamed from: a */
    private final void m185248a(boolean z) {
        int i;
        int iIntValue;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168351j6)).booleanValue() && !this.f166985a.mo131896f()) {
            Object obj = f166983c;
            synchronized (obj) {
                i = f166984d;
                iIntValue = ((Integer) jas0.m144075c().m176505a(sgs0.f168364k6)).intValue();
            }
            if (i < iIntValue) {
                this.f166986b.m108514e(z);
                synchronized (obj) {
                    f166984d++;
                }
            }
        }
    }

    @Override // p153l.s6u0
    /* JADX INFO: renamed from: u */
    public final void mo103145u(zze zzeVar) {
        m185248a(false);
    }

    @Override // p153l.k8u0
    public final void zzr() {
        m185248a(true);
    }
}
