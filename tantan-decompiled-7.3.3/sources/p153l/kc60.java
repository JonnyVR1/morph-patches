package p153l;

import android.os.Bundle;
import android.util.Base64;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.login.CodeChallengeMethod;
import com.sina.weibo.sdk.constant.WBConstants;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.random.Random;
import kotlin.ranges.C15274a;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/kc60;", "", "<init>", "()V", "", "codeVerifier", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Z", "c", "()Ljava/lang/String;", "Lcom/facebook/login/CodeChallengeMethod;", "codeChallengeMethod", "b", "(Ljava/lang/String;Lcom/facebook/login/CodeChallengeMethod;)Ljava/lang/String;", "authorizationCode", WBConstants.SSO_REDIRECT_URL, "Lcom/facebook/GraphRequest;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/GraphRequest;", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class kc60 {

    @NotNull
    public static final kc60 INSTANCE = new kc60();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final GraphRequest m149102a(@NotNull String authorizationCode, @NotNull String redirectUri, @NotNull String codeVerifier) {
        authorizationCode.getClass();
        redirectUri.getClass();
        codeVerifier.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("code", authorizationCode);
        bundle.putString("client_id", C1600c.m8102m());
        bundle.putString(WBConstants.AUTH_PARAMS_REDIRECT_URL, redirectUri);
        bundle.putString("code_verifier", codeVerifier);
        GraphRequest graphRequestM7639x = GraphRequest.INSTANCE.m7639x(null, "oauth/access_token", null);
        graphRequestM7639x.m7573F(HttpMethod.GET);
        graphRequestM7639x.m7574G(bundle);
        return graphRequestM7639x;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m149103b(@NotNull String codeVerifier, @NotNull CodeChallengeMethod codeChallengeMethod) throws FacebookException {
        codeVerifier.getClass();
        codeChallengeMethod.getClass();
        if (!m149105d(codeVerifier)) {
            throw new FacebookException("Invalid Code Verifier.");
        }
        if (codeChallengeMethod == CodeChallengeMethod.PLAIN) {
            return codeVerifier;
        }
        try {
            byte[] bytes = codeVerifier.getBytes(Charsets.US_ASCII);
            bytes.getClass();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            strEncodeToString.getClass();
            return strEncodeToString;
        } catch (Exception e) {
            throw new FacebookException(e);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m149104c() {
        int iM88495k = C15274a.m88495k(new IntRange(43, 128), Random.INSTANCE);
        List listPlus = CollectionsKt.plus((Collection<? extends char>) CollectionsKt.plus((Collection<? extends char>) CollectionsKt.plus((Collection<? extends char>) CollectionsKt.plus((Collection<? extends char>) CollectionsKt.plus((Collection) CollectionsKt.plus((Iterable) new CharRange('a', 'z'), (Iterable) new CharRange('A', Matrix.MATRIX_TYPE_ZERO)), (Iterable) new CharRange('0', '9')), '-'), '.'), '_'), '~');
        ArrayList arrayList = new ArrayList(iM88495k);
        for (int i = 0; i < iM88495k; i++) {
            Character ch = (Character) CollectionsKt.random(listPlus, Random.INSTANCE);
            ch.charValue();
            arrayList.add(ch);
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m149105d(@Nullable String codeVerifier) {
        if (codeVerifier == null || codeVerifier.length() == 0 || codeVerifier.length() < 43 || codeVerifier.length() > 128) {
            return false;
        }
        return new Regex("^[-._~A-Za-z0-9]+$").matches(codeVerifier);
    }
}
