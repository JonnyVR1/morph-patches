package p007l;

import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import java.util.Collection;
import l.e30;
import l.j760;
import l.mkd0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ohc0 extends hx60 {

    /* JADX INFO: renamed from: d */
    public boolean f11482d;

    /* JADX INFO: renamed from: e */
    public boolean f11483e;

    public ohc0(PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag, boolean z) {
        super(photoAlbumFeedBaseFrag);
        this.f11483e = false;
        this.f11482d = z;
    }

    /* JADX INFO: renamed from: K */
    private void m12642K() {
        this.f8836c.duringCreated(FeedModule.f316d.f14947Q0).subscribe(mkd0.G(new e30() { // from class: l.ihc0
            public final void call(Object obj) {
                this.f9017a.m12650M((j760) obj);
            }
        }));
        this.f8836c.duringCreated(FeedModule.f316d.f14951S0).subscribe(mkd0.G(new e30() { // from class: l.jhc0
            public final void call(Object obj) {
                this.f9362a.m12643N((j760) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m12643N(j760 j760Var) {
        this.f8836c.m5048B3(j760Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m12644O(j760 j760Var) {
        this.f8836c.m5065c5(j760Var);
        this.f11483e = !vwb.J((Collection) j760Var.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m12645P(Throwable th) {
        this.f8836c.m5062Z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m12646Q(j760 j760Var) {
        this.f8836c.m5066d5(j760Var);
        this.f11483e = !vwb.J((Collection) j760Var.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m12647R(Throwable th) {
        this.f8836c.m5062Z4();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: A */
    public void mo5597A() {
        this.f8836c.duringCreated(FeedModule.f316d.m16584Xc(this.f11482d)).subscribe(mkd0.H(new e30() { // from class: l.mhc0
            public final void call(Object obj) {
                this.f10471a.m12646Q((j760) obj);
            }
        }, new e30() { // from class: l.nhc0
            public final void call(Object obj) {
                this.f10808a.m12647R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public void m12648J() {
        this.f8836c.duringCreated(FeedModule.f316d.f14996p0).subscribe(mkd0.G(new e30() { // from class: l.hhc0
            public final void call(Object obj) {
                this.f8720a.m12649L((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m12649L(Moment moment) {
        this.f8836c.m5052P4(moment);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m12650M(j760 j760Var) {
        this.f8836c.m5048B3(j760Var, false);
    }

    /* JADX INFO: renamed from: S */
    public void m12651S() {
        this.f11483e = true;
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: n */
    public boolean mo10742n(Links links) {
        return this.f11483e;
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: o */
    public void mo5610o() {
        super.mo5610o();
        m12648J();
        m12642K();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: z */
    public void mo5611z() {
        this.f8836c.duringCreated(FeedModule.f316d.m16577Wc(this.f11482d)).subscribe(mkd0.H(new e30() { // from class: l.khc0
            public final void call(Object obj) {
                this.f9719a.m12644O((j760) obj);
            }
        }, new e30() { // from class: l.lhc0
            public final void call(Object obj) {
                this.f10041a.m12645P((Throwable) obj);
            }
        }));
    }
}
