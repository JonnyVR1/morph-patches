package p149l;

import com.immomo.momomediaext.MomoMediaConstants$BEAUTY_TYPE;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public interface f4m {
    /* JADX INFO: renamed from: A */
    void mo68528A(float f);

    /* JADX INFO: renamed from: B */
    void mo68529B(String str);

    /* JADX INFO: renamed from: C */
    void mo68530C(int i, int i2);

    /* JADX INFO: renamed from: D */
    int mo68531D(byte[] bArr);

    /* JADX INFO: renamed from: E */
    void mo68532E(String str, boolean z);

    /* JADX INFO: renamed from: F */
    void mo68533F(List<TTPresetFilter> list);

    /* JADX INFO: renamed from: G */
    void mo68534G(String str);

    /* JADX INFO: renamed from: H */
    void mo68535H(pph0 pph0Var);

    /* JADX INFO: renamed from: I */
    int mo68536I(MMLiveMediaConfig mMLiveMediaConfig);

    /* JADX INFO: renamed from: J */
    void mo68537J(boolean z);

    /* JADX INFO: renamed from: K */
    void mo68538K(g4m g4mVar);

    /* JADX INFO: renamed from: L */
    void mo68539L(MMLiveTranscoding mMLiveTranscoding);

    /* JADX INFO: renamed from: M */
    void mo68540M(Boolean bool);

    /* JADX INFO: renamed from: N */
    void mo68541N(boolean z);

    /* JADX INFO: renamed from: O */
    void mo68542O(MomoMediaConstants$BEAUTY_TYPE momoMediaConstants$BEAUTY_TYPE);

    /* JADX INFO: renamed from: P */
    void mo68543P(int i, boolean z);

    /* JADX INFO: renamed from: Q */
    void mo68544Q(pph0 pph0Var);

    /* JADX INFO: renamed from: R */
    int mo68545R(MMLiveMediaConfig mMLiveMediaConfig, MMLiveRoomParams mMLiveRoomParams, MMLiveTranscoding mMLiveTranscoding);

    /* JADX INFO: renamed from: S */
    void mo68546S(boolean z);

    /* JADX INFO: renamed from: T */
    void mo68547T();

    /* JADX INFO: renamed from: U */
    void mo68548U(int i);

    /* JADX INFO: renamed from: V */
    void mo68549V(String str, pph0 pph0Var);

    /* JADX INFO: renamed from: W */
    void mo68550W(String str);

    /* JADX INFO: renamed from: X */
    void mo68551X();

    /* JADX INFO: renamed from: Y */
    void mo68552Y(MMLiveRoomParams.MMLiveClientRole mMLiveClientRole);

    /* JADX INFO: renamed from: Z */
    int mo68553Z(Boolean bool);

    /* JADX INFO: renamed from: a */
    void mo68554a();

    /* JADX INFO: renamed from: a0 */
    void mo68555a0(boolean z);

    /* JADX INFO: renamed from: b */
    void mo68556b(String str);

    /* JADX INFO: renamed from: b0 */
    void mo68557b0(String str, int i, String str2);

    /* JADX INFO: renamed from: c */
    long mo68558c();

    /* JADX INFO: renamed from: c0 */
    void mo68559c0(MMLiveMediaConfig mMLiveMediaConfig);

    /* JADX INFO: renamed from: d */
    float mo68560d();

    /* JADX INFO: renamed from: d0 */
    void mo68561d0(boolean z);

    /* JADX INFO: renamed from: e */
    boolean mo68562e();

    /* JADX INFO: renamed from: e0 */
    boolean mo68563e0(String str, String str2, float f);

    /* JADX INFO: renamed from: f */
    int mo68564f();

    /* JADX INFO: renamed from: f0 */
    void mo68565f0(String str);

    /* JADX INFO: renamed from: g */
    igb0 mo68566g();

    /* JADX INFO: renamed from: g0 */
    void mo68567g0();

    /* JADX INFO: renamed from: h */
    int mo68568h(int i);

    /* JADX INFO: renamed from: h0 */
    void mo68569h0(int i, pph0 pph0Var);

    /* JADX INFO: renamed from: i */
    float mo68570i();

    /* JADX INFO: renamed from: i0 */
    void mo68571i0(int i);

    /* JADX INFO: renamed from: j */
    void mo68572j();

    /* JADX INFO: renamed from: j0 */
    void mo68573j0(beu beuVar);

    /* JADX INFO: renamed from: k */
    int mo68574k();

    /* JADX INFO: renamed from: l */
    void mo68575l(List<String> list);

    /* JADX INFO: renamed from: m */
    void mo68576m(String str);

    /* JADX INFO: renamed from: n */
    void mo68577n(boolean z);

    /* JADX INFO: renamed from: o */
    void mo68578o(String str);

    /* JADX INFO: renamed from: p */
    void mo68579p(boolean z);

    /* JADX INFO: renamed from: q */
    void mo68580q();

    /* JADX INFO: renamed from: r */
    long mo68581r();

    void release();

    boolean removeMakeupStyle(String str, String str2);

    /* JADX INFO: renamed from: s */
    void mo68582s(String str);

    int selectAudioTrack(int i);

    void setMusicVolume(float f);

    void stopAllEffect();

    void stopEffect(int i);

    void stopSurroundMusic();

    /* JADX INFO: renamed from: t */
    void mo68583t(String str);

    /* JADX INFO: renamed from: u */
    void mo68584u(int i, String str, boolean z, boolean z2);

    boolean updateMakeupStyleValue(String str, String str2, float f);

    /* JADX INFO: renamed from: v */
    void mo68585v(String str);

    /* JADX INFO: renamed from: w */
    void mo68586w(akw akwVar);

    /* JADX INFO: renamed from: x */
    void mo68587x(float f);

    /* JADX INFO: renamed from: y */
    void mo68588y(int i, int i2);

    /* JADX INFO: renamed from: z */
    void mo68589z(boolean z);
}
