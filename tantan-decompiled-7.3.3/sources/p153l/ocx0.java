package p153l;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgx;
import java.io.IOException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes6.dex */
public final class ocx0 extends m8x0 {

    /* JADX INFO: renamed from: e */
    @Nullable
    public akx0 f146747e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public byte[] f146748f;

    /* JADX INFO: renamed from: g */
    public int f146749g;

    /* JADX INFO: renamed from: h */
    public int f146750h;

    public ocx0() {
        super(false);
    }

    @Override // p153l.nyy0
    /* JADX INFO: renamed from: a */
    public final int mo12781a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f146750h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f146748f;
        int i4 = mpw0.f137957a;
        System.arraycopy(bArr2, this.f146749g, bArr, i, iMin);
        this.f146749g += iMin;
        this.f146750h -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // p153l.fex0
    /* JADX INFO: renamed from: e */
    public final long mo12782e(akx0 akx0Var) throws IOException {
        m157522k(akx0Var);
        this.f146747e = akx0Var;
        Uri uriNormalizeScheme = akx0Var.f72047a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        lev0.m153957e("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i = mpw0.f137957a;
        String[] strArrSplit = schemeSpecificPart.split(Constants.SEPARATOR_COMMA, -1);
        if (strArrSplit.length != 2) {
            throw zzcc.zzb("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f146748f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw zzcc.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
            }
        } else {
            this.f146748f = URLDecoder.decode(str, cow0.f82929a.name()).getBytes(cow0.f82931c);
        }
        long j = akx0Var.f72052f;
        int length = this.f146748f.length;
        if (j > length) {
            this.f146748f = null;
            throw new zzgx(2008);
        }
        int i2 = (int) j;
        this.f146749g = i2;
        int i3 = length - i2;
        this.f146750h = i3;
        long j2 = akx0Var.f72053g;
        if (j2 != -1) {
            this.f146750h = (int) Math.min(i3, j2);
        }
        m157523l(akx0Var);
        long j3 = akx0Var.f72053g;
        return j3 != -1 ? j3 : this.f146750h;
    }

    @Override // p153l.fex0
    @Nullable
    public final Uri zzc() {
        akx0 akx0Var = this.f146747e;
        if (akx0Var != null) {
            return akx0Var.f72047a;
        }
        return null;
    }

    @Override // p153l.fex0
    public final void zzd() {
        if (this.f146748f != null) {
            this.f146748f = null;
            m157521j();
        }
        this.f146747e = null;
    }
}
