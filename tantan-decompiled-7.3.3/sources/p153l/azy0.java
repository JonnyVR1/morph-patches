package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class azy0 implements fex0 {

    /* JADX INFO: renamed from: a */
    public final fex0 f74237a;

    /* JADX INFO: renamed from: b */
    public final int f74238b;

    /* JADX INFO: renamed from: c */
    public final zyy0 f74239c;

    /* JADX INFO: renamed from: d */
    public final byte[] f74240d;

    /* JADX INFO: renamed from: e */
    public int f74241e;

    public azy0(fex0 fex0Var, int i, zyy0 zyy0Var) {
        lev0.m153956d(i > 0);
        this.f74237a = fex0Var;
        this.f74238b = i;
        this.f74239c = zyy0Var;
        this.f74240d = new byte[1];
        this.f74241e = i;
    }

    @Override // p153l.nyy0
    /* JADX INFO: renamed from: a */
    public final int mo12781a(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f74241e;
        if (i3 == 0) {
            int i4 = 0;
            if (this.f74237a.mo12781a(this.f74240d, 0, 1) != -1) {
                int i5 = (this.f74240d[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int iMo12781a = this.f74237a.mo12781a(bArr2, i4, i6);
                        if (iMo12781a != -1) {
                            i4 += iMo12781a;
                            i6 -= iMo12781a;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        this.f74239c.mo204362b(new bgw0(bArr2, i5));
                    }
                }
                i3 = this.f74238b;
                this.f74241e = i3;
            }
            return -1;
        }
        int iMo12781a2 = this.f74237a.mo12781a(bArr, i, Math.min(i3, i2));
        if (iMo12781a2 != -1) {
            this.f74241e -= iMo12781a2;
        }
        return iMo12781a2;
    }

    @Override // p153l.fex0
    /* JADX INFO: renamed from: e */
    public final long mo12782e(akx0 akx0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // p153l.fex0
    /* JADX INFO: renamed from: f */
    public final void mo101236f(btx0 btx0Var) {
        btx0Var.getClass();
        this.f74237a.mo101236f(btx0Var);
    }

    @Override // p153l.fex0
    @Nullable
    public final Uri zzc() {
        return this.f74237a.zzc();
    }

    @Override // p153l.fex0
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // p153l.fex0, p153l.jsx0
    public final Map zze() {
        return this.f74237a.zze();
    }
}
