package p153l;

import com.google.android.gms.internal.ads.zzcfp;

/* JADX INFO: loaded from: classes6.dex */
public final class udt0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f178591a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f178592b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzcfp f178593c;

    public udt0(zzcfp zzcfpVar, int i, int i2) {
        this.f178591a = i;
        this.f178592b = i2;
        this.f178593c = zzcfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcfp zzcfpVar = this.f178593c;
        if (zzcfpVar.f10168p != null) {
            zzcfpVar.f10168p.mo13649a(this.f178591a, this.f178592b);
        }
    }
}
