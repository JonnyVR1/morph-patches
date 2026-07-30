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
public class s60 extends hx60 {

    /* JADX INFO: renamed from: d */
    public an00 f162605d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedFrag f162606e;

    /* JADX INFO: renamed from: l.s60$a */
    public class C19864a extends an00 {
        public C19864a() {
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: a */
        public void mo65703a(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                s60.this.f109833b.m130726h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: b */
        public void mo97701b(String str, Envelope envelope) {
            s60.this.f109833b.m130724f(str, envelope);
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: c */
        public void mo65704c(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                s60.this.f109833b.m130727i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: d */
        public void mo97702d(String str, Envelope envelope) {
            s60.this.f109833b.m130725g(str, envelope);
        }
    }

    public s60(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m64369R4());
        this.f162606e = photoAlbumFeedFrag;
        this.f109833b = new hf00(14);
        this.f162605d = new C19864a();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m182389F(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m182394M(Moment moment) {
        this.f109834c.m64009P4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m182395N(j760 j760Var) {
        this.f109834c.m64005B3(j760Var, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m182396O(j760 j760Var) {
        this.f109834c.m64005B3(j760Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m182397P(j760 j760Var) {
        if (((Boolean) j760Var.f116565b).booleanValue()) {
            this.f109834c.m64018Y4((String) j760Var.f116564a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m182398Q(j760 j760Var) {
        this.f109834c.m64022c5(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m182399R(long j, j760 j760Var) {
        TrackMediaUploadUtil.m80298b0("p_discover_dating", SystemClock.elapsedRealtime() - j);
        this.f109834c.m64023d5(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m182400S(Throwable th) {
        this.f109834c.m64019Z4();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: A */
    public void mo64506A() {
        this.f109832a = System.currentTimeMillis();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f109834c.duringCreated(FeedModule.f38855d.m209587y6(this.f162605d, fm20.m122122e(1))).subscribe(mkd0.m154956H(new e30() { // from class: l.q60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152842a.m182399R(jElapsedRealtime, (j760) obj);
            }
        }, new e30() { // from class: l.r60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157881a.m182400S((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m182401K() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193061p0).subscribe(mkd0.m154955G(new e30() { // from class: l.o60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141965a.m182394M((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public void m182402L() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193012Q0).subscribe(mkd0.m154955G(new e30() { // from class: l.k60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121255a.m182395N((j760) obj);
            }
        }));
        this.f109834c.duringCreated(FeedModule.f38855d.f193016S0).subscribe(mkd0.m154955G(new e30() { // from class: l.l60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126225a.m182396O((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m182403T() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193010P0).subscribe(mkd0.m154955G(new e30() { // from class: l.p60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147349a.m182397P((j760) obj);
            }
        }));
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: o */
    public void mo64519o() {
        super.mo64519o();
        m182401K();
        m182403T();
        m182402L();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: z */
    public void mo64520z() {
        this.f109832a = System.currentTimeMillis();
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f109834c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f38855d.m209579x6(photoAlbumBaseFrag.m64010Q4(), this.f162605d, fm20.m122122e(1))).subscribe(mkd0.m154956H(new e30() { // from class: l.m60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131436a.m182398Q((j760) obj);
            }
        }, new e30() { // from class: l.n60
            @Override // p149l.e30
            public final void call(Object obj) {
                s60.m182389F((Throwable) obj);
            }
        }));
    }
}
