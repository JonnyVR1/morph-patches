package p149l;

import com.google.android.exoplayer2.C1871k;
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
public final class gk0 implements sqf {

    /* JADX INFO: renamed from: r */
    public static final int[] f103116r;

    /* JADX INFO: renamed from: u */
    public static final int f103119u;

    /* JADX INFO: renamed from: a */
    public final byte[] f103120a;

    /* JADX INFO: renamed from: b */
    public final int f103121b;

    /* JADX INFO: renamed from: c */
    public boolean f103122c;

    /* JADX INFO: renamed from: d */
    public long f103123d;

    /* JADX INFO: renamed from: e */
    public int f103124e;

    /* JADX INFO: renamed from: f */
    public int f103125f;

    /* JADX INFO: renamed from: g */
    public boolean f103126g;

    /* JADX INFO: renamed from: h */
    public long f103127h;

    /* JADX INFO: renamed from: i */
    public int f103128i;

    /* JADX INFO: renamed from: j */
    public int f103129j;

    /* JADX INFO: renamed from: k */
    public long f103130k;

    /* JADX INFO: renamed from: l */
    public uqf f103131l;

    /* JADX INFO: renamed from: m */
    public m6j0 f103132m;

    /* JADX INFO: renamed from: n */
    public hce0 f103133n;

    /* JADX INFO: renamed from: o */
    public boolean f103134o;

    /* JADX INFO: renamed from: p */
    public static final xqf f103114p = new xqf() { // from class: l.fk0
        @Override // p149l.xqf
        /* JADX INFO: renamed from: b */
        public final sqf[] mo95334b() {
            return gk0.m126565c();
        }
    };

    /* JADX INFO: renamed from: q */
    public static final int[] f103115q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: s */
    public static final byte[] f103117s = vck0.m197887r0("#!AMR\n");

