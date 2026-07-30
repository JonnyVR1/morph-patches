package p153l;

import com.google.android.gms.measurement.internal.zzbf;

/* JADX INFO: loaded from: classes6.dex */
public final class vxx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbf f186308a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f186309b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ iux0 f186310c;

    public vxx0(iux0 iux0Var, zzbf zzbfVar, String str) {
        this.f186308a = zzbfVar;
        this.f186309b = str;
        this.f186310c = iux0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f186310c.f116991a.m15364u0();
        this.f186310c.f116991a.m15358r(this.f186308a, this.f186309b);
    }
}
