package p153l;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: l.jc */
/* JADX INFO: loaded from: classes5.dex */
public class C17920jc extends C16943fc<C17696ic> {

    /* JADX INFO: renamed from: k */
    public boolean f120003k;

    public C17920jc(dum<? extends rwn0> dumVar) {
        super(dumVar);
        this.f120003k = false;
        mo52715C(new C17696ic(dumVar.f90815a));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        init();
    }

    @Override // p153l.C16943fc
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public ely mo124967S3() {
        return new ely("陪伴榜", ((C17696ic) this.viewModel).m139416b(), 0);
    }

    @Override // p153l.C16943fc
    /* JADX INFO: renamed from: T3 */
    public int mo124968T3() {
        return 0;
    }

    @Override // p153l.C16943fc
    /* JADX INFO: renamed from: U3 */
    public void mo124969U3(String str) {
        boolean z = this.f120003k;
        V v2 = this.viewModel;
        if (z) {
            ((C17696ic) v2).m139418d();
        } else {
            ((C17696ic) v2).m139417c(efv.m120723a(str));
            this.f120003k = true;
        }
    }

    public void init() {
        ((C17696ic) this.viewModel).init();
    }
}
