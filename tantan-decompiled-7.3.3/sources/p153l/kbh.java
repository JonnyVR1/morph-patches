package p153l;

import android.os.SystemClock;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class kbh extends n570 {

    /* JADX INFO: renamed from: g */
    public static boolean f124947g;

    /* JADX INFO: renamed from: h */
    public static boolean f124948h;

    /* JADX INFO: renamed from: i */
    public static boolean f124949i;

    /* JADX INFO: renamed from: d */
    public jv00 f124950d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedFrag f124951e;

    /* JADX INFO: renamed from: f */
    public boolean f124952f;

    /* JADX INFO: renamed from: l.kbh$a */
    public class C18130a extends jv00 {
        public C18130a() {
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: a */
        public void mo66886a(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                kbh.this.f140315b.m177165h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: c */
        public void mo66887c(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                kbh.this.f140315b.m177166i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }
    }

    public kbh(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m65552R4());
        this.f124951e = photoAlbumFeedFrag;
        this.f140315b = new qn00(9);
        this.f124950d = new C18130a();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m149034C(Throwable th) {
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m149042K(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m149045P(Moment moment) {
        this.f140316c.m65189M4(moment);
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: A */
    public void mo65689A() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f140316c.duringCreated(FeedModule.f39703d.m145552Kb(this.f124950d)).subscribe(psd0.m173597H(new y20() { // from class: l.zah
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203563a.m149054W(jElapsedRealtime, (pf60) obj);
            }
        }, new y20() { // from class: l.bbh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75947a.m149055X((Throwable) obj);
            }
        }));
        FeedModule.f39703d.m145748mc("like");
    }

    /* JADX INFO: renamed from: N */
    public void m149046N() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121367n0).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.jbh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f119875a.m149045P((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m149047O() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121371p0).subscribe(psd0.m173596G(new y20() { // from class: l.ibh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114217a.m149048Q((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m149048Q(Moment moment) {
        this.f140316c.m65192P4(moment);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m149049R(pf60 pf60Var) {
        this.f140316c.m65188B3(pf60Var, false);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m149050S(List list) {
        this.f124951e.m65569k5("p_like");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m149051T(pf60 pf60Var) {
        if (((Boolean) pf60Var.f152157b).booleanValue()) {
            this.f140316c.m65201Y4((String) pf60Var.f152156a, true);
        }
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m149052U(pf60 pf60Var) {
        this.f140316c.m65205c5(pf60Var);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m149053V(uxj0 uxj0Var) {
        if (this.f124952f != FeedModule.m61406H().mo31810pq()) {
            this.f124952f = FeedModule.m61406H().mo31810pq();
            this.f140316c.m65203a5();
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m149054W(long j, pf60 pf60Var) {
        TrackMediaUploadUtil.m81481b0("like", SystemClock.elapsedRealtime() - j);
        this.f140316c.m65206d5(pf60Var);
        if (f124949i) {
            FeedModule.f39703d.m145762oc();
            f124949i = false;
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m149055X(Throwable th) {
        this.f140316c.m65202Z4();
    }

    /* JADX INFO: renamed from: Y */
    public void m149056Y() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121320P0).subscribe(psd0.m173596G(new y20() { // from class: l.hbh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108590a.m149051T((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public void m149057Z() {
        this.f140316c.duringCreated(FeedModule.m61406H().mo31837wb()).subscribe(psd0.m173596G(new y20() { // from class: l.abh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69621a.m149053V((uxj0) obj);
            }
        }));
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: n */
    public boolean mo149058n(Links links) {
        if (cch.m108707b()) {
            return false;
        }
        return super.mo149058n(links);
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: o */
    public void mo65702o() {
        super.mo65702o();
        m149046N();
        m149047O();
        m149056Y();
        if (cmg.m111181I()) {
            this.f124952f = FeedModule.m61406H().mo31810pq();
            m149057Z();
        }
        this.f140316c.duringCreated(FeedModule.f39703d.f121326S0).subscribe(psd0.m173596G(new y20() { // from class: l.cbh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80819a.m149049R((pf60) obj);
            }
        }));
        this.f140316c.duringCreated(FeedModule.f39703d.m145680d7("p_like", "")).subscribe(psd0.m173597H(new y20() { // from class: l.dbh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87669a.m149050S((List) obj);
            }
        }, new y20() { // from class: l.ebh
            @Override // p153l.y20
            public final void call(Object obj) {
                kbh.m149034C((Throwable) obj);
            }
        }));
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: z */
    public void mo65703z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f140316c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f39703d.m145545Jb(photoAlbumBaseFrag.m65193Q4(), this.f124950d)).subscribe(psd0.m173597H(new y20() { // from class: l.fbh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98110a.m149052U((pf60) obj);
            }
        }, new y20() { // from class: l.gbh
            @Override // p153l.y20
            public final void call(Object obj) {
                kbh.m149042K((Throwable) obj);
            }
        }));
    }
}
