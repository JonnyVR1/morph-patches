package p149l;

import com.google.android.gms.internal.ads.zzcfp;

/* JADX INFO: loaded from: classes6.dex */
public final class m4t0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f131327a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f131328b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzcfp f131329c;

    public m4t0(zzcfp zzcfpVar, String str, String str2) {
        this.f131327a = str;
        this.f131328b = str2;
        this.f131329c = zzcfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcfp zzcfpVar = this.f131329c;
        if (zzcfpVar.f10131p != null) {
            zzcfpVar.f10131p.mo13596b(this.f131327a, this.f131328b);
        }
    }
}
