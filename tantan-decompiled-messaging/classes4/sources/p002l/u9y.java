package p002l;

import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.R$string;
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
public class u9y<D extends ho2> extends e8y<D, i9y> {
    public u9y(bsm<D> bsmVar) {
        super(bsmVar);
        C(new i9y(bsmVar.f8332a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m23403b4(String str) {
        ney.m18700c(this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ c m23404c4(roj0 roj0Var) {
        return m25547E2().m14586m1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m23405e4(Throwable th) {
        ((i9y) ((bwr) this).viewModel).m15074u();
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
        return new hcy(ypv.e.getString(R$string.f2645C2), ((i9y) ((bwr) this).viewModel).m15067j(), 1);
    }

    @Override // p002l.e8y
    /* JADX INFO: renamed from: T3 */
    public int mo12295T3() {
        return 1;
    }

    @Override // p002l.e8y
    /* JADX INFO: renamed from: V3 */
    public void mo12296V3() {
        m23407f4();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m23406d4(far farVar) {
        ((i9y) ((bwr) this).viewModel).m15074u();
        ((i9y) ((bwr) this).viewModel).m15072q(m25547E2().f12141B.m15692A(), farVar);
    }

    /* JADX INFO: renamed from: f4 */
    public void m23407f4() {
        BLiveAbsData bLiveAbsDataM17234j = m25547E2().m17234j();
        if (bLiveAbsDataM17234j == null) {
            return;
        }
        m25547E2().m14590n2();
        m25547E2().m14514M1(m25547E2().m17235k(), bLiveAbsDataM17234j.room.id);
    }

    public void init() {
        ((i9y) ((bwr) this).viewModel).m15068k(new x9r(act(), new e30() { // from class: l.p9y
            public final void call(Object obj) {
                this.f17166a.m23403b4((String) obj);
            }
        }));
        m25707N3(m25547E2().m14587m2().onErrorReturn(new w9j() { // from class: l.q9y
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).flatMap(new w9j() { // from class: l.r9y
            public final Object call(Object obj) {
                return this.f18436a.m23404c4((roj0) obj);
            }
        })).subscribe(ffw.e(new e30() { // from class: l.s9y
            public final void call(Object obj) {
                this.f18852a.m23406d4((far) obj);
            }
        }, new e30() { // from class: l.t9y
            public final void call(Object obj) {
                this.f20141a.m23405e4((Throwable) obj);
            }
        }));
    }
}
