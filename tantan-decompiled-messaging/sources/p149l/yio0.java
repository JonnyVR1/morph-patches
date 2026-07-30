package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.Area;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.VoiceRedDotButton;

/* JADX INFO: loaded from: classes5.dex */
public class yio0 extends mim0<VoiceRedDotButton> {

    /* JADX INFO: renamed from: r */
    public final String f198526r;

    /* JADX INFO: renamed from: s */
    public boolean f198527s;

    /* JADX INFO: renamed from: t */
    public int f198528t;

    public yio0(bsm<? extends nnn0> bsmVar, BLiveBottomButton bLiveBottomButton, Area area, String str) {
        super(bsmVar, bLiveBottomButton, area);
        this.f198527s = false;
        this.f198528t = 0;
        this.f198526r = str;
    }

    @Override // p149l.ub3
    /* JADX INFO: renamed from: C1 */
    public boolean mo116693C1(Area area) {
        return area == Area.BOTTOM;
    }

    @Override // p149l.mim0, p149l.ub3
    /* JADX INFO: renamed from: E */
    public int mo154722E() {
        return this.f198528t;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129302f3(m206028F2().BottomZoneEvent.setSettingButtonRedPoint()).m129322b(new e30() { // from class: l.xio0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193140a.m215004q4((Integer) obj);
            }
        });
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: a4 */
    public String mo154733a4() {
        return "settingButton";
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: b4 */
    public int mo116704b4() {
        return i3c0.f110766K8;
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: c4 */
    public int mo116705c4() {
        return 0;
    }

    @Override // p149l.mim0, p149l.ub3
    /* JADX INFO: renamed from: l1 */
    public boolean mo108806l1() {
        return TextUtils.equals(this.f198526r, "layered") ? !this.f134023q.get().booleanValue() : this.f198527s;
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: m4 */
    public void mo116707m4(View view, BLiveButtonType bLiveButtonType, String str) {
        this.f134023q.put(Boolean.TRUE);
        if (TextUtils.equals(this.f198526r, "layered")) {
            m154731X3().mo72138g0(mo108806l1());
        }
        m154735f4().m206028F2().BootBubbleEvent.dismissBubble().mo172463j("settingButtonBubble");
        m154735f4().m206028F2().BottomZoneEvent.showSettingDialog().m172467p();
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: p4, reason: merged with bridge method [inline-methods] */
    public VoiceRedDotButton mo108804T3(int i, boolean z) {
        VoiceRedDotButton voiceRedDotButton = (VoiceRedDotButton) this.f134018l.f77095a.inflater().inflate(t6c0.f168159Q7, (ViewGroup) null);
        voiceRedDotButton.setLayoutParams(new LinearLayout.LayoutParams(this.f134016j, this.f134015i));
        String strMo154734e4 = mo154734e4(this.f134019m, Area.BOTTOM);
        if (TextUtils.isEmpty(strMo154734e4)) {
            voiceRedDotButton.setLocalIcon(i);
        } else {
            voiceRedDotButton.m77785a(strMo154734e4, this.f134016j, this.f134015i);
        }
        xdl0.m208344M(voiceRedDotButton, z);
        return voiceRedDotButton;
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m215004q4(Integer num) {
        if (num.intValue() > 0) {
            this.f198528t = num.intValue();
            m154731X3().m77786b(this.f198528t);
        } else {
            this.f198527s = num.intValue() == -1;
            m154731X3().setRedDotCount(0);
            m154731X3().mo72138g0(mo108806l1());
        }
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: P3 */
    public void mo154725P3() {
    }
}
