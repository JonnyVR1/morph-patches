package p153l;

import android.view.View;
import com.p051p1.mobile.putong.core.data.VoiceCallStatus;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatMessageView;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class kou extends ahu<LiveVChatMessageView> {

    /* JADX INFO: renamed from: f */
    public kcg0 f127800f;

    /* JADX INFO: renamed from: g */
    public final long f127801g;

    /* JADX INFO: renamed from: h */
    public final long f127802h;

    public kou(knu knuVar, LiveVChatMessageView liveVChatMessageView) {
        super(knuVar);
        this.f127801g = 15L;
        this.f127802h = 195L;
        mo52715C(liveVChatMessageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public /* synthetic */ void m150683U2(String str) {
        m150684W2();
    }

    /* JADX INFO: renamed from: W2 */
    private void m150684W2() {
        m150686X2();
        this.f127800f = C22421c.interval(5L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.jou
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122057a.m150685V2((Long) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m113231o2(m97926H2().m212355z(), false).distinctUntilChanged().filter(new qcj() { // from class: l.hou
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).equals(VoiceCallStatus.calling));
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.iou
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116211a.m150683U2((String) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m150685V2(Long l2) {
        long jLongValue = l2.longValue() % 195;
        V v2 = this.viewModel;
        if (jLongValue <= 15) {
            bnl0.m105524M((View) v2, true);
        } else {
            bnl0.m105524M((View) v2, false);
        }
    }

    /* JADX INFO: renamed from: X2 */
    public void m150686X2() {
        psd0.m173633z(this.f127800f);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m150686X2();
    }
}
