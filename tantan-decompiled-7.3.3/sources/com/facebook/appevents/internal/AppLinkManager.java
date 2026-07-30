package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.p051p1.mobile.putong.core.data.StickerBundle;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p153l.hxd0;
import p153l.ztb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, m88121d2 = {"Lcom/facebook/appevents/internal/AppLinkManager;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "g", "(Landroid/app/Activity;)V", "Landroid/net/Uri;", "uri", "Landroid/content/Intent;", "intent", "h", "(Landroid/net/Uri;Landroid/content/Intent;)V", "", Constants.INAPP_DATA_TAG, "(Landroid/net/Uri;)Ljava/lang/String;", "c", "(Landroid/content/Intent;)Ljava/lang/String;", Constants.KEY_KEY, "e", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/app/Application;", "application", RXScreenCaptureService.KEY_INDEX, "(Landroid/app/Application;)V", "Landroid/content/SharedPreferences;", "a", "Lkotlin/Lazy;", "f", "()Landroid/content/SharedPreferences;", hxd0.DEFAULT_FILE_NAME, "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class AppLinkManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @Nullable
    public static volatile AppLinkManager f6160b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy preferences;

    /* JADX INFO: renamed from: com.facebook.appevents.internal.AppLinkManager$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Lcom/facebook/appevents/internal/AppLinkManager$a;", "", "<init>", "()V", "Lcom/facebook/appevents/internal/AppLinkManager;", "a", "()Lcom/facebook/appevents/internal/AppLinkManager;", "", "APPLINK_DATA_KEY", "Ljava/lang/String;", "APPLINK_INFO", "CAMPAIGN_IDS_KEY", "instance", "Lcom/facebook/appevents/internal/AppLinkManager;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final AppLinkManager m7988a() {
            AppLinkManager appLinkManagerM7979a = AppLinkManager.m7979a();
            if (appLinkManagerM7979a != null) {
                return appLinkManagerM7979a;
            }
            synchronized (this) {
                DefaultConstructorMarker defaultConstructorMarker = null;
                if (!C1600c.m8081F()) {
                    return null;
                }
                AppLinkManager appLinkManagerM7979a2 = AppLinkManager.m7979a();
                if (appLinkManagerM7979a2 == null) {
                    appLinkManagerM7979a2 = new AppLinkManager(defaultConstructorMarker);
                    AppLinkManager.m7980b(appLinkManagerM7979a2);
                }
                return appLinkManagerM7979a2;
            }
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.internal.AppLinkManager$b */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\n¨\u0006\u0010"}, m88121d2 = {"com/facebook/appevents/internal/AppLinkManager$b", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", StickerBundle.TYPE, "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "onActivityDestroyed", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C1590b implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            activity.getClass();
            AppLinkManager appLinkManagerM7988a = AppLinkManager.INSTANCE.m7988a();
            if (appLinkManagerM7988a != null) {
                appLinkManagerM7988a.m7985g(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
            activity.getClass();
            bundle.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            activity.getClass();
            AppLinkManager appLinkManagerM7988a = AppLinkManager.INSTANCE.m7988a();
            if (appLinkManagerM7988a != null) {
                appLinkManagerM7988a.m7985g(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            activity.getClass();
        }
    }

    public AppLinkManager() {
        this.preferences = LazyKt__LazyJVMKt.m88118b(new Function0<SharedPreferences>() { // from class: com.facebook.appevents.internal.AppLinkManager$preferences$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SharedPreferences invoke() {
                return C1600c.m8101l().getSharedPreferences("com.facebook.sdk.APPLINK_INFO", 0);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AppLinkManager m7979a() {
        if (ztb.m221490d(AppLinkManager.class)) {
            return null;
        }
        try {
            return f6160b;
        } catch (Throwable th) {
            ztb.m221488b(th, AppLinkManager.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ void m7980b(AppLinkManager appLinkManager) {
        if (ztb.m221490d(AppLinkManager.class)) {
            return;
        }
        try {
            f6160b = appLinkManager;
        } catch (Throwable th) {
            ztb.m221488b(th, AppLinkManager.class);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final String m7981c(@NotNull Intent intent) {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            intent.getClass();
            Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
            if (bundleExtra == null) {
                return null;
            }
            return bundleExtra.getString("campaign_ids");
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m7982d(@NotNull Uri uri) {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            uri.getClass();
            String queryParameter = uri.getQueryParameter("al_applink_data");
            if (queryParameter == null) {
                return null;
            }
            try {
                return new JSONObject(queryParameter).getString("campaign_ids");
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final String m7983e(@NotNull String key) {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            key.getClass();
            return m7984f().getString(key, null);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final SharedPreferences m7984f() {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            Object value = this.preferences.getValue();
            value.getClass();
            return (SharedPreferences) value;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7985g(@NotNull Activity activity) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            activity.getClass();
            Uri data = activity.getIntent().getData();
            if (data == null) {
                return;
            }
            Intent intent = activity.getIntent();
            intent.getClass();
            m7986h(data, intent);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7986h(@NotNull Uri uri, @NotNull Intent intent) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            uri.getClass();
            intent.getClass();
            String strM7982d = m7982d(uri);
            if (strM7982d == null) {
                strM7982d = m7981c(intent);
            }
            if (strM7982d != null) {
                m7984f().edit().putString("campaign_ids", strM7982d).apply();
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7987i(@NotNull Application application) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            application.getClass();
            application.registerActivityLifecycleCallbacks(new C1590b());
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    public /* synthetic */ AppLinkManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
