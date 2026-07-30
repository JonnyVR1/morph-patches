package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p153l.o01;

/* JADX INFO: loaded from: classes.dex */
public class RecyclableBufferedInputStream extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    private volatile byte[] f4610a;

    /* JADX INFO: renamed from: b */
    private int f4611b;

    /* JADX INFO: renamed from: c */
    private int f4612c;

    /* JADX INFO: renamed from: d */
    private int f4613d;

    /* JADX INFO: renamed from: e */
    private int f4614e;

    /* JADX INFO: renamed from: f */
    private final o01 f4615f;

    public static class InvalidMarkException extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        public InvalidMarkException(String str) {
            super(str);
        }
    }

    @VisibleForTesting
    public RecyclableBufferedInputStream(@NonNull InputStream inputStream, @NonNull o01 o01Var, int i) {
        super(inputStream);
        this.f4613d = -1;
        this.f4615f = o01Var;
        this.f4610a = (byte[]) o01Var.mo165411c(i, byte[].class);
    }

    /* JADX INFO: renamed from: b */
    private int m5544b(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f4613d;
        if (i != -1) {
            int i2 = this.f4614e - i;
            int i3 = this.f4612c;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f4611b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f4615f.mo165411c(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f4610a = bArr2;
                    this.f4615f.put(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f4614e - this.f4613d;
                this.f4614e = i4;
                this.f4613d = 0;
                this.f4611b = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.f4614e;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f4611b = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.f4613d = -1;
            this.f4614e = 0;
            this.f4611b = i7;
        }
        return i7;
    }

    /* JADX INFO: renamed from: m */
    private static IOException m5545m() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f4610a == null || inputStream == null) {
            throw m5545m();
        }
        return (this.f4611b - this.f4614e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f4610a != null) {
            this.f4615f.put(this.f4610a);
            this.f4610a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m5546k() {
        this.f4612c = this.f4610a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        this.f4612c = Math.max(this.f4612c, i);
        this.f4613d = this.f4614e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.f4610a;
        if (bArr2 == null) {
            throw m5545m();
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw m5545m();
        }
        int i5 = this.f4614e;
        int i6 = this.f4611b;
        if (i5 < i6) {
            int i7 = i6 - i5 >= i2 ? i2 : i6 - i5;
            System.arraycopy(bArr2, i5, bArr, i, i7);
            this.f4614e += i7;
            if (i7 == i2 || inputStream.available() == 0) {
                return i7;
            }
            i += i7;
            i3 = i2 - i7;
        } else {
            i3 = i2;
        }
        while (true) {
            if (this.f4613d == -1 && i3 >= bArr2.length) {
                i4 = inputStream.read(bArr, i, i3);
                if (i4 == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
            } else {
                if (m5544b(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
                if (bArr2 != this.f4610a && (bArr2 = this.f4610a) == null) {
                    throw m5545m();
                }
                int i8 = this.f4611b;
                int i9 = this.f4614e;
                i4 = i8 - i9 >= i3 ? i3 : i8 - i9;
                System.arraycopy(bArr2, i9, bArr, i, i4);
                this.f4614e += i4;
            }
            i3 -= i4;
            if (i3 == 0) {
                return i2;
            }
            if (inputStream.available() == 0) {
                return i2 - i3;
            }
            i += i4;
        }
    }

    public synchronized void release() {
        if (this.f4610a != null) {
            this.f4615f.put(this.f4610a);
            this.f4610a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f4610a == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f4613d;
        if (-1 == i) {
            throw new InvalidMarkException("Mark has been invalidated, pos: " + this.f4614e + " markLimit: " + this.f4612c);
        }
        this.f4614e = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f4610a;
        if (bArr == null) {
            throw m5545m();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw m5545m();
        }
        int i = this.f4611b;
        int i2 = this.f4614e;
        if (i - i2 >= j) {
            this.f4614e = (int) (((long) i2) + j);
            return j;
        }
        long j2 = ((long) i) - ((long) i2);
        this.f4614e = i;
        if (this.f4613d == -1 || j > this.f4612c) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.f4613d = -1;
            }
            return j2 + jSkip;
        }
        if (m5544b(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.f4611b;
        int i4 = this.f4614e;
        if (i3 - i4 >= j - j2) {
            this.f4614e = (int) ((((long) i4) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i3)) - ((long) i4);
        this.f4614e = i3;
        return j3;
    }

    public RecyclableBufferedInputStream(@NonNull InputStream inputStream, @NonNull o01 o01Var) {
        this(inputStream, o01Var, 65536);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f4610a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f4614e >= this.f4611b && m5544b(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.f4610a && (bArr = this.f4610a) == null) {
                throw m5545m();
            }
            int i = this.f4611b;
            int i2 = this.f4614e;
            if (i - i2 <= 0) {
                return -1;
            }
            this.f4614e = i2 + 1;
            return bArr[i2] & 255;
        }
        throw m5545m();
    }
}
