package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00020\u000b2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\rJ5\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m87232d2 = {"Ll/lkm0;", "", "<init>", "()V", "Ll/pat;", "Ll/nnn0;", "module", "Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;", "bLiveBottomButton", "", FirebaseAnalytics.Param.INDEX, "", "b", "(Ll/pat;Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;I)V", "id", "c", "Ll/ho2;", "", "isOpen", Constants.INAPP_DATA_TAG, "(Ll/pat;Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;IZ)V", "isAnchor", "", "a", "(Z)Ljava/lang/String;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class lkm0 {

    @NotNull
    public static final lkm0 INSTANCE = new lkm0();

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m150374b(@Nullable pat<nnn0> module, @NotNull BLiveBottomButton bLiveBottomButton, int index) {
        String str;
        bLiveBottomButton.getClass();
        if ((module != null ? module.m206027E2() : null) == null || module.m206027E2().m132146l0() == null) {
            return;
        }
        String strM199309D0 = ypv.f199493a.m199309D0();
        String strM150377a = INSTANCE.m150377a(module.m206032L2());
        j760 j760VarM200311Y = vwb.m200311Y("button_id", Integer.valueOf(bLiveBottomButton.f44339id));
        j760 j760VarM200311Y2 = vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(index));
        if (TextUtils.equals(strM199309D0, module.m206027E2().m132140j0())) {
            str = "anchor";
        } else if (module.m206027E2().mo120451F0() == 2) {
            str = "manager";
        } else {
            str = alk0.m97309h(module.m206027E2().m160261Y2()) ? "audience_voicechat" : "audience";
        }
        zvf0.m220399u("e_audio_bottom_menu", strM150377a, j760VarM200311Y, j760VarM200311Y2, vwb.m200311Y("user_type", str), vwb.m200311Y("live_id", module.m206027E2().m149814k()), vwb.m200311Y("anchor_id", module.m206027E2().m132146l0().f56011id));
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m150375c(@Nullable pat<nnn0> module, @NotNull BLiveBottomButton bLiveBottomButton, int id) {
        bLiveBottomButton.getClass();
        if ((module != null ? module.m206027E2() : null) == null || module.m206027E2().m132146l0() == null) {
            return;
        }
        zvf0.m220399u("e_audio_bottom_drawer", INSTANCE.m150377a(module.m206032L2()), vwb.m200311Y("button_id", Integer.valueOf(bLiveBottomButton.f44339id)), vwb.m200311Y("category_id", Integer.valueOf(id)), vwb.m200311Y("live_id", module.m206027E2().m149814k()), vwb.m200311Y("anchor_id", module.m206027E2().m132146l0().f56011id));
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m150376d(@NotNull pat<ho2> module, @NotNull BLiveBottomButton bLiveBottomButton, int id, boolean isOpen) {
        module.getClass();
        bLiveBottomButton.getClass();
        if (module.m206027E2() == null) {
            return;
        }
        zvf0.m220399u("e_audio_bottom_drawer", INSTANCE.m150377a(module.m206027E2().mo97490p()), vwb.m200311Y("button_id", Integer.valueOf(bLiveBottomButton.f44339id)), vwb.m200311Y("category_id", Integer.valueOf(id)), vwb.m200311Y("live_id", module.m206027E2().m149814k()), vwb.m200311Y("anchor_id", module.m206027E2().m132140j0()), vwb.m200311Y("switch_type", isOpen ? "open" : "close"));
    }

    /* JADX INFO: renamed from: a */
    public final String m150377a(boolean isAnchor) {
        return isAnchor ? "p_anchor_audio_room" : "p_user_audio_room";
    }
}
