package p153l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveActivity;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveState;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class gfj0 {
    /* JADX INFO: renamed from: a */
    public static String m130073a(BLive bLive) {
        return mfd0.m158164a(bLive.multiCallInfo, "onlive");
    }

    /* JADX INFO: renamed from: b */
    public static String m130074b(BLive bLive, BLiveActivity bLiveActivity) {
        return mfd0.m158164a(bLiveActivity.multiCallInfo, "onlive");
    }

    /* JADX INFO: renamed from: c */
    public static void m130075c(boolean z, String str, String str2, BLiveState bLiveState, String str3) {
        m130076d(z, str, str2, bLiveState, str3, "");
    }

    /* JADX INFO: renamed from: d */
    public static void m130076d(boolean z, String str, String str2, BLiveState bLiveState, String str3, String str4) {
        HashMap map = new HashMap();
        map.put("anchorId", str);
        map.put(FirebaseAnalytics.Param.INDEX, "NA");
        map.put("is_gif", 0);
        map.put("liveId", str2);
        map.put("liveRecommendCategory", "NA");
        map.put("live_status", !TEnum.equals(bLiveState, "stopped") ? "on" : BLiveOperationTitleShowType.off);
        map.put("module", "my_room");
        map.put("live_room_live_type", str3);
        if (!TextUtils.isEmpty(str4) && TextUtils.equals("home_card", str4)) {
            map.put("live_enter_source", "suggest_live_card_profile");
        }
        if (z) {
            bfu.m104074f(OMSDialogPositon.p_suggest_user_profile_info_view, map);
        } else {
            bfu.m104073e(OMSDialogPositon.p_suggest_user_profile_info_view, map);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m130077e(boolean z, String str, String str2, String str3, String str4, String str5) {
        HashMap map = new HashMap();
        map.put("anchorId", str);
        map.put(FirebaseAnalytics.Param.INDEX, "NA");
        map.put("is_gif", 0);
        map.put("liveId", str2);
        map.put("liveRecommendCategory", "NA");
        map.put("live_status", "stopped".equals(str3) ? "on" : BLiveOperationTitleShowType.off);
        map.put("module", "my_room");
        map.put("live_room_live_type", mfd0.m158165b(str4, str3));
        if (!TextUtils.isEmpty(str5) && TextUtils.equals("home_card", str5)) {
            map.put("live_enter_source", "suggest_live_card_profile");
        }
        if (z) {
            bfu.m104074f(OMSDialogPositon.p_suggest_user_profile_info_view, map);
        } else {
            bfu.m104073e(OMSDialogPositon.p_suggest_user_profile_info_view, map);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m130078f(i420 i420Var, boolean z, String str) {
        if (z) {
            m130080h(false, i420Var.m138386a().anchor.f45267id, i420Var.m138386a().f45171id, ((BLiveVoiceRoom) i420Var.m138387b()).isMaskMode(), jyb.m147479J(((BLiveVoiceRoom) i420Var.m138387b()).topics) ? "" : ((BLiveVoiceRoom) i420Var.m138387b()).topics.get(0).f45362id, false);
        } else {
            m130076d(false, i420Var.m138386a().anchor.f45267id, i420Var.m138386a().f45171id, i420Var.m138386a().state, m130073a((BLive) i420Var.m138386a()), str);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m130079g(i420 i420Var, boolean z) {
        if (z) {
            m130080h(true, i420Var.m138386a().anchor.f45267id, i420Var.m138386a().f45171id, ((BLiveVoiceRoom) i420Var.m138387b()).isMaskMode(), jyb.m147479J(((BLiveVoiceRoom) i420Var.m138387b()).topics) ? "" : ((BLiveVoiceRoom) i420Var.m138387b()).topics.get(0).f45362id, false);
        } else {
            m130075c(true, i420Var.m138386a().anchor.f45267id, i420Var.m138386a().f45171id, i420Var.m138386a().state, m130073a((BLive) i420Var.m138386a()));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m130080h(boolean z, String str, String str2, boolean z2, String str3, boolean z3) {
        HashMap map = new HashMap();
        map.put("anchorId", str);
        map.put("audio_room_type", z2 ? "mask_audio" : "normal_audio");
        map.put("liveId", str2);
        map.put("topic_id", str3);
        map.put(FirebaseAnalytics.Param.INDEX, "NA");
        if (z3) {
            map.put("audio_card_type", "profile_settled_room");
        }
        if (z) {
            i4g0.m138527y("e_live_audio_room_enter", OMSDialogPositon.p_suggest_user_profile_info_view, map);
        } else {
            i4g0.m138521s("e_live_audio_room_enter", OMSDialogPositon.p_suggest_user_profile_info_view, map);
        }
    }
}
