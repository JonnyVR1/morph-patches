package com.google.common.util.concurrent;

import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.common.util.concurrent.b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC3100b<OutputT> extends AbstractFuture.AbstractC3078i<OutputT> {

    /* JADX INFO: renamed from: j */
    public static final b f11411j;

    /* JADX INFO: renamed from: k */
    public static final Logger f11412k = Logger.getLogger(AbstractC3100b.class.getName());

    /* JADX INFO: renamed from: h */
    public volatile Set<Throwable> f11413h;

    /* JADX INFO: renamed from: i */
    public volatile int f11414i;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.b$b */
    public static abstract class b {
        public b() {
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.b$c */
    public static final class c extends b {

        /* JADX INFO: renamed from: a */
        public final AtomicReferenceFieldUpdater<AbstractC3100b<?>, Set<Throwable>> f11415a;

        /* JADX INFO: renamed from: b */
        public final AtomicIntegerFieldUpdater<AbstractC3100b<?>> f11416b;

        public c(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f11415a = atomicReferenceFieldUpdater;
            this.f11416b = atomicIntegerFieldUpdater;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.b$d */
    public static final class d extends b {
        public d() {
            super();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        b dVar;
        Throwable th = null;
        Object[] objArr = 0;
        try {
            dVar = new c(AtomicReferenceFieldUpdater.newUpdater(AbstractC3100b.class, Set.class, "h"), AtomicIntegerFieldUpdater.newUpdater(AbstractC3100b.class, RXScreenCaptureService.KEY_INDEX));
        } catch (Throwable th2) {
            dVar = new d();
            th = th2;
        }
        f11411j = dVar;
        if (th != null) {
            f11412k.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
