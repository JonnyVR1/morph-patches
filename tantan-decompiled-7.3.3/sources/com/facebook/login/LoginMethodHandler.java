package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.AuthenticationToken;
import com.facebook.C1600c;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.appevents.C1577f;
import com.facebook.internal.C1680e;
import com.p051p1.mobile.putong.core.data.StickerBundle;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.kc60;
import p153l.mnd0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u000e\b'\u0018\u0000 B2\u00020\u0001:\u0001'B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0014\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\"\u0010#J#\u0010'\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010\u001e2\b\u0010&\u001a\u0004\u0018\u00010%H\u0014¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020,2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0012H\u0016¢\u0006\u0004\b4\u0010\u0016R4\u00106\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010\u0005R\u0014\u0010A\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010 ¨\u0006C"}, m88121d2 = {"Lcom/facebook/login/LoginMethodHandler;", "Landroid/os/Parcelable;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "Lcom/facebook/login/LoginClient$Request;", SocialConstants.TYPE_REQUEST, "", "p", "(Lcom/facebook/login/LoginClient$Request;)I", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "k", "(IILandroid/content/Intent;)Z", RXScreenCaptureService.KEY_INDEX, "()Z", "", "b", "()V", "Lorg/json/JSONObject;", "param", "m", "(Lorg/json/JSONObject;)V", "", "g", "()Ljava/lang/String;", "authId", "c", "(Ljava/lang/String;)Ljava/lang/String;", Constants.KEY_KEY, "", "value", "a", "(Ljava/lang/String;Ljava/lang/Object;)V", "e2e", "h", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "values", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/facebook/login/LoginClient$Request;Landroid/os/Bundle;)Landroid/os/Bundle;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "o", "", "methodLoggingExtras", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "setMethodLoggingExtras", "(Ljava/util/Map;)V", "Lcom/facebook/login/LoginClient;", Constants.INAPP_DATA_TAG, "()Lcom/facebook/login/LoginClient;", "n", "f", "nameForLogging", "Companion", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
@VisibleForTesting(otherwise = 3)
public abstract class LoginMethodHandler implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String NO_SIGNED_REQUEST_ERROR_MESSAGE = "Authorization response does not contain the signed_request";

    @NotNull
    public static final String NO_USER_ID_ERROR_MESSAGE = "Failed to retrieve user_id from signed_request";

    @NotNull
    public static final String USER_CANCELED_LOG_IN_ERROR_MESSAGE = "User canceled log in.";
    public LoginClient loginClient;

    @Nullable
    private Map<String, String> methodLoggingExtras;

    /* JADX INFO: renamed from: com.facebook.login.LoginMethodHandler$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\nJ=\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, m88121d2 = {"Lcom/facebook/login/LoginMethodHandler$a;", "", "<init>", "()V", "Landroid/os/Bundle;", StickerBundle.TYPE, "", "expectedNonce", "Lcom/facebook/AuthenticationToken;", "c", "(Landroid/os/Bundle;Ljava/lang/String;)Lcom/facebook/AuthenticationToken;", "Lcom/facebook/AccessTokenSource;", "source", "applicationId", "Lcom/facebook/AccessToken;", "a", "(Landroid/os/Bundle;Lcom/facebook/AccessTokenSource;Ljava/lang/String;)Lcom/facebook/AccessToken;", Constants.INAPP_DATA_TAG, "", "requestedPermissions", "b", "(Ljava/util/Collection;Landroid/os/Bundle;Lcom/facebook/AccessTokenSource;Ljava/lang/String;)Lcom/facebook/AccessToken;", "signedRequest", "e", "(Ljava/lang/String;)Ljava/lang/String;", "NO_SIGNED_REQUEST_ERROR_MESSAGE", "Ljava/lang/String;", "NO_USER_ID_ERROR_MESSAGE", "USER_CANCELED_LOG_IN_ERROR_MESSAGE", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: a */
        public final AccessToken m9169a(@NotNull Bundle bundle, @Nullable AccessTokenSource source, @NotNull String applicationId) {
            String string;
            bundle.getClass();
            applicationId.getClass();
            C1680e c1680e = C1680e.INSTANCE;
            Date dateM8920y = C1680e.m8920y(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date dateM8920y2 = C1680e.m8920y(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            if (string2 == null || string2.length() == 0 || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null || string.length() == 0) {
                return null;
            }
            return new AccessToken(string2, applicationId, string, stringArrayList, null, null, source, dateM8920y, new Date(), dateM8920y2, bundle.getString(AccessToken.GRAPH_DOMAIN));
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: b */
        public final AccessToken m9170b(@Nullable Collection<String> requestedPermissions, @NotNull Bundle bundle, @Nullable AccessTokenSource source, @NotNull String applicationId) throws FacebookException {
            Collection<String> collectionArrayListOf;
            ArrayList arrayListArrayListOf;
            ArrayList arrayListArrayListOf2;
            bundle.getClass();
            applicationId.getClass();
            C1680e c1680e = C1680e.INSTANCE;
            Date dateM8920y = C1680e.m8920y(bundle, "expires_in", new Date());
            String string = bundle.getString("access_token");
            if (string == null) {
                return null;
            }
            Date dateM8920y2 = C1680e.m8920y(bundle, AccessToken.DATA_ACCESS_EXPIRATION_TIME, new Date(0L));
            String string2 = bundle.getString("granted_scopes");
            if (string2 == null || string2.length() <= 0) {
                collectionArrayListOf = requestedPermissions;
            } else {
                Object[] array = StringsKt.split$default(string2, new String[]{Constants.SEPARATOR_COMMA}, false, 0, 6, null).toArray(new String[0]);
                if (array == null) {
                    mnd0.m159157a("null cannot be cast to non-null type kotlin.Array<T>");
                    return null;
                }
                String[] strArr = (String[]) array;
                collectionArrayListOf = CollectionsKt.arrayListOf(Arrays.copyOf(strArr, strArr.length));
            }
            String string3 = bundle.getString("denied_scopes");
            if (string3 == null || string3.length() <= 0) {
                arrayListArrayListOf = null;
            } else {
                Object[] array2 = StringsKt.split$default(string3, new String[]{Constants.SEPARATOR_COMMA}, false, 0, 6, null).toArray(new String[0]);
                if (array2 == null) {
                    mnd0.m159157a("null cannot be cast to non-null type kotlin.Array<T>");
                    return null;
                }
                String[] strArr2 = (String[]) array2;
                arrayListArrayListOf = CollectionsKt.arrayListOf(Arrays.copyOf(strArr2, strArr2.length));
            }
            String string4 = bundle.getString("expired_scopes");
            if (string4 == null || string4.length() <= 0) {
                arrayListArrayListOf2 = null;
            } else {
                Object[] array3 = StringsKt.split$default(string4, new String[]{Constants.SEPARATOR_COMMA}, false, 0, 6, null).toArray(new String[0]);
                if (array3 == null) {
                    mnd0.m159157a("null cannot be cast to non-null type kotlin.Array<T>");
                    return null;
                }
                String[] strArr3 = (String[]) array3;
                arrayListArrayListOf2 = CollectionsKt.arrayListOf(Arrays.copyOf(strArr3, strArr3.length));
            }
            if (C1680e.m8886c0(string)) {
                return null;
            }
            return new AccessToken(string, applicationId, m9173e(bundle.getString("signed_request")), collectionArrayListOf, arrayListArrayListOf, arrayListArrayListOf2, source, dateM8920y, new Date(), dateM8920y2, bundle.getString(AccessToken.GRAPH_DOMAIN));
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: c */
        public final AuthenticationToken m9171c(@NotNull Bundle bundle, @Nullable String expectedNonce) throws FacebookException {
            bundle.getClass();
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string == null || string.length() == 0 || expectedNonce == null || expectedNonce.length() == 0) {
                return null;
            }
            try {
                return new AuthenticationToken(string, expectedNonce);
            } catch (Exception e) {
                throw new FacebookException(e.getMessage());
            }
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: d */
        public final AuthenticationToken m9172d(@NotNull Bundle bundle, @Nullable String expectedNonce) throws FacebookException {
            bundle.getClass();
            String string = bundle.getString(AuthenticationToken.AUTHENTICATION_TOKEN_KEY);
            if (string == null || string.length() == 0 || expectedNonce == null || expectedNonce.length() == 0) {
                return null;
            }
            try {
                return new AuthenticationToken(string, expectedNonce);
            } catch (Exception e) {
                throw new FacebookException(e.getMessage(), e);
            }
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: e */
        public final String m9173e(@Nullable String signedRequest) throws FacebookException {
            if (signedRequest == null || signedRequest.length() == 0) {
                throw new FacebookException(LoginMethodHandler.NO_SIGNED_REQUEST_ERROR_MESSAGE);
            }
            try {
                Object[] array = StringsKt.split$default(signedRequest, new String[]{"."}, false, 0, 6, null).toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array;
                if (strArr.length == 2) {
                    byte[] bArrDecode = Base64.decode(strArr[1], 0);
                    bArrDecode.getClass();
                    String string = new JSONObject(new String(bArrDecode, Charsets.UTF_8)).getString("user_id");
                    string.getClass();
                    return string;
                }
                throw new FacebookException(LoginMethodHandler.NO_USER_ID_ERROR_MESSAGE);
            } catch (UnsupportedEncodingException | JSONException unused) {
            }
        }

        public Companion() {
        }
    }

    public LoginMethodHandler(@NotNull Parcel parcel) {
        parcel.getClass();
        Map<String, String> mapM8916t0 = C1680e.m8916t0(parcel);
        this.methodLoggingExtras = mapM8916t0 == null ? null : MapsKt.toMutableMap(mapM8916t0);
    }

    /* JADX INFO: renamed from: a */
    public void m9161a(@Nullable String key, @Nullable Object value) {
        if (this.methodLoggingExtras == null) {
            this.methodLoggingExtras = new HashMap();
        }
        Map<String, String> map = this.methodLoggingExtras;
        if (map == null) {
            return;
        }
        map.put(key, value == null ? null : value.toString());
    }

    /* JADX INFO: renamed from: b */
    public void mo9061b() {
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public String m9162c(@NotNull String authId) {
        authId.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", authId);
            jSONObject.put("3_method", getNameForLogging());
            mo8997m(jSONObject);
        } catch (JSONException e) {
            Intrinsics.m88385l("Error creating client state json: ", e.getMessage());
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final LoginClient m9163d() {
        LoginClient loginClient = this.loginClient;
        if (loginClient != null) {
            return loginClient;
        }
        Intrinsics.m88391r("loginClient");
        throw null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Map<String, String> m9164e() {
        return this.methodLoggingExtras;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public abstract String getNameForLogging();

    @NotNull
    /* JADX INFO: renamed from: g */
    public String getValidRedirectURI() {
        return "fb" + C1600c.m8102m() + "://authorize/";
    }

    /* JADX INFO: renamed from: h */
    public void m9165h(@Nullable String e2e) {
        LoginClient.Request requestM9091p = m9163d().getPendingRequest();
        String strM9104a = requestM9091p == null ? null : requestM9091p.getApplicationId();
        if (strM9104a == null) {
            strM9104a = C1600c.m8102m();
        }
        C1577f c1577f = new C1577f(m9163d().m9085i(), strM9104a);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", e2e);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, strM9104a);
        c1577f.m7832h("fb_dialogs_web_login_dialog_complete", null, bundle);
    }

    /* JADX INFO: renamed from: i */
    public boolean mo9166i() {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo8996k(int requestCode, int resultCode, @Nullable Intent data) {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public Bundle m9167l(@NotNull LoginClient.Request request, @NotNull Bundle values) throws FacebookException {
        GraphRequest graphRequestM149102a;
        request.getClass();
        values.getClass();
        String string = values.getString("code");
        if (C1680e.m8886c0(string)) {
            throw new FacebookException("No code param found from the request");
        }
        if (string == null) {
            graphRequestM149102a = null;
        } else {
            kc60 kc60Var = kc60.INSTANCE;
            String validRedirectURI = getValidRedirectURI();
            String strM9109f = request.getCodeVerifier();
            if (strM9109f == null) {
                strM9109f = "";
            }
            graphRequestM149102a = kc60.m149102a(string, validRedirectURI, strM9109f);
        }
        if (graphRequestM149102a == null) {
            throw new FacebookException("Failed to create code exchange request");
        }
        GraphResponse graphResponseM7579j = graphRequestM149102a.m7579j();
        FacebookRequestError facebookRequestErrorM7657b = graphResponseM7579j.getError();
        if (facebookRequestErrorM7657b != null) {
            throw new FacebookServiceException(facebookRequestErrorM7657b, facebookRequestErrorM7657b.m7550c());
        }
        try {
            JSONObject jSONObjectM7658c = graphResponseM7579j.getGraphObject();
            String string2 = jSONObjectM7658c != null ? jSONObjectM7658c.getString("access_token") : null;
            if (jSONObjectM7658c == null || C1680e.m8886c0(string2)) {
                throw new FacebookException("No access token found from result");
            }
            values.putString("access_token", string2);
            if (jSONObjectM7658c.has(AuthenticationToken.AUTHENTICATION_TOKEN_KEY)) {
                values.putString(AuthenticationToken.AUTHENTICATION_TOKEN_KEY, jSONObjectM7658c.getString(AuthenticationToken.AUTHENTICATION_TOKEN_KEY));
            }
            return values;
        } catch (JSONException e) {
            throw new FacebookException(Intrinsics.m88385l("Fail to process code exchange response: ", e.getMessage()));
        }
    }

    /* JADX INFO: renamed from: m */
    public void mo8997m(@NotNull JSONObject param) throws JSONException {
        param.getClass();
    }

    /* JADX INFO: renamed from: n */
    public final void m9168n(@NotNull LoginClient loginClient) {
        loginClient.getClass();
        this.loginClient = loginClient;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo9070o() {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public abstract int mo8998p(@NotNull LoginClient.Request request);

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        C1680e c1680e = C1680e.INSTANCE;
        C1680e.m8869G0(dest, this.methodLoggingExtras);
    }

    public LoginMethodHandler(@NotNull LoginClient loginClient) {
        loginClient.getClass();
        m9168n(loginClient);
    }
}
