package com.facebook.appevents.iap;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ztb;

/* JADX INFO: renamed from: com.facebook.appevents.iap.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B?\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\f2\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001c"}, m88121d2 = {"Lcom/facebook/appevents/iap/h;", "", "Ljava/lang/Class;", "skuDetailsParamsClazz", "builderClazz", "Ljava/lang/reflect/Method;", "newBuilderMethod", "setTypeMethod", "setSkusListMethod", "buildMethod", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;", "productType", "", "", "skuIDs", "c", "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;Ljava/util/List;)Ljava/lang/Object;", "a", "Ljava/lang/Class;", Constants.INAPP_DATA_TAG, "()Ljava/lang/Class;", "b", "Ljava/lang/reflect/Method;", "e", "f", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C1588h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    @Nullable
    public static C1588h f6149g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Class<?> skuDetailsParamsClazz;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Class<?> builderClazz;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Method newBuilderMethod;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Method setTypeMethod;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Method setSkusListMethod;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Method buildMethod;

    /* JADX INFO: renamed from: com.facebook.appevents.iap.h$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Lcom/facebook/appevents/iap/h$a;", "", "<init>", "()V", "Lcom/facebook/appevents/iap/h;", "b", "()Lcom/facebook/appevents/iap/h;", "a", "", "CLASSNAME_SKU_DETAILS_PARAMS", "Ljava/lang/String;", "CLASSNAME_SKU_DETAILS_PARAMS_BUILDER", "METHOD_BUILD", "METHOD_NEW_BUILDER", "METHOD_SET_SKU_LIST", "METHOD_SET_TYPE", "instance", "Lcom/facebook/appevents/iap/h;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1588h m7969a() {
            Class<?> clsM7869a = InAppPurchaseUtils.m7869a("com.android.billingclient.api.SkuDetailsParams");
            Class<?> clsM7869a2 = InAppPurchaseUtils.m7869a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (clsM7869a == null || clsM7869a2 == null) {
                return null;
            }
            Method methodM7872d = InAppPurchaseUtils.m7872d(clsM7869a, "newBuilder", new Class[0]);
            Method methodM7872d2 = InAppPurchaseUtils.m7872d(clsM7869a2, "setType", String.class);
            Method methodM7872d3 = InAppPurchaseUtils.m7872d(clsM7869a2, "setSkusList", List.class);
            Method methodM7872d4 = InAppPurchaseUtils.m7872d(clsM7869a2, "build", new Class[0]);
            if (methodM7872d == null || methodM7872d2 == null || methodM7872d3 == null || methodM7872d4 == null) {
                return null;
            }
            C1588h.m7966b(new C1588h(clsM7869a, clsM7869a2, methodM7872d, methodM7872d2, methodM7872d3, methodM7872d4));
            return C1588h.m7965a();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: b */
        public final synchronized C1588h m7970b() {
            C1588h c1588hM7965a;
            c1588hM7965a = C1588h.m7965a();
            if (c1588hM7965a == null) {
                c1588hM7965a = m7969a();
            }
            return c1588hM7965a;
        }

        public Companion() {
        }
    }

    public C1588h(@NotNull Class<?> cls, @NotNull Class<?> cls2, @NotNull Method method, @NotNull Method method2, @NotNull Method method3, @NotNull Method method4) {
        cls.getClass();
        cls2.getClass();
        method.getClass();
        method2.getClass();
        method3.getClass();
        method4.getClass();
        this.skuDetailsParamsClazz = cls;
        this.builderClazz = cls2;
        this.newBuilderMethod = method;
        this.setTypeMethod = method2;
        this.setSkusListMethod = method3;
        this.buildMethod = method4;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C1588h m7965a() {
        if (ztb.m221490d(C1588h.class)) {
            return null;
        }
        try {
            return f6149g;
        } catch (Throwable th) {
            ztb.m221488b(th, C1588h.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ void m7966b(C1588h c1588h) {
        if (ztb.m221490d(C1588h.class)) {
            return;
        }
        try {
            f6149g = c1588h;
        } catch (Throwable th) {
            ztb.m221488b(th, C1588h.class);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m7967c(@NotNull InAppPurchaseUtils.IAPProductType productType, @Nullable List<String> skuIDs) {
        Object objM7873e;
        Object objM7873e2;
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            productType.getClass();
            Object objM7873e3 = InAppPurchaseUtils.m7873e(this.skuDetailsParamsClazz, this.newBuilderMethod, null, new Object[0]);
            if (objM7873e3 == null || (objM7873e = InAppPurchaseUtils.m7873e(this.builderClazz, this.setTypeMethod, objM7873e3, productType.getType())) == null || (objM7873e2 = InAppPurchaseUtils.m7873e(this.builderClazz, this.setSkusListMethod, objM7873e, skuIDs)) == null) {
                return null;
            }
            return InAppPurchaseUtils.m7873e(this.builderClazz, this.buildMethod, objM7873e2, new Object[0]);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Class<?> m7968d() {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            return this.skuDetailsParamsClazz;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }
}
