package p149l;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzcc;
import com.tencent.ugc.TXRecordCommon;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
public final class u7r0 implements j5r0 {

    /* JADX INFO: renamed from: n */
    public static final c6r0 f175036n = new c6r0() { // from class: l.t7r0
        @Override // p149l.c6r0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j5r0[] mo95449a(Uri uri, Map map) {
            int i = b6r0.f73876a;
            return new j5r0[]{new u7r0(0)};
        }
    };

    /* JADX INFO: renamed from: o */
    public static final int[] f175037o = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: p */
    public static final int[] f175038p;

    /* JADX INFO: renamed from: q */
    public static final byte[] f175039q;

    /* JADX INFO: renamed from: r */
    public static final byte[] f175040r;

    /* JADX INFO: renamed from: s */
    public static final int f175041s;

    /* JADX INFO: renamed from: a */
    public final byte[] f175042a;

    /* JADX INFO: renamed from: b */
    public boolean f175043b;

    /* JADX INFO: renamed from: c */
    public long f175044c;

    /* JADX INFO: renamed from: d */
    public int f175045d;

    /* JADX INFO: renamed from: e */
    public int f175046e;

    /* JADX INFO: renamed from: f */
    public boolean f175047f;

    /* JADX INFO: renamed from: g */
    public int f175048g;

    /* JADX INFO: renamed from: h */
    public int f175049h;

    /* JADX INFO: renamed from: i */
    public long f175050i;

    /* JADX INFO: renamed from: j */
    public m5r0 f175051j;

    /* JADX INFO: renamed from: k */
    public m7r0 f175052k;

    /* JADX INFO: renamed from: l */
    public v6r0 f175053l;

    /* JADX INFO: renamed from: m */
    public boolean f175054m;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f175038p = iArr;
        int i = ggw0.f102568a;
        Charset charset = wew0.f185990c;
        f175039q = "#!AMR\n".getBytes(charset);
        f175040r = "#!AMR-WB\n".getBytes(charset);
        f175041s = iArr[8];
    }

    public u7r0(int i) {
        this.f175042a = new byte[1];
        this.f175048g = -1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m192149b(k5r0 k5r0Var, byte[] bArr) throws IOException {
        k5r0Var.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((z4r0) k5r0Var).mo140051c(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    @RequiresNonNull({"trackOutput"})
    /* JADX INFO: renamed from: a */
    public final int m192150a(k5r0 k5r0Var) throws IOException {
        int i = this.f175046e;
        if (i == 0) {
            try {
                k5r0Var.zzj();
                ((z4r0) k5r0Var).mo140051c(this.f175042a, 0, 1, false);
                byte b = this.f175042a[0];
                if ((b & 131) > 0) {
                    throw zzcc.zza("Invalid padding bits for frame header " + ((int) b), null);
                }
                int i2 = b >> 3;
                boolean z = this.f175043b;
                int i3 = i2 & 15;
                if (!z) {
                    if (!z) {
                        if (i3 >= 12 && i3 <= 14) {
                        }
                    }
                    throw zzcc.zza("Illegal AMR " + (true != z ? "NB" : "WB") + " frame type " + i3, null);
                }
                if (i3 >= 10 && i3 <= 13) {
                    if (!z) {
                        if (i3 >= 12) {
                        }
                    }
                    if (true != z) {
                    }
                    throw zzcc.zza("Illegal AMR " + (true != z ? "NB" : "WB") + " frame type " + i3, null);
                }
                i = z ? f175038p[i3] : f175037o[i3];
                this.f175045d = i;
                this.f175046e = i;
                int i4 = this.f175048g;
                if (i4 == -1) {
                    this.f175048g = i;
                    i4 = i;
                }
                if (i4 == i) {
                    this.f175049h++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iM217415a = z6r0.m217415a(this.f175052k, k5r0Var, i, true);
        if (iM217415a == -1) {
            return -1;
        }
        int i5 = this.f175046e - iM217415a;
        this.f175046e = i5;
        if (i5 > 0) {
            return 0;
        }
        this.f175052k.mo134530c(this.f175044c, 1, this.f175045d, 0, null);
        this.f175044c += 20000;
        return 0;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: c */
    public final void mo100820c(long j, long j2) {
        this.f175044c = 0L;
        this.f175045d = 0;
        this.f175046e = 0;
        this.f175050i = 0L;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: d */
    public final boolean mo100821d(k5r0 k5r0Var) throws IOException {
        return m192151g(k5r0Var);
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: e */
    public final void mo100822e(m5r0 m5r0Var) {
        this.f175051j = m5r0Var;
        this.f175052k = m5r0Var.mo129454i(0, 1);
        m5r0Var.mo129453c();
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: f */
    public final int mo100823f(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        f5v0.m119531b(this.f175052k);
        int i = ggw0.f102568a;
        if (k5r0Var.zzf() == 0 && !m192151g(k5r0Var)) {
            throw zzcc.zza("Could not find AMR header.", null);
        }
        if (!this.f175054m) {
            this.f175054m = true;
            boolean z = this.f175043b;
            String str = true != z ? DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_3GP : "audio/amr-wb";
            int i2 = true != z ? TXRecordCommon.AUDIO_SAMPLERATE_8000 : 16000;
            m7r0 m7r0Var = this.f175052k;
            ter0 ter0Var = new ter0();
            ter0Var.m188618w(str);
            ter0Var.m188610o(f175041s);
            ter0Var.m188605k0(1);
            ter0Var.m188619x(i2);
            m7r0Var.mo134531d(ter0Var.m188591D());
        }
        int iM192150a = m192150a(k5r0Var);
        if (this.f175047f) {
            return iM192150a;
        }
        u6r0 u6r0Var = new u6r0(-9223372036854775807L, 0L);
        this.f175053l = u6r0Var;
        this.f175051j.mo129455j(u6r0Var);
        this.f175047f = true;
        return iM192150a;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m192151g(k5r0 k5r0Var) throws IOException {
        byte[] bArr = f175039q;
        if (m192149b(k5r0Var, bArr)) {
            this.f175043b = false;
            ((z4r0) k5r0Var).m217119k(bArr.length, false);
            return true;
        }
        byte[] bArr2 = f175040r;
        if (!m192149b(k5r0Var, bArr2)) {
            return false;
        }
        this.f175043b = true;
        ((z4r0) k5r0Var).m217119k(bArr2.length, false);
        return true;
    }

    public u7r0() {
        this(0);
    }
}
