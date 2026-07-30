package com.facebook.appevents.iap;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.appevents.iap.C1582b;
import com.facebook.appevents.integrity.ProtectedModeManager;
import com.facebook.internal.FeatureManager;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import p153l.ztb;

/* JADX INFO: renamed from: com.facebook.appevents.iap.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m88121d2 = {"Lcom/facebook/appevents/iap/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "billingClientVersion", "", "e", "(Landroid/content/Context;Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;)V", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, Constants.INAPP_DATA_TAG, "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;Ljava/lang/String;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getFailedToCreateWrapper", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "failedToCreateWrapper", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C1582b {

    @NotNull
    public static final C1582b INSTANCE = new C1582b();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean failedToCreateWrapper = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static void m7884a(Ref.ObjectRef objectRef, final InAppPurchaseUtils.BillingClientVersion billingClientVersion, final Context context) {
        if (ztb.m221490d(C1582b.class)) {
            return;
        }
        try {
            objectRef.getClass();
            billingClientVersion.getClass();
            context.getClass();
            ((InterfaceC1583c) objectRef.element).mo7889a(InAppPurchaseUtils.IAPProductType.SUBS, new Runnable() { // from class: l.vrm
                @Override // java.lang.Runnable
                public final void run() {
                    C1582b.m7886c(billingClientVersion, context);
                }
            });
        } catch (Throwable th) {
            ztb.m221488b(th, C1582b.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7885b(InAppPurchaseUtils.BillingClientVersion billingClientVersion, Context context) {
        if (ztb.m221490d(C1582b.class)) {
            return;
        }
        try {
            billingClientVersion.getClass();
            context.getClass();
            C1582b c1582b = INSTANCE;
            String packageName = context.getPackageName();
            packageName.getClass();
            c1582b.m7888d(billingClientVersion, packageName);
        } catch (Throwable th) {
            ztb.m221488b(th, C1582b.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m7886c(InAppPurchaseUtils.BillingClientVersion billingClientVersion, Context context) {
        if (ztb.m221490d(C1582b.class)) {
            return;
        }
        try {
            billingClientVersion.getClass();
            context.getClass();
            C1582b c1582b = INSTANCE;
            String packageName = context.getPackageName();
            packageName.getClass();
            c1582b.m7888d(billingClientVersion, packageName);
        } catch (Throwable th) {
            ztb.m221488b(th, C1582b.class);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, com.facebook.appevents.iap.e] */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, com.facebook.appevents.iap.d] */
    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final synchronized void m7887e(@NotNull final Context context, @NotNull final InAppPurchaseUtils.BillingClientVersion billingClientVersion) {
        if (ztb.m221490d(C1582b.class)) {
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
                objectRef.element = C1584d.INSTANCE.m7911d(context);
            } else if (billingClientVersion == InAppPurchaseUtils.BillingClientVersion.V5_V7) {
                objectRef.element = C1585e.INSTANCE.m7945d(context);
            }
            if (objectRef.element == 0) {
                atomicBoolean.set(true);
                return;
            }
            if (!FeatureManager.m8733g(FeatureManager.Feature.AndroidIAPSubscriptionAutoLogging) || (ProtectedModeManager.m7972d() && billingClientVersion != billingClientVersion2)) {
                ((InterfaceC1583c) objectRef.element).mo7889a(InAppPurchaseUtils.IAPProductType.INAPP, new Runnable() { // from class: l.urm
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1582b.m7885b(billingClientVersion, context);
                    }
                });
            } else {
                ((InterfaceC1583c) objectRef.element).mo7889a(InAppPurchaseUtils.IAPProductType.INAPP, new Runnable() { // from class: l.trm
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1582b.m7884a(objectRef, billingClientVersion, context);
                    }
                });
            }
        } catch (Throwable th) {
            ztb.m221488b(th, C1582b.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7888d(InAppPurchaseUtils.BillingClientVersion billingClientVersion, String packageName) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            boolean zM7950e = C1586f.m7950e();
            if (zM7950e) {
                C1586f.m7951g();
            }
            if (billingClientVersion == InAppPurchaseUtils.BillingClientVersion.V2_V4) {
                C1584d.Companion companion = C1584d.INSTANCE;
                C1586f.m7949d(companion.m7910c(), companion.m7912e(), false, packageName, billingClientVersion, zM7950e);
                C1586f.m7949d(companion.m7913f(), companion.m7912e(), true, packageName, billingClientVersion, zM7950e);
                companion.m7910c().clear();
                companion.m7913f().clear();
            } else {
                C1585e.Companion companion2 = C1585e.INSTANCE;
                C1586f.m7949d(companion2.m7944c(), companion2.m7946e(), false, packageName, billingClientVersion, zM7950e);
                C1586f.m7949d(companion2.m7947f(), companion2.m7946e(), true, packageName, billingClientVersion, zM7950e);
                companion2.m7944c().clear();
                companion2.m7947f().clear();
            }
            if (zM7950e) {
                C1586f.m7952h();
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }
}
