package p153l;

import android.view.View;
import androidx.annotation.StringRes;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class a04 extends z44 {

    /* JADX INFO: renamed from: k */
    public kcg0 f67687k;

    public a04(dum dumVar, n54 n54Var) {
        super(dumVar, n54Var);
    }

    /* JADX INFO: renamed from: J4 */
    private void m95297J4() {
        mo95315S3();
        final BLiveCall bLiveCallM178265h = this.f202899j.m161648Z3().m178265h();
        BLiveCall bLiveCallM178266i = this.f202899j.m161648Z3().m178266i();
        th0.C20312a c20312a = new th0.C20312a(act());
        c20312a.m191157p(n9c0.f140855p0).m191145d(n9c0.f140804X0).m191146e(R$string.f47690N1);
        StringBuilder sb = new StringBuilder("switchToVideo no videoCall");
        sb.append(bLiveCallM178265h == null && bLiveCallM178266i == null);
        g64.m129083d(sb.toString());
        if (bLiveCallM178265h != null) {
            c20312a.m191151j(String.format(this.f196919f.getString(R$string.f47516F1), bLiveCallM178265h.userName)).m191158q(R$string.f48315q2).m191156o(new View.OnClickListener() { // from class: l.tz3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f176737a.m95309D4(bLiveCallM178265h, view);
                }
            });
        } else {
            Act act = this.f196919f;
            if (bLiveCallM178266i != null) {
                c20312a.m191151j(String.format(act.getString(R$string.f47538G1), bLiveCallM178266i.userName)).m191158q(R$string.f48494y5);
            } else {
                c20312a.m191151j(String.format(act.getString(R$string.f47472D1), this.f202898i.userName)).m191158q(R$string.f48359s2).m191156o(new View.OnClickListener() { // from class: l.uz3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f181698a.m95310E4(view);
                    }
                });
            }
        }
        c20312a.m191142a().m191141g();
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m95306A4(List list) {
        this.f202899j.mo161660m4((BLiveCall) list.get(0));
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m95307B4(Throwable th) {
        this.f202899j.m161644V3(th);
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m95308C4(Long l2) {
        m95320w4(true, R$string.f47858V1);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m95309D4(BLiveCall bLiveCall, View view) {
        m218547m4(bLiveCall);
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m95310E4(View view) {
        m95312G4();
    }

    /* JADX INFO: renamed from: F4, reason: merged with bridge method [inline-methods] */
    public final void m95321x4() {
        duringCreated(LivingNormalApiProvider.m72537U3(this.f202898i.f45190id)).subscribe(dhw.m115826e(new y20() { // from class: l.yz3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202168a.m95322y4((List) obj);
            }
        }, new y20() { // from class: l.zz3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206669a.m95323z4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G4 */
    public void m95312G4() {
        duringCreated(LivingNormalApiProvider.m72675j6(this.f202898i.f45190id)).subscribe(dhw.m115826e(new y20() { // from class: l.wz3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191725a.m95306A4((List) obj);
            }
        }, new y20() { // from class: l.xz3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196830a.m95307B4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H4 */
    public final void m95313H4(BLiveCall bLiveCall) {
        if (!u54.m194534n(bLiveCall) && !u54.m194533m(bLiveCall)) {
            if (!u54.m194535o(bLiveCall)) {
                m95320w4(true, R$string.f47674M6);
                return;
            } else {
                psd0.m173633z(this.f67687k);
                m95320w4(false, R$string.f47858V1);
                return;
            }
        }
        double dM174454o = pzi0.m174454o() - (bLiveCall.videoInviteTime / 1000000.0d);
        if (dM174454o >= zrv.m221193k().m203522T3().videoCancel.interval * 1000) {
            m95320w4(true, R$string.f47858V1);
        } else {
            ((n44) this.viewModel).m161534p(false, zrv.m221193k().m203522T3().videoCancel.title);
            m95314I4((zrv.m221193k().m203522T3().videoCancel.interval * 1000) - ((int) dM174454o));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: I4 */
    public void m95314I4(int i) {
        psd0.m173633z(this.f67687k);
        this.f67687k = m138858H3(m213810E2().m168521h2(i / 1000, TimeUnit.SECONDS)).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.sz3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171353a.m95308C4((Long) obj);
            }
        }));
    }

    @Override // p153l.z44
    /* JADX INFO: renamed from: S3 */
    public void mo95315S3() {
        super.mo95315S3();
        psd0.m173633z(this.f67687k);
    }

    @Override // p153l.z44
    /* JADX INFO: renamed from: U3 */
    public String mo95316U3() {
        h64 h64VarM143251k = this.f202899j.m161648Z3().m178270m().m143251k(this.f202898i.user);
        return h64VarM143251k == null ? "" : this.f196919f.getString(R$string.f48337r2, h64VarM143251k.f107998b);
    }

    @Override // p153l.z44
    /* JADX INFO: renamed from: W3 */
    public void mo95317W3() {
        if (u54.m194534n(this.f202898i) || u54.m194533m(this.f202898i) || u54.m194535o(this.f202898i)) {
            m95319v4();
        } else {
            m95297J4();
        }
    }

    @Override // p153l.z44
    /* JADX INFO: renamed from: k4 */
    public void mo95318k4(BLiveCall bLiveCall, h64 h64Var) {
        super.mo95318k4(bLiveCall, h64Var);
        m95313H4(bLiveCall);
    }

    /* JADX INFO: renamed from: v4 */
    public final void m95319v4() {
        act().dialog().m21499D(R$string.f47879W1).m21555t0(R$string.f47753Q1, new Runnable() { // from class: l.vz3
            @Override // java.lang.Runnable
            public final void run() {
                this.f186439a.m95321x4();
            }
        }).m21540k0(R$string.f47582I1).m21567z0();
    }

    /* JADX INFO: renamed from: w4 */
    public void m95320w4(boolean z, @StringRes int i) {
        ((n44) this.viewModel).m161534p(z, act().getString(i));
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m95322y4(List list) {
        this.f202899j.mo161660m4((BLiveCall) list.get(0));
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m95323z4(Throwable th) {
        this.f202899j.m161644V3(th);
    }
}
