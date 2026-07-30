package org.aspectj.runtime.internal.cflowstack;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class ThreadCounterImpl11 implements ThreadCounter {
    private static final int COLLECT_AT = 20000;
    private static final int MIN_COLLECT_AT = 100;
    private Counter cached_counter;
    private Thread cached_thread;
    private Hashtable counters = new Hashtable();
    private int change_count = 0;

    public static class Counter {
        protected int value = 0;
    }

    private synchronized Counter getThreadCounter() {
        try {
            if (Thread.currentThread() != this.cached_thread) {
                Thread threadCurrentThread = Thread.currentThread();
                this.cached_thread = threadCurrentThread;
                Counter counter = (Counter) this.counters.get(threadCurrentThread);
                this.cached_counter = counter;
                if (counter == null) {
                    Counter counter2 = new Counter();
                    this.cached_counter = counter2;
                    this.counters.put(this.cached_thread, counter2);
                }
                this.change_count++;
                if (this.change_count > Math.max(100, 20000 / Math.max(1, this.counters.size()))) {
                    ArrayList arrayList = new ArrayList();
                    Enumeration enumerationKeys = this.counters.keys();
                    while (enumerationKeys.hasMoreElements()) {
                        Thread thread = (Thread) enumerationKeys.nextElement();
                        if (!thread.isAlive()) {
                            arrayList.add(thread);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        this.counters.remove((Thread) it.next());
                    }
                    this.change_count = 0;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.cached_counter;
    }

    @Override // org.aspectj.runtime.internal.cflowstack.ThreadCounter
    public void dec() {
        getThreadCounter().value--;
    }

    @Override // org.aspectj.runtime.internal.cflowstack.ThreadCounter
    public void inc() {
        getThreadCounter().value++;
    }

    @Override // org.aspectj.runtime.internal.cflowstack.ThreadCounter
    public boolean isNotZero() {
        return getThreadCounter().value != 0;
    }

    @Override // org.aspectj.runtime.internal.cflowstack.ThreadCounter
    public void removeThreadCounter() {
    }
}
