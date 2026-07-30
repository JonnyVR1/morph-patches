package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.ContractProductType;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.dbcenter.parse.JsonParseHelper;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.CommunityOptimization;
import com.p000p1.mobile.putong.feed.data.Interactive;
import com.p000p1.mobile.putong.feed.data.MomentsInteraction;
import com.p1.mobile.putong.api.ABManager;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class nkg implements ABManager.d {
    /* JADX INFO: renamed from: A */
    public static boolean m12199A() {
        return m12253n();
    }

    /* JADX INFO: renamed from: A0 */
    public static boolean m12200A0() {
        try {
            String strF = RemoteConfig.x().F("video_immersion");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).optBoolean("soundSwitch", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: B */
    public static boolean m12201B() {
        return "auto".equals(ABManager.i0("feed_refresh")) || fm20.m10233m();
    }

    /* JADX INFO: renamed from: B0 */
    public static String m12202B0() {
        User userMe_ = FeedModule.m1140H().me_();
        return m12245j((NullChecker.a(userMe_) && userMe_.isFemale()) ? "female_repeat_hint" : "male_repeat_hint");
    }

    /* JADX INFO: renamed from: C */
    public static boolean m12203C() {
        return m12256o0("moment_distance_time", "abGroups");
    }

    /* JADX INFO: renamed from: C0 */
    public static boolean m12204C0() {
        User userMe_ = FeedModule.m1140H().me_();
        return m12247k((NullChecker.a(userMe_) && userMe_.isFemale()) ? "female_switch" : "male_switch");
    }

    /* JADX INFO: renamed from: D */
    public static boolean m12205D() {
        return "gender_exp".equals(ABManager.i0("moment_select"));
    }

    /* JADX INFO: renamed from: D0 */
    public static boolean m12206D0() {
        return "recommend_time".equals(ABManager.i0("explore"));
    }

    /* JADX INFO: renamed from: E */
    public static boolean m12207E() {
        if (RemoteConfig.x().s("explore_state_moment_full_config") || m12248k0()) {
            return true;
        }
        return "moment".equals(ABManager.i0("explore_state"));
    }

    /* JADX INFO: renamed from: F */
    public static boolean m12208F(boolean z) {
        try {
            String strF = RemoteConfig.x().F("flower_switch");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            JSONObject jSONObject = new JSONObject(strF);
            return z ? jSONObject.optBoolean("female") : jSONObject.optBoolean("male");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: G */
    public static boolean m12209G() {
        return m12241h("commentGreet", false);
    }

    /* JADX INFO: renamed from: H */
    public static boolean m12210H() {
        return m12241h("greetGuideFeed", false);
    }

    /* JADX INFO: renamed from: I */
    public static boolean m12211I() {
        return m12241h("likedLimitNumber", false);
    }

    /* JADX INFO: renamed from: J */
    public static boolean m12212J() {
        return m12241h(ContractProductType.roaming, false);
    }

    /* JADX INFO: renamed from: K */
    public static boolean m12213K() {
        return m12211I() || m12241h("baseSwitch", false);
    }

    /* JADX INFO: renamed from: L */
    public static boolean m12214L() {
        return m12241h("politeSwitch", false);
    }

    /* JADX INFO: renamed from: M */
    public static boolean m12215M() {
        return m12241h("baseSwitch", false);
    }

    /* JADX INFO: renamed from: N */
    public static boolean m12216N() {
        return m12217O() || "circle_exp".equals(ABManager.i0("explore"));
    }

    /* JADX INFO: renamed from: O */
    public static boolean m12217O() {
        return "exp".equals(ABManager.i0("explore_circle2"));
    }

    /* JADX INFO: renamed from: P */
    public static boolean m12218P() {
        return m12219Q();
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m12219Q() {
        try {
            String strF = RemoteConfig.x().F("video_immersion");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).optBoolean("videoImmersionSwitch", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: R */
    public static boolean m12220R() {
        return !TextUtils.isEmpty(ABManager.i0("video_immersion")) && ABManager.i0("video_immersion").startsWith("exp");
    }

    /* JADX INFO: renamed from: S */
    public static boolean m12221S() {
        try {
            String strF = RemoteConfig.x().F("moment_auto_like");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).optBoolean("enable");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: T */
    public static boolean m12222T() {
        return tih.m14559h();
    }

    /* JADX INFO: renamed from: U */
    public static boolean m12223U() {
        return FeedModule.m1140H().Wq();
    }

    /* JADX INFO: renamed from: V */
    public static boolean m12224V() {
        return RemoteConfig.x().s("feed_media_observe_switch");
    }

    /* JADX INFO: renamed from: W */
    public static boolean m12225W() {
        return FeedModule.m1140H().te();
    }

    /* JADX INFO: renamed from: X */
    public static boolean m12226X() {
        return !TextUtils.isEmpty(ABManager.i0("new_explore3")) && ABManager.i0("new_explore3").startsWith("moment_attitude_exp");
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m12227Y() {
        return m12229a0() || m12232c0() || m12230b0() || m12234d0() || m12238f0();
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m12228Z() {
        return m12229a0() || m12230b0();
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m12229a0() {
        return "moment_like_follow".equals(ABManager.i0("explore_like")) || m12240g0();
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m12230b0() {
        return "moment_like_follow_sayhi".equals(ABManager.i0("explore_like"));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m12231c() {
        return m12251m("detail");
    }

    /* JADX INFO: renamed from: c0 */
    public static boolean m12232c0() {
        return "moment_like_no_follow".equals(ABManager.i0("explore_like")) || m12242h0();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m12233d() {
        return m12251m("discovery_feed");
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m12234d0() {
        return "moment_like_no_follow_no_sayhi".equals(ABManager.i0("explore_like"));
    }

    /* JADX INFO: renamed from: e */
    public static CommunityOptimization m12235e() {
        CommunityOptimization communityOptimization;
        try {
            communityOptimization = (CommunityOptimization) RemoteConfig.x().v("community_optimization", CommunityOptimization.JSON_ADAPTER);
        } catch (Exception unused) {
            communityOptimization = null;
        }
        if (!NullChecker.a(communityOptimization)) {
            return CommunityOptimization.new_();
        }
        communityOptimization.nullCheck();
        return communityOptimization;
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m12236e0() {
        return m12230b0() || m12234d0();
    }

    /* JADX INFO: renamed from: f */
    public static MomentsInteraction m12237f() {
        MomentsInteraction momentsInteraction;
        try {
            momentsInteraction = (MomentsInteraction) RemoteConfig.x().v("moments_interaction", MomentsInteraction.JSON_ADAPTER);
        } catch (Exception unused) {
            momentsInteraction = null;
        }
        if (!NullChecker.a(momentsInteraction)) {
            return MomentsInteraction.new_();
        }
        momentsInteraction.nullCheck();
        return momentsInteraction;
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m12238f0() {
        return "moment_like_follow_2".equals(ABManager.i0("explore_like")) || "moment_like_no_follow_2".equals(ABManager.i0("explore_like"));
    }

    /* JADX INFO: renamed from: g */
    public static List<Interactive> m12239g() {
        try {
            return JsonParseHelper.parseList(RemoteConfig.x().F("topic_activity_entry_comfig"), Interactive.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m12240g0() {
        return "moment_like_follow_2".equals(ABManager.i0("explore_like"));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m12241h(String str, boolean z) {
        try {
            String strF = RemoteConfig.x().F("moment_like_relation");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).optJSONObject("upgradeToLikeFrame").optBoolean(str, z);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static boolean m12242h0() {
        return "moment_like_no_follow_2".equals(ABManager.i0("explore_like"));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m12243i() {
        try {
            String strF = RemoteConfig.x().F("moment_like_relation");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).optJSONObject("upgradeToLikeFrame").optBoolean("likeMessageNoticeFuzzy", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m12244i0() {
        return "moment_mine_post_control".equals(ABManager.i0("explore"));
    }

    /* JADX INFO: renamed from: j */
    public static String m12245j(String str) {
        try {
            String strF = RemoteConfig.x().F("media_repeat_hit_config");
            return !TextUtils.isEmpty(strF) ? new JSONObject(strF).optString(str) : "存在其他用户已发布的图片";
        } catch (Exception unused) {
            return "存在其他用户已发布的图片";
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static boolean m12246j0() {
        try {
            return RemoteConfig.x().s("dynamic_inform_config");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m12247k(String str) {
        try {
            String strF = RemoteConfig.x().F("media_repeat_hit_config");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).optBoolean(str);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static boolean m12248k0() {
        return m12266t0() || "exp".equals(ABManager.i0("explore_state3"));
    }

    /* JADX INFO: renamed from: l */
    public static int m12249l() {
        return RemoteConfig.x().z("moment_interact_quick_comment_limit", 5);
    }

    /* JADX INFO: renamed from: l0 */
    public static boolean m12250l0() {
        try {
            return new JSONObject(RemoteConfig.x().F("newuser_checkin")).optBoolean("newuser_checkin");
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m12251m(String str) {
        try {
            String strF = RemoteConfig.x().F("age_sex_show_config");
            if (TextUtils.isEmpty(strF)) {
                return true;
            }
            return new JSONObject(strF).optBoolean(str);
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m12252m0() {
        return m12254n0() || "qa_revision1".equals(ABManager.i0("explore"));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m12253n() {
        try {
            String strF = RemoteConfig.x().F("state_post_simplify");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).optBoolean("state_simplify");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m12254n0() {
        try {
            String strF = RemoteConfig.x().F("explore_qatopic");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).optBoolean("enable", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m12255o() {
        return RemoteConfig.x().s("hide_comment");
    }

    /* JADX INFO: renamed from: o0 */
    public static boolean m12256o0(String str, String str2) {
        try {
            String strF = RemoteConfig.x().F(str);
            if (!TextUtils.isEmpty(strF)) {
                String string = new JSONObject(strF).getString(str2);
                if (!TextUtils.isEmpty(string)) {
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String[] strArrSplit = ((String) jSONArray.get(i)).split(":");
                        if (strArrSplit.length < 2) {
                            return false;
                        }
                        if (TextUtils.equals(strArrSplit[1], ABManager.i0(strArrSplit[0]))) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m12257p() {
        return tih.m14555d();
    }

    /* JADX INFO: renamed from: p0 */
    public static boolean m12258p0() {
        return m12260q0();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m12259q() {
        try {
            return RemoteConfig.x().s("community_intercept");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static boolean m12260q0() {
        try {
            return RemoteConfig.x().s("topic_search_switch");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: r */
    public static boolean m12261r() {
        return FeedModule.m1140H().m2();
    }

    /* JADX INFO: renamed from: r0 */
    public static boolean m12262r0() {
        return "admin_moderator".equals(ABManager.i0("tt_spam_inspection_abtest")) || "normal_moderator".equals(ABManager.i0("tt_spam_inspection_abtest"));
    }

    /* JADX INFO: renamed from: s */
    public static boolean m12263s() {
        return (!TextUtils.isEmpty(ABManager.i0("new_explore")) && ABManager.i0("new_explore").startsWith("dating_discussion_exp")) || fm20.m10243w();
    }

    /* JADX INFO: renamed from: s0 */
    public static boolean m12264s0() {
        return !TextUtils.isEmpty(ABManager.i0("explore_state5")) && ABManager.i0("explore_state5").startsWith("exp2") && fm20.m10245y();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m12265t() {
        if (m12205D()) {
            return true;
        }
        return ((!TextUtils.isEmpty(ABManager.i0("new_explore1")) && ABManager.i0("new_explore1").startsWith("dating_interation_exp")) || fm20.m10211A()) && m12263s();
    }

    /* JADX INFO: renamed from: t0 */
    public static boolean m12266t0() {
        if (fm20.m10244x()) {
            return true;
        }
        if (TextUtils.isEmpty(ABManager.i0("explore_state4")) || !ABManager.i0("explore_state4").startsWith("exp")) {
            return (!TextUtils.isEmpty(ABManager.i0("explore_state5")) && ABManager.i0("explore_state5").startsWith("exp1")) || m12264s0() || m12199A();
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m12267u() {
        return (TextUtils.isEmpty(ABManager.i0("community_optimization_tab")) || TextUtils.equals(ABManager.i0("community_optimization_tab"), "control")) ? false : true;
    }

    /* JADX INFO: renamed from: u0 */
    public static boolean m12268u0() {
        try {
            String strF = RemoteConfig.x().F("state_publish_config");
            if (!TextUtils.isEmpty(strF)) {
                new JSONObject(strF);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m12269v() {
        return !TextUtils.isEmpty(ABManager.i0("default_explore")) && ABManager.i0("default_explore").startsWith("first_display_moment");
    }

    /* JADX INFO: renamed from: v0 */
    public static boolean m12270v0() {
        try {
            String strF = RemoteConfig.x().F("livephoto_function");
            if (!TextUtils.isEmpty(strF)) {
                new JSONObject(strF);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m12271w() {
        return !TextUtils.isEmpty(ABManager.i0("default_explore")) && ABManager.i0("default_explore").startsWith("first_display_memory");
    }

    /* JADX INFO: renamed from: w0 */
    public static boolean m12272w0() {
        return "exp".equals(ABManager.i0("FakeUserEnvironment")) || "exp".equals(ABManager.i0("FakeUserEnvironment2"));
    }

    /* JADX INFO: renamed from: x */
    public static boolean m12273x() {
        return "exp".equals(ABManager.i0("dynamic_at1"));
    }

    /* JADX INFO: renamed from: x0 */
    public static boolean m12274x0() {
        return m12272w0() && FeedModule.m1140H().rr();
    }

    /* JADX INFO: renamed from: y */
    public static boolean m12275y() {
        return TextUtils.equals(ABManager.i0("moment"), "message_control");
    }

    /* JADX INFO: renamed from: y0 */
    public static boolean m12276y0() {
        return m12207E();
    }

    /* JADX INFO: renamed from: z */
    public static boolean m12277z() {
        return RemoteConfig.x().s("feed_comment_refactor_switch");
    }

    /* JADX INFO: renamed from: z0 */
    public static boolean m12278z0() {
        try {
            String strF = RemoteConfig.x().F("video_auto_next_config");
            if (!TextUtils.isEmpty(strF)) {
                new JSONObject(strF);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m12279a() {
    }

    /* JADX INFO: renamed from: b */
    public void m12280b() {
    }
}
