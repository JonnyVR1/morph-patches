package p153l;

import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;

/* JADX INFO: loaded from: classes13.dex */
public class fkh extends n570 {

    /* JADX INFO: renamed from: d */
    public jv00 f99508d;

    /* JADX INFO: renamed from: e */
    public String f99509e;

    public fkh(PhotoAlbumBaseFrag photoAlbumBaseFrag, String str) {
        super(photoAlbumBaseFrag);
        this.f99509e = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m125993L(Moment moment) {
        this.f140316c.m65192P4(moment);
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: A */
    public void mo65689A() {
        this.f140316c.duringCreated(FeedModule.f39703d.m145730k8(this.f99508d, "latest", this.f99509e)).subscribe(psd0.m173597H(new y20() { // from class: l.bkh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77077a.m126000Q((pf60) obj);
            }
        }, new y20() { // from class: l.ckh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82283a.m126001R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public void m125994J() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121371p0).subscribe(psd0.m173596G(new y20() { // from class: l.akh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72006a.m125993L((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m125995K() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121322Q0).subscribe(psd0.m173596G(new y20() { // from class: l.ekh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94377a.m125996M((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m125996M(pf60 pf60Var) {
        this.f140316c.m65188B3(pf60Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m125997N(pf60 pf60Var) {
        if (((Boolean) pf60Var.f152157b).booleanValue()) {
            this.f140316c.m65201Y4((String) pf60Var.f152156a, false);
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m125998O(pf60 pf60Var) {
        this.f140316c.m65205c5(pf60Var);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m125999P(Throwable th) {
        this.f140316c.m65202Z4();
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m126000Q(pf60 pf60Var) {
        this.f140316c.m65206d5(pf60Var);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m126001R(Throwable th) {
        this.f140316c.m65202Z4();
    }

    /* JADX INFO: renamed from: S */
    public void m126002S() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121320P0).subscribe(psd0.m173596G(new y20() { // from class: l.dkh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89405a.m125997N((pf60) obj);
            }
        }));
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: o */
    public void mo65702o() {
        super.mo65702o();
        m125994J();
        m125995K();
        m126002S();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: z */
    public void mo65703z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f140316c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f39703d.m145723j8(this.f99508d, "latest", this.f99509e, photoAlbumBaseFrag.m65193Q4())).subscribe(psd0.m173597H(new y20() { // from class: l.yjh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200301a.m125998O((pf60) obj);
            }
        }, new y20() { // from class: l.zjh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204669a.m125999P((Throwable) obj);
            }
        }));
    }
}
