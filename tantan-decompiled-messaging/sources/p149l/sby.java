package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p133rx.C22306c;
import p149l.ho2;
import p149l.oby;

/* JADX INFO: loaded from: classes4.dex */
public class sby<D extends ho2, VM extends oby> extends e8y<D, VM> {
    public sby(bsm<D> bsmVar, VM vm) {
        super(bsmVar);
        mo51532C(vm);
    }

    /* JADX INFO: renamed from: c4 */
    private void m183367c4() {
        BLiveAbsData bLiveAbsDataMo149813j = m206027E2().mo149813j();
        if (bLiveAbsDataMo149813j == null) {
            return;
        }
        m206027E2().m132154n2();
        m206027E2().mo132080N1(bLiveAbsDataMo149813j.room.f44419id);
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
        return new hcy(ypv.f199497e.getString(R$string.f47234fa), ((oby) this.viewModel).m163467c(), 0);
    }

    @Override // p149l.e8y
    /* JADX INFO: renamed from: T3 */
    public int mo115317T3() {
        return 0;
    }

    @Override // p149l.e8y
    /* JADX INFO: renamed from: V3 */
    public void mo115318V3() {
        m183367c4();
    }

    /* JADX INFO: renamed from: Z3 */
    public int m183368Z3() {
        return m206027E2().f108764u;
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ C22306c m183369a4(roj0 roj0Var) {
        return m206027E2().m132164s1();
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m183370b4(LivingUsers livingUsers) {
        ((oby) this.viewModel).m163470f(livingUsers, m206027E2().f108741B.m140001A());
    }

    public void init() {
        ((oby) this.viewModel).m163468d(false);
        m207199N3(m206027E2().m132151m2().onErrorReturn(new w9j() { // from class: l.pby
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).flatMap(new w9j() { // from class: l.qby
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f153716a.m183369a4((roj0) obj);
            }
        })).subscribe(ffw.m121197h(new e30() { // from class: l.rby
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158696a.m183370b4((LivingUsers) obj);
            }
        }));
    }
}
