package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.facebook.internal.C1657e;
import com.p046p1.mobile.putong.core.data.StickerBundle;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.ark0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\u0019\u0018\u0000 N2\u00020\u0001:\u0002\u001cEB\u008b\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001c\u001a\u00020\u001b2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\u0017J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020'H\u0016¢\u0006\u0004\b-\u0010)J\u001f\u00100\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020'H\u0016¢\u0006\u0004\b0\u00101R\u0017\u00102\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001f\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002068\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u00109R\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002068\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b:\u00109R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002068\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b;\u00109R\u0017\u0010<\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u0017R\u0017\u0010?\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010C\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bC\u00103\u001a\u0004\bD\u00105R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\bE\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\bF\u0010\u0017R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\bG\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\bH\u0010\u0017R\u0011\u0010K\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0011\u0010M\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bL\u0010J¨\u0006O"}, m87232d2 = {"Lcom/facebook/AccessToken;", "Landroid/os/Parcelable;", "", "accessToken", "applicationId", "userId", "", "permissions", "declinedPermissions", "expiredPermissions", "Lcom/facebook/AccessTokenSource;", "accessTokenSource", "Ljava/util/Date;", "expirationTime", "lastRefreshTime", "dataAccessExpirationTime", "graphDomain", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lcom/facebook/AccessTokenSource;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "u", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "a", "(Ljava/lang/StringBuilder;)V", "tokenSource", "b", "(Lcom/facebook/AccessTokenSource;Ljava/lang/String;)Lcom/facebook/AccessTokenSource;", "toString", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lorg/json/JSONObject;", Constants.KEY_T, "()Lorg/json/JSONObject;", "describeContents", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "expires", "Ljava/util/Date;", "h", "()Ljava/util/Date;", "", "Ljava/util/Set;", BLiveStormDanmakuGiftResourceType.f44444l, "()Ljava/util/Set;", "f", "g", "token", "Ljava/lang/String;", "n", "source", "Lcom/facebook/AccessTokenSource;", "m", "()Lcom/facebook/AccessTokenSource;", "lastRefresh", "k", "c", "o", "e", RXScreenCaptureService.KEY_INDEX, "q", "()Z", "isExpired", "r", "isInstagramToken", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class AccessToken implements Parcelable {

    @NotNull
    public static final String ACCESS_TOKEN_KEY = "access_token";

    @NotNull
    private static final String APPLICATION_ID_KEY = "application_id";

    @JvmField
    @NotNull
    public static final Parcelable.Creator<AccessToken> CREATOR;
    private static final int CURRENT_JSON_FORMAT = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DATA_ACCESS_EXPIRATION_TIME = "data_access_expiration_time";

    @NotNull
    private static final String DECLINED_PERMISSIONS_KEY = "declined_permissions";

    @NotNull
    private static final AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE;

    @NotNull
    private static final Date DEFAULT_EXPIRATION_TIME;

    @NotNull
    public static final String DEFAULT_GRAPH_DOMAIN = "facebook";

    @NotNull
    private static final Date DEFAULT_LAST_REFRESH_TIME;

    @NotNull
    private static final String EXPIRED_PERMISSIONS_KEY = "expired_permissions";

    @NotNull
    private static final String EXPIRES_AT_KEY = "expires_at";

    @NotNull
    public static final String EXPIRES_IN_KEY = "expires_in";

    @NotNull
    public static final String GRAPH_DOMAIN = "graph_domain";

    @NotNull
    private static final String LAST_REFRESH_KEY = "last_refresh";

    @NotNull
    private static final Date MAX_DATE;

    @NotNull
    private static final String PERMISSIONS_KEY = "permissions";

    @NotNull
    private static final String SOURCE_KEY = "source";

    @NotNull
    private static final String TOKEN_KEY = "token";

    @NotNull
    public static final String USER_ID_KEY = "user_id";

    @NotNull
    private static final String VERSION_KEY = "version";

    @NotNull
    private final String applicationId;

    @NotNull
    private final Date dataAccessExpirationTime;

    @NotNull
    private final Set<String> declinedPermissions;

    @NotNull
    private final Set<String> expiredPermissions;

    @NotNull
    private final Date expires;

    @Nullable
    private final String graphDomain;

    @NotNull
    private final Date lastRefresh;

    @NotNull
    private final Set<String> permissions;

    @NotNull
    private final AccessTokenSource source;

    @NotNull
    private final String token;

    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: com.facebook.AccessToken$a */
    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Lcom/facebook/AccessToken$a;", "", "Lcom/facebook/AccessToken;", "accessToken", "", "b", "(Lcom/facebook/AccessToken;)V", "Lcom/facebook/FacebookException;", "exception", "a", "(Lcom/facebook/FacebookException;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public interface InterfaceC1485a {
        /* JADX INFO: renamed from: a */
        void m7428a(@Nullable FacebookException exception);

        /* JADX INFO: renamed from: b */
        void m7429b(@Nullable AccessToken accessToken);
    }

    /* JADX INFO: renamed from: com.facebook.AccessToken$b */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"com/facebook/AccessToken$b", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AccessToken;", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/facebook/AccessToken;", "", "size", "", "b", "(I)[Lcom/facebook/AccessToken;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C1486b implements Parcelable.Creator<AccessToken> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccessToken createFromParcel(@NotNull Parcel source) {
            source.getClass();
            return new AccessToken(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AccessToken[] newArray(int size) {
            return new AccessToken[size];
        }
    }

    /* JADX INFO: renamed from: com.facebook.AccessToken$c, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00192\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010!R\u0014\u0010*\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010!R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010!R\u0014\u00102\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100R\u0014\u00103\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010!R\u0014\u00104\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010!R\u0014\u00105\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010!R\u0014\u00106\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010!R\u0014\u00107\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u0010!R\u0014\u00108\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00100R\u0014\u00109\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010!R\u0014\u0010:\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010!R\u0014\u0010;\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u0010!R\u0014\u0010<\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010!R\u0014\u0010=\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010!¨\u0006>"}, m87232d2 = {"Lcom/facebook/AccessToken$c;", "", "<init>", "()V", "Lcom/facebook/AccessToken;", "e", "()Lcom/facebook/AccessToken;", "accessToken", "", RXScreenCaptureService.KEY_INDEX, "(Lcom/facebook/AccessToken;)V", "", "g", "()Z", "h", Constants.INAPP_DATA_TAG, "current", "a", "(Lcom/facebook/AccessToken;)Lcom/facebook/AccessToken;", "Landroid/os/Bundle;", StickerBundle.TYPE, "c", "(Landroid/os/Bundle;)Lcom/facebook/AccessToken;", "", Constants.KEY_KEY, "", "f", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "Lorg/json/JSONObject;", "jsonObject", "b", "(Lorg/json/JSONObject;)Lcom/facebook/AccessToken;", "ACCESS_TOKEN_KEY", "Ljava/lang/String;", "APPLICATION_ID_KEY", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "CURRENT_JSON_FORMAT", "I", "DATA_ACCESS_EXPIRATION_TIME", "DECLINED_PERMISSIONS_KEY", "Lcom/facebook/AccessTokenSource;", "DEFAULT_ACCESS_TOKEN_SOURCE", "Lcom/facebook/AccessTokenSource;", "Ljava/util/Date;", "DEFAULT_EXPIRATION_TIME", "Ljava/util/Date;", "DEFAULT_GRAPH_DOMAIN", "DEFAULT_LAST_REFRESH_TIME", "EXPIRED_PERMISSIONS_KEY", "EXPIRES_AT_KEY", "EXPIRES_IN_KEY", "GRAPH_DOMAIN", "LAST_REFRESH_KEY", "MAX_DATE", "PERMISSIONS_KEY", "SOURCE_KEY", "TOKEN_KEY", "USER_ID_KEY", "VERSION_KEY", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final AccessToken m7432a(@NotNull AccessToken current) {
            current.getClass();
            return new AccessToken(current.getToken(), current.getApplicationId(), current.getUserId(), current.m7420l(), current.m7415f(), current.m7416g(), current.getSource(), new Date(), new Date(), current.getDataAccessExpirationTime(), null, 1024, null);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final AccessToken m7433b(@NotNull JSONObject jsonObject) throws JSONException {
            jsonObject.getClass();
            if (jsonObject.getInt("version") > 1) {
                throw new FacebookException("Unknown AccessToken serialization format.");
            }
            String string = jsonObject.getString("token");
            Date date = new Date(jsonObject.getLong(AccessToken.EXPIRES_AT_KEY));
            JSONArray jSONArray = jsonObject.getJSONArray("permissions");
            JSONArray jSONArray2 = jsonObject.getJSONArray(AccessToken.DECLINED_PERMISSIONS_KEY);
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray(AccessToken.EXPIRED_PERMISSIONS_KEY);
            Date date2 = new Date(jsonObject.getLong(AccessToken.LAST_REFRESH_KEY));
            String string2 = jsonObject.getString("source");
            string2.getClass();
            AccessTokenSource accessTokenSourceValueOf = AccessTokenSource.valueOf(string2);
            String string3 = jsonObject.getString(AccessToken.APPLICATION_ID_KEY);
            String string4 = jsonObject.getString("user_id");
            Date date3 = new Date(jsonObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME, 0L));
            String strOptString = jsonObject.optString(AccessToken.GRAPH_DOMAIN, null);
            string.getClass();
            string3.getClass();
            string4.getClass();
            jSONArray.getClass();
            List<String> listM8839g0 = C1657e.m8839g0(jSONArray);
            jSONArray2.getClass();
            return new AccessToken(string, string3, string4, listM8839g0, C1657e.m8839g0(jSONArray2), jSONArrayOptJSONArray == null ? new ArrayList() : C1657e.m8839g0(jSONArrayOptJSONArray), accessTokenSourceValueOf, date, date2, date3, strOptString);
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: c */
        public final AccessToken m7434c(@NotNull Bundle bundle) throws JSONException {
            String string;
            bundle.getClass();
            List<String> listM7437f = m7437f(bundle, "com.facebook.TokenCachingStrategy.Permissions");
            List<String> listM7437f2 = m7437f(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List<String> listM7437f3 = m7437f(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            C1600f.Companion aVar = C1600f.INSTANCE;
            String strM8322a = aVar.m8322a(bundle);
            if (C1657e.m8832c0(strM8322a)) {
                strM8322a = C1577c.m8048m();
            }
            String str = strM8322a;
            String strM8327f = aVar.m8327f(bundle);
            if (strM8327f == null) {
                return null;
            }
            JSONObject jSONObjectM8836f = C1657e.m8836f(strM8327f);
            if (jSONObjectM8836f != null) {
                try {
                    string = jSONObjectM8836f.getString("id");
                } catch (JSONException unused) {
                    return null;
                }
            } else {
                string = null;
            }
            if (str == null || string == null) {
                return null;
            }
            return new AccessToken(strM8327f, str, string, listM7437f, listM7437f2, listM7437f3, aVar.m8326e(bundle), aVar.m8324c(bundle), aVar.m8325d(bundle), null, null, 1024, null);
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final void m7435d() {
            AccessToken accessTokenM7995i = C1575b.INSTANCE.m8008e().getCurrentAccessTokenField();
            if (accessTokenM7995i != null) {
                m7440i(m7432a(accessTokenM7995i));
            }
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: e */
        public final AccessToken m7436e() {
            return C1575b.INSTANCE.m8008e().getCurrentAccessTokenField();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: f */
        public final List<String> m7437f(@NotNull Bundle bundle, @Nullable String key) {
            bundle.getClass();
            ArrayList<String> stringArrayList = bundle.getStringArrayList(key);
            if (stringArrayList == null) {
                return CollectionsKt.emptyList();
            }
            List<String> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            listUnmodifiableList.getClass();
            return listUnmodifiableList;
        }

        @JvmStatic
        /* JADX INFO: renamed from: g */
        public final boolean m7438g() {
            AccessToken accessTokenM7995i = C1575b.INSTANCE.m8008e().getCurrentAccessTokenField();
            return (accessTokenM7995i == null || accessTokenM7995i.m7424q()) ? false : true;
        }

        @JvmStatic
        /* JADX INFO: renamed from: h */
        public final boolean m7439h() {
            AccessToken accessTokenM7995i = C1575b.INSTANCE.m8008e().getCurrentAccessTokenField();
            return (accessTokenM7995i == null || accessTokenM7995i.m7424q() || !accessTokenM7995i.m7425r()) ? false : true;
        }

        @JvmStatic
        /* JADX INFO: renamed from: i */
        public final void m7440i(@Nullable AccessToken accessToken) {
            C1575b.INSTANCE.m8008e().m8000n(accessToken);
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.AccessToken$d */
    @Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
    public /* synthetic */ class C1488d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5858a;

        static {
            int[] iArr = new int[AccessTokenSource.values().length];
            try {
                iArr[AccessTokenSource.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccessTokenSource.CHROME_CUSTOM_TAB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccessTokenSource.WEB_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5858a = iArr;
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        MAX_DATE = date;
        DEFAULT_EXPIRATION_TIME = date;
        DEFAULT_LAST_REFRESH_TIME = new Date();
        DEFAULT_ACCESS_TOKEN_SOURCE = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
        CREATOR = new C1486b();
    }

    public AccessToken(@NotNull Parcel parcel) {
        parcel.getClass();
        this.expires = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        setUnmodifiableSet.getClass();
        this.permissions = setUnmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        setUnmodifiableSet2.getClass();
        this.declinedPermissions = setUnmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        setUnmodifiableSet3.getClass();
        this.expiredPermissions = setUnmodifiableSet3;
        this.token = ark0.m98522k(parcel.readString(), "token");
        String string = parcel.readString();
        this.source = string != null ? AccessTokenSource.valueOf(string) : DEFAULT_ACCESS_TOKEN_SOURCE;
        this.lastRefresh = new Date(parcel.readLong());
        this.applicationId = ark0.m98522k(parcel.readString(), "applicationId");
        this.userId = ark0.m98522k(parcel.readString(), "userId");
        this.dataAccessExpirationTime = new Date(parcel.readLong());
        this.graphDomain = parcel.readString();
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final AccessToken m7408d() {
        return INSTANCE.m7436e();
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final boolean m7409p() {
        return INSTANCE.m7438g();
    }

    @JvmStatic
    /* JADX INFO: renamed from: s */
    public static final boolean m7410s() {
        return INSTANCE.m7439h();
    }

    /* JADX INFO: renamed from: a */
    public final void m7411a(StringBuilder builder) {
        builder.append(" permissions:");
        builder.append("[");
        builder.append(TextUtils.join(", ", this.permissions));
        builder.append(Constants.AES_SUFFIX);
    }

    /* JADX INFO: renamed from: b */
    public final AccessTokenSource m7412b(AccessTokenSource tokenSource, String graphDomain) {
        if (graphDomain == null || !graphDomain.equals("instagram")) {
            return tokenSource;
        }
        int i = C1488d.f5858a[tokenSource.ordinal()];
        if (i == 1) {
            return AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
        }
        if (i != 2) {
            return i != 3 ? tokenSource : AccessTokenSource.INSTAGRAM_WEB_VIEW;
        }
        return AccessTokenSource.INSTAGRAM_CUSTOM_CHROME_TAB;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Date getDataAccessExpirationTime() {
        return this.dataAccessExpirationTime;
    }

    public boolean equals(@Nullable Object other) {
        boolean zM87488d;
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) other;
        if (Intrinsics.m87488d(this.expires, accessToken.expires) && Intrinsics.m87488d(this.permissions, accessToken.permissions) && Intrinsics.m87488d(this.declinedPermissions, accessToken.declinedPermissions) && Intrinsics.m87488d(this.expiredPermissions, accessToken.expiredPermissions) && Intrinsics.m87488d(this.token, accessToken.token) && this.source == accessToken.source && Intrinsics.m87488d(this.lastRefresh, accessToken.lastRefresh) && Intrinsics.m87488d(this.applicationId, accessToken.applicationId) && Intrinsics.m87488d(this.userId, accessToken.userId) && Intrinsics.m87488d(this.dataAccessExpirationTime, accessToken.dataAccessExpirationTime)) {
            String str = this.graphDomain;
            String str2 = accessToken.graphDomain;
            if (str == null) {
                zM87488d = str2 == null;
            } else {
                zM87488d = Intrinsics.m87488d(str, str2);
            }
            if (zM87488d) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final Set<String> m7415f() {
        return this.declinedPermissions;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Set<String> m7416g() {
        return this.expiredPermissions;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Date getExpires() {
        return this.expires;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((((((((527 + this.expires.hashCode()) * 31) + this.permissions.hashCode()) * 31) + this.declinedPermissions.hashCode()) * 31) + this.expiredPermissions.hashCode()) * 31) + this.token.hashCode()) * 31) + this.source.hashCode()) * 31) + this.lastRefresh.hashCode()) * 31) + this.applicationId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.dataAccessExpirationTime.hashCode()) * 31;
        String str = this.graphDomain;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getGraphDomain() {
        return this.graphDomain;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final Date getLastRefresh() {
        return this.lastRefresh;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final Set<String> m7420l() {
        return this.permissions;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final AccessTokenSource getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m7424q() {
        return new Date().after(this.expires);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m7425r() {
        String str = this.graphDomain;
        return str != null && str.equals("instagram");
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final JSONObject m7426t() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.token);
        jSONObject.put(EXPIRES_AT_KEY, this.expires.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.permissions));
        jSONObject.put(DECLINED_PERMISSIONS_KEY, new JSONArray((Collection) this.declinedPermissions));
        jSONObject.put(EXPIRED_PERMISSIONS_KEY, new JSONArray((Collection) this.expiredPermissions));
        jSONObject.put(LAST_REFRESH_KEY, this.lastRefresh.getTime());
        jSONObject.put("source", this.source.name());
        jSONObject.put(APPLICATION_ID_KEY, this.applicationId);
        jSONObject.put("user_id", this.userId);
        jSONObject.put(DATA_ACCESS_EXPIRATION_TIME, this.dataAccessExpirationTime.getTime());
        String str = this.graphDomain;
        if (str != null) {
            jSONObject.put(GRAPH_DOMAIN, str);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken token:");
        sb.append(m7427u());
        m7411a(sb);
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final String m7427u() {
        return C1577c.m8029H(LoggingBehavior.INCLUDE_ACCESS_TOKENS) ? this.token : "ACCESS_TOKEN_REMOVED";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeLong(this.expires.getTime());
        dest.writeStringList(new ArrayList(this.permissions));
        dest.writeStringList(new ArrayList(this.declinedPermissions));
        dest.writeStringList(new ArrayList(this.expiredPermissions));
        dest.writeString(this.token);
        dest.writeString(this.source.name());
        dest.writeLong(this.lastRefresh.getTime());
        dest.writeString(this.applicationId);
        dest.writeString(this.userId);
        dest.writeLong(this.dataAccessExpirationTime.getTime());
        dest.writeString(this.graphDomain);
    }

    @JvmOverloads
    public AccessToken(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Collection<String> collection, @Nullable Collection<String> collection2, @Nullable Collection<String> collection3, @Nullable AccessTokenSource accessTokenSource, @Nullable Date date, @Nullable Date date2, @Nullable Date date3, @Nullable String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        ark0.m98518g(str, "accessToken");
        ark0.m98518g(str2, "applicationId");
        ark0.m98518g(str3, "userId");
        this.expires = date == null ? DEFAULT_EXPIRATION_TIME : date;
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        setUnmodifiableSet.getClass();
        this.permissions = setUnmodifiableSet;
        Set<String> setUnmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        setUnmodifiableSet2.getClass();
        this.declinedPermissions = setUnmodifiableSet2;
        Set<String> setUnmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        setUnmodifiableSet3.getClass();
        this.expiredPermissions = setUnmodifiableSet3;
        this.token = str;
        this.source = m7412b(accessTokenSource == null ? DEFAULT_ACCESS_TOKEN_SOURCE : accessTokenSource, str4);
        this.lastRefresh = date2 == null ? DEFAULT_LAST_REFRESH_TIME : date2;
        this.applicationId = str2;
        this.userId = str3;
        this.dataAccessExpirationTime = (date3 == null || date3.getTime() == 0) ? DEFAULT_EXPIRATION_TIME : date3;
        this.graphDomain = str4 == null ? "facebook" : str4;
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, (i & 1024) != 0 ? "facebook" : str4);
    }
}
