package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C1577c;
import com.tencent.open.SocialConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import p149l.eyb;
import p149l.p620;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m87232d2 = {"Lcom/facebook/login/KatanaProxyLoginMethodHandler;", "Lcom/facebook/login/NativeAppLoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "Lcom/facebook/login/LoginClient$Request;", SocialConstants.TYPE_REQUEST, "", "p", "(Lcom/facebook/login/LoginClient$Request;)I", "", "o", "()Z", "describeContents", "()I", "", "nameForLogging", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Companion", "b", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
@VisibleForTesting(otherwise = 3)
public final class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {

    @NotNull
    private final String nameForLogging;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new C1678a();

    /* JADX INFO: renamed from: com.facebook.login.KatanaProxyLoginMethodHandler$a */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"com/facebook/login/KatanaProxyLoginMethodHandler$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/KatanaProxyLoginMethodHandler;", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/facebook/login/KatanaProxyLoginMethodHandler;", "", "size", "", "b", "(I)[Lcom/facebook/login/KatanaProxyLoginMethodHandler;", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public static final class C1678a implements Parcelable.Creator<KatanaProxyLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public KatanaProxyLoginMethodHandler createFromParcel(@NotNull Parcel source) {
            source.getClass();
            return new KatanaProxyLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public KatanaProxyLoginMethodHandler[] newArray(int size) {
            return new KatanaProxyLoginMethodHandler[size];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KatanaProxyLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        loginClient.getClass();
        this.nameForLogging = "katana_proxy_auth";
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
    /* JADX INFO: renamed from: o */
    public boolean mo9016o() {
        return true;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: p */
    public int mo8944p(@NotNull LoginClient.Request request) {
        request.getClass();
        boolean z = C1577c.ignoreAppSwitchToLoggedOut && eyb.m118747a() != null && request.getLoginBehavior().getAllowsCustomTabAuth();
        String strM9087a = LoginClient.INSTANCE.m9087a();
        p620 p620Var = p620.INSTANCE;
        FragmentActivity fragmentActivityM9031i = m9109d().m9031i();
        String strM9050a = request.getApplicationId();
        Set<String> setM9063o = request.m9063o();
        boolean zM9068t = request.getIsRerequest();
        boolean zM9065q = request.m9065q();
        DefaultAudience defaultAudienceM9056g = request.getDefaultAudience();
        if (defaultAudienceM9056g == null) {
            defaultAudienceM9056g = DefaultAudience.NONE;
        }
        DefaultAudience defaultAudience = defaultAudienceM9056g;
        String strM9108c = m9108c(request.getAuthId());
        String strM9052c = request.getAuthType();
        String strM9061m = request.getMessengerPageId();
        boolean zM9064p = request.getResetMessengerState();
        boolean zM9066r = request.getIsFamilyLogin();
        boolean zM9049C = request.getShouldSkipAccountDeduplication();
        String strM9062n = request.getNonce();
        String strM9053d = request.getCodeChallenge();
        CodeChallengeMethod codeChallengeMethodM9054e = request.getCodeChallengeMethod();
        List<Intent> listM167587n = p620.m167587n(fragmentActivityM9031i, strM9050a, setM9063o, strM9087a, zM9068t, zM9065q, defaultAudience, strM9108c, strM9052c, z, strM9061m, zM9064p, zM9066r, zM9049C, strM9062n, strM9053d, codeChallengeMethodM9054e == null ? null : codeChallengeMethodM9054e.name());
        m9107a("e2e", strM9087a);
        Iterator<Intent> it = listM167587n.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            if (m9124C(it.next(), LoginClient.INSTANCE.m9088b())) {
                return i;
            }
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KatanaProxyLoginMethodHandler(@NotNull Parcel parcel) {
        super(parcel);
        parcel.getClass();
        this.nameForLogging = "katana_proxy_auth";
    }
}
