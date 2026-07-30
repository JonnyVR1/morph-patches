package p153l;

import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ParserException;
import com.tencent.ugc.TXRecordCommon;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ck0 implements zrf {

    /* JADX INFO: renamed from: r */
    public static final int[] f82233r;

    /* JADX INFO: renamed from: u */
    public static final int f82236u;

    /* JADX INFO: renamed from: a */
    public final byte[] f82237a;

    /* JADX INFO: renamed from: b */
    public final int f82238b;

    /* JADX INFO: renamed from: c */
    public boolean f82239c;

    /* JADX INFO: renamed from: d */
    public long f82240d;

    /* JADX INFO: renamed from: e */
    public int f82241e;

    /* JADX INFO: renamed from: f */
    public int f82242f;

    /* JADX INFO: renamed from: g */
    public boolean f82243g;

    /* JADX INFO: renamed from: h */
    public long f82244h;

    /* JADX INFO: renamed from: i */
    public int f82245i;

    /* JADX INFO: renamed from: j */
    public int f82246j;

    /* JADX INFO: renamed from: k */
    public long f82247k;

    /* JADX INFO: renamed from: l */
    public bsf f82248l;

    /* JADX INFO: renamed from: m */
    public qfj0 f82249m;

    /* JADX INFO: renamed from: n */
    public mke0 f82250n;

    /* JADX INFO: renamed from: o */
    public boolean f82251o;

    /* JADX INFO: renamed from: p */
    public static final esf f82231p = new esf() { // from class: l.bk0
        @Override // p153l.esf
        /* JADX INFO: renamed from: b */
        public final zrf[] mo96504b() {
            return ck0.m110307c();
        }
    };

    /* JADX INFO: renamed from: q */
    public static final int[] f82232q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: s */
    public static final byte[] f82234s = bmk0.m105165r0("#!AMR\n");

    /* JADX INFO: renamed from: t */
    public static final byte[] f82235t = bmk0.m105165r0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f82233r = iArr;
        f82236u = iArr[8];
    }

    public ck0(int i) {
        this.f82238b = (i & 2) != 0 ? i | 1 : i;
        this.f82237a = new byte[1];
        this.f82245i = -1;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ zrf[] m110307c() {
        return new zrf[]{new ck0()};
    }

    /* JADX INFO: renamed from: e */
    public static int m110308e(int i, long j) {
        return (int) ((((long) i) * 8000000) / j);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m110309o(asf asfVar, byte[] bArr) throws IOException {
        asfVar.mo99902h();
        byte[] bArr2 = new byte[bArr.length];
        asfVar.mo99900f(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: a */
    public void mo11029a(long j, long j2) {
        this.f82240d = 0L;
        this.f82241e = 0;
        this.f82242f = 0;
        if (j != 0) {
            mke0 mke0Var = this.f82250n;
            if (mke0Var instanceof ey5) {
                this.f82247k = ((ey5) mke0Var).m123172b(j);
                return;
            }
        }
        this.f82247k = 0L;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: b */
    public void mo11030b(bsf bsfVar) {
        this.f82248l = bsfVar;
        this.f82249m = bsfVar.mo11416b(0, 1);
        bsfVar.mo11425l();
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    /* JADX INFO: renamed from: d */
    public final void m110310d() {
        w11.m204373i(this.f82249m);
        bmk0.m105144j(this.f82248l);
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: f */
    public boolean mo11031f(asf asfVar) throws IOException {
        return m110319q(asfVar);
    }

    /* JADX INFO: renamed from: g */
    public final mke0 m110311g(long j, boolean z) {
        return new ey5(j, this.f82244h, m110308e(this.f82245i, 20000L), this.f82245i, z);
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: h */
    public int mo11032h(asf asfVar, ll80 ll80Var) throws IOException {
        m110310d();
        if (asfVar.getPosition() == 0 && !m110319q(asfVar)) {
            throw ParserException.createForMalformedContainer("Could not find AMR header.", null);
        }
        m110316m();
        int iM110320r = m110320r(asfVar);
        m110317n(asfVar.getLength(), iM110320r);
        return iM110320r;
    }

    /* JADX INFO: renamed from: i */
    public final int m110312i(int i) throws ParserException {
        boolean zM110314k = m110314k(i);
        boolean z = this.f82239c;
        if (zM110314k) {
            return z ? f82233r[i] : f82232q[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(z ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ParserException.createForMalformedContainer(sb.toString(), null);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m110313j(int i) {
        if (this.f82239c) {
            return false;
        }
        return i < 12 || i > 14;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m110314k(int i) {
        if (i < 0 || i > 15) {
            return false;
        }
        return m110315l(i) || m110313j(i);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m110315l(int i) {
        if (this.f82239c) {
            return i < 10 || i > 13;
        }
        return false;
    }

    @RequiresNonNull({"trackOutput"})
    /* JADX INFO: renamed from: m */
    public final void m110316m() {
        if (this.f82251o) {
            return;
        }
        this.f82251o = true;
        boolean z = this.f82239c;
        this.f82249m.mo11164b(new C1894k.b().m10400g0(z ? "audio/amr-wb" : DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_3GP).m10392Y(f82236u).m10377J(1).m10401h0(z ? 16000 : TXRecordCommon.AUDIO_SAMPLERATE_8000).m10374G());
    }

    @RequiresNonNull({"extractorOutput"})
    /* JADX INFO: renamed from: n */
    public final void m110317n(long j, int i) {
        int i2;
        if (this.f82243g) {
            return;
        }
        int i3 = this.f82238b;
        if ((i3 & 1) == 0 || j == -1 || !((i2 = this.f82245i) == -1 || i2 == this.f82241e)) {
            mke0.C18641b c18641b = new mke0.C18641b(-9223372036854775807L);
            this.f82250n = c18641b;
            this.f82248l.mo11424k(c18641b);
            this.f82243g = true;
            return;
        }
        if (this.f82246j >= 20 || i == -1) {
            mke0 mke0VarM110311g = m110311g(j, (i3 & 2) != 0);
            this.f82250n = mke0VarM110311g;
            this.f82248l.mo11424k(mke0VarM110311g);
            this.f82243g = true;
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m110318p(asf asfVar) throws IOException {
        asfVar.mo99902h();
        asfVar.mo99900f(this.f82237a, 0, 1);
        byte b = this.f82237a[0];
        if ((b & 131) <= 0) {
            return m110312i((b >> 3) & 15);
        }
        throw ParserException.createForMalformedContainer("Invalid padding bits for frame header " + ((int) b), null);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m110319q(asf asfVar) throws IOException {
        byte[] bArr = f82234s;
        if (m110309o(asfVar, bArr)) {
            this.f82239c = false;
            asfVar.mo99905o(bArr.length);
            return true;
        }
        byte[] bArr2 = f82235t;
        if (!m110309o(asfVar, bArr2)) {
            return false;
        }
        this.f82239c = true;
        asfVar.mo99905o(bArr2.length);
        return true;
    }

    @RequiresNonNull({"trackOutput"})
    /* JADX INFO: renamed from: r */
    public final int m110320r(asf asfVar) throws IOException {
        if (this.f82242f == 0) {
            try {
                int iM110318p = m110318p(asfVar);
                this.f82241e = iM110318p;
                this.f82242f = iM110318p;
                if (this.f82245i == -1) {
                    this.f82244h = asfVar.getPosition();
                    this.f82245i = this.f82241e;
                }
                if (this.f82245i == this.f82241e) {
                    this.f82246j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iM176371e = this.f82249m.m176371e(asfVar, this.f82242f, true);
        if (iM176371e == -1) {
            return -1;
        }
        int i = this.f82242f - iM176371e;
        this.f82242f = i;
        if (i > 0) {
            return 0;
        }
        this.f82249m.mo11163a(this.f82247k + this.f82240d, 1, this.f82241e, 0, null);
        this.f82240d += 20000;
        return 0;
    }

    @Override // p153l.zrf
    public void release() {
    }

    public ck0() {
        this(0);
    }
}
