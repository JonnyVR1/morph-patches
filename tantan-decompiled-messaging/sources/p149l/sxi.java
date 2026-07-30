package p149l;

import android.os.SystemClock;
import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class sxi extends hx60 {

    /* JADX INFO: renamed from: d */
    public an00 f166794d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedFrag f166795e;

    /* JADX INFO: renamed from: l.sxi$a */
    public class C20061a extends an00 {
        public C20061a() {
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: a */
        public void mo65703a(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                sxi.this.f109833b.m130726h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: b */
        public void mo97701b(String str, Envelope envelope) {
            sxi.this.f109833b.m130724f(str, envelope);
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: c */
        public void mo65704c(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                sxi.this.f109833b.m130727i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: d */
        public void mo97702d(String str, Envelope envelope) {
            sxi.this.f109833b.m130725g(str, envelope);
        }
    }

    public sxi(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m64369R4());
        this.f166795e = photoAlbumFeedFrag;
        this.f109833b = new hf00(2);
        this.f166794d = new C20061a();
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m186409I(Throwable th) {
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m186418R(Throwable th) {
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: A */
    public void mo64506A() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f109834c.duringCreated(FeedModule.f38855d.m209481j7(this.f166794d)).subscribe(mkd0.m154956H(new e30() { // from class: l.mxi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136175a.m186434h0(jElapsedRealtime, (j760) obj);
            }
        }, new e30() { // from class: l.nxi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141025a.m186435i0((Throwable) obj);
            }
        }));
        if (nkg.m159857N()) {
            this.f109834c.duringCreated(FeedModule.f38855d.m209507mc("follow")).subscribe(mkd0.m154956H(new e30() { // from class: l.oxi
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f146214a.m186436j0((xaj0) obj);
                }
            }, new e30() { // from class: l.pxi
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f151685a.m186437k0((Throwable) obj);
                }
            }));
        } else {
            FeedModule.f38855d.m209507mc("follow");
        }
    }

    /* JADX INFO: renamed from: S */
    public void m186419S() {
        C22306c c22306cDuringCreated = this.f109834c.duringCreated(FeedModule.f38855d.f193057n0);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c22306cDuringCreated.delay(500L, timeUnit).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.rxi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161475a.m186424X((Moment) obj);
            }
        }));
        this.f109834c.duringCreated(FeedModule.f38855d.f193059o0).delay(500L, timeUnit).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.dxi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88289a.m186425Y((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m186420T() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193063q0).delay(500L, TimeUnit.MILLISECONDS).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.hxi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109872a.m186426Z((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public void m186421U() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193061p0).subscribe(mkd0.m154955G(new e30() { // from class: l.ixi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115370a.m186427a0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public void m186422V() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193065r0).subscribe(mkd0.m154955G(new e30() { // from class: l.gxi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104899a.m186428b0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W */
    public void m186423W() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193012Q0).subscribe(mkd0.m154955G(new e30() { // from class: l.exi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93675a.m186429c0((j760) obj);
            }
        }));
        this.f109834c.duringCreated(FeedModule.f38855d.f193016S0).subscribe(mkd0.m154955G(new e30() { // from class: l.fxi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99765a.m186430d0((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m186424X(Moment moment) {
        this.f109834c.m64006M4(moment);
        if (TextUtils.isEmpty(moment.group.f39223id) || !nkg.m159857N()) {
            return;
        }
        mo64506A();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m186425Y(Moment moment) {
        this.f109834c.m64006M4(moment);
        if (TextUtils.isEmpty(moment.group.f39223id) || !nkg.m159857N()) {
            return;
        }
        mo64506A();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m186426Z(Moment moment) {
        this.f109834c.m64006M4(moment);
        if (TextUtils.isEmpty(moment.group.f39223id) || !nkg.m159857N()) {
            return;
        }
        mo64506A();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m186427a0(Moment moment) {
        this.f109834c.m64009P4(moment);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m186428b0(Moment moment) {
        this.f109834c.m64009P4(moment);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m186429c0(j760 j760Var) {
        this.f109834c.m64005B3(j760Var, true);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m186430d0(j760 j760Var) {
        this.f109834c.m64005B3(j760Var, false);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m186431e0(List list) {
        this.f166795e.m64386k5("p_follow");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m186432f0(j760 j760Var) {
        if (((Boolean) j760Var.f116565b).booleanValue()) {
            this.f109834c.m64018Y4((String) j760Var.f116564a, true);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m186433g0(j760 j760Var) {
        this.f109834c.m64022c5(j760Var);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m186434h0(long j, j760 j760Var) {
        if (!vwb.m200296J((Collection) j760Var.f116565b)) {
            FeedModule.f38855d.m209445dd(((Moment) ((List) j760Var.f116565b).get(0)).createdTime);
        }
        TrackMediaUploadUtil.m80298b0("follow", SystemClock.elapsedRealtime() - j);
        this.f109834c.m64023d5(j760Var);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m186435i0(Throwable th) {
        this.f109834c.m64019Z4();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m186436j0(xaj0 xaj0Var) {
        this.f109834c.m64024e5(xaj0Var);
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: k */
    public C22306c<roj0> mo133304k(Moment moment) {
        if (TEnum.equals(moment.status(), "failed") && moment.f56011id.startsWith("fake_id_")) {
            FeedModule.f38854c.m60728h3(moment._id);
        }
        return super.mo133304k(moment);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m186437k0(Throwable th) {
        this.f109834c.m64019Z4();
    }

    /* JADX INFO: renamed from: l0 */
    public void m186438l0() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193010P0).subscribe(mkd0.m154955G(new e30() { // from class: l.qxi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156845a.m186432f0((j760) obj);
            }
        }));
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: o */
    public void mo64519o() {
        super.mo64519o();
        m186419S();
        m186421U();
        m186420T();
        m186422V();
        m186438l0();
        m186423W();
        this.f109834c.duringCreated(FeedModule.f38855d.m209439d7("p_follow", "")).subscribe(mkd0.m154956H(new e30() { // from class: l.cxi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82877a.m186431e0((List) obj);
            }
        }, new e30() { // from class: l.jxi
            @Override // p149l.e30
            public final void call(Object obj) {
                sxi.m186409I((Throwable) obj);
            }
        }));
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: z */
    public void mo64520z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f109834c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f38855d.m209474i7(photoAlbumBaseFrag.m64010Q4(), this.f166794d)).subscribe(mkd0.m154956H(new e30() { // from class: l.kxi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125119a.m186433g0((j760) obj);
            }
        }, new e30() { // from class: l.lxi
            @Override // p149l.e30
            public final void call(Object obj) {
                sxi.m186418R((Throwable) obj);
            }
        }));
    }
}
