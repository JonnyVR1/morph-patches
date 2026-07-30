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
public class k1n0 extends mim0<VoiceRedDotButton> {
    public k1n0(bsm<? extends nnn0> bsmVar, BLiveBottomButton bLiveBottomButton, Area area) {
        super(bsmVar, bLiveBottomButton, area);
    }

    @Override // p149l.ub3
    /* JADX INFO: renamed from: C1 */
    public boolean mo116693C1(Area area) {
        return true;
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: b4 */
    public int mo116704b4() {
        return 0;
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: c4 */
    public int mo116705c4() {
        return 0;
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: m4 */
    public void mo116707m4(View view, BLiveButtonType bLiveButtonType, String str) {
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(800).m206701e(str).m206699c());
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: o4, reason: merged with bridge method [inline-methods] */
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
}
