package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.AccessToken;
import com.facebook.C1575b;
import com.facebook.C1599e;
import com.facebook.GraphResponse;
import com.facebook.internal.C1657e;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p149l.yrv;

/* JADX INFO: renamed from: com.facebook.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 22\u00020\u0001:\u0005\u001e \"&*B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\rJ\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\nJ\u0019\u0010\u001d\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010-\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00063"}, m87232d2 = {"Lcom/facebook/b;", "", "Ll/yrv;", "localBroadcastManager", "Lcom/facebook/a;", "accessTokenCache", "<init>", "(Ll/yrv;Lcom/facebook/a;)V", "", "j", "()Z", "", "g", "()V", "h", "Lcom/facebook/AccessToken$a;", "callback", "k", "(Lcom/facebook/AccessToken$a;)V", "Lcom/facebook/AccessToken;", "currentAccessToken", "saveToCache", "o", "(Lcom/facebook/AccessToken;Z)V", "oldAccessToken", "m", "(Lcom/facebook/AccessToken;Lcom/facebook/AccessToken;)V", "p", "q", BLiveStormDanmakuGiftResourceType.f44444l, "a", "Ll/yrv;", "b", "Lcom/facebook/a;", "c", "Lcom/facebook/AccessToken;", "currentAccessTokenField", "Ljava/util/concurrent/atomic/AtomicBoolean;", Constants.INAPP_DATA_TAG, "Ljava/util/concurrent/atomic/AtomicBoolean;", "tokenRefreshInProgress", "Ljava/util/Date;", "e", "Ljava/util/Date;", "lastAttemptedTokenExtendDate", "value", RXScreenCaptureService.KEY_INDEX, "()Lcom/facebook/AccessToken;", "n", "(Lcom/facebook/AccessToken;)V", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class C1575b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    @Nullable
    public static C1575b f6157f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final yrv localBroadcastManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C1526a accessTokenCache;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public AccessToken currentAccessTokenField;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean tokenRefreshInProgress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public Date lastAttemptedTokenExtendDate;

    /* JADX INFO: renamed from: com.facebook.b$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m87232d2 = {"Lcom/facebook/b$a;", "", "<init>", "()V", "Lcom/facebook/b;", "e", "()Lcom/facebook/b;", "Lcom/facebook/AccessToken;", "accessToken", "Lcom/facebook/GraphRequest$b;", "callback", "Lcom/facebook/GraphRequest;", Constants.INAPP_DATA_TAG, "(Lcom/facebook/AccessToken;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;", "Lcom/facebook/b$e;", "f", "(Lcom/facebook/AccessToken;)Lcom/facebook/b$e;", "c", "", "ACTION_CURRENT_ACCESS_TOKEN_CHANGED", "Ljava/lang/String;", "EXTRA_NEW_ACCESS_TOKEN", "EXTRA_OLD_ACCESS_TOKEN", "ME_PERMISSIONS_GRAPH_PATH", "SHARED_PREFERENCES_NAME", "TAG", "", "TOKEN_EXTEND_RETRY_SECONDS", "I", "TOKEN_EXTEND_THRESHOLD_SECONDS", "instanceField", "Lcom/facebook/b;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public final GraphRequest m8006c(AccessToken accessToken, GraphRequest.InterfaceC1516b callback) {
            e eVarM8009f = m8009f(accessToken);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", eVarM8009f.getGrantType());
            bundle.putString("client_id", accessToken.getApplicationId());
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            GraphRequest graphRequestM7585x = GraphRequest.INSTANCE.m7585x(accessToken, eVarM8009f.getGraphPath(), callback);
            graphRequestM7585x.m7520G(bundle);
            graphRequestM7585x.m7519F(HttpMethod.GET);
            return graphRequestM7585x;
        }

        /* JADX INFO: renamed from: d */
        public final GraphRequest m8007d(AccessToken accessToken, GraphRequest.InterfaceC1516b callback) {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            GraphRequest graphRequestM7585x = GraphRequest.INSTANCE.m7585x(accessToken, "me/permissions", callback);
            graphRequestM7585x.m7520G(bundle);
            graphRequestM7585x.m7519F(HttpMethod.GET);
            return graphRequestM7585x;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: e */
        public final C1575b m8008e() {
            C1575b c1575b;
            C1575b c1575b2 = C1575b.f6157f;
            if (c1575b2 != null) {
                return c1575b2;
            }
            synchronized (this) {
                c1575b = C1575b.f6157f;
                if (c1575b == null) {
                    yrv yrvVarM215864b = yrv.m215864b(C1577c.m8047l());
                    yrvVarM215864b.getClass();
                    C1575b c1575b3 = new C1575b(yrvVarM215864b, new C1526a());
                    C1575b.f6157f = c1575b3;
                    c1575b = c1575b3;
                }
            }
            return c1575b;
        }

        /* JADX INFO: renamed from: f */
        public final e m8009f(AccessToken accessToken) {
            String graphDomain = accessToken.getGraphDomain();
            if (graphDomain == null) {
                graphDomain = "facebook";
            }
            return Intrinsics.m87488d(graphDomain, "instagram") ? new c() : new b();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.b$b */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\u000b"}, m87232d2 = {"Lcom/facebook/b$b;", "Lcom/facebook/b$e;", "<init>", "()V", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "graphPath", "grantType", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class b implements e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String graphPath = "oauth/access_token";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String grantType = "fb_extend_sso_token";

        @Override // com.facebook.C1575b.e
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getGrantType() {
            return this.grantType;
        }

        @Override // com.facebook.C1575b.e
        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getGraphPath() {
            return this.graphPath;
        }
    }

    /* JADX INFO: renamed from: com.facebook.b$c */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\u000b"}, m87232d2 = {"Lcom/facebook/b$c;", "Lcom/facebook/b$e;", "<init>", "()V", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "graphPath", "grantType", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class c implements e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String graphPath = "refresh_access_token";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String grantType = "ig_refresh_token";

        @Override // com.facebook.C1575b.e
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getGrantType() {
            return this.grantType;
        }

        @Override // com.facebook.C1575b.e
        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getGraphPath() {
            return this.graphPath;
        }
    }

    /* JADX INFO: renamed from: com.facebook.b$d */
    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\f\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\t¨\u0006\u001f"}, m87232d2 = {"Lcom/facebook/b$d;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "accessToken", "", "b", "I", "c", "()I", "h", "(I)V", "expiresAt", Constants.INAPP_DATA_TAG, RXScreenCaptureService.KEY_INDEX, "expiresIn", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "g", "(Ljava/lang/Long;)V", "dataAccessExpirationTime", "e", "j", "graphDomain", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public String accessToken;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int expiresAt;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public int expiresIn;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public Long dataAccessExpirationTime;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public String graphDomain;

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Long getDataAccessExpirationTime() {
            return this.dataAccessExpirationTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getExpiresAt() {
            return this.expiresAt;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getExpiresIn() {
            return this.expiresIn;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getGraphDomain() {
            return this.graphDomain;
        }

        /* JADX INFO: renamed from: f */
        public final void m8017f(@Nullable String str) {
            this.accessToken = str;
        }

        /* JADX INFO: renamed from: g */
        public final void m8018g(@Nullable Long l2) {
            this.dataAccessExpirationTime = l2;
        }

        /* JADX INFO: renamed from: h */
        public final void m8019h(int i) {
            this.expiresAt = i;
        }

        /* JADX INFO: renamed from: i */
        public final void m8020i(int i) {
            this.expiresIn = i;
        }

        /* JADX INFO: renamed from: j */
        public final void m8021j(@Nullable String str) {
            this.graphDomain = str;
        }
    }

    /* JADX INFO: renamed from: com.facebook.b$e */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, m87232d2 = {"Lcom/facebook/b$e;", "", "", "b", "()Ljava/lang/String;", "graphPath", "a", "grantType", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public interface e {
        @NotNull
        /* JADX INFO: renamed from: a */
        String getGrantType();

        @NotNull
        /* JADX INFO: renamed from: b */
        String getGraphPath();
    }

    public C1575b(@NotNull yrv yrvVar, @NotNull C1526a c1526a) {
        yrvVar.getClass();
        c1526a.getClass();
        this.localBroadcastManager = yrvVar;
        this.accessTokenCache = c1526a;
        this.tokenRefreshInProgress = new AtomicBoolean(false);
        this.lastAttemptedTokenExtendDate = new Date(0L);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0126 A[Catch: all -> 0x0045, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0045, blocks: (B:3:0x002a, B:5:0x0036, B:7:0x0040, B:11:0x004a, B:14:0x0052, B:19:0x005e, B:22:0x006e, B:24:0x007a, B:29:0x00a4, B:31:0x00a8, B:32:0x00ac, B:36:0x00c3, B:40:0x00d2, B:44:0x00e1, B:46:0x00ee, B:50:0x0103, B:51:0x0107, B:48:0x00fc, B:43:0x00dd, B:39:0x00ce, B:35:0x00bf, B:26:0x0088, B:28:0x008e, B:60:0x0126), top: B:69:0x002a }] */
    /* JADX INFO: renamed from: a */
    public static void m7987a(d dVar, AccessToken accessToken, AccessToken.InterfaceC1485a interfaceC1485a, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, C1575b c1575b, C1599e c1599e) throws Throwable {
        AccessToken accessToken2;
        dVar.getClass();
        atomicBoolean.getClass();
        set.getClass();
        set2.getClass();
        set3.getClass();
        c1575b.getClass();
        c1599e.getClass();
        String accessToken3 = dVar.getAccessToken();
        int expiresAt = dVar.getExpiresAt();
        Long dataAccessExpirationTime = dVar.getDataAccessExpirationTime();
        String graphDomain = dVar.getGraphDomain();
        try {
            Companion companion = INSTANCE;
            if (companion.m8008e().getCurrentAccessTokenField() != null) {
                AccessToken currentAccessTokenField = companion.m8008e().getCurrentAccessTokenField();
                if ((currentAccessTokenField != null ? currentAccessTokenField.getUserId() : null) != accessToken.getUserId()) {
                    if (interfaceC1485a != null) {
                        interfaceC1485a.m7428a(new FacebookException("No current access token to refresh"));
                    }
                } else {
                    if (atomicBoolean.get() || accessToken3 != null || expiresAt != 0) {
                        Date expires = accessToken.getExpires();
                        if (dVar.getExpiresAt() != 0) {
                            expires = new Date(((long) dVar.getExpiresAt()) * 1000);
                        } else if (dVar.getExpiresIn() != 0) {
                            expires = new Date((((long) dVar.getExpiresIn()) * 1000) + new Date().getTime());
                        }
                        Date date = expires;
                        if (accessToken3 == null) {
                            accessToken3 = accessToken.getToken();
                        }
                        String applicationId = accessToken.getApplicationId();
                        String userId = accessToken.getUserId();
                        Set setM7420l = atomicBoolean.get() ? set : accessToken.m7420l();
                        Set setM7415f = atomicBoolean.get() ? set2 : accessToken.m7415f();
                        Set setM7416g = atomicBoolean.get() ? set3 : accessToken.m7416g();
                        AccessTokenSource source = accessToken.getSource();
                        Date date2 = new Date();
                        Date date3 = dataAccessExpirationTime != null ? new Date(1000 * dataAccessExpirationTime.longValue()) : accessToken.getDataAccessExpirationTime();
                        if (graphDomain == null) {
                            graphDomain = accessToken.getGraphDomain();
                        }
                        AccessToken accessToken4 = new AccessToken(accessToken3, applicationId, userId, setM7420l, setM7415f, setM7416g, source, date, date2, date3, graphDomain);
                        try {
                            companion.m8008e().m8000n(accessToken4);
                            c1575b.tokenRefreshInProgress.set(false);
                            if (interfaceC1485a != null) {
                                interfaceC1485a.m7429b(accessToken4);
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            accessToken2 = accessToken4;
                            c1575b.tokenRefreshInProgress.set(false);
                            if (interfaceC1485a != null && accessToken2 != null) {
                                interfaceC1485a.m7429b(accessToken2);
                            }
                            throw th;
                        }
                    }
                    if (interfaceC1485a != null) {
                        interfaceC1485a.m7428a(new FacebookException("Failed to refresh access token"));
                    }
                }
            } else if (interfaceC1485a != null) {
                interfaceC1485a.m7428a(new FacebookException("No current access token to refresh"));
            }
            c1575b.tokenRefreshInProgress.set(false);
        } catch (Throwable th2) {
            th = th2;
            accessToken2 = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7988b(d dVar, GraphResponse graphResponse) {
        dVar.getClass();
        graphResponse.getClass();
        JSONObject jsonObject = graphResponse.getJsonObject();
        if (jsonObject == null) {
            return;
        }
        dVar.m8017f(jsonObject.optString("access_token"));
        dVar.m8019h(jsonObject.optInt("expires_at"));
        dVar.m8020i(jsonObject.optInt("expires_in"));
        dVar.m8018g(Long.valueOf(jsonObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME)));
        dVar.m8021j(jsonObject.optString(AccessToken.GRAPH_DOMAIN, null));
    }

    /* JADX INFO: renamed from: c */
    public static void m7989c(C1575b c1575b, AccessToken.InterfaceC1485a interfaceC1485a) {
        c1575b.getClass();
        c1575b.m7998l(interfaceC1485a);
    }

    /* JADX INFO: renamed from: d */
    public static void m7990d(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, GraphResponse graphResponse) {
        JSONArray jSONArrayOptJSONArray;
        atomicBoolean.getClass();
        set.getClass();
        set2.getClass();
        set3.getClass();
        graphResponse.getClass();
        JSONObject jsonObject = graphResponse.getJsonObject();
        if (jsonObject == null || (jSONArrayOptJSONArray = jsonObject.optJSONArray("data")) == null) {
            return;
        }
        atomicBoolean.set(true);
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("permission");
                String strOptString2 = jSONObjectOptJSONObject.optString(NotificationCompat.CATEGORY_STATUS);
                if (!C1657e.m8832c0(strOptString) && !C1657e.m8832c0(strOptString2)) {
                    strOptString2.getClass();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = strOptString2.toLowerCase(locale);
                    lowerCase.getClass();
                    int iHashCode = lowerCase.hashCode();
                    if (iHashCode != -1309235419) {
                        if (iHashCode != 280295099) {
                            if (iHashCode == 568196142 && lowerCase.equals("declined")) {
                                set2.add(strOptString);
                            }
                        } else if (lowerCase.equals("granted")) {
                            set.add(strOptString);
                        }
                    } else if (lowerCase.equals("expired")) {
                        set3.add(strOptString);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7993g() {
        m7999m(getCurrentAccessTokenField(), getCurrentAccessTokenField());
    }

    /* JADX INFO: renamed from: h */
    public final void m7994h() {
        if (m8003q()) {
            m7997k(null);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final AccessToken getCurrentAccessTokenField() {
        return this.currentAccessTokenField;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m7996j() {
        AccessToken accessTokenM7636f = this.accessTokenCache.m7636f();
        if (accessTokenM7636f == null) {
            return false;
        }
        m8001o(accessTokenM7636f, false);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m7997k(@Nullable final AccessToken.InterfaceC1485a callback) {
        if (Intrinsics.m87488d(Looper.getMainLooper(), Looper.myLooper())) {
            m7998l(callback);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable(callback) { // from class: l.la
                @Override // java.lang.Runnable
                public final void run() {
                    C1575b.m7989c(this.f127154a, null);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m7998l(final AccessToken.InterfaceC1485a callback) {
        final AccessToken currentAccessTokenField = getCurrentAccessTokenField();
        if (currentAccessTokenField == null) {
            if (callback != null) {
                callback.m7428a(new FacebookException("No current access token to refresh"));
                return;
            }
            return;
        }
        if (!this.tokenRefreshInProgress.compareAndSet(false, true)) {
            if (callback != null) {
                callback.m7428a(new FacebookException("Refresh already in progress"));
                return;
            }
            return;
        }
        this.lastAttemptedTokenExtendDate = new Date();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        final HashSet hashSet3 = new HashSet();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final d dVar = new d();
        Companion companion = INSTANCE;
        C1599e c1599e = new C1599e(companion.m8007d(currentAccessTokenField, new GraphRequest.InterfaceC1516b() { // from class: l.ma
            @Override // com.facebook.GraphRequest.InterfaceC1516b
            /* JADX INFO: renamed from: a */
            public final void mo7548a(GraphResponse graphResponse) {
                C1575b.m7990d(atomicBoolean, hashSet, hashSet2, hashSet3, graphResponse);
            }
        }), companion.m8006c(currentAccessTokenField, new GraphRequest.InterfaceC1516b() { // from class: l.na
            @Override // com.facebook.GraphRequest.InterfaceC1516b
            /* JADX INFO: renamed from: a */
            public final void mo7548a(GraphResponse graphResponse) {
                C1575b.m7988b(dVar, graphResponse);
            }
        }));
        c1599e.m8302f(new C1599e.a(currentAccessTokenField, callback, atomicBoolean, hashSet, hashSet2, hashSet3, this) { // from class: l.oa

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AccessToken f142756b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ AtomicBoolean f142757c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Set f142758d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ Set f142759e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ Set f142760f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ C1575b f142761g;

            {
                this.f142757c = atomicBoolean;
                this.f142758d = hashSet;
                this.f142759e = hashSet2;
                this.f142760f = hashSet3;
                this.f142761g = this;
            }

            @Override // com.facebook.C1599e.a
            /* JADX INFO: renamed from: a */
            public final void mo8317a(C1599e c1599e2) throws Throwable {
                C1575b.m7987a(this.f142755a, this.f142756b, null, this.f142757c, this.f142758d, this.f142759e, this.f142760f, this.f142761g, c1599e2);
            }
        });
        c1599e.m8306j();
    }

    /* JADX INFO: renamed from: m */
    public final void m7999m(AccessToken oldAccessToken, AccessToken currentAccessToken) {
        Intent intent = new Intent(C1577c.m8047l(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", oldAccessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", currentAccessToken);
        this.localBroadcastManager.m215867d(intent);
    }

    /* JADX INFO: renamed from: n */
    public final void m8000n(@Nullable AccessToken accessToken) {
        m8001o(accessToken, true);
    }

    /* JADX INFO: renamed from: o */
    public final void m8001o(AccessToken currentAccessToken, boolean saveToCache) {
        AccessToken accessToken = this.currentAccessTokenField;
        this.currentAccessTokenField = currentAccessToken;
        this.tokenRefreshInProgress.set(false);
        this.lastAttemptedTokenExtendDate = new Date(0L);
        if (saveToCache) {
            C1526a c1526a = this.accessTokenCache;
            if (currentAccessToken != null) {
                c1526a.m7637g(currentAccessToken);
            } else {
                c1526a.m7631a();
                C1657e.m8841i(C1577c.m8047l());
            }
        }
        if (C1657e.m8834e(accessToken, currentAccessToken)) {
            return;
        }
        m7999m(accessToken, currentAccessToken);
        m8002p();
    }

    /* JADX INFO: renamed from: p */
    public final void m8002p() {
        Context contextM8047l = C1577c.m8047l();
        AccessToken.Companion companion = AccessToken.INSTANCE;
        AccessToken accessTokenM7436e = companion.m7436e();
        AlarmManager alarmManager = (AlarmManager) contextM8047l.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (companion.m7438g()) {
            if ((accessTokenM7436e != null ? accessTokenM7436e.getExpires() : null) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(contextM8047l, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, accessTokenM7436e.getExpires().getTime(), PendingIntent.getBroadcast(contextM8047l, 0, intent, AudioRoutingController.DEVICE_OUT_USB_HEADSET));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m8003q() {
        AccessToken currentAccessTokenField = getCurrentAccessTokenField();
        if (currentAccessTokenField == null) {
            return false;
        }
        long time = new Date().getTime();
        return currentAccessTokenField.getSource().getCanExtendToken() && time - this.lastAttemptedTokenExtendDate.getTime() > 3600000 && time - currentAccessTokenField.getLastRefresh().getTime() > 86400000;
    }
}
