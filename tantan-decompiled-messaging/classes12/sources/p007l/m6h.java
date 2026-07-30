package p007l;

import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l.e30;
import l.j760;
import l.mkd0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class m6h extends hx60 {

    /* JADX INFO: renamed from: d */
    public an00 f10242d;

    /* JADX INFO: renamed from: e */
    public String f10243e;

    /* JADX INFO: renamed from: f */
    public Moment f10244f;

    public m6h(PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag, String str) {
        super(photoAlbumFeedBaseFrag);
        this.f10243e = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m11822P(j760 j760Var) {
        this.f8836c.m5048B3(j760Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m11823R(j760 j760Var) {
        if (this.f10244f != null) {
            m11828L(j760Var);
        }
        this.f8836c.m5065c5(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m11824S(Throwable th) {
        this.f8836c.m5062Z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m11825T(j760 j760Var) {
        if (this.f10244f != null && j760Var.b != null) {
            m11828L(j760Var);
            ((List) j760Var.b).add(0, this.f10244f);
        }
        this.f8836c.m5066d5(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m11826U(Throwable th) {
        this.f8836c.m5062Z4();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: A */
    public void mo5597A() {
        this.f8836c.duringCreated(FeedModule.f316d.m16670k8(this.f10242d, "recommend", this.f10243e)).subscribe(mkd0.H(new e30() { // from class: l.j6h
            public final void call(Object obj) {
                this.f9240a.m11825T((j760) obj);
            }
        }, new e30() { // from class: l.k6h
            public final void call(Object obj) {
                this.f9623a.m11826U((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m11827K() {
        this.f8836c.duringCreated(FeedModule.f316d.f14996p0).subscribe(mkd0.G(new e30() { // from class: l.f6h
            public final void call(Object obj) {
                this.f7999a.m11830N((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public void m11828L(j760<Links, List<Moment>> j760Var) {
        ArrayList arrayListN = vwb.n((Collection) j760Var.b, new w9j() { // from class: l.l6h
            public final Object call(Object obj) {
                return this.f9905a.m11831O((Moment) obj);
            }
        });
        ((List) j760Var.b).clear();
        ((List) j760Var.b).addAll(arrayListN);
    }

    /* JADX INFO: renamed from: M */
    public void m11829M() {
        this.f8836c.duringCreated(FeedModule.f316d.f14947Q0).subscribe(mkd0.G(new e30() { // from class: l.g6h
            public final void call(Object obj) {
                this.f8370a.m11822P((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m11830N(Moment moment) {
        this.f8836c.m5052P4(moment);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ Boolean m11831O(Moment moment) {
        return Boolean.valueOf(!((DbObject) moment).id.equals(((DbObject) this.f10244f).id));
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m11832Q(j760 j760Var) {
        if (((Boolean) j760Var.b).booleanValue()) {
            this.f8836c.m5061Y4((String) j760Var.a, false);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m11833V() {
        this.f8836c.duringCreated(FeedModule.f316d.f14945P0).subscribe(mkd0.G(new e30() { // from class: l.e6h
            public final void call(Object obj) {
                this.f7231a.m11832Q((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W */
    public void m11834W(String str) {
        this.f10244f = FeedModule.f316d.m16753w7(str);
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: o */
    public void mo5610o() {
        super.mo5610o();
        m11827K();
        m11829M();
        m11833V();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: z */
    public void mo5611z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f8836c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f316d.m16663j8(this.f10242d, "recommend", this.f10243e, photoAlbumBaseFrag.m5053Q4())).subscribe(mkd0.H(new e30() { // from class: l.h6h
            public final void call(Object obj) {
                this.f8606a.m11823R((j760) obj);
            }
        }, new e30() { // from class: l.i6h
            public final void call(Object obj) {
                this.f8915a.m11824S((Throwable) obj);
            }
        }));
    }
}
