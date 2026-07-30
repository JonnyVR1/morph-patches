package com.google.common.cache;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import p149l.izv;

/* JADX INFO: loaded from: classes7.dex */
final class LongAdder extends Striped64 implements Serializable, izv {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.busy = 0;
        this.cells = null;
        this.base = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(sum());
    }

    @Override // p149l.izv
    public void add(long j) {
        int length;
        Striped64.C2711b c2711b;
        Striped64.C2711b[] c2711bArr = this.cells;
        if (c2711bArr == null) {
            long j2 = this.base;
            if (casBase(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = Striped64.threadHashCode.get();
        boolean zM15562a = true;
        if (iArr != null && c2711bArr != null && (length = c2711bArr.length) >= 1 && (c2711b = c2711bArr[(length - 1) & iArr[0]]) != null) {
            long j3 = c2711b.f10760a;
            zM15562a = c2711b.m15562a(j3, j3 + j);
            if (zM15562a) {
                return;
            }
        }
        retryUpdate(j, iArr, zM15562a);
    }

    public void decrement() {
        add(-1L);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return sum();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return sum();
    }

    @Override // com.google.common.cache.Striped64
    /* JADX INFO: renamed from: fn */
    public final long mo15560fn(long j, long j2) {
        return j + j2;
    }

    @Override // p149l.izv
    public void increment() {
        add(1L);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) sum();
    }

    @Override // java.lang.Number
    public long longValue() {
        return sum();
    }

    public void reset() {
        internalReset(0L);
    }

    @Override // p149l.izv
    public long sum() {
        long j = this.base;
        Striped64.C2711b[] c2711bArr = this.cells;
        if (c2711bArr != null) {
            for (Striped64.C2711b c2711b : c2711bArr) {
                if (c2711b != null) {
                    j += c2711b.f10760a;
                }
            }
        }
        return j;
    }

    public long sumThenReset() {
        long j = this.base;
        Striped64.C2711b[] c2711bArr = this.cells;
        this.base = 0L;
        if (c2711bArr != null) {
            for (Striped64.C2711b c2711b : c2711bArr) {
                if (c2711b != null) {
                    j += c2711b.f10760a;
                    c2711b.f10760a = 0L;
                }
            }
        }
        return j;
    }

    public String toString() {
        return Long.toString(sum());
    }
}
