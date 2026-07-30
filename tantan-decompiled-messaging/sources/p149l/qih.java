package p149l;

import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;

/* JADX INFO: loaded from: classes12.dex */
public class qih extends hx60 {

    /* JADX INFO: renamed from: d */
    public an00 f154770d;

    /* JADX INFO: renamed from: e */
    public String f154771e;

    public qih(PhotoAlbumBaseFrag photoAlbumBaseFrag, String str) {
        super(photoAlbumBaseFrag);
        this.f154771e = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m174886L(Moment moment) {
        this.f109834c.m64009P4(moment);
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: A */
    public void mo64506A() {
        this.f109834c.duringCreated(FeedModule.f38855d.m209489k8(this.f154770d, "latest", this.f154771e)).subscribe(mkd0.m154956H(new e30() { // from class: l.mih
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133973a.m174893Q((j760) obj);
            }
        }, new e30() { // from class: l.nih
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139099a.m174894R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public void m174887J() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193061p0).subscribe(mkd0.m154955G(new e30() { // from class: l.lih
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128212a.m174886L((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m174888K() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193012Q0).subscribe(mkd0.m154955G(new e30() { // from class: l.pih
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f149558a.m174889M((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m174889M(j760 j760Var) {
        this.f109834c.m64005B3(j760Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m174890N(j760 j760Var) {
        if (((Boolean) j760Var.f116565b).booleanValue()) {
            this.f109834c.m64018Y4((String) j760Var.f116564a, false);
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m174891O(j760 j760Var) {
        this.f109834c.m64022c5(j760Var);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m174892P(Throwable th) {
        this.f109834c.m64019Z4();
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m174893Q(j760 j760Var) {
        this.f109834c.m64023d5(j760Var);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m174894R(Throwable th) {
        this.f109834c.m64019Z4();
    }

    /* JADX INFO: renamed from: S */
    public void m174895S() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193010P0).subscribe(mkd0.m154955G(new e30() { // from class: l.oih
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144122a.m174890N((j760) obj);
            }
        }));
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: o */
    public void mo64519o() {
        super.mo64519o();
        m174887J();
        m174888K();
        m174895S();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: z */
    public void mo64520z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f109834c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f38855d.m209482j8(this.f154770d, "latest", this.f154771e, photoAlbumBaseFrag.m64010Q4())).subscribe(mkd0.m154956H(new e30() { // from class: l.jih
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118103a.m174891O((j760) obj);
            }
        }, new e30() { // from class: l.kih
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123337a.m174892P((Throwable) obj);
            }
        }));
    }
}
