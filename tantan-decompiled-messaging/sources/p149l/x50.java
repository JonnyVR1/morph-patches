package p149l;

import android.os.SystemClock;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class x50 extends hx60 {

    /* JADX INFO: renamed from: d */
    public an00 f191076d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedFrag f191077e;

    /* JADX INFO: renamed from: l.x50$a */
    public class C21035a extends an00 {
        public C21035a() {
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: a */
        public void mo65703a(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                x50.this.f109833b.m130726h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: b */
        public void mo97701b(String str, Envelope envelope) {
            x50.this.f109833b.m130724f(str, envelope);
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: c */
        public void mo65704c(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                x50.this.f109833b.m130727i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: d */
        public void mo97702d(String str, Envelope envelope) {
            x50.this.f109833b.m130725g(str, envelope);
        }
    }

    public x50(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m64369R4());
        this.f191077e = photoAlbumFeedFrag;
        this.f109833b = new hf00(14);
        this.f191076d = new C21035a();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m207048C(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m207056M(Moment moment) {
        this.f109834c.m64009P4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m207057N(j760 j760Var) {
        this.f109834c.m64005B3(j760Var, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m207058O(j760 j760Var) {
        this.f109834c.m64005B3(j760Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m207059Q(j760 j760Var) {
        this.f109834c.m64022c5(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m207060S(Throwable th) {
        this.f109834c.m64019Z4();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: A */
    public void mo64506A() {
        this.f109832a = System.currentTimeMillis();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f109834c.duringCreated(FeedModule.f38855d.m209587y6(this.f191076d, fm20.m122122e(0))).subscribe(mkd0.m154956H(new e30() { // from class: l.r50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157745a.m207064R(jElapsedRealtime, (j760) obj);
            }
        }, new e30() { // from class: l.s50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162477a.m207060S((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m207061K() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193061p0).subscribe(mkd0.m154955G(new e30() { // from class: l.t50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167764a.m207056M((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public void m207062L() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193012Q0).subscribe(mkd0.m154955G(new e30() { // from class: l.p50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147251a.m207057N((j760) obj);
            }
        }));
        this.f109834c.duringCreated(FeedModule.f38855d.f193016S0).subscribe(mkd0.m154955G(new e30() { // from class: l.q50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152691a.m207058O((j760) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m207063P(j760 j760Var) {
        if (((Boolean) j760Var.f116565b).booleanValue()) {
            this.f109834c.m64018Y4((String) j760Var.f116564a, true);
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m207064R(long j, j760 j760Var) {
        TrackMediaUploadUtil.m80298b0("p_discover_dating", SystemClock.elapsedRealtime() - j);
        this.f109834c.m64023d5(j760Var);
    }

    /* JADX INFO: renamed from: T */
    public void m207065T() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193010P0).subscribe(mkd0.m154955G(new e30() { // from class: l.w50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184635a.m207063P((j760) obj);
            }
        }));
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: o */
    public void mo64519o() {
        super.mo64519o();
        m207061K();
        m207065T();
        m207062L();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: z */
    public void mo64520z() {
        this.f109832a = System.currentTimeMillis();
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f109834c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f38855d.m209579x6(photoAlbumBaseFrag.m64010Q4(), this.f191076d, fm20.m122122e(0))).subscribe(mkd0.m154956H(new e30() { // from class: l.u50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174645a.m207059Q((j760) obj);
            }
        }, new e30() { // from class: l.v50
            @Override // p149l.e30
            public final void call(Object obj) {
                x50.m207048C((Throwable) obj);
            }
        }));
    }
}
