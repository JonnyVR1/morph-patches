package p149l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.p046p1.mobile.putong.data.SignInGrantType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u00162\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m87232d2 = {"Ll/e;", "Ll/dwb;", "", "accountID", "<init>", "(Ljava/lang/String;)V", "cipherText", "", "c", "(Ljava/lang/String;)[B", "", "mode", SignInGrantType.password, "text", Constants.INAPP_DATA_TAG, "(ILjava/lang/String;[B)[B", "plainText", "b", "(Ljava/lang/String;)Ljava/lang/String;", "a", "Ljava/lang/String;", "keyPassword", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class C16508e extends dwb {

    /* JADX INFO: renamed from: b */
    @NotNull
    private static final String f88525b = "Lq3fz";

    /* JADX INFO: renamed from: c */
    @NotNull
    private static final String f88526c = "bLti2";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String keyPassword;

    public C16508e(@NotNull String str) {
        str.getClass();
        this.keyPassword = f88525b + str + f88526c;
    }

    /* JADX INFO: renamed from: c */
    private final byte[] m114139c(String cipherText) {
        try {
            List<String> listSplit = new Regex("\\s*,\\s*").split(StringsKt.m93433Z0(cipherText.substring(1, cipherText.length() - 1)).toString(), 0);
            byte[] bArr = new byte[listSplit.size()];
            int size = listSplit.size();
            for (int i = 0; i < size; i++) {
                bArr[i] = Byte.parseByte(listSplit.get(i));
            }
            return bArr;
        } catch (Exception e) {
            Logger.m5876v("Unable to parse cipher text", e);
            return null;
        } catch (OutOfMemoryError e2) {
            Logger.m5876v("Unable to parse cipher text", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private final byte[] m114140d(int mode, String password, byte[] text) {
        try {
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = Constants.CRYPTION_SALT.getBytes(charset);
            bytes.getClass();
            charset.getClass();
            byte[] bytes2 = Constants.CRYPTION_IV.getBytes(charset);
            bytes2.getClass();
            char[] charArray = password.toCharArray();
            charArray.getClass();
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBEWithMD5And128BitAES-CBC-OpenSSL").generateSecret(new PBEKeySpec(charArray, bytes, 1000, 256)).getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(mode, secretKeySpec, new IvParameterSpec(bytes2));
            return cipher.doFinal(text);
        } catch (Exception e) {
            Logger.m5876v("Unable to perform crypt operation", e);
            return null;
        }
    }

    @Override // p149l.dwb
    @Nullable
    /* JADX INFO: renamed from: a */
    public String mo113864a(@NotNull String cipherText) {
        byte[] bArrM114140d;
        cipherText.getClass();
        byte[] bArrM114139c = m114139c(cipherText);
        if (bArrM114139c == null || (bArrM114140d = m114140d(2, this.keyPassword, bArrM114139c)) == null) {
            return null;
        }
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        return new String(bArrM114140d, charset);
    }

    @Override // p149l.dwb
    @Nullable
    /* JADX INFO: renamed from: b */
    public String mo113865b(@NotNull String plainText) {
        plainText.getClass();
        String str = this.keyPassword;
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = plainText.getBytes(charset);
        bytes.getClass();
        byte[] bArrM114140d = m114140d(1, str, bytes);
        if (bArrM114140d == null) {
            return null;
        }
        String string = Arrays.toString(bArrM114140d);
        string.getClass();
        return string;
    }
}
