package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;
import p149l.lmr;
import p149l.ohg0;
import p149l.zkl;
import p149l.zvk;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c */
/* JADX INFO: loaded from: classes2.dex */
public class C15301c extends ByteString {

    /* JADX INFO: renamed from: h */
    public static final int[] f65700h;

    /* JADX INFO: renamed from: b */
    public final int f65701b;

    /* JADX INFO: renamed from: c */
    public final ByteString f65702c;

    /* JADX INFO: renamed from: d */
    public final ByteString f65703d;

    /* JADX INFO: renamed from: e */
    public final int f65704e;

    /* JADX INFO: renamed from: f */
    public final int f65705f;

    /* JADX INFO: renamed from: g */
    public int f65706g;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final Stack<ByteString> f65707a;

        public b() {
            this.f65707a = new Stack<>();
        }

        /* JADX INFO: renamed from: b */
        public final ByteString m91386b(ByteString byteString, ByteString byteString2) {
            m91387c(byteString);
            m91387c(byteString2);
            ByteString byteStringPop = this.f65707a.pop();
            while (!this.f65707a.isEmpty()) {
                byteStringPop = new C15301c(this.f65707a.pop(), byteStringPop);
            }
            return byteStringPop;
        }

        /* JADX INFO: renamed from: c */
        public final void m91387c(ByteString byteString) {
            if (byteString.mo91160p()) {
                m91389e(byteString);
                return;
            }
            if (!(byteString instanceof C15301c)) {
                String strValueOf = String.valueOf(byteString.getClass());
                zvk.m220414a(strValueOf.length() + 49, "Has a new type of ByteString been created? Found ", strValueOf);
            } else {
                C15301c c15301c = (C15301c) byteString;
                m91387c(c15301c.f65702c);
                m91387c(c15301c.f65703d);
            }
        }

