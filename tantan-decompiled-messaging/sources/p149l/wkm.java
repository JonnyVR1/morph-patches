package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class wkm extends hx60 implements n900 {

    /* JADX INFO: renamed from: d */
    public String f186785d;

    /* JADX INFO: renamed from: e */
    public String f186786e;

    /* JADX INFO: renamed from: f */
    public WeakReference<dkm> f186787f;

    /* JADX INFO: renamed from: g */
    public WeakReference<Act> f186788g;

    public wkm(Act act, dkm dkmVar, String str, String str2) {
        super(null);
        this.f186785d = str;
        this.f186786e = str2;
        this.f186787f = new WeakReference<>(dkmVar);
        this.f186788g = new WeakReference<>(act);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m203676E(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m203682K(xaj0 xaj0Var) {
        dkm dkmVar = this.f186787f.get();
        if (NullChecker.m81303a(dkmVar)) {
            dkmVar.m112254R0(xaj0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m203683L(Throwable th) {
        dkm dkmVar = this.f186787f.get();
        if (NullChecker.m81303a(dkmVar)) {
            dkmVar.m112255S0(th);
        }
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: A */
    public void mo64506A() {
        Act act = this.f186788g.get();
        if (act == null) {
            return;
        }
        act.duringCreated(FeedModule.f38855d.m209360Rb(this.f186785d, this.f186786e)).subscribe(mkd0.m154956H(new e30() { // from class: l.qkm
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155146a.m203682K((xaj0) obj);
            }
        }, new e30() { // from class: l.rkm
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159872a.m203683L((Throwable) obj);
            }
        }));
    }

    @Override // p149l.n900
    /* JADX INFO: renamed from: d */
    public void mo104989d(MomentMessage momentMessage, String str) {
        dkm dkmVar = this.f186787f.get();
        if (dkmVar == null) {
            return;
        }
        dkmVar.m112260a1(momentMessage, str);
    }

    @Override // p149l.n900
    /* JADX INFO: renamed from: f */
    public void mo104990f() {
        dkm dkmVar = this.f186787f.get();
        if (dkmVar == null) {
            return;
        }
        dkmVar.m112242A0();
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: o */
    public void mo64519o() {
        mo64506A();
        final dkm dkmVar = this.f186787f.get();
        Act act = this.f186788g.get();
        if (dkmVar == null || act == null) {
            return;
        }
        act.duringCreated(FeedModule.f38855d.f192979C0).subscribe(mkd0.m154955G(new e30() { // from class: l.skm
            @Override // p149l.e30
            public final void call(Object obj) {
                dkmVar.m112249L0();
            }
        }));
        act.duringCreated(FeedModule.f38855d.f193053l0).subscribe(mkd0.m154955G(new e30() { // from class: l.tkm
            @Override // p149l.e30
            public final void call(Object obj) {
                dkmVar.m112253Q0();
            }
        }));
        act.duringCreated(FeedModule.f38855d.f192996J0).subscribe(mkd0.m154955G(new e30() { // from class: l.ukm
            @Override // p149l.e30
            public final void call(Object obj) {
                dkmVar.m112250N0((MomentMessage) obj);
            }
        }));
        act.duringCreated(FeedModule.f38855d.f192999K0).subscribe(mkd0.m154955G(new e30() { // from class: l.vkm
            @Override // p149l.e30
            public final void call(Object obj) {
                dkmVar.m112251O0((MomentMessage) obj);
            }
        }));
    }

    @Override // p149l.hx60
    /* JADX INFO: renamed from: z */
    public void mo64520z() {
        Act act = this.f186788g.get();
        final dkm dkmVar = this.f186787f.get();
        if (dkmVar == null || act == null) {
            return;
        }
        act.duringCreated(FeedModule.f38855d.m209320M6(this.f186785d, this.f186786e, dkmVar.f86673f)).subscribe(mkd0.m154956H(new e30() { // from class: l.okm
            @Override // p149l.e30
            public final void call(Object obj) {
                dkmVar.m112252P0((xaj0) obj);
            }
        }, new e30() { // from class: l.pkm
            @Override // p149l.e30
            public final void call(Object obj) {
                wkm.m203676E((Throwable) obj);
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
