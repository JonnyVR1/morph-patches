package p153l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.Detect;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.DetectRequest;
import com.p051p1.mobile.putong.data.DetectText;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.MomentType;
import com.p051p1.mobile.putong.data.Moments;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentAdditionalData;
import com.p051p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p051p1.mobile.putong.feed.data.MomentShareInfo;
import com.p051p1.mobile.putong.feed.data.StateEmotion;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.helper.exception.FeedStateEmotionNullException;
import com.p051p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.immersionvideo.ImmersionVideoMomentDetailAct;
import com.p051p1.mobile.putong.feed.newui.preview.forward.ForwardVideoMomentAct;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p051p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p051p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class ksg {

    /* JADX INFO: renamed from: a */
    public static int f128560a = 0;

    /* JADX INFO: renamed from: b */
    public static int f128561b = 60;

    /* JADX INFO: renamed from: c */
    public static int f128562c = 600;

    /* JADX INFO: renamed from: d */
    public static int f128563d = 3600;

    /* JADX INFO: renamed from: e */
    public static int f128564e = 21600;

    /* JADX INFO: renamed from: f */
    public static int f128565f = 86400;

    /* JADX INFO: renamed from: g */
    public static int f128566g = 172800;

    /* JADX INFO: renamed from: h */
    public static int f128567h = 518400;

    /* JADX INFO: renamed from: i */
    public static List<String> f128568i = new ArrayList();

    /* JADX INFO: renamed from: l.ksg$a */
    public class ViewOnClickListenerC18250a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public long f128569a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View.OnClickListener f128570b;

        public ViewOnClickListenerC18250a(View.OnClickListener onClickListener) {
            this.f128570b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SystemClock.uptimeMillis() - this.f128569a > 2000) {
                this.f128569a = SystemClock.uptimeMillis();
                this.f128570b.onClick(view);
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static Moment m151154A(String str) {
        Moment momentM145813w7 = FeedModule.f39703d.m145813w7(str);
        if (momentM145813w7 == null || jyb.m147479J(momentM145813w7.media) || !(momentM145813w7.media.get(0) instanceof Video)) {
            return null;
        }
        return momentM145813w7;
    }

    /* JADX INFO: renamed from: A0 */
    public static String m151155A0(User user) {
        String strM175811p;
        CharSequence charSequenceM175788T;
        if (mrb0.m159669w(user)) {
            charSequenceM175788T = "";
        } else {
            boolean zEquals = user.f56859id.equals(FeedModule.m61405F().userId());
            Location location = user.location;
            if (zEquals) {
                strM175811p = q8g0.m175811p(location.distance, true);
                if (strM175811p.equals(q8g0.m175811p(0, true))) {
                    charSequenceM175788T = strM175811p;
                    charSequenceM175788T = "1" + FeedModule.f39700a.getString(R$string.f39713A3);
                }
            } else {
                charSequenceM175788T = q8g0.m175788T(location, false, null, true);
            }
        }
        charSequenceM175788T = strM175811p;
        return charSequenceM175788T.toString();
    }

    /* JADX INFO: renamed from: B */
    public static void m151156B(Act act, final String str, final y20<Boolean> y20Var) {
        if (NullChecker.m82486a(jyb.m147529r(f128568i, new qcj() { // from class: l.csg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, str));
            }
        }))) {
            y20Var.call(Boolean.FALSE);
            return;
        }
        User userM145688e8 = FeedModule.f39703d.m145688e8(str);
        if (userM145688e8 == null || userM145688e8.isBannedNew() || userM145688e8.isJailed() || userM145688e8.isMe() || User.isWisdomStar(userM145688e8.f56859id)) {
            y20Var.call(Boolean.FALSE);
        } else {
            FeedModule.m61406H().mo31830ur(act, str, new y20() { // from class: l.dsg
                @Override // p153l.y20
                public final void call(Object obj) {
                    y20Var.call((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static String m151157B0(User user) {
        if (user == null) {
            return "";
        }
        return (mrb0.m159669w(user) ? "" : q8g0.m175791W(user.location)).toString();
    }

    /* JADX INFO: renamed from: C */
    public static String m151158C(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str + ",moment_greet";
    }

    /* JADX INFO: renamed from: C0 */
    public static String m151159C0(double d) {
        boolean z = App.f16085b;
        Calendar calendar = Calendar.getInstance();
        long j = (long) d;
        calendar.setTimeInMillis(j);
        StringBuilder sb = new StringBuilder();
        if (calendar.get(1) <= 1970) {
            return "1秒以前推荐";
        }
        long jM174454o = (pzi0.m174454o() - j) / 1000;
        if (jM174454o > 31536000) {
            sb.append((int) (jM174454o / 31536000));
            sb.append("年以前推荐");
        } else if (jM174454o > 2592000) {
            sb.append((int) (jM174454o / 2592000));
            sb.append("个月以前推荐");
        } else if (jM174454o > 604800) {
            sb.append((int) (jM174454o / 604800));
            sb.append("周以前推荐");
        } else if (jM174454o > 86400) {
            sb.append((int) (jM174454o / 86400));
            sb.append("天以前推荐");
        } else if (jM174454o > 3600) {
            sb.append((int) (jM174454o / 3600));
            sb.append("小时以前推荐");
        } else if (jM174454o >= 60) {
            sb.append((int) (jM174454o / 60));
            sb.append("分钟以前推荐");
        } else {
            if (jM174454o <= 0) {
                return "1秒以前推荐";
            }
            sb.append((int) jM174454o);
            sb.append("秒以前推荐");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: D */
    public static boolean m151160D() {
        User userMe_ = FeedModule.m61406H().me_();
        String str = (NullChecker.m82486a(userMe_) && userMe_.isFemale()) ? "likeMessageNoticeViewLimitFemale" : "likeMessageNoticeViewLimitMale";
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_like_relation");
            if (!TextUtils.isEmpty(strM80485F)) {
                return new JSONObject(strM80485F).optJSONObject("upgradeToLikeFrame").optBoolean(str, false);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: D0 */
    public static void m151161D0(View view, Drawable drawable, int i) {
        if (view == null || drawable == null || i <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = view.getPaddingLeft() + view.getPaddingRight() + ((drawable.getIntrinsicWidth() * i) / drawable.getIntrinsicHeight());
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: E */
    public static int m151162E() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("dynamic_release_guide");
            if (TextUtils.isEmpty(strM80485F)) {
                return 48;
            }
            return new JSONObject(strM80485F).getInt("activetime");
        } catch (Exception unused) {
            return 48;
        }
    }

    /* JADX INFO: renamed from: E0 */
    public static void m151163E0(Boolean bool) {
        m151178M().put(bool);
    }

    /* JADX INFO: renamed from: F */
    public static long m151164F(Moment moment) {
        if (moment == null) {
            return 0L;
        }
        return (long) moment.createdTime;
    }

    /* JADX INFO: renamed from: F0 */
    public static void m151165F0(SimpleDraweeView simpleDraweeView, String str) {
        if (simpleDraweeView.getLayoutParams() != null) {
            int i = simpleDraweeView.getLayoutParams().width;
            int i2 = simpleDraweeView.getLayoutParams().height;
            if (i > 0 && i2 > 0) {
                uqb0.f180374G.m127109I0(simpleDraweeView, str, i, i2);
                return;
            }
        }
        uqb0.f180374G.m127115L0(simpleDraweeView, str);
    }

    /* JADX INFO: renamed from: G */
    public static long m151166G(Moment moment) {
        MessageLocation messageLocation;
        if (moment == null || (messageLocation = moment.location) == null) {
            return 0L;
        }
        try {
            return Long.parseLong(messageLocation.distance);
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: G0 */
    public static void m151167G0(View view, View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            view.setOnClickListener(new ViewOnClickListenerC18250a(onClickListener));
        } else {
            view.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: H */
    public static String m151168H(long j, long j2) {
        Application application = App.f16088e;
        StringBuilder sb = new StringBuilder();
        long jM174454o = (pzi0.m174454o() - j) / 1000;
        long jM174454o2 = (pzi0.m174454o() - j2) / 1000;
        int i = f128561b;
        if (jM174454o < i) {
            sb.append("最新发布");
        } else {
            int i2 = f128563d;
            if (jM174454o < i2) {
                int i3 = (int) (jM174454o / ((long) i));
                sb.append(application.getString(com.p051p1.mobile.putong.common.R$string.f18232v2, Integer.valueOf(i3), application.getString(i3 > 1 ? com.p051p1.mobile.putong.common.R$string.f18027B2 : com.p051p1.mobile.putong.common.R$string.f18023A2)));
            } else if (jM174454o < f128564e) {
                int i4 = (int) (jM174454o / ((long) i2));
                sb.append(application.getString(com.p051p1.mobile.putong.common.R$string.f18232v2, Integer.valueOf(i4), application.getString(i4 > 1 ? com.p051p1.mobile.putong.common.R$string.f18242x2 : com.p051p1.mobile.putong.common.R$string.f18237w2)));
            } else {
                int i5 = f128565f;
                if (jM174454o2 <= i5) {
                    if (jM174454o2 < i) {
                        sb.append("在线");
                    } else if (jM174454o2 < f128562c) {
                        sb.append("刚刚活跃");
                    } else if ((cmg.m111208f0() || cmg.m111233s()) && jM174454o2 < f128563d) {
                        sb.append((jM174454o2 / ((long) f128561b)) + "分钟前活跃");
                    } else if ((cmg.m111208f0() || cmg.m111233s()) && jM174454o2 < f128565f) {
                        sb.append((jM174454o2 / ((long) f128563d)) + "小时前活跃");
                    } else {
                        sb.append("最近活跃");
                    }
                } else if (jM174454o < i5) {
                    int i6 = (int) (jM174454o / ((long) i2));
                    sb.append(application.getString(com.p051p1.mobile.putong.common.R$string.f18232v2, Integer.valueOf(i6), application.getString(i6 > 1 ? com.p051p1.mobile.putong.common.R$string.f18242x2 : com.p051p1.mobile.putong.common.R$string.f18237w2)));
                } else if (jM174454o < f128566g) {
                    sb.append("最近发布");
                } else if (jM174454o < f128567h) {
                    int i7 = (int) (jM174454o / ((long) i5));
                    sb.append(application.getString(com.p051p1.mobile.putong.common.R$string.f18232v2, Integer.valueOf(i7), application.getString(i7 > 1 ? com.p051p1.mobile.putong.common.R$string.f18169j : com.p051p1.mobile.putong.common.R$string.f18164i)));
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: H0 */
    public static void m151169H0(Act act, String str, String str2) {
        if (FeedModule.f39703d.m145813w7(str2) == null) {
            return;
        }
        Intent intent = new Intent(act, (Class<?>) ForwardVideoMomentAct.class);
        intent.putExtra("momentId", str2);
        intent.putExtra("from", str);
        act.startActivity(intent);
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: I */
    public static int m151170I(String str) {
        int i;
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_visitor_time");
            if (TextUtils.isEmpty(strM80485F) || (i = Integer.parseInt(new JSONObject(strM80485F).optString(str))) <= 0) {
                return 3;
            }
            return i;
        } catch (Exception unused) {
        }
        return 3;
    }

    /* JADX INFO: renamed from: I0 */
    public static void m151171I0(Act act, String str, String str2) {
        if (FeedModule.f39703d.m145813w7(str2) == null) {
            return;
        }
        Intent intent = new Intent(act, (Class<?>) ImmersionVideoMomentDetailAct.class);
        intent.putExtra("momentId", str2);
        intent.putExtra("from", str);
        act.startActivity(intent);
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: J */
    public static pf60[] m151172J(pf60 pf60Var, pf60[] pf60VarArr) {
        if (pf60Var == null) {
            return pf60VarArr;
        }
        pf60[] pf60VarArr2 = (pf60[]) Arrays.copyOf(pf60VarArr, pf60VarArr.length + 1);
        pf60VarArr2[pf60VarArr.length] = pf60Var;
        return pf60VarArr2;
    }

    /* JADX INFO: renamed from: J0 */
    public static void m151173J0(Act act) {
        ryh.m183606a(act, act.getResources().getString(R$string.f39917h2), m151181P());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX INFO: renamed from: K */
    public static String m151174K(String str, boolean z) {
        String str2;
        String strM173809d = "p_live_moment";
        if ("from_discover_discussion".equals(str)) {
            str2 = "p_discover_discussion";
        } else if ("from_discover_dating".equals(str)) {
            str2 = "p_discover_dating";
        } else if ("from_like".equals(str)) {
            str2 = "p_like";
        } else if ("from_nearby_online".equals(str)) {
            str2 = "p_nearby_online";
        } else if ("from_nearby_falls_feed".equals(str)) {
            str2 = OMSDialogPositon.p_nearby;
        } else if ("from_p_album".equals(str)) {
            str2 = "p_album";
        } else if ("from_nearby_focus".equals(str)) {
            str2 = "p_follow";
        } else if (z) {
            str2 = "p_album";
        } else if ("from_topic_nearby_header".equals(str) || "from_topic_official".equals(str) || "from_no_topic_aggregation_list".equals(str) || "from_qa_topic_aggregation".equals(str) || "from_h5_topic_aggregation".equals(str)) {
            str2 = "p_topic_detail";
        } else if ("topic_recommend".equals(str) || "qa_recommend".equals(str)) {
            str2 = "p_topic_recommend";
        } else if ("topic_latest".equals(str) || "qa_latest".equals(str)) {
            str2 = "p_topic_latest";
        } else if ("from_video_flow".equals(str)) {
            str2 = "p_video_recommend";
        } else {
            str2 = "from_live_group".equals(str) ? "p_live_moment" : "";
        }
        if ("p_live_moment_article_detail".equals(str)) {
            str2 = "p_live_moment_article_detail";
        }
        if (!"p_live_moment".equals(str)) {
            if ("from_profile_album".equals(str)) {
                strM173809d = OMSDialogPositon.p_suggest_user_profile_info_view;
            } else if ("from_mine_tab_album".equals(str)) {
                strM173809d = OMSDialogPositon.p_navigation_view;
            } else if ("from_moment_detail_album".equals(str)) {
                strM173809d = "p_user_moment_interactions_details_view";
            } else if ("activities".equals(str)) {
                strM173809d = "p_activity";
            } else if ("from_group_detail_recommend".equals(str) || "from_group_detail_new".equals(str)) {
                strM173809d = "p_circle_detail";
            } else {
                strM173809d = "p_suggest_users_home_view";
                if (!"p_suggest_users_home_view".equals(str)) {
                    if ("moment_preview".equals(str)) {
                        strM173809d = "p_moment_preview";
                    } else {
                        strM173809d = OMSDialogPositon.p_chat_view;
                        if (!OMSDialogPositon.p_chat_view.equals(str)) {
                            if ("from_activity_tab_one".equals(str) || "from_activity_tab_two".equals(str)) {
                                strM173809d = pu20.m173809d(str);
                            } else {
                                strM173809d = "from_poi_aggregation".equals(str) ? "p_poi_detail" : str2;
                            }
                        }
                    }
                }
            }
        }
        return TextUtils.isEmpty(strM173809d) ? str : strM173809d;
    }

    /* JADX INFO: renamed from: K0 */
    public static void m151175K0(Act act, String str) {
        act.startActivity(orb0.m168889f(act, str));
    }

    /* JADX INFO: renamed from: L */
    public static String m151176L(String str, boolean z) {
        if (z) {
            return "p_user_moment_interactions_details_view";
        }
        if ("from_discover_discussion".equals(str)) {
            return "p_discover_discussion";
        }
        if ("from_discover_dating".equals(str)) {
            return "p_discover_dating";
        }
        if ("from_nearby_falls_feed".equals(str)) {
            return OMSDialogPositon.p_nearby;
        }
        if ("from_like".equals(str)) {
            return "p_like";
        }
        if ("from_nearby_online".equals(str)) {
            return "p_nearby_online";
        }
        if ("from_nearby_focus".equals(str)) {
            return "p_follow";
        }
        if ("from_topic_nearby_header".equals(str) || "from_topic_official".equals(str) || "from_no_topic_aggregation_list".equals(str) || "from_qa_topic_aggregation".equals(str) || "from_h5_topic_aggregation".equals(str)) {
            return "p_topic_detail";
        }
        if ("moment_preview".equals(str)) {
            return "p_moment_preview";
        }
        if ("topic_recommend".equals(str) || "qa_recommend".equals(str)) {
            return "p_topic_recommend";
        }
        if ("topic_latest".equals(str) || "qa_latest".equals(str)) {
            return "p_topic_latest";
        }
        if ("from_moment_detail_album".equals(str)) {
            return "p_user_moment_interactions_details_view";
        }
        if ("from_group_detail_recommend".equals(str) || "from_group_detail_new".equals(str)) {
            return "p_circle_detail";
        }
        if ("from_activity_tab_one".equals(str)) {
            return pu20.m173809d(str);
        }
        if ("from_activity_tab_two".equals(str)) {
            return pu20.m173809d(str);
        }
        return "from_poi_aggregation".equals(str) ? "p_poi_detail" : "";
    }

    /* JADX INFO: renamed from: L0 */
    public static void m151177L0() {
        if (cmg.m111183K()) {
            long jLongValue = NewPhotoAlbumFrag.f42386n1.get().longValue();
            int iIntValue = NewPhotoAlbumFrag.f42387o1.get().intValue();
            int iM151242z = m151242z();
            if (jLongValue <= 0 || !DateUtils.isToday(jLongValue)) {
                NewPhotoAlbumFrag.f42386n1.put(Long.valueOf(pzi0.m174454o()));
                NewPhotoAlbumFrag.f42387o1.put(1);
            } else {
                if (!DateUtils.isToday(jLongValue) || iIntValue >= iM151242z) {
                    return;
                }
                NewPhotoAlbumFrag.f42386n1.put(Long.valueOf(pzi0.m174454o()));
                NewPhotoAlbumFrag.f42387o1.put(Integer.valueOf(iIntValue + 1));
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public static jxd0 m151178M() {
        return new jxd0("has_audio_moment_publish_power" + FeedModule.m61405F().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: N */
    public static String m151179N(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str + ",moment_superlike";
    }

    /* JADX INFO: renamed from: O */
    public static int m151180O(Throwable th) {
        try {
            Field declaredField = th.getClass().getDeclaredField("code");
            if (!NullChecker.m82487b(declaredField)) {
                return 0;
            }
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(th)).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: P */
    public static String m151181P() {
        if (TextUtils.isEmpty(owi.f149485d.get())) {
            StringBuffer stringBuffer = new StringBuffer(qv5.m178247a("m"));
            stringBuffer.append("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/moments/topic-list/index.html?speed=true&_bid=1002767");
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer(qv5.m178247a("m"));
        stringBuffer2.append(owi.f149485d.get());
        return stringBuffer2.toString();
    }

    /* JADX INFO: renamed from: Q */
    public static String m151182Q(User user, long j, long j2) {
        Application application = App.f16088e;
        StringBuilder sb = new StringBuilder();
        long jM174454o = (pzi0.m174454o() - j) / 1000;
        long jM174454o2 = (pzi0.m174454o() - j2) / 1000;
        int i = f128563d;
        if (jM174454o2 >= i) {
            int i2 = f128564e;
            if (jM174454o <= i2) {
                int i3 = (int) (jM174454o / ((long) i));
                if (i3 == 0) {
                    return "";
                }
                sb.append(application.getString(com.p051p1.mobile.putong.common.R$string.f18232v2, Integer.valueOf(i3), application.getString(i3 > 1 ? com.p051p1.mobile.putong.common.R$string.f18242x2 : com.p051p1.mobile.putong.common.R$string.f18237w2)));
            } else if (jM174454o <= i2 * 2) {
                sb.append("最近发布");
            } else if (jM174454o <= i * 23) {
                int i4 = (int) (jM174454o / ((long) i));
                int i5 = i4 > 1 ? com.p051p1.mobile.putong.common.R$string.f18242x2 : com.p051p1.mobile.putong.common.R$string.f18237w2;
                sb.append(23 - i4);
                sb.append(application.getString(i5));
                sb.append("后即将消失");
            } else {
                sb.append(p6i.m170906o(j + 86400000));
                sb.append("即将消失");
            }
        } else if (jM174454o2 <= f128562c) {
            sb.append("当前活跃");
        } else {
            sb.append((jM174454o2 / ((long) f128561b)) + "分钟前活跃");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: R */
    public static String m151183R(User user, long j, long j2) {
        Application application = App.f16088e;
        StringBuilder sb = new StringBuilder();
        long jM174454o = (pzi0.m174454o() - j) / 1000;
        long jM174454o2 = (pzi0.m174454o() - j2) / 1000;
        int i = f128563d;
        if (jM174454o2 >= i) {
            int i2 = f128564e;
            if (jM174454o <= i2) {
                int i3 = (int) (jM174454o / ((long) i));
                if (i3 == 0) {
                    return "";
                }
                sb.append(application.getString(com.p051p1.mobile.putong.common.R$string.f18232v2, Integer.valueOf(i3), application.getString(i3 > 1 ? com.p051p1.mobile.putong.common.R$string.f18242x2 : com.p051p1.mobile.putong.common.R$string.f18237w2)));
            } else if (jM174454o <= i2 * 2) {
                sb.append("最近发布");
            } else if (jM174454o <= i * 23) {
                int i4 = (int) (jM174454o / ((long) i));
                int i5 = i4 > 1 ? com.p051p1.mobile.putong.common.R$string.f18242x2 : com.p051p1.mobile.putong.common.R$string.f18237w2;
                sb.append(23 - i4);
                sb.append(application.getString(i5));
                sb.append("后消失");
            } else {
                sb.append(p6i.m170906o(j + 86400000));
                sb.append("消失");
            }
        } else if (jM174454o2 <= f128562c) {
            sb.append("当前活跃");
        } else {
            sb.append((jM174454o2 / ((long) f128561b)) + "分钟前活跃");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: S */
    public static long m151184S(User user) {
        if (user == null) {
            return 0L;
        }
        return user.getLastActiveTimeMillis();
    }

    /* JADX INFO: renamed from: T */
    public static boolean m151185T(String str) {
        String str2 = TextUtils.equals(str, "from_group_detail_recommend") ? "recommend_group_follow_button_show" : "";
        if (TextUtils.equals(str, "from_group_detail_new")) {
            str2 = "latest_group_follow_button_show";
        }
        if (TextUtils.equals(str, "from_group_friend")) {
            str2 = "friends_group_follow_button_show";
        }
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_group_follow_button_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            return new JSONObject(strM80485F).optBoolean(str2);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: U */
    public static boolean m151186U(ConversationStatus conversationStatus) {
        return (conversationStatus == null || TEnum.equals(conversationStatus, "dismissed") || TEnum.equals(conversationStatus, "deleted") || TEnum.equals(conversationStatus, "blocked")) ? false : true;
    }

    /* JADX INFO: renamed from: V */
    public static boolean m151187V(Moment moment) {
        return NullChecker.m82486a(moment) && m151188W(moment.owner);
    }

    /* JADX INFO: renamed from: W */
    public static boolean m151188W(String str) {
        User userM145688e8 = FeedModule.f39703d.m145688e8(str);
        return NullChecker.m82486a(userM145688e8) ? userM145688e8.isTeamAccount() : User.isTeamAccount(str);
    }

    /* JADX INFO: renamed from: X */
    public static boolean m151189X(Moment moment) {
        return NullChecker.m82486a(moment) && m151190Y(moment.media);
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m151190Y(List<Media> list) {
        return list.size() > 0 && (list.get(0) instanceof Audio);
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m151191Z(Moment moment) {
        return NullChecker.m82486a(moment) && TEnum.equals(moment.momentType, MomentType.forwardMoment) && NullChecker.m82486a(moment.thirdShareSource) && !TextUtils.isEmpty(moment.thirdShareSource.sourceId) && MomentType.forwardMoment.equals(moment.thirdShareSource.sourceType);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m151192a(y20 y20Var, Envelope envelope) {
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (jyb.m147479J(detect.text) && jyb.m147479J(detect.media)) {
            y20Var.call(null);
        } else {
            y20Var.call(detect);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m151193a0(String str) {
        return "from_nearby_falls_feed".equals(str) || "from_like".equals(str);
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m151195b0(User user) {
        Settings settings;
        Followship followship;
        Relationship relationship;
        if (user != null && (settings = user.settings) != null && !jyb.m147479J(settings.settingGroups)) {
            SettingGroups settingGroup = user.settings.getSettingGroup();
            if (NullChecker.m82486a(settingGroup.privacy.hidePublicMoments) && settingGroup.privacy.hidePublicMoments.booleanValue() && (followship = user.localFollowship) != null && !TEnum.equals(followship.state, "matched") && (relationship = user.localRelationship) != null && !TEnum.equals(relationship.state, "matched")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m151196c(x20 x20Var, String str, Envelope envelope) {
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (jyb.m147479J(detect.text) && jyb.m147479J(detect.media)) {
            x20Var.call();
        } else if (m151214l(detect, str)) {
            o1j0.m165649w(R$string.f39989s);
        } else {
            o1j0.m165649w(R$string.f39844W2);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static boolean m151197c0(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage().endsWith("zh");
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m151199d0() {
        User userMe_ = l51.m152884D() ? FeedModule.m61406H().me_() : FeedModule.m61406H().queryMe();
        if (userMe_ == null) {
            return false;
        }
        return userMe_.isFemale();
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m151201e0(Moment moment) {
        return (!NullChecker.m82486a(moment) || TEnum.equals(moment.allowForward, MomentAllowForwardState.allow) || TEnum.equals(moment.allowForward, "unknown_")) ? false : true;
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m151203f0(Moment moment) {
        MomentAdditionalData momentAdditionalData;
        MomentShareInfo momentShareInfo;
        return (moment == null || (momentAdditionalData = moment.additionalData) == null || (momentShareInfo = momentAdditionalData.share) == null || momentShareInfo.isMomentShareEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m151205g0(Moment moment) {
        return NullChecker.m82486a(moment) && NullChecker.m82486a(moment.settings) && TEnum.equals(moment.settings.visibility, "selfOnly");
    }

    /* JADX INFO: renamed from: h0 */
    public static boolean m151207h0(Moment moment) {
        return (moment == null || jyb.m147479J(moment.media) || !(moment.media.get(0) instanceof Video)) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public static pf60[] m151208i(String str, pf60... pf60VarArr) {
        pf60 pf60Var;
        if ("from_group_detail_recommend".equals(str)) {
            pf60Var = new pf60("circle_detail_tab", "recommend");
        } else {
            pf60Var = "from_group_detail_new".equals(str) ? new pf60("circle_detail_tab", ShareConstants.NEW_VERSION) : null;
        }
        return m151172J(pf60Var, pf60VarArr);
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m151209i0(int i) {
        return (i == 2 || i == 8) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public static pf60[] m151210j(String str, pf60... pf60VarArr) {
        return m151172J("p_circle_detail".equals(str) ? new pf60("circle_detail_tab", "recommend") : null, pf60VarArr);
    }

    /* JADX INFO: renamed from: j0 */
    public static boolean m151211j0(int i) {
        User userMe_ = l51.m152884D() ? FeedModule.m61406H().me_() : FeedModule.m61406H().queryMe();
        if (userMe_ == null) {
            return false;
        }
        return !tzi0.m193670h(pzi0.m174454o(), (long) userMe_.createdTime, i);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m151212k() {
        if (cmg.m111183K()) {
            long jLongValue = NewPhotoAlbumFrag.f42386n1.get().longValue();
            int iIntValue = NewPhotoAlbumFrag.f42387o1.get().intValue();
            int iM151242z = m151242z();
            if (iM151242z <= 0) {
                return false;
            }
            if (jLongValue <= 0 || !DateUtils.isToday(jLongValue)) {
                return true;
            }
            if (DateUtils.isToday(jLongValue) && iIntValue < iM151242z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k0 */
    public static boolean m151213k0(int i) {
        return i == 0 || i == 1 || i == 12 || i == 14 || i == 15 || i == 17 || i == 18;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m151214l(Detect detect, final String str) {
        if (jyb.m147479J(detect.text)) {
            return false;
        }
        ArrayList arrayListM147522n = jyb.m147522n(detect.text, new qcj() { // from class: l.gsg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("MINOR_LANGUAGES", ((DetectText) obj).type));
            }
        });
        if (jyb.m147479J(arrayListM147522n)) {
            return false;
        }
        jyb.m147537z(arrayListM147522n, new y20() { // from class: l.hsg
            @Override // p153l.y20
            public final void call(Object obj) {
                i4g0.m138495D("e_minor_languages_risk_toast", str, jyb.m147494Y("actor_user_id", FeedModule.m61405F().userId()), jyb.m147494Y("sensitive_text", ((DetectText) obj).value));
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: l0 */
    public static boolean m151215l0(int i, int i2) {
        return Math.abs(i) > Math.abs((i2 + i) - bnl0.m105592y0());
    }

    /* JADX INFO: renamed from: m */
    public static String m151216m(int i, boolean z) {
        if (!m151197c0(FeedModule.f39700a)) {
            return m151236w(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z ? p6i.m170892a(i) : Integer.valueOf(i));
        sb.append(FeedModule.f39700a.getString(R$string.f39775L));
        return sb.toString();
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m151217m0() {
        return m151178M().get().booleanValue();
    }

    /* JADX INFO: renamed from: n */
    public static int m151218n(DoublePair doublePair) {
        com.p051p1.mobile.putong.location.Location locationM80048q = uqb0.f180370E.m80048q();
        if (doublePair == null || locationM80048q == null) {
            return 0;
        }
        com.p051p1.mobile.putong.location.Location location = new com.p051p1.mobile.putong.location.Location("me");
        location.m80008K(locationM80048q.m80014u());
        location.m80010M(locationM80048q.m80016x());
        com.p051p1.mobile.putong.location.Location location2 = new com.p051p1.mobile.putong.location.Location("other");
        location2.m80008K(doublePair.first);
        location2.m80010M(doublePair.second);
        return (int) location.m80011r(location2);
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m151219n0(User user) {
        if (NullChecker.m82486a(user)) {
            return user.isTeamAccount();
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static void m151220o(Act act, String str, DetectCategoryType detectCategoryType, String str2, final String str3, final x20 x20Var) {
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = detectCategoryType;
        DetectText detectText = new DetectText();
        detectText.key = str2;
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        act.duringCreated(FeedModule.f39703d.m145582P6(detectRequest)).subscribe(psd0.m173597H(new y20() { // from class: l.isg
            @Override // p153l.y20
            public final void call(Object obj) {
                ksg.m151196c(x20Var, str3, (Envelope) obj);
            }
        }, new y20() { // from class: l.jsg
            @Override // p153l.y20
            public final void call(Object obj) {
                x20Var.call();
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public static boolean m151221o0(TopicMoment topicMoment, Context context) {
        if (!(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        if (NullChecker.m82487b(topicMoment) && NullChecker.m82487b(activity) && (activity instanceof TopicAggregationAct)) {
            return TextUtils.equals(topicMoment.f40095id, ((TopicAggregationAct) activity).m67267a2());
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public static void m151222p(Act act, String str, final y20<Detect> y20Var) {
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = DetectCategoryType.get("moment");
        DetectText detectText = new DetectText();
        detectText.key = "moment";
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        act.duringCreated(FeedModule.f39703d.m145582P6(detectRequest)).subscribe(psd0.m173597H(new y20() { // from class: l.esg
            @Override // p153l.y20
            public final void call(Object obj) {
                ksg.m151192a(y20Var, (Envelope) obj);
            }
        }, new y20() { // from class: l.fsg
            @Override // p153l.y20
            public final void call(Object obj) {
                y20Var.call(null);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public static boolean m151223p0(float f, float f2) {
        if (bnl0.m105592y0() > f) {
            return (((float) bnl0.m105592y0()) / f) * f2 > ((float) (bnl0.m105588w0() * 2)) && f2 > ((float) bnl0.m105588w0()) && f2 / f > (((float) bnl0.m105588w0()) / ((float) bnl0.m105592y0())) * 2.0f;
        }
        return f2 > ((float) (bnl0.m105588w0() * 2)) && f2 / f > (((float) bnl0.m105588w0()) / ((float) bnl0.m105592y0())) * 2.0f;
    }

    /* JADX INFO: renamed from: q */
    public static String m151224q(int i) {
        if (i > 99999999) {
            return new DecimalFormat("#.#").format(i / 1.0E8f) + "亿";
        }
        if (i > 9999) {
            return new DecimalFormat("#.#").format(i / 10000.0f) + "w";
        }
        if (i <= 999) {
            return i + "";
        }
        return new DecimalFormat("#.#").format(i / 1000.0f) + "k";
    }

    /* JADX INFO: renamed from: q0 */
    public static boolean m151225q0(User user) {
        Profile profile;
        Moments moments;
        if (user == null || (profile = user.profile) == null || (moments = profile.moments) == null) {
            return false;
        }
        return moments.hidePublicMoments;
    }

    /* JADX INFO: renamed from: r */
    public static String m151226r(int i) {
        if (i <= 10000) {
            return i + "";
        }
        return new DecimalFormat("#.##").format(i / 10000.0f) + "w";
    }

    /* JADX INFO: renamed from: r0 */
    public static boolean m151227r0(String str) {
        User userMe_ = FeedModule.m61406H().me_();
        if (userMe_ == null) {
            return false;
        }
        return userMe_.f56859id.equals(str);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m151228s(String str) {
        return "from_nearby_falls_feed".equals(str) || "from_discover_dating".equals(str) || "from_discover_discussion".equals(str);
    }

    /* JADX INFO: renamed from: s0 */
    public static boolean m151229s0(Moment moment) {
        return NullChecker.m82486a(moment) && User.isWisdomStar(moment.owner);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m151230t(String str) {
        if ("personal_photo_album".equals(str)) {
            return true;
        }
        if ((l7i.f130346r + "from_like").equals(str)) {
            return true;
        }
        if ((l7i.f130346r + "from_nearby_online").equals(str)) {
            return true;
        }
        if ((l7i.f130346r + "from_nearby_falls_feed").equals(str)) {
            return true;
        }
        if ((l7i.f130346r + "from_nearby_focus").equals(str)) {
            return true;
        }
        if ((l7i.f130346r + "from_discover_dating").equals(str)) {
            return true;
        }
        if ((l7i.f130346r + "from_discover_discussion").equals(str)) {
            return true;
        }
        if ((l7i.f130346r + "from_activity_tab_one").equals(str)) {
            return true;
        }
        if ((l7i.f130346r + "from_activity_tab_two").equals(str)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(l7i.f130346r);
        sb.append("from_poi_aggregation");
        return sb.toString().equals(str);
    }

    /* JADX INFO: renamed from: t0 */
    public static void m151231t0(TopicMoment topicMoment, Context context) {
        m151235v0(topicMoment, context, "from_topic_nearby_header", m151221o0(topicMoment, context));
    }

    /* JADX INFO: renamed from: u */
    public static List<String> m151232u() {
        List<Emotion> list;
        ArrayList arrayList = new ArrayList();
        String str = owi.f149488g.get();
        if (TextUtils.isEmpty(str)) {
            return jyb.m147507f0(new String[0]);
        }
        try {
            List<StateEmotion> array = JSON.parseArray(str, StateEmotion.class);
            if (array == null) {
                return jyb.m147507f0(new String[0]);
            }
            for (StateEmotion stateEmotion : array) {
                if (stateEmotion == null || (list = stateEmotion.emotions) == null) {
                    FeedStateEmotionNullException.reportFeedStateEmotionNullException(str, Boolean.valueOf(stateEmotion == null));
                } else {
                    for (Emotion emotion : list) {
                        if (TextUtils.equals(stateEmotion.categoryName, "找人一起")) {
                            arrayList.add(emotion.text);
                        }
                    }
                }
            }
            return arrayList;
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static void m151233u0(TopicMoment topicMoment, Context context, String str) {
        m151235v0(topicMoment, context, str, m151221o0(topicMoment, context));
    }

    /* JADX INFO: renamed from: v */
    public static String m151234v(MessageLocation messageLocation) {
        if (!NullChecker.m82486a(messageLocation) || TextUtils.isEmpty(messageLocation.distance)) {
            return "";
        }
        try {
            int iCeil = (int) Math.ceil(Double.parseDouble(messageLocation.distance));
            return iCeil <= 0 ? "" : q8g0.m175811p(iCeil, true);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return "1" + FeedModule.f39700a.getString(R$string.f39713A3);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static void m151235v0(TopicMoment topicMoment, Context context, String str, boolean z) {
        if (topicMoment.isTopicLinkType()) {
            context.startActivity(orb0.m168893j(context, topicMoment.getTopicNameWithPrefix(), topicMoment.landingPage));
            return;
        }
        if (topicMoment.isTopicVoteType()) {
            context.startActivity(TopicVoteAggregationAct.m67356Z1(context, topicMoment.f40095id, topicMoment.owner.f39607id, User.ID_TEAM_ACCOUNT, str));
        } else if (topicMoment.isQATopicType()) {
            context.startActivity(QATopicAggregationActivity.m67158X1(context, topicMoment.f40095id, str));
        } else {
            context.startActivity(TopicAggregationAct.m67264X1(context, topicMoment.f40095id, str, z, er60.m122104w().m122107E(topicMoment)));
        }
    }

    /* JADX INFO: renamed from: w */
    public static String m151236w(int i) {
        switch (i) {
            case 2:
                return "Feb";
            case 3:
                return "Mar";
            case 4:
                return "Apr";
            case 5:
                return "May";
            case 6:
                return "Jun";
            case 7:
                return "Jul";
            case 8:
                return "Aug";
            case 9:
                return "Sep";
            case 10:
                return "Oct";
            case 11:
                return "Nov";
            case 12:
                return "Dec";
            default:
                return "Jan";
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static boolean m151237w0() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("dating_match_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return true;
            }
            return new JSONObject(strM80485F).optBoolean("matchButtonSwitch", true);
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: x */
    public static String m151238x() {
        String strM80485F = RemoteConfig.m80481x().m80485F("like_relation_fuction");
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(strM80485F)) {
            try {
                String strOptString = new JSONObject(strM80485F).optString("greetFuction");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONArray jSONArray = new JSONObject(strOptString).getJSONArray("feed_greet_msg");
                    if (NullChecker.m82486a(jSONArray) && jSONArray.length() > 0) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList.add(jSONArray.getString(i));
                        }
                    }
                }
            } catch (org.json.JSONException unused) {
            }
        }
        if (jyb.m147479J(arrayList)) {
            arrayList.add("你好呀，今天心情不错");
            arrayList.add("在嘛，很想认识你");
        }
        return (String) arrayList.get(new Random().nextInt(arrayList.size()));
    }

    /* JADX INFO: renamed from: x0 */
    public static String m151239x0() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("dating_match_config");
            return !TextUtils.isEmpty(strM80485F) ? new JSONObject(strM80485F).optString("matchButtonName", "配对") : "配对";
        } catch (Exception unused) {
            return "配对";
        }
    }

    /* JADX INFO: renamed from: y */
    public static int m151240y() {
        return qa00.m175859d(10.0f);
    }

    /* JADX INFO: renamed from: y0 */
    public static boolean m151241y0() {
        User userMe_ = FeedModule.m61406H().me_();
        if (userMe_ == null) {
            return false;
        }
        userMe_.isBanned();
        return false;
    }

    /* JADX INFO: renamed from: z */
    public static int m151242z() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("like_relation_fuction");
            if (TextUtils.isEmpty(strM80485F)) {
                return 3;
            }
            return Integer.parseInt(new JSONObject(strM80485F).optJSONObject("likeTabFuction").optString("redDotLimitNumbers"));
        } catch (Exception unused) {
            return 3;
        }
    }

    /* JADX INFO: renamed from: z0 */
    public static String m151243z0(User user) {
        if (!mrb0.m159667u(user)) {
            return FeedModule.f39700a.getString(R$string.f39720B4, pzi0.m174442G(user.location.updatedTime));
        }
        String string = FeedModule.f39700a.getString(R$string.f39720B4, pzi0.m174442G(FeedModule.m61406H().mo31833vn(user)));
        if (!user.isMe()) {
            return string;
        }
        return string + FeedModule.f39700a.getString(R$string.f39763J);
    }
}
