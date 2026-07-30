package p149l;

import android.view.View;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.putong.live.livingroom.common.chat.notification.voice.VoiceUserNotificationView;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes4.dex */
public class pzo0<T extends nnn0> extends h4t<T, VoiceUserNotificationView> {

    /* JADX INFO: renamed from: i */
    public final List<h5o0> f151963i;

    public pzo0(bsm<T> bsmVar, VoiceUserNotificationView voiceUserNotificationView) {
        super(bsmVar);
        this.f151963i = new ArrayList();
        mo51532C(voiceUserNotificationView);
    }

    /* JADX INFO: renamed from: K3 */
    public void m172245K3(h5o0 h5o0Var) {
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(100).m206701e(h5o0Var.m129438d()).m206699c());
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m172246L3(h5o0 h5o0Var) {
        if (((VoiceUserNotificationView) this.viewModel).m72772e()) {
            this.f151963i.add(h5o0Var);
        } else {
            m172249O3(h5o0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N3 */
    public void m172248N3() {
        if (this.f151963i.isEmpty()) {
            xdl0.m208344M((View) this.viewModel, false);
        } else {
            m172249O3(this.f151963i.remove(0));
        }
    }

    /* JADX INFO: renamed from: O3 */
    public void m172249O3(h5o0 h5o0Var) {
        ((VoiceUserNotificationView) this.viewModel).m72775k(h5o0Var);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f151963i.clear();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated((C22306c<T>) ((nnn0) m206027E2()).m132160q1().m189151v1()).map(new w9j() { // from class: l.nzo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return new h5o0((LongLinkVirtualVoice.VoiceUserGuide) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.ozo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146487a.m172246L3((h5o0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M3 */
    public void m172247M3() {
    }
}
