package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgx;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class q9x0 extends m8x0 {

    /* JADX INFO: renamed from: e */
    public final byte[] f156274e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Uri f156275f;

    /* JADX INFO: renamed from: g */
    public int f156276g;

    /* JADX INFO: renamed from: h */
    public int f156277h;

    /* JADX INFO: renamed from: i */
    public boolean f156278i;

    public q9x0(byte[] bArr) {
        super(false);
        lev0.m153956d(bArr.length > 0);
        this.f156274e = bArr;
    }

    @Override // p153l.nyy0
    /* JADX INFO: renamed from: a */
    public final int mo12781a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f156277h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(this.f156274e, this.f156276g, bArr, i, iMin);
        this.f156276g += iMin;
        this.f156277h -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // p153l.fex0
    /* JADX INFO: renamed from: e */
    public final long mo12782e(akx0 akx0Var) throws IOException {
        this.f156275f = akx0Var.f72047a;
        m157522k(akx0Var);
        long j = akx0Var.f72052f;
        int length = this.f156274e.length;
        if (j > length) {
            throw new zzgx(2008);
        }
        int i = (int) j;
        this.f156276g = i;
        int i2 = length - i;
        this.f156277h = i2;
        long j2 = akx0Var.f72053g;
        if (j2 != -1) {
            this.f156277h = (int) Math.min(i2, j2);
        }
        this.f156278i = true;
        m157523l(akx0Var);
        long j3 = akx0Var.f72053g;
        return j3 != -1 ? j3 : this.f156277h;
    }

    @Override // p153l.fex0
    @Nullable
    public final Uri zzc() {
        return this.f156275f;
    }

    @Override // p153l.fex0
    public final void zzd() {
        if (this.f156278i) {
            this.f156278i = false;
            m157521j();
        }
        this.f156275f = null;
    }
}
