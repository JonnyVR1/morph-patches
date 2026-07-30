package p153l;

import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;

/* JADX INFO: loaded from: classes5.dex */
public class t14 extends z44 {

    /* JADX INFO: renamed from: k */
    public f24 f171596k;

    /* JADX INFO: renamed from: l */
    public Dialog f171597l;

    public t14(dum dumVar, zed0 zed0Var) {
        super(dumVar, zed0Var);
    }

    @Override // p153l.z44
    /* JADX INFO: renamed from: X3 */
    public void mo188842X3() {
        super.mo188842X3();
        ((n44) this.viewModel).m161533n();
        this.f171597l = act().dialog().m21502E0(R$string.f48051e1).m21555t0(R$string.f48425v2, new Runnable() { // from class: l.s14
            @Override // java.lang.Runnable
            public final void run() {
                this.f165757a.m188845o4();
            }
        }).m21540k0(R$string.f47690N1).m21567z0();
    }

    @Override // p153l.z44
    /* JADX INFO: renamed from: j4 */
    public void mo188843j4() {
        super.mo188843j4();
        mo95315S3();
        if (this.f171596k == null) {
            this.f171596k = new f24(this, ((zed0) this.f202899j).f203992l);
        }
        this.f171596k.m123600d();
    }

    @Override // p153l.z44
    /* JADX INFO: renamed from: k4 */
    public void mo95318k4(BLiveCall bLiveCall, h64 h64Var) {
        super.mo95318k4(bLiveCall, h64Var);
        m188846p4(bLiveCall);
    }

    @Override // p153l.z44
    /* JADX INFO: renamed from: l4 */
    public void mo188844l4() {
        ((szl) m138856F3(new c210(4400))).mo101587f();
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        ynp0.m216937n(this.f171597l);
        f24 f24Var = this.f171596k;
        if (f24Var != null) {
            f24Var.m123598b();
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m188845o4() {
        m218547m4(this.f202898i);
    }

    /* JADX INFO: renamed from: p4 */
    public final void m188846p4(BLiveCall bLiveCall) {
        if (u54.m194531k(bLiveCall) && u54.m194528h(bLiveCall)) {
            ((n44) this.viewModel).m161529F(true);
        } else {
            ((n44) this.viewModel).m161529F(false);
        }
    }
}
