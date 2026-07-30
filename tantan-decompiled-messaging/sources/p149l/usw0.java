package p149l;

import com.google.android.gms.internal.ads.C2261u4;
import com.google.android.gms.internal.ads.zzgyl;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public final class usw0 implements dnw0 {

    /* JADX INFO: renamed from: c */
    public static final byte[] f178207c = new byte[0];

    /* JADX INFO: renamed from: d */
    public static final Set f178208d;

    /* JADX INFO: renamed from: a */
    public final C2261u4 f178209a;

    /* JADX INFO: renamed from: b */
    public final dnw0 f178210b;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f178208d = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public usw0(C2261u4 c2261u4, dnw0 dnw0Var) {
        if (!f178208d.contains(c2261u4.m13352R())) {
            all.m97315a("Unsupported DEK key type: ", c2261u4.m13352R(), ". Only Tink AEAD key types are supported.");
            throw null;
        }
        this.f178209a = c2261u4;
        this.f178210b = dnw0Var;
    }

    @Override // p149l.dnw0
    /* JADX INFO: renamed from: a */
    public final byte[] mo108198a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
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
            byte[] bArrMo108198a = this.f178210b.mo108198a(bArr3, f178207c);
            String strM13352R = this.f178209a.m13352R();
            Logger logger = tow0.f171416a;
            zzgyl zzgylVar = zzgyl.zzb;
            return ((dnw0) tow0.m189938d(strM13352R, zzgyl.zzv(bArrMo108198a, 0, bArrMo108198a.length), dnw0.class)).mo108198a(bArr4, bArr2);
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
