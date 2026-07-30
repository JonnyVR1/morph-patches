package p153l;

import android.os.Handler;
import android.os.Message;
import com.immomo.momomediaext.MomoMediaConstants$MMLiveAudioEffectPreset;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;

/* JADX INFO: loaded from: classes5.dex */
public class pa1 {

    /* JADX INFO: renamed from: a */
    public final c0m f151230a;

    /* JADX INFO: renamed from: b */
    public final Handler f151231b = new Handler(new Handler.Callback() { // from class: l.oa1
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            return this.f145654a.m171400c(message);
        }
    });

    public pa1(c0m c0mVar) {
        this.f151230a = c0mVar;
    }

    /* JADX INFO: renamed from: b */
    public void m171399b(BLiveAvatarFrameConfig bLiveAvatarFrameConfig) {
        fhw.m125605a("voice_effect_gift", "AudioEffectService changeAudioEffect:" + bLiveAvatarFrameConfig.changeVoiceNo);
        int i = bLiveAvatarFrameConfig.changeVoiceNo;
        if (i == 1) {
            m171404g();
            return;
        }
        if (i == 2) {
            m171405h();
        } else if (i != 3) {
            m171402e();
        } else {
            m171403f();
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean m171400c(Message message) {
        m171402e();
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void m171401d() {
        this.f151231b.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: e */
    public void m171402e() {
        c0m c0mVar = this.f151230a;
        if (c0mVar == null || c0mVar.mo107430a() == null) {
            return;
        }
        this.f151230a.mo107430a().mo73057h(MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetOff.getValue());
    }

    /* JADX INFO: renamed from: f */
    public final void m171403f() {
        c0m c0mVar = this.f151230a;
        if (c0mVar == null || c0mVar.mo107430a() == null) {
            return;
        }
        wrv wrvVar = zrv.f205799a;
        User userM207633E0 = wrvVar.m207633E0(wrvVar.m207631D0());
        int value = MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetVoiceChangerEffectBoy.getValue();
        int value2 = MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetVoiceChangerEffectGirl.getValue();
        uzl uzlVarMo107430a = this.f151230a.mo107430a();
        if (TEnum.equals(userM207633E0.gender, "female")) {
            value = value2;
        }
        uzlVarMo107430a.mo73057h(value);
    }

    /* JADX INFO: renamed from: g */
    public final void m171404g() {
        c0m c0mVar = this.f151230a;
        if (c0mVar == null || c0mVar.mo107430a() == null) {
            return;
        }
        this.f151230a.mo107430a().mo73057h(MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetVoiceChangerEffectHulk.getValue());
    }

    /* JADX INFO: renamed from: h */
    public final void m171405h() {
        c0m c0mVar = this.f151230a;
        if (c0mVar == null || c0mVar.mo107430a() == null) {
            return;
        }
        this.f151230a.mo107430a().mo73057h(MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetVoiceChangerEffectPigKin.getValue());
    }

    /* JADX INFO: renamed from: i */
    public void m171406i(int i) {
        m171401d();
        this.f151231b.sendEmptyMessageDelayed(0, ((long) i) * 1000);
    }
}
