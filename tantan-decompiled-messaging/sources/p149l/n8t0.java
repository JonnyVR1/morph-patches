package p149l;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzgad;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class n8t0 implements z4x0 {

    /* JADX INFO: renamed from: a */
    public final z4x0 f137686a;

    /* JADX INFO: renamed from: b */
    public final long f137687b;

    /* JADX INFO: renamed from: c */
    public final z4x0 f137688c;

    /* JADX INFO: renamed from: d */
    public long f137689d;

    /* JADX INFO: renamed from: e */
    public Uri f137690e;

    public n8t0(z4x0 z4x0Var, int i, z4x0 z4x0Var2) {
        this.f137686a = z4x0Var;
        this.f137687b = i;
        this.f137688c = z4x0Var2;
    }

    @Override // p149l.hpy0
    /* JADX INFO: renamed from: a */
    public final int mo12727a(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.f137689d;
        long j2 = this.f137687b;
        if (j < j2) {
            int iMo12727a = this.f137686a.mo12727a(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.f137689d + ((long) iMo12727a);
            this.f137689d = j3;
            i3 = iMo12727a;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.f137687b) {
            return i3;
        }
        int iMo12727a2 = this.f137688c.mo12727a(bArr, i + i3, i2 - i3);
        int i4 = i3 + iMo12727a2;
        this.f137689d += (long) iMo12727a2;
        return i4;
    }

    @Override // p149l.z4x0
    /* JADX INFO: renamed from: e */
    public final long mo12728e(uax0 uax0Var) throws IOException {
        uax0 uax0Var2;
        this.f137690e = uax0Var.f175648a;
        long j = this.f137687b;
        long j2 = uax0Var.f175653f;
        uax0 uax0Var3 = null;
        if (j2 >= j) {
            uax0Var2 = null;
        } else {
            long j3 = uax0Var.f175654g;
            long jMin = j - j2;
            if (j3 != -1) {
                jMin = Math.min(j3, jMin);
            }
            uax0Var2 = new uax0(uax0Var.f175648a, null, j2, j2, jMin, null, 0);
        }
        long j4 = uax0Var.f175654g;
        if (j4 == -1 || uax0Var.f175653f + j4 > this.f137687b) {
            long jMax = Math.max(this.f137687b, uax0Var.f175653f);
            long j5 = uax0Var.f175654g;
            uax0Var3 = new uax0(uax0Var.f175648a, null, jMax, jMax, j5 != -1 ? Math.min(j5, (uax0Var.f175653f + j5) - this.f137687b) : -1L, null, 0);
        }
        long jMo12728e = uax0Var2 != null ? this.f137686a.mo12728e(uax0Var2) : 0L;
        long jMo12728e2 = uax0Var3 != null ? this.f137688c.mo12728e(uax0Var3) : 0L;
        this.f137689d = uax0Var.f175653f;
        if (jMo12728e == -1 || jMo12728e2 == -1) {
            return -1L;
        }
        return jMo12728e + jMo12728e2;
    }

    @Override // p149l.z4x0
    public final Uri zzc() {
        return this.f137690e;
    }

    @Override // p149l.z4x0
    public final void zzd() throws IOException {
        this.f137686a.zzd();
        this.f137688c.zzd();
    }

    @Override // p149l.z4x0, p149l.djx0
    public final Map zze() {
        return zzgad.zzd();
    }

    @Override // p149l.z4x0
    /* JADX INFO: renamed from: f */
    public final void mo128921f(vjx0 vjx0Var) {
    }
}
