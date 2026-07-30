package p149l;

import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class l7h extends hx60 {

    /* JADX INFO: renamed from: d */
    public an00 f126723d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedFrag f126724e;

    /* JADX INFO: renamed from: l.l7h$a */
    public class C18157a extends an00 {
        public C18157a() {
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: a */
        public void mo65703a(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                l7h.this.f109833b.m130726h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: c */
        public void mo65704c(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                l7h.this.f109833b.m130727i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }
    }

    public l7h(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m64369R4());
        this.f126724e = photoAlbumFeedFrag;
        this.f109833b = new hf00(8);
        this.f126723d = new C18157a();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m148792F(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m148796N(Moment moment) {
        this.f109834c.m64009P4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m148797O(j760 j760Var) {
        this.f109834c.m64005B3(j760Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m148798P(j760 j760Var) {
        this.f109834c.m64022c5(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m148800R(Throwable th) {
        this.f109834c.m64019Z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void m148799Q(j760<Links, List<Moment>> j760Var) {
        this.f109834c.m64023d5(j760Var);
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: A */
    public void mo64506A() {
        this.f109834c.duringCreated(FeedModule.f38855d.m209486jc(this.f126723d)).subscribe(mkd0.m154956H(new e30() { // from class: l.j7h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116597a.m148799Q((j760) obj);
            }
        }, new e30() { // from class: l.k7h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121578a.m148800R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public void m148802J() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193057n0).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.i7h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111884a.m148805M((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m148803K() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193061p0).subscribe(mkd0.m154955G(new e30() { // from class: l.g7h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101381a.m148796N((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public void m148804L() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193012Q0).subscribe(mkd0.m154955G(new e30() { // from class: l.h7h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106276a.m148797O((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m148805M(Moment moment) {
        this.f109834c.m64006M4(moment);
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: o */
    public void mo64519o() {
        super.mo64519o();
        m148804L();
        m148802J();
        m148803K();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: z */
    public void mo64520z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f109834c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f38855d.m209479ic(photoAlbumBaseFrag.m64010Q4(), this.f126723d)).subscribe(mkd0.m154956H(new e30() { // from class: l.e7h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89709a.m148798P((j760) obj);
            }
        }, new e30() { // from class: l.f7h
            @Override // p149l.e30
            public final void call(Object obj) {
                l7h.m148792F((Throwable) obj);
            }
        }));
    }
}
