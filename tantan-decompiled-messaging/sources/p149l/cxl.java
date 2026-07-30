package p149l;

import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.immomo.momomediaext.MomoMediaConstants$BEAUTY_TYPE;
import com.p046p1.mobile.putong.live.base.mmsdk.beauty.ByteDanceHelper;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public interface cxl {
    /* JADX INFO: renamed from: B */
    void mo98890B(int i, pph0 pph0Var);

    /* JADX INFO: renamed from: F */
    void mo98891F();

    /* JADX INFO: renamed from: G */
    void mo98892G(int i);

    /* JADX INFO: renamed from: L */
    void mo98893L(int i, float f);

    @UiThread
    /* JADX INFO: renamed from: m */
    void mo98902m(String str);

    /* JADX INFO: renamed from: s */
    void mo98903s(int i, ByteDanceHelper.MakeupStyleType makeupStyleType, float f);

    void setIntensity(float f);

    @Nullable
    @UiThread
    /* JADX INFO: renamed from: t */
    List<TTPresetFilter> mo98904t();

    /* JADX INFO: renamed from: v */
    C22306c<roj0> mo98905v();

    @UiThread
    /* JADX INFO: renamed from: x */
    void mo98906x(List<TTPresetFilter> list);

    /* JADX INFO: renamed from: z */
    void mo98907z(MomoMediaConstants$BEAUTY_TYPE momoMediaConstants$BEAUTY_TYPE, String str);
}
