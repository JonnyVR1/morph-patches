package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.lsb;

/* JADX INFO: renamed from: com.facebook.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 !2\u00020\u0001:\u0002\u0010\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00188CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u0016\u0010 \u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000b¨\u0006\""}, m87232d2 = {"Lcom/facebook/a;", "", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lcom/facebook/a$b;", "tokenCachingStrategyFactory", "<init>", "(Landroid/content/SharedPreferences;Lcom/facebook/a$b;)V", "()V", "Lcom/facebook/AccessToken;", "f", "()Lcom/facebook/AccessToken;", "accessToken", "", "g", "(Lcom/facebook/AccessToken;)V", "a", "", "e", "()Z", "h", "Landroid/content/SharedPreferences;", "b", "Lcom/facebook/a$b;", "Lcom/facebook/f;", "c", "Lcom/facebook/f;", "tokenCachingStrategyField", Constants.INAPP_DATA_TAG, "()Lcom/facebook/f;", "tokenCachingStrategy", "cachedAccessToken", "legacyAccessToken", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class C1526a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final b tokenCachingStrategyFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public C1600f tokenCachingStrategyField;

    /* JADX INFO: renamed from: com.facebook.a$b */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/facebook/a$b;", "", "<init>", "()V", "Lcom/facebook/f;", "a", "()Lcom/facebook/f;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class b {
        @NotNull
        /* JADX INFO: renamed from: a */
        public final C1600f m7639a() {
            return new C1600f(C1577c.m8047l(), null, 2, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1526a() {
        SharedPreferences sharedPreferences = C1577c.m8047l().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        sharedPreferences.getClass();
        this(sharedPreferences, new b());
    }

    /* JADX INFO: renamed from: a */
    public final void m7631a() {
        this.sharedPreferences.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (m7638h()) {
            m7634d().m8319a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final AccessToken m7632b() {
        String string = this.sharedPreferences.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            return AccessToken.INSTANCE.m7433b(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final AccessToken m7633c() {
        Bundle bundleM8321c = m7634d().m8321c();
        if (bundleM8321c == null || !C1600f.INSTANCE.m8328g(bundleM8321c)) {
            return null;
        }
        return AccessToken.INSTANCE.m7434c(bundleM8321c);
    }

    /* JADX INFO: renamed from: d */
    public final C1600f m7634d() {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            if (this.tokenCachingStrategyField == null) {
                synchronized (this) {
                    try {
                        if (this.tokenCachingStrategyField == null) {
                            this.tokenCachingStrategyField = this.tokenCachingStrategyFactory.m7639a();
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            C1600f c1600f = this.tokenCachingStrategyField;
            if (c1600f != null) {
                return c1600f;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th2) {
            lsb.m151552b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m7635e() {
        return this.sharedPreferences.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final AccessToken m7636f() {
        if (m7635e()) {
            return m7632b();
        }
        if (!m7638h()) {
            return null;
        }
        AccessToken accessTokenM7633c = m7633c();
        if (accessTokenM7633c != null) {
            m7637g(accessTokenM7633c);
            m7634d().m8319a();
        }
        return accessTokenM7633c;
    }

    /* JADX INFO: renamed from: g */
    public final void m7637g(@NotNull AccessToken accessToken) {
        accessToken.getClass();
        try {
            this.sharedPreferences.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.m7426t().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m7638h() {
        return C1577c.m8028G();
    }

    public C1526a(@NotNull SharedPreferences sharedPreferences, @NotNull b bVar) {
        sharedPreferences.getClass();
        bVar.getClass();
        this.sharedPreferences = sharedPreferences;
        this.tokenCachingStrategyFactory = bVar;
    }
}
