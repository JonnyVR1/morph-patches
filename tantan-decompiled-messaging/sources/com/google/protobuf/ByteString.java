package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Marker;
import p149l.i7x0;
import p149l.ig3;
import p149l.iq3;
import p149l.j7x0;
import p149l.kgj0;
import p149l.rq3;
import p149l.sq3;
import p149l.thg0;
import p149l.uye;
import p149l.yfq0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY = new LiteralByteString(C3414l.f11608c);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final InterfaceC3369c byteArrayCopier;
    private int hash = 0;

    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        public BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.checkRange(i, i + i2, bArr.length);
            this.bytesOffset = i;
            this.bytesLength = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public byte byteAt(int i) {
            ByteString.checkIndex(i, size());
            return this.bytes[this.bytesOffset + i];
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, getOffsetIntoBytes() + i, bArr, i2, i3);
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString
        public int getOffsetIntoBytes() {
            return this.bytesOffset;
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public int size() {
            return this.bytesLength;
        }

        public Object writeReplace() {
            return ByteString.wrap(toByteArray());
        }
    }

    public static abstract class LeafByteString extends ByteString {
        public abstract boolean equalsRange(ByteString byteString, int i, int i2);

        @Override // com.google.protobuf.ByteString
        public final int getTreeDepth() {
            return 0;
        }

        @Override // com.google.protobuf.ByteString
        public final boolean isBalanced() {
            return true;
        }

        @Override // com.google.protobuf.ByteString, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator2();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.ByteString$a */
    public class C3367a implements InterfaceC3370d {

        /* JADX INFO: renamed from: a */
        public int f11509a = 0;

        /* JADX INFO: renamed from: b */
        public final int f11510b;

        public C3367a() {
            this.f11510b = ByteString.this.size();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11509a < this.f11510b;
        }

        public byte nextByte() {
            try {
                ByteString byteString = ByteString.this;
                int i = this.f11509a;
                this.f11509a = i + 1;
                return byteString.byteAt(i);
            } catch (IndexOutOfBoundsException e) {
                kgj0.m145892a(e.getMessage());
                return (byte) 0;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.ByteString$c */
    public interface InterfaceC3369c {
        /* JADX INFO: renamed from: a */
        byte[] mo16887a(byte[] bArr, int i, int i2);
    }

    /* JADX INFO: renamed from: com.google.protobuf.ByteString$d */
    public interface InterfaceC3370d extends Iterator<Byte> {
    }

    static {
        InterfaceC3369c c3368b;
        C3367a c3367a = null;
        try {
            Class.forName("android.content.Context");
            c3368b = new C3373g(c3367a);
        } catch (ClassNotFoundException unused) {
            c3368b = new C3368b(c3367a);
        }
        byteArrayCopier = c3368b;
    }

    private static ByteString balancedConcat(Iterator<ByteString> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return balancedConcat(it, i2).concat(balancedConcat(it, i - i2));
    }

    public static void checkIndex(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                rq3.m180408a(i);
            } else {
                sq3.m185449a(i, i2);
            }
        }
    }

    public static int checkRange(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            thg0.m188906a("Beginning index: ", i, " < 0");
            return 0;
        }
        if (i2 < i) {
            uye.m196285a("Beginning index larger than ending index: ", i, ", ", i2);
            return 0;
        }
        uye.m196285a("End index: ", i2, " >= ", i3);
        return 0;
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator<ByteString> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? EMPTY : balancedConcat(iterable.iterator(), size);
    }

    public static ByteString copyFromUtf8(String str) {
        return new LiteralByteString(str.getBytes(C3414l.f11606a));
    }

    public static C3371e newCodedBuilder(int i) {
        return new C3371e(i, null);
    }

    public static C3372f newOutput() {
        return new C3372f(128);
    }

    private static ByteString readChunk(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        if (i2 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i2);
    }

    public static ByteString readFrom(InputStream inputStream, int i, int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteString chunk = readChunk(inputStream, i);
            if (chunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(chunk);
            i = Math.min(i * 2, i2);
        }
    }

    public static ByteString wrap(byte[] bArr) {
        return new LiteralByteString(bArr);
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i);

    public final ByteString concat(ByteString byteString) {
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - size() >= byteString.size()) {
            return RopeByteString.concatenate(this, byteString);
        }
        yfq0.m214580a("ByteString would be too long: ", size(), Marker.ANY_NON_NULL_MARKER, byteString.size());
        return null;
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public final void copyTo(byte[] bArr, int i, int i2, int i3) {
        checkRange(i, i + i3, size());
        checkRange(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            copyToInternal(bArr, i, i2, i3);
        }
    }

    public abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    public final boolean endsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(size() - byteString.size()).equals(byteString);
    }

    public abstract boolean equals(Object obj);

    public abstract int getTreeDepth();

    public final int hashCode() {
        int iPartialHash = this.hash;
        if (iPartialHash == 0) {
            int size = size();
            iPartialHash = partialHash(size, 0, size);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.hash = iPartialHash;
        }
        return iPartialHash;
    }

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public final Iterator<Byte> iterator2() {
        return new C3367a();
    }

    public abstract C3407e newCodedInput();

    public abstract InputStream newInput();

    public abstract int partialHash(int i, int i2, int i3);

    public abstract int partialIsValidUtf8(int i, int i2, int i3);

    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(0, byteString.size()).equals(byteString);
    }

    public final ByteString substring(int i) {
        return substring(i, size());
    }

    public abstract ByteString substring(int i, int i2);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return C3414l.f11608c;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(C3414l.f11606a);
    }

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public final void writeTo(OutputStream outputStream, int i, int i2) throws IOException {
        checkRange(i, i + i2, size());
        if (i2 > 0) {
            writeToInternal(outputStream, i, i2);
        }
    }

    public abstract void writeTo(iq3 iq3Var) throws IOException;

    public abstract void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: com.google.protobuf.ByteString$b */
    public static final class C3368b implements InterfaceC3369c {
        public C3368b() {
        }

        @Override // com.google.protobuf.ByteString.InterfaceC3369c
        /* JADX INFO: renamed from: a */
        public byte[] mo16887a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }

        public /* synthetic */ C3368b(C3367a c3367a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.ByteString$g */
    public static final class C3373g implements InterfaceC3369c {
        public C3373g() {
        }

        @Override // com.google.protobuf.ByteString.InterfaceC3369c
        /* JADX INFO: renamed from: a */
        public byte[] mo16887a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        public /* synthetic */ C3373g(C3367a c3367a) {
            this();
        }
    }

    public static ByteString wrap(byte[] bArr, int i, int i2) {
        return new BoundedByteString(bArr, i, i2);
    }

    public static C3372f newOutput(int i) {
        return new C3372f(i);
    }

    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        public LiteralByteString(byte[] bArr) {
            this.bytes = bArr;
        }

        @Override // com.google.protobuf.ByteString
        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.ByteString
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // com.google.protobuf.ByteString
        public byte byteAt(int i) {
            return this.bytes[i];
        }

        @Override // com.google.protobuf.ByteString
        public final void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.protobuf.ByteString
        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, i, bArr, i2, i3);
        }

        @Override // com.google.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int iPeekCachedHashCode = peekCachedHashCode();
            int iPeekCachedHashCode2 = literalByteString.peekCachedHashCode();
            if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
                return equalsRange(literalByteString, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.ByteString.LeafByteString
        public final boolean equalsRange(ByteString byteString, int i, int i2) {
            if (i2 > byteString.size()) {
                j7x0.m140122a(i2, size());
                return false;
            }
            int i3 = i + i2;
            if (i3 > byteString.size()) {
                i7x0.m134926a(i, i2, byteString.size());
                return false;
            }
            if (!(byteString instanceof LiteralByteString)) {
                return byteString.substring(i, i3).equals(substring(0, i2));
            }
            LiteralByteString literalByteString = (LiteralByteString) byteString;
            byte[] bArr = this.bytes;
            byte[] bArr2 = literalByteString.bytes;
            int offsetIntoBytes = getOffsetIntoBytes() + i2;
            int offsetIntoBytes2 = getOffsetIntoBytes();
            int offsetIntoBytes3 = literalByteString.getOffsetIntoBytes() + i;
            while (offsetIntoBytes2 < offsetIntoBytes) {
                if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                    return false;
                }
                offsetIntoBytes2++;
                offsetIntoBytes3++;
            }
            return true;
        }

        public int getOffsetIntoBytes() {
            return 0;
        }

        @Override // com.google.protobuf.ByteString
        public final boolean isValidUtf8() {
            int offsetIntoBytes = getOffsetIntoBytes();
            return Utf8.m17052q(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
        }

        @Override // com.google.protobuf.ByteString
        public final C3407e newCodedInput() {
            return C3407e.m17104j(this.bytes, getOffsetIntoBytes(), size(), true);
        }

        @Override // com.google.protobuf.ByteString
        public final InputStream newInput() {
            return new ByteArrayInputStream(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.protobuf.ByteString
        public final int partialHash(int i, int i2, int i3) {
            return C3414l.m17211f(i, this.bytes, getOffsetIntoBytes() + i2, i3);
        }

        @Override // com.google.protobuf.ByteString
        public final int partialIsValidUtf8(int i, int i2, int i3) {
            int offsetIntoBytes = getOffsetIntoBytes() + i2;
            return Utf8.m17054s(i, this.bytes, offsetIntoBytes, i3 + offsetIntoBytes);
        }

        @Override // com.google.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }

        @Override // com.google.protobuf.ByteString
        public final ByteString substring(int i, int i2) {
            int iCheckRange = ByteString.checkRange(i, i2, size());
            return iCheckRange == 0 ? ByteString.EMPTY : new BoundedByteString(this.bytes, getOffsetIntoBytes() + i, iCheckRange);
        }

        @Override // com.google.protobuf.ByteString
        public final String toStringInternal(Charset charset) {
            return new String(this.bytes, getOffsetIntoBytes(), size(), charset);
        }

        @Override // com.google.protobuf.ByteString
        public final void writeTo(iq3 iq3Var) throws IOException {
            iq3Var.mo16951b(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.protobuf.ByteString
        public final void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
            outputStream.write(this.bytes, getOffsetIntoBytes() + i, i2);
        }

        @Override // com.google.protobuf.ByteString
        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.ByteString$e */
    public static final class C3371e {

        /* JADX INFO: renamed from: a */
        public final CodedOutputStream f11512a;

        /* JADX INFO: renamed from: b */
        public final byte[] f11513b;

        public C3371e(int i) {
            byte[] bArr = new byte[i];
            this.f11513b = bArr;
            this.f11512a = CodedOutputStream.m16911W(bArr);
        }

        /* JADX INFO: renamed from: a */
        public ByteString m16888a() {
            this.f11512a.m16955e();
            return new LiteralByteString(this.f11513b);
        }

        /* JADX INFO: renamed from: b */
        public CodedOutputStream m16889b() {
            return this.f11512a;
        }

        public /* synthetic */ C3371e(int i, C3367a c3367a) {
            this(i);
        }
    }

    public void copyTo(byte[] bArr, int i) {
        copyTo(bArr, 0, i, size());
    }

    public static ByteString readFrom(InputStream inputStream, int i) throws IOException {
        return readFrom(inputStream, i, i);
    }

    public static ByteString readFrom(InputStream inputStream) throws IOException {
        return readFrom(inputStream, 256, 8192);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e);
            throw unsupportedEncodingException;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.ByteString$f */
    public static final class C3372f extends OutputStream {

        /* JADX INFO: renamed from: f */
        public static final byte[] f11514f = new byte[0];

        /* JADX INFO: renamed from: a */
        public final int f11515a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<ByteString> f11516b;

        /* JADX INFO: renamed from: c */
        public int f11517c;

        /* JADX INFO: renamed from: d */
        public byte[] f11518d;

        /* JADX INFO: renamed from: e */
        public int f11519e;

        public C3372f(int i) {
            if (i < 0) {
                ig3.m135964a("Buffer size < 0");
                throw null;
            }
            this.f11515a = i;
            this.f11516b = new ArrayList<>();
            this.f11518d = new byte[i];
        }

        /* JADX INFO: renamed from: d */
        public final void m16890d(int i) {
            this.f11516b.add(new LiteralByteString(this.f11518d));
            int length = this.f11517c + this.f11518d.length;
            this.f11517c = length;
            this.f11518d = new byte[Math.max(this.f11515a, Math.max(i, length >>> 1))];
            this.f11519e = 0;
        }

        public synchronized int size() {
            return this.f11517c + this.f11519e;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
            try {
                byte[] bArr2 = this.f11518d;
                int length = bArr2.length;
                int i3 = this.f11519e;
                if (i2 <= length - i3) {
                    System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.f11519e += i2;
                } else {
                    int length2 = bArr2.length - i3;
                    System.arraycopy(bArr, i, bArr2, i3, length2);
                    int i4 = i2 - length2;
                    m16890d(i4);
                    System.arraycopy(bArr, i + length2, this.f11518d, 0, i4);
                    this.f11519e = i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            try {
                if (this.f11519e == this.f11518d.length) {
                    m16890d(1);
                }
                byte[] bArr = this.f11518d;
                int i2 = this.f11519e;
                this.f11519e = i2 + 1;
                bArr[i2] = (byte) i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new LiteralByteString(bArr);
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static ByteString copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new LiteralByteString(str.getBytes(str2));
    }

    public static ByteString copyFrom(String str, Charset charset) {
        return new LiteralByteString(str.getBytes(charset));
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2) {
        return new LiteralByteString(byteArrayCopier.mo16887a(bArr, i, i2));
    }
}
