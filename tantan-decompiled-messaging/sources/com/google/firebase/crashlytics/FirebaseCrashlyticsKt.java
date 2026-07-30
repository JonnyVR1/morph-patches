package com.google.firebase.crashlytics;

import com.google.firebase.Firebase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0005\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\f\u001a#\u0010\r\u001a\u00020\u0006*\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\f\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000e"}, m87232d2 = {"crashlytics", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "Lcom/google/firebase/Firebase;", "getCrashlytics", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "recordException", "", "throwable", "", "init", "Lkotlin/Function1;", "Lcom/google/firebase/crashlytics/KeyValueBuilder;", "Lkotlin/ExtensionFunctionType;", "setCustomKeys", "com.google.firebase-firebase-crashlytics"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class FirebaseCrashlyticsKt {
    @NotNull
    public static final FirebaseCrashlytics getCrashlytics(@NotNull Firebase firebase) {
        firebase.getClass();
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        firebaseCrashlytics.getClass();
        return firebaseCrashlytics;
    }

    public static final void recordException(@NotNull FirebaseCrashlytics firebaseCrashlytics, @NotNull Throwable th, @NotNull Function1<? super KeyValueBuilder, Unit> function1) {
        firebaseCrashlytics.getClass();
        th.getClass();
        function1.getClass();
        KeyValueBuilder keyValueBuilder = new KeyValueBuilder();
        function1.invoke(keyValueBuilder);
        firebaseCrashlytics.recordException(th, keyValueBuilder.build$com_google_firebase_firebase_crashlytics());
    }

    public static final void setCustomKeys(@NotNull FirebaseCrashlytics firebaseCrashlytics, @NotNull Function1<? super KeyValueBuilder, Unit> function1) {
        firebaseCrashlytics.getClass();
        function1.getClass();
        KeyValueBuilder keyValueBuilder = new KeyValueBuilder();
        function1.invoke(keyValueBuilder);
        firebaseCrashlytics.setCustomKeys(keyValueBuilder.build$com_google_firebase_firebase_crashlytics());
    }
}
