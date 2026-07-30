package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.data.BLiveComplexUser;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u001bJ'\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b \u0010\u001f¨\u0006!"}, m87232d2 = {"Ll/im10;", "", "<init>", "()V", "", "e", "", "error", "code", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "liveId", "anchorId", "", FirebaseAnalytics.Param.INDEX, "liveRecommendCategory", "", "isFourItem", "c", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Z)V", "isPlaying", "b", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZZ)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveComplexUser;", "users", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Z)V", "h", "roomId", "g", "(ILjava/lang/String;Z)V", "f", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class im10 {

    @NotNull
    public static final im10 INSTANCE = new im10();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m137058a(@NotNull String error, @NotNull String code) {
        error.getClass();
        code.getClass();
        j760 j760VarM200311Y = vwb.m200311Y("error", error);
        if (code.length() == 0) {
            code = "100001";
        }
        zvf0.m220371D("e_page_getting_failed", "p_suggest_users_home_view", j760VarM200311Y, vwb.m200311Y(StateEvent.Name.ERROR_CODE, code));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m137059d(im10 im10Var, String str, String str2, int i, String str3, boolean z, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            z = false;
        }
        im10Var.m137062c(str, str2, i, str3, z);
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m137060e() {
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.PAGE_VIEW;
        l3fVar.f125895n = "p_suggest_users_home_view";
        zvf0.m220393o(l3fVar, vwb.m200311Y("suggest_card_type", "live_audio_agg"), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"), vwb.m200311Y("liveId", "NA"), vwb.m200311Y("anchorId", "NA"), vwb.m200311Y("audio_card_type", "swipe_card"), vwb.m200311Y("audio_room_label", "NA"), vwb.m200311Y("audio_room_type", "普通"), vwb.m200311Y("topic_id", "NA"), vwb.m200311Y("audio_tab_id", "NA"));
    }

    /* JADX INFO: renamed from: b */
    public final void m137061b(@NotNull String liveId, @NotNull String anchorId, int index, @NotNull String liveRecommendCategory, boolean isPlaying, boolean isFourItem) {
        liveId.getClass();
        anchorId.getClass();
        liveRecommendCategory.getClass();
        HashMap map = new HashMap();
        map.put(FirebaseAnalytics.Param.INDEX, Integer.valueOf(index));
        map.put("liveId", liveId);
        map.put("anchorId", anchorId);
        map.put("live_enter_source", "swipe_card_agg");
        map.put("liveRecommendCategory", liveRecommendCategory);
        map.put("module", "NA");
        map.put("topic_id", "NA");
        map.put("live_status", "on");
        map.put("window_type", "circle");
        map.put("trace_id", "");
        map.put("window_type", isFourItem ? "rectangle" : "NA");
        map.put("is_gif", isPlaying ? "1" : "0");
        adu.m96009e("p_suggest_users_home_view", map);
    }

    /* JADX INFO: renamed from: c */
    public final void m137062c(@NotNull String liveId, @NotNull String anchorId, int index, @NotNull String liveRecommendCategory, boolean isFourItem) {
        liveId.getClass();
        anchorId.getClass();
        liveRecommendCategory.getClass();
        HashMap map = new HashMap();
        map.put(FirebaseAnalytics.Param.INDEX, Integer.valueOf(index));
        map.put("liveId", liveId);
        map.put("anchorId", anchorId);
        map.put("live_enter_source", "swipe_card_agg");
        map.put("liveRecommendCategory", liveRecommendCategory);
        map.put("module", "NA");
        map.put("topic_id", "NA");
        map.put("live_status", "on");
        map.put("window_type", "circle");
        map.put("trace_id", "");
        map.put("window_type", isFourItem ? "rectangle" : "NA");
        map.put("is_gif", "0");
        adu.m96010f("p_suggest_users_home_view", map);
    }

    /* JADX INFO: renamed from: f */
    public final void m137063f(int index, @NotNull String roomId, boolean isFourItem) {
        roomId.getClass();
        zvf0.m220399u("e_live_audio_mask_party_enter", "p_suggest_users_home_view", vwb.m200311Y("window_type", isFourItem ? "rectangle" : "NA"), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(index)), vwb.m200311Y("room_id", roomId), vwb.m200311Y("party_enter_type", "swipe_card_agg"));
    }

    /* JADX INFO: renamed from: g */
    public final void m137064g(int index, @NotNull String roomId, boolean isFourItem) {
        roomId.getClass();
        zvf0.m220368A("e_live_audio_mask_party_enter", "p_suggest_users_home_view", vwb.m200311Y("window_type", isFourItem ? "rectangle" : "NA"), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(index)), vwb.m200311Y("room_id", roomId), vwb.m200311Y("party_enter_type", "swipe_card_agg"));
    }

    /* JADX INFO: renamed from: h */
    public final void m137065h(@NotNull String liveId, @NotNull String anchorId, int index, @NotNull List<BLiveComplexUser> users, boolean isFourItem) {
        liveId.getClass();
        anchorId.getClass();
        users.getClass();
        Iterator<BLiveComplexUser> it = users.iterator();
        String str = "";
        while (it.hasNext()) {
            str = str + it.next().f44351id + Constants.SEPARATOR_COMMA;
        }
        if (str.length() > 0) {
            StringsKt.m93457x0(str, str.length() - 1, str.length()).toString();
        }
        zvf0.m220399u("e_live_audio_room_enter", "p_suggest_users_home_view", vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(index)), vwb.m200311Y("liveId", liveId), vwb.m200311Y("anchorId", anchorId), vwb.m200311Y("audio_card_type", "swipe_card_agg"), vwb.m200311Y("audio_tab_id", "NA"), vwb.m200311Y("topic_id", "NA"), vwb.m200311Y("window_type", isFourItem ? "rectangle" : "NA"), vwb.m200311Y("on_audio_user_id", str));
    }

    /* JADX INFO: renamed from: i */
    public final void m137066i(@NotNull String liveId, @NotNull String anchorId, int index, @NotNull List<BLiveComplexUser> users, boolean isFourItem) {
        liveId.getClass();
        anchorId.getClass();
        users.getClass();
        Iterator<BLiveComplexUser> it = users.iterator();
        String str = "";
        while (it.hasNext()) {
            str = str + it.next().f44351id + Constants.SEPARATOR_COMMA;
        }
        if (str.length() > 0) {
            StringsKt.m93457x0(str, str.length() - 1, str.length()).toString();
        }
        zvf0.m220368A("e_live_audio_room_enter", "p_suggest_users_home_view", vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(index)), vwb.m200311Y("liveId", liveId), vwb.m200311Y("anchorId", anchorId), vwb.m200311Y("audio_card_type", "swipe_card_agg"), vwb.m200311Y("audio_tab_id", "NA"), vwb.m200311Y("topic_id", "NA"), vwb.m200311Y("window_type", isFourItem ? "rectangle" : "NA"), vwb.m200311Y("on_audio_user_id", str));
    }
}
