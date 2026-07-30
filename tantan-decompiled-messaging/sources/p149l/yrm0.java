package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.Area;

/* JADX INFO: loaded from: classes5.dex */
public class yrm0 extends k1n0 {
    public yrm0(bsm<? extends nnn0> bsmVar, BLiveBottomButton bLiveBottomButton, Area area) {
        super(bsmVar, bLiveBottomButton, area);
    }

    @Override // p149l.k1n0, p149l.ub3
    /* JADX INFO: renamed from: C1 */
    public boolean mo116693C1(Area area) {
        return this.f134018l.f77098d;
    }

    @Override // p149l.k1n0, p149l.mim0
    /* JADX INFO: renamed from: b4 */
    public int mo116704b4() {
        return i3c0.f111067k9;
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: e4 */
    public String mo154734e4(BLiveBottomButton bLiveBottomButton, Area area) {
        return "";
    }

    @Override // p149l.k1n0, p149l.mim0
    /* JADX INFO: renamed from: m4 */
    public void mo116707m4(View view, BLiveButtonType bLiveButtonType, String str) {
        m215850q4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public void m215850q4() {
        BLiveVoiceCall bLiveVoiceCallM160261Y2 = ((nnn0) m206027E2()).m160261Y2();
        if (bLiveVoiceCallM160261Y2 == null) {
            return;
        }
        if (bLiveVoiceCallM160261Y2.mutedByAnchor && !m206032L2()) {
            lsi0.m151593w(R$string.f47008V);
        } else {
            if (bLiveVoiceCallM160261Y2.mutedByUser && m206032L2()) {
                return;
            }
            u4n0.m191757p(this, bLiveVoiceCallM160261Y2.f44485id, !(m206032L2() ? bLiveVoiceCallM160261Y2.mutedByAnchor : bLiveVoiceCallM160261Y2.mutedByUser), "");
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final void m215851r4(BLiveVoiceCall bLiveVoiceCall) {
        if (m206032L2()) {
            m215852s4(bLiveVoiceCall.mutedByAnchor);
        } else {
            m215852s4(bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser);
        }
    }

    /* JADX INFO: renamed from: s4 */
    public void m215852s4(boolean z) {
        m154731X3().f52930a.setImageResource(z ? i3c0.f111055j9 : i3c0.f111067k9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m160262Z2()).subscribe(ffw.m121197h(new e30() { // from class: l.xrm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194155a.m215851r4((BLiveVoiceCall) obj);
            }
        }));
    }
}
