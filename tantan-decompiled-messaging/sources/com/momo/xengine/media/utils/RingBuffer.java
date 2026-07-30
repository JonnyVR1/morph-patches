package com.momo.xengine.media.utils;

import com.clevertap.android.sdk.Constants;
import java.io.PrintStream;
import java.util.Arrays;
import p149l.dqi0;

/* JADX INFO: loaded from: classes8.dex */
public class RingBuffer {
    private byte[] array;
    private int readPos;
    private int writePos;

    public RingBuffer(int i) {
        this.array = new byte[i];
    }

    public static void main(String[] strArr) {
        RingBuffer ringBuffer = new RingBuffer(8);
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
        ringBuffer.write(bArr);
        System.out.println("write data : " + Arrays.toString(bArr));
        System.out.println("dump : " + ringBuffer.dump());
        for (int i = 0; i < 100; i++) {
            int i2 = ringBuffer.readable();
            System.out.println("i = " + i + ",readable = " + ringBuffer.readable());
            if (i % 3 == 0) {
                byte[] bArr2 = new byte[i2];
                ringBuffer.read(bArr2);
                System.out.println("i = " + i + ",readBuff = " + Arrays.toString(bArr2));
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder("dump : ");
                sb.append(ringBuffer.dump());
                printStream.println(sb.toString());
            } else {
                byte[] bArr3 = (byte[]) bArr.clone();
                if (i % 2 == 0) {
                    bArr3 = (byte[]) ((byte[]) bArr.clone()).clone();
                }
                System.out.println("i = " + i + ",write data : " + Arrays.toString(bArr3));
                ringBuffer.write(bArr3);
                System.out.println("dump : " + ringBuffer.dump());
            }
        }
    }

    private int reCapacity(int i) {
        byte[] bArr = this.array;
        if (i <= bArr.length) {
            return bArr.length;
        }
        int length = bArr.length;
        while (length < i) {
            length *= 2;
        }
        byte[] bArr2 = new byte[length];
        int i2 = this.readPos;
        int i3 = this.writePos;
        if (i2 == i3) {
            this.readPos = 0;
            this.writePos = 0;
            this.array = bArr2;
        } else if (i2 < i3) {
            int i4 = readable();
            System.arraycopy(this.array, this.readPos, bArr2, 0, i4);
            this.readPos = 0;
            this.writePos = i4;
            this.array = bArr2;
        } else {
            byte[] bArr3 = this.array;
            int length2 = bArr3.length - i2;
            System.arraycopy(bArr3, i2, bArr2, 0, length2);
            System.arraycopy(this.array, 0, bArr2, length2, this.writePos);
            this.writePos = length2 + this.writePos;
            this.readPos = 0;
            this.array = bArr2;
        }
        return this.array.length;
    }

    public void clear() {
        this.writePos = 0;
        this.readPos = 0;
    }

    public String dump() {
        return (((("array.length = " + this.array.length + Constants.SEPARATOR_COMMA) + "readPos = " + this.readPos + Constants.SEPARATOR_COMMA) + "writePos = " + this.writePos + Constants.SEPARATOR_COMMA) + "readable = " + readable() + Constants.SEPARATOR_COMMA) + "remaining = " + remaining();
    }

    public int peek(byte[] bArr) {
        return peek(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2, boolean z) {
        if (bArr != null && bArr.length != 0 && i2 != 0) {
            if (i >= 0 && i2 >= 0 && i < bArr.length) {
                int iMin = Math.min(bArr.length - i, Math.min(readable(), i2));
                if (iMin > 0) {
                    int i3 = this.readPos;
                    int i4 = this.writePos;
                    byte[] bArr2 = this.array;
                    if (i3 <= i4) {
                        System.arraycopy(bArr2, i3, bArr, i, iMin);
                        if (!z) {
                            this.readPos += iMin;
                            return iMin;
                        }
                    } else {
                        int iMin2 = Math.min(bArr2.length - i3, iMin);
                        System.arraycopy(this.array, this.readPos, bArr, i, iMin2);
                        if (!z) {
                            this.readPos += iMin2;
                        }
                        if (iMin2 < iMin) {
                            int i5 = i + iMin2;
                            int i6 = iMin - iMin2;
                            System.arraycopy(this.array, 0, bArr, i5, i6);
                            if (!z) {
                                this.readPos = i6;
                            }
                        }
                    }
                }
                return iMin;
            }
            dqi0.m113073a("params error , offset = %s,length = %s,buff.length = %s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length)});
        }
        return 0;
    }

    public int readable() {
        return this.array.length - remaining();
    }

    public int remaining() {
        int i = this.readPos;
        int i2 = this.writePos;
        return i <= i2 ? this.array.length - (i2 - i) : i - i2;
    }

    public int write(byte[] bArr, int i, int i2) {
        if (bArr != null && bArr.length != 0 && i2 != 0) {
            if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
                int iRemaining = remaining();
                if (i2 > iRemaining) {
                    reCapacity(this.array.length + (i2 - iRemaining));
                }
                int i3 = this.readPos;
                int i4 = this.writePos;
                byte[] bArr2 = this.array;
                if (i3 > i4) {
                    System.arraycopy(bArr, i, bArr2, i4, i2);
                    this.writePos += i2;
                    return i2;
                }
                int iMin = Math.min(bArr2.length - i4, i2);
                System.arraycopy(bArr, i, this.array, this.writePos, iMin);
                this.writePos += iMin;
                if (i2 > iMin) {
                    int i5 = i2 - iMin;
                    System.arraycopy(bArr, i + iMin, this.array, 0, i5);
                    this.writePos = i5;
                }
                return i2;
            }
            dqi0.m113073a("params error , offset = %s,length = %s,data.length = %s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length)});
        }
        return 0;
    }

    public int peek(byte[] bArr, int i, int i2) {
        return read(bArr, i, i2, true);
    }

    public int write(byte[] bArr) {
        return write(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length, false);
    }
}
