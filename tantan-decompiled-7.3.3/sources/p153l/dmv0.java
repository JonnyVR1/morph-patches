package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class dmv0 implements lmv0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ emv0 f89738a;

    public dmv0(emv0 emv0Var) {
        this.f89738a = emv0Var;
    }

    @Override // p153l.lmv0
    public final void zza() {
        synchronized (this.f89738a) {
            this.f89738a.f94703j = null;
        }
    }

    @Override // p153l.lmv0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        hhu0 hhu0Var = (hhu0) obj;
        synchronized (this.f89738a) {
            this.f89738a.f94703j = hhu0Var;
            this.f89738a.f94703j.mo140700c();
        }
    }
}
