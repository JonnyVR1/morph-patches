package p149l;

import com.google.android.gms.internal.ads.zzcfp;

/* JADX INFO: loaded from: classes6.dex */
public final class p4t0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzcfp f147213a;

    public p4t0(zzcfp zzcfpVar) {
        this.f147213a = zzcfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcfp zzcfpVar = this.f147213a;
        if (zzcfpVar.f10131p != null) {
            zzcfpVar.f10131p.zzd();
            this.f147213a.f10131p.zzi();
        }
    }
}
