package p007l;

import android.os.SystemClock;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.j760;
import l.jo0;
import l.mkd0;
import l.roj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class v9h extends hx60 {

    /* JADX INFO: renamed from: g */
    public static boolean f14112g;

    /* JADX INFO: renamed from: h */
    public static boolean f14113h;

    /* JADX INFO: renamed from: i */
    public static boolean f14114i;

    /* JADX INFO: renamed from: d */
    public an00 f14115d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedFrag f14116e;

    /* JADX INFO: renamed from: f */
    public boolean f14117f;

    /* JADX INFO: renamed from: l.v9h$a */
    public class C2521a extends an00 {
        public C2521a() {
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: a */
        public void mo6842a(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                v9h.this.f8835b.m10607h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: c */
        public void mo6843c(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                v9h.this.f8835b.m10608i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }
    }

    public v9h(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m5443R4());
        this.f14116e = photoAlbumFeedFrag;
        this.f8835b = new hf00(9);
        this.f14115d = new C2521a();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m15373C(Throwable th) {
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m15381K(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m15384P(Moment moment) {
        this.f8836c.m5049M4(moment);
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: A */
    public void mo5597A() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f8836c.duringCreated(FeedModule.f316d.m16492Kb(this.f14115d)).subscribe(mkd0.H(new e30() { // from class: l.k9h
            public final void call(Object obj) {
                this.f9649a.m15393W(jElapsedRealtime, (j760) obj);
            }
        }, new e30() { // from class: l.m9h
            public final void call(Object obj) {
                this.f10361a.m15394X((Throwable) obj);
            }
        }));
        FeedModule.f316d.m16688mc("like");
    }

    /* JADX INFO: renamed from: N */
    public void m15385N() {
        this.f8836c.duringCreated(FeedModule.f316d.f14992n0).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.u9h
            public final void call(Object obj) {
                this.f13602a.m15384P((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m15386O() {
        this.f8836c.duringCreated(FeedModule.f316d.f14996p0).subscribe(mkd0.G(new e30() { // from class: l.t9h
            public final void call(Object obj) {
                this.f13237a.m15387Q((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m15387Q(Moment moment) {
        this.f8836c.m5052P4(moment);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m15388R(j760 j760Var) {
        this.f8836c.m5048B3(j760Var, false);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m15389S(List list) {
        this.f14116e.m5462k5("p_like");
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m15390T(j760 j760Var) {
        if (((Boolean) j760Var.b).booleanValue()) {
            this.f8836c.m5061Y4((String) j760Var.a, true);
        }
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m15391U(j760 j760Var) {
        this.f8836c.m5065c5(j760Var);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m15392V(roj0 roj0Var) {
        if (this.f14117f != FeedModule.m1140H().pq()) {
            this.f14117f = FeedModule.m1140H().pq();
            this.f8836c.m5063a5();
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m15393W(long j, j760 j760Var) {
        TrackMediaUploadUtil.b0("like", SystemClock.elapsedRealtime() - j);
        this.f8836c.m5066d5(j760Var);
        if (f14114i) {
            FeedModule.f316d.m16702oc();
            f14114i = false;
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m15394X(Throwable th) {
        this.f8836c.m5062Z4();
    }

    /* JADX INFO: renamed from: Y */
    public void m15395Y() {
        this.f8836c.duringCreated(FeedModule.f316d.f14945P0).subscribe(mkd0.G(new e30() { // from class: l.s9h
            public final void call(Object obj) {
                this.f12844a.m15390T((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public void m15396Z() {
        this.f8836c.duringCreated(FeedModule.m1140H().wb()).subscribe(mkd0.G(new e30() { // from class: l.l9h
            public final void call(Object obj) {
                this.f9963a.m15392V((roj0) obj);
            }
        }));
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: n */
    public boolean mo10742n(Links links) {
        if (nah.m12132b()) {
            return false;
        }
        return super.mo10742n(links);
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: o */
    public void mo5610o() {
        super.mo5610o();
        m15385N();
        m15386O();
        m15395Y();
        if (nkg.m12211I()) {
            this.f14117f = FeedModule.m1140H().pq();
            m15396Z();
        }
        this.f8836c.duringCreated(FeedModule.f316d.f14951S0).subscribe(mkd0.G(new e30() { // from class: l.n9h
            public final void call(Object obj) {
                this.f10716a.m15388R((j760) obj);
            }
        }));
        this.f8836c.duringCreated(FeedModule.f316d.m16620d7("p_like", "")).subscribe(mkd0.H(new e30() { // from class: l.o9h
            public final void call(Object obj) {
                this.f11395a.m15389S((List) obj);
            }
        }, new e30() { // from class: l.p9h
            public final void call(Object obj) {
                v9h.m15373C((Throwable) obj);
            }
        }));
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: z */
    public void mo5611z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f8836c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f316d.m16485Jb(photoAlbumBaseFrag.m5053Q4(), this.f14115d)).subscribe(mkd0.H(new e30() { // from class: l.q9h
            public final void call(Object obj) {
                this.f12166a.m15391U((j760) obj);
            }
        }, new e30() { // from class: l.r9h
            public final void call(Object obj) {
                v9h.m15381K((Throwable) obj);
            }
        }));
    }
}
