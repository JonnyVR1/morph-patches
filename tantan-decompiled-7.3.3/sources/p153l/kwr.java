package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: classes13.dex */
public class kwr implements ga1 {

    /* JADX INFO: renamed from: a */
    public z20<String, AudioBusinessType> f129088a;

    /* JADX INFO: renamed from: b */
    public x20 f129089b;

    /* JADX INFO: renamed from: c */
    public a30<String, AudioBusinessType, String> f129090c;

    /* JADX INFO: renamed from: d */
    public z20<String, AudioBusinessType> f129091d;

    public kwr(x20 x20Var) {
        this.f129089b = x20Var;
    }

    @Override // p153l.ga1
    /* JADX INFO: renamed from: a */
    public void mo129685a(String str, AudioBusinessType audioBusinessType, ga1 ga1Var) {
        z20<String, AudioBusinessType> z20Var = this.f129088a;
        if (z20Var != null) {
            z20Var.call(str, audioBusinessType);
        }
        nsh0.m164608j(lwr.f133853a, "LiveAudioBusinessCallBack:" + str + Constants.SEPARATOR_COMMA + audioBusinessType.name());
    }

    @Override // p153l.ga1
    /* JADX INFO: renamed from: b */
    public void mo40108b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
        nsh0.m164608j(lwr.f133853a, "stop:" + audioBusinessType.name() + Constants.SEPARATOR_COMMA + str + Constants.SEPARATOR_COMMA + audioBusinessType2);
        x20 x20Var = this.f129089b;
        if (x20Var != null) {
            x20Var.call();
            this.f129089b = null;
        }
        z20<String, AudioBusinessType> z20Var = this.f129091d;
        if (z20Var != null) {
            z20Var.call(str, audioBusinessType2);
        }
    }

    @Override // p153l.ga1
    /* JADX INFO: renamed from: c */
    public void mo62651c(String str, AudioBusinessType audioBusinessType, String str2, ga1 ga1Var) {
        a30<String, AudioBusinessType, String> a30Var = this.f129090c;
        if (a30Var != null) {
            a30Var.mo37058a(str, audioBusinessType, str2);
        }
        nsh0.m164608j(lwr.f133853a, "releaseFocus:" + str + Constants.SEPARATOR_COMMA + audioBusinessType.name());
    }

    @Override // p153l.ga1
    /* JADX INFO: renamed from: d */
    public void mo40109d(String str, AudioBusinessType audioBusinessType, ga1 ga1Var, String str2, AudioBusinessType audioBusinessType2) {
        nsh0.m164608j(lwr.f133853a, "conflictWith:" + str + Constants.SEPARATOR_COMMA + audioBusinessType.name() + Constants.SEPARATOR_COMMA + str2 + Constants.SEPARATOR_COMMA + audioBusinessType2.name());
    }

    /* JADX INFO: renamed from: e */
    public void m151735e(z20<String, AudioBusinessType> z20Var) {
        this.f129088a = z20Var;
    }

    /* JADX INFO: renamed from: f */
    public void m151736f(a30<String, AudioBusinessType, String> a30Var) {
        this.f129090c = a30Var;
    }

    /* JADX INFO: renamed from: g */
    public void m151737g(z20<String, AudioBusinessType> z20Var) {
        this.f129091d = z20Var;
    }

    @Override // p153l.ga1
    public void success() {
        nsh0.m164608j(lwr.f133853a, "success");
    }

    public kwr() {
    }
}
