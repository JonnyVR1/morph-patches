package p153l;

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
public final class z2s0 {

    /* JADX INFO: renamed from: a */
    public static Cipher f202733a;

    /* JADX INFO: renamed from: b */
    public static final Object f202734b = new Object();

    /* JADX INFO: renamed from: c */
    public static final Object f202735c = new Object();

    public z2s0(SecureRandom secureRandom) {
    }

    /* JADX INFO: renamed from: c */
    public static final Cipher m218461c() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher;
        synchronized (f202735c) {
            try {
                if (f202733a == null) {
                    f202733a = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f202733a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    /* JADX INFO: renamed from: a */
    public final String m218462a(byte[] bArr, byte[] bArr2) throws zzavn {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f202734b) {
                m218461c().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = m218461c().doFinal(bArr2);
                iv = m218461c().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return o0s0.m165547a(bArr3, false);
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
    public final byte[] m218463b(byte[] bArr, String str) throws zzavn {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrM165548b = o0s0.m165548b(str, false);
            int length2 = bArrM165548b.length;
            if (length2 <= 16) {
                throw new zzavn(this);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrM165548b);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f202734b) {
                m218461c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = m218461c().doFinal(bArr3);
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
