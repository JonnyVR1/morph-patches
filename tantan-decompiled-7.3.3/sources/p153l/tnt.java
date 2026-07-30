package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class tnt {

    /* JADX INFO: renamed from: l.tnt$a */
    public static final class C20353a {

        /* JADX INFO: renamed from: a */
        public static List<String> f175317a = jyb.m147507f0("square-nearby", "square-ongoing", "square-suggested", "square-teen-mode", BLiveAbsData.VOICE_LIVE, "moment-recommend", "square-multi-call");

        /* JADX INFO: renamed from: a */
        public static boolean m191967a(String str) {
            return f175317a.contains(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m191964a(String str) {
        return TextUtils.equals(str, "quick_video_chat_page") || TextUtils.equals(str, "simple_quick_video_chat_page");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m191965b(String str) {
        return str != null && str.contains("voice_live_profile_page");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m191966c(String str) {
        return TextUtils.equals(str, "quick_video_chat_page");
    }
}
