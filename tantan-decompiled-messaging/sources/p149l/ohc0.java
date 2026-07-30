package p149l;

import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import java.util.Collection;

/* JADX INFO: loaded from: classes12.dex */
public class ohc0 extends hx60 {

    /* JADX INFO: renamed from: d */
    public boolean f143962d;

    /* JADX INFO: renamed from: e */
    public boolean f143963e;

    public ohc0(PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag, boolean z) {
        super(photoAlbumFeedBaseFrag);
        this.f143963e = false;
        this.f143962d = z;
    }

    /* JADX INFO: renamed from: K */
    private void m164335K() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193012Q0).subscribe(mkd0.m154955G(new e30() { // from class: l.ihc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113231a.m164343M((j760) obj);
            }
        }));
        this.f109834c.duringCreated(FeedModule.f38855d.f193016S0).subscribe(mkd0.m154955G(new e30() { // from class: l.jhc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117929a.m164336N((j760) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m164336N(j760 j760Var) {
        this.f109834c.m64005B3(j760Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m164337O(j760 j760Var) {
        this.f109834c.m64022c5(j760Var);
        this.f143963e = !vwb.m200296J((Collection) j760Var.f116565b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m164338P(Throwable th) {
        this.f109834c.m64019Z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m164339Q(j760 j760Var) {
        this.f109834c.m64023d5(j760Var);
        this.f143963e = !vwb.m200296J((Collection) j760Var.f116565b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m164340R(Throwable th) {
        this.f109834c.m64019Z4();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: A */
    public void mo64506A() {
        this.f109834c.duringCreated(FeedModule.f38855d.m209403Xc(this.f143962d)).subscribe(mkd0.m154956H(new e30() { // from class: l.mhc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133797a.m164339Q((j760) obj);
            }
        }, new e30() { // from class: l.nhc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138958a.m164340R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public void m164341J() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193061p0).subscribe(mkd0.m154955G(new e30() { // from class: l.hhc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107698a.m164342L((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m164342L(Moment moment) {
        this.f109834c.m64009P4(moment);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m164343M(j760 j760Var) {
        this.f109834c.m64005B3(j760Var, false);
    }

    /* JADX INFO: renamed from: S */
    public void m164344S() {
        this.f143963e = true;
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: n */
    public boolean mo133307n(Links links) {
        return this.f143963e;
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: o */
    public void mo64519o() {
        super.mo64519o();
        m164341J();
        m164335K();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: z */
    public void mo64520z() {
        this.f109834c.duringCreated(FeedModule.f38855d.m209396Wc(this.f143962d)).subscribe(mkd0.m154956H(new e30() { // from class: l.khc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123132a.m164337O((j760) obj);
            }
        }, new e30() { // from class: l.lhc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128091a.m164338P((Throwable) obj);
            }
        }));
    }
}
