package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.LiveCallView;

/* JADX INFO: loaded from: classes5.dex */
public class sy3 extends h4t<pn40, d34> implements l3m {

    /* JADX INFO: renamed from: i */
    public final CallWidgetView f166884i;

    /* JADX INFO: renamed from: j */
    public final LiveCallView f166885j;

    public sy3(bsm bsmVar, CallWidgetView callWidgetView, LiveCallView liveCallView) {
        super(bsmVar);
        this.f166884i = callWidgetView;
        this.f166885j = liveCallView;
        mo51532C(new d34());
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m186593O3(Integer num, MotionType motionType) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m186597V3(soj0 soj0Var) {
        ((d34) this.viewModel).m109865l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((d34) this.viewModel).m109867r();
        duringCreated(m206028F2().CallEvent.anchorCallManageDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.jy3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120279a.m186597V3((soj0) obj);
            }
        }));
        duringCreated(m206028F2().CallEvent.updateCallNum().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ky3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125240a.m186600W3((Integer) obj);
            }
        }));
        duringCreated(m206028F2().CallEvent.anchorCall().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ly3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130491a.m186598T3(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(((pn40) m206027E2()).m170393A2().m175586d()).filter(new w9j() { // from class: l.my3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("obs".equals(((BLive) obj).liveMode));
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.ny3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141077a.m186601X3((BLive) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m186598T3(boolean z) {
        if (z) {
            m186605b4(true);
        } else {
            m186605b4(false);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public void m186599U3(boolean z) {
        if (z) {
            m186604a4(true);
        } else if (((Boolean) m129297F3(new a35(4400))).booleanValue()) {
            new xh0.C21150a(act()).m208740s(this.f188513f.getString(R$string.f47226f2)).m208730i(R$string.f47248g2).m208737p(h1c0.f105394p0).m208738q(R$string.f47555u2).m208736o(new View.OnClickListener() { // from class: l.oy3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f146276a.m186602Y3(view);
                }
            }).m208725d(h1c0.f105343X0).m208726e(R$string.f46842N1).m208722a().m208721g();
        } else {
            m186604a4(false);
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m186600W3(Integer num) {
        ((d34) this.viewModel).m109866m(num.intValue());
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m186601X3(BLive bLive) {
        m186599U3(false);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m186602Y3(View view) {
        m186604a4(false);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m186603Z3(BLiveAnchor bLiveAnchor) {
        m186605b4(bLiveAnchor.liveSetting.callSwitch.f44346on);
    }

    /* JADX INFO: renamed from: a4 */
    public void m186604a4(boolean z) {
        duringCreated(LivingNormalApiProvider.m71304O7(z)).subscribe(ffw.m121194e(new e30() { // from class: l.qy3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156898a.m186603Z3((BLiveAnchor) obj);
            }
        }, new e30() { // from class: l.ry3
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151578h(R$string.f46764J9);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public final void m186605b4(boolean z) {
        h54.m129377d("anchor setCallSwitch enable:" + z);
        ((d34) this.viewModel).m109864k(z);
        jy00 jy00Var = new jy00(z, MotionType.multi_connect);
        V v2 = this.viewModel;
        if (z) {
            jy00Var.m143840b(new a34(((d34) v2).f83457f, this.f166884i, this.f166885j)).m143839a(new f30() { // from class: l.py3
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    sy3.m186593O3((Integer) obj, (MotionType) obj2);
                }
            });
        } else {
            ((d34) v2).m109866m(0);
        }
        m206028F2().MotionEvent.motionSwitch().mo172463j(jy00Var);
    }
}
