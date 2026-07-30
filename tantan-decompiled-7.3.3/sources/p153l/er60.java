package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.ProfileLikeModuleType;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.TopicOperations;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes13.dex */
public class er60 {

    /* JADX INFO: renamed from: a */
    public static volatile er60 f95450a;

    /* JADX INFO: renamed from: b */
    public static boolean f95451b;

    /* JADX INFO: renamed from: B */
    public static pf60[] m122102B(String str, Moment moment, User user) {
        if (moment == null) {
            return null;
        }
        return new pf60[]{new pf60("moment_type", str), new pf60("moment_id", moment.f56859id), new pf60("owner_id", moment.owner), new pf60("receiver_user_id", moment.owner), new pf60("moments_user_id", NullChecker.m82486a(user) ? user.f56859id : "")};
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: D */
    public static String m122103D(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -2005618476:
                if (str.equals("from_no_topic_aggregation_list")) {
                    b = 0;
                }
                break;
            case -1960286679:
                if (str.equals("from_discover_discussion")) {
                    b = 1;
                }
                break;
            case -1811148390:
                if (str.equals("from_album")) {
                    b = 2;
                }
                break;
            case -1672308419:
                if (str.equals("from_activities_moment")) {
                    b = 3;
                }
                break;
            case -1636931156:
                if (str.equals("topic_recommend")) {
                    b = 4;
                }
                break;
            case -1634986454:
                if (str.equals("photo_album_activities")) {
                    b = 5;
                }
                break;
            case -1303853747:
                if (str.equals("qa_recommend")) {
                    b = 6;
                }
                break;
            case -1170904872:
                if (str.equals("from_qa_topic_aggregation")) {
                    b = 7;
                }
                break;
            case -1059699070:
                if (str.equals("my_tab")) {
                    b = 8;
                }
                break;
            case -1053905283:
                if (str.equals("from_topic_aggregation")) {
                    b = 9;
                }
                break;
            case -760789720:
                if (str.equals("from_topic_nearby_header")) {
                    b = 10;
                }
                break;
            case -440861164:
                if (str.equals("from_profile")) {
                    b = 11;
                }
                break;
            case -335846556:
                if (str.equals("p_live_moment")) {
                    b = 12;
                }
                break;
            case -256886399:
                if (str.equals("from_activity_tab_one")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case -256881305:
                if (str.equals("from_activity_tab_two")) {
                    b = 14;
                }
                break;
            case 3052376:
                if (str.equals("chat")) {
                    b = 15;
                }
                break;
            case 3452698:
                if (str.equals("push")) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
            case 16899343:
                if (str.equals("aggregate_page")) {
                    b = 17;
                }
                break;
            case 329784720:
                if (str.equals("from_nearby_falls_feed")) {
                    b = 18;
                }
                break;
            case 736159261:
                if (str.equals(OMSDialogPositon.p_chat_view)) {
                    b = 19;
                }
                break;
            case 768576662:
                if (str.equals("qa_latest")) {
                    b = 20;
                }
                break;
            case 842716100:
                if (str.equals("push_new_moment")) {
                    b = 21;
                }
                break;
            case 1010569813:
                if (str.equals("from_h5_topic_aggregation")) {
                    b = 22;
                }
                break;
            case 1094201196:
                if (str.equals("from_discover_dating")) {
                    b = 23;
                }
                break;
            case 1194876055:
                if (str.equals("topic_latest")) {
                    b = 24;
                }
                break;
            case 1225552344:
                if (str.equals("from_poi_aggregation")) {
                    b = 25;
                }
                break;
            case 1252285837:
                if (str.equals("from_nearby_focus")) {
                    b = 26;
                }
                break;
            case 1527525680:
                if (str.equals("from_topic_official")) {
                    b = 27;
                }
                break;
            case 2048605165:
                if (str.equals("activities")) {
                    b = 28;
                }
                break;
        }
        switch (b) {
            case 0:
            case 7:
            case 9:
            case 10:
            case 22:
            case 27:
                return "topic_detail";
            case 1:
                return "p_discover_discussion";
            case 2:
            case 8:
            case 11:
                return ProfileLikeModuleType.album;
            case 3:
            case 5:
            case 28:
                return "activity";
            case 4:
                return "topic_recommend";
            case 6:
                return "qa_recommend";
            case 12:
                return "p_live_moment";
            case 13:
                return pu20.m173809d("from_activity_tab_one");
            case 14:
                return pu20.m173809d("from_activity_tab_two");
            case 15:
                return "chat";
            case 16:
            case 21:
                return "push";
            case 17:
                return "music";
            case 18:
                return "nearby";
            case 19:
                return "chat";
            case 20:
                return "qa_latest";
            case 23:
                return "p_discover_dating";
            case 24:
                return "topic_latest";
            case 25:
                return "p_poi_detail";
            case 26:
                return "p_follow";
            default:
                return "other";
        }
    }

    /* JADX INFO: renamed from: w */
    public static er60 m122104w() {
        if (f95450a == null) {
            synchronized (er60.class) {
                try {
                    if (f95450a == null) {
                        f95450a = new er60();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f95450a;
    }

    /* JADX INFO: renamed from: A */
    public final String m122105A() {
        TopicOperations topicOperations = FeedModule.f39703d.f121301H1;
        return (NullChecker.m82486a(topicOperations) && NullChecker.m82486a(topicOperations.publishGuide)) ? topicOperations.publishGuide.momentValue : "";
    }

    /* JADX INFO: renamed from: C */
    public final String m122106C(Picture picture) {
        Dimension dimension;
        if (picture != null && (dimension = picture.size) != null) {
            int i = dimension.width;
            int i2 = dimension.height;
            if (i > 0 && i2 > 0) {
                float fM105592y0 = bnl0.m105592y0() / bnl0.m105588w0();
                float f = i / i2;
                float fAbs = Math.abs(f - 1.0f);
                float fAbs2 = Math.abs(f - 0.75f);
                float fAbs3 = Math.abs(f - 0.5625f);
                float fM122134x = m122134x(fAbs, fAbs2, fAbs3, Math.abs(f - fM105592y0));
                if (fM122134x == fAbs) {
                    return "1.1";
                }
                if (fM122134x == fAbs2) {
                    return "3.4";
                }
                return fM122134x == fAbs3 ? "9.16" : "full";
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: E */
    public String m122107E(TopicMoment topicMoment) {
        return NullChecker.m82486a(topicMoment) ? m122108F(topicMoment.topicType) : "";
    }

    /* JADX INFO: renamed from: F */
    public String m122108F(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.equals(Link.TYPE) ? "H5" : str;
    }

    /* JADX INFO: renamed from: G */
    public String m122109G(Moment moment) {
        return (moment == null || TextUtils.isEmpty(moment.owner) || FeedModule.f39703d.m145829y7(moment.owner) == null) ? "0" : "1";
    }

    /* JADX INFO: renamed from: H */
    public final JSONObject m122110H(ArrayList<Media> arrayList, int i, int i2, boolean z, Moment moment, boolean z2, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        boolean zM147479J = jyb.m147479J(moment.topics);
        boolean z3 = !zM147479J;
        try {
            jSONObject.put("code", String.valueOf(i));
            jSONObject.put("is_from_photo_to_video", z2);
            jSONObject.put("is_anonymous", i2);
            jSONObject.put("moment_id", moment.f56859id);
            jSONObject.put("have_message", !TextUtils.isEmpty(moment.value));
            jSONObject.put("is_topic", z3);
            jSONObject.put("topic_id", !zM147479J ? moment.topics.get(0).f39672id : "");
            String str = moment.from;
            if (str == null) {
                str = "";
            }
            jSONObject.put("posted_source", str);
            if (moment.isNewUserAIMoment) {
                jSONObject.put("newuser_checkin_change_content", TextUtils.equals(m122105A(), moment.value) ? "0" : "1");
            }
            if (NullChecker.m82486a(map)) {
                Set<String> setKeySet = map.keySet();
                if (NullChecker.m82486a(setKeySet) && !setKeySet.isEmpty()) {
                    for (String str2 : setKeySet) {
                        jSONObject.put(str2, map.get(str2));
                    }
                }
            }
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        if (!z) {
            if (jyb.m147479J(arrayList)) {
                try {
                    jSONObject.put("moment_type", "word");
                } catch (JSONException e2) {
                    CrashHelper.m82479c(e2);
                }
            }
            int size = arrayList != null ? arrayList.size() : 0;
            for (int i3 = 0; i3 < size; i3++) {
                Media media = arrayList.get(i3);
                if (NullChecker.m82486a(media.meta) && TextUtils.isEmpty(media.meta.proportion)) {
                    String strM122106C = media instanceof Video ? m122106C(((Video) media).cover) : "";
                    if (media instanceof Picture) {
                        strM122106C = m122106C((Picture) media);
                    }
                    media.meta.proportion = strM122106C;
                }
            }
            arrayList.get(0).newBuildMediaLogParmas(jSONObject);
            return jSONObject;
        }
        try {
            jSONObject.put("moment_type", "qa");
        } catch (JSONException e3) {
            CrashHelper.m82479c(e3);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: I */
    public void m122111I(boolean z, String str) {
        if (TextUtils.equals("p_moment_post", str)) {
            tfj0.m190939b("e_set_my_state_post", "p_moment_post", new tfj0.C20302a[0]);
        }
        i4g0.m138493B("p_set_my_state_post", "", jyb.m147494Y("post_success", Integer.valueOf(z ? 1 : 0)));
    }

    /* JADX INFO: renamed from: a */
    public void m122112a(TopicMoment topicMoment, String str) {
        m122113b(topicMoment, str, null);
    }

    /* JADX INFO: renamed from: b */
    public void m122113b(TopicMoment topicMoment, String str, pf60 pf60Var) {
        pf60 pf60VarM172085a = pf60.m172085a("topic_id", topicMoment.f40095id);
        pf60 pf60VarM172085a2 = pf60.m172085a("is_create", Boolean.valueOf(topicMoment.owner.f39607id.equals(FeedModule.m61405F().userId())));
        pf60 pf60VarM172085a3 = pf60.m172085a("topic_type", m122107E(topicMoment));
        if (pf60Var == null) {
            tfj0.m190940c("e_topic", str, ksg.m151210j(str, pf60VarM172085a, pf60VarM172085a2, pf60VarM172085a3));
        } else {
            tfj0.m190940c("e_topic", str, ksg.m151210j(str, pf60VarM172085a, pf60VarM172085a2, pf60VarM172085a3, pf60Var));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m122114c(TopicMoment topicMoment, String str) {
        m122115d(topicMoment, str, null);
    }

    /* JADX INFO: renamed from: d */
    public void m122115d(TopicMoment topicMoment, String str, pf60 pf60Var) {
        pf60 pf60VarM172085a = pf60.m172085a("topic_id", topicMoment.f40095id);
        pf60 pf60VarM172085a2 = pf60.m172085a("is_create", Boolean.valueOf(topicMoment.owner.f39607id.equals(FeedModule.m61405F().userId())));
        pf60 pf60VarM172085a3 = pf60.m172085a("topic_type", m122107E(topicMoment));
        if (pf60Var == null) {
            tfj0.m190942e("e_topic", str, ksg.m151210j(str, pf60VarM172085a, pf60VarM172085a2, pf60VarM172085a3));
        } else {
            tfj0.m190942e("e_topic", str, ksg.m151210j(str, pf60VarM172085a, pf60VarM172085a2, pf60VarM172085a3, pf60Var));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m122116e(Moment moment, MomentMessage momentMessage) {
        if (NullChecker.m82486a(moment)) {
            tfj0.m190940c("e_moment_comment_pic", "p_immersion_comment_page", pf60.m172085a("moment_id", moment.f56859id), pf60.m172085a("comment_user_id", momentMessage.owner), pf60.m172085a("is_masked", Integer.valueOf(moment.isAnonymousMoment() ? 1 : 0)));
        }
    }

    /* JADX INFO: renamed from: f */
    public void m122117f(Moment moment, String str, boolean z, int i, boolean z2) {
        m122118g(moment, str, z, i, z2, -1);
    }

    /* JADX INFO: renamed from: h */
    public void m122119h(Moment moment, String str, boolean z, Throwable th, boolean z2) {
        m122117f(moment, str, z, ksg.m151180O(th), z2);
    }

    /* JADX INFO: renamed from: i */
    public void m122120i(Moment moment, String str, boolean z, Throwable th, boolean z2, int i) {
        m122118g(moment, str, z, ksg.m151180O(th), z2, i);
    }

    /* JADX INFO: renamed from: j */
    public void m122121j(Moment moment, MomentMessage momentMessage) {
        if (NullChecker.m82486a(moment)) {
            tfj0.m190940c("e_moment_comment_pic", "p_user_moment_interactions_details_view", pf60.m172085a("moment_id", moment.f56859id), pf60.m172085a("comment_user_id", momentMessage.owner), pf60.m172085a("is_masked", Integer.valueOf(moment.isAnonymousMoment() ? 1 : 0)));
        }
    }

    /* JADX INFO: renamed from: l */
    public void m122123l(Moment moment, String str, Throwable th, boolean z) {
        m122122k(moment, str, ksg.m151180O(th), z);
    }

    /* JADX INFO: renamed from: m */
    public void m122124m(Moment moment, String str, boolean z) {
        String strM151176L = ksg.m151176L(str, z);
        if (TextUtils.isEmpty(strM151176L)) {
            return;
        }
        tfj0.m190940c("e_moment_user_pic", strM151176L, ksg.m151208i(str, pf60.m172085a("moment_id", moment.f56859id), pf60.m172085a("owner_id", moment.owner), pf60.m172085a("is_state", m122109G(moment)), pf60.m172085a("is_masked", Integer.valueOf(moment.isAnonymousMoment() ? 1 : 0))));
    }

    /* JADX INFO: renamed from: n */
    public void m122125n(Moment moment, String str, int i, boolean z, Map<String, Object> map) {
        if (moment == null || f95451b) {
            f95451b = false;
            return;
        }
        ArrayList<Media> arrayList = (ArrayList) moment.media;
        boolean zM100010d = at0.m100010d(moment);
        i4g0.m138522t("e_moment_posted", str, m122110H(arrayList, i, zM100010d ? 1 : 0, "p_topic_detail".equals(str), moment, z, map));
    }

    /* JADX INFO: renamed from: o */
    public void m122126o(Moment moment, String str, Throwable th, boolean z, Map<String, Object> map) {
        if (moment == null || f95451b) {
            f95451b = false;
            return;
        }
        ArrayList<Media> arrayList = (ArrayList) moment.media;
        int iM151180O = ksg.m151180O(th);
        boolean zM100010d = at0.m100010d(moment);
        i4g0.m138522t("e_moment_posted", str, m122110H(arrayList, iM151180O, zM100010d ? 1 : 0, "p_topic_detail".equals(str), moment, z, map));
    }

    /* JADX INFO: renamed from: p */
    public void m122127p(Moment moment, String str, int i, boolean z, pf60<String, String> pf60Var) {
        if (moment == null) {
            return;
        }
        ArrayList<Media> arrayList = (ArrayList) moment.media;
        boolean zM100010d = at0.m100010d(moment);
        JSONObject jSONObjectM122110H = m122110H(arrayList, i, zM100010d ? 1 : 0, "p_topic_detail".equals(str), moment, z, null);
        if (pf60Var != null) {
            try {
                jSONObjectM122110H.put(pf60Var.f152156a, pf60Var.f152157b);
            } catch (JSONException e) {
                e.printStackTrace();
                CrashHelper.m82479c(e);
            }
        }
        i4g0.m138522t("e_moment_posted", str, jSONObjectM122110H);
    }

    /* JADX INFO: renamed from: r */
    public void m122129r(Moment moment, String str, Throwable th, boolean z, String str2) {
        m122128q(moment, str, ksg.m151180O(th), z, str2);
    }

    /* JADX INFO: renamed from: s */
    public void m122130s(Moment moment, String str, boolean z, boolean z2) {
        if (NullChecker.m82486a(moment)) {
            tfj0.m190940c("e_send_message", str, pf60.m172085a("is_input", Integer.valueOf(z2 ? 1 : 0)), pf60.m172085a("moment_id", moment.f56859id), pf60.m172085a("is_match", Integer.valueOf(!z ? 1 : 0)), pf60.m172085a("owner_id", moment.owner));
        }
    }

    /* JADX INFO: renamed from: t */
    public void m122131t(Moment moment, String str, boolean z, boolean z2) {
        if (NullChecker.m82486a(moment)) {
            tfj0.m190942e("e_send_message", str, pf60.m172085a("is_input", Integer.valueOf(z2 ? 1 : 0)), pf60.m172085a("moment_id", moment.f56859id), pf60.m172085a("is_match", Integer.valueOf(!z ? 1 : 0)), pf60.m172085a("owner_id", moment.owner));
        }
    }

    /* JADX INFO: renamed from: u */
    public String m122132u(boolean z) {
        return z ? MatchScData.ModuleId.mid_e_follow : "e_cancelfollow";
    }

    /* JADX INFO: renamed from: v */
    public pf60[] m122133v(Moment moment, User user) {
        if (!NullChecker.m82486a(moment)) {
            return new pf60[0];
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new pf60("owner_id", moment.owner));
        if (moment.isLive) {
            arrayList.add(new pf60("liveId", moment.live.f39615id));
            arrayList.add(new pf60("anchorId", moment.live.anchor.f39651id));
        } else {
            arrayList.add(new pf60("moment_id", moment.f56859id));
        }
        if (NullChecker.m82486a(user)) {
            arrayList.add(new pf60("moment_user_id", user.f56859id));
        }
        arrayList.add(new pf60("moment_type", moment.isLive ? "live" : m122104w().m122135y(moment)));
        arrayList.add(new pf60("receiver_user_id", moment.owner));
        return (pf60[]) arrayList.toArray(new pf60[0]);
    }

    /* JADX INFO: renamed from: x */
    public final float m122134x(float... fArr) {
        float f = fArr[0];
        for (float f2 : fArr) {
            if (f2 < f) {
                f = f2;
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: y */
    public String m122135y(Moment moment) {
        if (!NullChecker.m82486a(moment)) {
            return "";
        }
        if (moment.isVoiceLive && moment.momentVoiceLiveInfos != null) {
            return "audio_room";
        }
        if (j4h.m143420d() && moment.isLive) {
            Live live = moment.live;
            if (!(live.videoCapture instanceof Video)) {
                Media media = live.snapshot;
                if (!(media instanceof Video)) {
                    if (NullChecker.m82486a(media) || NullChecker.m82486a(moment.liveRoom)) {
                        return ReminderAction.photo;
                    }
                }
            }
            return "video";
        }
        if (ksg.m151203f0(moment)) {
            return moment.additionalData.share.name;
        }
        if (ksg.m151187V(moment)) {
            List<Media> list = moment.media;
            if (!NullChecker.m82486a(list)) {
                return ksg.m151191Z(moment) ? "forwarding" : "word";
            }
            if (list.size() == 0) {
                return ksg.m151191Z(moment) ? "forwarding" : "word";
            }
            if (list.size() == 1 && (list.get(0) instanceof Picture)) {
                return ReminderAction.photo;
            }
        }
        if (!NullChecker.m82486a(moment.media) || moment.media.size() <= 0) {
            return ksg.m151191Z(moment) ? "forwarding" : "word";
        }
        if (moment.media.get(0) instanceof Video) {
            return "video";
        }
        return moment.media.get(0) instanceof Audio ? "voice" : ReminderAction.photo;
    }

    /* JADX INFO: renamed from: z */
    public String m122136z(String str) {
        return m122135y(FeedModule.f39703d.m145813w7(str));
    }

    /* JADX INFO: renamed from: g */
    public void m122118g(Moment moment, String str, boolean z, int i, boolean z2, int i2) {
    }

    /* JADX INFO: renamed from: k */
    public void m122122k(Moment moment, String str, int i, boolean z) {
    }

    /* JADX INFO: renamed from: q */
    public void m122128q(Moment moment, String str, int i, boolean z, String str2) {
    }
}
