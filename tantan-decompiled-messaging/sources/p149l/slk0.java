package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.VoiceCallStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class slk0 {

    /* JADX INFO: renamed from: a */
    public static String f165235a = "accept";

    /* JADX INFO: renamed from: b */
    public static String f165236b = "join";

    /* JADX INFO: renamed from: c */
    public static String f165237c = "quit";

    /* JADX INFO: renamed from: d */
    public static String f165238d = "timeout";

    /* JADX INFO: renamed from: e */
    public static String f165239e = "leave";

    /* JADX INFO: renamed from: f */
    public static String f165240f = "other-leave";

    /* JADX INFO: renamed from: g */
    public static String f165241g = "not-pay";

    /* JADX INFO: renamed from: h */
    public static String f165242h = "cancel";

    /* JADX INFO: renamed from: i */
    public static String f165243i = "reject";

    /* JADX INFO: renamed from: j */
    public static String f165244j = "quit_multi_device";

    /* JADX INFO: renamed from: k */
    public static String f165245k = "mute-video";

    /* JADX INFO: renamed from: l */
    public static String f165246l = "unmute-video";

    /* JADX INFO: renamed from: m */
    public static String f165247m = "auto-answer";

    /* JADX INFO: renamed from: a */
    public static boolean m184825a(BLiveVideoChat bLiveVideoChat) {
        if (bLiveVideoChat == null) {
            return false;
        }
        return TextUtils.equals(bLiveVideoChat.status, VoiceCallStatus.calling);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m184826b(BLiveVideoChat bLiveVideoChat) {
        if (bLiveVideoChat == null) {
            return false;
        }
        return TextUtils.equals(bLiveVideoChat.status, "connecting");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m184827c(BLiveVideoChat bLiveVideoChat) {
        if (bLiveVideoChat == null) {
            return false;
        }
        return "pending".equals(bLiveVideoChat.status) || "connecting".equals(bLiveVideoChat.status) || VoiceCallStatus.calling.equals(bLiveVideoChat.status) || "stopped".equals(bLiveVideoChat.status);
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m184828d(BLiveVideoChatLive bLiveVideoChatLive) {
        return Boolean.valueOf(NullChecker.m81303a(bLiveVideoChatLive) && "pending".equals(bLiveVideoChatLive.status));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m184829e(BLiveVideoChat bLiveVideoChat) {
        if (bLiveVideoChat == null) {
            return true;
        }
        return TextUtils.equals(bLiveVideoChat.status, "stopped");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m184830f(BLiveVideoChat bLiveVideoChat) {
        if (bLiveVideoChat == null) {
            return false;
        }
        return TextUtils.equals(bLiveVideoChat.status, "pending");
    }

    /* JADX INFO: renamed from: g */
    public static boolean m184831g(BLiveVideoChat bLiveVideoChat) {
        if (bLiveVideoChat == null) {
            return false;
        }
        return TextUtils.equals(bLiveVideoChat.status, "stopped");
    }
}
