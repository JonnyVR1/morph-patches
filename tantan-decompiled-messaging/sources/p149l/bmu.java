package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatUser;
import com.p046p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatInfoView;

/* JADX INFO: loaded from: classes13.dex */
public class bmu extends zeu<LiveVChatInfoView> {
    public bmu(jlu jluVar, LiveVChatInfoView liveVChatInfoView) {
        super(jluVar);
        mo51532C(liveVChatInfoView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public /* synthetic */ void m102693V2(String str) {
        m102695a3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public /* synthetic */ void m102694W2(soj0 soj0Var) {
        ((LiveVChatInfoView) this.viewModel).m69735d();
    }

    /* JADX INFO: renamed from: a3 */
    private void m102695a3() {
        BLiveVideoChat bLiveVideoChatM203901A = m218409H2().m203901A();
        if (!slk0.m184825a(m218409H2().m203901A())) {
            ((LiveVChatInfoView) this.viewModel).m69736e();
            return;
        }
        BLiveVideoChatUser bLiveVideoChatUser = (BLiveVideoChatUser) vwb.m200346r(bLiveVideoChatM203901A.players, new w9j() { // from class: l.amu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f70684a.m102697Y2((BLiveVideoChatUser) obj);
            }
        });
        if (bLiveVideoChatUser != null) {
            ((LiveVChatInfoView) this.viewModel).m69738j(bLiveVideoChatUser, bLiveVideoChatM203901A.startedTime);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m104250o2(m218409H2().m203948z(), false).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.xlu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193502a.m102693V2((String) obj);
            }
        }));
        m218410I2(m218411K2().LiveVideoChatEvent.m69192b(), new e30() { // from class: l.ylu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198937a.m102694W2((soj0) obj);
            }
        });
        m218409H2().m203918R(new e30() { // from class: l.zlu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203661a.m102696X2((Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m102696X2(Long l2) {
        ((LiveVChatInfoView) this.viewModel).m69737i(l2.longValue() * 1000);
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ Boolean m102697Y2(BLiveVideoChatUser bLiveVideoChatUser) {
        return m218414N2() ? Boolean.valueOf("attendee".equals(bLiveVideoChatUser.role)) : Boolean.valueOf("anchor".equals(bLiveVideoChatUser.role));
    }

    /* JADX INFO: renamed from: Z2 */
    public void m102698Z2() {
        BLiveVideoChat bLiveVideoChatM203901A = m218409H2().m203901A();
        if (bLiveVideoChatM203901A == null) {
            return;
        }
        String str = bLiveVideoChatM203901A.getAnchor().userId;
        act().startActivity(LiveWebViewAct.m68883c2(act(), ddv.m111079l(str, m218414N2() ? bLiveVideoChatM203901A.userId : str, bLiveVideoChatM203901A.liveId, bLiveVideoChatM203901A.roomId, mqi0.m155944o() / 1000)));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
    }
}
