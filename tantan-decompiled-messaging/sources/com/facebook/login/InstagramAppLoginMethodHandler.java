package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessTokenSource;
import com.facebook.C1577c;
import com.tencent.open.SocialConstants;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import p149l.p620;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, m87232d2 = {"Lcom/facebook/login/InstagramAppLoginMethodHandler;", "Lcom/facebook/login/NativeAppLoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "Lcom/facebook/login/LoginClient$Request;", SocialConstants.TYPE_REQUEST, "", "p", "(Lcom/facebook/login/LoginClient$Request;)I", "describeContents", "()I", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "nameForLogging", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcom/facebook/AccessTokenSource;", "tokenSource", "Lcom/facebook/AccessTokenSource;", "u", "()Lcom/facebook/AccessTokenSource;", "Companion", "b", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public final class InstagramAppLoginMethodHandler extends NativeAppLoginMethodHandler {

    @NotNull
    private final String nameForLogging;

    @NotNull
    private final AccessTokenSource tokenSource;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<InstagramAppLoginMethodHandler> CREATOR = new C1676a();

    /* JADX INFO: renamed from: com.facebook.login.InstagramAppLoginMethodHandler$a */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"com/facebook/login/InstagramAppLoginMethodHandler$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/InstagramAppLoginMethodHandler;", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/facebook/login/InstagramAppLoginMethodHandler;", "", "size", "", "b", "(I)[Lcom/facebook/login/InstagramAppLoginMethodHandler;", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public static final class C1676a implements Parcelable.Creator<InstagramAppLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InstagramAppLoginMethodHandler createFromParcel(@NotNull Parcel source) {
            source.getClass();
            return new InstagramAppLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InstagramAppLoginMethodHandler[] newArray(int size) {
            return new InstagramAppLoginMethodHandler[size];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramAppLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        loginClient.getClass();
        this.nameForLogging = "instagram_login";
        this.tokenSource = AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
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
    /* JADX INFO: renamed from: p */
    public int mo8944p(@NotNull LoginClient.Request request) {
        request.getClass();
        LoginClient.Companion c1686c = LoginClient.INSTANCE;
        String strM9087a = c1686c.m9087a();
        p620 p620Var = p620.INSTANCE;
        Context contextM9031i = m9109d().m9031i();
        if (contextM9031i == null) {
            contextM9031i = C1577c.m8047l();
        }
        String strM9050a = request.getApplicationId();
        Set<String> setM9063o = request.m9063o();
        boolean zM9068t = request.getIsRerequest();
        boolean zM9065q = request.m9065q();
        DefaultAudience defaultAudienceM9056g = request.getDefaultAudience();
        if (defaultAudienceM9056g == null) {
            defaultAudienceM9056g = DefaultAudience.NONE;
        }
        Intent intentM167584j = p620.m167584j(contextM9031i, strM9050a, setM9063o, strM9087a, zM9068t, zM9065q, defaultAudienceM9056g, m9108c(request.getAuthId()), request.getAuthType(), request.getMessengerPageId(), request.getResetMessengerState(), request.getIsFamilyLogin(), request.getShouldSkipAccountDeduplication());
        m9107a("e2e", strM9087a);
        return m9124C(intentM167584j, c1686c.m9088b()) ? 1 : 0;
    }

    @Override // com.facebook.login.NativeAppLoginMethodHandler
    @NotNull
    /* JADX INFO: renamed from: u, reason: from getter */
    public AccessTokenSource getTokenSource() {
        return this.tokenSource;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        super.writeToParcel(dest, flags);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramAppLoginMethodHandler(@NotNull Parcel parcel) {
        super(parcel);
        parcel.getClass();
        this.nameForLogging = "instagram_login";
        this.tokenSource = AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
    }
}
