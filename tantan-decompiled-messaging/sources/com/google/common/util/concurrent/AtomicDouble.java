package com.google.common.util.concurrent;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public class AtomicDouble extends Number implements Serializable {
    private static final long serialVersionUID = 0;
    private transient AtomicLong value;

    public AtomicDouble(double d) {
        this.value = new AtomicLong(Double.doubleToRawLongBits(d));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.value = new AtomicLong();
        set(objectInputStream.readDouble());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(get());
    }

    public final double addAndGet(double d) {
        long j;
        double dLongBitsToDouble;
        do {
            j = this.value.get();
            dLongBitsToDouble = Double.longBitsToDouble(j) + d;
        } while (!this.value.compareAndSet(j, Double.doubleToRawLongBits(dLongBitsToDouble)));
        return dLongBitsToDouble;
    }

    public final boolean compareAndSet(double d, double d2) {
        return this.value.compareAndSet(Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d2));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return get();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) get();
    }

    public final double get() {
        return Double.longBitsToDouble(this.value.get());
    }

    public final double getAndAdd(double d) {
        long j;
        double dLongBitsToDouble;
        do {
            j = this.value.get();
            dLongBitsToDouble = Double.longBitsToDouble(j);
        } while (!this.value.compareAndSet(j, Double.doubleToRawLongBits(dLongBitsToDouble + d)));
        return dLongBitsToDouble;
    }

    public final double getAndSet(double d) {
        return Double.longBitsToDouble(this.value.getAndSet(Double.doubleToRawLongBits(d)));
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) get();
    }

    public final void lazySet(double d) {
        this.value.lazySet(Double.doubleToRawLongBits(d));
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) get();
    }

    public final void set(double d) {
        this.value.set(Double.doubleToRawLongBits(d));
    }

    public String toString() {
        return Double.toString(get());
    }

    public final boolean weakCompareAndSet(double d, double d2) {
        return this.value.weakCompareAndSet(Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d2));
    }

    public AtomicDouble() {
        this(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }
}
