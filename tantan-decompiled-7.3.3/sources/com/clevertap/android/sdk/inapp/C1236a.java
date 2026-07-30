package com.clevertap.android.sdk.inapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.C1221i;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.inapp.C1236a;
import com.facebook.AuthenticationTokenClaims;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bu9;
import p153l.de80;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001*B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013JU\u0010\u001e\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u001428\u0010\u001d\u001a4\u0012*\u0012(\u0018\u00010\u0018j\u0013\u0018\u0001`\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00150\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000f¢\u0006\u0004\b \u0010\u0013J\r\u0010!\u001a\u00020\u0015¢\u0006\u0004\b!\u0010\"J\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010$J'\u0010(\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000f2\b\b\u0002\u0010%\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010.R\u001c\u00102\u001a\n 0*\u0004\u0018\u00010/0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00101¨\u00063"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/a;", "", "Landroid/content/Context;", "context", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "ctConfig", "Lcom/clevertap/android/sdk/i;", "pushPermissionHandler", "Ll/de80;", "playStoreReviewHandler", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Lcom/clevertap/android/sdk/i;Ll/de80;)V", "", "url", "launchContext", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Landroid/content/Context;)Z", "c", "()Z", "Lkotlin/Function0;", "", "onCompleted", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "e", "onError", Constants.INAPP_DATA_TAG, "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "b", "h", "()V", "fallbackToSettings", "(Z)Z", "alwaysRequestIfNotGranted", "Lcom/clevertap/android/sdk/inapp/a$a;", "presenter", "f", "(ZZLcom/clevertap/android/sdk/inapp/a$a;)Z", "a", "Landroid/content/Context;", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "Lcom/clevertap/android/sdk/i;", "Ll/de80;", "Lcom/clevertap/android/sdk/Logger;", "kotlin.jvm.PlatformType", "Lcom/clevertap/android/sdk/Logger;", "logger", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class C1236a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CleverTapInstanceConfig ctConfig;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final C1221i pushPermissionHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final de80 playStoreReviewHandler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Logger logger;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.a$a */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/a$a;", "", "Landroid/app/Activity;", "activity", "", "a", "(Landroid/app/Activity;)V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo6339a(@NotNull Activity activity);
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.a$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/clevertap/android/sdk/inapp/a$b", "Lcom/clevertap/android/sdk/i$b;", "", "a", "()V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class b implements C1221i.b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ a f5085a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Activity f5086b;

        public b(a aVar, Activity activity) {
            this.f5085a = aVar;
            this.f5086b = activity;
        }

        @Override // com.clevertap.android.sdk.C1221i.b
        /* JADX INFO: renamed from: a */
        public void mo6174a() {
            this.f5085a.mo6339a(this.f5086b);
        }
    }

    public C1236a(@NotNull Context context, @NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @NotNull C1221i c1221i, @NotNull de80 de80Var) {
        context.getClass();
        cleverTapInstanceConfig.getClass();
        c1221i.getClass();
        de80Var.getClass();
        this.context = context;
        this.ctConfig = cleverTapInstanceConfig;
        this.pushPermissionHandler = c1221i;
        this.playStoreReviewHandler = de80Var;
        this.logger = cleverTapInstanceConfig.getLogger();
    }

    /* JADX INFO: renamed from: a */
    public static void m6329a(boolean z, C1236a c1236a, Activity activity) {
        c1236a.getClass();
        activity.getClass();
        if (activity instanceof InAppNotificationActivity) {
            ((InAppNotificationActivity) activity).m5917Y0(z);
        } else {
            InAppNotificationActivity.m5902T0(activity, c1236a.ctConfig, z);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ boolean m6330g(C1236a c1236a, boolean z, boolean z2, a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        return c1236a.m6336f(z, z2, aVar);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ boolean m6331j(C1236a c1236a, String str, Context context, int i, Object obj) {
        if ((i & 2) != 0) {
            context = null;
        }
        return c1236a.m6338i(str, context);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6332b() {
        return this.pushPermissionHandler.m6158b(this.context);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6333c() {
        return this.playStoreReviewHandler.m115400e();
    }

    /* JADX INFO: renamed from: d */
    public final void m6334d(@NotNull Function0<Unit> onCompleted, @NotNull Function1<? super Exception, Unit> onError) {
        onCompleted.getClass();
        onError.getClass();
        de80 de80Var = this.playStoreReviewHandler;
        Context context = this.context;
        Logger logger = this.logger;
        logger.getClass();
        de80Var.m115401f(context, logger, onCompleted, onError);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6335e(final boolean fallbackToSettings) {
        return m6330g(this, fallbackToSettings, false, new a() { // from class: l.bqm
            @Override // com.clevertap.android.sdk.inapp.C1236a.a
            /* JADX INFO: renamed from: a */
            public final void mo6339a(Activity activity) {
                C1236a.m6329a(fallbackToSettings, this, activity);
            }
        }, 2, null);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6336f(boolean fallbackToSettings, boolean alwaysRequestIfNotGranted, @NotNull a presenter) {
        presenter.getClass();
        Activity activityM106436i = bu9.m106436i();
        if (activityM106436i != null) {
            return this.pushPermissionHandler.m6164j(activityM106436i, fallbackToSettings, new b(presenter, activityM106436i), alwaysRequestIfNotGranted);
        }
        this.logger.debug("CurrentActivity reference is null. SDK can't prompt the user with Notification Permission! Ensure the following things:\n1. Calling ActivityLifecycleCallback.register(this) in your custom application class before super.onCreate().\n   Alternatively, register CleverTap SDK's Application class in the manifest using com.clevertap.android.sdk.Application.\n2. Ensure that the promptPushPrimer() API is called from the onResume() lifecycle method, not onCreate().");
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m6337h() {
        this.pushPermissionHandler.m6160f(this.context);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m6338i(@NotNull String url, @Nullable Context launchContext) {
        url.getClass();
        try {
            Uri uri = Uri.parse(C15493d.m94370F(C15493d.m94370F(url, SignParameters.NEW_LINE, "", false, 4, null), "\r", "", false, 4, null));
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Bundle bundle = new Bundle();
            Set<String> set = queryParameterNames;
            if (set != null && !set.isEmpty()) {
                for (String str : queryParameterNames) {
                    bundle.putString(str, uri.getQueryParameter(str));
                }
            }
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!bundle.isEmpty()) {
                intent.putExtras(bundle);
            }
            if (launchContext == null) {
                intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                launchContext = this.context;
            }
            Utils.setPackageNameFromResolveInfoList(launchContext, intent);
            launchContext.startActivity(intent);
            return true;
        } catch (Exception unused) {
            if (C15493d.m94374J(url, Constants.WZRK_URL_SCHEMA, false, 2, null)) {
                return true;
            }
            this.logger.debug("No activity found to open url: " + url);
            return false;
        }
    }

    public /* synthetic */ C1236a(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, C1221i c1221i, de80 de80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, cleverTapInstanceConfig, c1221i, (i & 8) != 0 ? new de80() : de80Var);
    }
}
