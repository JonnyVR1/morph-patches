package p007l;

import com.p000p1.mobile.putong.data.DbLinks;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.e30;
import l.j760;
import l.mkd0;
import l.q860;
import l.roj0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ym00 extends hx60 {

    /* JADX INFO: renamed from: d */
    public PhotoAlbumFeedBaseFrag f15472d;

    public ym00(PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag) {
        super(photoAlbumFeedBaseFrag);
        this.f15472d = photoAlbumFeedBaseFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m17175J(Throwable th) {
        this.f15472d.m5062Z4();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: A */
    public void mo5597A() {
        this.f15472d.duringCreated(FeedModule.f315c.m1665m4(true)).subscribe(mkd0.H(new e30() { // from class: l.um00
            public final void call(Object obj) {
                this.f13860a.m17178I((roj0) obj);
            }
        }, new e30() { // from class: l.vm00
            public final void call(Object obj) {
                this.f14234a.m17175J((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m17176G(q860 q860Var) {
        DbLinks dbLinks = q860Var.b;
        this.f15472d.m5066d5(new j760<>(dbLinks == null ? null : dbLinks.links, q860Var.a));
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m17177H(Throwable th) {
        this.f15472d.m5062Z4();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m17178I(roj0 roj0Var) {
        this.f15472d.m5084r5();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: i */
    public c<MomentMessage> mo10737i(String str, MomentMessage momentMessage) {
        return FeedModule.f315c.m1642b3(str, momentMessage);
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: j */
    public List<MomentMessage> mo10738j(Moment moment) {
        return FeedModule.f315c.m1646d3(moment);
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: k */
    public c<roj0> mo10739k(Moment moment) {
        return (TEnum.equals(moment.status(), "failed") && ((DbObject) moment).id.startsWith("fake_id_")) ? FeedModule.f315c.m1654h3(((DbObject) moment)._id) : FeedModule.f315c.m1652g3(((DbObject) moment).id);
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: m */
    public User mo10741m(String str) {
        return ijb0.m10913X(str);
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: o */
    public void mo5610o() {
        this.f15472d.duringCreated(FeedModule.f315c.m1637Y3()).subscribe(mkd0.H(new e30() { // from class: l.wm00
            public final void call(Object obj) {
                this.f14622a.m17176G((q860) obj);
            }
        }, new e30() { // from class: l.xm00
            public final void call(Object obj) {
                this.f15042a.m17177H((Throwable) obj);
            }
        }));
        mo5597A();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: s */
    public c<Envelope> mo10746s(Moment moment) {
        return FeedModule.f315c.m1623R3(moment.owner, ((DbObject) moment).id, !moment.haveLiked);
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: y */
    public Moment mo10752y(String str) {
        return FeedModule.f315c.m1635X3(str);
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: z */
    public void mo5611z() {
        FeedModule.f315c.m1641a4();
    }
}
