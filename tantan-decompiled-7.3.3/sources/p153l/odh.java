package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectAndPostStatusAct;
import com.p051p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p051p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p051p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class odh extends wc00 {
    public odh(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m167297K(Throwable th) {
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m167298L(xc00 xc00Var) {
        xc00Var.mo99543c().startActivity(FeedModule.m61406H().toNewMainAct(xc00Var.mo99543c(), NavigationIntent.get("moment")));
        cn40.m111363O(xc00Var.mo99543c(), null, "from_h5_moment_level");
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m167299M(xc00 xc00Var) {
        xc00Var.mo99543c().startActivity(FeedModule.m61406H().toNewMainAct(xc00Var.mo99543c(), NavigationIntent.get("moment")));
        cn40.m111363O(xc00Var.mo99543c(), null, "from_h5_moment_level_open_camera");
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m167300N(final xc00 xc00Var) {
        xc00Var.mo99543c().startActivity(FeedModule.m61406H().toNewMainAct(xc00Var.mo99543c(), NavigationIntent.get("profile")));
        l51.m152888H(xc00Var.mo99543c(), new Runnable() { // from class: l.ndh
            @Override // java.lang.Runnable
            public final void run() {
                odh.m167303Q(xc00Var);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m167303Q(xc00 xc00Var) {
        if (cmg.m111169A()) {
            FeedSelectAndPostStatusAct.m66998v2(xc00Var.mo99543c(), OMSDialogPositon.p_navigation_view);
        } else {
            FeedSelectStatusAct.m67002F2(xc00Var.mo99543c(), OMSDialogPositon.p_navigation_view);
        }
    }

    /* JADX INFO: renamed from: U */
    public static void m167304U(final xc00 xc00Var) {
        l51.m152893M(new Runnable() { // from class: l.ldh
            @Override // java.lang.Runnable
            public final void run() {
                odh.m167299M(xc00Var);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m167305R(@NonNull xc00 xc00Var, TopicMoment topicMoment, String str) {
        if (topicMoment.isTopicVoteType()) {
            PutongAct putongActMo99543c = xc00Var.mo99543c();
            PutongAct putongActMo99543c2 = xc00Var.mo99543c();
            String str2 = topicMoment.f40095id;
            String str3 = topicMoment.owner.f39607id;
            if (TextUtils.isEmpty(str)) {
                str = "fromh5_topic_vote_aggregation";
            }
            putongActMo99543c.startActivity(TopicVoteAggregationAct.m67356Z1(putongActMo99543c2, str2, str3, User.ID_TEAM_ACCOUNT, str));
            return;
        }
        if (topicMoment.isQATopicType()) {
            PutongAct putongActMo99543c3 = xc00Var.mo99543c();
            PutongAct putongActMo99543c4 = xc00Var.mo99543c();
            String str4 = topicMoment.f40095id;
            if (TextUtils.isEmpty(str)) {
                str = "fromh5_topic_vote_aggregation";
            }
            putongActMo99543c3.startActivity(QATopicAggregationActivity.m67158X1(putongActMo99543c4, str4, str));
            return;
        }
        String strM122107E = er60.m122104w().m122107E(topicMoment);
        PutongAct putongActMo99543c5 = xc00Var.mo99543c();
        PutongAct putongActMo99543c6 = xc00Var.mo99543c();
        String str5 = topicMoment.f40095id;
        if (TextUtils.isEmpty(str)) {
            str = "from_h5_topic_aggregation";
        }
        putongActMo99543c5.startActivity(TopicAggregationAct.m67264X1(putongActMo99543c6, str5, str, true, strM122107E));
    }

    /* JADX INFO: renamed from: S */
    public void m167306S(@NonNull final xc00 xc00Var, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7) {
        l51.m152893M(new Runnable() { // from class: l.jdh
            @Override // java.lang.Runnable
            public final void run() {
                uqb0.f180396b0.f170327d.mo61526cg(xc00Var.mo99543c(), str, str2, str3, str4, str5, str6, str7, null);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public void m167307T(final xc00 xc00Var) {
        l51.m152893M(new Runnable() { // from class: l.mdh
            @Override // java.lang.Runnable
            public final void run() {
                odh.m167298L(xc00Var);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public void m167308V(final xc00 xc00Var) {
        l51.m152893M(new Runnable() { // from class: l.kdh
            @Override // java.lang.Runnable
            public final void run() {
                odh.m167300N(xc00Var);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m167309W(xc00 xc00Var, String str, pf60 pf60Var) {
        if (jyb.m147479J((Collection) pf60Var.f152157b)) {
            return;
        }
        m167305R(xc00Var, (TopicMoment) ((List) pf60Var.f152157b).get(0), str);
    }

    /* JADX INFO: renamed from: X */
    public final void m167310X(@NonNull final xc00 xc00Var, String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            o1j0.m165636j("error topicId");
        } else {
            xc00Var.mo99543c().duringCreated(FeedModule.f39705f.m168000x0(str)).subscribe(psd0.m173597H(new y20() { // from class: l.hdh
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f108998a.m167309W(xc00Var, str2, (pf60) obj);
                }
            }, new y20() { // from class: l.idh
                @Override // p153l.y20
                public final void call(Object obj) {
                    odh.m167297K((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.wc00
    /* JADX INFO: renamed from: v */
    public boolean mo47831v(@NonNull @NotNull xc00 xc00Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "jumpToPostMomentActAndToTakeVideo":
                m167304U(xc00Var);
                return true;
            case "jumpToPostMomentAct":
                m167307T(xc00Var);
                return true;
            case "jumpToTopic":
                try {
                    m167310X(xc00Var, jSONObject.getString("topicID"), "");
                    break;
                } catch (Throwable th) {
                    CrashHelper.m82479c(th);
                }
                return true;
            case "jumpToStatusPostPage":
                m167308V(xc00Var);
                return true;
            case "jumpToPostFromShare":
                try {
                    m167306S(xc00Var, jSONObject.getString("shareName"), jSONObject.getString("shareTitle"), jSONObject.getString("shareDesc"), jSONObject.getString("shareIconUrl"), jSONObject.getString("langdingPage"), jSONObject.getString("testId"), jSONObject.getString("pageSource"));
                    break;
                } catch (Throwable th2) {
                    CrashHelper.m82479c(th2);
                }
                return true;
            default:
                return false;
        }
    }
}
