package com.google.firebase.crashlytics.ktx;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nH\u0007J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000bH\u0007J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\fH\u0007J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\rH\u0007J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m88121d2 = {"Lcom/google/firebase/crashlytics/ktx/KeyValueBuilder;", "", "crashlytics", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;)V", Constants.KEY_KEY, "", "", "value", "", "", "", "", "", "com.google.firebase-firebase-crashlytics"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class KeyValueBuilder {

    @NotNull
    private final FirebaseCrashlytics crashlytics;

    public KeyValueBuilder(@NotNull FirebaseCrashlytics firebaseCrashlytics) {
        firebaseCrashlytics.getClass();
        this.crashlytics = firebaseCrashlytics;
    }

    @Deprecated
    public final void key(@NotNull String key, @NotNull String value) {
        key.getClass();
        value.getClass();
        this.crashlytics.setCustomKey(key, value);
    }

    @Deprecated
    public final void key(@NotNull String key, double value) {
        key.getClass();
        this.crashlytics.setCustomKey(key, value);
    }

    @Deprecated
    public final void key(@NotNull String key, float value) {
        key.getClass();
        this.crashlytics.setCustomKey(key, value);
    }

    @Deprecated
    public final void key(@NotNull String key, int value) {
        key.getClass();
        this.crashlytics.setCustomKey(key, value);
    }

    @Deprecated
    public final void key(@NotNull String key, long value) {
        key.getClass();
        this.crashlytics.setCustomKey(key, value);
    }

    @Deprecated
    public final void key(@NotNull String key, boolean value) {
        key.getClass();
        this.crashlytics.setCustomKey(key, value);
    }
}
