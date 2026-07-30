package p153l;

import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.data.ProfileLikeModuleType;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.PersonalFeedInMineFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class hu60 extends n570 {

    /* JADX INFO: renamed from: d */
    public boolean f111617d;

    /* JADX INFO: renamed from: e */
    public n2m f111618e;

    /* JADX INFO: renamed from: f */
    public jv00 f111619f;

    /* JADX INFO: renamed from: g */
    public PersonalFeedInMineFrag f111620g;

    /* JADX INFO: renamed from: l.hu60$a */
    public class C17579a extends jv00 {
        public C17579a() {
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: a */
        public void mo66886a(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                hu60.this.f140315b.m177165h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: c */
        public void mo66887c(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                hu60.this.f140315b.m177166i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }
    }

    public hu60(PutongFrag putongFrag, boolean z, n2m n2mVar) {
        super(n2mVar.mo63214Q0());
        this.f111617d = z;
        this.f111618e = n2mVar;
        this.f140315b = new qn00(4);
        this.f111619f = new C17579a();
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m137117J(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m137122Y(pf60 pf60Var) {
        this.f111618e.mo63210B3(pf60Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m137123b0(pf60 pf60Var) {
        this.f140316c.m65206d5(pf60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m137124c0(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40314) {
            this.f111618e.mo63212N0();
        }
        this.f140316c.m65202Z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m137125e0(Throwable th) {
        this.f111620g.m65660z5(null);
        this.f140316c.m65202Z4();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: A */
    public void mo65689A() {
        String str = this.f140316c.act() instanceof PhotoAlbumFeedAct ? ProfileLikeModuleType.album : "";
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f140316c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f39703d.m145804uc(photoAlbumBaseFrag.m65196T4(), this.f111617d, this.f111619f, str)).subscribe(psd0.m173597H(new y20() { // from class: l.yt60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201489a.m137123b0((pf60) obj);
            }
        }, new y20() { // from class: l.zt60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205941a.m137124c0((Throwable) obj);
            }
        }));
        if (NullChecker.m82486a(this.f111620g) && cmg.m111192T()) {
            this.f140316c.duringCreated(FeedModule.f39703d.m145748mc(ProfileLikeModuleType.album)).subscribe(psd0.m173597H(new y20() { // from class: l.au60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f73471a.m137138d0((bkj0) obj);
                }
            }, new y20() { // from class: l.bu60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f78431a.m137125e0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: O */
    public void m137126O() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121367n0).delay(500L, TimeUnit.MILLISECONDS).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.gu60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106471a.m137132U((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public void m137127P() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121373q0).delay(500L, TimeUnit.MILLISECONDS).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.xt60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196187a.m137133V((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public void m137128Q(PersonalFeedInMineFrag personalFeedInMineFrag) {
        this.f111620g = personalFeedInMineFrag;
    }

    /* JADX INFO: renamed from: R */
    public void m137129R() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121371p0).subscribe(psd0.m173596G(new y20() { // from class: l.cu60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83818a.m137134W((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public void m137130S() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121375r0).subscribe(psd0.m173596G(new y20() { // from class: l.vt60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185692a.m137135X((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m137131T() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121322Q0).subscribe(psd0.m173596G(new y20() { // from class: l.du60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90756a.m137122Y((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m137132U(Moment moment) {
        this.f140316c.m65189M4(moment);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m137133V(Moment moment) {
        this.f140316c.m65189M4(moment);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m137134W(Moment moment) {
        this.f140316c.m65192P4(moment);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m137135X(Moment moment) {
        this.f140316c.m65192P4(moment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m137136Z(pf60 pf60Var) {
        if (((Boolean) pf60Var.f152157b).booleanValue()) {
            this.f140316c.m65201Y4((String) pf60Var.f152156a, false);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m137137a0(pf60 pf60Var) {
        this.f140316c.m65205c5(pf60Var);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m137138d0(bkj0 bkj0Var) {
        this.f140316c.m65207e5(bkj0Var);
    }

    /* JADX INFO: renamed from: f0 */
    public void m137139f0() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121320P0).subscribe(psd0.m173596G(new y20() { // from class: l.wt60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190717a.m137136Z((pf60) obj);
            }
        }));
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: o */
    public void mo65702o() {
        super.mo65702o();
        m137126O();
        m137129R();
        m137127P();
        m137130S();
        m137139f0();
        m137131T();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: z */
    public void mo65703z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f140316c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f39703d.m145790sc(photoAlbumBaseFrag.m65196T4(), this.f140316c.m65193Q4(), this.f111617d, this.f111619f)).subscribe(psd0.m173597H(new y20() { // from class: l.eu60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95845a.m137137a0((pf60) obj);
            }
        }, new y20() { // from class: l.fu60
            @Override // p153l.y20
            public final void call(Object obj) {
                hu60.m137117J((Throwable) obj);
            }
        }));
    }
}
