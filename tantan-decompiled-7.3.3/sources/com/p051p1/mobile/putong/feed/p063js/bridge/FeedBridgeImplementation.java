package com.p051p1.mobile.putong.feed.p063js.bridge;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectAndPostStatusAct;
import com.p051p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p051p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p051p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import com.p051p1.mobile.putong.feed.p063js.bridge.FeedBridgeImplementation;
import java.util.Collection;
import java.util.List;
import p153l.aqq;
import p153l.cmg;
import p153l.cn40;
import p153l.er60;
import p153l.jyb;
import p153l.l51;
import p153l.lf2;
import p153l.lkq;
import p153l.pf60;
import p153l.psd0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedBridgeImplementation extends lf2 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m62107e(aqq aqqVar) {
        aqqVar.mo99543c().startActivity(FeedModule.m61406H().toNewMainAct(aqqVar.mo99543c(), NavigationIntent.get("moment")));
        cn40.m111363O(aqqVar.mo99543c(), null, "from_h5_moment_level");
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m62108f(aqq aqqVar) {
        aqqVar.mo99543c().startActivity(FeedModule.m61406H().toNewMainAct(aqqVar.mo99543c(), NavigationIntent.get("moment")));
        cn40.m111363O(aqqVar.mo99543c(), null, "from_h5_moment_level_open_camera");
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m62109g(aqq aqqVar) {
        if (cmg.m111169A()) {
            FeedSelectAndPostStatusAct.m66997u2(aqqVar.mo99543c());
        } else {
            FeedSelectStatusAct.m67001E2(aqqVar.mo99543c());
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m62110h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m62111i(final aqq aqqVar) {
        aqqVar.mo99543c().startActivity(FeedModule.m61406H().toNewMainAct(aqqVar.mo99543c(), NavigationIntent.get("profile")));
        l51.m152888H(aqqVar.mo99543c(), new Runnable() { // from class: l.bsg
            @Override // java.lang.Runnable
            public final void run() {
                FeedBridgeImplementation.m62109g(aqqVar);
            }
        }, 300L);
    }

    @lkq(key = "jumpToPostMomentAct")
    public static void jumpToPostMomentAct(final aqq aqqVar) {
        l51.m152893M(new Runnable() { // from class: l.yrg
            @Override // java.lang.Runnable
            public final void run() {
                FeedBridgeImplementation.m62107e(aqqVar);
            }
        });
    }

    @lkq(key = "jumpToPostMomentActAndToTakeVideo")
    public static void jumpToPostMomentActAndToTakeVideo(final aqq aqqVar) {
        l51.m152893M(new Runnable() { // from class: l.vrg
            @Override // java.lang.Runnable
            public final void run() {
                FeedBridgeImplementation.m62108f(aqqVar);
            }
        });
    }

    @lkq(key = "jumpToStatusPostPage")
    public static void jumpToStatusPostPage(final aqq aqqVar) {
        l51.m152893M(new Runnable() { // from class: l.asg
            @Override // java.lang.Runnable
            public final void run() {
                FeedBridgeImplementation.m62111i(aqqVar);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m62112j(@NonNull aqq aqqVar, TopicMoment topicMoment) {
        if (topicMoment.isTopicVoteType()) {
            aqqVar.mo99543c().startActivity(TopicVoteAggregationAct.m67356Z1(aqqVar.mo99543c(), topicMoment.f40095id, topicMoment.owner.f39607id, User.ID_TEAM_ACCOUNT, "fromh5_topic_vote_aggregation"));
        } else if (topicMoment.isQATopicType()) {
            aqqVar.mo99543c().startActivity(QATopicAggregationActivity.m67158X1(aqqVar.mo99543c(), topicMoment.f40095id, "fromh5_topic_vote_aggregation"));
        } else {
            aqqVar.mo99543c().startActivity(TopicAggregationAct.m67264X1(aqqVar.mo99543c(), topicMoment.f40095id, "from_h5_topic_aggregation", true, er60.m122104w().m122107E(topicMoment)));
        }
    }

    @lkq(key = "jumpToPostFromShare")
    public void jumpToPostFromShare(@NonNull final aqq aqqVar, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7) {
        l51.m152893M(new Runnable() { // from class: l.zrg
            @Override // java.lang.Runnable
            public final void run() {
                uqb0.f180396b0.f170327d.mo61526cg(aqqVar.mo99543c(), str, str2, str3, str4, str5, str6, str7, null);
            }
        });
    }

    @lkq(key = "jumpToQATopicAggregationAct")
    public void jumpToQATopicAggregationAct(@NonNull aqq aqqVar, String str) {
        m62114l(aqqVar, str);
    }

    @lkq(key = "jumpToTopicAggregationAct")
    public void jumpToTopicAggregationAct(@NonNull aqq aqqVar, String str) {
        m62114l(aqqVar, str);
    }

    @lkq(key = "jumpToTopicVoteAggregationAct")
    public void jumpToTopicVoteAggregationAct(@NonNull aqq aqqVar, String str, String str2, String str3) {
        m62114l(aqqVar, str);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m62113k(aqq aqqVar, pf60 pf60Var) {
        if (jyb.m147479J((Collection) pf60Var.f152157b)) {
            return;
        }
        m62112j(aqqVar, (TopicMoment) ((List) pf60Var.f152157b).get(0));
    }

    /* JADX INFO: renamed from: l */
    public final void m62114l(@NonNull final aqq aqqVar, String str) {
        aqqVar.mo99543c().duringCreated(FeedModule.f39705f.m168000x0(str)).subscribe(psd0.m173597H(new y20() { // from class: l.wrg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190511a.m62113k(aqqVar, (pf60) obj);
            }
        }, new y20() { // from class: l.xrg
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedBridgeImplementation.m62110h((Throwable) obj);
            }
        }));
    }
}
