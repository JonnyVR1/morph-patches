package p149l;

import com.google.android.gms.internal.ads.zzcfp;

/* JADX INFO: loaded from: classes6.dex */
public final class o4t0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f141812a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f141813b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzcfp f141814c;

    public o4t0(zzcfp zzcfpVar, int i, int i2) {
        this.f141812a = i;
        this.f141813b = i2;
        this.f141814c = zzcfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcfp zzcfpVar = this.f141814c;
        if (zzcfpVar.f10131p != null) {
            zzcfpVar.f10131p.mo13595a(this.f141812a, this.f141813b);
        }
    }
}
