package p153l;

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
public final class ahr0 implements per0 {

    /* JADX INFO: renamed from: n */
    public static final ifr0 f71395n = new ifr0() { // from class: l.zgr0
        @Override // p153l.ifr0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ per0[] mo99028a(Uri uri, Map map) {
            int i = hfr0.f109341a;
            return new per0[]{new ahr0(0)};
        }
    };

    /* JADX INFO: renamed from: o */
    public static final int[] f71396o = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: p */
    public static final int[] f71397p;

    /* JADX INFO: renamed from: q */
    public static final byte[] f71398q;

    /* JADX INFO: renamed from: r */
    public static final byte[] f71399r;

    /* JADX INFO: renamed from: s */
    public static final int f71400s;

    /* JADX INFO: renamed from: a */
    public final byte[] f71401a;

    /* JADX INFO: renamed from: b */
    public boolean f71402b;

    /* JADX INFO: renamed from: c */
    public long f71403c;

    /* JADX INFO: renamed from: d */
    public int f71404d;

    /* JADX INFO: renamed from: e */
    public int f71405e;

    /* JADX INFO: renamed from: f */
    public boolean f71406f;

    /* JADX INFO: renamed from: g */
    public int f71407g;

    /* JADX INFO: renamed from: h */
    public int f71408h;

    /* JADX INFO: renamed from: i */
    public long f71409i;

    /* JADX INFO: renamed from: j */
    public ser0 f71410j;

    /* JADX INFO: renamed from: k */
    public sgr0 f71411k;

    /* JADX INFO: renamed from: l */
    public bgr0 f71412l;

    /* JADX INFO: renamed from: m */
    public boolean f71413m;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f71397p = iArr;
        int i = mpw0.f137957a;
        Charset charset = cow0.f82931c;
        f71398q = "#!AMR\n".getBytes(charset);
        f71399r = "#!AMR-WB\n".getBytes(charset);
        f71400s = iArr[8];
    }

    public ahr0(int i) {
        this.f71401a = new byte[1];
        this.f71407g = -1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m97904b(qer0 qer0Var, byte[] bArr) throws IOException {
        qer0Var.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((fer0) qer0Var).mo125313c(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    @RequiresNonNull({"trackOutput"})
    /* JADX INFO: renamed from: a */
    public final int m97905a(qer0 qer0Var) throws IOException {
        int i = this.f71405e;
        if (i == 0) {
            try {
                qer0Var.zzj();
                ((fer0) qer0Var).mo125313c(this.f71401a, 0, 1, false);
                byte b = this.f71401a[0];
                if ((b & 131) > 0) {
                    throw zzcc.zza("Invalid padding bits for frame header " + ((int) b), null);
                }
                int i2 = b >> 3;
                boolean z = this.f71402b;
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
                i = z ? f71397p[i3] : f71396o[i3];
                this.f71404d = i;
                this.f71405e = i;
                int i4 = this.f71407g;
                if (i4 == -1) {
                    this.f71407g = i;
                    i4 = i;
                }
                if (i4 == i) {
                    this.f71408h++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iM125514a = fgr0.m125514a(this.f71411k, qer0Var, i, true);
        if (iM125514a == -1) {
            return -1;
        }
        int i5 = this.f71405e - iM125514a;
        this.f71405e = i5;
        if (i5 > 0) {
            return 0;
        }
        this.f71411k.mo99372c(this.f71403c, 1, this.f71404d, 0, null);
        this.f71403c += 20000;
        return 0;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: c */
    public final void mo97906c(long j, long j2) {
        this.f71403c = 0L;
        this.f71404d = 0;
        this.f71405e = 0;
        this.f71409i = 0L;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: d */
    public final boolean mo97907d(qer0 qer0Var) throws IOException {
        return m97910g(qer0Var);
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: e */
    public final void mo97908e(ser0 ser0Var) {
        this.f71410j = ser0Var;
        this.f71411k = ser0Var.mo101550i(0, 1);
        ser0Var.mo101544c();
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: f */
    public final int mo97909f(qer0 qer0Var, yfr0 yfr0Var) throws IOException {
        lev0.m153954b(this.f71411k);
        int i = mpw0.f137957a;
        if (qer0Var.zzf() == 0 && !m97910g(qer0Var)) {
            throw zzcc.zza("Could not find AMR header.", null);
        }
        if (!this.f71413m) {
            this.f71413m = true;
            boolean z = this.f71402b;
            String str = true != z ? DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_3GP : "audio/amr-wb";
            int i2 = true != z ? TXRecordCommon.AUDIO_SAMPLERATE_8000 : 16000;
            sgr0 sgr0Var = this.f71411k;
            znr0 znr0Var = new znr0();
            znr0Var.m220672w(str);
            znr0Var.m220664o(f71400s);
            znr0Var.m220659k0(1);
            znr0Var.m220673x(i2);
            sgr0Var.mo99373d(znr0Var.m220645D());
        }
        int iM97905a = m97905a(qer0Var);
        if (this.f71406f) {
            return iM97905a;
        }
        agr0 agr0Var = new agr0(-9223372036854775807L, 0L);
        this.f71412l = agr0Var;
        this.f71410j.mo101551j(agr0Var);
        this.f71406f = true;
        return iM97905a;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m97910g(qer0 qer0Var) throws IOException {
        byte[] bArr = f71398q;
        if (m97904b(qer0Var, bArr)) {
            this.f71402b = false;
            ((fer0) qer0Var).m125319k(bArr.length, false);
            return true;
        }
        byte[] bArr2 = f71399r;
        if (!m97904b(qer0Var, bArr2)) {
            return false;
        }
        this.f71402b = true;
        ((fer0) qer0Var).m125319k(bArr2.length, false);
        return true;
    }

    public ahr0() {
        this(0);
    }
}
