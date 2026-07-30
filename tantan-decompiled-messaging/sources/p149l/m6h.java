package p149l;

import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class m6h extends hx60 {

    /* JADX INFO: renamed from: d */
    public an00 f131683d;

    /* JADX INFO: renamed from: e */
    public String f131684e;

    /* JADX INFO: renamed from: f */
    public Moment f131685f;

    public m6h(PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag, String str) {
        super(photoAlbumFeedBaseFrag);
        this.f131684e = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m153203P(j760 j760Var) {
        this.f109834c.m64005B3(j760Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m153204R(j760 j760Var) {
        if (this.f131685f != null) {
            m153209L(j760Var);
        }
        this.f109834c.m64022c5(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m153205S(Throwable th) {
        this.f109834c.m64019Z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m153206T(j760 j760Var) {
        if (this.f131685f != null && j760Var.f116565b != 0) {
            m153209L(j760Var);
            ((List) j760Var.f116565b).add(0, this.f131685f);
        }
        this.f109834c.m64023d5(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m153207U(Throwable th) {
        this.f109834c.m64019Z4();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: A */
    public void mo64506A() {
        this.f109834c.duringCreated(FeedModule.f38855d.m209489k8(this.f131683d, "recommend", this.f131684e)).subscribe(mkd0.m154956H(new e30() { // from class: l.j6h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116476a.m153206T((j760) obj);
            }
        }, new e30() { // from class: l.k6h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121467a.m153207U((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m153208K() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193061p0).subscribe(mkd0.m154955G(new e30() { // from class: l.f6h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96124a.m153211N((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public void m153209L(j760<Links, List<Moment>> j760Var) {
        ArrayList arrayListM200339n = vwb.m200339n(j760Var.f116565b, new w9j() { // from class: l.l6h
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f126640a.m153212O((Moment) obj);
            }
        });
        j760Var.f116565b.clear();
        j760Var.f116565b.addAll(arrayListM200339n);
    }

    /* JADX INFO: renamed from: M */
    public void m153210M() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193012Q0).subscribe(mkd0.m154955G(new e30() { // from class: l.g6h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101264a.m153203P((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m153211N(Moment moment) {
        this.f109834c.m64009P4(moment);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ Boolean m153212O(Moment moment) {
        return Boolean.valueOf(!moment.f56011id.equals(this.f131685f.f56011id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m153213Q(j760 j760Var) {
        if (((Boolean) j760Var.f116565b).booleanValue()) {
            this.f109834c.m64018Y4((String) j760Var.f116564a, false);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m153214V() {
        this.f109834c.duringCreated(FeedModule.f38855d.f193010P0).subscribe(mkd0.m154955G(new e30() { // from class: l.e6h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89575a.m153213Q((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W */
    public void m153215W(String str) {
        this.f131685f = FeedModule.f38855d.m209572w7(str);
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: o */
    public void mo64519o() {
        super.mo64519o();
        m153208K();
        m153210M();
        m153214V();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: z */
    public void mo64520z() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f109834c;
        photoAlbumBaseFrag.duringCreated(FeedModule.f38855d.m209482j8(this.f131683d, "recommend", this.f131684e, photoAlbumBaseFrag.m64010Q4())).subscribe(mkd0.m154956H(new e30() { // from class: l.h6h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106060a.m153204R((j760) obj);
            }
        }, new e30() { // from class: l.i6h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111742a.m153205S((Throwable) obj);
            }
        }));
    }
}
