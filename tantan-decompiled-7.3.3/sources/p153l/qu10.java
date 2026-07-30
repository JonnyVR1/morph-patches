package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.data.BLiveComplexUser;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u001bJ'\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b \u0010\u001f¨\u0006!"}, m88121d2 = {"Ll/qu10;", "", "<init>", "()V", "", "e", "", "error", "code", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "liveId", "anchorId", "", FirebaseAnalytics.Param.INDEX, "liveRecommendCategory", "", "isFourItem", "c", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Z)V", "isPlaying", "b", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZZ)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveComplexUser;", "users", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Z)V", "h", "roomId", "g", "(ILjava/lang/String;Z)V", "f", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class qu10 {

    @NotNull
    public static final qu10 INSTANCE = new qu10();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m178092a(@NotNull String error, @NotNull String code) {
        error.getClass();
        code.getClass();
        pf60 pf60VarM147494Y = jyb.m147494Y("error", error);
        if (code.length() == 0) {
            code = "100001";
        }
        i4g0.m138495D("e_page_getting_failed", "p_suggest_users_home_view", pf60VarM147494Y, jyb.m147494Y(StateEvent.Name.ERROR_CODE, code));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m178093d(qu10 qu10Var, String str, String str2, int i, String str3, boolean z, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            z = false;
        }
        qu10Var.m178096c(str, str2, i, str3, z);
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m178094e() {
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.PAGE_VIEW;
        q4fVar.f155576n = "p_suggest_users_home_view";
        i4g0.m138517o(q4fVar, jyb.m147494Y("suggest_card_type", "live_audio_agg"), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"), jyb.m147494Y("liveId", "NA"), jyb.m147494Y("anchorId", "NA"), jyb.m147494Y("audio_card_type", "swipe_card"), jyb.m147494Y("audio_room_label", "NA"), jyb.m147494Y("audio_room_type", "普通"), jyb.m147494Y("topic_id", "NA"), jyb.m147494Y("audio_tab_id", "NA"));
    }

    /* JADX INFO: renamed from: b */
    public final void m178095b(@NotNull String liveId, @NotNull String anchorId, int index, @NotNull String liveRecommendCategory, boolean isPlaying, boolean isFourItem) {
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
        bfu.m104073e("p_suggest_users_home_view", map);
    }

    /* JADX INFO: renamed from: c */
    public final void m178096c(@NotNull String liveId, @NotNull String anchorId, int index, @NotNull String liveRecommendCategory, boolean isFourItem) {
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
        bfu.m104074f("p_suggest_users_home_view", map);
    }

    /* JADX INFO: renamed from: f */
    public final void m178097f(int index, @NotNull String roomId, boolean isFourItem) {
        roomId.getClass();
        i4g0.m138523u("e_live_audio_mask_party_enter", "p_suggest_users_home_view", jyb.m147494Y("window_type", isFourItem ? "rectangle" : "NA"), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(index)), jyb.m147494Y("room_id", roomId), jyb.m147494Y("party_enter_type", "swipe_card_agg"));
    }

    /* JADX INFO: renamed from: g */
    public final void m178098g(int index, @NotNull String roomId, boolean isFourItem) {
        roomId.getClass();
        i4g0.m138492A("e_live_audio_mask_party_enter", "p_suggest_users_home_view", jyb.m147494Y("window_type", isFourItem ? "rectangle" : "NA"), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(index)), jyb.m147494Y("room_id", roomId), jyb.m147494Y("party_enter_type", "swipe_card_agg"));
    }

    /* JADX INFO: renamed from: h */
    public final void m178099h(@NotNull String liveId, @NotNull String anchorId, int index, @NotNull List<BLiveComplexUser> users, boolean isFourItem) {
        liveId.getClass();
        anchorId.getClass();
        users.getClass();
        Iterator<BLiveComplexUser> it = users.iterator();
        String str = "";
        while (it.hasNext()) {
            str = str + it.next().f45199id + Constants.SEPARATOR_COMMA;
        }
        if (str.length() > 0) {
            StringsKt.m94348x0(str, str.length() - 1, str.length()).toString();
        }
        i4g0.m138523u("e_live_audio_room_enter", "p_suggest_users_home_view", jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(index)), jyb.m147494Y("liveId", liveId), jyb.m147494Y("anchorId", anchorId), jyb.m147494Y("audio_card_type", "swipe_card_agg"), jyb.m147494Y("audio_tab_id", "NA"), jyb.m147494Y("topic_id", "NA"), jyb.m147494Y("window_type", isFourItem ? "rectangle" : "NA"), jyb.m147494Y("on_audio_user_id", str));
    }

    /* JADX INFO: renamed from: i */
    public final void m178100i(@NotNull String liveId, @NotNull String anchorId, int index, @NotNull List<BLiveComplexUser> users, boolean isFourItem) {
        liveId.getClass();
        anchorId.getClass();
        users.getClass();
        Iterator<BLiveComplexUser> it = users.iterator();
        String str = "";
        while (it.hasNext()) {
            str = str + it.next().f45199id + Constants.SEPARATOR_COMMA;
        }
        if (str.length() > 0) {
            StringsKt.m94348x0(str, str.length() - 1, str.length()).toString();
        }
        i4g0.m138492A("e_live_audio_room_enter", "p_suggest_users_home_view", jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(index)), jyb.m147494Y("liveId", liveId), jyb.m147494Y("anchorId", anchorId), jyb.m147494Y("audio_card_type", "swipe_card_agg"), jyb.m147494Y("audio_tab_id", "NA"), jyb.m147494Y("topic_id", "NA"), jyb.m147494Y("window_type", isFourItem ? "rectangle" : "NA"), jyb.m147494Y("on_audio_user_id", str));
    }
}
