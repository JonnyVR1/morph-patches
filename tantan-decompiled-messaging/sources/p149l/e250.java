package p149l;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.bytedance.bpea.entry.common.DataType;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.other.obs.ObsPreviewView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class e250 extends h4t<yl40, ObsPreviewView> {

    /* JADX INFO: renamed from: i */
    public final VImage f88883i;

    /* JADX INFO: renamed from: j */
    public boolean f88884j;

    /* JADX INFO: renamed from: k */
    public boolean f88885k;

    /* JADX INFO: renamed from: l */
    public d150 f88886l;

    public e250(bsm<? extends yl40> bsmVar, ObsPreviewView obsPreviewView, VImage vImage) {
        super(bsmVar);
        this.f88884j = false;
        this.f88883i = vImage;
        mo51532C(obsPreviewView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ Boolean m114471a4(String str) {
        return Boolean.valueOf(((yl40) m206027E2()).m215221O2());
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().ObsPreviewEvent.pushTypeChanged().m172460g()).filter(new w9j() { // from class: l.r150
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f157238a.m114471a4((String) obj);
            }
        }).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.v150
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179198a.m114473Y3((String) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public final void m114472X3(q150 q150Var) {
        if (!((yl40) m206027E2()).m149816m().m137799f()) {
            ((yl40) m206027E2()).mo149812h(i0t.f110377c);
            return;
        }
        xdl0.m208344M(this.f88883i, false);
        ((ObsPreviewView) this.viewModel).m75551q(true);
        ((ObsPreviewView) this.viewModel).m75552s(act(), ((yl40) m206027E2()).mo149813j().streamUrl.push);
        if (this.f88886l == null) {
            this.f88886l = (d150) m144512z2(new d150(this.f188512e, ((ObsPreviewView) this.viewModel).f51231a));
        }
        m206028F2().ObsPlayerEvent.startObsPlay().mo172463j(q150Var.f152106b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final void m114473Y3(String str) {
        if (((yl40) m206027E2()).m215221O2()) {
            duringCreated(m206028F2().ObsPreviewEvent.onObsLiveStart().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.y150
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f195383a.m114472X3((q150) obj);
                }
            }));
            duringCreated(m206028F2().ObsPlayerEvent.onVideoEnable().m172460g()).distinctUntilChanged().subscribe(ffw.m121193d(new e30() { // from class: l.z150
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f201048a.m114474Z3(((Boolean) obj).booleanValue());
                }
            }));
            m104250o2(lifecycle(), false).subscribe(ffw.m121193d(new e30() { // from class: l.a250
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f67229a.m114475b4((C4319c) obj);
                }
            }));
            duringCreated(((yl40) m206027E2()).m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.b250
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f72655a.m114478e4((iqv) obj);
                }
            }));
            duringCreated(m206028F2().ObsPreviewEvent.onBackPressed().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.c250
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f78331a.m114479f4((soj0) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public final void m114474Z3(boolean z) {
        this.f88884j = z;
        ((ObsPreviewView) this.viewModel).m75549n(z);
        ((ObsPreviewView) this.viewModel).m75550p(z);
        if (((yl40) m206027E2()).m149816m().m137799f() || ((yl40) m206027E2()).m149816m().m137796c() || !this.f88885k) {
            return;
        }
        if (z) {
            m206028F2().LivePusherEvent.recoverLive().m172467p();
        } else {
            m206028F2().LivePusherEvent.suspendLive().mo172463j(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m114475b4(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            this.f88885k = true;
        } else if (c4319c == C4319c.f15550k) {
            this.f88885k = false;
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m114476c4(roj0 roj0Var) {
        m206028F2().LivePusherEvent.notifyPushStreamReady().m172467p();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m114477d4(Throwable th) {
        m206028F2().LivePusherEvent.notifyPushStreamReady().m172467p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m114478e4(iqv iqvVar) {
        if (iqvVar.m137797d() && this.f88884j) {
            duringCreated(LivingNormalApiProvider.m71600v6(((yl40) m206027E2()).m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.t150
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f167288a.m114476c4((roj0) obj);
                }
            }, new e30() { // from class: l.u150
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f172972a.m114477d4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m114479f4(soj0 soj0Var) {
        if (((yl40) m206027E2()).m149816m().m137799f()) {
            m114484k4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m114480g4(BLive bLive) {
        ((yl40) m206027E2()).mo149812h(xat.f191815b);
        ((ObsPreviewView) this.viewModel).m75551q(false);
        xdl0.m208344M(this.f88883i, true);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m114481h4(Throwable th) {
        ((ObsPreviewView) this.viewModel).m75551q(false);
        xdl0.m208344M(this.f88883i, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m114482i4(roj0 roj0Var) {
        m206028F2().LivePusherEvent.notifyPushStreamReady().m172467p();
        xdl0.m208344M(this.f88883i, true);
        ((ObsPreviewView) this.viewModel).m75547i();
        ((yl40) m206027E2()).mo149812h(i0t.f110377c);
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m114483j4(Throwable th) {
        m206028F2().LivePusherEvent.notifyPushStreamReady().m172467p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public void m114484k4() {
        duringCreated(LivingNormalApiProvider.m71277L7(((yl40) m206027E2()).m149814k(), true)).subscribe(ffw.m121194e(new e30() { // from class: l.w150
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183973a.m114480g4((BLive) obj);
            }
        }, new e30() { // from class: l.x150
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f189017a.m114481h4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l4 */
    public void m114485l4() {
        if (this.f88884j) {
            duringCreated(LivingNormalApiProvider.m71600v6(((yl40) m206027E2()).m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.d250
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f83328a.m114482i4((roj0) obj);
                }
            }, new e30() { // from class: l.s150
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f161864a.m114483j4((Throwable) obj);
                }
            }));
        } else {
            lsi0.m151595y("OBS接入后即可开播");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m4 */
    public void m114486m4() {
        ((ClipboardManager) act().getSystemService(DataType.CLIPBOARD)).setPrimaryClip(ClipData.newPlainText("Label", ((yl40) m206027E2()).mo149813j().streamUrl.push));
        lsi0.m151593w(R$string.f47565uc);
    }

    /* JADX INFO: renamed from: n4 */
    public void m114487n4() {
        String str = ddv.f85671u;
        Act act = this.f188513f;
        act.startActivity(LiveWebViewAct.m68883c2(act, str));
    }
}
