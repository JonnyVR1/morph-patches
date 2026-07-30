package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgx;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class k0x0 extends gzw0 {

    /* JADX INFO: renamed from: e */
    public final byte[] f120518e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Uri f120519f;

    /* JADX INFO: renamed from: g */
    public int f120520g;

    /* JADX INFO: renamed from: h */
    public int f120521h;

    /* JADX INFO: renamed from: i */
    public boolean f120522i;

    public k0x0(byte[] bArr) {
        super(false);
        f5v0.m119533d(bArr.length > 0);
        this.f120518e = bArr;
    }

    @Override // p149l.hpy0
    /* JADX INFO: renamed from: a */
    public final int mo12727a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f120521h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(this.f120518e, this.f120520g, bArr, i, iMin);
        this.f120520g += iMin;
        this.f120521h -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // p149l.z4x0
    /* JADX INFO: renamed from: e */
    public final long mo12728e(uax0 uax0Var) throws IOException {
        this.f120519f = uax0Var.f175648a;
        m128923k(uax0Var);
        long j = uax0Var.f175653f;
        int length = this.f120518e.length;
        if (j > length) {
            throw new zzgx(2008);
        }
        int i = (int) j;
        this.f120520g = i;
        int i2 = length - i;
        this.f120521h = i2;
        long j2 = uax0Var.f175654g;
        if (j2 != -1) {
            this.f120521h = (int) Math.min(i2, j2);
        }
        this.f120522i = true;
        m128924l(uax0Var);
        long j3 = uax0Var.f175654g;
        return j3 != -1 ? j3 : this.f120521h;
    }

    @Override // p149l.z4x0
    @Nullable
    public final Uri zzc() {
        return this.f120519f;
    }

    @Override // p149l.z4x0
    public final void zzd() {
        if (this.f120522i) {
            this.f120522i = false;
            m128922j();
        }
        this.f120519f = null;
    }
}
