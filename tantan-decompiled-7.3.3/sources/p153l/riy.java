package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class riy<D extends oo2> extends bhy<D, fiy> {
    public riy(dum<D> dumVar) {
        super(dumVar);
        mo52715C(new fiy(dumVar.f90815a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m181617b4(String str) {
        kny.m150555c(this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ C22421c m181618c4(uxj0 uxj0Var) {
        return m213810E2().m168536m1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m181619e4(Throwable th) {
        ((fiy) this.viewModel).m125785u();
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        init();
    }

    @Override // p153l.bhy
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public ely mo104380S3() {
        return new ely(zrv.f205803e.getString(R$string.f47451C2), ((fiy) this.viewModel).m125778j(), 1);
    }

    @Override // p153l.bhy
    /* JADX INFO: renamed from: T3 */
    public int mo104381T3() {
        return 1;
    }

    @Override // p153l.bhy
    /* JADX INFO: renamed from: V3 */
    public void mo104382V3() {
        m181621f4();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m181620d4(hcr hcrVar) {
        ((fiy) this.viewModel).m125785u();
        ((fiy) this.viewModel).m125783q(m213810E2().f148254B.m209606A(), hcrVar);
    }

    /* JADX INFO: renamed from: f4 */
    public void m181621f4() {
        BLiveAbsData bLiveAbsDataMo183435j = m213810E2().mo183435j();
        if (bLiveAbsDataMo183435j == null) {
            return;
        }
        m213810E2().m168540n2();
        m213810E2().m168466M1(m213810E2().m202191k(), bLiveAbsDataMo183435j.room.f45267id);
    }

    public void init() {
        ((fiy) this.viewModel).m125779k(new zbr(act(), new y20() { // from class: l.miy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137039a.m181617b4((String) obj);
            }
        }));
        m214779N3(m213810E2().m168537m2().onErrorReturn(new qcj() { // from class: l.niy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).flatMap(new qcj() { // from class: l.oiy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f147594a.m181618c4((uxj0) obj);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.piy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152628a.m181620d4((hcr) obj);
            }
        }, new y20() { // from class: l.qiy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157897a.m181619e4((Throwable) obj);
            }
        }));
    }
}
