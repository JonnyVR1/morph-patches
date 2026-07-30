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
import p153l.mor;
import p153l.onl;
import p153l.pyk;
import p153l.wpg0;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c */
/* JADX INFO: loaded from: classes2.dex */
public class C15408c extends ByteString {

    /* JADX INFO: renamed from: h */
    public static final int[] f66374h;

    /* JADX INFO: renamed from: b */
    public final int f66375b;

    /* JADX INFO: renamed from: c */
    public final ByteString f66376c;

    /* JADX INFO: renamed from: d */
    public final ByteString f66377d;

    /* JADX INFO: renamed from: e */
    public final int f66378e;

    /* JADX INFO: renamed from: f */
    public final int f66379f;

    /* JADX INFO: renamed from: g */
    public int f66380g;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final Stack<ByteString> f66381a;

        public b() {
            this.f66381a = new Stack<>();
        }

        /* JADX INFO: renamed from: b */
        public final ByteString m92277b(ByteString byteString, ByteString byteString2) {
            m92278c(byteString);
            m92278c(byteString2);
            ByteString byteStringPop = this.f66381a.pop();
            while (!this.f66381a.isEmpty()) {
                byteStringPop = new C15408c(this.f66381a.pop(), byteStringPop);
            }
            return byteStringPop;
        }

        /* JADX INFO: renamed from: c */
        public final void m92278c(ByteString byteString) {
            if (byteString.mo92051p()) {
                m92280e(byteString);
                return;
            }
            if (!(byteString instanceof C15408c)) {
                String strValueOf = String.valueOf(byteString.getClass());
                pyk.m174297a(strValueOf.length() + 49, "Has a new type of ByteString been created? Found ", strValueOf);
            } else {
                C15408c c15408c = (C15408c) byteString;
                m92278c(c15408c.f66376c);
                m92278c(c15408c.f66377d);
            }
        }

