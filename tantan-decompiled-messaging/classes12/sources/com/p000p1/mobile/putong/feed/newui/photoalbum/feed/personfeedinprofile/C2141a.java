package com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.C2141a;
import com.p1.mobile.putong.api.api.TantanException;
import java.util.concurrent.TimeUnit;
import l.e30;
import l.j760;
import l.jo0;
import l.mkd0;
import p007l.hx60;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2141a extends hx60 implements C2143c.b {

    /* JADX INFO: renamed from: d */
    public PersonalFeedInProfileFrag f3213d;

    /* JADX INFO: renamed from: e */
    public String f3214e;

    public C2141a(PersonalFeedInProfileFrag personalFeedInProfileFrag) {
        super(personalFeedInProfileFrag.mo3007Q0());
        this.f3214e = "";
        this.f3213d = personalFeedInProfileFrag;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m5592F(Throwable th) {
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: A */
    public void mo5597A() {
        final String str = this.f3214e;
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f8836c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f316d.m16751vc(photoAlbumBaseFrag.m5056T4(), str)).subscribe(mkd0.H(new e30() { // from class: l.rm60
            public final void call(Object obj) {
                this.f12677a.m5606S(str, (j760) obj);
            }
        }, new e30() { // from class: l.sm60
            public final void call(Object obj) {
                this.f13007a.m5607T((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m5598K() {
        this.f8836c.duringCreated(FeedModule.f316d.f14992n0).delay(500L, TimeUnit.MILLISECONDS).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.um60
            public final void call(Object obj) {
                this.f13861a.m5601N((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public void m5599L() {
        this.f8836c.duringCreated(FeedModule.f316d.f14996p0).subscribe(mkd0.G(new e30() { // from class: l.qm60
            public final void call(Object obj) {
                this.f12273a.m5602O((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public void m5600M() {
        this.f8836c.duringCreated(FeedModule.f316d.f14947Q0).subscribe(mkd0.G(new e30() { // from class: l.pm60
            public final void call(Object obj) {
                this.f11886a.m5603P((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m5601N(Moment moment) {
        this.f8836c.m5049M4(moment);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m5602O(Moment moment) {
        this.f8836c.m5052P4(moment);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m5603P(j760 j760Var) {
        this.f3213d.mo3002B3(j760Var, false);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m5604Q(j760 j760Var) {
        if (((Boolean) j760Var.b).booleanValue()) {
            this.f8836c.m5061Y4((String) j760Var.a, false);
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m5605R(String str, j760 j760Var) {
        if (this.f3214e.equals(str)) {
            this.f8836c.m5065c5(j760Var);
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m5606S(String str, j760 j760Var) {
        if (this.f3214e.equals(str)) {
            this.f8836c.m5066d5(j760Var);
        }
        this.f3213d.mo3007Q0().f2915z.f13114b.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m5607T(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40314) {
            this.f3213d.mo3005N0();
        }
        this.f8836c.m5062Z4();
    }

    /* JADX INFO: renamed from: U */
    public void m5608U() {
        this.f8836c.duringCreated(FeedModule.f316d.f14945P0).subscribe(mkd0.G(new e30() { // from class: l.tm60
            public final void call(Object obj) {
                this.f13336a.m5604Q((j760) obj);
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.C2143c.b
    /* JADX INFO: renamed from: e */
    public void mo5609e(TopicMoment topicMoment, boolean z) {
        if (z) {
            this.f3214e = topicMoment.f708id;
        } else {
            this.f3214e = "";
        }
        mo5597A();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: o */
    public void mo5610o() {
        super.mo5610o();
        m5598K();
        m5599L();
        m5608U();
        m5600M();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: z */
    public void mo5611z() {
        final String str = this.f3214e;
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f8836c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f316d.m16737tc(photoAlbumBaseFrag.m5056T4(), this.f8836c.m5053Q4(), str)).subscribe(mkd0.H(new e30() { // from class: l.vm60
            public final void call(Object obj) {
                this.f14235a.m5605R(str, (j760) obj);
            }
        }, new e30() { // from class: l.wm60
            public final void call(Object obj) {
                C2141a.m5592F((Throwable) obj);
            }
        }));
    }
}
