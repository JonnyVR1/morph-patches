package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: classes13.dex */
public class jur implements z91 {

    /* JADX INFO: renamed from: a */
    public f30<String, AudioBusinessType> f119806a;

    /* JADX INFO: renamed from: b */
    public d30 f119807b;

    /* JADX INFO: renamed from: c */
    public g30<String, AudioBusinessType, String> f119808c;

    /* JADX INFO: renamed from: d */
    public f30<String, AudioBusinessType> f119809d;

    public jur(d30 d30Var) {
        this.f119807b = d30Var;
    }

    @Override // p149l.z91
    /* JADX INFO: renamed from: a */
    public void mo143340a(String str, AudioBusinessType audioBusinessType, z91 z91Var) {
        f30<String, AudioBusinessType> f30Var = this.f119806a;
        if (f30Var != null) {
            f30Var.call(str, audioBusinessType);
        }
        gkh0.m126627j(kur.f124707a, "LiveAudioBusinessCallBack:" + str + Constants.SEPARATOR_COMMA + audioBusinessType.name());
    }

    @Override // p149l.z91
    /* JADX INFO: renamed from: b */
    public void mo39105b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
        gkh0.m126627j(kur.f124707a, "stop:" + audioBusinessType.name() + Constants.SEPARATOR_COMMA + str + Constants.SEPARATOR_COMMA + audioBusinessType2);
        d30 d30Var = this.f119807b;
        if (d30Var != null) {
            d30Var.call();
            this.f119807b = null;
        }
        f30<String, AudioBusinessType> f30Var = this.f119809d;
        if (f30Var != null) {
            f30Var.call(str, audioBusinessType2);
        }
    }

    @Override // p149l.z91
    /* JADX INFO: renamed from: c */
    public void mo61467c(String str, AudioBusinessType audioBusinessType, String str2, z91 z91Var) {
        g30<String, AudioBusinessType, String> g30Var = this.f119808c;
        if (g30Var != null) {
            g30Var.mo36055a(str, audioBusinessType, str2);
        }
        gkh0.m126627j(kur.f124707a, "releaseFocus:" + str + Constants.SEPARATOR_COMMA + audioBusinessType.name());
    }

    @Override // p149l.z91
    /* JADX INFO: renamed from: d */
    public void mo39106d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
        gkh0.m126627j(kur.f124707a, "conflictWith:" + str + Constants.SEPARATOR_COMMA + audioBusinessType.name() + Constants.SEPARATOR_COMMA + str2 + Constants.SEPARATOR_COMMA + audioBusinessType2.name());
    }

    /* JADX INFO: renamed from: e */
    public void m143341e(f30<String, AudioBusinessType> f30Var) {
        this.f119806a = f30Var;
    }

    /* JADX INFO: renamed from: f */
    public void m143342f(g30<String, AudioBusinessType, String> g30Var) {
        this.f119808c = g30Var;
    }

    /* JADX INFO: renamed from: g */
    public void m143343g(f30<String, AudioBusinessType> f30Var) {
        this.f119809d = f30Var;
    }

    @Override // p149l.z91
    public void success() {
        gkh0.m126627j(kur.f124707a, "success");
    }

    public jur() {
    }
}
