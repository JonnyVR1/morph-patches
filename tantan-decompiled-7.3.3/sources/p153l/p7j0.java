package p153l;

import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicMomentFragment;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class p7j0 extends n570 {

    /* JADX INFO: renamed from: d */
    public FeedTopicMomentFragment f150941d;

    /* JADX INFO: renamed from: e */
    public String f150942e;

    /* JADX INFO: renamed from: f */
    public jv00 f150943f;

    /* JADX INFO: renamed from: l.p7j0$a */
    public class C19320a extends jv00 {
        public C19320a() {
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: a */
        public void mo66886a(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                p7j0.this.f140315b.m177165h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: c */
        public void mo66887c(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                p7j0.this.f140315b.m177166i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }
    }

    public p7j0(FeedTopicMomentFragment feedTopicMomentFragment, String str) {
        super(feedTopicMomentFragment.m67346Q4());
        this.f150941d = feedTopicMomentFragment;
        this.f150942e = str;
        this.f140315b = new qn00(3);
        this.f150943f = new C19320a();
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m171135E(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m171143P(Moment moment) {
        this.f150941d.m67344M4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m171144Q(Moment moment) {
        this.f140316c.m65192P4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m171145R(pf60 pf60Var) {
        this.f140316c.m65188B3(pf60Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m171146T(pf60 pf60Var) {
        this.f140316c.m65205c5(pf60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m171147V(Throwable th) {
        this.f150941d.m67349T4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m171148W(bkj0 bkj0Var) {
        this.f140316c.m65207e5(bkj0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m171149X(Throwable th) {
        this.f140316c.m65202Z4();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: A */
    public void mo65689A() {
        FeedTopicMomentFragment feedTopicMomentFragment = this.f150941d;
        feedTopicMomentFragment.duringCreated(FeedModule.f39703d.m145707gd(feedTopicMomentFragment.m67348S4(), this.f150943f, this.f150942e)).subscribe(psd0.m173597H(new y20() { // from class: l.k7j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124270a.m171154U((bkj0) obj);
            }
        }, new y20() { // from class: l.l7j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130365a.m171147V((Throwable) obj);
            }
        }));
        this.f140316c.duringCreated(FeedModule.f39703d.m145755nc("topic", this.f150941d.f44103A.f85781e)).subscribe(psd0.m173597H(new y20() { // from class: l.m7j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135084a.m171148W((bkj0) obj);
            }
        }, new y20() { // from class: l.n7j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140610a.m171149X((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public void m171150M() {
        this.f150941d.duringCreated(FeedModule.f39703d.f121367n0).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.j7j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118690a.m171143P((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public void m171151N() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121371p0).subscribe(psd0.m173596G(new y20() { // from class: l.o7j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145278a.m171144Q((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m171152O() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121322Q0).subscribe(psd0.m173596G(new y20() { // from class: l.f7j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97572a.m171145R((pf60) obj);
            }
        }));
        this.f140316c.duringCreated(FeedModule.f39703d.f121326S0).subscribe(psd0.m173596G(new y20() { // from class: l.g7j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102589a.m171153S((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m171153S(pf60 pf60Var) {
        this.f140316c.m65188B3(pf60Var, false);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m171154U(bkj0 bkj0Var) {
        this.f150941d.m67350U4(bkj0Var);
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: o */
    public void mo65702o() {
        super.mo65702o();
        m171150M();
        m171151N();
        m171152O();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: z */
    public void mo65703z() {
        this.f140316c.duringCreated(FeedModule.f39703d.m145700fd(this.f150941d.m67348S4(), this.f140316c.m65193Q4(), this.f150943f, this.f150942e)).subscribe(psd0.m173597H(new y20() { // from class: l.h7j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108131a.m171146T((pf60) obj);
            }
        }, new y20() { // from class: l.i7j0
            @Override // p153l.y20
            public final void call(Object obj) {
                p7j0.m171135E((Throwable) obj);
            }
        }));
    }
}
