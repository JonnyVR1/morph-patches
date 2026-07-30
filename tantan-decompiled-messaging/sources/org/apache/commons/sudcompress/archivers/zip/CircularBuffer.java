package org.apache.commons.sudcompress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
class CircularBuffer {
    private final byte[] buffer;
    private int readIndex;
    private final int size;
    private int writeIndex;

    public CircularBuffer(int i) {
        this.size = i;
        this.buffer = new byte[i];
    }

    public boolean available() {
        return this.readIndex != this.writeIndex;
    }

    public void copy(int i, int i2) {
        int i3 = this.writeIndex - i;
        int i4 = i2 + i3;
        while (i3 < i4) {
            byte[] bArr = this.buffer;
            int i5 = this.writeIndex;
            int i6 = this.size;
            bArr[i5] = bArr[(i3 + i6) % i6];
            this.writeIndex = (i5 + 1) % i6;
            i3++;
        }
    }

    public int get() {
        if (!available()) {
            return -1;
        }
        byte[] bArr = this.buffer;
        int i = this.readIndex;
        byte b = bArr[i];
        this.readIndex = (i + 1) % this.size;
        return b & 255;
    }

    public void put(int i) {
        byte[] bArr = this.buffer;
        int i2 = this.writeIndex;
        bArr[i2] = (byte) i;
        this.writeIndex = (i2 + 1) % this.size;
    }
}
