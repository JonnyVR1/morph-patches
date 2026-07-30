package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.AccessToken;
import com.facebook.C1600c;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.facebook.appevents.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 12\u00020\u0001:\u0001.B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0013\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\u000bB%\b\u0016\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0004\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0018\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010 \u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\"\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b#\u0010$JA\u0010%\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b'\u0010(J+\u0010)\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b+\u0010\u0015J\u0015\u0010,\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0013¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00100¨\u00062"}, m88121d2 = {"Lcom/facebook/appevents/f;", "", "Lcom/facebook/appevents/e;", "loggerImpl", "<init>", "(Lcom/facebook/appevents/e;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "", "applicationId", "(Landroid/content/Context;Ljava/lang/String;)V", "activityName", "Lcom/facebook/AccessToken;", "accessToken", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "eventName", "Landroid/os/Bundle;", "parameters", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Landroid/os/Bundle;)V", "", "valueToSum", "c", "(Ljava/lang/String;DLandroid/os/Bundle;)V", "Ljava/math/BigDecimal;", "purchaseAmount", "Ljava/util/Currency;", FirebaseAnalytics.Param.CURRENCY, "Lcom/facebook/appevents/g;", "operationalData", "j", "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;Lcom/facebook/appevents/g;)V", "buttonText", "e", "(Ljava/lang/String;Ljava/lang/String;)V", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;Lcom/facebook/appevents/g;)V", "f", "(Ljava/lang/String;)V", "h", "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V", "g", "b", "(Landroid/os/Bundle;)V", "a", "()V", "Lcom/facebook/appevents/e;", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C1577f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C1576e loggerImpl;

    /* JADX INFO: renamed from: com.facebook.appevents.f$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u00152\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m88121d2 = {"Lcom/facebook/appevents/f$a;", "", "<init>", "()V", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", Constants.INAPP_DATA_TAG, "()Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "Ljava/util/concurrent/Executor;", "c", "()Ljava/util/concurrent/Executor;", "", "e", "()Ljava/lang/String;", "", "ud", "", "f", "(Ljava/util/Map;)V", "Landroid/content/Context;", "context", "applicationId", "Lcom/facebook/appevents/f;", "a", "(Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/appevents/f;", "activityName", "Lcom/facebook/AccessToken;", "accessToken", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/AccessToken;)Lcom/facebook/appevents/f;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        @JvmOverloads
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: a */
        public final C1577f m7835a(@Nullable Context context, @Nullable String applicationId) {
            return new C1577f(context, applicationId);
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @NotNull
        /* JADX INFO: renamed from: b */
        public final C1577f m7836b(@NotNull String activityName, @Nullable String applicationId, @Nullable AccessToken accessToken) {
            activityName.getClass();
            return new C1577f(activityName, applicationId, accessToken);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public final Executor m7837c() {
            return C1576e.INSTANCE.m7813i();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: d */
        public final AppEventsLogger.FlushBehavior m7838d() {
            return C1576e.INSTANCE.m7815k();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: e */
        public final String m7839e() {
            return C1576e.INSTANCE.m7817m();
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.GROUP_ID})
        /* JADX INFO: renamed from: f */
        public final void m7840f(@NotNull Map<String, String> ud) {
            ud.getClass();
            C1580h.m7864g(ud);
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1577f(@NotNull String str, @Nullable String str2, @Nullable AccessToken accessToken) {
        this(new C1576e(str, str2, accessToken));
        str.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m7825a() {
        this.loggerImpl.m7796j();
    }

    /* JADX INFO: renamed from: b */
    public final void m7826b(@NotNull Bundle parameters) {
        parameters.getClass();
        if (((parameters.getInt("previous") & 2) != 0) || C1600c.m8105p()) {
            this.loggerImpl.m7801p("fb_sdk_settings_changed", null, parameters);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7827c(@Nullable String eventName, double valueToSum, @Nullable Bundle parameters) {
        if (C1600c.m8105p()) {
            this.loggerImpl.m7797k(eventName, valueToSum, parameters);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7828d(@Nullable String eventName, @Nullable Bundle parameters) {
        if (C1600c.m8105p()) {
            this.loggerImpl.m7798l(eventName, parameters);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7829e(@Nullable String eventName, @Nullable String buttonText) {
        this.loggerImpl.m7800o(eventName, buttonText);
    }

    /* JADX INFO: renamed from: f */
    public final void m7830f(@Nullable String eventName) {
        if (C1600c.m8105p()) {
            this.loggerImpl.m7801p(eventName, null, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7831g(@Nullable String eventName, @Nullable Bundle parameters) {
        if (C1600c.m8105p()) {
            this.loggerImpl.m7801p(eventName, null, parameters);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7832h(@Nullable String eventName, @Nullable Double valueToSum, @Nullable Bundle parameters) {
        if (C1600c.m8105p()) {
            this.loggerImpl.m7801p(eventName, valueToSum, parameters);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7833i(@Nullable String eventName, @Nullable BigDecimal purchaseAmount, @Nullable Currency currency, @Nullable Bundle parameters, @Nullable C1578g operationalData) {
        if (C1600c.m8105p()) {
            this.loggerImpl.m7802q(eventName, purchaseAmount, currency, parameters, operationalData);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m7834j(@Nullable BigDecimal purchaseAmount, @Nullable Currency currency, @Nullable Bundle parameters, @Nullable C1578g operationalData) {
        if (C1600c.m8105p()) {
            this.loggerImpl.m7804s(purchaseAmount, currency, parameters, operationalData);
        }
    }

    public C1577f(@Nullable Context context) {
        this(new C1576e(context, (String) null, (AccessToken) null));
    }

    public C1577f(@Nullable Context context, @Nullable String str) {
        this(new C1576e(context, str, (AccessToken) null));
    }

    public C1577f(@NotNull C1576e c1576e) {
        c1576e.getClass();
        this.loggerImpl = c1576e;
    }
}
