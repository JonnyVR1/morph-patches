package p153l;

import android.os.SystemClock;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class t50 extends n570 {

    /* JADX INFO: renamed from: d */
    public jv00 f172165d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedFrag f172166e;

    /* JADX INFO: renamed from: l.t50$a */
    public class C20238a extends jv00 {
        public C20238a() {
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: a */
        public void mo66886a(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                t50.this.f140315b.m177165h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: b */
        public void mo104110b(String str, Envelope envelope) {
            t50.this.f140315b.m177163f(str, envelope);
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: c */
        public void mo66887c(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                t50.this.f140315b.m177166i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: d */
        public void mo104111d(String str, Envelope envelope) {
            t50.this.f140315b.m177164g(str, envelope);
        }
    }

    public t50(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m65552R4());
        this.f172166e = photoAlbumFeedFrag;
        this.f140315b = new qn00(14);
        this.f172165d = new C20238a();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m189355C(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m189363M(Moment moment) {
        this.f140316c.m65192P4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m189364N(pf60 pf60Var) {
        this.f140316c.m65188B3(pf60Var, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m189365O(pf60 pf60Var) {
        this.f140316c.m65188B3(pf60Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m189366Q(pf60 pf60Var) {
        this.f140316c.m65205c5(pf60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m189367S(Throwable th) {
        this.f140316c.m65202Z4();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: A */
    public void mo65689A() {
        this.f140314a = System.currentTimeMillis();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f140316c.duringCreated(FeedModule.f39703d.m145828y6(this.f172165d, pu20.m173810e(0))).subscribe(psd0.m173597H(new y20() { // from class: l.n50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140271a.m189371R(jElapsedRealtime, (pf60) obj);
            }
        }, new y20() { // from class: l.o50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145024a.m189367S((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m189368K() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121371p0).subscribe(psd0.m173596G(new y20() { // from class: l.p50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150585a.m189363M((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public void m189369L() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121322Q0).subscribe(psd0.m173596G(new y20() { // from class: l.l50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130050a.m189364N((pf60) obj);
            }
        }));
        this.f140316c.duringCreated(FeedModule.f39703d.f121326S0).subscribe(psd0.m173596G(new y20() { // from class: l.m50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134847a.m189365O((pf60) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m189370P(pf60 pf60Var) {
        if (((Boolean) pf60Var.f152157b).booleanValue()) {
            this.f140316c.m65201Y4((String) pf60Var.f152156a, true);
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m189371R(long j, pf60 pf60Var) {
        TrackMediaUploadUtil.m81481b0("p_discover_dating", SystemClock.elapsedRealtime() - j);
        this.f140316c.m65206d5(pf60Var);
    }

    /* JADX INFO: renamed from: T */
    public void m189372T() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121320P0).subscribe(psd0.m173596G(new y20() { // from class: l.s50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166305a.m189370P((pf60) obj);
            }
        }));
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: o */
    public void mo65702o() {
        super.mo65702o();
        m189368K();
        m189372T();
        m189369L();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: z */
    public void mo65703z() {
        this.f140314a = System.currentTimeMillis();
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f140316c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f39703d.m145820x6(photoAlbumBaseFrag.m65193Q4(), this.f172165d, pu20.m173810e(0))).subscribe(psd0.m173597H(new y20() { // from class: l.q50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155642a.m189366Q((pf60) obj);
            }
        }, new y20() { // from class: l.r50
            @Override // p153l.y20
            public final void call(Object obj) {
                t50.m189355C((Throwable) obj);
            }
        }));
    }
}
