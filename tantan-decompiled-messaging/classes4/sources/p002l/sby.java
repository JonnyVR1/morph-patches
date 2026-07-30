package p002l;

import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.live.base.bean.LivingUsers;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import l.bwr;
import l.e30;
import l.ffw;
import l.roj0;
import l.w9j;
import l.ypv;
import p002l.ho2;
import p002l.oby;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class sby<D extends ho2, VM extends oby> extends e8y<D, VM> {
    public sby(bsm<D> bsmVar, VM vm) {
        super(bsmVar);
        C(vm);
    }

    /* JADX INFO: renamed from: c4 */
    private void m22355c4() {
        BLiveAbsData bLiveAbsDataM17234j = m25547E2().m17234j();
        if (bLiveAbsDataM17234j == null) {
            return;
        }
        m25547E2().m14590n2();
        m25547E2().mo14516N1(bLiveAbsDataM17234j.room.id);
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo10254P3() {
        super.mo10254P3();
        init();
    }

    @Override // p002l.e8y
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public hcy mo12294S3() {
        return new hcy(ypv.e.getString(R$string.f3276fa), ((oby) ((bwr) this).viewModel).m19393c(), 0);
    }

    @Override // p002l.e8y
    /* JADX INFO: renamed from: T3 */
    public int mo12295T3() {
        return 0;
    }

    @Override // p002l.e8y
    /* JADX INFO: renamed from: V3 */
    public void mo12296V3() {
        m22355c4();
    }

    /* JADX INFO: renamed from: Z3 */
    public int m22356Z3() {
        return m25547E2().f12164u;
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ c m22357a4(roj0 roj0Var) {
        return m25547E2().m14600s1();
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m22358b4(LivingUsers livingUsers) {
        ((oby) ((bwr) this).viewModel).m19396f(livingUsers, m25547E2().f12141B.m15692A());
    }

    public void init() {
        ((oby) ((bwr) this).viewModel).m19394d(false);
        m25707N3(m25547E2().m14587m2().onErrorReturn(new w9j() { // from class: l.pby
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).flatMap(new w9j() { // from class: l.qby
            public final Object call(Object obj) {
                return this.f17896a.m22357a4((roj0) obj);
            }
        })).subscribe(ffw.h(new e30() { // from class: l.rby
            public final void call(Object obj) {
                this.f18456a.m22358b4((LivingUsers) obj);
            }
        }));
    }
}
