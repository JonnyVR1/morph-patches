package com.tencent.rtmp.sharp.jni;

/* JADX INFO: loaded from: classes2.dex */
public class RingBuffer {
    private final int DEFAULT_SIZE;
    public int c_totalSize;
    public boolean m_isEmpty;
    public byte[] m_pBuf;
    public int m_read;
    public int m_write;

    public RingBuffer() {
        this.DEFAULT_SIZE = 1000;
        this.c_totalSize = 1000;
        this.m_isEmpty = true;
        this.m_read = 0;
        this.m_write = 0;
        this.m_pBuf = new byte[1000];
    }

    public void Clear() {
        this.m_write = 0;
        this.m_read = 0;
        this.m_isEmpty = true;
    }

    public boolean Pop(byte[] bArr, int i) {
        if (this.m_pBuf == null || RemainRead() < i || i <= 0) {
            return false;
        }
        int i2 = this.c_totalSize;
        int i3 = this.m_read;
        int i4 = i2 - i3;
        byte[] bArr2 = this.m_pBuf;
        if (i4 >= i) {
            System.arraycopy(bArr2, i3, bArr, 0, i);
        } else {
            System.arraycopy(bArr2, i3, bArr, 0, i2 - i3);
            byte[] bArr3 = this.m_pBuf;
            int i5 = this.c_totalSize;
            int i6 = this.m_read;
            System.arraycopy(bArr3, 0, bArr, i5 - i6, i - (i5 - i6));
        }
        int i7 = (this.m_read + i) % this.c_totalSize;
        this.m_read = i7;
        this.m_isEmpty = i7 == this.m_write;
        return true;
    }

    public void Push(byte[] bArr, int i) {
        if (this.m_pBuf != null && RemainWrite() >= i) {
            int i2 = this.c_totalSize;
            int i3 = this.m_write;
            int i4 = i2 - i3;
            byte[] bArr2 = this.m_pBuf;
            if (i4 >= i) {
                System.arraycopy(bArr, 0, bArr2, i3, i);
            } else {
                System.arraycopy(bArr, 0, bArr2, i3, i2 - i3);
                int i5 = this.c_totalSize;
                int i6 = this.m_write;
                System.arraycopy(bArr, i5 - i6, this.m_pBuf, 0, i - (i5 - i6));
            }
            this.m_write = (this.m_write + i) % this.c_totalSize;
            this.m_isEmpty = false;
        }
    }

    public int RemainRead() {
        int i = this.m_write;
        int i2 = this.m_read;
        if (i < i2) {
            return (this.c_totalSize - i2) + i;
        }
        if (i > i2) {
            return i - i2;
        }
        if (this.m_isEmpty) {
            return 0;
        }
        return this.c_totalSize;
    }

    public int RemainWrite() {
        return this.c_totalSize - RemainRead();
    }

    public RingBuffer(int i) {
        this.DEFAULT_SIZE = 1000;
        this.c_totalSize = i;
        this.m_isEmpty = true;
        this.m_read = 0;
        this.m_write = 0;
        this.m_pBuf = new byte[i];
    }
}
