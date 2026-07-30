package p149l;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzflg;

/* JADX INFO: loaded from: classes6.dex */
public final class hav0 implements j3v0 {

    /* JADX INFO: renamed from: a */
    public final Context f106840a;

    /* JADX INFO: renamed from: b */
    public final tot0 f106841b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final s8s0 f106842c;

    /* JADX INFO: renamed from: d */
    public final rmw0 f106843d;

    /* JADX INFO: renamed from: e */
    public final f3w0 f106844e;

    public hav0(Context context, tot0 tot0Var, f3w0 f3w0Var, rmw0 rmw0Var, @Nullable s8s0 s8s0Var) {
        this.f106840a = context;
        this.f106841b = tot0Var;
        this.f106844e = f3w0Var;
        this.f106843d = rmw0Var;
        this.f106842c = s8s0Var;
    }

    @Override // p149l.j3v0
    /* JADX INFO: renamed from: a */
    public final boolean mo120127a(vxv0 vxv0Var, kxv0 kxv0Var) {
        oxv0 oxv0Var;
        return (this.f106842c == null || (oxv0Var = kxv0Var.f125221t) == null || oxv0Var.f146253a == null) ? false : true;
    }

    @Override // p149l.j3v0
    /* JADX INFO: renamed from: b */
    public final gnr mo120128b(vxv0 vxv0Var, kxv0 kxv0Var) {
        fav0 fav0Var = new fav0(this, new View(this.f106840a), null, new cqt0() { // from class: l.dav0
            @Override // p149l.cqt0
            public final fgu0 zza() {
                return null;
            }
        }, (lxv0) kxv0Var.f125225v.get(0));
        pnt0 pnt0VarMo189928a = this.f106841b.mo189928a(new uqt0(vxv0Var, kxv0Var, null), fav0Var);
        gav0 gav0VarMo170466k = pnt0VarMo189928a.mo170466k();
        oxv0 oxv0Var = kxv0Var.f125221t;
        final f8s0 f8s0Var = new f8s0(gav0VarMo170466k, oxv0Var.f146254b, oxv0Var.f146253a);
        zzflg zzflgVar = zzflg.CUSTOM_RENDER_SYN;
        return l2w0.m148324d(new f2w0() { // from class: l.eav0
            @Override // p149l.f2w0
            public final void zza() throws Exception {
                this.f90273a.m130226c(f8s0Var);
            }
        }, this.f106843d, zzflgVar, this.f106844e).m206874b(zzflg.CUSTOM_RENDER_ACK).m206876d(jmw0.m142235h(pnt0VarMo189928a.mo170463h())).m206873a();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m130226c(f8s0 f8s0Var) throws Exception {
        this.f106842c.mo134984I2(f8s0Var);
    }
}
