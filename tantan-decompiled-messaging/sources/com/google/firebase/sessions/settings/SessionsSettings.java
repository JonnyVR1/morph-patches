package com.google.firebase.sessions.settings;

import android.content.Context;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseKt;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.ProcessDetailsProvider;
import com.google.firebase.sessions.SessionDataStoreConfigs;
import com.google.firebase.sessions.SessionEvents;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.ci80;
import p149l.di80;
import p149l.esc0;
import p149l.i5c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B/\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB'\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u000eB\u0015\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001d\u0010 \u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0011\u0010#\u001a\u00020$H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010%R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00188Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, m87232d2 = {"Lcom/google/firebase/sessions/settings/SessionsSettings;", "", "context", "Landroid/content/Context;", "blockingDispatcher", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "firebaseInstallationsApi", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "appInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/ApplicationInfo;)V", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "(Lcom/google/firebase/FirebaseApp;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/installations/FirebaseInstallationsApi;)V", "localOverrideSettings", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "remoteSettings", "(Lcom/google/firebase/sessions/settings/SettingsProvider;Lcom/google/firebase/sessions/settings/SettingsProvider;)V", "samplingRate", "", "getSamplingRate", "()D", "sessionRestartTimeout", "Lkotlin/time/Duration;", "getSessionRestartTimeout-UwyO8pc", "()J", "sessionsEnabled", "", "getSessionsEnabled", "()Z", "isValidSamplingRate", "isValidSessionRestartTimeout", "isValidSessionRestartTimeout-LRDsOJo", "(J)Z", "updateSettings", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "com.google.firebase-firebase-sessions"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class SessionsSettings {

    @NotNull
    private static final String TAG = "SessionsSettings";

    @NotNull
    private final SettingsProvider localOverrideSettings;

    @NotNull
    private final SettingsProvider remoteSettings;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ReadOnlyProperty<Context, i5c<ci80>> dataStore$delegate = PreferenceDataStoreDelegateKt.m1434b(SessionDataStoreConfigs.INSTANCE.getSETTINGS_CONFIG_NAME(), new esc0(new Function1<CorruptionException, ci80>() { // from class: com.google.firebase.sessions.settings.SessionsSettings$Companion$dataStore$2
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ci80 invoke(@NotNull CorruptionException corruptionException) throws Throwable {
            corruptionException.getClass();
            ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions();
            return di80.m111869a();
        }
    }), null, null, 12, null);

    @Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Lcom/google/firebase/sessions/settings/SessionsSettings$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "Ll/i5c;", "Ll/ci80;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getDataStore", "(Landroid/content/Context;)Ll/i5c;", "dataStore", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "getInstance", "()Lcom/google/firebase/sessions/settings/SessionsSettings;", "instance", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.m87515j(new PropertyReference2Impl(Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final i5c<ci80> getDataStore(Context context) {
            return (i5c) SessionsSettings.dataStore$delegate.mo1436a(context, $$delegatedProperties[0]);
        }

        @NotNull
        public final SessionsSettings getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionsSettings.class);
            obj.getClass();
            return (SessionsSettings) obj;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 */
    @Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
    @DebugMetadata(m87373c = "com.google.firebase.sessions.settings.SessionsSettings", m87374f = "SessionsSettings.kt", m87375l = {CipherSuite.TLS_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA}, m87376m = "updateSettings")
    public static final class C32631 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C32631(Continuation<? super C32631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionsSettings.this.updateSettings(this);
        }
    }

    private SessionsSettings(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo applicationInfo) {
        this(new LocalOverrideSettings(context), new RemoteSettings(coroutineContext2, firebaseInstallationsApi, applicationInfo, new RemoteSettingsFetcher(applicationInfo, coroutineContext, null, 4, null), INSTANCE.getDataStore(context)));
    }

    private final boolean isValidSamplingRate(double samplingRate) {
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE <= samplingRate && samplingRate <= 1.0d;
    }

    /* JADX INFO: renamed from: isValidSessionRestartTimeout-LRDsOJo, reason: not valid java name */
    private final boolean m223795isValidSessionRestartTimeoutLRDsOJo(long sessionRestartTimeout) {
        return Duration.m93515L(sessionRestartTimeout) && Duration.m93510F(sessionRestartTimeout);
    }

    public final double getSamplingRate() {
        Double samplingRate = this.localOverrideSettings.getSamplingRate();
        if (samplingRate != null) {
            double dDoubleValue = samplingRate.doubleValue();
            if (isValidSamplingRate(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double samplingRate2 = this.remoteSettings.getSamplingRate();
        if (samplingRate2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = samplingRate2.doubleValue();
        if (isValidSamplingRate(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    /* JADX INFO: renamed from: getSessionRestartTimeout-UwyO8pc, reason: not valid java name */
    public final long m223796getSessionRestartTimeoutUwyO8pc() {
        Duration durationMo223794getSessionRestartTimeoutFghU774 = this.localOverrideSettings.mo223794getSessionRestartTimeoutFghU774();
        if (durationMo223794getSessionRestartTimeoutFghU774 != null) {
            long rawValue = durationMo223794getSessionRestartTimeoutFghU774.getRawValue();
            if (m223795isValidSessionRestartTimeoutLRDsOJo(rawValue)) {
                return rawValue;
            }
        }
        Duration durationMo223794getSessionRestartTimeoutFghU775 = this.remoteSettings.mo223794getSessionRestartTimeoutFghU774();
        if (durationMo223794getSessionRestartTimeoutFghU775 != null) {
            long rawValue2 = durationMo223794getSessionRestartTimeoutFghU775.getRawValue();
            if (m223795isValidSessionRestartTimeoutLRDsOJo(rawValue2)) {
                return rawValue2;
            }
        }
        Duration.Companion companion = Duration.INSTANCE;
        return DurationKt.m93561o(30, DurationUnit.MINUTES);
    }

    public final boolean getSessionsEnabled() {
        Boolean sessionEnabled = this.localOverrideSettings.getSessionEnabled();
        if (sessionEnabled != null) {
            return sessionEnabled.booleanValue();
        }
        Boolean sessionEnabled2 = this.remoteSettings.getSessionEnabled();
        if (sessionEnabled2 != null) {
            return sessionEnabled2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r6.updateSettings(r0) == r1) goto L21;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateSettings(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.firebase.sessions.settings.SessionsSettings.C32631
            if (r0 == 0) goto L13
            r0 = r7
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = (com.google.firebase.sessions.settings.SessionsSettings.C32631) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = new com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p149l.uwp.m196133e()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            kotlin.ResultKt.m87239b(r7)
            goto L58
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r6)
            return r3
        L33:
            java.lang.Object r6 = r0.L$0
            com.google.firebase.sessions.settings.SessionsSettings r6 = (com.google.firebase.sessions.settings.SessionsSettings) r6
            kotlin.ResultKt.m87239b(r7)
            goto L4b
        L3b:
            kotlin.ResultKt.m87239b(r7)
            com.google.firebase.sessions.settings.SettingsProvider r7 = r6.localOverrideSettings
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r7.updateSettings(r0)
            if (r7 != r1) goto L4b
            goto L57
        L4b:
            com.google.firebase.sessions.settings.SettingsProvider r6 = r6.remoteSettings
            r0.L$0 = r3
            r0.label = r4
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L58
        L57:
            return r1
        L58:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionsSettings.updateSettings(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public SessionsSettings(@NotNull SettingsProvider settingsProvider, @NotNull SettingsProvider settingsProvider2) {
        settingsProvider.getClass();
        settingsProvider2.getClass();
        this.localOverrideSettings = settingsProvider;
        this.remoteSettings = settingsProvider2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SessionsSettings(@NotNull FirebaseApp firebaseApp, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext coroutineContext2, @NotNull FirebaseInstallationsApi firebaseInstallationsApi) {
        firebaseApp.getClass();
        coroutineContext.getClass();
        coroutineContext2.getClass();
        firebaseInstallationsApi.getClass();
        Context applicationContext = firebaseApp.getApplicationContext();
        applicationContext.getClass();
        this(applicationContext, coroutineContext, coroutineContext2, firebaseInstallationsApi, SessionEvents.INSTANCE.getApplicationInfo(firebaseApp));
    }
}
