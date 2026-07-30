package p009l;

import android.text.TextUtils;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rlt {

    /* JADX INFO: renamed from: l.rlt$a */
    public static final class C1177a {

        /* JADX INFO: renamed from: a */
        public static List<String> f19903a = vwb.f0(new String[]{"square-nearby", "square-ongoing", "square-suggested", "square-teen-mode", "voice-live", "moment-recommend", "square-multi-call"});

        /* JADX INFO: renamed from: a */
        public static boolean m21698a(String str) {
            return f19903a.contains(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m21695a(String str) {
        return TextUtils.equals(str, "quick_video_chat_page") || TextUtils.equals(str, "simple_quick_video_chat_page");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m21696b(String str) {
        return str != null && str.contains("voice_live_profile_page");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m21697c(String str) {
        return TextUtils.equals(str, "quick_video_chat_page");
    }
}
