package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzflg;

/* JADX INFO: loaded from: classes6.dex */
public final class mav0 implements j3v0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final s8s0 f132957a;

    /* JADX INFO: renamed from: b */
    public final rmw0 f132958b;

    /* JADX INFO: renamed from: c */
    public final f3w0 f132959c;

    /* JADX INFO: renamed from: d */
    public final vav0 f132960d;

    public mav0(f3w0 f3w0Var, rmw0 rmw0Var, @Nullable s8s0 s8s0Var, vav0 vav0Var) {
        this.f132959c = f3w0Var;
        this.f132958b = rmw0Var;
        this.f132957a = s8s0Var;
        this.f132960d = vav0Var;
    }

    @Override // p149l.j3v0
    /* JADX INFO: renamed from: a */
    public final boolean mo120127a(vxv0 vxv0Var, kxv0 kxv0Var) {
        oxv0 oxv0Var;
        return (this.f132957a == null || (oxv0Var = kxv0Var.f125221t) == null || oxv0Var.f146253a == null) ? false : true;
    }

    @Override // p149l.j3v0
    /* JADX INFO: renamed from: b */
    public final gnr mo120128b(vxv0 vxv0Var, kxv0 kxv0Var) {
        n3t0 n3t0Var = new n3t0();
        rav0 rav0Var = new rav0();
        rav0Var.m178537b(new lav0(this, n3t0Var, vxv0Var, kxv0Var, rav0Var));
        oxv0 oxv0Var = kxv0Var.f125221t;
        final f8s0 f8s0Var = new f8s0(rav0Var, oxv0Var.f146254b, oxv0Var.f146253a);
        zzflg zzflgVar = zzflg.CUSTOM_RENDER_SYN;
        return l2w0.m148324d(new f2w0() { // from class: l.kav0
            @Override // p149l.f2w0
            public final void zza() throws Exception {
                this.f122154a.m153842c(f8s0Var);
            }
        }, this.f132958b, zzflgVar, this.f132959c).m206874b(zzflg.CUSTOM_RENDER_ACK).m206876d(n3t0Var).m206873a();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m153842c(f8s0 f8s0Var) throws Exception {
        this.f132957a.mo134984I2(f8s0Var);
    }
}
