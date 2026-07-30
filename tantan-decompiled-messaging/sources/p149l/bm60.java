package p149l;

import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.data.ProfileLikeModuleType;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.PersonalFeedInMineFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class bm60 extends hx60 {

    /* JADX INFO: renamed from: d */
    public boolean f76239d;

    /* JADX INFO: renamed from: e */
    public tzl f76240e;

    /* JADX INFO: renamed from: f */
    public an00 f76241f;

    /* JADX INFO: renamed from: g */
    public PersonalFeedInMineFrag f76242g;

    /* JADX INFO: renamed from: l.bm60$a */
    public class C15906a extends an00 {
        public C15906a() {
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: a */
        public void mo65703a(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                bm60.this.f109833b.m130726h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: c */
        public void mo65704c(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                bm60.this.f109833b.m130727i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }
    }

    public bm60(PutongFrag putongFrag, boolean z, tzl tzlVar) {
        super(tzlVar.mo62031Q0());
        this.f76239d = z;
        this.f76240e = tzlVar;
        this.f109833b = new hf00(4);
        this.f76241f = new C15906a();
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m102581J(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m102586Y(j760 j760Var) {
        this.f76240e.mo62027B3(j760Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m102587b0(j760 j760Var) {
        this.f109834c.m64023d5(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m102588c0(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40314) {
            this.f76240e.mo62029N0();
        }
        this.f109834c.m64019Z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m102589e0(Throwable th) {
        this.f76242g.m64477z5(null);
        this.f109834c.m64019Z4();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: A */
    public void mo64506A() {
        String str = this.f109834c.act() instanceof PhotoAlbumFeedAct ? ProfileLikeModuleType.album : "";
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f109834c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f38855d.m209563uc(photoAlbumBaseFrag.m64013T4(), this.f76239d, this.f76241f, str)).subscribe(mkd0.m154956H(new e30() { // from class: l.sl60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165137a.m102587b0((j760) obj);
            }
        }, new e30() { // from class: l.tl60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170998a.m102588c0((Throwable) obj);
            }
        }));
        if (NullChecker.m81303a(this.f76242g) && nkg.m159863T()) {
            this.f109834c.duringCreated(FeedModule.f38855d.m209507mc(ProfileLikeModuleType.album)).subscribe(mkd0.m154956H(new e30() { // from class: l.ul60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f177016a.m102602d0((xaj0) obj);
                }
            }, new e30() { // from class: l.vl60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f181919a.m102589e0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: O */
    public void m102590O() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193057n0).delay(500L, TimeUnit.MILLISECONDS).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.am60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70566a.m102596U((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public void m102591P() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193063q0).delay(500L, TimeUnit.MILLISECONDS).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.rl60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159929a.m102597V((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public void m102592Q(PersonalFeedInMineFrag personalFeedInMineFrag) {
        this.f76242g = personalFeedInMineFrag;
    }

    /* JADX INFO: renamed from: R */
    public void m102593R() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193061p0).subscribe(mkd0.m154955G(new e30() { // from class: l.wl60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186877a.m102598W((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public void m102594S() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193065r0).subscribe(mkd0.m154955G(new e30() { // from class: l.pl60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150078a.m102599X((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m102595T() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193012Q0).subscribe(mkd0.m154955G(new e30() { // from class: l.xl60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193385a.m102586Y((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m102596U(Moment moment) {
        this.f109834c.m64006M4(moment);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m102597V(Moment moment) {
        this.f109834c.m64006M4(moment);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m102598W(Moment moment) {
        this.f109834c.m64009P4(moment);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m102599X(Moment moment) {
        this.f109834c.m64009P4(moment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m102600Z(j760 j760Var) {
        if (((Boolean) j760Var.f116565b).booleanValue()) {
            this.f109834c.m64018Y4((String) j760Var.f116564a, false);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m102601a0(j760 j760Var) {
        this.f109834c.m64022c5(j760Var);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m102602d0(xaj0 xaj0Var) {
        this.f109834c.m64024e5(xaj0Var);
    }

    /* JADX INFO: renamed from: f0 */
    public void m102603f0() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193010P0).subscribe(mkd0.m154955G(new e30() { // from class: l.ql60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155193a.m102600Z((j760) obj);
            }
        }));
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: o */
    public void mo64519o() {
        super.mo64519o();
        m102590O();
        m102593R();
        m102591P();
        m102594S();
        m102603f0();
        m102595T();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: z */
    public void mo64520z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f109834c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f38855d.m209549sc(photoAlbumBaseFrag.m64013T4(), this.f109834c.m64010Q4(), this.f76239d, this.f76241f)).subscribe(mkd0.m154956H(new e30() { // from class: l.yl60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198864a.m102601a0((j760) obj);
            }
        }, new e30() { // from class: l.zl60
            @Override // p149l.e30
            public final void call(Object obj) {
                bm60.m102581J((Throwable) obj);
            }
        }));
    }
}
