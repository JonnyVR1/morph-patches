package com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.C11297a;
import java.util.concurrent.TimeUnit;
import p149l.e30;
import p149l.hx60;
import p149l.j760;
import p149l.jo0;
import p149l.mkd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.a */
/* JADX INFO: loaded from: classes12.dex */
public class C11297a extends hx60 implements C11299c.b {

    /* JADX INFO: renamed from: d */
    public PersonalFeedInProfileFrag f41752d;

    /* JADX INFO: renamed from: e */
    public String f41753e;

    public C11297a(PersonalFeedInProfileFrag personalFeedInProfileFrag) {
        super(personalFeedInProfileFrag.mo62031Q0());
        this.f41753e = "";
        this.f41752d = personalFeedInProfileFrag;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m64501F(Throwable th) {
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: A */
    public void mo64506A() {
        final String str = this.f41753e;
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f109834c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f38855d.m209570vc(photoAlbumBaseFrag.m64013T4(), str)).subscribe(mkd0.m154956H(new e30() { // from class: l.rm60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160064a.m64515S(str, (j760) obj);
            }
        }, new e30() { // from class: l.sm60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165328a.m64516T((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m64507K() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193057n0).delay(500L, TimeUnit.MILLISECONDS).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.um60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177198a.m64510N((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public void m64508L() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193061p0).subscribe(mkd0.m154955G(new e30() { // from class: l.qm60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155284a.m64511O((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public void m64509M() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193012Q0).subscribe(mkd0.m154955G(new e30() { // from class: l.pm60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150194a.m64512P((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m64510N(Moment moment) {
        this.f109834c.m64006M4(moment);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m64511O(Moment moment) {
        this.f109834c.m64009P4(moment);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m64512P(j760 j760Var) {
        this.f41752d.mo62027B3(j760Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m64513Q(j760 j760Var) {
        if (((Boolean) j760Var.f116565b).booleanValue()) {
            this.f109834c.m64018Y4((String) j760Var.f116564a, false);
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m64514R(String str, j760 j760Var) {
        if (this.f41753e.equals(str)) {
            this.f109834c.m64022c5(j760Var);
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m64515S(String str, j760 j760Var) {
        if (this.f41753e.equals(str)) {
            this.f109834c.m64023d5(j760Var);
        }
        this.f41752d.mo62031Q0().f41454z.f166899b.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m64516T(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40314) {
            this.f41752d.mo62029N0();
        }
        this.f109834c.m64019Z4();
    }

    /* JADX INFO: renamed from: U */
    public void m64517U() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193010P0).subscribe(mkd0.m154955G(new e30() { // from class: l.tm60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171134a.m64513Q((j760) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.C11299c.b
    /* JADX INFO: renamed from: e */
    public void mo64518e(TopicMoment topicMoment, boolean z) {
        if (z) {
            this.f41753e = topicMoment.f39247id;
        } else {
            this.f41753e = "";
        }
        mo64506A();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: o */
    public void mo64519o() {
        super.mo64519o();
        m64507K();
        m64508L();
        m64517U();
        m64509M();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: z */
    public void mo64520z() {
        final String str = this.f41753e;
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f109834c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f38855d.m209556tc(photoAlbumBaseFrag.m64013T4(), this.f109834c.m64010Q4(), str)).subscribe(mkd0.m154956H(new e30() { // from class: l.vm60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182081a.m64514R(str, (j760) obj);
            }
        }, new e30() { // from class: l.wm60
            @Override // p149l.e30
            public final void call(Object obj) {
                C11297a.m64501F((Throwable) obj);
            }
        }));
    }
}
