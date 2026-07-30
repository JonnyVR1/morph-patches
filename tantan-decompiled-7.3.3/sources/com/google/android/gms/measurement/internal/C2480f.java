package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import p153l.qsx0;
import p153l.vcu0;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C2480f<V> extends FutureTask<V> implements Comparable<C2480f<V>> {

    /* JADX INFO: renamed from: a */
    public final long f10520a;

    /* JADX INFO: renamed from: b */
    public final boolean f10521b;

    /* JADX INFO: renamed from: c */
    public final String f10522c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ qsx0 f10523d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2480f(qsx0 qsx0Var, Runnable runnable, boolean z, String str) {
        super(vcu0.m200838a().mo96612a(runnable), null);
        this.f10523d = qsx0Var;
        Preconditions.checkNotNull(str);
        long andIncrement = qsx0.f159357l.getAndIncrement();
        this.f10520a = andIncrement;
        this.f10522c = str;
        this.f10521b = z;
        if (andIncrement == Long.MAX_VALUE) {
            qsx0Var.zzj().m114558A().m153300a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(@NonNull Object obj) {
        C2480f c2480f = (C2480f) obj;
        boolean z = this.f10521b;
        if (z != c2480f.f10521b) {
            return z ? -1 : 1;
        }
        long j = this.f10520a;
        long j2 = c2480f.f10520a;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.f10523d.zzj().m114560C().m153301b("Two tasks share the same index. index", Long.valueOf(this.f10520a));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.f10523d.zzj().m114558A().m153301b(this.f10522c, th);
        if ((th instanceof zzhu) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2480f(qsx0 qsx0Var, Callable<V> callable, boolean z, String str) {
        super(vcu0.m200838a().mo96613b(callable));
        this.f10523d = qsx0Var;
        Preconditions.checkNotNull(str);
        long andIncrement = qsx0.f159357l.getAndIncrement();
        this.f10520a = andIncrement;
        this.f10522c = str;
        this.f10521b = z;
        if (andIncrement == Long.MAX_VALUE) {
            qsx0Var.zzj().m114558A().m153300a("Tasks index overflow");
        }
    }
}
