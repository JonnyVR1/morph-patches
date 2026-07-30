package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.facebook.AccessToken;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0004\u0013\u0017\u0018\u0019B%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m88121d2 = {"Lcom/facebook/appevents/AppEventsLogger;", "", "Landroid/content/Context;", "context", "", "applicationId", "Lcom/facebook/AccessToken;", "accessToken", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "eventName", "Landroid/os/Bundle;", "parameters", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Landroid/os/Bundle;)V", "b", "()V", "Lcom/facebook/appevents/e;", "a", "Lcom/facebook/appevents/e;", "loggerImpl", "Companion", "FlushBehavior", "ProductAvailability", "ProductCondition", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class AppEventsLogger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    public static final String f5979b = AppEventsLogger.class.getCanonicalName();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C1576e loggerImpl;

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m88121d2 = {"Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "", "(Ljava/lang/String;I)V", "AUTO", "EXPLICIT_ONLY", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public enum FlushBehavior {
        AUTO,
        EXPLICIT_ONLY
    }

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m88121d2 = {"Lcom/facebook/appevents/AppEventsLogger$ProductAvailability;", "", "(Ljava/lang/String;I)V", "IN_STOCK", "OUT_OF_STOCK", "PREORDER", "AVALIABLE_FOR_ORDER", "DISCONTINUED", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public enum ProductAvailability {
        IN_STOCK,
        OUT_OF_STOCK,
        PREORDER,
        AVALIABLE_FOR_ORDER,
        DISCONTINUED
    }

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m88121d2 = {"Lcom/facebook/appevents/AppEventsLogger$ProductCondition;", "", "(Ljava/lang/String;I)V", "NEW", "REFURBISHED", "USED", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public enum ProductCondition {
        NEW,
        REFURBISHED,
        USED
    }

    /* JADX INFO: renamed from: com.facebook.appevents.AppEventsLogger$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0003J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u001c\u0010!\u001a\n  *\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001d¨\u0006\""}, m88121d2 = {"Lcom/facebook/appevents/AppEventsLogger$a;", "", "<init>", "()V", "Landroid/app/Application;", "application", "", "a", "(Landroid/app/Application;)V", "", "applicationId", "b", "(Landroid/app/Application;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "f", "(Landroid/content/Context;Ljava/lang/String;)V", "Lcom/facebook/appevents/AppEventsLogger;", "g", "(Landroid/content/Context;)Lcom/facebook/appevents/AppEventsLogger;", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", Constants.INAPP_DATA_TAG, "()Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "h", "e", "()Ljava/lang/String;", "c", "(Landroid/content/Context;)Ljava/lang/String;", "ACTION_APP_EVENTS_FLUSHED", "Ljava/lang/String;", "APP_EVENTS_EXTRA_FLUSH_RESULT", "APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED", "kotlin.jvm.PlatformType", "TAG", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m7700a(@NotNull Application application) {
            application.getClass();
            C1576e.INSTANCE.m7810f(application, null);
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m7701b(@NotNull Application application, @Nullable String applicationId) {
            application.getClass();
            C1576e.INSTANCE.m7810f(application, applicationId);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public final String m7702c(@NotNull Context context) {
            context.getClass();
            return C1576e.INSTANCE.m7814j(context);
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: d */
        public final FlushBehavior m7703d() {
            return C1576e.INSTANCE.m7815k();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: e */
        public final String m7704e() {
            return C1559a.m7709b();
        }

        @JvmStatic
        /* JADX INFO: renamed from: f */
        public final void m7705f(@NotNull Context context, @Nullable String applicationId) {
            context.getClass();
            C1576e.INSTANCE.m7818n(context, applicationId);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: g */
        public final AppEventsLogger m7706g(@NotNull Context context) {
            context.getClass();
            return new AppEventsLogger(context, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        @JvmStatic
        /* JADX INFO: renamed from: h */
        public final void m7707h() {
            C1576e.INSTANCE.m7822r();
        }

        public Companion() {
        }
    }

    public AppEventsLogger(Context context, String str, AccessToken accessToken) {
        this.loggerImpl = new C1576e(context, str, accessToken);
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m7695a(@NotNull Application application) {
        INSTANCE.m7700a(application);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m7696c(@NotNull Context context) {
        return INSTANCE.m7702c(context);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final AppEventsLogger m7697e(@NotNull Context context) {
        return INSTANCE.m7706g(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m7698b() {
        this.loggerImpl.m7796j();
    }

    /* JADX INFO: renamed from: d */
    public final void m7699d(@Nullable String eventName, @Nullable Bundle parameters) {
        this.loggerImpl.m7798l(eventName, parameters);
    }

    public /* synthetic */ AppEventsLogger(Context context, String str, AccessToken accessToken, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, accessToken);
    }
}
