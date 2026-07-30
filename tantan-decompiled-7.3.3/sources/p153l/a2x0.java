package p153l;

import com.google.android.gms.internal.ads.C2284u4;
import com.google.android.gms.internal.ads.zzgyl;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public final class a2x0 implements jww0 {

    /* JADX INFO: renamed from: c */
    public static final byte[] f68225c = new byte[0];

    /* JADX INFO: renamed from: d */
    public static final Set f68226d;

    /* JADX INFO: renamed from: a */
    public final C2284u4 f68227a;

    /* JADX INFO: renamed from: b */
    public final jww0 f68228b;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f68226d = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public a2x0(C2284u4 c2284u4, jww0 jww0Var) {
        if (!f68226d.contains(c2284u4.m13406R())) {
            pnl.m173070a("Unsupported DEK key type: ", c2284u4.m13406R(), ". Only Tink AEAD key types are supported.");
            throw null;
        }
        this.f68227a = c2284u4;
        this.f68228b = jww0Var;
    }

    @Override // p153l.jww0
    /* JADX INFO: renamed from: a */
    public final byte[] mo95732a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrMo95732a = this.f68228b.mo95732a(bArr3, f68225c);
            String strM13406R = this.f68227a.m13406R();
            Logger logger = zxw0.f206524a;
            zzgyl zzgylVar = zzgyl.zzb;
            return ((jww0) zxw0.m222091d(strM13406R, zzgyl.zzv(bArrMo95732a, 0, bArrMo95732a.length), jww0.class)).mo95732a(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