        /* JADX INFO: renamed from: d */
        public final int m91388d(int i) {
            int iBinarySearch = Arrays.binarySearch(C15301c.f65700h, i);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        /* JADX INFO: renamed from: e */
        public final void m91389e(ByteString byteString) {
            int iM91388d = m91388d(byteString.size());
            int i = C15301c.f65700h[iM91388d + 1];
            if (this.f65707a.isEmpty() || this.f65707a.peek().size() >= i) {
                this.f65707a.push(byteString);
                return;
            }
            int i2 = C15301c.f65700h[iM91388d];
            ByteString byteStringPop = this.f65707a.pop();
            while (true) {
                if (this.f65707a.isEmpty() || this.f65707a.peek().size() >= i2) {
                    break;
                } else {
                    byteStringPop = new C15301c(this.f65707a.pop(), byteStringPop);
                }
            }
            C15301c c15301c = new C15301c(byteStringPop, byteString);
            while (!this.f65707a.isEmpty()) {
                if (this.f65707a.peek().size() >= C15301c.f65700h[m91388d(c15301c.size()) + 1]) {
                    break;
                } else {
                    c15301c = new C15301c(this.f65707a.pop(), c15301c);
                }
            }
            this.f65707a.push(c15301c);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$c */
    public static class c implements Iterator<C15300b> {

        /* JADX INFO: renamed from: a */
        public final Stack<C15301c> f65708a;

        /* JADX INFO: renamed from: b */
        public C15300b f65709b;

        public c(ByteString byteString) {
            this.f65708a = new Stack<>();
            this.f65709b = m91390a(byteString);
        }

        /* JADX INFO: renamed from: a */
        public final C15300b m91390a(ByteString byteString) {
            while (byteString instanceof C15301c) {
                C15301c c15301c = (C15301c) byteString;
                this.f65708a.push(c15301c);
                byteString = c15301c.f65702c;
            }
            return (C15300b) byteString;
        }

        /* JADX INFO: renamed from: b */
        public final C15300b m91391b() {
            while (!this.f65708a.isEmpty()) {
                C15300b c15300bM91390a = m91390a(this.f65708a.pop().f65703d);
                if (!c15300bM91390a.isEmpty()) {
                    return c15300bM91390a;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C15300b next() {
            C15300b c15300b = this.f65709b;
            if (c15300b != null) {
                this.f65709b = m91391b();
                return c15300b;
            }
            lmr.m150601a();
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f65709b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$d */
    public class d implements ByteString.ByteIterator {

        /* JADX INFO: renamed from: a */
        public final c f65710a;

        /* JADX INFO: renamed from: b */
        public ByteString.ByteIterator f65711b;

        /* JADX INFO: renamed from: c */
        public int f65712c;

        public d() {
            c cVar = new c(C15301c.this);
            this.f65710a = cVar;
            this.f65711b = cVar.next().iterator();
            this.f65712c = C15301c.this.size();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f65712c > 0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            if (!this.f65711b.hasNext()) {
                this.f65711b = this.f65710a.next().iterator();
            }
            this.f65712c--;
            return this.f65711b.nextByte();
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
        f65700h = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f65700h;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public C15301c(ByteString byteString, ByteString byteString2) {
        this.f65706g = 0;
        this.f65702c = byteString;
        this.f65703d = byteString2;
        int size = byteString.size();
        this.f65704e = size;
        this.f65701b = size + byteString2.size();
        this.f65705f = Math.max(byteString.mo91159o(), byteString2.mo91159o()) + 1;
    }

    /* JADX INFO: renamed from: J */
    public static ByteString m91382J(ByteString byteString, ByteString byteString2) {
        C15301c c15301c = byteString instanceof C15301c ? (C15301c) byteString : null;
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return m91383K(byteString, byteString2);
        }
        if (c15301c != null && c15301c.f65703d.size() + byteString2.size() < 128) {
            return new C15301c(c15301c.f65702c, m91383K(c15301c.f65703d, byteString2));
        }
        if (c15301c == null || c15301c.f65702c.mo91159o() <= c15301c.f65703d.mo91159o() || c15301c.mo91159o() <= byteString2.mo91159o()) {
            return size >= f65700h[Math.max(byteString.mo91159o(), byteString2.mo91159o()) + 1] ? new C15301c(byteString, byteString2) : new b().m91386b(byteString, byteString2);
        }
        return new C15301c(c15301c.f65702c, new C15301c(c15301c.f65703d, byteString2));
    }

    /* JADX INFO: renamed from: K */
    public static C15300b m91383K(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.m91157j(bArr, 0, 0, size);
        byteString2.m91157j(bArr, 0, size, size2);
        return new C15300b(bArr);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: C */
    public String mo91152C(String str) throws UnsupportedEncodingException {
        return new String(m91151A(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: F */
    public void mo91155F(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.f65704e;
        if (i3 <= i4) {
            this.f65702c.mo91155F(outputStream, i, i2);
        } else {
            if (i >= i4) {
                this.f65703d.mo91155F(outputStream, i - i4, i2);
                return;
            }
            int i5 = i4 - i;
            this.f65702c.mo91155F(outputStream, i, i5);
            this.f65703d.mo91155F(outputStream, 0, i2 - i5);
        }
    }

    /* JADX INFO: renamed from: L */
    public final boolean m91384L(ByteString byteString) {
        c cVar = new c(this);
        C15300b next = cVar.next();
        c cVar2 = new c(byteString);
        C15300b next2 = cVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next.size() - i;
            int size2 = next2.size() - i2;
            int iMin = Math.min(size, size2);
            if (!(i == 0 ? next.m91377H(next2, i2, iMin) : next2.m91377H(next, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.f65701b;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                ohg0.m164364a();
                return false;
            }
            if (iMin == size) {
                next = cVar.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == size2) {
                next2 = cVar2.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
        }
    }

    public boolean equals(Object obj) {
        int iMo91166z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.f65701b != byteString.size()) {
            return false;
        }
        if (this.f65701b == 0) {
            return true;
        }
        if (this.f65706g == 0 || (iMo91166z = byteString.mo91166z()) == 0 || this.f65706g == iMo91166z) {
            return m91384L(byteString);
        }
        return false;
    }

    public int hashCode() {
        int iMo91164x = this.f65706g;
        if (iMo91164x == 0) {
            int i = this.f65701b;
            iMo91164x = mo91164x(i, 0, i);
            if (iMo91164x == 0) {
                iMo91164x = 1;
            }
            this.f65706g = iMo91164x;
        }
        return iMo91164x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: l */
    public void mo91158l(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.f65704e;
        if (i4 <= i5) {
            this.f65702c.mo91158l(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.f65703d.mo91158l(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.f65702c.mo91158l(bArr, i, i2, i6);
            this.f65703d.mo91158l(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: o */
    public int mo91159o() {
        return this.f65705f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: p */
    public boolean mo91160p() {
        return this.f65701b >= f65700h[this.f65705f];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: r */
    public boolean mo91161r() {
        int iMo91165y = this.f65702c.mo91165y(0, 0, this.f65704e);
        ByteString byteString = this.f65703d;
        return byteString.mo91165y(iMo91165y, 0, byteString.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: s */
    public ByteString.ByteIterator iterator() {
        return new d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f65701b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: v */
    public CodedInputStream mo91163v() {
        return CodedInputStream.m91174g(new e());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: x */
    public int mo91164x(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f65704e;
        if (i4 <= i5) {
            return this.f65702c.mo91164x(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f65703d.mo91164x(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f65703d.mo91164x(this.f65702c.mo91164x(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: y */
    public int mo91165y(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f65704e;
        if (i4 <= i5) {
            return this.f65702c.mo91165y(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f65703d.mo91165y(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f65703d.mo91165y(this.f65702c.mo91165y(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: z */
    public int mo91166z() {
        return this.f65706g;
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$e */
    public class e extends InputStream {

        /* JADX INFO: renamed from: a */
        public c f65714a;

        /* JADX INFO: renamed from: b */
        public C15300b f65715b;

        /* JADX INFO: renamed from: c */
        public int f65716c;

        /* JADX INFO: renamed from: d */
        public int f65717d;

        /* JADX INFO: renamed from: e */
        public int f65718e;

        /* JADX INFO: renamed from: f */
        public int f65719f;

        public e() {
            m91395m();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return C15301c.this.size() - (this.f65718e + this.f65717d);
        }

        /* JADX INFO: renamed from: k */
        public final void m91394k() {
            if (this.f65715b != null) {
                int i = this.f65717d;
                int i2 = this.f65716c;
                if (i == i2) {
                    this.f65718e += i2;
                    this.f65717d = 0;
                    if (!this.f65714a.hasNext()) {
                        this.f65715b = null;
                        this.f65716c = 0;
                    } else {
                        C15300b next = this.f65714a.next();
                        this.f65715b = next;
                        this.f65716c = next.size();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: m */
        public final void m91395m() {
            c cVar = new c(C15301c.this);
            this.f65714a = cVar;
            C15300b next = cVar.next();
            this.f65715b = next;
            this.f65716c = next.size();
            this.f65717d = 0;
            this.f65718e = 0;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.f65719f = this.f65718e + this.f65717d;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        /* JADX INFO: renamed from: n */
        public final int m91396n(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (i3 > 0) {
                m91394k();
                if (this.f65715b == null) {
                    if (i3 != i2) {
                        break;
                    }
                    return -1;
                }
                int iMin = Math.min(this.f65716c - this.f65717d, i3);
                if (bArr != null) {
                    this.f65715b.m91157j(bArr, this.f65717d, i, iMin);
                    i += iMin;
                }
                this.f65717d += iMin;
                i3 -= iMin;
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            m91394k();
            C15300b c15300b = this.f65715b;
            if (c15300b == null) {
                return -1;
            }
            int i = this.f65717d;
            this.f65717d = i + 1;
            return c15300b.mo91373G(i) & 255;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            m91395m();
            m91396n(null, 0, this.f65719f);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j < 0) {
                zkl.m219192a();
                return 0L;
            }
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return m91396n(null, 0, (int) j);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                return m91396n(bArr, i, i2);
            }
            zkl.m219192a();
            return 0;
        }
    }
}
