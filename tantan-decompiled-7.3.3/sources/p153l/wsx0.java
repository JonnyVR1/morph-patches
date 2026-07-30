package p153l;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class wsx0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final String f190703a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qsx0 f190704b;

    public wsx0(qsx0 qsx0Var, String str) {
        this.f190704b = qsx0Var;
        Preconditions.checkNotNull(str);
        this.f190703a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f190704b.zzj().m114558A().m153301b(this.f190703a, th);
    }
}
