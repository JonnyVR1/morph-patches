package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class l8o0 extends h7o0<rwn0, p8o0> {
    public l8o0(dum dumVar) {
        super(dumVar);
        mo52715C(new p8o0(dumVar.f90815a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ C22421c m153293b4(uxj0 uxj0Var) {
        return ((rwn0) m213810E2()).m183417S3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m153294c4(p7o0 p7o0Var) {
        ((p8o0) this.viewModel).m171269l(p7o0Var.f150952a, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m153295d4(p7o0 p7o0Var) {
        ((p8o0) this.viewModel).m171266e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    private void m153296e4() {
        BLiveVoice bLiveVoiceMo183435j = ((rwn0) m213810E2()).mo183435j();
        if (bLiveVoiceMo183435j == null) {
            return;
        }
        ((rwn0) m213810E2()).m168540n2();
        ((rwn0) m213810E2()).mo118371N1(bLiveVoiceMo183435j.room.f45267id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        ((p8o0) this.viewModel).init();
        m214779N3(((rwn0) m213810E2()).m168537m2().onErrorReturn(new qcj() { // from class: l.g8o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).flatMap(new qcj() { // from class: l.h8o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f108258a.m153293b4((uxj0) obj);
            }
        })).filter(new qcj() { // from class: l.i8o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                p7o0 p7o0Var = (p7o0) obj;
                return Boolean.valueOf((p7o0Var == null || jyb.m147479J(p7o0Var.f150952a)) ? false : true);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.j8o0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118796a.m153294c4((p7o0) obj);
            }
        }));
        m214779N3(((rwn0) m213810E2()).m183417S3()).subscribe(dhw.m115829h(new y20() { // from class: l.k8o0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124404a.m153295d4((p7o0) obj);
            }
        }));
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
        return new u8o0(zrv.f205803e.getString(R$string.f48082fa), ((p8o0) this.viewModel).m171267f(), 2);
    }

    @Override // p153l.h7o0
    /* JADX INFO: renamed from: T3 */
    public int mo133832T3() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.h7o0
    /* JADX INFO: renamed from: U3 */
    public void mo133833U3() {
        super.mo133833U3();
        BLiveVoice bLiveVoiceMo183435j = ((rwn0) m213810E2()).mo183435j();
        if (bLiveVoiceMo183435j == null) {
            return;
        }
        ((rwn0) m213810E2()).m183395D3(bLiveVoiceMo183435j.room.f45267id);
    }

    @Override // p153l.h7o0
    /* JADX INFO: renamed from: V3 */
    public void mo133834V3() {
        m153296e4();
    }
}
