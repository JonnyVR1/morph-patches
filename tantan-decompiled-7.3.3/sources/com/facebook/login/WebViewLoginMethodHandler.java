package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.Constants;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.C1680e;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.WebDialog;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.mnd0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 52\u00020\u0001:\u000267B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010(\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020'8\u0016X\u0096D¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+R\u001a\u00101\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00068"}, m88121d2 = {"Lcom/facebook/login/WebViewLoginMethodHandler;", "Lcom/facebook/login/WebLoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", RXScreenCaptureService.KEY_INDEX, "()Z", "", "b", "()V", "Lcom/facebook/login/LoginClient$Request;", SocialConstants.TYPE_REQUEST, "", "p", "(Lcom/facebook/login/LoginClient$Request;)I", "Landroid/os/Bundle;", "values", "Lcom/facebook/FacebookException;", "error", BaseSei.f14625Y, "(Lcom/facebook/login/LoginClient$Request;Landroid/os/Bundle;Lcom/facebook/FacebookException;)V", "describeContents", "()I", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/facebook/internal/WebDialog;", "loginDialog", "Lcom/facebook/internal/WebDialog;", "getLoginDialog", "()Lcom/facebook/internal/WebDialog;", "setLoginDialog", "(Lcom/facebook/internal/WebDialog;)V", "", "e2e", "Ljava/lang/String;", "getE2e", "()Ljava/lang/String;", "setE2e", "(Ljava/lang/String;)V", "nameForLogging", "f", "Lcom/facebook/AccessTokenSource;", "tokenSource", "Lcom/facebook/AccessTokenSource;", Constants.KEY_T, "()Lcom/facebook/AccessTokenSource;", "Companion", "a", "c", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class WebViewLoginMethodHandler extends WebLoginMethodHandler {

    @NotNull
    private static final String OAUTH_DIALOG = "oauth";

    @Nullable
    private String e2e;

    @Nullable
    private WebDialog loginDialog;

    @NotNull
    private final String nameForLogging;

    @NotNull
    private final AccessTokenSource tokenSource;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new C1717b();

    /* JADX INFO: renamed from: com.facebook.login.WebViewLoginMethodHandler$a */
    @Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00060\u0000R\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00060\u0000R\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00060\u0000R\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\rJ\u0019\u0010\u0016\u001a\u00060\u0000R\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00060\u0000R\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00060\u0000R\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u0011J\u0019\u0010\u001f\u001a\u00060\u0000R\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\u0011J\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\u001c\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u0016\u0010,\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010$\u001a\u0004\b(\u0010-\"\u0004\b.\u0010/R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010$\u001a\u0004\b&\u0010-\"\u0004\b+\u0010/¨\u00060"}, m88121d2 = {"Lcom/facebook/login/WebViewLoginMethodHandler$a;", "Lcom/facebook/internal/WebDialog$a;", "Landroid/content/Context;", "context", "", "applicationId", "Landroid/os/Bundle;", "parameters", "<init>", "(Lcom/facebook/login/WebViewLoginMethodHandler;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V", "e2e", "Lcom/facebook/login/WebViewLoginMethodHandler;", "m", "(Ljava/lang/String;)Lcom/facebook/login/WebViewLoginMethodHandler$a;", "", "isChromeOS", "p", "(Z)Lcom/facebook/login/WebViewLoginMethodHandler$a;", "authType", "k", "Lcom/facebook/login/LoginBehavior;", "loginBehavior", "q", "(Lcom/facebook/login/LoginBehavior;)Lcom/facebook/login/WebViewLoginMethodHandler$a;", "Lcom/facebook/login/LoginTargetApp;", "targetApp", "r", "(Lcom/facebook/login/LoginTargetApp;)Lcom/facebook/login/WebViewLoginMethodHandler$a;", "isFamilyLogin", "o", "shouldSkip", BLiveStormDanmakuGiftResourceType.f45294s, "Lcom/facebook/internal/WebDialog;", "a", "()Lcom/facebook/internal/WebDialog;", "h", "Ljava/lang/String;", WBConstants.AUTH_PARAMS_REDIRECT_URL, RXScreenCaptureService.KEY_INDEX, "Lcom/facebook/login/LoginBehavior;", "j", "Lcom/facebook/login/LoginTargetApp;", "Z", BLiveStormDanmakuGiftResourceType.f45292l, "shouldSkipDedupe", "()Ljava/lang/String;", "n", "(Ljava/lang/String;)V", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public final class C1716a extends WebDialog.C1670a {

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public String redirect_uri;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public LoginBehavior loginBehavior;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @NotNull
        public LoginTargetApp targetApp;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public boolean isFamilyLogin;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        public boolean shouldSkipDedupe;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        public String e2e;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        public String authType;

        /* JADX INFO: renamed from: o */
        public final /* synthetic */ WebViewLoginMethodHandler f6807o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1716a(@NotNull WebViewLoginMethodHandler webViewLoginMethodHandler, @NotNull Context context, @NotNull String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
            webViewLoginMethodHandler.getClass();
            context.getClass();
            str.getClass();
            bundle.getClass();
            this.f6807o = webViewLoginMethodHandler;
            this.redirect_uri = "fbconnect://success";
            this.loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
            this.targetApp = LoginTargetApp.FACEBOOK;
        }

        @Override // com.facebook.internal.WebDialog.C1670a
        @NotNull
        /* JADX INFO: renamed from: a */
        public WebDialog mo8789a() {
            Bundle bundleM8794f = getParameters();
            if (bundleM8794f == null) {
                mnd0.m159157a("null cannot be cast to non-null type android.os.Bundle");
                return null;
            }
            bundleM8794f.putString(WBConstants.AUTH_PARAMS_REDIRECT_URL, this.redirect_uri);
            bundleM8794f.putString("client_id", getApplicationId());
            bundleM8794f.putString("e2e", m9193j());
            bundleM8794f.putString(WBConstants.AUTH_PARAMS_RESPONSE_TYPE, this.targetApp == LoginTargetApp.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
            bundleM8794f.putString("return_scopes", "true");
            bundleM8794f.putString("auth_type", m9192i());
            bundleM8794f.putString("login_behavior", this.loginBehavior.name());
            if (this.isFamilyLogin) {
                bundleM8794f.putString("fx_app", this.targetApp.getTargetApp());
            }
            if (this.shouldSkipDedupe) {
                bundleM8794f.putString("skip_dedupe", "true");
            }
            WebDialog.Companion c1671b = WebDialog.INSTANCE;
            Context contextM8792d = getContext();
            if (contextM8792d != null) {
                return c1671b.m8800d(contextM8792d, "oauth", bundleM8794f, getTheme(), this.targetApp, getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String());
            }
            mnd0.m159157a("null cannot be cast to non-null type android.content.Context");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final String m9192i() {
            String str = this.authType;
            if (str != null) {
                return str;
            }
            Intrinsics.m88391r("authType");
            throw null;
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final String m9193j() {
            String str = this.e2e;
            if (str != null) {
                return str;
            }
            Intrinsics.m88391r("e2e");
            throw null;
        }

        @NotNull
        /* JADX INFO: renamed from: k */
        public final C1716a m9194k(@NotNull String authType) {
            authType.getClass();
            m9195l(authType);
            return this;
        }

        /* JADX INFO: renamed from: l */
        public final void m9195l(@NotNull String str) {
            str.getClass();
            this.authType = str;
        }

        @NotNull
        /* JADX INFO: renamed from: m */
        public final C1716a m9196m(@NotNull String e2e) {
            e2e.getClass();
            m9197n(e2e);
            return this;
        }

        /* JADX INFO: renamed from: n */
        public final void m9197n(@NotNull String str) {
            str.getClass();
            this.e2e = str;
        }

        @NotNull
        /* JADX INFO: renamed from: o */
        public final C1716a m9198o(boolean isFamilyLogin) {
            this.isFamilyLogin = isFamilyLogin;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: p */
        public final C1716a m9199p(boolean isChromeOS) {
            this.redirect_uri = isChromeOS ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: q */
        public final C1716a m9200q(@NotNull LoginBehavior loginBehavior) {
            loginBehavior.getClass();
            this.loginBehavior = loginBehavior;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: r */
        public final C1716a m9201r(@NotNull LoginTargetApp targetApp) {
            targetApp.getClass();
            this.targetApp = targetApp;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: s */
        public final C1716a m9202s(boolean shouldSkip) {
            this.shouldSkipDedupe = shouldSkip;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.WebViewLoginMethodHandler$b */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"com/facebook/login/WebViewLoginMethodHandler$b", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/WebViewLoginMethodHandler;", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/facebook/login/WebViewLoginMethodHandler;", "", "size", "", "b", "(I)[Lcom/facebook/login/WebViewLoginMethodHandler;", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class C1717b implements Parcelable.Creator<WebViewLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WebViewLoginMethodHandler createFromParcel(@NotNull Parcel source) {
            source.getClass();
            return new WebViewLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WebViewLoginMethodHandler[] newArray(int size) {
            return new WebViewLoginMethodHandler[size];
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.WebViewLoginMethodHandler$d */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"com/facebook/login/WebViewLoginMethodHandler$d", "Lcom/facebook/internal/WebDialog$d;", "Landroid/os/Bundle;", "values", "Lcom/facebook/FacebookException;", "error", "", "a", "(Landroid/os/Bundle;Lcom/facebook/FacebookException;)V", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class C1719d implements WebDialog.InterfaceC1673d {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LoginClient.Request f6809b;

        public C1719d(LoginClient.Request request) {
            this.f6809b = request;
        }

        @Override // com.facebook.internal.WebDialog.InterfaceC1673d
        /* JADX INFO: renamed from: a */
        public void mo8802a(@Nullable Bundle values, @Nullable FacebookException error) {
            WebViewLoginMethodHandler.this.m9191y(this.f6809b, values, error);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(@NotNull Parcel parcel) {
        super(parcel);
        parcel.getClass();
        this.nameForLogging = "web_view";
        this.tokenSource = AccessTokenSource.WEB_VIEW;
        this.e2e = parcel.readString();
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: b */
    public void mo9061b() {
        WebDialog webDialog = this.loginDialog;
        if (webDialog != null) {
            if (webDialog != null) {
                webDialog.cancel();
            }
            this.loginDialog = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: i */
    public boolean mo9166i() {
        return true;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: p */
    public int mo8998p(@NotNull LoginClient.Request request) {
        request.getClass();
        Bundle bundleM9187r = m9187r(request);
        C1719d c1719d = new C1719d(request);
        String strM9141a = LoginClient.INSTANCE.m9141a();
        this.e2e = strM9141a;
        m9161a("e2e", strM9141a);
        FragmentActivity fragmentActivityM9085i = m9163d().m9085i();
        if (fragmentActivityM9085i == null) {
            return 0;
        }
        boolean zM8879W = C1680e.m8879W(fragmentActivityM9085i);
        C1716a c1716a = new C1716a(this, fragmentActivityM9085i, request.getApplicationId(), bundleM9187r);
        String str = this.e2e;
        if (str == null) {
            mnd0.m159157a("null cannot be cast to non-null type kotlin.String");
            return 0;
        }
        this.loginDialog = c1716a.m9196m(str).m9199p(zM8879W).m9194k(request.getAuthType()).m9200q(request.getLoginBehavior()).m9201r(request.getLoginTargetApp()).m9198o(request.getIsFamilyLogin()).m9202s(request.getShouldSkipAccountDeduplication()).m8796h(c1719d).mo8789a();
        FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
        facebookDialogFragment.setRetainInstance(true);
        facebookDialogFragment.m8729c4(this.loginDialog);
        facebookDialogFragment.show(fragmentActivityM9085i.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public AccessTokenSource getTokenSource() {
        return this.tokenSource;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        super.writeToParcel(dest, flags);
        dest.writeString(this.e2e);
    }

    /* JADX INFO: renamed from: y */
    public final void m9191y(@NotNull LoginClient.Request request, @Nullable Bundle values, @Nullable FacebookException error) {
        request.getClass();
        super.m9189w(request, values, error);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        loginClient.getClass();
        this.nameForLogging = "web_view";
        this.tokenSource = AccessTokenSource.WEB_VIEW;
    }
}
