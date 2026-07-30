package p153l;

import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationFeedFrag;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class ucj0 extends n570 implements wh00 {

    /* JADX INFO: renamed from: d */
    public cdj0 f178438d;

    /* JADX INFO: renamed from: e */
    public TopicVoteAggregationFeedFrag f178439e;

    public ucj0(TopicVoteAggregationFeedFrag topicVoteAggregationFeedFrag, cdj0 cdj0Var) {
        super(null);
        this.f178439e = topicVoteAggregationFeedFrag;
        this.f178438d = cdj0Var;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m195400E(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m195402I(pf60 pf60Var) {
        this.f178439e.m67361Q4(pf60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m195403J(bkj0 bkj0Var) {
        this.f178439e.m67360P4(bkj0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m195404K(Throwable th) {
        this.f178439e.m67359O4(th);
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: A */
    public void mo65689A() {
        TopicVoteAggregationFeedFrag topicVoteAggregationFeedFrag = this.f178439e;
        jka jkaVar = FeedModule.f39703d;
        cdj0 cdj0Var = this.f178438d;
        topicVoteAggregationFeedFrag.duringCreated(jkaVar.m145763od(cdj0Var.f81227d, cdj0Var.f81226c)).subscribe(psd0.m173597H(new y20() { // from class: l.qcj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156602a.m195403J((bkj0) obj);
            }
        }, new y20() { // from class: l.rcj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162216a.m195404K((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G */
    public C22421c<uxj0> m195405G(MomentMessage momentMessage) {
        jka jkaVar = FeedModule.f39703d;
        cdj0 cdj0Var = this.f178438d;
        return jkaVar.m145721id(momentMessage, cdj0Var.f81227d, cdj0Var.f81226c);
    }

    /* JADX INFO: renamed from: H */
    public C22421c<MomentMessage> m195406H(MomentMessage momentMessage) {
        jka jkaVar = FeedModule.f39703d;
        cdj0 cdj0Var = this.f178438d;
        return jkaVar.m145728jd(momentMessage, cdj0Var.f81227d, cdj0Var.f81226c);
    }

    @Override // p153l.wh00
    /* JADX INFO: renamed from: d */
    public void mo139300d(MomentMessage momentMessage, String str) {
        this.f178439e.m67362R4(momentMessage.owner, str);
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: o */
    public void mo65702o() {
        mo65689A();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: z */
    public void mo65703z() {
        TopicVoteAggregationFeedFrag topicVoteAggregationFeedFrag = this.f178439e;
        jka jkaVar = FeedModule.f39703d;
        cdj0 cdj0Var = this.f178438d;
        topicVoteAggregationFeedFrag.duringCreated(jkaVar.m145756nd(cdj0Var.f81227d, cdj0Var.f81226c, cdj0Var.f81233j)).subscribe(psd0.m173597H(new y20() { // from class: l.scj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167259a.m195402I((pf60) obj);
            }
        }, new y20() { // from class: l.tcj0
            @Override // p153l.y20
            public final void call(Object obj) {
                ucj0.m195400E((Throwable) obj);
            }
        }));
    }

    @Override // p153l.wh00
    /* JADX INFO: renamed from: a */
    public void mo139298a() {
    }

    @Override // p153l.wh00
    /* JADX INFO: renamed from: c */
    public void mo139299c() {
    }

    @Override // p153l.wh00
    /* JADX INFO: renamed from: f */
    public void mo139301f() {
    }
}
