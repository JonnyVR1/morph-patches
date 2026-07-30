package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatPreviewView;

/* JADX INFO: loaded from: classes9.dex */
public class zvk0 extends ahu<LiveVChatPreviewView> {
    public zvk0(knu knuVar, LiveVChatPreviewView liveVChatPreviewView) {
        super(knuVar);
        mo52715C(liveVChatPreviewView);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        if (!m97930M2().f127642e.f195483n || m97926H2().m212309B() == null || "stopped".equals(m97926H2().m212309B().status)) {
            ((LiveVChatPreviewView) this.viewModel).m70963p0(true);
            m97926H2().m212351u().m129893a().mo95595F0(act(), null);
            e0m e0mVarM129897e = m97926H2().m212351u().m129897e();
            if (e0mVarM129897e != null) {
                e0mVarM129897e.mo118891b(((LiveVChatPreviewView) this.viewModel).f46266d);
                e0mVarM129897e.mo118890a();
            }
        }
    }

    /* JADX INFO: renamed from: T2 */
    public void m221780T2() {
        m97929L2(true);
    }

    /* JADX INFO: renamed from: U2 */
    public void m221781U2() {
        m97928K2().LiveVideoChatEvent.m70379f().m199277p();
    }

    /* JADX INFO: renamed from: V2 */
    public final void m221782V2(BLiveVideoChatLive bLiveVideoChatLive) {
        m97926H2().m212351u().m129893a().mo95601a();
        m97926H2().m212351u().m129897e().mo118892c();
        ((LiveVChatPreviewView) this.viewModel).m70963p0(false);
        m97928K2().LiveVideoChatEvent.m70383j().mo199273j(bLiveVideoChatLive);
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ void m221783W2(Throwable th) {
        m97926H2().m212335b0(this, th, "");
    }

    /* JADX INFO: renamed from: X2 */
    public void m221784X2() {
        m113231o2(jwu.m147248W(), false).subscribe(dhw.m115826e(new y20() { // from class: l.xvk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196408a.m221782V2((BLiveVideoChatLive) obj);
            }
        }, new y20() { // from class: l.yvk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201728a.m221783W2((Throwable) obj);
            }
        }));
    }
}
