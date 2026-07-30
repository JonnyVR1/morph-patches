package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import p153l.fr3;
import p153l.gzi0;
import p153l.ir3;
import p153l.mnd0;

/* JADX INFO: loaded from: classes7.dex */
final class NioByteString extends ByteString.LeafByteString {
    private final ByteBuffer buffer;

    public NioByteString(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            this.buffer = byteBuffer.slice().order(ByteOrder.nativeOrder());
        } else {
            mnd0.m159157a("buffer");
            throw null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private ByteBuffer slice(int i, int i2) {
        if (i < this.buffer.position() || i2 > this.buffer.limit() || i > i2) {
            gzi0.m133102a("Invalid indices [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        ByteBuffer byteBufferSlice = this.buffer.slice();
        byteBufferSlice.position(i - this.buffer.position());
        byteBufferSlice.limit(i2 - this.buffer.position());
        return byteBufferSlice;
    }

    private Object writeReplace() {
        return ByteString.copyFrom(this.buffer.slice());
    }

    @Override // com.google.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return this.buffer.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i) {
        try {
            return this.buffer.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.buffer.slice());
    }

    @Override // com.google.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer byteBufferSlice = this.buffer.slice();
        byteBufferSlice.position(i);
        byteBufferSlice.get(bArr, i2, i3);
    }

    @Override // com.google.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (size() != byteString.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof NioByteString) {
            return this.buffer.equals(((NioByteString) obj).buffer);
        }
        return obj instanceof RopeByteString ? obj.equals(this) : this.buffer.equals(byteString.asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.ByteString.LeafByteString
    public boolean equalsRange(ByteString byteString, int i, int i2) {
        return substring(0, i2).equals(byteString.substring(i, i2 + i));
    }

    @Override // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
        return Utf8.m17106p(this.buffer);
    }

    @Override // com.google.protobuf.ByteString
    public C3430e newCodedInput() {
        return C3430e.m17156g(this.buffer);
    }

    @Override // com.google.protobuf.ByteString
    public InputStream newInput() {
        return new C3410a();
    }

    @Override // com.google.protobuf.ByteString
    public int partialHash(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.buffer.get(i4);
        }
        return i;
    }

    @Override // com.google.protobuf.ByteString
    public int partialIsValidUtf8(int i, int i2, int i3) {
        return Utf8.m17108r(i, this.buffer, i2, i3 + i2);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.buffer.remaining();
    }

    @Override // com.google.protobuf.ByteString
    public ByteString substring(int i, int i2) {
        try {
            return new NioByteString(slice(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int iArrayOffset;
        if (this.buffer.hasArray()) {
            byteArray = this.buffer.array();
            iArrayOffset = this.buffer.arrayOffset() + this.buffer.position();
            length = this.buffer.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            iArrayOffset = 0;
        }
        return new String(byteArray, iArrayOffset, length, charset);
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(ir3 ir3Var) throws IOException {
        ir3Var.mo17042a(this.buffer.slice());
    }

    @Override // com.google.protobuf.ByteString
    public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        if (!this.buffer.hasArray()) {
            fr3.m126866e(slice(i, i2 + i), outputStream);
        } else {
            outputStream.write(this.buffer.array(), this.buffer.arrayOffset() + this.buffer.position() + i, i2);
        }
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    /* JADX INFO: renamed from: com.google.protobuf.NioByteString$a */
    public class C3410a extends InputStream {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f11586a;

        public C3410a() {
            this.f11586a = NioByteString.this.buffer.slice();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f11586a.remaining();
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.f11586a.mark();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!this.f11586a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i2, this.f11586a.remaining());
            this.f11586a.get(bArr, i, iMin);
            return iMin;
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            try {
                this.f11586a.reset();
            } catch (InvalidMarkException e) {
                throw new IOException(e);
            }
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f11586a.hasRemaining()) {
                return this.f11586a.get() & 255;
            }
            return -1;
        }
    }
}
