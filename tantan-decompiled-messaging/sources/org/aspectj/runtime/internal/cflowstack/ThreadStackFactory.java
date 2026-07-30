package org.aspectj.runtime.internal.cflowstack;

/* JADX INFO: loaded from: classes2.dex */
public interface ThreadStackFactory {
    ThreadCounter getNewThreadCounter();

    ThreadStack getNewThreadStack();
}
