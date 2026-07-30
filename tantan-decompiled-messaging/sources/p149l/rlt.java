package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class rlt {

    /* JADX INFO: renamed from: l.rlt$a */
    public static final class C19733a {

        /* JADX INFO: renamed from: a */
        public static List<String> f160001a = vwb.m200324f0("square-nearby", "square-ongoing", "square-suggested", "square-teen-mode", BLiveAbsData.VOICE_LIVE, "moment-recommend", "square-multi-call");

        /* JADX INFO: renamed from: a */
        public static boolean m179883a(String str) {
            return f160001a.contains(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m179880a(String str) {
        return TextUtils.equals(str, "quick_video_chat_page") || TextUtils.equals(str, "simple_quick_video_chat_page");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m179881b(String str) {
        return str != null && str.contains("voice_live_profile_page");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m179882c(String str) {
        return TextUtils.equals(str, "quick_video_chat_page");
    }
}
