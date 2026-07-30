package p149l;

import com.google.android.gms.measurement.internal.zzae;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class jnx0 implements Callable<List<zzae>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f118897a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f118898b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f118899c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ clx0 f118900d;

    public jnx0(clx0 clx0Var, String str, String str2, String str3) {
        this.f118897a = str;
        this.f118898b = str2;
        this.f118899c = str3;
        this.f118900d = clx0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzae> call() throws Exception {
        this.f118900d.f81477a.m15310u0();
        return this.f118900d.f81477a.m15290g0().m136110I(this.f118897a, this.f118898b, this.f118899c);
    }
}
