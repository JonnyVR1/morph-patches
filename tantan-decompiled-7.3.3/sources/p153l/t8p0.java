package p153l;

import android.view.View;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.putong.live.livingroom.common.chat.notification.voice.VoiceUserNotificationView;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes4.dex */
public class t8p0<T extends rwn0> extends i6t<T, VoiceUserNotificationView> {

    /* JADX INFO: renamed from: i */
    public final List<leo0> f172561i;

    public t8p0(dum<T> dumVar, VoiceUserNotificationView voiceUserNotificationView) {
        super(dumVar);
        this.f172561i = new ArrayList();
        mo52715C(voiceUserNotificationView);
    }

    /* JADX INFO: renamed from: K3 */
    public void m189681K3(leo0 leo0Var) {
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(100).m103154e(leo0Var.m153920d()).m103152c());
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m189682L3(leo0 leo0Var) {
        if (((VoiceUserNotificationView) this.viewModel).m73955e()) {
            this.f172561i.add(leo0Var);
        } else {
            m189685O3(leo0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N3 */
    public void m189684N3() {
        if (this.f172561i.isEmpty()) {
            bnl0.m105524M((View) this.viewModel, false);
        } else {
            m189685O3(this.f172561i.remove(0));
        }
    }

    /* JADX INFO: renamed from: O3 */
    public void m189685O3(leo0 leo0Var) {
        ((VoiceUserNotificationView) this.viewModel).m73958k(leo0Var);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f172561i.clear();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated((C22421c<T>) ((rwn0) m213810E2()).m168545q1().m98333v1()).map(new qcj() { // from class: l.r8p0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return new leo0((LongLinkVirtualVoice.VoiceUserGuide) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.s8p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166839a.m189682L3((leo0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M3 */
    public void m189683M3() {
    }
}
