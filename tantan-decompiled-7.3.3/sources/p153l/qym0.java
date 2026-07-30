package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class qym0 extends qct<rwn0> {

    /* JADX INFO: renamed from: i */
    public final HashMap<String, kcg0> f160166i;

    public qym0(dum dumVar) {
        super(dumVar);
        this.f160166i = new HashMap<>();
    }

    /* JADX INFO: renamed from: U3 */
    private void m178663U3(String str) {
        nsh0.m164608j("[voice][call]", "CallAnchorControlModule stop call timer id = " + str);
        psd0.m173633z(this.f160166i.remove(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ Boolean m178664N3(BLiveVoiceCall bLiveVoiceCall, Long l2) {
        return Boolean.valueOf(((rwn0) m213810E2()).m183411P2().m136871j(bLiveVoiceCall.f45333id) == null);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m178665O3(BLiveVoiceCall bLiveVoiceCall, Long l2) {
        m178666P3(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m178666P3(BLiveVoiceCall bLiveVoiceCall) {
        o1j0.m165651y(this.f196919f.getString(R$string.f47560H1, bLiveVoiceCall.userName));
        m178668S3(bLiveVoiceCall);
        m178663U3(bLiveVoiceCall.f45333id);
    }

    /* JADX INFO: renamed from: R3 */
    public void m178667R3(final gvn0 gvn0Var) {
        if (!gvn0Var.m132570k(13)) {
            if (gvn0Var.m132570k(6)) {
                m178663U3(gvn0Var.m132565f());
            }
        } else {
            String str = (String) jyb.m147529r(this.f160166i.keySet(), new qcj() { // from class: l.pym0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(gvn0Var.m132565f(), (String) obj));
                }
            });
            if (TextUtils.isEmpty(str)) {
                return;
            }
            m178663U3(str);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m178668S3(BLiveVoiceCall bLiveVoiceCall) {
        m213811F2().VoiceCallEvent.removeWaitCallEvent().mo199273j(bLiveVoiceCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public final void m178669T3(final BLiveVoiceCall bLiveVoiceCall) {
        this.f160166i.put(bLiveVoiceCall.f45333id, m138858H3(((rwn0) m213810E2()).m168521h2(30, TimeUnit.SECONDS)).take(1).filter(new qcj() { // from class: l.nym0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f144339a.m178664N3(bLiveVoiceCall, (Long) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.oym0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149810a.m178665O3(bLiveVoiceCall, (Long) obj);
            }
        }, new r5k())));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f160166i.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m168545q1().m98337x0()).subscribe(new y20() { // from class: l.lym0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134120a.m178667R3((gvn0) obj);
            }
        });
        duringCreated(m213811F2().VoiceCallEvent.callAgreedEvent().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.mym0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139418a.m178669T3((BLiveVoiceCall) obj);
            }
        }));
    }
}
