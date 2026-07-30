package p149l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.immomo.mediacore.audio.pcmDataAvailableCallback;
import com.immomo.mediacore.coninf.MRtcAudioHandler;
import com.immomo.mediacore.coninf.MRtcAudioHandlerEx;
import com.immomo.mediacore.coninf.MRtcChannelHandler;
import com.immomo.mediacore.coninf.MRtcClientRoleChangedHandler;
import com.immomo.mediacore.coninf.MRtcConnectHandler;
import com.immomo.mediacore.coninf.MRtcEventHandler;
import com.immomo.mediacore.coninf.MRtcExitRoomHandler;
import com.immomo.mediacore.coninf.MRtcPusherHandler;
import com.immomo.mediacore.coninf.MRtcQualityHandler;
import com.immomo.mediacore.coninf.MRtcReceiveSeiHandler;
import com.immomo.mediacore.coninf.MRtcSurroundMusicHander;
import com.immomo.mediacore.coninf.MRtcTokenWillExpireHander;
import com.momo.piplinemomoext.input.audio.InterfaceC4109a;

/* JADX INFO: loaded from: classes8.dex */
public class tdj0 extends oq2 implements ttl {

    /* JADX INFO: renamed from: A */
    private cbl0 f169554A;

    /* JADX INFO: renamed from: B */
    private b2l0 f169555B;

    /* JADX INFO: renamed from: C */
    private MRtcEventHandler f169556C;

    /* JADX INFO: renamed from: D */
    private boolean f169557D;

    /* JADX INFO: renamed from: E */
    private boolean f169558E;

    /* JADX INFO: renamed from: F */
    private int f169559F;

    /* JADX INFO: renamed from: G */
    private int f169560G;

    /* JADX INFO: renamed from: H */
    private int f169561H;

    /* JADX INFO: renamed from: I */
    private boolean f169562I;

    /* JADX INFO: renamed from: y */
    private z1l0 f169563y;

    /* JADX INFO: renamed from: z */
    private a2l0 f169564z;

