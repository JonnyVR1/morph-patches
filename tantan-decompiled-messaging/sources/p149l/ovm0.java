package p149l;

import android.content.Context;
import android.net.Uri;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes13.dex */
public class ovm0 {
    /* JADX INFO: renamed from: a */
    public static void m166200a(Context context, String str) {
        try {
            j2e0.m139446m((Act) context, Uri.parse(str));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m166201b(String str, String str2, String str3, boolean z, boolean z2, int i, String str4) {
        String str5;
        if (z2) {
            str5 = "NA";
        } else {
            str5 = z ? "anchor" : "audience_voicechat";
        }
        zvf0.m220399u("e_live_audio_room_enter", "p_suggest_users_home_view", vwb.m200311Y("liveId", str), vwb.m200311Y("anchorId", str2), vwb.m200311Y("voice_template", str3), vwb.m200311Y("user_type", str5), vwb.m200311Y("source", str4), vwb.m200311Y("audio_card_type", z2 ? "swipe_card_room" : "swipe_card"));
        zvf0.m220401w(MatchScData.ModuleId.mid_e_card, "p_suggest_users_home_view", vwb.m200311Y("card_name", "live_audio_room"), vwb.m200311Y("swipe_direction", BLiveGiftBubblePopupTitlePosition.left), vwb.m200311Y("is_guided_action", "1"), vwb.m200311Y("card_order", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: c */
    public static void m166202c(String str, String str2, String str3, boolean z, boolean z2, String str4) {
        String str5;
        if (z2) {
            str5 = "NA";
        } else {
            str5 = z ? "anchor" : "audience_voicechat";
        }
        zvf0.m220368A("e_live_audio_room_enter", "p_suggest_users_home_view", vwb.m200311Y("liveId", str), vwb.m200311Y("anchorId", str2), vwb.m200311Y("voice_template", str3), vwb.m200311Y("user_type", str5), vwb.m200311Y("source", str4), vwb.m200311Y("audio_card_type", z2 ? "swipe_card_room" : "swipe_card"));
    }
}
