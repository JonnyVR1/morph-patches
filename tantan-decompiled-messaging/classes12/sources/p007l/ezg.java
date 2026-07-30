package p007l;

import android.os.SystemClock;
import com.p000p1.mobile.putong.data.Envelope;
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
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ezg extends hx60 {

    /* JADX INFO: renamed from: d */
    public an00 f7500d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedFrag f7501e;

    /* JADX INFO: renamed from: l.ezg$a */
    public class C2381a extends an00 {
        public C2381a() {
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: a */
        public void mo6842a(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                ezg.this.f8835b.m10607h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: b */
        public void mo8581b(String str, Envelope envelope) {
            ezg.this.f8835b.m10605f(str, envelope);
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: c */
        public void mo6843c(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                ezg.this.f8835b.m10608i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: d */
        public void mo8582d(String str, Envelope envelope) {
            ezg.this.f8835b.m10606g(str, envelope);
        }
    }

    public ezg(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m5443R4());
        this.f7501e = photoAlbumFeedFrag;
        this.f8835b = new hf00(11);
        this.f7500d = new C2381a();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m9966C(Throwable th) {
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m9969F(Throwable th) {
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m9973J(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m9980V(Moment moment) {
        this.f8836c.m5052P4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m9981W(j760 j760Var) {
        this.f8836c.m5048B3(j760Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m9982X(j760 j760Var) {
        this.f8836c.m5048B3(j760Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m9983Y(List list) {
        this.f7501e.m5462k5("p_discover_discussion");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m9984Z(j760 j760Var) {
        if (((Boolean) j760Var.b).booleanValue()) {
            this.f8836c.m5061Y4((String) j760Var.a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m9985a0(j760 j760Var) {
        this.f8836c.m5065c5(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m9986c0(Throwable th) {
        this.f8836c.m5062Z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ void m9987d0(xaj0 xaj0Var) {
        this.f8836c.m5067e5(xaj0Var);
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: A */
    public void mo5597A() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f8834a = System.currentTimeMillis();
        this.f8836c.duringCreated(FeedModule.f316d.m16564V6(this.f7500d)).subscribe(mkd0.H(new e30() { // from class: l.qyg
            public final void call(Object obj) {
                this.f12417a.m9993b0(jElapsedRealtime, (j760) obj);
            }
        }, new e30() { // from class: l.vyg
            public final void call(Object obj) {
                this.f14331a.m9986c0((Throwable) obj);
            }
        }));
        this.f8836c.duringCreated(FeedModule.f316d.m16688mc("discussion")).subscribe(mkd0.H(new e30() { // from class: l.wyg
            public final void call(Object obj) {
                this.f14703a.m9987d0((xaj0) obj);
            }
        }, new e30() { // from class: l.xyg
            public final void call(Object obj) {
                ezg.m9969F((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public void m9988Q() {
        this.f8836c.duringCreated(FeedModule.f316d.f14992n0).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.czg
            public final void call(Object obj) {
                this.f6754a.m9991T((Moment) obj);
            }
        }));
        this.f8836c.duringCreated(FeedModule.f316d.f14994o0).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.dzg
            public final void call(Object obj) {
                this.f7088a.m9992U((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public void m9989R() {
        this.f8836c.duringCreated(FeedModule.f316d.f14996p0).subscribe(mkd0.G(new e30() { // from class: l.tyg
            public final void call(Object obj) {
                this.f13468a.m9980V((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public void m9990S() {
        this.f8836c.duringCreated(FeedModule.f316d.f14947Q0).subscribe(mkd0.G(new e30() { // from class: l.ryg
            public final void call(Object obj) {
                this.f12759a.m9981W((j760) obj);
            }
        }));
        this.f8836c.duringCreated(FeedModule.f316d.f14951S0).subscribe(mkd0.G(new e30() { // from class: l.syg
            public final void call(Object obj) {
                this.f13131a.m9982X((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m9991T(Moment moment) {
        this.f8836c.m5049M4(moment);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m9992U(Moment moment) {
        this.f8836c.m5049M4(moment);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m9993b0(long j, j760 j760Var) {
        TrackMediaUploadUtil.b0("nearby", SystemClock.elapsedRealtime() - j);
        this.f8836c.m5066d5(j760Var);
    }

    /* JADX INFO: renamed from: e0 */
    public void m9994e0() {
        this.f8836c.duringCreated(FeedModule.f316d.f14945P0).subscribe(mkd0.G(new e30() { // from class: l.uyg
            public final void call(Object obj) {
                this.f13984a.m9984Z((j760) obj);
            }
        }));
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: o */
    public void mo5610o() {
        super.mo5610o();
        m9990S();
        m9988Q();
        m9989R();
        m9994e0();
        this.f8836c.duringCreated(FeedModule.f316d.m16620d7("p_discover_discussion", "")).subscribe(mkd0.H(new e30() { // from class: l.yyg
            public final void call(Object obj) {
                this.f15530a.m9983Y((List) obj);
            }
        }, new e30() { // from class: l.zyg
            public final void call(Object obj) {
                ezg.m9973J((Throwable) obj);
            }
        }));
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: z */
    public void mo5611z() {
        this.f8834a = System.currentTimeMillis();
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f8836c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f316d.m16557U6(photoAlbumBaseFrag.m5053Q4(), this.f7500d)).subscribe(mkd0.H(new e30() { // from class: l.azg
            public final void call(Object obj) {
                this.f5873a.m9985a0((j760) obj);
            }
        }, new e30() { // from class: l.bzg
            public final void call(Object obj) {
                ezg.m9966C((Throwable) obj);
            }
        }));
    }
}
