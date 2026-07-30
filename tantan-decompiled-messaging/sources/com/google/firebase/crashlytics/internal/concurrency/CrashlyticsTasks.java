package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p149l.jf4;
import p149l.n16;
import p149l.rfx;
import p149l.sei0;
import p149l.tfi0;

/* JADX INFO: loaded from: classes7.dex */
public final class CrashlyticsTasks {
    private static final Executor DIRECT = new rfx();

    private CrashlyticsTasks() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m16751a(sei0 sei0Var, AtomicBoolean atomicBoolean, jf4 jf4Var, Task task) {
        if (task.mo15377p()) {
            sei0Var.m183661e(task.mo15373l());
        } else if (task.mo15372k() != null) {
            sei0Var.m183660d(task.mo15372k());
        } else if (atomicBoolean.getAndSet(true)) {
            jf4Var.m141172a();
        }
        return tfi0.m188734f(null);
    }

    public static <T> Task<T> race(Task<T> task, Task<T> task2) {
        final jf4 jf4Var = new jf4();
        final sei0 sei0Var = new sei0(jf4Var.m141173b());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        n16<T, Task<TContinuationResult>> n16Var = new n16() { // from class: l.ftb
            @Override // p149l.n16
            public final Object then(Task task3) {
                return CrashlyticsTasks.m16751a(sei0Var, atomicBoolean, jf4Var, task3);
            }
        };
        Executor executor = DIRECT;
        task.mo15370i(executor, n16Var);
        task2.mo15370i(executor, n16Var);
        return sei0Var.m183657a();
    }
}
