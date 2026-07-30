package p149l;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.core.data.Explore;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.dbcenter.parse.JsonParseHelper;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.CommunityOptimization;
import com.p046p1.mobile.putong.feed.data.Interactive;
import com.p046p1.mobile.putong.feed.data.MomentsInteraction;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class nkg implements ABManager.InterfaceC4678d {
    /* JADX INFO: renamed from: A */
    public static boolean m159840A() {
        return m159894n();
    }

    /* JADX INFO: renamed from: A0 */
    public static boolean m159841A0() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("video_immersion");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).optBoolean("soundSwitch", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: B */
    public static boolean m159842B() {
        return "auto".equals(ABManager.m29350i0("feed_refresh")) || fm20.m122130m();
    }

    /* JADX INFO: renamed from: B0 */
    public static String m159843B0() {
        User userMe_ = FeedModule.m60222H().me_();
        return m159886j((NullChecker.m81303a(userMe_) && userMe_.isFemale()) ? "female_repeat_hint" : "male_repeat_hint");
    }

    /* JADX INFO: renamed from: C */
    public static boolean m159844C() {
        return m159897o0("moment_distance_time", "abGroups");
    }

    /* JADX INFO: renamed from: C0 */
    public static boolean m159845C0() {
        User userMe_ = FeedModule.m60222H().me_();
        return m159888k((NullChecker.m81303a(userMe_) && userMe_.isFemale()) ? "female_switch" : "male_switch");
    }

    /* JADX INFO: renamed from: D */
    public static boolean m159846D() {
        return "gender_exp".equals(ABManager.m29350i0("moment_select"));
    }

    /* JADX INFO: renamed from: D0 */
    public static boolean m159847D0() {
        return "recommend_time".equals(ABManager.m29350i0(Explore.TYPE));
    }

    /* JADX INFO: renamed from: E */
    public static boolean m159848E() {
        if (RemoteConfig.m79298x().m79330s("explore_state_moment_full_config") || m159889k0()) {
            return true;
        }
        return "moment".equals(ABManager.m29350i0("explore_state"));
    }

    /* JADX INFO: renamed from: F */
    public static boolean m159849F(boolean z) {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("flower_switch");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            JSONObject jSONObject = new JSONObject(strM79302F);
            return z ? jSONObject.optBoolean("female") : jSONObject.optBoolean("male");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: G */
    public static boolean m159850G() {
        return m159882h("commentGreet", false);
    }

    /* JADX INFO: renamed from: H */
    public static boolean m159851H() {
        return m159882h("greetGuideFeed", false);
    }

    /* JADX INFO: renamed from: I */
    public static boolean m159852I() {
        return m159882h("likedLimitNumber", false);
    }

    /* JADX INFO: renamed from: J */
    public static boolean m159853J() {
        return m159882h("roaming", false);
    }

    /* JADX INFO: renamed from: K */
    public static boolean m159854K() {
        return m159852I() || m159882h("baseSwitch", false);
    }

    /* JADX INFO: renamed from: L */
    public static boolean m159855L() {
        return m159882h("politeSwitch", false);
    }

    /* JADX INFO: renamed from: M */
    public static boolean m159856M() {
        return m159882h("baseSwitch", false);
    }

    /* JADX INFO: renamed from: N */
    public static boolean m159857N() {
        return m159858O() || "circle_exp".equals(ABManager.m29350i0(Explore.TYPE));
    }

    /* JADX INFO: renamed from: O */
    public static boolean m159858O() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("explore_circle2"));
    }

    /* JADX INFO: renamed from: P */
    public static boolean m159859P() {
        return m159860Q();
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m159860Q() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("video_immersion");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).optBoolean("videoImmersionSwitch", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: R */
    public static boolean m159861R() {
        return !TextUtils.isEmpty(ABManager.m29350i0("video_immersion")) && ABManager.m29350i0("video_immersion").startsWith(AuthenticationTokenClaims.JSON_KEY_EXP);
    }

    /* JADX INFO: renamed from: S */
    public static boolean m159862S() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_auto_like");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).optBoolean("enable");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: T */
    public static boolean m159863T() {
        return tih.m189192h();
    }

    /* JADX INFO: renamed from: U */
    public static boolean m159864U() {
        return FeedModule.m60222H().mo30734Wq();
    }

    /* JADX INFO: renamed from: V */
    public static boolean m159865V() {
        return RemoteConfig.m79298x().m79330s("feed_media_observe_switch");
    }

    /* JADX INFO: renamed from: W */
    public static boolean m159866W() {
        return FeedModule.m60222H().mo30821te();
    }

    /* JADX INFO: renamed from: X */
    public static boolean m159867X() {
        return !TextUtils.isEmpty(ABManager.m29350i0("new_explore3")) && ABManager.m29350i0("new_explore3").startsWith("moment_attitude_exp");
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m159868Y() {
        return m159870a0() || m159873c0() || m159871b0() || m159875d0() || m159879f0();
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m159869Z() {
        return m159870a0() || m159871b0();
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m159870a0() {
        return "moment_like_follow".equals(ABManager.m29350i0("explore_like")) || m159881g0();
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m159871b0() {
        return "moment_like_follow_sayhi".equals(ABManager.m29350i0("explore_like"));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m159872c() {
        return m159892m("detail");
    }

    /* JADX INFO: renamed from: c0 */
    public static boolean m159873c0() {
        return "moment_like_no_follow".equals(ABManager.m29350i0("explore_like")) || m159883h0();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m159874d() {
        return m159892m("discovery_feed");
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m159875d0() {
        return "moment_like_no_follow_no_sayhi".equals(ABManager.m29350i0("explore_like"));
    }

    /* JADX INFO: renamed from: e */
    public static CommunityOptimization m159876e() {
        CommunityOptimization communityOptimization;
        try {
            communityOptimization = (CommunityOptimization) RemoteConfig.m79298x().m79333v("community_optimization", CommunityOptimization.JSON_ADAPTER);
        } catch (Exception unused) {
            communityOptimization = null;
        }
        if (!NullChecker.m81303a(communityOptimization)) {
            return CommunityOptimization.new_();
        }
        communityOptimization.nullCheck();
        return communityOptimization;
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m159877e0() {
        return m159871b0() || m159875d0();
    }

    /* JADX INFO: renamed from: f */
    public static MomentsInteraction m159878f() {
        MomentsInteraction momentsInteraction;
        try {
            momentsInteraction = (MomentsInteraction) RemoteConfig.m79298x().m79333v("moments_interaction", MomentsInteraction.JSON_ADAPTER);
        } catch (Exception unused) {
            momentsInteraction = null;
        }
        if (!NullChecker.m81303a(momentsInteraction)) {
            return MomentsInteraction.new_();
        }
        momentsInteraction.nullCheck();
        return momentsInteraction;
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m159879f0() {
        return "moment_like_follow_2".equals(ABManager.m29350i0("explore_like")) || "moment_like_no_follow_2".equals(ABManager.m29350i0("explore_like"));
    }

    /* JADX INFO: renamed from: g */
    public static List<Interactive> m159880g() {
        try {
            return JsonParseHelper.parseList(RemoteConfig.m79298x().m79302F("topic_activity_entry_comfig"), Interactive.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m159881g0() {
        return "moment_like_follow_2".equals(ABManager.m29350i0("explore_like"));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m159882h(String str, boolean z) {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_like_relation");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).optJSONObject("upgradeToLikeFrame").optBoolean(str, z);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static boolean m159883h0() {
        return "moment_like_no_follow_2".equals(ABManager.m29350i0("explore_like"));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m159884i() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_like_relation");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).optJSONObject("upgradeToLikeFrame").optBoolean("likeMessageNoticeFuzzy", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m159885i0() {
        return "moment_mine_post_control".equals(ABManager.m29350i0(Explore.TYPE));
    }

    /* JADX INFO: renamed from: j */
    public static String m159886j(String str) {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("media_repeat_hit_config");
            return !TextUtils.isEmpty(strM79302F) ? new JSONObject(strM79302F).optString(str) : "存在其他用户已发布的图片";
        } catch (Exception unused) {
            return "存在其他用户已发布的图片";
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static boolean m159887j0() {
        try {
            return RemoteConfig.m79298x().m79330s("dynamic_inform_config");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m159888k(String str) {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("media_repeat_hit_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).optBoolean(str);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static boolean m159889k0() {
        return m159907t0() || AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("explore_state3"));
    }

    /* JADX INFO: renamed from: l */
    public static int m159890l() {
        return RemoteConfig.m79298x().m79336z("moment_interact_quick_comment_limit", 5);
    }

    /* JADX INFO: renamed from: l0 */
    public static boolean m159891l0() {
        try {
            return new JSONObject(RemoteConfig.m79298x().m79302F("newuser_checkin")).optBoolean("newuser_checkin");
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m159892m(String str) {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("age_sex_show_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return true;
            }
            return new JSONObject(strM79302F).optBoolean(str);
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m159893m0() {
        return m159895n0() || "qa_revision1".equals(ABManager.m29350i0(Explore.TYPE));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m159894n() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("state_post_simplify");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).optBoolean("state_simplify");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m159895n0() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("explore_qatopic");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).optBoolean("enable", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m159896o() {
        return RemoteConfig.m79298x().m79330s("hide_comment");
    }

    /* JADX INFO: renamed from: o0 */
    public static boolean m159897o0(String str, String str2) {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F(str);
            if (!TextUtils.isEmpty(strM79302F)) {
                String string = new JSONObject(strM79302F).getString(str2);
                if (!TextUtils.isEmpty(string)) {
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String[] strArrSplit = ((String) jSONArray.get(i)).split(":");
                        if (strArrSplit.length < 2) {
                            return false;
                        }
                        if (TextUtils.equals(strArrSplit[1], ABManager.m29350i0(strArrSplit[0]))) {
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
    public static boolean m159898p() {
        return tih.m189188d();
    }

    /* JADX INFO: renamed from: p0 */
    public static boolean m159899p0() {
        return m159901q0();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m159900q() {
        try {
            return RemoteConfig.m79298x().m79330s("community_intercept");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static boolean m159901q0() {
        try {
            return RemoteConfig.m79298x().m79330s("topic_search_switch");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: r */
    public static boolean m159902r() {
        return FeedModule.m60222H().mo30791m2();
    }

    /* JADX INFO: renamed from: r0 */
    public static boolean m159903r0() {
        return "admin_moderator".equals(ABManager.m29350i0("tt_spam_inspection_abtest")) || "normal_moderator".equals(ABManager.m29350i0("tt_spam_inspection_abtest"));
    }

    /* JADX INFO: renamed from: s */
    public static boolean m159904s() {
        return (!TextUtils.isEmpty(ABManager.m29350i0("new_explore")) && ABManager.m29350i0("new_explore").startsWith("dating_discussion_exp")) || fm20.m122140w();
    }

    /* JADX INFO: renamed from: s0 */
    public static boolean m159905s0() {
        return !TextUtils.isEmpty(ABManager.m29350i0("explore_state5")) && ABManager.m29350i0("explore_state5").startsWith("exp2") && fm20.m122142y();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m159906t() {
        if (m159846D()) {
            return true;
        }
        return ((!TextUtils.isEmpty(ABManager.m29350i0("new_explore1")) && ABManager.m29350i0("new_explore1").startsWith("dating_interation_exp")) || fm20.m122108A()) && m159904s();
    }

    /* JADX INFO: renamed from: t0 */
    public static boolean m159907t0() {
        if (fm20.m122141x()) {
            return true;
        }
        if (TextUtils.isEmpty(ABManager.m29350i0("explore_state4")) || !ABManager.m29350i0("explore_state4").startsWith(AuthenticationTokenClaims.JSON_KEY_EXP)) {
            return (!TextUtils.isEmpty(ABManager.m29350i0("explore_state5")) && ABManager.m29350i0("explore_state5").startsWith("exp1")) || m159905s0() || m159840A();
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m159908u() {
        return (TextUtils.isEmpty(ABManager.m29350i0("community_optimization_tab")) || TextUtils.equals(ABManager.m29350i0("community_optimization_tab"), "control")) ? false : true;
    }

    /* JADX INFO: renamed from: u0 */
    public static boolean m159909u0() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("state_publish_config");
            if (!TextUtils.isEmpty(strM79302F)) {
                new JSONObject(strM79302F);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m159910v() {
        return !TextUtils.isEmpty(ABManager.m29350i0("default_explore")) && ABManager.m29350i0("default_explore").startsWith("first_display_moment");
    }

    /* JADX INFO: renamed from: v0 */
    public static boolean m159911v0() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("livephoto_function");
            if (!TextUtils.isEmpty(strM79302F)) {
                new JSONObject(strM79302F);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m159912w() {
        return !TextUtils.isEmpty(ABManager.m29350i0("default_explore")) && ABManager.m29350i0("default_explore").startsWith("first_display_memory");
    }

    /* JADX INFO: renamed from: w0 */
    public static boolean m159913w0() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("FakeUserEnvironment")) || AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("FakeUserEnvironment2"));
    }

    /* JADX INFO: renamed from: x */
    public static boolean m159914x() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("dynamic_at1"));
    }

    /* JADX INFO: renamed from: x0 */
    public static boolean m159915x0() {
        return m159913w0() && FeedModule.m60222H().mo30815rr();
    }

    /* JADX INFO: renamed from: y */
    public static boolean m159916y() {
        return TextUtils.equals(ABManager.m29350i0("moment"), "message_control");
    }

    /* JADX INFO: renamed from: y0 */
    public static boolean m159917y0() {
        return m159848E();
    }

    /* JADX INFO: renamed from: z */
    public static boolean m159918z() {
        return RemoteConfig.m79298x().m79330s("feed_comment_refactor_switch");
    }

    /* JADX INFO: renamed from: z0 */
    public static boolean m159919z0() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("video_auto_next_config");
            if (!TextUtils.isEmpty(strM79302F)) {
                new JSONObject(strM79302F);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: a */
    public void mo29393a() {
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: b */
    public void mo29394b() {
    }
}
