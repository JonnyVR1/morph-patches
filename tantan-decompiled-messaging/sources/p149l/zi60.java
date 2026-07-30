package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.ProfileLikeModuleType;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.TopicOperations;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.wcdb.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes12.dex */
public class zi60 {

    /* JADX INFO: renamed from: a */
    public static volatile zi60 f203296a;

    /* JADX INFO: renamed from: b */
    public static boolean f203297b;

    /* JADX INFO: renamed from: B */
    public static j760[] m218959B(String str, Moment moment, User user) {
        if (moment == null) {
            return null;
        }
        return new j760[]{new j760("moment_type", str), new j760("moment_id", moment.f56011id), new j760("owner_id", moment.owner), new j760("receiver_user_id", moment.owner), new j760("moments_user_id", NullChecker.m81303a(user) ? user.f56011id : "")};
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: D */
    public static String m218960D(String str) {
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
                return fm20.m122121d("from_activity_tab_one");
            case 14:
                return fm20.m122121d("from_activity_tab_two");
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
    public static zi60 m218961w() {
        if (f203296a == null) {
            synchronized (zi60.class) {
                try {
                    if (f203296a == null) {
                        f203296a = new zi60();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f203296a;
    }

    /* JADX INFO: renamed from: A */
    public final String m218962A() {
        TopicOperations topicOperations = FeedModule.f38855d.f192991H1;
        return (NullChecker.m81303a(topicOperations) && NullChecker.m81303a(topicOperations.publishGuide)) ? topicOperations.publishGuide.momentValue : "";
    }

    /* JADX INFO: renamed from: C */
    public final String m218963C(Picture picture) {
        Dimension dimension;
        if (picture != null && (dimension = picture.size) != null) {
            int i = dimension.width;
            int i2 = dimension.height;
            if (i > 0 && i2 > 0) {
                float fM208412y0 = xdl0.m208412y0() / xdl0.m208408w0();
                float f = i / i2;
                float fAbs = Math.abs(f - 1.0f);
                float fAbs2 = Math.abs(f - 0.75f);
                float fAbs3 = Math.abs(f - 0.5625f);
                float fM218991x = m218991x(fAbs, fAbs2, fAbs3, Math.abs(f - fM208412y0));
                if (fM218991x == fAbs) {
                    return BuildConfig.VERSION_NAME;
                }
                if (fM218991x == fAbs2) {
                    return "3.4";
                }
                return fM218991x == fAbs3 ? "9.16" : "full";
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: E */
    public String m218964E(TopicMoment topicMoment) {
        return NullChecker.m81303a(topicMoment) ? m218965F(topicMoment.topicType) : "";
    }

    /* JADX INFO: renamed from: F */
    public String m218965F(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.equals(Link.TYPE) ? "H5" : str;
    }

    /* JADX INFO: renamed from: G */
    public String m218966G(Moment moment) {
        return (moment == null || TextUtils.isEmpty(moment.owner) || FeedModule.f38855d.m209588y7(moment.owner) == null) ? "0" : "1";
    }

    /* JADX INFO: renamed from: H */
    public final JSONObject m218967H(ArrayList<Media> arrayList, int i, int i2, boolean z, Moment moment, boolean z2, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        boolean zM200296J = vwb.m200296J(moment.topics);
        boolean z3 = !zM200296J;
        try {
            jSONObject.put("code", String.valueOf(i));
            jSONObject.put("is_from_photo_to_video", z2);
            jSONObject.put("is_anonymous", i2);
            jSONObject.put("moment_id", moment.f56011id);
            jSONObject.put("have_message", !TextUtils.isEmpty(moment.value));
            jSONObject.put("is_topic", z3);
            jSONObject.put("topic_id", !zM200296J ? moment.topics.get(0).f38824id : "");
            String str = moment.from;
            if (str == null) {
                str = "";
            }
            jSONObject.put("posted_source", str);
            if (moment.isNewUserAIMoment) {
                jSONObject.put("newuser_checkin_change_content", TextUtils.equals(m218962A(), moment.value) ? "0" : "1");
            }
            if (NullChecker.m81303a(map)) {
                Set<String> setKeySet = map.keySet();
                if (NullChecker.m81303a(setKeySet) && !setKeySet.isEmpty()) {
                    for (String str2 : setKeySet) {
                        jSONObject.put(str2, map.get(str2));
                    }
                }
            }
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        if (!z) {
            if (vwb.m200296J(arrayList)) {
                try {
                    jSONObject.put("moment_type", "word");
                } catch (JSONException e2) {
                    CrashHelper.m81296c(e2);
                }
            }
            int size = arrayList != null ? arrayList.size() : 0;
            for (int i3 = 0; i3 < size; i3++) {
                Media media = arrayList.get(i3);
                if (NullChecker.m81303a(media.meta) && TextUtils.isEmpty(media.meta.proportion)) {
                    String strM218963C = media instanceof Video ? m218963C(((Video) media).cover) : "";
                    if (media instanceof Picture) {
                        strM218963C = m218963C((Picture) media);
                    }
                    media.meta.proportion = strM218963C;
                }
            }
            arrayList.get(0).newBuildMediaLogParmas(jSONObject);
            return jSONObject;
        }
        try {
            jSONObject.put("moment_type", "qa");
        } catch (JSONException e3) {
            CrashHelper.m81296c(e3);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: I */
    public void m218968I(boolean z, String str) {
        if (TextUtils.equals("p_moment_post", str)) {
            p6j0.m167668b("e_set_my_state_post", "p_moment_post", new p6j0.C19147a[0]);
        }
        zvf0.m220369B("p_set_my_state_post", "", vwb.m200311Y("post_success", Integer.valueOf(z ? 1 : 0)));
    }

    /* JADX INFO: renamed from: a */
    public void m218969a(TopicMoment topicMoment, String str) {
        m218970b(topicMoment, str, null);
    }

    /* JADX INFO: renamed from: b */
    public void m218970b(TopicMoment topicMoment, String str, j760 j760Var) {
        j760 j760VarM140076a = j760.m140076a("topic_id", topicMoment.f39247id);
        j760 j760VarM140076a2 = j760.m140076a("is_create", Boolean.valueOf(topicMoment.owner.f38759id.equals(FeedModule.m60221F().userId())));
        j760 j760VarM140076a3 = j760.m140076a("topic_type", m218964E(topicMoment));
        if (j760Var == null) {
            p6j0.m167669c("e_topic", str, vqg.m199551j(str, j760VarM140076a, j760VarM140076a2, j760VarM140076a3));
        } else {
            p6j0.m167669c("e_topic", str, vqg.m199551j(str, j760VarM140076a, j760VarM140076a2, j760VarM140076a3, j760Var));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m218971c(TopicMoment topicMoment, String str) {
        m218972d(topicMoment, str, null);
    }

    /* JADX INFO: renamed from: d */
    public void m218972d(TopicMoment topicMoment, String str, j760 j760Var) {
        j760 j760VarM140076a = j760.m140076a("topic_id", topicMoment.f39247id);
        j760 j760VarM140076a2 = j760.m140076a("is_create", Boolean.valueOf(topicMoment.owner.f38759id.equals(FeedModule.m60221F().userId())));
        j760 j760VarM140076a3 = j760.m140076a("topic_type", m218964E(topicMoment));
        if (j760Var == null) {
            p6j0.m167671e("e_topic", str, vqg.m199551j(str, j760VarM140076a, j760VarM140076a2, j760VarM140076a3));
        } else {
            p6j0.m167671e("e_topic", str, vqg.m199551j(str, j760VarM140076a, j760VarM140076a2, j760VarM140076a3, j760Var));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m218973e(Moment moment, MomentMessage momentMessage) {
        if (NullChecker.m81303a(moment)) {
            p6j0.m167669c("e_moment_comment_pic", "p_immersion_comment_page", j760.m140076a("moment_id", moment.f56011id), j760.m140076a("comment_user_id", momentMessage.owner), j760.m140076a("is_masked", Integer.valueOf(moment.isAnonymousMoment() ? 1 : 0)));
        }
    }

    /* JADX INFO: renamed from: f */
    public void m218974f(Moment moment, String str, boolean z, int i, boolean z2) {
        m218975g(moment, str, z, i, z2, -1);
    }

    /* JADX INFO: renamed from: h */
    public void m218976h(Moment moment, String str, boolean z, Throwable th, boolean z2) {
        m218974f(moment, str, z, vqg.m199521O(th), z2);
    }

    /* JADX INFO: renamed from: i */
    public void m218977i(Moment moment, String str, boolean z, Throwable th, boolean z2, int i) {
        m218975g(moment, str, z, vqg.m199521O(th), z2, i);
    }

    /* JADX INFO: renamed from: j */
    public void m218978j(Moment moment, MomentMessage momentMessage) {
        if (NullChecker.m81303a(moment)) {
            p6j0.m167669c("e_moment_comment_pic", "p_user_moment_interactions_details_view", j760.m140076a("moment_id", moment.f56011id), j760.m140076a("comment_user_id", momentMessage.owner), j760.m140076a("is_masked", Integer.valueOf(moment.isAnonymousMoment() ? 1 : 0)));
        }
    }

    /* JADX INFO: renamed from: l */
    public void m218980l(Moment moment, String str, Throwable th, boolean z) {
        m218979k(moment, str, vqg.m199521O(th), z);
    }

    /* JADX INFO: renamed from: m */
    public void m218981m(Moment moment, String str, boolean z) {
        String strM199517L = vqg.m199517L(str, z);
        if (TextUtils.isEmpty(strM199517L)) {
            return;
        }
        p6j0.m167669c("e_moment_user_pic", strM199517L, vqg.m199549i(str, j760.m140076a("moment_id", moment.f56011id), j760.m140076a("owner_id", moment.owner), j760.m140076a("is_state", m218966G(moment)), j760.m140076a("is_masked", Integer.valueOf(moment.isAnonymousMoment() ? 1 : 0))));
    }

    /* JADX INFO: renamed from: n */
    public void m218982n(Moment moment, String str, int i, boolean z, Map<String, Object> map) {
        if (moment == null || f203297b) {
            f203297b = false;
            return;
        }
        ArrayList<Media> arrayList = (ArrayList) moment.media;
        boolean zM199798d = vs0.m199798d(moment);
        zvf0.m220398t("e_moment_posted", str, m218967H(arrayList, i, zM199798d ? 1 : 0, "p_topic_detail".equals(str), moment, z, map));
    }

    /* JADX INFO: renamed from: o */
    public void m218983o(Moment moment, String str, Throwable th, boolean z, Map<String, Object> map) {
        if (moment == null || f203297b) {
            f203297b = false;
            return;
        }
        ArrayList<Media> arrayList = (ArrayList) moment.media;
        int iM199521O = vqg.m199521O(th);
        boolean zM199798d = vs0.m199798d(moment);
        zvf0.m220398t("e_moment_posted", str, m218967H(arrayList, iM199521O, zM199798d ? 1 : 0, "p_topic_detail".equals(str), moment, z, map));
    }

    /* JADX INFO: renamed from: p */
    public void m218984p(Moment moment, String str, int i, boolean z, j760<String, String> j760Var) {
        if (moment == null) {
            return;
        }
        ArrayList<Media> arrayList = (ArrayList) moment.media;
        boolean zM199798d = vs0.m199798d(moment);
        JSONObject jSONObjectM218967H = m218967H(arrayList, i, zM199798d ? 1 : 0, "p_topic_detail".equals(str), moment, z, null);
        if (j760Var != null) {
            try {
                jSONObjectM218967H.put(j760Var.f116564a, j760Var.f116565b);
            } catch (JSONException e) {
                e.printStackTrace();
                CrashHelper.m81296c(e);
            }
        }
        zvf0.m220398t("e_moment_posted", str, jSONObjectM218967H);
    }

    /* JADX INFO: renamed from: r */
    public void m218986r(Moment moment, String str, Throwable th, boolean z, String str2) {
        m218985q(moment, str, vqg.m199521O(th), z, str2);
    }

    /* JADX INFO: renamed from: s */
    public void m218987s(Moment moment, String str, boolean z, boolean z2) {
        if (NullChecker.m81303a(moment)) {
            p6j0.m167669c("e_send_message", str, j760.m140076a("is_input", Integer.valueOf(z2 ? 1 : 0)), j760.m140076a("moment_id", moment.f56011id), j760.m140076a("is_match", Integer.valueOf(!z ? 1 : 0)), j760.m140076a("owner_id", moment.owner));
        }
    }

    /* JADX INFO: renamed from: t */
    public void m218988t(Moment moment, String str, boolean z, boolean z2) {
        if (NullChecker.m81303a(moment)) {
            p6j0.m167671e("e_send_message", str, j760.m140076a("is_input", Integer.valueOf(z2 ? 1 : 0)), j760.m140076a("moment_id", moment.f56011id), j760.m140076a("is_match", Integer.valueOf(!z ? 1 : 0)), j760.m140076a("owner_id", moment.owner));
        }
    }

    /* JADX INFO: renamed from: u */
    public String m218989u(boolean z) {
        return z ? MatchScData.ModuleId.mid_e_follow : "e_cancelfollow";
    }

    /* JADX INFO: renamed from: v */
    public j760[] m218990v(Moment moment, User user) {
        if (!NullChecker.m81303a(moment)) {
            return new j760[0];
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new j760("owner_id", moment.owner));
        if (moment.isLive) {
            arrayList.add(new j760("liveId", moment.live.f38767id));
            arrayList.add(new j760("anchorId", moment.live.anchor.f38803id));
        } else {
            arrayList.add(new j760("moment_id", moment.f56011id));
        }
        if (NullChecker.m81303a(user)) {
            arrayList.add(new j760("moment_user_id", user.f56011id));
        }
        arrayList.add(new j760("moment_type", moment.isLive ? "live" : m218961w().m218992y(moment)));
        arrayList.add(new j760("receiver_user_id", moment.owner));
        return (j760[]) arrayList.toArray(new j760[0]);
    }

    /* JADX INFO: renamed from: x */
    public final float m218991x(float... fArr) {
        float f = fArr[0];
        for (float f2 : fArr) {
            if (f2 < f) {
                f = f2;
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: y */
    public String m218992y(Moment moment) {
        if (!NullChecker.m81303a(moment)) {
            return "";
        }
        if (moment.isVoiceLive && moment.momentVoiceLiveInfos != null) {
            return "audio_room";
        }
        if (u2h.m191495d() && moment.isLive) {
            Live live = moment.live;
            if (!(live.videoCapture instanceof Video)) {
                Media media = live.snapshot;
                if (!(media instanceof Video)) {
                    if (NullChecker.m81303a(media) || NullChecker.m81303a(moment.liveRoom)) {
                        return ReminderAction.photo;
                    }
                }
            }
            return "video";
        }
        if (vqg.m199544f0(moment)) {
            return moment.additionalData.share.name;
        }
        if (vqg.m199528V(moment)) {
            List<Media> list = moment.media;
            if (!NullChecker.m81303a(list)) {
                return vqg.m199532Z(moment) ? "forwarding" : "word";
            }
            if (list.size() == 0) {
                return vqg.m199532Z(moment) ? "forwarding" : "word";
            }
            if (list.size() == 1 && (list.get(0) instanceof Picture)) {
                return ReminderAction.photo;
            }
        }
        if (!NullChecker.m81303a(moment.media) || moment.media.size() <= 0) {
            return vqg.m199532Z(moment) ? "forwarding" : "word";
        }
        if (moment.media.get(0) instanceof Video) {
            return "video";
        }
        return moment.media.get(0) instanceof Audio ? "voice" : ReminderAction.photo;
    }

    /* JADX INFO: renamed from: z */
    public String m218993z(String str) {
        return m218992y(FeedModule.f38855d.m209572w7(str));
    }

    /* JADX INFO: renamed from: g */
    public void m218975g(Moment moment, String str, boolean z, int i, boolean z2, int i2) {
    }

    /* JADX INFO: renamed from: k */
    public void m218979k(Moment moment, String str, int i, boolean z) {
    }

    /* JADX INFO: renamed from: q */
    public void m218985q(Moment moment, String str, int i, boolean z, String str2) {
    }
}
