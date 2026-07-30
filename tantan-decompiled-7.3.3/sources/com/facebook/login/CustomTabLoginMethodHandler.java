package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.Constants;
import com.facebook.AccessTokenSource;
import com.facebook.C1600c;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.internal.C1680e;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.open.SocialConstants;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.ozb;
import p153l.rzb;
import p153l.szb;
import p153l.xwm;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 :2\u00020\u0001:\u0001;B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010.\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u001a\u0010/\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010\u000bR\u001a\u00102\u001a\u0002018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00107\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u000bR\u0016\u00109\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u000b¨\u0006<"}, m88121d2 = {"Lcom/facebook/login/CustomTabLoginMethodHandler;", "Lcom/facebook/login/WebLoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "g", "()Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f45294s, "Lcom/facebook/login/LoginClient$Request;", SocialConstants.TYPE_REQUEST, "", "p", "(Lcom/facebook/login/LoginClient$Request;)I", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "k", "(IILandroid/content/Intent;)Z", "Lorg/json/JSONObject;", "param", "", "m", "(Lorg/json/JSONObject;)V", "describeContents", "()I", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "url", "B", "(Ljava/lang/String;Lcom/facebook/login/LoginClient$Request;)V", "Landroid/os/Bundle;", "values", "D", "(Landroid/os/Bundle;)Z", "currentPackage", "Ljava/lang/String;", "expectedChallenge", "validRedirectURI", "nameForLogging", "f", "Lcom/facebook/AccessTokenSource;", "tokenSource", "Lcom/facebook/AccessTokenSource;", Constants.KEY_T, "()Lcom/facebook/AccessTokenSource;", "A", "developerDefinedRedirectURI", BaseSei.f14626Z, "chromePackage", "Companion", "b", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    private static final int API_EC_DIALOG_CANCEL = 4201;
    private static final int CHALLENGE_LENGTH = 20;
    private static final int CUSTOM_TAB_REQUEST_CODE = 1;

    @NotNull
    public static final String OAUTH_DIALOG = "oauth";

    @JvmField
    public static boolean calledThroughLoggedOutAppSwitch;

    @Nullable
    private String currentPackage;

    @Nullable
    private String expectedChallenge;

    @NotNull
    private final String nameForLogging;

    @NotNull
    private final AccessTokenSource tokenSource;

    @NotNull
    private String validRedirectURI;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new C1687a();

    /* JADX INFO: renamed from: com.facebook.login.CustomTabLoginMethodHandler$a */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"com/facebook/login/CustomTabLoginMethodHandler$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/CustomTabLoginMethodHandler;", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/facebook/login/CustomTabLoginMethodHandler;", "", "size", "", "b", "(I)[Lcom/facebook/login/CustomTabLoginMethodHandler;", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class C1687a implements Parcelable.Creator<CustomTabLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler createFromParcel(@NotNull Parcel source) {
            source.getClass();
            return new CustomTabLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler[] newArray(int size) {
            return new CustomTabLoginMethodHandler[size];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        loginClient.getClass();
        this.nameForLogging = "custom_tab";
        this.tokenSource = AccessTokenSource.CHROME_CUSTOM_TAB;
        this.expectedChallenge = C1680e.m8915t(20);
        calledThroughLoggedOutAppSwitch = false;
        szb szbVar = szb.INSTANCE;
        this.validRedirectURI = szb.m188635c(m8991A());
    }

    /* JADX INFO: renamed from: C */
    public static final void m8989C(CustomTabLoginMethodHandler customTabLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        customTabLoginMethodHandler.getClass();
        request.getClass();
        bundle.getClass();
        try {
            customTabLoginMethodHandler.m9189w(request, customTabLoginMethodHandler.m9167l(request, bundle), null);
        } catch (FacebookException e) {
            customTabLoginMethodHandler.m9189w(request, null, e);
        }
    }

    /* JADX INFO: renamed from: A */
    public final String m8991A() {
        return super.getValidRedirectURI();
    }

    /* JADX INFO: renamed from: B */
    public final void m8992B(String url, final LoginClient.Request request) {
        int i;
        if (url != null) {
            if (C15493d.m94374J(url, "fbconnect://cct.", false, 2, null) || C15493d.m94374J(url, super.getValidRedirectURI(), false, 2, null)) {
                Uri uri = Uri.parse(url);
                C1680e c1680e = C1680e.INSTANCE;
                final Bundle bundleM8907o0 = C1680e.m8907o0(uri.getQuery());
                bundleM8907o0.putAll(C1680e.m8907o0(uri.getFragment()));
                if (!m8993D(bundleM8907o0)) {
                    super.m9189w(request, null, new FacebookException("Invalid state parameter"));
                    return;
                }
                String string = bundleM8907o0.getString("error");
                if (string == null) {
                    string = bundleM8907o0.getString("error_type");
                }
                String string2 = bundleM8907o0.getString("error_msg");
                if (string2 == null) {
                    string2 = bundleM8907o0.getString("error_message");
                }
                if (string2 == null) {
                    string2 = bundleM8907o0.getString("error_description");
                }
                String string3 = bundleM8907o0.getString(StateEvent.Name.ERROR_CODE);
                if (string3 == null) {
                    i = -1;
                } else {
                    try {
                        i = Integer.parseInt(string3);
                    } catch (NumberFormatException unused) {
                        i = -1;
                    }
                }
                if (C1680e.m8886c0(string) && C1680e.m8886c0(string2) && i == -1) {
                    if (bundleM8907o0.containsKey("access_token")) {
                        super.m9189w(request, bundleM8907o0, null);
                        return;
                    } else {
                        C1600c.m8110u().execute(new Runnable() { // from class: l.qzb
                            @Override // java.lang.Runnable
                            public final void run() {
                                CustomTabLoginMethodHandler.m8989C(this.f160235a, request, bundleM8907o0);
                            }
                        });
                        return;
                    }
                }
                if (string != null && (Intrinsics.m88377d(string, "access_denied") || Intrinsics.m88377d(string, "OAuthAccessDeniedException"))) {
                    super.m9189w(request, null, new FacebookOperationCanceledException());
                } else if (i == API_EC_DIALOG_CANCEL) {
                    super.m9189w(request, null, new FacebookOperationCanceledException());
                } else {
                    super.m9189w(request, null, new FacebookServiceException(new FacebookRequestError(i, string, string2), string2));
                }
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m8993D(Bundle values) {
        try {
            String string = values.getString("state");
            if (string == null) {
                return false;
            }
            return Intrinsics.m88377d(new JSONObject(string).getString("7_challenge"), this.expectedChallenge);
        } catch (JSONException unused) {
            return false;
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
    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public String getValidRedirectURI() {
        return this.validRedirectURI;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: k */
    public boolean mo8996k(int requestCode, int resultCode, @Nullable Intent data) {
        if (data != null && data.getBooleanExtra(CustomTabMainActivity.f5920i, false)) {
            return super.mo8996k(requestCode, resultCode, data);
        }
        if (requestCode != 1) {
            return super.mo8996k(requestCode, resultCode, data);
        }
        LoginClient.Request requestM9091p = m9163d().getPendingRequest();
        if (requestM9091p == null) {
            return false;
        }
        if (resultCode == -1) {
            m8992B(data != null ? data.getStringExtra(CustomTabMainActivity.f5917f) : null, requestM9091p);
            return true;
        }
        super.m9189w(requestM9091p, null, new FacebookOperationCanceledException());
        return false;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: m */
    public void mo8997m(@NotNull JSONObject param) throws JSONException {
        param.getClass();
        param.put("7_challenge", this.expectedChallenge);
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: p */
    public int mo8998p(@NotNull LoginClient.Request request) {
        request.getClass();
        LoginClient loginClientM9163d = m9163d();
        if (getValidRedirectURI().length() == 0) {
            return 0;
        }
        Bundle bundleM9186q = m9186q(m9187r(request), request);
        if (calledThroughLoggedOutAppSwitch) {
            bundleM9186q.putString("cct_over_app_switch", "1");
        }
        if (C1600c.hasCustomTabsPrefetching) {
            if (request.m9121s()) {
                rzb.INSTANCE.m183726c(xwm.INSTANCE.m213365a(OAUTH_DIALOG, bundleM9186q));
            } else {
                rzb.INSTANCE.m183726c(ozb.INSTANCE.m169919a(OAUTH_DIALOG, bundleM9186q));
            }
        }
        FragmentActivity fragmentActivityM9085i = loginClientM9163d.m9085i();
        if (fragmentActivityM9085i == null) {
            return 0;
        }
        Intent intent = new Intent(fragmentActivityM9085i, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f5914c, OAUTH_DIALOG);
        intent.putExtra(CustomTabMainActivity.f5915d, bundleM9186q);
        intent.putExtra(CustomTabMainActivity.f5916e, m9001z());
        intent.putExtra(CustomTabMainActivity.f5918g, request.getLoginTargetApp().getTargetApp());
        Fragment fragmentM9087l = loginClientM9163d.getFragment();
        if (fragmentM9087l != null) {
            fragmentM9087l.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    @Nullable
    /* JADX INFO: renamed from: s */
    public String mo8999s() {
        return "chrome_custom_tab";
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
        dest.writeString(this.expectedChallenge);
    }

    /* JADX INFO: renamed from: z */
    public final String m9001z() {
        String str = this.currentPackage;
        if (str != null) {
            return str;
        }
        String strM188633a = szb.m188633a();
        this.currentPackage = strM188633a;
        return strM188633a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(@NotNull Parcel parcel) {
        super(parcel);
        parcel.getClass();
        this.nameForLogging = "custom_tab";
        this.tokenSource = AccessTokenSource.CHROME_CUSTOM_TAB;
        this.expectedChallenge = parcel.readString();
        szb szbVar = szb.INSTANCE;
        this.validRedirectURI = szb.m188635c(m8991A());
    }
}
