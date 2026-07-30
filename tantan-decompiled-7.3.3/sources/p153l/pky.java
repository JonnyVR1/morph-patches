package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p137rx.C22421c;
import p153l.lky;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class pky<D extends oo2, VM extends lky> extends bhy<D, VM> {
    public pky(dum<D> dumVar, VM vm) {
        super(dumVar);
        mo52715C(vm);
    }

    /* JADX INFO: renamed from: c4 */
    private void m172780c4() {
        BLiveAbsData bLiveAbsDataMo183435j = m213810E2().mo183435j();
        if (bLiveAbsDataMo183435j == null) {
            return;
        }
        m213810E2().m168540n2();
        m213810E2().mo118371N1(bLiveAbsDataMo183435j.room.f45267id);
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
        return new ely(zrv.f205803e.getString(R$string.f48082fa), ((lky) this.viewModel).m154661c(), 0);
    }

    @Override // p153l.bhy
    /* JADX INFO: renamed from: T3 */
    public int mo104381T3() {
        return 0;
    }

    @Override // p153l.bhy
    /* JADX INFO: renamed from: V3 */
    public void mo104382V3() {
        m172780c4();
    }

    /* JADX INFO: renamed from: Z3 */
    public int m172781Z3() {
        return m213810E2().f148277u;
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ C22421c m172782a4(uxj0 uxj0Var) {
        return m213810E2().m168548s1();
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m172783b4(LivingUsers livingUsers) {
        ((lky) this.viewModel).m154664f(livingUsers, m213810E2().f148254B.m209606A());
    }

    public void init() {
        ((lky) this.viewModel).m154662d(false);
        m214779N3(m213810E2().m168537m2().onErrorReturn(new qcj() { // from class: l.mky
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).flatMap(new qcj() { // from class: l.nky
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f142490a.m172782a4((uxj0) obj);
            }
        })).subscribe(dhw.m115829h(new y20() { // from class: l.oky
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147799a.m172783b4((LivingUsers) obj);
            }
        }));
    }
}
