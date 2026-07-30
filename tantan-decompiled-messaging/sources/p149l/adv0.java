package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class adv0 implements fdv0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bdv0 f68970a;

    public adv0(bdv0 bdv0Var) {
        this.f68970a = bdv0Var;
    }

    @Override // p149l.fdv0
    public final void zza() {
        synchronized (this.f68970a) {
        }
    }

    @Override // p149l.fdv0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.f68970a) {
            this.f68970a.f75079c = ((eqt0) obj).m117798d();
            ((eqt0) obj).mo106179c();
        }
    }
}
