package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectAndPostStatusAct;
import com.p046p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p046p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p046p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import com.tantanapp.common.utils.CrashHelper;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class zbh extends e400 {
    public zbh(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m217838C(Throwable th) {
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m217839D(f400 f400Var) {
        f400Var.mo102961c().startActivity(FeedModule.m60222H().toNewMainAct(f400Var.mo102961c(), NavigationIntent.get("moment")));
        oe40.m163813O(f400Var.mo102961c(), null, "from_h5_moment_level");
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m217840E(f400 f400Var) {
        f400Var.mo102961c().startActivity(FeedModule.m60222H().toNewMainAct(f400Var.mo102961c(), NavigationIntent.get("moment")));
        oe40.m163813O(f400Var.mo102961c(), null, "from_h5_moment_level_open_camera");
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m217841F(final f400 f400Var) {
        f400Var.mo102961c().startActivity(FeedModule.m60222H().toNewMainAct(f400Var.mo102961c(), NavigationIntent.get("profile")));
        e51.m114743H(f400Var.mo102961c(), new Runnable() { // from class: l.ybh
            @Override // java.lang.Runnable
            public final void run() {
                zbh.m217844I(f400Var);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m217844I(f400 f400Var) {
        if (nkg.m159840A()) {
            FeedSelectAndPostStatusAct.m65815u2(f400Var.mo102961c(), OMSDialogPositon.p_navigation_view);
        } else {
            FeedSelectStatusAct.m65818E2(f400Var.mo102961c(), OMSDialogPositon.p_navigation_view);
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m217845M(final f400 f400Var) {
        e51.m114748M(new Runnable() { // from class: l.wbh
            @Override // java.lang.Runnable
            public final void run() {
                zbh.m217840E(f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final void m217846J(@NonNull f400 f400Var, TopicMoment topicMoment, String str) {
        if (topicMoment.isTopicVoteType()) {
            PutongAct putongActMo102961c = f400Var.mo102961c();
            PutongAct putongActMo102961c2 = f400Var.mo102961c();
            String str2 = topicMoment.f39247id;
            String str3 = topicMoment.owner.f38759id;
            if (TextUtils.isEmpty(str)) {
                str = "fromh5_topic_vote_aggregation";
            }
            putongActMo102961c.startActivity(TopicVoteAggregationAct.m66173Y1(putongActMo102961c2, str2, str3, User.ID_TEAM_ACCOUNT, str));
            return;
        }
        if (topicMoment.isQATopicType()) {
            PutongAct putongActMo102961c3 = f400Var.mo102961c();
            PutongAct putongActMo102961c4 = f400Var.mo102961c();
            String str4 = topicMoment.f39247id;
            if (TextUtils.isEmpty(str)) {
                str = "fromh5_topic_vote_aggregation";
            }
            putongActMo102961c3.startActivity(QATopicAggregationActivity.m65975V1(putongActMo102961c4, str4, str));
            return;
        }
        String strM218964E = zi60.m218961w().m218964E(topicMoment);
        PutongAct putongActMo102961c5 = f400Var.mo102961c();
        PutongAct putongActMo102961c6 = f400Var.mo102961c();
        String str5 = topicMoment.f39247id;
        if (TextUtils.isEmpty(str)) {
            str = "from_h5_topic_aggregation";
        }
        putongActMo102961c5.startActivity(TopicAggregationAct.m66081V1(putongActMo102961c6, str5, str, true, strM218964E));
    }

    /* JADX INFO: renamed from: K */
    public void m217847K(@NonNull final f400 f400Var, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7) {
        e51.m114748M(new Runnable() { // from class: l.ubh
            @Override // java.lang.Runnable
            public final void run() {
                qib0.f154713b0.f139233d.mo60342cg(f400Var.mo102961c(), str, str2, str3, str4, str5, str6, str7, null);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public void m217848L(final f400 f400Var) {
        e51.m114748M(new Runnable() { // from class: l.xbh
            @Override // java.lang.Runnable
            public final void run() {
                zbh.m217839D(f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public void m217849N(final f400 f400Var) {
        e51.m114748M(new Runnable() { // from class: l.vbh
            @Override // java.lang.Runnable
            public final void run() {
                zbh.m217841F(f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m217850O(f400 f400Var, String str, j760 j760Var) {
        if (vwb.m200296J((Collection) j760Var.f116565b)) {
            return;
        }
        m217846J(f400Var, (TopicMoment) ((List) j760Var.f116565b).get(0), str);
    }

    /* JADX INFO: renamed from: P */
    public final void m217851P(@NonNull final f400 f400Var, String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            lsi0.m151580j("error topicId");
        } else {
            f400Var.mo102961c().duringCreated(FeedModule.f38857f.m107135x0(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.sbh
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f163537a.m217850O(f400Var, str2, (j760) obj);
                }
            }, new e30() { // from class: l.tbh
                @Override // p149l.e30
                public final void call(Object obj) {
                    zbh.m217838C((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo46640n(@NonNull @NotNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "jumpToPostMomentActAndToTakeVideo":
                m217845M(f400Var);
                return true;
            case "jumpToPostMomentAct":
                m217848L(f400Var);
                return true;
            case "jumpToTopic":
                try {
                    m217851P(f400Var, jSONObject.getString("topicID"), "");
                    break;
                } catch (Throwable th) {
                    CrashHelper.m81296c(th);
                }
                return true;
            case "jumpToStatusPostPage":
                m217849N(f400Var);
                return true;
            case "jumpToPostFromShare":
                try {
                    m217847K(f400Var, jSONObject.getString("shareName"), jSONObject.getString("shareTitle"), jSONObject.getString("shareDesc"), jSONObject.getString("shareIconUrl"), jSONObject.getString("langdingPage"), jSONObject.getString("testId"), jSONObject.getString("pageSource"));
                    break;
                } catch (Throwable th2) {
                    CrashHelper.m81296c(th2);
                }
                return true;
            default:
                return false;
        }
    }
}
