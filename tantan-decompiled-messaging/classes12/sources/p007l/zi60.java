package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Audio;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Link;
import com.p000p1.mobile.putong.data.Live;
import com.p000p1.mobile.putong.data.MatchScData;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.TopicOperations;
import com.p006ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l.j760;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class zi60 {

    /* JADX INFO: renamed from: a */
    public static volatile zi60 f15781a;

    /* JADX INFO: renamed from: b */
    public static boolean f15782b;

    /* JADX INFO: renamed from: B */
    public static j760[] m17434B(String str, Moment moment, User user) {
        if (moment == null) {
            return null;
        }
        return new j760[]{new j760("moment_type", str), new j760("moment_id", ((DbObject) moment).id), new j760("owner_id", moment.owner), new j760("receiver_user_id", moment.owner), new j760("moments_user_id", NullChecker.a(user) ? ((DbObject) user).id : "")};
    }

    /* JADX INFO: renamed from: D */
    public static String m17435D(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        str.getClass();
        switch (str) {
            case "from_no_topic_aggregation_list":
            case "from_qa_topic_aggregation":
            case "from_topic_aggregation":
            case "from_topic_nearby_header":
            case "from_h5_topic_aggregation":
            case "from_topic_official":
                return "topic_detail";
            case "from_discover_discussion":
                return "p_discover_discussion";
            case "from_album":
            case "my_tab":
            case "from_profile":
                return "album";
            case "from_activities_moment":
            case "photo_album_activities":
            case "activities":
                return RXScreenCaptureService.KEY_LAUNCH_ACTIVITY;
            case "topic_recommend":
                return "topic_recommend";
            case "qa_recommend":
                return "qa_recommend";
            case "p_live_moment":
                return "p_live_moment";
            case "from_activity_tab_one":
                return fm20.m10224d("from_activity_tab_one");
            case "from_activity_tab_two":
                return fm20.m10224d("from_activity_tab_two");
            case "chat":
                return "chat";
            case "push":
            case "push_new_moment":
                return "push";
            case "aggregate_page":
                return "music";
            case "from_nearby_falls_feed":
                return "nearby";
            case "p_chat_view":
                return "chat";
            case "qa_latest":
                return "qa_latest";
            case "from_discover_dating":
                return "p_discover_dating";
            case "topic_latest":
                return "topic_latest";
            case "from_poi_aggregation":
                return "p_poi_detail";
            case "from_nearby_focus":
                return "p_follow";
            default:
                return "other";
        }
    }

    /* JADX INFO: renamed from: w */
    public static zi60 m17436w() {
        if (f15781a == null) {
            synchronized (zi60.class) {
                try {
                    if (f15781a == null) {
                        f15781a = new zi60();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15781a;
    }

    /* JADX INFO: renamed from: A */
    public final String m17437A() {
        TopicOperations topicOperations = FeedModule.f316d.f14926H1;
        return (NullChecker.a(topicOperations) && NullChecker.a(topicOperations.publishGuide)) ? topicOperations.publishGuide.momentValue : "";
    }

    /* JADX INFO: renamed from: C */
    public final String m17438C(Picture picture) {
        Dimension dimension;
        if (picture != null && (dimension = picture.size) != null) {
            int i = dimension.width;
            int i2 = dimension.height;
            if (i > 0 && i2 > 0) {
                float fY0 = xdl0.y0() / xdl0.w0();
                float f = i / i2;
                float fAbs = Math.abs(f - 1.0f);
                float fAbs2 = Math.abs(f - 0.75f);
                float fAbs3 = Math.abs(f - 0.5625f);
                float fM17466x = m17466x(fAbs, fAbs2, fAbs3, Math.abs(f - fY0));
                if (fM17466x == fAbs) {
                    return "1.1";
                }
                if (fM17466x == fAbs2) {
                    return "3.4";
                }
                return fM17466x == fAbs3 ? "9.16" : "full";
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: E */
    public String m17439E(TopicMoment topicMoment) {
        return NullChecker.a(topicMoment) ? m17440F(topicMoment.topicType) : "";
    }

    /* JADX INFO: renamed from: F */
    public String m17440F(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.equals(Link.TYPE) ? "H5" : str;
    }

    /* JADX INFO: renamed from: G */
    public String m17441G(Moment moment) {
        return (moment == null || TextUtils.isEmpty(moment.owner) || FeedModule.f316d.m16769y7(moment.owner) == null) ? "0" : "1";
    }

    /* JADX INFO: renamed from: H */
    public final JSONObject m17442H(ArrayList<Media> arrayList, int i, int i2, boolean z, Moment moment, boolean z2, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        boolean zJ = vwb.J(moment.topics);
        boolean z3 = !zJ;
        try {
            jSONObject.put("code", String.valueOf(i));
            jSONObject.put("is_from_photo_to_video", z2);
            jSONObject.put("is_anonymous", i2);
            jSONObject.put("moment_id", ((DbObject) moment).id);
            jSONObject.put("have_message", !TextUtils.isEmpty(moment.value));
            jSONObject.put("is_topic", z3);
            jSONObject.put("topic_id", !zJ ? moment.topics.get(0).f285id : "");
            String str = moment.from;
            if (str == null) {
                str = "";
            }
            jSONObject.put("posted_source", str);
            if (moment.isNewUserAIMoment) {
                jSONObject.put("newuser_checkin_change_content", TextUtils.equals(m17437A(), moment.value) ? "0" : "1");
            }
            if (NullChecker.a(map)) {
                Set<String> setKeySet = map.keySet();
                if (NullChecker.a(setKeySet) && !setKeySet.isEmpty()) {
                    for (String str2 : setKeySet) {
                        jSONObject.put(str2, map.get(str2));
                    }
                }
            }
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        if (!z) {
            if (vwb.J(arrayList)) {
                try {
                    jSONObject.put("moment_type", "word");
                } catch (JSONException e2) {
                    CrashHelper.c(e2);
                }
            }
            int size = arrayList != null ? arrayList.size() : 0;
            for (int i3 = 0; i3 < size; i3++) {
                Media media = arrayList.get(i3);
                if (NullChecker.a(media.meta) && TextUtils.isEmpty(media.meta.proportion)) {
                    String strM17438C = media instanceof Video ? m17438C(((Video) media).cover) : "";
                    if (media instanceof Picture) {
                        strM17438C = m17438C((Picture) media);
                    }
                    media.meta.proportion = strM17438C;
                }
            }
            arrayList.get(0).newBuildMediaLogParmas(jSONObject);
            return jSONObject;
        }
        try {
            jSONObject.put("moment_type", "qa");
        } catch (JSONException e3) {
            CrashHelper.c(e3);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: I */
    public void m17443I(boolean z, String str) {
        if (TextUtils.equals("p_moment_post", str)) {
            p6j0.m12912b("e_set_my_state_post", "p_moment_post", new p6j0.C2456a[0]);
        }
        zvf0.B("p_set_my_state_post", "", new j760[]{vwb.Y("post_success", Integer.valueOf(z ? 1 : 0))});
    }

    /* JADX INFO: renamed from: a */
    public void m17444a(TopicMoment topicMoment, String str) {
        m17445b(topicMoment, str, null);
    }

    /* JADX INFO: renamed from: b */
    public void m17445b(TopicMoment topicMoment, String str, j760 j760Var) {
        j760 j760VarA = j760.a("topic_id", topicMoment.f708id);
        j760 j760VarA2 = j760.a("is_create", Boolean.valueOf(topicMoment.owner.f220id.equals(FeedModule.m1139F().userId())));
        j760 j760VarA3 = j760.a("topic_type", m17439E(topicMoment));
        if (j760Var == null) {
            p6j0.m12913c("e_topic", str, vqg.m15521j(str, j760VarA, j760VarA2, j760VarA3));
        } else {
            p6j0.m12913c("e_topic", str, vqg.m15521j(str, j760VarA, j760VarA2, j760VarA3, j760Var));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m17446c(TopicMoment topicMoment, String str) {
        m17447d(topicMoment, str, null);
    }

    /* JADX INFO: renamed from: d */
    public void m17447d(TopicMoment topicMoment, String str, j760 j760Var) {
        j760 j760VarA = j760.a("topic_id", topicMoment.f708id);
        j760 j760VarA2 = j760.a("is_create", Boolean.valueOf(topicMoment.owner.f220id.equals(FeedModule.m1139F().userId())));
        j760 j760VarA3 = j760.a("topic_type", m17439E(topicMoment));
        if (j760Var == null) {
            p6j0.m12915e("e_topic", str, vqg.m15521j(str, j760VarA, j760VarA2, j760VarA3));
        } else {
            p6j0.m12915e("e_topic", str, vqg.m15521j(str, j760VarA, j760VarA2, j760VarA3, j760Var));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m17448e(Moment moment, MomentMessage momentMessage) {
        if (NullChecker.a(moment)) {
            p6j0.m12913c("e_moment_comment_pic", "p_immersion_comment_page", j760.a("moment_id", ((DbObject) moment).id), j760.a("comment_user_id", momentMessage.owner), j760.a("is_masked", Integer.valueOf(moment.isAnonymousMoment() ? 1 : 0)));
        }
    }

    /* JADX INFO: renamed from: f */
    public void m17449f(Moment moment, String str, boolean z, int i, boolean z2) {
        m17450g(moment, str, z, i, z2, -1);
    }

    /* JADX INFO: renamed from: h */
    public void m17451h(Moment moment, String str, boolean z, Throwable th, boolean z2) {
        m17449f(moment, str, z, vqg.m15491O(th), z2);
    }

    /* JADX INFO: renamed from: i */
    public void m17452i(Moment moment, String str, boolean z, Throwable th, boolean z2, int i) {
        m17450g(moment, str, z, vqg.m15491O(th), z2, i);
    }

    /* JADX INFO: renamed from: j */
    public void m17453j(Moment moment, MomentMessage momentMessage) {
        if (NullChecker.a(moment)) {
            p6j0.m12913c("e_moment_comment_pic", "p_user_moment_interactions_details_view", j760.a("moment_id", ((DbObject) moment).id), j760.a("comment_user_id", momentMessage.owner), j760.a("is_masked", Integer.valueOf(moment.isAnonymousMoment() ? 1 : 0)));
        }
    }

    /* JADX INFO: renamed from: l */
    public void m17455l(Moment moment, String str, Throwable th, boolean z) {
        m17454k(moment, str, vqg.m15491O(th), z);
    }

    /* JADX INFO: renamed from: m */
    public void m17456m(Moment moment, String str, boolean z) {
        String strM15487L = vqg.m15487L(str, z);
        if (TextUtils.isEmpty(strM15487L)) {
            return;
        }
        p6j0.m12913c("e_moment_user_pic", strM15487L, vqg.m15519i(str, j760.a("moment_id", ((DbObject) moment).id), j760.a("owner_id", moment.owner), j760.a("is_state", m17441G(moment)), j760.a("is_masked", Integer.valueOf(moment.isAnonymousMoment() ? 1 : 0))));
    }

    /* JADX INFO: renamed from: n */
    public void m17457n(Moment moment, String str, int i, boolean z, Map<String, Object> map) {
        if (moment == null || f15782b) {
            f15782b = false;
            return;
        }
        ArrayList<Media> arrayList = (ArrayList) moment.media;
        boolean zM15566d = vs0.m15566d(moment);
        zvf0.t("e_moment_posted", str, m17442H(arrayList, i, zM15566d ? 1 : 0, "p_topic_detail".equals(str), moment, z, map));
    }

    /* JADX INFO: renamed from: o */
    public void m17458o(Moment moment, String str, Throwable th, boolean z, Map<String, Object> map) {
        if (moment == null || f15782b) {
            f15782b = false;
            return;
        }
        ArrayList<Media> arrayList = (ArrayList) moment.media;
        int iM15491O = vqg.m15491O(th);
        boolean zM15566d = vs0.m15566d(moment);
        zvf0.t("e_moment_posted", str, m17442H(arrayList, iM15491O, zM15566d ? 1 : 0, "p_topic_detail".equals(str), moment, z, map));
    }

    /* JADX INFO: renamed from: p */
    public void m17459p(Moment moment, String str, int i, boolean z, j760<String, String> j760Var) {
        if (moment == null) {
            return;
        }
        ArrayList<Media> arrayList = (ArrayList) moment.media;
        boolean zM15566d = vs0.m15566d(moment);
        JSONObject jSONObjectM17442H = m17442H(arrayList, i, zM15566d ? 1 : 0, "p_topic_detail".equals(str), moment, z, null);
        if (j760Var != null) {
            try {
                jSONObjectM17442H.put((String) j760Var.a, j760Var.b);
            } catch (JSONException e) {
                e.printStackTrace();
                CrashHelper.c(e);
            }
        }
        zvf0.t("e_moment_posted", str, jSONObjectM17442H);
    }

    /* JADX INFO: renamed from: r */
    public void m17461r(Moment moment, String str, Throwable th, boolean z, String str2) {
        m17460q(moment, str, vqg.m15491O(th), z, str2);
    }

    /* JADX INFO: renamed from: s */
    public void m17462s(Moment moment, String str, boolean z, boolean z2) {
        if (NullChecker.a(moment)) {
            p6j0.m12913c("e_send_message", str, j760.a("is_input", Integer.valueOf(z2 ? 1 : 0)), j760.a("moment_id", ((DbObject) moment).id), j760.a("is_match", Integer.valueOf(!z ? 1 : 0)), j760.a("owner_id", moment.owner));
        }
    }

    /* JADX INFO: renamed from: t */
    public void m17463t(Moment moment, String str, boolean z, boolean z2) {
        if (NullChecker.a(moment)) {
            p6j0.m12915e("e_send_message", str, j760.a("is_input", Integer.valueOf(z2 ? 1 : 0)), j760.a("moment_id", ((DbObject) moment).id), j760.a("is_match", Integer.valueOf(!z ? 1 : 0)), j760.a("owner_id", moment.owner));
        }
    }

    /* JADX INFO: renamed from: u */
    public String m17464u(boolean z) {
        return z ? MatchScData.ModuleId.mid_e_follow : "e_cancelfollow";
    }

    /* JADX INFO: renamed from: v */
    public j760[] m17465v(Moment moment, User user) {
        if (!NullChecker.a(moment)) {
            return new j760[0];
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new j760("owner_id", moment.owner));
        if (moment.isLive) {
            arrayList.add(new j760("liveId", moment.live.f228id));
            arrayList.add(new j760("anchorId", moment.live.anchor.f264id));
        } else {
            arrayList.add(new j760("moment_id", ((DbObject) moment).id));
        }
        if (NullChecker.a(user)) {
            arrayList.add(new j760("moment_user_id", ((DbObject) user).id));
        }
        arrayList.add(new j760("moment_type", moment.isLive ? "live" : m17436w().m17467y(moment)));
        arrayList.add(new j760("receiver_user_id", moment.owner));
        return (j760[]) arrayList.toArray(new j760[0]);
    }

    /* JADX INFO: renamed from: x */
    public final float m17466x(float... fArr) {
        float f = fArr[0];
        for (float f2 : fArr) {
            if (f2 < f) {
                f = f2;
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: y */
    public String m17467y(Moment moment) {
        if (!NullChecker.a(moment)) {
            return "";
        }
        if (moment.isVoiceLive && moment.momentVoiceLiveInfos != null) {
            return "audio_room";
        }
        if (u2h.m14719d() && moment.isLive) {
            Live live = moment.live;
            if (!(live.videoCapture instanceof Video)) {
                Media media = live.snapshot;
                if (!(media instanceof Video)) {
                    if (NullChecker.a(media) || NullChecker.a(moment.liveRoom)) {
                        return "photo";
                    }
                }
            }
            return "video";
        }
        if (vqg.m15514f0(moment)) {
            return moment.additionalData.share.name;
        }
        if (vqg.m15498V(moment)) {
            List<Media> list = moment.media;
            if (!NullChecker.a(list)) {
                return vqg.m15502Z(moment) ? "forwarding" : "word";
            }
            if (list.size() == 0) {
                return vqg.m15502Z(moment) ? "forwarding" : "word";
            }
            if (list.size() == 1 && (list.get(0) instanceof Picture)) {
                return "photo";
            }
        }
        if (!NullChecker.a(moment.media) || moment.media.size() <= 0) {
            return vqg.m15502Z(moment) ? "forwarding" : "word";
        }
        if (moment.media.get(0) instanceof Video) {
            return "video";
        }
        return moment.media.get(0) instanceof Audio ? "voice" : "photo";
    }

    /* JADX INFO: renamed from: z */
    public String m17468z(String str) {
        return m17467y(FeedModule.f316d.m16753w7(str));
    }

    /* JADX INFO: renamed from: g */
    public void m17450g(Moment moment, String str, boolean z, int i, boolean z2, int i2) {
    }

    /* JADX INFO: renamed from: k */
    public void m17454k(Moment moment, String str, int i, boolean z) {
    }

    /* JADX INFO: renamed from: q */
    public void m17460q(Moment moment, String str, int i, boolean z, String str2) {
    }
}
