package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes11.dex */
public class vyn0<D extends ho2> extends dyn0<D, pyn0> {
    public vyn0(bsm<D> bsmVar) {
        super(bsmVar);
        mo51532C(new pyn0(bsmVar.f77095a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m200669b4(String str) {
        u4n0.m191752k(this, m206027E2().m132146l0().f56011id, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ C22306c m200670c4(roj0 roj0Var) {
        return m206027E2().m132079N0();
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        init();
    }

    @Override // p149l.dyn0
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public qzn0 mo114083S3() {
        return new qzn0(w8u.m202217t(R$string.f47287hj), ((pyn0) this.viewModel).m172145c(), 1);
    }

    @Override // p149l.dyn0
    /* JADX INFO: renamed from: T3 */
    public int mo114084T3() {
        return 0;
    }

    @Override // p149l.dyn0
    /* JADX INFO: renamed from: V3 */
    public void mo114086V3() {
        m200673f4();
        if (m206027E2().mo97490p()) {
            rsm0.m180706n();
        } else {
            rsm0.m180709q();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ LivingUsers m200671d4(njn0 njn0Var) {
        return njn0Var.m159763b(m206027E2().mo132103W0());
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m200672e4(ljn0 ljn0Var, LivingUsers livingUsers) {
        ljn0Var.m150013G(livingUsers, m206027E2().f108741B.m140001A());
        ((pyn0) this.viewModel).m172147e(ljn0Var.getPageCount() == 0);
    }

    /* JADX INFO: renamed from: f4 */
    public void m200673f4() {
        BLiveAbsData bLiveAbsDataMo149813j = m206027E2().mo149813j();
        if (bLiveAbsDataMo149813j == null) {
            return;
        }
        m206027E2().m132154n2();
        m206027E2().m132086Q1(m206027E2().m149814k(), bLiveAbsDataMo149813j.room.f44419id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void init() {
        final ljn0 ljn0Var = new ljn0(act(), new e30() { // from class: l.qyn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156940a.m200669b4((String) obj);
            }
        }, m206027E2().mo97490p());
        ((pyn0) this.viewModel).m172146d(ljn0Var);
        m207199N3(m206027E2().m132151m2().onErrorReturn(new w9j() { // from class: l.ryn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).flatMap(new w9j() { // from class: l.syn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f166970a.m200670c4((roj0) obj);
            }
        }).map(new w9j() { // from class: l.tyn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f172612a.m200671d4((njn0) obj);
            }
        })).subscribe(ffw.m121197h(new e30() { // from class: l.uyn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178893a.m200672e4(ljn0Var, (LivingUsers) obj);
            }
        }));
    }
}
