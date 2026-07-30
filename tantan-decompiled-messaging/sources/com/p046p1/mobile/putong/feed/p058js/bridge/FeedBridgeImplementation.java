package com.p046p1.mobile.putong.feed.p058js.bridge;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectAndPostStatusAct;
import com.p046p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p046p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p046p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import com.p046p1.mobile.putong.feed.p058js.bridge.FeedBridgeImplementation;
import java.util.Collection;
import java.util.List;
import p149l.boq;
import p149l.e30;
import p149l.e51;
import p149l.ef2;
import p149l.j760;
import p149l.liq;
import p149l.mkd0;
import p149l.nkg;
import p149l.oe40;
import p149l.vwb;
import p149l.zi60;

/* JADX INFO: loaded from: classes12.dex */
public class FeedBridgeImplementation extends ef2 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m60923e(boq boqVar) {
        boqVar.mo102961c().startActivity(FeedModule.m60222H().toNewMainAct(boqVar.mo102961c(), NavigationIntent.get("moment")));
        oe40.m163813O(boqVar.mo102961c(), null, "from_h5_moment_level");
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m60924f(boq boqVar) {
        boqVar.mo102961c().startActivity(FeedModule.m60222H().toNewMainAct(boqVar.mo102961c(), NavigationIntent.get("moment")));
        oe40.m163813O(boqVar.mo102961c(), null, "from_h5_moment_level_open_camera");
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m60925g(boq boqVar) {
        if (nkg.m159840A()) {
            FeedSelectAndPostStatusAct.m65814s2(boqVar.mo102961c());
        } else {
            FeedSelectStatusAct.m65817D2(boqVar.mo102961c());
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m60926h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m60927i(final boq boqVar) {
        boqVar.mo102961c().startActivity(FeedModule.m60222H().toNewMainAct(boqVar.mo102961c(), NavigationIntent.get("profile")));
        e51.m114743H(boqVar.mo102961c(), new Runnable() { // from class: l.mqg
            @Override // java.lang.Runnable
            public final void run() {
                FeedBridgeImplementation.m60925g(boqVar);
            }
        }, 300L);
    }

    @liq(key = "jumpToPostMomentAct")
    public static void jumpToPostMomentAct(final boq boqVar) {
        e51.m114748M(new Runnable() { // from class: l.jqg
            @Override // java.lang.Runnable
            public final void run() {
                FeedBridgeImplementation.m60923e(boqVar);
            }
        });
    }

    @liq(key = "jumpToPostMomentActAndToTakeVideo")
    public static void jumpToPostMomentActAndToTakeVideo(final boq boqVar) {
        e51.m114748M(new Runnable() { // from class: l.gqg
            @Override // java.lang.Runnable
            public final void run() {
                FeedBridgeImplementation.m60924f(boqVar);
            }
        });
    }

    @liq(key = "jumpToStatusPostPage")
    public static void jumpToStatusPostPage(final boq boqVar) {
        e51.m114748M(new Runnable() { // from class: l.lqg
            @Override // java.lang.Runnable
            public final void run() {
                FeedBridgeImplementation.m60927i(boqVar);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m60928j(@NonNull boq boqVar, TopicMoment topicMoment) {
        if (topicMoment.isTopicVoteType()) {
            boqVar.mo102961c().startActivity(TopicVoteAggregationAct.m66173Y1(boqVar.mo102961c(), topicMoment.f39247id, topicMoment.owner.f38759id, User.ID_TEAM_ACCOUNT, "fromh5_topic_vote_aggregation"));
        } else if (topicMoment.isQATopicType()) {
            boqVar.mo102961c().startActivity(QATopicAggregationActivity.m65975V1(boqVar.mo102961c(), topicMoment.f39247id, "fromh5_topic_vote_aggregation"));
        } else {
            boqVar.mo102961c().startActivity(TopicAggregationAct.m66081V1(boqVar.mo102961c(), topicMoment.f39247id, "from_h5_topic_aggregation", true, zi60.m218961w().m218964E(topicMoment)));
        }
    }

    @liq(key = "jumpToPostFromShare")
    public void jumpToPostFromShare(@NonNull final boq boqVar, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7) {
        e51.m114748M(new Runnable() { // from class: l.kqg
            @Override // java.lang.Runnable
            public final void run() {
                qib0.f154713b0.f139233d.mo60342cg(boqVar.mo102961c(), str, str2, str3, str4, str5, str6, str7, null);
            }
        });
    }

    @liq(key = "jumpToQATopicAggregationAct")
    public void jumpToQATopicAggregationAct(@NonNull boq boqVar, String str) {
        m60930l(boqVar, str);
    }

    @liq(key = "jumpToTopicAggregationAct")
    public void jumpToTopicAggregationAct(@NonNull boq boqVar, String str) {
        m60930l(boqVar, str);
    }

    @liq(key = "jumpToTopicVoteAggregationAct")
    public void jumpToTopicVoteAggregationAct(@NonNull boq boqVar, String str, String str2, String str3) {
        m60930l(boqVar, str);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m60929k(boq boqVar, j760 j760Var) {
        if (vwb.m200296J((Collection) j760Var.f116565b)) {
            return;
        }
        m60928j(boqVar, (TopicMoment) ((List) j760Var.f116565b).get(0));
    }

    /* JADX INFO: renamed from: l */
    public final void m60930l(@NonNull final boq boqVar, String str) {
        boqVar.mo102961c().duringCreated(FeedModule.f38857f.m107135x0(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.hqg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109054a.m60929k(boqVar, (j760) obj);
            }
        }, new e30() { // from class: l.iqg
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedBridgeImplementation.m60926h((Throwable) obj);
            }
        }));
    }
}
