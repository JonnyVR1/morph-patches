package p007l;

import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.j760;
import l.jo0;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class l7h extends hx60 {

    /* JADX INFO: renamed from: d */
    public an00 f9913d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedFrag f9914e;

    /* JADX INFO: renamed from: l.l7h$a */
    public class C2413a extends an00 {
        public C2413a() {
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: a */
        public void mo6842a(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                l7h.this.f8835b.m10607h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: c */
        public void mo6843c(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                l7h.this.f8835b.m10608i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }
    }

    public l7h(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m5443R4());
        this.f9914e = photoAlbumFeedFrag;
        this.f8835b = new hf00(8);
        this.f9913d = new C2413a();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m11574F(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m11578N(Moment moment) {
        this.f8836c.m5052P4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m11579O(j760 j760Var) {
        this.f8836c.m5048B3(j760Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m11580P(j760 j760Var) {
        this.f8836c.m5065c5(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m11582R(Throwable th) {
        this.f8836c.m5062Z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void m11581Q(j760<Links, List<Moment>> j760Var) {
        this.f8836c.m5066d5(j760Var);
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: A */
    public void mo5597A() {
        this.f8836c.duringCreated(FeedModule.f316d.m16667jc(this.f9913d)).subscribe(mkd0.H(new e30() { // from class: l.j7h
            public final void call(Object obj) {
                this.f9248a.m11581Q((j760) obj);
            }
        }, new e30() { // from class: l.k7h
            public final void call(Object obj) {
                this.f9630a.m11582R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public void m11584J() {
        this.f8836c.duringCreated(FeedModule.f316d.f14992n0).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.i7h
            public final void call(Object obj) {
                this.f8920a.m11587M((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m11585K() {
        this.f8836c.duringCreated(FeedModule.f316d.f14996p0).subscribe(mkd0.G(new e30() { // from class: l.g7h
            public final void call(Object obj) {
                this.f8379a.m11578N((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public void m11586L() {
        this.f8836c.duringCreated(FeedModule.f316d.f14947Q0).subscribe(mkd0.G(new e30() { // from class: l.h7h
            public final void call(Object obj) {
                this.f8613a.m11579O((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m11587M(Moment moment) {
        this.f8836c.m5049M4(moment);
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: o */
    public void mo5610o() {
        super.mo5610o();
        m11586L();
        m11584J();
        m11585K();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: z */
    public void mo5611z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f8836c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f316d.m16660ic(photoAlbumBaseFrag.m5053Q4(), this.f9913d)).subscribe(mkd0.H(new e30() { // from class: l.e7h
            public final void call(Object obj) {
                this.f7244a.m11580P((j760) obj);
            }
        }, new e30() { // from class: l.f7h
            public final void call(Object obj) {
                l7h.m11574F((Throwable) obj);
            }
        }));
    }
}
