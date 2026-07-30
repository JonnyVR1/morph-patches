package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class liy<D extends oo2> extends bhy<D, zhy> {
    public liy(dum<D> dumVar) {
        super(dumVar);
        mo52715C(new zhy(dumVar.f90815a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m154427a4(String str) {
        kny.m150555c(this, str);
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
        return new ely(zrv.f205803e.getString(R$string.f48459we), ((zhy) this.viewModel).m219705c(), 1);
    }

    @Override // p153l.bhy
    /* JADX INFO: renamed from: T3 */
    public int mo104381T3() {
        return 1;
    }

    @Override // p153l.bhy
    /* JADX INFO: renamed from: V3 */
    public void mo104382V3() {
        m154430d4();
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ C22421c m154428b4(uxj0 uxj0Var) {
        return m213810E2().m168536m1();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m154429c4(zbr zbrVar, LivingUsers livingUsers) {
        zbrVar.m219216I(livingUsers, m213810E2().f148254B.m209606A());
        ((zhy) this.viewModel).m219707e(zbrVar.getPageCount() == 0);
    }

    /* JADX INFO: renamed from: d4 */
    public void m154430d4() {
        BLiveAbsData bLiveAbsDataMo183435j = m213810E2().mo183435j();
        if (bLiveAbsDataMo183435j == null) {
            return;
        }
        m213810E2().m168540n2();
        m213810E2().m168466M1(m213810E2().m202191k(), bLiveAbsDataMo183435j.room.f45267id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void init() {
        final zbr zbrVar = new zbr(act(), new y20() { // from class: l.giy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104538a.m154427a4((String) obj);
            }
        });
        ((zhy) this.viewModel).m219706d(zbrVar);
        m214779N3(m213810E2().m168537m2().onErrorReturn(new qcj() { // from class: l.hiy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).flatMap(new qcj() { // from class: l.iiy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f115158a.m154428b4((uxj0) obj);
            }
        }).map(new qcj() { // from class: l.jiy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((hcr) obj).m134493c();
            }
        })).subscribe(dhw.m115829h(new y20() { // from class: l.kiy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127053a.m154429c4(zbrVar, (LivingUsers) obj);
            }
        }));
    }
}
