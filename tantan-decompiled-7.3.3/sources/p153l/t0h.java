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
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class t0h extends n570 {

    /* JADX INFO: renamed from: d */
    public jv00 f171523d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedFrag f171524e;

    /* JADX INFO: renamed from: l.t0h$a */
    public class C20203a extends jv00 {
        public C20203a() {
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: a */
        public void mo66886a(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                t0h.this.f140315b.m177165h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: b */
        public void mo104110b(String str, Envelope envelope) {
            t0h.this.f140315b.m177163f(str, envelope);
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: c */
        public void mo66887c(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                t0h.this.f140315b.m177166i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: d */
        public void mo104111d(String str, Envelope envelope) {
            t0h.this.f140315b.m177164g(str, envelope);
        }
    }

    public t0h(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m65552R4());
        this.f171524e = photoAlbumFeedFrag;
        this.f140315b = new qn00(11);
        this.f171523d = new C20203a();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m188744C(Throwable th) {
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m188747F(Throwable th) {
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m188751J(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m188758V(Moment moment) {
        this.f140316c.m65192P4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m188759W(pf60 pf60Var) {
        this.f140316c.m65188B3(pf60Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m188760X(pf60 pf60Var) {
        this.f140316c.m65188B3(pf60Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m188761Y(List list) {
        this.f171524e.m65569k5("p_discover_discussion");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m188762Z(pf60 pf60Var) {
        if (((Boolean) pf60Var.f152157b).booleanValue()) {
            this.f140316c.m65201Y4((String) pf60Var.f152156a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m188763a0(pf60 pf60Var) {
        this.f140316c.m65205c5(pf60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m188764c0(Throwable th) {
        this.f140316c.m65202Z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ void m188765d0(bkj0 bkj0Var) {
        this.f140316c.m65207e5(bkj0Var);
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: A */
    public void mo65689A() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f140314a = System.currentTimeMillis();
        this.f140316c.duringCreated(FeedModule.f39703d.m145624V6(this.f171523d)).subscribe(psd0.m173597H(new y20() { // from class: l.f0h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96679a.m188771b0(jElapsedRealtime, (pf60) obj);
            }
        }, new y20() { // from class: l.k0h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123398a.m188764c0((Throwable) obj);
            }
        }));
        this.f140316c.duringCreated(FeedModule.f39703d.m145748mc("discussion")).subscribe(psd0.m173597H(new y20() { // from class: l.l0h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129564a.m188765d0((bkj0) obj);
            }
        }, new y20() { // from class: l.m0h
            @Override // p153l.y20
            public final void call(Object obj) {
                t0h.m188747F((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public void m188766Q() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121367n0).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.r0h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160632a.m188769T((Moment) obj);
            }
        }));
        this.f140316c.duringCreated(FeedModule.f39703d.f121369o0).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.s0h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165698a.m188770U((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public void m188767R() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121371p0).subscribe(psd0.m173596G(new y20() { // from class: l.i0h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112367a.m188758V((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public void m188768S() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121322Q0).subscribe(psd0.m173596G(new y20() { // from class: l.g0h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101655a.m188759W((pf60) obj);
            }
        }));
        this.f140316c.duringCreated(FeedModule.f39703d.f121326S0).subscribe(psd0.m173596G(new y20() { // from class: l.h0h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107300a.m188760X((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m188769T(Moment moment) {
        this.f140316c.m65189M4(moment);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m188770U(Moment moment) {
        this.f140316c.m65189M4(moment);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m188771b0(long j, pf60 pf60Var) {
        TrackMediaUploadUtil.m81481b0("nearby", SystemClock.elapsedRealtime() - j);
        this.f140316c.m65206d5(pf60Var);
    }

    /* JADX INFO: renamed from: e0 */
    public void m188772e0() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121320P0).subscribe(psd0.m173596G(new y20() { // from class: l.j0h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117825a.m188762Z((pf60) obj);
            }
        }));
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: o */
    public void mo65702o() {
        super.mo65702o();
        m188768S();
        m188766Q();
        m188767R();
        m188772e0();
        this.f140316c.duringCreated(FeedModule.f39703d.m145680d7("p_discover_discussion", "")).subscribe(psd0.m173597H(new y20() { // from class: l.n0h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139628a.m188761Y((List) obj);
            }
        }, new y20() { // from class: l.o0h
            @Override // p153l.y20
            public final void call(Object obj) {
                t0h.m188751J((Throwable) obj);
            }
        }));
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: z */
    public void mo65703z() {
        this.f140314a = System.currentTimeMillis();
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f140316c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f39703d.m145617U6(photoAlbumBaseFrag.m65193Q4(), this.f171523d)).subscribe(psd0.m173597H(new y20() { // from class: l.p0h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150049a.m188763a0((pf60) obj);
            }
        }, new y20() { // from class: l.q0h
            @Override // p153l.y20
            public final void call(Object obj) {
                t0h.m188744C((Throwable) obj);
            }
        }));
    }
}
