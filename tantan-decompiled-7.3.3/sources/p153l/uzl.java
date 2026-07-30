package p153l;

import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.immomo.momomediaext.MomoMediaConstants$BEAUTY_TYPE;
import com.p051p1.mobile.putong.live.base.mmsdk.beauty.ByteDanceHelper;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.momoengine.MomoEffectEngine;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public interface uzl {
    /* JADX INFO: renamed from: A */
    void mo73035A(float f);

    /* JADX INFO: renamed from: B */
    void mo73036B(int i, wxh0 wxh0Var);

    /* JADX INFO: renamed from: D */
    void mo73037D(byte[] bArr);

    /* JADX INFO: renamed from: D0 */
    void mo73038D0(String str);

    /* JADX INFO: renamed from: E */
    void mo73039E(String str, boolean z);

    /* JADX INFO: renamed from: F */
    void mo73040F();

    /* JADX INFO: renamed from: G */
    void mo73041G(int i);

    /* JADX INFO: renamed from: H */
    int mo73042H(Boolean bool);

    /* JADX INFO: renamed from: L */
    void mo73043L(int i, float f);

    /* JADX INFO: renamed from: M */
    void mo73044M(Boolean bool);

    /* JADX INFO: renamed from: Q0 */
    int mo73045Q0(int i);

    /* JADX INFO: renamed from: a0 */
    void mo73048a0(float f);

    /* JADX INFO: renamed from: b0 */
    MomoEffectEngine.SurroundState mo73050b0();

    /* JADX INFO: renamed from: c */
    long mo73052c();

    /* JADX INFO: renamed from: d */
    float mo73053d();

    /* JADX INFO: renamed from: h */
    int mo73057h(int i);

    /* JADX INFO: renamed from: i */
    float mo73058i();

    /* JADX INFO: renamed from: j */
    void mo73059j();

    /* JADX INFO: renamed from: k */
    int mo73060k();

    @UiThread
    /* JADX INFO: renamed from: m */
    void mo73061m(String str);

    /* JADX INFO: renamed from: q */
    void mo73062q();

    /* JADX INFO: renamed from: r */
    long mo73063r();

    /* JADX INFO: renamed from: s */
    void mo73064s(int i, ByteDanceHelper.MakeupStyleType makeupStyleType, float f);

    void setIntensity(float f);

    void stopEffect(int i);

    void stopSurroundMusic();

    @Nullable
    @UiThread
    /* JADX INFO: renamed from: t */
    List<TTPresetFilter> mo73065t();

    /* JADX INFO: renamed from: t0 */
    void mo73066t0(String str, String str2);

    /* JADX INFO: renamed from: u */
    void mo73067u(int i, String str, boolean z, boolean z2);

    /* JADX INFO: renamed from: v */
    C22421c<uxj0> mo73068v();

    @UiThread
    /* JADX INFO: renamed from: x */
    void mo73069x(List<TTPresetFilter> list);

    /* JADX INFO: renamed from: z */
    void mo73070z(MomoMediaConstants$BEAUTY_TYPE momoMediaConstants$BEAUTY_TYPE, String str);
}
