package p149l;

import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class ym00 extends hx60 {

    /* JADX INFO: renamed from: d */
    public PhotoAlbumFeedBaseFrag f198954d;

    public ym00(PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag) {
        super(photoAlbumFeedBaseFrag);
        this.f198954d = photoAlbumFeedBaseFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m215328J(Throwable th) {
        this.f198954d.m64019Z4();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: A */
    public void mo64506A() {
        this.f198954d.duringCreated(FeedModule.f38854c.m60739m4(true)).subscribe(mkd0.m154956H(new e30() { // from class: l.um00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177183a.m215331I((roj0) obj);
            }
        }, new e30() { // from class: l.vm00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182058a.m215328J((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m215329G(q860 q860Var) {
        DbLinks dbLinks = q860Var.f153136b;
        this.f198954d.m64023d5(new j760<>(dbLinks == null ? null : dbLinks.links, q860Var.f153135a));
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m215330H(Throwable th) {
        this.f198954d.m64019Z4();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m215331I(roj0 roj0Var) {
        this.f198954d.m64037r5();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: i */
    public C22306c<MomentMessage> mo133302i(String str, MomentMessage momentMessage) {
        return FeedModule.f38854c.m60716b3(str, momentMessage);
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: j */
    public List<MomentMessage> mo133303j(Moment moment) {
        return FeedModule.f38854c.m60720d3(moment);
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: k */
    public C22306c<roj0> mo133304k(Moment moment) {
        return (TEnum.equals(moment.status(), "failed") && moment.f56011id.startsWith("fake_id_")) ? FeedModule.f38854c.m60728h3(moment._id) : FeedModule.f38854c.m60726g3(moment.f56011id);
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: m */
    public User mo133306m(String str) {
        return ijb0.m136560X(str);
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: o */
    public void mo64519o() {
        this.f198954d.duringCreated(FeedModule.f38854c.m60711Y3()).subscribe(mkd0.m154956H(new e30() { // from class: l.wm00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187042a.m215329G((q860) obj);
            }
        }, new e30() { // from class: l.xm00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193524a.m215330H((Throwable) obj);
            }
        }));
        mo64506A();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: s */
    public C22306c<Envelope> mo133311s(Moment moment) {
        return FeedModule.f38854c.m60697R3(moment.owner, moment.f56011id, !moment.haveLiked);
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: y */
    public Moment mo133317y(String str) {
        return FeedModule.f38854c.m60709X3(str);
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: z */
    public void mo64520z() {
        FeedModule.f38854c.m60715a4();
    }
}
