package com.google.common.hash;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import p153l.f1w;

/* JADX INFO: loaded from: classes7.dex */
final class LongAdder extends Striped64 implements Serializable, f1w {
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

    @Override // p153l.f1w
    public void add(long j) {
        int length;
        Striped64.C3026b c3026b;
        Striped64.C3026b[] c3026bArr = this.cells;
        if (c3026bArr == null) {
            long j2 = this.base;
            if (casBase(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = Striped64.threadHashCode.get();
        boolean zM16414a = true;
        if (iArr != null && c3026bArr != null && (length = c3026bArr.length) >= 1 && (c3026b = c3026bArr[(length - 1) & iArr[0]]) != null) {
            long j3 = c3026b.f11291a;
            zM16414a = c3026b.m16414a(j3, j3 + j);
            if (zM16414a) {
                return;
            }
        }
        retryUpdate(j, iArr, zM16414a);
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

    @Override // com.google.common.hash.Striped64
    /* JADX INFO: renamed from: fn */
    public final long mo16393fn(long j, long j2) {
        return j + j2;
    }

    @Override // p153l.f1w
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

    @Override // p153l.f1w
    public long sum() {
        long j = this.base;
        Striped64.C3026b[] c3026bArr = this.cells;
        if (c3026bArr != null) {
            for (Striped64.C3026b c3026b : c3026bArr) {
                if (c3026b != null) {
                    j += c3026b.f11291a;
                }
            }
        }
        return j;
    }

    public long sumThenReset() {
        long j = this.base;
        Striped64.C3026b[] c3026bArr = this.cells;
        this.base = 0L;
        if (c3026bArr != null) {
            for (Striped64.C3026b c3026b : c3026bArr) {
                if (c3026b != null) {
                    j += c3026b.f11291a;
                    c3026b.f11291a = 0L;
                }
            }
        }
        return j;
    }

    public String toString() {
        return Long.toString(sum());
    }
}
