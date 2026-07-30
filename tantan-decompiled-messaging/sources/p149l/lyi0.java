package p149l;

import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicMomentFragment;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class lyi0 extends hx60 {

    /* JADX INFO: renamed from: d */
    public FeedTopicMomentFragment f130572d;

    /* JADX INFO: renamed from: e */
    public String f130573e;

    /* JADX INFO: renamed from: f */
    public an00 f130574f;

    /* JADX INFO: renamed from: l.lyi0$a */
    public class C18355a extends an00 {
        public C18355a() {
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: a */
        public void mo65703a(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                lyi0.this.f109833b.m130726h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: c */
        public void mo65704c(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                lyi0.this.f109833b.m130727i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }
    }

    public lyi0(FeedTopicMomentFragment feedTopicMomentFragment, String str) {
        super(feedTopicMomentFragment.m66163Q4());
        this.f130572d = feedTopicMomentFragment;
        this.f130573e = str;
        this.f109833b = new hf00(3);
        this.f130574f = new C18355a();
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m152258E(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m152266P(Moment moment) {
        this.f130572d.m66161M4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m152267Q(Moment moment) {
        this.f109834c.m64009P4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m152268R(j760 j760Var) {
        this.f109834c.m64005B3(j760Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m152269T(j760 j760Var) {
        this.f109834c.m64022c5(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m152270V(Throwable th) {
        this.f130572d.m66166T4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m152271W(xaj0 xaj0Var) {
        this.f109834c.m64024e5(xaj0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m152272X(Throwable th) {
        this.f109834c.m64019Z4();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: A */
    public void mo64506A() {
        FeedTopicMomentFragment feedTopicMomentFragment = this.f130572d;
        feedTopicMomentFragment.duringCreated(FeedModule.f38855d.m209466gd(feedTopicMomentFragment.m66165S4(), this.f130574f, this.f130573e)).subscribe(mkd0.m154956H(new e30() { // from class: l.gyi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105019a.m152277U((xaj0) obj);
            }
        }, new e30() { // from class: l.hyi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110121a.m152270V((Throwable) obj);
            }
        }));
        this.f109834c.duringCreated(FeedModule.f38855d.m209514nc("topic", this.f130572d.f43255A.f142496e)).subscribe(mkd0.m154956H(new e30() { // from class: l.iyi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115460a.m152271W((xaj0) obj);
            }
        }, new e30() { // from class: l.jyi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120309a.m152272X((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public void m152273M() {
        this.f130572d.duringCreated(FeedModule.f38855d.f193057n0).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.fyi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99875a.m152266P((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public void m152274N() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193061p0).subscribe(mkd0.m154955G(new e30() { // from class: l.kyi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125310a.m152267Q((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m152275O() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193012Q0).subscribe(mkd0.m154955G(new e30() { // from class: l.byi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77929a.m152268R((j760) obj);
            }
        }));
        this.f109834c.duringCreated(FeedModule.f38855d.f193016S0).subscribe(mkd0.m154955G(new e30() { // from class: l.cyi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82992a.m152276S((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m152276S(j760 j760Var) {
        this.f109834c.m64005B3(j760Var, false);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m152277U(xaj0 xaj0Var) {
        this.f130572d.m66167U4(xaj0Var);
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: o */
    public void mo64519o() {
        super.mo64519o();
        m152273M();
        m152274N();
        m152275O();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: z */
    public void mo64520z() {
        this.f109834c.duringCreated(FeedModule.f38855d.m209459fd(this.f130572d.m66165S4(), this.f109834c.m64010Q4(), this.f130574f, this.f130573e)).subscribe(mkd0.m154956H(new e30() { // from class: l.dyi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88398a.m152269T((j760) obj);
            }
        }, new e30() { // from class: l.eyi0
            @Override // p149l.e30
            public final void call(Object obj) {
                lyi0.m152258E((Throwable) obj);
            }
        }));
    }
}
