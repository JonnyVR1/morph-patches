package tech.sud.gip.asr.base.utils;

import java.io.Serializable;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import l.x9g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ByteArrayBlockingQueue implements Serializable {
    private static final long serialVersionUID = -817911632652898426L;
    int count;
    final byte[] items;
    final ReentrantLock lock;
    private final Condition notEmpty;
    private final Condition notFull;
    int putIndex;
    int takeIndex;

    public ByteArrayBlockingQueue(int i, boolean z, Collection<Byte> collection) {
        this(i, z);
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            try {
                int i2 = 0;
                int i3 = 0;
                for (Byte b : collection) {
                    checkNotNull(b);
                    int i4 = i3 + 1;
                    this.items[i3] = b.byteValue();
                    i3 = i4;
                }
                this.count = i3;
                if (i3 != i) {
                    i2 = i3;
                }
                this.putIndex = i2;
                reentrantLock.unlock();
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IllegalArgumentException();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    private static void checkNotNull(Object obj) {
        obj.getClass();
    }

    private int dequeue(byte[] bArr, int i) {
        byte[] bArr2 = this.items;
        int iMin = Math.min(Math.min(this.count, bArr2.length - this.takeIndex), bArr.length - i);
        System.arraycopy(bArr2, this.takeIndex, bArr, i, iMin);
        this.takeIndex = inc(this.takeIndex, iMin);
        this.count -= iMin;
        this.notFull.signal();
        return iMin;
    }

    private int enqueue(byte[] bArr, int i) {
        int iMin = Math.min(this.items.length - this.putIndex, bArr.length - i);
        System.arraycopy(bArr, i, this.items, this.putIndex, iMin);
        this.putIndex = inc(this.putIndex, iMin);
        this.count += iMin;
        return iMin;
    }

    public void clear() {
        byte[] bArr = this.items;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            int i = this.count;
            if (i > 0) {
                int i2 = this.putIndex;
                int iInc = this.takeIndex;
                do {
                    bArr[iInc] = 0;
                    iInc = inc(iInc);
                } while (iInc != i2);
                this.takeIndex = i2;
                this.count = 0;
                while (i > 0 && reentrantLock.hasWaiters(this.notFull)) {
                    this.notFull.signal();
                    i--;
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        byte[] bArr = this.items;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.count > 0) {
                int i = this.putIndex;
                int iInc = this.takeIndex;
                while (!obj.equals(Byte.valueOf(bArr[iInc]))) {
                    iInc = inc(iInc);
                    if (iInc == i) {
                    }
                }
                return true;
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int dec(int i) {
        if (i == 0) {
            i = this.items.length;
        }
        return i - 1;
    }

    public final int inc(int i) {
        int i2 = i + 1;
        if (i2 == this.items.length) {
            return 0;
        }
        return i2;
    }

    public final byte itemAt(int i) {
        return this.items[i];
    }

    public boolean offer(byte b, long j, TimeUnit timeUnit) throws InterruptedException {
        checkNotNull(Byte.valueOf(b));
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lockInterruptibly();
        while (this.count == this.items.length) {
            try {
                if (nanos <= 0) {
                    reentrantLock.unlock();
                    return false;
                }
                nanos = this.notFull.awaitNanos(nanos);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        enqueue(b);
        reentrantLock.unlock();
        return true;
    }

    public boolean offerBuffer(byte[] bArr) {
        checkNotNull(bArr);
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            int i = this.count;
            byte[] bArr2 = this.items;
            int iEnqueue = 0;
            if (i != bArr2.length && i + bArr.length <= bArr2.length) {
                while (iEnqueue < bArr.length) {
                    iEnqueue += enqueue(bArr, iEnqueue);
                }
                this.notEmpty.signal();
                return true;
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public byte peek() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return itemAt(this.takeIndex);
        } finally {
            reentrantLock.unlock();
        }
    }

    public byte poll(long j, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lockInterruptibly();
        while (this.count == 0) {
            try {
                if (nanos <= 0) {
                    reentrantLock.unlock();
                    return (byte) 0;
                }
                nanos = this.notEmpty.awaitNanos(nanos);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        byte bDequeue = dequeue();
        reentrantLock.unlock();
        return bDequeue;
    }

    public void put(byte b) throws InterruptedException {
        checkNotNull(Byte.valueOf(b));
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lockInterruptibly();
        while (this.count == this.items.length) {
            try {
                this.notFull.await();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        enqueue(b);
        reentrantLock.unlock();
    }

    public int remainingCapacity() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.items.length - this.count;
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        byte[] bArr = this.items;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.count > 0) {
                int i = this.putIndex;
                int iInc = this.takeIndex;
                while (!obj.equals(Byte.valueOf(bArr[iInc]))) {
                    iInc = inc(iInc);
                    if (iInc == i) {
                    }
                }
                removeAt(iInc);
                return true;
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void removeAt(int i) {
        byte[] bArr = this.items;
        int i2 = this.takeIndex;
        if (i == i2) {
            bArr[i2] = 0;
            this.takeIndex = inc(i2);
            this.count--;
        } else {
            int i3 = this.putIndex;
            while (true) {
                int iInc = inc(i);
                if (iInc == i3) {
                    break;
                }
                bArr[i] = bArr[iInc];
                i = iInc;
            }
            bArr[i] = 0;
            this.putIndex = i;
            this.count--;
        }
        this.notFull.signal();
    }

    public int size() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.count;
        } finally {
            reentrantLock.unlock();
        }
    }

    public byte take() throws InterruptedException {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lockInterruptibly();
        while (this.count == 0) {
            try {
                this.notEmpty.await();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        byte bDequeue = dequeue();
        reentrantLock.unlock();
        return bDequeue;
    }

    public int takeBuffer(byte[] bArr, int i) throws InterruptedException {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lockInterruptibly();
        while (this.count == 0) {
            try {
                this.notEmpty.await();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        int iDequeue = dequeue(bArr, i);
        reentrantLock.unlock();
        return iDequeue;
    }

    public byte[] toArray() {
        byte[] bArr = this.items;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            int i = this.count;
            byte[] bArr2 = new byte[i];
            int length = bArr.length;
            int i2 = this.takeIndex;
            int i3 = length - i2;
            if (i <= i3) {
                System.arraycopy(bArr, i2, bArr2, 0, i);
            } else {
                System.arraycopy(bArr, i2, bArr2, 0, i3);
                System.arraycopy(bArr, 0, bArr2, i3, i - i3);
            }
            return bArr2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public String toString() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            int i = this.count;
            if (i == 0) {
                return "[]";
            }
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            int iInc = this.takeIndex;
            while (true) {
                Object objValueOf = Byte.valueOf(this.items[iInc]);
                if (objValueOf == this) {
                    objValueOf = "(this Collection)";
                }
                sb.append(objValueOf);
                i--;
                if (i == 0) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(',');
                sb.append(' ');
                iInc = inc(iInc);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int inc(int i, int i2) {
        int length = this.items.length;
        int i3 = i + i2;
        return i3 >= length ? i3 % length : i3;
    }

    private void enqueue(byte b) {
        byte[] bArr = this.items;
        int i = this.putIndex;
        bArr[i] = b;
        this.putIndex = inc(i);
        this.count++;
        this.notEmpty.signal();
    }

    private byte dequeue() {
        byte[] bArr = this.items;
        int i = this.takeIndex;
        byte b = bArr[i];
        bArr[i] = 0;
        this.takeIndex = inc(i);
        this.count--;
        this.notFull.signal();
        return b;
    }

    public byte poll() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.count == 0 ? (byte) 0 : dequeue();
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean offer(byte b) {
        checkNotNull(Byte.valueOf(b));
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.count == this.items.length) {
                return false;
            }
            enqueue(b);
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public ByteArrayBlockingQueue(int i, boolean z) {
        if (i > 0) {
            this.items = new byte[i];
            ReentrantLock reentrantLock = new ReentrantLock(z);
            this.lock = reentrantLock;
            this.notEmpty = reentrantLock.newCondition();
            this.notFull = reentrantLock.newCondition();
            return;
        }
        x9g0.a();
        throw null;
    }

    public ByteArrayBlockingQueue(int i) {
        this(i, false);
    }
}
