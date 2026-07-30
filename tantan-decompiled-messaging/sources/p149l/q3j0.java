package p149l;

import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationFeedFrag;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class q3j0 extends hx60 implements n900 {

    /* JADX INFO: renamed from: d */
    public y3j0 f152476d;

    /* JADX INFO: renamed from: e */
    public TopicVoteAggregationFeedFrag f152477e;

    public q3j0(TopicVoteAggregationFeedFrag topicVoteAggregationFeedFrag, y3j0 y3j0Var) {
        super(null);
        this.f152477e = topicVoteAggregationFeedFrag;
        this.f152476d = y3j0Var;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m172873E(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m172875I(j760 j760Var) {
        this.f152477e.m66178Q4(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m172876J(xaj0 xaj0Var) {
        this.f152477e.m66177P4(xaj0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m172877K(Throwable th) {
        this.f152477e.m66176O4(th);
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: A */
    public void mo64506A() {
        TopicVoteAggregationFeedFrag topicVoteAggregationFeedFrag = this.f152477e;
        xia xiaVar = FeedModule.f38855d;
        y3j0 y3j0Var = this.f152476d;
        topicVoteAggregationFeedFrag.duringCreated(xiaVar.m209522od(y3j0Var.f195820d, y3j0Var.f195819c)).subscribe(mkd0.m154956H(new e30() { // from class: l.m3j0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131099a.m172876J((xaj0) obj);
            }
        }, new e30() { // from class: l.n3j0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136997a.m172877K((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G */
    public C22306c<roj0> m172878G(MomentMessage momentMessage) {
        xia xiaVar = FeedModule.f38855d;
        y3j0 y3j0Var = this.f152476d;
        return xiaVar.m209480id(momentMessage, y3j0Var.f195820d, y3j0Var.f195819c);
    }

    /* JADX INFO: renamed from: H */
    public C22306c<MomentMessage> m172879H(MomentMessage momentMessage) {
        xia xiaVar = FeedModule.f38855d;
        y3j0 y3j0Var = this.f152476d;
        return xiaVar.m209487jd(momentMessage, y3j0Var.f195820d, y3j0Var.f195819c);
    }

    @Override // p149l.n900
    /* JADX INFO: renamed from: d */
    public void mo104989d(MomentMessage momentMessage, String str) {
        this.f152477e.m66179R4(momentMessage.owner, str);
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: o */
    public void mo64519o() {
        mo64506A();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: z */
    public void mo64520z() {
        TopicVoteAggregationFeedFrag topicVoteAggregationFeedFrag = this.f152477e;
        xia xiaVar = FeedModule.f38855d;
        y3j0 y3j0Var = this.f152476d;
        topicVoteAggregationFeedFrag.duringCreated(xiaVar.m209515nd(y3j0Var.f195820d, y3j0Var.f195819c, y3j0Var.f195826j)).subscribe(mkd0.m154956H(new e30() { // from class: l.o3j0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141670a.m172875I((j760) obj);
            }
        }, new e30() { // from class: l.p3j0
            @Override // p149l.e30
            public final void call(Object obj) {
                q3j0.m172873E((Throwable) obj);
            }
        }));
    }

    @Override // p149l.n900
    /* JADX INFO: renamed from: a */
    public void mo104987a() {
    }

    @Override // p149l.n900
    /* JADX INFO: renamed from: c */
    public void mo104988c() {
    }

    @Override // p149l.n900
    /* JADX INFO: renamed from: f */
    public void mo104990f() {
    }
}
