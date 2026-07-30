package p149l;

import android.util.Pair;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ParserException;
import io.agora.rtc2.Constants;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class hgp0 implements sqf {

    /* JADX INFO: renamed from: h */
    public static final xqf f107613h = new xqf() { // from class: l.ggp0
        @Override // p149l.xqf
        /* JADX INFO: renamed from: b */
        public final sqf[] mo95334b() {
            return hgp0.m130843c();
        }
    };

    /* JADX INFO: renamed from: a */
    public uqf f107614a;

    /* JADX INFO: renamed from: b */
    public m6j0 f107615b;

    /* JADX INFO: renamed from: e */
    public InterfaceC17307b f107618e;

    /* JADX INFO: renamed from: c */
    public int f107616c = 0;

    /* JADX INFO: renamed from: d */
    public long f107617d = -1;

    /* JADX INFO: renamed from: f */
    public int f107619f = -1;

    /* JADX INFO: renamed from: g */
    public long f107620g = -1;

    /* JADX INFO: renamed from: l.hgp0$a */
    public static final class C17306a implements InterfaceC17307b {

        /* JADX INFO: renamed from: m */
        public static final int[] f107621m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n */
        public static final int[] f107622n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, 157, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, 209, 230, 253, 279, HttpStatus.TEMPORARY_REDIRECT_307, 337, 371, HttpStatus.REQUEST_TIMEOUT_408, 449, 494, 544, 598, 658, Constants.AUDIO_MIXING_REASON_STOPPED_BY_USER, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a */
        public final uqf f107623a;

        /* JADX INFO: renamed from: b */
        public final m6j0 f107624b;

        /* JADX INFO: renamed from: c */
        public final igp0 f107625c;

        /* JADX INFO: renamed from: d */
        public final int f107626d;

        /* JADX INFO: renamed from: e */
        public final byte[] f107627e;

        /* JADX INFO: renamed from: f */
        public final d860 f107628f;

        /* JADX INFO: renamed from: g */
        public final int f107629g;

        /* JADX INFO: renamed from: h */
        public final C1871k f107630h;

        /* JADX INFO: renamed from: i */
        public int f107631i;

        /* JADX INFO: renamed from: j */
        public long f107632j;

        /* JADX INFO: renamed from: k */
        public int f107633k;

        /* JADX INFO: renamed from: l */
        public long f107634l;

        public C17306a(uqf uqfVar, m6j0 m6j0Var, igp0 igp0Var) throws ParserException {
            this.f107623a = uqfVar;
            this.f107624b = m6j0Var;
            this.f107625c = igp0Var;
            int iMax = Math.max(1, igp0Var.f113146c / 10);
            this.f107629g = iMax;
            d860 d860Var = new d860(igp0Var.f113150g);
            d860Var.m110320z();
            int iM110320z = d860Var.m110320z();
            this.f107626d = iM110320z;
            int i = igp0Var.f113145b;
            int i2 = (((igp0Var.f113148e - (i * 4)) * 8) / (igp0Var.f113149f * i)) + 1;
            if (iM110320z != i2) {
                throw ParserException.createForMalformedContainer("Expected frames per block: " + i2 + "; got: " + iM110320z, null);
            }
            int iM197872l = vck0.m197872l(iMax, iM110320z);
            this.f107627e = new byte[igp0Var.f113148e * iM197872l];
            this.f107628f = new d860(iM197872l * m130850h(iM110320z, i));
            int i3 = ((igp0Var.f113146c * igp0Var.f113148e) * 8) / iM110320z;
            this.f107630h = new C1871k.b().m10346g0("audio/raw").m10322I(i3).m10341b0(i3).m10338Y(m130850h(iMax, i)).m10323J(igp0Var.f113145b).m10347h0(igp0Var.f113146c).m10340a0(2).m10320G();
        }

        /* JADX INFO: renamed from: h */
        public static int m130850h(int i, int i2) {
            return i * 2 * i2;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0038 A[LOOP:0: B:6:0x001e->B:12:0x0038, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:23:0x003e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:0x001b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0020  */
        /* JADX WARN: Code duplicated, block: B:9:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p149l.hgp0.InterfaceC17307b
        /* JADX INFO: renamed from: a */
        public boolean mo130851a(p149l.tqf r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.f107629g
                int r1 = r6.f107633k
                int r1 = r6.m130856f(r1)
                int r0 = r0 - r1
                int r1 = r6.f107626d
                int r0 = p149l.vck0.m197872l(r0, r1)
                l.igp0 r1 = r6.f107625c
                int r1 = r1.f113148e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f107631i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f107627e
                int r5 = r6.f107631i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f107631i
                int r4 = r4 + r3
                r6.f107631i = r4
                goto L1e
            L3e:
                int r7 = r6.f107631i
                l.igp0 r8 = r6.f107625c
                int r8 = r8.f113148e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f107627e
                l.d860 r9 = r6.f107628f
                r6.m130854d(r8, r7, r9)
                int r8 = r6.f107631i
                l.igp0 r9 = r6.f107625c
                int r9 = r9.f113148e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f107631i = r8
                l.d860 r7 = r6.f107628f
                int r7 = r7.m110301g()
                l.m6j0 r8 = r6.f107624b
                l.d860 r9 = r6.f107628f
                r8.m153238d(r9, r7)
                int r8 = r6.f107633k
                int r8 = r8 + r7
                r6.f107633k = r8
                int r7 = r6.m130856f(r8)
                int r8 = r6.f107629g
                if (r7 < r8) goto L75
                r6.m130858i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f107633k
                int r7 = r6.m130856f(r7)
                if (r7 <= 0) goto L82
                r6.m130858i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p149l.hgp0.C17306a.mo130851a(l.tqf, long):boolean");
        }

        @Override // p149l.hgp0.InterfaceC17307b
        /* JADX INFO: renamed from: b */
        public void mo130852b(int i, long j) {
            this.f107623a.mo11370k(new kgp0(this.f107625c, this.f107626d, i, j));
            this.f107624b.mo11110b(this.f107630h);
        }

        @Override // p149l.hgp0.InterfaceC17307b
        /* JADX INFO: renamed from: c */
        public void mo130853c(long j) {
            this.f107631i = 0;
            this.f107632j = j;
            this.f107633k = 0;
            this.f107634l = 0L;
        }

        /* JADX INFO: renamed from: d */
        public final void m130854d(byte[] bArr, int i, d860 d860Var) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.f107625c.f113145b; i3++) {
                    m130855e(bArr, i2, i3, d860Var.m110299e());
                }
            }
            int iM130857g = m130857g(this.f107626d * i);
            d860Var.m110292U(0);
            d860Var.m110291T(iM130857g);
        }

        /* JADX INFO: renamed from: e */
        public final void m130855e(byte[] bArr, int i, int i2, byte[] bArr2) {
            igp0 igp0Var = this.f107625c;
            int i3 = igp0Var.f113148e;
            int i4 = igp0Var.f113145b;
            int i5 = (i * i3) + (i2 * 4);
            int i6 = (i4 * 4) + i5;
            int i7 = (i3 / i4) - 4;
            int iM197884q = (short) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            int iMin = Math.min(bArr[i5 + 2] & 255, 88);
            int i8 = f107622n[iMin];
            int i9 = ((i * this.f107626d * i4) + i2) * 2;
            bArr2[i9] = (byte) (iM197884q & 255);
            bArr2[i9 + 1] = (byte) (iM197884q >> 8);
            for (int i10 = 0; i10 < i7 * 2; i10++) {
                byte b = bArr[((i10 / 8) * i4 * 4) + i6 + ((i10 / 2) % 4)];
                int i11 = i10 % 2 == 0 ? b & 15 : (b & 255) >> 4;
                int i12 = ((((i11 & 7) * 2) + 1) * i8) >> 3;
                if ((i11 & 8) != 0) {
                    i12 = -i12;
                }
                iM197884q = vck0.m197884q(iM197884q + i12, -32768, 32767);
                i9 += i4 * 2;
                bArr2[i9] = (byte) (iM197884q & 255);
                bArr2[i9 + 1] = (byte) (iM197884q >> 8);
                int i13 = iMin + f107621m[i11];
                int[] iArr = f107622n;
                iMin = vck0.m197884q(i13, 0, iArr.length - 1);
                i8 = iArr[iMin];
            }
        }

        /* JADX INFO: renamed from: f */
        public final int m130856f(int i) {
            return i / (this.f107625c.f113145b * 2);
        }

        /* JADX INFO: renamed from: g */
        public final int m130857g(int i) {
            return m130850h(i, this.f107625c.f113145b);
        }

        /* JADX INFO: renamed from: i */
        public final void m130858i(int i) {
            long jM197832W0 = this.f107632j + vck0.m197832W0(this.f107634l, 1000000L, this.f107625c.f113146c);
            int iM130857g = m130857g(i);
            this.f107624b.mo11109a(jM197832W0, 1, iM130857g, this.f107633k - iM130857g, null);
            this.f107634l += (long) i;
            this.f107633k -= iM130857g;
        }
    }

    /* JADX INFO: renamed from: l.hgp0$b */
    public interface InterfaceC17307b {
        /* JADX INFO: renamed from: a */
        boolean mo130851a(tqf tqfVar, long j) throws IOException;

        /* JADX INFO: renamed from: b */
        void mo130852b(int i, long j) throws ParserException;

        /* JADX INFO: renamed from: c */
        void mo130853c(long j);
    }

    /* JADX INFO: renamed from: l.hgp0$c */
    public static final class C17308c implements InterfaceC17307b {

        /* JADX INFO: renamed from: a */
        public final uqf f107635a;

        /* JADX INFO: renamed from: b */
        public final m6j0 f107636b;

        /* JADX INFO: renamed from: c */
        public final igp0 f107637c;

        /* JADX INFO: renamed from: d */
        public final C1871k f107638d;

        /* JADX INFO: renamed from: e */
        public final int f107639e;

        /* JADX INFO: renamed from: f */
        public long f107640f;

        /* JADX INFO: renamed from: g */
        public int f107641g;

        /* JADX INFO: renamed from: h */
        public long f107642h;

        public C17308c(uqf uqfVar, m6j0 m6j0Var, igp0 igp0Var, String str, int i) throws ParserException {
            this.f107635a = uqfVar;
            this.f107636b = m6j0Var;
            this.f107637c = igp0Var;
            int i2 = (igp0Var.f113145b * igp0Var.f113149f) / 8;
            if (igp0Var.f113148e != i2) {
                throw ParserException.createForMalformedContainer("Expected block size: " + i2 + "; got: " + igp0Var.f113148e, null);
            }
            int i3 = igp0Var.f113146c;
            int i4 = i3 * i2 * 8;
            int iMax = Math.max(i2, (i3 * i2) / 10);
            this.f107639e = iMax;
            this.f107638d = new C1871k.b().m10346g0(str).m10322I(i4).m10341b0(i4).m10338Y(iMax).m10323J(igp0Var.f113145b).m10347h0(igp0Var.f113146c).m10340a0(i).m10320G();
        }

        @Override // p149l.hgp0.InterfaceC17307b
        /* JADX INFO: renamed from: a */
        public boolean mo130851a(tqf tqfVar, long j) throws IOException {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.f107641g) < (i2 = this.f107639e)) {
                int iM153239e = this.f107636b.m153239e(tqfVar, (int) Math.min(i2 - i, j2), true);
                if (iM153239e == -1) {
                    j2 = 0;
                } else {
                    this.f107641g += iM153239e;
                    j2 -= (long) iM153239e;
                }
            }
            igp0 igp0Var = this.f107637c;
            int i3 = igp0Var.f113148e;
            int i4 = this.f107641g / i3;
            if (i4 > 0) {
                long jM197832W0 = this.f107640f + vck0.m197832W0(this.f107642h, 1000000L, igp0Var.f113146c);
                int i5 = i4 * i3;
                int i6 = this.f107641g - i5;
                this.f107636b.mo11109a(jM197832W0, 1, i5, i6, null);
                this.f107642h += (long) i4;
                this.f107641g = i6;
            }
            return j2 <= 0;
        }

        @Override // p149l.hgp0.InterfaceC17307b
        /* JADX INFO: renamed from: b */
        public void mo130852b(int i, long j) {
            this.f107635a.mo11370k(new kgp0(this.f107637c, 1, i, j));
            this.f107636b.mo11110b(this.f107638d);
        }

        @Override // p149l.hgp0.InterfaceC17307b
        /* JADX INFO: renamed from: c */
        public void mo130853c(long j) {
            this.f107640f = j;
            this.f107641g = 0;
            this.f107642h = 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ sqf[] m130843c() {
        return new sqf[]{new hgp0()};
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    /* JADX INFO: renamed from: d */
    private void m130844d() {
        p11.m167015i(this.f107615b);
        vck0.m197866j(this.f107614a);
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: a */
    public void mo10975a(long j, long j2) {
        this.f107616c = j == 0 ? 0 : 4;
        InterfaceC17307b interfaceC17307b = this.f107618e;
        if (interfaceC17307b != null) {
            interfaceC17307b.mo130853c(j2);
        }
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: b */
    public void mo10976b(uqf uqfVar) {
        this.f107614a = uqfVar;
        this.f107615b = uqfVar.mo11362b(0, 1);
        uqfVar.mo11371l();
    }

    /* JADX INFO: renamed from: e */
    public final void m130845e(tqf tqfVar) throws IOException {
        p11.m167013g(tqfVar.getPosition() == 0);
        int i = this.f107619f;
        if (i != -1) {
            tqfVar.mo150661o(i);
            this.f107616c = 4;
        } else {
            if (!jgp0.m141325a(tqfVar)) {
                throw ParserException.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
            }
            tqfVar.mo150661o((int) (tqfVar.mo150659k() - tqfVar.getPosition()));
            this.f107616c = 1;
        }
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: f */
    public boolean mo10977f(tqf tqfVar) throws IOException {
        return jgp0.m141325a(tqfVar);
    }

    @RequiresNonNull({"extractorOutput", "trackOutput"})
    /* JADX INFO: renamed from: g */
    public final void m130846g(tqf tqfVar) throws IOException {
        igp0 igp0VarM141326b = jgp0.m141326b(tqfVar);
        int i = igp0VarM141326b.f113144a;
        if (i == 17) {
            this.f107618e = new C17306a(this.f107614a, this.f107615b, igp0VarM141326b);
        } else if (i == 6) {
            this.f107618e = new C17308c(this.f107614a, this.f107615b, igp0VarM141326b, "audio/g711-alaw", -1);
        } else if (i == 7) {
            this.f107618e = new C17308c(this.f107614a, this.f107615b, igp0VarM141326b, "audio/g711-mlaw", -1);
        } else {
            int iM149784a = lgp0.m149784a(i, igp0VarM141326b.f113149f);
            if (iM149784a == 0) {
                throw ParserException.createForUnsupportedContainerFeature("Unsupported WAV format type: " + igp0VarM141326b.f113144a);
            }
            this.f107618e = new C17308c(this.f107614a, this.f107615b, igp0VarM141326b, "audio/raw", iM149784a);
        }
        this.f107616c = 3;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: h */
    public int mo10978h(tqf tqfVar, fd80 fd80Var) throws IOException {
        m130844d();
        int i = this.f107616c;
        if (i == 0) {
            m130845e(tqfVar);
            return 0;
        }
        if (i == 1) {
            m130847i(tqfVar);
            return 0;
        }
        if (i == 2) {
            m130846g(tqfVar);
            return 0;
        }
        if (i == 3) {
            m130849k(tqfVar);
            return 0;
        }
        if (i == 4) {
            return m130848j(tqfVar);
        }
        ohg0.m164364a();
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m130847i(tqf tqfVar) throws IOException {
        this.f107617d = jgp0.m141327c(tqfVar);
        this.f107616c = 2;
    }

    /* JADX INFO: renamed from: j */
    public final int m130848j(tqf tqfVar) throws IOException {
        p11.m167013g(this.f107620g != -1);
        return ((InterfaceC17307b) p11.m167011e(this.f107618e)).mo130851a(tqfVar, this.f107620g - tqfVar.getPosition()) ? -1 : 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m130849k(tqf tqfVar) throws IOException {
        Pair<Long, Long> pairM141329e = jgp0.m141329e(tqfVar);
        this.f107619f = ((Long) pairM141329e.first).intValue();
        long jLongValue = ((Long) pairM141329e.second).longValue();
        long j = this.f107617d;
        if (j != -1 && jLongValue == 4294967295L) {
            jLongValue = j;
        }
        this.f107620g = ((long) this.f107619f) + jLongValue;
        long length = tqfVar.getLength();
        if (length != -1 && this.f107620g > length) {
            jwv.m143689i("WavExtractor", "Data exceeds input length: " + this.f107620g + ", " + length);
            this.f107620g = length;
        }
        ((InterfaceC17307b) p11.m167011e(this.f107618e)).mo130852b(this.f107619f, this.f107620g);
        this.f107616c = 4;
    }

    @Override // p149l.sqf
    public void release() {
    }
}
