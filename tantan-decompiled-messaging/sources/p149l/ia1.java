package p149l;

import android.os.Handler;
import android.os.Message;
import com.immomo.momomediaext.MomoMediaConstants$MMLiveAudioEffectPreset;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;

/* JADX INFO: loaded from: classes5.dex */
public class ia1 {

    /* JADX INFO: renamed from: a */
    public final jxl f112274a;

    /* JADX INFO: renamed from: b */
    public final Handler f112275b = new Handler(new Handler.Callback() { // from class: l.ha1
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            return this.f106706a.m135110c(message);
        }
    });

    public ia1(jxl jxlVar) {
        this.f112274a = jxlVar;
    }

    /* JADX INFO: renamed from: b */
    public void m135109b(BLiveAvatarFrameConfig bLiveAvatarFrameConfig) {
        hfw.m130790a("voice_effect_gift", "AudioEffectService changeAudioEffect:" + bLiveAvatarFrameConfig.changeVoiceNo);
        int i = bLiveAvatarFrameConfig.changeVoiceNo;
        if (i == 1) {
            m135114g();
            return;
        }
        if (i == 2) {
            m135115h();
        } else if (i != 3) {
            m135112e();
        } else {
            m135113f();
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean m135110c(Message message) {
        m135112e();
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void m135111d() {
        this.f112275b.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: e */
    public void m135112e() {
        jxl jxlVar = this.f112274a;
        if (jxlVar == null || jxlVar.mo138335a() == null) {
            return;
        }
        this.f112274a.mo138335a().mo71874h(MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetOff.getValue());
    }

    /* JADX INFO: renamed from: f */
    public final void m135113f() {
        jxl jxlVar = this.f112274a;
        if (jxlVar == null || jxlVar.mo138335a() == null) {
            return;
        }
        vpv vpvVar = ypv.f199493a;
        User userM199311E0 = vpvVar.m199311E0(vpvVar.m199309D0());
        int value = MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetVoiceChangerEffectBoy.getValue();
        int value2 = MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetVoiceChangerEffectGirl.getValue();
        bxl bxlVarMo138335a = this.f112274a.mo138335a();
        if (TEnum.equals(userM199311E0.gender, "female")) {
            value = value2;
        }
        bxlVarMo138335a.mo71874h(value);
    }

    /* JADX INFO: renamed from: g */
    public final void m135114g() {
        jxl jxlVar = this.f112274a;
        if (jxlVar == null || jxlVar.mo138335a() == null) {
            return;
        }
        this.f112274a.mo138335a().mo71874h(MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetVoiceChangerEffectHulk.getValue());
    }

    /* JADX INFO: renamed from: h */
    public final void m135115h() {
        jxl jxlVar = this.f112274a;
        if (jxlVar == null || jxlVar.mo138335a() == null) {
            return;
        }
        this.f112274a.mo138335a().mo71874h(MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetVoiceChangerEffectPigKin.getValue());
    }

    /* JADX INFO: renamed from: i */
    public void m135116i(int i) {
        m135111d();
        this.f112275b.sendEmptyMessageDelayed(0, ((long) i) * 1000);
    }
}
