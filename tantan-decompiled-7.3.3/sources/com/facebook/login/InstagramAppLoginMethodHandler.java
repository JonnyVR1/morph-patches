package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessTokenSource;
import com.facebook.C1600c;
import com.tencent.open.SocialConstants;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import p153l.xe20;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, m88121d2 = {"Lcom/facebook/login/InstagramAppLoginMethodHandler;", "Lcom/facebook/login/NativeAppLoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "Lcom/facebook/login/LoginClient$Request;", SocialConstants.TYPE_REQUEST, "", "p", "(Lcom/facebook/login/LoginClient$Request;)I", "describeContents", "()I", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "nameForLogging", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcom/facebook/AccessTokenSource;", "tokenSource", "Lcom/facebook/AccessTokenSource;", "u", "()Lcom/facebook/AccessTokenSource;", "Companion", "b", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class InstagramAppLoginMethodHandler extends NativeAppLoginMethodHandler {

    @NotNull
    private final String nameForLogging;

    @NotNull
    private final AccessTokenSource tokenSource;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<InstagramAppLoginMethodHandler> CREATOR = new C1699a();

    /* JADX INFO: renamed from: com.facebook.login.InstagramAppLoginMethodHandler$a */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"com/facebook/login/InstagramAppLoginMethodHandler$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/InstagramAppLoginMethodHandler;", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/facebook/login/InstagramAppLoginMethodHandler;", "", "size", "", "b", "(I)[Lcom/facebook/login/InstagramAppLoginMethodHandler;", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class C1699a implements Parcelable.Creator<InstagramAppLoginMethodHandler> {
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
    public int mo8998p(@NotNull LoginClient.Request request) {
        request.getClass();
        LoginClient.Companion c1709c = LoginClient.INSTANCE;
        String strM9141a = c1709c.m9141a();
        xe20 xe20Var = xe20.INSTANCE;
        Context contextM9085i = m9163d().m9085i();
        if (contextM9085i == null) {
            contextM9085i = C1600c.m8101l();
        }
        String strM9104a = request.getApplicationId();
        Set<String> setM9117o = request.m9117o();
        boolean zM9122t = request.getIsRerequest();
        boolean zM9119q = request.m9119q();
        DefaultAudience defaultAudienceM9110g = request.getDefaultAudience();
        if (defaultAudienceM9110g == null) {
            defaultAudienceM9110g = DefaultAudience.NONE;
        }
        Intent intentM210521j = xe20.m210521j(contextM9085i, strM9104a, setM9117o, strM9141a, zM9122t, zM9119q, defaultAudienceM9110g, m9162c(request.getAuthId()), request.getAuthType(), request.getMessengerPageId(), request.getResetMessengerState(), request.getIsFamilyLogin(), request.getShouldSkipAccountDeduplication());
        m9161a("e2e", strM9141a);
        return m9178C(intentM210521j, c1709c.m9142b()) ? 1 : 0;
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
