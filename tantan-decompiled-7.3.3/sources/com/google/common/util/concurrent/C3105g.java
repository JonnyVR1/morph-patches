package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p153l.xn80;

/* JADX INFO: renamed from: com.google.common.util.concurrent.g */
/* JADX INFO: loaded from: classes7.dex */
public final class C3105g {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.g$a */
    public class a implements Executor {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Executor f11422a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractFuture f11423b;

        public a(Executor executor, AbstractFuture abstractFuture) {
            this.f11422a = executor;
            this.f11423b = abstractFuture;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.f11422a.execute(runnable);
            } catch (RejectedExecutionException e) {
                this.f11423b.mo16652D(e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Executor m16714a() {
        return DirectExecutor.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Executor m16715b(Executor executor, AbstractFuture<?> abstractFuture) {
        xn80.m212111p(executor);
        xn80.m212111p(abstractFuture);
        return executor == m16714a() ? executor : new a(executor, abstractFuture);
    }
}
