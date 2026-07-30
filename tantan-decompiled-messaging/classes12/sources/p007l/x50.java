package p007l;

import android.os.SystemClock;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.j760;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class x50 extends hx60 {

    /* JADX INFO: renamed from: d */
    public an00 f14768d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedFrag f14769e;

    /* JADX INFO: renamed from: l.x50$a */
    public class C2531a extends an00 {
        public C2531a() {
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: a */
        public void mo6842a(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                x50.this.f8835b.m10607h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: b */
        public void mo8581b(String str, Envelope envelope) {
            x50.this.f8835b.m10605f(str, envelope);
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: c */
        public void mo6843c(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                x50.this.f8835b.m10608i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: d */
        public void mo8582d(String str, Envelope envelope) {
            x50.this.f8835b.m10606g(str, envelope);
        }
    }

    public x50(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m5443R4());
        this.f14769e = photoAlbumFeedFrag;
        this.f8835b = new hf00(14);
        this.f14768d = new C2531a();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m16000C(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m16008M(Moment moment) {
        this.f8836c.m5052P4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m16009N(j760 j760Var) {
        this.f8836c.m5048B3(j760Var, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m16010O(j760 j760Var) {
        this.f8836c.m5048B3(j760Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m16011Q(j760 j760Var) {
        this.f8836c.m5065c5(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m16012S(Throwable th) {
        this.f8836c.m5062Z4();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: A */
    public void mo5597A() {
        this.f8834a = System.currentTimeMillis();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f8836c.duringCreated(FeedModule.f316d.m16768y6(this.f14768d, fm20.m10225e(0))).subscribe(mkd0.H(new e30() { // from class: l.r50
            public final void call(Object obj) {
                this.f12484a.m16016R(jElapsedRealtime, (j760) obj);
            }
        }, new e30() { // from class: l.s50
            public final void call(Object obj) {
                this.f12795a.m16012S((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m16013K() {
        this.f8836c.duringCreated(FeedModule.f316d.f14996p0).subscribe(mkd0.G(new e30() { // from class: l.t50
            public final void call(Object obj) {
                this.f13192a.m16008M((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public void m16014L() {
        this.f8836c.duringCreated(FeedModule.f316d.f14947Q0).subscribe(mkd0.G(new e30() { // from class: l.p50
            public final void call(Object obj) {
                this.f11696a.m16009N((j760) obj);
            }
        }));
        this.f8836c.duringCreated(FeedModule.f316d.f14951S0).subscribe(mkd0.G(new e30() { // from class: l.q50
            public final void call(Object obj) {
                this.f12088a.m16010O((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m16015P(j760 j760Var) {
        if (((Boolean) j760Var.b).booleanValue()) {
            this.f8836c.m5061Y4((String) j760Var.a, true);
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m16016R(long j, j760 j760Var) {
        TrackMediaUploadUtil.b0("p_discover_dating", SystemClock.elapsedRealtime() - j);
        this.f8836c.m5066d5(j760Var);
    }

    /* JADX INFO: renamed from: T */
    public void m16017T() {
        this.f8836c.duringCreated(FeedModule.f316d.f14945P0).subscribe(mkd0.G(new e30() { // from class: l.w50
            public final void call(Object obj) {
                this.f14404a.m16015P((j760) obj);
            }
        }));
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: o */
    public void mo5610o() {
        super.mo5610o();
        m16013K();
        m16017T();
        m16014L();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: z */
    public void mo5611z() {
        this.f8834a = System.currentTimeMillis();
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f8836c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f316d.m16760x6(photoAlbumBaseFrag.m5053Q4(), this.f14768d, fm20.m10225e(0))).subscribe(mkd0.H(new e30() { // from class: l.u50
            public final void call(Object obj) {
                this.f13540a.m16011Q((j760) obj);
            }
        }, new e30() { // from class: l.v50
            public final void call(Object obj) {
                x50.m16000C((Throwable) obj);
            }
        }));
    }
}
