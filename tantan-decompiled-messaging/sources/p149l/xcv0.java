package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class xcv0 implements fdv0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ycv0 f192280a;

    public xcv0(ycv0 ycv0Var) {
        this.f192280a = ycv0Var;
    }

    @Override // p149l.fdv0
    public final void zza() {
        synchronized (this.f192280a) {
            this.f192280a.f197501j = null;
        }
    }

    @Override // p149l.fdv0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        b8u0 b8u0Var = (b8u0) obj;
        synchronized (this.f192280a) {
            this.f192280a.f197501j = b8u0Var;
            this.f192280a.f197501j.mo106179c();
        }
    }
}
