package p002l;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.other.obs.ObsPreviewView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.webview.LiveWebViewAct;
import l.bwr;
import l.ddv;
import l.e30;
import l.ffw;
import l.lsi0;
import l.roj0;
import l.soj0;
import l.w9j;
import l.xdl0;
import rx.c;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class e250 extends h4t<yl40, ObsPreviewView> {

    /* JADX INFO: renamed from: i */
    public final VImage f9545i;

    /* JADX INFO: renamed from: j */
    public boolean f9546j;

    /* JADX INFO: renamed from: k */
    public boolean f9547k;

    /* JADX INFO: renamed from: l */
    public d150 f9548l;

    public e250(bsm<? extends yl40> bsmVar, ObsPreviewView obsPreviewView, VImage vImage) {
        super(bsmVar);
        this.f9546j = false;
        this.f9545i = vImage;
        C(obsPreviewView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ Boolean m12128a4(String str) {
        return Boolean.valueOf(((yl40) m25547E2()).m26792O2());
    }

    /* JADX INFO: renamed from: T */
    public void m12129T() {
        super.T();
        duringCreated((c) m25548F2().ObsPreviewEvent.pushTypeChanged().g()).filter(new w9j() { // from class: l.r150
            public final Object call(Object obj) {
                return this.f18314a.m12128a4((String) obj);
            }
        }).take(1).subscribe(ffw.d(new e30() { // from class: l.v150
            public final void call(Object obj) {
                this.f20924a.m12131Y3((String) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public final void m12130X3(q150 q150Var) {
        if (!((yl40) m25547E2()).m17237m().m15303f()) {
            ((yl40) m25547E2()).mo17233h(i0t.f12387c);
            return;
        }
        xdl0.M(this.f9545i, false);
        ((ObsPreviewView) ((bwr) this).viewModel).m9188q(true);
        ((ObsPreviewView) ((bwr) this).viewModel).m9189s(act(), ((yl40) m25547E2()).m17234j().streamUrl.push);
        if (this.f9548l == null) {
            this.f9548l = (d150) z2(new d150(this.f22036e, ((ObsPreviewView) ((bwr) this).viewModel).f7273a));
        }
        m25548F2().ObsPlayerEvent.startObsPlay().j(q150Var.f17754b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final void m12131Y3(String str) {
        if (((yl40) m25547E2()).m26792O2()) {
            duringCreated((c) m25548F2().ObsPreviewEvent.onObsLiveStart().g()).subscribe(ffw.d(new e30() { // from class: l.y150
                public final void call(Object obj) {
                    this.f22596a.m12130X3((q150) obj);
                }
            }));
            duringCreated((c) m25548F2().ObsPlayerEvent.onVideoEnable().g()).distinctUntilChanged().subscribe(ffw.d(new e30() { // from class: l.z150
                public final void call(Object obj) {
                    this.f23173a.m12132Z3(((Boolean) obj).booleanValue());
                }
            }));
            o2(lifecycle(), false).subscribe(ffw.d(new e30() { // from class: l.a250
                public final void call(Object obj) {
                    this.f7342a.m12133b4((com.p1.mobile.android.app.c) obj);
                }
            }));
            duringCreated(((yl40) m25547E2()).m17236l()).subscribe(ffw.d(new e30() { // from class: l.b250
                public final void call(Object obj) {
                    this.f7959a.m12136e4((iqv) obj);
                }
            }));
            duringCreated((c) m25548F2().ObsPreviewEvent.onBackPressed().g()).subscribe(ffw.d(new e30() { // from class: l.c250
                public final void call(Object obj) {
                    this.f8465a.m12137f4((soj0) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public final void m12132Z3(boolean z) {
        this.f9546j = z;
        ((ObsPreviewView) ((bwr) this).viewModel).m9186n(z);
        ((ObsPreviewView) ((bwr) this).viewModel).m9187p(z);
        if (((yl40) m25547E2()).m17237m().m15303f() || ((yl40) m25547E2()).m17237m().m15300c() || !this.f9547k) {
            return;
        }
        if (z) {
            m25548F2().LivePusherEvent.recoverLive().p();
        } else {
            m25548F2().LivePusherEvent.suspendLive().j(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m12133b4(com.p1.mobile.android.app.c cVar) {
        if (cVar == com.p1.mobile.android.app.c.i) {
            this.f9547k = true;
        } else if (cVar == com.p1.mobile.android.app.c.k) {
            this.f9547k = false;
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m12134c4(roj0 roj0Var) {
        m25548F2().LivePusherEvent.notifyPushStreamReady().p();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m12135d4(Throwable th) {
        m25548F2().LivePusherEvent.notifyPushStreamReady().p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m12136e4(iqv iqvVar) {
        if (iqvVar.m15301d() && this.f9546j) {
            duringCreated(LivingNormalApiProvider.m4966v6(((yl40) m25547E2()).m17235k())).subscribe(ffw.e(new e30() { // from class: l.t150
                public final void call(Object obj) {
                    this.f19357a.m12134c4((roj0) obj);
                }
            }, new e30() { // from class: l.u150
                public final void call(Object obj) {
                    this.f20453a.m12135d4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m12137f4(soj0 soj0Var) {
        if (((yl40) m25547E2()).m17237m().m15303f()) {
            m12142k4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m12138g4(BLive bLive) {
        ((yl40) m25547E2()).mo17233h(xat.f22204b);
        ((ObsPreviewView) ((bwr) this).viewModel).m9188q(false);
        xdl0.M(this.f9545i, true);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m12139h4(Throwable th) {
        ((ObsPreviewView) ((bwr) this).viewModel).m9188q(false);
        xdl0.M(this.f9545i, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m12140i4(roj0 roj0Var) {
        m25548F2().LivePusherEvent.notifyPushStreamReady().p();
        xdl0.M(this.f9545i, true);
        ((ObsPreviewView) ((bwr) this).viewModel).m9183i();
        ((yl40) m25547E2()).mo17233h(i0t.f12387c);
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m12141j4(Throwable th) {
        m25548F2().LivePusherEvent.notifyPushStreamReady().p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public void m12142k4() {
        duringCreated(LivingNormalApiProvider.m4643L7(((yl40) m25547E2()).m17235k(), true)).subscribe(ffw.e(new e30() { // from class: l.w150
            public final void call(Object obj) {
                this.f21409a.m12138g4((BLive) obj);
            }
        }, new e30() { // from class: l.x150
            public final void call(Object obj) {
                this.f22071a.m12139h4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l4 */
    public void m12143l4() {
        if (this.f9546j) {
            duringCreated(LivingNormalApiProvider.m4966v6(((yl40) m25547E2()).m17235k())).subscribe(ffw.e(new e30() { // from class: l.d250
                public final void call(Object obj) {
                    this.f9042a.m12140i4((roj0) obj);
                }
            }, new e30() { // from class: l.s150
                public final void call(Object obj) {
                    this.f18754a.m12141j4((Throwable) obj);
                }
            }));
        } else {
            lsi0.y("OBS接入后即可开播");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m4 */
    public void m12144m4() {
        ((ClipboardManager) act().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Label", ((yl40) m25547E2()).m17234j().streamUrl.push));
        lsi0.w(R$string.f3607uc);
    }

    /* JADX INFO: renamed from: n4 */
    public void m12145n4() {
        String str = ddv.u;
        Act act = this.f22037f;
        act.startActivity(LiveWebViewAct.c2(act, str));
    }
}
