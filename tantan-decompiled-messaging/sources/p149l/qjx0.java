package p149l;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class qjx0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final String f155013a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kjx0 f155014b;

    public qjx0(kjx0 kjx0Var, String str) {
        this.f155014b = kjx0Var;
        Preconditions.checkNotNull(str);
        this.f155013a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f155014b.zzj().m211412A().m123937b(this.f155013a, th);
    }
}
