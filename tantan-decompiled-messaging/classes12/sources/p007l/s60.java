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
public class s60 extends hx60 {

    /* JADX INFO: renamed from: d */
    public an00 f12800d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedFrag f12801e;

    /* JADX INFO: renamed from: l.s60$a */
    public class C2481a extends an00 {
        public C2481a() {
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: a */
        public void mo6842a(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                s60.this.f8835b.m10607h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: b */
        public void mo8581b(String str, Envelope envelope) {
            s60.this.f8835b.m10605f(str, envelope);
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: c */
        public void mo6843c(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                s60.this.f8835b.m10608i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: d */
        public void mo8582d(String str, Envelope envelope) {
            s60.this.f8835b.m10606g(str, envelope);
        }
    }

    public s60(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m5443R4());
        this.f12801e = photoAlbumFeedFrag;
        this.f8835b = new hf00(14);
        this.f12800d = new C2481a();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m14009F(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m14014M(Moment moment) {
        this.f8836c.m5052P4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m14015N(j760 j760Var) {
        this.f8836c.m5048B3(j760Var, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m14016O(j760 j760Var) {
        this.f8836c.m5048B3(j760Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m14017P(j760 j760Var) {
        if (((Boolean) j760Var.b).booleanValue()) {
            this.f8836c.m5061Y4((String) j760Var.a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m14018Q(j760 j760Var) {
        this.f8836c.m5065c5(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m14019R(long j, j760 j760Var) {
        TrackMediaUploadUtil.b0("p_discover_dating", SystemClock.elapsedRealtime() - j);
        this.f8836c.m5066d5(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m14020S(Throwable th) {
        this.f8836c.m5062Z4();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: A */
    public void mo5597A() {
        this.f8834a = System.currentTimeMillis();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f8836c.duringCreated(FeedModule.f316d.m16768y6(this.f12800d, fm20.m10225e(1))).subscribe(mkd0.H(new e30() { // from class: l.q60
            public final void call(Object obj) {
                this.f12112a.m14019R(jElapsedRealtime, (j760) obj);
            }
        }, new e30() { // from class: l.r60
            public final void call(Object obj) {
                this.f12492a.m14020S((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m14021K() {
        this.f8836c.duringCreated(FeedModule.f316d.f14996p0).subscribe(mkd0.G(new e30() { // from class: l.o60
            public final void call(Object obj) {
                this.f11011a.m14014M((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public void m14022L() {
        this.f8836c.duringCreated(FeedModule.f316d.f14947Q0).subscribe(mkd0.G(new e30() { // from class: l.k60
            public final void call(Object obj) {
                this.f9619a.m14015N((j760) obj);
            }
        }));
        this.f8836c.duringCreated(FeedModule.f316d.f14951S0).subscribe(mkd0.G(new e30() { // from class: l.l60
            public final void call(Object obj) {
                this.f9902a.m14016O((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m14023T() {
        this.f8836c.duringCreated(FeedModule.f316d.f14945P0).subscribe(mkd0.G(new e30() { // from class: l.p60
            public final void call(Object obj) {
                this.f11701a.m14017P((j760) obj);
            }
        }));
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: o */
    public void mo5610o() {
        super.mo5610o();
        m14021K();
        m14023T();
        m14022L();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: z */
    public void mo5611z() {
        this.f8834a = System.currentTimeMillis();
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f8836c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f316d.m16760x6(photoAlbumBaseFrag.m5053Q4(), this.f12800d, fm20.m10225e(1))).subscribe(mkd0.H(new e30() { // from class: l.m60
            public final void call(Object obj) {
                this.f10240a.m14018Q((j760) obj);
            }
        }, new e30() { // from class: l.n60
            public final void call(Object obj) {
                s60.m14009F((Throwable) obj);
            }
        }));
    }
}
