package p153l;

import com.google.android.gms.internal.ads.zzcfp;

/* JADX INFO: loaded from: classes6.dex */
public final class sdt0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f167463a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f167464b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzcfp f167465c;

    public sdt0(zzcfp zzcfpVar, String str, String str2) {
        this.f167463a = str;
        this.f167464b = str2;
        this.f167465c = zzcfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcfp zzcfpVar = this.f167465c;
        if (zzcfpVar.f10168p != null) {
            zzcfpVar.f10168p.mo13650b(this.f167463a, this.f167464b);
        }
    }
}
