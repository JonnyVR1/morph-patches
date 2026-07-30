package p007l;

import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationFeedFrag;
import l.e30;
import l.j760;
import l.mkd0;
import l.roj0;
import l.xaj0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class q3j0 extends hx60 implements n900 {

    /* JADX INFO: renamed from: d */
    public y3j0 f12073d;

    /* JADX INFO: renamed from: e */
    public TopicVoteAggregationFeedFrag f12074e;

    public q3j0(TopicVoteAggregationFeedFrag topicVoteAggregationFeedFrag, y3j0 y3j0Var) {
        super(null);
        this.f12074e = topicVoteAggregationFeedFrag;
        this.f12073d = y3j0Var;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m13376E(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m13378I(j760 j760Var) {
        this.f12074e.m7334Q4(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m13379J(xaj0 xaj0Var) {
        this.f12074e.m7333P4(xaj0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m13380K(Throwable th) {
        this.f12074e.m7332O4(th);
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: A */
    public void mo5597A() {
        TopicVoteAggregationFeedFrag topicVoteAggregationFeedFrag = this.f12074e;
        xia xiaVar = FeedModule.f316d;
        y3j0 y3j0Var = this.f12073d;
        topicVoteAggregationFeedFrag.duringCreated(xiaVar.m16703od(y3j0Var.f15236d, y3j0Var.f15235c)).subscribe(mkd0.H(new e30() { // from class: l.m3j0
            public final void call(Object obj) {
                this.f10209a.m13379J((xaj0) obj);
            }
        }, new e30() { // from class: l.n3j0
            public final void call(Object obj) {
                this.f10639a.m13380K((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G */
    public c<roj0> m13381G(MomentMessage momentMessage) {
        xia xiaVar = FeedModule.f316d;
        y3j0 y3j0Var = this.f12073d;
        return xiaVar.m16661id(momentMessage, y3j0Var.f15236d, y3j0Var.f15235c);
    }

    /* JADX INFO: renamed from: H */
    public c<MomentMessage> m13382H(MomentMessage momentMessage) {
        xia xiaVar = FeedModule.f316d;
        y3j0 y3j0Var = this.f12073d;
        return xiaVar.m16668jd(momentMessage, y3j0Var.f15236d, y3j0Var.f15235c);
    }

    @Override // p007l.n900
    /* JADX INFO: renamed from: d */
    public void mo9082d(MomentMessage momentMessage, String str) {
        this.f12074e.m7335R4(momentMessage.owner, str);
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: o */
    public void mo5610o() {
        mo5597A();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: z */
    public void mo5611z() {
        TopicVoteAggregationFeedFrag topicVoteAggregationFeedFrag = this.f12074e;
        xia xiaVar = FeedModule.f316d;
        y3j0 y3j0Var = this.f12073d;
        topicVoteAggregationFeedFrag.duringCreated(xiaVar.m16696nd(y3j0Var.f15236d, y3j0Var.f15235c, y3j0Var.f15242j)).subscribe(mkd0.H(new e30() { // from class: l.o3j0
            public final void call(Object obj) {
                this.f10992a.m13378I((j760) obj);
            }
        }, new e30() { // from class: l.p3j0
            public final void call(Object obj) {
                q3j0.m13376E((Throwable) obj);
            }
        }));
    }

    @Override // p007l.n900
    /* JADX INFO: renamed from: a */
    public void mo9080a() {
    }

    @Override // p007l.n900
    /* JADX INFO: renamed from: c */
    public void mo9081c() {
    }

    @Override // p007l.n900
    /* JADX INFO: renamed from: f */
    public void mo9083f() {
    }
}
