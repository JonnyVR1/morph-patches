package kotlin.reflect.jvm.internal.impl.protobuf;

import org.slf4j.Marker;
import p149l.js5;
import p149l.lmr;
import p149l.of80;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a */
/* JADX INFO: loaded from: classes2.dex */
public class C15299a extends C15300b {

    /* JADX INFO: renamed from: d */
    public final int f65690d;

    /* JADX INFO: renamed from: e */
    public final int f65691e;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$b */
    public class b implements ByteString.ByteIterator {

        /* JADX INFO: renamed from: a */
        public int f65692a;

        /* JADX INFO: renamed from: b */
        public final int f65693b;

        public b() {
            int iMo91374I = C15299a.this.mo91374I();
            this.f65692a = iMo91374I;
            this.f65693b = iMo91374I + C15299a.this.size();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f65692a < this.f65693b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            int i = this.f65692a;
            if (i >= this.f65693b) {
                lmr.m150601a();
                return (byte) 0;
            }
            byte[] bArr = C15299a.this.f65695b;
            this.f65692a = i + 1;
            return bArr[i];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C15299a(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            of80.m164058a(29, "Offset too small: ", i);
            throw null;
        }
        if (i2 < 0) {
            of80.m164058a(29, "Length too small: ", i);
            throw null;
        }
        if (((long) i) + ((long) i2) > bArr.length) {
            js5.m142992a(48, "Offset+Length too large: ", i, Marker.ANY_NON_NULL_MARKER, i2);
            throw null;
        }
        this.f65690d = i;
        this.f65691e = i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C15300b
    /* JADX INFO: renamed from: G */
    public byte mo91373G(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(28);
            sb.append("Index too small: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        if (i < size()) {
            return this.f65695b[this.f65690d + i];
        }
        int size = size();
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("Index too large: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C15300b
    /* JADX INFO: renamed from: I */
    public int mo91374I() {
        return this.f65690d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C15300b, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: l */
    public void mo91158l(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f65695b, mo91374I() + i, bArr, i2, i3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C15300b, kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: s */
    public ByteString.ByteIterator iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C15300b, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f65691e;
    }
}
