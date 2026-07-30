package p149l;

import android.view.View;
import com.p046p1.mobile.putong.core.data.VoiceCallStatus;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatMessageView;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class jmu extends zeu<LiveVChatMessageView> {

    /* JADX INFO: renamed from: f */
    public c4g0 f118715f;

    /* JADX INFO: renamed from: g */
    public final long f118716g;

    /* JADX INFO: renamed from: h */
    public final long f118717h;

    public jmu(jlu jluVar, LiveVChatMessageView liveVChatMessageView) {
        super(jluVar);
        this.f118716g = 15L;
        this.f118717h = 195L;
        mo51532C(liveVChatMessageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public /* synthetic */ void m142223U2(String str) {
        m142224W2();
    }

    /* JADX INFO: renamed from: W2 */
    private void m142224W2() {
        m142226X2();
        this.f118715f = C22306c.interval(5L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.imu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113969a.m142225V2((Long) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m104250o2(m218409H2().m203948z(), false).distinctUntilChanged().filter(new w9j() { // from class: l.gmu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).equals(VoiceCallStatus.calling));
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.hmu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108477a.m142223U2((String) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m142225V2(Long l2) {
        long jLongValue = l2.longValue() % 195;
        V v2 = this.viewModel;
        if (jLongValue <= 15) {
            xdl0.m208344M((View) v2, true);
        } else {
            xdl0.m208344M((View) v2, false);
        }
    }

    /* JADX INFO: renamed from: X2 */
    public void m142226X2() {
        mkd0.m154992z(this.f118715f);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m142226X2();
    }
}
