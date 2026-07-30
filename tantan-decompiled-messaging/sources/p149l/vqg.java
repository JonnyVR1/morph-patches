package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.Detect;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.DetectRequest;
import com.p046p1.mobile.putong.data.DetectText;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.MomentType;
import com.p046p1.mobile.putong.data.Moments;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentAdditionalData;
import com.p046p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p046p1.mobile.putong.feed.data.MomentShareInfo;
import com.p046p1.mobile.putong.feed.data.StateEmotion;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.helper.exception.FeedStateEmotionNullException;
import com.p046p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.immersionvideo.ImmersionVideoMomentDetailAct;
import com.p046p1.mobile.putong.feed.newui.preview.forward.ForwardVideoMomentAct;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p046p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p046p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
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

/* JADX INFO: loaded from: classes12.dex */
public class vqg {

    /* JADX INFO: renamed from: a */
    public static int f182637a = 0;

    /* JADX INFO: renamed from: b */
    public static int f182638b = 60;

    /* JADX INFO: renamed from: c */
    public static int f182639c = 600;

    /* JADX INFO: renamed from: d */
    public static int f182640d = 3600;

    /* JADX INFO: renamed from: e */
    public static int f182641e = 21600;

    /* JADX INFO: renamed from: f */
    public static int f182642f = 86400;

    /* JADX INFO: renamed from: g */
    public static int f182643g = 172800;

    /* JADX INFO: renamed from: h */
    public static int f182644h = 518400;

    /* JADX INFO: renamed from: i */
    public static List<String> f182645i = new ArrayList();

    /* JADX INFO: renamed from: l.vqg$a */
    public class ViewOnClickListenerC20717a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public long f182646a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View.OnClickListener f182647b;

