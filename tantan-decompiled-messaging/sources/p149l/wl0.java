package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.videoChat.LongLinkVideoChat;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatSummary;
import com.p046p1.mobile.putong.live.base.webview.LiveWebViewAct;

/* JADX INFO: loaded from: classes13.dex */
public class wl0 extends zeu<am0> {
    public wl0(jlu jluVar) {
        super(jluVar);
        mo51532C(new am0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public /* synthetic */ void m203704V2(String str) {
        if (slk0.m184831g(m218409H2().m203901A()) && m218409H2().m203901A().called) {
            if (TextUtils.isEmpty(m218409H2().m203901A().endTipMessage)) {
                m203708Y2();
            } else {
                m218409H2().m203927a0(act(), m218409H2().m203901A().endTipMessage, new d30() { // from class: l.ul0
                    @Override // p149l.d30
                    public final void call() {
                        this.f177004a.m203708Y2();
                    }
                });
            }
        }
        if (slk0.m184830f(m218409H2().m203901A())) {
            ((am0) this.viewModel).m97461f();
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m104250o2(m218409H2().m203948z(), false).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.tl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170934a.m203704V2((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U2 */
    public void m203705U2() {
        if (TextUtils.equals(m218409H2().m203901A().endType, LongLinkVideoChat.VideoChat.EndType.banAnchor.name())) {
            m218412L2(true);
        }
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ void m203706W2(BLiveVideoChatSummary bLiveVideoChatSummary) {
        ((am0) this.viewModel).m97465l(act(), bLiveVideoChatSummary);
    }

    /* JADX INFO: renamed from: X2 */
    public void m203707X2(String str, String str2, String str3, String str4, long j) {
        act().startActivity(LiveWebViewAct.m68883c2(act(), ddv.m111079l(str, str2, str3, str4, j)));
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m203708Y2() {
        if (TextUtils.isEmpty(m218409H2().m203939p())) {
            return;
        }
        duringCreated(iuu.m138450K(m218409H2().m203939p())).subscribe(ffw.m121197h(new e30() { // from class: l.vl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181872a.m203706W2((BLiveVideoChatSummary) obj);
            }
        }));
    }
}
