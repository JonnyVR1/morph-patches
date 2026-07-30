package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatPreviewView;

/* JADX INFO: loaded from: classes13.dex */
public class tmk0 extends zeu<LiveVChatPreviewView> {
    public tmk0(jlu jluVar, LiveVChatPreviewView liveVChatPreviewView) {
        super(jluVar);
        mo51532C(liveVChatPreviewView);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        if (!m218413M2().f118588e.f187009n || m218409H2().m203902B() == null || "stopped".equals(m218409H2().m203902B().status)) {
            ((LiveVChatPreviewView) this.viewModel).m69780p0(true);
            m218409H2().m203944u().m100102a().mo99452F0(act(), null);
            lxl lxlVarM100106e = m218409H2().m203944u().m100106e();
            if (lxlVarM100106e != null) {
                lxlVarM100106e.mo128518b(((LiveVChatPreviewView) this.viewModel).f45418d);
                lxlVarM100106e.mo128517a();
            }
        }
    }

    /* JADX INFO: renamed from: T2 */
    public void m189699T2() {
        m218412L2(true);
    }

    /* JADX INFO: renamed from: U2 */
    public void m189700U2() {
        m218411K2().LiveVideoChatEvent.m69196f().m172467p();
    }

    /* JADX INFO: renamed from: V2 */
    public final void m189701V2(BLiveVideoChatLive bLiveVideoChatLive) {
        m218409H2().m203944u().m100102a().mo99453a();
        m218409H2().m203944u().m100106e().mo128519c();
        ((LiveVChatPreviewView) this.viewModel).m69780p0(false);
        m218411K2().LiveVideoChatEvent.m69200j().mo172463j(bLiveVideoChatLive);
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ void m189702W2(Throwable th) {
        m218409H2().m203928b0(this, th, "");
    }

    /* JADX INFO: renamed from: X2 */
    public void m189703X2() {
        m104250o2(iuu.m138462W(), false).subscribe(ffw.m121194e(new e30() { // from class: l.rmk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160104a.m189701V2((BLiveVideoChatLive) obj);
            }
        }, new e30() { // from class: l.smk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165358a.m189702W2((Throwable) obj);
            }
        }));
    }
}
