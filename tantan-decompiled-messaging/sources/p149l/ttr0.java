package p149l;

import com.google.android.gms.internal.ads.zzavn;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public final class ttr0 {

    /* JADX INFO: renamed from: a */
    public static Cipher f172057a;

    /* JADX INFO: renamed from: b */
    public static final Object f172058b = new Object();

    /* JADX INFO: renamed from: c */
    public static final Object f172059c = new Object();

    public ttr0(SecureRandom secureRandom) {
    }

    /* JADX INFO: renamed from: c */
    public static final Cipher m190621c() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher;
        synchronized (f172059c) {
            try {
                if (f172057a == null) {
                    f172057a = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f172057a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    /* JADX INFO: renamed from: a */
    public final String m190622a(byte[] bArr, byte[] bArr2) throws zzavn {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f172058b) {
                m190621c().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = m190621c().doFinal(bArr2);
                iv = m190621c().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return irr0.m137915a(bArr3, false);
        } catch (InvalidKeyException e) {
            throw new zzavn(this, e);
        } catch (NoSuchAlgorithmException e2) {
            throw new zzavn(this, e2);
        } catch (BadPaddingException e3) {
            throw new zzavn(this, e3);
        } catch (IllegalBlockSizeException e4) {
            throw new zzavn(this, e4);
        } catch (NoSuchPaddingException e5) {
            throw new zzavn(this, e5);
        }
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m190623b(byte[] bArr, String str) throws zzavn {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrM137916b = irr0.m137916b(str, false);
            int length2 = bArrM137916b.length;
            if (length2 <= 16) {
                throw new zzavn(this);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrM137916b);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f172058b) {
                m190621c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = m190621c().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e) {
            throw new zzavn(this, e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new zzavn(this, e2);
        } catch (InvalidKeyException e3) {
            throw new zzavn(this, e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new zzavn(this, e4);
        } catch (BadPaddingException e5) {
            throw new zzavn(this, e5);
        } catch (IllegalBlockSizeException e6) {
            throw new zzavn(this, e6);
        } catch (NoSuchPaddingException e7) {
            throw new zzavn(this, e7);
        }
    }
}
