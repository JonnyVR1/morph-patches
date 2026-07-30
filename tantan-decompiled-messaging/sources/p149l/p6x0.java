package p149l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class p6x0 implements dnw0 {

    /* JADX INFO: renamed from: a */
    public final dvw0 f147456a;

    /* JADX INFO: renamed from: b */
    public final byte[] f147457b;

    public p6x0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.f147456a = new dvw0(bArr);
        this.f147457b = bArr2;
    }

    /* JADX INFO: renamed from: b */
    public static dnw0 m167699b(cuw0 cuw0Var) throws GeneralSecurityException {
        return new p6x0(cuw0Var.m108817d().m178105d(qnw0.m175705a()), cuw0Var.m108816c().m173181c());
    }

    /* JADX INFO: renamed from: c */
    private final byte[] m167700c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            j8w0.m140474a("ciphertext too short");
            return null;
        }
        return this.f147456a.m104086b(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    @Override // p149l.dnw0
    /* JADX INFO: renamed from: a */
    public final byte[] mo108198a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f147457b;
        if (bArr3.length == 0) {
            return m167700c(bArr, bArr2);
        }
        if (!oyw0.m166726b(bArr3, bArr)) {
            j8w0.m140474a("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = this.f147457b;
        return m167700c(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}
