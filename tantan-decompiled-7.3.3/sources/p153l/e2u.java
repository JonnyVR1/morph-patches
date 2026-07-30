package p153l;

import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class e2u extends n570 {
    public e2u(PhotoAlbumBaseFrag photoAlbumBaseFrag) {
        super(photoAlbumBaseFrag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m119175P(Moment moment) {
        this.f140316c.m65189M4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m119176R(Moment moment) {
        this.f140316c.m65192P4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m119177T(pf60 pf60Var) {
        if (((Boolean) pf60Var.f152157b).booleanValue()) {
            this.f140316c.m65201Y4((String) pf60Var.f152156a, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m119178V(Throwable th) {
        this.f140316c.m65205c5(new pf60<>(null, new ArrayList()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m119179X(Throwable th) {
        this.f140316c.m65202Z4();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: A */
    public void mo65689A() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f140316c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f39703d.m145566Mb(photoAlbumBaseFrag.m65196T4())).subscribe(psd0.m173597H(new y20() { // from class: l.b2u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74670a.m119187W((pf60) obj);
            }
        }, new y20() { // from class: l.c2u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79520a.m119179X((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public void m119180L() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121367n0).delay(500L, TimeUnit.MILLISECONDS).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.d2u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84820a.m119175P((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public void m119181M() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121373q0).delay(500L, TimeUnit.MILLISECONDS).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.a2u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68217a.m119184Q((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public void m119182N() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121371p0).subscribe(psd0.m173596G(new y20() { // from class: l.v1u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182017a.m119176R((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m119183O() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121375r0).subscribe(psd0.m173596G(new y20() { // from class: l.y1u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197134a.m119185S((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m119184Q(Moment moment) {
        this.f140316c.m65189M4(moment);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m119185S(Moment moment) {
        this.f140316c.m65192P4(moment);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m119186U(pf60 pf60Var) {
        this.f140316c.m65205c5(pf60Var);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m119187W(pf60 pf60Var) {
        this.f140316c.m65206d5(pf60Var);
    }

    /* JADX INFO: renamed from: Y */
    public void m119188Y() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121320P0).subscribe(psd0.m173596G(new y20() { // from class: l.z1u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202600a.m119177T((pf60) obj);
            }
        }));
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: o */
    public void mo65702o() {
        super.mo65702o();
        m119180L();
        m119182N();
        m119181M();
        m119183O();
        m119188Y();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: z */
    public void mo65703z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f140316c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f39703d.m145559Lb(photoAlbumBaseFrag.m65193Q4())).subscribe(psd0.m173597H(new y20() { // from class: l.w1u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186840a.m119186U((pf60) obj);
            }
        }, new y20() { // from class: l.x1u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192096a.m119178V((Throwable) obj);
            }
        }));
    }
}
