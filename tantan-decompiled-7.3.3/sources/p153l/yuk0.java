package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.VoiceCallStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class yuk0 {

    /* JADX INFO: renamed from: a */
    public static String f201632a = "accept";

    /* JADX INFO: renamed from: b */
    public static String f201633b = "join";

    /* JADX INFO: renamed from: c */
    public static String f201634c = "quit";

    /* JADX INFO: renamed from: d */
    public static String f201635d = "timeout";

    /* JADX INFO: renamed from: e */
    public static String f201636e = "leave";

    /* JADX INFO: renamed from: f */
    public static String f201637f = "other-leave";

    /* JADX INFO: renamed from: g */
    public static String f201638g = "not-pay";

    /* JADX INFO: renamed from: h */
    public static String f201639h = "cancel";

    /* JADX INFO: renamed from: i */
    public static String f201640i = "reject";

    /* JADX INFO: renamed from: j */
    public static String f201641j = "quit_multi_device";

    /* JADX INFO: renamed from: k */
    public static String f201642k = "mute-video";

    /* JADX INFO: renamed from: l */
    public static String f201643l = "unmute-video";

    /* JADX INFO: renamed from: m */
    public static String f201644m = "auto-answer";

    /* JADX INFO: renamed from: a */
    public static boolean m217435a(BLiveVideoChat bLiveVideoChat) {
        if (bLiveVideoChat == null) {
            return false;
        }
        return TextUtils.equals(bLiveVideoChat.status, VoiceCallStatus.calling);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m217436b(BLiveVideoChat bLiveVideoChat) {
        if (bLiveVideoChat == null) {
            return false;
        }
        return TextUtils.equals(bLiveVideoChat.status, "connecting");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m217437c(BLiveVideoChat bLiveVideoChat) {
        if (bLiveVideoChat == null) {
            return false;
        }
        return "pending".equals(bLiveVideoChat.status) || "connecting".equals(bLiveVideoChat.status) || VoiceCallStatus.calling.equals(bLiveVideoChat.status) || "stopped".equals(bLiveVideoChat.status);
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m217438d(BLiveVideoChatLive bLiveVideoChatLive) {
        return Boolean.valueOf(NullChecker.m82486a(bLiveVideoChatLive) && "pending".equals(bLiveVideoChatLive.status));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m217439e(BLiveVideoChat bLiveVideoChat) {
        if (bLiveVideoChat == null) {
            return true;
        }
        return TextUtils.equals(bLiveVideoChat.status, "stopped");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m217440f(BLiveVideoChat bLiveVideoChat) {
        if (bLiveVideoChat == null) {
            return false;
        }
        return TextUtils.equals(bLiveVideoChat.status, "pending");
    }

    /* JADX INFO: renamed from: g */
    public static boolean m217441g(BLiveVideoChat bLiveVideoChat) {
        if (bLiveVideoChat == null) {
            return false;
        }
        return TextUtils.equals(bLiveVideoChat.status, "stopped");
    }
}
