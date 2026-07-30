package org.apache.commons.sudcompress.archivers.zip;

import java.io.Serializable;
import p153l.iig0;
import p153l.xtg0;

/* JADX INFO: loaded from: classes2.dex */
public final class ZipShort implements Cloneable, Serializable {
    public static final ZipShort ZERO = new ZipShort(0);
    private static final long serialVersionUID = 1;
    private final int value;

    public ZipShort(byte[] bArr, int i) {
        this.value = getValue(bArr, i);
    }

    public static int getValue(byte[] bArr, int i) {
        long j = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            j |= (((long) bArr[i + i2]) & 255) << (i2 * 8);
        }
        return (int) j;
    }

    public static void putShort(int i, byte[] bArr, int i2) {
        xtg0.m213080b(bArr, i, i2, 2);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            iig0.m140070a(e);
            return null;
        }
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof ZipShort) && this.value == ((ZipShort) obj).getValue();
    }

    public byte[] getBytes() {
        byte[] bArr = new byte[2];
        xtg0.m213080b(bArr, this.value, 0, 2);
        return bArr;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return "ZipShort value: " + this.value;
    }

    public ZipShort(byte[] bArr) {
        this(bArr, 0);
    }

    public ZipShort(int i) {
        this.value = i;
    }

    public static byte[] getBytes(int i) {
        byte[] bArr = new byte[2];
        putShort(i, bArr, 0);
        return bArr;
    }

    public int getValue() {
        return this.value;
    }

    public static int getValue(byte[] bArr) {
        return getValue(bArr, 0);
    }
}
