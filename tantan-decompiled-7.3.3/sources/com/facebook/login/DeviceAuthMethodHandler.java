package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.Constants;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.Permissions;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.open.SocialConstants;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u0000 02\u00020\u0001:\u00011B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0014\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0085\u0001\u0010&\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0010\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u001c2\u0010\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u001c2\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u001c2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010$\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000bH\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00062"}, m88121d2 = {"Lcom/facebook/login/DeviceAuthMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "Lcom/facebook/login/LoginClient$Request;", SocialConstants.TYPE_REQUEST, "", "p", "(Lcom/facebook/login/LoginClient$Request;)I", "Lcom/facebook/login/DeviceAuthDialog;", BLiveStormDanmakuGiftResourceType.f45294s, "()Lcom/facebook/login/DeviceAuthDialog;", "", Constants.KEY_T, "()V", "Ljava/lang/Exception;", "ex", "u", "(Ljava/lang/Exception;)V", "", "accessToken", "applicationId", "userId", "", Permissions.TYPE, "declinedPermissions", "expiredPermissions", "Lcom/facebook/AccessTokenSource;", "accessTokenSource", "Ljava/util/Date;", "expirationTime", "lastRefreshTime", "dataAccessExpirationTime", "w", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lcom/facebook/AccessTokenSource;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V", "describeContents", "()I", BaseSei.f14624X, "(Lcom/facebook/login/LoginClient$Request;)V", "nameForLogging", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Companion", "b", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DeviceAuthMethodHandler extends LoginMethodHandler {
    private static ScheduledThreadPoolExecutor backgroundExecutor;

    @NotNull
    private final String nameForLogging;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new C1694a();

    /* JADX INFO: renamed from: com.facebook.login.DeviceAuthMethodHandler$a */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"com/facebook/login/DeviceAuthMethodHandler$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/DeviceAuthMethodHandler;", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/facebook/login/DeviceAuthMethodHandler;", "", "size", "", "b", "(I)[Lcom/facebook/login/DeviceAuthMethodHandler;", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class C1694a implements Parcelable.Creator<DeviceAuthMethodHandler> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceAuthMethodHandler createFromParcel(@NotNull Parcel source) {
            source.getClass();
            return new DeviceAuthMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DeviceAuthMethodHandler[] newArray(int size) {
            return new DeviceAuthMethodHandler[size];
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.DeviceAuthMethodHandler$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Lcom/facebook/login/DeviceAuthMethodHandler$b;", "", "<init>", "()V", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "a", "()Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/DeviceAuthMethodHandler;", "CREATOR", "Landroid/os/Parcelable$Creator;", "backgroundExecutor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final synchronized ScheduledThreadPoolExecutor m9058a() {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
            try {
                if (DeviceAuthMethodHandler.backgroundExecutor == null) {
                    DeviceAuthMethodHandler.backgroundExecutor = new ScheduledThreadPoolExecutor(1);
                }
                scheduledThreadPoolExecutor = DeviceAuthMethodHandler.backgroundExecutor;
                if (scheduledThreadPoolExecutor == null) {
                    Intrinsics.m88391r("backgroundExecutor");
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
            return scheduledThreadPoolExecutor;
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceAuthMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        loginClient.getClass();
        this.nameForLogging = "device_auth";
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
        m9055x(request);
        return 1;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public DeviceAuthDialog m9051s() {
        return new DeviceAuthDialog();
    }

    /* JADX INFO: renamed from: t */
    public void m9052t() {
        m9163d().m9083g(LoginClient.Result.INSTANCE.m9133a(m9163d().getPendingRequest(), LoginMethodHandler.USER_CANCELED_LOG_IN_ERROR_MESSAGE));
    }

    /* JADX INFO: renamed from: u */
    public void m9053u(@NotNull Exception ex) {
        ex.getClass();
        m9163d().m9083g(LoginClient.Result.Companion.m9132d(LoginClient.Result.INSTANCE, m9163d().getPendingRequest(), null, ex.getMessage(), null, 8, null));
    }

    /* JADX INFO: renamed from: w */
    public void m9054w(@NotNull String accessToken, @NotNull String applicationId, @NotNull String userId, @Nullable Collection<String> permissions, @Nullable Collection<String> declinedPermissions, @Nullable Collection<String> expiredPermissions, @Nullable AccessTokenSource accessTokenSource, @Nullable Date expirationTime, @Nullable Date lastRefreshTime, @Nullable Date dataAccessExpirationTime) {
        accessToken.getClass();
        applicationId.getClass();
        userId.getClass();
        m9163d().m9083g(LoginClient.Result.INSTANCE.m9136e(m9163d().getPendingRequest(), new AccessToken(accessToken, applicationId, userId, permissions, declinedPermissions, expiredPermissions, accessTokenSource, expirationTime, lastRefreshTime, dataAccessExpirationTime, null, 1024, null)));
    }

    /* JADX INFO: renamed from: x */
    public final void m9055x(LoginClient.Request request) {
        FragmentActivity fragmentActivityM9085i = m9163d().m9085i();
        if (fragmentActivityM9085i == null || fragmentActivityM9085i.isFinishing()) {
            return;
        }
        DeviceAuthDialog deviceAuthDialogM9051s = m9051s();
        deviceAuthDialogM9051s.show(fragmentActivityM9085i.getSupportFragmentManager(), "login_with_facebook");
        deviceAuthDialogM9051s.m9032w4(request);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceAuthMethodHandler(@NotNull Parcel parcel) {
        super(parcel);
        parcel.getClass();
        this.nameForLogging = "device_auth";
    }
}
