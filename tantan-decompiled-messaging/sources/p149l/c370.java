package p149l;

import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailFrag;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class c370 extends hx60 implements n900 {

    /* JADX INFO: renamed from: d */
    public String f78449d;

    /* JADX INFO: renamed from: e */
    public String f78450e;

    /* JADX INFO: renamed from: f */
    public String f78451f;

    /* JADX INFO: renamed from: g */
    public WeakReference<MomentDetailFrag> f78452g;

    /* JADX INFO: renamed from: h */
    public boolean f78453h;

    /* JADX INFO: renamed from: i */
    public boolean f78454i;

    /* JADX INFO: renamed from: j */
    public d30 f78455j;

    /* JADX INFO: renamed from: l.c370$a */
    public class C16047a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MomentDetailFrag f78456a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ j760 f78457b;

        public C16047a(MomentDetailFrag momentDetailFrag, j760 j760Var) {
            this.f78456a = momentDetailFrag;
            this.f78457b = j760Var;
        }

        @Override // p149l.d30
        public void call() {
            this.f78456a.m64866W4(this.f78457b);
        }
    }

    public c370(MomentDetailFrag momentDetailFrag, String str, String str2, boolean z, String str3) {
        super(null);
        this.f109833b = new hf00(17);
        this.f78453h = z;
        this.f78449d = str;
        this.f78450e = str2;
        this.f78452g = new WeakReference<>(momentDetailFrag);
        this.f78451f = str3;
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m104981L(Throwable th) {
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m104983N(Throwable th) {
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: A */
    public void mo64506A() {
        final MomentDetailFrag momentDetailFrag = this.f78452g.get();
        if (momentDetailFrag == null) {
            return;
        }
        momentDetailFrag.duringCreated(FeedModule.f38855d.m209367Sb(this.f78449d, this.f78450e, "detail")).subscribe(mkd0.m154956H(new e30() { // from class: l.w270
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184094a.m104985P(momentDetailFrag, (xaj0) obj);
            }
        }, new e30() { // from class: l.x270
            @Override // p149l.e30
            public final void call(Object obj) {
                momentDetailFrag.m64869Z4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m104984O(MomentDetailFrag momentDetailFrag, j760 j760Var) {
        if (this.f78454i) {
            momentDetailFrag.m64866W4(j760Var);
        } else {
            this.f78455j = new C16047a(momentDetailFrag, j760Var);
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m104985P(MomentDetailFrag momentDetailFrag, xaj0 xaj0Var) {
        this.f78454i = true;
        momentDetailFrag.m64868Y4(xaj0Var);
        d30 d30Var = this.f78455j;
        if (d30Var != null) {
            d30Var.call();
            this.f78455j = null;
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m104986Q(String str) {
        final MomentDetailFrag momentDetailFrag = this.f78452g.get();
        if (momentDetailFrag == null) {
            return;
        }
        momentDetailFrag.duringCreated(FeedModule.f38855d.m209395Wb(this.f78449d, this.f78450e, str)).subscribe(mkd0.m154956H(new e30() { // from class: l.u270
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f173080a.m104984O(momentDetailFrag, (j760) obj);
            }
        }, new e30() { // from class: l.v270
            @Override // p149l.e30
            public final void call(Object obj) {
                c370.m104981L((Throwable) obj);
            }
        }));
    }

    @Override // p149l.n900
    /* JADX INFO: renamed from: d */
    public void mo104989d(MomentMessage momentMessage, String str) {
        MomentDetailFrag momentDetailFrag = this.f78452g.get();
        if (momentDetailFrag == null) {
            return;
        }
        momentDetailFrag.m64871b5(momentMessage, str);
    }

    @Override // p149l.n900
    /* JADX INFO: renamed from: f */
    public void mo104990f() {
        MomentDetailFrag momentDetailFrag = this.f78452g.get();
        if (momentDetailFrag == null) {
            return;
        }
        momentDetailFrag.m64859P4();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: o */
    public void mo64519o() {
        mo64506A();
        final MomentDetailFrag momentDetailFrag = this.f78452g.get();
        if (momentDetailFrag == null) {
            return;
        }
        momentDetailFrag.duringCreated(FeedModule.f38855d.f192979C0).subscribe(mkd0.m154955G(new e30() { // from class: l.y270
            @Override // p149l.e30
            public final void call(Object obj) {
                momentDetailFrag.m64862S4();
            }
        }));
        momentDetailFrag.duringCreated(FeedModule.f38855d.f193012Q0).subscribe(mkd0.m154955G(new e30() { // from class: l.z270
            @Override // p149l.e30
            public final void call(Object obj) {
                momentDetailFrag.m64870a5();
            }
        }));
        momentDetailFrag.duringCreated(FeedModule.f38855d.f193016S0).subscribe(mkd0.m154955G(new e30() { // from class: l.a370
            @Override // p149l.e30
            public final void call(Object obj) {
                momentDetailFrag.m64870a5();
            }
        }));
        momentDetailFrag.duringCreated(FeedModule.f38855d.f193053l0).subscribe(mkd0.m154955G(new e30() { // from class: l.b370
            @Override // p149l.e30
            public final void call(Object obj) {
                momentDetailFrag.m64867X4();
            }
        }));
        if (this.f78453h) {
            return;
        }
        momentDetailFrag.duringCreated(FeedModule.f38855d.f192996J0).subscribe(mkd0.m154955G(new e30() { // from class: l.r270
            @Override // p149l.e30
            public final void call(Object obj) {
                momentDetailFrag.m64863T4((MomentMessage) obj);
            }
        }));
        momentDetailFrag.duringCreated(FeedModule.f38855d.f192999K0).subscribe(mkd0.m154955G(new e30() { // from class: l.s270
            @Override // p149l.e30
            public final void call(Object obj) {
                momentDetailFrag.m64864U4((MomentMessage) obj);
            }
        }));
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: z */
    public void mo64520z() {
        final MomentDetailFrag momentDetailFrag = this.f78452g.get();
        if (momentDetailFrag == null) {
            return;
        }
        momentDetailFrag.duringCreated(FeedModule.f38855d.m209320M6(this.f78449d, this.f78450e, momentDetailFrag.f42095B)).subscribe(mkd0.m154956H(new e30() { // from class: l.q270
            @Override // p149l.e30
            public final void call(Object obj) {
                momentDetailFrag.m64865V4((xaj0) obj);
            }
        }, new e30() { // from class: l.t270
            @Override // p149l.e30
            public final void call(Object obj) {
                c370.m104983N((Throwable) obj);
            }
        }));
    }

    @Override // p149l.n900
    /* JADX INFO: renamed from: a */
    public void mo104987a() {
    }

    @Override // p149l.n900
    /* JADX INFO: renamed from: c */
    public void mo104988c() {
    }
}
