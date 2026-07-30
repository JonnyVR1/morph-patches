package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.Area;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.VoiceBottomCallButton;
import com.p051p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class ol0 extends qrm0<VoiceBottomCallButton> {
    public ol0(dum<? extends rwn0> dumVar, BLiveBottomButton bLiveBottomButton, Area area) {
        super(dumVar, bLiveBottomButton, area);
    }

    @Override // p153l.jc3
    /* JADX INFO: renamed from: C1 */
    public boolean mo105687C1(Area area) {
        return this.f159147l.f90818d;
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: b4 */
    public int mo105689b4() {
        return obc0.f146375j1;
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: c4 */
    public int mo105690c4() {
        return 0;
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: m4 */
    public void mo105691m4(View view, BLiveButtonType bLiveButtonType, String str) {
        mo103475P3();
        m213811F2().MemberManagerEvent.showMemberManagerDialog().mo199273j(-1);
    }

    /* JADX INFO: renamed from: p4 */
    public void m168088p4() {
        if (m177578X3() != null) {
            m177578X3().f53758c.setBackground(n3d0.m161278b(obc0.f146542x0));
            bnl0.m105505C0(m177578X3().f53758c, qa00.m175859d(14.0f));
            m177578X3().f53758c.setMinimumWidth(qa00.m175859d(19.0f));
        }
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: q4, reason: merged with bridge method [inline-methods] */
    public VoiceBottomCallButton mo105688T3(int i, boolean z) {
        VoiceBottomCallButton voiceBottomCallButton = (VoiceBottomCallButton) this.f159147l.f90815a.inflater().inflate(yec0.f198879P7, (ViewGroup) null);
        voiceBottomCallButton.setLayoutParams(new LinearLayout.LayoutParams(this.f159145j, this.f159144i));
        voiceBottomCallButton.mo73321g0(mo103476l1());
        String strMo107630e4 = mo107630e4(this.f159148m, this.f159151p);
        if (TextUtils.isEmpty(strMo107630e4)) {
            voiceBottomCallButton.setIcon(i);
            return voiceBottomCallButton;
        }
        voiceBottomCallButton.setIcon(strMo107630e4);
        return voiceBottomCallButton;
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m168090r4(ovn0 ovn0Var) {
        m168091s4(ovn0Var.f149284b.size());
    }

    /* JADX INFO: renamed from: s4 */
    public void m168091s4(int i) {
        m177578X3().m78951b(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        if (y6s.m214494b(((rwn0) m213810E2()).mo183435j().liveMode)) {
            duringCreated(m213811F2().VoiceVirtualLiveEvent.updateCountEvent().m199272i(true)).subscribe(dhw.m115829h(new y20() { // from class: l.ml0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f137351a.m168091s4(((Integer) obj).intValue());
                }
            }));
            m168088p4();
        } else {
            duringCreated(m213811F2().VoiceCallEvent.updateApplyCountEvent().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.ml0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f137351a.m168091s4(((Integer) obj).intValue());
                }
            }));
            duringCreated(VCallApiProvider.callApplyList(((rwn0) m213810E2()).m202191k(), ((rwn0) m213810E2()).mo168489W0())).subscribe(dhw.m115829h(new y20() { // from class: l.nl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f142501a.m168090r4((ovn0) obj);
                }
            }));
        }
    }
}
