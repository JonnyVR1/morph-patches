package p149l;

import android.os.SystemClock;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class v9h extends hx60 {

    /* JADX INFO: renamed from: g */
    public static boolean f180641g;

    /* JADX INFO: renamed from: h */
    public static boolean f180642h;

    /* JADX INFO: renamed from: i */
    public static boolean f180643i;

    /* JADX INFO: renamed from: d */
    public an00 f180644d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedFrag f180645e;

    /* JADX INFO: renamed from: f */
    public boolean f180646f;

    /* JADX INFO: renamed from: l.v9h$a */
    public class C20602a extends an00 {
        public C20602a() {
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: a */
        public void mo65703a(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                v9h.this.f109833b.m130726h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: c */
        public void mo65704c(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                v9h.this.f109833b.m130727i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }
    }

    public v9h(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m64369R4());
        this.f180645e = photoAlbumFeedFrag;
        this.f109833b = new hf00(9);
        this.f180644d = new C20602a();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m197550C(Throwable th) {
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m197558K(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m197561P(Moment moment) {
        this.f109834c.m64006M4(moment);
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: A */
    public void mo64506A() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f109834c.duringCreated(FeedModule.f38855d.m209311Kb(this.f180644d)).subscribe(mkd0.m154956H(new e30() { // from class: l.k9h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122011a.m197570W(jElapsedRealtime, (j760) obj);
            }
        }, new e30() { // from class: l.m9h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132776a.m197571X((Throwable) obj);
            }
        }));
        FeedModule.f38855d.m209507mc("like");
    }

    /* JADX INFO: renamed from: N */
    public void m197562N() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193057n0).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.u9h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175265a.m197561P((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m197563O() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193061p0).subscribe(mkd0.m154955G(new e30() { // from class: l.t9h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169028a.m197564Q((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m197564Q(Moment moment) {
        this.f109834c.m64009P4(moment);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m197565R(j760 j760Var) {
        this.f109834c.m64005B3(j760Var, false);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m197566S(List list) {
        this.f180645e.m64386k5("p_like");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m197567T(j760 j760Var) {
        if (((Boolean) j760Var.f116565b).booleanValue()) {
            this.f109834c.m64018Y4((String) j760Var.f116564a, true);
        }
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m197568U(j760 j760Var) {
        this.f109834c.m64022c5(j760Var);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m197569V(roj0 roj0Var) {
        if (this.f180646f != FeedModule.m60222H().mo30807pq()) {
            this.f180646f = FeedModule.m60222H().mo30807pq();
            this.f109834c.m64020a5();
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m197570W(long j, j760 j760Var) {
        TrackMediaUploadUtil.m80298b0("like", SystemClock.elapsedRealtime() - j);
        this.f109834c.m64023d5(j760Var);
        if (f180643i) {
            FeedModule.f38855d.m209521oc();
            f180643i = false;
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m197571X(Throwable th) {
        this.f109834c.m64019Z4();
    }

    /* JADX INFO: renamed from: Y */
    public void m197572Y() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193010P0).subscribe(mkd0.m154955G(new e30() { // from class: l.s9h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163183a.m197567T((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public void m197573Z() {
        this.f109834c.duringCreated(FeedModule.m60222H().mo30834wb()).subscribe(mkd0.m154955G(new e30() { // from class: l.l9h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127118a.m197569V((roj0) obj);
            }
        }));
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: n */
    public boolean mo133307n(Links links) {
        if (nah.m158678b()) {
            return false;
        }
        return super.mo133307n(links);
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: o */
    public void mo64519o() {
        super.mo64519o();
        m197562N();
        m197563O();
        m197572Y();
        if (nkg.m159852I()) {
            this.f180646f = FeedModule.m60222H().mo30807pq();
            m197573Z();
        }
        this.f109834c.duringCreated(FeedModule.f38855d.f193016S0).subscribe(mkd0.m154955G(new e30() { // from class: l.n9h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137806a.m197565R((j760) obj);
            }
        }));
        this.f109834c.duringCreated(FeedModule.f38855d.m209439d7("p_like", "")).subscribe(mkd0.m154956H(new e30() { // from class: l.o9h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142717a.m197566S((List) obj);
            }
        }, new e30() { // from class: l.p9h
            @Override // p149l.e30
            public final void call(Object obj) {
                v9h.m197550C((Throwable) obj);
            }
        }));
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: z */
    public void mo64520z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f109834c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f38855d.m209304Jb(photoAlbumBaseFrag.m64010Q4(), this.f180644d)).subscribe(mkd0.m154956H(new e30() { // from class: l.q9h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153434a.m197568U((j760) obj);
            }
        }, new e30() { // from class: l.r9h
            @Override // p149l.e30
            public final void call(Object obj) {
                v9h.m197558K((Throwable) obj);
            }
        }));
    }
}
