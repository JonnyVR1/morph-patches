package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00020\u000b2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\rJ5\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m88121d2 = {"Ll/ptm0;", "", "<init>", "()V", "Ll/qct;", "Ll/rwn0;", "module", "Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;", "bLiveBottomButton", "", FirebaseAnalytics.Param.INDEX, "", "b", "(Ll/qct;Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;I)V", "id", "c", "Ll/oo2;", "", "isOpen", Constants.INAPP_DATA_TAG, "(Ll/qct;Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;IZ)V", "isAnchor", "", "a", "(Z)Ljava/lang/String;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ptm0 {

    @NotNull
    public static final ptm0 INSTANCE = new ptm0();

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m173769b(@Nullable qct<rwn0> module, @NotNull BLiveBottomButton bLiveBottomButton, int index) {
        String str;
        bLiveBottomButton.getClass();
        if ((module != null ? module.m213810E2() : null) == null || module.m213810E2().m168532l0() == null) {
            return;
        }
        String strM207631D0 = zrv.f205799a.m207631D0();
        String strM173772a = INSTANCE.m173772a(module.m213815L2());
        pf60 pf60VarM147494Y = jyb.m147494Y("button_id", Integer.valueOf(bLiveBottomButton.f45187id));
        pf60 pf60VarM147494Y2 = jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(index));
        if (TextUtils.equals(strM207631D0, module.m213810E2().m168526j0())) {
            str = "anchor";
        } else if (module.m213810E2().mo146094F0() == 2) {
            str = "manager";
        } else {
            str = guk0.m132329h(module.m213810E2().m183423Y2()) ? "audience_voicechat" : "audience";
        }
        i4g0.m138523u("e_audio_bottom_menu", strM173772a, pf60VarM147494Y, pf60VarM147494Y2, jyb.m147494Y("user_type", str), jyb.m147494Y("live_id", module.m213810E2().m202191k()), jyb.m147494Y("anchor_id", module.m213810E2().m168532l0().f56859id));
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m173770c(@Nullable qct<rwn0> module, @NotNull BLiveBottomButton bLiveBottomButton, int id) {
        bLiveBottomButton.getClass();
        if ((module != null ? module.m213810E2() : null) == null || module.m213810E2().m168532l0() == null) {
            return;
        }
        i4g0.m138523u("e_audio_bottom_drawer", INSTANCE.m173772a(module.m213815L2()), jyb.m147494Y("button_id", Integer.valueOf(bLiveBottomButton.f45187id)), jyb.m147494Y("category_id", Integer.valueOf(id)), jyb.m147494Y("live_id", module.m213810E2().m202191k()), jyb.m147494Y("anchor_id", module.m213810E2().m168532l0().f56859id));
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m173771d(@NotNull qct<oo2> module, @NotNull BLiveBottomButton bLiveBottomButton, int id, boolean isOpen) {
        module.getClass();
        bLiveBottomButton.getClass();
        if (module.m213810E2() == null) {
            return;
        }
        i4g0.m138523u("e_audio_bottom_drawer", INSTANCE.m173772a(module.m213810E2().mo118373p()), jyb.m147494Y("button_id", Integer.valueOf(bLiveBottomButton.f45187id)), jyb.m147494Y("category_id", Integer.valueOf(id)), jyb.m147494Y("live_id", module.m213810E2().m202191k()), jyb.m147494Y("anchor_id", module.m213810E2().m168526j0()), jyb.m147494Y("switch_type", isOpen ? "open" : "close"));
    }

    /* JADX INFO: renamed from: a */
    public final String m173772a(boolean isAnchor) {
        return isAnchor ? "p_anchor_audio_room" : "p_user_audio_room";
    }
}
