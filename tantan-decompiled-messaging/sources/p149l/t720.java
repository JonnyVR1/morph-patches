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
public class t720 extends hx60 {

    /* JADX INFO: renamed from: d */
    public an00 f168654d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedFrag f168655e;

    /* JADX INFO: renamed from: l.t720$a */
    public class C20114a extends an00 {
        public C20114a() {
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: a */
        public void mo65703a(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                t720.this.f109833b.m130726h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: b */
        public void mo97701b(String str, Envelope envelope) {
            t720.this.f109833b.m130724f(str, envelope);
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: c */
        public void mo65704c(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                t720.this.f109833b.m130727i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: d */
        public void mo97702d(String str, Envelope envelope) {
            t720.this.f109833b.m130725g(str, envelope);
        }
    }

    public t720(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m64369R4());
        this.f168655e = photoAlbumFeedFrag;
        this.f109833b = new hf00(1);
        this.f168654d = new C20114a();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m187394C(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m187404O(Moment moment) {
        this.f109834c.m64009P4(moment);
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: A */
    public void mo64506A() {
        if (this.f168655e.m64371T4() != -1) {
            this.f168655e.m64388n5();
        } else if (je80.m141102b().f117482a.mo95545f()) {
            if (NullChecker.m81303a(je80.m141102b().f117482a.m124683l())) {
                this.f109833b.m130727i(je80.m141102b().f117482a.m124683l());
            }
            m187415X(je80.m141102b().f117482a.m192034e());
            je80.m141102b().f117482a.m192033d();
        } else {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f109834c.duringCreated(FeedModule.f38855d.m209472hc(this.f168654d)).subscribe(mkd0.m154957I(new e30() { // from class: l.l720
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f126687a.m187410S(jElapsedRealtime, (j760) obj);
                }
            }, new e30() { // from class: l.m720
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f131786a.m187411T((Throwable) obj);
                }
            }, new d30() { // from class: l.n720
                @Override // p149l.d30
                public final void call() {
                    this.f137475a.m187412U();
                }
            }));
        }
        this.f109834c.duringCreated(FeedModule.f38855d.m209507mc("nearby")).subscribe(mkd0.m154956H(new e30() { // from class: l.o720
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142449a.m187413V((xaj0) obj);
            }
        }, new e30() { // from class: l.p720
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147469a.m187414W((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public void m187405M() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193061p0).subscribe(mkd0.m154955G(new e30() { // from class: l.q720
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152977a.m187404O((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public void m187406N() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193012Q0).subscribe(mkd0.m154955G(new e30() { // from class: l.r720
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158005a.m187407P((j760) obj);
            }
        }));
        this.f109834c.duringCreated(FeedModule.f38855d.f193016S0).subscribe(mkd0.m154955G(new e30() { // from class: l.s720
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162884a.m187408Q((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m187407P(j760 j760Var) {
        this.f109834c.m64005B3(j760Var, false);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m187408Q(j760 j760Var) {
        this.f109834c.m64005B3(j760Var, false);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m187409R(j760 j760Var) {
        this.f109834c.m64022c5(j760Var);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m187410S(long j, j760 j760Var) {
        TrackMediaUploadUtil.m80298b0("nearby", SystemClock.elapsedRealtime() - j);
        m187415X(j760Var);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m187411T(Throwable th) {
        this.f109834c.m64019Z4();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m187412U() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f109834c;
        if (photoAlbumBaseFrag != null && photoAlbumBaseFrag.m64008P0()) {
            this.f109834c.m64031l5(false);
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m187413V(xaj0 xaj0Var) {
        this.f109834c.m64024e5(xaj0Var);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m187414W(Throwable th) {
        this.f109834c.m64019Z4();
    }

    /* JADX INFO: renamed from: X */
    public final void m187415X(j760<Links, List<Moment>> j760Var) {
        this.f109834c.m64023d5(j760Var);
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: o */
    public void mo64519o() {
        super.mo64519o();
        m187406N();
        m187405M();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: z */
    public void mo64520z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f109834c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f38855d.m209458fc(photoAlbumBaseFrag.m64010Q4(), this.f168654d)).subscribe(mkd0.m154956H(new e30() { // from class: l.j720
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116560a.m187409R((j760) obj);
            }
        }, new e30() { // from class: l.k720
            @Override // p149l.e30
            public final void call(Object obj) {
                t720.m187394C((Throwable) obj);
            }
        }));
    }
}
