package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.Constants;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.C1577c;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.internal.C1657e;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 $2\u00020\u0001:\u0001%B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001a\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, m87232d2 = {"Lcom/facebook/login/WebLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", BLiveStormDanmakuGiftResourceType.f44446s, "()Ljava/lang/String;", "Lcom/facebook/login/LoginClient$Request;", SocialConstants.TYPE_REQUEST, "Landroid/os/Bundle;", "r", "(Lcom/facebook/login/LoginClient$Request;)Landroid/os/Bundle;", "parameters", "q", "(Landroid/os/Bundle;Lcom/facebook/login/LoginClient$Request;)Landroid/os/Bundle;", "values", "Lcom/facebook/FacebookException;", "error", "", "w", "(Lcom/facebook/login/LoginClient$Request;Landroid/os/Bundle;Lcom/facebook/FacebookException;)V", "u", "token", BaseSei.f13930X, "(Ljava/lang/String;)V", "e2e", "Ljava/lang/String;", "Lcom/facebook/AccessTokenSource;", Constants.KEY_T, "()Lcom/facebook/AccessTokenSource;", "tokenSource", "Companion", "a", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class WebLoginMethodHandler extends LoginMethodHandler {

    @NotNull
    private static final String WEB_VIEW_AUTH_HANDLER_STORE = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY";

    @NotNull
    private static final String WEB_VIEW_AUTH_HANDLER_TOKEN_KEY = "TOKEN";

    @Nullable
    private String e2e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        loginClient.getClass();
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public Bundle m9132q(@NotNull Bundle parameters, @NotNull LoginClient.Request request) {
        parameters.getClass();
        request.getClass();
        parameters.putString(WBConstants.AUTH_PARAMS_REDIRECT_URL, getValidRedirectURI());
        if (request.m9067s()) {
            parameters.putString(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, request.getApplicationId());
        } else {
            parameters.putString("client_id", request.getApplicationId());
        }
        parameters.putString("e2e", LoginClient.INSTANCE.m9087a());
        if (request.m9067s()) {
            parameters.putString(WBConstants.AUTH_PARAMS_RESPONSE_TYPE, "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (request.m9063o().contains("openid")) {
                parameters.putString("nonce", request.getNonce());
            }
            parameters.putString(WBConstants.AUTH_PARAMS_RESPONSE_TYPE, "id_token,token,signed_request,graph_domain");
        }
        parameters.putString("code_challenge", request.getCodeChallenge());
        CodeChallengeMethod codeChallengeMethod = request.getCodeChallengeMethod();
        parameters.putString("code_challenge_method", codeChallengeMethod == null ? null : codeChallengeMethod.name());
        parameters.putString("return_scopes", "true");
        parameters.putString("auth_type", request.getAuthType());
        parameters.putString("login_behavior", request.getLoginBehavior().name());
        parameters.putString("sdk", Intrinsics.m87496l("android-", C1577c.m8024C()));
        if (mo8945s() != null) {
            parameters.putString("sso", mo8945s());
        }
        parameters.putString("cct_prefetching", C1577c.hasCustomTabsPrefetching ? "1" : "0");
        if (request.getIsFamilyLogin()) {
            parameters.putString("fx_app", request.getLoginTargetApp().getTargetApp());
        }
        if (request.getShouldSkipAccountDeduplication()) {
            parameters.putString("skip_dedupe", "true");
        }
        if (request.getMessengerPageId() != null) {
            parameters.putString("messenger_page_id", request.getMessengerPageId());
            parameters.putString("reset_messenger_state", request.getResetMessengerState() ? "1" : "0");
        }
        return parameters;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public Bundle m9133r(@NotNull LoginClient.Request request) {
        request.getClass();
        Bundle bundle = new Bundle();
        C1657e c1657e = C1657e.INSTANCE;
        if (!C1657e.m8833d0(request.m9063o())) {
            String strJoin = TextUtils.join(Constants.SEPARATOR_COMMA, request.m9063o());
            bundle.putString("scope", strJoin);
            m9107a("scope", strJoin);
        }
        DefaultAudience defaultAudience = request.getDefaultAudience();
        if (defaultAudience == null) {
            defaultAudience = DefaultAudience.NONE;
        }
        bundle.putString("default_audience", defaultAudience.getNativeProtocolAudience());
        bundle.putString("state", m9108c(request.getAuthId()));
        AccessToken accessTokenM7436e = AccessToken.INSTANCE.m7436e();
        String token = accessTokenM7436e == null ? null : accessTokenM7436e.getToken();
        if (token == null || !Intrinsics.m87488d(token, m9134u())) {
            FragmentActivity fragmentActivityM9031i = m9109d().m9031i();
            if (fragmentActivityM9031i != null) {
                C1657e.m8841i(fragmentActivityM9031i);
            }
            m9107a("access_token", "0");
        } else {
            bundle.putString("access_token", token);
            m9107a("access_token", "1");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        bundle.putString("ies", C1577c.m8051p() ? "1" : "0");
        return bundle;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public String mo8945s() {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public abstract AccessTokenSource getTokenSource();

    /* JADX INFO: renamed from: u */
    public final String m9134u() {
        Context contextM9031i = m9109d().m9031i();
        if (contextM9031i == null) {
            contextM9031i = C1577c.m8047l();
        }
        return contextM9031i.getSharedPreferences(WEB_VIEW_AUTH_HANDLER_STORE, 0).getString(WEB_VIEW_AUTH_HANDLER_TOKEN_KEY, "");
    }

    @VisibleForTesting(otherwise = 4)
    /* JADX INFO: renamed from: w */
    public void m9135w(@NotNull LoginClient.Request request, @Nullable Bundle values, @Nullable FacebookException error) {
        String strValueOf;
        LoginClient.Result resultM9081c;
        request.getClass();
        LoginClient loginClientM9109d = m9109d();
        this.e2e = null;
        if (values != null) {
            if (values.containsKey("e2e")) {
                this.e2e = values.getString("e2e");
            }
            try {
                LoginMethodHandler.Companion companion = LoginMethodHandler.INSTANCE;
                AccessToken accessTokenM9116b = companion.m9116b(request.m9063o(), values, getTokenSource(), request.getApplicationId());
                resultM9081c = LoginClient.Result.INSTANCE.m9080b(loginClientM9109d.getPendingRequest(), accessTokenM9116b, companion.m9118d(values, request.getNonce()));
                if (loginClientM9109d.m9031i() != null) {
                    try {
                        CookieSyncManager.createInstance(loginClientM9109d.m9031i()).sync();
                    } catch (Exception unused) {
                    }
                    if (accessTokenM9116b != null) {
                        m9136x(accessTokenM9116b.getToken());
                    }
                }
            } catch (FacebookException e) {
                resultM9081c = LoginClient.Result.Companion.m9078d(LoginClient.Result.INSTANCE, loginClientM9109d.getPendingRequest(), null, e.getMessage(), null, 8, null);
            }
        } else if (error instanceof FacebookOperationCanceledException) {
            resultM9081c = LoginClient.Result.INSTANCE.m9079a(loginClientM9109d.getPendingRequest(), LoginMethodHandler.USER_CANCELED_LOG_IN_ERROR_MESSAGE);
        } else {
            this.e2e = null;
            String message = error == null ? null : error.getMessage();
            if (error instanceof FacebookServiceException) {
                FacebookRequestError requestError = ((FacebookServiceException) error).getRequestError();
                strValueOf = String.valueOf(requestError.getErrorCode());
                message = requestError.toString();
            } else {
                strValueOf = null;
            }
            resultM9081c = LoginClient.Result.INSTANCE.m9081c(loginClientM9109d.getPendingRequest(), null, message, strValueOf);
        }
        C1657e c1657e = C1657e.INSTANCE;
        if (!C1657e.m8832c0(this.e2e)) {
            m9111h(this.e2e);
        }
        loginClientM9109d.m9029g(resultM9081c);
    }

    /* JADX INFO: renamed from: x */
    public final void m9136x(String token) {
        Context contextM9031i = m9109d().m9031i();
        if (contextM9031i == null) {
            contextM9031i = C1577c.m8047l();
        }
        contextM9031i.getSharedPreferences(WEB_VIEW_AUTH_HANDLER_STORE, 0).edit().putString(WEB_VIEW_AUTH_HANDLER_TOKEN_KEY, token).apply();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(@NotNull Parcel parcel) {
        super(parcel);
        parcel.getClass();
    }
}
