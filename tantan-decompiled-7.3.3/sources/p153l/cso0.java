package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.Area;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.VoiceRedDotButton;

/* JADX INFO: loaded from: classes5.dex */
public class cso0 extends qrm0<VoiceRedDotButton> {

    /* JADX INFO: renamed from: r */
    public final String f83471r;

    /* JADX INFO: renamed from: s */
    public boolean f83472s;

    /* JADX INFO: renamed from: t */
    public int f83473t;

    public cso0(dum<? extends rwn0> dumVar, BLiveBottomButton bLiveBottomButton, Area area, String str) {
        super(dumVar, bLiveBottomButton, area);
        this.f83472s = false;
        this.f83473t = 0;
        this.f83471r = str;
    }

    @Override // p153l.jc3
    /* JADX INFO: renamed from: C1 */
    public boolean mo105687C1(Area area) {
        return area == Area.BOTTOM;
    }

    @Override // p153l.qrm0, p153l.jc3
    /* JADX INFO: renamed from: E */
    public int mo112223E() {
        return this.f83473t;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138861f3(m213811F2().BottomZoneEvent.setSettingButtonRedPoint()).m138881b(new y20() { // from class: l.bso0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78182a.m112226q4((Integer) obj);
            }
        });
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: a4 */
    public String mo112224a4() {
        return "settingButton";
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: b4 */
    public int mo105689b4() {
        return obc0.f146094K8;
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: c4 */
    public int mo105690c4() {
        return 0;
    }

    @Override // p153l.qrm0, p153l.jc3
    /* JADX INFO: renamed from: l1 */
    public boolean mo103476l1() {
        return TextUtils.equals(this.f83471r, "layered") ? !this.f159152q.get().booleanValue() : this.f83472s;
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: m4 */
    public void mo105691m4(View view, BLiveButtonType bLiveButtonType, String str) {
        this.f159152q.put(Boolean.TRUE);
        if (TextUtils.equals(this.f83471r, "layered")) {
            m177578X3().mo73321g0(mo103476l1());
        }
        m177582f4().m213811F2().BootBubbleEvent.dismissBubble().mo199273j("settingButtonBubble");
        m177582f4().m213811F2().BottomZoneEvent.showSettingDialog().m199277p();
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: p4, reason: merged with bridge method [inline-methods] */
    public VoiceRedDotButton mo105688T3(int i, boolean z) {
        VoiceRedDotButton voiceRedDotButton = (VoiceRedDotButton) this.f159147l.f90815a.inflater().inflate(yec0.f198891Q7, (ViewGroup) null);
        voiceRedDotButton.setLayoutParams(new LinearLayout.LayoutParams(this.f159145j, this.f159144i));
        String strMo107630e4 = mo107630e4(this.f159148m, Area.BOTTOM);
        if (TextUtils.isEmpty(strMo107630e4)) {
            voiceRedDotButton.setLocalIcon(i);
        } else {
            voiceRedDotButton.m78968a(strMo107630e4, this.f159145j, this.f159144i);
        }
        bnl0.m105524M(voiceRedDotButton, z);
        return voiceRedDotButton;
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m112226q4(Integer num) {
        if (num.intValue() > 0) {
            this.f83473t = num.intValue();
            m177578X3().m78969b(this.f83473t);
        } else {
            this.f83472s = num.intValue() == -1;
            m177578X3().setRedDotCount(0);
            m177578X3().mo73321g0(mo103476l1());
        }
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: P3 */
    public void mo103475P3() {
    }
}
