package p153l;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.bytedance.bpea.entry.common.DataType;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.other.obs.ObsPreviewView;
import p151v.VImage;

/* JADX INFO: loaded from: classes5.dex */
public class ta50 extends i6t<mu40, ObsPreviewView> {

    /* JADX INFO: renamed from: i */
    public final VImage f172691i;

    /* JADX INFO: renamed from: j */
    public boolean f172692j;

    /* JADX INFO: renamed from: k */
    public boolean f172693k;

    /* JADX INFO: renamed from: l */
    public s950 f172694l;

    public ta50(dum<? extends mu40> dumVar, ObsPreviewView obsPreviewView, VImage vImage) {
        super(dumVar);
        this.f172692j = false;
        this.f172691i = vImage;
        mo52715C(obsPreviewView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ Boolean m189787a4(String str) {
        return Boolean.valueOf(((mu40) m213810E2()).m160110O2());
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().ObsPreviewEvent.pushTypeChanged().m199270g()).filter(new qcj() { // from class: l.ga50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f102959a.m189787a4((String) obj);
            }
        }).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.ka50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124625a.m189789Y3((String) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public final void m189788X3(fa50 fa50Var) {
        if (!((mu40) m213810E2()).m202193m().m146880f()) {
            ((mu40) m213810E2()).mo160116h(j2t.f118089c);
            return;
        }
        bnl0.m105524M(this.f172691i, false);
        ((ObsPreviewView) this.viewModel).m76734q(true);
        ((ObsPreviewView) this.viewModel).m76735s(act(), ((mu40) m213810E2()).mo183435j().streamUrl.push);
        if (this.f172694l == null) {
            this.f172694l = (s950) m153103z2(new s950(this.f196918e, ((ObsPreviewView) this.viewModel).f52079a));
        }
        m213811F2().ObsPlayerEvent.startObsPlay().mo199273j(fa50Var.f97944b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final void m189789Y3(String str) {
        if (((mu40) m213810E2()).m160110O2()) {
            duringCreated(m213811F2().ObsPreviewEvent.onObsLiveStart().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.na50
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f140979a.m189788X3((fa50) obj);
                }
            }));
            duringCreated(m213811F2().ObsPlayerEvent.onVideoEnable().m199270g()).distinctUntilChanged().subscribe(dhw.m115825d(new y20() { // from class: l.oa50
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f145662a.m189790Z3(((Boolean) obj).booleanValue());
                }
            }));
            m113231o2(lifecycle(), false).subscribe(dhw.m115825d(new y20() { // from class: l.pa50
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f151244a.m189791b4((C4470c) obj);
                }
            }));
            duringCreated(((mu40) m213810E2()).m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.qa50
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f156346a.m189794e4((jsv) obj);
                }
            }));
            duringCreated(m213811F2().ObsPreviewEvent.onBackPressed().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ra50
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f161898a.m189795f4((vxj0) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public final void m189790Z3(boolean z) {
        this.f172692j = z;
        ((ObsPreviewView) this.viewModel).m76732n(z);
        ((ObsPreviewView) this.viewModel).m76733p(z);
        if (((mu40) m213810E2()).m202193m().m146880f() || ((mu40) m213810E2()).m202193m().m146877c() || !this.f172693k) {
            return;
        }
        if (z) {
            m213811F2().LivePusherEvent.recoverLive().m199277p();
        } else {
            m213811F2().LivePusherEvent.suspendLive().mo199273j(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m189791b4(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            this.f172693k = true;
        } else if (c4470c == C4470c.f16269k) {
            this.f172693k = false;
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m189792c4(uxj0 uxj0Var) {
        m213811F2().LivePusherEvent.notifyPushStreamReady().m199277p();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m189793d4(Throwable th) {
        m213811F2().LivePusherEvent.notifyPushStreamReady().m199277p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m189794e4(jsv jsvVar) {
        if (jsvVar.m146878d() && this.f172692j) {
            duringCreated(LivingNormalApiProvider.m72783v6(((mu40) m213810E2()).m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.ia50
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f113558a.m189792c4((uxj0) obj);
                }
            }, new y20() { // from class: l.ja50
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f118950a.m189793d4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m189795f4(vxj0 vxj0Var) {
        if (((mu40) m213810E2()).m202193m().m146880f()) {
            m189800k4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m189796g4(BLive bLive) {
        ((mu40) m213810E2()).mo160116h(yct.f198542b);
        ((ObsPreviewView) this.viewModel).m76734q(false);
        bnl0.m105524M(this.f172691i, true);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m189797h4(Throwable th) {
        ((ObsPreviewView) this.viewModel).m76734q(false);
        bnl0.m105524M(this.f172691i, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m189798i4(uxj0 uxj0Var) {
        m213811F2().LivePusherEvent.notifyPushStreamReady().m199277p();
        bnl0.m105524M(this.f172691i, true);
        ((ObsPreviewView) this.viewModel).m76730i();
        ((mu40) m213810E2()).mo160116h(j2t.f118089c);
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m189799j4(Throwable th) {
        m213811F2().LivePusherEvent.notifyPushStreamReady().m199277p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public void m189800k4() {
        duringCreated(LivingNormalApiProvider.m72460L7(((mu40) m213810E2()).m202191k(), true)).subscribe(dhw.m115826e(new y20() { // from class: l.la50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130657a.m189796g4((BLive) obj);
            }
        }, new y20() { // from class: l.ma50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135475a.m189797h4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l4 */
    public void m189801l4() {
        if (this.f172692j) {
            duringCreated(LivingNormalApiProvider.m72783v6(((mu40) m213810E2()).m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.sa50
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f167005a.m189798i4((uxj0) obj);
                }
            }, new y20() { // from class: l.ha50
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f108469a.m189799j4((Throwable) obj);
                }
            }));
        } else {
            o1j0.m165651y("OBS接入后即可开播");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m4 */
    public void m189802m4() {
        ((ClipboardManager) act().getSystemService(DataType.CLIPBOARD)).setPrimaryClip(ClipData.newPlainText("Label", ((mu40) m213810E2()).mo183435j().streamUrl.push));
        o1j0.m165649w(R$string.f48413uc);
    }

    /* JADX INFO: renamed from: n4 */
    public void m189803n4() {
        String str = efv.f93864u;
        Act act = this.f196919f;
        act.startActivity(LiveWebViewAct.m70066d2(act, str));
    }
}
