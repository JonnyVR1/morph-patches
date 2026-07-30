package p153l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
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
import com.momo.piplinemomoext.input.audio.InterfaceC4260a;

/* JADX INFO: loaded from: classes8.dex */
public class rwp0 extends fr2 implements hwl {

    /* JADX INFO: renamed from: A */
    private int f165211A;

    /* JADX INFO: renamed from: B */
    private int f165212B;

    /* JADX INFO: renamed from: C */
    private boolean f165213C;

    /* JADX INFO: renamed from: D */
    private int f165214D;

    /* JADX INFO: renamed from: E */
    private int f165215E;

    /* JADX INFO: renamed from: F */
    private int f165216F;

    /* JADX INFO: renamed from: G */
    private boolean f165217G;

    /* JADX INFO: renamed from: H */
    private boolean f165218H;

    /* JADX INFO: renamed from: I */
    private String f165219I;

    /* JADX INFO: renamed from: y */
    boolean f165220y;

    /* JADX INFO: renamed from: z */
    boolean f165221z;

    public rwp0(@NonNull Context context, @NonNull c410 c410Var, @NonNull z5m z5mVar, @NonNull uow uowVar, @NonNull InterfaceC4260a interfaceC4260a, String str) {
        super(context, c410Var, z5mVar, uowVar, interfaceC4260a);
        this.f165220y = false;
        this.f165221z = false;
        this.f165211A = 2;
        this.f165212B = -1;
        this.f165213C = false;
        this.f165214D = -1;
        this.f165215E = -1;
        this.f165216F = -1;
        this.f165217G = false;
        this.f165218H = false;
        this.f165219I = "";
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: E0 */
    public int mo109275E0(int i) {
        return -1;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: K1 */
    public boolean mo109284K1(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        return false;
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: O1 */
    public boolean mo21092O1(String str) {
        return false;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: W0 */
    public int mo109301W0(int i, hnw hnwVar) {
        return 0;
    }

    @Override // p153l.fr2, p153l.hwl
    /* JADX INFO: renamed from: X0 */
    public double mo126848X0(int i) {
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: a */
    public void mo107906a(boolean z) {
        super.mo107906a(z);
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: c */
    public long mo21107c() {
        return 0L;
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: d */
    public float mo21108d() {
        return 0.0f;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: e0 */
    public int mo109312e0(int i) {
        return 0;
    }

    @Override // p153l.fr2, p153l.c4m
    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: f2 */
    public void mo107913f2(int i) {
        super.mo107913f2(i);
    }

    @Override // p153l.fr2, p153l.c4m, p153l.hwl
    /* JADX INFO: renamed from: g */
    public mob0 mo107914g() {
        return null;
    }

    @Override // p153l.fr2, p153l.hwl
    public double getEffectsVolume() {
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // p153l.l6m
    public long getMusicDuration() {
        return 0L;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: h */
    public int mo109314h(int i) {
        return 0;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: h2 */
    public int mo109317h2(String str, String str2, String str3) {
        return 0;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: i2 */
    public int mo109319i2(int i) {
        return 0;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: k */
    public int mo109322k() {
        return 0;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: l1 */
    public int mo109324l1(boolean z) {
        return 0;
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: m2 */
    public dpl mo107920m2() {
        return null;
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: r */
    public long mo21126r() {
        return 0L;
    }

    @Override // p153l.hwl
    public int selectAudioTrack(int i) {
        return 0;
    }

    @Override // p153l.hwl
    public int setEnableSpeakerphone(boolean z) {
        return -1;
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: t0 */
    public int mo107927t0() {
        return 0;
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: w */
    public long mo21129w() {
        return 0L;
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: x1 */
    public int mo109335x1(String str) {
        return 0;
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: y1 */
    public float mo21134y1() {
        return 0.0f;
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: A */
    public void mo107888A() {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: F0 */
    public void mo109277F0() {
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: N1 */
    public void mo21090N1() {
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: Y */
    public void mo109304Y() {
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: f */
    public void mo107911f() {
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: j */
    public void mo21116j() {
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: k0 */
    public void mo107916k0() {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: o */
    public void mo107923o() {
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: o0 */
    public void mo21121o0() {
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: p1 */
    public void mo21122p1() {
    }

    @Override // p153l.fr2, p153l.hwl
    public void pauseAllEffects() {
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: q */
    public void mo21124q() {
    }

    @Override // p153l.fr2, p153l.hwl
    public void resumeAllEffects() {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: s */
    public void mo109331s() {
    }

    @Override // p153l.hwl
    public void stopAllEffects() {
    }

    @Override // p153l.fr2, p153l.l6m
    public void stopSurroundMusic() {
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: w1 */
    public void mo21131w1() {
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: A1 */
    public void mo109267A1(int i) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: B */
    public void mo109268B(String str) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: B0 */
    public void mo109269B0(vpw vpwVar) {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: B1 */
    public void mo107889B1(boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: C0 */
    public void mo109270C0(boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: D */
    public void mo109271D(int i) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: D0 */
    public void mo109272D0(boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: D1 */
    public void mo109273D1(zpw zpwVar) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: E */
    public void mo109274E(MRtcPusherHandler mRtcPusherHandler) {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: F1 */
    public void mo107891F1(int i) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: G */
    public void mo109278G(boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: H0 */
    public void mo109279H0(wpw wpwVar) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: I0 */
    public void mo109280I0(boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: J0 */
    public void mo109281J0(MRtcQualityHandler mRtcQualityHandler) {
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: J1 */
    public void mo107896J1(boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: K0 */
    public void mo109283K0(int i) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: L0 */
    public void mo109286L0(byte[] bArr) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: M1 */
    public void mo109289M1(hwl.InterfaceC17586a interfaceC17586a) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: N */
    public void mo109290N(boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: N0 */
    public void mo109291N0(MRtcExitRoomHandler mRtcExitRoomHandler) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: O0 */
    public void mo109292O0(upw upwVar) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: P0 */
    public void mo109293P0(gbl0 gbl0Var) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: P1 */
    public void mo109294P1(boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: Q1 */
    public void mo109295Q1(String str) {
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: R */
    public void mo109296R(fb1 fb1Var) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: S */
    public void mo109297S(boolean z) {
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: T0 */
    public void mo107901T0(int i) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: T1 */
    public void mo109298T1(boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: U */
    public void mo109299U(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: W1 */
    public void mo21100W1(float f) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: X1 */
    public void mo109303X1(MRtcEventHandler mRtcEventHandler) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: Y1 */
    public void mo109305Y1(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: Z */
    public void mo109306Z(String str) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: Z0 */
    public void mo109307Z0(boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: a0 */
    public void mo109308a0(ypw ypwVar) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: a2 */
    public void mo109309a2(MRtcConnectHandler mRtcConnectHandler) {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: b */
    public void mo107907b(boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: c0 */
    public void mo109310c0(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: e */
    public void mo107909e(String str) {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: f1 */
    public void mo107912f1(boolean z) {
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: g0 */
    public void mo109313g0(float f) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: h0 */
    public void mo109315h0(String str) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: h1 */
    public void mo109316h1(String str) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: i0 */
    public void mo109318i0(MRtcChannelHandler mRtcChannelHandler) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: j2 */
    public void mo109321j2(kod0 kod0Var) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: l2 */
    public void mo109325l2(String str) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: m0 */
    public void mo109326m0(ebl0 ebl0Var) {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: m1 */
    public void mo107919m1(pcmDataAvailableCallback pcmdataavailablecallback) {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: n0 */
    public void mo107922n0(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: o1 */
    public void mo109327o1(boolean z) {
    }

    @Override // p153l.fr2, p153l.hwl
    public void pauseEffect(int i) {
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: q0 */
    public void mo21125q0(long j) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: q1 */
    public void mo109328q1(boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: r1 */
    public void mo109330r1(gkl0 gkl0Var) {
    }

    @Override // p153l.fr2, p153l.hwl
    public void resumeEffect(int i) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: s0 */
    public void mo109332s0(MRtcSurroundMusicHander mRtcSurroundMusicHander) {
    }

    @Override // p153l.hwl
    public void setEffectsVolume(double d) {
    }

    @Override // p153l.l6m
    public void setMusicPitch(int i) {
    }

    @Override // p153l.l6m
    public void setMusicVolume(float f) {
    }

    @Override // p153l.hwl
    public void stopEffect(int i) {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: t1 */
    public void mo107928t1(int i) {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: u */
    public void mo107929u(boolean z) {
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: u0 */
    public void mo107930u0(boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: u1 */
    public void mo109333u1(boolean z) {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: v0 */
    public void mo107931v0(boolean z) {
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: v1 */
    public void mo21128v1(long j) {
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: w0 */
    public void mo21130w0(long j) {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: x */
    public void mo107932x(boolean z) {
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: z */
    public void mo21135z(boolean z) {
    }

    public rwp0(@NonNull Context context, @NonNull c410 c410Var, @NonNull z5m z5mVar, @NonNull uow uowVar, @NonNull InterfaceC4260a interfaceC4260a) {
        super(context, c410Var, z5mVar, uowVar, interfaceC4260a);
        this.f165220y = false;
        this.f165221z = false;
        this.f165211A = 2;
        this.f165212B = -1;
        this.f165213C = false;
        this.f165214D = -1;
        this.f165215E = -1;
        this.f165216F = -1;
        this.f165217G = false;
        this.f165218H = false;
        this.f165219I = "";
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: A0 */
    public void mo109266A0(int i, int i2) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: E1 */
    public void mo109276E1(boolean z, boolean z2) {
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: F */
    public void mo21081F(String str, String str2) {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: H1 */
    public void mo107893H1(long j, boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: L */
    public void mo109285L(long j, float f) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: M */
    public void mo109287M(int i, double d) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: M0 */
    public void mo109288M0(int i, int i2) {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: Q0 */
    public void mo107899Q0(long j, boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: W */
    public void mo109300W(boolean z, String str) {
    }

    @Override // p153l.fr2, p153l.l6m
    /* JADX INFO: renamed from: Y0 */
    public void mo21101Y0(long j, boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: c1 */
    public void mo109311c1(int i, boolean z) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: j1 */
    public void mo109320j1(boolean z, int i) {
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: p */
    public void mo107924p(String str, int i) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: z0 */
    public void mo109336z0(long j, boolean z) {
    }

    @Override // p153l.fr2, p153l.c4m
    /* JADX INFO: renamed from: Z1 */
    public void mo107905Z1(MRtcAudioHandler mRtcAudioHandler, int i, int i2) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: K */
    public void mo109282K(int i, int i2, int i3, int i4) {
    }

    @Override // p153l.hwl
    /* JADX INFO: renamed from: r0 */
    public void mo109329r0(String str, boolean z, boolean z2, int i) {
    }
}
