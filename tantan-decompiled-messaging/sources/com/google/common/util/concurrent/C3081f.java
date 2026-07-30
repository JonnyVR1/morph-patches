package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p149l.gnr;
import p149l.sf80;

/* JADX INFO: renamed from: com.google.common.util.concurrent.f */
/* JADX INFO: loaded from: classes7.dex */
public class C3081f<V> implements gnr<V> {

    /* JADX INFO: renamed from: b */
    public static final gnr<?> f11382b = new C3081f(null);

    /* JADX INFO: renamed from: c */
    public static final Logger f11383c = Logger.getLogger(C3081f.class.getName());

    /* JADX INFO: renamed from: a */
    public final V f11384a;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.f$a */
    public static final class a<V> extends AbstractFuture.AbstractC3055i<V> {
        public a(Throwable th) {
            mo16597D(th);
        }
    }

    public C3081f(V v2) {
        this.f11384a = v2;
    }

    @Override // p149l.gnr
    public void addListener(Runnable runnable, Executor executor) {
        sf80.m183895q(runnable, "Runnable was null.");
        sf80.m183895q(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f11383c;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            logger.log(level, sb.toString(), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        sf80.m183894p(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    public String toString() {
        String string = super.toString();
        String strValueOf = String.valueOf(this.f11384a);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 27 + strValueOf.length());
        sb.append(string);
        sb.append("[status=SUCCESS, result=[");
        sb.append(strValueOf);
        sb.append("]]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f11384a;
    }
}
