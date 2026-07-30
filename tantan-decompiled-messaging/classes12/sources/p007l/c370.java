package p007l;

import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailFrag;
import java.lang.ref.WeakReference;
import l.d30;
import l.e30;
import l.j760;
import l.mkd0;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class c370 extends hx60 implements n900 {

    /* JADX INFO: renamed from: d */
    public String f6507d;

    /* JADX INFO: renamed from: e */
    public String f6508e;

    /* JADX INFO: renamed from: f */
    public String f6509f;

    /* JADX INFO: renamed from: g */
    public WeakReference<MomentDetailFrag> f6510g;

    /* JADX INFO: renamed from: h */
    public boolean f6511h;

    /* JADX INFO: renamed from: i */
    public boolean f6512i;

    /* JADX INFO: renamed from: j */
    public d30 f6513j;

    /* JADX INFO: renamed from: l.c370$a */
    public class C2347a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MomentDetailFrag f6514a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ j760 f6515b;

        public C2347a(MomentDetailFrag momentDetailFrag, j760 j760Var) {
            this.f6514a = momentDetailFrag;
            this.f6515b = j760Var;
        }

        public void call() {
            this.f6514a.m5963W4(this.f6515b);
        }
    }

    public c370(MomentDetailFrag momentDetailFrag, String str, String str2, boolean z, String str3) {
        super(null);
        this.f8835b = new hf00(17);
        this.f6511h = z;
        this.f6507d = str;
        this.f6508e = str2;
        this.f6510g = new WeakReference<>(momentDetailFrag);
        this.f6509f = str3;
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m9074L(Throwable th) {
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m9076N(Throwable th) {
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: A */
    public void mo5597A() {
        final MomentDetailFrag momentDetailFrag = this.f6510g.get();
        if (momentDetailFrag == null) {
            return;
        }
        momentDetailFrag.duringCreated(FeedModule.f316d.m16548Sb(this.f6507d, this.f6508e, "detail")).subscribe(mkd0.H(new e30() { // from class: l.w270
            public final void call(Object obj) {
                this.f14372a.m9078P(momentDetailFrag, (xaj0) obj);
            }
        }, new e30() { // from class: l.x270
            public final void call(Object obj) {
                momentDetailFrag.m5966Z4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m9077O(MomentDetailFrag momentDetailFrag, j760 j760Var) {
        if (this.f6512i) {
            momentDetailFrag.m5963W4(j760Var);
        } else {
            this.f6513j = new C2347a(momentDetailFrag, j760Var);
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m9078P(MomentDetailFrag momentDetailFrag, xaj0 xaj0Var) {
        this.f6512i = true;
        momentDetailFrag.m5965Y4(xaj0Var);
        d30 d30Var = this.f6513j;
        if (d30Var != null) {
            d30Var.call();
            this.f6513j = null;
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m9079Q(String str) {
        final MomentDetailFrag momentDetailFrag = this.f6510g.get();
        if (momentDetailFrag == null) {
            return;
        }
        momentDetailFrag.duringCreated(FeedModule.f316d.m16576Wb(this.f6507d, this.f6508e, str)).subscribe(mkd0.H(new e30() { // from class: l.u270
            public final void call(Object obj) {
                this.f13506a.m9077O(momentDetailFrag, (j760) obj);
            }
        }, new e30() { // from class: l.v270
            public final void call(Object obj) {
                c370.m9074L((Throwable) obj);
            }
        }));
    }

    @Override // p007l.n900
    /* JADX INFO: renamed from: d */
    public void mo9082d(MomentMessage momentMessage, String str) {
        MomentDetailFrag momentDetailFrag = this.f6510g.get();
        if (momentDetailFrag == null) {
            return;
        }
        momentDetailFrag.m5968b5(momentMessage, str);
    }

    @Override // p007l.n900
    /* JADX INFO: renamed from: f */
    public void mo9083f() {
        MomentDetailFrag momentDetailFrag = this.f6510g.get();
        if (momentDetailFrag == null) {
            return;
        }
        momentDetailFrag.m5956P4();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: o */
    public void mo5610o() {
        mo5597A();
        final MomentDetailFrag momentDetailFrag = this.f6510g.get();
        if (momentDetailFrag == null) {
            return;
        }
        momentDetailFrag.duringCreated(FeedModule.f316d.f14914C0).subscribe(mkd0.G(new e30() { // from class: l.y270
            public final void call(Object obj) {
                momentDetailFrag.m5959S4();
            }
        }));
        momentDetailFrag.duringCreated(FeedModule.f316d.f14947Q0).subscribe(mkd0.G(new e30() { // from class: l.z270
            public final void call(Object obj) {
                momentDetailFrag.m5967a5();
            }
        }));
        momentDetailFrag.duringCreated(FeedModule.f316d.f14951S0).subscribe(mkd0.G(new e30() { // from class: l.a370
            public final void call(Object obj) {
                momentDetailFrag.m5967a5();
            }
        }));
        momentDetailFrag.duringCreated(FeedModule.f316d.f14988l0).subscribe(mkd0.G(new e30() { // from class: l.b370
            public final void call(Object obj) {
                momentDetailFrag.m5964X4();
            }
        }));
        if (this.f6511h) {
            return;
        }
        momentDetailFrag.duringCreated(FeedModule.f316d.f14931J0).subscribe(mkd0.G(new e30() { // from class: l.r270
            public final void call(Object obj) {
                momentDetailFrag.m5960T4((MomentMessage) obj);
            }
        }));
        momentDetailFrag.duringCreated(FeedModule.f316d.f14934K0).subscribe(mkd0.G(new e30() { // from class: l.s270
            public final void call(Object obj) {
                momentDetailFrag.m5961U4((MomentMessage) obj);
            }
        }));
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: z */
    public void mo5611z() {
        final MomentDetailFrag momentDetailFrag = this.f6510g.get();
        if (momentDetailFrag == null) {
            return;
        }
        momentDetailFrag.duringCreated(FeedModule.f316d.m16501M6(this.f6507d, this.f6508e, momentDetailFrag.f3556B)).subscribe(mkd0.H(new e30() { // from class: l.q270
            public final void call(Object obj) {
                momentDetailFrag.m5962V4((xaj0) obj);
            }
        }, new e30() { // from class: l.t270
            public final void call(Object obj) {
                c370.m9076N((Throwable) obj);
            }
        }));
    }

    @Override // p007l.n900
    /* JADX INFO: renamed from: a */
    public void mo9080a() {
    }

    @Override // p007l.n900
    /* JADX INFO: renamed from: c */
    public void mo9081c() {
    }
}
