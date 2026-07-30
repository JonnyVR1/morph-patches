package p153l;

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
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u000f0\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, m88121d2 = {"Ll/sj20;", "", "Ll/mw3;", "keyGenerator", "Ll/h;", "aesgcm", "<init>", "(Ll/mw3;Ll/h;)V", "Ljavax/crypto/SecretKey;", "f", "()Ljavax/crypto/SecretKey;", "", "e", "()[B", "arr", "", "a", "([B)Ljava/lang/String;", "kotlin.jvm.PlatformType", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "response", "Ll/m1f;", "c", "(Ljava/lang/String;)Ll/m1f;", "bodyString", "b", "Ll/mw3;", "Ll/h;", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class sj20 {

    /* JADX INFO: renamed from: c */
    @Nullable
    private static volatile SecretKey f168893c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final mw3 keyGenerator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final C17361h aesgcm;

    /* JADX INFO: renamed from: d */
    @NotNull
    private static final Object f168894d = new Object();

    public sj20(@NotNull mw3 mw3Var, @NotNull C17361h c17361h) {
        mw3Var.getClass();
        c17361h.getClass();
        this.keyGenerator = mw3Var;
        this.aesgcm = c17361h;
    }

    /* JADX INFO: renamed from: a */
    private final String m186049a(byte[] arr) {
        String strEncodeToString = Base64.encodeToString(arr, 2);
        strEncodeToString.getClass();
        return strEncodeToString;
    }

    /* JADX INFO: renamed from: e */
    private final byte[] m186050e() {
        byte[] encoded = m186051f().getEncoded();
        encoded.getClass();
        return encoded;
    }

    /* JADX INFO: renamed from: f */
    private final SecretKey m186051f() {
        if (f168893c == null) {
            synchronized (f168894d) {
                try {
                    if (f168893c == null) {
                        f168893c = this.keyGenerator.m160418c();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        SecretKey secretKey = f168893c;
        secretKey.getClass();
        return secretKey;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final m1f m186052b(@NotNull String bodyString) {
        bodyString.getClass();
        try {
            i1f i1fVarM138098a = i1f.INSTANCE.m138098a(bodyString);
            String encryptedPayload = i1fVarM138098a.getEncryptedPayload();
            String iv = i1fVarM138098a.getIv();
            byte[] bArrDecode = Base64.decode(encryptedPayload, 2);
            byte[] bArrDecode2 = Base64.decode(iv, 2);
            C17361h c17361h = this.aesgcm;
            bArrDecode.getClass();
            C17361h.a aVarM133139d = c17361h.m133139d(2, bArrDecode, bArrDecode2, m186051f());
            if (aVarM133139d == null) {
                return k1f.INSTANCE;
            }
            byte[] bArrM133142c = aVarM133139d.m133142c();
            Charset charset = Charsets.UTF_8;
            return new n1f(new String(bArrM133142c, charset), new String(aVarM133139d.m133143d(), charset));
        } catch (Exception e) {
            Logger.m5930v("Error decrypting response", e);
            return k1f.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final m1f m186053c(@NotNull String response) {
        response.getClass();
        C17361h c17361h = this.aesgcm;
        byte[] bytes = response.getBytes(Charsets.UTF_8);
        bytes.getClass();
        C17361h.a aVarM133139d = c17361h.m133139d(1, bytes, null, m186051f());
        return aVarM133139d != null ? new n1f(m186049a(aVarM133139d.m133142c()), m186049a(aVarM133139d.m133143d())) : k1f.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final String m186054d() {
        return Base64.encodeToString(m186050e(), 2);
    }
}
