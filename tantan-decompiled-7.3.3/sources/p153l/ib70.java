package p153l;

import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailFrag;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class ib70 extends n570 implements wh00 {

    /* JADX INFO: renamed from: d */
    public String f113727d;

    /* JADX INFO: renamed from: e */
    public String f113728e;

    /* JADX INFO: renamed from: f */
    public String f113729f;

    /* JADX INFO: renamed from: g */
    public WeakReference<MomentDetailFrag> f113730g;

    /* JADX INFO: renamed from: h */
    public boolean f113731h;

    /* JADX INFO: renamed from: i */
    public boolean f113732i;

    /* JADX INFO: renamed from: j */
    public x20 f113733j;

    /* JADX INFO: renamed from: l.ib70$a */
    public class C17690a implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MomentDetailFrag f113734a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ pf60 f113735b;

        public C17690a(MomentDetailFrag momentDetailFrag, pf60 pf60Var) {
            this.f113734a = momentDetailFrag;
            this.f113735b = pf60Var;
        }

        @Override // p153l.x20
        public void call() {
            this.f113734a.m66049W4(this.f113735b);
        }
    }

    public ib70(MomentDetailFrag momentDetailFrag, String str, String str2, boolean z, String str3) {
        super(null);
        this.f140315b = new qn00(17);
        this.f113731h = z;
        this.f113727d = str;
        this.f113728e = str2;
        this.f113730g = new WeakReference<>(momentDetailFrag);
        this.f113729f = str3;
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m139292L(Throwable th) {
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m139294N(Throwable th) {
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: A */
    public void mo65689A() {
        final MomentDetailFrag momentDetailFrag = this.f113730g.get();
        if (momentDetailFrag == null) {
            return;
        }
        momentDetailFrag.duringCreated(FeedModule.f39703d.m145608Sb(this.f113727d, this.f113728e, "detail")).subscribe(psd0.m173597H(new y20() { // from class: l.cb70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80707a.m139296P(momentDetailFrag, (bkj0) obj);
            }
        }, new y20() { // from class: l.db70
            @Override // p153l.y20
            public final void call(Object obj) {
                momentDetailFrag.m66052Z4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m139295O(MomentDetailFrag momentDetailFrag, pf60 pf60Var) {
        if (this.f113732i) {
            momentDetailFrag.m66049W4(pf60Var);
        } else {
            this.f113733j = new C17690a(momentDetailFrag, pf60Var);
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m139296P(MomentDetailFrag momentDetailFrag, bkj0 bkj0Var) {
        this.f113732i = true;
        momentDetailFrag.m66051Y4(bkj0Var);
        x20 x20Var = this.f113733j;
        if (x20Var != null) {
            x20Var.call();
            this.f113733j = null;
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m139297Q(String str) {
        final MomentDetailFrag momentDetailFrag = this.f113730g.get();
        if (momentDetailFrag == null) {
            return;
        }
        momentDetailFrag.duringCreated(FeedModule.f39703d.m145636Wb(this.f113727d, this.f113728e, str)).subscribe(psd0.m173597H(new y20() { // from class: l.ab70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69213a.m139295O(momentDetailFrag, (pf60) obj);
            }
        }, new y20() { // from class: l.bb70
            @Override // p153l.y20
            public final void call(Object obj) {
                ib70.m139292L((Throwable) obj);
            }
        }));
    }

    @Override // p153l.wh00
    /* JADX INFO: renamed from: d */
    public void mo139300d(MomentMessage momentMessage, String str) {
        MomentDetailFrag momentDetailFrag = this.f113730g.get();
        if (momentDetailFrag == null) {
            return;
        }
        momentDetailFrag.m66054b5(momentMessage, str);
    }

    @Override // p153l.wh00
    /* JADX INFO: renamed from: f */
    public void mo139301f() {
        MomentDetailFrag momentDetailFrag = this.f113730g.get();
        if (momentDetailFrag == null) {
            return;
        }
        momentDetailFrag.m66042P4();
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: o */
    public void mo65702o() {
        mo65689A();
        final MomentDetailFrag momentDetailFrag = this.f113730g.get();
        if (momentDetailFrag == null) {
            return;
        }
        momentDetailFrag.duringCreated(FeedModule.f39703d.f121289C0).subscribe(psd0.m173596G(new y20() { // from class: l.eb70
            @Override // p153l.y20
            public final void call(Object obj) {
                momentDetailFrag.m66045S4();
            }
        }));
        momentDetailFrag.duringCreated(FeedModule.f39703d.f121322Q0).subscribe(psd0.m173596G(new y20() { // from class: l.fb70
            @Override // p153l.y20
            public final void call(Object obj) {
                momentDetailFrag.m66053a5();
            }
        }));
        momentDetailFrag.duringCreated(FeedModule.f39703d.f121326S0).subscribe(psd0.m173596G(new y20() { // from class: l.gb70
            @Override // p153l.y20
            public final void call(Object obj) {
                momentDetailFrag.m66053a5();
            }
        }));
        momentDetailFrag.duringCreated(FeedModule.f39703d.f121363l0).subscribe(psd0.m173596G(new y20() { // from class: l.hb70
            @Override // p153l.y20
            public final void call(Object obj) {
                momentDetailFrag.m66050X4();
            }
        }));
        if (this.f113731h) {
            return;
        }
        momentDetailFrag.duringCreated(FeedModule.f39703d.f121306J0).subscribe(psd0.m173596G(new y20() { // from class: l.xa70
            @Override // p153l.y20
            public final void call(Object obj) {
                momentDetailFrag.m66046T4((MomentMessage) obj);
            }
        }));
        momentDetailFrag.duringCreated(FeedModule.f39703d.f121309K0).subscribe(psd0.m173596G(new y20() { // from class: l.ya70
            @Override // p153l.y20
            public final void call(Object obj) {
                momentDetailFrag.m66047U4((MomentMessage) obj);
            }
        }));
    }

    @Override // p153l.n570
    /* JADX INFO: renamed from: z */
    public void mo65703z() {
        final MomentDetailFrag momentDetailFrag = this.f113730g.get();
        if (momentDetailFrag == null) {
            return;
        }
        momentDetailFrag.duringCreated(FeedModule.f39703d.m145561M6(this.f113727d, this.f113728e, momentDetailFrag.f42943B)).subscribe(psd0.m173597H(new y20() { // from class: l.wa70
            @Override // p153l.y20
            public final void call(Object obj) {
                momentDetailFrag.m66048V4((bkj0) obj);
            }
        }, new y20() { // from class: l.za70
            @Override // p153l.y20
            public final void call(Object obj) {
                ib70.m139294N((Throwable) obj);
            }
        }));
    }

    @Override // p153l.wh00
    /* JADX INFO: renamed from: a */
    public void mo139298a() {
    }

    @Override // p153l.wh00
    /* JADX INFO: renamed from: c */
    public void mo139299c() {
    }
}
