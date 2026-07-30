package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class upy0 implements z4x0 {

    /* JADX INFO: renamed from: a */
    public final z4x0 f177689a;

    /* JADX INFO: renamed from: b */
    public final int f177690b;

    /* JADX INFO: renamed from: c */
    public final tpy0 f177691c;

    /* JADX INFO: renamed from: d */
    public final byte[] f177692d;

    /* JADX INFO: renamed from: e */
    public int f177693e;

    public upy0(z4x0 z4x0Var, int i, tpy0 tpy0Var) {
        f5v0.m119533d(i > 0);
        this.f177689a = z4x0Var;
        this.f177690b = i;
        this.f177691c = tpy0Var;
        this.f177692d = new byte[1];
        this.f177693e = i;
    }

    @Override // p149l.hpy0
    /* JADX INFO: renamed from: a */
    public final int mo12727a(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f177693e;
        if (i3 == 0) {
            int i4 = 0;
            if (this.f177689a.mo12727a(this.f177692d, 0, 1) != -1) {
                int i5 = (this.f177692d[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int iMo12727a = this.f177689a.mo12727a(bArr2, i4, i6);
                        if (iMo12727a != -1) {
                            i4 += iMo12727a;
                            i6 -= iMo12727a;
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
                        this.f177691c.mo176139b(new v6w0(bArr2, i5));
                    }
                }
                i3 = this.f177690b;
                this.f177693e = i3;
            }
            return -1;
        }
        int iMo12727a2 = this.f177689a.mo12727a(bArr, i, Math.min(i3, i2));
        if (iMo12727a2 != -1) {
            this.f177693e -= iMo12727a2;
        }
        return iMo12727a2;
    }

    @Override // p149l.z4x0
    /* JADX INFO: renamed from: e */
    public final long mo12728e(uax0 uax0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // p149l.z4x0
    /* JADX INFO: renamed from: f */
    public final void mo128921f(vjx0 vjx0Var) {
        vjx0Var.getClass();
        this.f177689a.mo128921f(vjx0Var);
    }

    @Override // p149l.z4x0
    @Nullable
    public final Uri zzc() {
        return this.f177689a.zzc();
    }

    @Override // p149l.z4x0
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // p149l.z4x0, p149l.djx0
    public final Map zze() {
        return this.f177689a.zze();
    }
}
