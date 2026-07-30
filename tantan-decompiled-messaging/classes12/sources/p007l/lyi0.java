package p007l;

import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.SchemeKey;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicMomentFragment;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.j760;
import l.jo0;
import l.mkd0;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class lyi0 extends hx60 {

    /* JADX INFO: renamed from: d */
    public FeedTopicMomentFragment f10162d;

    /* JADX INFO: renamed from: e */
    public String f10163e;

    /* JADX INFO: renamed from: f */
    public an00 f10164f;

    /* JADX INFO: renamed from: l.lyi0$a */
    public class C2423a extends an00 {
        public C2423a() {
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: a */
        public void mo6842a(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                lyi0.this.f8835b.m10607h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: c */
        public void mo6843c(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                lyi0.this.f8835b.m10608i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }
    }

    public lyi0(FeedTopicMomentFragment feedTopicMomentFragment, String str) {
        super(feedTopicMomentFragment.m7315Q4());
        this.f10162d = feedTopicMomentFragment;
        this.f10163e = str;
        this.f8835b = new hf00(3);
        this.f10164f = new C2423a();
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m11725E(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m11733P(Moment moment) {
        this.f10162d.m7313M4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m11734Q(Moment moment) {
        this.f8836c.m5052P4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m11735R(j760 j760Var) {
        this.f8836c.m5048B3(j760Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m11736T(j760 j760Var) {
        this.f8836c.m5065c5(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m11737V(Throwable th) {
        this.f10162d.m7318T4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m11738W(xaj0 xaj0Var) {
        this.f8836c.m5067e5(xaj0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m11739X(Throwable th) {
        this.f8836c.m5062Z4();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: A */
    public void mo5597A() {
        FeedTopicMomentFragment feedTopicMomentFragment = this.f10162d;
        feedTopicMomentFragment.duringCreated(FeedModule.f316d.m16647gd(feedTopicMomentFragment.m7317S4(), this.f10164f, this.f10163e)).subscribe(mkd0.H(new e30() { // from class: l.gyi0
            public final void call(Object obj) {
                this.f8540a.m11744U((xaj0) obj);
            }
        }, new e30() { // from class: l.hyi0
            public final void call(Object obj) {
                this.f8845a.m11737V((Throwable) obj);
            }
        }));
        this.f8836c.duringCreated(FeedModule.f316d.m16695nc(SchemeKey.topic, this.f10162d.f4716A.f11368e)).subscribe(mkd0.H(new e30() { // from class: l.iyi0
            public final void call(Object obj) {
                this.f9163a.m11738W((xaj0) obj);
            }
        }, new e30() { // from class: l.jyi0
            public final void call(Object obj) {
                this.f9554a.m11739X((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public void m11740M() {
        this.f10162d.duringCreated(FeedModule.f316d.f14992n0).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.fyi0
            public final void call(Object obj) {
                this.f8276a.m11733P((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public void m11741N() {
        this.f8836c.duringCreated(FeedModule.f316d.f14996p0).subscribe(mkd0.G(new e30() { // from class: l.kyi0
            public final void call(Object obj) {
                this.f9822a.m11734Q((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m11742O() {
        this.f8836c.duringCreated(FeedModule.f316d.f14947Q0).subscribe(mkd0.G(new e30() { // from class: l.byi0
            public final void call(Object obj) {
                this.f6471a.m11735R((j760) obj);
            }
        }));
        this.f8836c.duringCreated(FeedModule.f316d.f14951S0).subscribe(mkd0.G(new e30() { // from class: l.cyi0
            public final void call(Object obj) {
                this.f6750a.m11743S((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m11743S(j760 j760Var) {
        this.f8836c.m5048B3(j760Var, false);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m11744U(xaj0 xaj0Var) {
        this.f10162d.m7319U4(xaj0Var);
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: o */
    public void mo5610o() {
        super.mo5610o();
        m11740M();
        m11741N();
        m11742O();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: z */
    public void mo5611z() {
        this.f8836c.duringCreated(FeedModule.f316d.m16640fd(this.f10162d.m7317S4(), this.f8836c.m5053Q4(), this.f10164f, this.f10163e)).subscribe(mkd0.H(new e30() { // from class: l.dyi0
            public final void call(Object obj) {
                this.f7086a.m11736T((j760) obj);
            }
        }, new e30() { // from class: l.eyi0
            public final void call(Object obj) {
                lyi0.m11725E((Throwable) obj);
            }
        }));
    }
}
