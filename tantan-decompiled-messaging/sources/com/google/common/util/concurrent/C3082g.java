package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p149l.sf80;

/* JADX INFO: renamed from: com.google.common.util.concurrent.g */
/* JADX INFO: loaded from: classes7.dex */
public final class C3082g {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.g$a */
    public class a implements Executor {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Executor f11385a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractFuture f11386b;

        public a(Executor executor, AbstractFuture abstractFuture) {
            this.f11385a = executor;
            this.f11386b = abstractFuture;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.f11385a.execute(runnable);
            } catch (RejectedExecutionException e) {
                this.f11386b.mo16597D(e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Executor m16659a() {
        return DirectExecutor.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Executor m16660b(Executor executor, AbstractFuture<?> abstractFuture) {
        sf80.m183894p(executor);
        sf80.m183894p(abstractFuture);
        return executor == m16659a() ? executor : new a(executor, abstractFuture);
    }
}
