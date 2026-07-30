package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class vkv0 implements lmv0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wkv0 f184521a;

    public vkv0(wkv0 wkv0Var) {
        this.f184521a = wkv0Var;
    }

    @Override // p153l.lmv0
    public final void zza() {
        synchronized (this.f184521a) {
            this.f184521a.f189603i = null;
        }
    }

    @Override // p153l.lmv0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        uwt0 uwt0Var = (uwt0) obj;
        synchronized (this.f184521a) {
            try {
                wkv0 wkv0Var = this.f184521a;
                if (wkv0Var.f189603i != null) {
                    wkv0Var.f189603i.mo127848b();
                }
                this.f184521a.f189603i = uwt0Var;
                this.f184521a.f189603i.mo140700c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
