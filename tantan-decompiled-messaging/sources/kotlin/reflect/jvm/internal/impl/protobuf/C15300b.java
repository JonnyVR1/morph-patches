package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import p149l.kgj0;
import p149l.lck0;
import p149l.zvk;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.b */
/* JADX INFO: loaded from: classes2.dex */
public class C15300b extends ByteString {

    /* JADX INFO: renamed from: b */
    public final byte[] f65695b;

    /* JADX INFO: renamed from: c */
    public int f65696c = 0;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.b$b */
    public class b implements ByteString.ByteIterator {

        /* JADX INFO: renamed from: a */
        public int f65697a;

        /* JADX INFO: renamed from: b */
        public final int f65698b;

        public b() {
            this.f65697a = 0;
            this.f65698b = C15300b.this.size();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f65697a < this.f65698b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            try {
                byte[] bArr = C15300b.this.f65695b;
                int i = this.f65697a;
                this.f65697a = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                kgj0.m145892a(e.getMessage());
                return (byte) 0;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C15300b(byte[] bArr) {
        this.f65695b = bArr;
    }

    /* JADX INFO: renamed from: J */
    public static int m91376J(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: C */
    public String mo91152C(String str) throws UnsupportedEncodingException {
        return new String(this.f65695b, mo91374I(), size(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: F */
    public void mo91155F(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f65695b, mo91374I() + i, i2);
    }

    /* JADX INFO: renamed from: G */
    public byte mo91373G(int i) {
        return this.f65695b[i];
    }

    /* JADX INFO: renamed from: H */
    public boolean m91377H(C15300b c15300b, int i, int i2) {
        if (i2 > c15300b.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i + i2 > c15300b.size()) {
            int size2 = c15300b.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.f65695b;
        byte[] bArr2 = c15300b.f65695b;
        int iMo91374I = mo91374I() + i2;
        int iMo91374I2 = mo91374I();
        int iMo91374I3 = c15300b.mo91374I() + i;
        while (iMo91374I2 < iMo91374I) {
            if (bArr[iMo91374I2] != bArr2[iMo91374I3]) {
                return false;
            }
            iMo91374I2++;
            iMo91374I3++;
        }
        return true;
    }

    /* JADX INFO: renamed from: I */
    public int mo91374I() {
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
        if (obj instanceof C15300b) {
            return m91377H((C15300b) obj, 0, size());
        }
        if (obj instanceof C15301c) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        zvk.m220414a(strValueOf.length() + 49, "Has a new type of ByteString been created? Found ", strValueOf);
        return false;
    }

    public int hashCode() {
        int iMo91164x = this.f65696c;
        if (iMo91164x == 0) {
            int size = size();
            iMo91164x = mo91164x(size, 0, size);
            if (iMo91164x == 0) {
                iMo91164x = 1;
            }
            this.f65696c = iMo91164x;
        }
        return iMo91164x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: l */
    public void mo91158l(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f65695b, i, bArr, i2, i3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: o */
    public int mo91159o() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: p */
    public boolean mo91160p() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: r */
    public boolean mo91161r() {
        int iMo91374I = mo91374I();
        return lck0.m149326f(this.f65695b, iMo91374I, size() + iMo91374I);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: s */
    public ByteString.ByteIterator iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f65695b.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: v */
    public CodedInputStream mo91163v() {
        return CodedInputStream.m91175h(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: x */
    public int mo91164x(int i, int i2, int i3) {
        return m91376J(i, this.f65695b, mo91374I() + i2, i3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: y */
    public int mo91165y(int i, int i2, int i3) {
        int iMo91374I = mo91374I() + i2;
        return lck0.m149327g(i, this.f65695b, iMo91374I, i3 + iMo91374I);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: z */
    public int mo91166z() {
        return this.f65696c;
    }
}
