package com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.C11460a;
import java.util.concurrent.TimeUnit;
import p153l.fo0;
import p153l.n570;
import p153l.pf60;
import p153l.psd0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.a */
/* JADX INFO: loaded from: classes13.dex */
public class C11460a extends n570 implements C11462c.b {

    /* JADX INFO: renamed from: d */
    public PersonalFeedInProfileFrag f42600d;

    /* JADX INFO: renamed from: e */
    public String f42601e;

    public C11460a(PersonalFeedInProfileFrag personalFeedInProfileFrag) {
        super(personalFeedInProfileFrag.mo63214Q0());
        this.f42601e = "";
        this.f42600d = personalFeedInProfileFrag;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m65684F(Throwable th) {
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: A */
    public void mo65689A() {
        final String str = this.f42601e;
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f140316c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f39703d.m145811vc(photoAlbumBaseFrag.m65196T4(), str)).subscribe(psd0.m173597H(new y20() { // from class: l.xu60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196263a.m65698S(str, (pf60) obj);
            }
        }, new y20() { // from class: l.yu60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201591a.m65699T((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m65690K() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121367n0).delay(500L, TimeUnit.MILLISECONDS).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.av60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73588a.m65693N((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public void m65691L() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121371p0).subscribe(psd0.m173596G(new y20() { // from class: l.wu60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190842a.m65694O((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public void m65692M() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121322Q0).subscribe(psd0.m173596G(new y20() { // from class: l.vu60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185764a.m65695P((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m65693N(Moment moment) {
        this.f140316c.m65189M4(moment);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m65694O(Moment moment) {
        this.f140316c.m65192P4(moment);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m65695P(pf60 pf60Var) {
        this.f42600d.mo63210B3(pf60Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m65696Q(pf60 pf60Var) {
        if (((Boolean) pf60Var.f152157b).booleanValue()) {
            this.f140316c.m65201Y4((String) pf60Var.f152156a, false);
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m65697R(String str, pf60 pf60Var) {
        if (this.f42601e.equals(str)) {
            this.f140316c.m65205c5(pf60Var);
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m65698S(String str, pf60 pf60Var) {
        if (this.f42601e.equals(str)) {
            this.f140316c.m65206d5(pf60Var);
        }
        this.f42600d.mo63214Q0().f42302z.f197638b.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m65699T(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40314) {
            this.f42600d.mo63212N0();
        }
        this.f140316c.m65202Z4();
    }

    /* JADX INFO: renamed from: U */
    public void m65700U() {
        this.f140316c.duringCreated(FeedModule.f39703d.f121320P0).subscribe(psd0.m173596G(new y20() { // from class: l.zu60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206093a.m65696Q((pf60) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.C11462c.b
    /* JADX INFO: renamed from: e */
    public void mo65701e(TopicMoment topicMoment, boolean z) {
        if (z) {
            this.f42601e = topicMoment.f40095id;
        } else {
            this.f42601e = "";
        }
        mo65689A();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: o */
    public void mo65702o() {
        super.mo65702o();
        m65690K();
        m65691L();
        m65700U();
        m65692M();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: z */
    public void mo65703z() {
        final String str = this.f42601e;
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f140316c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f39703d.m145797tc(photoAlbumBaseFrag.m65196T4(), this.f140316c.m65193Q4(), str)).subscribe(psd0.m173597H(new y20() { // from class: l.bv60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78571a.m65697R(str, (pf60) obj);
            }
        }, new y20() { // from class: l.cv60
            @Override // p153l.y20
            public final void call(Object obj) {
                C11460a.m65684F((Throwable) obj);
            }
        }));
    }
}
