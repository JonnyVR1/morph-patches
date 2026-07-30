package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import p153l.ir3;
import p153l.mor;
import p153l.onl;
import p153l.wpg0;
import p153l.yg3;

/* JADX INFO: loaded from: classes7.dex */
final class RopeByteString extends ByteString {
    private static final int[] minLengthByDepth;
    private static final long serialVersionUID = 1;
    private final ByteString left;
    private final int leftLength;
    private final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    /* JADX INFO: renamed from: com.google.protobuf.RopeByteString$b */
    public static class C3412b {

        /* JADX INFO: renamed from: a */
        public final Stack<ByteString> f11588a;

        public C3412b() {
            this.f11588a = new Stack<>();
        }

        /* JADX INFO: renamed from: b */
        public final ByteString m17081b(ByteString byteString, ByteString byteString2) {
            m17082c(byteString);
            m17082c(byteString2);
            ByteString byteStringPop = this.f11588a.pop();
            while (!this.f11588a.isEmpty()) {
                byteStringPop = new RopeByteString(this.f11588a.pop(), byteStringPop);
            }
            return byteStringPop;
        }

        /* JADX INFO: renamed from: c */
        public final void m17082c(ByteString byteString) {
            if (byteString.isBalanced()) {
                m17084e(byteString);
            } else {
                if (!(byteString instanceof RopeByteString)) {
                    yg3.m215829a("Has a new type of ByteString been created? Found ", byteString.getClass());
                    return;
                }
                RopeByteString ropeByteString = (RopeByteString) byteString;
                m17082c(ropeByteString.left);
                m17082c(ropeByteString.right);
            }
        }

