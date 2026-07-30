package p149l;

import com.google.android.gms.measurement.internal.zzbf;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class kox0 implements Callable<byte[]> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbf f124065a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f124066b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ clx0 f124067c;

    public kox0(clx0 clx0Var, zzbf zzbfVar, String str) {
        this.f124065a = zzbfVar;
        this.f124066b = str;
        this.f124067c = clx0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() throws Exception {
        this.f124067c.f81477a.m15310u0();
        return this.f124067c.f81477a.m15301p0().m129089s(this.f124065a, this.f124066b);
    }
}
