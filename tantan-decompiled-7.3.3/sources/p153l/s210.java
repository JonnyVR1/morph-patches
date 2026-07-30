package p153l;

import android.content.Context;
import android.view.SurfaceView;
import com.immomo.mediacore.audio.AudioVolumeWeight;
import com.immomo.momomediaext.MMLiveEngine;
import com.immomo.momomediaext.MomoMediaConstants$BEAUTY_TYPE;
import com.immomo.momomediaext.MomoMediaConstants$MMLiveAudioEffectPreset;
import com.immomo.momomediaext.MomoMediaConstants$MMLiveAudioMixingDualMonoMode;
import com.immomo.momomediaext.utils.MMLiveAudioVolumeConfig;
import com.immomo.momomediaext.utils.MMLiveErrorInfo;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLivePlayMusicConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.immomo.momomediaext.utils.MMLiveUserConfig;
import com.immomo.momomediaext.utils.MMLiveVideoEncoderConfig;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class s210 implements v6m {

    /* JADX INFO: renamed from: a */
    public MMLiveEngine f165850a;

    /* JADX INFO: renamed from: l.s210$a */
    public class C19960a extends enw {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ w6m f165851a;

        public C19960a(w6m w6mVar) {
            this.f165851a = w6mVar;
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: A */
        public void mo48175A(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo48175A(str, i, mMLivePushType);
            this.f165851a.mo96682C0(str, i, mMLivePushType);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: C */
        public void mo121566C(int i) {
            super.mo121566C(i);
            this.f165851a.mo120107R0(i);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: D */
        public void mo121567D(int i) {
            super.mo121567D(i);
            this.f165851a.mo120112r0(i);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: G */
        public void mo121570G(MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo121570G(mMLivePushType);
            this.f165851a.mo120109X();
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: I */
        public void mo121572I(MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo121572I(mMLivePushType);
            this.f165851a.mo120110Z();
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: J */
        public void mo121573J(MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo121573J(mMLivePushType);
            this.f165851a.mo120108W();
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: M */
        public void mo121576M(String str) {
            super.mo121576M(str);
            this.f165851a.onPushChangeStreamUrl(str);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: N */
        public void mo121577N(int i, int i2) {
            super.mo121577N(i, i2);
            this.f165851a.onPushLevelChange(i, i2);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: O */
        public void mo121578O(String str, String str2, String str3) {
            super.mo121578O(str, str2, str3);
            this.f165851a.mo101579T(str2, str3);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: Q */
        public void mo121580Q(String str, String str2, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo121580Q(str, str2, mMLivePushType);
            try {
                this.f165851a.mo105805A0(new MMLiveTranscoding(str));
            } catch (Exception unused) {
            }
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: S */
        public void mo48176S(String str, SurfaceView surfaceView, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo48176S(str, surfaceView, mMLivePushType);
            this.f165851a.mo96694z0(Long.parseLong(str), surfaceView);
            this.f165851a.mo105807x0(Long.parseLong(str), surfaceView.getWidth(), surfaceView.getHeight());
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: U */
        public void mo48177U(int i, byte[] bArr) {
            super.mo48177U(i, bArr);
            this.f165851a.mo120106R(i, bArr);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: Y */
        public void mo121586Y(String str, boolean z, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo121586Y(str, z, mMLivePushType);
            this.f165851a.mo120101I(Long.parseLong(str), z);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: Z */
        public void mo48178Z(String str, String str2, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo48178Z(str, str2, mMLivePushType);
            this.f165851a.mo96687e0(str, Long.parseLong(str2), mMLivePushType);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: a0 */
        public void mo48179a0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo48179a0(str, i, mMLivePushType);
            this.f165851a.mo96689o0(Long.parseLong(str), i, mMLivePushType);
            this.f165851a.mo96685b(Long.parseLong(str), i);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: c0 */
        public void mo121591c0(String str, boolean z, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo121591c0(str, z, mMLivePushType);
            this.f165851a.mo120111e(Long.parseLong(str), z);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: e0 */
        public void mo48181e0(AudioVolumeWeight[] audioVolumeWeightArr, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo48181e0(audioVolumeWeightArr, mMLivePushType);
            this.f165851a.mo96688l0(r1j.m179412a(audioVolumeWeightArr));
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: f0 */
        public void mo121595f0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo121595f0(mMLivePushType);
            this.f165851a.onRequestChannelKey();
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: g */
        public void mo121596g(byte[] bArr, int i, int i2) {
            super.mo121596g(bArr, i, i2);
            this.f165851a.mo120103K(bArr, i, i2);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: j0 */
        public void mo121603j0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo121603j0(mMLivePushType);
            this.f165851a.mo96681B0();
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: m */
        public void mo121607m(int i, int i2) {
            super.mo121607m(i, i2);
            this.f165851a.mo120105L0(i, i2);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: n */
        public void mo121608n(int i) {
            super.mo121608n(i);
            this.f165851a.mo120114v0(i);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: o */
        public void mo48182o(MMLiveRoomParams.MMLivePushType mMLivePushType, MMLiveErrorInfo mMLiveErrorInfo) {
            super.mo48182o(mMLivePushType, mMLiveErrorInfo);
            nsh0.m164608j(NavigationIntent.voiceCall, "onEnginePushFailed : LivePushType  =  " + mMLivePushType + ", what = " + mMLiveErrorInfo.what + " , extra= " + mMLiveErrorInfo.extra);
            this.f165851a.mo96683S(mMLivePushType, mMLiveErrorInfo.what, mMLiveErrorInfo.extra);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: p */
        public void mo48183p(MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo48183p(mMLivePushType);
            this.f165851a.mo120115w0(mMLivePushType);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: q */
        public void mo48184q(MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo48184q(mMLivePushType);
            this.f165851a.mo120104K0(mMLivePushType);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: s */
        public void mo121609s(MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo121609s(mMLivePushType);
            this.f165851a.mo70881g0(mMLivePushType);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: t */
        public void mo48186t(MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo48186t(mMLivePushType);
            this.f165851a.mo120102I0(mMLivePushType);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: u */
        public void mo48187u(MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo48187u(mMLivePushType);
            this.f165851a.mo120113u0(mMLivePushType);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: z */
        public void mo48189z(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo48189z(str, j, mMLivePushType);
            this.f165851a.mo96686d0(str, j, mMLivePushType);
        }
    }

    public s210(MMLiveUserConfig mMLiveUserConfig, Context context) {
        MMLiveEngine mMLiveEngine = new MMLiveEngine(mMLiveUserConfig, context);
        this.f165850a = mMLiveEngine;
        mMLiveEngine.m20108v(true);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: A */
    public void mo69711A(float f) {
        this.f165850a.m20107u0(f);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: B */
    public void mo69712B(String str) {
        this.f165850a.m20048A0(str);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: C */
    public void mo69713C(int i, int i2) {
        zmw zmwVarM20047A = this.f165850a.m20047A();
        zmwVarM20047A.m220496M(i, i2);
        this.f165850a.m20070O0(zmwVarM20047A);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: D */
    public int mo69714D(byte[] bArr) {
        return this.f165850a.m20083Z(bArr);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: E */
    public void mo69715E(String str, boolean z) {
        MMLivePlayMusicConfig mMLivePlayMusicConfig = new MMLivePlayMusicConfig();
        mMLivePlayMusicConfig.repeatCount = z ? -1 : 1;
        mMLivePlayMusicConfig.musicUrl = str;
        this.f165850a.m20075R(mMLivePlayMusicConfig);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: G */
    public void mo69717G(String str) {
        this.f165850a.m20111w0(str);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: H */
    public void mo69718H(wxh0 wxh0Var) {
        if (wxh0Var != null) {
            this.f165850a.m20105t(wxh0Var.m208415b());
        }
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: I */
    public int mo69719I(MMLiveMediaConfig mMLiveMediaConfig) {
        return this.f165850a.m20054D0(mMLiveMediaConfig);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: J */
    public void mo69720J(boolean z) {
        this.f165850a.m20085b0(z);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: K */
    public void mo69721K(w6m w6mVar) {
        MMLiveEngine mMLiveEngine = this.f165850a;
        if (w6mVar == null) {
            mMLiveEngine.m20106t0(null);
        } else {
            mMLiveEngine.m20106t0(new C19960a(w6mVar));
        }
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: L */
    public void mo69722L(MMLiveTranscoding mMLiveTranscoding) {
        if (mMLiveTranscoding != null) {
            this.f165850a.m20097n0(mMLiveTranscoding);
        }
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: M */
    public void mo69723M(Boolean bool) {
        this.f165850a.m20092i0(bool.booleanValue());
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: N */
    public void mo69724N(boolean z) {
        this.f165850a.m20099p0(z);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: O */
    public void mo69725O(MomoMediaConstants$BEAUTY_TYPE momoMediaConstants$BEAUTY_TYPE) {
        this.f165850a.m20088e0(momoMediaConstants$BEAUTY_TYPE);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: P */
    public void mo69726P(int i, boolean z) {
        this.f165850a.m20109v0(i, z);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: Q */
    public void mo69727Q(wxh0 wxh0Var) {
        if (wxh0Var != null) {
            this.f165850a.m20079V(wxh0Var.m208415b());
        }
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: R */
    public int mo69728R(MMLiveMediaConfig mMLiveMediaConfig, MMLiveRoomParams mMLiveRoomParams, MMLiveTranscoding mMLiveTranscoding) {
        if (mMLiveMediaConfig == null || mMLiveRoomParams == null || mMLiveTranscoding == null) {
            return -1;
        }
        return this.f165850a.m20110w(mMLiveMediaConfig, mMLiveRoomParams, mMLiveTranscoding);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: S */
    public void mo69729S(boolean z) {
        this.f165850a.m20095l0(z);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: T */
    public synchronized void mo69730T() {
        this.f165850a.m20065L();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: U */
    public void mo69731U(int i) {
        MMLiveVideoEncoderConfig mMLiveVideoEncoderConfigM20056F = this.f165850a.m20056F();
        mMLiveVideoEncoderConfigM20056F.videoBitRate = i;
        this.f165850a.m20116z0(mMLiveVideoEncoderConfigM20056F);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: V */
    public void mo69732V(String str, wxh0 wxh0Var) {
        if (wxh0Var != null) {
            this.f165850a.m20103s(str, wxh0Var.m208415b());
        }
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: W */
    public void mo69733W(String str) {
        this.f165850a.m20066M0(str);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: X */
    public void mo69734X() {
        this.f165850a.m20062J0();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: Y */
    public void mo69735Y(MMLiveRoomParams.MMLiveClientRole mMLiveClientRole) {
        if (mMLiveClientRole != null) {
            this.f165850a.m20089f0(mMLiveClientRole);
        }
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: Z */
    public int mo69736Z(Boolean bool) {
        return this.f165850a.m20087d0(bool.booleanValue() ? MomoMediaConstants$MMLiveAudioMixingDualMonoMode.MMLiveAudioMixingDualMonoR : MomoMediaConstants$MMLiveAudioMixingDualMonoMode.MMLiveAudioMixingDualMonoL);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: a */
    public void mo69737a() {
        this.f165850a.m20059G0();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: a0 */
    public void mo69738a0(boolean z) {
        this.f165850a.m20094k0(z);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: b */
    public void mo69739b(String str) {
        this.f165850a.m20077T(str);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: b0 */
    public void mo69740b0(String str, int i, String str2) {
        this.f165850a.m20101r(str, String.valueOf(i), str2);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: c */
    public long mo69741c() {
        return this.f165850a.m20069O();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: d */
    public float mo69743d() {
        return this.f165850a.m20049B();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: d0 */
    public void mo69744d0(boolean z) {
        this.f165850a.m20090g0(z);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: e */
    public boolean mo69745e() {
        return this.f165850a.m20047A() == null || this.f165850a.m20047A().m220503d() == 1;
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: e0 */
    public boolean mo69746e0(String str, String str2, float f) {
        return this.f165850a.m20068N0(str, str2, f);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: f */
    public int mo69747f() {
        return this.f165850a.m20064K0();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: f0 */
    public void mo69748f0(String str) {
        this.f165850a.m20050B0(str);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: g */
    public mob0 mo69749g() {
        return this.f165850a.m20051C();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: g0 */
    public void mo69750g0() {
        this.f165850a.m20080W();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: h */
    public int mo69751h(int i) {
        return this.f165850a.m20086c0(MomoMediaConstants$MMLiveAudioEffectPreset.fromValue(i));
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: h0 */
    public void mo69752h0(int i, wxh0 wxh0Var) {
        if (wxh0Var != null) {
            this.f165850a.m20105t(wxh0Var.m208416c(i));
        }
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: i */
    public float mo69753i() {
        return this.f165850a.m20055E();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: i0 */
    public void mo69754i0(int i) {
        if (this.f165850a.m20115z() != null) {
            this.f165850a.m20115z().mo137093l(i);
        }
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: j */
    public void mo69755j() {
        this.f165850a.m20071P();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: j0 */
    public void mo69756j0(cgu cguVar) {
        this.f165850a.m20114y0(r1j.m179413b(cguVar));
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: k */
    public int mo69757k() {
        return this.f165850a.m20113y();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: l */
    public void mo69758l(List<String> list) {
        cnw.m111550i(list);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: m */
    public void mo69759m(String str) {
        this.f165850a.m20100q0(str);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: n */
    public void mo69760n(boolean z) {
        this.f165850a.m20098o0(z);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: o */
    public void mo69761o(String str) {
        this.f165850a.m20072P0(str);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: p */
    public void mo69762p(boolean z) {
        this.f165850a.m20084a0(z);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: q */
    public void mo69763q() {
        this.f165850a.m20081X();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: r */
    public long mo69764r() {
        return this.f165850a.m20067N();
    }

    @Override // p153l.v6m
    public synchronized void release() {
        this.f165850a.m20076S();
    }

    @Override // p153l.v6m
    public boolean removeMakeupStyle(String str, String str2) {
        return this.f165850a.m20078U(str, str2);
    }

    @Override // p153l.v6m
    public int selectAudioTrack(int i) {
        return this.f165850a.m20082Y(i);
    }

    @Override // p153l.v6m
    public void setMusicVolume(float f) {
        this.f165850a.m20102r0(f);
    }

    @Override // p153l.v6m
    public void stopAllEffect() {
        this.f165850a.m20057F0();
    }

    @Override // p153l.v6m
    public void stopEffect(int i) {
        this.f165850a.m20060H0(i);
    }

    @Override // p153l.v6m
    public void stopSurroundMusic() {
        this.f165850a.m20061I0();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: t */
    public void mo69766t(String str) {
        cnw.m111549h(str);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: u */
    public void mo69767u(int i, String str, boolean z, boolean z2) {
        this.f165850a.m20073Q(i, str, 0, 1.0d, 100.0d, false);
    }

    @Override // p153l.v6m
    public boolean updateMakeupStyleValue(String str, String str2, float f) {
        return this.f165850a.m20074Q0(str, str2, f);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: v */
    public void mo69768v(String str) {
        this.f165850a.m20104s0(str);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: w */
    public void mo69769w(zmw zmwVar) {
        this.f165850a.m20052C0(zmwVar);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: x */
    public void mo69770x(float f) {
        this.f165850a.m20096m0(f);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: y */
    public void mo69771y(int i, int i2) {
        MMLiveAudioVolumeConfig mMLiveAudioVolumeConfig = new MMLiveAudioVolumeConfig();
        mMLiveAudioVolumeConfig.interval = i;
        mMLiveAudioVolumeConfig.smooth = i2;
        this.f165850a.m20091h0(mMLiveAudioVolumeConfig);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: z */
    public void mo69772z(boolean z) {
        this.f165850a.m20092i0(z);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: F */
    public void mo69716F(List<TTPresetFilter> list) {
    }

    @Override // p153l.v6m
    @Deprecated
    /* JADX INFO: renamed from: c0 */
    public void mo69742c0(MMLiveMediaConfig mMLiveMediaConfig) {
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: s */
    public void mo69765s(String str) {
    }
}
