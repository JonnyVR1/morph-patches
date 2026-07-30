package com.google.firebase.sessions.settings;

import androidx.annotation.VisibleForTesting;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKt;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ci80;
import p149l.ei80;
import p149l.eri;
import p149l.fpd0;
import p149l.i5c;
import p149l.ih3;
import p149l.j6f;
import p149l.jri;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 32\u00020\u0001:\u00013B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000f\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u001aH\u0086@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u001aH\u0086@ø\u0001\u0000¢\u0006\u0004\b'\u0010%J\u001d\u0010*\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010(H\u0086@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0013\u0010.\u001a\u00020\bH\u0081@ø\u0001\u0000¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, m87232d2 = {"Lcom/google/firebase/sessions/settings/SettingsCache;", "", "Ll/i5c;", "Ll/ci80;", "dataStore", "<init>", "(Ll/i5c;)V", fpd0.DEFAULT_FILE_NAME, "", "updateSessionConfigs", "(Ll/ci80;)V", j6f.GPS_DIRECTION_TRUE, "Ll/ci80$a;", Constants.KEY_KEY, "value", "updateConfigValue", "(Ll/ci80$a;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "hasCacheExpired$com_google_firebase_firebase_sessions", "()Z", "hasCacheExpired", "sessionsEnabled", "()Ljava/lang/Boolean;", "", "sessionSamplingRate", "()Ljava/lang/Double;", "", "sessionRestartTimeout", "()Ljava/lang/Integer;", "enabled", "updateSettingsEnabled", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rate", "updateSamplingRate", "(Ljava/lang/Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeoutInSeconds", "updateSessionRestartTimeout", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cacheDurationInSeconds", "updateSessionCacheDuration", "", "cacheUpdatedTime", "updateSessionCacheUpdatedTime", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeConfigs$com_google_firebase_firebase_sessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeConfigs", "Ll/i5c;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "sessionConfigs", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "Companion", "com.google.firebase-firebase-sessions"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class SettingsCache {

    @Deprecated
    @NotNull
    public static final String TAG = "SettingsCache";

    @NotNull
    private final i5c<ci80> dataStore;
    private SessionConfigs sessionConfigs;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final ci80.C16162a<Boolean> SESSIONS_ENABLED = ei80.m116654a(LocalOverrideSettings.SESSIONS_ENABLED);

    @NotNull
    private static final ci80.C16162a<Double> SAMPLING_RATE = ei80.m116655b(LocalOverrideSettings.SAMPLING_RATE);

    @NotNull
    private static final ci80.C16162a<Integer> RESTART_TIMEOUT_SECONDS = ei80.m116657d("firebase_sessions_restart_timeout");

    @NotNull
    private static final ci80.C16162a<Integer> CACHE_DURATION_SECONDS = ei80.m116657d("firebase_sessions_cache_duration");

    @NotNull
    private static final ci80.C16162a<Long> CACHE_UPDATED_TIME = ei80.m116658e("firebase_sessions_cache_updated_time");

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCache$1 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 8, 0})
    @DebugMetadata(m87373c = "com.google.firebase.sessions.settings.SettingsCache$1", m87374f = "SettingsCache.kt", m87375l = {46}, m87376m = "invokeSuspend")
    public static final class C32641 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C32641(Continuation<? super C32641> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SettingsCache.this.new C32641(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<? super Unit> continuation) {
            return ((C32641) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            SettingsCache settingsCache;
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m87239b(obj);
                SettingsCache settingsCache2 = SettingsCache.this;
                eri data = settingsCache2.dataStore.getData();
                this.L$0 = settingsCache2;
                this.label = 1;
                Object objM142959r = jri.m142959r(data, this);
                if (objM142959r == objM196133e) {
                    return objM196133e;
                }
                obj = objM142959r;
                settingsCache = settingsCache2;
            } else {
                if (i != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                settingsCache = (SettingsCache) this.L$0;
                ResultKt.m87239b(obj);
            }
            settingsCache.updateSessionConfigs(((ci80) obj).m107056d());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0007\u001a\u0004\b\u0014\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Lcom/google/firebase/sessions/settings/SettingsCache$Companion;", "", "<init>", "()V", "Ll/ci80$a;", "", "SESSIONS_ENABLED", "Ll/ci80$a;", "getSESSIONS_ENABLED", "()Ll/ci80$a;", "", "SAMPLING_RATE", "getSAMPLING_RATE", "", "RESTART_TIMEOUT_SECONDS", "getRESTART_TIMEOUT_SECONDS", "CACHE_DURATION_SECONDS", "getCACHE_DURATION_SECONDS", "", "CACHE_UPDATED_TIME", "getCACHE_UPDATED_TIME", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ci80.C16162a<Integer> getCACHE_DURATION_SECONDS() {
            return SettingsCache.CACHE_DURATION_SECONDS;
        }

        @NotNull
        public final ci80.C16162a<Long> getCACHE_UPDATED_TIME() {
            return SettingsCache.CACHE_UPDATED_TIME;
        }

        @NotNull
        public final ci80.C16162a<Integer> getRESTART_TIMEOUT_SECONDS() {
            return SettingsCache.RESTART_TIMEOUT_SECONDS;
        }

        @NotNull
        public final ci80.C16162a<Double> getSAMPLING_RATE() {
            return SettingsCache.SAMPLING_RATE;
        }

        @NotNull
        public final ci80.C16162a<Boolean> getSESSIONS_ENABLED() {
            return SettingsCache.SESSIONS_ENABLED;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1 */
    @Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
    @DebugMetadata(m87373c = "com.google.firebase.sessions.settings.SettingsCache", m87374f = "SettingsCache.kt", m87375l = {119}, m87376m = "updateConfigValue")
    public static final class C32651<T> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32651(Continuation<? super C32651> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SettingsCache.this.updateConfigValue(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2 */
    @Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, fpd0.DEFAULT_FILE_NAME, "Landroidx/datastore/preferences/core/MutablePreferences;"}, m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
    @DebugMetadata(m87373c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", m87374f = "SettingsCache.kt", m87375l = {}, m87376m = "invokeSuspend")
    public static final class C32662 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        final /* synthetic */ ci80.C16162a<T> $key;
        final /* synthetic */ T $value;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SettingsCache this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32662(T t, ci80.C16162a<T> c16162a, SettingsCache settingsCache, Continuation<? super C32662> continuation) {
            super(2, continuation);
            this.$value = t;
            this.$key = c16162a;
            this.this$0 = settingsCache;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C32662 c32662 = new C32662(this.$value, this.$key, this.this$0, continuation);
            c32662.L$0 = obj;
            return c32662;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull MutablePreferences mutablePreferences, @Nullable Continuation<? super Unit> continuation) {
            return ((C32662) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            uwp.m196133e();
            if (this.label != 0) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            T t = this.$value;
            Object obj2 = this.$key;
            if (t != 0) {
                mutablePreferences.m1486j(obj2, t);
            } else {
                mutablePreferences.m1485i(obj2);
            }
            this.this$0.updateSessionConfigs(mutablePreferences);
            return Unit.INSTANCE;
        }
    }

    public SettingsCache(@NotNull i5c<ci80> i5cVar) throws InterruptedException {
        i5cVar.getClass();
        this.dataStore = i5cVar;
        ih3.m136184b(null, new C32641(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final <T> Object updateConfigValue(ci80.C16162a<T> c16162a, T t, Continuation<? super Unit> continuation) throws Throwable {
        C32651 c32651;
        if (continuation instanceof C32651) {
            c32651 = (C32651) continuation;
            int i = c32651.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32651.label = i - Integer.MIN_VALUE;
            } else {
                c32651 = new C32651(continuation);
            }
        } else {
            c32651 = new C32651(continuation);
        }
        Object obj = c32651.result;
        Object objM196133e = uwp.m196133e();
        int i2 = c32651.label;
        try {
            if (i2 == 0) {
                ResultKt.m87239b(obj);
                i5c<ci80> i5cVar = this.dataStore;
                C32662 c32662 = new C32662(t, c16162a, this, null);
                c32651.label = 1;
                if (PreferencesKt.m1489a(i5cVar, c32662, c32651) == objM196133e) {
                    return objM196133e;
                }
            } else {
                if (i2 != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
            }
        } catch (IOException e) {
            e.toString();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSessionConfigs(ci80 preferences) {
        this.sessionConfigs = new SessionConfigs((Boolean) preferences.mo1480b(SESSIONS_ENABLED), (Double) preferences.mo1480b(SAMPLING_RATE), (Integer) preferences.mo1480b(RESTART_TIMEOUT_SECONDS), (Integer) preferences.mo1480b(CACHE_DURATION_SECONDS), (Long) preferences.mo1480b(CACHE_UPDATED_TIME));
    }

    public final boolean hasCacheExpired$com_google_firebase_firebase_sessions() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        SessionConfigs sessionConfigs2 = null;
        if (sessionConfigs == null) {
            Intrinsics.m87502r("sessionConfigs");
            sessionConfigs = null;
        }
        Long cacheUpdatedTime = sessionConfigs.getCacheUpdatedTime();
        SessionConfigs sessionConfigs3 = this.sessionConfigs;
        if (sessionConfigs3 == null) {
            Intrinsics.m87502r("sessionConfigs");
        } else {
            sessionConfigs2 = sessionConfigs3;
        }
        Integer cacheDuration = sessionConfigs2.getCacheDuration();
        return cacheUpdatedTime == null || cacheDuration == null || (System.currentTimeMillis() - cacheUpdatedTime.longValue()) / 1000 >= ((long) cacheDuration.intValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @VisibleForTesting
    @Nullable
    public final Object removeConfigs$com_google_firebase_firebase_sessions(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        SettingsCache$removeConfigs$1 settingsCache$removeConfigs$1;
        if (continuation instanceof SettingsCache$removeConfigs$1) {
            settingsCache$removeConfigs$1 = (SettingsCache$removeConfigs$1) continuation;
            int i = settingsCache$removeConfigs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                settingsCache$removeConfigs$1.label = i - Integer.MIN_VALUE;
            } else {
                settingsCache$removeConfigs$1 = new SettingsCache$removeConfigs$1(this, continuation);
            }
        } else {
            settingsCache$removeConfigs$1 = new SettingsCache$removeConfigs$1(this, continuation);
        }
        Object obj = settingsCache$removeConfigs$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = settingsCache$removeConfigs$1.label;
        try {
            if (i2 == 0) {
                ResultKt.m87239b(obj);
                i5c<ci80> i5cVar = this.dataStore;
                SettingsCache$removeConfigs$2 settingsCache$removeConfigs$2 = new SettingsCache$removeConfigs$2(this, null);
                settingsCache$removeConfigs$1.label = 1;
                if (PreferencesKt.m1489a(i5cVar, settingsCache$removeConfigs$2, settingsCache$removeConfigs$1) == objM196133e) {
                    return objM196133e;
                }
            } else {
                if (i2 != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
            }
        } catch (IOException e) {
            e.toString();
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Integer sessionRestartTimeout() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            Intrinsics.m87502r("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionRestartTimeout();
    }

    @Nullable
    public final Double sessionSamplingRate() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            Intrinsics.m87502r("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionSamplingRate();
    }

    @Nullable
    public final Boolean sessionsEnabled() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            Intrinsics.m87502r("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionEnabled();
    }

    @Nullable
    public final Object updateSamplingRate(@Nullable Double d, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objUpdateConfigValue = updateConfigValue(SAMPLING_RATE, d, continuation);
        return objUpdateConfigValue == uwp.m196133e() ? objUpdateConfigValue : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateSessionCacheDuration(@Nullable Integer num, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objUpdateConfigValue = updateConfigValue(CACHE_DURATION_SECONDS, num, continuation);
        return objUpdateConfigValue == uwp.m196133e() ? objUpdateConfigValue : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateSessionCacheUpdatedTime(@Nullable Long l2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objUpdateConfigValue = updateConfigValue(CACHE_UPDATED_TIME, l2, continuation);
        return objUpdateConfigValue == uwp.m196133e() ? objUpdateConfigValue : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateSessionRestartTimeout(@Nullable Integer num, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objUpdateConfigValue = updateConfigValue(RESTART_TIMEOUT_SECONDS, num, continuation);
        return objUpdateConfigValue == uwp.m196133e() ? objUpdateConfigValue : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateSettingsEnabled(@Nullable Boolean bool, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objUpdateConfigValue = updateConfigValue(SESSIONS_ENABLED, bool, continuation);
        return objUpdateConfigValue == uwp.m196133e() ? objUpdateConfigValue : Unit.INSTANCE;
    }
}
