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
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public class CycleDetectingLockFactory {

    /* JADX INFO: renamed from: b */
    public static final ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, C3093c>> f11398b = new MapMaker().m16002l().m15999i();

    /* JADX INFO: renamed from: c */
    public static final Logger f11399c = Logger.getLogger(CycleDetectingLockFactory.class.getName());

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal<ArrayList<C3093c>> f11400d = new C3091a();

    /* JADX INFO: renamed from: a */
    public final InterfaceC3094d f11401a;

    public static class ExampleStackTrace extends IllegalStateException {
        static final StackTraceElement[] EMPTY_STACK_TRACE = new StackTraceElement[0];
        static final ImmutableSet<String> EXCLUDED_CLASS_NAMES = ImmutableSet.m15825of(CycleDetectingLockFactory.class.getName(), ExampleStackTrace.class.getName(), C3093c.class.getName());

        public ExampleStackTrace(C3093c c3093c, C3093c c3093c2) {
            String strM16702d = c3093c.m16702d();
            String strM16702d2 = c3093c2.m16702d();
            StringBuilder sb = new StringBuilder(String.valueOf(strM16702d).length() + 4 + String.valueOf(strM16702d2).length());
            sb.append(strM16702d);
            sb.append(" -> ");
            sb.append(strM16702d2);
            super(sb.toString());
            StackTraceElement[] stackTrace = getStackTrace();
            int length = stackTrace.length;
            for (int i = 0; i < length; i++) {
                if (C3095e.class.getName().equals(stackTrace[i].getClassName())) {
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
    public class C3091a extends ThreadLocal<ArrayList<C3093c>> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<C3093c> initialValue() {
            return Lists.m15981n(3);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$b */
    public interface InterfaceC3092b {
        C3093c getLockGraphNode();

        boolean isAcquiredByCurrentThread();
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$c */
    public static class C3093c {

        /* JADX INFO: renamed from: a */
        public final Map<C3093c, ExampleStackTrace> f11402a;

        /* JADX INFO: renamed from: b */
        public final Map<C3093c, PotentialDeadlockException> f11403b;

        /* JADX INFO: renamed from: c */
        public final String f11404c;

        /* JADX INFO: renamed from: a */
        public void m16699a(InterfaceC3094d interfaceC3094d, C3093c c3093c) {
            xn80.m212121z(this != c3093c, "Attempted to acquire multiple locks with the same rank %s", c3093c.m16702d());
            if (this.f11402a.containsKey(c3093c)) {
                return;
            }
            PotentialDeadlockException potentialDeadlockException = this.f11403b.get(c3093c);
            C3091a c3091a = null;
            if (potentialDeadlockException != null) {
                interfaceC3094d.handlePotentialDeadlock(new PotentialDeadlockException(c3093c, this, potentialDeadlockException.getConflictingStackTrace(), c3091a));
                return;
            }
            ExampleStackTrace exampleStackTraceM16701c = c3093c.m16701c(this, Sets.m16177h());
            if (exampleStackTraceM16701c == null) {
                this.f11402a.put(c3093c, new ExampleStackTrace(c3093c, this));
                return;
            }
            PotentialDeadlockException potentialDeadlockException2 = new PotentialDeadlockException(c3093c, this, exampleStackTraceM16701c, c3091a);
            this.f11403b.put(c3093c, potentialDeadlockException2);
            interfaceC3094d.handlePotentialDeadlock(potentialDeadlockException2);
        }

        /* JADX INFO: renamed from: b */
        public void m16700b(InterfaceC3094d interfaceC3094d, List<C3093c> list) {
            Iterator<C3093c> it = list.iterator();
            while (it.hasNext()) {
                m16699a(interfaceC3094d, it.next());
            }
        }

        /* JADX INFO: renamed from: c */
        public final ExampleStackTrace m16701c(C3093c c3093c, Set<C3093c> set) {
            if (!set.add(this)) {
                return null;
            }
            ExampleStackTrace exampleStackTrace = this.f11402a.get(c3093c);
            if (exampleStackTrace != null) {
                return exampleStackTrace;
            }
            for (Map.Entry<C3093c, ExampleStackTrace> entry : this.f11402a.entrySet()) {
                C3093c key = entry.getKey();
                ExampleStackTrace exampleStackTraceM16701c = key.m16701c(c3093c, set);
                if (exampleStackTraceM16701c != null) {
                    ExampleStackTrace exampleStackTrace2 = new ExampleStackTrace(key, this);
                    exampleStackTrace2.setStackTrace(entry.getValue().getStackTrace());
                    exampleStackTrace2.initCause(exampleStackTraceM16701c);
                    return exampleStackTrace2;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public String m16702d() {
            return this.f11404c;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$d */
    public interface InterfaceC3094d {
        void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException);
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$e */
    public static final class C3095e<E extends Enum<E>> extends CycleDetectingLockFactory {
    }

    /* JADX INFO: renamed from: e */
    public static void m16696e(InterfaceC3092b interfaceC3092b) {
        if (interfaceC3092b.isAcquiredByCurrentThread()) {
            return;
        }
        ArrayList<C3093c> arrayList = f11400d.get();
        C3093c lockGraphNode = interfaceC3092b.getLockGraphNode();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == lockGraphNode) {
                arrayList.remove(size);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m16697a(InterfaceC3092b interfaceC3092b) {
        if (interfaceC3092b.isAcquiredByCurrentThread()) {
            return;
        }
        ArrayList<C3093c> arrayList = f11400d.get();
        C3093c lockGraphNode = interfaceC3092b.getLockGraphNode();
        lockGraphNode.m16700b(this.f11401a, arrayList);
        arrayList.add(lockGraphNode);
    }

    public enum Policies implements InterfaceC3094d {
        THROW { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.1
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policies, com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC3094d
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                throw potentialDeadlockException;
            }
        },
        WARN { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.2
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policies, com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC3094d
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                CycleDetectingLockFactory.f11399c.log(Level.SEVERE, "Detected potential deadlock", (Throwable) potentialDeadlockException);
            }
        },
        DISABLED { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.3
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policies, com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC3094d
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
            }
        };

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC3094d
        public abstract /* synthetic */ void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException);

        /* synthetic */ Policies(C3091a c3091a) {
            this();
        }
    }

    public final class CycleDetectingReentrantReadWriteLock extends ReentrantReadWriteLock implements InterfaceC3092b {
        private final C3093c lockGraphNode;
        private final CycleDetectingReentrantReadLock readLock;
        private final CycleDetectingReentrantWriteLock writeLock;

        private CycleDetectingReentrantReadWriteLock(CycleDetectingLockFactory cycleDetectingLockFactory, C3093c c3093c, boolean z) {
            super(z);
            this.readLock = cycleDetectingLockFactory.new CycleDetectingReentrantReadLock(this);
            this.writeLock = cycleDetectingLockFactory.new CycleDetectingReentrantWriteLock(this);
            this.lockGraphNode = (C3093c) xn80.m212111p(c3093c);
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC3092b
        public C3093c getLockGraphNode() {
            return this.lockGraphNode;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC3092b
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

        public /* synthetic */ CycleDetectingReentrantReadWriteLock(CycleDetectingLockFactory cycleDetectingLockFactory, C3093c c3093c, boolean z, C3091a c3091a) {
            this(cycleDetectingLockFactory, c3093c, z);
        }
    }

    public static final class PotentialDeadlockException extends ExampleStackTrace {
        private final ExampleStackTrace conflictingStackTrace;

        private PotentialDeadlockException(C3093c c3093c, C3093c c3093c2, ExampleStackTrace exampleStackTrace) {
            super(c3093c, c3093c2);
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

        public /* synthetic */ PotentialDeadlockException(C3093c c3093c, C3093c c3093c2, ExampleStackTrace exampleStackTrace, C3091a c3091a) {
            this(c3093c, c3093c2, exampleStackTrace);
        }
    }

    public final class CycleDetectingReentrantLock extends ReentrantLock implements InterfaceC3092b {
        private final C3093c lockGraphNode;

        private CycleDetectingReentrantLock(C3093c c3093c, boolean z) {
            super(z);
            this.lockGraphNode = (C3093c) xn80.m212111p(c3093c);
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC3092b
        public C3093c getLockGraphNode() {
            return this.lockGraphNode;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC3092b
        public boolean isAcquiredByCurrentThread() {
            return isHeldByCurrentThread();
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.m16697a(this);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.m16696e(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.m16697a(this);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.m16696e(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.m16697a(this);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.m16696e(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.m16696e(this);
            }
        }

        public /* synthetic */ CycleDetectingReentrantLock(CycleDetectingLockFactory cycleDetectingLockFactory, C3093c c3093c, boolean z, C3091a c3091a) {
            this(c3093c, z);
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.m16697a(this);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.m16696e(this);
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
            CycleDetectingLockFactory.this.m16697a(this.readWriteLock);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.m16696e(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.m16697a(this.readWriteLock);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.m16696e(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.m16697a(this.readWriteLock);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.m16696e(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.m16696e(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.m16697a(this.readWriteLock);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.m16696e(this.readWriteLock);
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
            CycleDetectingLockFactory.this.m16697a(this.readWriteLock);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.m16696e(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.m16697a(this.readWriteLock);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.m16696e(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.m16697a(this.readWriteLock);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.m16696e(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.m16696e(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.m16697a(this.readWriteLock);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.m16696e(this.readWriteLock);
            }
        }
    }
}
