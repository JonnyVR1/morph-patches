package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.videoChat.LongLinkVideoChat;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatSummary;
import com.p051p1.mobile.putong.live.base.webview.LiveWebViewAct;

/* JADX INFO: loaded from: classes9.dex */
public class sl0 extends ahu<wl0> {
    public sl0(knu knuVar) {
        super(knuVar);
        mo52715C(new wl0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public /* synthetic */ void m186545V2(String str) {
        if (yuk0.m217441g(m97926H2().m212308A()) && m97926H2().m212308A().called) {
            if (TextUtils.isEmpty(m97926H2().m212308A().endTipMessage)) {
                m186549Y2();
            } else {
                m97926H2().m212334a0(act(), m97926H2().m212308A().endTipMessage, new x20() { // from class: l.ql0
                    @Override // p153l.x20
                    public final void call() {
                        this.f158194a.m186549Y2();
                    }
                });
            }
        }
        if (yuk0.m217440f(m97926H2().m212308A())) {
            ((wl0) this.viewModel).m206885f();
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m113231o2(m97926H2().m212355z(), false).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.pl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152976a.m186545V2((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U2 */
    public void m186546U2() {
        if (TextUtils.equals(m97926H2().m212308A().endType, LongLinkVideoChat.VideoChat.EndType.banAnchor.name())) {
            m97929L2(true);
        }
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ void m186547W2(BLiveVideoChatSummary bLiveVideoChatSummary) {
        ((wl0) this.viewModel).m206889l(act(), bLiveVideoChatSummary);
    }

    /* JADX INFO: renamed from: X2 */
    public void m186548X2(String str, String str2, String str3, String str4, long j) {
        act().startActivity(LiveWebViewAct.m70066d2(act(), efv.m120734l(str, str2, str3, str4, j)));
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m186549Y2() {
        if (TextUtils.isEmpty(m97926H2().m212346p())) {
            return;
        }
        duringCreated(jwu.m147236K(m97926H2().m212346p())).subscribe(dhw.m115829h(new y20() { // from class: l.rl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163665a.m186547W2((BLiveVideoChatSummary) obj);
            }
        }));
    }
}
