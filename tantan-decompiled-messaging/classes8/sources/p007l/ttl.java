package p007l;

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
import l.anw;
import l.b2l0;
import l.bnw;
import l.cbl0;
import l.wmw;
import l.xmw;
import l.ymw;
import l.z1l0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public interface ttl extends j1m {

    /* JADX INFO: renamed from: l.ttl$a */
    public interface InterfaceC0721a {
    }

    /* JADX INFO: renamed from: A0 */
    void mo9993A0(int i, int i2);

    /* JADX INFO: renamed from: B */
    void mo9995B(String str);

    /* JADX INFO: renamed from: B0 */
    void mo9996B0(xmw xmwVar);

    /* JADX INFO: renamed from: C0 */
    void mo9997C0(boolean z);

    /* JADX INFO: renamed from: D */
    void mo9998D(int i);

    /* JADX INFO: renamed from: D0 */
    void mo9999D0(boolean z);

    /* JADX INFO: renamed from: D1 */
    void mo10000D1(bnw bnwVar);

    /* JADX INFO: renamed from: E */
    void mo10001E(MRtcPusherHandler mRtcPusherHandler);

    /* JADX INFO: renamed from: E0 */
    int mo10002E0(int i);

    /* JADX INFO: renamed from: E1 */
    void mo10003E1(boolean z, boolean z2);

    /* JADX INFO: renamed from: F0 */
    void mo10005F0();

    /* JADX INFO: renamed from: G */
    void mo10006G(boolean z);

    /* JADX INFO: renamed from: H0 */
    void mo10007H0(ymw ymwVar);

    /* JADX INFO: renamed from: I0 */
    void mo10008I0(boolean z);

    /* JADX INFO: renamed from: J0 */
    void mo10009J0(MRtcQualityHandler mRtcQualityHandler);

    /* JADX INFO: renamed from: K */
    void mo10010K(int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: K0 */
    void mo10011K0(int i);

    /* JADX INFO: renamed from: K1 */
    boolean mo10012K1(int i, String str, int i2, double d, double d2, boolean z, double d3);

    /* JADX INFO: renamed from: L */
    void mo10013L(long j, float f);

    /* JADX INFO: renamed from: L0 */
    void mo10014L0(byte[] bArr);

    /* JADX INFO: renamed from: M */
    void mo10015M(int i, double d);

    /* JADX INFO: renamed from: M0 */
    void mo10016M0(int i, int i2);

    /* JADX INFO: renamed from: M1 */
    void mo10017M1(InterfaceC0721a interfaceC0721a);

    /* JADX INFO: renamed from: N */
    void mo10018N(boolean z);

    /* JADX INFO: renamed from: N0 */
    void mo10019N0(MRtcExitRoomHandler mRtcExitRoomHandler);

    /* JADX INFO: renamed from: O0 */
    void mo10021O0(wmw wmwVar);

    /* JADX INFO: renamed from: P0 */
    void mo10022P0(b2l0 b2l0Var);

    /* JADX INFO: renamed from: P1 */
    void mo10023P1(boolean z);

    /* JADX INFO: renamed from: Q1 */
    void mo10024Q1(String str);

    /* JADX INFO: renamed from: S */
    void mo10026S(boolean z);

    /* JADX INFO: renamed from: T1 */
    void mo10027T1(boolean z);

    /* JADX INFO: renamed from: U */
    void mo10028U(MRtcTokenWillExpireHander mRtcTokenWillExpireHander);

    /* JADX INFO: renamed from: W */
    void mo10029W(boolean z, String str);

    /* JADX INFO: renamed from: W0 */
    int mo10030W0(int i, ikw ikwVar);

    /* JADX INFO: renamed from: X */
    void mo10176X(boolean z);

    /* JADX INFO: renamed from: X0 */
    double mo10032X0(int i);

    /* JADX INFO: renamed from: X1 */
    void mo10033X1(MRtcEventHandler mRtcEventHandler);

    /* JADX INFO: renamed from: Y1 */
    void mo10036Y1(MRtcReceiveSeiHandler mRtcReceiveSeiHandler);

    /* JADX INFO: renamed from: Z */
    void mo10037Z(String str);

    /* JADX INFO: renamed from: Z0 */
    void mo10038Z0(boolean z);

    /* JADX INFO: renamed from: a0 */
    void mo10039a0(anw anwVar);

    /* JADX INFO: renamed from: a2 */
    void mo10040a2(MRtcConnectHandler mRtcConnectHandler);

    /* JADX INFO: renamed from: c0 */
    void mo10042c0(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler);

    /* JADX INFO: renamed from: c1 */
    void mo10043c1(int i, boolean z);

    /* JADX INFO: renamed from: e0 */
    int mo10045e0(int i);

    /* JADX INFO: renamed from: g */
    igb0 mo9481g();

    double getEffectsVolume();

    /* JADX INFO: renamed from: h */
    int mo10047h(int i);

    /* JADX INFO: renamed from: h0 */
    void mo10048h0(String str);

    /* JADX INFO: renamed from: h1 */
    void mo10049h1(String str);

    /* JADX INFO: renamed from: h2 */
    int mo10050h2(String str, String str2, String str3);

    /* JADX INFO: renamed from: i0 */
    void mo10051i0(MRtcChannelHandler mRtcChannelHandler);

    /* JADX INFO: renamed from: i2 */
    int mo10052i2(int i);

    /* JADX INFO: renamed from: j1 */
    void mo10054j1(boolean z, int i);

    /* JADX INFO: renamed from: j2 */
    void mo10055j2(hgd0 hgd0Var);

    /* JADX INFO: renamed from: k */
    int mo10056k();

    /* JADX INFO: renamed from: k2 */
    void mo10178k2(boolean z);

    /* JADX INFO: renamed from: l1 */
    int mo10057l1(boolean z);

    /* JADX INFO: renamed from: l2 */
    void mo10058l2(String str);

    /* JADX INFO: renamed from: m0 */
    void mo10059m0(z1l0 z1l0Var);

    /* JADX INFO: renamed from: o1 */
    void mo10061o1(boolean z);

    void pauseAllEffects();

    void pauseEffect(int i);

    /* JADX INFO: renamed from: q1 */
    void mo10065q1(boolean z);

    /* JADX INFO: renamed from: r0 */
    void mo10067r0(String str, boolean z, boolean z2, int i);

    /* JADX INFO: renamed from: r1 */
    void mo10068r1(cbl0 cbl0Var);

    void resumeAllEffects();

    void resumeEffect(int i);

    /* JADX INFO: renamed from: s */
    void mo10069s();

    /* JADX INFO: renamed from: s0 */
    void mo10070s0(MRtcSurroundMusicHander mRtcSurroundMusicHander);

    int selectAudioTrack(int i);

    void setEffectsVolume(double d);

    int setEnableSpeakerphone(boolean z);

    void stopAllEffects();

    void stopEffect(int i);

    /* JADX INFO: renamed from: u1 */
    void mo10071u1(boolean z);

    /* JADX INFO: renamed from: v */
    void mo10182v(String str);

    /* JADX INFO: renamed from: x1 */
    int mo10076x1(String str);

    /* JADX INFO: renamed from: z0 */
    void mo10079z0(long j, boolean z);
}
