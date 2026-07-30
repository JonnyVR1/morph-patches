package p007l;

import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.PoiLocation;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.j760;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class dnh extends hx60 {

    /* JADX INFO: renamed from: d */
    public PhotoAlbumBaseFrag f7008d;

    /* JADX INFO: renamed from: e */
    public q980 f7009e;

    /* JADX INFO: renamed from: f */
    public an00 f7010f;

    /* JADX INFO: renamed from: g */
    public String f7011g;

    /* JADX INFO: renamed from: h */
    public PoiLocation f7012h;

    /* JADX INFO: renamed from: l.dnh$a */
    public class C2362a extends an00 {
        public C2362a() {
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: a */
        public void mo6842a(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                dnh.this.f8835b.m10607h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: b */
        public void mo8581b(String str, Envelope envelope) {
            dnh.this.f8835b.m10605f(str, envelope);
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: c */
        public void mo6843c(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                dnh.this.f8835b.m10608i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
            dnh.this.f7012h = ((FeedData) envelope.getModuleData(FeedData.class)).location;
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: d */
        public void mo8582d(String str, Envelope envelope) {
            dnh.this.f8835b.m10606g(str, envelope);
        }
    }

    public dnh(PhotoAlbumBaseFrag photoAlbumBaseFrag, q980 q980Var, String str) {
        super(photoAlbumBaseFrag);
        this.f7011g = str;
        this.f7009e = q980Var;
        this.f7008d = photoAlbumBaseFrag;
        this.f8835b = new hf00(16);
        this.f7010f = new C2362a();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m9525F(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m9530M(Moment moment) {
        this.f7008d.m5052P4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m9531O(j760 j760Var) {
        this.f7008d.m5048B3(j760Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m9532P(j760 j760Var) {
        this.f7008d.m5065c5(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m9534R(Throwable th) {
        this.f7008d.m5062Z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void m9533Q(j760<Links, List<Moment>> j760Var) {
        this.f7008d.m5066d5(j760Var);
        if (NullChecker.a(this.f7012h)) {
            this.f7009e.m13495e(this.f7012h);
        }
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: A */
    public void mo5597A() {
        this.f7008d.duringCreated(FeedModule.f316d.m16420Ac(this.f7011g, this.f7010f)).subscribe(mkd0.H(new e30() { // from class: l.bnh
            public final void call(Object obj) {
                this.f6378a.m9533Q((j760) obj);
            }
        }, new e30() { // from class: l.cnh
            public final void call(Object obj) {
                this.f6697a.m9534R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m9536K() {
        this.f7008d.duringCreated(FeedModule.f316d.f14996p0).subscribe(mkd0.G(new e30() { // from class: l.wmh
            public final void call(Object obj) {
                this.f14624a.m9530M((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public void m9537L() {
        this.f7008d.duringCreated(FeedModule.f316d.f14947Q0).subscribe(mkd0.G(new e30() { // from class: l.xmh
            public final void call(Object obj) {
                this.f15044a.m9538N((j760) obj);
            }
        }));
        this.f7008d.duringCreated(FeedModule.f316d.f14951S0).subscribe(mkd0.G(new e30() { // from class: l.ymh
            public final void call(Object obj) {
                this.f15476a.m9531O((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m9538N(j760 j760Var) {
        this.f7008d.m5048B3(j760Var, false);
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: o */
    public void mo5610o() {
        super.mo5610o();
        m9536K();
        m9537L();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: z */
    public void mo5611z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f7008d;
        photoAlbumBaseFrag.duringCreated(FeedModule.f316d.m16782zc(this.f7011g, photoAlbumBaseFrag.m5053Q4(), this.f7010f)).subscribe(mkd0.H(new e30() { // from class: l.zmh
            public final void call(Object obj) {
                this.f15804a.m9532P((j760) obj);
            }
        }, new e30() { // from class: l.anh
            public final void call(Object obj) {
                dnh.m9525F((Throwable) obj);
            }
        }));
    }
}
