package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p153l.jr3;
import p153l.mor;
import p153l.onl;
import p153l.wpg0;
import p153l.yg3;

/* JADX INFO: loaded from: classes.dex */
final class RopeByteString extends ByteString {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Api.BaseClientBuilder.API_PRIORITY_OTHER};
    private static final long serialVersionUID = 1;
    private final ByteString left;
    private final int leftLength;
    private final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.RopeByteString$a */
    public class C0301a extends ByteString.AbstractC0277c {

        /* JADX INFO: renamed from: a */
        public final C0303c f1581a;

        /* JADX INFO: renamed from: b */
        public ByteString.InterfaceC0280f f1582b = m1673b();

        public C0301a() {
            this.f1581a = new C0303c(RopeByteString.this, null);
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [androidx.datastore.preferences.protobuf.ByteString$f] */
        /* JADX INFO: renamed from: b */
        public final ByteString.InterfaceC0280f m1673b() {
            if (this.f1581a.hasNext()) {
                return this.f1581a.next().iterator2();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1582b != null;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.InterfaceC0280f
        public byte nextByte() {
            ByteString.InterfaceC0280f interfaceC0280f = this.f1582b;
            if (interfaceC0280f == null) {
                mor.m159308a();
                return (byte) 0;
            }
            byte bNextByte = interfaceC0280f.nextByte();
            if (!this.f1582b.hasNext()) {
                this.f1582b = m1673b();
            }
            return bNextByte;
        }
    }

    private RopeByteString(ByteString byteString, ByteString byteString2) {
        this.left = byteString;
        this.right = byteString2;
        int size = byteString.size();
        this.leftLength = size;
        this.totalLength = size + byteString2.size();
        this.treeDepth = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    public static ByteString concatenate(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return concatenateBytes(byteString, byteString2);
        }
        if (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            if (ropeByteString.right.size() + byteString2.size() < 128) {
                return new RopeByteString(ropeByteString.left, concatenateBytes(ropeByteString.right, byteString2));
            }
            if (ropeByteString.left.getTreeDepth() > ropeByteString.right.getTreeDepth() && ropeByteString.getTreeDepth() > byteString2.getTreeDepth()) {
                return new RopeByteString(ropeByteString.left, new RopeByteString(ropeByteString.right, byteString2));
            }
        }
        return size >= minLengthByDepth[Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1] ? new RopeByteString(byteString, byteString2) : new C0302b(null).m1675b(byteString, byteString2);
    }

    private static ByteString concatenateBytes(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return ByteString.wrap(bArr);
    }

    private boolean equalsFragments(ByteString byteString) {
        ByteString.LeafByteString next;
        C0301a c0301a = null;
        C0303c c0303c = new C0303c(this, c0301a);
        ByteString.LeafByteString next2 = c0303c.next();
        C0303c c0303c2 = new C0303c(byteString, c0301a);
        ByteString.LeafByteString next3 = c0303c2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next2.size() - i;
            int size2 = next3.size() - i2;
            int iMin = Math.min(size, size2);
            if (!(i == 0 ? next2.equalsRange(next3, i2, iMin) : next3.equalsRange(next2, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.totalLength;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                wpg0.m207458a();
                return false;
            }
            if (iMin == size) {
                next = c0303c.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == size2) {
                next2 = next2;
                next2 = next;
                next3 = c0303c2.next();
                i2 = 0;
            } else {
                next2 = next2;
                next2 = next;
                i2 += iMin;
            }
        }
    }

    public static RopeByteString newInstanceForTest(ByteString byteString, ByteString byteString2) {
        return new RopeByteString(byteString, byteString2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        C0303c c0303c = new C0303c(this, null);
        while (c0303c.hasNext()) {
            arrayList.add(c0303c.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public byte byteAt(int i) {
        ByteString.checkIndex(i, this.totalLength);
        return internalByteAt(i);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            this.left.copyToInternal(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.right.copyToInternal(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.left.copyToInternal(bArr, i, i2, i6);
            this.right.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.totalLength != byteString.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int iPeekCachedHashCode = peekCachedHashCode();
        int iPeekCachedHashCode2 = byteString.peekCachedHashCode();
        if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
            return equalsFragments(byteString);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public byte internalByteAt(int i) {
        int i2 = this.leftLength;
        return i < i2 ? this.left.internalByteAt(i) : this.right.internalByteAt(i - i2);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean isBalanced() {
        return this.totalLength >= minLengthByDepth[this.treeDepth];
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        ByteString byteString = this.right;
        return byteString.partialIsValidUtf8(iPartialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new C0301a();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public AbstractC0331g newCodedInput() {
        return AbstractC0331g.m2030f(new C0304d());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public InputStream newInput() {
        return new C0304d();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialHash(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialHash(this.left.partialHash(i, i2, i6), 0, i3 - i6);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int size() {
        return this.totalLength;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public ByteString substring(int i, int i2) {
        int iCheckRange = ByteString.checkRange(i, i2, this.totalLength);
        if (iCheckRange == 0) {
            return ByteString.EMPTY;
        }
        if (iCheckRange == this.totalLength) {
            return this;
        }
        int i3 = this.leftLength;
        if (i2 <= i3) {
            return this.left.substring(i, i2);
        }
        return i >= i3 ? this.right.substring(i - i3, i2 - i3) : new RopeByteString(this.left.substring(i), this.right.substring(0, i2 - this.leftLength));
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.leftLength;
        if (i3 <= i4) {
            this.left.writeToInternal(outputStream, i, i2);
        } else {
            if (i >= i4) {
                this.right.writeToInternal(outputStream, i - i4, i2);
                return;
            }
            int i5 = i4 - i;
            this.left.writeToInternal(outputStream, i, i5);
            this.right.writeToInternal(outputStream, 0, i2 - i5);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeToReverse(jr3 jr3Var) throws IOException {
        this.right.writeToReverse(jr3Var);
        this.left.writeToReverse(jr3Var);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.RopeByteString$b */
    public static class C0302b {

        /* JADX INFO: renamed from: a */
        public final ArrayDeque<ByteString> f1584a;

        public C0302b() {
            this.f1584a = new ArrayDeque<>();
        }

        /* JADX INFO: renamed from: b */
        public final ByteString m1675b(ByteString byteString, ByteString byteString2) {
            m1676c(byteString);
            m1676c(byteString2);
            ByteString byteStringPop = this.f1584a.pop();
            while (!this.f1584a.isEmpty()) {
                byteStringPop = new RopeByteString(this.f1584a.pop(), byteStringPop, null);
            }
            return byteStringPop;
        }

        /* JADX INFO: renamed from: c */
        public final void m1676c(ByteString byteString) {
            if (byteString.isBalanced()) {
                m1678e(byteString);
            } else {
                if (!(byteString instanceof RopeByteString)) {
                    yg3.m215829a("Has a new type of ByteString been created? Found ", byteString.getClass());
                    return;
                }
                RopeByteString ropeByteString = (RopeByteString) byteString;
                m1676c(ropeByteString.left);
                m1676c(ropeByteString.right);
            }
        }

        /* JADX INFO: renamed from: d */
        public final int m1677d(int i) {
            int iBinarySearch = Arrays.binarySearch(RopeByteString.minLengthByDepth, i);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        /* JADX INFO: renamed from: e */
        public final void m1678e(ByteString byteString) {
            C0301a c0301a;
            int iM1677d = m1677d(byteString.size());
            int[] iArr = RopeByteString.minLengthByDepth;
            int i = iArr[iM1677d + 1];
            if (this.f1584a.isEmpty() || this.f1584a.peek().size() >= i) {
                this.f1584a.push(byteString);
                return;
            }
            int i2 = iArr[iM1677d];
            ByteString byteStringPop = this.f1584a.pop();
            while (true) {
                c0301a = null;
                if (this.f1584a.isEmpty() || this.f1584a.peek().size() >= i2) {
                    break;
                } else {
                    byteStringPop = new RopeByteString(this.f1584a.pop(), byteStringPop, c0301a);
                }
            }
            RopeByteString ropeByteString = new RopeByteString(byteStringPop, byteString, c0301a);
            while (!this.f1584a.isEmpty()) {
                if (this.f1584a.peek().size() >= RopeByteString.minLengthByDepth[m1677d(ropeByteString.size()) + 1]) {
                    break;
                } else {
                    ropeByteString = new RopeByteString(this.f1584a.pop(), ropeByteString, c0301a);
                }
            }
            this.f1584a.push(ropeByteString);
        }

        public /* synthetic */ C0302b(C0301a c0301a) {
            this();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeTo(jr3 jr3Var) throws IOException {
        this.left.writeTo(jr3Var);
        this.right.writeTo(jr3Var);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.RopeByteString$d */
    public class C0304d extends InputStream {

        /* JADX INFO: renamed from: a */
        public C0303c f1587a;

        /* JADX INFO: renamed from: b */
        public ByteString.LeafByteString f1588b;

        /* JADX INFO: renamed from: c */
        public int f1589c;

        /* JADX INFO: renamed from: d */
        public int f1590d;

        /* JADX INFO: renamed from: e */
        public int f1591e;

        /* JADX INFO: renamed from: f */
        public int f1592f;

        public C0304d() {
            m1683m();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return RopeByteString.this.size() - (this.f1591e + this.f1590d);
        }

        /* JADX INFO: renamed from: k */
        public final void m1682k() {
            if (this.f1588b != null) {
                int i = this.f1590d;
                int i2 = this.f1589c;
                if (i == i2) {
                    this.f1591e += i2;
                    this.f1590d = 0;
                    if (!this.f1587a.hasNext()) {
                        this.f1588b = null;
                        this.f1589c = 0;
                    } else {
                        ByteString.LeafByteString next = this.f1587a.next();
                        this.f1588b = next;
                        this.f1589c = next.size();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: m */
        public final void m1683m() {
            C0303c c0303c = new C0303c(RopeByteString.this, null);
            this.f1587a = c0303c;
            ByteString.LeafByteString next = c0303c.next();
            this.f1588b = next;
            this.f1589c = next.size();
            this.f1590d = 0;
            this.f1591e = 0;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.f1592f = this.f1591e + this.f1590d;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        /* JADX INFO: renamed from: n */
        public final int m1684n(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (i3 > 0) {
                m1682k();
                if (this.f1588b == null) {
                    if (i3 != i2) {
                        break;
                    }
                    return -1;
                }
                int iMin = Math.min(this.f1589c - this.f1590d, i3);
                if (bArr != null) {
                    this.f1588b.copyTo(bArr, this.f1590d, i, iMin);
                    i += iMin;
                }
                this.f1590d += iMin;
                i3 -= iMin;
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            m1682k();
            ByteString.LeafByteString leafByteString = this.f1588b;
            if (leafByteString == null) {
                return -1;
            }
            int i = this.f1590d;
            this.f1590d = i + 1;
            return leafByteString.byteAt(i) & 255;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            m1683m();
            m1684n(null, 0, this.f1592f);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j < 0) {
                onl.m168333a();
                return 0L;
            }
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return m1684n(null, 0, (int) j);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                return m1684n(bArr, i, i2);
            }
            onl.m168333a();
            return 0;
        }
    }

    public /* synthetic */ RopeByteString(ByteString byteString, ByteString byteString2, C0301a c0301a) {
        this(byteString, byteString2);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.RopeByteString$c */
    public static final class C0303c implements Iterator<ByteString.LeafByteString> {

        /* JADX INFO: renamed from: a */
        public final ArrayDeque<RopeByteString> f1585a;

        /* JADX INFO: renamed from: b */
        public ByteString.LeafByteString f1586b;

        public C0303c(ByteString byteString) {
            if (!(byteString instanceof RopeByteString)) {
                this.f1585a = null;
                this.f1586b = (ByteString.LeafByteString) byteString;
                return;
            }
            RopeByteString ropeByteString = (RopeByteString) byteString;
            ArrayDeque<RopeByteString> arrayDeque = new ArrayDeque<>(ropeByteString.getTreeDepth());
            this.f1585a = arrayDeque;
            arrayDeque.push(ropeByteString);
            this.f1586b = m1679a(ropeByteString.left);
        }

        /* JADX INFO: renamed from: a */
        public final ByteString.LeafByteString m1679a(ByteString byteString) {
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                this.f1585a.push(ropeByteString);
                byteString = ropeByteString.left;
            }
            return (ByteString.LeafByteString) byteString;
        }

        /* JADX INFO: renamed from: b */
        public final ByteString.LeafByteString m1680b() {
            ByteString.LeafByteString leafByteStringM1679a;
            do {
                ArrayDeque<RopeByteString> arrayDeque = this.f1585a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                leafByteStringM1679a = m1679a(this.f1585a.pop().right);
            } while (leafByteStringM1679a.isEmpty());
            return leafByteStringM1679a;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString = this.f1586b;
            if (leafByteString != null) {
                this.f1586b = m1680b();
                return leafByteString;
            }
            mor.m159308a();
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1586b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ C0303c(ByteString byteString, C0301a c0301a) {
            this(byteString);
        }
    }
}
