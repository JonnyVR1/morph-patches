package p007l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.data.NavigationIntent;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectAndPostStatusAct;
import com.p000p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p000p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p000p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.CrashHelper;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import java.util.Collection;
import java.util.List;
import l.e30;
import l.e400;
import l.e51;
import l.f400;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.vwb;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class zbh extends e400 {
    public zbh(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m17286C(Throwable th) {
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m17287D(f400 f400Var) {
        f400Var.c().startActivity(FeedModule.m1140H().toNewMainAct(f400Var.c(), NavigationIntent.get("moment")));
        oe40.m12550O(f400Var.c(), null, "from_h5_moment_level");
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m17288E(f400 f400Var) {
        f400Var.c().startActivity(FeedModule.m1140H().toNewMainAct(f400Var.c(), NavigationIntent.get("moment")));
        oe40.m12550O(f400Var.c(), null, "from_h5_moment_level_open_camera");
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m17289F(final f400 f400Var) {
        f400Var.c().startActivity(FeedModule.m1140H().toNewMainAct(f400Var.c(), NavigationIntent.get("profile")));
        e51.H(f400Var.c(), new Runnable() { // from class: l.ybh
            @Override // java.lang.Runnable
            public final void run() {
                zbh.m17292I(f400Var);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m17292I(f400 f400Var) {
        if (nkg.m12199A()) {
            FeedSelectAndPostStatusAct.m6961u2(f400Var.c(), OMSDialogPositon.p_navigation_view);
        } else {
            FeedSelectStatusAct.m6964E2(f400Var.c(), OMSDialogPositon.p_navigation_view);
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m17293M(final f400 f400Var) {
        e51.M(new Runnable() { // from class: l.wbh
            @Override // java.lang.Runnable
            public final void run() {
                zbh.m17288E(f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final void m17294J(@NonNull f400 f400Var, TopicMoment topicMoment, String str) {
        if (topicMoment.isTopicVoteType()) {
            PutongAct putongActC = f400Var.c();
            PutongAct putongActC2 = f400Var.c();
            String str2 = topicMoment.f708id;
            String str3 = topicMoment.owner.f220id;
            if (TextUtils.isEmpty(str)) {
                str = "fromh5_topic_vote_aggregation";
            }
            putongActC.startActivity(TopicVoteAggregationAct.m7329Y1(putongActC2, str2, str3, User.ID_TEAM_ACCOUNT, str));
            return;
        }
        if (topicMoment.isQATopicType()) {
            PutongAct putongActC3 = f400Var.c();
            PutongAct putongActC4 = f400Var.c();
            String str4 = topicMoment.f708id;
            if (TextUtils.isEmpty(str)) {
                str = "fromh5_topic_vote_aggregation";
            }
            putongActC3.startActivity(QATopicAggregationActivity.m7127V1(putongActC4, str4, str));
            return;
        }
        String strM17439E = zi60.m17436w().m17439E(topicMoment);
        PutongAct putongActC5 = f400Var.c();
        PutongAct putongActC6 = f400Var.c();
        String str5 = topicMoment.f708id;
        if (TextUtils.isEmpty(str)) {
            str = "from_h5_topic_aggregation";
        }
        putongActC5.startActivity(TopicAggregationAct.m7233V1(putongActC6, str5, str, true, strM17439E));
    }

    /* JADX INFO: renamed from: K */
    public void m17295K(@NonNull final f400 f400Var, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7) {
        e51.M(new Runnable() { // from class: l.ubh
            @Override // java.lang.Runnable
            public final void run() {
                qib0.b0.d.mo1268cg(f400Var.c(), str, str2, str3, str4, str5, str6, str7, null);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public void m17296L(final f400 f400Var) {
        e51.M(new Runnable() { // from class: l.xbh
            @Override // java.lang.Runnable
            public final void run() {
                zbh.m17287D(f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public void m17297N(final f400 f400Var) {
        e51.M(new Runnable() { // from class: l.vbh
            @Override // java.lang.Runnable
            public final void run() {
                zbh.m17289F(f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m17298O(f400 f400Var, String str, j760 j760Var) {
        if (vwb.J((Collection) j760Var.b)) {
            return;
        }
        m17294J(f400Var, (TopicMoment) ((List) j760Var.b).get(0), str);
    }

    /* JADX INFO: renamed from: P */
    public final void m17299P(@NonNull final f400 f400Var, String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            lsi0.j("error topicId");
        } else {
            f400Var.c().duringCreated(FeedModule.f318f.m9190x0(str)).subscribe(mkd0.H(new e30() { // from class: l.sbh
                public final void call(Object obj) {
                    this.f12872a.m17298O(f400Var, str2, (j760) obj);
                }
            }, new e30() { // from class: l.tbh
                public final void call(Object obj) {
                    zbh.m17286C((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m17300n(@NonNull @NotNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "jumpToPostMomentActAndToTakeVideo":
                m17293M(f400Var);
                return true;
            case "jumpToPostMomentAct":
                m17296L(f400Var);
                return true;
            case "jumpToTopic":
                try {
                    m17299P(f400Var, jSONObject.getString("topicID"), "");
                    break;
                } catch (Throwable th) {
                    CrashHelper.c(th);
                }
                return true;
            case "jumpToStatusPostPage":
                m17297N(f400Var);
                return true;
            case "jumpToPostFromShare":
                try {
                    m17295K(f400Var, jSONObject.getString("shareName"), jSONObject.getString("shareTitle"), jSONObject.getString("shareDesc"), jSONObject.getString("shareIconUrl"), jSONObject.getString("langdingPage"), jSONObject.getString("testId"), jSONObject.getString("pageSource"));
                    break;
                } catch (Throwable th2) {
                    CrashHelper.c(th2);
                }
                return true;
            default:
                return false;
        }
    }
}