        /* JADX INFO: renamed from: d */
        public final int m92279d(int i) {
            int iBinarySearch = Arrays.binarySearch(C15408c.f66374h, i);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        /* JADX INFO: renamed from: e */
        public final void m92280e(ByteString byteString) {
            int iM92279d = m92279d(byteString.size());
            int i = C15408c.f66374h[iM92279d + 1];
            if (this.f66381a.isEmpty() || this.f66381a.peek().size() >= i) {
                this.f66381a.push(byteString);
                return;
            }
            int i2 = C15408c.f66374h[iM92279d];
            ByteString byteStringPop = this.f66381a.pop();
            while (true) {
                if (this.f66381a.isEmpty() || this.f66381a.peek().size() >= i2) {
                    break;
                } else {
                    byteStringPop = new C15408c(this.f66381a.pop(), byteStringPop);
                }
            }
            C15408c c15408c = new C15408c(byteStringPop, byteString);
            while (!this.f66381a.isEmpty()) {
                if (this.f66381a.peek().size() >= C15408c.f66374h[m92279d(c15408c.size()) + 1]) {
                    break;
                } else {
                    c15408c = new C15408c(this.f66381a.pop(), c15408c);
                }
            }
            this.f66381a.push(c15408c);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$c */
    public static class c implements Iterator<C15407b> {

        /* JADX INFO: renamed from: a */
        public final Stack<C15408c> f66382a;

        /* JADX INFO: renamed from: b */
        public C15407b f66383b;

        public c(ByteString byteString) {
            this.f66382a = new Stack<>();
            this.f66383b = m92281a(byteString);
        }

        /* JADX INFO: renamed from: a */
        public final C15407b m92281a(ByteString byteString) {
            while (byteString instanceof C15408c) {
                C15408c c15408c = (C15408c) byteString;
                this.f66382a.push(c15408c);
                byteString = c15408c.f66376c;
            }
            return (C15407b) byteString;
        }

        /* JADX INFO: renamed from: b */
        public final C15407b m92282b() {
            while (!this.f66382a.isEmpty()) {
                C15407b c15407bM92281a = m92281a(this.f66382a.pop().f66377d);
                if (!c15407bM92281a.isEmpty()) {
                    return c15407bM92281a;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C15407b next() {
            C15407b c15407b = this.f66383b;
            if (c15407b != null) {
                this.f66383b = m92282b();
                return c15407b;
            }
            mor.m159308a();
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66383b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$d */
    public class d implements ByteString.ByteIterator {

        /* JADX INFO: renamed from: a */
        public final c f66384a;

        /* JADX INFO: renamed from: b */
        public ByteString.ByteIterator f66385b;

        /* JADX INFO: renamed from: c */
        public int f66386c;

        public d() {
            c cVar = new c(C15408c.this);
            this.f66384a = cVar;
            this.f66385b = cVar.next().iterator();
            this.f66386c = C15408c.this.size();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66386c > 0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            if (!this.f66385b.hasNext()) {
                this.f66385b = this.f66384a.next().iterator();
            }
            this.f66386c--;
            return this.f66385b.nextByte();
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
        f66374h = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f66374h;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public C15408c(ByteString byteString, ByteString byteString2) {
        this.f66380g = 0;
        this.f66376c = byteString;
        this.f66377d = byteString2;
        int size = byteString.size();
        this.f66378e = size;
        this.f66375b = size + byteString2.size();
        this.f66379f = Math.max(byteString.mo92050o(), byteString2.mo92050o()) + 1;
    }

    /* JADX INFO: renamed from: J */
    public static ByteString m92273J(ByteString byteString, ByteString byteString2) {
        C15408c c15408c = byteString instanceof C15408c ? (C15408c) byteString : null;
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return m92274K(byteString, byteString2);
        }
        if (c15408c != null && c15408c.f66377d.size() + byteString2.size() < 128) {
            return new C15408c(c15408c.f66376c, m92274K(c15408c.f66377d, byteString2));
        }
        if (c15408c == null || c15408c.f66376c.mo92050o() <= c15408c.f66377d.mo92050o() || c15408c.mo92050o() <= byteString2.mo92050o()) {
            return size >= f66374h[Math.max(byteString.mo92050o(), byteString2.mo92050o()) + 1] ? new C15408c(byteString, byteString2) : new b().m92277b(byteString, byteString2);
        }
        return new C15408c(c15408c.f66376c, new C15408c(c15408c.f66377d, byteString2));
    }

    /* JADX INFO: renamed from: K */
    public static C15407b m92274K(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.m92048j(bArr, 0, 0, size);
        byteString2.m92048j(bArr, 0, size, size2);
        return new C15407b(bArr);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: C */
    public String mo92043C(String str) throws UnsupportedEncodingException {
        return new String(m92042A(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: F */
    public void mo92046F(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.f66378e;
        if (i3 <= i4) {
            this.f66376c.mo92046F(outputStream, i, i2);
        } else {
            if (i >= i4) {
                this.f66377d.mo92046F(outputStream, i - i4, i2);
                return;
            }
            int i5 = i4 - i;
            this.f66376c.mo92046F(outputStream, i, i5);
            this.f66377d.mo92046F(outputStream, 0, i2 - i5);
        }
    }

    /* JADX INFO: renamed from: L */
    public final boolean m92275L(ByteString byteString) {
        c cVar = new c(this);
        C15407b next = cVar.next();
        c cVar2 = new c(byteString);
        C15407b next2 = cVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next.size() - i;
            int size2 = next2.size() - i2;
            int iMin = Math.min(size, size2);
            if (!(i == 0 ? next.m92268H(next2, i2, iMin) : next2.m92268H(next, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.f66375b;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                wpg0.m207458a();
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
        int iMo92057z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.f66375b != byteString.size()) {
            return false;
        }
        if (this.f66375b == 0) {
            return true;
        }
        if (this.f66380g == 0 || (iMo92057z = byteString.mo92057z()) == 0 || this.f66380g == iMo92057z) {
            return m92275L(byteString);
        }
        return false;
    }

    public int hashCode() {
        int iMo92055x = this.f66380g;
        if (iMo92055x == 0) {
            int i = this.f66375b;
            iMo92055x = mo92055x(i, 0, i);
            if (iMo92055x == 0) {
                iMo92055x = 1;
            }
            this.f66380g = iMo92055x;
        }
        return iMo92055x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: l */
    public void mo92049l(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.f66378e;
        if (i4 <= i5) {
            this.f66376c.mo92049l(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.f66377d.mo92049l(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.f66376c.mo92049l(bArr, i, i2, i6);
            this.f66377d.mo92049l(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: o */
    public int mo92050o() {
        return this.f66379f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: p */
    public boolean mo92051p() {
        return this.f66375b >= f66374h[this.f66379f];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: r */
    public boolean mo92052r() {
        int iMo92056y = this.f66376c.mo92056y(0, 0, this.f66378e);
        ByteString byteString = this.f66377d;
        return byteString.mo92056y(iMo92056y, 0, byteString.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: s */
    public ByteString.ByteIterator iterator() {
        return new d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f66375b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: v */
    public CodedInputStream mo92054v() {
        return CodedInputStream.m92065g(new e());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: x */
    public int mo92055x(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f66378e;
        if (i4 <= i5) {
            return this.f66376c.mo92055x(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f66377d.mo92055x(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f66377d.mo92055x(this.f66376c.mo92055x(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: y */
    public int mo92056y(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f66378e;
        if (i4 <= i5) {
            return this.f66376c.mo92056y(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f66377d.mo92056y(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f66377d.mo92056y(this.f66376c.mo92056y(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: z */
    public int mo92057z() {
        return this.f66380g;
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$e */
    public class e extends InputStream {

        /* JADX INFO: renamed from: a */
        public c f66388a;

        /* JADX INFO: renamed from: b */
        public C15407b f66389b;

        /* JADX INFO: renamed from: c */
        public int f66390c;

        /* JADX INFO: renamed from: d */
        public int f66391d;

        /* JADX INFO: renamed from: e */
        public int f66392e;

        /* JADX INFO: renamed from: f */
        public int f66393f;

        public e() {
            m92286m();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return C15408c.this.size() - (this.f66392e + this.f66391d);
        }

        /* JADX INFO: renamed from: k */
        public final void m92285k() {
            if (this.f66389b != null) {
                int i = this.f66391d;
                int i2 = this.f66390c;
                if (i == i2) {
                    this.f66392e += i2;
                    this.f66391d = 0;
                    if (!this.f66388a.hasNext()) {
                        this.f66389b = null;
                        this.f66390c = 0;
                    } else {
                        C15407b next = this.f66388a.next();
                        this.f66389b = next;
                        this.f66390c = next.size();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: m */
        public final void m92286m() {
            c cVar = new c(C15408c.this);
            this.f66388a = cVar;
            C15407b next = cVar.next();
            this.f66389b = next;
            this.f66390c = next.size();
            this.f66391d = 0;
            this.f66392e = 0;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.f66393f = this.f66392e + this.f66391d;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        /* JADX INFO: renamed from: n */
        public final int m92287n(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (i3 > 0) {
                m92285k();
                if (this.f66389b == null) {
                    if (i3 != i2) {
                        break;
                    }
                    return -1;
                }
                int iMin = Math.min(this.f66390c - this.f66391d, i3);
                if (bArr != null) {
                    this.f66389b.m92048j(bArr, this.f66391d, i, iMin);
                    i += iMin;
                }
                this.f66391d += iMin;
                i3 -= iMin;
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            m92285k();
            C15407b c15407b = this.f66389b;
            if (c15407b == null) {
                return -1;
            }
            int i = this.f66391d;
            this.f66391d = i + 1;
            return c15407b.mo92264G(i) & 255;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            m92286m();
            m92287n(null, 0, this.f66393f);
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
            return m92287n(null, 0, (int) j);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                return m92287n(bArr, i, i2);
            }
            onl.m168333a();
            return 0;
        }
    }
}
