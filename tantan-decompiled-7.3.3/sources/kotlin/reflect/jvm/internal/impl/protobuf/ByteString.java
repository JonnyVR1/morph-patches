package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.slf4j.Marker;
import p153l.nt5;
import p153l.or3;
import p153l.vtq0;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ByteString implements Iterable<Byte> {

    /* JADX INFO: renamed from: a */
    public static final ByteString f66289a = new C15407b(new byte[0]);

    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    /* JADX INFO: renamed from: a */
    public static ByteString m92036a(Iterator<ByteString> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return m92036a(it, i2).m92047c(m92036a(it, i - i2));
    }

    /* JADX INFO: renamed from: f */
    public static ByteString m92037f(Iterable<ByteString> iterable) {
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
        return arrayList.isEmpty() ? f66289a : m92036a(arrayList.iterator(), arrayList.size());
    }

    /* JADX INFO: renamed from: g */
    public static ByteString m92038g(byte[] bArr) {
        return m92039h(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: h */
    public static ByteString m92039h(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C15407b(bArr2);
    }

    /* JADX INFO: renamed from: i */
    public static ByteString m92040i(String str) {
        try {
            return new C15407b(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            vtq0.m202761a("UTF-8 not supported?", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public static Output m92041w() {
        return new Output(128);
    }

    /* JADX INFO: renamed from: A */
    public byte[] m92042A() {
        int size = size();
        if (size == 0) {
            return Internal.f66343a;
        }
        byte[] bArr = new byte[size];
        mo92049l(bArr, 0, 0, size);
        return bArr;
    }

    /* JADX INFO: renamed from: C */
    public abstract String mo92043C(String str) throws UnsupportedEncodingException;

    /* JADX INFO: renamed from: D */
    public String m92044D() {
        try {
            return mo92043C("UTF-8");
        } catch (UnsupportedEncodingException e) {
            vtq0.m202761a("UTF-8 not supported?", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: E */
    public void m92045E(OutputStream outputStream, int i, int i2) throws IOException {
        if (i < 0) {
            or3.m168856a(30, "Source offset < 0: ", i);
            return;
        }
        if (i2 < 0) {
            or3.m168856a(23, "Length < 0: ", i2);
            return;
        }
        int i3 = i + i2;
        if (i3 > size()) {
            or3.m168856a(39, "Source end offset exceeded: ", i3);
        } else if (i2 > 0) {
            mo92046F(outputStream, i, i2);
        }
    }

    /* JADX INFO: renamed from: F */
    public abstract void mo92046F(OutputStream outputStream, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: c */
    public ByteString m92047c(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return C15408c.m92273J(this, byteString);
        }
        nt5.m164689a(53, "ByteString would be too long: ", size, Marker.ANY_NON_NULL_MARKER, size2);
        return null;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: j */
    public void m92048j(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            or3.m168856a(30, "Source offset < 0: ", i);
            return;
        }
        if (i2 < 0) {
            or3.m168856a(30, "Target offset < 0: ", i2);
            return;
        }
        if (i3 < 0) {
            or3.m168856a(23, "Length < 0: ", i3);
            return;
        }
        int i4 = i + i3;
        if (i4 > size()) {
            or3.m168856a(34, "Source end offset < 0: ", i4);
            return;
        }
        int i5 = i2 + i3;
        if (i5 > bArr.length) {
            or3.m168856a(34, "Target end offset < 0: ", i5);
        } else if (i3 > 0) {
            mo92049l(bArr, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo92049l(byte[] bArr, int i, int i2, int i3);

    /* JADX INFO: renamed from: o */
    public abstract int mo92050o();

    /* JADX INFO: renamed from: p */
    public abstract boolean mo92051p();

    /* JADX INFO: renamed from: r */
    public abstract boolean mo92052r();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public abstract ByteIterator iterator();

    public abstract int size();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* JADX INFO: renamed from: v */
    public abstract CodedInputStream mo92054v();

    /* JADX INFO: renamed from: x */
    public abstract int mo92055x(int i, int i2, int i3);

    /* JADX INFO: renamed from: y */
    public abstract int mo92056y(int i, int i2, int i3);

    /* JADX INFO: renamed from: z */
    public abstract int mo92057z();

    public static final class Output extends OutputStream {

        /* JADX INFO: renamed from: f */
        public static final byte[] f66290f = new byte[0];

        /* JADX INFO: renamed from: a */
        public final int f66291a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<ByteString> f66292b;

        /* JADX INFO: renamed from: c */
        public int f66293c;

        /* JADX INFO: renamed from: d */
        public byte[] f66294d;

        /* JADX INFO: renamed from: e */
        public int f66295e;

        public Output(int i) {
            if (i < 0) {
                wg3.m206174a("Buffer size < 0");
                throw null;
            }
            this.f66291a = i;
            this.f66292b = new ArrayList<>();
            this.f66294d = new byte[i];
        }

        /* JADX INFO: renamed from: b */
        public final byte[] m92058b(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        /* JADX INFO: renamed from: d */
        public final void m92059d(int i) {
            this.f66292b.add(new C15407b(this.f66294d));
            int length = this.f66293c + this.f66294d.length;
            this.f66293c = length;
            this.f66294d = new byte[Math.max(this.f66291a, Math.max(i, length >>> 1))];
            this.f66295e = 0;
        }

        /* JADX INFO: renamed from: k */
        public final void m92060k() {
            int i = this.f66295e;
            byte[] bArr = this.f66294d;
            if (i >= bArr.length) {
                this.f66292b.add(new C15407b(this.f66294d));
                this.f66294d = f66290f;
            } else if (i > 0) {
                this.f66292b.add(new C15407b(m92058b(bArr, i)));
            }
            this.f66293c += this.f66295e;
            this.f66295e = 0;
        }

        /* JADX INFO: renamed from: m */
        public synchronized ByteString m92061m() {
            m92060k();
            return ByteString.m92037f(this.f66292b);
        }

        public synchronized int size() {
            return this.f66293c + this.f66295e;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
            try {
                byte[] bArr2 = this.f66294d;
                int length = bArr2.length;
                int i3 = this.f66295e;
                if (i2 <= length - i3) {
                    System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.f66295e += i2;
                } else {
                    int length2 = bArr2.length - i3;
                    System.arraycopy(bArr, i, bArr2, i3, length2);
                    int i4 = i2 - length2;
                    m92059d(i4);
                    System.arraycopy(bArr, i + length2, this.f66294d, 0, i4);
                    this.f66295e = i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            try {
                if (this.f66295e == this.f66294d.length) {
                    m92059d(1);
                }
                byte[] bArr = this.f66294d;
                int i2 = this.f66295e;
                this.f66295e = i2 + 1;
                bArr[i2] = (byte) i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
