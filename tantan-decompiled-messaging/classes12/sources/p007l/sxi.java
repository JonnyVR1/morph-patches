package p007l;

import android.os.SystemClock;
import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.e30;
import l.j760;
import l.jo0;
import l.mkd0;
import l.roj0;
import l.vwb;
import l.xaj0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class sxi extends hx60 {

    /* JADX INFO: renamed from: d */
    public an00 f13110d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedFrag f13111e;

    /* JADX INFO: renamed from: l.sxi$a */
    public class C2492a extends an00 {
        public C2492a() {
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: a */
        public void mo6842a(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                sxi.this.f8835b.m10607h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: b */
        public void mo8581b(String str, Envelope envelope) {
            sxi.this.f8835b.m10605f(str, envelope);
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: c */
        public void mo6843c(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                sxi.this.f8835b.m10608i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: d */
        public void mo8582d(String str, Envelope envelope) {
            sxi.this.f8835b.m10606g(str, envelope);
        }
    }

    public sxi(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m5443R4());
        this.f13111e = photoAlbumFeedFrag;
        this.f8835b = new hf00(2);
        this.f13110d = new C2492a();
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m14351I(Throwable th) {
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m14360R(Throwable th) {
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: A */
    public void mo5597A() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f8836c.duringCreated(FeedModule.f316d.m16662j7(this.f13110d)).subscribe(mkd0.H(new e30() { // from class: l.mxi
            public final void call(Object obj) {
                this.f10599a.m14376h0(jElapsedRealtime, (j760) obj);
            }
        }, new e30() { // from class: l.nxi
            public final void call(Object obj) {
                this.f10932a.m14377i0((Throwable) obj);
            }
        }));
        if (nkg.m12216N()) {
            this.f8836c.duringCreated(FeedModule.f316d.m16688mc("follow")).subscribe(mkd0.H(new e30() { // from class: l.oxi
                public final void call(Object obj) {
                    this.f11643a.m14378j0((xaj0) obj);
                }
            }, new e30() { // from class: l.pxi
                public final void call(Object obj) {
                    this.f12009a.m14379k0((Throwable) obj);
                }
            }));
        } else {
            FeedModule.f316d.m16688mc("follow");
        }
    }

    /* JADX INFO: renamed from: S */
    public void m14361S() {
        c cVarDuringCreated = this.f8836c.duringCreated(FeedModule.f316d.f14992n0);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cVarDuringCreated.delay(500L, timeUnit).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.rxi
            public final void call(Object obj) {
                this.f12757a.m14366X((Moment) obj);
            }
        }));
        this.f8836c.duringCreated(FeedModule.f316d.f14994o0).delay(500L, timeUnit).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.dxi
            public final void call(Object obj) {
                this.f7083a.m14367Y((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m14362T() {
        this.f8836c.duringCreated(FeedModule.f316d.f14998q0).delay(500L, TimeUnit.MILLISECONDS).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.hxi
            public final void call(Object obj) {
                this.f8838a.m14368Z((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public void m14363U() {
        this.f8836c.duringCreated(FeedModule.f316d.f14996p0).subscribe(mkd0.G(new e30() { // from class: l.ixi
            public final void call(Object obj) {
                this.f9159a.m14369a0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public void m14364V() {
        this.f8836c.duringCreated(FeedModule.f316d.f15000r0).subscribe(mkd0.G(new e30() { // from class: l.gxi
            public final void call(Object obj) {
                this.f8537a.m14370b0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W */
    public void m14365W() {
        this.f8836c.duringCreated(FeedModule.f316d.f14947Q0).subscribe(mkd0.G(new e30() { // from class: l.exi
            public final void call(Object obj) {
                this.f7498a.m14371c0((j760) obj);
            }
        }));
        this.f8836c.duringCreated(FeedModule.f316d.f14951S0).subscribe(mkd0.G(new e30() { // from class: l.fxi
            public final void call(Object obj) {
                this.f8271a.m14372d0((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m14366X(Moment moment) {
        this.f8836c.m5049M4(moment);
        if (TextUtils.isEmpty(moment.group.f684id) || !nkg.m12216N()) {
            return;
        }
        mo5597A();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m14367Y(Moment moment) {
        this.f8836c.m5049M4(moment);
        if (TextUtils.isEmpty(moment.group.f684id) || !nkg.m12216N()) {
            return;
        }
        mo5597A();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m14368Z(Moment moment) {
        this.f8836c.m5049M4(moment);
        if (TextUtils.isEmpty(moment.group.f684id) || !nkg.m12216N()) {
            return;
        }
        mo5597A();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m14369a0(Moment moment) {
        this.f8836c.m5052P4(moment);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m14370b0(Moment moment) {
        this.f8836c.m5052P4(moment);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m14371c0(j760 j760Var) {
        this.f8836c.m5048B3(j760Var, true);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m14372d0(j760 j760Var) {
        this.f8836c.m5048B3(j760Var, false);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m14373e0(List list) {
        this.f13111e.m5462k5("p_follow");
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m14374f0(j760 j760Var) {
        if (((Boolean) j760Var.b).booleanValue()) {
            this.f8836c.m5061Y4((String) j760Var.a, true);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m14375g0(j760 j760Var) {
        this.f8836c.m5065c5(j760Var);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m14376h0(long j, j760 j760Var) {
        if (!vwb.J((Collection) j760Var.b)) {
            FeedModule.f316d.m16626dd(((Moment) ((List) j760Var.b).get(0)).createdTime);
        }
        TrackMediaUploadUtil.b0("follow", SystemClock.elapsedRealtime() - j);
        this.f8836c.m5066d5(j760Var);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m14377i0(Throwable th) {
        this.f8836c.m5062Z4();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m14378j0(xaj0 xaj0Var) {
        this.f8836c.m5067e5(xaj0Var);
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: k */
    public c<roj0> mo10739k(Moment moment) {
        if (TEnum.equals(moment.status(), "failed") && ((DbObject) moment).id.startsWith("fake_id_")) {
            FeedModule.f315c.m1654h3(((DbObject) moment)._id);
        }
        return super.mo10739k(moment);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m14379k0(Throwable th) {
        this.f8836c.m5062Z4();
    }

    /* JADX INFO: renamed from: l0 */
    public void m14380l0() {
        this.f8836c.duringCreated(FeedModule.f316d.f14945P0).subscribe(mkd0.G(new e30() { // from class: l.qxi
            public final void call(Object obj) {
                this.f12415a.m14374f0((j760) obj);
            }
        }));
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: o */
    public void mo5610o() {
        super.mo5610o();
        m14361S();
        m14363U();
        m14362T();
        m14364V();
        m14380l0();
        m14365W();
        this.f8836c.duringCreated(FeedModule.f316d.m16620d7("p_follow", "")).subscribe(mkd0.H(new e30() { // from class: l.cxi
            public final void call(Object obj) {
                this.f6744a.m14373e0((List) obj);
            }
        }, new e30() { // from class: l.jxi
            public final void call(Object obj) {
                sxi.m14351I((Throwable) obj);
            }
        }));
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: z */
    public void mo5611z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f8836c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f316d.m16655i7(photoAlbumBaseFrag.m5053Q4(), this.f13110d)).subscribe(mkd0.H(new e30() { // from class: l.kxi
            public final void call(Object obj) {
                this.f9817a.m14375g0((j760) obj);
            }
        }, new e30() { // from class: l.lxi
            public final void call(Object obj) {
                sxi.m14360R((Throwable) obj);
            }
        }));
    }
}
