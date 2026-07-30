package p149l;

import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.PoiLocation;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class dnh extends hx60 {

    /* JADX INFO: renamed from: d */
    public PhotoAlbumBaseFrag f87061d;

    /* JADX INFO: renamed from: e */
    public q980 f87062e;

    /* JADX INFO: renamed from: f */
    public an00 f87063f;

    /* JADX INFO: renamed from: g */
    public String f87064g;

    /* JADX INFO: renamed from: h */
    public PoiLocation f87065h;

    /* JADX INFO: renamed from: l.dnh$a */
    public class C16414a extends an00 {
        public C16414a() {
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: a */
        public void mo65703a(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                dnh.this.f109833b.m130726h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: b */
        public void mo97701b(String str, Envelope envelope) {
            dnh.this.f109833b.m130724f(str, envelope);
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: c */
        public void mo65704c(Envelope envelope) {
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                dnh.this.f109833b.m130727i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
            dnh.this.f87065h = ((FeedData) envelope.getModuleData(FeedData.class)).location;
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: d */
        public void mo97702d(String str, Envelope envelope) {
            dnh.this.f109833b.m130725g(str, envelope);
        }
    }

    public dnh(PhotoAlbumBaseFrag photoAlbumBaseFrag, q980 q980Var, String str) {
        super(photoAlbumBaseFrag);
        this.f87064g = str;
        this.f87062e = q980Var;
        this.f87061d = photoAlbumBaseFrag;
        this.f109833b = new hf00(16);
        this.f87063f = new C16414a();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m112623F(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m112628M(Moment moment) {
        this.f87061d.m64009P4(moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m112629O(j760 j760Var) {
        this.f87061d.m64005B3(j760Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m112630P(j760 j760Var) {
        this.f87061d.m64022c5(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m112632R(Throwable th) {
        this.f87061d.m64019Z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void m112631Q(j760<Links, List<Moment>> j760Var) {
        this.f87061d.m64023d5(j760Var);
        if (NullChecker.m81303a(this.f87065h)) {
            this.f87062e.m173605e(this.f87065h);
        }
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: A */
    public void mo64506A() {
        this.f87061d.duringCreated(FeedModule.f38855d.m209239Ac(this.f87064g, this.f87063f)).subscribe(mkd0.m154956H(new e30() { // from class: l.bnh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76403a.m112631Q((j760) obj);
            }
        }, new e30() { // from class: l.cnh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81662a.m112632R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m112634K() {
        this.f87061d.duringCreated(FeedModule.f38855d.f193061p0).subscribe(mkd0.m154955G(new e30() { // from class: l.wmh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187074a.m112628M((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public void m112635L() {
        this.f87061d.duringCreated(FeedModule.f38855d.f193012Q0).subscribe(mkd0.m154955G(new e30() { // from class: l.xmh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193558a.m112636N((j760) obj);
            }
        }));
        this.f87061d.duringCreated(FeedModule.f38855d.f193016S0).subscribe(mkd0.m154955G(new e30() { // from class: l.ymh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199015a.m112629O((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m112636N(j760 j760Var) {
        this.f87061d.m64005B3(j760Var, false);
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: o */
    public void mo64519o() {
        super.mo64519o();
        m112634K();
        m112635L();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: z */
    public void mo64520z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f87061d;
        photoAlbumBaseFrag.duringCreated(FeedModule.f38855d.m209601zc(this.f87064g, photoAlbumBaseFrag.m64010Q4(), this.f87063f)).subscribe(mkd0.m154956H(new e30() { // from class: l.zmh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203720a.m112630P((j760) obj);
            }
        }, new e30() { // from class: l.anh
            @Override // p149l.e30
            public final void call(Object obj) {
                dnh.m112623F((Throwable) obj);
            }
        }));
    }
}
