package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class dqu0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fqu0 f87510a;

    public dqu0(fqu0 fqu0Var) {
        this.f87510a = fqu0Var;
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        synchronized (this) {
            this.f87510a.f98846c = true;
            this.f87510a.m122767v("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (vny0.m199064b().elapsedRealtime() - this.f87510a.f98847d));
            this.f87510a.f98848e.m157775c(new Exception());
        }
    }

    @Override // p149l.fmw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            this.f87510a.f98846c = true;
            this.f87510a.m122767v("com.google.android.gms.ads.MobileAds", true, "", (int) (vny0.m199064b().elapsedRealtime() - this.f87510a.f98847d));
            this.f87510a.f98852i.execute(new Runnable() { // from class: l.cqu0
                @Override // java.lang.Runnable
                public final void run() {
                    fqu0.m122753j(this.f82117a.f87510a, str);
                }
            });
        }
    }
}
