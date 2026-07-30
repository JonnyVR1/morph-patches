package p007l;

import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import l.e30;
import l.j760;
import l.jo0;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class d0u extends hx60 {
    public d0u(PhotoAlbumBaseFrag photoAlbumBaseFrag) {
        super(photoAlbumBaseFrag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m9277P(Moment moment) {
        this.f8836c.m5049M4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m9278R(Moment moment) {
        this.f8836c.m5052P4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m9279T(j760 j760Var) {
        if (((Boolean) j760Var.b).booleanValue()) {
            this.f8836c.m5061Y4((String) j760Var.a, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m9280V(Throwable th) {
        this.f8836c.m5065c5(new j760<>((Object) null, new ArrayList()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m9281X(Throwable th) {
        this.f8836c.m5062Z4();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: A */
    public void mo5597A() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f8836c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f316d.m16506Mb(photoAlbumBaseFrag.m5056T4())).subscribe(mkd0.H(new e30() { // from class: l.a0u
            public final void call(Object obj) {
                this.f5546a.m9289W((j760) obj);
            }
        }, new e30() { // from class: l.b0u
            public final void call(Object obj) {
                this.f5883a.m9281X((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public void m9282L() {
        this.f8836c.duringCreated(FeedModule.f316d.f14992n0).delay(500L, TimeUnit.MILLISECONDS).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.c0u
            public final void call(Object obj) {
                this.f6483a.m9277P((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public void m9283M() {
        this.f8836c.duringCreated(FeedModule.f316d.f14998q0).delay(500L, TimeUnit.MILLISECONDS).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.zzt
            public final void call(Object obj) {
                this.f15976a.m9286Q((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public void m9284N() {
        this.f8836c.duringCreated(FeedModule.f316d.f14996p0).subscribe(mkd0.G(new e30() { // from class: l.uzt
            public final void call(Object obj) {
                this.f14004a.m9278R((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m9285O() {
        this.f8836c.duringCreated(FeedModule.f316d.f15000r0).subscribe(mkd0.G(new e30() { // from class: l.xzt
            public final void call(Object obj) {
                this.f15193a.m9287S((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m9286Q(Moment moment) {
        this.f8836c.m5049M4(moment);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m9287S(Moment moment) {
        this.f8836c.m5052P4(moment);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m9288U(j760 j760Var) {
        this.f8836c.m5065c5(j760Var);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m9289W(j760 j760Var) {
        this.f8836c.m5066d5(j760Var);
    }

    /* JADX INFO: renamed from: Y */
    public void m9290Y() {
        this.f8836c.duringCreated(FeedModule.f316d.f14945P0).subscribe(mkd0.G(new e30() { // from class: l.yzt
            public final void call(Object obj) {
                this.f15545a.m9279T((j760) obj);
            }
        }));
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: o */
    public void mo5610o() {
        super.mo5610o();
        m9282L();
        m9284N();
        m9283M();
        m9285O();
        m9290Y();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: z */
    public void mo5611z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f8836c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f316d.m16499Lb(photoAlbumBaseFrag.m5053Q4())).subscribe(mkd0.H(new e30() { // from class: l.vzt
            public final void call(Object obj) {
                this.f14349a.m9288U((j760) obj);
            }
        }, new e30() { // from class: l.wzt
            public final void call(Object obj) {
                this.f14722a.m9280V((Throwable) obj);
            }
        }));
    }
}
