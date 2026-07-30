package p153l;

import com.google.android.gms.internal.ads.C2284u4;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class d7x0 implements l7x0 {

    /* JADX INFO: renamed from: a */
    public final wfx0 f85557a;

    /* JADX INFO: renamed from: b */
    public final C2284u4 f85558b;

    public d7x0(C2284u4 c2284u4, wfx0 wfx0Var) {
        this.f85558b = c2284u4;
        this.f85557a = wfx0Var;
    }

    /* JADX INFO: renamed from: a */
    public static d7x0 m114761a(C2284u4 c2284u4) throws GeneralSecurityException {
        String strM13406R = c2284u4.m13406R();
        Charset charset = u7x0.f177953a;
        byte[] bArr = new byte[strM13406R.length()];
        for (int i = 0; i < strM13406R.length(); i++) {
            char cCharAt = strM13406R.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i] = (byte) cCharAt;
        }
        return new d7x0(c2284u4, wfx0.m206170b(bArr));
    }

    /* JADX INFO: renamed from: b */
    public static d7x0 m114762b(C2284u4 c2284u4) {
        return new d7x0(c2284u4, u7x0.m194894a(c2284u4.m13406R()));
    }

    /* JADX INFO: renamed from: c */
    public final C2284u4 m114763c() {
        return this.f85558b;
    }

    @Override // p153l.l7x0
    public final wfx0 zzd() {
        return this.f85557a;
    }
}
