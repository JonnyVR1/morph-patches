package p149l;

import com.google.android.gms.internal.ads.zzcfp;

/* JADX INFO: loaded from: classes6.dex */
public final class q4t0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzcfp f152671a;

    public q4t0(zzcfp zzcfpVar) {
        this.f152671a = zzcfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcfp zzcfpVar = this.f152671a;
        if (zzcfpVar.f10131p != null) {
            if (!zzcfpVar.f10132q) {
                zzcfpVar.f10131p.zzg();
                this.f152671a.f10132q = true;
            }
            this.f152671a.f10131p.zze();
        }
    }
}
