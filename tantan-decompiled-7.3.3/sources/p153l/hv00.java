package p153l;

import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class hv00 extends n570 {

    /* JADX INFO: renamed from: d */
    public PhotoAlbumFeedBaseFrag f111721d;

    public hv00(PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag) {
        super(photoAlbumFeedBaseFrag);
        this.f111721d = photoAlbumFeedBaseFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m137263J(Throwable th) {
        this.f111721d.m65202Z4();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: A */
    public void mo65689A() {
        this.f111721d.duringCreated(FeedModule.f39702c.m61923m4(true)).subscribe(psd0.m173597H(new y20() { // from class: l.dv00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90888a.m137266I((uxj0) obj);
            }
        }, new y20() { // from class: l.ev00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95974a.m137263J((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m137264G(vg60 vg60Var) {
        DbLinks dbLinks = vg60Var.f184002b;
        this.f111721d.m65206d5(new pf60<>(dbLinks == null ? null : dbLinks.links, vg60Var.f184001a));
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m137265H(Throwable th) {
        this.f111721d.m65202Z4();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m137266I(uxj0 uxj0Var) {
        this.f111721d.m65220r5();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: i */
    public C22421c<MomentMessage> mo137267i(String str, MomentMessage momentMessage) {
        return FeedModule.f39702c.m61900b3(str, momentMessage);
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: j */
    public List<MomentMessage> mo137268j(Moment moment) {
        return FeedModule.f39702c.m61904d3(moment);
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: k */
    public C22421c<uxj0> mo137269k(Moment moment) {
        return (TEnum.equals(moment.status(), "failed") && moment.f56859id.startsWith("fake_id_")) ? FeedModule.f39702c.m61912h3(moment._id) : FeedModule.f39702c.m61910g3(moment.f56859id);
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: m */
    public User mo137270m(String str) {
        return mrb0.m159646X(str);
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: o */
    public void mo65702o() {
        this.f111721d.duringCreated(FeedModule.f39702c.m61895Y3()).subscribe(psd0.m173597H(new y20() { // from class: l.fv00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100980a.m137264G((vg60) obj);
            }
        }, new y20() { // from class: l.gv00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106595a.m137265H((Throwable) obj);
            }
        }));
        mo65689A();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: s */
    public C22421c<Envelope> mo137271s(Moment moment) {
        return FeedModule.f39702c.m61881R3(moment.owner, moment.f56859id, !moment.haveLiked);
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: y */
    public Moment mo137272y(String str) {
        return FeedModule.f39702c.m61893X3(str);
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: z */
    public void mo65703z() {
        FeedModule.f39702c.m61899a4();
    }
}
