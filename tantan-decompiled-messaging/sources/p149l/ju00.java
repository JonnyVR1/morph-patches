package p149l;

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
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ju00 implements f4m {

    /* JADX INFO: renamed from: a */
    public MMLiveEngine f119721a;

    /* JADX INFO: renamed from: l.ju00$a */
    public class C17861a extends fkw {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ g4m f119722a;

        public C17861a(g4m g4mVar) {
            this.f119722a = g4mVar;
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: A */
        public void mo46992A(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo46992A(str, i, mMLivePushType);
            this.f119722a.mo110342C0(str, i, mMLivePushType);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: C */
        public void mo121896C(int i) {
            super.mo121896C(i);
            this.f119722a.mo110349R0(i);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: D */
        public void mo121897D(int i) {
            super.mo121897D(i);
            this.f119722a.mo110361r0(i);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: G */
        public void mo121900G(MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo121900G(mMLivePushType);
            this.f119722a.mo110353X();
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: I */
        public void mo121902I(MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo121902I(mMLivePushType);
            this.f119722a.mo110354Z();
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: J */
        public void mo121903J(MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo121903J(mMLivePushType);
            this.f119722a.mo110352W();
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: M */
        public void mo121906M(String str) {
            super.mo121906M(str);
            this.f119722a.onPushChangeStreamUrl(str);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: N */
        public void mo121907N(int i, int i2) {
            super.mo121907N(i, i2);
            this.f119722a.onPushLevelChange(i, i2);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: O */
        public void mo121908O(String str, String str2, String str3) {
            super.mo121908O(str, str2, str3);
            this.f119722a.mo110351T(str2, str3);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: Q */
        public void mo121910Q(String str, String str2, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo121910Q(str, str2, mMLivePushType);
            try {
                this.f119722a.mo110340A0(new MMLiveTranscoding(str));
            } catch (Exception unused) {
            }
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: S */
        public void mo46993S(String str, SurfaceView surfaceView, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo46993S(str, surfaceView, mMLivePushType);
            this.f119722a.mo110366z0(Long.parseLong(str), surfaceView);
            this.f119722a.mo110365x0(Long.parseLong(str), surfaceView.getWidth(), surfaceView.getHeight());
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: U */
        public void mo46994U(int i, byte[] bArr) {
            super.mo46994U(i, bArr);
            this.f119722a.mo110348R(i, bArr);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: Y */
        public void mo121916Y(String str, boolean z, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo121916Y(str, z, mMLivePushType);
            this.f119722a.mo110343I(Long.parseLong(str), z);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: Z */
        public void mo46995Z(String str, String str2, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo46995Z(str, str2, mMLivePushType);
            this.f119722a.mo110358e0(str, Long.parseLong(str2), mMLivePushType);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: a0 */
        public void mo46996a0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo46996a0(str, i, mMLivePushType);
            this.f119722a.mo110360o0(Long.parseLong(str), i, mMLivePushType);
            this.f119722a.mo110355b(Long.parseLong(str), i);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: c0 */
        public void mo121921c0(String str, boolean z, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo121921c0(str, z, mMLivePushType);
            this.f119722a.mo110357e(Long.parseLong(str), z);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: e0 */
        public void mo46998e0(AudioVolumeWeight[] audioVolumeWeightArr, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo46998e0(audioVolumeWeightArr, mMLivePushType);
            this.f119722a.mo110359l0(wyi.m206101a(audioVolumeWeightArr));
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: f0 */
        public void mo121925f0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo121925f0(mMLivePushType);
            this.f119722a.onRequestChannelKey();
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: g */
        public void mo121926g(byte[] bArr, int i, int i2) {
            super.mo121926g(bArr, i, i2);
            this.f119722a.mo110345K(bArr, i, i2);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: j0 */
        public void mo121933j0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo121933j0(mMLivePushType);
            this.f119722a.mo110341B0();
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: m */
        public void mo121937m(int i, int i2) {
            super.mo121937m(i, i2);
            this.f119722a.mo110347L0(i, i2);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: n */
        public void mo121938n(int i) {
            super.mo121938n(i);
            this.f119722a.mo110363v0(i);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: o */
        public void mo46999o(MMLiveRoomParams.MMLivePushType mMLivePushType, MMLiveErrorInfo mMLiveErrorInfo) {
            super.mo46999o(mMLivePushType, mMLiveErrorInfo);
            gkh0.m126627j(NavigationIntent.voiceCall, "onEnginePushFailed : LivePushType  =  " + mMLivePushType + ", what = " + mMLiveErrorInfo.what + " , extra= " + mMLiveErrorInfo.extra);
            this.f119722a.mo110350S(mMLivePushType, mMLiveErrorInfo.what, mMLiveErrorInfo.extra);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: p */
        public void mo47000p(MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo47000p(mMLivePushType);
            this.f119722a.mo110364w0(mMLivePushType);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: q */
        public void mo47001q(MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo47001q(mMLivePushType);
            this.f119722a.mo110346K0(mMLivePushType);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: s */
        public void mo121939s(MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo121939s(mMLivePushType);
            this.f119722a.mo69698g0(mMLivePushType);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: t */
        public void mo47003t(MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo47003t(mMLivePushType);
            this.f119722a.mo110344I0(mMLivePushType);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: u */
        public void mo47004u(MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo47004u(mMLivePushType);
            this.f119722a.mo110362u0(mMLivePushType);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: z */
        public void mo47006z(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo47006z(str, j, mMLivePushType);
            this.f119722a.mo110356d0(str, j, mMLivePushType);
        }
    }

    public ju00(MMLiveUserConfig mMLiveUserConfig, Context context) {
        MMLiveEngine mMLiveEngine = new MMLiveEngine(mMLiveUserConfig, context);
        this.f119721a = mMLiveEngine;
        mMLiveEngine.m19128v(true);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: A */
    public void mo68528A(float f) {
        this.f119721a.m19127u0(f);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: B */
    public void mo68529B(String str) {
        this.f119721a.m19068A0(str);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: C */
    public void mo68530C(int i, int i2) {
        akw akwVarM19067A = this.f119721a.m19067A();
        akwVarM19067A.m97191M(i, i2);
        this.f119721a.m19090O0(akwVarM19067A);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: D */
    public int mo68531D(byte[] bArr) {
        return this.f119721a.m19103Z(bArr);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: E */
    public void mo68532E(String str, boolean z) {
        MMLivePlayMusicConfig mMLivePlayMusicConfig = new MMLivePlayMusicConfig();
        mMLivePlayMusicConfig.repeatCount = z ? -1 : 1;
        mMLivePlayMusicConfig.musicUrl = str;
        this.f119721a.m19095R(mMLivePlayMusicConfig);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: G */
    public void mo68534G(String str) {
        this.f119721a.m19131w0(str);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: H */
    public void mo68535H(pph0 pph0Var) {
        if (pph0Var != null) {
            this.f119721a.m19125t(pph0Var.m170723b());
        }
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: I */
    public int mo68536I(MMLiveMediaConfig mMLiveMediaConfig) {
        return this.f119721a.m19074D0(mMLiveMediaConfig);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: J */
    public void mo68537J(boolean z) {
        this.f119721a.m19105b0(z);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: K */
    public void mo68538K(g4m g4mVar) {
        MMLiveEngine mMLiveEngine = this.f119721a;
        if (g4mVar == null) {
            mMLiveEngine.m19126t0(null);
        } else {
            mMLiveEngine.m19126t0(new C17861a(g4mVar));
        }
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: L */
    public void mo68539L(MMLiveTranscoding mMLiveTranscoding) {
        if (mMLiveTranscoding != null) {
            this.f119721a.m19117n0(mMLiveTranscoding);
        }
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: M */
    public void mo68540M(Boolean bool) {
        this.f119721a.m19112i0(bool.booleanValue());
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: N */
    public void mo68541N(boolean z) {
        this.f119721a.m19119p0(z);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: O */
    public void mo68542O(MomoMediaConstants$BEAUTY_TYPE momoMediaConstants$BEAUTY_TYPE) {
        this.f119721a.m19108e0(momoMediaConstants$BEAUTY_TYPE);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: P */
    public void mo68543P(int i, boolean z) {
        this.f119721a.m19129v0(i, z);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: Q */
    public void mo68544Q(pph0 pph0Var) {
        if (pph0Var != null) {
            this.f119721a.m19099V(pph0Var.m170723b());
        }
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: R */
    public int mo68545R(MMLiveMediaConfig mMLiveMediaConfig, MMLiveRoomParams mMLiveRoomParams, MMLiveTranscoding mMLiveTranscoding) {
        if (mMLiveMediaConfig == null || mMLiveRoomParams == null || mMLiveTranscoding == null) {
            return -1;
        }
        return this.f119721a.m19130w(mMLiveMediaConfig, mMLiveRoomParams, mMLiveTranscoding);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: S */
    public void mo68546S(boolean z) {
        this.f119721a.m19115l0(z);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: T */
    public synchronized void mo68547T() {
        this.f119721a.m19085L();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: U */
    public void mo68548U(int i) {
        MMLiveVideoEncoderConfig mMLiveVideoEncoderConfigM19076F = this.f119721a.m19076F();
        mMLiveVideoEncoderConfigM19076F.videoBitRate = i;
        this.f119721a.m19136z0(mMLiveVideoEncoderConfigM19076F);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: V */
    public void mo68549V(String str, pph0 pph0Var) {
        if (pph0Var != null) {
            this.f119721a.m19123s(str, pph0Var.m170723b());
        }
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: W */
    public void mo68550W(String str) {
        this.f119721a.m19086M0(str);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: X */
    public void mo68551X() {
        this.f119721a.m19082J0();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: Y */
    public void mo68552Y(MMLiveRoomParams.MMLiveClientRole mMLiveClientRole) {
        if (mMLiveClientRole != null) {
            this.f119721a.m19109f0(mMLiveClientRole);
        }
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: Z */
    public int mo68553Z(Boolean bool) {
        return this.f119721a.m19107d0(bool.booleanValue() ? MomoMediaConstants$MMLiveAudioMixingDualMonoMode.MMLiveAudioMixingDualMonoR : MomoMediaConstants$MMLiveAudioMixingDualMonoMode.MMLiveAudioMixingDualMonoL);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: a */
    public void mo68554a() {
        this.f119721a.m19079G0();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: a0 */
    public void mo68555a0(boolean z) {
        this.f119721a.m19114k0(z);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: b */
    public void mo68556b(String str) {
        this.f119721a.m19097T(str);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: b0 */
    public void mo68557b0(String str, int i, String str2) {
        this.f119721a.m19121r(str, String.valueOf(i), str2);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: c */
    public long mo68558c() {
        return this.f119721a.m19089O();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: d */
    public float mo68560d() {
        return this.f119721a.m19069B();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: d0 */
    public void mo68561d0(boolean z) {
        this.f119721a.m19110g0(z);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: e */
    public boolean mo68562e() {
        return this.f119721a.m19067A() == null || this.f119721a.m19067A().m97198d() == 1;
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: e0 */
    public boolean mo68563e0(String str, String str2, float f) {
        return this.f119721a.m19088N0(str, str2, f);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: f */
    public int mo68564f() {
        return this.f119721a.m19084K0();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: f0 */
    public void mo68565f0(String str) {
        this.f119721a.m19070B0(str);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: g */
    public igb0 mo68566g() {
        return this.f119721a.m19071C();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: g0 */
    public void mo68567g0() {
        this.f119721a.m19100W();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: h */
    public int mo68568h(int i) {
        return this.f119721a.m19106c0(MomoMediaConstants$MMLiveAudioEffectPreset.fromValue(i));
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: h0 */
    public void mo68569h0(int i, pph0 pph0Var) {
        if (pph0Var != null) {
            this.f119721a.m19125t(pph0Var.m170724c(i));
        }
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: i */
    public float mo68570i() {
        return this.f119721a.m19075E();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: i0 */
    public void mo68571i0(int i) {
        if (this.f119721a.m19135z() != null) {
            this.f119721a.m19135z().mo118391l(i);
        }
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: j */
    public void mo68572j() {
        this.f119721a.m19091P();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: j0 */
    public void mo68573j0(beu beuVar) {
        this.f119721a.m19134y0(wyi.m206102b(beuVar));
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: k */
    public int mo68574k() {
        return this.f119721a.m19133y();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: l */
    public void mo68575l(List<String> list) {
        dkw.m112282i(list);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: m */
    public void mo68576m(String str) {
        this.f119721a.m19120q0(str);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: n */
    public void mo68577n(boolean z) {
        this.f119721a.m19118o0(z);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: o */
    public void mo68578o(String str) {
        this.f119721a.m19092P0(str);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: p */
    public void mo68579p(boolean z) {
        this.f119721a.m19104a0(z);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: q */
    public void mo68580q() {
        this.f119721a.m19101X();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: r */
    public long mo68581r() {
        return this.f119721a.m19087N();
    }

    @Override // p149l.f4m
    public synchronized void release() {
        this.f119721a.m19096S();
    }

    @Override // p149l.f4m
    public boolean removeMakeupStyle(String str, String str2) {
        return this.f119721a.m19098U(str, str2);
    }

    @Override // p149l.f4m
    public int selectAudioTrack(int i) {
        return this.f119721a.m19102Y(i);
    }

    @Override // p149l.f4m
    public void setMusicVolume(float f) {
        this.f119721a.m19122r0(f);
    }

    @Override // p149l.f4m
    public void stopAllEffect() {
        this.f119721a.m19077F0();
    }

    @Override // p149l.f4m
    public void stopEffect(int i) {
        this.f119721a.m19080H0(i);
    }

    @Override // p149l.f4m
    public void stopSurroundMusic() {
        this.f119721a.m19081I0();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: t */
    public void mo68583t(String str) {
        dkw.m112281h(str);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: u */
    public void mo68584u(int i, String str, boolean z, boolean z2) {
        this.f119721a.m19093Q(i, str, 0, 1.0d, 100.0d, false);
    }

    @Override // p149l.f4m
    public boolean updateMakeupStyleValue(String str, String str2, float f) {
        return this.f119721a.m19094Q0(str, str2, f);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: v */
    public void mo68585v(String str) {
        this.f119721a.m19124s0(str);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: w */
    public void mo68586w(akw akwVar) {
        this.f119721a.m19072C0(akwVar);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: x */
    public void mo68587x(float f) {
        this.f119721a.m19116m0(f);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: y */
    public void mo68588y(int i, int i2) {
        MMLiveAudioVolumeConfig mMLiveAudioVolumeConfig = new MMLiveAudioVolumeConfig();
        mMLiveAudioVolumeConfig.interval = i;
        mMLiveAudioVolumeConfig.smooth = i2;
        this.f119721a.m19111h0(mMLiveAudioVolumeConfig);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: z */
    public void mo68589z(boolean z) {
        this.f119721a.m19112i0(z);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: F */
    public void mo68533F(List<TTPresetFilter> list) {
    }

    @Override // p149l.f4m
    @Deprecated
    /* JADX INFO: renamed from: c0 */
    public void mo68559c0(MMLiveMediaConfig mMLiveMediaConfig) {
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: s */
    public void mo68582s(String str) {
    }
}
