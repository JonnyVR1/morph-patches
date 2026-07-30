package p002l;

import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.immomo.momomediaext.MomoMediaConstants;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.momoengine.MomoEffectEngine;
import com.p1.mobile.putong.live.base.mmsdk.beauty.ByteDanceHelper;
import com.p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
import java.util.List;
import l.pph0;
import l.roj0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public interface bxl {
    /* JADX INFO: renamed from: A */
    void mo5230A(float f);

    /* JADX INFO: renamed from: B */
    void mo5231B(int i, pph0 pph0Var);

    /* JADX INFO: renamed from: D */
    void mo5232D(byte[] bArr);

    /* JADX INFO: renamed from: D0 */
    void mo5233D0(String str);

    /* JADX INFO: renamed from: E */
    void mo5234E(String str, boolean z);

    /* JADX INFO: renamed from: F */
    void mo5235F();

    /* JADX INFO: renamed from: G */
    void mo5236G(int i);

    /* JADX INFO: renamed from: H */
    int mo5237H(Boolean bool);

    /* JADX INFO: renamed from: L */
    void mo5238L(int i, float f);

    /* JADX INFO: renamed from: M */
    void mo5239M(Boolean bool);

    /* JADX INFO: renamed from: Q0 */
    int mo5240Q0(int i);

    /* JADX INFO: renamed from: a0 */
    void mo5243a0(float f);

    /* JADX INFO: renamed from: b0 */
    MomoEffectEngine.SurroundState mo5245b0();

    /* JADX INFO: renamed from: c */
    long mo5247c();

    /* JADX INFO: renamed from: d */
    float mo5248d();

    /* JADX INFO: renamed from: h */
    int mo5252h(int i);

    /* JADX INFO: renamed from: i */
    float mo5253i();

    /* JADX INFO: renamed from: j */
    void mo5254j();

    /* JADX INFO: renamed from: k */
    int mo5255k();

    @UiThread
    /* JADX INFO: renamed from: m */
    void mo5256m(String str);

    /* JADX INFO: renamed from: q */
    void mo5257q();

    /* JADX INFO: renamed from: r */
    long mo5258r();

    /* JADX INFO: renamed from: s */
    void mo5259s(int i, ByteDanceHelper.MakeupStyleType makeupStyleType, float f);

    void setIntensity(float f);

    void stopEffect(int i);

    void stopSurroundMusic();

    @Nullable
    @UiThread
    /* JADX INFO: renamed from: t */
    List<TTPresetFilter> mo5260t();

    /* JADX INFO: renamed from: t0 */
    void mo5261t0(String str, String str2);

    /* JADX INFO: renamed from: u */
    void mo5262u(int i, String str, boolean z, boolean z2);

    /* JADX INFO: renamed from: v */
    c<roj0> mo5263v();

    @UiThread
    /* JADX INFO: renamed from: x */
    void mo5264x(List<TTPresetFilter> list);

    /* JADX INFO: renamed from: z */
    void mo5265z(MomoMediaConstants.BEAUTY_TYPE beauty_type, String str);
}
