package p153l;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public final class tfx0 implements kxw0 {

    /* JADX INFO: renamed from: e */
    public static final byte[] f174018e = {0};

    /* JADX INFO: renamed from: a */
    public final zax0 f174019a;

    /* JADX INFO: renamed from: b */
    public final int f174020b;

    /* JADX INFO: renamed from: c */
    public final byte[] f174021c;

    /* JADX INFO: renamed from: d */
    public final byte[] f174022d;

    public tfx0(z8x0 z8x0Var) throws GeneralSecurityException {
        String strValueOf = String.valueOf(z8x0Var.m219033d().m148904f());
        this.f174019a = new sfx0("HMAC".concat(strValueOf), new SecretKeySpec(z8x0Var.m219034e().m210864d(www0.m208321a()), "HMAC"));
        this.f174020b = z8x0Var.m219033d().m148901b();
        this.f174021c = z8x0Var.mo157601b().m206172c();
        if (z8x0Var.m219033d().m148905g().equals(i9x0.f113526d)) {
            this.f174022d = Arrays.copyOf(f174018e, 1);
        } else {
            this.f174022d = new byte[0];
        }
    }

    /* JADX INFO: renamed from: a */
    public static kxw0 m191002a(y7x0 y7x0Var) throws GeneralSecurityException {
        return new tfx0(y7x0Var);
    }

    /* JADX INFO: renamed from: b */
    public static kxw0 m191003b(z8x0 z8x0Var) throws GeneralSecurityException {
        return new tfx0(z8x0Var);
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m191004c(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.f174022d;
        int length = bArr2.length;
        byte[] bArr3 = this.f174021c;
        return length > 0 ? sex0.m185577b(bArr3, this.f174019a.mo176427a(sex0.m185577b(bArr, bArr2), this.f174020b)) : sex0.m185577b(bArr3, this.f174019a.mo176427a(bArr, this.f174020b));
    }

    public tfx0(y7x0 y7x0Var) throws GeneralSecurityException {
        this.f174019a = new qfx0(y7x0Var.m214705d().m210864d(www0.m208321a()));
        this.f174020b = y7x0Var.m214704c().m133992b();
        this.f174021c = y7x0Var.mo157601b().m206172c();
        if (y7x0Var.m214704c().m133995e().equals(f8x0.f97786d)) {
            this.f174022d = Arrays.copyOf(f174018e, 1);
        } else {
            this.f174022d = new byte[0];
        }
    }

    public tfx0(zax0 zax0Var, int i) throws GeneralSecurityException {
        this.f174019a = zax0Var;
        this.f174020b = i;
        this.f174021c = new byte[0];
        this.f174022d = new byte[0];
        zax0Var.mo176427a(new byte[0], i);
    }
}
