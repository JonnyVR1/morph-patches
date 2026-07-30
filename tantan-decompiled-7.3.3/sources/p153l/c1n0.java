package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.Area;

/* JADX INFO: loaded from: classes5.dex */
public class c1n0 extends oan0 {
    public c1n0(dum<? extends rwn0> dumVar, BLiveBottomButton bLiveBottomButton, Area area) {
        super(dumVar, bLiveBottomButton, area);
    }

    @Override // p153l.oan0, p153l.jc3
    /* JADX INFO: renamed from: C1 */
    public boolean mo105687C1(Area area) {
        return this.f159147l.f90818d;
    }

    @Override // p153l.oan0, p153l.qrm0
    /* JADX INFO: renamed from: b4 */
    public int mo105689b4() {
        return obc0.f146395k9;
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: e4 */
    public String mo107630e4(BLiveBottomButton bLiveBottomButton, Area area) {
        return "";
    }

    @Override // p153l.oan0, p153l.qrm0
    /* JADX INFO: renamed from: m4 */
    public void mo105691m4(View view, BLiveButtonType bLiveButtonType, String str) {
        m107631q4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public void m107631q4() {
        BLiveVoiceCall bLiveVoiceCallM183423Y2 = ((rwn0) m213810E2()).m183423Y2();
        if (bLiveVoiceCallM183423Y2 == null) {
            return;
        }
        if (bLiveVoiceCallM183423Y2.mutedByAnchor && !m213815L2()) {
            o1j0.m165649w(R$string.f47856V);
        } else {
            if (bLiveVoiceCallM183423Y2.mutedByUser && m213815L2()) {
                return;
            }
            ydn0.m215263p(this, bLiveVoiceCallM183423Y2.f45333id, !(m213815L2() ? bLiveVoiceCallM183423Y2.mutedByAnchor : bLiveVoiceCallM183423Y2.mutedByUser), "");
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final void m107632r4(BLiveVoiceCall bLiveVoiceCall) {
        if (m213815L2()) {
            m107633s4(bLiveVoiceCall.mutedByAnchor);
        } else {
            m107633s4(bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser);
        }
    }

    /* JADX INFO: renamed from: s4 */
    public void m107633s4(boolean z) {
        m177578X3().f53778a.setImageResource(z ? obc0.f146383j9 : obc0.f146395k9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m183424Z2()).subscribe(dhw.m115829h(new y20() { // from class: l.b1n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74387a.m107632r4((BLiveVoiceCall) obj);
            }
        }));
    }
}
