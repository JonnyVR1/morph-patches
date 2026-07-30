package p153l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\rJ7\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018¨\u0006\u0019"}, m88121d2 = {"Ll/h;", "Ll/rxb;", "Ll/mw3;", "ctKeyGenerator", "<init>", "(Ll/mw3;)V", "", "cipherText", "Ll/h$a;", "c", "(Ljava/lang/String;)Ll/h$a;", "plainText", "b", "(Ljava/lang/String;)Ljava/lang/String;", "a", "", "mode", "", "data", "iv", "Ljavax/crypto/SecretKey;", "secretKey", Constants.INAPP_DATA_TAG, "(I[B[BLjavax/crypto/SecretKey;)Ll/h$a;", "Ll/mw3;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C17361h extends rxb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final mw3 ctKeyGenerator;

    /* JADX INFO: renamed from: l.h$a */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0016\u0010\u000f¨\u0006\u0017"}, m88121d2 = {"Ll/h$a;", "", "", "iv", "encryptedBytes", "<init>", "([B[B)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "()[B", "b", "", "toString", "()Ljava/lang/String;", "[B", Constants.INAPP_DATA_TAG, "c", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final byte[] iv;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final byte[] encryptedBytes;

        public a(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
            bArr.getClass();
            bArr2.getClass();
            this.iv = bArr;
            this.encryptedBytes = bArr2;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final byte[] getIv() {
            return this.iv;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final byte[] getEncryptedBytes() {
            return this.encryptedBytes;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final byte[] m133142c() {
            return this.encryptedBytes;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final byte[] m133143d() {
            return this.iv;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.m88377d(a.class, other != null ? other.getClass() : null)) {
                return false;
            }
            other.getClass();
            a aVar = (a) other;
            return Arrays.equals(this.iv, aVar.iv) && Arrays.equals(this.encryptedBytes, aVar.encryptedBytes);
        }

        public int hashCode() {
            return (Arrays.hashCode(this.iv) * 31) + Arrays.hashCode(this.encryptedBytes);
        }

        @NotNull
        public String toString() {
            return "AESGCMCryptResult(iv=" + Arrays.toString(this.iv) + ", encryptedBytes=" + Arrays.toString(this.encryptedBytes) + ')';
        }
    }

    public C17361h(@NotNull mw3 mw3Var) {
        mw3Var.getClass();
        this.ctKeyGenerator = mw3Var;
    }

    /* JADX INFO: renamed from: c */
    private final a m133137c(String cipherText) {
        try {
            String strY0 = StringsKt.m94349y0(StringsKt.m94347w0(cipherText, Constants.AES_GCM_PREFIX), Constants.AES_GCM_SUFFIX);
            int iC0 = StringsKt.m94327c0(strY0, ":", 0, false, 6, null);
            if (iC0 != -1) {
                return new a(sxb.m188476a(strY0.substring(0, iC0)), sxb.m188476a(strY0.substring(iC0 + 1)));
            }
            Logger.m5927v("Invalid cipher text format: delimiter not found");
            return null;
        } catch (Exception e) {
            Logger.m5930v("Error parsing cipherText", e);
            return null;
        } catch (OutOfMemoryError e2) {
            Logger.m5930v("Unable to parse cipher text", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ a m133138e(C17361h c17361h, int i, byte[] bArr, byte[] bArr2, SecretKey secretKey, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            bArr2 = null;
        }
        if ((i2 & 8) != 0) {
            secretKey = c17361h.ctKeyGenerator.m160417b();
        }
        return c17361h.m133139d(i, bArr, bArr2, secretKey);
    }

    @Override // p153l.rxb
    @Nullable
    /* JADX INFO: renamed from: a */
    public String mo118774a(@NotNull String cipherText) {
        cipherText.getClass();
        a aVarM133137c = m133137c(cipherText);
        if (aVarM133137c == null) {
            return null;
        }
        a aVarM133138e = m133138e(this, 2, aVarM133137c.getEncryptedBytes(), aVarM133137c.getIv(), null, 8, null);
        if (aVarM133138e == null) {
            return null;
        }
        byte[] encryptedBytes = aVarM133138e.getEncryptedBytes();
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        return new String(encryptedBytes, charset);
    }

    @Override // p153l.rxb
    @Nullable
    /* JADX INFO: renamed from: b */
    public String mo118775b(@NotNull String plainText) {
        plainText.getClass();
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = plainText.getBytes(charset);
        bytes.getClass();
        a aVarM133138e = m133138e(this, 1, bytes, null, null, 12, null);
        if (aVarM133138e == null) {
            return null;
        }
        return Constants.AES_GCM_PREFIX + sxb.m188477b(aVarM133138e.getIv()) + ':' + sxb.m188477b(aVarM133138e.getEncryptedBytes()) + Constants.AES_GCM_SUFFIX;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final a m133139d(int mode, @NotNull byte[] data, @Nullable byte[] iv, @Nullable SecretKey secretKey) {
        data.getClass();
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            if (mode == 1) {
                cipher.init(mode, secretKey);
                byte[] iv2 = cipher.getIV();
                byte[] bArrDoFinal = cipher.doFinal(data);
                iv2.getClass();
                bArrDoFinal.getClass();
                return new a(iv2, bArrDoFinal);
            }
            if (mode != 2) {
                Logger.m5927v("Invalid mode used");
                return null;
            }
            if (iv == null) {
                Logger.m5927v("IV is required for decryption");
                return null;
            }
            cipher.init(mode, secretKey, new GCMParameterSpec(128, iv));
            byte[] bArrDoFinal2 = cipher.doFinal(data);
            bArrDoFinal2.getClass();
            return new a(iv, bArrDoFinal2);
        } catch (Exception e) {
            Logger.m5930v("Error performing crypt operation", e);
            return null;
        }
    }
}
