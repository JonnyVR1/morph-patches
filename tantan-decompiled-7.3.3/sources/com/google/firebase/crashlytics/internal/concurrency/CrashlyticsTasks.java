package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p153l.ig4;
import p153l.pox;
import p153l.s26;
import p153l.sni0;
import p153l.toi0;

/* JADX INFO: loaded from: classes7.dex */
public final class CrashlyticsTasks {
    private static final Executor DIRECT = new pox();

    private CrashlyticsTasks() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m16806a(sni0 sni0Var, AtomicBoolean atomicBoolean, ig4 ig4Var, Task task) {
        if (task.mo15431p()) {
            sni0Var.m186943e(task.mo15427l());
        } else if (task.mo15426k() != null) {
            sni0Var.m186942d(task.mo15426k());
        } else if (atomicBoolean.getAndSet(true)) {
            ig4Var.m139763a();
        }
        return toi0.m192068f(null);
    }

    public static <T> Task<T> race(Task<T> task, Task<T> task2) {
        final ig4 ig4Var = new ig4();
        final sni0 sni0Var = new sni0(ig4Var.m139764b());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        s26<T, Task<TContinuationResult>> s26Var = new s26() { // from class: l.tub
            @Override // p153l.s26
            public final Object then(Task task3) {
                return CrashlyticsTasks.m16806a(sni0Var, atomicBoolean, ig4Var, task3);
            }
        };
        Executor executor = DIRECT;
        task.mo15424i(executor, s26Var);
        task2.mo15424i(executor, s26Var);
        return sni0Var.m186939a();
    }
}
