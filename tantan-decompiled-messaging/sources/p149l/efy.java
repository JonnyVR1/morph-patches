package p149l;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class efy<D extends ho2> extends e8y<D, yey> {

    /* JADX INFO: renamed from: j */
    public Pair<far, gm0> f90876j;

    public efy(bsm<D> bsmVar) {
        super(bsmVar);
        mo51532C(new yey(bsmVar.f77095a, this));
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
        return new hcy(ypv.f199497e.getString(R$string.f46818Lj), ((yey) this.viewModel).m214453i(), 2);
    }

    @Override // p149l.e8y
    /* JADX INFO: renamed from: T3 */
    public int mo115317T3() {
        return 2;
    }

    @Override // p149l.e8y
    /* JADX INFO: renamed from: V3 */
    public void mo115318V3() {
        m116112g4();
    }

    /* JADX INFO: renamed from: b4, reason: merged with bridge method [inline-methods] */
    public Pair<far, gm0> m116109d4(far farVar) {
        return Pair.create(farVar, m206027E2().f108741B.m140001A());
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ C22306c m116108c4(BLiveAbsData bLiveAbsData, roj0 roj0Var) {
        return LivingNormalApiProvider.m71610w7(m206027E2().m149814k(), bLiveAbsData.room.f44419id, ((yey) this.viewModel).m214454j());
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m116110e4(Pair pair) {
        this.f90876j = pair;
        ((yey) this.viewModel).m214459p();
        ((yey) this.viewModel).m214458n(pair);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m116111f4(Throwable th) {
        ((yey) this.viewModel).m214459p();
    }

    /* JADX INFO: renamed from: g4 */
    public void m116112g4() {
        ((yey) this.viewModel).m214457m();
        if (NullChecker.m81303a(this.f90876j)) {
            ((yey) this.viewModel).m214458n(this.f90876j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public void m116113h4() {
        ((yey) this.viewModel).m214457m();
        final BLiveAbsData bLiveAbsDataMo149813j = m206027E2().mo149813j();
        if (bLiveAbsDataMo149813j == null) {
            return;
        }
        m207199N3(m206027E2().m132151m2().onErrorReturn(new w9j() { // from class: l.zey
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).flatMap(new w9j() { // from class: l.afy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f69232a.m116108c4(bLiveAbsDataMo149813j, (roj0) obj);
            }
        }).map(new w9j() { // from class: l.bfy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f75387a.m116109d4((far) obj);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.cfy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80683a.m116110e4((Pair) obj);
            }
        }, new e30() { // from class: l.dfy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85984a.m116111f4((Throwable) obj);
            }
        }));
    }

    public void init() {
        ((yey) this.viewModel).init();
        m116113h4();
    }
}