    /* JADX INFO: renamed from: t */
    public static final byte[] f103118t = vck0.m197887r0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f103116r = iArr;
        f103119u = iArr[8];
    }

    public gk0(int i) {
        this.f103121b = (i & 2) != 0 ? i | 1 : i;
        this.f103120a = new byte[1];
        this.f103128i = -1;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ sqf[] m126565c() {
        return new sqf[]{new gk0()};
    }

    /* JADX INFO: renamed from: e */
    public static int m126566e(int i, long j) {
        return (int) ((((long) i) * 8000000) / j);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m126567o(tqf tqfVar, byte[] bArr) throws IOException {
        tqfVar.mo150657h();
        byte[] bArr2 = new byte[bArr.length];
        tqfVar.mo150655f(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: a */
    public void mo10975a(long j, long j2) {
        this.f103123d = 0L;
        this.f103124e = 0;
        this.f103125f = 0;
        if (j != 0) {
            hce0 hce0Var = this.f103133n;
            if (hce0Var instanceof zw5) {
                this.f103130k = ((zw5) hce0Var).m220578b(j);
                return;
            }
        }
        this.f103130k = 0L;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: b */
    public void mo10976b(uqf uqfVar) {
        this.f103131l = uqfVar;
        this.f103132m = uqfVar.mo11362b(0, 1);
        uqfVar.mo11371l();
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    /* JADX INFO: renamed from: d */
    public final void m126568d() {
        p11.m167015i(this.f103132m);
        vck0.m197866j(this.f103131l);
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: f */
    public boolean mo10977f(tqf tqfVar) throws IOException {
        return m126577q(tqfVar);
    }

    /* JADX INFO: renamed from: g */
    public final hce0 m126569g(long j, boolean z) {
        return new zw5(j, this.f103127h, m126566e(this.f103128i, 20000L), this.f103128i, z);
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: h */
    public int mo10978h(tqf tqfVar, fd80 fd80Var) throws IOException {
        m126568d();
        if (tqfVar.getPosition() == 0 && !m126577q(tqfVar)) {
            throw ParserException.createForMalformedContainer("Could not find AMR header.", null);
        }
        m126574m();
        int iM126578r = m126578r(tqfVar);
        m126575n(tqfVar.getLength(), iM126578r);
        return iM126578r;
    }

    /* JADX INFO: renamed from: i */
    public final int m126570i(int i) throws ParserException {
        boolean zM126572k = m126572k(i);
        boolean z = this.f103122c;
        if (zM126572k) {
            return z ? f103116r[i] : f103115q[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(z ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ParserException.createForMalformedContainer(sb.toString(), null);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m126571j(int i) {
        if (this.f103122c) {
            return false;
        }
        return i < 12 || i > 14;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m126572k(int i) {
        if (i < 0 || i > 15) {
            return false;
        }
        return m126573l(i) || m126571j(i);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m126573l(int i) {
        if (this.f103122c) {
            return i < 10 || i > 13;
        }
        return false;
    }

    @RequiresNonNull({"trackOutput"})
    /* JADX INFO: renamed from: m */
    public final void m126574m() {
        if (this.f103134o) {
            return;
        }
        this.f103134o = true;
        boolean z = this.f103122c;
        this.f103132m.mo11110b(new C1871k.b().m10346g0(z ? "audio/amr-wb" : DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_3GP).m10338Y(f103119u).m10323J(1).m10347h0(z ? 16000 : TXRecordCommon.AUDIO_SAMPLERATE_8000).m10320G());
    }

    @RequiresNonNull({"extractorOutput"})
    /* JADX INFO: renamed from: n */
    public final void m126575n(long j, int i) {
        int i2;
        if (this.f103126g) {
            return;
        }
        int i3 = this.f103121b;
        if ((i3 & 1) == 0 || j == -1 || !((i2 = this.f103128i) == -1 || i2 == this.f103124e)) {
            hce0.C17275b c17275b = new hce0.C17275b(-9223372036854775807L);
            this.f103133n = c17275b;
            this.f103131l.mo11370k(c17275b);
            this.f103126g = true;
            return;
        }
        if (this.f103129j >= 20 || i == -1) {
            hce0 hce0VarM126569g = m126569g(j, (i3 & 2) != 0);
            this.f103133n = hce0VarM126569g;
            this.f103131l.mo11370k(hce0VarM126569g);
            this.f103126g = true;
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m126576p(tqf tqfVar) throws IOException {
        tqfVar.mo150657h();
        tqfVar.mo150655f(this.f103120a, 0, 1);
        byte b = this.f103120a[0];
        if ((b & 131) <= 0) {
            return m126570i((b >> 3) & 15);
        }
        throw ParserException.createForMalformedContainer("Invalid padding bits for frame header " + ((int) b), null);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m126577q(tqf tqfVar) throws IOException {
        byte[] bArr = f103117s;
        if (m126567o(tqfVar, bArr)) {
            this.f103122c = false;
            tqfVar.mo150661o(bArr.length);
            return true;
        }
        byte[] bArr2 = f103118t;
        if (!m126567o(tqfVar, bArr2)) {
            return false;
        }
        this.f103122c = true;
        tqfVar.mo150661o(bArr2.length);
        return true;
    }

    @RequiresNonNull({"trackOutput"})
    /* JADX INFO: renamed from: r */
    public final int m126578r(tqf tqfVar) throws IOException {
        if (this.f103125f == 0) {
            try {
                int iM126576p = m126576p(tqfVar);
                this.f103124e = iM126576p;
                this.f103125f = iM126576p;
                if (this.f103128i == -1) {
                    this.f103127h = tqfVar.getPosition();
                    this.f103128i = this.f103124e;
                }
                if (this.f103128i == this.f103124e) {
                    this.f103129j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iM153239e = this.f103132m.m153239e(tqfVar, this.f103125f, true);
        if (iM153239e == -1) {
            return -1;
        }
        int i = this.f103125f - iM153239e;
        this.f103125f = i;
        if (i > 0) {
            return 0;
        }
        this.f103132m.mo11109a(this.f103130k + this.f103123d, 1, this.f103124e, 0, null);
        this.f103123d += 20000;
        return 0;
    }

    @Override // p149l.sqf
    public void release() {
    }

    public gk0() {
        this(0);
    }
}
