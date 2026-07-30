package com.google.firebase.sessions.settings;

import android.content.Context;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, m87232d2 = {"Lcom/google/firebase/sessions/settings/LocalOverrideSettings;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "metadata", "Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "getMetadata$annotations", "()V", "samplingRate", "", "getSamplingRate", "()Ljava/lang/Double;", "sessionEnabled", "", "getSessionEnabled", "()Ljava/lang/Boolean;", "sessionRestartTimeout", "Lkotlin/time/Duration;", "getSessionRestartTimeout-FghU774", "()Lkotlin/time/Duration;", "Companion", "com.google.firebase-firebase-sessions"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class LocalOverrideSettings implements SettingsProvider {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String SAMPLING_RATE = "firebase_sessions_sampling_rate";

    @Deprecated
    @NotNull
    public static final String SESSIONS_ENABLED = "firebase_sessions_enabled";

    @Deprecated
    @NotNull
    public static final String SESSION_RESTART_TIMEOUT = "firebase_sessions_sessions_restart_timeout";
    private final Bundle metadata;

    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m87232d2 = {"Lcom/google/firebase/sessions/settings/LocalOverrideSettings$Companion;", "", "()V", "SAMPLING_RATE", "", "SESSIONS_ENABLED", "SESSION_RESTART_TIMEOUT", "com.google.firebase-firebase-sessions"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public LocalOverrideSettings(@NotNull Context context) {
        context.getClass();
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.metadata = bundle == null ? Bundle.EMPTY : bundle;
    }

    private static /* synthetic */ void getMetadata$annotations() {
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Double getSamplingRate() {
        if (this.metadata.containsKey(SAMPLING_RATE)) {
            return Double.valueOf(this.metadata.getDouble(SAMPLING_RATE));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Boolean getSessionEnabled() {
        if (this.metadata.containsKey(SESSIONS_ENABLED)) {
            return Boolean.valueOf(this.metadata.getBoolean(SESSIONS_ENABLED));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774, reason: not valid java name */
    public Duration mo223794getSessionRestartTimeoutFghU774() {
        if (this.metadata.containsKey(SESSION_RESTART_TIMEOUT)) {
            return Duration.m93526i(DurationKt.m93561o(this.metadata.getInt(SESSION_RESTART_TIMEOUT), DurationUnit.SECONDS));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public boolean isSettingsStale() {
        return SettingsProvider.DefaultImpls.isSettingsStale(this);
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Object updateSettings(@NotNull Continuation<? super Unit> continuation) {
        return SettingsProvider.DefaultImpls.updateSettings(this, continuation);
    }
}
