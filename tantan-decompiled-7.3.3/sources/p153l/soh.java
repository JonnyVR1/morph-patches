package p153l;

import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.PoiLocation;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class soh extends n570 {

    /* JADX INFO: renamed from: d */
    public PhotoAlbumBaseFrag f169884d;

    /* JADX INFO: renamed from: e */
    public wh80 f169885e;

    /* JADX INFO: renamed from: f */
    public jv00 f169886f;

    /* JADX INFO: renamed from: g */
    public String f169887g;

    /* JADX INFO: renamed from: h */
    public PoiLocation f169888h;

    /* JADX INFO: renamed from: l.soh$a */
    public class C20124a extends jv00 {
        public C20124a() {
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: a */
        public void mo66886a(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                soh.this.f140315b.m177165h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: b */
        public void mo104110b(String str, Envelope envelope) {
            soh.this.f140315b.m177163f(str, envelope);
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: c */
        public void mo66887c(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                soh.this.f140315b.m177166i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
            soh.this.f169888h = ((FeedData) envelope.getModuleData(FeedData.class)).location;
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: d */
        public void mo104111d(String str, Envelope envelope) {
            soh.this.f140315b.m177164g(str, envelope);
        }
    }

    public soh(PhotoAlbumBaseFrag photoAlbumBaseFrag, wh80 wh80Var, String str) {
        super(photoAlbumBaseFrag);
        this.f169887g = str;
        this.f169885e = wh80Var;
        this.f169884d = photoAlbumBaseFrag;
        this.f140315b = new qn00(16);
        this.f169886f = new C20124a();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m187225F(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m187230M(Moment moment) {
        this.f169884d.m65192P4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m187231O(pf60 pf60Var) {
        this.f169884d.m65188B3(pf60Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m187232P(pf60 pf60Var) {
        this.f169884d.m65205c5(pf60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m187234R(Throwable th) {
        this.f169884d.m65202Z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void m187233Q(pf60<Links, List<Moment>> pf60Var) {
        this.f169884d.m65206d5(pf60Var);
        if (NullChecker.m82486a(this.f169888h)) {
            this.f169885e.m206341e(this.f169888h);
        }
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: A */
    public void mo65689A() {
        this.f169884d.duringCreated(FeedModule.f39703d.m145480Ac(this.f169887g, this.f169886f)).subscribe(psd0.m173597H(new y20() { // from class: l.qoh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158733a.m187233Q((pf60) obj);
            }
        }, new y20() { // from class: l.roh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164209a.m187234R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m187236K() {
        this.f169884d.duringCreated(FeedModule.f39703d.f121371p0).subscribe(psd0.m173596G(new y20() { // from class: l.loh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132898a.m187230M((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public void m187237L() {
        this.f169884d.duringCreated(FeedModule.f39703d.f121322Q0).subscribe(psd0.m173596G(new y20() { // from class: l.moh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137826a.m187238N((pf60) obj);
            }
        }));
        this.f169884d.duringCreated(FeedModule.f39703d.f121326S0).subscribe(psd0.m173596G(new y20() { // from class: l.noh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142984a.m187231O((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m187238N(pf60 pf60Var) {
        this.f169884d.m65188B3(pf60Var, false);
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: o */
    public void mo65702o() {
        super.mo65702o();
        m187236K();
        m187237L();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: z */
    public void mo65703z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f169884d;
        photoAlbumBaseFrag.duringCreated(FeedModule.f39703d.m145842zc(this.f169887g, photoAlbumBaseFrag.m65193Q4(), this.f169886f)).subscribe(psd0.m173597H(new y20() { // from class: l.ooh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148364a.m187232P((pf60) obj);
            }
        }, new y20() { // from class: l.poh
            @Override // p153l.y20
            public final void call(Object obj) {
                soh.m187225F((Throwable) obj);
            }
        }));
    }
}
