package org.eclipse.jetty.util.statistic;

import java.util.concurrent.atomic.AtomicLong;
import org.eclipse.jetty.util.Atomics;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CounterStatistic {
    protected final AtomicLong _max = new AtomicLong();
    protected final AtomicLong _curr = new AtomicLong();
    protected final AtomicLong _total = new AtomicLong();

    public void add(long j) {
        long jAddAndGet = this._curr.addAndGet(j);
        if (j > 0) {
            this._total.addAndGet(j);
        }
        Atomics.updateMax(this._max, jAddAndGet);
    }

    public void decrement() {
        add(-1L);
    }

    public long getCurrent() {
        return this._curr.get();
    }

    public long getMax() {
        return this._max.get();
    }

    public long getTotal() {
        return this._total.get();
    }

    public void increment() {
        add(1L);
    }

    public void reset(long j) {
        this._max.set(j);
        this._curr.set(j);
        this._total.set(0L);
    }

    public void subtract(long j) {
        add(-j);
    }

    public void reset() {
        reset(0L);
    }
}
