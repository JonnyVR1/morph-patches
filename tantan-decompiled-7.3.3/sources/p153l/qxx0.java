package p153l;

import com.google.android.gms.measurement.internal.zzbf;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class qxx0 implements Callable<byte[]> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbf f160081a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f160082b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ iux0 f160083c;

    public qxx0(iux0 iux0Var, zzbf zzbfVar, String str) {
        this.f160081a = zzbfVar;
        this.f160082b = str;
        this.f160083c = iux0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() throws Exception {
        this.f160083c.f116991a.m15364u0();
        return this.f160083c.f116991a.m15355p0().m162106s(this.f160081a, this.f160082b);
    }
}