    public tdj0(@NonNull Context context, @NonNull uv00 uv00Var, @NonNull i3m i3mVar, @NonNull vlw vlwVar, @NonNull InterfaceC4109a interfaceC4109a, String str) {
        super(context, uv00Var, i3mVar, vlwVar, interfaceC4109a);
        this.f169557D = false;
        this.f169558E = false;
        this.f169559F = 2;
        this.f169560G = -1;
        this.f169561H = -1;
        this.f169562I = false;
        eyx.m118802c().m118807f("TxPusherPipeline", "createTxPusherPipeline", "tx");
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: E0 */
    public int mo160297E0(int i) {
        return -1;
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: F */
    public void mo20082F(String str, String str2) {
        super.mo20082F(str, str2);
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: K1 */
    public boolean mo160306K1(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        return true;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: M1 */
    public void mo160311M1(ttl.InterfaceC20269a interfaceC20269a) {
        if (interfaceC20269a == null) {
            this.f169564z = null;
        }
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: O1 */
    public boolean mo20093O1(String str) {
        return false;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: P0 */
    public void mo160315P0(b2l0 b2l0Var) {
        this.f169555B = b2l0Var;
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: R */
    public void mo160318R(ya1 ya1Var) {
        super.mo160318R(null);
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: T0 */
    public void mo139343T0(int i) {
        super.mo139343T0(i);
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: W0 */
    public int mo160323W0(int i, ikw ikwVar) {
        return 0;
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: W1 */
    public void mo20101W1(float f) {
        super.mo20101W1(f);
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: X1 */
    public void mo160325X1(MRtcEventHandler mRtcEventHandler) {
        this.f169556C = mRtcEventHandler;
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: Z1 */
    public void mo139347Z1(MRtcAudioHandler mRtcAudioHandler, int i, int i2) {
        super.mo139347Z1(mRtcAudioHandler, i, i2);
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: a */
    public void mo139348a(boolean z) {
        super.mo139348a(z);
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: c */
    public long mo20108c() {
        return super.mo20108c();
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: c1 */
    public void mo160333c1(int i, boolean z) {
        this.f169561H = i;
        this.f169562I = z;
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: c2 */
    public void mo139350c2(MRtcAudioHandler mRtcAudioHandler, int i, int i2, int i3) {
        super.mo139347Z1(mRtcAudioHandler, i, i2);
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: d */
    public float mo20109d() {
        return 1.0f;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: e0 */
    public int mo160334e0(int i) {
        return 0;
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: f */
    public void mo139353f() {
        super.mo139353f();
    }

    @Override // p149l.oq2, p149l.j1m
    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: f2 */
    public void mo139355f2(int i) {
        super.mo139355f2(i);
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: g0 */
    public void mo160335g0(float f) {
        super.mo160335g0(f);
    }

    @Override // p149l.u3m
    public long getMusicDuration() {
        return 0L;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: h */
    public int mo160336h(int i) {
        return 0;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: h2 */
    public int mo160339h2(String str, String str2, String str3) {
        return 0;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: i2 */
    public int mo160341i2(int i) {
        return 0;
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: j */
    public void mo20117j() {
        super.mo20117j();
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: k */
    public int mo160344k() {
        return 0;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: l1 */
    public int mo160345l1(boolean z) {
        return 0;
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: m0 */
    public void mo160347m0(z1l0 z1l0Var) {
        this.f169563y = z1l0Var;
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: m2 */
    public sml mo139362m2() {
        return null;
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: q */
    public void mo20125q() {
        super.mo20125q();
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: r */
    public long mo20127r() {
        return super.mo20127r();
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: r1 */
    public void mo160351r1(cbl0 cbl0Var) {
        this.f169554A = cbl0Var;
    }

    @Override // p149l.ttl
    public int selectAudioTrack(int i) {
        return 0;
    }

    @Override // p149l.ttl
    public int setEnableSpeakerphone(boolean z) {
        return -1;
    }

    @Override // p149l.oq2, p149l.u3m
    public void stopSurroundMusic() {
        super.stopSurroundMusic();
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: t0 */
    public int mo139369t0() {
        return super.mo139369t0();
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: t1 */
    public void mo139370t1(int i) {
        this.f169559F = i;
    }

    @Override // p149l.oq2, p149l.j1m
    /* JADX INFO: renamed from: u0 */
    public void mo139372u0(boolean z) {
        super.mo139372u0(z);
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: w */
    public long mo20130w() {
        return 0L;
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: w0 */
    public void mo20131w0(long j) {
        super.mo20131w0(j);
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: x1 */
    public int mo160355x1(String str) {
        return -3;
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: y1 */
    public float mo20135y1() {
        return super.mo20135y1();
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: z */
    public void mo20136z(boolean z) {
        super.mo20136z(z);
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: F0 */
    public void mo160299F0() {
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: N1 */
    public void mo20091N1() {
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: o */
    public void mo139365o() {
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: o0 */
    public void mo20122o0() {
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: p1 */
    public void mo20123p1() {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: s */
    public void mo160352s() {
    }

    @Override // p149l.ttl
    public void stopAllEffects() {
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: w1 */
    public void mo20132w1() {
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: A1 */
    public void mo160289A1(int i) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: B */
    public void mo160290B(String str) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: B0 */
    public void mo160291B0(xmw xmwVar) {
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: B1 */
    public void mo139331B1(boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: C0 */
    public void mo160292C0(boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: D */
    public void mo160293D(int i) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: D0 */
    public void mo160294D0(boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: D1 */
    public void mo160295D1(bnw bnwVar) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: E */
    public void mo160296E(MRtcPusherHandler mRtcPusherHandler) {
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: F1 */
    public void mo139333F1(int i) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: G */
    public void mo160300G(boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: H0 */
    public void mo160301H0(ymw ymwVar) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: I0 */
    public void mo160302I0(boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: J0 */
    public void mo160303J0(MRtcQualityHandler mRtcQualityHandler) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: K0 */
    public void mo160305K0(int i) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: L0 */
    public void mo160308L0(byte[] bArr) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: N */
    public void mo160312N(boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: N0 */
    public void mo160313N0(MRtcExitRoomHandler mRtcExitRoomHandler) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: O0 */
    public void mo160314O0(wmw wmwVar) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: P1 */
    public void mo160316P1(boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: Q1 */
    public void mo160317Q1(String str) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: S */
    public void mo160319S(boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: T1 */
    public void mo160320T1(boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: U */
    public void mo160321U(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: Y1 */
    public void mo160327Y1(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: Z */
    public void mo160328Z(String str) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: Z0 */
    public void mo160329Z0(boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: a0 */
    public void mo160330a0(anw anwVar) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: a2 */
    public void mo160331a2(MRtcConnectHandler mRtcConnectHandler) {
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: b */
    public void mo139349b(boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: c0 */
    public void mo160332c0(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: e */
    public void mo139351e(String str) {
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: f1 */
    public void mo139354f1(boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: h0 */
    public void mo160337h0(String str) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: h1 */
    public void mo160338h1(String str) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: i0 */
    public void mo160340i0(MRtcChannelHandler mRtcChannelHandler) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: j2 */
    public void mo160343j2(hgd0 hgd0Var) {
    }

    @Override // p149l.oq2, p149l.ttl
    /* JADX INFO: renamed from: k2 */
    public void mo162751k2(boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: l2 */
    public void mo160346l2(String str) {
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: m1 */
    public void mo139361m1(pcmDataAvailableCallback pcmdataavailablecallback) {
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: n0 */
    public void mo139364n0(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: o1 */
    public void mo160348o1(boolean z) {
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: q0 */
    public void mo20126q0(long j) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: q1 */
    public void mo160349q1(boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: s0 */
    public void mo160353s0(MRtcSurroundMusicHander mRtcSurroundMusicHander) {
    }

    @Override // p149l.ttl
    public void setEffectsVolume(double d) {
    }

    @Override // p149l.u3m
    public void setMusicPitch(int i) {
    }

    @Override // p149l.u3m
    public void setMusicVolume(float f) {
    }

    @Override // p149l.ttl
    public void stopEffect(int i) {
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: u */
    public void mo139371u(boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: u1 */
    public void mo160354u1(boolean z) {
    }

    @Override // p149l.oq2, p149l.ttl
    /* JADX INFO: renamed from: v */
    public void mo162752v(String str) {
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: v0 */
    public void mo139373v0(boolean z) {
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: v1 */
    public void mo20129v1(long j) {
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: x */
    public void mo139374x(boolean z) {
    }

    public tdj0(@NonNull Context context, @NonNull uv00 uv00Var, @NonNull i3m i3mVar, @NonNull vlw vlwVar, @NonNull InterfaceC4109a interfaceC4109a) {
        super(context, uv00Var, i3mVar, vlwVar, interfaceC4109a);
        this.f169557D = false;
        this.f169558E = false;
        this.f169559F = 2;
        this.f169560G = -1;
        this.f169561H = -1;
        this.f169562I = false;
        eyx.m118802c().m118807f("TxPusherPipeline", "createTxPusherPipeline", "tx");
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: A0 */
    public void mo160288A0(int i, int i2) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: E1 */
    public void mo160298E1(boolean z, boolean z2) {
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: H1 */
    public void mo139335H1(long j, boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: L */
    public void mo160307L(long j, float f) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: M */
    public void mo160309M(int i, double d) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: M0 */
    public void mo160310M0(int i, int i2) {
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: Q0 */
    public void mo139341Q0(long j, boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: W */
    public void mo160322W(boolean z, String str) {
    }

    @Override // p149l.oq2, p149l.u3m
    /* JADX INFO: renamed from: Y0 */
    public void mo20102Y0(long j, boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: j1 */
    public void mo160342j1(boolean z, int i) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: z0 */
    public void mo160356z0(long j, boolean z) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: K */
    public void mo160304K(int i, int i2, int i3, int i4) {
    }

    @Override // p149l.ttl
    /* JADX INFO: renamed from: r0 */
    public void mo160350r0(String str, boolean z, boolean z2, int i) {
    }
}
