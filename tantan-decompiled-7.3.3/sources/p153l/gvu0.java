package p153l;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.C2127b0;
import com.google.android.gms.internal.ads.zzbze;
import com.tencent.rtmp.TXLiveConstants;

/* JADX INFO: loaded from: classes6.dex */
public final class gvu0 implements x9u0, k8u0, s6u0, j7u0, har0, ddu0 {

    /* JADX INFO: renamed from: a */
    public final fcs0 f106688a;

    /* JADX INFO: renamed from: b */
    public boolean f106689b = false;

    public gvu0(fcs0 fcs0Var, c4w0 c4w0Var) {
        this.f106688a = fcs0Var;
        fcs0Var.m125047c(2);
        if (c4w0Var != null) {
            fcs0Var.m125047c(1101);
        }
    }

    @Override // p153l.x9u0
    /* JADX INFO: renamed from: A */
    public final void mo107082A(final b7w0 b7w0Var) {
        this.f106688a.m125046b(new ecs0() { // from class: l.cvu0
            @Override // p153l.ecs0
            /* JADX INFO: renamed from: a */
            public final void mo12872a(yds0 yds0Var) {
                ycs0 ycs0Var = (ycs0) yds0Var.m215280q().m13241k();
                ids0 ids0Var = (ids0) yds0Var.m215280q().m13495N().m13241k();
                ids0Var.m139543q(b7w0Var.f75343b.f68854b.f172368b);
                ycs0Var.m215175r(ids0Var);
                yds0Var.m215284u(ycs0Var);
            }
        });
    }

    @Override // p153l.ddu0
    /* JADX INFO: renamed from: B */
    public final void mo103634B(final C2127b0 c2127b0) {
        this.f106688a.m125046b(new ecs0() { // from class: l.evu0
            @Override // p153l.ecs0
            /* JADX INFO: renamed from: a */
            public final void mo12872a(yds0 yds0Var) {
                yds0Var.m215285v(c2127b0);
            }
        });
        this.f106688a.m125047c(1104);
    }

    @Override // p153l.ddu0
    /* JADX INFO: renamed from: D */
    public final void mo103635D(boolean z) {
        this.f106688a.m125047c(true != z ? 1108 : 1107);
    }

    @Override // p153l.j7u0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo106809a() {
        this.f106688a.m125047c(6);
    }

    @Override // p153l.ddu0
    /* JADX INFO: renamed from: h0 */
    public final void mo103636h0(final C2127b0 c2127b0) {
        this.f106688a.m125046b(new ecs0() { // from class: l.dvu0
            @Override // p153l.ecs0
            /* JADX INFO: renamed from: a */
            public final void mo12872a(yds0 yds0Var) {
                yds0Var.m215285v(c2127b0);
            }
        });
        this.f106688a.m125047c(1102);
    }

    @Override // p153l.ddu0
    /* JADX INFO: renamed from: k0 */
    public final void mo103637k0(final C2127b0 c2127b0) {
        this.f106688a.m125046b(new ecs0() { // from class: l.fvu0
            @Override // p153l.ecs0
            /* JADX INFO: renamed from: a */
            public final void mo12872a(yds0 yds0Var) {
                yds0Var.m215285v(c2127b0);
            }
        });
        this.f106688a.m125047c(1103);
    }

    @Override // p153l.har0
    public final synchronized void onAdClicked() {
        boolean z = this.f106689b;
        fcs0 fcs0Var = this.f106688a;
        if (z) {
            fcs0Var.m125047c(8);
        } else {
            fcs0Var.m125047c(7);
            this.f106689b = true;
        }
    }

    @Override // p153l.ddu0
    /* JADX INFO: renamed from: q */
    public final void mo103638q(boolean z) {
        this.f106688a.m125047c(true != z ? TXLiveConstants.PUSH_WARNING_VIDEO_ENCODE_BITRATE_OVERFLOW : 1105);
    }

    @Override // p153l.s6u0
    /* JADX INFO: renamed from: u */
    public final void mo103145u(zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.f106688a.m125047c(101);
                break;
            case 2:
                this.f106688a.m125047c(102);
                break;
            case 3:
                this.f106688a.m125047c(5);
                break;
            case 4:
                this.f106688a.m125047c(103);
                break;
            case 5:
                this.f106688a.m125047c(104);
                break;
            case 6:
                this.f106688a.m125047c(105);
                break;
            case 7:
                this.f106688a.m125047c(106);
                break;
            default:
                this.f106688a.m125047c(4);
                break;
        }
    }

    @Override // p153l.ddu0
    public final void zzh() {
        this.f106688a.m125047c(1109);
    }

    @Override // p153l.k8u0
    public final void zzr() {
        this.f106688a.m125047c(3);
    }

    @Override // p153l.x9u0
    /* JADX INFO: renamed from: x */
    public final void mo107088x(zzbze zzbzeVar) {
    }
}
