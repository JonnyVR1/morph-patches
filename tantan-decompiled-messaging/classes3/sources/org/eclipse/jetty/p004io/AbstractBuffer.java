package org.eclipse.jetty.p004io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import l.ig3;
import l.qkq0;
import org.eclipse.jetty.util.TypeUtil;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class AbstractBuffer implements Buffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected static final String __IMMUTABLE = "IMMUTABLE";
    protected static final String __READONLY = "READONLY";
    protected static final String __READWRITE = "READWRITE";
    protected static final String __VOLATILE = "VOLATILE";
    protected int _access;
    protected int _get;
    protected int _hash;
    protected int _hashGet;
    protected int _hashPut;
    protected int _mark;
    protected int _put;
    protected String _string;
    protected View _view;
    protected boolean _volatile;
    private static final Logger LOG = Log.getLogger((Class<?>) AbstractBuffer.class);
    private static final boolean __boundsChecking = Boolean.getBoolean("org.eclipse.jetty.io.AbstractBuffer.boundsChecking");

    public AbstractBuffer(int i, boolean z) {
        if (i == 0 && z) {
            ig3.a("IMMUTABLE && VOLATILE");
            throw null;
        }
        setMarkIndex(-1);
        this._access = i;
        this._volatile = z;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public byte[] asArray() {
        int length = length();
        byte[] bArr = new byte[length];
        byte[] bArrArray = array();
        if (bArrArray != null) {
            System.arraycopy(bArrArray, getIndex(), bArr, 0, length);
            return bArr;
        }
        peek(getIndex(), bArr, 0, length());
        return bArr;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public Buffer asImmutableBuffer() {
        return isImmutable() ? this : duplicate(0);
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public Buffer asMutableBuffer() {
        if (!isImmutable()) {
            return this;
        }
        Buffer buffer = buffer();
        return buffer.isReadOnly() ? duplicate(2) : new View(buffer, markIndex(), getIndex(), putIndex(), this._access);
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public Buffer asNonVolatileBuffer() {
        return !isVolatile() ? this : duplicate(this._access);
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public Buffer asReadOnlyBuffer() {
        return isReadOnly() ? this : new View(this, markIndex(), getIndex(), putIndex(), 1);
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public Buffer buffer() {
        return this;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public void clear() {
        setMarkIndex(-1);
        setGetIndex(0);
        setPutIndex(0);
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public void compact() {
        if (isReadOnly()) {
            qkq0.a(__READONLY);
            return;
        }
        int iMarkIndex = markIndex() >= 0 ? markIndex() : getIndex();
        if (iMarkIndex > 0) {
            byte[] bArrArray = array();
            int iPutIndex = putIndex() - iMarkIndex;
            if (iPutIndex > 0) {
                if (bArrArray != null) {
                    System.arraycopy(array(), iMarkIndex, array(), 0, iPutIndex);
                } else {
                    poke(0, peek(iMarkIndex, iPutIndex));
                }
            }
            if (markIndex() > 0) {
                setMarkIndex(markIndex() - iMarkIndex);
            }
            setGetIndex(getIndex() - iMarkIndex);
            setPutIndex(putIndex() - iMarkIndex);
        }
    }

    public ByteArrayBuffer duplicate(int i) {
        return ((this instanceof Buffer.CaseInsensitve) || (buffer() instanceof Buffer.CaseInsensitve)) ? new ByteArrayBuffer.CaseInsensitive(asArray(), 0, length(), i) : new ByteArrayBuffer(asArray(), 0, length(), i);
    }

    public boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof Buffer)) {
            return false;
        }
        Buffer buffer = (Buffer) obj;
        if ((this instanceof Buffer.CaseInsensitve) || (buffer instanceof Buffer.CaseInsensitve)) {
            return equalsIgnoreCase(buffer);
        }
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
            if (peek(i3) != buffer.peek(iPutIndex)) {
                return false;
            }
            iPutIndex2 = i3;
        }
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public boolean equalsIgnoreCase(Buffer buffer) {
        int i;
        if (buffer == this) {
            return true;
        }
        if (buffer.length() != length()) {
            return false;
        }
        int i2 = this._hash;
        if (i2 != 0 && (buffer instanceof AbstractBuffer) && (i = ((AbstractBuffer) buffer)._hash) != 0 && i2 != i) {
            return false;
        }
        int index = getIndex();
        int iPutIndex = buffer.putIndex();
        byte[] bArrArray = array();
        byte[] bArrArray2 = buffer.array();
        if (bArrArray != null && bArrArray2 != null) {
            int iPutIndex2 = putIndex();
            while (true) {
                int i3 = iPutIndex2 - 1;
                if (iPutIndex2 <= index) {
                    break;
                }
                byte b = bArrArray[i3];
                iPutIndex--;
                byte b2 = bArrArray2[iPutIndex];
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
                byte bPeek = peek(i4);
                iPutIndex--;
                byte bPeek2 = buffer.peek(iPutIndex);
                if (bPeek != bPeek2) {
                    if (97 <= bPeek && bPeek <= 122) {
                        bPeek = (byte) (bPeek - 32);
                    }
                    if (97 <= bPeek2 && bPeek2 <= 122) {
                        bPeek2 = (byte) (bPeek2 - 32);
                    }
                    if (bPeek != bPeek2) {
                        return false;
                    }
                }
                iPutIndex3 = i4;
            }
        }
        return true;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public int get(byte[] bArr, int i, int i2) {
        int index = getIndex();
        int length = length();
        if (length == 0) {
            return -1;
        }
        if (i2 > length) {
            i2 = length;
        }
        int iPeek = peek(index, bArr, i, i2);
        if (iPeek > 0) {
            setGetIndex(index + iPeek);
        }
        return iPeek;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public final int getIndex() {
        return this._get;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public boolean hasContent() {
        return this._put > this._get;
    }

    public int hashCode() {
        if (this._hash == 0 || this._hashGet != this._get || this._hashPut != this._put) {
            int index = getIndex();
            byte[] bArrArray = array();
            if (bArrArray != null) {
                int iPutIndex = putIndex();
                while (true) {
                    int i = iPutIndex - 1;
                    if (iPutIndex <= index) {
                        break;
                    }
                    byte b = bArrArray[i];
                    if (97 <= b && b <= 122) {
                        b = (byte) (b - 32);
                    }
                    this._hash = (this._hash * 31) + b;
                    iPutIndex = i;
                }
            } else {
                int iPutIndex2 = putIndex();
                while (true) {
                    int i2 = iPutIndex2 - 1;
                    if (iPutIndex2 <= index) {
                        break;
                    }
                    byte bPeek = peek(i2);
                    if (97 <= bPeek && bPeek <= 122) {
                        bPeek = (byte) (bPeek - 32);
                    }
                    this._hash = (this._hash * 31) + bPeek;
                    iPutIndex2 = i2;
                }
            }
            if (this._hash == 0) {
                this._hash = -1;
            }
            this._hashGet = this._get;
            this._hashPut = this._put;
        }
        return this._hash;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public boolean isImmutable() {
        return this._access <= 0;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public boolean isReadOnly() {
        return this._access <= 1;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public boolean isVolatile() {
        return this._volatile;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public int length() {
        return this._put - this._get;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public void mark() {
        setMarkIndex(this._get - 1);
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public int markIndex() {
        return this._mark;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public Buffer peek(int i, int i2) {
        AbstractBuffer abstractBuffer;
        View view = this._view;
        if (view == null) {
            abstractBuffer = this;
            abstractBuffer._view = new View(abstractBuffer, -1, i, i + i2, isReadOnly() ? 1 : 2);
        } else {
            abstractBuffer = this;
            view.update(abstractBuffer.buffer());
            abstractBuffer._view.setMarkIndex(-1);
            abstractBuffer._view.setGetIndex(0);
            abstractBuffer._view.setPutIndex(i + i2);
            abstractBuffer._view.setGetIndex(i);
        }
        return abstractBuffer._view;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public int poke(int i, Buffer buffer) {
        int i2 = 0;
        this._hash = 0;
        int length = buffer.length();
        if (i + length > capacity()) {
            length = capacity() - i;
        }
        byte[] bArrArray = buffer.array();
        byte[] bArrArray2 = array();
        if (bArrArray != null && bArrArray2 != null) {
            System.arraycopy(bArrArray, buffer.getIndex(), bArrArray2, i, length);
            return length;
        }
        if (bArrArray != null) {
            int index = buffer.getIndex();
            while (i2 < length) {
                poke(i, bArrArray[index]);
                i2++;
                i++;
                index++;
            }
        } else if (bArrArray2 != null) {
            int index2 = buffer.getIndex();
            while (i2 < length) {
                bArrArray2[i] = buffer.peek(index2);
                i2++;
                i++;
                index2++;
            }
        } else {
            int index3 = buffer.getIndex();
            while (i2 < length) {
                poke(i, buffer.peek(index3));
                i2++;
                i++;
                index3++;
            }
        }
        return length;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public int put(byte[] bArr) {
        int iPutIndex = putIndex();
        int iPoke = poke(iPutIndex, bArr, 0, bArr.length);
        setPutIndex(iPutIndex + iPoke);
        return iPoke;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public final int putIndex() {
        return this._put;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public int readFrom(InputStream inputStream, int i) throws IOException {
        byte[] bArrArray = array();
        int iSpace = space();
        if (iSpace <= i) {
            i = iSpace;
        }
        if (bArrArray != null) {
            int i2 = inputStream.read(bArrArray, this._put, i);
            if (i2 > 0) {
                this._put += i2;
            }
            return i2;
        }
        int i3 = i <= 1024 ? i : 1024;
        byte[] bArr = new byte[i3];
        while (i > 0) {
            int i4 = inputStream.read(bArr, 0, i3);
            if (i4 < 0) {
                return -1;
            }
            put(bArr, 0, i4);
            i -= i4;
        }
        return 0;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public void reset() {
        if (markIndex() >= 0) {
            setGetIndex(markIndex());
        }
    }

    public void rewind() {
        setGetIndex(0);
        setMarkIndex(-1);
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public void setGetIndex(int i) {
        this._get = i;
        this._hash = 0;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public void setMarkIndex(int i) {
        this._mark = i;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public void setPutIndex(int i) {
        this._put = i;
        this._hash = 0;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public int skip(int i) {
        if (length() < i) {
            i = length();
        }
        setGetIndex(getIndex() + i);
        return i;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public Buffer slice() {
        return peek(getIndex(), length());
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public Buffer sliceFromMark(int i) {
        if (markIndex() < 0) {
            return null;
        }
        Buffer bufferPeek = peek(markIndex(), i);
        setMarkIndex(-1);
        return bufferPeek;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public int space() {
        return capacity() - this._put;
    }

    public String toDebugString() {
        return getClass() + "@" + super.hashCode();
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public String toDetailString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(super.hashCode());
        sb.append(",");
        sb.append(buffer().hashCode());
        sb.append(",m=");
        sb.append(markIndex());
        sb.append(",g=");
        sb.append(getIndex());
        sb.append(",p=");
        sb.append(putIndex());
        sb.append(",c=");
        sb.append(capacity());
        sb.append("]={");
        if (markIndex() >= 0) {
            for (int iMarkIndex = markIndex(); iMarkIndex < getIndex(); iMarkIndex++) {
                TypeUtil.toHex(peek(iMarkIndex), sb);
            }
            sb.append("}{");
        }
        int index = getIndex();
        int i = 0;
        while (index < putIndex()) {
            TypeUtil.toHex(peek(index), sb);
            int i2 = i + 1;
            if (i == 50 && putIndex() - index > 20) {
                sb.append(" ... ");
                index = putIndex() - 20;
            }
            index++;
            i = i2;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public String toString(String str) {
        try {
            byte[] bArrArray = array();
            return bArrArray != null ? new String(bArrArray, getIndex(), length(), str) : new String(asArray(), 0, length(), str);
        } catch (Exception e) {
            LOG.warn(e);
            return new String(asArray(), 0, length());
        }
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public void writeTo(OutputStream outputStream) throws IOException {
        byte[] bArrArray = array();
        if (bArrArray != null) {
            outputStream.write(bArrArray, getIndex(), length());
        } else {
            int length = length();
            int i = length <= 1024 ? length : 1024;
            byte[] bArr = new byte[i];
            int i2 = this._get;
            while (length > 0) {
                int iPeek = peek(i2, bArr, 0, length > i ? i : length);
                outputStream.write(bArr, 0, iPeek);
                i2 += iPeek;
                length -= iPeek;
            }
        }
        clear();
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public void mark(int i) {
        setMarkIndex(this._get + i);
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public void put(byte b) {
        int iPutIndex = putIndex();
        poke(iPutIndex, b);
        setPutIndex(iPutIndex + 1);
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public int put(byte[] bArr, int i, int i2) {
        int iPutIndex = putIndex();
        int iPoke = poke(iPutIndex, bArr, i, i2);
        setPutIndex(iPutIndex + iPoke);
        return iPoke;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public int put(Buffer buffer) {
        int iPutIndex = putIndex();
        int iPoke = poke(iPutIndex, buffer);
        setPutIndex(iPutIndex + iPoke);
        return iPoke;
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public Buffer sliceFromMark() {
        return sliceFromMark((getIndex() - markIndex()) - 1);
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public byte get() {
        int i = this._get;
        this._get = i + 1;
        return peek(i);
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public Buffer get(int i) {
        int index = getIndex();
        Buffer bufferPeek = peek(index, i);
        setGetIndex(index + i);
        return bufferPeek;
    }

    public String toString() {
        if (isImmutable()) {
            if (this._string == null) {
                this._string = new String(asArray(), 0, length());
            }
            return this._string;
        }
        return new String(asArray(), 0, length());
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public String toString(Charset charset) {
        try {
            byte[] bArrArray = array();
            if (bArrArray != null) {
                return new String(bArrArray, getIndex(), length(), charset);
            }
            return new String(asArray(), 0, length(), charset);
        } catch (Exception e) {
            LOG.warn(e);
            return new String(asArray(), 0, length());
        }
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public byte peek() {
        return peek(this._get);
    }

    @Override // org.eclipse.jetty.p004io.Buffer
    public int poke(int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        this._hash = 0;
        if (i + i3 > capacity()) {
            i3 = capacity() - i;
        }
        byte[] bArrArray = array();
        if (bArrArray != null) {
            System.arraycopy(bArr, i2, bArrArray, i, i3);
            return i3;
        }
        while (i4 < i3) {
            poke(i, bArr[i2]);
            i4++;
            i++;
            i2++;
        }
        return i3;
    }
}
