package p153l;

import android.os.SystemClock;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class bg20 extends n570 {

    /* JADX INFO: renamed from: d */
    public jv00 f76562d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedFrag f76563e;

    /* JADX INFO: renamed from: l.bg20$a */
    public class C15983a extends jv00 {
        public C15983a() {
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: a */
        public void mo66886a(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                bg20.this.f140315b.m177165h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: b */
        public void mo104110b(String str, Envelope envelope) {
            bg20.this.f140315b.m177163f(str, envelope);
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: c */
        public void mo66887c(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                bg20.this.f140315b.m177166i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: d */
        public void mo104111d(String str, Envelope envelope) {
            bg20.this.f140315b.m177164g(str, envelope);
        }
    }

    public bg20(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m65552R4());
        this.f76563e = photoAlbumFeedFrag;
        this.f140315b = new qn00(1);
        this.f76562d = new C15983a();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m104088C(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m104098O(Moment moment) {
        this.f140316c.m65192P4(moment);
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: A */
    public void mo65689A() {
        if (this.f76563e.m65554T4() != -1) {
            this.f76563e.m65571n5();
        } else if (pm80.m172919b().f153125a.mo167403f()) {
            if (NullChecker.m82486a(pm80.m172919b().f153125a.m167405l())) {
                this.f140315b.m177166i(pm80.m172919b().f153125a.m167405l());
            }
            m104109X(pm80.m172919b().f153125a.m171089e());
            pm80.m172919b().f153125a.m171088d();
        } else {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f140316c.duringCreated(FeedModule.f39703d.m145713hc(this.f76562d)).subscribe(psd0.m173598I(new y20() { // from class: l.tf20
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f173915a.m104104S(jElapsedRealtime, (pf60) obj);
                }
            }, new y20() { // from class: l.uf20
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f178728a.m104105T((Throwable) obj);
                }
            }, new x20() { // from class: l.vf20
                @Override // p153l.x20
                public final void call() {
                    this.f183876a.m104106U();
                }
            }));
        }
        this.f140316c.duringCreated(FeedModule.f39703d.m145748mc("nearby")).subscribe(psd0.m173597H(new y20() { // from class: l.wf20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188740a.m104107V((bkj0) obj);
            }
        }, new y20() { // from class: l.xf20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193998a.m104108W((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public void m104099M() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121371p0).subscribe(psd0.m173596G(new y20() { // from class: l.yf20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199441a.m104098O((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public void m104100N() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121322Q0).subscribe(psd0.m173596G(new y20() { // from class: l.zf20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204100a.m104101P((pf60) obj);
            }
        }));
        this.f140316c.duringCreated(FeedModule.f39703d.f121326S0).subscribe(psd0.m173596G(new y20() { // from class: l.ag20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71079a.m104102Q((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m104101P(pf60 pf60Var) {
        this.f140316c.m65188B3(pf60Var, false);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m104102Q(pf60 pf60Var) {
        this.f140316c.m65188B3(pf60Var, false);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m104103R(pf60 pf60Var) {
        this.f140316c.m65205c5(pf60Var);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m104104S(long j, pf60 pf60Var) {
        TrackMediaUploadUtil.m81481b0("nearby", SystemClock.elapsedRealtime() - j);
        m104109X(pf60Var);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m104105T(Throwable th) {
        this.f140316c.m65202Z4();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m104106U() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f140316c;
        if (photoAlbumBaseFrag != null && photoAlbumBaseFrag.m65191P0()) {
            this.f140316c.m65214l5(false);
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m104107V(bkj0 bkj0Var) {
        this.f140316c.m65207e5(bkj0Var);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m104108W(Throwable th) {
        this.f140316c.m65202Z4();
    }

    /* JADX INFO: renamed from: X */
    public final void m104109X(pf60<Links, List<Moment>> pf60Var) {
        this.f140316c.m65206d5(pf60Var);
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: o */
    public void mo65702o() {
        super.mo65702o();
        m104100N();
        m104099M();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: z */
    public void mo65703z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f140316c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f39703d.m145699fc(photoAlbumBaseFrag.m65193Q4(), this.f76562d)).subscribe(psd0.m173597H(new y20() { // from class: l.rf20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162758a.m104103R((pf60) obj);
            }
        }, new y20() { // from class: l.sf20
            @Override // p153l.y20
            public final void call(Object obj) {
                bg20.m104088C((Throwable) obj);
            }
        }));
    }
}
