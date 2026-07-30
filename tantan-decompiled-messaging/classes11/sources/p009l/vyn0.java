package p009l;

import androidx.annotation.NonNull;
import com.p1.mobile.putong.live.base.bean.LivingUsers;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.livingroom.R;
import com.tantanapp.common.data.DbObject;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.ho2;
import l.njn0;
import l.roj0;
import l.rsm0;
import l.u4n0;
import l.w8u;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class vyn0<D extends ho2> extends dyn0<D, pyn0> {
    public vyn0(bsm<D> bsmVar) {
        super(bsmVar);
        C(new pyn0(bsmVar.a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m23759b4(String str) {
        u4n0.k(this, ((DbObject) E2().l0()).id, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ c m23760c4(roj0 roj0Var) {
        return E2().N0();
    }

    /* JADX INFO: renamed from: P3 */
    public void m23761P3() {
        super.P3();
        init();
    }

    @Override // p009l.dyn0
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public qzn0 mo13523S3() {
        return new qzn0(w8u.t(R.string.hj), ((pyn0) ((bwr) this).viewModel).m20787c(), 1);
    }

    @Override // p009l.dyn0
    /* JADX INFO: renamed from: T3 */
    public int mo13524T3() {
        return 0;
    }

    @Override // p009l.dyn0
    /* JADX INFO: renamed from: V3 */
    public void mo13526V3() {
        m23764f4();
        if (E2().p()) {
            rsm0.n();
        } else {
            rsm0.q();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ LivingUsers m23762d4(njn0 njn0Var) {
        return njn0Var.b(E2().W0());
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m23763e4(ljn0 ljn0Var, LivingUsers livingUsers) {
        ljn0Var.m17901G(livingUsers, E2().B.A());
        ((pyn0) ((bwr) this).viewModel).m20789e(ljn0Var.m17897C() == 0);
    }

    /* JADX INFO: renamed from: f4 */
    public void m23764f4() {
        BLiveAbsData bLiveAbsDataJ = E2().j();
        if (bLiveAbsDataJ == null) {
            return;
        }
        E2().n2();
        E2().Q1(E2().k(), bLiveAbsDataJ.room.id);
    }

    public void init() {
        final ljn0 ljn0Var = new ljn0(act(), new e30() { // from class: l.qyn0
            public final void call(Object obj) {
                this.f19583a.m23759b4((String) obj);
            }
        }, E2().p());
        ((pyn0) ((bwr) this).viewModel).m20788d(ljn0Var);
        N3(E2().m2().onErrorReturn(new w9j() { // from class: l.ryn0
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).flatMap(new w9j() { // from class: l.syn0
            public final Object call(Object obj) {
                return this.f20498a.m23760c4((roj0) obj);
            }
        }).map(new w9j() { // from class: l.tyn0
            public final Object call(Object obj) {
                return this.f20915a.m23762d4((njn0) obj);
            }
        })).subscribe(ffw.h(new e30() { // from class: l.uyn0
            public final void call(Object obj) {
                this.f21372a.m23763e4(ljn0Var, (LivingUsers) obj);
            }
        }));
    }
}
