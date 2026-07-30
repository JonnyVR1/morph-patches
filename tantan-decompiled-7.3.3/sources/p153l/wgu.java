package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import com.p051p1.mobile.putong.live.external.internal.vchat.C12668a;
import com.p051p1.mobile.putong.live.external.internal.vchat.LiveVChatAct;
import com.p051p1.mobile.putong.live.external.internal.vchat.end.LiveVChatEndAct;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: classes9.dex */
public class wgu extends ahu<wgu> implements iam<wgu> {

    /* JADX INFO: renamed from: l.wgu$a */
    public class C21104a implements ga1 {
        public C21104a() {
        }
    }

    public wgu(knu knuVar) {
        super(knuVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public void m206259V2(String str) {
        if (yuk0.m217436b(m97926H2().m212308A())) {
            m97926H2().m212337d0(m97926H2().m212308A().liveId, m97926H2().m212308A().roomId);
        }
        if (yuk0.m217441g(m97926H2().m212308A())) {
            m206262W2();
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        pb1.m171472b().mo171477f(LiveVChatAct.f45894i, AudioBusinessType.VIDEO_CHAT, new C21104a());
        wgt.m206249p(iit.INSTANCE.m140132R(), act(), new Object[0]).subscribe(dhw.m115824c());
        m113231o2(m97926H2().m212355z(), false).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.ugu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178934a.m206259V2((String) obj);
            }
        }));
        m113231o2(m97926H2().f195472c.m120391l().f71679V1, false).subscribe(dhw.m115829h(new y20() { // from class: l.vgu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184062a.m206263X2((liveAuthMessageNew.MultiDevice) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U2 */
    public final void m206261U2() {
        nsh0.m164608j("videoChat", "audience handleMultiDeviceLogin");
        m97926H2().m212326S(yuk0.f201641j);
        m97926H2().m212342i0("stopped", "已在其它设备登录");
    }

    /* JADX INFO: renamed from: W2 */
    public final void m206262W2() {
        if (!m97926H2().m212308A().called) {
            m97929L2(true);
            return;
        }
        act().startActivity(LiveVChatEndAct.m70468i2(act(), m97926H2().m212346p(), m97926H2().m212345o(), m97926H2().m212308A().endTipMessage, ""));
        m97929L2(false);
        act().overridePendingTransition(q7c0.f155955d, 0);
        if (m97926H2().f195474e) {
            C12668a.m70429p(this, true);
        }
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m206263X2(liveAuthMessageNew.MultiDevice multiDevice) {
        m206261U2();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        pb1.m171472b().mo171473a(LiveVChatAct.f45894i);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: T2, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(wgu wguVar) {
    }
}
