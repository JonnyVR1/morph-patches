package p149l;

import com.google.android.gms.measurement.internal.zzae;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class onx0 implements Callable<List<zzae>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f144825a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f144826b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f144827c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ clx0 f144828d;

    public onx0(clx0 clx0Var, String str, String str2, String str3) {
        this.f144825a = str;
        this.f144826b = str2;
        this.f144827c = str3;
        this.f144828d = clx0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzae> call() throws Exception {
        this.f144828d.f81477a.m15310u0();
        return this.f144828d.f81477a.m15290g0().m136110I(this.f144825a, this.f144826b, this.f144827c);
    }
}
