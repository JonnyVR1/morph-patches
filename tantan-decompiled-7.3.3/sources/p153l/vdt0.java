package p153l;

import com.google.android.gms.internal.ads.zzcfp;

/* JADX INFO: loaded from: classes6.dex */
public final class vdt0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzcfp f183658a;

    public vdt0(zzcfp zzcfpVar) {
        this.f183658a = zzcfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcfp zzcfpVar = this.f183658a;
        if (zzcfpVar.f10168p != null) {
            zzcfpVar.f10168p.zzd();
            this.f183658a.f10168p.zzi();
        }
    }
}
