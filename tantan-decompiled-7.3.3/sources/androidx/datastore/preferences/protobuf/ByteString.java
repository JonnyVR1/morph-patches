package androidx.datastore.preferences.protobuf;

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
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Marker;
import p153l.bqg0;
import p153l.dpq0;
import p153l.gzi0;
import p153l.jr3;
import p153l.mor;
import p153l.ogx0;
import p153l.pgx0;
import p153l.qr3;
import p153l.rr3;
import p153l.sn0;
import p153l.wg3;
import p153l.yze;

/* JADX INFO: loaded from: classes.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY = new LiteralByteString(C0351s.f1739c);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<ByteString> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final InterfaceC0279e byteArrayCopier;
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

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public byte byteAt(int i) {
            ByteString.checkIndex(i, size());
            return this.bytes[this.bytesOffset + i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, getOffsetIntoBytes() + i, bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString
        public int getOffsetIntoBytes() {
            return this.bytesOffset;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public byte internalByteAt(int i) {
            return this.bytes[this.bytesOffset + i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.bytesLength;
        }

        public Object writeReplace() {
            return ByteString.wrap(toByteArray());
        }
    }

    public static abstract class LeafByteString extends ByteString {
        public abstract boolean equalsRange(ByteString byteString, int i, int i2);

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int getTreeDepth() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean isBalanced() {
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator2();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void writeToReverse(jr3 jr3Var) throws IOException {
            writeTo(jr3Var);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ByteString$a */
    public class C0275a extends AbstractC0277c {

        /* JADX INFO: renamed from: a */
        public int f1541a = 0;

        /* JADX INFO: renamed from: b */
        public final int f1542b;

        public C0275a() {
            this.f1542b = ByteString.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1541a < this.f1542b;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.InterfaceC0280f
        public byte nextByte() {
            int i = this.f1541a;
            if (i < this.f1542b) {
                this.f1541a = i + 1;
                return ByteString.this.internalByteAt(i);
            }
            mor.m159308a();
            return (byte) 0;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ByteString$b */
    public static class C0276b implements Comparator<ByteString> {
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.ByteString$f, java.util.Iterator] */
        /* JADX WARN: Type inference failed for: r3v1, types: [androidx.datastore.preferences.protobuf.ByteString$f, java.util.Iterator] */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ByteString byteString, ByteString byteString2) {
            ?? Iterator2 = byteString.iterator2();
            ?? Iterator3 = byteString2.iterator2();
            while (Iterator2.hasNext() && Iterator3.hasNext()) {
                int iCompare = Integer.compare(ByteString.toInt(Iterator2.nextByte()), ByteString.toInt(Iterator3.nextByte()));
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return Integer.compare(byteString.size(), byteString2.size());
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ByteString$c */
    public static abstract class AbstractC0277c implements InterfaceC0280f {
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ByteString$e */
    public interface InterfaceC0279e {
        /* JADX INFO: renamed from: a */
        byte[] mo1493a(byte[] bArr, int i, int i2);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ByteString$f */
    public interface InterfaceC0280f extends Iterator<Byte> {
        byte nextByte();
    }

    static {
        C0275a c0275a = null;
        byteArrayCopier = sn0.m186857c() ? new C0283i(c0275a) : new C0278d(c0275a);
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new C0276b();
    }

    private static ByteString balancedConcat(Iterator<ByteString> it, int i) {
        if (i < 1) {
            gzi0.m133102a("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)});
            return null;
        }
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return balancedConcat(it, i2).concat(balancedConcat(it, i - i2));
    }

    public static void checkIndex(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                qr3.m177532a(i);
            } else {
                rr3.m182687a(i, i2);
            }
        }
    }

    public static int checkRange(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            bqg0.m105918a("Beginning index: ", i, " < 0");
            return 0;
        }
        if (i2 < i) {
            yze.m218021a("Beginning index larger than ending index: ", i, ", ", i2);
            return 0;
        }
        yze.m218021a("End index: ", i2, " >= ", i3);
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
        return new LiteralByteString(str.getBytes(C0351s.f1737a));
    }

    public static C0281g newCodedBuilder(int i) {
        return new C0281g(i, null);
    }

    public static C0282h newOutput() {
        return new C0282h(128);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte b) {
        return b & 255;
    }

    public static Comparator<ByteString> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    public static ByteString wrap(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new NioByteString(byteBuffer);
        }
        return wrap(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i);

    public final ByteString concat(ByteString byteString) {
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - size() >= byteString.size()) {
            return RopeByteString.concatenate(this, byteString);
        }
        dpq0.m117417a("ByteString would be too long: ", size(), Marker.ANY_NON_NULL_MARKER, byteString.size());
        return null;
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    @Deprecated
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

    public abstract byte internalByteAt(int i);

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public Iterator<Byte> iterator2() {
        return new C0275a();
    }

    public abstract AbstractC0331g newCodedInput();

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
            return C0351s.f1739c;
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
        return toString(C0351s.f1737a);
    }

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public final void writeTo(OutputStream outputStream, int i, int i2) throws IOException {
        checkRange(i, i + i2, size());
        if (i2 > 0) {
            writeToInternal(outputStream, i, i2);
        }
    }

    public abstract void writeTo(jr3 jr3Var) throws IOException;

    public abstract void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException;

    public abstract void writeToReverse(jr3 jr3Var) throws IOException;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ByteString$d */
    public static final class C0278d implements InterfaceC0279e {
        public C0278d() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.InterfaceC0279e
        /* JADX INFO: renamed from: a */
        public byte[] mo1493a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }

        public /* synthetic */ C0278d(C0275a c0275a) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ByteString$i */
    public static final class C0283i implements InterfaceC0279e {
        public C0283i() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.InterfaceC0279e
        /* JADX INFO: renamed from: a */
        public byte[] mo1493a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        public /* synthetic */ C0283i(C0275a c0275a) {
            this();
        }
    }

    public static C0282h newOutput(int i) {
        return new C0282h(i);
    }

    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte byteAt(int i) {
            return this.bytes[i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, i, bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
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

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        public final boolean equalsRange(ByteString byteString, int i, int i2) {
            if (i2 > byteString.size()) {
                pgx0.m172284a(i2, size());
                return false;
            }
            int i3 = i + i2;
            if (i3 > byteString.size()) {
                ogx0.m167668a(i, i2, byteString.size());
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

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte internalByteAt(int i) {
            return this.bytes[i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean isValidUtf8() {
            int offsetIntoBytes = getOffsetIntoBytes();
            return Utf8.m1705t(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final AbstractC0331g newCodedInput() {
            return AbstractC0331g.m2035k(this.bytes, getOffsetIntoBytes(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final InputStream newInput() {
            return new ByteArrayInputStream(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int partialHash(int i, int i2, int i3) {
            return C0351s.m2348i(i, this.bytes, getOffsetIntoBytes() + i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int partialIsValidUtf8(int i, int i2, int i3) {
            int offsetIntoBytes = getOffsetIntoBytes() + i2;
            return Utf8.m1707v(i, this.bytes, offsetIntoBytes, i3 + offsetIntoBytes);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteString substring(int i, int i2) {
            int iCheckRange = ByteString.checkRange(i, i2, size());
            return iCheckRange == 0 ? ByteString.EMPTY : new BoundedByteString(this.bytes, getOffsetIntoBytes() + i, iCheckRange);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final String toStringInternal(Charset charset) {
            return new String(this.bytes, getOffsetIntoBytes(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void writeTo(jr3 jr3Var) throws IOException {
            jr3Var.mo1579b(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
            outputStream.write(this.bytes, getOffsetIntoBytes() + i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ByteString$g */
    public static final class C0281g {

        /* JADX INFO: renamed from: a */
        public final CodedOutputStream f1544a;

        /* JADX INFO: renamed from: b */
        public final byte[] f1545b;

        public C0281g(int i) {
            byte[] bArr = new byte[i];
            this.f1545b = bArr;
            this.f1544a = CodedOutputStream.m1532h0(bArr);
        }

        /* JADX INFO: renamed from: a */
        public ByteString m1494a() {
            this.f1544a.m1581d();
            return new LiteralByteString(this.f1545b);
        }

        /* JADX INFO: renamed from: b */
        public CodedOutputStream m1495b() {
            return this.f1544a;
        }

        public /* synthetic */ C0281g(int i, C0275a c0275a) {
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

    public static ByteString wrap(byte[] bArr) {
        return new LiteralByteString(bArr);
    }

    public static ByteString wrap(byte[] bArr, int i, int i2) {
        return new BoundedByteString(bArr, i, i2);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ByteString$h */
    public static final class C0282h extends OutputStream {

        /* JADX INFO: renamed from: f */
        public static final byte[] f1546f = new byte[0];

        /* JADX INFO: renamed from: a */
        public final int f1547a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<ByteString> f1548b;

        /* JADX INFO: renamed from: c */
        public int f1549c;

        /* JADX INFO: renamed from: d */
        public byte[] f1550d;

        /* JADX INFO: renamed from: e */
        public int f1551e;

        public C0282h(int i) {
            if (i < 0) {
                wg3.m206174a("Buffer size < 0");
                throw null;
            }
            this.f1547a = i;
            this.f1548b = new ArrayList<>();
            this.f1550d = new byte[i];
        }

        /* JADX INFO: renamed from: d */
        public final void m1496d(int i) {
            this.f1548b.add(new LiteralByteString(this.f1550d));
            int length = this.f1549c + this.f1550d.length;
            this.f1549c = length;
            this.f1550d = new byte[Math.max(this.f1547a, Math.max(i, length >>> 1))];
            this.f1551e = 0;
        }

        public synchronized int size() {
            return this.f1549c + this.f1551e;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
            try {
                byte[] bArr2 = this.f1550d;
                int length = bArr2.length;
                int i3 = this.f1551e;
                if (i2 <= length - i3) {
                    System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.f1551e += i2;
                } else {
                    int length2 = bArr2.length - i3;
                    System.arraycopy(bArr, i, bArr2, i3, length2);
                    int i4 = i2 - length2;
                    m1496d(i4);
                    System.arraycopy(bArr, i + length2, this.f1550d, 0, i4);
                    this.f1551e = i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            try {
                if (this.f1551e == this.f1550d.length) {
                    m1496d(1);
                }
                byte[] bArr = this.f1550d;
                int i2 = this.f1551e;
                this.f1551e = i2 + 1;
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
        checkRange(0, i, byteBuffer.remaining());
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
        checkRange(i, i + i2, bArr.length);
        return new LiteralByteString(byteArrayCopier.mo1493a(bArr, i, i2));
    }
}
