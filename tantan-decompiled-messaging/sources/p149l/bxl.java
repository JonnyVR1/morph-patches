package p149l;

import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.immomo.momomediaext.MomoMediaConstants$BEAUTY_TYPE;
import com.p046p1.mobile.putong.live.base.mmsdk.beauty.ByteDanceHelper;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.momoengine.MomoEffectEngine;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public interface bxl {
    /* JADX INFO: renamed from: A */
    void mo71852A(float f);

    /* JADX INFO: renamed from: B */
    void mo71853B(int i, pph0 pph0Var);

    /* JADX INFO: renamed from: D */
    void mo71854D(byte[] bArr);

    /* JADX INFO: renamed from: D0 */
    void mo71855D0(String str);

    /* JADX INFO: renamed from: E */
    void mo71856E(String str, boolean z);

    /* JADX INFO: renamed from: F */
    void mo71857F();

    /* JADX INFO: renamed from: G */
    void mo71858G(int i);

    /* JADX INFO: renamed from: H */
    int mo71859H(Boolean bool);

    /* JADX INFO: renamed from: L */
    void mo71860L(int i, float f);

    /* JADX INFO: renamed from: M */
    void mo71861M(Boolean bool);

    /* JADX INFO: renamed from: Q0 */
    int mo71862Q0(int i);

    /* JADX INFO: renamed from: a0 */
    void mo71865a0(float f);

    /* JADX INFO: renamed from: b0 */
    MomoEffectEngine.SurroundState mo71867b0();

    /* JADX INFO: renamed from: c */
    long mo71869c();

    /* JADX INFO: renamed from: d */
    float mo71870d();

    /* JADX INFO: renamed from: h */
    int mo71874h(int i);

    /* JADX INFO: renamed from: i */
    float mo71875i();

    /* JADX INFO: renamed from: j */
    void mo71876j();

    /* JADX INFO: renamed from: k */
    int mo71877k();

    @UiThread
    /* JADX INFO: renamed from: m */
    void mo71878m(String str);

    /* JADX INFO: renamed from: q */
    void mo71879q();

    /* JADX INFO: renamed from: r */
    long mo71880r();

    /* JADX INFO: renamed from: s */
    void mo71881s(int i, ByteDanceHelper.MakeupStyleType makeupStyleType, float f);

    void setIntensity(float f);

    void stopEffect(int i);

    void stopSurroundMusic();

    @Nullable
    @UiThread
    /* JADX INFO: renamed from: t */
    List<TTPresetFilter> mo71882t();

    /* JADX INFO: renamed from: t0 */
    void mo71883t0(String str, String str2);

    /* JADX INFO: renamed from: u */
    void mo71884u(int i, String str, boolean z, boolean z2);

    /* JADX INFO: renamed from: v */
    C22306c<roj0> mo71885v();

    @UiThread
    /* JADX INFO: renamed from: x */
    void mo71886x(List<TTPresetFilter> list);

    /* JADX INFO: renamed from: z */
    void mo71887z(MomoMediaConstants$BEAUTY_TYPE momoMediaConstants$BEAUTY_TYPE, String str);
}