        public ViewOnClickListenerC20717a(View.OnClickListener onClickListener) {
            this.f182647b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SystemClock.uptimeMillis() - this.f182646a > 2000) {
                this.f182646a = SystemClock.uptimeMillis();
                this.f182647b.onClick(view);
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static Moment m199495A(String str) {
        Moment momentM209572w7 = FeedModule.f38855d.m209572w7(str);
        if (momentM209572w7 == null || vwb.m200296J(momentM209572w7.media) || !(momentM209572w7.media.get(0) instanceof Video)) {
            return null;
        }
        return momentM209572w7;
    }

    /* JADX INFO: renamed from: A0 */
    public static String m199496A0(User user) {
        String strM133876p;
        CharSequence charSequenceM133853T;
        if (ijb0.m136583w(user)) {
            charSequenceM133853T = "";
        } else {
            boolean zEquals = user.f56011id.equals(FeedModule.m60221F().userId());
            Location location = user.location;
            if (zEquals) {
                strM133876p = i0g0.m133876p(location.distance, true);
                if (strM133876p.equals(i0g0.m133876p(0, true))) {
                    charSequenceM133853T = strM133876p;
                    charSequenceM133853T = "1" + FeedModule.f38852a.getString(R$string.f38865A3);
                }
            } else {
                charSequenceM133853T = i0g0.m133853T(location, false, null, true);
            }
        }
        charSequenceM133853T = strM133876p;
        return charSequenceM133853T.toString();
    }

    /* JADX INFO: renamed from: B */
    public static void m199497B(Act act, final String str, final e30<Boolean> e30Var) {
        if (NullChecker.m81303a(vwb.m200346r(f182645i, new w9j() { // from class: l.nqg
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, str));
            }
        }))) {
            e30Var.call(Boolean.FALSE);
            return;
        }
        User userM209447e8 = FeedModule.f38855d.m209447e8(str);
        if (userM209447e8 == null || userM209447e8.isBannedNew() || userM209447e8.isJailed() || userM209447e8.isMe() || User.isWisdomStar(userM209447e8.f56011id)) {
            e30Var.call(Boolean.FALSE);
        } else {
            FeedModule.m60222H().mo30827ur(act, str, new e30() { // from class: l.oqg
                @Override // p149l.e30
                public final void call(Object obj) {
                    e30Var.call((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static String m199498B0(User user) {
        if (user == null) {
            return "";
        }
        return (ijb0.m136583w(user) ? "" : i0g0.m133856W(user.location)).toString();
    }

    /* JADX INFO: renamed from: C */
    public static String m199499C(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str + ",moment_greet";
    }

    /* JADX INFO: renamed from: C0 */
    public static String m199500C0(double d) {
        boolean z = App.f15366b;
        Calendar calendar = Calendar.getInstance();
        long j = (long) d;
        calendar.setTimeInMillis(j);
        StringBuilder sb = new StringBuilder();
        if (calendar.get(1) <= 1970) {
            return "1秒以前推荐";
        }
        long jM155944o = (mqi0.m155944o() - j) / 1000;
        if (jM155944o > 31536000) {
            sb.append((int) (jM155944o / 31536000));
            sb.append("年以前推荐");
        } else if (jM155944o > 2592000) {
            sb.append((int) (jM155944o / 2592000));
            sb.append("个月以前推荐");
        } else if (jM155944o > 604800) {
            sb.append((int) (jM155944o / 604800));
            sb.append("周以前推荐");
        } else if (jM155944o > 86400) {
            sb.append((int) (jM155944o / 86400));
            sb.append("天以前推荐");
        } else if (jM155944o > 3600) {
            sb.append((int) (jM155944o / 3600));
            sb.append("小时以前推荐");
        } else if (jM155944o >= 60) {
            sb.append((int) (jM155944o / 60));
            sb.append("分钟以前推荐");
        } else {
            if (jM155944o <= 0) {
                return "1秒以前推荐";
            }
            sb.append((int) jM155944o);
            sb.append("秒以前推荐");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: D */
    public static boolean m199501D() {
        User userMe_ = FeedModule.m60222H().me_();
        String str = (NullChecker.m81303a(userMe_) && userMe_.isFemale()) ? "likeMessageNoticeViewLimitFemale" : "likeMessageNoticeViewLimitMale";
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_like_relation");
            if (!TextUtils.isEmpty(strM79302F)) {
                return new JSONObject(strM79302F).optJSONObject("upgradeToLikeFrame").optBoolean(str, false);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: D0 */
    public static void m199502D0(View view, Drawable drawable, int i) {
        if (view == null || drawable == null || i <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = view.getPaddingLeft() + view.getPaddingRight() + ((drawable.getIntrinsicWidth() * i) / drawable.getIntrinsicHeight());
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: E */
    public static int m199503E() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("dynamic_release_guide");
            if (TextUtils.isEmpty(strM79302F)) {
                return 48;
            }
            return new JSONObject(strM79302F).getInt("activetime");
        } catch (Exception unused) {
            return 48;
        }
    }

    /* JADX INFO: renamed from: E0 */
    public static void m199504E0(Boolean bool) {
        m199519M().put(bool);
    }

    /* JADX INFO: renamed from: F */
    public static long m199505F(Moment moment) {
        if (moment == null) {
            return 0L;
        }
        return (long) moment.createdTime;
    }

    /* JADX INFO: renamed from: F0 */
    public static void m199506F0(SimpleDraweeView simpleDraweeView, String str) {
        if (simpleDraweeView.getLayoutParams() != null) {
            int i = simpleDraweeView.getLayoutParams().width;
            int i2 = simpleDraweeView.getLayoutParams().height;
            if (i > 0 && i2 > 0) {
                qib0.f154691G.m102325I0(simpleDraweeView, str, i, i2);
                return;
            }
        }
        qib0.f154691G.m102331L0(simpleDraweeView, str);
    }

    /* JADX INFO: renamed from: G */
    public static long m199507G(Moment moment) {
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
    public static void m199508G0(View view, View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            view.setOnClickListener(new ViewOnClickListenerC20717a(onClickListener));
        } else {
            view.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: H */
    public static String m199509H(long j, long j2) {
        Application application = App.f15369e;
        StringBuilder sb = new StringBuilder();
        long jM155944o = (mqi0.m155944o() - j) / 1000;
        long jM155944o2 = (mqi0.m155944o() - j2) / 1000;
        int i = f182638b;
        if (jM155944o < i) {
            sb.append("最新发布");
        } else {
            int i2 = f182640d;
            if (jM155944o < i2) {
                int i3 = (int) (jM155944o / ((long) i));
                sb.append(application.getString(com.p046p1.mobile.putong.common.R$string.f17513v2, Integer.valueOf(i3), application.getString(i3 > 1 ? com.p046p1.mobile.putong.common.R$string.f17308B2 : com.p046p1.mobile.putong.common.R$string.f17304A2)));
            } else if (jM155944o < f182641e) {
                int i4 = (int) (jM155944o / ((long) i2));
                sb.append(application.getString(com.p046p1.mobile.putong.common.R$string.f17513v2, Integer.valueOf(i4), application.getString(i4 > 1 ? com.p046p1.mobile.putong.common.R$string.f17523x2 : com.p046p1.mobile.putong.common.R$string.f17518w2)));
            } else {
                int i5 = f182642f;
                if (jM155944o2 <= i5) {
                    if (jM155944o2 < i) {
                        sb.append("在线");
                    } else if (jM155944o2 < f182639c) {
                        sb.append("刚刚活跃");
                    } else if ((nkg.m159879f0() || nkg.m159904s()) && jM155944o2 < f182640d) {
                        sb.append((jM155944o2 / ((long) f182638b)) + "分钟前活跃");
                    } else if ((nkg.m159879f0() || nkg.m159904s()) && jM155944o2 < f182642f) {
                        sb.append((jM155944o2 / ((long) f182640d)) + "小时前活跃");
                    } else {
                        sb.append("最近活跃");
                    }
                } else if (jM155944o < i5) {
                    int i6 = (int) (jM155944o / ((long) i2));
                    sb.append(application.getString(com.p046p1.mobile.putong.common.R$string.f17513v2, Integer.valueOf(i6), application.getString(i6 > 1 ? com.p046p1.mobile.putong.common.R$string.f17523x2 : com.p046p1.mobile.putong.common.R$string.f17518w2)));
                } else if (jM155944o < f182643g) {
                    sb.append("最近发布");
                } else if (jM155944o < f182644h) {
                    int i7 = (int) (jM155944o / ((long) i5));
                    sb.append(application.getString(com.p046p1.mobile.putong.common.R$string.f17513v2, Integer.valueOf(i7), application.getString(i7 > 1 ? com.p046p1.mobile.putong.common.R$string.f17450j : com.p046p1.mobile.putong.common.R$string.f17445i)));
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: H0 */
    public static void m199510H0(Act act, String str, String str2) {
        if (FeedModule.f38855d.m209572w7(str2) == null) {
            return;
        }
        Intent intent = new Intent(act, (Class<?>) ForwardVideoMomentAct.class);
        intent.putExtra("momentId", str2);
        intent.putExtra("from", str);
        act.startActivity(intent);
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: I */
    public static int m199511I(String str) {
        int i;
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_visitor_time");
            if (TextUtils.isEmpty(strM79302F) || (i = Integer.parseInt(new JSONObject(strM79302F).optString(str))) <= 0) {
                return 3;
            }
            return i;
        } catch (Exception unused) {
        }
        return 3;
    }

    /* JADX INFO: renamed from: I0 */
    public static void m199512I0(Act act, String str, String str2) {
        if (FeedModule.f38855d.m209572w7(str2) == null) {
            return;
        }
        Intent intent = new Intent(act, (Class<?>) ImmersionVideoMomentDetailAct.class);
        intent.putExtra("momentId", str2);
        intent.putExtra("from", str);
        act.startActivity(intent);
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: J */
    public static j760[] m199513J(j760 j760Var, j760[] j760VarArr) {
        if (j760Var == null) {
            return j760VarArr;
        }
        j760[] j760VarArr2 = (j760[]) Arrays.copyOf(j760VarArr, j760VarArr.length + 1);
        j760VarArr2[j760VarArr.length] = j760Var;
        return j760VarArr2;
    }

    /* JADX INFO: renamed from: J0 */
    public static void m199514J0(Act act) {
        cxh.m109099a(act, act.getResources().getString(R$string.f39069h2), m199522P());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX INFO: renamed from: K */
    public static String m199515K(String str, boolean z) {
        String str2;
        String strM122121d = "p_live_moment";
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
                strM122121d = OMSDialogPositon.p_suggest_user_profile_info_view;
            } else if ("from_mine_tab_album".equals(str)) {
                strM122121d = OMSDialogPositon.p_navigation_view;
            } else if ("from_moment_detail_album".equals(str)) {
                strM122121d = "p_user_moment_interactions_details_view";
            } else if ("activities".equals(str)) {
                strM122121d = "p_activity";
            } else if ("from_group_detail_recommend".equals(str) || "from_group_detail_new".equals(str)) {
                strM122121d = "p_circle_detail";
            } else {
                strM122121d = "p_suggest_users_home_view";
                if (!"p_suggest_users_home_view".equals(str)) {
                    if ("moment_preview".equals(str)) {
                        strM122121d = "p_moment_preview";
                    } else {
                        strM122121d = OMSDialogPositon.p_chat_view;
                        if (!OMSDialogPositon.p_chat_view.equals(str)) {
                            if ("from_activity_tab_one".equals(str) || "from_activity_tab_two".equals(str)) {
                                strM122121d = fm20.m122121d(str);
                            } else {
                                strM122121d = "from_poi_aggregation".equals(str) ? "p_poi_detail" : str2;
                            }
                        }
                    }
                }
            }
        }
        return TextUtils.isEmpty(strM122121d) ? str : strM122121d;
    }

    /* JADX INFO: renamed from: K0 */
    public static void m199516K0(Act act, String str) {
        act.startActivity(kjb0.m146195f(act, str));
    }

    /* JADX INFO: renamed from: L */
    public static String m199517L(String str, boolean z) {
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
            return fm20.m122121d(str);
        }
        if ("from_activity_tab_two".equals(str)) {
            return fm20.m122121d(str);
        }
        return "from_poi_aggregation".equals(str) ? "p_poi_detail" : "";
    }

    /* JADX INFO: renamed from: L0 */
    public static void m199518L0() {
        if (nkg.m159854K()) {
            long jLongValue = NewPhotoAlbumFrag.f41538n1.get().longValue();
            int iIntValue = NewPhotoAlbumFrag.f41539o1.get().intValue();
            int iM199583z = m199583z();
            if (jLongValue <= 0 || !DateUtils.isToday(jLongValue)) {
                NewPhotoAlbumFrag.f41538n1.put(Long.valueOf(mqi0.m155944o()));
                NewPhotoAlbumFrag.f41539o1.put(1);
            } else {
                if (!DateUtils.isToday(jLongValue) || iIntValue >= iM199583z) {
                    return;
                }
                NewPhotoAlbumFrag.f41538n1.put(Long.valueOf(mqi0.m155944o()));
                NewPhotoAlbumFrag.f41539o1.put(Integer.valueOf(iIntValue + 1));
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public static hpd0 m199519M() {
        return new hpd0("has_audio_moment_publish_power" + FeedModule.m60221F().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: N */
    public static String m199520N(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str + ",moment_superlike";
    }

    /* JADX INFO: renamed from: O */
    public static int m199521O(Throwable th) {
        try {
            Field declaredField = th.getClass().getDeclaredField("code");
            if (!NullChecker.m81304b(declaredField)) {
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
    public static String m199522P() {
        if (TextUtils.isEmpty(sti.f166360d.get())) {
            StringBuffer stringBuffer = new StringBuffer(mu5.m156376a("m"));
            stringBuffer.append("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/moments/topic-list/index.html?speed=true&_bid=1002767");
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer(mu5.m156376a("m"));
        stringBuffer2.append(sti.f166360d.get());
        return stringBuffer2.toString();
    }

    /* JADX INFO: renamed from: Q */
    public static String m199523Q(User user, long j, long j2) {
        Application application = App.f15369e;
        StringBuilder sb = new StringBuilder();
        long jM155944o = (mqi0.m155944o() - j) / 1000;
        long jM155944o2 = (mqi0.m155944o() - j2) / 1000;
        int i = f182640d;
        if (jM155944o2 >= i) {
            int i2 = f182641e;
            if (jM155944o <= i2) {
                int i3 = (int) (jM155944o / ((long) i));
                if (i3 == 0) {
                    return "";
                }
                sb.append(application.getString(com.p046p1.mobile.putong.common.R$string.f17513v2, Integer.valueOf(i3), application.getString(i3 > 1 ? com.p046p1.mobile.putong.common.R$string.f17523x2 : com.p046p1.mobile.putong.common.R$string.f17518w2)));
            } else if (jM155944o <= i2 * 2) {
                sb.append("最近发布");
            } else if (jM155944o <= i * 23) {
                int i4 = (int) (jM155944o / ((long) i));
                int i5 = i4 > 1 ? com.p046p1.mobile.putong.common.R$string.f17523x2 : com.p046p1.mobile.putong.common.R$string.f17518w2;
                sb.append(23 - i4);
                sb.append(application.getString(i5));
                sb.append("后即将消失");
            } else {
                sb.append(a5i.m95039o(j + 86400000));
                sb.append("即将消失");
            }
        } else if (jM155944o2 <= f182639c) {
            sb.append("当前活跃");
        } else {
            sb.append((jM155944o2 / ((long) f182638b)) + "分钟前活跃");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: R */
    public static String m199524R(User user, long j, long j2) {
        Application application = App.f15369e;
        StringBuilder sb = new StringBuilder();
        long jM155944o = (mqi0.m155944o() - j) / 1000;
        long jM155944o2 = (mqi0.m155944o() - j2) / 1000;
        int i = f182640d;
        if (jM155944o2 >= i) {
            int i2 = f182641e;
            if (jM155944o <= i2) {
                int i3 = (int) (jM155944o / ((long) i));
                if (i3 == 0) {
                    return "";
                }
                sb.append(application.getString(com.p046p1.mobile.putong.common.R$string.f17513v2, Integer.valueOf(i3), application.getString(i3 > 1 ? com.p046p1.mobile.putong.common.R$string.f17523x2 : com.p046p1.mobile.putong.common.R$string.f17518w2)));
            } else if (jM155944o <= i2 * 2) {
                sb.append("最近发布");
            } else if (jM155944o <= i * 23) {
                int i4 = (int) (jM155944o / ((long) i));
                int i5 = i4 > 1 ? com.p046p1.mobile.putong.common.R$string.f17523x2 : com.p046p1.mobile.putong.common.R$string.f17518w2;
                sb.append(23 - i4);
                sb.append(application.getString(i5));
                sb.append("后消失");
            } else {
                sb.append(a5i.m95039o(j + 86400000));
                sb.append("消失");
            }
        } else if (jM155944o2 <= f182639c) {
            sb.append("当前活跃");
        } else {
            sb.append((jM155944o2 / ((long) f182638b)) + "分钟前活跃");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: S */
    public static long m199525S(User user) {
        if (user == null) {
            return 0L;
        }
        return user.getLastActiveTimeMillis();
    }

    /* JADX INFO: renamed from: T */
    public static boolean m199526T(String str) {
        String str2 = TextUtils.equals(str, "from_group_detail_recommend") ? "recommend_group_follow_button_show" : "";
        if (TextUtils.equals(str, "from_group_detail_new")) {
            str2 = "latest_group_follow_button_show";
        }
        if (TextUtils.equals(str, "from_group_friend")) {
            str2 = "friends_group_follow_button_show";
        }
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_group_follow_button_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).optBoolean(str2);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: U */
    public static boolean m199527U(ConversationStatus conversationStatus) {
        return (conversationStatus == null || TEnum.equals(conversationStatus, "dismissed") || TEnum.equals(conversationStatus, "deleted") || TEnum.equals(conversationStatus, "blocked")) ? false : true;
    }

    /* JADX INFO: renamed from: V */
    public static boolean m199528V(Moment moment) {
        return NullChecker.m81303a(moment) && m199529W(moment.owner);
    }

    /* JADX INFO: renamed from: W */
    public static boolean m199529W(String str) {
        User userM209447e8 = FeedModule.f38855d.m209447e8(str);
        return NullChecker.m81303a(userM209447e8) ? userM209447e8.isTeamAccount() : User.isTeamAccount(str);
    }

    /* JADX INFO: renamed from: X */
    public static boolean m199530X(Moment moment) {
        return NullChecker.m81303a(moment) && m199531Y(moment.media);
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m199531Y(List<Media> list) {
        return list.size() > 0 && (list.get(0) instanceof Audio);
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m199532Z(Moment moment) {
        return NullChecker.m81303a(moment) && TEnum.equals(moment.momentType, MomentType.forwardMoment) && NullChecker.m81303a(moment.thirdShareSource) && !TextUtils.isEmpty(moment.thirdShareSource.sourceId) && MomentType.forwardMoment.equals(moment.thirdShareSource.sourceType);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m199533a(e30 e30Var, Envelope envelope) {
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (vwb.m200296J(detect.text) && vwb.m200296J(detect.media)) {
            e30Var.call(null);
        } else {
            e30Var.call(detect);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m199534a0(String str) {
        return "from_nearby_falls_feed".equals(str) || "from_like".equals(str);
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m199536b0(User user) {
        Settings settings;
        Followship followship;
        Relationship relationship;
        if (user != null && (settings = user.settings) != null && !vwb.m200296J(settings.settingGroups)) {
            SettingGroups settingGroup = user.settings.getSettingGroup();
            if (NullChecker.m81303a(settingGroup.privacy.hidePublicMoments) && settingGroup.privacy.hidePublicMoments.booleanValue() && (followship = user.localFollowship) != null && !TEnum.equals(followship.state, "matched") && (relationship = user.localRelationship) != null && !TEnum.equals(relationship.state, "matched")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m199537c(d30 d30Var, String str, Envelope envelope) {
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (vwb.m200296J(detect.text) && vwb.m200296J(detect.media)) {
            d30Var.call();
        } else if (m199555l(detect, str)) {
            lsi0.m151593w(R$string.f39141s);
        } else {
            lsi0.m151593w(R$string.f38996W2);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static boolean m199538c0(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage().endsWith("zh");
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m199540d0() {
        User userMe_ = e51.m114739D() ? FeedModule.m60222H().me_() : FeedModule.m60222H().queryMe();
        if (userMe_ == null) {
            return false;
        }
        return userMe_.isFemale();
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m199542e0(Moment moment) {
        return (!NullChecker.m81303a(moment) || TEnum.equals(moment.allowForward, MomentAllowForwardState.allow) || TEnum.equals(moment.allowForward, "unknown_")) ? false : true;
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m199544f0(Moment moment) {
        MomentAdditionalData momentAdditionalData;
        MomentShareInfo momentShareInfo;
        return (moment == null || (momentAdditionalData = moment.additionalData) == null || (momentShareInfo = momentAdditionalData.share) == null || momentShareInfo.isMomentShareEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m199546g0(Moment moment) {
        return NullChecker.m81303a(moment) && NullChecker.m81303a(moment.settings) && TEnum.equals(moment.settings.visibility, "selfOnly");
    }

    /* JADX INFO: renamed from: h0 */
    public static boolean m199548h0(Moment moment) {
        return (moment == null || vwb.m200296J(moment.media) || !(moment.media.get(0) instanceof Video)) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public static j760[] m199549i(String str, j760... j760VarArr) {
        j760 j760Var;
        if ("from_group_detail_recommend".equals(str)) {
            j760Var = new j760("circle_detail_tab", "recommend");
        } else {
            j760Var = "from_group_detail_new".equals(str) ? new j760("circle_detail_tab", ShareConstants.NEW_VERSION) : null;
        }
        return m199513J(j760Var, j760VarArr);
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m199550i0(int i) {
        return (i == 2 || i == 8) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public static j760[] m199551j(String str, j760... j760VarArr) {
        return m199513J("p_circle_detail".equals(str) ? new j760("circle_detail_tab", "recommend") : null, j760VarArr);
    }

    /* JADX INFO: renamed from: j0 */
    public static boolean m199552j0(int i) {
        User userMe_ = e51.m114739D() ? FeedModule.m60222H().me_() : FeedModule.m60222H().queryMe();
        if (userMe_ == null) {
            return false;
        }
        return !qqi0.m175940h(mqi0.m155944o(), (long) userMe_.createdTime, i);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m199553k() {
        if (nkg.m159854K()) {
            long jLongValue = NewPhotoAlbumFrag.f41538n1.get().longValue();
            int iIntValue = NewPhotoAlbumFrag.f41539o1.get().intValue();
            int iM199583z = m199583z();
            if (iM199583z <= 0) {
                return false;
            }
            if (jLongValue <= 0 || !DateUtils.isToday(jLongValue)) {
                return true;
            }
            if (DateUtils.isToday(jLongValue) && iIntValue < iM199583z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k0 */
    public static boolean m199554k0(int i) {
        return i == 0 || i == 1 || i == 12 || i == 14 || i == 15 || i == 17 || i == 18;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m199555l(Detect detect, final String str) {
        if (vwb.m200296J(detect.text)) {
            return false;
        }
        ArrayList arrayListM200339n = vwb.m200339n(detect.text, new w9j() { // from class: l.rqg
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("MINOR_LANGUAGES", ((DetectText) obj).type));
            }
        });
        if (vwb.m200296J(arrayListM200339n)) {
            return false;
        }
        vwb.m200354z(arrayListM200339n, new e30() { // from class: l.sqg
            @Override // p149l.e30
            public final void call(Object obj) {
                zvf0.m220371D("e_minor_languages_risk_toast", str, vwb.m200311Y("actor_user_id", FeedModule.m60221F().userId()), vwb.m200311Y("sensitive_text", ((DetectText) obj).value));
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: l0 */
    public static boolean m199556l0(int i, int i2) {
        return Math.abs(i) > Math.abs((i2 + i) - xdl0.m208412y0());
    }

    /* JADX INFO: renamed from: m */
    public static String m199557m(int i, boolean z) {
        if (!m199538c0(FeedModule.f38852a)) {
            return m199577w(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z ? a5i.m95025a(i) : Integer.valueOf(i));
        sb.append(FeedModule.f38852a.getString(R$string.f38927L));
        return sb.toString();
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m199558m0() {
        return m199519M().get().booleanValue();
    }

    /* JADX INFO: renamed from: n */
    public static int m199559n(DoublePair doublePair) {
        com.p046p1.mobile.putong.location.Location locationM78865q = qib0.f154687E.m78865q();
        if (doublePair == null || locationM78865q == null) {
            return 0;
        }
        com.p046p1.mobile.putong.location.Location location = new com.p046p1.mobile.putong.location.Location("me");
        location.m78825K(locationM78865q.m78831u());
        location.m78827M(locationM78865q.m78833x());
        com.p046p1.mobile.putong.location.Location location2 = new com.p046p1.mobile.putong.location.Location("other");
        location2.m78825K(doublePair.first);
        location2.m78827M(doublePair.second);
        return (int) location.m78828r(location2);
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m199560n0(User user) {
        if (NullChecker.m81303a(user)) {
            return user.isTeamAccount();
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static void m199561o(Act act, String str, DetectCategoryType detectCategoryType, String str2, final String str3, final d30 d30Var) {
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = detectCategoryType;
        DetectText detectText = new DetectText();
        detectText.key = str2;
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        act.duringCreated(FeedModule.f38855d.m209341P6(detectRequest)).subscribe(mkd0.m154956H(new e30() { // from class: l.tqg
            @Override // p149l.e30
            public final void call(Object obj) {
                vqg.m199537c(d30Var, str3, (Envelope) obj);
            }
        }, new e30() { // from class: l.uqg
            @Override // p149l.e30
            public final void call(Object obj) {
                d30Var.call();
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public static boolean m199562o0(TopicMoment topicMoment, Context context) {
        if (!(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        if (NullChecker.m81304b(topicMoment) && NullChecker.m81304b(activity) && (activity instanceof TopicAggregationAct)) {
            return TextUtils.equals(topicMoment.f39247id, ((TopicAggregationAct) activity).m66084Z1());
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public static void m199563p(Act act, String str, final e30<Detect> e30Var) {
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = DetectCategoryType.get("moment");
        DetectText detectText = new DetectText();
        detectText.key = "moment";
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        act.duringCreated(FeedModule.f38855d.m209341P6(detectRequest)).subscribe(mkd0.m154956H(new e30() { // from class: l.pqg
            @Override // p149l.e30
            public final void call(Object obj) {
                vqg.m199533a(e30Var, (Envelope) obj);
            }
        }, new e30() { // from class: l.qqg
            @Override // p149l.e30
            public final void call(Object obj) {
                e30Var.call(null);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public static boolean m199564p0(float f, float f2) {
        if (xdl0.m208412y0() > f) {
            return (((float) xdl0.m208412y0()) / f) * f2 > ((float) (xdl0.m208408w0() * 2)) && f2 > ((float) xdl0.m208408w0()) && f2 / f > (((float) xdl0.m208408w0()) / ((float) xdl0.m208412y0())) * 2.0f;
        }
        return f2 > ((float) (xdl0.m208408w0() * 2)) && f2 / f > (((float) xdl0.m208408w0()) / ((float) xdl0.m208412y0())) * 2.0f;
    }

    /* JADX INFO: renamed from: q */
    public static String m199565q(int i) {
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
    public static boolean m199566q0(User user) {
        Profile profile;
        Moments moments;
        if (user == null || (profile = user.profile) == null || (moments = profile.moments) == null) {
            return false;
        }
        return moments.hidePublicMoments;
    }

    /* JADX INFO: renamed from: r */
    public static String m199567r(int i) {
        if (i <= 10000) {
            return i + "";
        }
        return new DecimalFormat("#.##").format(i / 10000.0f) + "w";
    }

    /* JADX INFO: renamed from: r0 */
    public static boolean m199568r0(String str) {
        User userMe_ = FeedModule.m60222H().me_();
        if (userMe_ == null) {
            return false;
        }
        return userMe_.f56011id.equals(str);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m199569s(String str) {
        return "from_nearby_falls_feed".equals(str) || "from_discover_dating".equals(str) || "from_discover_discussion".equals(str);
    }

    /* JADX INFO: renamed from: s0 */
    public static boolean m199570s0(Moment moment) {
        return NullChecker.m81303a(moment) && User.isWisdomStar(moment.owner);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m199571t(String str) {
        if ("personal_photo_album".equals(str)) {
            return true;
        }
        if ((w5i.f184683r + "from_like").equals(str)) {
            return true;
        }
        if ((w5i.f184683r + "from_nearby_online").equals(str)) {
            return true;
        }
        if ((w5i.f184683r + "from_nearby_falls_feed").equals(str)) {
            return true;
        }
        if ((w5i.f184683r + "from_nearby_focus").equals(str)) {
            return true;
        }
        if ((w5i.f184683r + "from_discover_dating").equals(str)) {
            return true;
        }
        if ((w5i.f184683r + "from_discover_discussion").equals(str)) {
            return true;
        }
        if ((w5i.f184683r + "from_activity_tab_one").equals(str)) {
            return true;
        }
        if ((w5i.f184683r + "from_activity_tab_two").equals(str)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(w5i.f184683r);
        sb.append("from_poi_aggregation");
        return sb.toString().equals(str);
    }

    /* JADX INFO: renamed from: t0 */
    public static void m199572t0(TopicMoment topicMoment, Context context) {
        m199576v0(topicMoment, context, "from_topic_nearby_header", m199562o0(topicMoment, context));
    }

    /* JADX INFO: renamed from: u */
    public static List<String> m199573u() {
        List<Emotion> list;
        ArrayList arrayList = new ArrayList();
        String str = sti.f166363g.get();
        if (TextUtils.isEmpty(str)) {
            return vwb.m200324f0(new String[0]);
        }
        try {
            List<StateEmotion> array = JSON.parseArray(str, StateEmotion.class);
            if (array == null) {
                return vwb.m200324f0(new String[0]);
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
            CrashHelper.m81296c(e);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static void m199574u0(TopicMoment topicMoment, Context context, String str) {
        m199576v0(topicMoment, context, str, m199562o0(topicMoment, context));
    }

    /* JADX INFO: renamed from: v */
    public static String m199575v(MessageLocation messageLocation) {
        if (!NullChecker.m81303a(messageLocation) || TextUtils.isEmpty(messageLocation.distance)) {
            return "";
        }
        try {
            int iCeil = (int) Math.ceil(Double.parseDouble(messageLocation.distance));
            return iCeil <= 0 ? "" : i0g0.m133876p(iCeil, true);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return "1" + FeedModule.f38852a.getString(R$string.f38865A3);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static void m199576v0(TopicMoment topicMoment, Context context, String str, boolean z) {
        if (topicMoment.isTopicLinkType()) {
            context.startActivity(kjb0.m146199j(context, topicMoment.getTopicNameWithPrefix(), topicMoment.landingPage));
            return;
        }
        if (topicMoment.isTopicVoteType()) {
            context.startActivity(TopicVoteAggregationAct.m66173Y1(context, topicMoment.f39247id, topicMoment.owner.f38759id, User.ID_TEAM_ACCOUNT, str));
        } else if (topicMoment.isQATopicType()) {
            context.startActivity(QATopicAggregationActivity.m65975V1(context, topicMoment.f39247id, str));
        } else {
            context.startActivity(TopicAggregationAct.m66081V1(context, topicMoment.f39247id, str, z, zi60.m218961w().m218964E(topicMoment)));
        }
    }

    /* JADX INFO: renamed from: w */
    public static String m199577w(int i) {
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
    public static boolean m199578w0() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("dating_match_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return true;
            }
            return new JSONObject(strM79302F).optBoolean("matchButtonSwitch", true);
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: x */
    public static String m199579x() {
        String strM79302F = RemoteConfig.m79298x().m79302F("like_relation_fuction");
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(strM79302F)) {
            try {
                String strOptString = new JSONObject(strM79302F).optString("greetFuction");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONArray jSONArray = new JSONObject(strOptString).getJSONArray("feed_greet_msg");
                    if (NullChecker.m81303a(jSONArray) && jSONArray.length() > 0) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList.add(jSONArray.getString(i));
                        }
                    }
                }
            } catch (org.json.JSONException unused) {
            }
        }
        if (vwb.m200296J(arrayList)) {
            arrayList.add("你好呀，今天心情不错");
            arrayList.add("在嘛，很想认识你");
        }
        return (String) arrayList.get(new Random().nextInt(arrayList.size()));
    }

    /* JADX INFO: renamed from: x0 */
    public static String m199580x0() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("dating_match_config");
            return !TextUtils.isEmpty(strM79302F) ? new JSONObject(strM79302F).optString("matchButtonName", "配对") : "配对";
        } catch (Exception unused) {
            return "配对";
        }
    }

    /* JADX INFO: renamed from: y */
    public static int m199581y() {
        return t100.m186890d(10.0f);
    }

    /* JADX INFO: renamed from: y0 */
    public static boolean m199582y0() {
        User userMe_ = FeedModule.m60222H().me_();
        if (userMe_ == null) {
            return false;
        }
        userMe_.isBanned();
        return false;
    }

    /* JADX INFO: renamed from: z */
    public static int m199583z() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("like_relation_fuction");
            if (TextUtils.isEmpty(strM79302F)) {
                return 3;
            }
            return Integer.parseInt(new JSONObject(strM79302F).optJSONObject("likeTabFuction").optString("redDotLimitNumbers"));
        } catch (Exception unused) {
            return 3;
        }
    }

    /* JADX INFO: renamed from: z0 */
    public static String m199584z0(User user) {
        if (!ijb0.m136581u(user)) {
            return FeedModule.f38852a.getString(R$string.f38872B4, mqi0.m155932G(user.location.updatedTime));
        }
        String string = FeedModule.f38852a.getString(R$string.f38872B4, mqi0.m155932G(FeedModule.m60222H().mo30830vn(user)));
        if (!user.isMe()) {
            return string;
        }
        return string + FeedModule.f38852a.getString(R$string.f38915J);
    }
}
