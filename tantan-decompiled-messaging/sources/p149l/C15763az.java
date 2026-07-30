package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.account.p050ui.accountai.SignUpAiAct;
import com.p046p1.mobile.putong.account.p050ui.camera.AccountVideoRecordFrag;
import com.p046p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: renamed from: l.az */
/* JADX INFO: loaded from: classes9.dex */
public class C15763az extends jq2<x00> {

    /* JADX INFO: renamed from: c */
    public static boolean f72319c;

    /* JADX INFO: renamed from: d */
    public static boolean f72320d;

    /* JADX INFO: renamed from: e */
    public static boolean f72321e;

    /* JADX INFO: renamed from: f */
    public static boolean f72322f;

    /* JADX INFO: renamed from: a */
    public AccountVideoRecordFrag f72323a;

    /* JADX INFO: renamed from: b */
    public boolean f72324b;

    public C15763az(AccountVideoRecordFrag accountVideoRecordFrag) {
        super(accountVideoRecordFrag);
        this.f72323a = accountVideoRecordFrag;
    }

    /* JADX INFO: renamed from: m0 */
    public void m99600m0(Bundle bundle) {
        creates(new e30() { // from class: l.ry
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161529a.m99601n0((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.sy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166845a.m99602o0((C4319c) obj);
            }
        }));
        duringCreated(C21696zh.m218749d().f203117f).observeOn(jo0.m142408a()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.ty
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172548a.m99603p0((Boolean) obj);
            }
        }));
        C15686ap.m98009j().m98012h();
        C15686ap.m98008f();
        ((x00) this.viewModel).m206485k1(bundle);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m99601n0(Bundle bundle) {
        ((x00) this.viewModel).m206503r2();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m99602o0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            ((x00) this.viewModel).m206514v2();
        } else if (c4319c == C4319c.f15549j) {
            ((x00) this.viewModel).m206511u2();
        } else if (c4319c == C4319c.f15552m) {
            ((x00) this.viewModel).m206506s2();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m99603p0(Boolean bool) {
        ((x00) this.viewModel).m206477g3(bool.booleanValue());
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m99604q0(roj0 roj0Var) {
        ((x00) this.viewModel).m206500q2();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m99605r0(List list) {
        C19952sj.m184358C().m184399T(list);
        if (NullChecker.m81304b(this.viewModel)) {
            ((x00) this.viewModel).m206397C2(list);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m99606s0(j760 j760Var) {
        if (NullChecker.m81304b(this.viewModel)) {
            ((x00) this.viewModel).m206517w2((List) j760Var.f116564a, (List) j760Var.f116565b);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m99607t0(List list) {
        int size = list.size();
        V v2 = this.viewModel;
        if (size > 0) {
            ((x00) v2).m206453X2((Media) list.get(0));
        } else {
            ((x00) v2).m206453X2(null);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m99608u0() {
        if (this.f72324b) {
            return;
        }
        duringCreated(SignUpAiAct.f16355c.m174492L());
        duringCreated(SignUpAiAct.f16355c.m174484D(false)).subscribe(mkd0.m154955G(new e30() { // from class: l.uy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178806a.m99604q0((roj0) obj);
            }
        }));
        duringCreated(SignUpAiAct.f16355c.m174496z()).subscribe(mkd0.m154955G(new e30() { // from class: l.vy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183488a.m99605r0((List) obj);
            }
        }));
        act().duringCreated(C22306c.combineLatest(SignUpAiAct.f16355c.m174481A(), SignUpAiAct.f16355c.m174495y(), new C20992wy())).subscribe(mkd0.m154956H(new e30() { // from class: l.xy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194980a.m99606s0((j760) obj);
            }
        }, new e30() { // from class: l.yy
            @Override // p149l.e30
            public final void call(Object obj) {
                CrashHelper.m81296c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public void m99609x0(boolean z) {
        this.f72324b = z;
    }

    /* JADX INFO: renamed from: y0 */
    public void m99610y0() {
        C16239ct c16239ct = new C16239ct(act(), true, true);
        c16239ct.m108648i().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.zy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205593a.m99607t0((List) obj);
            }
        }));
        act().getSupportLoaderManager().mo3088e(0, null, c16239ct);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
