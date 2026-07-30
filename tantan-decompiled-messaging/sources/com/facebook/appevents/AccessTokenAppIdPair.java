package com.facebook.appevents;

import androidx.annotation.RestrictTo;
import com.facebook.AccessToken;
import com.facebook.C1577c;
import com.facebook.internal.C1657e;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u001aB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001b"}, m87232d2 = {"Lcom/facebook/appevents/AccessTokenAppIdPair;", "Ljava/io/Serializable;", "", "accessTokenString", "applicationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/AccessToken;", "accessToken", "(Lcom/facebook/AccessToken;)V", "", "writeReplace", "()Ljava/lang/Object;", "", "hashCode", "()I", "o", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApplicationId", "()Ljava/lang/String;", "getAccessTokenString", "Companion", "a", "SerializationProxyV1", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class AccessTokenAppIdPair implements Serializable {
    private static final long serialVersionUID = 1;

    @Nullable
    private final String accessTokenString;

    @NotNull
    private final String applicationId;

    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\r"}, m87232d2 = {"Lcom/facebook/appevents/AccessTokenAppIdPair$SerializationProxyV1;", "Ljava/io/Serializable;", "", "accessTokenString", RemoteConfigConstants.RequestFieldKey.APP_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "readResolve", "()Ljava/lang/Object;", "Ljava/lang/String;", "Companion", "a", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class SerializationProxyV1 implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;

        @Nullable
        private final String accessTokenString;

        @NotNull
        private final String appId;

        public SerializationProxyV1(@Nullable String str, @NotNull String str2) {
            str2.getClass();
            this.accessTokenString = str;
            this.appId = str2;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new AccessTokenAppIdPair(this.accessTokenString, this.appId);
        }
    }

    public AccessTokenAppIdPair(@Nullable String str, @NotNull String str2) {
        str2.getClass();
        this.applicationId = str2;
        this.accessTokenString = C1657e.m8832c0(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new SerializationProxyV1(this.accessTokenString, this.applicationId);
    }

    public boolean equals(@Nullable Object o) {
        if (!(o instanceof AccessTokenAppIdPair)) {
            return false;
        }
        AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) o;
        return C1657e.m8834e(accessTokenAppIdPair.accessTokenString, this.accessTokenString) && C1657e.m8834e(accessTokenAppIdPair.applicationId, this.applicationId);
    }

    @Nullable
    public final String getAccessTokenString() {
        return this.accessTokenString;
    }

    @NotNull
    public final String getApplicationId() {
        return this.applicationId;
    }

    public int hashCode() {
        String str = this.accessTokenString;
        return this.applicationId.hashCode() ^ (str != null ? str.hashCode() : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccessTokenAppIdPair(@NotNull AccessToken accessToken) {
        this(accessToken.getToken(), C1577c.m8048m());
        accessToken.getClass();
    }
}
