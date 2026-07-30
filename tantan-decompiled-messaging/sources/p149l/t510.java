package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiPkPanel;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiPkPanelUser;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.C12900a;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class t510 extends zi2<ho2, C12900a> {
    public t510(bsm bsmVar) {
        super(bsmVar);
        m218910L3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m187260a4(soj0 soj0Var) {
        m187262V3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m187261b4(soj0 soj0Var) {
        m187262V3();
    }

    /* JADX INFO: renamed from: V3 */
    public final void m187262V3() {
        BLiveMultiCall bLiveMultiCallM178019z = r610.m178019z(this);
        if (bLiveMultiCallM178019z == null) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m71572s5(bLiveMultiCallM178019z.ownerLiveId)).subscribe(ffw.m121194e(new e30() { // from class: l.q510
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152722a.m187264X3((BLiveMultiPkPanel) obj);
            }
        }, new e30() { // from class: l.r510
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157754a.m187265Y3((Throwable) obj);
            }
        }));
    }

    @Override // p149l.zi2
    /* JADX INFO: renamed from: W3, reason: merged with bridge method [inline-methods] */
    public C12900a mo75679K3() {
        return new C12900a();
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m187264X3(BLiveMultiPkPanel bLiveMultiPkPanel) {
        if (bLiveMultiPkPanel.users.size() < 4) {
            int size = 4 - bLiveMultiPkPanel.users.size();
            for (int i = 0; i < size; i++) {
                BLiveMultiPkPanelUser bLiveMultiPkPanelUser = new BLiveMultiPkPanelUser();
                bLiveMultiPkPanelUser.f44408id = User.ID_TEAM_ACCOUNT;
                bLiveMultiPkPanel.users.add(bLiveMultiPkPanelUser);
            }
        }
        ((C12900a) this.viewModel).m75859C(bLiveMultiPkPanel);
        mo168244N3();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m187265Y3(Throwable th) {
        r610.m178005j(th);
        ((C12900a) this.viewModel).mo71727j();
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m187266Z3(roj0 roj0Var) {
        ((C12900a) this.viewModel).mo71727j();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m187267c4(LongLinkLiveMultiPk.MultiPk multiPk) {
        ((C12900a) this.viewModel).mo71727j();
    }

    /* JADX INFO: renamed from: d4 */
    public void m187268d4() {
        if (r610.m177978M(this)) {
            m206028F2().MultiCallEvent.openMultiCallWithTab().mo172463j(4);
            ((C12900a) this.viewModel).mo71727j();
        }
    }

    /* JADX INFO: renamed from: e4 */
    public void m187269e4() {
        m206028F2().MultiCallEvent.clickPkCreateSetting().m172467p();
    }

    /* JADX INFO: renamed from: f4 */
    public void m187270f4(List<String> list) {
        BLiveMultiCall bLiveMultiCallM178019z = r610.m178019z(this);
        if (bLiveMultiCallM178019z != null) {
            duringCreated(LivingNormalApiProvider.m71268K7(bLiveMultiCallM178019z.ownerLiveId, list)).subscribe(ffw.m121194e(new e30() { // from class: l.s510
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f162479a.m187266Z3((roj0) obj);
                }
            }, new vud0()));
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().MultiCallEvent.clickBottomPkIcon().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.n510
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137182a.m187260a4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().MultiCallEvent.clickPkSettingChange().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.o510
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141866a.m187261b4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().MultiPkEventGroup.multiPkOnStart().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.p510
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147252a.m187267c4((LongLinkLiveMultiPk.MultiPk) obj);
            }
        }));
    }
}
