package p149l;

import android.view.View;
import androidx.annotation.StringRes;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class bz3 extends a44 {

    /* JADX INFO: renamed from: k */
    public c4g0 f77999k;

    public bz3(bsm bsmVar, o44 o44Var) {
        super(bsmVar, o44Var);
    }

    /* JADX INFO: renamed from: J4 */
    private void m104537J4() {
        mo94776S3();
        final BLiveCall bLiveCallM108755h = this.f67440j.m162531Z3().m108755h();
        BLiveCall bLiveCallM108756i = this.f67440j.m162531Z3().m108756i();
        xh0.C21150a c21150a = new xh0.C21150a(act());
        c21150a.m208737p(h1c0.f105394p0).m208725d(h1c0.f105343X0).m208726e(R$string.f46842N1);
        StringBuilder sb = new StringBuilder("switchToVideo no videoCall");
        sb.append(bLiveCallM108755h == null && bLiveCallM108756i == null);
        h54.m129377d(sb.toString());
        if (bLiveCallM108755h != null) {
            c21150a.m208731j(String.format(this.f188513f.getString(R$string.f46668F1), bLiveCallM108755h.userName)).m208738q(R$string.f47467q2).m208736o(new View.OnClickListener() { // from class: l.uy3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f178823a.m104549D4(bLiveCallM108755h, view);
                }
            });
        } else {
            Act act = this.f188513f;
            if (bLiveCallM108756i != null) {
                c21150a.m208731j(String.format(act.getString(R$string.f46690G1), bLiveCallM108756i.userName)).m208738q(R$string.f47646y5);
            } else {
                c21150a.m208731j(String.format(act.getString(R$string.f46624D1), this.f67439i.userName)).m208738q(R$string.f47511s2).m208736o(new View.OnClickListener() { // from class: l.vy3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f183491a.m104550E4(view);
                    }
                });
            }
        }
        c21150a.m208722a().m208721g();
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m104546A4(List list) {
        this.f67440j.mo162543m4((BLiveCall) list.get(0));
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m104547B4(Throwable th) {
        this.f67440j.m162527V3(th);
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m104548C4(Long l2) {
        m104556w4(true, R$string.f47010V1);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m104549D4(BLiveCall bLiveCall, View view) {
        m94796m4(bLiveCall);
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m104550E4(View view) {
        m104552G4();
    }

    /* JADX INFO: renamed from: F4, reason: merged with bridge method [inline-methods] */
    public final void m104557x4() {
        duringCreated(LivingNormalApiProvider.m71354U3(this.f67439i.f44342id)).subscribe(ffw.m121194e(new e30() { // from class: l.zy3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205601a.m104558y4((List) obj);
            }
        }, new e30() { // from class: l.az3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72328a.m104559z4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G4 */
    public void m104552G4() {
        duringCreated(LivingNormalApiProvider.m71492j6(this.f67439i.f44342id)).subscribe(ffw.m121194e(new e30() { // from class: l.xy3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195020a.m104546A4((List) obj);
            }
        }, new e30() { // from class: l.yy3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200707a.m104547B4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H4 */
    public final void m104553H4(BLiveCall bLiveCall) {
        if (!v44.m196946n(bLiveCall) && !v44.m196945m(bLiveCall)) {
            if (!v44.m196947o(bLiveCall)) {
                m104556w4(true, R$string.f46826M6);
                return;
            } else {
                mkd0.m154992z(this.f77999k);
                m104556w4(false, R$string.f47010V1);
                return;
            }
        }
        double dM155944o = mqi0.m155944o() - (bLiveCall.videoInviteTime / 1000000.0d);
        if (dM155944o >= ypv.m215672k().m195735T3().videoCancel.interval * 1000) {
            m104556w4(true, R$string.f47010V1);
        } else {
            ((o34) this.viewModel).m162403p(false, ypv.m215672k().m195735T3().videoCancel.title);
            m104554I4((ypv.m215672k().m195735T3().videoCancel.interval * 1000) - ((int) dM155944o));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: I4 */
    public void m104554I4(int i) {
        mkd0.m154992z(this.f77999k);
        this.f77999k = m129299H3(m206027E2().m132135h2(i / 1000, TimeUnit.SECONDS)).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.ty3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172559a.m104548C4((Long) obj);
            }
        }));
    }

    @Override // p149l.a44
    /* JADX INFO: renamed from: S3 */
    public void mo94776S3() {
        super.mo94776S3();
        mkd0.m154992z(this.f77999k);
    }

    @Override // p149l.a44
    /* JADX INFO: renamed from: U3 */
    public String mo94778U3() {
        i54 i54VarM133917k = this.f67440j.m162531Z3().m108760m().m133917k(this.f67439i.user);
        return i54VarM133917k == null ? "" : this.f188513f.getString(R$string.f47489r2, i54VarM133917k.f111521b);
    }

    @Override // p149l.a44
    /* JADX INFO: renamed from: W3 */
    public void mo94780W3() {
        if (v44.m196946n(this.f67439i) || v44.m196945m(this.f67439i) || v44.m196947o(this.f67439i)) {
            m104555v4();
        } else {
            m104537J4();
        }
    }

    @Override // p149l.a44
    /* JADX INFO: renamed from: k4 */
    public void mo94794k4(BLiveCall bLiveCall, i54 i54Var) {
        super.mo94794k4(bLiveCall, i54Var);
        m104553H4(bLiveCall);
    }

    /* JADX INFO: renamed from: v4 */
    public final void m104555v4() {
        act().dialog().m20500D(R$string.f47031W1).m20556t0(R$string.f46905Q1, new Runnable() { // from class: l.wy3
            @Override // java.lang.Runnable
            public final void run() {
                this.f188539a.m104557x4();
            }
        }).m20541k0(R$string.f46734I1).m20568z0();
    }

    /* JADX INFO: renamed from: w4 */
    public void m104556w4(boolean z, @StringRes int i) {
        ((o34) this.viewModel).m162403p(z, act().getString(i));
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m104558y4(List list) {
        this.f67440j.mo162543m4((BLiveCall) list.get(0));
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m104559z4(Throwable th) {
        this.f67440j.m162527V3(th);
    }
}
