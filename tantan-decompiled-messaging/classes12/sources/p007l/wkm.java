package p007l;

import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import l.e30;
import l.mkd0;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class wkm extends hx60 implements n900 {

    /* JADX INFO: renamed from: d */
    public String f14563d;

    /* JADX INFO: renamed from: e */
    public String f14564e;

    /* JADX INFO: renamed from: f */
    public WeakReference<dkm> f14565f;

    /* JADX INFO: renamed from: g */
    public WeakReference<Act> f14566g;

    public wkm(Act act, dkm dkmVar, String str, String str2) {
        super(null);
        this.f14563d = str;
        this.f14564e = str2;
        this.f14565f = new WeakReference<>(dkmVar);
        this.f14566g = new WeakReference<>(act);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m15819E(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m15825K(xaj0 xaj0Var) {
        dkm dkmVar = this.f14565f.get();
        if (NullChecker.a(dkmVar)) {
            dkmVar.m9451R0(xaj0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m15826L(Throwable th) {
        dkm dkmVar = this.f14565f.get();
        if (NullChecker.a(dkmVar)) {
            dkmVar.m9452S0(th);
        }
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: A */
    public void mo5597A() {
        Act act = this.f14566g.get();
        if (act == null) {
            return;
        }
        act.duringCreated(FeedModule.f316d.m16541Rb(this.f14563d, this.f14564e)).subscribe(mkd0.H(new e30() { // from class: l.qkm
            public final void call(Object obj) {
                this.f12267a.m15825K((xaj0) obj);
            }
        }, new e30() { // from class: l.rkm
            public final void call(Object obj) {
                this.f12668a.m15826L((Throwable) obj);
            }
        }));
    }

    @Override // p007l.n900
    /* JADX INFO: renamed from: d */
    public void mo9082d(MomentMessage momentMessage, String str) {
        dkm dkmVar = this.f14565f.get();
        if (dkmVar == null) {
            return;
        }
        dkmVar.m9458a1(momentMessage, str);
    }

    @Override // p007l.n900
    /* JADX INFO: renamed from: f */
    public void mo9083f() {
        dkm dkmVar = this.f14565f.get();
        if (dkmVar == null) {
            return;
        }
        dkmVar.m9438A0();
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: o */
    public void mo5610o() {
        mo5597A();
        final dkm dkmVar = this.f14565f.get();
        Act act = this.f14566g.get();
        if (dkmVar == null || act == null) {
            return;
        }
        act.duringCreated(FeedModule.f316d.f14914C0).subscribe(mkd0.G(new e30() { // from class: l.skm
            public final void call(Object obj) {
                dkmVar.m9446L0();
            }
        }));
        act.duringCreated(FeedModule.f316d.f14988l0).subscribe(mkd0.G(new e30() { // from class: l.tkm
            public final void call(Object obj) {
                dkmVar.m9450Q0();
            }
        }));
        act.duringCreated(FeedModule.f316d.f14931J0).subscribe(mkd0.G(new e30() { // from class: l.ukm
            public final void call(Object obj) {
                dkmVar.m9447N0((MomentMessage) obj);
            }
        }));
        act.duringCreated(FeedModule.f316d.f14934K0).subscribe(mkd0.G(new e30() { // from class: l.vkm
            public final void call(Object obj) {
                dkmVar.m9448O0((MomentMessage) obj);
            }
        }));
    }

    @Override // p007l.hx60
    /* JADX INFO: renamed from: z */
    public void mo5611z() {
        Act act = this.f14566g.get();
        final dkm dkmVar = this.f14565f.get();
        if (dkmVar == null || act == null) {
            return;
        }
        act.duringCreated(FeedModule.f316d.m16501M6(this.f14563d, this.f14564e, dkmVar.f6975f)).subscribe(mkd0.H(new e30() { // from class: l.okm
            public final void call(Object obj) {
                dkmVar.m9449P0((xaj0) obj);
            }
        }, new e30() { // from class: l.pkm
            public final void call(Object obj) {
                wkm.m15819E((Throwable) obj);
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
