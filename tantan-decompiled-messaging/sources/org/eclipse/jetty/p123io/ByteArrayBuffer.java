package org.eclipse.jetty.p123io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import org.eclipse.jetty.util.StringUtil;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class ByteArrayBuffer extends AbstractBuffer {
    protected final byte[] _bytes;

    public ByteArrayBuffer(String str, boolean z) {
        super(2, false);
        byte[] bytes = StringUtil.getBytes(str);
        this._bytes = bytes;
        setGetIndex(0);
        setPutIndex(bytes.length);
        if (z) {
            this._access = 0;
            this._string = str;
        }
    }

    @Override // org.eclipse.jetty.p123io.Buffer
    public byte[] array() {
        return this._bytes;
    }

    @Override // org.eclipse.jetty.p123io.Buffer
    public int capacity() {
        return this._bytes.length;
    }

    @Override // org.eclipse.jetty.p123io.AbstractBuffer, org.eclipse.jetty.p123io.Buffer
    public void compact() {
        if (isReadOnly()) {
            qkq0.m175383a("READONLY");
            return;
        }
        int iMarkIndex = markIndex() >= 0 ? markIndex() : getIndex();
        if (iMarkIndex > 0) {
            int iPutIndex = putIndex() - iMarkIndex;
            if (iPutIndex > 0) {
                byte[] bArr = this._bytes;
                System.arraycopy(bArr, iMarkIndex, bArr, 0, iPutIndex);
            }
            if (markIndex() > 0) {
                setMarkIndex(markIndex() - iMarkIndex);
            }
            setGetIndex(getIndex() - iMarkIndex);
            setPutIndex(putIndex() - iMarkIndex);
        }
    }

    @Override // org.eclipse.jetty.p123io.AbstractBuffer
    public boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof Buffer)) {
            return false;
        }
        if (obj instanceof Buffer.CaseInsensitve) {
            return equalsIgnoreCase((Buffer) obj);
        }
        Buffer buffer = (Buffer) obj;
        if (buffer.length() != length()) {
            return false;
        }
        int i2 = this._hash;
        if (i2 != 0 && (obj instanceof AbstractBuffer) && (i = ((AbstractBuffer) obj)._hash) != 0 && i2 != i) {
            return false;
        }
        int index = getIndex();
        int iPutIndex = buffer.putIndex();
        int iPutIndex2 = putIndex();
        while (true) {
            int i3 = iPutIndex2 - 1;
            if (iPutIndex2 <= index) {
                return true;
            }
            iPutIndex--;
            if (this._bytes[i3] != buffer.peek(iPutIndex)) {
                return false;
            }
            iPutIndex2 = i3;
        }
    }

    @Override // org.eclipse.jetty.p123io.AbstractBuffer, org.eclipse.jetty.p123io.Buffer
    public boolean equalsIgnoreCase(Buffer buffer) {
        int i;
        if (buffer == this) {
            return true;
        }
        if (buffer == null || buffer.length() != length()) {
            return false;
        }
        int i2 = this._hash;
        if (i2 != 0 && (buffer instanceof AbstractBuffer) && (i = ((AbstractBuffer) buffer)._hash) != 0 && i2 != i) {
            return false;
        }
        int index = getIndex();
        int iPutIndex = buffer.putIndex();
        byte[] bArrArray = buffer.array();
        if (bArrArray != null) {
            int iPutIndex2 = putIndex();
            while (true) {
                int i3 = iPutIndex2 - 1;
                if (iPutIndex2 <= index) {
                    break;
                }
                byte b = this._bytes[i3];
                iPutIndex--;
                byte b2 = bArrArray[iPutIndex];
                if (b != b2) {
                    if (97 <= b && b <= 122) {
                        b = (byte) (b - 32);
                    }
                    if (97 <= b2 && b2 <= 122) {
                        b2 = (byte) (b2 - 32);
                    }
                    if (b != b2) {
                        return false;
                    }
                }
                iPutIndex2 = i3;
            }
        } else {
            int iPutIndex3 = putIndex();
            while (true) {
                int i4 = iPutIndex3 - 1;
                if (iPutIndex3 <= index) {
                    break;
                }
                byte b3 = this._bytes[i4];
                iPutIndex--;
                byte bPeek = buffer.peek(iPutIndex);
                if (b3 != bPeek) {
                    if (97 <= b3 && b3 <= 122) {
                        b3 = (byte) (b3 - 32);
                    }
                    if (97 <= bPeek && bPeek <= 122) {
                        bPeek = (byte) (bPeek - 32);
                    }
                    if (b3 != bPeek) {
                        return false;
                    }
                }
                iPutIndex3 = i4;
            }
        }
        return true;
    }

    @Override // org.eclipse.jetty.p123io.AbstractBuffer, org.eclipse.jetty.p123io.Buffer
    public byte get() {
        byte[] bArr = this._bytes;
        int i = this._get;
        this._get = i + 1;
        return bArr[i];
    }

    @Override // org.eclipse.jetty.p123io.AbstractBuffer
    public int hashCode() {
        if (this._hash == 0 || this._hashGet != this._get || this._hashPut != this._put) {
            int index = getIndex();
            int iPutIndex = putIndex();
            while (true) {
                int i = iPutIndex - 1;
                if (iPutIndex <= index) {
                    break;
                }
                byte b = this._bytes[i];
                if (97 <= b && b <= 122) {
                    b = (byte) (b - 32);
                }
                this._hash = (this._hash * 31) + b;
                iPutIndex = i;
            }
            if (this._hash == 0) {
                this._hash = -1;
            }
            this._hashGet = this._get;
            this._hashPut = this._put;
        }
        return this._hash;
    }

    @Override // org.eclipse.jetty.p123io.Buffer
    public int peek(int i, byte[] bArr, int i2, int i3) {
        if ((i + i3 > capacity() && (i3 = capacity() - i) == 0) || i3 < 0) {
            return -1;
        }
        System.arraycopy(this._bytes, i, bArr, i2, i3);
        return i3;
    }

    @Override // org.eclipse.jetty.p123io.AbstractBuffer, org.eclipse.jetty.p123io.Buffer
    public int poke(int i, Buffer buffer) {
        int i2 = 0;
        this._hash = 0;
        int length = buffer.length();
        if (i + length > capacity()) {
            length = capacity() - i;
        }
        byte[] bArrArray = buffer.array();
        if (bArrArray != null) {
            System.arraycopy(bArrArray, buffer.getIndex(), this._bytes, i, length);
            return length;
        }
        int index = buffer.getIndex();
        while (i2 < length) {
            this._bytes[i] = buffer.peek(index);
            i2++;
            i++;
            index++;
        }
        return length;
    }

    @Override // org.eclipse.jetty.p123io.AbstractBuffer, org.eclipse.jetty.p123io.Buffer
    public int readFrom(InputStream inputStream, int i) throws IOException {
        if (i < 0 || i > space()) {
            i = space();
        }
        int iPutIndex = putIndex();
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (i2 < i) {
            i4 = inputStream.read(this._bytes, iPutIndex, i3);
            if (i4 < 0) {
                break;
            }
            if (i4 > 0) {
                iPutIndex += i4;
                i2 += i4;
                i3 -= i4;
                setPutIndex(iPutIndex);
            }
            if (inputStream.available() <= 0) {
                break;
            }
        }
        if (i4 >= 0 || i2 != 0) {
            return i2;
        }
        return -1;
    }

    @Override // org.eclipse.jetty.p123io.AbstractBuffer, org.eclipse.jetty.p123io.Buffer
    public int space() {
        return this._bytes.length - this._put;
    }

    @Override // org.eclipse.jetty.p123io.AbstractBuffer, org.eclipse.jetty.p123io.Buffer
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this._bytes, getIndex(), length());
        if (isImmutable()) {
            return;
        }
        clear();
    }

    public static class CaseInsensitive extends ByteArrayBuffer implements Buffer.CaseInsensitve {
        public CaseInsensitive(String str) {
            super(str);
        }

        @Override // org.eclipse.jetty.p123io.ByteArrayBuffer, org.eclipse.jetty.p123io.AbstractBuffer
        public boolean equals(Object obj) {
            return (obj instanceof Buffer) && equalsIgnoreCase((Buffer) obj);
        }

        public CaseInsensitive(byte[] bArr, int i, int i2, int i3) {
            super(bArr, i, i2, i3);
        }
    }

    public ByteArrayBuffer(byte[] bArr) {
        this(bArr, 0, bArr.length, 2);
    }

    public ByteArrayBuffer(byte[] bArr, int i, int i2) {
        this(bArr, i, i2, 2);
    }

    @Override // org.eclipse.jetty.p123io.Buffer
    public byte peek(int i) {
        return this._bytes[i];
    }

    public ByteArrayBuffer(byte[] bArr, int i, int i2, int i3) {
        super(2, false);
        this._bytes = bArr;
        setPutIndex(i2 + i);
        setGetIndex(i);
        this._access = i3;
    }

    public ByteArrayBuffer(byte[] bArr, int i, int i2, int i3, boolean z) {
        super(2, z);
        this._bytes = bArr;
        setPutIndex(i2 + i);
        setGetIndex(i);
        this._access = i3;
    }

    public ByteArrayBuffer(int i) {
        this(new byte[i], 0, 0, 2);
        setPutIndex(0);
    }

    public ByteArrayBuffer(String str) {
        super(2, false);
        byte[] bytes = StringUtil.getBytes(str);
        this._bytes = bytes;
        setGetIndex(0);
        setPutIndex(bytes.length);
        this._access = 0;
        this._string = str;
    }

    public ByteArrayBuffer(int i, int i2, boolean z) {
        this(new byte[i], 0, 0, i2, z);
    }

    public ByteArrayBuffer(String str, String str2) throws UnsupportedEncodingException {
        super(2, false);
        byte[] bytes = str.getBytes(str2);
        this._bytes = bytes;
        setGetIndex(0);
        setPutIndex(bytes.length);
        this._access = 0;
        this._string = str;
    }

    @Override // org.eclipse.jetty.p123io.Buffer
    public void poke(int i, byte b) {
        this._bytes[i] = b;
    }

    @Override // org.eclipse.jetty.p123io.AbstractBuffer, org.eclipse.jetty.p123io.Buffer
    public int poke(int i, byte[] bArr, int i2, int i3) {
        this._hash = 0;
        if (i + i3 > capacity()) {
            i3 = capacity() - i;
        }
        System.arraycopy(bArr, i2, this._bytes, i, i3);
        return i3;
    }
}
