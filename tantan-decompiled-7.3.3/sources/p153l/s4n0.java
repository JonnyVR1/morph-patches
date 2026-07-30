package p153l;

import android.content.Context;
import android.net.Uri;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes9.dex */
public class s4n0 {
    /* JADX INFO: renamed from: a */
    public static void m184567a(Context context, String str) {
        try {
            nae0.m162083m((Act) context, Uri.parse(str));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m184568b(String str, String str2, String str3, boolean z, boolean z2, int i, String str4) {
        String str5;
        if (z2) {
            str5 = "NA";
        } else {
            str5 = z ? "anchor" : "audience_voicechat";
        }
        i4g0.m138523u("e_live_audio_room_enter", "p_suggest_users_home_view", jyb.m147494Y("liveId", str), jyb.m147494Y("anchorId", str2), jyb.m147494Y("voice_template", str3), jyb.m147494Y("user_type", str5), jyb.m147494Y("source", str4), jyb.m147494Y("audio_card_type", z2 ? "swipe_card_room" : "swipe_card"));
        i4g0.m138525w(MatchScData.ModuleId.mid_e_card, "p_suggest_users_home_view", jyb.m147494Y("card_name", "live_audio_room"), jyb.m147494Y("swipe_direction", BLiveGiftBubblePopupTitlePosition.left), jyb.m147494Y("is_guided_action", "1"), jyb.m147494Y("card_order", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: c */
    public static void m184569c(String str, String str2, String str3, boolean z, boolean z2, String str4) {
        String str5;
        if (z2) {
            str5 = "NA";
        } else {
            str5 = z ? "anchor" : "audience_voicechat";
        }
        i4g0.m138492A("e_live_audio_room_enter", "p_suggest_users_home_view", jyb.m147494Y("liveId", str), jyb.m147494Y("anchorId", str2), jyb.m147494Y("voice_template", str3), jyb.m147494Y("user_type", str5), jyb.m147494Y("source", str4), jyb.m147494Y("audio_card_type", z2 ? "swipe_card_room" : "swipe_card"));
    }
}
