package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import p153l.npj0;
import p153l.pyk;
import p153l.rlk0;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.b */
/* JADX INFO: loaded from: classes2.dex */
public class C15407b extends ByteString {

    /* JADX INFO: renamed from: b */
    public final byte[] f66369b;

    /* JADX INFO: renamed from: c */
    public int f66370c = 0;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.b$b */
    public class b implements ByteString.ByteIterator {

        /* JADX INFO: renamed from: a */
        public int f66371a;

        /* JADX INFO: renamed from: b */
        public final int f66372b;

        public b() {
            this.f66371a = 0;
            this.f66372b = C15407b.this.size();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66371a < this.f66372b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            try {
                byte[] bArr = C15407b.this.f66369b;
                int i = this.f66371a;
                this.f66371a = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                npj0.m164229a(e.getMessage());
                return (byte) 0;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C15407b(byte[] bArr) {
        this.f66369b = bArr;
    }

    /* JADX INFO: renamed from: J */
    public static int m92267J(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: C */
    public String mo92043C(String str) throws UnsupportedEncodingException {
        return new String(this.f66369b, mo92265I(), size(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: F */
    public void mo92046F(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f66369b, mo92265I() + i, i2);
    }

    /* JADX INFO: renamed from: G */
    public byte mo92264G(int i) {
        return this.f66369b[i];
    }

    /* JADX INFO: renamed from: H */
    public boolean m92268H(C15407b c15407b, int i, int i2) {
        if (i2 > c15407b.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i + i2 > c15407b.size()) {
            int size2 = c15407b.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.f66369b;
        byte[] bArr2 = c15407b.f66369b;
        int iMo92265I = mo92265I() + i2;
        int iMo92265I2 = mo92265I();
        int iMo92265I3 = c15407b.mo92265I() + i;
        while (iMo92265I2 < iMo92265I) {
            if (bArr[iMo92265I2] != bArr2[iMo92265I3]) {
                return false;
            }
            iMo92265I2++;
            iMo92265I3++;
        }
        return true;
    }

    /* JADX INFO: renamed from: I */
    public int mo92265I() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C15407b) {
            return m92268H((C15407b) obj, 0, size());
        }
        if (obj instanceof C15408c) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        pyk.m174297a(strValueOf.length() + 49, "Has a new type of ByteString been created? Found ", strValueOf);
        return false;
    }

    public int hashCode() {
        int iMo92055x = this.f66370c;
        if (iMo92055x == 0) {
            int size = size();
            iMo92055x = mo92055x(size, 0, size);
            if (iMo92055x == 0) {
                iMo92055x = 1;
            }
            this.f66370c = iMo92055x;
        }
        return iMo92055x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: l */
    public void mo92049l(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f66369b, i, bArr, i2, i3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: o */
    public int mo92050o() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: p */
    public boolean mo92051p() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: r */
    public boolean mo92052r() {
        int iMo92265I = mo92265I();
        return rlk0.m182001f(this.f66369b, iMo92265I, size() + iMo92265I);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: s */
    public ByteString.ByteIterator iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f66369b.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: v */
    public CodedInputStream mo92054v() {
        return CodedInputStream.m92066h(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: x */
    public int mo92055x(int i, int i2, int i3) {
        return m92267J(i, this.f66369b, mo92265I() + i2, i3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: y */
    public int mo92056y(int i, int i2, int i3) {
        int iMo92265I = mo92265I() + i2;
        return rlk0.m182002g(i, this.f66369b, iMo92265I, i3 + iMo92265I);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: z */
    public int mo92057z() {
        return this.f66370c;
    }
}
