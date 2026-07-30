package com.p000p1.mobile.putong.feed.p003js.bridge;

import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.data.NavigationIntent;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectAndPostStatusAct;
import com.p000p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p000p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p000p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import com.p000p1.mobile.putong.feed.p003js.bridge.FeedBridgeImplementation;
import java.util.Collection;
import java.util.List;
import l.boq;
import l.e30;
import l.e51;
import l.ef2;
import l.j760;
import l.liq;
import l.mkd0;
import l.qib0;
import l.vwb;
import p007l.nkg;
import p007l.oe40;
import p007l.zi60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedBridgeImplementation extends ef2 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m1849e(boq boqVar) {
        boqVar.c().startActivity(FeedModule.m1140H().toNewMainAct(boqVar.c(), NavigationIntent.get("moment")));
        oe40.m12550O(boqVar.c(), null, "from_h5_moment_level");
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m1850f(boq boqVar) {
        boqVar.c().startActivity(FeedModule.m1140H().toNewMainAct(boqVar.c(), NavigationIntent.get("moment")));
        oe40.m12550O(boqVar.c(), null, "from_h5_moment_level_open_camera");
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m1851g(boq boqVar) {
        if (nkg.m12199A()) {
            FeedSelectAndPostStatusAct.m6960s2(boqVar.c());
        } else {
            FeedSelectStatusAct.m6963D2(boqVar.c());
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m1852h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m1853i(final boq boqVar) {
        boqVar.c().startActivity(FeedModule.m1140H().toNewMainAct(boqVar.c(), NavigationIntent.get("profile")));
        e51.H(boqVar.c(), new Runnable() { // from class: l.mqg
            @Override // java.lang.Runnable
            public final void run() {
                FeedBridgeImplementation.m1851g(boqVar);
            }
        }, 300L);
    }

    @liq(key = "jumpToPostMomentAct")
    public static void jumpToPostMomentAct(final boq boqVar) {
        e51.M(new Runnable() { // from class: l.jqg
            @Override // java.lang.Runnable
            public final void run() {
                FeedBridgeImplementation.m1849e(boqVar);
            }
        });
    }

    @liq(key = "jumpToPostMomentActAndToTakeVideo")
    public static void jumpToPostMomentActAndToTakeVideo(final boq boqVar) {
        e51.M(new Runnable() { // from class: l.gqg
            @Override // java.lang.Runnable
            public final void run() {
                FeedBridgeImplementation.m1850f(boqVar);
            }
        });
    }

    @liq(key = "jumpToStatusPostPage")
    public static void jumpToStatusPostPage(final boq boqVar) {
        e51.M(new Runnable() { // from class: l.lqg
            @Override // java.lang.Runnable
            public final void run() {
                FeedBridgeImplementation.m1853i(boqVar);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m1854j(@NonNull boq boqVar, TopicMoment topicMoment) {
        if (topicMoment.isTopicVoteType()) {
            boqVar.c().startActivity(TopicVoteAggregationAct.m7329Y1(boqVar.c(), topicMoment.f708id, topicMoment.owner.f220id, User.ID_TEAM_ACCOUNT, "fromh5_topic_vote_aggregation"));
        } else if (topicMoment.isQATopicType()) {
            boqVar.c().startActivity(QATopicAggregationActivity.m7127V1(boqVar.c(), topicMoment.f708id, "fromh5_topic_vote_aggregation"));
        } else {
            boqVar.c().startActivity(TopicAggregationAct.m7233V1(boqVar.c(), topicMoment.f708id, "from_h5_topic_aggregation", true, zi60.m17436w().m17439E(topicMoment)));
        }
    }

    @liq(key = "jumpToPostFromShare")
    public void jumpToPostFromShare(@NonNull final boq boqVar, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7) {
        e51.M(new Runnable() { // from class: l.kqg
            @Override // java.lang.Runnable
            public final void run() {
                qib0.b0.d.mo1268cg(boqVar.c(), str, str2, str3, str4, str5, str6, str7, null);
            }
        });
    }

    @liq(key = "jumpToQATopicAggregationAct")
    public void jumpToQATopicAggregationAct(@NonNull boq boqVar, String str) {
        m1856l(boqVar, str);
    }

    @liq(key = "jumpToTopicAggregationAct")
    public void jumpToTopicAggregationAct(@NonNull boq boqVar, String str) {
        m1856l(boqVar, str);
    }

    @liq(key = "jumpToTopicVoteAggregationAct")
    public void jumpToTopicVoteAggregationAct(@NonNull boq boqVar, String str, String str2, String str3) {
        m1856l(boqVar, str);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m1855k(boq boqVar, j760 j760Var) {
        if (vwb.J((Collection) j760Var.b)) {
            return;
        }
        m1854j(boqVar, (TopicMoment) ((List) j760Var.b).get(0));
    }

    /* JADX INFO: renamed from: l */
    public final void m1856l(@NonNull final boq boqVar, String str) {
        boqVar.c().duringCreated(FeedModule.f318f.m9190x0(str)).subscribe(mkd0.H(new e30() { // from class: l.hqg
            public final void call(Object obj) {
                this.f8793a.m1855k(boqVar, (j760) obj);
            }
        }, new e30() { // from class: l.iqg
            public final void call(Object obj) {
                FeedBridgeImplementation.m1852h((Throwable) obj);
            }
        }));
    }
}
