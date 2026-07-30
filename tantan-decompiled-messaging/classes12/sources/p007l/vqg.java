package p007l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.style.CharacterStyle;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.data.Audio;
import com.p000p1.mobile.putong.data.CommonData;
import com.p000p1.mobile.putong.data.ConversationStatus;
import com.p000p1.mobile.putong.data.Detect;
import com.p000p1.mobile.putong.data.DetectCategoryType;
import com.p000p1.mobile.putong.data.DetectRequest;
import com.p000p1.mobile.putong.data.DetectText;
import com.p000p1.mobile.putong.data.DoublePair;
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Followship;
import com.p000p1.mobile.putong.data.Location;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MessageLocation;
import com.p000p1.mobile.putong.data.MomentType;
import com.p000p1.mobile.putong.data.Moments;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.Profile;
import com.p000p1.mobile.putong.data.Relationship;
import com.p000p1.mobile.putong.data.SettingGroups;
import com.p000p1.mobile.putong.data.Settings;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentAdditionalData;
import com.p000p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p000p1.mobile.putong.feed.data.MomentShareInfo;
import com.p000p1.mobile.putong.feed.data.StateEmotion;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.helper.exception.FeedStateEmotionNullException;
import com.p000p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.immersionvideo.ImmersionVideoMomentDetailAct;
import com.p000p1.mobile.putong.feed.newui.preview.forward.ForwardVideoMomentAct;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p000p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p000p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import com.p006ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.common.R;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import l.d30;
import l.e30;
import l.e51;
import l.hpd0;
import l.i0g0;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.mu5;
import l.qib0;
import l.qqi0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class vqg {

    /* JADX INFO: renamed from: a */
    public static int f14268a = 0;

    /* JADX INFO: renamed from: b */
    public static int f14269b = 60;

    /* JADX INFO: renamed from: c */
    public static int f14270c = 600;

    /* JADX INFO: renamed from: d */
    public static int f14271d = 3600;

    /* JADX INFO: renamed from: e */
    public static int f14272e = 21600;

    /* JADX INFO: renamed from: f */
    public static int f14273f = 86400;

    /* JADX INFO: renamed from: g */
    public static int f14274g = 172800;

    /* JADX INFO: renamed from: h */
    public static int f14275h = 518400;

    /* JADX INFO: renamed from: i */
    public static List<String> f14276i = new ArrayList();

    /* JADX INFO: renamed from: l.vqg$a */
    public class ViewOnClickListenerC2523a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public long f14277a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View.OnClickListener f14278b;

        public ViewOnClickListenerC2523a(View.OnClickListener onClickListener) {
            this.f14278b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SystemClock.uptimeMillis() - this.f14277a > 2000) {
                this.f14277a = SystemClock.uptimeMillis();
                this.f14278b.onClick(view);
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static Moment m15465A(String str) {
        Moment momentM16753w7 = FeedModule.f316d.m16753w7(str);
        if (momentM16753w7 == null || vwb.J(momentM16753w7.media) || !(momentM16753w7.media.get(0) instanceof Video)) {
            return null;
        }
        return momentM16753w7;
    }

    /* JADX INFO: renamed from: A0 */
    public static String m15466A0(User user) {
        String strP;
        CharSequence charSequenceT;
        if (ijb0.m10936w(user)) {
            charSequenceT = "";
        } else {
            boolean zEquals = ((DbObject) user).id.equals(FeedModule.m1139F().userId());
            Location location = user.location;
            if (zEquals) {
                strP = i0g0.p(location.distance, true);
                if (strP.equals(i0g0.p(0, true))) {
                    charSequenceT = strP;
                    charSequenceT = "1" + FeedModule.f313a.getString(R$string.f326A3);
                }
            } else {
                charSequenceT = i0g0.T(location, false, (CharacterStyle) null, true);
            }
        }
        charSequenceT = strP;
        return charSequenceT.toString();
    }

    /* JADX INFO: renamed from: B */
    public static void m15467B(Act act, final String str, final e30<Boolean> e30Var) {
        if (NullChecker.a(vwb.r(f14276i, new w9j() { // from class: l.nqg
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, str));
            }
        }))) {
            e30Var.call(Boolean.FALSE);
            return;
        }
        User userM16628e8 = FeedModule.f316d.m16628e8(str);
        if (userM16628e8 == null || userM16628e8.isBannedNew() || userM16628e8.isJailed() || userM16628e8.isMe() || User.isWisdomStar(((DbObject) userM16628e8).id)) {
            e30Var.call(Boolean.FALSE);
        } else {
            FeedModule.m1140H().ur(act, str, new e30() { // from class: l.oqg
                public final void call(Object obj) {
                    e30Var.call((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static String m15468B0(User user) {
        if (user == null) {
            return "";
        }
        return (ijb0.m10936w(user) ? "" : i0g0.W(user.location)).toString();
    }

    /* JADX INFO: renamed from: C */
    public static String m15469C(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str + ",moment_greet";
    }

    /* JADX INFO: renamed from: C0 */
    public static String m15470C0(double d) {
        boolean z = App.b;
        Calendar calendar = Calendar.getInstance();
        long j = (long) d;
        calendar.setTimeInMillis(j);
        StringBuilder sb = new StringBuilder();
        if (calendar.get(1) <= 1970) {
            return "1秒以前推荐";
        }
        long jO = (mqi0.o() - j) / 1000;
        if (jO > 31536000) {
            sb.append((int) (jO / 31536000));
            sb.append("年以前推荐");
        } else if (jO > 2592000) {
            sb.append((int) (jO / 2592000));
            sb.append("个月以前推荐");
        } else if (jO > 604800) {
            sb.append((int) (jO / 604800));
            sb.append("周以前推荐");
        } else if (jO > 86400) {
            sb.append((int) (jO / 86400));
            sb.append("天以前推荐");
        } else if (jO > 3600) {
            sb.append((int) (jO / 3600));
            sb.append("小时以前推荐");
        } else if (jO >= 60) {
            sb.append((int) (jO / 60));
            sb.append("分钟以前推荐");
        } else {
            if (jO <= 0) {
                return "1秒以前推荐";
            }
            sb.append((int) jO);
            sb.append("秒以前推荐");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: D */
    public static boolean m15471D() {
        User userMe_ = FeedModule.m1140H().me_();
        String str = (NullChecker.a(userMe_) && userMe_.isFemale()) ? "likeMessageNoticeViewLimitFemale" : "likeMessageNoticeViewLimitMale";
        try {
            String strF = RemoteConfig.x().F("moment_like_relation");
            if (!TextUtils.isEmpty(strF)) {
                return new JSONObject(strF).optJSONObject("upgradeToLikeFrame").optBoolean(str, false);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: D0 */
    public static void m15472D0(View view, Drawable drawable, int i) {
        if (view == null || drawable == null || i <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = view.getPaddingLeft() + view.getPaddingRight() + ((drawable.getIntrinsicWidth() * i) / drawable.getIntrinsicHeight());
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: E */
    public static int m15473E() {
        try {
            String strF = RemoteConfig.x().F("dynamic_release_guide");
            if (TextUtils.isEmpty(strF)) {
                return 48;
            }
            return new JSONObject(strF).getInt("activetime");
        } catch (Exception unused) {
            return 48;
        }
    }

    /* JADX INFO: renamed from: E0 */
    public static void m15474E0(Boolean bool) {
        m15489M().put(bool);
    }

    /* JADX INFO: renamed from: F */
    public static long m15475F(Moment moment) {
        if (moment == null) {
            return 0L;
        }
        return (long) moment.createdTime;
    }

    /* JADX INFO: renamed from: F0 */
    public static void m15476F0(SimpleDraweeView simpleDraweeView, String str) {
        if (simpleDraweeView.getLayoutParams() != null) {
            int i = simpleDraweeView.getLayoutParams().width;
            int i2 = simpleDraweeView.getLayoutParams().height;
            if (i > 0 && i2 > 0) {
                qib0.G.I0(simpleDraweeView, str, i, i2);
                return;
            }
        }
        qib0.G.L0(simpleDraweeView, str);
    }

    /* JADX INFO: renamed from: G */
    public static long m15477G(Moment moment) {
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
    public static void m15478G0(View view, View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            view.setOnClickListener(new ViewOnClickListenerC2523a(onClickListener));
        } else {
            view.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: H */
    public static String m15479H(long j, long j2) {
        Application application = App.e;
        StringBuilder sb = new StringBuilder();
        long jO = (mqi0.o() - j) / 1000;
        long jO2 = (mqi0.o() - j2) / 1000;
        int i = f14269b;
        if (jO < i) {
            sb.append("最新发布");
        } else {
            int i2 = f14271d;
            if (jO < i2) {
                int i3 = (int) (jO / ((long) i));
                sb.append(application.getString(R.string.v2, Integer.valueOf(i3), application.getString(i3 > 1 ? R.string.B2 : R.string.A2)));
            } else if (jO < f14272e) {
                int i4 = (int) (jO / ((long) i2));
                sb.append(application.getString(R.string.v2, Integer.valueOf(i4), application.getString(i4 > 1 ? R.string.x2 : R.string.w2)));
            } else {
                int i5 = f14273f;
                if (jO2 <= i5) {
                    if (jO2 < i) {
                        sb.append("在线");
                    } else if (jO2 < f14270c) {
                        sb.append("刚刚活跃");
                    } else if ((nkg.m12238f0() || nkg.m12263s()) && jO2 < f14271d) {
                        sb.append((jO2 / ((long) f14269b)) + "分钟前活跃");
                    } else if ((nkg.m12238f0() || nkg.m12263s()) && jO2 < f14273f) {
                        sb.append((jO2 / ((long) f14271d)) + "小时前活跃");
                    } else {
                        sb.append("最近活跃");
                    }
                } else if (jO < i5) {
                    int i6 = (int) (jO / ((long) i2));
                    sb.append(application.getString(R.string.v2, Integer.valueOf(i6), application.getString(i6 > 1 ? R.string.x2 : R.string.w2)));
                } else if (jO < f14274g) {
                    sb.append("最近发布");
                } else if (jO < f14275h) {
                    int i7 = (int) (jO / ((long) i5));
                    sb.append(application.getString(R.string.v2, Integer.valueOf(i7), application.getString(i7 > 1 ? R.string.j : R.string.i)));
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: H0 */
    public static void m15480H0(Act act, String str, String str2) {
        if (FeedModule.f316d.m16753w7(str2) == null) {
            return;
        }
        Intent intent = new Intent((Context) act, (Class<?>) ForwardVideoMomentAct.class);
        intent.putExtra("momentId", str2);
        intent.putExtra("from", str);
        act.startActivity(intent);
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: I */
    public static int m15481I(String str) {
        int i;
        try {
            String strF = RemoteConfig.x().F("moment_visitor_time");
            if (TextUtils.isEmpty(strF) || (i = Integer.parseInt(new JSONObject(strF).optString(str))) <= 0) {
                return 3;
            }
            return i;
        } catch (Exception unused) {
        }
        return 3;
    }

    /* JADX INFO: renamed from: I0 */
    public static void m15482I0(Act act, String str, String str2) {
        if (FeedModule.f316d.m16753w7(str2) == null) {
            return;
        }
        Intent intent = new Intent((Context) act, (Class<?>) ImmersionVideoMomentDetailAct.class);
        intent.putExtra("momentId", str2);
        intent.putExtra("from", str);
        act.startActivity(intent);
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: J */
    public static j760[] m15483J(j760 j760Var, j760[] j760VarArr) {
        if (j760Var == null) {
            return j760VarArr;
        }
        j760[] j760VarArr2 = (j760[]) Arrays.copyOf(j760VarArr, j760VarArr.length + 1);
        j760VarArr2[j760VarArr.length] = j760Var;
        return j760VarArr2;
    }

    /* JADX INFO: renamed from: J0 */
    public static void m15484J0(Act act) {
        cxh.m9251a(act, act.getResources().getString(R$string.f530h2), m15492P());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX INFO: renamed from: K */
    public static String m15485K(String str, boolean z) {
        String str2;
        String strM10224d = "p_live_moment";
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
                strM10224d = OMSDialogPositon.p_suggest_user_profile_info_view;
            } else if ("from_mine_tab_album".equals(str)) {
                strM10224d = OMSDialogPositon.p_navigation_view;
            } else if ("from_moment_detail_album".equals(str)) {
                strM10224d = "p_user_moment_interactions_details_view";
            } else if ("activities".equals(str)) {
                strM10224d = "p_activity";
            } else if ("from_group_detail_recommend".equals(str) || "from_group_detail_new".equals(str)) {
                strM10224d = "p_circle_detail";
            } else {
                strM10224d = "p_suggest_users_home_view";
                if (!"p_suggest_users_home_view".equals(str)) {
                    if ("moment_preview".equals(str)) {
                        strM10224d = "p_moment_preview";
                    } else {
                        strM10224d = OMSDialogPositon.p_chat_view;
                        if (!OMSDialogPositon.p_chat_view.equals(str)) {
                            if ("from_activity_tab_one".equals(str) || "from_activity_tab_two".equals(str)) {
                                strM10224d = fm20.m10224d(str);
                            } else {
                                strM10224d = "from_poi_aggregation".equals(str) ? "p_poi_detail" : str2;
                            }
                        }
                    }
                }
            }
        }
        return TextUtils.isEmpty(strM10224d) ? str : strM10224d;
    }

    /* JADX INFO: renamed from: K0 */
    public static void m15486K0(Act act, String str) {
        act.startActivity(kjb0.m11454f(act, str));
    }

    /* JADX INFO: renamed from: L */
    public static String m15487L(String str, boolean z) {
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
            return fm20.m10224d(str);
        }
        if ("from_activity_tab_two".equals(str)) {
            return fm20.m10224d(str);
        }
        return "from_poi_aggregation".equals(str) ? "p_poi_detail" : "";
    }

    /* JADX INFO: renamed from: L0 */
    public static void m15488L0() {
        if (nkg.m12213K()) {
            long jLongValue = ((Long) NewPhotoAlbumFrag.f2999n1.get()).longValue();
            int iIntValue = ((Integer) NewPhotoAlbumFrag.f3000o1.get()).intValue();
            int iM15553z = m15553z();
            if (jLongValue <= 0 || !DateUtils.isToday(jLongValue)) {
                NewPhotoAlbumFrag.f2999n1.put(Long.valueOf(mqi0.o()));
                NewPhotoAlbumFrag.f3000o1.put(1);
            } else {
                if (!DateUtils.isToday(jLongValue) || iIntValue >= iM15553z) {
                    return;
                }
                NewPhotoAlbumFrag.f2999n1.put(Long.valueOf(mqi0.o()));
                NewPhotoAlbumFrag.f3000o1.put(Integer.valueOf(iIntValue + 1));
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public static hpd0 m15489M() {
        return new hpd0("has_audio_moment_publish_power" + FeedModule.m1139F().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: N */
    public static String m15490N(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str + ",moment_superlike";
    }

    /* JADX INFO: renamed from: O */
    public static int m15491O(Throwable th) {
        try {
            Field declaredField = th.getClass().getDeclaredField("code");
            if (!NullChecker.b(declaredField)) {
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
    public static String m15492P() {
        if (TextUtils.isEmpty((String) sti.f13078d.get())) {
            StringBuffer stringBuffer = new StringBuffer(mu5.a("m"));
            stringBuffer.append("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/moments/topic-list/index.html?speed=true&_bid=1002767");
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer(mu5.a("m"));
        stringBuffer2.append((String) sti.f13078d.get());
        return stringBuffer2.toString();
    }

    /* JADX INFO: renamed from: Q */
    public static String m15493Q(User user, long j, long j2) {
        Application application = App.e;
        StringBuilder sb = new StringBuilder();
        long jO = (mqi0.o() - j) / 1000;
        long jO2 = (mqi0.o() - j2) / 1000;
        int i = f14271d;
        if (jO2 >= i) {
            int i2 = f14272e;
            if (jO <= i2) {
                int i3 = (int) (jO / ((long) i));
                if (i3 == 0) {
                    return "";
                }
                sb.append(application.getString(R.string.v2, Integer.valueOf(i3), application.getString(i3 > 1 ? R.string.x2 : R.string.w2)));
            } else if (jO <= i2 * 2) {
                sb.append("最近发布");
            } else if (jO <= i * 23) {
                int i4 = (int) (jO / ((long) i));
                int i5 = i4 > 1 ? R.string.x2 : R.string.w2;
                sb.append(23 - i4);
                sb.append(application.getString(i5));
                sb.append("后即将消失");
            } else {
                sb.append(a5i.m8415o(j + 86400000));
                sb.append("即将消失");
            }
        } else if (jO2 <= f14270c) {
            sb.append("当前活跃");
        } else {
            sb.append((jO2 / ((long) f14269b)) + "分钟前活跃");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: R */
    public static String m15494R(User user, long j, long j2) {
        Application application = App.e;
        StringBuilder sb = new StringBuilder();
        long jO = (mqi0.o() - j) / 1000;
        long jO2 = (mqi0.o() - j2) / 1000;
        int i = f14271d;
        if (jO2 >= i) {
            int i2 = f14272e;
            if (jO <= i2) {
                int i3 = (int) (jO / ((long) i));
                if (i3 == 0) {
                    return "";
                }
                sb.append(application.getString(R.string.v2, Integer.valueOf(i3), application.getString(i3 > 1 ? R.string.x2 : R.string.w2)));
            } else if (jO <= i2 * 2) {
                sb.append("最近发布");
            } else if (jO <= i * 23) {
                int i4 = (int) (jO / ((long) i));
                int i5 = i4 > 1 ? R.string.x2 : R.string.w2;
                sb.append(23 - i4);
                sb.append(application.getString(i5));
                sb.append("后消失");
            } else {
                sb.append(a5i.m8415o(j + 86400000));
                sb.append("消失");
            }
        } else if (jO2 <= f14270c) {
            sb.append("当前活跃");
        } else {
            sb.append((jO2 / ((long) f14269b)) + "分钟前活跃");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: S */
    public static long m15495S(User user) {
        if (user == null) {
            return 0L;
        }
        return user.getLastActiveTimeMillis();
    }

    /* JADX INFO: renamed from: T */
    public static boolean m15496T(String str) {
        String str2 = TextUtils.equals(str, "from_group_detail_recommend") ? "recommend_group_follow_button_show" : "";
        if (TextUtils.equals(str, "from_group_detail_new")) {
            str2 = "latest_group_follow_button_show";
        }
        if (TextUtils.equals(str, "from_group_friend")) {
            str2 = "friends_group_follow_button_show";
        }
        try {
            String strF = RemoteConfig.x().F("moment_group_follow_button_config");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).optBoolean(str2);
        } catch (Exception e) {
            CrashHelper.c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: U */
    public static boolean m15497U(ConversationStatus conversationStatus) {
        return (conversationStatus == null || TEnum.equals(conversationStatus, "dismissed") || TEnum.equals(conversationStatus, "deleted") || TEnum.equals(conversationStatus, "blocked")) ? false : true;
    }

    /* JADX INFO: renamed from: V */
    public static boolean m15498V(Moment moment) {
        return NullChecker.a(moment) && m15499W(moment.owner);
    }

    /* JADX INFO: renamed from: W */
    public static boolean m15499W(String str) {
        User userM16628e8 = FeedModule.f316d.m16628e8(str);
        return NullChecker.a(userM16628e8) ? userM16628e8.isTeamAccount() : User.isTeamAccount(str);
    }

    /* JADX INFO: renamed from: X */
    public static boolean m15500X(Moment moment) {
        return NullChecker.a(moment) && m15501Y(moment.media);
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m15501Y(List<Media> list) {
        return list.size() > 0 && (list.get(0) instanceof Audio);
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m15502Z(Moment moment) {
        return NullChecker.a(moment) && TEnum.equals(moment.momentType, MomentType.forwardMoment) && NullChecker.a(moment.thirdShareSource) && !TextUtils.isEmpty(moment.thirdShareSource.sourceId) && MomentType.forwardMoment.equals(moment.thirdShareSource.sourceType);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15503a(e30 e30Var, Envelope envelope) {
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (vwb.J(detect.text) && vwb.J(detect.media)) {
            e30Var.call((Object) null);
        } else {
            e30Var.call(detect);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m15504a0(String str) {
        return "from_nearby_falls_feed".equals(str) || "from_like".equals(str);
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m15506b0(User user) {
        Settings settings;
        Followship followship;
        Relationship relationship;
        if (user != null && (settings = user.settings) != null && !vwb.J(settings.settingGroups)) {
            SettingGroups settingGroup = user.settings.getSettingGroup();
            if (NullChecker.a(settingGroup.privacy.hidePublicMoments) && settingGroup.privacy.hidePublicMoments.booleanValue() && (followship = user.localFollowship) != null && !TEnum.equals(followship.state, "matched") && (relationship = user.localRelationship) != null && !TEnum.equals(relationship.state, "matched")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m15507c(d30 d30Var, String str, Envelope envelope) {
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (vwb.J(detect.text) && vwb.J(detect.media)) {
            d30Var.call();
        } else if (m15525l(detect, str)) {
            lsi0.w(R$string.f602s);
        } else {
            lsi0.w(R$string.f457W2);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static boolean m15508c0(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage().endsWith("zh");
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m15510d0() {
        User userMe_ = e51.D() ? FeedModule.m1140H().me_() : FeedModule.m1140H().queryMe();
        if (userMe_ == null) {
            return false;
        }
        return userMe_.isFemale();
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m15512e0(Moment moment) {
        return (!NullChecker.a(moment) || TEnum.equals(moment.allowForward, MomentAllowForwardState.allow) || TEnum.equals(moment.allowForward, "unknown_")) ? false : true;
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m15514f0(Moment moment) {
        MomentAdditionalData momentAdditionalData;
        MomentShareInfo momentShareInfo;
        return (moment == null || (momentAdditionalData = moment.additionalData) == null || (momentShareInfo = momentAdditionalData.share) == null || momentShareInfo.isMomentShareEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m15516g0(Moment moment) {
        return NullChecker.a(moment) && NullChecker.a(moment.settings) && TEnum.equals(moment.settings.visibility, "selfOnly");
    }

    /* JADX INFO: renamed from: h0 */
    public static boolean m15518h0(Moment moment) {
        return (moment == null || vwb.J(moment.media) || !(moment.media.get(0) instanceof Video)) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public static j760[] m15519i(String str, j760... j760VarArr) {
        j760 j760Var;
        if ("from_group_detail_recommend".equals(str)) {
            j760Var = new j760("circle_detail_tab", "recommend");
        } else {
            j760Var = "from_group_detail_new".equals(str) ? new j760("circle_detail_tab", "new") : null;
        }
        return m15483J(j760Var, j760VarArr);
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m15520i0(int i) {
        return (i == 2 || i == 8) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public static j760[] m15521j(String str, j760... j760VarArr) {
        return m15483J("p_circle_detail".equals(str) ? new j760("circle_detail_tab", "recommend") : null, j760VarArr);
    }

    /* JADX INFO: renamed from: j0 */
    public static boolean m15522j0(int i) {
        User userMe_ = e51.D() ? FeedModule.m1140H().me_() : FeedModule.m1140H().queryMe();
        if (userMe_ == null) {
            return false;
        }
        return !qqi0.h(mqi0.o(), (long) userMe_.createdTime, i);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m15523k() {
        if (nkg.m12213K()) {
            long jLongValue = ((Long) NewPhotoAlbumFrag.f2999n1.get()).longValue();
            int iIntValue = ((Integer) NewPhotoAlbumFrag.f3000o1.get()).intValue();
            int iM15553z = m15553z();
            if (iM15553z <= 0) {
                return false;
            }
            if (jLongValue <= 0 || !DateUtils.isToday(jLongValue)) {
                return true;
            }
            if (DateUtils.isToday(jLongValue) && iIntValue < iM15553z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k0 */
    public static boolean m15524k0(int i) {
        return i == 0 || i == 1 || i == 12 || i == 14 || i == 15 || i == 17 || i == 18;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m15525l(Detect detect, final String str) {
        if (vwb.J(detect.text)) {
            return false;
        }
        ArrayList arrayListN = vwb.n(detect.text, new w9j() { // from class: l.rqg
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("MINOR_LANGUAGES", ((DetectText) obj).type));
            }
        });
        if (vwb.J(arrayListN)) {
            return false;
        }
        vwb.z(arrayListN, new e30() { // from class: l.sqg
            public final void call(Object obj) {
                zvf0.D("e_minor_languages_risk_toast", str, new j760[]{vwb.Y("actor_user_id", FeedModule.m1139F().userId()), vwb.Y("sensitive_text", ((DetectText) obj).value)});
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: l0 */
    public static boolean m15526l0(int i, int i2) {
        return Math.abs(i) > Math.abs((i2 + i) - xdl0.y0());
    }

    /* JADX INFO: renamed from: m */
    public static String m15527m(int i, boolean z) {
        if (!m15508c0(FeedModule.f313a)) {
            return m15547w(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z ? a5i.m8401a(i) : Integer.valueOf(i));
        sb.append(FeedModule.f313a.getString(R$string.f388L));
        return sb.toString();
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m15528m0() {
        return ((Boolean) m15489M().get()).booleanValue();
    }

    /* JADX INFO: renamed from: n */
    public static int m15529n(DoublePair doublePair) {
        com.p1.mobile.putong.location.Location locationQ = qib0.E.q();
        if (doublePair == null || locationQ == null) {
            return 0;
        }
        com.p1.mobile.putong.location.Location location = new com.p1.mobile.putong.location.Location("me");
        location.K(locationQ.u());
        location.M(locationQ.x());
        com.p1.mobile.putong.location.Location location2 = new com.p1.mobile.putong.location.Location("other");
        location2.K(doublePair.first);
        location2.M(doublePair.second);
        return (int) location.r(location2);
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m15530n0(User user) {
        if (NullChecker.a(user)) {
            return user.isTeamAccount();
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static void m15531o(Act act, String str, DetectCategoryType detectCategoryType, String str2, final String str3, final d30 d30Var) {
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = detectCategoryType;
        DetectText detectText = new DetectText();
        detectText.key = str2;
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        act.duringCreated(FeedModule.f316d.m16522P6(detectRequest)).subscribe(mkd0.H(new e30() { // from class: l.tqg
            public final void call(Object obj) {
                vqg.m15507c(d30Var, str3, (Envelope) obj);
            }
        }, new e30() { // from class: l.uqg
            public final void call(Object obj) {
                d30Var.call();
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public static boolean m15532o0(TopicMoment topicMoment, Context context) {
        if (!(context instanceof Activity)) {
            return true;
        }
        Object obj = (Activity) context;
        if (NullChecker.b(topicMoment) && NullChecker.b(obj) && (obj instanceof TopicAggregationAct)) {
            return TextUtils.equals(topicMoment.f708id, ((TopicAggregationAct) obj).m7236Z1());
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public static void m15533p(Act act, String str, final e30<Detect> e30Var) {
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = DetectCategoryType.get("moment");
        DetectText detectText = new DetectText();
        detectText.key = "moment";
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        act.duringCreated(FeedModule.f316d.m16522P6(detectRequest)).subscribe(mkd0.H(new e30() { // from class: l.pqg
            public final void call(Object obj) {
                vqg.m15503a(e30Var, (Envelope) obj);
            }
        }, new e30() { // from class: l.qqg
            public final void call(Object obj) {
                e30Var.call((Object) null);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public static boolean m15534p0(float f, float f2) {
        if (xdl0.y0() > f) {
            return (((float) xdl0.y0()) / f) * f2 > ((float) (xdl0.w0() * 2)) && f2 > ((float) xdl0.w0()) && f2 / f > (((float) xdl0.w0()) / ((float) xdl0.y0())) * 2.0f;
        }
        return f2 > ((float) (xdl0.w0() * 2)) && f2 / f > (((float) xdl0.w0()) / ((float) xdl0.y0())) * 2.0f;
    }

    /* JADX INFO: renamed from: q */
    public static String m15535q(int i) {
        if (i > 99999999) {
            return new DecimalFormat("#.#").format(i / 1.0E8f) + "亿";
        }
        if (i > 9999) {
            return new DecimalFormat("#.#").format(i / 10000.0f) + RXScreenCaptureService.KEY_WIDTH;
        }
        if (i <= 999) {
            return i + "";
        }
        return new DecimalFormat("#.#").format(i / 1000.0f) + "k";
    }

    /* JADX INFO: renamed from: q0 */
    public static boolean m15536q0(User user) {
        Profile profile;
        Moments moments;
        if (user == null || (profile = user.profile) == null || (moments = profile.moments) == null) {
            return false;
        }
        return moments.hidePublicMoments;
    }

    /* JADX INFO: renamed from: r */
    public static String m15537r(int i) {
        if (i <= 10000) {
            return i + "";
        }
        return new DecimalFormat("#.##").format(i / 10000.0f) + RXScreenCaptureService.KEY_WIDTH;
    }

    /* JADX INFO: renamed from: r0 */
    public static boolean m15538r0(String str) {
        User userMe_ = FeedModule.m1140H().me_();
        if (userMe_ == null) {
            return false;
        }
        return ((DbObject) userMe_).id.equals(str);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m15539s(String str) {
        return "from_nearby_falls_feed".equals(str) || "from_discover_dating".equals(str) || "from_discover_discussion".equals(str);
    }

    /* JADX INFO: renamed from: s0 */
    public static boolean m15540s0(Moment moment) {
        return NullChecker.a(moment) && User.isWisdomStar(moment.owner);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m15541t(String str) {
        if ("personal_photo_album".equals(str)) {
            return true;
        }
        if ((w5i.f14412r + "from_like").equals(str)) {
            return true;
        }
        if ((w5i.f14412r + "from_nearby_online").equals(str)) {
            return true;
        }
        if ((w5i.f14412r + "from_nearby_falls_feed").equals(str)) {
            return true;
        }
        if ((w5i.f14412r + "from_nearby_focus").equals(str)) {
            return true;
        }
        if ((w5i.f14412r + "from_discover_dating").equals(str)) {
            return true;
        }
        if ((w5i.f14412r + "from_discover_discussion").equals(str)) {
            return true;
        }
        if ((w5i.f14412r + "from_activity_tab_one").equals(str)) {
            return true;
        }
        if ((w5i.f14412r + "from_activity_tab_two").equals(str)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(w5i.f14412r);
        sb.append("from_poi_aggregation");
        return sb.toString().equals(str);
    }

    /* JADX INFO: renamed from: t0 */
    public static void m15542t0(TopicMoment topicMoment, Context context) {
        m15546v0(topicMoment, context, "from_topic_nearby_header", m15532o0(topicMoment, context));
    }

    /* JADX INFO: renamed from: u */
    public static List<String> m15543u() {
        List<Emotion> list;
        ArrayList arrayList = new ArrayList();
        String str = (String) sti.f13081g.get();
        if (TextUtils.isEmpty(str)) {
            return vwb.f0(new String[0]);
        }
        try {
            List<StateEmotion> array = JSON.parseArray(str, StateEmotion.class);
            if (array == null) {
                return vwb.f0(new String[0]);
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
            CrashHelper.c(e);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static void m15544u0(TopicMoment topicMoment, Context context, String str) {
        m15546v0(topicMoment, context, str, m15532o0(topicMoment, context));
    }

    /* JADX INFO: renamed from: v */
    public static String m15545v(MessageLocation messageLocation) {
        if (!NullChecker.a(messageLocation) || TextUtils.isEmpty(messageLocation.distance)) {
            return "";
        }
        try {
            int iCeil = (int) Math.ceil(Double.parseDouble(messageLocation.distance));
            return iCeil <= 0 ? "" : i0g0.p(iCeil, true);
        } catch (Exception e) {
            CrashHelper.c(e);
            return "1" + FeedModule.f313a.getString(R$string.f326A3);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static void m15546v0(TopicMoment topicMoment, Context context, String str, boolean z) {
        if (topicMoment.isTopicLinkType()) {
            context.startActivity(kjb0.m11458j(context, topicMoment.getTopicNameWithPrefix(), topicMoment.landingPage));
            return;
        }
        if (topicMoment.isTopicVoteType()) {
            context.startActivity(TopicVoteAggregationAct.m7329Y1(context, topicMoment.f708id, topicMoment.owner.f220id, User.ID_TEAM_ACCOUNT, str));
        } else if (topicMoment.isQATopicType()) {
            context.startActivity(QATopicAggregationActivity.m7127V1(context, topicMoment.f708id, str));
        } else {
            context.startActivity(TopicAggregationAct.m7233V1(context, topicMoment.f708id, str, z, zi60.m17436w().m17439E(topicMoment)));
        }
    }

    /* JADX INFO: renamed from: w */
    public static String m15547w(int i) {
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
    public static boolean m15548w0() {
        try {
            String strF = RemoteConfig.x().F("dating_match_config");
            if (TextUtils.isEmpty(strF)) {
                return true;
            }
            return new JSONObject(strF).optBoolean("matchButtonSwitch", true);
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: x */
    public static String m15549x() {
        String strF = RemoteConfig.x().F("like_relation_fuction");
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(strF)) {
            try {
                String strOptString = new JSONObject(strF).optString("greetFuction");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONArray jSONArray = new JSONObject(strOptString).getJSONArray("feed_greet_msg");
                    if (NullChecker.a(jSONArray) && jSONArray.length() > 0) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList.add(jSONArray.getString(i));
                        }
                    }
                }
            } catch (org.json.JSONException unused) {
            }
        }
        if (vwb.J(arrayList)) {
            arrayList.add("你好呀，今天心情不错");
            arrayList.add("在嘛，很想认识你");
        }
        return (String) arrayList.get(new Random().nextInt(arrayList.size()));
    }

    /* JADX INFO: renamed from: x0 */
    public static String m15550x0() {
        try {
            String strF = RemoteConfig.x().F("dating_match_config");
            return !TextUtils.isEmpty(strF) ? new JSONObject(strF).optString("matchButtonName", "配对") : "配对";
        } catch (Exception unused) {
            return "配对";
        }
    }

    /* JADX INFO: renamed from: y */
    public static int m15551y() {
        return t100.d(10.0f);
    }

    /* JADX INFO: renamed from: y0 */
    public static boolean m15552y0() {
        User userMe_ = FeedModule.m1140H().me_();
        if (userMe_ == null) {
            return false;
        }
        userMe_.isBanned();
        return false;
    }

    /* JADX INFO: renamed from: z */
    public static int m15553z() {
        try {
            String strF = RemoteConfig.x().F("like_relation_fuction");
            if (TextUtils.isEmpty(strF)) {
                return 3;
            }
            return Integer.parseInt(new JSONObject(strF).optJSONObject("likeTabFuction").optString("redDotLimitNumbers"));
        } catch (Exception unused) {
            return 3;
        }
    }

    /* JADX INFO: renamed from: z0 */
    public static String m15554z0(User user) {
        if (!ijb0.m10934u(user)) {
            return FeedModule.f313a.getString(R$string.f333B4, mqi0.G(user.location.updatedTime));
        }
        String string = FeedModule.f313a.getString(R$string.f333B4, mqi0.G(FeedModule.m1140H().vn(user)));
        if (!user.isMe()) {
            return string;
        }
        return string + FeedModule.f313a.getString(R$string.f376J);
    }
}
