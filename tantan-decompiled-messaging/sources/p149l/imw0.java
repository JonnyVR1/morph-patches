package p149l;

import com.google.android.gms.internal.ads.C2228q3;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class imw0 {

    /* JADX INFO: renamed from: a */
    public final boolean f113973a;

    /* JADX INFO: renamed from: b */
    public final zzgaa f113974b;

    public /* synthetic */ imw0(boolean z, zzgaa zzgaaVar, hmw0 hmw0Var) {
        this.f113973a = z;
        this.f113974b = zzgaaVar;
    }

    /* JADX INFO: renamed from: a */
    public final gnr m137091a(Callable callable, Executor executor) {
        return new C2228q3(this.f113974b, this.f113973a, executor, callable);
    }
}
