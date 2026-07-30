package com.google.firebase.crashlytics;

import com.clevertap.android.sdk.Constants;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0010¢\u0006\u0002\u0010\u0005B\u0019\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0011J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0012J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0013J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0014J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m87232d2 = {"Lcom/google/firebase/crashlytics/KeyValueBuilder;", "", "crashlytics", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;)V", "()V", "builder", "Lcom/google/firebase/crashlytics/CustomKeysAndValues$Builder;", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;Lcom/google/firebase/crashlytics/CustomKeysAndValues$Builder;)V", "build", "Lcom/google/firebase/crashlytics/CustomKeysAndValues;", "build$com_google_firebase_firebase_crashlytics", Constants.KEY_KEY, "", "", "value", "", "", "", "", "", "com.google.firebase-firebase-crashlytics"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class KeyValueBuilder {

    @NotNull
    private final CustomKeysAndValues.Builder builder;

    @Nullable
    private final FirebaseCrashlytics crashlytics;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public KeyValueBuilder(@NotNull FirebaseCrashlytics firebaseCrashlytics) {
        this(firebaseCrashlytics, new CustomKeysAndValues.Builder());
        firebaseCrashlytics.getClass();
    }

    @NotNull
    public final CustomKeysAndValues build$com_google_firebase_firebase_crashlytics() {
        CustomKeysAndValues customKeysAndValuesBuild = this.builder.build();
        customKeysAndValuesBuild.getClass();
        return customKeysAndValuesBuild;
    }

    public final void key(@NotNull String key, @NotNull String value) {
        key.getClass();
        value.getClass();
        FirebaseCrashlytics firebaseCrashlytics = this.crashlytics;
        if (firebaseCrashlytics == null) {
            this.builder.putString(key, value).getClass();
        } else {
            firebaseCrashlytics.setCustomKey(key, value);
            Unit unit = Unit.INSTANCE;
        }
    }

    private KeyValueBuilder(FirebaseCrashlytics firebaseCrashlytics, CustomKeysAndValues.Builder builder) {
        this.crashlytics = firebaseCrashlytics;
        this.builder = builder;
    }

    public KeyValueBuilder() {
        this(null, new CustomKeysAndValues.Builder());
    }

    public final void key(@NotNull String key, double value) {
        key.getClass();
        FirebaseCrashlytics firebaseCrashlytics = this.crashlytics;
        if (firebaseCrashlytics == null) {
            this.builder.putDouble(key, value).getClass();
        } else {
            firebaseCrashlytics.setCustomKey(key, value);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void key(@NotNull String key, float value) {
        key.getClass();
        FirebaseCrashlytics firebaseCrashlytics = this.crashlytics;
        if (firebaseCrashlytics == null) {
            this.builder.putFloat(key, value).getClass();
        } else {
            firebaseCrashlytics.setCustomKey(key, value);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void key(@NotNull String key, int value) {
        key.getClass();
        FirebaseCrashlytics firebaseCrashlytics = this.crashlytics;
        if (firebaseCrashlytics == null) {
            this.builder.putInt(key, value).getClass();
        } else {
            firebaseCrashlytics.setCustomKey(key, value);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void key(@NotNull String key, long value) {
        key.getClass();
        FirebaseCrashlytics firebaseCrashlytics = this.crashlytics;
        if (firebaseCrashlytics == null) {
            this.builder.putLong(key, value).getClass();
        } else {
            firebaseCrashlytics.setCustomKey(key, value);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void key(@NotNull String key, boolean value) {
        key.getClass();
        FirebaseCrashlytics firebaseCrashlytics = this.crashlytics;
        if (firebaseCrashlytics == null) {
            this.builder.putBoolean(key, value).getClass();
        } else {
            firebaseCrashlytics.setCustomKey(key, value);
            Unit unit = Unit.INSTANCE;
        }
    }
}
