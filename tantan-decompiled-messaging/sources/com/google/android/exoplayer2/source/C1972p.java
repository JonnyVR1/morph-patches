package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p149l.d860;
import p149l.hg3;
import p149l.iwb;
import p149l.m6j0;
import p149l.p11;
import p149l.rj0;
import p149l.sj0;
import p149l.vck0;
import p149l.w4c;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.p */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class C1972p {

    /* JADX INFO: renamed from: a */
    public final sj0 f8750a;

    /* JADX INFO: renamed from: b */
    public final int f8751b;

    /* JADX INFO: renamed from: c */
    public final d860 f8752c;

    /* JADX INFO: renamed from: d */
    public a f8753d;

    /* JADX INFO: renamed from: e */
    public a f8754e;

    /* JADX INFO: renamed from: f */
    public a f8755f;

    /* JADX INFO: renamed from: g */
    public long f8756g;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.p$a */
    public static final class a implements sj0.InterfaceC19953a {

        /* JADX INFO: renamed from: a */
        public long f8757a;

        /* JADX INFO: renamed from: b */
        public long f8758b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public rj0 f8759c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public a f8760d;

        public a(long j, int i) {
            m11408d(j, i);
        }

        @Override // p149l.sj0.InterfaceC19953a
        /* JADX INFO: renamed from: a */
        public rj0 mo11405a() {
            return (rj0) p11.m167011e(this.f8759c);
        }

        /* JADX INFO: renamed from: b */
        public a m11406b() {
            this.f8759c = null;
            a aVar = this.f8760d;
            this.f8760d = null;
            return aVar;
        }

        /* JADX INFO: renamed from: c */
        public void m11407c(rj0 rj0Var, a aVar) {
            this.f8759c = rj0Var;
            this.f8760d = aVar;
        }

        /* JADX INFO: renamed from: d */
        public void m11408d(long j, int i) {
            p11.m167013g(this.f8759c == null);
            this.f8757a = j;
            this.f8758b = j + ((long) i);
        }

        /* JADX INFO: renamed from: e */
        public int m11409e(long j) {
            return ((int) (j - this.f8757a)) + this.f8759c.f159617b;
        }

        @Override // p149l.sj0.InterfaceC19953a
        @Nullable
        public sj0.InterfaceC19953a next() {
            a aVar = this.f8760d;
            if (aVar == null || aVar.f8759c == null) {
                return null;
            }
            return aVar;
        }
    }

    public C1972p(sj0 sj0Var) {
        this.f8750a = sj0Var;
        int iMo101998e = sj0Var.mo101998e();
        this.f8751b = iMo101998e;
        this.f8752c = new d860(32);
        a aVar = new a(0L, iMo101998e);
        this.f8753d = aVar;
        this.f8754e = aVar;
        this.f8755f = aVar;
    }

    /* JADX INFO: renamed from: d */
    public static a m11388d(a aVar, long j) {
        while (j >= aVar.f8758b) {
            aVar = aVar.f8760d;
        }
        return aVar;
    }

    /* JADX INFO: renamed from: i */
    public static a m11389i(a aVar, long j, ByteBuffer byteBuffer, int i) {
        a aVarM11388d = m11388d(aVar, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (aVarM11388d.f8758b - j));
            byteBuffer.put(aVarM11388d.f8759c.f159616a, aVarM11388d.m11409e(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == aVarM11388d.f8758b) {
                aVarM11388d = aVarM11388d.f8760d;
            }
        }
        return aVarM11388d;
    }

    /* JADX INFO: renamed from: j */
    public static a m11390j(a aVar, long j, byte[] bArr, int i) {
        a aVarM11388d = m11388d(aVar, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (aVarM11388d.f8758b - j));
            System.arraycopy(aVarM11388d.f8759c.f159616a, aVarM11388d.m11409e(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == aVarM11388d.f8758b) {
                aVarM11388d = aVarM11388d.f8760d;
            }
        }
        return aVarM11388d;
    }

    /* JADX INFO: renamed from: k */
    public static a m11391k(a aVar, DecoderInputBuffer decoderInputBuffer, C1973q.b bVar, d860 d860Var) {
        long j = bVar.f8795b;
        int iM110285N = 1;
        d860Var.m110288Q(1);
        a aVarM11390j = m11390j(aVar, j, d860Var.m110299e(), 1);
        long j2 = j + 1;
        byte b = d860Var.m110299e()[0];
        boolean z = (b & 128) != 0;
        int i = b & 127;
        iwb iwbVar = decoderInputBuffer.f7374b;
        byte[] bArr = iwbVar.f115245a;
        if (bArr == null) {
            iwbVar.f115245a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarM11390j2 = m11390j(aVarM11390j, j2, iwbVar.f115245a, i);
        long j3 = j2 + ((long) i);
        if (z) {
            d860Var.m110288Q(2);
            aVarM11390j2 = m11390j(aVarM11390j2, j3, d860Var.m110299e(), 2);
            j3 += 2;
            iM110285N = d860Var.m110285N();
        }
        int i2 = iM110285N;
        int[] iArr = iwbVar.f115248d;
        if (iArr == null || iArr.length < i2) {
            iArr = new int[i2];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = iwbVar.f115249e;
        if (iArr3 == null || iArr3.length < i2) {
            iArr3 = new int[i2];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = i2 * 6;
            d860Var.m110288Q(i3);
            aVarM11390j2 = m11390j(aVarM11390j2, j3, d860Var.m110299e(), i3);
            j3 += (long) i3;
            d860Var.m110292U(0);
            for (int i4 = 0; i4 < i2; i4++) {
                iArr2[i4] = d860Var.m110285N();
                iArr4[i4] = d860Var.m110283L();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f8794a - ((int) (j3 - bVar.f8795b));
        }
        m6j0.C18401a c18401a = (m6j0.C18401a) vck0.m197866j(bVar.f8796c);
        iwbVar.m138722c(i2, iArr2, iArr4, c18401a.f131701b, iwbVar.f115245a, c18401a.f131700a, c18401a.f131702c, c18401a.f131703d);
        long j4 = bVar.f8795b;
        int i5 = (int) (j3 - j4);
        bVar.f8795b = j4 + ((long) i5);
        bVar.f8794a -= i5;
        return aVarM11390j2;
    }

    /* JADX INFO: renamed from: l */
    public static a m11392l(a aVar, DecoderInputBuffer decoderInputBuffer, C1973q.b bVar, d860 d860Var) {
        if (decoderInputBuffer.m9807x()) {
            aVar = m11391k(aVar, decoderInputBuffer, bVar, d860Var);
        }
        if (!decoderInputBuffer.m154493n()) {
            decoderInputBuffer.m9805v(bVar.f8794a);
            return m11389i(aVar, bVar.f8795b, decoderInputBuffer.f7375c, bVar.f8794a);
        }
        d860Var.m110288Q(4);
        a aVarM11390j = m11390j(aVar, bVar.f8795b, d860Var.m110299e(), 4);
        int iM110283L = d860Var.m110283L();
        bVar.f8795b += 4;
        bVar.f8794a -= 4;
        decoderInputBuffer.m9805v(iM110283L);
        a aVarM11389i = m11389i(aVarM11390j, bVar.f8795b, decoderInputBuffer.f7375c, iM110283L);
        bVar.f8795b += (long) iM110283L;
        int i = bVar.f8794a - iM110283L;
        bVar.f8794a = i;
        decoderInputBuffer.m9808z(i);
        return m11389i(aVarM11389i, bVar.f8795b, decoderInputBuffer.f7378f, bVar.f8794a);
    }

    /* JADX INFO: renamed from: a */
    public final void m11393a(a aVar) {
        if (aVar.f8759c == null) {
            return;
        }
        this.f8750a.mo101994a(aVar);
        aVar.m11406b();
    }

    /* JADX INFO: renamed from: b */
    public void m11394b(long j) {
        a aVar;
        if (j == -1) {
            return;
        }
        while (true) {
            aVar = this.f8753d;
            if (j < aVar.f8758b) {
                break;
            }
            this.f8750a.mo101997d(aVar.f8759c);
            this.f8753d = this.f8753d.m11406b();
        }
        if (this.f8754e.f8757a < aVar.f8757a) {
            this.f8754e = aVar;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m11395c(long j) {
        a aVar;
        p11.m167007a(j <= this.f8756g);
        this.f8756g = j;
        if (j != 0) {
            a aVar2 = this.f8753d;
            if (j != aVar2.f8757a) {
                while (true) {
                    long j2 = this.f8756g;
                    long j3 = aVar2.f8758b;
                    aVar = aVar2.f8760d;
                    if (j2 <= j3) {
                        break;
                    } else {
                        aVar2 = aVar;
                    }
                }
                a aVar3 = (a) p11.m167011e(aVar);
                m11393a(aVar3);
                a aVar4 = new a(aVar2.f8758b, this.f8751b);
                aVar2.f8760d = aVar4;
                if (this.f8756g == aVar2.f8758b) {
                    aVar2 = aVar4;
                }
                this.f8755f = aVar2;
                if (this.f8754e == aVar3) {
                    this.f8754e = aVar4;
                    return;
                }
                return;
            }
        }
        m11393a(this.f8753d);
        a aVar5 = new a(this.f8756g, this.f8751b);
        this.f8753d = aVar5;
        this.f8754e = aVar5;
        this.f8755f = aVar5;
    }

    /* JADX INFO: renamed from: e */
    public long m11396e() {
        return this.f8756g;
    }

    /* JADX INFO: renamed from: f */
    public void m11397f(DecoderInputBuffer decoderInputBuffer, C1973q.b bVar) {
        m11392l(this.f8754e, decoderInputBuffer, bVar, this.f8752c);
    }

    /* JADX INFO: renamed from: g */
    public final void m11398g(int i) {
        long j = this.f8756g + ((long) i);
        this.f8756g = j;
        a aVar = this.f8755f;
        if (j == aVar.f8758b) {
            this.f8755f = aVar.f8760d;
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m11399h(int i) {
        a aVar = this.f8755f;
        if (aVar.f8759c == null) {
            aVar.m11407c(this.f8750a.mo101996c(), new a(this.f8755f.f8758b, this.f8751b));
        }
        return Math.min(i, (int) (this.f8755f.f8758b - this.f8756g));
    }

    /* JADX INFO: renamed from: m */
    public void m11400m(DecoderInputBuffer decoderInputBuffer, C1973q.b bVar) {
        this.f8754e = m11392l(this.f8754e, decoderInputBuffer, bVar, this.f8752c);
    }

    /* JADX INFO: renamed from: n */
    public void m11401n() {
        m11393a(this.f8753d);
        this.f8753d.m11408d(0L, this.f8751b);
        a aVar = this.f8753d;
        this.f8754e = aVar;
        this.f8755f = aVar;
        this.f8756g = 0L;
        this.f8750a.mo101995b();
    }

    /* JADX INFO: renamed from: o */
    public void m11402o() {
        this.f8754e = this.f8753d;
    }

    /* JADX INFO: renamed from: p */
    public int m11403p(w4c w4cVar, int i, boolean z) throws IOException {
        int iM11399h = m11399h(i);
        a aVar = this.f8755f;
        int i2 = w4cVar.read(aVar.f8759c.f159616a, aVar.m11409e(this.f8756g), iM11399h);
        if (i2 != -1) {
            m11398g(i2);
            return i2;
        }
        if (z) {
            return -1;
        }
        hg3.m130807a();
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public void m11404q(d860 d860Var, int i) {
        while (i > 0) {
            int iM11399h = m11399h(i);
            a aVar = this.f8755f;
            d860Var.m110306l(aVar.f8759c.f159616a, aVar.m11409e(this.f8756g), iM11399h);
            i -= iM11399h;
            m11398g(iM11399h);
        }
    }
}
