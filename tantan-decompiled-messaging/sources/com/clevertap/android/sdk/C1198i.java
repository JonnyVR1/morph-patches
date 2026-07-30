package com.clevertap.android.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.clevertap.android.sdk.C1198i;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b50;
import p149l.e16;
import p149l.tfb0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 92\u00020\u0001:\u0004\u0016\u0018/\u0014BO\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001bJ/\u0010#\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b'\u0010(J%\u0010-\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001e\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00101R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00102R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00103R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00105R\u0016\u00108\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00107¨\u0006:"}, m87232d2 = {"Lcom/clevertap/android/sdk/i;", "", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "", "Ll/tfb0;", "ctListeners", "Lcom/clevertap/android/sdk/i$c;", "callback", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcom/clevertap/android/sdk/f;", "cacheProvider", "Lcom/clevertap/android/sdk/i$d;", "systemPermissionInterface", "<init>", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ljava/util/List;Lcom/clevertap/android/sdk/i$c;Lkotlin/jvm/functions/Function1;Lcom/clevertap/android/sdk/i$d;)V", "", "isPermissionGranted", "", Constants.INAPP_DATA_TAG, "(Z)V", "c", "context", "b", "(Landroid/content/Context;)Z", "f", "(Landroid/content/Context;)V", "e", "Landroid/app/Activity;", "activity", "fallbackToSettings", "Lcom/clevertap/android/sdk/i$b;", "requestCallback", "alwaysRequestIfNotGranted", "j", "(Landroid/app/Activity;ZLcom/clevertap/android/sdk/i$b;Z)Z", RXScreenCaptureService.KEY_INDEX, "(Landroid/app/Activity;Z)V", "g", "(Landroid/app/Activity;)V", "", "requestCode", "", "grantResults", "h", "(Landroid/app/Activity;I[I)V", "a", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "Ljava/util/List;", "Lkotlin/jvm/functions/Function1;", "Lcom/clevertap/android/sdk/i$d;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "pushPermissionCallback", "Z", "isFromNotificationSettingsActivity", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class C1198i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CleverTapInstanceConfig config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final List<tfb0> ctListeners;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function1<Context, C1185f> cacheProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final d systemPermissionInterface;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final WeakReference<c> pushPermissionCallback;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isFromNotificationSettingsActivity;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.i$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Lcom/clevertap/android/sdk/i$a;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Lkotlin/Function1;", "Landroid/content/Context;", "Lcom/clevertap/android/sdk/f;", Constants.INAPP_DATA_TAG, "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)Lkotlin/jvm/functions/Function1;", "Lcom/clevertap/android/sdk/i$d;", "e", "()Lcom/clevertap/android/sdk/i$d;", "", "ANDROID_PERMISSION_STRING", "Ljava/lang/String;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.clevertap.android.sdk.i$a$a, reason: collision with other inner class name */
        @Metadata(m87231d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"com/clevertap/android/sdk/i$a$a", "Lcom/clevertap/android/sdk/i$d;", "Landroid/content/Context;", "context", "", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;)Z", "Landroid/app/Activity;", "activity", "", "a", "(Landroid/app/Activity;)V", "b", "c", "(Landroid/app/Activity;)Z", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
        public static final class C22663a implements d {
            @Override // com.clevertap.android.sdk.C1198i.d
            /* JADX INFO: renamed from: a */
            public void mo6116a(Activity activity) {
                activity.getClass();
                b50.m100287u(activity, new String[]{"android.permission.POST_NOTIFICATIONS"}, 102);
            }

            @Override // com.clevertap.android.sdk.C1198i.d
            /* JADX INFO: renamed from: b */
            public void mo6117b(Activity activity) {
                activity.getClass();
                Utils.m5927x(activity);
            }

            @Override // com.clevertap.android.sdk.C1198i.d
            /* JADX INFO: renamed from: c */
            public boolean mo6118c(Activity activity) {
                activity.getClass();
                return b50.m100290x(activity, "android.permission.POST_NOTIFICATIONS");
            }

            @Override // com.clevertap.android.sdk.C1198i.d
            /* JADX INFO: renamed from: d */
            public boolean mo6119d(Context context) {
                context.getClass();
                return e16.m114373a(context, "android.permission.POST_NOTIFICATIONS") == 0;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static C1185f m6111a(CleverTapInstanceConfig cleverTapInstanceConfig, Context context) {
            cleverTapInstanceConfig.getClass();
            context.getClass();
            return C1185f.INSTANCE.m6019c(context, cleverTapInstanceConfig);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public final Function1<Context, C1185f> m6114d(final CleverTapInstanceConfig config) {
            return new Function1() { // from class: l.sfb0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C1198i.Companion.m6111a(config, (Context) obj);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public final d m6115e() {
            return new C22663a();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.i$b */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"Lcom/clevertap/android/sdk/i$b;", "", "", "a", "()V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo6120a();
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.i$c */
    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/clevertap/android/sdk/i$c;", "", "", "isGranted", "", "B0", "(Z)V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public interface c {
        /* JADX INFO: renamed from: B0 */
        void mo5852B0(boolean isGranted);
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.i$d */
    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Lcom/clevertap/android/sdk/i$d;", "", "Landroid/content/Context;", "context", "", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;)Z", "Landroid/app/Activity;", "activity", "", "a", "(Landroid/app/Activity;)V", "b", "c", "(Landroid/app/Activity;)Z", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo6116a(@NotNull Activity activity);

        /* JADX INFO: renamed from: b */
        void mo6117b(@NotNull Activity activity);

        /* JADX INFO: renamed from: c */
        boolean mo6118c(@NotNull Activity activity);

        /* JADX INFO: renamed from: d */
        boolean mo6119d(@NotNull Context context);
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.i$e */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/clevertap/android/sdk/i$e", "Lcom/clevertap/android/sdk/i$b;", "", "a", "()V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class e implements b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Activity f5003b;

        public e(Activity activity) {
            this.f5003b = activity;
        }

        @Override // com.clevertap.android.sdk.C1198i.b
        /* JADX INFO: renamed from: a */
        public void mo6120a() {
            C1198i.this.systemPermissionInterface.mo6116a(this.f5003b);
        }
    }

    public /* synthetic */ C1198i(CleverTapInstanceConfig cleverTapInstanceConfig, List list, c cVar, Function1 function1, d dVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cleverTapInstanceConfig, list, (i & 4) != 0 ? null : cVar, (i & 8) != 0 ? INSTANCE.m6114d(cleverTapInstanceConfig) : function1, (i & 16) != 0 ? INSTANCE.m6115e() : dVar);
    }

    /* JADX INFO: renamed from: c */
    private final void m6101c(boolean isPermissionGranted) {
        List<tfb0> list = this.ctListeners;
        if (list != null) {
            for (tfb0 tfb0Var : list) {
                if (tfb0Var != null) {
                    tfb0Var.m188673a(isPermissionGranted);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m6102d(boolean isPermissionGranted) {
        m6101c(isPermissionGranted);
        c cVar = this.pushPermissionCallback.get();
        if (cVar != null) {
            cVar.mo5852B0(isPermissionGranted);
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ boolean m6103k(C1198i c1198i, Activity activity, boolean z, b bVar, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        return c1198i.m6110j(activity, z, bVar, z2);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6104b(@NotNull Context context) {
        context.getClass();
        return this.systemPermissionInterface.mo6119d(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m6105e(@NotNull Context context) {
        context.getClass();
        m6101c(m6104b(context));
    }

    /* JADX INFO: renamed from: f */
    public final void m6106f(@NotNull Context context) {
        context.getClass();
        m6102d(m6104b(context));
    }

    /* JADX INFO: renamed from: g */
    public final void m6107g(@NotNull Activity activity) {
        activity.getClass();
        if (this.isFromNotificationSettingsActivity) {
            this.isFromNotificationSettingsActivity = false;
            if (Build.VERSION.SDK_INT >= 33) {
                m6102d(m6104b(activity));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m6108h(@NotNull Activity activity, int requestCode, @NotNull int[] grantResults) {
        activity.getClass();
        grantResults.getClass();
        C1185f c1185fInvoke = this.cacheProvider.invoke(activity);
        boolean z = false;
        c1185fInvoke.m6015f(false);
        c1185fInvoke.m6016g(activity, this.config);
        if (requestCode == 102) {
            Integer numFirstOrNull = ArraysKt.firstOrNull(grantResults);
            if (numFirstOrNull != null && numFirstOrNull.intValue() == 0) {
                z = true;
            }
            m6102d(z);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m6109i(@NotNull Activity activity, boolean fallbackToSettings) {
        activity.getClass();
        m6103k(this, activity, fallbackToSettings, new e(activity), false, 8, null);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m6110j(@NotNull Activity activity, boolean fallbackToSettings, @NotNull b requestCallback, boolean alwaysRequestIfNotGranted) {
        activity.getClass();
        requestCallback.getClass();
        if (m6104b(activity)) {
            m6102d(true);
            return false;
        }
        boolean zM6014e = this.cacheProvider.invoke(activity).m6014e();
        boolean zMo6118c = this.systemPermissionInterface.mo6118c(activity);
        if (alwaysRequestIfNotGranted || zM6014e || zMo6118c) {
            requestCallback.mo6120a();
            return true;
        }
        if (!fallbackToSettings) {
            m6102d(false);
            return false;
        }
        this.isFromNotificationSettingsActivity = true;
        this.systemPermissionInterface.mo6117b(activity);
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public C1198i(@NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @Nullable List<? extends tfb0> list, @Nullable c cVar) {
        this(cleverTapInstanceConfig, list, cVar, null, null, 24, null);
        cleverTapInstanceConfig.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public C1198i(@NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @Nullable List<? extends tfb0> list, @Nullable c cVar, @NotNull Function1<? super Context, C1185f> function1, @NotNull d dVar) {
        cleverTapInstanceConfig.getClass();
        function1.getClass();
        dVar.getClass();
        this.config = cleverTapInstanceConfig;
        this.ctListeners = list;
        this.cacheProvider = function1;
        this.systemPermissionInterface = dVar;
        this.pushPermissionCallback = new WeakReference<>(cVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public C1198i(@NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @Nullable List<? extends tfb0> list) {
        this(cleverTapInstanceConfig, list, null, null, null, 28, null);
        cleverTapInstanceConfig.getClass();
    }
}
