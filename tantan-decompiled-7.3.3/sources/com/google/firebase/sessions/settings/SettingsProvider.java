package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\u0011\u0010\u000f\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, m88121d2 = {"Lcom/google/firebase/sessions/settings/SettingsProvider;", "", "samplingRate", "", "getSamplingRate", "()Ljava/lang/Double;", "sessionEnabled", "", "getSessionEnabled", "()Ljava/lang/Boolean;", "sessionRestartTimeout", "Lkotlin/time/Duration;", "getSessionRestartTimeout-FghU774", "()Lkotlin/time/Duration;", "isSettingsStale", "updateSettings", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public interface SettingsProvider {

    @Metadata(m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class DefaultImpls {
        public static boolean isSettingsStale(@NotNull SettingsProvider settingsProvider) {
            return false;
        }

        @Nullable
        public static Object updateSettings(@NotNull SettingsProvider settingsProvider, @NotNull Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }
    }

    @Nullable
    Double getSamplingRate();

    @Nullable
    Boolean getSessionEnabled();

    @Nullable
    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774 */
    Duration mo225040getSessionRestartTimeoutFghU774();

    boolean isSettingsStale();

    @Nullable
    Object updateSettings(@NotNull Continuation<? super Unit> continuation);
}
