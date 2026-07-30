package com.facebook.appevents.iap;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.appevents.iap.C1559b;
import com.facebook.appevents.integrity.ProtectedModeManager;
import com.facebook.internal.FeatureManager;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import p149l.lsb;

/* JADX INFO: renamed from: com.facebook.appevents.iap.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m87232d2 = {"Lcom/facebook/appevents/iap/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "billingClientVersion", "", "e", "(Landroid/content/Context;Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;)V", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, Constants.INAPP_DATA_TAG, "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;Ljava/lang/String;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getFailedToCreateWrapper", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "failedToCreateWrapper", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C1559b {

    @NotNull
    public static final C1559b INSTANCE = new C1559b();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean failedToCreateWrapper = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static void m7830a(Ref.ObjectRef objectRef, final InAppPurchaseUtils.BillingClientVersion billingClientVersion, final Context context) {
        if (lsb.m151554d(C1559b.class)) {
            return;
        }
        try {
            objectRef.getClass();
            billingClientVersion.getClass();
            context.getClass();
            ((InterfaceC1560c) objectRef.element).mo7835a(InAppPurchaseUtils.IAPProductType.SUBS, new Runnable() { // from class: l.tpm
                @Override // java.lang.Runnable
                public final void run() {
                    C1559b.m7832c(billingClientVersion, context);
                }
            });
        } catch (Throwable th) {
            lsb.m151552b(th, C1559b.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7831b(InAppPurchaseUtils.BillingClientVersion billingClientVersion, Context context) {
        if (lsb.m151554d(C1559b.class)) {
            return;
        }
        try {
            billingClientVersion.getClass();
            context.getClass();
            C1559b c1559b = INSTANCE;
            String packageName = context.getPackageName();
            packageName.getClass();
            c1559b.m7834d(billingClientVersion, packageName);
        } catch (Throwable th) {
            lsb.m151552b(th, C1559b.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m7832c(InAppPurchaseUtils.BillingClientVersion billingClientVersion, Context context) {
        if (lsb.m151554d(C1559b.class)) {
            return;
        }
        try {
            billingClientVersion.getClass();
            context.getClass();
            C1559b c1559b = INSTANCE;
            String packageName = context.getPackageName();
            packageName.getClass();
            c1559b.m7834d(billingClientVersion, packageName);
        } catch (Throwable th) {
            lsb.m151552b(th, C1559b.class);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, com.facebook.appevents.iap.e] */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, com.facebook.appevents.iap.d] */
    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final synchronized void m7833e(@NotNull final Context context, @NotNull final InAppPurchaseUtils.BillingClientVersion billingClientVersion) {
        if (lsb.m151554d(C1559b.class)) {
            return;
        }
        try {
            context.getClass();
            billingClientVersion.getClass();
            AtomicBoolean atomicBoolean = failedToCreateWrapper;
            if (atomicBoolean.get()) {
                return;
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            InAppPurchaseUtils.BillingClientVersion billingClientVersion2 = InAppPurchaseUtils.BillingClientVersion.V2_V4;
            if (billingClientVersion == billingClientVersion2) {
                objectRef.element = C1561d.INSTANCE.m7857d(context);
            } else if (billingClientVersion == InAppPurchaseUtils.BillingClientVersion.V5_V7) {
                objectRef.element = C1562e.INSTANCE.m7891d(context);
            }
            if (objectRef.element == 0) {
                atomicBoolean.set(true);
                return;
            }
            if (!FeatureManager.m8679g(FeatureManager.Feature.AndroidIAPSubscriptionAutoLogging) || (ProtectedModeManager.m7918d() && billingClientVersion != billingClientVersion2)) {
                ((InterfaceC1560c) objectRef.element).mo7835a(InAppPurchaseUtils.IAPProductType.INAPP, new Runnable() { // from class: l.spm
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1559b.m7831b(billingClientVersion, context);
                    }
                });
            } else {
                ((InterfaceC1560c) objectRef.element).mo7835a(InAppPurchaseUtils.IAPProductType.INAPP, new Runnable() { // from class: l.rpm
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1559b.m7830a(objectRef, billingClientVersion, context);
                    }
                });
            }
        } catch (Throwable th) {
            lsb.m151552b(th, C1559b.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7834d(InAppPurchaseUtils.BillingClientVersion billingClientVersion, String packageName) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            boolean zM7896e = C1563f.m7896e();
            if (zM7896e) {
                C1563f.m7897g();
            }
            if (billingClientVersion == InAppPurchaseUtils.BillingClientVersion.V2_V4) {
                C1561d.Companion companion = C1561d.INSTANCE;
                C1563f.m7895d(companion.m7856c(), companion.m7858e(), false, packageName, billingClientVersion, zM7896e);
                C1563f.m7895d(companion.m7859f(), companion.m7858e(), true, packageName, billingClientVersion, zM7896e);
                companion.m7856c().clear();
                companion.m7859f().clear();
            } else {
                C1562e.Companion companion2 = C1562e.INSTANCE;
                C1563f.m7895d(companion2.m7890c(), companion2.m7892e(), false, packageName, billingClientVersion, zM7896e);
                C1563f.m7895d(companion2.m7893f(), companion2.m7892e(), true, packageName, billingClientVersion, zM7896e);
                companion2.m7890c().clear();
                companion2.m7893f().clear();
            }
            if (zM7896e) {
                C1563f.m7898h();
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }
}
