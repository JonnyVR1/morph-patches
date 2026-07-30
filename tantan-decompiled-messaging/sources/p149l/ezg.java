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
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ezg extends hx60 {

    /* JADX INFO: renamed from: d */
    public an00 f93895d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedFrag f93896e;

    /* JADX INFO: renamed from: l.ezg$a */
    public class C16731a extends an00 {
        public C16731a() {
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: a */
        public void mo65703a(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                ezg.this.f109833b.m130726h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: b */
        public void mo97701b(String str, Envelope envelope) {
            ezg.this.f109833b.m130724f(str, envelope);
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: c */
        public void mo65704c(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                ezg.this.f109833b.m130727i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: d */
        public void mo97702d(String str, Envelope envelope) {
            ezg.this.f109833b.m130725g(str, envelope);
        }
    }

    public ezg(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m64369R4());
        this.f93896e = photoAlbumFeedFrag;
        this.f109833b = new hf00(11);
        this.f93895d = new C16731a();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m118950C(Throwable th) {
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m118953F(Throwable th) {
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m118957J(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m118964V(Moment moment) {
        this.f109834c.m64009P4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m118965W(j760 j760Var) {
        this.f109834c.m64005B3(j760Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m118966X(j760 j760Var) {
        this.f109834c.m64005B3(j760Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m118967Y(List list) {
        this.f93896e.m64386k5("p_discover_discussion");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m118968Z(j760 j760Var) {
        if (((Boolean) j760Var.f116565b).booleanValue()) {
            this.f109834c.m64018Y4((String) j760Var.f116564a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m118969a0(j760 j760Var) {
        this.f109834c.m64022c5(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m118970c0(Throwable th) {
        this.f109834c.m64019Z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ void m118971d0(xaj0 xaj0Var) {
        this.f109834c.m64024e5(xaj0Var);
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: A */
    public void mo64506A() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f109832a = System.currentTimeMillis();
        this.f109834c.duringCreated(FeedModule.f38855d.m209383V6(this.f93895d)).subscribe(mkd0.m154956H(new e30() { // from class: l.qyg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156924a.m118977b0(jElapsedRealtime, (j760) obj);
            }
        }, new e30() { // from class: l.vyg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183522a.m118970c0((Throwable) obj);
            }
        }));
        this.f109834c.duringCreated(FeedModule.f38855d.m209507mc("discussion")).subscribe(mkd0.m154956H(new e30() { // from class: l.wyg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188560a.m118971d0((xaj0) obj);
            }
        }, new e30() { // from class: l.xyg
            @Override // p149l.e30
            public final void call(Object obj) {
                ezg.m118953F((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public void m118972Q() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193057n0).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.czg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83083a.m118975T((Moment) obj);
            }
        }));
        this.f109834c.duringCreated(FeedModule.f38855d.f193059o0).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.dzg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88480a.m118976U((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public void m118973R() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193061p0).subscribe(mkd0.m154955G(new e30() { // from class: l.tyg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172597a.m118964V((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public void m118974S() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193012Q0).subscribe(mkd0.m154955G(new e30() { // from class: l.ryg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161559a.m118965W((j760) obj);
            }
        }));
        this.f109834c.duringCreated(FeedModule.f38855d.f193016S0).subscribe(mkd0.m154955G(new e30() { // from class: l.syg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166959a.m118966X((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m118975T(Moment moment) {
        this.f109834c.m64006M4(moment);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m118976U(Moment moment) {
        this.f109834c.m64006M4(moment);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m118977b0(long j, j760 j760Var) {
        TrackMediaUploadUtil.m80298b0("nearby", SystemClock.elapsedRealtime() - j);
        this.f109834c.m64023d5(j760Var);
    }

    /* JADX INFO: renamed from: e0 */
    public void m118978e0() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193010P0).subscribe(mkd0.m154955G(new e30() { // from class: l.uyg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178862a.m118968Z((j760) obj);
            }
        }));
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: o */
    public void mo64519o() {
        super.mo64519o();
        m118974S();
        m118972Q();
        m118973R();
        m118978e0();
        this.f109834c.duringCreated(FeedModule.f38855d.m209439d7("p_discover_discussion", "")).subscribe(mkd0.m154956H(new e30() { // from class: l.yyg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200731a.m118967Y((List) obj);
            }
        }, new e30() { // from class: l.zyg
            @Override // p149l.e30
            public final void call(Object obj) {
                ezg.m118957J((Throwable) obj);
            }
        }));
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: z */
    public void mo64520z() {
        this.f109832a = System.currentTimeMillis();
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f109834c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f38855d.m209376U6(photoAlbumBaseFrag.m64010Q4(), this.f93895d)).subscribe(mkd0.m154956H(new e30() { // from class: l.azg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72354a.m118969a0((j760) obj);
            }
        }, new e30() { // from class: l.bzg
            @Override // p149l.e30
            public final void call(Object obj) {
                ezg.m118950C((Throwable) obj);
            }
        }));
    }
}