        /* JADX INFO: renamed from: d */
        public final int m17083d(int i) {
            int iBinarySearch = Arrays.binarySearch(RopeByteString.minLengthByDepth, i);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        /* JADX INFO: renamed from: e */
        public final void m17084e(ByteString byteString) {
            int iM17083d = m17083d(byteString.size());
            int i = RopeByteString.minLengthByDepth[iM17083d + 1];
            if (this.f11588a.isEmpty() || this.f11588a.peek().size() >= i) {
                this.f11588a.push(byteString);
                return;
            }
            int i2 = RopeByteString.minLengthByDepth[iM17083d];
            ByteString byteStringPop = this.f11588a.pop();
            while (true) {
                if (this.f11588a.isEmpty() || this.f11588a.peek().size() >= i2) {
                    break;
                } else {
                    byteStringPop = new RopeByteString(this.f11588a.pop(), byteStringPop);
                }
            }
            RopeByteString ropeByteString = new RopeByteString(byteStringPop, byteString);
            while (!this.f11588a.isEmpty()) {
                if (this.f11588a.peek().size() >= RopeByteString.minLengthByDepth[m17083d(ropeByteString.size()) + 1]) {
                    break;
                } else {
                    ropeByteString = new RopeByteString(this.f11588a.pop(), ropeByteString);
                }
            }
            this.f11588a.push(ropeByteString);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.RopeByteString$c */
    public static class C3413c implements Iterator<ByteString.LeafByteString> {

        /* JADX INFO: renamed from: a */
        public final Stack<RopeByteString> f11589a;

        /* JADX INFO: renamed from: b */
        public ByteString.LeafByteString f11590b;

        public C3413c(ByteString byteString) {
            this.f11589a = new Stack<>();
            this.f11590b = m17085a(byteString);
        }

        /* JADX INFO: renamed from: a */
        public final ByteString.LeafByteString m17085a(ByteString byteString) {
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                this.f11589a.push(ropeByteString);
                byteString = ropeByteString.left;
            }
            return (ByteString.LeafByteString) byteString;
        }

        /* JADX INFO: renamed from: b */
        public final ByteString.LeafByteString m17086b() {
            while (!this.f11589a.isEmpty()) {
                ByteString.LeafByteString leafByteStringM17085a = m17085a(this.f11589a.pop().right);
                if (!leafByteStringM17085a.isEmpty()) {
                    return leafByteStringM17085a;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString = this.f11590b;
            if (leafByteString != null) {
                this.f11590b = m17086b();
                return leafByteString;
            }
            mor.m159308a();
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11590b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.valueOf(Api.BaseClientBuilder.API_PRIORITY_OTHER));
        minLengthByDepth = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = minLengthByDepth;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
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
        return size >= minLengthByDepth[Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1] ? new RopeByteString(byteString, byteString2) : new C3412b().m17081b(byteString, byteString2);
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
        C3413c c3413c = new C3413c(this);
        ByteString.LeafByteString next2 = c3413c.next();
        C3413c c3413c2 = new C3413c(byteString);
        ByteString.LeafByteString next3 = c3413c2.next();
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
                next = c3413c.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == size2) {
                next2 = next2;
                next2 = next;
                next3 = c3413c2.next();
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

    @Override // com.google.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        C3413c c3413c = new C3413c(this);
        while (c3413c.hasNext()) {
            arrayList.add(c3413c.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i) {
        ByteString.checkIndex(i, this.totalLength);
        int i2 = this.leftLength;
        return i < i2 ? this.left.byteAt(i) : this.right.byteAt(i - i2);
    }

    @Override // com.google.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.ByteString
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

    @Override // com.google.protobuf.ByteString
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

    @Override // com.google.protobuf.ByteString
    public int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // com.google.protobuf.ByteString
    public boolean isBalanced() {
        return this.totalLength >= minLengthByDepth[this.treeDepth];
    }

    @Override // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        ByteString byteString = this.right;
        return byteString.partialIsValidUtf8(iPartialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // com.google.protobuf.ByteString
    public C3430e newCodedInput() {
        return C3430e.m17155f(new C3414d());
    }

    @Override // com.google.protobuf.ByteString
    public InputStream newInput() {
        return new C3414d();
    }

    @Override // com.google.protobuf.ByteString
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

    @Override // com.google.protobuf.ByteString
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

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.totalLength;
    }

    @Override // com.google.protobuf.ByteString
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

    @Override // com.google.protobuf.ByteString
    public String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    @Override // com.google.protobuf.ByteString
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

    @Override // com.google.protobuf.ByteString
    public void writeTo(ir3 ir3Var) throws IOException {
        this.left.writeTo(ir3Var);
        this.right.writeTo(ir3Var);
    }

    /* JADX INFO: renamed from: com.google.protobuf.RopeByteString$d */
    public class C3414d extends InputStream {

        /* JADX INFO: renamed from: a */
        public C3413c f11591a;

        /* JADX INFO: renamed from: b */
        public ByteString.LeafByteString f11592b;

        /* JADX INFO: renamed from: c */
        public int f11593c;

        /* JADX INFO: renamed from: d */
        public int f11594d;

        /* JADX INFO: renamed from: e */
        public int f11595e;

        /* JADX INFO: renamed from: f */
        public int f11596f;

        public C3414d() {
            m17089m();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return RopeByteString.this.size() - (this.f11595e + this.f11594d);
        }

        /* JADX INFO: renamed from: k */
        public final void m17088k() {
            if (this.f11592b != null) {
                int i = this.f11594d;
                int i2 = this.f11593c;
                if (i == i2) {
                    this.f11595e += i2;
                    this.f11594d = 0;
                    if (!this.f11591a.hasNext()) {
                        this.f11592b = null;
                        this.f11593c = 0;
                    } else {
                        ByteString.LeafByteString next = this.f11591a.next();
                        this.f11592b = next;
                        this.f11593c = next.size();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: m */
        public final void m17089m() {
            C3413c c3413c = new C3413c(RopeByteString.this);
            this.f11591a = c3413c;
            ByteString.LeafByteString next = c3413c.next();
            this.f11592b = next;
            this.f11593c = next.size();
            this.f11594d = 0;
            this.f11595e = 0;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.f11596f = this.f11595e + this.f11594d;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        /* JADX INFO: renamed from: n */
        public final int m17090n(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (i3 > 0) {
                m17088k();
                if (this.f11592b == null) {
                    if (i3 != i2) {
                        break;
                    }
                    return -1;
                }
                int iMin = Math.min(this.f11593c - this.f11594d, i3);
                if (bArr != null) {
                    this.f11592b.copyTo(bArr, this.f11594d, i, iMin);
                    i += iMin;
                }
                this.f11594d += iMin;
                i3 -= iMin;
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            m17088k();
            ByteString.LeafByteString leafByteString = this.f11592b;
            if (leafByteString == null) {
                return -1;
            }
            int i = this.f11594d;
            this.f11594d = i + 1;
            return leafByteString.byteAt(i) & 255;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            m17089m();
            m17090n(null, 0, this.f11596f);
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
            return m17090n(null, 0, (int) j);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                return m17090n(bArr, i, i2);
            }
            onl.m168333a();
            return 0;
        }
    }
}
