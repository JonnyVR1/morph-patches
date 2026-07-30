package p007l;

import android.os.SystemClock;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.d30;
import l.e30;
import l.j760;
import l.mkd0;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class t720 extends hx60 {

    /* JADX INFO: renamed from: d */
    public an00 f13203d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedFrag f13204e;

    /* JADX INFO: renamed from: l.t720$a */
    public class C2498a extends an00 {
        public C2498a() {
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: a */
        public void mo6842a(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                t720.this.f8835b.m10607h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: b */
        public void mo8581b(String str, Envelope envelope) {
            t720.this.f8835b.m10605f(str, envelope);
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: c */
        public void mo6843c(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                t720.this.f8835b.m10608i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: d */
        public void mo8582d(String str, Envelope envelope) {
            t720.this.f8835b.m10606g(str, envelope);
        }
    }

    public t720(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m5443R4());
        this.f13204e = photoAlbumFeedFrag;
        this.f8835b = new hf00(1);
        this.f13203d = new C2498a();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14438C(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m14448O(Moment moment) {
        this.f8836c.m5052P4(moment);
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: A */
    public void mo5597A() {
        if (this.f13204e.m5445T4() != -1) {
            this.f13204e.m5465n5();
        } else if (je80.m11129b().f9325a.mo8474f()) {
            if (NullChecker.a(je80.m11129b().f9325a.m10423l())) {
                this.f8835b.m10608i(je80.m11129b().f9325a.m10423l());
            }
            m14459X(je80.m11129b().f9325a.m14778e());
            je80.m11129b().f9325a.m14777d();
        } else {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f8836c.duringCreated(FeedModule.f316d.m16653hc(this.f13203d)).subscribe(mkd0.I(new e30() { // from class: l.l720
                public final void call(Object obj) {
                    this.f9908a.m14454S(jElapsedRealtime, (j760) obj);
                }
            }, new e30() { // from class: l.m720
                public final void call(Object obj) {
                    this.f10246a.m14455T((Throwable) obj);
                }
            }, new d30() { // from class: l.n720
                public final void call() {
                    this.f10686a.m14456U();
                }
            }));
        }
        this.f8836c.duringCreated(FeedModule.f316d.m16688mc("nearby")).subscribe(mkd0.H(new e30() { // from class: l.o720
            public final void call(Object obj) {
                this.f11358a.m14457V((xaj0) obj);
            }
        }, new e30() { // from class: l.p720
            public final void call(Object obj) {
                this.f11713a.m14458W((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public void m14449M() {
        this.f8836c.duringCreated(FeedModule.f316d.f14996p0).subscribe(mkd0.G(new e30() { // from class: l.q720
            public final void call(Object obj) {
                this.f12119a.m14448O((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public void m14450N() {
        this.f8836c.duringCreated(FeedModule.f316d.f14947Q0).subscribe(mkd0.G(new e30() { // from class: l.r720
            public final void call(Object obj) {
                this.f12501a.m14451P((j760) obj);
            }
        }));
        this.f8836c.duringCreated(FeedModule.f316d.f14951S0).subscribe(mkd0.G(new e30() { // from class: l.s720
            public final void call(Object obj) {
                this.f12813a.m14452Q((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m14451P(j760 j760Var) {
        this.f8836c.m5048B3(j760Var, false);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m14452Q(j760 j760Var) {
        this.f8836c.m5048B3(j760Var, false);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m14453R(j760 j760Var) {
        this.f8836c.m5065c5(j760Var);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m14454S(long j, j760 j760Var) {
        TrackMediaUploadUtil.b0("nearby", SystemClock.elapsedRealtime() - j);
        m14459X(j760Var);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m14455T(Throwable th) {
        this.f8836c.m5062Z4();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m14456U() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f8836c;
        if (photoAlbumBaseFrag != null && photoAlbumBaseFrag.m5051P0()) {
            this.f8836c.m5076l5(false);
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m14457V(xaj0 xaj0Var) {
        this.f8836c.m5067e5(xaj0Var);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m14458W(Throwable th) {
        this.f8836c.m5062Z4();
    }

    /* JADX INFO: renamed from: X */
    public final void m14459X(j760<Links, List<Moment>> j760Var) {
        this.f8836c.m5066d5(j760Var);
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: o */
    public void mo5610o() {
        super.mo5610o();
        m14450N();
        m14449M();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: z */
    public void mo5611z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f8836c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f316d.m16639fc(photoAlbumBaseFrag.m5053Q4(), this.f13203d)).subscribe(mkd0.H(new e30() { // from class: l.j720
            public final void call(Object obj) {
                this.f9244a.m14453R((j760) obj);
            }
        }, new e30() { // from class: l.k720
            public final void call(Object obj) {
                t720.m14438C((Throwable) obj);
            }
        }));
    }
}
