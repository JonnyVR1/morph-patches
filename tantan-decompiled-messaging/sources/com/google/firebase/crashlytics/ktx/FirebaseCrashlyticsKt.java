package com.google.firebase.crashlytics.ktx;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.ktx.Firebase;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0005\u001a\u00020\u0006*\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\nH\u0007\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, m87232d2 = {"crashlytics", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "Lcom/google/firebase/ktx/Firebase;", "getCrashlytics", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "setCustomKeys", "", "init", "Lkotlin/Function1;", "Lcom/google/firebase/crashlytics/ktx/KeyValueBuilder;", "Lkotlin/ExtensionFunctionType;", "com.google.firebase-firebase-crashlytics"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class FirebaseCrashlyticsKt {
    @NotNull
    public static final FirebaseCrashlytics getCrashlytics(@NotNull Firebase firebase) {
        firebase.getClass();
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        firebaseCrashlytics.getClass();
        return firebaseCrashlytics;
    }

    @Deprecated
    public static final void setCustomKeys(@NotNull FirebaseCrashlytics firebaseCrashlytics, @NotNull Function1<? super KeyValueBuilder, Unit> function1) {
        firebaseCrashlytics.getClass();
        function1.getClass();
        function1.invoke(new KeyValueBuilder(firebaseCrashlytics));
    }
}
