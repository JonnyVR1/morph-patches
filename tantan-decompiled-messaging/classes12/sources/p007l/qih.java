package p007l;

import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import l.e30;
import l.j760;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qih extends hx60 {

    /* JADX INFO: renamed from: d */
    public an00 f12252d;

    /* JADX INFO: renamed from: e */
    public String f12253e;

    public qih(PhotoAlbumBaseFrag photoAlbumBaseFrag, String str) {
        super(photoAlbumBaseFrag);
        this.f12253e = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m13576L(Moment moment) {
        this.f8836c.m5052P4(moment);
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: A */
    public void mo5597A() {
        this.f8836c.duringCreated(FeedModule.f316d.m16670k8(this.f12252d, "latest", this.f12253e)).subscribe(mkd0.H(new e30() { // from class: l.mih
            public final void call(Object obj) {
                this.f10475a.m13583Q((j760) obj);
            }
        }, new e30() { // from class: l.nih
            public final void call(Object obj) {
                this.f10812a.m13584R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public void m13577J() {
        this.f8836c.duringCreated(FeedModule.f316d.f14996p0).subscribe(mkd0.G(new e30() { // from class: l.lih
            public final void call(Object obj) {
                this.f10050a.m13576L((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m13578K() {
        this.f8836c.duringCreated(FeedModule.f316d.f14947Q0).subscribe(mkd0.G(new e30() { // from class: l.pih
            public final void call(Object obj) {
                this.f11849a.m13579M((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m13579M(j760 j760Var) {
        this.f8836c.m5048B3(j760Var, false);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m13580N(j760 j760Var) {
        if (((Boolean) j760Var.b).booleanValue()) {
            this.f8836c.m5061Y4((String) j760Var.a, false);
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m13581O(j760 j760Var) {
        this.f8836c.m5065c5(j760Var);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m13582P(Throwable th) {
        this.f8836c.m5062Z4();
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m13583Q(j760 j760Var) {
        this.f8836c.m5066d5(j760Var);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m13584R(Throwable th) {
        this.f8836c.m5062Z4();
    }

    /* JADX INFO: renamed from: S */
    public void m13585S() {
        this.f8836c.duringCreated(FeedModule.f316d.f14945P0).subscribe(mkd0.G(new e30() { // from class: l.oih
            public final void call(Object obj) {
                this.f11488a.m13580N((j760) obj);
            }
        }));
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: o */
    public void mo5610o() {
        super.mo5610o();
        m13577J();
        m13578K();
        m13585S();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: z */
    public void mo5611z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f8836c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f316d.m16663j8(this.f12252d, "latest", this.f12253e, photoAlbumBaseFrag.m5053Q4())).subscribe(mkd0.H(new e30() { // from class: l.jih
            public final void call(Object obj) {
                this.f9374a.m13581O((j760) obj);
            }
        }, new e30() { // from class: l.kih
            public final void call(Object obj) {
                this.f9725a.m13582P((Throwable) obj);
            }
        }));
    }
}
