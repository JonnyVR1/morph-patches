package p149l;

import android.util.Base64;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import java.nio.charset.Charset;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u000f0\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, m87232d2 = {"Ll/jb20;", "", "Ll/nv3;", "keyGenerator", "Ll/h;", "aesgcm", "<init>", "(Ll/nv3;Ll/h;)V", "Ljavax/crypto/SecretKey;", "f", "()Ljavax/crypto/SecretKey;", "", "e", "()[B", "arr", "", "a", "([B)Ljava/lang/String;", "kotlin.jvm.PlatformType", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "response", "Ll/i0f;", "c", "(Ljava/lang/String;)Ll/i0f;", "bodyString", "b", "Ll/nv3;", "Ll/h;", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class jb20 {

    /* JADX INFO: renamed from: c */
    @Nullable
    private static volatile SecretKey f117155c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final nv3 keyGenerator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final C17211h aesgcm;

    /* JADX INFO: renamed from: d */
    @NotNull
    private static final Object f117156d = new Object();

    public jb20(@NotNull nv3 nv3Var, @NotNull C17211h c17211h) {
        nv3Var.getClass();
        c17211h.getClass();
        this.keyGenerator = nv3Var;
        this.aesgcm = c17211h;
    }

    /* JADX INFO: renamed from: a */
    private final String m140735a(byte[] arr) {
        String strEncodeToString = Base64.encodeToString(arr, 2);
        strEncodeToString.getClass();
        return strEncodeToString;
    }

    /* JADX INFO: renamed from: e */
    private final byte[] m140736e() {
        byte[] encoded = m140737f().getEncoded();
        encoded.getClass();
        return encoded;
    }

    /* JADX INFO: renamed from: f */
    private final SecretKey m140737f() {
        if (f117155c == null) {
            synchronized (f117156d) {
                try {
                    if (f117155c == null) {
                        f117155c = this.keyGenerator.m161532c();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        SecretKey secretKey = f117155c;
        secretKey.getClass();
        return secretKey;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final i0f m140738b(@NotNull String bodyString) {
        bodyString.getClass();
        try {
            e0f e0fVarM114178a = e0f.INSTANCE.m114178a(bodyString);
            String encryptedPayload = e0fVarM114178a.getEncryptedPayload();
            String iv = e0fVarM114178a.getIv();
            byte[] bArrDecode = Base64.decode(encryptedPayload, 2);
            byte[] bArrDecode2 = Base64.decode(iv, 2);
            C17211h c17211h = this.aesgcm;
            bArrDecode.getClass();
            C17211h.a aVarM128935d = c17211h.m128935d(2, bArrDecode, bArrDecode2, m140737f());
            if (aVarM128935d == null) {
                return g0f.INSTANCE;
            }
            byte[] bArrM128938c = aVarM128935d.m128938c();
            Charset charset = Charsets.UTF_8;
            return new j0f(new String(bArrM128938c, charset), new String(aVarM128935d.m128939d(), charset));
        } catch (Exception e) {
            Logger.m5876v("Error decrypting response", e);
            return g0f.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final i0f m140739c(@NotNull String response) {
        response.getClass();
        C17211h c17211h = this.aesgcm;
        byte[] bytes = response.getBytes(Charsets.UTF_8);
        bytes.getClass();
        C17211h.a aVarM128935d = c17211h.m128935d(1, bytes, null, m140737f());
        return aVarM128935d != null ? new j0f(m140735a(aVarM128935d.m128938c()), m140735a(aVarM128935d.m128939d())) : g0f.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final String m140740d() {
        return Base64.encodeToString(m140736e(), 2);
    }
}
