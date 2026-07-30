package p002l;

import android.view.View;
import com.tantanapp.common.data.DbObject;
import l.bwr;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class q1k0<D extends ho2> extends n1k0<D> {

    /* JADX INFO: renamed from: r */
    public final View f17757r;

    public q1k0(bsm<D> bsmVar, View view) {
        super(bsmVar);
        this.f17757r = view;
    }

    @Override // p002l.n1k0, p002l.x6s
    /* JADX INFO: renamed from: R3 */
    public void mo9823R3() {
        super.mo9823R3();
        z2(new mzj0(this.f22036e, ((xyj0) ((bwr) this).viewModel).f22514G));
    }

    @Override // p002l.n1k0
    /* JADX INFO: renamed from: t */
    public void mo18423t() {
        View view;
        super.mo18423t();
        if (m25547E2().m14582l0() == null || (view = this.f17757r) == null) {
            return;
        }
        ((xyj0) ((bwr) this).viewModel).m26224R0(view, ((DbObject) m25547E2().m14582l0()).id);
    }
}
