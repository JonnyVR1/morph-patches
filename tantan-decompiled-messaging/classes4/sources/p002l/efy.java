package p002l;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.tantanapp.common.utils.NullChecker;
import l.bwr;
import l.e30;
import l.ffw;
import l.roj0;
import l.w9j;
import l.ypv;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class efy<D extends ho2> extends e8y<D, yey> {

    /* JADX INFO: renamed from: j */
    public Pair<far, gm0> f9737j;

    public efy(bsm<D> bsmVar) {
        super(bsmVar);
        C(new yey(bsmVar.f8332a, this));
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
        return new hcy(ypv.e.getString(R$string.f2860Lj), ((yey) ((bwr) this).viewModel).m26667i(), 2);
    }

    @Override // p002l.e8y
    /* JADX INFO: renamed from: T3 */
    public int mo12295T3() {
        return 2;
    }

    @Override // p002l.e8y
    /* JADX INFO: renamed from: V3 */
    public void mo12296V3() {
        m12467g4();
    }

    /* JADX INFO: renamed from: b4, reason: merged with bridge method [inline-methods] */
    public Pair<far, gm0> m12464d4(far farVar) {
        return Pair.create(farVar, m25547E2().f12141B.m15692A());
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ c m12463c4(BLiveAbsData bLiveAbsData, roj0 roj0Var) {
        return LivingNormalApiProvider.m4976w7(m25547E2().m17235k(), bLiveAbsData.room.id, ((yey) ((bwr) this).viewModel).m26669j());
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m12465e4(Pair pair) {
        this.f9737j = pair;
        ((yey) ((bwr) this).viewModel).m26674p();
        ((yey) ((bwr) this).viewModel).m26673n(pair);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m12466f4(Throwable th) {
        ((yey) ((bwr) this).viewModel).m26674p();
    }

    /* JADX INFO: renamed from: g4 */
    public void m12467g4() {
        ((yey) ((bwr) this).viewModel).m26672m();
        if (NullChecker.a(this.f9737j)) {
            ((yey) ((bwr) this).viewModel).m26673n(this.f9737j);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public void m12468h4() {
        ((yey) ((bwr) this).viewModel).m26672m();
        final BLiveAbsData bLiveAbsDataM17234j = m25547E2().m17234j();
        if (bLiveAbsDataM17234j == null) {
            return;
        }
        m25707N3(m25547E2().m14587m2().onErrorReturn(new w9j() { // from class: l.zey
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).flatMap(new w9j() { // from class: l.afy
            public final Object call(Object obj) {
                return this.f7540a.m12463c4(bLiveAbsDataM17234j, (roj0) obj);
            }
        }).map(new w9j() { // from class: l.bfy
            public final Object call(Object obj) {
                return this.f8109a.m12464d4((far) obj);
            }
        })).subscribe(ffw.e(new e30() { // from class: l.cfy
            public final void call(Object obj) {
                this.f8655a.m12465e4((Pair) obj);
            }
        }, new e30() { // from class: l.dfy
            public final void call(Object obj) {
                this.f9204a.m12466f4((Throwable) obj);
            }
        }));
    }

    public void init() {
        ((yey) ((bwr) this).viewModel).init();
        m12468h4();
    }
}
