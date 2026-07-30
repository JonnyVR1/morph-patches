package p153l;

import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class a9h extends n570 {

    /* JADX INFO: renamed from: d */
    public jv00 f69043d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedFrag f69044e;

    /* JADX INFO: renamed from: l.a9h$a */
    public class C15674a extends jv00 {
        public C15674a() {
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: a */
        public void mo66886a(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                a9h.this.f140315b.m177165h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: c */
        public void mo66887c(Envelope envelope) {
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                a9h.this.f140315b.m177166i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }
    }

    public a9h(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        super(photoAlbumFeedFrag.m65552R4());
        this.f69044e = photoAlbumFeedFrag;
        this.f140315b = new qn00(8);
        this.f69043d = new C15674a();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m96581F(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m96585N(Moment moment) {
        this.f140316c.m65192P4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m96586O(pf60 pf60Var) {
        this.f140316c.m65188B3(pf60Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m96587P(pf60 pf60Var) {
        this.f140316c.m65205c5(pf60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m96589R(Throwable th) {
        this.f140316c.m65202Z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void m96588Q(pf60<Links, List<Moment>> pf60Var) {
        this.f140316c.m65206d5(pf60Var);
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: A */
    public void mo65689A() {
        this.f140316c.duringCreated(FeedModule.f39703d.m145727jc(this.f69043d)).subscribe(psd0.m173597H(new y20() { // from class: l.y8h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198003a.m96588Q((pf60) obj);
            }
        }, new y20() { // from class: l.z8h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203371a.m96589R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public void m96591J() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121367n0).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.x8h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192815a.m96594M((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m96592K() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121371p0).subscribe(psd0.m173596G(new y20() { // from class: l.v8h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182875a.m96585N((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public void m96593L() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121322Q0).subscribe(psd0.m173596G(new y20() { // from class: l.w8h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187853a.m96586O((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m96594M(Moment moment) {
        this.f140316c.m65189M4(moment);
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: o */
    public void mo65702o() {
        super.mo65702o();
        m96593L();
        m96591J();
        m96592K();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: z */
    public void mo65703z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f140316c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f39703d.m145720ic(photoAlbumBaseFrag.m65193Q4(), this.f69043d)).subscribe(psd0.m173597H(new y20() { // from class: l.t8h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172533a.m96587P((pf60) obj);
            }
        }, new y20() { // from class: l.u8h
            @Override // p153l.y20
            public final void call(Object obj) {
                a9h.m96581F((Throwable) obj);
            }
        }));
    }
}
