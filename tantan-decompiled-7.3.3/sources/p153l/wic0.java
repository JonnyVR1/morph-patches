package p153l;

import com.clevertap.android.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import kotlin.Metadata;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import p000.C0799b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m88121d2 = {"Ll/wic0;", "", "<init>", "()V", "", Constants.KEY_KEY, "Ljava/security/PublicKey;", "c", "(Ljava/lang/String;)Ljava/security/PublicKey;", "Ljavax/crypto/Cipher;", "cipher", "", "data", "", "maxBlockSize", "a", "(Ljavax/crypto/Cipher;[BI)[B", "publicKey", "content", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "MKFDT_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class wic0 {
    public static final wic0 INSTANCE = new wic0();

    private wic0() {
    }

    /* JADX INFO: renamed from: a */
    private final byte[] m206581a(Cipher cipher, byte[] data, int maxBlockSize) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrDoFinal;
        int length = data.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = length - i;
            if (i3 <= 0) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            }
            if (i3 > maxBlockSize) {
                bArrDoFinal = cipher.doFinal(data, i, maxBlockSize);
                bArrDoFinal.getClass();
            } else {
                if (i3 > maxBlockSize) {
                    i3 = maxBlockSize;
                }
                bArrDoFinal = cipher.doFinal(data, i, i3);
                bArrDoFinal.getClass();
            }
            byteArrayOutputStream.write(bArrDoFinal, 0, bArrDoFinal.length);
            i2++;
            i = i2 * maxBlockSize;
        }
    }

    /* JADX INFO: renamed from: c */
    private final PublicKey m206582c(String key) throws InvalidKeySpecException {
        Charset charset = Charsets.UTF_8;
        if (key == null) {
            C0799b.m4641a("null cannot be cast to non-null type java.lang.String");
            return null;
        }
        byte[] bytes = key.getBytes(charset);
        bytes.getClass();
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(oe2.m167349a(bytes)));
        publicKeyGeneratePublic.getClass();
        return publicKeyGeneratePublic;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m206583b(@NotNull String publicKey, @NotNull String content) throws Exception {
        publicKey.getClass();
        content.getClass();
        PublicKey publicKeyM206582c = m206582c(publicKey);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, publicKeyM206582c);
        Charset charsetForName = Charset.forName("utf-8");
        charsetForName.getClass();
        byte[] bytes = content.getBytes(charsetForName);
        bytes.getClass();
        byte[] bArrM167349a = oe2.m167349a(bytes);
        bArrM167349a.getClass();
        return new String(m206581a(cipher, bArrM167349a, 64), Charsets.UTF_8);
    }
}
