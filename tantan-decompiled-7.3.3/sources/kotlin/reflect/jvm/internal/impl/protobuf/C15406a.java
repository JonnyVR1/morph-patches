package kotlin.reflect.jvm.internal.impl.protobuf;

import org.slf4j.Marker;
import p153l.mor;
import p153l.nt5;
import p153l.tn80;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a */
/* JADX INFO: loaded from: classes2.dex */
public class C15406a extends C15407b {

    /* JADX INFO: renamed from: d */
    public final int f66364d;

    /* JADX INFO: renamed from: e */
    public final int f66365e;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$b */
    public class b implements ByteString.ByteIterator {

        /* JADX INFO: renamed from: a */
        public int f66366a;

        /* JADX INFO: renamed from: b */
        public final int f66367b;

        public b() {
            int iMo92265I = C15406a.this.mo92265I();
            this.f66366a = iMo92265I;
            this.f66367b = iMo92265I + C15406a.this.size();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66366a < this.f66367b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            int i = this.f66366a;
            if (i >= this.f66367b) {
                mor.m159308a();
                return (byte) 0;
            }
            byte[] bArr = C15406a.this.f66369b;
            this.f66366a = i + 1;
            return bArr[i];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C15406a(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            tn80.m191877a(29, "Offset too small: ", i);
            throw null;
        }
        if (i2 < 0) {
            tn80.m191877a(29, "Length too small: ", i);
            throw null;
        }
        if (((long) i) + ((long) i2) > bArr.length) {
            nt5.m164689a(48, "Offset+Length too large: ", i, Marker.ANY_NON_NULL_MARKER, i2);
            throw null;
        }
        this.f66364d = i;
        this.f66365e = i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C15407b
    /* JADX INFO: renamed from: G */
    public byte mo92264G(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(28);
            sb.append("Index too small: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        if (i < size()) {
            return this.f66369b[this.f66364d + i];
        }
        int size = size();
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("Index too large: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C15407b
    /* JADX INFO: renamed from: I */
    public int mo92265I() {
        return this.f66364d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C15407b, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: l */
    public void mo92049l(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f66369b, mo92265I() + i, bArr, i2, i3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C15407b, kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: s */
    public ByteString.ByteIterator iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C15407b, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f66365e;
    }
}
