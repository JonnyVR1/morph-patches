package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u001e¨\u0006!"}, m87232d2 = {"Ll/czv;", "", "Lcom/facebook/AccessToken;", "accessToken", "Lcom/facebook/AuthenticationToken;", "authenticationToken", "", "", "recentlyGrantedPermissions", "recentlyDeniedPermissions", "<init>", "(Lcom/facebook/AccessToken;Lcom/facebook/AuthenticationToken;Ljava/util/Set;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/facebook/AccessToken;", "()Lcom/facebook/AccessToken;", "b", "Lcom/facebook/AuthenticationToken;", "getAuthenticationToken", "()Lcom/facebook/AuthenticationToken;", "c", "Ljava/util/Set;", "()Ljava/util/Set;", Constants.INAPP_DATA_TAG, "getRecentlyDeniedPermissions", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public final /* data */ class czv {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AccessToken accessToken;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final AuthenticationToken authenticationToken;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Set<String> recentlyGrantedPermissions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Set<String> recentlyDeniedPermissions;

    @JvmOverloads
    public czv(@NotNull AccessToken accessToken, @Nullable AuthenticationToken authenticationToken, @NotNull Set<String> set, @NotNull Set<String> set2) {
        accessToken.getClass();
        set.getClass();
        set2.getClass();
        this.accessToken = accessToken;
        this.authenticationToken = authenticationToken;
        this.recentlyGrantedPermissions = set;
        this.recentlyDeniedPermissions = set2;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AccessToken getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Set<String> m109432b() {
        return this.recentlyGrantedPermissions;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof czv)) {
            return false;
        }
        czv czvVar = (czv) other;
        return Intrinsics.m87488d(this.accessToken, czvVar.accessToken) && Intrinsics.m87488d(this.authenticationToken, czvVar.authenticationToken) && Intrinsics.m87488d(this.recentlyGrantedPermissions, czvVar.recentlyGrantedPermissions) && Intrinsics.m87488d(this.recentlyDeniedPermissions, czvVar.recentlyDeniedPermissions);
    }

    public int hashCode() {
        int iHashCode = this.accessToken.hashCode() * 31;
        AuthenticationToken authenticationToken = this.authenticationToken;
        return ((((iHashCode + (authenticationToken == null ? 0 : authenticationToken.hashCode())) * 31) + this.recentlyGrantedPermissions.hashCode()) * 31) + this.recentlyDeniedPermissions.hashCode();
    }

    @NotNull
    public String toString() {
        return "LoginResult(accessToken=" + this.accessToken + ", authenticationToken=" + this.authenticationToken + ", recentlyGrantedPermissions=" + this.recentlyGrantedPermissions + ", recentlyDeniedPermissions=" + this.recentlyDeniedPermissions + ')';
    }
}
