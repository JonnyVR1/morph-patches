package p153l;

import com.google.android.gms.internal.ads.zzcfp;

/* JADX INFO: loaded from: classes6.dex */
public final class wdt0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzcfp f188635a;

    public wdt0(zzcfp zzcfpVar) {
        this.f188635a = zzcfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcfp zzcfpVar = this.f188635a;
        if (zzcfpVar.f10168p != null) {
            if (!zzcfpVar.f10169q) {
                zzcfpVar.f10168p.zzg();
                this.f188635a.f10169q = true;
            }
            this.f188635a.f10168p.zze();
        }
    }
}
