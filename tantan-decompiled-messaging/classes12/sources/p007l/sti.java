package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import l.hpd0;
import l.tpd0;
import l.uqd0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class sti {

    /* JADX INFO: renamed from: a */
    public static hpd0 f13075a;

    /* JADX INFO: renamed from: b */
    public static uqd0 f13076b;

    /* JADX INFO: renamed from: c */
    public static hpd0 f13077c;

    /* JADX INFO: renamed from: d */
    public static uqd0 f13078d;

    /* JADX INFO: renamed from: e */
    public static hpd0 f13079e;

    /* JADX INFO: renamed from: f */
    public static hpd0 f13080f;

    /* JADX INFO: renamed from: g */
    public static uqd0 f13081g;

    /* JADX INFO: renamed from: h */
    public static uqd0 f13082h;

    /* JADX INFO: renamed from: i */
    public static zpd0 f13083i;

    /* JADX INFO: renamed from: j */
    public static tpd0 f13084j;

    /* JADX INFO: renamed from: k */
    public static zpd0 f13085k;

    /* JADX INFO: renamed from: l */
    public static uqd0 f13086l;

    /* JADX INFO: renamed from: m */
    public static hpd0 f13087m;

    /* JADX INFO: renamed from: n */
    public static uqd0 f13088n;

    /* JADX INFO: renamed from: o */
    public static uqd0 f13089o;

    static {
        Boolean bool = Boolean.FALSE;
        f13075a = new hpd0("need_bind_phone", bool);
        f13076b = new uqd0("feedDefaultPage", "");
        Boolean bool2 = Boolean.TRUE;
        f13077c = new hpd0("feedShowAccostButton", bool2);
        f13078d = new uqd0("topicH5RedirectURL", "");
        f13079e = new hpd0("feedShowMomentAudit", bool);
        f13080f = new hpd0("feedShowCommentAudit", bool);
        f13081g = new uqd0("stateEmotionListData", "");
        f13082h = new uqd0("stateGuideData", "");
        f13083i = new zpd0("last_timestamp_show_state_guide_remaining_" + FeedModule.m1139F().userId(), 0L);
        f13084j = new tpd0("state_no_enter_post_pager_count" + FeedModule.m1139F().userId(), 0);
        f13085k = new zpd0("last_timestamp_no_enter_state_guide_remaining_" + FeedModule.m1139F().userId(), 0L);
        f13086l = new uqd0("defaultTab_" + FeedModule.m1139F().userId(), "");
        f13087m = new hpd0("activityShowReadButton", bool2);
        f13088n = new uqd0("state_guide_window_title", "");
        f13089o = new uqd0("state_guide_window_sub_title", "");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m14315a() {
        User userM10892C = ijb0.m10892C();
        return !(NullChecker.b(userM10892C) && NullChecker.a(userM10892C.settings) && (!TextUtils.isEmpty(userM10892C.settings.phoneNumber.number) || !TextUtils.isEmpty(userM10892C.settings.linkedPhoneNumber.number))) && ((Boolean) f13075a.get()).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m14316b() {
        return ((Boolean) f13080f.get()).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m14317c() {
        return ((Boolean) f13079e.get()).booleanValue();
    }
}
