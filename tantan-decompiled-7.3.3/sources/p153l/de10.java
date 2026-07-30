package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkPanel;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkPanelUser;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.C13063a;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class de10 extends hj2<oo2, C13063a> {
    public de10(dum dumVar) {
        super(dumVar);
        m135319L3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m115382a4(vxj0 vxj0Var) {
        m115384V3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m115383b4(vxj0 vxj0Var) {
        m115384V3();
    }

    /* JADX INFO: renamed from: V3 */
    public final void m115384V3() {
        BLiveMultiCall bLiveMultiCallM103848z = bf10.m103848z(this);
        if (bLiveMultiCallM103848z == null) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m72755s5(bLiveMultiCallM103848z.ownerLiveId)).subscribe(dhw.m115826e(new y20() { // from class: l.ae10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f70756a.m115386X3((BLiveMultiPkPanel) obj);
            }
        }, new y20() { // from class: l.be10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76324a.m115387Y3((Throwable) obj);
            }
        }));
    }

    @Override // p153l.hj2
    /* JADX INFO: renamed from: W3, reason: merged with bridge method [inline-methods] */
    public C13063a mo76862K3() {
        return new C13063a();
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m115386X3(BLiveMultiPkPanel bLiveMultiPkPanel) {
        if (bLiveMultiPkPanel.users.size() < 4) {
            int size = 4 - bLiveMultiPkPanel.users.size();
            for (int i = 0; i < size; i++) {
                BLiveMultiPkPanelUser bLiveMultiPkPanelUser = new BLiveMultiPkPanelUser();
                bLiveMultiPkPanelUser.f45256id = User.ID_TEAM_ACCOUNT;
                bLiveMultiPkPanel.users.add(bLiveMultiPkPanelUser);
            }
        }
        ((C13063a) this.viewModel).m77042C(bLiveMultiPkPanel);
        mo135321N3();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m115387Y3(Throwable th) {
        bf10.m103834j(th);
        ((C13063a) this.viewModel).mo72910j();
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m115388Z3(uxj0 uxj0Var) {
        ((C13063a) this.viewModel).mo72910j();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m115389c4(LongLinkLiveMultiPk.MultiPk multiPk) {
        ((C13063a) this.viewModel).mo72910j();
    }

    /* JADX INFO: renamed from: d4 */
    public void m115390d4() {
        if (bf10.m103807M(this)) {
            m213811F2().MultiCallEvent.openMultiCallWithTab().mo199273j(4);
            ((C13063a) this.viewModel).mo72910j();
        }
    }

    /* JADX INFO: renamed from: e4 */
    public void m115391e4() {
        m213811F2().MultiCallEvent.clickPkCreateSetting().m199277p();
    }

    /* JADX INFO: renamed from: f4 */
    public void m115392f4(List<String> list) {
        BLiveMultiCall bLiveMultiCallM103848z = bf10.m103848z(this);
        if (bLiveMultiCallM103848z != null) {
            duringCreated(LivingNormalApiProvider.m72451K7(bLiveMultiCallM103848z.ownerLiveId, list)).subscribe(dhw.m115826e(new y20() { // from class: l.ce10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f81308a.m115388Z3((uxj0) obj);
                }
            }, new z2e0()));
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().MultiCallEvent.clickBottomPkIcon().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.xd10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193509a.m115382a4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().MultiCallEvent.clickPkSettingChange().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.yd10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198567a.m115383b4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().MultiPkEventGroup.multiPkOnStart().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.zd10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203850a.m115389c4((LongLinkLiveMultiPk.MultiPk) obj);
            }
        }));
    }
}
