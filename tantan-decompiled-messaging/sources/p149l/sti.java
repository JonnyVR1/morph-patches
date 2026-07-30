package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class sti {

    /* JADX INFO: renamed from: a */
    public static hpd0 f166357a;

    /* JADX INFO: renamed from: b */
    public static uqd0 f166358b;

    /* JADX INFO: renamed from: c */
    public static hpd0 f166359c;

    /* JADX INFO: renamed from: d */
    public static uqd0 f166360d;

    /* JADX INFO: renamed from: e */
    public static hpd0 f166361e;

    /* JADX INFO: renamed from: f */
    public static hpd0 f166362f;

    /* JADX INFO: renamed from: g */
    public static uqd0 f166363g;

    /* JADX INFO: renamed from: h */
    public static uqd0 f166364h;

    /* JADX INFO: renamed from: i */
    public static zpd0 f166365i;

    /* JADX INFO: renamed from: j */
    public static tpd0 f166366j;

    /* JADX INFO: renamed from: k */
    public static zpd0 f166367k;

    /* JADX INFO: renamed from: l */
    public static uqd0 f166368l;

    /* JADX INFO: renamed from: m */
    public static hpd0 f166369m;

    /* JADX INFO: renamed from: n */
    public static uqd0 f166370n;

    /* JADX INFO: renamed from: o */
    public static uqd0 f166371o;

    static {
        Boolean bool = Boolean.FALSE;
        f166357a = new hpd0("need_bind_phone", bool);
        f166358b = new uqd0("feedDefaultPage", "");
        Boolean bool2 = Boolean.TRUE;
        f166359c = new hpd0("feedShowAccostButton", bool2);
        f166360d = new uqd0("topicH5RedirectURL", "");
        f166361e = new hpd0("feedShowMomentAudit", bool);
        f166362f = new hpd0("feedShowCommentAudit", bool);
        f166363g = new uqd0("stateEmotionListData", "");
        f166364h = new uqd0("stateGuideData", "");
        f166365i = new zpd0("last_timestamp_show_state_guide_remaining_" + FeedModule.m60221F().userId(), 0L);
        f166366j = new tpd0("state_no_enter_post_pager_count" + FeedModule.m60221F().userId(), 0);
        f166367k = new zpd0("last_timestamp_no_enter_state_guide_remaining_" + FeedModule.m60221F().userId(), 0L);
        f166368l = new uqd0("defaultTab_" + FeedModule.m60221F().userId(), "");
        f166369m = new hpd0("activityShowReadButton", bool2);
        f166370n = new uqd0("state_guide_window_title", "");
        f166371o = new uqd0("state_guide_window_sub_title", "");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m185955a() {
        User userM136539C = ijb0.m136539C();
        return !(NullChecker.m81304b(userM136539C) && NullChecker.m81303a(userM136539C.settings) && (!TextUtils.isEmpty(userM136539C.settings.phoneNumber.number) || !TextUtils.isEmpty(userM136539C.settings.linkedPhoneNumber.number))) && f166357a.get().booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m185956b() {
        return f166362f.get().booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m185957c() {
        return f166361e.get().booleanValue();
    }
}
