package p153l;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.core.data.Explore;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.dbcenter.parse.JsonParseHelper;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.CommunityOptimization;
import com.p051p1.mobile.putong.feed.data.Interactive;
import com.p051p1.mobile.putong.feed.data.MomentsInteraction;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class cmg implements ABManager.InterfaceC4829d {
    /* JADX INFO: renamed from: A */
    public static boolean m111169A() {
        return m111223n();
    }

    /* JADX INFO: renamed from: A0 */
    public static boolean m111170A0() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("video_immersion");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            return new JSONObject(strM80485F).optBoolean("soundSwitch", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: B */
    public static boolean m111171B() {
        return "auto".equals(ABManager.m30348i0("feed_refresh")) || pu20.m173818m();
    }

    /* JADX INFO: renamed from: B0 */
    public static String m111172B0() {
        User userMe_ = FeedModule.m61406H().me_();
        return m111215j((NullChecker.m82486a(userMe_) && userMe_.isFemale()) ? "female_repeat_hint" : "male_repeat_hint");
    }

    /* JADX INFO: renamed from: C */
    public static boolean m111173C() {
        return m111226o0("moment_distance_time", "abGroups");
    }

    /* JADX INFO: renamed from: C0 */
    public static boolean m111174C0() {
        User userMe_ = FeedModule.m61406H().me_();
        return m111217k((NullChecker.m82486a(userMe_) && userMe_.isFemale()) ? "female_switch" : "male_switch");
    }

    /* JADX INFO: renamed from: D */
    public static boolean m111175D() {
        return "gender_exp".equals(ABManager.m30348i0("moment_select"));
    }

    /* JADX INFO: renamed from: D0 */
    public static boolean m111176D0() {
        return "recommend_time".equals(ABManager.m30348i0(Explore.TYPE));
    }

    /* JADX INFO: renamed from: E */
    public static boolean m111177E() {
        if (RemoteConfig.m80481x().m80513s("explore_state_moment_full_config") || m111218k0()) {
            return true;
        }
        return "moment".equals(ABManager.m30348i0("explore_state"));
    }

    /* JADX INFO: renamed from: F */
    public static boolean m111178F(boolean z) {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("flower_switch");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            JSONObject jSONObject = new JSONObject(strM80485F);
            return z ? jSONObject.optBoolean("female") : jSONObject.optBoolean("male");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: G */
    public static boolean m111179G() {
        return m111211h("commentGreet", false);
    }

    /* JADX INFO: renamed from: H */
    public static boolean m111180H() {
        return m111211h("greetGuideFeed", false);
    }

    /* JADX INFO: renamed from: I */
    public static boolean m111181I() {
        return m111211h("likedLimitNumber", false);
    }

    /* JADX INFO: renamed from: J */
    public static boolean m111182J() {
        return m111211h("roaming", false);
    }

    /* JADX INFO: renamed from: K */
    public static boolean m111183K() {
        return m111181I() || m111211h("baseSwitch", false);
    }

    /* JADX INFO: renamed from: L */
    public static boolean m111184L() {
        return m111211h("politeSwitch", false);
    }

    /* JADX INFO: renamed from: M */
    public static boolean m111185M() {
        return m111211h("baseSwitch", false);
    }

    /* JADX INFO: renamed from: N */
    public static boolean m111186N() {
        return m111187O() || "circle_exp".equals(ABManager.m30348i0(Explore.TYPE));
    }

    /* JADX INFO: renamed from: O */
    public static boolean m111187O() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("explore_circle2"));
    }

    /* JADX INFO: renamed from: P */
    public static boolean m111188P() {
        return m111189Q();
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m111189Q() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("video_immersion");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            return new JSONObject(strM80485F).optBoolean("videoImmersionSwitch", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: R */
    public static boolean m111190R() {
        return !TextUtils.isEmpty(ABManager.m30348i0("video_immersion")) && ABManager.m30348i0("video_immersion").startsWith(AuthenticationTokenClaims.JSON_KEY_EXP);
    }

    /* JADX INFO: renamed from: S */
    public static boolean m111191S() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_auto_like");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            return new JSONObject(strM80485F).optBoolean("enable");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: T */
    public static boolean m111192T() {
        return ikh.m140300h();
    }

    /* JADX INFO: renamed from: U */
    public static boolean m111193U() {
        return FeedModule.m61406H().mo31737Wq();
    }

    /* JADX INFO: renamed from: V */
    public static boolean m111194V() {
        return RemoteConfig.m80481x().m80513s("feed_media_observe_switch");
    }

    /* JADX INFO: renamed from: W */
    public static boolean m111195W() {
        return FeedModule.m61406H().mo31824te();
    }

    /* JADX INFO: renamed from: X */
    public static boolean m111196X() {
        return !TextUtils.isEmpty(ABManager.m30348i0("new_explore3")) && ABManager.m30348i0("new_explore3").startsWith("moment_attitude_exp");
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m111197Y() {
        return m111199a0() || m111202c0() || m111200b0() || m111204d0() || m111208f0();
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m111198Z() {
        return m111199a0() || m111200b0();
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m111199a0() {
        return "moment_like_follow".equals(ABManager.m30348i0("explore_like")) || m111210g0();
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m111200b0() {
        return "moment_like_follow_sayhi".equals(ABManager.m30348i0("explore_like"));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m111201c() {
        return m111221m("detail");
    }

    /* JADX INFO: renamed from: c0 */
    public static boolean m111202c0() {
        return "moment_like_no_follow".equals(ABManager.m30348i0("explore_like")) || m111212h0();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m111203d() {
        return m111221m("discovery_feed");
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m111204d0() {
        return "moment_like_no_follow_no_sayhi".equals(ABManager.m30348i0("explore_like"));
    }

    /* JADX INFO: renamed from: e */
    public static CommunityOptimization m111205e() {
        CommunityOptimization communityOptimization;
        try {
            communityOptimization = (CommunityOptimization) RemoteConfig.m80481x().m80516v("community_optimization", CommunityOptimization.JSON_ADAPTER);
        } catch (Exception unused) {
            communityOptimization = null;
        }
        if (!NullChecker.m82486a(communityOptimization)) {
            return CommunityOptimization.new_();
        }
        communityOptimization.nullCheck();
        return communityOptimization;
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m111206e0() {
        return m111200b0() || m111204d0();
    }

    /* JADX INFO: renamed from: f */
    public static MomentsInteraction m111207f() {
        MomentsInteraction momentsInteraction;
        try {
            momentsInteraction = (MomentsInteraction) RemoteConfig.m80481x().m80516v("moments_interaction", MomentsInteraction.JSON_ADAPTER);
        } catch (Exception unused) {
            momentsInteraction = null;
        }
        if (!NullChecker.m82486a(momentsInteraction)) {
            return MomentsInteraction.new_();
        }
        momentsInteraction.nullCheck();
        return momentsInteraction;
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m111208f0() {
        return "moment_like_follow_2".equals(ABManager.m30348i0("explore_like")) || "moment_like_no_follow_2".equals(ABManager.m30348i0("explore_like"));
    }

    /* JADX INFO: renamed from: g */
    public static List<Interactive> m111209g() {
        try {
            return JsonParseHelper.parseList(RemoteConfig.m80481x().m80485F("topic_activity_entry_comfig"), Interactive.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m111210g0() {
        return "moment_like_follow_2".equals(ABManager.m30348i0("explore_like"));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m111211h(String str, boolean z) {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_like_relation");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            return new JSONObject(strM80485F).optJSONObject("upgradeToLikeFrame").optBoolean(str, z);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static boolean m111212h0() {
        return "moment_like_no_follow_2".equals(ABManager.m30348i0("explore_like"));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m111213i() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_like_relation");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            return new JSONObject(strM80485F).optJSONObject("upgradeToLikeFrame").optBoolean("likeMessageNoticeFuzzy", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m111214i0() {
        return "moment_mine_post_control".equals(ABManager.m30348i0(Explore.TYPE));
    }

    /* JADX INFO: renamed from: j */
    public static String m111215j(String str) {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("media_repeat_hit_config");
            return !TextUtils.isEmpty(strM80485F) ? new JSONObject(strM80485F).optString(str) : "存在其他用户已发布的图片";
        } catch (Exception unused) {
            return "存在其他用户已发布的图片";
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static boolean m111216j0() {
        try {
            return RemoteConfig.m80481x().m80513s("dynamic_inform_config");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m111217k(String str) {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("media_repeat_hit_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            return new JSONObject(strM80485F).optBoolean(str);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static boolean m111218k0() {
        return m111236t0() || AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("explore_state3"));
    }

    /* JADX INFO: renamed from: l */
    public static int m111219l() {
        return RemoteConfig.m80481x().m80519z("moment_interact_quick_comment_limit", 5);
    }

    /* JADX INFO: renamed from: l0 */
    public static boolean m111220l0() {
        try {
            return new JSONObject(RemoteConfig.m80481x().m80485F("newuser_checkin")).optBoolean("newuser_checkin");
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m111221m(String str) {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("age_sex_show_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return true;
            }
            return new JSONObject(strM80485F).optBoolean(str);
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m111222m0() {
        return m111224n0() || "qa_revision1".equals(ABManager.m30348i0(Explore.TYPE));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m111223n() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("state_post_simplify");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            return new JSONObject(strM80485F).optBoolean("state_simplify");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m111224n0() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("explore_qatopic");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            return new JSONObject(strM80485F).optBoolean("enable", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m111225o() {
        return RemoteConfig.m80481x().m80513s("hide_comment");
    }

    /* JADX INFO: renamed from: o0 */
    public static boolean m111226o0(String str, String str2) {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F(str);
            if (!TextUtils.isEmpty(strM80485F)) {
                String string = new JSONObject(strM80485F).getString(str2);
                if (!TextUtils.isEmpty(string)) {
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String[] strArrSplit = ((String) jSONArray.get(i)).split(":");
                        if (strArrSplit.length < 2) {
                            return false;
                        }
                        if (TextUtils.equals(strArrSplit[1], ABManager.m30348i0(strArrSplit[0]))) {
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
    public static boolean m111227p() {
        return ikh.m140296d();
    }

    /* JADX INFO: renamed from: p0 */
    public static boolean m111228p0() {
        return m111230q0();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m111229q() {
        try {
            return RemoteConfig.m80481x().m80513s("community_intercept");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static boolean m111230q0() {
        try {
            return RemoteConfig.m80481x().m80513s("topic_search_switch");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: r */
    public static boolean m111231r() {
        return FeedModule.m61406H().mo31794m2();
    }

    /* JADX INFO: renamed from: r0 */
    public static boolean m111232r0() {
        return "admin_moderator".equals(ABManager.m30348i0("tt_spam_inspection_abtest")) || "normal_moderator".equals(ABManager.m30348i0("tt_spam_inspection_abtest"));
    }

    /* JADX INFO: renamed from: s */
    public static boolean m111233s() {
        return (!TextUtils.isEmpty(ABManager.m30348i0("new_explore")) && ABManager.m30348i0("new_explore").startsWith("dating_discussion_exp")) || pu20.m173828w();
    }

    /* JADX INFO: renamed from: s0 */
    public static boolean m111234s0() {
        return !TextUtils.isEmpty(ABManager.m30348i0("explore_state5")) && ABManager.m30348i0("explore_state5").startsWith("exp2") && pu20.m173830y();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m111235t() {
        if (m111175D()) {
            return true;
        }
        return ((!TextUtils.isEmpty(ABManager.m30348i0("new_explore1")) && ABManager.m30348i0("new_explore1").startsWith("dating_interation_exp")) || pu20.m173796A()) && m111233s();
    }

    /* JADX INFO: renamed from: t0 */
    public static boolean m111236t0() {
        if (pu20.m173829x()) {
            return true;
        }
        if (TextUtils.isEmpty(ABManager.m30348i0("explore_state4")) || !ABManager.m30348i0("explore_state4").startsWith(AuthenticationTokenClaims.JSON_KEY_EXP)) {
            return (!TextUtils.isEmpty(ABManager.m30348i0("explore_state5")) && ABManager.m30348i0("explore_state5").startsWith("exp1")) || m111234s0() || m111169A();
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m111237u() {
        return (TextUtils.isEmpty(ABManager.m30348i0("community_optimization_tab")) || TextUtils.equals(ABManager.m30348i0("community_optimization_tab"), "control")) ? false : true;
    }

    /* JADX INFO: renamed from: u0 */
    public static boolean m111238u0() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("state_publish_config");
            if (!TextUtils.isEmpty(strM80485F)) {
                new JSONObject(strM80485F);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m111239v() {
        return !TextUtils.isEmpty(ABManager.m30348i0("default_explore")) && ABManager.m30348i0("default_explore").startsWith("first_display_moment");
    }

    /* JADX INFO: renamed from: v0 */
    public static boolean m111240v0() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("livephoto_function");
            if (!TextUtils.isEmpty(strM80485F)) {
                new JSONObject(strM80485F);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m111241w() {
        return !TextUtils.isEmpty(ABManager.m30348i0("default_explore")) && ABManager.m30348i0("default_explore").startsWith("first_display_memory");
    }

    /* JADX INFO: renamed from: w0 */
    public static boolean m111242w0() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("FakeUserEnvironment")) || AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("FakeUserEnvironment2"));
    }

    /* JADX INFO: renamed from: x */
    public static boolean m111243x() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("dynamic_at1"));
    }

    /* JADX INFO: renamed from: x0 */
    public static boolean m111244x0() {
        return m111242w0() && FeedModule.m61406H().mo31818rr();
    }

    /* JADX INFO: renamed from: y */
    public static boolean m111245y() {
        return TextUtils.equals(ABManager.m30348i0("moment"), "message_control");
    }

    /* JADX INFO: renamed from: y0 */
    public static boolean m111246y0() {
        return m111177E();
    }

    /* JADX INFO: renamed from: z */
    public static boolean m111247z() {
        return RemoteConfig.m80481x().m80513s("feed_comment_refactor_switch");
    }

    /* JADX INFO: renamed from: z0 */
    public static boolean m111248z0() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("video_auto_next_config");
            if (!TextUtils.isEmpty(strM80485F)) {
                new JSONObject(strM80485F);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: a */
    public void mo30391a() {
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: b */
    public void mo30392b() {
    }
}
