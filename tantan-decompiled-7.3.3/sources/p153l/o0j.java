package p153l;

import android.os.SystemClock;
import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class o0j extends n570 {

    /* JADX INFO: renamed from: d */
    public jv00 f144549d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedFrag f144550e;

    /* JADX INFO: renamed from: l.o0j$a */
    public class C19003a extends jv00 {
        public C19003a() {
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: a */
        public void mo66886a(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                o0j.this.f140315b.m177165h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: b */
        public void mo104110b(String str, Envelope envelope) {
            o0j.this.f140315b.m177163f(str, envelope);
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: c */
        public void mo66887c(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                o0j.this.f140315b.m177166i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: d */
        public void mo104111d(String str, Envelope envelope) {
            o0j.this.f140315b.m177164g(str, envelope);
        }
    }

    public o0j(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m65552R4());
        this.f144550e = photoAlbumFeedFrag;
        this.f140315b = new qn00(2);
        this.f144549d = new C19003a();
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m165497I(Throwable th) {
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m165506R(Throwable th) {
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: A */
    public void mo65689A() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f140316c.duringCreated(FeedModule.f39703d.m145722j7(this.f144549d)).subscribe(psd0.m173597H(new y20() { // from class: l.i0j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112375a.m165522h0(jElapsedRealtime, (pf60) obj);
            }
        }, new y20() { // from class: l.j0j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117828a.m165523i0((Throwable) obj);
            }
        }));
        if (cmg.m111186N()) {
            this.f140316c.duringCreated(FeedModule.f39703d.m145748mc("follow")).subscribe(psd0.m173597H(new y20() { // from class: l.k0j
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f123401a.m165524j0((bkj0) obj);
                }
            }, new y20() { // from class: l.l0j
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f129567a.m165525k0((Throwable) obj);
                }
            }));
        } else {
            FeedModule.f39703d.m145748mc("follow");
        }
    }

    /* JADX INFO: renamed from: S */
    public void m165507S() {
        C22421c c22421cDuringCreated = this.f140316c.duringCreated(FeedModule.f39703d.f121367n0);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c22421cDuringCreated.delay(500L, timeUnit).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.n0j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139631a.m165512X((Moment) obj);
            }
        }));
        this.f140316c.duringCreated(FeedModule.f39703d.f121369o0).delay(500L, timeUnit).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.zzi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206708a.m165513Y((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m165508T() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121373q0).delay(500L, TimeUnit.MILLISECONDS).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.d0j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84566a.m165514Z((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public void m165509U() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121371p0).subscribe(psd0.m173596G(new y20() { // from class: l.e0j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91468a.m165515a0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public void m165510V() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121375r0).subscribe(psd0.m173596G(new y20() { // from class: l.c0j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79275a.m165516b0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W */
    public void m165511W() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121322Q0).subscribe(psd0.m173596G(new y20() { // from class: l.a0j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f67722a.m165517c0((pf60) obj);
            }
        }));
        this.f140316c.duringCreated(FeedModule.f39703d.f121326S0).subscribe(psd0.m173596G(new y20() { // from class: l.b0j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74275a.m165518d0((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m165512X(Moment moment) {
        this.f140316c.m65189M4(moment);
        if (TextUtils.isEmpty(moment.group.f40071id) || !cmg.m111186N()) {
            return;
        }
        mo65689A();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m165513Y(Moment moment) {
        this.f140316c.m65189M4(moment);
        if (TextUtils.isEmpty(moment.group.f40071id) || !cmg.m111186N()) {
            return;
        }
        mo65689A();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m165514Z(Moment moment) {
        this.f140316c.m65189M4(moment);
        if (TextUtils.isEmpty(moment.group.f40071id) || !cmg.m111186N()) {
            return;
        }
        mo65689A();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m165515a0(Moment moment) {
        this.f140316c.m65192P4(moment);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m165516b0(Moment moment) {
        this.f140316c.m65192P4(moment);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m165517c0(pf60 pf60Var) {
        this.f140316c.m65188B3(pf60Var, true);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m165518d0(pf60 pf60Var) {
        this.f140316c.m65188B3(pf60Var, false);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m165519e0(List list) {
        this.f144550e.m65569k5("p_follow");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m165520f0(pf60 pf60Var) {
        if (((Boolean) pf60Var.f152157b).booleanValue()) {
            this.f140316c.m65201Y4((String) pf60Var.f152156a, true);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m165521g0(pf60 pf60Var) {
        this.f140316c.m65205c5(pf60Var);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m165522h0(long j, pf60 pf60Var) {
        if (!jyb.m147479J((Collection) pf60Var.f152157b)) {
            FeedModule.f39703d.m145686dd(((Moment) ((List) pf60Var.f152157b).get(0)).createdTime);
        }
        TrackMediaUploadUtil.m81481b0("follow", SystemClock.elapsedRealtime() - j);
        this.f140316c.m65206d5(pf60Var);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m165523i0(Throwable th) {
        this.f140316c.m65202Z4();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m165524j0(bkj0 bkj0Var) {
        this.f140316c.m65207e5(bkj0Var);
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: k */
    public C22421c<uxj0> mo137269k(Moment moment) {
        if (TEnum.equals(moment.status(), "failed") && moment.f56859id.startsWith("fake_id_")) {
            FeedModule.f39702c.m61912h3(moment._id);
        }
        return super.mo137269k(moment);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m165525k0(Throwable th) {
        this.f140316c.m65202Z4();
    }

    /* JADX INFO: renamed from: l0 */
    public void m165526l0() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121320P0).subscribe(psd0.m173596G(new y20() { // from class: l.m0j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134315a.m165520f0((pf60) obj);
            }
        }));
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: o */
    public void mo65702o() {
        super.mo65702o();
        m165507S();
        m165509U();
        m165508T();
        m165510V();
        m165526l0();
        m165511W();
        this.f140316c.duringCreated(FeedModule.f39703d.m145680d7("p_follow", "")).subscribe(psd0.m173597H(new y20() { // from class: l.yzi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202197a.m165519e0((List) obj);
            }
        }, new y20() { // from class: l.f0j
            @Override // p153l.y20
            public final void call(Object obj) {
                o0j.m165497I((Throwable) obj);
            }
        }));
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: z */
    public void mo65703z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f140316c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f39703d.m145715i7(photoAlbumBaseFrag.m65193Q4(), this.f144549d)).subscribe(psd0.m173597H(new y20() { // from class: l.g0j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101658a.m165521g0((pf60) obj);
            }
        }, new y20() { // from class: l.h0j
            @Override // p153l.y20
            public final void call(Object obj) {
                o0j.m165506R((Throwable) obj);
            }
        }));
    }
}
