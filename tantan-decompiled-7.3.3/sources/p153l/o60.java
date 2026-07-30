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
public class o60 extends n570 {

    /* JADX INFO: renamed from: d */
    public jv00 f145126d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedFrag f145127e;

    /* JADX INFO: renamed from: l.o60$a */
    public class C19038a extends jv00 {
        public C19038a() {
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: a */
        public void mo66886a(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                o60.this.f140315b.m177165h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: b */
        public void mo104110b(String str, Envelope envelope) {
            o60.this.f140315b.m177163f(str, envelope);
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: c */
        public void mo66887c(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                o60.this.f140315b.m177166i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: d */
        public void mo104111d(String str, Envelope envelope) {
            o60.this.f140315b.m177164g(str, envelope);
        }
    }

    public o60(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m65552R4());
        this.f145127e = photoAlbumFeedFrag;
        this.f140315b = new qn00(14);
        this.f145126d = new C19038a();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m166186F(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m166191M(Moment moment) {
        this.f140316c.m65192P4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m166192N(pf60 pf60Var) {
        this.f140316c.m65188B3(pf60Var, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m166193O(pf60 pf60Var) {
        this.f140316c.m65188B3(pf60Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m166194P(pf60 pf60Var) {
        if (((Boolean) pf60Var.f152157b).booleanValue()) {
            this.f140316c.m65201Y4((String) pf60Var.f152156a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m166195Q(pf60 pf60Var) {
        this.f140316c.m65205c5(pf60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m166196R(long j, pf60 pf60Var) {
        TrackMediaUploadUtil.m81481b0("p_discover_dating", SystemClock.elapsedRealtime() - j);
        this.f140316c.m65206d5(pf60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m166197S(Throwable th) {
        this.f140316c.m65202Z4();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: A */
    public void mo65689A() {
        this.f140314a = System.currentTimeMillis();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f140316c.duringCreated(FeedModule.f39703d.m145828y6(this.f145126d, pu20.m173810e(1))).subscribe(psd0.m173597H(new y20() { // from class: l.m60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134957a.m166196R(jElapsedRealtime, (pf60) obj);
            }
        }, new y20() { // from class: l.n60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140413a.m166197S((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m166198K() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121371p0).subscribe(psd0.m173596G(new y20() { // from class: l.k60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124148a.m166191M((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public void m166199L() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121322Q0).subscribe(psd0.m173596G(new y20() { // from class: l.g60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102369a.m166192N((pf60) obj);
            }
        }));
        this.f140316c.duringCreated(FeedModule.f39703d.f121326S0).subscribe(psd0.m173596G(new y20() { // from class: l.h60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107996a.m166193O((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m166200T() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121320P0).subscribe(psd0.m173596G(new y20() { // from class: l.l60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130219a.m166194P((pf60) obj);
            }
        }));
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: o */
    public void mo65702o() {
        super.mo65702o();
        m166198K();
        m166200T();
        m166199L();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: z */
    public void mo65703z() {
        this.f140314a = System.currentTimeMillis();
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f140316c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f39703d.m145820x6(photoAlbumBaseFrag.m65193Q4(), this.f145126d, pu20.m173810e(1))).subscribe(psd0.m173597H(new y20() { // from class: l.i60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113127a.m166195Q((pf60) obj);
            }
        }, new y20() { // from class: l.j60
            @Override // p153l.y20
            public final void call(Object obj) {
                o60.m166186F((Throwable) obj);
            }
        }));
    }
}
