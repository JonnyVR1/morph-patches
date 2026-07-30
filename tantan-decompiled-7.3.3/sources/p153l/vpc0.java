package p153l;

import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import java.util.Collection;

/* JADX INFO: loaded from: classes13.dex */
public class vpc0 extends n570 {

    /* JADX INFO: renamed from: d */
    public boolean f185226d;

    /* JADX INFO: renamed from: e */
    public boolean f185227e;

    public vpc0(PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag, boolean z) {
        super(photoAlbumFeedBaseFrag);
        this.f185227e = false;
        this.f185226d = z;
    }

    /* JADX INFO: renamed from: K */
    private void m202214K() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121322Q0).subscribe(psd0.m173596G(new y20() { // from class: l.ppc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153502a.m202222M((pf60) obj);
            }
        }));
        this.f140316c.duringCreated(FeedModule.f39703d.f121326S0).subscribe(psd0.m173596G(new y20() { // from class: l.qpc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158853a.m202215N((pf60) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m202215N(pf60 pf60Var) {
        this.f140316c.m65188B3(pf60Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m202216O(pf60 pf60Var) {
        this.f140316c.m65205c5(pf60Var);
        this.f185227e = !jyb.m147479J((Collection) pf60Var.f152157b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m202217P(Throwable th) {
        this.f140316c.m65202Z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m202218Q(pf60 pf60Var) {
        this.f140316c.m65206d5(pf60Var);
        this.f185227e = !jyb.m147479J((Collection) pf60Var.f152157b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m202219R(Throwable th) {
        this.f140316c.m65202Z4();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: A */
    public void mo65689A() {
        this.f140316c.duringCreated(FeedModule.f39703d.m145644Xc(this.f185226d)).subscribe(psd0.m173597H(new y20() { // from class: l.tpc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175584a.m202218Q((pf60) obj);
            }
        }, new y20() { // from class: l.upc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f180238a.m202219R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public void m202220J() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121371p0).subscribe(psd0.m173596G(new y20() { // from class: l.opc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148435a.m202221L((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m202221L(Moment moment) {
        this.f140316c.m65192P4(moment);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m202222M(pf60 pf60Var) {
        this.f140316c.m65188B3(pf60Var, false);
    }

    /* JADX INFO: renamed from: S */
    public void m202223S() {
        this.f185227e = true;
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: n */
    public boolean mo149058n(Links links) {
        return this.f185227e;
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: o */
    public void mo65702o() {
        super.mo65702o();
        m202220J();
        m202214K();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: z */
    public void mo65703z() {
        this.f140316c.duringCreated(FeedModule.f39703d.m145637Wc(this.f185226d)).subscribe(psd0.m173597H(new y20() { // from class: l.rpc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164351a.m202216O((pf60) obj);
            }
        }, new y20() { // from class: l.spc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170026a.m202217P((Throwable) obj);
            }
        }));
    }
}
