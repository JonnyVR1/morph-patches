package org.junit.rules;

import java.util.concurrent.TimeUnit;
import org.junit.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Stopwatch implements TestRule {
    private final Clock clock;
    private volatile long endNanos;
    private volatile long startNanos;

    public static class Clock {
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    public class InternalWatcher extends TestWatcher {
        private InternalWatcher() {
        }

        @Override // org.junit.rules.TestWatcher
        public void failed(Throwable th, Description description) {
            Stopwatch.this.stopping();
            Stopwatch stopwatch = Stopwatch.this;
            stopwatch.failed(stopwatch.getNanos(), th, description);
        }

        @Override // org.junit.rules.TestWatcher
        public void finished(Description description) {
            Stopwatch stopwatch = Stopwatch.this;
            stopwatch.finished(stopwatch.getNanos(), description);
        }

        @Override // org.junit.rules.TestWatcher
        public void skipped(AssumptionViolatedException assumptionViolatedException, Description description) {
            Stopwatch.this.stopping();
            Stopwatch stopwatch = Stopwatch.this;
            stopwatch.skipped(stopwatch.getNanos(), assumptionViolatedException, description);
        }

        @Override // org.junit.rules.TestWatcher
        public void starting(Description description) {
            Stopwatch.this.starting();
        }

        @Override // org.junit.rules.TestWatcher
        public void succeeded(Description description) {
            Stopwatch.this.stopping();
            Stopwatch stopwatch = Stopwatch.this;
            stopwatch.succeeded(stopwatch.getNanos(), description);
        }
    }

    public Stopwatch() {
        this(new Clock());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getNanos() {
        if (this.startNanos == 0) {
            wtq0.m207906a("Test has not started");
            return 0L;
        }
        long jNanoTime = this.endNanos;
        if (jNanoTime == 0) {
            jNanoTime = this.clock.nanoTime();
        }
        return jNanoTime - this.startNanos;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void starting() {
        this.startNanos = this.clock.nanoTime();
        this.endNanos = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopping() {
        this.endNanos = this.clock.nanoTime();
    }

    @Override // org.junit.rules.TestRule
    public final Statement apply(Statement statement, Description description) {
        return new InternalWatcher().apply(statement, description);
    }

    public void failed(long j, Throwable th, Description description) {
    }

    public void finished(long j, Description description) {
    }

    public long runtime(TimeUnit timeUnit) {
        return timeUnit.convert(getNanos(), TimeUnit.NANOSECONDS);
    }

    public void skipped(long j, AssumptionViolatedException assumptionViolatedException, Description description) {
    }

    public void succeeded(long j, Description description) {
    }

    public Stopwatch(Clock clock) {
        this.clock = clock;
    }
}
