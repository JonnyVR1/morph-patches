package p153l;

import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class b8h extends n570 {

    /* JADX INFO: renamed from: d */
    public jv00 f75429d;

    /* JADX INFO: renamed from: e */
    public String f75430e;

    /* JADX INFO: renamed from: f */
    public Moment f75431f;

    public b8h(PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag, String str) {
        super(photoAlbumFeedBaseFrag);
        this.f75430e = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m102986P(pf60 pf60Var) {
        this.f140316c.m65188B3(pf60Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m102987R(pf60 pf60Var) {
        if (this.f75431f != null) {
            m102992L(pf60Var);
        }
        this.f140316c.m65205c5(pf60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m102988S(Throwable th) {
        this.f140316c.m65202Z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m102989T(pf60 pf60Var) {
        if (this.f75431f != null && pf60Var.f152157b != 0) {
            m102992L(pf60Var);
            ((List) pf60Var.f152157b).add(0, this.f75431f);
        }
        this.f140316c.m65206d5(pf60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m102990U(Throwable th) {
        this.f140316c.m65202Z4();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: A */
    public void mo65689A() {
        this.f140316c.duringCreated(FeedModule.f39703d.m145730k8(this.f75429d, "recommend", this.f75430e)).subscribe(psd0.m173597H(new y20() { // from class: l.y7h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197780a.m102989T((pf60) obj);
            }
        }, new y20() { // from class: l.z7h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203245a.m102990U((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m102991K() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121371p0).subscribe(psd0.m173596G(new y20() { // from class: l.u7h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177903a.m102994N((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public void m102992L(pf60<Links, List<Moment>> pf60Var) {
        ArrayList arrayListM147522n = jyb.m147522n(pf60Var.f152157b, new qcj() { // from class: l.a8h
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f68921a.m102995O((Moment) obj);
            }
        });
        pf60Var.f152157b.clear();
        pf60Var.f152157b.addAll(arrayListM147522n);
    }

    /* JADX INFO: renamed from: M */
    public void m102993M() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121322Q0).subscribe(psd0.m173596G(new y20() { // from class: l.v7h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182773a.m102986P((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m102994N(Moment moment) {
        this.f140316c.m65192P4(moment);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ Boolean m102995O(Moment moment) {
        return Boolean.valueOf(!moment.f56859id.equals(this.f75431f.f56859id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m102996Q(pf60 pf60Var) {
        if (((Boolean) pf60Var.f152157b).booleanValue()) {
            this.f140316c.m65201Y4((String) pf60Var.f152156a, false);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m102997V() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121320P0).subscribe(psd0.m173596G(new y20() { // from class: l.t7h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172430a.m102996Q((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W */
    public void m102998W(String str) {
        this.f75431f = FeedModule.f39703d.m145813w7(str);
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: o */
    public void mo65702o() {
        super.mo65702o();
        m102991K();
        m102993M();
        m102997V();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: z */
    public void mo65703z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f140316c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f39703d.m145723j8(this.f75429d, "recommend", this.f75430e, photoAlbumBaseFrag.m65193Q4())).subscribe(psd0.m173597H(new y20() { // from class: l.w7h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187748a.m102987R((pf60) obj);
            }
        }, new y20() { // from class: l.x7h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192719a.m102988S((Throwable) obj);
            }
        }));
    }
}
