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
public class oan0 extends qrm0<VoiceRedDotButton> {
    public oan0(dum<? extends rwn0> dumVar, BLiveBottomButton bLiveBottomButton, Area area) {
        super(dumVar, bLiveBottomButton, area);
    }

    /* JADX INFO: renamed from: C1 */
    public boolean mo105687C1(Area area) {
        return true;
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: b4 */
    public int mo105689b4() {
        return 0;
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: c4 */
    public int mo105690c4() {
        return 0;
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: m4 */
    public void mo105691m4(View view, BLiveButtonType bLiveButtonType, String str) {
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(800).m103154e(str).m103152c());
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: o4, reason: merged with bridge method [inline-methods] */
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
}
