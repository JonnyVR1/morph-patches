package p153l;

import android.util.Pair;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ParserException;
import io.agora.rtc2.Constants;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class lpp0 implements zrf {

    /* JADX INFO: renamed from: h */
    public static final esf f133083h = new esf() { // from class: l.kpp0
        @Override // p153l.esf
        /* JADX INFO: renamed from: b */
        public final zrf[] mo96504b() {
            return lpp0.m155276c();
        }
    };

    /* JADX INFO: renamed from: a */
    public bsf f133084a;

    /* JADX INFO: renamed from: b */
    public qfj0 f133085b;

    /* JADX INFO: renamed from: e */
    public InterfaceC18438b f133088e;

    /* JADX INFO: renamed from: c */
    public int f133086c = 0;

    /* JADX INFO: renamed from: d */
    public long f133087d = -1;

    /* JADX INFO: renamed from: f */
    public int f133089f = -1;

    /* JADX INFO: renamed from: g */
    public long f133090g = -1;

    /* JADX INFO: renamed from: l.lpp0$a */
    public static final class C18437a implements InterfaceC18438b {

        /* JADX INFO: renamed from: m */
        public static final int[] f133091m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n */
        public static final int[] f133092n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, 157, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, 209, 230, 253, 279, HttpStatus.TEMPORARY_REDIRECT_307, 337, 371, HttpStatus.REQUEST_TIMEOUT_408, 449, 494, 544, 598, 658, Constants.AUDIO_MIXING_REASON_STOPPED_BY_USER, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a */
        public final bsf f133093a;

        /* JADX INFO: renamed from: b */
        public final qfj0 f133094b;

        /* JADX INFO: renamed from: c */
        public final mpp0 f133095c;

        /* JADX INFO: renamed from: d */
        public final int f133096d;

        /* JADX INFO: renamed from: e */
        public final byte[] f133097e;

        /* JADX INFO: renamed from: f */
        public final ig60 f133098f;

        /* JADX INFO: renamed from: g */
        public final int f133099g;

        /* JADX INFO: renamed from: h */
        public final C1894k f133100h;

        /* JADX INFO: renamed from: i */
        public int f133101i;

        /* JADX INFO: renamed from: j */
        public long f133102j;

        /* JADX INFO: renamed from: k */
        public int f133103k;

        /* JADX INFO: renamed from: l */
        public long f133104l;

        public C18437a(bsf bsfVar, qfj0 qfj0Var, mpp0 mpp0Var) throws ParserException {
            this.f133093a = bsfVar;
            this.f133094b = qfj0Var;
            this.f133095c = mpp0Var;
            int iMax = Math.max(1, mpp0Var.f137937c / 10);
            this.f133099g = iMax;
            ig60 ig60Var = new ig60(mpp0Var.f137941g);
            ig60Var.m139836z();
            int iM139836z = ig60Var.m139836z();
            this.f133096d = iM139836z;
            int i = mpp0Var.f137936b;
            int i2 = (((mpp0Var.f137939e - (i * 4)) * 8) / (mpp0Var.f137940f * i)) + 1;
            if (iM139836z != i2) {
                throw ParserException.createForMalformedContainer("Expected frames per block: " + i2 + "; got: " + iM139836z, null);
            }
            int iM105150l = bmk0.m105150l(iMax, iM139836z);
            this.f133097e = new byte[mpp0Var.f137939e * iM105150l];
            this.f133098f = new ig60(iM105150l * m155283h(iM139836z, i));
            int i3 = ((mpp0Var.f137937c * mpp0Var.f137939e) * 8) / iM139836z;
            this.f133100h = new C1894k.b().m10400g0("audio/raw").m10376I(i3).m10395b0(i3).m10392Y(m155283h(iMax, i)).m10377J(mpp0Var.f137936b).m10401h0(mpp0Var.f137937c).m10394a0(2).m10374G();
        }

        /* JADX INFO: renamed from: h */
        public static int m155283h(int i, int i2) {
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
        @Override // p153l.lpp0.InterfaceC18438b
        /* JADX INFO: renamed from: a */
        public boolean mo155284a(p153l.asf r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.f133099g
                int r1 = r6.f133103k
                int r1 = r6.m155289f(r1)
                int r0 = r0 - r1
                int r1 = r6.f133096d
                int r0 = p153l.bmk0.m105150l(r0, r1)
                l.mpp0 r1 = r6.f133095c
                int r1 = r1.f137939e
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
                int r3 = r6.f133101i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f133097e
                int r5 = r6.f133101i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f133101i
                int r4 = r4 + r3
                r6.f133101i = r4
                goto L1e
            L3e:
                int r7 = r6.f133101i
                l.mpp0 r8 = r6.f133095c
                int r8 = r8.f137939e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f133097e
                l.ig60 r9 = r6.f133098f
                r6.m155287d(r8, r7, r9)
                int r8 = r6.f133101i
                l.mpp0 r9 = r6.f133095c
                int r9 = r9.f137939e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f133101i = r8
                l.ig60 r7 = r6.f133098f
                int r7 = r7.m139817g()
                l.qfj0 r8 = r6.f133094b
                l.ig60 r9 = r6.f133098f
                r8.m176370d(r9, r7)
                int r8 = r6.f133103k
                int r8 = r8 + r7
                r6.f133103k = r8
                int r7 = r6.m155289f(r8)
                int r8 = r6.f133099g
                if (r7 < r8) goto L75
                r6.m155291i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f133103k
                int r7 = r6.m155289f(r7)
                if (r7 <= 0) goto L82
                r6.m155291i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p153l.lpp0.C18437a.mo155284a(l.asf, long):boolean");
        }

        @Override // p153l.lpp0.InterfaceC18438b
        /* JADX INFO: renamed from: b */
        public void mo155285b(int i, long j) {
            this.f133093a.mo11424k(new opp0(this.f133095c, this.f133096d, i, j));
            this.f133094b.mo11164b(this.f133100h);
        }

        @Override // p153l.lpp0.InterfaceC18438b
        /* JADX INFO: renamed from: c */
        public void mo155286c(long j) {
            this.f133101i = 0;
            this.f133102j = j;
            this.f133103k = 0;
            this.f133104l = 0L;
        }

        /* JADX INFO: renamed from: d */
        public final void m155287d(byte[] bArr, int i, ig60 ig60Var) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.f133095c.f137936b; i3++) {
                    m155288e(bArr, i2, i3, ig60Var.m139815e());
                }
            }
            int iM155290g = m155290g(this.f133096d * i);
            ig60Var.m139808U(0);
            ig60Var.m139807T(iM155290g);
        }

        /* JADX INFO: renamed from: e */
        public final void m155288e(byte[] bArr, int i, int i2, byte[] bArr2) {
            mpp0 mpp0Var = this.f133095c;
            int i3 = mpp0Var.f137939e;
            int i4 = mpp0Var.f137936b;
            int i5 = (i * i3) + (i2 * 4);
            int i6 = (i4 * 4) + i5;
            int i7 = (i3 / i4) - 4;
            int iM105162q = (short) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            int iMin = Math.min(bArr[i5 + 2] & 255, 88);
            int i8 = f133092n[iMin];
            int i9 = ((i * this.f133096d * i4) + i2) * 2;
            bArr2[i9] = (byte) (iM105162q & 255);
            bArr2[i9 + 1] = (byte) (iM105162q >> 8);
            for (int i10 = 0; i10 < i7 * 2; i10++) {
                byte b = bArr[((i10 / 8) * i4 * 4) + i6 + ((i10 / 2) % 4)];
                int i11 = i10 % 2 == 0 ? b & 15 : (b & 255) >> 4;
                int i12 = ((((i11 & 7) * 2) + 1) * i8) >> 3;
                if ((i11 & 8) != 0) {
                    i12 = -i12;
                }
                iM105162q = bmk0.m105162q(iM105162q + i12, -32768, 32767);
                i9 += i4 * 2;
                bArr2[i9] = (byte) (iM105162q & 255);
                bArr2[i9 + 1] = (byte) (iM105162q >> 8);
                int i13 = iMin + f133091m[i11];
                int[] iArr = f133092n;
                iMin = bmk0.m105162q(i13, 0, iArr.length - 1);
                i8 = iArr[iMin];
            }
        }

        /* JADX INFO: renamed from: f */
        public final int m155289f(int i) {
            return i / (this.f133095c.f137936b * 2);
        }

        /* JADX INFO: renamed from: g */
        public final int m155290g(int i) {
            return m155283h(i, this.f133095c.f137936b);
        }

        /* JADX INFO: renamed from: i */
        public final void m155291i(int i) {
            long jM105110W0 = this.f133102j + bmk0.m105110W0(this.f133104l, 1000000L, this.f133095c.f137937c);
            int iM155290g = m155290g(i);
            this.f133094b.mo11163a(jM105110W0, 1, iM155290g, this.f133103k - iM155290g, null);
            this.f133104l += (long) i;
            this.f133103k -= iM155290g;
        }
    }

    /* JADX INFO: renamed from: l.lpp0$b */
    public interface InterfaceC18438b {
        /* JADX INFO: renamed from: a */
        boolean mo155284a(asf asfVar, long j) throws IOException;

        /* JADX INFO: renamed from: b */
        void mo155285b(int i, long j) throws ParserException;

        /* JADX INFO: renamed from: c */
        void mo155286c(long j);
    }

    /* JADX INFO: renamed from: l.lpp0$c */
    public static final class C18439c implements InterfaceC18438b {

        /* JADX INFO: renamed from: a */
        public final bsf f133105a;

        /* JADX INFO: renamed from: b */
        public final qfj0 f133106b;

        /* JADX INFO: renamed from: c */
        public final mpp0 f133107c;

        /* JADX INFO: renamed from: d */
        public final C1894k f133108d;

        /* JADX INFO: renamed from: e */
        public final int f133109e;

        /* JADX INFO: renamed from: f */
        public long f133110f;

        /* JADX INFO: renamed from: g */
        public int f133111g;

        /* JADX INFO: renamed from: h */
        public long f133112h;

        public C18439c(bsf bsfVar, qfj0 qfj0Var, mpp0 mpp0Var, String str, int i) throws ParserException {
            this.f133105a = bsfVar;
            this.f133106b = qfj0Var;
            this.f133107c = mpp0Var;
            int i2 = (mpp0Var.f137936b * mpp0Var.f137940f) / 8;
            if (mpp0Var.f137939e != i2) {
                throw ParserException.createForMalformedContainer("Expected block size: " + i2 + "; got: " + mpp0Var.f137939e, null);
            }
            int i3 = mpp0Var.f137937c;
            int i4 = i3 * i2 * 8;
            int iMax = Math.max(i2, (i3 * i2) / 10);
            this.f133109e = iMax;
            this.f133108d = new C1894k.b().m10400g0(str).m10376I(i4).m10395b0(i4).m10392Y(iMax).m10377J(mpp0Var.f137936b).m10401h0(mpp0Var.f137937c).m10394a0(i).m10374G();
        }

        @Override // p153l.lpp0.InterfaceC18438b
        /* JADX INFO: renamed from: a */
        public boolean mo155284a(asf asfVar, long j) throws IOException {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.f133111g) < (i2 = this.f133109e)) {
                int iM176371e = this.f133106b.m176371e(asfVar, (int) Math.min(i2 - i, j2), true);
                if (iM176371e == -1) {
                    j2 = 0;
                } else {
                    this.f133111g += iM176371e;
                    j2 -= (long) iM176371e;
                }
            }
            mpp0 mpp0Var = this.f133107c;
            int i3 = mpp0Var.f137939e;
            int i4 = this.f133111g / i3;
            if (i4 > 0) {
                long jM105110W0 = this.f133110f + bmk0.m105110W0(this.f133112h, 1000000L, mpp0Var.f137937c);
                int i5 = i4 * i3;
                int i6 = this.f133111g - i5;
                this.f133106b.mo11163a(jM105110W0, 1, i5, i6, null);
                this.f133112h += (long) i4;
                this.f133111g = i6;
            }
            return j2 <= 0;
        }

        @Override // p153l.lpp0.InterfaceC18438b
        /* JADX INFO: renamed from: b */
        public void mo155285b(int i, long j) {
            this.f133105a.mo11424k(new opp0(this.f133107c, 1, i, j));
            this.f133106b.mo11164b(this.f133108d);
        }

        @Override // p153l.lpp0.InterfaceC18438b
        /* JADX INFO: renamed from: c */
        public void mo155286c(long j) {
            this.f133110f = j;
            this.f133111g = 0;
            this.f133112h = 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ zrf[] m155276c() {
        return new zrf[]{new lpp0()};
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    /* JADX INFO: renamed from: d */
    private void m155277d() {
        w11.m204373i(this.f133085b);
        bmk0.m105144j(this.f133084a);
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: a */
    public void mo11029a(long j, long j2) {
        this.f133086c = j == 0 ? 0 : 4;
        InterfaceC18438b interfaceC18438b = this.f133088e;
        if (interfaceC18438b != null) {
            interfaceC18438b.mo155286c(j2);
        }
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: b */
    public void mo11030b(bsf bsfVar) {
        this.f133084a = bsfVar;
        this.f133085b = bsfVar.mo11416b(0, 1);
        bsfVar.mo11425l();
    }

    /* JADX INFO: renamed from: e */
    public final void m155278e(asf asfVar) throws IOException {
        w11.m204371g(asfVar.getPosition() == 0);
        int i = this.f133089f;
        if (i != -1) {
            asfVar.mo99905o(i);
            this.f133086c = 4;
        } else {
            if (!npp0.m164230a(asfVar)) {
                throw ParserException.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
            }
            asfVar.mo99905o((int) (asfVar.mo99903k() - asfVar.getPosition()));
            this.f133086c = 1;
        }
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: f */
    public boolean mo11031f(asf asfVar) throws IOException {
        return npp0.m164230a(asfVar);
    }

    @RequiresNonNull({"extractorOutput", "trackOutput"})
    /* JADX INFO: renamed from: g */
    public final void m155279g(asf asfVar) throws IOException {
        mpp0 mpp0VarM164231b = npp0.m164231b(asfVar);
        int i = mpp0VarM164231b.f137935a;
        if (i == 17) {
            this.f133088e = new C18437a(this.f133084a, this.f133085b, mpp0VarM164231b);
        } else if (i == 6) {
            this.f133088e = new C18439c(this.f133084a, this.f133085b, mpp0VarM164231b, "audio/g711-alaw", -1);
        } else if (i == 7) {
            this.f133088e = new C18439c(this.f133084a, this.f133085b, mpp0VarM164231b, "audio/g711-mlaw", -1);
        } else {
            int iM173248a = ppp0.m173248a(i, mpp0VarM164231b.f137940f);
            if (iM173248a == 0) {
                throw ParserException.createForUnsupportedContainerFeature("Unsupported WAV format type: " + mpp0VarM164231b.f137935a);
            }
            this.f133088e = new C18439c(this.f133084a, this.f133085b, mpp0VarM164231b, "audio/raw", iM173248a);
        }
        this.f133086c = 3;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: h */
    public int mo11032h(asf asfVar, ll80 ll80Var) throws IOException {
        m155277d();
        int i = this.f133086c;
        if (i == 0) {
            m155278e(asfVar);
            return 0;
        }
        if (i == 1) {
            m155280i(asfVar);
            return 0;
        }
        if (i == 2) {
            m155279g(asfVar);
            return 0;
        }
        if (i == 3) {
            m155282k(asfVar);
            return 0;
        }
        if (i == 4) {
            return m155281j(asfVar);
        }
        wpg0.m207458a();
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m155280i(asf asfVar) throws IOException {
        this.f133087d = npp0.m164232c(asfVar);
        this.f133086c = 2;
    }

    /* JADX INFO: renamed from: j */
    public final int m155281j(asf asfVar) throws IOException {
        w11.m204371g(this.f133090g != -1);
        return ((InterfaceC18438b) w11.m204369e(this.f133088e)).mo155284a(asfVar, this.f133090g - asfVar.getPosition()) ? -1 : 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m155282k(asf asfVar) throws IOException {
        Pair<Long, Long> pairM164234e = npp0.m164234e(asfVar);
        this.f133089f = ((Long) pairM164234e.first).intValue();
        long jLongValue = ((Long) pairM164234e.second).longValue();
        long j = this.f133087d;
        if (j != -1 && jLongValue == 4294967295L) {
            jLongValue = j;
        }
        this.f133090g = ((long) this.f133089f) + jLongValue;
        long length = asfVar.getLength();
        if (length != -1 && this.f133090g > length) {
            kyv.m152151i("WavExtractor", "Data exceeds input length: " + this.f133090g + ", " + length);
            this.f133090g = length;
        }
        ((InterfaceC18438b) w11.m204369e(this.f133088e)).mo155285b(this.f133089f, this.f133090g);
        this.f133086c = 4;
    }

    @Override // p153l.zrf
    public void release() {
    }
}
