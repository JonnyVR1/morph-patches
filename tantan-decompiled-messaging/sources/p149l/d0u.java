package p149l;

import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class d0u extends hx60 {
    public d0u(PhotoAlbumBaseFrag photoAlbumBaseFrag) {
        super(photoAlbumBaseFrag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m109540P(Moment moment) {
        this.f109834c.m64006M4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m109541R(Moment moment) {
        this.f109834c.m64009P4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m109542T(j760 j760Var) {
        if (((Boolean) j760Var.f116565b).booleanValue()) {
            this.f109834c.m64018Y4((String) j760Var.f116564a, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m109543V(Throwable th) {
        this.f109834c.m64022c5(new j760<>(null, new ArrayList()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m109544X(Throwable th) {
        this.f109834c.m64019Z4();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: A */
    public void mo64506A() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f109834c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f38855d.m209325Mb(photoAlbumBaseFrag.m64013T4())).subscribe(mkd0.m154956H(new e30() { // from class: l.a0u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67070a.m109552W((j760) obj);
            }
        }, new e30() { // from class: l.b0u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72461a.m109544X((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public void m109545L() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193057n0).delay(500L, TimeUnit.MILLISECONDS).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.c0u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f78178a.m109540P((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public void m109546M() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193063q0).delay(500L, TimeUnit.MILLISECONDS).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.zzt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205826a.m109549Q((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public void m109547N() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193061p0).subscribe(mkd0.m154955G(new e30() { // from class: l.uzt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179035a.m109541R((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m109548O() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193065r0).subscribe(mkd0.m154955G(new e30() { // from class: l.xzt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195227a.m109550S((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m109549Q(Moment moment) {
        this.f109834c.m64006M4(moment);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m109550S(Moment moment) {
        this.f109834c.m64009P4(moment);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m109551U(j760 j760Var) {
        this.f109834c.m64022c5(j760Var);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m109552W(j760 j760Var) {
        this.f109834c.m64023d5(j760Var);
    }

    /* JADX INFO: renamed from: Y */
    public void m109553Y() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193010P0).subscribe(mkd0.m154955G(new e30() { // from class: l.yzt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200910a.m109542T((j760) obj);
            }
        }));
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: o */
    public void mo64519o() {
        super.mo64519o();
        m109545L();
        m109547N();
        m109546M();
        m109548O();
        m109553Y();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: z */
    public void mo64520z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f109834c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f38855d.m209318Lb(photoAlbumBaseFrag.m64010Q4())).subscribe(mkd0.m154956H(new e30() { // from class: l.vzt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183665a.m109551U((j760) obj);
            }
        }, new e30() { // from class: l.wzt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188762a.m109543V((Throwable) obj);
            }
        }));
    }
}
