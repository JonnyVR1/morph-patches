package p006l;

import android.os.Bundle;
import com.p000p1.mobile.putong.account.p002ui.accountai.SignUpAiAct;
import com.p000p1.mobile.putong.account.p002ui.camera.AccountVideoRecordFrag;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.j760;
import l.jo0;
import l.jq2;
import l.mkd0;
import l.roj0;
import l.s7m;
import l.vwb;
import l.x9j;

/* JADX INFO: renamed from: l.az */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0537az extends jq2<x00> {

    /* JADX INFO: renamed from: c */
    public static boolean f8607c;

    /* JADX INFO: renamed from: d */
    public static boolean f8608d;

    /* JADX INFO: renamed from: e */
    public static boolean f8609e;

    /* JADX INFO: renamed from: f */
    public static boolean f8610f;

    /* JADX INFO: renamed from: a */
    public AccountVideoRecordFrag f8611a;

    /* JADX INFO: renamed from: b */
    public boolean f8612b;

    public C0537az(AccountVideoRecordFrag accountVideoRecordFrag) {
        super(accountVideoRecordFrag);
        this.f8611a = accountVideoRecordFrag;
    }

    /* JADX INFO: renamed from: m0 */
    public void m12334m0(Bundle bundle) {
        creates(new e30() { // from class: l.ry
            public final void call(Object obj) {
                this.f20903a.m12335n0((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.sy
            public final void call(Object obj) {
                this.f21741a.m12336o0((c) obj);
            }
        }));
        duringCreated(C1521zh.m28702d().f28750f).observeOn(jo0.a()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.ty
            public final void call(Object obj) {
                this.f22328a.m12337p0((Boolean) obj);
            }
        }));
        C0526ap.m12159j().m12162h();
        C0526ap.m12158f();
        ((x00) ((jq2) this).viewModel).m27097k1(bundle);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m12335n0(Bundle bundle) {
        ((x00) ((jq2) this).viewModel).m27115r2();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m12336o0(c cVar) {
        if (cVar == c.i) {
            ((x00) ((jq2) this).viewModel).m27126v2();
        } else if (cVar == c.j) {
            ((x00) ((jq2) this).viewModel).m27123u2();
        } else if (cVar == c.m) {
            ((x00) ((jq2) this).viewModel).m27118s2();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m12337p0(Boolean bool) {
        ((x00) ((jq2) this).viewModel).m27088g3(bool.booleanValue());
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m12338q0(roj0 roj0Var) {
        ((x00) ((jq2) this).viewModel).m27112q2();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m12339r0(List list) {
        C1262sj.m23765C().m23806T(list);
        if (NullChecker.b(((jq2) this).viewModel)) {
            ((x00) ((jq2) this).viewModel).m27008C2(list);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m12340s0(j760 j760Var) {
        if (NullChecker.b(((jq2) this).viewModel)) {
            ((x00) ((jq2) this).viewModel).m27129w2((List) j760Var.a, (List) j760Var.b);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m12341t0(List list) {
        int size = list.size();
        s7m s7mVar = ((jq2) this).viewModel;
        if (size > 0) {
            ((x00) s7mVar).m27064X2((Media) list.get(0));
        } else {
            ((x00) s7mVar).m27064X2(null);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m12342u0() {
        if (this.f8612b) {
            return;
        }
        duringCreated(SignUpAiAct.f344c.m22076L());
        duringCreated(SignUpAiAct.f344c.m22068D(false)).subscribe(mkd0.G(new e30() { // from class: l.uy
            public final void call(Object obj) {
                this.f23799a.m12338q0((roj0) obj);
            }
        }));
        duringCreated(SignUpAiAct.f344c.m22080z()).subscribe(mkd0.G(new e30() { // from class: l.vy
            public final void call(Object obj) {
                this.f24530a.m12339r0((List) obj);
            }
        }));
        act().duringCreated(rx.c.combineLatest(SignUpAiAct.f344c.m22065A(), SignUpAiAct.f344c.m22079y(), new x9j() { // from class: l.wy
            public final Object call(Object obj, Object obj2) {
                return vwb.Y((List) obj, (List) obj2);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.xy
            public final void call(Object obj) {
                this.f27781a.m12340s0((j760) obj);
            }
        }, new e30() { // from class: l.yy
            public final void call(Object obj) {
                CrashHelper.c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public void m12343x0(boolean z) {
        this.f8612b = z;
    }

    /* JADX INFO: renamed from: y0 */
    public void m12344y0() {
        C0617ct c0617ct = new C0617ct(act(), true, true);
        c0617ct.m13627i().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.zy
            public final void call(Object obj) {
                this.f29028a.m12341t0((List) obj);
            }
        }));
        act().getSupportLoaderManager().e(0, (Bundle) null, c0617ct);
    }

    public void destroy() {
    }
}
