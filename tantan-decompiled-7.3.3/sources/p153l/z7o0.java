package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes10.dex */
public class z7o0<D extends oo2> extends h7o0<D, t7o0> {
    public z7o0(dum<D> dumVar) {
        super(dumVar);
        mo52715C(new t7o0(dumVar.f90815a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m218910b4(String str) {
        ydn0.m215258k(this, m213810E2().m168532l0().f56859id, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ C22421c m218911c4(uxj0 uxj0Var) {
        return m213810E2().m168467N0();
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        init();
    }

    @Override // p153l.h7o0
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public u8o0 mo133831S3() {
        return new u8o0(xau.m209910t(R$string.f48135hj), ((t7o0) this.viewModel).m189626c(), 1);
    }

    @Override // p153l.h7o0
    /* JADX INFO: renamed from: T3 */
    public int mo133832T3() {
        return 0;
    }

    @Override // p153l.h7o0
    /* JADX INFO: renamed from: V3 */
    public void mo133834V3() {
        m218914f4();
        if (m213810E2().mo118373p()) {
            v1n0.m199036n();
        } else {
            v1n0.m199039q();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ LivingUsers m218912d4(rsn0 rsn0Var) {
        return rsn0Var.m183019b(m213810E2().mo168489W0());
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m218913e4(psn0 psn0Var, LivingUsers livingUsers) {
        psn0Var.m173687G(livingUsers, m213810E2().f148254B.m209606A());
        ((t7o0) this.viewModel).m189628e(psn0Var.getPageCount() == 0);
    }

    /* JADX INFO: renamed from: f4 */
    public void m218914f4() {
        BLiveAbsData bLiveAbsDataMo183435j = m213810E2().mo183435j();
        if (bLiveAbsDataMo183435j == null) {
            return;
        }
        m213810E2().m168540n2();
        m213810E2().m168472Q1(m213810E2().m202191k(), bLiveAbsDataMo183435j.room.f45267id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void init() {
        final psn0 psn0Var = new psn0(act(), new y20() { // from class: l.u7o0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177928a.m218910b4((String) obj);
            }
        }, m213810E2().mo118373p());
        ((t7o0) this.viewModel).m189627d(psn0Var);
        m214779N3(m213810E2().m168537m2().onErrorReturn(new qcj() { // from class: l.v7o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).flatMap(new qcj() { // from class: l.w7o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f187773a.m218911c4((uxj0) obj);
            }
        }).map(new qcj() { // from class: l.x7o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f192737a.m218912d4((rsn0) obj);
            }
        })).subscribe(dhw.m115829h(new y20() { // from class: l.y7o0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197813a.m218913e4(psn0Var, (LivingUsers) obj);
            }
        }));
    }
}
