package org.aspectj.runtime.internal.cflowstack;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;

/* JADX INFO: loaded from: classes2.dex */
public class ThreadStackImpl11 implements ThreadStack {
    private static final int COLLECT_AT = 20000;
    private static final int MIN_COLLECT_AT = 100;
    private Stack cached_stack;
    private Thread cached_thread;
    private Hashtable stacks = new Hashtable();
    private int change_count = 0;

    @Override // org.aspectj.runtime.internal.cflowstack.ThreadStack
    public synchronized Stack getThreadStack() {
        try {
            if (Thread.currentThread() != this.cached_thread) {
                Thread threadCurrentThread = Thread.currentThread();
                this.cached_thread = threadCurrentThread;
                Stack stack = (Stack) this.stacks.get(threadCurrentThread);
                this.cached_stack = stack;
                if (stack == null) {
                    Stack stack2 = new Stack();
                    this.cached_stack = stack2;
                    this.stacks.put(this.cached_thread, stack2);
                }
                this.change_count++;
                if (this.change_count > Math.max(100, 20000 / Math.max(1, this.stacks.size()))) {
                    Stack stack3 = new Stack();
                    Enumeration enumerationKeys = this.stacks.keys();
                    while (enumerationKeys.hasMoreElements()) {
                        Thread thread = (Thread) enumerationKeys.nextElement();
                        if (!thread.isAlive()) {
                            stack3.push(thread);
                        }
                    }
                    Enumeration enumerationElements = stack3.elements();
                    while (enumerationElements.hasMoreElements()) {
                        this.stacks.remove((Thread) enumerationElements.nextElement());
                    }
                    this.change_count = 0;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.cached_stack;
    }

    @Override // org.aspectj.runtime.internal.cflowstack.ThreadStack
    public void removeThreadStack() {
    }
}
