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
import com.facebook.C1600c;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.internal.C1680e;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 $2\u00020\u0001:\u0001%B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001a\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, m88121d2 = {"Lcom/facebook/login/WebLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", BLiveStormDanmakuGiftResourceType.f45294s, "()Ljava/lang/String;", "Lcom/facebook/login/LoginClient$Request;", SocialConstants.TYPE_REQUEST, "Landroid/os/Bundle;", "r", "(Lcom/facebook/login/LoginClient$Request;)Landroid/os/Bundle;", "parameters", "q", "(Landroid/os/Bundle;Lcom/facebook/login/LoginClient$Request;)Landroid/os/Bundle;", "values", "Lcom/facebook/FacebookException;", "error", "", "w", "(Lcom/facebook/login/LoginClient$Request;Landroid/os/Bundle;Lcom/facebook/FacebookException;)V", "u", "token", BaseSei.f14624X, "(Ljava/lang/String;)V", "e2e", "Ljava/lang/String;", "Lcom/facebook/AccessTokenSource;", Constants.KEY_T, "()Lcom/facebook/AccessTokenSource;", "tokenSource", "Companion", "a", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
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
    public Bundle m9186q(@NotNull Bundle parameters, @NotNull LoginClient.Request request) {
        parameters.getClass();
        request.getClass();
        parameters.putString(WBConstants.AUTH_PARAMS_REDIRECT_URL, getValidRedirectURI());
        if (request.m9121s()) {
            parameters.putString(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, request.getApplicationId());
        } else {
            parameters.putString("client_id", request.getApplicationId());
        }
        parameters.putString("e2e", LoginClient.INSTANCE.m9141a());
        if (request.m9121s()) {
            parameters.putString(WBConstants.AUTH_PARAMS_RESPONSE_TYPE, "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (request.m9117o().contains("openid")) {
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
        parameters.putString("sdk", Intrinsics.m88385l("android-", C1600c.m8078C()));
        if (mo8999s() != null) {
            parameters.putString("sso", mo8999s());
        }
        parameters.putString("cct_prefetching", C1600c.hasCustomTabsPrefetching ? "1" : "0");
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
    public Bundle m9187r(@NotNull LoginClient.Request request) {
        request.getClass();
        Bundle bundle = new Bundle();
        C1680e c1680e = C1680e.INSTANCE;
        if (!C1680e.m8887d0(request.m9117o())) {
            String strJoin = TextUtils.join(Constants.SEPARATOR_COMMA, request.m9117o());
            bundle.putString("scope", strJoin);
            m9161a("scope", strJoin);
        }
        DefaultAudience defaultAudience = request.getDefaultAudience();
        if (defaultAudience == null) {
            defaultAudience = DefaultAudience.NONE;
        }
        bundle.putString("default_audience", defaultAudience.getNativeProtocolAudience());
        bundle.putString("state", m9162c(request.getAuthId()));
        AccessToken accessTokenM7490e = AccessToken.INSTANCE.m7490e();
        String token = accessTokenM7490e == null ? null : accessTokenM7490e.getToken();
        if (token == null || !Intrinsics.m88377d(token, m9188u())) {
            FragmentActivity fragmentActivityM9085i = m9163d().m9085i();
            if (fragmentActivityM9085i != null) {
                C1680e.m8895i(fragmentActivityM9085i);
            }
            m9161a("access_token", "0");
        } else {
            bundle.putString("access_token", token);
            m9161a("access_token", "1");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        bundle.putString("ies", C1600c.m8105p() ? "1" : "0");
        return bundle;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public String mo8999s() {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public abstract AccessTokenSource getTokenSource();

    /* JADX INFO: renamed from: u */
    public final String m9188u() {
        Context contextM9085i = m9163d().m9085i();
        if (contextM9085i == null) {
            contextM9085i = C1600c.m8101l();
        }
        return contextM9085i.getSharedPreferences(WEB_VIEW_AUTH_HANDLER_STORE, 0).getString(WEB_VIEW_AUTH_HANDLER_TOKEN_KEY, "");
    }

    @VisibleForTesting(otherwise = 4)
    /* JADX INFO: renamed from: w */
    public void m9189w(@NotNull LoginClient.Request request, @Nullable Bundle values, @Nullable FacebookException error) {
        String strValueOf;
        LoginClient.Result resultM9135c;
        request.getClass();
        LoginClient loginClientM9163d = m9163d();
        this.e2e = null;
        if (values != null) {
            if (values.containsKey("e2e")) {
                this.e2e = values.getString("e2e");
            }
            try {
                LoginMethodHandler.Companion companion = LoginMethodHandler.INSTANCE;
                AccessToken accessTokenM9170b = companion.m9170b(request.m9117o(), values, getTokenSource(), request.getApplicationId());
                resultM9135c = LoginClient.Result.INSTANCE.m9134b(loginClientM9163d.getPendingRequest(), accessTokenM9170b, companion.m9172d(values, request.getNonce()));
                if (loginClientM9163d.m9085i() != null) {
                    try {
                        CookieSyncManager.createInstance(loginClientM9163d.m9085i()).sync();
                    } catch (Exception unused) {
                    }
                    if (accessTokenM9170b != null) {
                        m9190x(accessTokenM9170b.getToken());
                    }
                }
            } catch (FacebookException e) {
                resultM9135c = LoginClient.Result.Companion.m9132d(LoginClient.Result.INSTANCE, loginClientM9163d.getPendingRequest(), null, e.getMessage(), null, 8, null);
            }
        } else if (error instanceof FacebookOperationCanceledException) {
            resultM9135c = LoginClient.Result.INSTANCE.m9133a(loginClientM9163d.getPendingRequest(), LoginMethodHandler.USER_CANCELED_LOG_IN_ERROR_MESSAGE);
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
            resultM9135c = LoginClient.Result.INSTANCE.m9135c(loginClientM9163d.getPendingRequest(), null, message, strValueOf);
        }
        C1680e c1680e = C1680e.INSTANCE;
        if (!C1680e.m8886c0(this.e2e)) {
            m9165h(this.e2e);
        }
        loginClientM9163d.m9083g(resultM9135c);
    }

    /* JADX INFO: renamed from: x */
    public final void m9190x(String token) {
        Context contextM9085i = m9163d().m9085i();
        if (contextM9085i == null) {
            contextM9085i = C1600c.m8101l();
        }
        contextM9085i.getSharedPreferences(WEB_VIEW_AUTH_HANDLER_STORE, 0).edit().putString(WEB_VIEW_AUTH_HANDLER_TOKEN_KEY, token).apply();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(@NotNull Parcel parcel) {
        super(parcel);
        parcel.getClass();
    }
}
