package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.Area;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.VoiceBottomCallButton;
import com.p046p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class sl0 extends mim0<VoiceBottomCallButton> {
    public sl0(bsm<? extends nnn0> bsmVar, BLiveBottomButton bLiveBottomButton, Area area) {
        super(bsmVar, bLiveBottomButton, area);
    }

    @Override // p149l.ub3
    /* JADX INFO: renamed from: C1 */
    public boolean mo116693C1(Area area) {
        return this.f134018l.f77098d;
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: b4 */
    public int mo116704b4() {
        return i3c0.f111047j1;
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: c4 */
    public int mo116705c4() {
        return 0;
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: m4 */
    public void mo116707m4(View view, BLiveButtonType bLiveButtonType, String str) {
        mo154725P3();
        m206028F2().MemberManagerEvent.showMemberManagerDialog().mo172463j(-1);
    }

    /* JADX INFO: renamed from: p4 */
    public void m184627p4() {
        if (m154731X3() != null) {
            m154731X3().f52910c.setBackground(kvc0.m147353b(i3c0.f111214x0));
            xdl0.m208325C0(m154731X3().f52910c, t100.m186890d(14.0f));
            m154731X3().f52910c.setMinimumWidth(t100.m186890d(19.0f));
        }
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: q4, reason: merged with bridge method [inline-methods] */
    public VoiceBottomCallButton mo108804T3(int i, boolean z) {
        VoiceBottomCallButton voiceBottomCallButton = (VoiceBottomCallButton) this.f134018l.f77095a.inflater().inflate(t6c0.f168147P7, (ViewGroup) null);
        voiceBottomCallButton.setLayoutParams(new LinearLayout.LayoutParams(this.f134016j, this.f134015i));
        voiceBottomCallButton.mo72138g0(mo108806l1());
        String strMo154734e4 = mo154734e4(this.f134019m, this.f134022p);
        if (TextUtils.isEmpty(strMo154734e4)) {
            voiceBottomCallButton.setIcon(i);
            return voiceBottomCallButton;
        }
        voiceBottomCallButton.setIcon(strMo154734e4);
        return voiceBottomCallButton;
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m184629r4(kmn0 kmn0Var) {
        m184630s4(kmn0Var.f123814b.size());
    }

    /* JADX INFO: renamed from: s4 */
    public void m184630s4(int i) {
        m154731X3().m77768b(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        if (x4s.m207012b(((nnn0) m206027E2()).mo149813j().liveMode)) {
            duringCreated(m206028F2().VoiceVirtualLiveEvent.updateCountEvent().m172462i(true)).subscribe(ffw.m121197h(new e30() { // from class: l.ql0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f155184a.m184630s4(((Integer) obj).intValue());
                }
            }));
            m184627p4();
        } else {
            duringCreated(m206028F2().VoiceCallEvent.updateApplyCountEvent().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.ql0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f155184a.m184630s4(((Integer) obj).intValue());
                }
            }));
            duringCreated(VCallApiProvider.callApplyList(((nnn0) m206027E2()).m149814k(), ((nnn0) m206027E2()).mo132103W0())).subscribe(ffw.m121197h(new e30() { // from class: l.rl0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f159919a.m184629r4((kmn0) obj);
                }
            }));
        }
    }
}
