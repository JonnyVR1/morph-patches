package com.google.firebase.analytics.ktx;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.ktx.FirebaseKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a1\u0010\u000e\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u0013¢\u0006\u0002\b\u0015H\u0087\bø\u0001\u0000\u001a+\u0010\u0016\u001a\u00020\u000f*\u00020\u00012\u0019\b\u0004\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u0013¢\u0006\u0002\b\u0015H\u0087\bø\u0001\u0000\"\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\"\u0015\u0010\n\u001a\u00020\u0001*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, m87232d2 = {"ANALYTICS", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "getANALYTICS", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "setANALYTICS", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "LOCK", "", "getLOCK", "()Ljava/lang/Object;", "analytics", "Lcom/google/firebase/ktx/Firebase;", "getAnalytics", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/analytics/FirebaseAnalytics;", "logEvent", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "block", "Lkotlin/Function1;", "Lcom/google/firebase/analytics/ktx/ParametersBuilder;", "Lkotlin/ExtensionFunctionType;", "setConsent", "Lcom/google/firebase/analytics/ktx/ConsentBuilder;", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, m87233k = 2, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class AnalyticsKt {

    @Nullable
    private static volatile FirebaseAnalytics zza;

    @NotNull
    private static final Object zzb = new Object();

    @androidx.annotation.Nullable
    public static final FirebaseAnalytics getANALYTICS() {
        return zza;
    }

    @NotNull
    public static final FirebaseAnalytics getAnalytics(@NonNull Firebase firebase) {
        firebase.getClass();
        if (zza == null) {
            synchronized (zzb) {
                if (zza == null) {
                    zza = FirebaseAnalytics.getInstance(FirebaseKt.getApp(Firebase.INSTANCE).getApplicationContext());
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = zza;
        firebaseAnalytics.getClass();
        return firebaseAnalytics;
    }

    @NotNull
    public static final Object getLOCK() {
        return zzb;
    }

    @Deprecated
    public static final void logEvent(@NonNull FirebaseAnalytics firebaseAnalytics, @NonNull String str, @NonNull Function1<? super ParametersBuilder, Unit> function1) {
        firebaseAnalytics.getClass();
        str.getClass();
        function1.getClass();
        ParametersBuilder parametersBuilder = new ParametersBuilder();
        function1.invoke(parametersBuilder);
        firebaseAnalytics.logEvent(str, parametersBuilder.getZza());
    }

    public static final void setANALYTICS(@Nullable FirebaseAnalytics firebaseAnalytics) {
        zza = firebaseAnalytics;
    }

    @Deprecated
    public static final void setConsent(@NonNull FirebaseAnalytics firebaseAnalytics, @NonNull Function1<? super ConsentBuilder, Unit> function1) {
        firebaseAnalytics.getClass();
        function1.getClass();
        ConsentBuilder consentBuilder = new ConsentBuilder();
        function1.invoke(consentBuilder);
        firebaseAnalytics.setConsent(consentBuilder.asMap());
    }
}
