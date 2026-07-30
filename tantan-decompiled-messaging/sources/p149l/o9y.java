package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class o9y<D extends ho2> extends e8y<D, c9y> {
    public o9y(bsm<D> bsmVar) {
        super(bsmVar);
        mo51532C(new c9y(bsmVar.f77095a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m163218a4(String str) {
        ney.m159136c(this, str);
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
        return new hcy(ypv.f199497e.getString(R$string.f47611we), ((c9y) this.viewModel).m105916c(), 1);
    }

    @Override // p149l.e8y
    /* JADX INFO: renamed from: T3 */
    public int mo115317T3() {
        return 1;
    }

    @Override // p149l.e8y
    /* JADX INFO: renamed from: V3 */
    public void mo115318V3() {
        m163221d4();
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ C22306c m163219b4(roj0 roj0Var) {
        return m206027E2().m132150m1();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m163220c4(x9r x9rVar, LivingUsers livingUsers) {
        x9rVar.m207515I(livingUsers, m206027E2().f108741B.m140001A());
        ((c9y) this.viewModel).m105918e(x9rVar.getPageCount() == 0);
    }

    /* JADX INFO: renamed from: d4 */
    public void m163221d4() {
        BLiveAbsData bLiveAbsDataMo149813j = m206027E2().mo149813j();
        if (bLiveAbsDataMo149813j == null) {
            return;
        }
        m206027E2().m132154n2();
        m206027E2().m132078M1(m206027E2().m149814k(), bLiveAbsDataMo149813j.room.f44419id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void init() {
        final x9r x9rVar = new x9r(act(), new e30() { // from class: l.j9y
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116986a.m163218a4((String) obj);
            }
        });
        ((c9y) this.viewModel).m105917d(x9rVar);
        m207199N3(m206027E2().m132151m2().onErrorReturn(new w9j() { // from class: l.k9y
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).flatMap(new w9j() { // from class: l.l9y
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f127152a.m163219b4((roj0) obj);
            }
        }).map(new w9j() { // from class: l.m9y
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((far) obj).m120299c();
            }
        })).subscribe(ffw.m121197h(new e30() { // from class: l.n9y
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137844a.m163220c4(x9rVar, (LivingUsers) obj);
            }
        }));
    }
}
