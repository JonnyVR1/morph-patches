package p149l;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: l.oc */
/* JADX INFO: loaded from: classes5.dex */
public class C18890oc extends C17980kc<C18668nc> {

    /* JADX INFO: renamed from: k */
    public boolean f142994k;

    public C18890oc(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        this.f142994k = false;
        mo51532C(new C18668nc(bsmVar.f77095a));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        init();
    }

    @Override // p149l.C17980kc
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public hcy mo145332S3() {
        return new hcy("陪伴榜", ((C18668nc) this.viewModel).m158844b(), 0);
    }

    @Override // p149l.C17980kc
    /* JADX INFO: renamed from: T3 */
    public int mo145333T3() {
        return 0;
    }

    @Override // p149l.C17980kc
    /* JADX INFO: renamed from: U3 */
    public void mo145334U3(String str) {
        boolean z = this.f142994k;
        V v2 = this.viewModel;
        if (z) {
            ((C18668nc) v2).m158846d();
        } else {
            ((C18668nc) v2).m158845c(ddv.m111068a(str));
            this.f142994k = true;
        }
    }

    public void init() {
        ((C18668nc) this.viewModel).init();
    }
}
