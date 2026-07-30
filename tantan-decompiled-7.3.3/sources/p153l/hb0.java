package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.C2070a;
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
public class hb0 implements g6c {

    /* JADX INFO: renamed from: a */
    public final g6c f108545a;

    /* JADX INFO: renamed from: b */
    public final byte[] f108546b;

    /* JADX INFO: renamed from: c */
    public final byte[] f108547c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public CipherInputStream f108548d;

    public hb0(g6c g6cVar, byte[] bArr, byte[] bArr2) {
        this.f108545a = g6cVar;
        this.f108546b = bArr;
        this.f108547c = bArr2;
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: a */
    public final Map<String, List<String>> mo11175a() {
        return this.f108545a.mo11175a();
    }

    @Override // p153l.g6c
    public void close() throws IOException {
        if (this.f108548d != null) {
            this.f108548d = null;
            this.f108545a.close();
        }
    }

    @Override // p153l.g6c
    @Nullable
    /* JADX INFO: renamed from: d */
    public final Uri mo11176d() {
        return this.f108545a.mo11176d();
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: e */
    public final void mo11177e(pgj0 pgj0Var) {
        w11.m204369e(pgj0Var);
        this.f108545a.mo11177e(pgj0Var);
    }

    /* JADX INFO: renamed from: j */
    public Cipher m134331j() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: n */
    public final long mo11179n(C2070a c2070a) throws IOException {
        try {
            Cipher cipherM134331j = m134331j();
            try {
                cipherM134331j.init(2, new SecretKeySpec(this.f108546b, "AES"), new IvParameterSpec(this.f108547c));
                j6c j6cVar = new j6c(this.f108545a, c2070a);
                this.f108548d = new CipherInputStream(j6cVar, cipherM134331j);
                j6cVar.m143636m();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                iig0.m140070a(e);
                return 0L;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            iig0.m140070a(e2);
            return 0L;
        }
    }

    @Override // p153l.e6c
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        w11.m204369e(this.f108548d);
        int i3 = this.f108548d.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }
}
