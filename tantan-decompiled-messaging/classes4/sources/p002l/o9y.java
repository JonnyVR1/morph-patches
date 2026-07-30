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
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class o9y<D extends ho2> extends e8y<D, c9y> {
    public o9y(bsm<D> bsmVar) {
        super(bsmVar);
        C(new c9y(bsmVar.f8332a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m19335a4(String str) {
        ney.m18700c(this, str);
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
        return new hcy(ypv.e.getString(R$string.f3653we), ((c9y) ((bwr) this).viewModel).m10913c(), 1);
    }

    @Override // p002l.e8y
    /* JADX INFO: renamed from: T3 */
    public int mo12295T3() {
        return 1;
    }

    @Override // p002l.e8y
    /* JADX INFO: renamed from: V3 */
    public void mo12296V3() {
        m19338d4();
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ c m19336b4(roj0 roj0Var) {
        return m25547E2().m14586m1();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m19337c4(x9r x9rVar, LivingUsers livingUsers) {
        x9rVar.m25804I(livingUsers, m25547E2().f12141B.m15692A());
        ((c9y) ((bwr) this).viewModel).m10915e(x9rVar.m25798C() == 0);
    }

    /* JADX INFO: renamed from: d4 */
    public void m19338d4() {
        BLiveAbsData bLiveAbsDataM17234j = m25547E2().m17234j();
        if (bLiveAbsDataM17234j == null) {
            return;
        }
        m25547E2().m14590n2();
        m25547E2().m14514M1(m25547E2().m17235k(), bLiveAbsDataM17234j.room.id);
    }

    public void init() {
        final x9r x9rVar = new x9r(act(), new e30() { // from class: l.j9y
            public final void call(Object obj) {
                this.f13649a.m19335a4((String) obj);
            }
        });
        ((c9y) ((bwr) this).viewModel).m10914d(x9rVar);
        m25707N3(m25547E2().m14587m2().onErrorReturn(new w9j() { // from class: l.k9y
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).flatMap(new w9j() { // from class: l.l9y
            public final Object call(Object obj) {
                return this.f14743a.m19336b4((roj0) obj);
            }
        }).map(new w9j() { // from class: l.m9y
            public final Object call(Object obj) {
                return ((far) obj).m13041c();
            }
        })).subscribe(ffw.h(new e30() { // from class: l.n9y
            public final void call(Object obj) {
                this.f15883a.m19337c4(x9rVar, (LivingUsers) obj);
            }
        }));
    }
}
