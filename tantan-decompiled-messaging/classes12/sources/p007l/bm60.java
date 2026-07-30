package p007l;

import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.PersonalFeedInMineFrag;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import l.e30;
import l.j760;
import l.jo0;
import l.mkd0;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class bm60 extends hx60 {

    /* JADX INFO: renamed from: d */
    public boolean f6367d;

    /* JADX INFO: renamed from: e */
    public tzl f6368e;

    /* JADX INFO: renamed from: f */
    public an00 f6369f;

    /* JADX INFO: renamed from: g */
    public PersonalFeedInMineFrag f6370g;

    /* JADX INFO: renamed from: l.bm60$a */
    public class C2341a extends an00 {
        public C2341a() {
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: a */
        public void mo6842a(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                bm60.this.f8835b.m10607h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: c */
        public void mo6843c(Envelope envelope) {
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                bm60.this.f8835b.m10608i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }
    }

    public bm60(PutongFrag putongFrag, boolean z, tzl tzlVar) {
        super(tzlVar.mo3007Q0());
        this.f6367d = z;
        this.f6368e = tzlVar;
        this.f8835b = new hf00(4);
        this.f6369f = new C2341a();
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m8917J(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m8922Y(j760 j760Var) {
        this.f6368e.mo3002B3(j760Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m8923b0(j760 j760Var) {
        this.f8836c.m5066d5(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m8924c0(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40314) {
            this.f6368e.mo3005N0();
        }
        this.f8836c.m5062Z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m8925e0(Throwable th) {
        this.f6370g.m5564z5(null);
        this.f8836c.m5062Z4();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: A */
    public void mo5597A() {
        String str = this.f8836c.act() instanceof PhotoAlbumFeedAct ? "album" : "";
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f8836c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f316d.m16744uc(photoAlbumBaseFrag.m5056T4(), this.f6367d, this.f6369f, str)).subscribe(mkd0.H(new e30() { // from class: l.sl60
            public final void call(Object obj) {
                this.f12978a.m8923b0((j760) obj);
            }
        }, new e30() { // from class: l.tl60
            public final void call(Object obj) {
                this.f13328a.m8924c0((Throwable) obj);
            }
        }));
        if (NullChecker.a(this.f6370g) && nkg.m12222T()) {
            this.f8836c.duringCreated(FeedModule.f316d.m16688mc("album")).subscribe(mkd0.H(new e30() { // from class: l.ul60
                public final void call(Object obj) {
                    this.f13854a.m8938d0((xaj0) obj);
                }
            }, new e30() { // from class: l.vl60
                public final void call(Object obj) {
                    this.f14226a.m8925e0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: O */
    public void m8926O() {
        this.f8836c.duringCreated(FeedModule.f316d.f14992n0).delay(500L, TimeUnit.MILLISECONDS).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.am60
            public final void call(Object obj) {
                this.f5776a.m8932U((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public void m8927P() {
        this.f8836c.duringCreated(FeedModule.f316d.f14998q0).delay(500L, TimeUnit.MILLISECONDS).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.rl60
            public final void call(Object obj) {
                this.f12669a.m8933V((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public void m8928Q(PersonalFeedInMineFrag personalFeedInMineFrag) {
        this.f6370g = personalFeedInMineFrag;
    }

    /* JADX INFO: renamed from: R */
    public void m8929R() {
        this.f8836c.duringCreated(FeedModule.f316d.f14996p0).subscribe(mkd0.G(new e30() { // from class: l.wl60
            public final void call(Object obj) {
                this.f14567a.m8934W((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public void m8930S() {
        this.f8836c.duringCreated(FeedModule.f316d.f15000r0).subscribe(mkd0.G(new e30() { // from class: l.pl60
            public final void call(Object obj) {
                this.f11882a.m8935X((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m8931T() {
        this.f8836c.duringCreated(FeedModule.f316d.f14947Q0).subscribe(mkd0.G(new e30() { // from class: l.xl60
            public final void call(Object obj) {
                this.f15033a.m8922Y((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m8932U(Moment moment) {
        this.f8836c.m5049M4(moment);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m8933V(Moment moment) {
        this.f8836c.m5049M4(moment);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m8934W(Moment moment) {
        this.f8836c.m5052P4(moment);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m8935X(Moment moment) {
        this.f8836c.m5052P4(moment);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m8936Z(j760 j760Var) {
        if (((Boolean) j760Var.b).booleanValue()) {
            this.f8836c.m5061Y4((String) j760Var.a, false);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m8937a0(j760 j760Var) {
        this.f8836c.m5065c5(j760Var);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m8938d0(xaj0 xaj0Var) {
        this.f8836c.m5067e5(xaj0Var);
    }

    /* JADX INFO: renamed from: f0 */
    public void m8939f0() {
        this.f8836c.duringCreated(FeedModule.f316d.f14945P0).subscribe(mkd0.G(new e30() { // from class: l.ql60
            public final void call(Object obj) {
                this.f12268a.m8936Z((j760) obj);
            }
        }));
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: o */
    public void mo5610o() {
        super.mo5610o();
        m8926O();
        m8929R();
        m8927P();
        m8930S();
        m8939f0();
        m8931T();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: z */
    public void mo5611z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f8836c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f316d.m16730sc(photoAlbumBaseFrag.m5056T4(), this.f8836c.m5053Q4(), this.f6367d, this.f6369f)).subscribe(mkd0.H(new e30() { // from class: l.yl60
            public final void call(Object obj) {
                this.f15467a.m8937a0((j760) obj);
            }
        }, new e30() { // from class: l.zl60
            public final void call(Object obj) {
                bm60.m8917J((Throwable) obj);
            }
        }));
    }
}
