package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class owi {

    /* JADX INFO: renamed from: a */
    public static jxd0 f149482a;

    /* JADX INFO: renamed from: b */
    public static wyd0 f149483b;

    /* JADX INFO: renamed from: c */
    public static jxd0 f149484c;

    /* JADX INFO: renamed from: d */
    public static wyd0 f149485d;

    /* JADX INFO: renamed from: e */
    public static jxd0 f149486e;

    /* JADX INFO: renamed from: f */
    public static jxd0 f149487f;

    /* JADX INFO: renamed from: g */
    public static wyd0 f149488g;

    /* JADX INFO: renamed from: h */
    public static wyd0 f149489h;

    /* JADX INFO: renamed from: i */
    public static byd0 f149490i;

    /* JADX INFO: renamed from: j */
    public static vxd0 f149491j;

    /* JADX INFO: renamed from: k */
    public static byd0 f149492k;

    /* JADX INFO: renamed from: l */
    public static wyd0 f149493l;

    /* JADX INFO: renamed from: m */
    public static jxd0 f149494m;

    /* JADX INFO: renamed from: n */
    public static wyd0 f149495n;

    /* JADX INFO: renamed from: o */
    public static wyd0 f149496o;

    static {
        Boolean bool = Boolean.FALSE;
        f149482a = new jxd0("need_bind_phone", bool);
        f149483b = new wyd0("feedDefaultPage", "");
        Boolean bool2 = Boolean.TRUE;
        f149484c = new jxd0("feedShowAccostButton", bool2);
        f149485d = new wyd0("topicH5RedirectURL", "");
        f149486e = new jxd0("feedShowMomentAudit", bool);
        f149487f = new jxd0("feedShowCommentAudit", bool);
        f149488g = new wyd0("stateEmotionListData", "");
        f149489h = new wyd0("stateGuideData", "");
        f149490i = new byd0("last_timestamp_show_state_guide_remaining_" + FeedModule.m61405F().userId(), 0L);
        f149491j = new vxd0("state_no_enter_post_pager_count" + FeedModule.m61405F().userId(), 0);
        f149492k = new byd0("last_timestamp_no_enter_state_guide_remaining_" + FeedModule.m61405F().userId(), 0L);
        f149493l = new wyd0("defaultTab_" + FeedModule.m61405F().userId(), "");
        f149494m = new jxd0("activityShowReadButton", bool2);
        f149495n = new wyd0("state_guide_window_title", "");
        f149496o = new wyd0("state_guide_window_sub_title", "");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m169565a() {
        User userM159625C = mrb0.m159625C();
        return !(NullChecker.m82487b(userM159625C) && NullChecker.m82486a(userM159625C.settings) && (!TextUtils.isEmpty(userM159625C.settings.phoneNumber.number) || !TextUtils.isEmpty(userM159625C.settings.linkedPhoneNumber.number))) && f149482a.get().booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m169566b() {
        return f149487f.get().booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m169567c() {
        return f149486e.get().booleanValue();
    }
}
