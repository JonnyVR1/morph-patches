package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.C2047a;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class lb0 implements a5c {

    /* JADX INFO: renamed from: a */
    public final a5c f127255a;

    /* JADX INFO: renamed from: b */
    public final byte[] f127256b;

    /* JADX INFO: renamed from: c */
    public final byte[] f127257c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public CipherInputStream f127258d;

    public lb0(a5c a5cVar, byte[] bArr, byte[] bArr2) {
        this.f127255a = a5cVar;
        this.f127256b = bArr;
        this.f127257c = bArr2;
    }

    @Override // p149l.a5c
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Uri mo11121a() {
        return this.f127255a.mo11121a();
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: b */
    public final Map<String, List<String>> mo11122b() {
        return this.f127255a.mo11122b();
    }

    @Override // p149l.a5c
    public void close() throws IOException {
        if (this.f127258d != null) {
            this.f127258d = null;
            this.f127255a.close();
        }
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: e */
    public final void mo11123e(l7j0 l7j0Var) {
        p11.m167011e(l7j0Var);
        this.f127255a.mo11123e(l7j0Var);
    }

    /* JADX INFO: renamed from: j */
    public Cipher m149184j() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: n */
    public final long mo11125n(C2047a c2047a) throws IOException {
        try {
            Cipher cipherM149184j = m149184j();
            try {
                cipherM149184j.init(2, new SecretKeySpec(this.f127256b, "AES"), new IvParameterSpec(this.f127257c));
                d5c d5cVar = new d5c(this.f127255a, c2047a);
                this.f127258d = new CipherInputStream(d5cVar, cipherM149184j);
                d5cVar.m110049m();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                aag0.m95543a(e);
                return 0L;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            aag0.m95543a(e2);
            return 0L;
        }
    }

    @Override // p149l.w4c
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        p11.m167011e(this.f127258d);
        int i3 = this.f127258d.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }
}
