package p153l;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzgad;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class tht0 implements fex0 {

    /* JADX INFO: renamed from: a */
    public final fex0 f174416a;

    /* JADX INFO: renamed from: b */
    public final long f174417b;

    /* JADX INFO: renamed from: c */
    public final fex0 f174418c;

    /* JADX INFO: renamed from: d */
    public long f174419d;

    /* JADX INFO: renamed from: e */
    public Uri f174420e;

    public tht0(fex0 fex0Var, int i, fex0 fex0Var2) {
        this.f174416a = fex0Var;
        this.f174417b = i;
        this.f174418c = fex0Var2;
    }

    @Override // p153l.nyy0
    /* JADX INFO: renamed from: a */
    public final int mo12781a(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.f174419d;
        long j2 = this.f174417b;
        if (j < j2) {
            int iMo12781a = this.f174416a.mo12781a(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.f174419d + ((long) iMo12781a);
            this.f174419d = j3;
            i3 = iMo12781a;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.f174417b) {
            return i3;
        }
        int iMo12781a2 = this.f174418c.mo12781a(bArr, i + i3, i2 - i3);
        int i4 = i3 + iMo12781a2;
        this.f174419d += (long) iMo12781a2;
        return i4;
    }

    @Override // p153l.fex0
    /* JADX INFO: renamed from: e */
    public final long mo12782e(akx0 akx0Var) throws IOException {
        akx0 akx0Var2;
        this.f174420e = akx0Var.f72047a;
        long j = this.f174417b;
        long j2 = akx0Var.f72052f;
        akx0 akx0Var3 = null;
        if (j2 >= j) {
            akx0Var2 = null;
        } else {
            long j3 = akx0Var.f72053g;
            long jMin = j - j2;
            if (j3 != -1) {
                jMin = Math.min(j3, jMin);
            }
            akx0Var2 = new akx0(akx0Var.f72047a, null, j2, j2, jMin, null, 0);
        }
        long j4 = akx0Var.f72053g;
        if (j4 == -1 || akx0Var.f72052f + j4 > this.f174417b) {
            long jMax = Math.max(this.f174417b, akx0Var.f72052f);
            long j5 = akx0Var.f72053g;
            akx0Var3 = new akx0(akx0Var.f72047a, null, jMax, jMax, j5 != -1 ? Math.min(j5, (akx0Var.f72052f + j5) - this.f174417b) : -1L, null, 0);
        }
        long jMo12782e = akx0Var2 != null ? this.f174416a.mo12782e(akx0Var2) : 0L;
        long jMo12782e2 = akx0Var3 != null ? this.f174418c.mo12782e(akx0Var3) : 0L;
        this.f174419d = akx0Var.f72052f;
        if (jMo12782e == -1 || jMo12782e2 == -1) {
            return -1L;
        }
        return jMo12782e + jMo12782e2;
    }

    @Override // p153l.fex0
    public final Uri zzc() {
        return this.f174420e;
    }

    @Override // p153l.fex0
    public final void zzd() throws IOException {
        this.f174416a.zzd();
        this.f174418c.zzd();
    }

    @Override // p153l.fex0, p153l.jsx0
    public final Map zze() {
        return zzgad.zzd();
    }

    @Override // p153l.fex0
    /* JADX INFO: renamed from: f */
    public final void mo101236f(btx0 btx0Var) {
    }
}
