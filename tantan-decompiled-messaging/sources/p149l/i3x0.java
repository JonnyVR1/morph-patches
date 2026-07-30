package p149l;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgx;
import java.io.IOException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes6.dex */
public final class i3x0 extends gzw0 {

    /* JADX INFO: renamed from: e */
    @Nullable
    public uax0 f111384e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public byte[] f111385f;

    /* JADX INFO: renamed from: g */
    public int f111386g;

    /* JADX INFO: renamed from: h */
    public int f111387h;

    public i3x0() {
        super(false);
    }

    @Override // p149l.hpy0
    /* JADX INFO: renamed from: a */
    public final int mo12727a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f111387h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f111385f;
        int i4 = ggw0.f102568a;
        System.arraycopy(bArr2, this.f111386g, bArr, i, iMin);
        this.f111386g += iMin;
        this.f111387h -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // p149l.z4x0
    /* JADX INFO: renamed from: e */
    public final long mo12728e(uax0 uax0Var) throws IOException {
        m128923k(uax0Var);
        this.f111384e = uax0Var;
        Uri uriNormalizeScheme = uax0Var.f175648a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        f5v0.m119534e("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i = ggw0.f102568a;
        String[] strArrSplit = schemeSpecificPart.split(Constants.SEPARATOR_COMMA, -1);
        if (strArrSplit.length != 2) {
            throw zzcc.zzb("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f111385f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw zzcc.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
            }
        } else {
            this.f111385f = URLDecoder.decode(str, wew0.f185988a.name()).getBytes(wew0.f185990c);
        }
        long j = uax0Var.f175653f;
        int length = this.f111385f.length;
        if (j > length) {
            this.f111385f = null;
            throw new zzgx(2008);
        }
        int i2 = (int) j;
        this.f111386g = i2;
        int i3 = length - i2;
        this.f111387h = i3;
        long j2 = uax0Var.f175654g;
        if (j2 != -1) {
            this.f111387h = (int) Math.min(i3, j2);
        }
        m128924l(uax0Var);
        long j3 = uax0Var.f175654g;
        return j3 != -1 ? j3 : this.f111387h;
    }

    @Override // p149l.z4x0
    @Nullable
    public final Uri zzc() {
        uax0 uax0Var = this.f111384e;
        if (uax0Var != null) {
            return uax0Var.f175648a;
        }
        return null;
    }

    @Override // p149l.z4x0
    public final void zzd() {
        if (this.f111385f != null) {
            this.f111385f = null;
            m128922j();
        }
        this.f111384e = null;
    }
}
