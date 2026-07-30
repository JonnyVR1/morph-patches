package p149l;

import com.google.android.gms.measurement.internal.zzbf;

/* JADX INFO: loaded from: classes6.dex */
public final class pox0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbf f150567a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f150568b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ clx0 f150569c;

    public pox0(clx0 clx0Var, zzbf zzbfVar, String str) {
        this.f150567a = zzbfVar;
        this.f150568b = str;
        this.f150569c = clx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f150569c.f81477a.m15310u0();
        this.f150569c.f81477a.m15304r(this.f150567a, this.f150568b);
    }
}
