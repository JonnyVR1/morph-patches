package p153l;

import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.immomo.momomediaext.MomoMediaConstants$BEAUTY_TYPE;
import com.p051p1.mobile.putong.live.base.mmsdk.beauty.ByteDanceHelper;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public interface vzl {
    /* JADX INFO: renamed from: B */
    void mo143167B(int i, wxh0 wxh0Var);

    /* JADX INFO: renamed from: F */
    void mo143168F();

    /* JADX INFO: renamed from: G */
    void mo143169G(int i);

    /* JADX INFO: renamed from: L */
    void mo143170L(int i, float f);

    @UiThread
    /* JADX INFO: renamed from: m */
    void mo143179m(String str);

    /* JADX INFO: renamed from: s */
    void mo143180s(int i, ByteDanceHelper.MakeupStyleType makeupStyleType, float f);

    void setIntensity(float f);

    @Nullable
    @UiThread
    /* JADX INFO: renamed from: t */
    List<TTPresetFilter> mo143181t();

    /* JADX INFO: renamed from: v */
    C22421c<uxj0> mo143182v();

    @UiThread
    /* JADX INFO: renamed from: x */
    void mo143183x(List<TTPresetFilter> list);

    /* JADX INFO: renamed from: z */
    void mo143184z(MomoMediaConstants$BEAUTY_TYPE momoMediaConstants$BEAUTY_TYPE, String str);
}
