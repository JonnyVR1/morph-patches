package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import p149l.kjx0;
import p149l.p3u0;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C2457f<V> extends FutureTask<V> implements Comparable<C2457f<V>> {

    /* JADX INFO: renamed from: a */
    public final long f10483a;

    /* JADX INFO: renamed from: b */
    public final boolean f10484b;

    /* JADX INFO: renamed from: c */
    public final String f10485c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kjx0 f10486d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2457f(kjx0 kjx0Var, Runnable runnable, boolean z, String str) {
        super(p3u0.m167278a().mo105508a(runnable), null);
        this.f10486d = kjx0Var;
        Preconditions.checkNotNull(str);
        long andIncrement = kjx0.f123507l.getAndIncrement();
        this.f10483a = andIncrement;
        this.f10485c = str;
        this.f10484b = z;
        if (andIncrement == Long.MAX_VALUE) {
            kjx0Var.zzj().m211412A().m123936a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(@NonNull Object obj) {
        C2457f c2457f = (C2457f) obj;
        boolean z = this.f10484b;
        if (z != c2457f.f10484b) {
            return z ? -1 : 1;
        }
        long j = this.f10483a;
        long j2 = c2457f.f10483a;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.f10486d.zzj().m211414C().m123937b("Two tasks share the same index. index", Long.valueOf(this.f10483a));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.f10486d.zzj().m211412A().m123937b(this.f10485c, th);
        if ((th instanceof zzhu) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2457f(kjx0 kjx0Var, Callable<V> callable, boolean z, String str) {
        super(p3u0.m167278a().mo105509b(callable));
        this.f10486d = kjx0Var;
        Preconditions.checkNotNull(str);
        long andIncrement = kjx0.f123507l.getAndIncrement();
        this.f10483a = andIncrement;
        this.f10485c = str;
        this.f10484b = z;
        if (andIncrement == Long.MAX_VALUE) {
            kjx0Var.zzj().m211412A().m123936a("Tasks index overflow");
        }
    }
}
