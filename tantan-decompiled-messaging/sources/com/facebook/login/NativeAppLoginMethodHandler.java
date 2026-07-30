package com.facebook.login;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import com.clevertap.android.sdk.Constants;
import com.facebook.AccessTokenSource;
import com.facebook.C1577c;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.internal.C1657e;
import com.facebook.login.NativeAppLoginMethodHandler;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.open.SocialConstants;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b2s;
import p149l.fje0;
import p149l.g60;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m87231d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0018\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u0004\u0018\u00010\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u0004\u0018\u00010\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\"\u0010!J!\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b&\u0010\u001dJ\u0019\u0010)\u001a\u00020\u00172\b\u0010(\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, m87232d2 = {"Lcom/facebook/login/NativeAppLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "k", "(IILandroid/content/Intent;)Z", "Lcom/facebook/login/LoginClient$Request;", SocialConstants.TYPE_REQUEST, "", "error", "errorMessage", "errorCode", "", BaseSei.f13930X, "(Lcom/facebook/login/LoginClient$Request;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "extras", BaseSei.f13931Y, "(Lcom/facebook/login/LoginClient$Request;Landroid/os/Bundle;)V", "w", "(Lcom/facebook/login/LoginClient$Request;Landroid/content/Intent;)V", BLiveStormDanmakuGiftResourceType.f44446s, "(Landroid/os/Bundle;)Ljava/lang/String;", Constants.KEY_T, "intent", b2s.C_ZONE, "(Landroid/content/Intent;I)Z", "A", "Lcom/facebook/login/LoginClient$Result;", "outcome", "r", "(Lcom/facebook/login/LoginClient$Result;)V", BaseSei.f13932Z, "(Landroid/content/Intent;)Z", "Lcom/facebook/AccessTokenSource;", "tokenSource", "Lcom/facebook/AccessTokenSource;", "u", "()Lcom/facebook/AccessTokenSource;", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
@VisibleForTesting(otherwise = 3)
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {

    @NotNull
    private final AccessTokenSource tokenSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        loginClient.getClass();
        this.tokenSource = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    }

    /* JADX INFO: renamed from: B */
    public static final void m9121B(NativeAppLoginMethodHandler nativeAppLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        nativeAppLoginMethodHandler.getClass();
        request.getClass();
        bundle.getClass();
        try {
            nativeAppLoginMethodHandler.m9130y(request, nativeAppLoginMethodHandler.m9113l(request, bundle));
        } catch (FacebookServiceException e) {
            FacebookRequestError requestError = e.getRequestError();
            nativeAppLoginMethodHandler.m9129x(request, requestError.getErrorType(), requestError.m7496c(), String.valueOf(requestError.getErrorCode()));
        } catch (FacebookException e2) {
            nativeAppLoginMethodHandler.m9129x(request, null, e2.getMessage(), null);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m9123A(final LoginClient.Request request, final Bundle extras) {
        if (extras.containsKey("code")) {
            C1657e c1657e = C1657e.INSTANCE;
            if (!C1657e.m8832c0(extras.getString("code"))) {
                C1577c.m8056u().execute(new Runnable() { // from class: l.y520
                    @Override // java.lang.Runnable
                    public final void run() {
                        NativeAppLoginMethodHandler.m9121B(this.f196375a, request, extras);
                    }
                });
                return;
            }
        }
        m9130y(request, extras);
    }

    /* JADX INFO: renamed from: C */
    public boolean m9124C(@Nullable Intent intent, int requestCode) {
        g60<Intent> g60VarM9097a4;
        if (intent == null || !m9131z(intent)) {
            return false;
        }
        Fragment fragment = m9109d().getFragment();
        Unit unit = null;
        LoginFragment loginFragment = fragment instanceof LoginFragment ? (LoginFragment) fragment : null;
        if (loginFragment != null && (g60VarM9097a4 = loginFragment.m9097a4()) != null) {
            g60VarM9097a4.m124547b(intent);
            unit = Unit.INSTANCE;
        }
        return unit != null;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: k */
    public boolean mo8942k(int requestCode, int resultCode, @Nullable Intent data) {
        LoginClient.Request pendingRequest = m9109d().getPendingRequest();
        if (data == null) {
            m9125r(LoginClient.Result.INSTANCE.m9079a(pendingRequest, "Operation canceled"));
        } else if (resultCode == 0) {
            m9128w(pendingRequest, data);
        } else if (resultCode != -1) {
            m9125r(LoginClient.Result.Companion.m9078d(LoginClient.Result.INSTANCE, pendingRequest, "Unexpected resultCode from authorization.", null, null, 8, null));
        } else {
            Bundle extras = data.getExtras();
            if (extras == null) {
                m9125r(LoginClient.Result.Companion.m9078d(LoginClient.Result.INSTANCE, pendingRequest, "Unexpected null from returned authorization data.", null, null, 8, null));
                return true;
            }
            String strM9126s = m9126s(extras);
            Object obj = extras.get(StateEvent.Name.ERROR_CODE);
            String string = obj == null ? null : obj.toString();
            String strM9127t = m9127t(extras);
            String string2 = extras.getString("e2e");
            if (!C1657e.m8832c0(string2)) {
                m9111h(string2);
            }
            if (strM9126s == null && string == null && strM9127t == null && pendingRequest != null) {
                m9123A(pendingRequest, extras);
            } else {
                m9129x(pendingRequest, strM9126s, strM9127t, string);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final void m9125r(LoginClient.Result outcome) {
        if (outcome != null) {
            m9109d().m9029g(outcome);
        } else {
            m9109d().m9021C();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public String m9126s(@Nullable Bundle extras) {
        String string = extras == null ? null : extras.getString("error");
        if (string != null) {
            return string;
        }
        if (extras == null) {
            return null;
        }
        return extras.getString("error_type");
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public String m9127t(@Nullable Bundle extras) {
        String string = extras == null ? null : extras.getString("error_message");
        if (string != null) {
            return string;
        }
        if (extras == null) {
            return null;
        }
        return extras.getString("error_description");
    }

    @NotNull
    /* JADX INFO: renamed from: u, reason: from getter */
    public AccessTokenSource getTokenSource() {
        return this.tokenSource;
    }

    /* JADX INFO: renamed from: w */
    public void m9128w(@Nullable LoginClient.Request request, @NotNull Intent data) {
        Object obj;
        data.getClass();
        Bundle extras = data.getExtras();
        String strM9126s = m9126s(extras);
        String string = null;
        if (extras != null && (obj = extras.get(StateEvent.Name.ERROR_CODE)) != null) {
            string = obj.toString();
        }
        if (Intrinsics.m87488d(fje0.m121582c(), string)) {
            m9125r(LoginClient.Result.INSTANCE.m9081c(request, strM9126s, m9127t(extras), string));
        } else {
            m9125r(LoginClient.Result.INSTANCE.m9079a(request, strM9126s));
        }
    }

    /* JADX INFO: renamed from: x */
    public void m9129x(@Nullable LoginClient.Request request, @Nullable String error, @Nullable String errorMessage, @Nullable String errorCode) {
        if (error != null && Intrinsics.m87488d(error, "logged_out")) {
            CustomTabLoginMethodHandler.calledThroughLoggedOutAppSwitch = true;
            m9125r(null);
        } else if (CollectionsKt.contains(fje0.m121583d(), error)) {
            m9125r(null);
        } else if (CollectionsKt.contains(fje0.m121584e(), error)) {
            m9125r(LoginClient.Result.INSTANCE.m9079a(request, null));
        } else {
            m9125r(LoginClient.Result.INSTANCE.m9081c(request, error, errorMessage, errorCode));
        }
    }

    /* JADX INFO: renamed from: y */
    public void m9130y(@NotNull LoginClient.Request request, @NotNull Bundle extras) {
        request.getClass();
        extras.getClass();
        try {
            LoginMethodHandler.Companion companion = LoginMethodHandler.INSTANCE;
            m9125r(LoginClient.Result.INSTANCE.m9080b(request, companion.m9116b(request.m9063o(), extras, getTokenSource(), request.getApplicationId()), companion.m9118d(extras, request.getNonce())));
        } catch (FacebookException e) {
            m9125r(LoginClient.Result.Companion.m9078d(LoginClient.Result.INSTANCE, request, null, e.getMessage(), null, 8, null));
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m9131z(Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = C1577c.m8047l().getPackageManager().queryIntentActivities(intent, 65536);
        listQueryIntentActivities.getClass();
        return !listQueryIntentActivities.isEmpty();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(@NotNull Parcel parcel) {
        super(parcel);
        parcel.getClass();
        this.tokenSource = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    }
}
