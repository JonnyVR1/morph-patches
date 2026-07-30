package p002l;

import com.p000p1.mobile.putong.live.livingroom.common.chat.notification.voice.VoiceUserNotificationView;
import com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import java.util.ArrayList;
import java.util.List;
import l.bwr;
import l.e30;
import l.ffw;
import l.nnn0;
import l.w9j;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pzo0<T extends nnn0> extends h4t<T, VoiceUserNotificationView> {

    /* JADX INFO: renamed from: i */
    public final List<h5o0> f17732i;

    public pzo0(bsm<T> bsmVar, VoiceUserNotificationView voiceUserNotificationView) {
        super(bsmVar);
        this.f17732i = new ArrayList();
        C(voiceUserNotificationView);
    }

    /* JADX INFO: renamed from: K3 */
    public void m20765K3(h5o0 h5o0Var) {
        m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(100).m25610e(h5o0Var.m14213d()).m25608c());
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m20766L3(h5o0 h5o0Var) {
        if (((VoiceUserNotificationView) ((bwr) this).viewModel).m6279e()) {
            this.f17732i.add(h5o0Var);
        } else {
            m20769O3(h5o0Var);
        }
    }

    /* JADX INFO: renamed from: N3 */
    public void m20768N3() {
        if (this.f17732i.isEmpty()) {
            xdl0.M(((bwr) this).viewModel, false);
        } else {
            m20769O3(this.f17732i.remove(0));
        }
    }

    /* JADX INFO: renamed from: O3 */
    public void m20769O3(h5o0 h5o0Var) {
        ((VoiceUserNotificationView) ((bwr) this).viewModel).m6282k(h5o0Var);
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f17732i.clear();
    }

    /* JADX INFO: renamed from: t */
    public void m20770t() {
        super.t();
        duringCreated(((nnn0) m25547E2()).m14596q1().v1()).map(new w9j() { // from class: l.nzo0
            public final Object call(Object obj) {
                return new h5o0((LongLinkVirtualVoice.VoiceUserGuide) obj);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.ozo0
            public final void call(Object obj) {
                this.f16920a.m20766L3((h5o0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M3 */
    public void m20767M3() {
    }
}
