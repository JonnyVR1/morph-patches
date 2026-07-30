package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.slf4j.Marker;
import p149l.ig3;
import p149l.js5;
import p149l.pkq0;
import p149l.pq3;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ByteString implements Iterable<Byte> {

    /* JADX INFO: renamed from: a */
    public static final ByteString f65615a = new C15300b(new byte[0]);

    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    /* JADX INFO: renamed from: a */
    public static ByteString m91145a(Iterator<ByteString> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return m91145a(it, i2).m91156c(m91145a(it, i - i2));
    }

    /* JADX INFO: renamed from: f */
    public static ByteString m91146f(Iterable<ByteString> iterable) {
        Collection arrayList;
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            arrayList = new ArrayList();
            Iterator<ByteString> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList.isEmpty() ? f65615a : m91145a(arrayList.iterator(), arrayList.size());
    }

    /* JADX INFO: renamed from: g */
    public static ByteString m91147g(byte[] bArr) {
        return m91148h(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: h */
    public static ByteString m91148h(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C15300b(bArr2);
    }

    /* JADX INFO: renamed from: i */
    public static ByteString m91149i(String str) {
        try {
            return new C15300b(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            pkq0.m170054a("UTF-8 not supported?", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public static Output m91150w() {
        return new Output(128);
    }

    /* JADX INFO: renamed from: A */
    public byte[] m91151A() {
        int size = size();
        if (size == 0) {
            return Internal.f65669a;
        }
        byte[] bArr = new byte[size];
        mo91158l(bArr, 0, 0, size);
        return bArr;
    }

    /* JADX INFO: renamed from: C */
    public abstract String mo91152C(String str) throws UnsupportedEncodingException;

    /* JADX INFO: renamed from: D */
    public String m91153D() {
        try {
            return mo91152C("UTF-8");
        } catch (UnsupportedEncodingException e) {
            pkq0.m170054a("UTF-8 not supported?", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: E */
    public void m91154E(OutputStream outputStream, int i, int i2) throws IOException {
        if (i < 0) {
            pq3.m170896a(30, "Source offset < 0: ", i);
            return;
        }
        if (i2 < 0) {
            pq3.m170896a(23, "Length < 0: ", i2);
            return;
        }
        int i3 = i + i2;
        if (i3 > size()) {
            pq3.m170896a(39, "Source end offset exceeded: ", i3);
        } else if (i2 > 0) {
            mo91155F(outputStream, i, i2);
        }
    }

    /* JADX INFO: renamed from: F */
    public abstract void mo91155F(OutputStream outputStream, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: c */
    public ByteString m91156c(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return C15301c.m91382J(this, byteString);
        }
        js5.m142992a(53, "ByteString would be too long: ", size, Marker.ANY_NON_NULL_MARKER, size2);
        return null;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: j */
    public void m91157j(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            pq3.m170896a(30, "Source offset < 0: ", i);
            return;
        }
        if (i2 < 0) {
            pq3.m170896a(30, "Target offset < 0: ", i2);
            return;
        }
        if (i3 < 0) {
            pq3.m170896a(23, "Length < 0: ", i3);
            return;
        }
        int i4 = i + i3;
        if (i4 > size()) {
            pq3.m170896a(34, "Source end offset < 0: ", i4);
            return;
        }
        int i5 = i2 + i3;
        if (i5 > bArr.length) {
            pq3.m170896a(34, "Target end offset < 0: ", i5);
        } else if (i3 > 0) {
            mo91158l(bArr, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo91158l(byte[] bArr, int i, int i2, int i3);

    /* JADX INFO: renamed from: o */
    public abstract int mo91159o();

    /* JADX INFO: renamed from: p */
    public abstract boolean mo91160p();

    /* JADX INFO: renamed from: r */
    public abstract boolean mo91161r();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public abstract ByteIterator iterator();

    public abstract int size();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* JADX INFO: renamed from: v */
    public abstract CodedInputStream mo91163v();

    /* JADX INFO: renamed from: x */
    public abstract int mo91164x(int i, int i2, int i3);

    /* JADX INFO: renamed from: y */
    public abstract int mo91165y(int i, int i2, int i3);

    /* JADX INFO: renamed from: z */
    public abstract int mo91166z();

    public static final class Output extends OutputStream {

        /* JADX INFO: renamed from: f */
        public static final byte[] f65616f = new byte[0];

        /* JADX INFO: renamed from: a */
        public final int f65617a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<ByteString> f65618b;

        /* JADX INFO: renamed from: c */
        public int f65619c;

        /* JADX INFO: renamed from: d */
        public byte[] f65620d;

        /* JADX INFO: renamed from: e */
        public int f65621e;

        public Output(int i) {
            if (i < 0) {
                ig3.m135964a("Buffer size < 0");
                throw null;
            }
            this.f65617a = i;
            this.f65618b = new ArrayList<>();
            this.f65620d = new byte[i];
        }

        /* JADX INFO: renamed from: b */
        public final byte[] m91167b(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        /* JADX INFO: renamed from: d */
        public final void m91168d(int i) {
            this.f65618b.add(new C15300b(this.f65620d));
            int length = this.f65619c + this.f65620d.length;
            this.f65619c = length;
            this.f65620d = new byte[Math.max(this.f65617a, Math.max(i, length >>> 1))];
            this.f65621e = 0;
        }

        /* JADX INFO: renamed from: k */
        public final void m91169k() {
            int i = this.f65621e;
            byte[] bArr = this.f65620d;
            if (i >= bArr.length) {
                this.f65618b.add(new C15300b(this.f65620d));
                this.f65620d = f65616f;
            } else if (i > 0) {
                this.f65618b.add(new C15300b(m91167b(bArr, i)));
            }
            this.f65619c += this.f65621e;
            this.f65621e = 0;
        }

        /* JADX INFO: renamed from: m */
        public synchronized ByteString m91170m() {
            m91169k();
            return ByteString.m91146f(this.f65618b);
        }

        public synchronized int size() {
            return this.f65619c + this.f65621e;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
            try {
                byte[] bArr2 = this.f65620d;
                int length = bArr2.length;
                int i3 = this.f65621e;
                if (i2 <= length - i3) {
                    System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.f65621e += i2;
                } else {
                    int length2 = bArr2.length - i3;
                    System.arraycopy(bArr, i, bArr2, i3, length2);
                    int i4 = i2 - length2;
                    m91168d(i4);
                    System.arraycopy(bArr, i + length2, this.f65620d, 0, i4);
                    this.f65621e = i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            try {
                if (this.f65621e == this.f65620d.length) {
                    m91168d(1);
                }
                byte[] bArr = this.f65620d;
                int i2 = this.f65621e;
                this.f65621e = i2 + 1;
                bArr[i2] = (byte) i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
