package com.google.common.hash;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import p149l.hzv;

/* JADX INFO: loaded from: classes7.dex */
final class LongAdder extends Striped64 implements Serializable, hzv {
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

    @Override // p149l.hzv
    public void add(long j) {
        int length;
        Striped64.C3003b c3003b;
        Striped64.C3003b[] c3003bArr = this.cells;
        if (c3003bArr == null) {
            long j2 = this.base;
            if (casBase(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = Striped64.threadHashCode.get();
        boolean zM16359a = true;
        if (iArr != null && c3003bArr != null && (length = c3003bArr.length) >= 1 && (c3003b = c3003bArr[(length - 1) & iArr[0]]) != null) {
            long j3 = c3003b.f11254a;
            zM16359a = c3003b.m16359a(j3, j3 + j);
            if (zM16359a) {
                return;
            }
        }
        retryUpdate(j, iArr, zM16359a);
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
    public final long mo16338fn(long j, long j2) {
        return j + j2;
    }

    @Override // p149l.hzv
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

    @Override // p149l.hzv
    public long sum() {
        long j = this.base;
        Striped64.C3003b[] c3003bArr = this.cells;
        if (c3003bArr != null) {
            for (Striped64.C3003b c3003b : c3003bArr) {
                if (c3003b != null) {
                    j += c3003b.f11254a;
                }
            }
        }
        return j;
    }

    public long sumThenReset() {
        long j = this.base;
        Striped64.C3003b[] c3003bArr = this.cells;
        this.base = 0L;
        if (c3003bArr != null) {
            for (Striped64.C3003b c3003b : c3003bArr) {
                if (c3003b != null) {
                    j += c3003b.f11254a;
                    c3003b.f11254a = 0L;
                }
            }
        }
        return j;
    }

    public String toString() {
        return Long.toString(sum());
    }
}
