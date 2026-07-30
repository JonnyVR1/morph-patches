package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class jzu0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ lzu0 f123322a;

    public jzu0(lzu0 lzu0Var) {
        this.f123322a = lzu0Var;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        synchronized (this) {
            this.f123322a.f134266c = true;
            this.f123322a.m156498v("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (bxy0.m106918b().elapsedRealtime() - this.f123322a.f134267d));
            this.f123322a.f134268e.m190495c(new Exception());
        }
    }

    @Override // p153l.lvw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            this.f123322a.f134266c = true;
            this.f123322a.m156498v("com.google.android.gms.ads.MobileAds", true, "", (int) (bxy0.m106918b().elapsedRealtime() - this.f123322a.f134267d));
            this.f123322a.f134272i.execute(new Runnable() { // from class: l.izu0
                @Override // java.lang.Runnable
                public final void run() {
                    lzu0.m156484j(this.f117759a.f123322a, str);
                }
            });
        }
    }
}
