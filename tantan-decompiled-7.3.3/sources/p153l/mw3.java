package p153l;

import android.security.keystore.KeyGenParameterSpec;
import com.clevertap.android.sdk.Logger;
import java.security.Key;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/mw3;", "", "Ll/uxb;", "cryptRepository", "<init>", "(Ll/uxb;)V", "Ljavax/crypto/SecretKey;", "a", "()Ljavax/crypto/SecretKey;", "b", "c", "Ll/uxb;", "getCryptRepository", "()Ll/uxb;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class mw3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final uxb cryptRepository;

    public mw3(@NotNull uxb uxbVar) {
        uxbVar.getClass();
        this.cryptRepository = uxbVar;
    }

    /* JADX INFO: renamed from: a */
    private final SecretKey m160416a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (keyStore.containsAlias("EncryptionKey")) {
                Key key = keyStore.getKey("EncryptionKey", null);
                key.getClass();
                return (SecretKey) key;
            }
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("EncryptionKey", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
            keyGenParameterSpecBuild.getClass();
            keyGenerator.init(keyGenParameterSpecBuild);
            return keyGenerator.generateKey();
        } catch (Exception e) {
            Logger.m5930v("Error generating or retrieving key", e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final SecretKey m160417b() {
        return m160416a();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final SecretKey m160418c() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        secretKeyGenerateKey.getClass();
        return secretKeyGenerateKey;
    }
}
