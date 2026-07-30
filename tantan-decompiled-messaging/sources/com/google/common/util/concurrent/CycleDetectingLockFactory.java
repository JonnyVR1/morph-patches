package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.MapMaker;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public class CycleDetectingLockFactory {

    /* JADX INFO: renamed from: b */
    public static final ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, C3070c>> f11361b = new MapMaker().m15948l().m15945i();

    /* JADX INFO: renamed from: c */
    public static final Logger f11362c = Logger.getLogger(CycleDetectingLockFactory.class.getName());

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal<ArrayList<C3070c>> f11363d = new C3068a();

    /* JADX INFO: renamed from: a */
    public final InterfaceC3071d f11364a;

    public static class ExampleStackTrace extends IllegalStateException {
        static final StackTraceElement[] EMPTY_STACK_TRACE = new StackTraceElement[0];
        static final ImmutableSet<String> EXCLUDED_CLASS_NAMES = ImmutableSet.m15771of(CycleDetectingLockFactory.class.getName(), ExampleStackTrace.class.getName(), C3070c.class.getName());

        public ExampleStackTrace(C3070c c3070c, C3070c c3070c2) {
            String strM16647d = c3070c.m16647d();
            String strM16647d2 = c3070c2.m16647d();
            StringBuilder sb = new StringBuilder(String.valueOf(strM16647d).length() + 4 + String.valueOf(strM16647d2).length());
            sb.append(strM16647d);
            sb.append(" -> ");
            sb.append(strM16647d2);
            super(sb.toString());
            StackTraceElement[] stackTrace = getStackTrace();
            int length = stackTrace.length;
            for (int i = 0; i < length; i++) {
                if (C3072e.class.getName().equals(stackTrace[i].getClassName())) {
                    setStackTrace(EMPTY_STACK_TRACE);
                    return;
                } else {
                    if (!EXCLUDED_CLASS_NAMES.contains(stackTrace[i].getClassName())) {
                        setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i, length));
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$a */
    public class C3068a extends ThreadLocal<ArrayList<C3070c>> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<C3070c> initialValue() {
            return Lists.m15927n(3);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$b */
    public interface InterfaceC3069b {
        C3070c getLockGraphNode();

        boolean isAcquiredByCurrentThread();
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$c */
    public static class C3070c {

        /* JADX INFO: renamed from: a */
        public final Map<C3070c, ExampleStackTrace> f11365a;

        /* JADX INFO: renamed from: b */
        public final Map<C3070c, PotentialDeadlockException> f11366b;

        /* JADX INFO: renamed from: c */
        public final String f11367c;

        /* JADX INFO: renamed from: a */
        public void m16644a(InterfaceC3071d interfaceC3071d, C3070c c3070c) {
            sf80.m183904z(this != c3070c, "Attempted to acquire multiple locks with the same rank %s", c3070c.m16647d());
            if (this.f11365a.containsKey(c3070c)) {
                return;
            }
            PotentialDeadlockException potentialDeadlockException = this.f11366b.get(c3070c);
            C3068a c3068a = null;
            if (potentialDeadlockException != null) {
                interfaceC3071d.handlePotentialDeadlock(new PotentialDeadlockException(c3070c, this, potentialDeadlockException.getConflictingStackTrace(), c3068a));
                return;
            }
            ExampleStackTrace exampleStackTraceM16646c = c3070c.m16646c(this, Sets.m16123h());
            if (exampleStackTraceM16646c == null) {
                this.f11365a.put(c3070c, new ExampleStackTrace(c3070c, this));
                return;
            }
            PotentialDeadlockException potentialDeadlockException2 = new PotentialDeadlockException(c3070c, this, exampleStackTraceM16646c, c3068a);
            this.f11366b.put(c3070c, potentialDeadlockException2);
            interfaceC3071d.handlePotentialDeadlock(potentialDeadlockException2);
        }

        /* JADX INFO: renamed from: b */
        public void m16645b(InterfaceC3071d interfaceC3071d, List<C3070c> list) {
            Iterator<C3070c> it = list.iterator();
            while (it.hasNext()) {
                m16644a(interfaceC3071d, it.next());
            }
        }

        /* JADX INFO: renamed from: c */
        public final ExampleStackTrace m16646c(C3070c c3070c, Set<C3070c> set) {
            if (!set.add(this)) {
                return null;
            }
            ExampleStackTrace exampleStackTrace = this.f11365a.get(c3070c);
            if (exampleStackTrace != null) {
                return exampleStackTrace;
            }
            for (Map.Entry<C3070c, ExampleStackTrace> entry : this.f11365a.entrySet()) {
                C3070c key = entry.getKey();
                ExampleStackTrace exampleStackTraceM16646c = key.m16646c(c3070c, set);
                if (exampleStackTraceM16646c != null) {
                    ExampleStackTrace exampleStackTrace2 = new ExampleStackTrace(key, this);
                    exampleStackTrace2.setStackTrace(entry.getValue().getStackTrace());
                    exampleStackTrace2.initCause(exampleStackTraceM16646c);
                    return exampleStackTrace2;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public String m16647d() {
            return this.f11367c;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$d */
    public interface InterfaceC3071d {
        void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException);
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$e */
    public static final class C3072e<E extends Enum<E>> extends CycleDetectingLockFactory {
    }

    /* JADX INFO: renamed from: e */
    public static void m16641e(InterfaceC3069b interfaceC3069b) {
        if (interfaceC3069b.isAcquiredByCurrentThread()) {
            return;
        }
        ArrayList<C3070c> arrayList = f11363d.get();
        C3070c lockGraphNode = interfaceC3069b.getLockGraphNode();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == lockGraphNode) {
                arrayList.remove(size);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m16642a(InterfaceC3069b interfaceC3069b) {
        if (interfaceC3069b.isAcquiredByCurrentThread()) {
            return;
        }
        ArrayList<C3070c> arrayList = f11363d.get();
        C3070c lockGraphNode = interfaceC3069b.getLockGraphNode();
        lockGraphNode.m16645b(this.f11364a, arrayList);
        arrayList.add(lockGraphNode);
    }

    public enum Policies implements InterfaceC3071d {
        THROW { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.1
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policies, com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC3071d
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                throw potentialDeadlockException;
            }
        },
        WARN { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.2
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policies, com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC3071d
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                CycleDetectingLockFactory.f11362c.log(Level.SEVERE, "Detected potential deadlock", (Throwable) potentialDeadlockException);
            }
        },
        DISABLED { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.3
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policies, com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC3071d
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
            }
        };

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC3071d
        public abstract /* synthetic */ void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException);

        /* synthetic */ Policies(C3068a c3068a) {
            this();
        }
    }

    public final class CycleDetectingReentrantReadWriteLock extends ReentrantReadWriteLock implements InterfaceC3069b {
        private final C3070c lockGraphNode;
        private final CycleDetectingReentrantReadLock readLock;
        private final CycleDetectingReentrantWriteLock writeLock;

        private CycleDetectingReentrantReadWriteLock(CycleDetectingLockFactory cycleDetectingLockFactory, C3070c c3070c, boolean z) {
            super(z);
            this.readLock = cycleDetectingLockFactory.new CycleDetectingReentrantReadLock(this);
            this.writeLock = cycleDetectingLockFactory.new CycleDetectingReentrantWriteLock(this);
            this.lockGraphNode = (C3070c) sf80.m183894p(c3070c);
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC3069b
        public C3070c getLockGraphNode() {
            return this.lockGraphNode;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC3069b
        public boolean isAcquiredByCurrentThread() {
            return isWriteLockedByCurrentThread() || getReadHoldCount() > 0;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.ReadLock readLock() {
            return this.readLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.WriteLock writeLock() {
            return this.writeLock;
        }

        public /* synthetic */ CycleDetectingReentrantReadWriteLock(CycleDetectingLockFactory cycleDetectingLockFactory, C3070c c3070c, boolean z, C3068a c3068a) {
            this(cycleDetectingLockFactory, c3070c, z);
        }
    }

    public static final class PotentialDeadlockException extends ExampleStackTrace {
        private final ExampleStackTrace conflictingStackTrace;

        private PotentialDeadlockException(C3070c c3070c, C3070c c3070c2, ExampleStackTrace exampleStackTrace) {
            super(c3070c, c3070c2);
            this.conflictingStackTrace = exampleStackTrace;
            initCause(exampleStackTrace);
        }

        public ExampleStackTrace getConflictingStackTrace() {
            return this.conflictingStackTrace;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb = new StringBuilder(message);
            for (Throwable cause = this.conflictingStackTrace; cause != null; cause = cause.getCause()) {
                sb.append(", ");
                sb.append(cause.getMessage());
            }
            return sb.toString();
        }

        public /* synthetic */ PotentialDeadlockException(C3070c c3070c, C3070c c3070c2, ExampleStackTrace exampleStackTrace, C3068a c3068a) {
            this(c3070c, c3070c2, exampleStackTrace);
        }
    }

    public final class CycleDetectingReentrantLock extends ReentrantLock implements InterfaceC3069b {
        private final C3070c lockGraphNode;

        private CycleDetectingReentrantLock(C3070c c3070c, boolean z) {
            super(z);
            this.lockGraphNode = (C3070c) sf80.m183894p(c3070c);
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC3069b
        public C3070c getLockGraphNode() {
            return this.lockGraphNode;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC3069b
        public boolean isAcquiredByCurrentThread() {
            return isHeldByCurrentThread();
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.m16642a(this);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.m16641e(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.m16642a(this);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.m16641e(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.m16642a(this);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.m16641e(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.m16641e(this);
            }
        }

        public /* synthetic */ CycleDetectingReentrantLock(CycleDetectingLockFactory cycleDetectingLockFactory, C3070c c3070c, boolean z, C3068a c3068a) {
            this(c3070c, z);
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.m16642a(this);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.m16641e(this);
            }
        }
    }

    public class CycleDetectingReentrantReadLock extends ReentrantReadWriteLock.ReadLock {
        final CycleDetectingReentrantReadWriteLock readWriteLock;

        public CycleDetectingReentrantReadLock(CycleDetectingReentrantReadWriteLock cycleDetectingReentrantReadWriteLock) {
            super(cycleDetectingReentrantReadWriteLock);
            this.readWriteLock = cycleDetectingReentrantReadWriteLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.m16642a(this.readWriteLock);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.m16641e(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.m16642a(this.readWriteLock);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.m16641e(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.m16642a(this.readWriteLock);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.m16641e(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.m16641e(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.m16642a(this.readWriteLock);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.m16641e(this.readWriteLock);
            }
        }
    }

    public class CycleDetectingReentrantWriteLock extends ReentrantReadWriteLock.WriteLock {
        final CycleDetectingReentrantReadWriteLock readWriteLock;

        public CycleDetectingReentrantWriteLock(CycleDetectingReentrantReadWriteLock cycleDetectingReentrantReadWriteLock) {
            super(cycleDetectingReentrantReadWriteLock);
            this.readWriteLock = cycleDetectingReentrantReadWriteLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.m16642a(this.readWriteLock);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.m16641e(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.m16642a(this.readWriteLock);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.m16641e(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.m16642a(this.readWriteLock);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.m16641e(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.m16641e(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.m16642a(this.readWriteLock);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.m16641e(this.readWriteLock);
            }
        }
    }
}
