package p153l;

import android.text.TextUtils;
import com.immomo.mediacore.coninf.MRtcAudioHandler;
import com.immomo.medialog.LogLevel;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveUserConfig;
import com.momo.pub.MomoPipelineModuleRegister;

/* JADX INFO: loaded from: classes7.dex */
public class gnw {

    /* JADX INFO: renamed from: a */
    private MomoPipelineModuleRegister f105162a;

    /* JADX INFO: renamed from: b */
    private zzl f105163b;

    /* JADX INFO: renamed from: d */
    private usl f105165d;

    /* JADX INFO: renamed from: f */
    private fb1 f105167f;

    /* JADX INFO: renamed from: c */
    private MMLiveUserConfig f105164c = new MMLiveUserConfig("0", "0", "0", "0", "0", "100", true);

    /* JADX INFO: renamed from: e */
    public p4k0 f105166e = null;

    public gnw(MomoPipelineModuleRegister momoPipelineModuleRegister, MMLiveUserConfig mMLiveUserConfig) {
        this.f105162a = momoPipelineModuleRegister;
        m130992f(mMLiveUserConfig);
    }

    /* JADX INFO: renamed from: f */
    private void m130992f(MMLiveUserConfig mMLiveUserConfig) {
        if (mMLiveUserConfig != null) {
            this.f105164c = mMLiveUserConfig;
        } else {
            this.f105164c = new MMLiveUserConfig("0", "0", "0", "0", "0", "100", false);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m130993a(MRtcAudioHandler mRtcAudioHandler) {
        zzl zzlVar = this.f105163b;
        if (zzlVar != null) {
            zzlVar.mo107905Z1(mRtcAudioHandler, 100, 100);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m130994b(boolean z) {
        zzl zzlVar = this.f105163b;
        if (zzlVar != null) {
            zzlVar.mo107929u(z);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m130995c(boolean z) {
        zzl zzlVar = this.f105163b;
        if (zzlVar != null) {
            zzlVar.mo189141b1(z);
        }
    }

    /* JADX INFO: renamed from: d */
    public mob0 m130996d() {
        zzl zzlVar = this.f105163b;
        if (zzlVar != null) {
            return zzlVar.mo107914g();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public p4k0 m130997e() {
        return this.f105166e;
    }

    /* JADX INFO: renamed from: g */
    public void m130998g() {
        zzl zzlVar = this.f105163b;
        if (zzlVar != null) {
            zzlVar.mo21116j();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m130999h(int i) {
        zzl zzlVar = this.f105163b;
        if (zzlVar != null) {
            zzlVar.mo107901T0(i);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m131000i(fpf0 fpf0Var) {
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.f105162a;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo21163i(5000, 6, fpf0Var);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m131001j(boolean z) {
        zzl zzlVar = this.f105163b;
        if (zzlVar != null) {
            zzlVar.mo107906a(z);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m131002k(fb1 fb1Var) {
        this.f105167f = fb1Var;
    }

    /* JADX INFO: renamed from: l */
    public void m131003l(MMLiveMediaConfig mMLiveMediaConfig, String str) {
        ror parameters = this.f105162a.getParameters();
        parameters.f175494m = mMLiveMediaConfig.encodeWidth;
        parameters.f175496n = mMLiveMediaConfig.encodeHeight;
        int i = mMLiveMediaConfig.videoFPS;
        parameters.f175449F = i;
        parameters.f180160E0 = i;
        p4k0 p4k0VarM176821i = qj20.m176806f().m176821i(mMLiveMediaConfig.ipv6Url, mMLiveMediaConfig.url);
        this.f105166e = p4k0VarM176821i;
        if (p4k0VarM176821i == null || TextUtils.isEmpty(p4k0VarM176821i.m170573d())) {
            parameters.f180187v0 = mMLiveMediaConfig.url;
            this.f105166e = null;
        } else {
            parameters.f180187v0 = this.f105166e.m170573d();
        }
        parameters.f180188w0 = this.f105166e;
        parameters.f175451H = mMLiveMediaConfig.videoBitRate;
        parameters.f175461R = mMLiveMediaConfig.audioChannels;
        parameters.f175459P = mMLiveMediaConfig.audioSampleRate;
        parameters.f175462S = mMLiveMediaConfig.audioBitrate;
        parameters.f180163H0 = mMLiveMediaConfig.videoCodecType == 2;
        parameters.f180162G0 = false;
        this.f105165d = this.f105162a.mo21151L();
        brx brxVar = new brx();
        brxVar.m106183o(this.f105164c.getAppid());
        brxVar.m106189u(this.f105164c.getMomoid());
        brxVar.m106187s(this.f105164c.getRoomid());
        brxVar.m106186r(mMLiveMediaConfig.cdnType);
        brxVar.m106184p(mMLiveMediaConfig.businessType);
        this.f105163b = this.f105162a.mo21155P(brxVar);
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.f105162a;
        momoPipelineModuleRegister.mo21149J(momoPipelineModuleRegister.mo21178x());
        this.f105163b.mo107928t1(1);
        if (TextUtils.isEmpty(mMLiveMediaConfig.url)) {
            b7y.m102882c().m102883a("startPush", "rtmpUrl", LogLevel.ERROR);
        }
        if (this.f105163b != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f105163b.mo107895J(str);
            }
            this.f105163b.mo109296R(this.f105167f);
            this.f105163b.mo107927t0();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m131004m(String str) {
        zzl zzlVar = this.f105163b;
        if (zzlVar != null) {
            zzlVar.mo21092O1(str);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m131005n() {
        zzl zzlVar = this.f105163b;
        if (zzlVar != null) {
            zzlVar.mo107911f();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m131006o() {
        zzl zzlVar = this.f105163b;
        if (zzlVar != null) {
            zzlVar.stopSurroundMusic();
        }
    }
}
