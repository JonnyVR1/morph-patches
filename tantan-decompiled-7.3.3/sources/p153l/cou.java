package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatUser;
import com.p051p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatInfoView;

/* JADX INFO: loaded from: classes9.dex */
public class cou extends ahu<LiveVChatInfoView> {
    public cou(knu knuVar, LiveVChatInfoView liveVChatInfoView) {
        super(knuVar);
        mo52715C(liveVChatInfoView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public /* synthetic */ void m111703V2(String str) {
        m111705a3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public /* synthetic */ void m111704W2(vxj0 vxj0Var) {
        ((LiveVChatInfoView) this.viewModel).m70918d();
    }

    /* JADX INFO: renamed from: a3 */
    private void m111705a3() {
        BLiveVideoChat bLiveVideoChatM212308A = m97926H2().m212308A();
        if (!yuk0.m217435a(m97926H2().m212308A())) {
            ((LiveVChatInfoView) this.viewModel).m70919e();
            return;
        }
        BLiveVideoChatUser bLiveVideoChatUser = (BLiveVideoChatUser) jyb.m147529r(bLiveVideoChatM212308A.players, new qcj() { // from class: l.bou
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f77703a.m111707Y2((BLiveVideoChatUser) obj);
            }
        });
        if (bLiveVideoChatUser != null) {
            ((LiveVChatInfoView) this.viewModel).m70921j(bLiveVideoChatUser, bLiveVideoChatM212308A.startedTime);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m113231o2(m97926H2().m212355z(), false).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.ynu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200927a.m111703V2((String) obj);
            }
        }));
        m97927I2(m97928K2().LiveVideoChatEvent.m70375b(), new y20() { // from class: l.znu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205252a.m111704W2((vxj0) obj);
            }
        });
        m97926H2().m212325R(new y20() { // from class: l.aou
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72639a.m111706X2((Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m111706X2(Long l2) {
        ((LiveVChatInfoView) this.viewModel).m70920i(l2.longValue() * 1000);
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ Boolean m111707Y2(BLiveVideoChatUser bLiveVideoChatUser) {
        return m97931N2() ? Boolean.valueOf("attendee".equals(bLiveVideoChatUser.role)) : Boolean.valueOf("anchor".equals(bLiveVideoChatUser.role));
    }

    /* JADX INFO: renamed from: Z2 */
    public void m111708Z2() {
        BLiveVideoChat bLiveVideoChatM212308A = m97926H2().m212308A();
        if (bLiveVideoChatM212308A == null) {
            return;
        }
        String str = bLiveVideoChatM212308A.getAnchor().userId;
        act().startActivity(LiveWebViewAct.m70066d2(act(), efv.m120734l(str, m97931N2() ? bLiveVideoChatM212308A.userId : str, bLiveVideoChatM212308A.liveId, bLiveVideoChatM212308A.roomId, pzi0.m174454o() / 1000)));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
    }
}
