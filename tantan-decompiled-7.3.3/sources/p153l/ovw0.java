package p153l;

import com.google.android.gms.internal.ads.C2251q3;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class ovw0 {

    /* JADX INFO: renamed from: a */
    public final boolean f149316a;

    /* JADX INFO: renamed from: b */
    public final zzgaa f149317b;

    public /* synthetic */ ovw0(boolean z, zzgaa zzgaaVar, nvw0 nvw0Var) {
        this.f149316a = z;
        this.f149317b = zzgaaVar;
    }

    /* JADX INFO: renamed from: a */
    public final hpr m169489a(Callable callable, Executor executor) {
        return new C2251q3(this.f149317b, this.f149316a, executor, callable);
    }
}
