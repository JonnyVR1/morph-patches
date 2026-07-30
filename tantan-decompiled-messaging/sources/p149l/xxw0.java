package p149l;

import com.google.android.gms.internal.ads.C2261u4;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class xxw0 implements fyw0 {

    /* JADX INFO: renamed from: a */
    public final q6x0 f194920a;

    /* JADX INFO: renamed from: b */
    public final C2261u4 f194921b;

    public xxw0(C2261u4 c2261u4, q6x0 q6x0Var) {
        this.f194921b = c2261u4;
        this.f194920a = q6x0Var;
    }

    /* JADX INFO: renamed from: a */
    public static xxw0 m211569a(C2261u4 c2261u4) throws GeneralSecurityException {
        String strM13352R = c2261u4.m13352R();
        Charset charset = oyw0.f146369a;
        byte[] bArr = new byte[strM13352R.length()];
        for (int i = 0; i < strM13352R.length(); i++) {
            char cCharAt = strM13352R.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i] = (byte) cCharAt;
        }
        return new xxw0(c2261u4, q6x0.m173179b(bArr));
    }

    /* JADX INFO: renamed from: b */
    public static xxw0 m211570b(C2261u4 c2261u4) {
        return new xxw0(c2261u4, oyw0.m166725a(c2261u4.m13352R()));
    }

    /* JADX INFO: renamed from: c */
    public final C2261u4 m211571c() {
        return this.f194921b;
    }

    @Override // p149l.fyw0
    public final q6x0 zzd() {
        return this.f194920a;
    }
}
