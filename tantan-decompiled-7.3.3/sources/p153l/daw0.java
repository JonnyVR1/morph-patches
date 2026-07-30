package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class daw0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gaw0 f85939a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ haw0 f85940b;

    public daw0(haw0 haw0Var, gaw0 gaw0Var) {
        this.f85939a = gaw0Var;
        this.f85940b = haw0Var;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        synchronized (this.f85940b) {
            this.f85940b.f108536e = null;
        }
    }

    @Override // p153l.lvw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.f85940b) {
            try {
                this.f85940b.f108536e = null;
                this.f85940b.f108535d.addFirst(this.f85939a);
                haw0 haw0Var = this.f85940b;
                if (haw0Var.f108537f == 1) {
                    haw0Var.m134328h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
