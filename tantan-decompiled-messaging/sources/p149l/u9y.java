package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class u9y<D extends ho2> extends e8y<D, i9y> {
    public u9y(bsm<D> bsmVar) {
        super(bsmVar);
        mo51532C(new i9y(bsmVar.f77095a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m192720b4(String str) {
        ney.m159136c(this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ C22306c m192721c4(roj0 roj0Var) {
        return m206027E2().m132150m1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m192722e4(Throwable th) {
        ((i9y) this.viewModel).m135107u();
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        init();
    }

    @Override // p149l.e8y
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public hcy mo115316S3() {
        return new hcy(ypv.f199497e.getString(R$string.f46603C2), ((i9y) this.viewModel).m135100j(), 1);
    }

    @Override // p149l.e8y
    /* JADX INFO: renamed from: T3 */
    public int mo115317T3() {
        return 1;
    }

    @Override // p149l.e8y
    /* JADX INFO: renamed from: V3 */
    public void mo115318V3() {
        m192724f4();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m192723d4(far farVar) {
        ((i9y) this.viewModel).m135107u();
        ((i9y) this.viewModel).m135105q(m206027E2().f108741B.m140001A(), farVar);
    }

    /* JADX INFO: renamed from: f4 */
    public void m192724f4() {
        BLiveAbsData bLiveAbsDataMo149813j = m206027E2().mo149813j();
        if (bLiveAbsDataMo149813j == null) {
            return;
        }
        m206027E2().m132154n2();
        m206027E2().m132078M1(m206027E2().m149814k(), bLiveAbsDataMo149813j.room.f44419id);
    }

    public void init() {
        ((i9y) this.viewModel).m135101k(new x9r(act(), new e30() { // from class: l.p9y
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147829a.m192720b4((String) obj);
            }
        }));
        m207199N3(m206027E2().m132151m2().onErrorReturn(new w9j() { // from class: l.q9y
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).flatMap(new w9j() { // from class: l.r9y
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f158459a.m192721c4((roj0) obj);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.s9y
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163246a.m192723d4((far) obj);
            }
        }, new e30() { // from class: l.t9y
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169080a.m192722e4((Throwable) obj);
            }
        }));
    }
}
