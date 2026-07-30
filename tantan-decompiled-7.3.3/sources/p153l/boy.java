package p153l;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class boy<D extends oo2> extends bhy<D, vny> {

    /* JADX INFO: renamed from: j */
    public Pair<hcr, cm0> f77706j;

    public boy(dum<D> dumVar) {
        super(dumVar);
        mo52715C(new vny(dumVar.f90815a, this));
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
        return new ely(zrv.f205803e.getString(R$string.f47666Lj), ((vny) this.viewModel).m202018i(), 2);
    }

    @Override // p153l.bhy
    /* JADX INFO: renamed from: T3 */
    public int mo104381T3() {
        return 2;
    }

    @Override // p153l.bhy
    /* JADX INFO: renamed from: V3 */
    public void mo104382V3() {
        m105746g4();
    }

    /* JADX INFO: renamed from: b4, reason: merged with bridge method [inline-methods] */
    public Pair<hcr, cm0> m105743d4(hcr hcrVar) {
        return Pair.create(hcrVar, m213810E2().f148254B.m209606A());
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ C22421c m105742c4(BLiveAbsData bLiveAbsData, uxj0 uxj0Var) {
        return LivingNormalApiProvider.m72793w7(m213810E2().m202191k(), bLiveAbsData.room.f45267id, ((vny) this.viewModel).m202019j());
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m105744e4(Pair pair) {
        this.f77706j = pair;
        ((vny) this.viewModel).m202024p();
        ((vny) this.viewModel).m202023n(pair);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m105745f4(Throwable th) {
        ((vny) this.viewModel).m202024p();
    }

    /* JADX INFO: renamed from: g4 */
    public void m105746g4() {
        ((vny) this.viewModel).m202022m();
        if (NullChecker.m82486a(this.f77706j)) {
            ((vny) this.viewModel).m202023n(this.f77706j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public void m105747h4() {
        ((vny) this.viewModel).m202022m();
        final BLiveAbsData bLiveAbsDataMo183435j = m213810E2().mo183435j();
        if (bLiveAbsDataMo183435j == null) {
            return;
        }
        m214779N3(m213810E2().m168537m2().onErrorReturn(new qcj() { // from class: l.wny
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).flatMap(new qcj() { // from class: l.xny
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f195542a.m105742c4(bLiveAbsDataMo183435j, (uxj0) obj);
            }
        }).map(new qcj() { // from class: l.yny
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f200931a.m105743d4((hcr) obj);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.zny
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205262a.m105744e4((Pair) obj);
            }
        }, new y20() { // from class: l.aoy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72657a.m105745f4((Throwable) obj);
            }
        }));
    }

    public void init() {
        ((vny) this.viewModel).init();
        m105747h4();
    }
}
