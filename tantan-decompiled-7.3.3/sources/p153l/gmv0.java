package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class gmv0 implements lmv0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hmv0 f105037a;

    public gmv0(hmv0 hmv0Var) {
        this.f105037a = hmv0Var;
    }

    @Override // p153l.lmv0
    public final void zza() {
        synchronized (this.f105037a) {
        }
    }

    @Override // p153l.lmv0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.f105037a) {
            this.f105037a.f110677c = ((kzt0) obj).m152228d();
            ((kzt0) obj).mo140700c();
        }
    }
}
