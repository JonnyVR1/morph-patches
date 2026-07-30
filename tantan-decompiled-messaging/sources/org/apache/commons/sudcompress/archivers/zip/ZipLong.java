package org.apache.commons.sudcompress.archivers.zip;

import java.io.Serializable;
import p149l.aag0;
import p149l.plg0;

/* JADX INFO: loaded from: classes2.dex */
public final class ZipLong implements Cloneable, Serializable {
    private static final long serialVersionUID = 1;
    private final long value;
    public static final ZipLong CFH_SIG = new ZipLong(33639248L);
    public static final ZipLong LFH_SIG = new ZipLong(67324752L);
    public static final ZipLong DD_SIG = new ZipLong(134695760L);
    static final ZipLong ZIP64_MAGIC = new ZipLong(4294967295L);
    public static final ZipLong SINGLE_SEGMENT_SPLIT_MARKER = new ZipLong(808471376L);
    public static final ZipLong AED_SIG = new ZipLong(134630224L);

    public ZipLong(byte[] bArr, int i) {
        this.value = getValue(bArr, i);
    }

    public static byte[] getBytes(long j) {
        byte[] bArr = new byte[4];
        putLong(j, bArr, 0);
        return bArr;
    }

    public static long getValue(byte[] bArr, int i) {
        long j = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            j |= (((long) bArr[i + i2]) & 255) << (i2 * 8);
        }
        return j;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            aag0.m95543a(e);
            return null;
        }
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof ZipLong) && this.value == ((ZipLong) obj).getValue();
    }

    public int getIntValue() {
        return (int) this.value;
    }

    public int hashCode() {
        return (int) this.value;
    }

    public void putLong(byte[] bArr, int i) {
        putLong(this.value, bArr, i);
    }

    public String toString() {
        return "ZipLong value: " + this.value;
    }

    public static void putLong(long j, byte[] bArr, int i) {
        plg0.m170182b(bArr, j, i, 4);
    }

    public byte[] getBytes() {
        return getBytes(this.value);
    }

    public ZipLong(int i) {
        this.value = i;
    }

    public ZipLong(byte[] bArr) {
        this(bArr, 0);
    }

    public ZipLong(long j) {
        this.value = j;
    }

    public long getValue() {
        return this.value;
    }

    public static long getValue(byte[] bArr) {
        return getValue(bArr, 0);
    }
}
