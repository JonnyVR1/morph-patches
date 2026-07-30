package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p153l.bmk0;
import p153l.e6c;
import p153l.ig60;
import p153l.nj0;
import p153l.oj0;
import p153l.qfj0;
import p153l.vg3;
import p153l.w11;
import p153l.wxb;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.p */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class C1995p {

    /* JADX INFO: renamed from: a */
    public final oj0 f8787a;

    /* JADX INFO: renamed from: b */
    public final int f8788b;

    /* JADX INFO: renamed from: c */
    public final ig60 f8789c;

    /* JADX INFO: renamed from: d */
    public a f8790d;

    /* JADX INFO: renamed from: e */
    public a f8791e;

    /* JADX INFO: renamed from: f */
    public a f8792f;

    /* JADX INFO: renamed from: g */
    public long f8793g;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.p$a */
    public static final class a implements oj0.InterfaceC19147a {

        /* JADX INFO: renamed from: a */
        public long f8794a;

        /* JADX INFO: renamed from: b */
        public long f8795b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public nj0 f8796c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public a f8797d;

        public a(long j, int i) {
            m11462d(j, i);
        }

        @Override // p153l.oj0.InterfaceC19147a
        /* JADX INFO: renamed from: a */
        public nj0 mo11459a() {
            return (nj0) w11.m204369e(this.f8796c);
        }

        /* JADX INFO: renamed from: b */
        public a m11460b() {
            this.f8796c = null;
            a aVar = this.f8797d;
            this.f8797d = null;
            return aVar;
        }

        /* JADX INFO: renamed from: c */
        public void m11461c(nj0 nj0Var, a aVar) {
            this.f8796c = nj0Var;
            this.f8797d = aVar;
        }

        /* JADX INFO: renamed from: d */
        public void m11462d(long j, int i) {
            w11.m204371g(this.f8796c == null);
            this.f8794a = j;
            this.f8795b = j + ((long) i);
        }

        /* JADX INFO: renamed from: e */
        public int m11463e(long j) {
            return ((int) (j - this.f8794a)) + this.f8796c.f142253b;
        }

        @Override // p153l.oj0.InterfaceC19147a
        @Nullable
        public oj0.InterfaceC19147a next() {
            a aVar = this.f8797d;
            if (aVar == null || aVar.f8796c == null) {
                return null;
            }
            return aVar;
        }
    }

    public C1995p(oj0 oj0Var) {
        this.f8787a = oj0Var;
        int iMo135331e = oj0Var.mo135331e();
        this.f8788b = iMo135331e;
        this.f8789c = new ig60(32);
        a aVar = new a(0L, iMo135331e);
        this.f8790d = aVar;
        this.f8791e = aVar;
        this.f8792f = aVar;
    }

    /* JADX INFO: renamed from: d */
    public static a m11442d(a aVar, long j) {
        while (j >= aVar.f8795b) {
            aVar = aVar.f8797d;
        }
        return aVar;
    }

    /* JADX INFO: renamed from: i */
    public static a m11443i(a aVar, long j, ByteBuffer byteBuffer, int i) {
        a aVarM11442d = m11442d(aVar, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (aVarM11442d.f8795b - j));
            byteBuffer.put(aVarM11442d.f8796c.f142252a, aVarM11442d.m11463e(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == aVarM11442d.f8795b) {
                aVarM11442d = aVarM11442d.f8797d;
            }
        }
        return aVarM11442d;
    }

    /* JADX INFO: renamed from: j */
    public static a m11444j(a aVar, long j, byte[] bArr, int i) {
        a aVarM11442d = m11442d(aVar, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (aVarM11442d.f8795b - j));
            System.arraycopy(aVarM11442d.f8796c.f142252a, aVarM11442d.m11463e(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == aVarM11442d.f8795b) {
                aVarM11442d = aVarM11442d.f8797d;
            }
        }
        return aVarM11442d;
    }

    /* JADX INFO: renamed from: k */
    public static a m11445k(a aVar, DecoderInputBuffer decoderInputBuffer, C1996q.b bVar, ig60 ig60Var) {
        long j = bVar.f8832b;
        int iM139801N = 1;
        ig60Var.m139804Q(1);
        a aVarM11444j = m11444j(aVar, j, ig60Var.m139815e(), 1);
        long j2 = j + 1;
        byte b = ig60Var.m139815e()[0];
        boolean z = (b & 128) != 0;
        int i = b & 127;
        wxb wxbVar = decoderInputBuffer.f7411b;
        byte[] bArr = wxbVar.f191469a;
        if (bArr == null) {
            wxbVar.f191469a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarM11444j2 = m11444j(aVarM11444j, j2, wxbVar.f191469a, i);
        long j3 = j2 + ((long) i);
        if (z) {
            ig60Var.m139804Q(2);
            aVarM11444j2 = m11444j(aVarM11444j2, j3, ig60Var.m139815e(), 2);
            j3 += 2;
            iM139801N = ig60Var.m139801N();
        }
        int i2 = iM139801N;
        int[] iArr = wxbVar.f191472d;
        if (iArr == null || iArr.length < i2) {
            iArr = new int[i2];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = wxbVar.f191473e;
        if (iArr3 == null || iArr3.length < i2) {
            iArr3 = new int[i2];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = i2 * 6;
            ig60Var.m139804Q(i3);
            aVarM11444j2 = m11444j(aVarM11444j2, j3, ig60Var.m139815e(), i3);
            j3 += (long) i3;
            ig60Var.m139808U(0);
            for (int i4 = 0; i4 < i2; i4++) {
                iArr2[i4] = ig60Var.m139801N();
                iArr4[i4] = ig60Var.m139799L();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f8831a - ((int) (j3 - bVar.f8832b));
        }
        qfj0.C19562a c19562a = (qfj0.C19562a) bmk0.m105144j(bVar.f8833c);
        wxbVar.m208398c(i2, iArr2, iArr4, c19562a.f157306b, wxbVar.f191469a, c19562a.f157305a, c19562a.f157307c, c19562a.f157308d);
        long j4 = bVar.f8832b;
        int i5 = (int) (j3 - j4);
        bVar.f8832b = j4 + ((long) i5);
        bVar.f8831a -= i5;
        return aVarM11444j2;
    }

    /* JADX INFO: renamed from: l */
    public static a m11446l(a aVar, DecoderInputBuffer decoderInputBuffer, C1996q.b bVar, ig60 ig60Var) {
        if (decoderInputBuffer.m9861x()) {
            aVar = m11445k(aVar, decoderInputBuffer, bVar, ig60Var);
        }
        if (!decoderInputBuffer.m97777n()) {
            decoderInputBuffer.m9859v(bVar.f8831a);
            return m11443i(aVar, bVar.f8832b, decoderInputBuffer.f7412c, bVar.f8831a);
        }
        ig60Var.m139804Q(4);
        a aVarM11444j = m11444j(aVar, bVar.f8832b, ig60Var.m139815e(), 4);
        int iM139799L = ig60Var.m139799L();
        bVar.f8832b += 4;
        bVar.f8831a -= 4;
        decoderInputBuffer.m9859v(iM139799L);
        a aVarM11443i = m11443i(aVarM11444j, bVar.f8832b, decoderInputBuffer.f7412c, iM139799L);
        bVar.f8832b += (long) iM139799L;
        int i = bVar.f8831a - iM139799L;
        bVar.f8831a = i;
        decoderInputBuffer.m9862z(i);
        return m11443i(aVarM11443i, bVar.f8832b, decoderInputBuffer.f7415f, bVar.f8831a);
    }

    /* JADX INFO: renamed from: a */
    public final void m11447a(a aVar) {
        if (aVar.f8796c == null) {
            return;
        }
        this.f8787a.mo135327a(aVar);
        aVar.m11460b();
    }

    /* JADX INFO: renamed from: b */
    public void m11448b(long j) {
        a aVar;
        if (j == -1) {
            return;
        }
        while (true) {
            aVar = this.f8790d;
            if (j < aVar.f8795b) {
                break;
            }
            this.f8787a.mo135330d(aVar.f8796c);
            this.f8790d = this.f8790d.m11460b();
        }
        if (this.f8791e.f8794a < aVar.f8794a) {
            this.f8791e = aVar;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m11449c(long j) {
        a aVar;
        w11.m204365a(j <= this.f8793g);
        this.f8793g = j;
        if (j != 0) {
            a aVar2 = this.f8790d;
            if (j != aVar2.f8794a) {
                while (true) {
                    long j2 = this.f8793g;
                    long j3 = aVar2.f8795b;
                    aVar = aVar2.f8797d;
                    if (j2 <= j3) {
                        break;
                    } else {
                        aVar2 = aVar;
                    }
                }
                a aVar3 = (a) w11.m204369e(aVar);
                m11447a(aVar3);
                a aVar4 = new a(aVar2.f8795b, this.f8788b);
                aVar2.f8797d = aVar4;
                if (this.f8793g == aVar2.f8795b) {
                    aVar2 = aVar4;
                }
                this.f8792f = aVar2;
                if (this.f8791e == aVar3) {
                    this.f8791e = aVar4;
                    return;
                }
                return;
            }
        }
        m11447a(this.f8790d);
        a aVar5 = new a(this.f8793g, this.f8788b);
        this.f8790d = aVar5;
        this.f8791e = aVar5;
        this.f8792f = aVar5;
    }

    /* JADX INFO: renamed from: e */
    public long m11450e() {
        return this.f8793g;
    }

    /* JADX INFO: renamed from: f */
    public void m11451f(DecoderInputBuffer decoderInputBuffer, C1996q.b bVar) {
        m11446l(this.f8791e, decoderInputBuffer, bVar, this.f8789c);
    }

    /* JADX INFO: renamed from: g */
    public final void m11452g(int i) {
        long j = this.f8793g + ((long) i);
        this.f8793g = j;
        a aVar = this.f8792f;
        if (j == aVar.f8795b) {
            this.f8792f = aVar.f8797d;
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m11453h(int i) {
        a aVar = this.f8792f;
        if (aVar.f8796c == null) {
            aVar.m11461c(this.f8787a.mo135329c(), new a(this.f8792f.f8795b, this.f8788b));
        }
        return Math.min(i, (int) (this.f8792f.f8795b - this.f8793g));
    }

    /* JADX INFO: renamed from: m */
    public void m11454m(DecoderInputBuffer decoderInputBuffer, C1996q.b bVar) {
        this.f8791e = m11446l(this.f8791e, decoderInputBuffer, bVar, this.f8789c);
    }

    /* JADX INFO: renamed from: n */
    public void m11455n() {
        m11447a(this.f8790d);
        this.f8790d.m11462d(0L, this.f8788b);
        a aVar = this.f8790d;
        this.f8791e = aVar;
        this.f8792f = aVar;
        this.f8793g = 0L;
        this.f8787a.mo135328b();
    }

    /* JADX INFO: renamed from: o */
    public void m11456o() {
        this.f8791e = this.f8790d;
    }

    /* JADX INFO: renamed from: p */
    public int m11457p(e6c e6cVar, int i, boolean z) throws IOException {
        int iM11453h = m11453h(i);
        a aVar = this.f8792f;
        int i2 = e6cVar.read(aVar.f8796c.f142252a, aVar.m11463e(this.f8793g), iM11453h);
        if (i2 != -1) {
            m11452g(i2);
            return i2;
        }
        if (z) {
            return -1;
        }
        vg3.m201207a();
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public void m11458q(ig60 ig60Var, int i) {
        while (i > 0) {
            int iM11453h = m11453h(i);
            a aVar = this.f8792f;
            ig60Var.m139822l(aVar.f8796c.f142252a, aVar.m11463e(this.f8793g), iM11453h);
            i -= iM11453h;
            m11452g(iM11453h);
        }
    }
}
