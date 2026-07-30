package p153l;

import android.util.Base64;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.tencent.open.SocialOperation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p122io.TextStreamsKt;
import kotlin.text.C15493d;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m88121d2 = {"Ll/og50;", "", "<init>", "()V", "", "kid", "c", "(Ljava/lang/String;)Ljava/lang/String;", Constants.KEY_KEY, "Ljava/security/PublicKey;", "b", "(Ljava/lang/String;)Ljava/security/PublicKey;", "publicKey", "data", SocialOperation.GAME_SIGNATURE, "", Constants.INAPP_DATA_TAG, "(Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;)Z", "a", "Ljava/lang/String;", "getOPENID_KEYS_PATH", "()Ljava/lang/String;", "OPENID_KEYS_PATH", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class og50 {

    @NotNull
    public static final og50 INSTANCE = new og50();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String OPENID_KEYS_PATH = "/.well-known/oauth/openid/keys/";

    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.String] */
    /* JADX INFO: renamed from: a */
    public static void m167522a(URL url, Ref.ObjectRef objectRef, String str, ReentrantLock reentrantLock, Condition condition) throws IOException {
        url.getClass();
        objectRef.getClass();
        str.getClass();
        reentrantLock.getClass();
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        uRLConnectionOpenConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                inputStream.getClass();
                String strM88314g = TextStreamsKt.m88314g(new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192));
                httpURLConnection.getInputStream().close();
                objectRef.element = new JSONObject(strM88314g).optString(str);
                httpURLConnection.disconnect();
                reentrantLock.lock();
                try {
                    condition.signal();
                    Unit unit = Unit.INSTANCE;
                } finally {
                    reentrantLock.unlock();
                }
            } catch (Exception e) {
                INSTANCE.getClass();
                e.getMessage();
                httpURLConnection.disconnect();
                reentrantLock.lock();
                try {
                    condition.signal();
                    Unit unit2 = Unit.INSTANCE;
                } finally {
                    reentrantLock.unlock();
                }
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            reentrantLock.lock();
            try {
                condition.signal();
                Unit unit3 = Unit.INSTANCE;
                throw th;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final PublicKey m167523b(@NotNull String key) {
        key.getClass();
        byte[] bArrDecode = Base64.decode(C15493d.m94370F(C15493d.m94370F(C15493d.m94370F(key, SignParameters.NEW_LINE, "", false, 4, null), "-----BEGIN PUBLIC KEY-----", "", false, 4, null), "-----END PUBLIC KEY-----", "", false, 4, null), 0);
        bArrDecode.getClass();
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
        publicKeyGeneratePublic.getClass();
        return publicKeyGeneratePublic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final String m167524c(@NotNull final String kid) {
        kid.getClass();
        final URL url = new URL("https", "www." + C1600c.m8111v(), OPENID_KEYS_PATH);
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition conditionNewCondition = reentrantLock.newCondition();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C1600c.m8110u().execute(new Runnable() { // from class: l.ng50
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                og50.m167522a(url, objectRef, kid, reentrantLock, conditionNewCondition);
            }
        });
        reentrantLock.lock();
        try {
            conditionNewCondition.await(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, TimeUnit.MILLISECONDS);
            return (String) objectRef.element;
        } finally {
            reentrantLock.unlock();
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m167525d(@NotNull PublicKey publicKey, @NotNull String data, @NotNull String signature) {
        publicKey.getClass();
        data.getClass();
        signature.getClass();
        try {
            Signature signature2 = Signature.getInstance("SHA256withRSA");
            signature2.initVerify(publicKey);
            byte[] bytes = data.getBytes(Charsets.UTF_8);
            bytes.getClass();
            signature2.update(bytes);
            byte[] bArrDecode = Base64.decode(signature, 8);
            bArrDecode.getClass();
            return signature2.verify(bArrDecode);
        } catch (Exception unused) {
            return false;
        }
    }
}
