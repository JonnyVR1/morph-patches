package p149l;

import android.text.TextUtils;
import com.immomo.mediacore.coninf.MRtcAudioHandler;
import com.immomo.medialog.LogLevel;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveUserConfig;
import com.momo.pub.MomoPipelineModuleRegister;

/* JADX INFO: loaded from: classes7.dex */
public class hkw {

    /* JADX INFO: renamed from: a */
    private MomoPipelineModuleRegister f108286a;

    /* JADX INFO: renamed from: b */
    private gxl f108287b;

    /* JADX INFO: renamed from: d */
    private iql f108289d;

    /* JADX INFO: renamed from: f */
    private ya1 f108291f;

    /* JADX INFO: renamed from: c */
    private MMLiveUserConfig f108288c = new MMLiveUserConfig("0", "0", "0", "0", "0", "100", true);

    /* JADX INFO: renamed from: e */
    public mvj0 f108290e = null;

    public hkw(MomoPipelineModuleRegister momoPipelineModuleRegister, MMLiveUserConfig mMLiveUserConfig) {
        this.f108286a = momoPipelineModuleRegister;
        m131586f(mMLiveUserConfig);
    }

    /* JADX INFO: renamed from: f */
    private void m131586f(MMLiveUserConfig mMLiveUserConfig) {
        if (mMLiveUserConfig != null) {
            this.f108288c = mMLiveUserConfig;
        } else {
            this.f108288c = new MMLiveUserConfig("0", "0", "0", "0", "0", "100", false);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m131587a(MRtcAudioHandler mRtcAudioHandler) {
        gxl gxlVar = this.f108287b;
        if (gxlVar != null) {
            gxlVar.mo139347Z1(mRtcAudioHandler, 100, 100);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m131588b(boolean z) {
        gxl gxlVar = this.f108287b;
        if (gxlVar != null) {
            gxlVar.mo139371u(z);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m131589c(boolean z) {
        gxl gxlVar = this.f108287b;
        if (gxlVar != null) {
            gxlVar.mo128617b1(z);
        }
    }

    /* JADX INFO: renamed from: d */
    public igb0 m131590d() {
        gxl gxlVar = this.f108287b;
        if (gxlVar != null) {
            return gxlVar.mo139356g();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public mvj0 m131591e() {
        return this.f108290e;
    }

    /* JADX INFO: renamed from: g */
    public void m131592g() {
        gxl gxlVar = this.f108287b;
        if (gxlVar != null) {
            gxlVar.mo20117j();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m131593h(int i) {
        gxl gxlVar = this.f108287b;
        if (gxlVar != null) {
            gxlVar.mo139343T0(i);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m131594i(xgf0 xgf0Var) {
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.f108286a;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo20164i(5000, 6, xgf0Var);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m131595j(boolean z) {
        gxl gxlVar = this.f108287b;
        if (gxlVar != null) {
            gxlVar.mo139348a(z);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m131596k(ya1 ya1Var) {
        this.f108291f = ya1Var;
    }

    /* JADX INFO: renamed from: l */
    public void m131597l(MMLiveMediaConfig mMLiveMediaConfig, String str) {
        qmr parameters = this.f108286a.getParameters();
        parameters.f177152m = mMLiveMediaConfig.encodeWidth;
        parameters.f177154n = mMLiveMediaConfig.encodeHeight;
        int i = mMLiveMediaConfig.videoFPS;
        parameters.f177107F = i;
        parameters.f182016E0 = i;
        mvj0 mvj0VarM130290i = hb20.m130275f().m130290i(mMLiveMediaConfig.ipv6Url, mMLiveMediaConfig.url);
        this.f108290e = mvj0VarM130290i;
        if (mvj0VarM130290i == null || TextUtils.isEmpty(mvj0VarM130290i.m156529d())) {
            parameters.f182043v0 = mMLiveMediaConfig.url;
            this.f108290e = null;
        } else {
            parameters.f182043v0 = this.f108290e.m156529d();
        }
        parameters.f182044w0 = this.f108290e;
        parameters.f177109H = mMLiveMediaConfig.videoBitRate;
        parameters.f177119R = mMLiveMediaConfig.audioChannels;
        parameters.f177117P = mMLiveMediaConfig.audioSampleRate;
        parameters.f177120S = mMLiveMediaConfig.audioBitrate;
        parameters.f182019H0 = mMLiveMediaConfig.videoCodecType == 2;
        parameters.f182018G0 = false;
        this.f108289d = this.f108286a.mo20152L();
        eix eixVar = new eix();
        eixVar.m116739o(this.f108288c.getAppid());
        eixVar.m116745u(this.f108288c.getMomoid());
        eixVar.m116743s(this.f108288c.getRoomid());
        eixVar.m116742r(mMLiveMediaConfig.cdnType);
        eixVar.m116740p(mMLiveMediaConfig.businessType);
        this.f108287b = this.f108286a.mo20156P(eixVar);
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.f108286a;
        momoPipelineModuleRegister.mo20150J(momoPipelineModuleRegister.mo20179x());
        this.f108287b.mo139370t1(1);
        if (TextUtils.isEmpty(mMLiveMediaConfig.url)) {
            eyx.m118802c().m118803a("startPush", "rtmpUrl", LogLevel.ERROR);
        }
        if (this.f108287b != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f108287b.mo139337J(str);
            }
            this.f108287b.mo160318R(this.f108291f);
            this.f108287b.mo139369t0();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m131598m(String str) {
        gxl gxlVar = this.f108287b;
        if (gxlVar != null) {
            gxlVar.mo20093O1(str);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m131599n() {
        gxl gxlVar = this.f108287b;
        if (gxlVar != null) {
            gxlVar.mo139353f();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m131600o() {
        gxl gxlVar = this.f108287b;
        if (gxlVar != null) {
            gxlVar.stopSurroundMusic();
        }
    }
}
