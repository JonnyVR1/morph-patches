package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.p046p1.mobile.putong.core.data.StickerBundle;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p149l.fpd0;
import p149l.lsb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, m87232d2 = {"Lcom/facebook/appevents/internal/AppLinkManager;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "g", "(Landroid/app/Activity;)V", "Landroid/net/Uri;", "uri", "Landroid/content/Intent;", "intent", "h", "(Landroid/net/Uri;Landroid/content/Intent;)V", "", Constants.INAPP_DATA_TAG, "(Landroid/net/Uri;)Ljava/lang/String;", "c", "(Landroid/content/Intent;)Ljava/lang/String;", Constants.KEY_KEY, "e", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/app/Application;", "application", RXScreenCaptureService.KEY_INDEX, "(Landroid/app/Application;)V", "Landroid/content/SharedPreferences;", "a", "Lkotlin/Lazy;", "f", "()Landroid/content/SharedPreferences;", fpd0.DEFAULT_FILE_NAME, "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class AppLinkManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @Nullable
    public static volatile AppLinkManager f6123b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy preferences;

    /* JADX INFO: renamed from: com.facebook.appevents.internal.AppLinkManager$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Lcom/facebook/appevents/internal/AppLinkManager$a;", "", "<init>", "()V", "Lcom/facebook/appevents/internal/AppLinkManager;", "a", "()Lcom/facebook/appevents/internal/AppLinkManager;", "", "APPLINK_DATA_KEY", "Ljava/lang/String;", "APPLINK_INFO", "CAMPAIGN_IDS_KEY", "instance", "Lcom/facebook/appevents/internal/AppLinkManager;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final AppLinkManager m7934a() {
            AppLinkManager appLinkManagerM7925a = AppLinkManager.m7925a();
            if (appLinkManagerM7925a != null) {
                return appLinkManagerM7925a;
            }
            synchronized (this) {
                DefaultConstructorMarker defaultConstructorMarker = null;
                if (!C1577c.m8027F()) {
                    return null;
                }
                AppLinkManager appLinkManagerM7925a2 = AppLinkManager.m7925a();
                if (appLinkManagerM7925a2 == null) {
                    appLinkManagerM7925a2 = new AppLinkManager(defaultConstructorMarker);
                    AppLinkManager.m7926b(appLinkManagerM7925a2);
                }
                return appLinkManagerM7925a2;
            }
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.internal.AppLinkManager$b */
    @Metadata(m87231d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\n¨\u0006\u0010"}, m87232d2 = {"com/facebook/appevents/internal/AppLinkManager$b", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", StickerBundle.TYPE, "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "onActivityDestroyed", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C1567b implements Application.ActivityLifecycleCallbacks {
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
            AppLinkManager appLinkManagerM7934a = AppLinkManager.INSTANCE.m7934a();
            if (appLinkManagerM7934a != null) {
                appLinkManagerM7934a.m7931g(activity);
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
            AppLinkManager appLinkManagerM7934a = AppLinkManager.INSTANCE.m7934a();
            if (appLinkManagerM7934a != null) {
                appLinkManagerM7934a.m7931g(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            activity.getClass();
        }
    }

    public AppLinkManager() {
        this.preferences = LazyKt__LazyJVMKt.m87229b(new Function0<SharedPreferences>() { // from class: com.facebook.appevents.internal.AppLinkManager$preferences$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SharedPreferences invoke() {
                return C1577c.m8047l().getSharedPreferences("com.facebook.sdk.APPLINK_INFO", 0);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AppLinkManager m7925a() {
        if (lsb.m151554d(AppLinkManager.class)) {
            return null;
        }
        try {
            return f6123b;
        } catch (Throwable th) {
            lsb.m151552b(th, AppLinkManager.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ void m7926b(AppLinkManager appLinkManager) {
        if (lsb.m151554d(AppLinkManager.class)) {
            return;
        }
        try {
            f6123b = appLinkManager;
        } catch (Throwable th) {
            lsb.m151552b(th, AppLinkManager.class);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final String m7927c(@NotNull Intent intent) {
        if (lsb.m151554d(this)) {
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
            lsb.m151552b(th, this);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m7928d(@NotNull Uri uri) {
        if (lsb.m151554d(this)) {
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
            lsb.m151552b(th, this);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final String m7929e(@NotNull String key) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            key.getClass();
            return m7930f().getString(key, null);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final SharedPreferences m7930f() {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            Object value = this.preferences.getValue();
            value.getClass();
            return (SharedPreferences) value;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7931g(@NotNull Activity activity) {
        if (lsb.m151554d(this)) {
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
            m7932h(data, intent);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7932h(@NotNull Uri uri, @NotNull Intent intent) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            uri.getClass();
            intent.getClass();
            String strM7928d = m7928d(uri);
            if (strM7928d == null) {
                strM7928d = m7927c(intent);
            }
            if (strM7928d != null) {
                m7930f().edit().putString("campaign_ids", strM7928d).apply();
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7933i(@NotNull Application application) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            application.getClass();
            application.registerActivityLifecycleCallbacks(new C1567b());
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    public /* synthetic */ AppLinkManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
