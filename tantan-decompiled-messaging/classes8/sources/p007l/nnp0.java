package p007l;

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
import com.momo.piplinemomoext.input.audio.InterfaceC0021a;
import l.anw;
import l.b2l0;
import l.bnw;
import l.cbl0;
import l.i3m;
import l.sml;
import l.uv00;
import l.vlw;
import l.wmw;
import l.xmw;
import l.ya1;
import l.ymw;
import l.z1l0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class nnp0 extends oq2 implements ttl {

    /* JADX INFO: renamed from: A */
    private int f3419A;

    /* JADX INFO: renamed from: B */
    private int f3420B;

    /* JADX INFO: renamed from: C */
    private boolean f3421C;

    /* JADX INFO: renamed from: D */
    private int f3422D;

    /* JADX INFO: renamed from: E */
    private int f3423E;

    /* JADX INFO: renamed from: F */
    private int f3424F;

    /* JADX INFO: renamed from: G */
    private boolean f3425G;

    /* JADX INFO: renamed from: H */
    private boolean f3426H;

    /* JADX INFO: renamed from: I */
    private String f3427I;

    /* JADX INFO: renamed from: y */
    boolean f3428y;

    /* JADX INFO: renamed from: z */
    boolean f3429z;

    public nnp0(@NonNull Context context, @NonNull uv00 uv00Var, @NonNull i3m i3mVar, @NonNull vlw vlwVar, @NonNull InterfaceC0021a interfaceC0021a, String str) {
        super(context, uv00Var, i3mVar, vlwVar, interfaceC0021a);
        this.f3428y = false;
        this.f3429z = false;
        this.f3419A = 2;
        this.f3420B = -1;
        this.f3421C = false;
        this.f3422D = -1;
        this.f3423E = -1;
        this.f3424F = -1;
        this.f3425G = false;
        this.f3426H = false;
        this.f3427I = "";
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: E0 */
    public int mo10002E0(int i) {
        return -1;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: K1 */
    public boolean mo10012K1(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        return false;
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: O1 */
    public boolean mo9854O1(String str) {
        return false;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: W0 */
    public int mo10030W0(int i, ikw ikwVar) {
        return 0;
    }

    @Override // p007l.oq2, p007l.ttl
    /* JADX INFO: renamed from: X0 */
    public double mo10032X0(int i) {
        return 0.0d;
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: a */
    public void mo9473a(boolean z) {
        super.mo9473a(z);
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: c */
    public long mo10041c() {
        return 0L;
    }

    /* JADX INFO: renamed from: d */
    public float m10044d() {
        return 0.0f;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: e0 */
    public int mo10045e0(int i) {
        return 0;
    }

    @Override // p007l.oq2, p007l.j1m
    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: f2 */
    public void mo9480f2(int i) {
        super.mo9480f2(i);
    }

    @Override // p007l.oq2, p007l.j1m, p007l.ttl
    /* JADX INFO: renamed from: g */
    public igb0 mo9481g() {
        return null;
    }

    @Override // p007l.oq2, p007l.ttl
    public double getEffectsVolume() {
        return 0.0d;
    }

    public long getMusicDuration() {
        return 0L;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: h */
    public int mo10047h(int i) {
        return 0;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: h2 */
    public int mo10050h2(String str, String str2, String str3) {
        return 0;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: i2 */
    public int mo10052i2(int i) {
        return 0;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: k */
    public int mo10056k() {
        return 0;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: l1 */
    public int mo10057l1(boolean z) {
        return 0;
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: m2 */
    public sml mo9487m2() {
        return null;
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: r */
    public long mo10066r() {
        return 0L;
    }

    @Override // p007l.ttl
    public int selectAudioTrack(int i) {
        return 0;
    }

    @Override // p007l.ttl
    public int setEnableSpeakerphone(boolean z) {
        return -1;
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: t0 */
    public int mo9494t0() {
        return 0;
    }

    /* JADX INFO: renamed from: w */
    public long m10073w() {
        return 0L;
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: x1 */
    public int mo10076x1(String str) {
        return 0;
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: y1 */
    public float mo10077y1() {
        return 0.0f;
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: A */
    public void mo9455A() {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: F0 */
    public void mo10005F0() {
    }

    /* JADX INFO: renamed from: N1 */
    public void m10020N1() {
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: Y */
    public void mo10034Y() {
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: f */
    public void mo9478f() {
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: j */
    public void mo10053j() {
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: k0 */
    public void mo9483k0() {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: o */
    public void mo9490o() {
    }

    /* JADX INFO: renamed from: o0 */
    public void m10060o0() {
    }

    /* JADX INFO: renamed from: p1 */
    public void m10062p1() {
    }

    @Override // p007l.oq2, p007l.ttl
    public void pauseAllEffects() {
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: q */
    public void mo10063q() {
    }

    @Override // p007l.oq2, p007l.ttl
    public void resumeAllEffects() {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: s */
    public void mo10069s() {
    }

    @Override // p007l.ttl
    public void stopAllEffects() {
    }

    @Override // p007l.oq2
    public void stopSurroundMusic() {
    }

    /* JADX INFO: renamed from: w1 */
    public void m10075w1() {
    }

    /* JADX INFO: renamed from: A1 */
    public void m9994A1(int i) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: B */
    public void mo9995B(String str) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: B0 */
    public void mo9996B0(xmw xmwVar) {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: B1 */
    public void mo9456B1(boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: C0 */
    public void mo9997C0(boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: D */
    public void mo9998D(int i) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: D0 */
    public void mo9999D0(boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: D1 */
    public void mo10000D1(bnw bnwVar) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: E */
    public void mo10001E(MRtcPusherHandler mRtcPusherHandler) {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: F1 */
    public void mo9458F1(int i) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: G */
    public void mo10006G(boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: H0 */
    public void mo10007H0(ymw ymwVar) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: I0 */
    public void mo10008I0(boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: J0 */
    public void mo10009J0(MRtcQualityHandler mRtcQualityHandler) {
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: J1 */
    public void mo9463J1(boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: K0 */
    public void mo10011K0(int i) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: L0 */
    public void mo10014L0(byte[] bArr) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: M1 */
    public void mo10017M1(ttl.InterfaceC0721a interfaceC0721a) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: N */
    public void mo10018N(boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: N0 */
    public void mo10019N0(MRtcExitRoomHandler mRtcExitRoomHandler) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: O0 */
    public void mo10021O0(wmw wmwVar) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: P0 */
    public void mo10022P0(b2l0 b2l0Var) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: P1 */
    public void mo10023P1(boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: Q1 */
    public void mo10024Q1(String str) {
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: R */
    public void mo10025R(ya1 ya1Var) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: S */
    public void mo10026S(boolean z) {
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: T0 */
    public void mo9468T0(int i) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: T1 */
    public void mo10027T1(boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: U */
    public void mo10028U(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: W1 */
    public void mo10031W1(float f) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: X1 */
    public void mo10033X1(MRtcEventHandler mRtcEventHandler) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: Y1 */
    public void mo10036Y1(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: Z */
    public void mo10037Z(String str) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: Z0 */
    public void mo10038Z0(boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: a0 */
    public void mo10039a0(anw anwVar) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: a2 */
    public void mo10040a2(MRtcConnectHandler mRtcConnectHandler) {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: b */
    public void mo9474b(boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: c0 */
    public void mo10042c0(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: e */
    public void mo9476e(String str) {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: f1 */
    public void mo9479f1(boolean z) {
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: g0 */
    public void mo10046g0(float f) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: h0 */
    public void mo10048h0(String str) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: h1 */
    public void mo10049h1(String str) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: i0 */
    public void mo10051i0(MRtcChannelHandler mRtcChannelHandler) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: j2 */
    public void mo10055j2(hgd0 hgd0Var) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: l2 */
    public void mo10058l2(String str) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: m0 */
    public void mo10059m0(z1l0 z1l0Var) {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: m1 */
    public void mo9486m1(pcmDataAvailableCallback pcmdataavailablecallback) {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: n0 */
    public void mo9489n0(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: o1 */
    public void mo10061o1(boolean z) {
    }

    @Override // p007l.oq2, p007l.ttl
    public void pauseEffect(int i) {
    }

    /* JADX INFO: renamed from: q0 */
    public void m10064q0(long j) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: q1 */
    public void mo10065q1(boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: r1 */
    public void mo10068r1(cbl0 cbl0Var) {
    }

    @Override // p007l.oq2, p007l.ttl
    public void resumeEffect(int i) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: s0 */
    public void mo10070s0(MRtcSurroundMusicHander mRtcSurroundMusicHander) {
    }

    @Override // p007l.ttl
    public void setEffectsVolume(double d) {
    }

    public void setMusicPitch(int i) {
    }

    public void setMusicVolume(float f) {
    }

    @Override // p007l.ttl
    public void stopEffect(int i) {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: t1 */
    public void mo9495t1(int i) {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: u */
    public void mo9496u(boolean z) {
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: u0 */
    public void mo9497u0(boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: u1 */
    public void mo10071u1(boolean z) {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: v0 */
    public void mo9498v0(boolean z) {
    }

    /* JADX INFO: renamed from: v1 */
    public void m10072v1(long j) {
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: w0 */
    public void mo10074w0(long j) {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: x */
    public void mo9499x(boolean z) {
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: z */
    public void mo10078z(boolean z) {
    }

    public nnp0(@NonNull Context context, @NonNull uv00 uv00Var, @NonNull i3m i3mVar, @NonNull vlw vlwVar, @NonNull InterfaceC0021a interfaceC0021a) {
        super(context, uv00Var, i3mVar, vlwVar, interfaceC0021a);
        this.f3428y = false;
        this.f3429z = false;
        this.f3419A = 2;
        this.f3420B = -1;
        this.f3421C = false;
        this.f3422D = -1;
        this.f3423E = -1;
        this.f3424F = -1;
        this.f3425G = false;
        this.f3426H = false;
        this.f3427I = "";
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: A0 */
    public void mo9993A0(int i, int i2) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: E1 */
    public void mo10003E1(boolean z, boolean z2) {
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: F */
    public void mo10004F(String str, String str2) {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: H1 */
    public void mo9460H1(long j, boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: L */
    public void mo10013L(long j, float f) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: M */
    public void mo10015M(int i, double d) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: M0 */
    public void mo10016M0(int i, int i2) {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: Q0 */
    public void mo9466Q0(long j, boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: W */
    public void mo10029W(boolean z, String str) {
    }

    @Override // p007l.oq2
    /* JADX INFO: renamed from: Y0 */
    public void mo10035Y0(long j, boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: c1 */
    public void mo10043c1(int i, boolean z) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: j1 */
    public void mo10054j1(boolean z, int i) {
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: p */
    public void mo9491p(String str, int i) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: z0 */
    public void mo10079z0(long j, boolean z) {
    }

    @Override // p007l.oq2, p007l.j1m
    /* JADX INFO: renamed from: Z1 */
    public void mo9472Z1(MRtcAudioHandler mRtcAudioHandler, int i, int i2) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: K */
    public void mo10010K(int i, int i2, int i3, int i4) {
    }

    @Override // p007l.ttl
    /* JADX INFO: renamed from: r0 */
    public void mo10067r0(String str, boolean z, boolean z2, int i) {
    }
}
