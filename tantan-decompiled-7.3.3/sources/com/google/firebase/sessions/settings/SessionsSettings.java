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
import kotlin.ResultKt;
import kotlin.Unit;
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
import p153l.hq80;
import p153l.iq80;
import p153l.j0d0;
import p153l.o6c;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B/\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB'\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u000eB\u0015\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001d\u0010 \u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0011\u0010#\u001a\u00020$H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010%R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00188Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, m88121d2 = {"Lcom/google/firebase/sessions/settings/SessionsSettings;", "", "context", "Landroid/content/Context;", "blockingDispatcher", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "firebaseInstallationsApi", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "appInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/ApplicationInfo;)V", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "(Lcom/google/firebase/FirebaseApp;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/installations/FirebaseInstallationsApi;)V", "localOverrideSettings", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "remoteSettings", "(Lcom/google/firebase/sessions/settings/SettingsProvider;Lcom/google/firebase/sessions/settings/SettingsProvider;)V", "samplingRate", "", "getSamplingRate", "()D", "sessionRestartTimeout", "Lkotlin/time/Duration;", "getSessionRestartTimeout-UwyO8pc", "()J", "sessionsEnabled", "", "getSessionsEnabled", "()Z", "isValidSamplingRate", "isValidSessionRestartTimeout", "isValidSessionRestartTimeout-LRDsOJo", "(J)Z", "updateSettings", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
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
    private static final ReadOnlyProperty<Context, o6c<hq80>> dataStore$delegate = PreferenceDataStoreDelegateKt.m1435b(SessionDataStoreConfigs.INSTANCE.getSETTINGS_CONFIG_NAME(), new j0d0(new Function1<CorruptionException, hq80>() { // from class: com.google.firebase.sessions.settings.SessionsSettings$Companion$dataStore$2
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final hq80 invoke(@NotNull CorruptionException corruptionException) throws Throwable {
            corruptionException.getClass();
            ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions();
            return iq80.m141660a();
        }
    }), null, null, 12, null);

    @Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Lcom/google/firebase/sessions/settings/SessionsSettings$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "Ll/o6c;", "Ll/hq80;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getDataStore", "(Landroid/content/Context;)Ll/o6c;", "dataStore", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "getInstance", "()Lcom/google/firebase/sessions/settings/SessionsSettings;", "instance", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.m88404j(new PropertyReference2Impl(Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final o6c<hq80> getDataStore(Context context) {
            return (o6c) SessionsSettings.dataStore$delegate.mo1437a(context, $$delegatedProperties[0]);
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
    @Metadata(m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
    @DebugMetadata(m88262c = "com.google.firebase.sessions.settings.SessionsSettings", m88263f = "SessionsSettings.kt", m88264l = {CipherSuite.TLS_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA}, m88265m = "updateSettings")
    public static final class C32861 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C32861(Continuation<? super C32861> continuation) {
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
    private final boolean m225041isValidSessionRestartTimeoutLRDsOJo(long sessionRestartTimeout) {
        return Duration.m94406L(sessionRestartTimeout) && Duration.m94401F(sessionRestartTimeout);
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
    public final long m225042getSessionRestartTimeoutUwyO8pc() {
        Duration durationMo225040getSessionRestartTimeoutFghU774 = this.localOverrideSettings.mo225040getSessionRestartTimeoutFghU774();
        if (durationMo225040getSessionRestartTimeoutFghU774 != null) {
            long rawValue = durationMo225040getSessionRestartTimeoutFghU774.getRawValue();
            if (m225041isValidSessionRestartTimeoutLRDsOJo(rawValue)) {
                return rawValue;
            }
        }
        Duration durationMo225040getSessionRestartTimeoutFghU775 = this.remoteSettings.mo225040getSessionRestartTimeoutFghU774();
        if (durationMo225040getSessionRestartTimeoutFghU775 != null) {
            long rawValue2 = durationMo225040getSessionRestartTimeoutFghU775.getRawValue();
            if (m225041isValidSessionRestartTimeoutLRDsOJo(rawValue2)) {
                return rawValue2;
            }
        }
        Duration.Companion companion = Duration.INSTANCE;
        return DurationKt.m94452o(30, DurationUnit.MINUTES);
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
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateSettings(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        C32861 c32861;
        if (continuation instanceof C32861) {
            c32861 = (C32861) continuation;
            int i = c32861.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32861.label = i - Integer.MIN_VALUE;
            } else {
                c32861 = new C32861(continuation);
            }
        } else {
            c32861 = new C32861(continuation);
        }
        Object obj = c32861.result;
        Object objM198688e = uyp.m198688e();
        int i2 = c32861.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            SettingsProvider settingsProvider = this.localOverrideSettings;
            c32861.L$0 = this;
            c32861.label = 1;
            if (settingsProvider.updateSettings(c32861) != objM198688e) {
            }
            return objM198688e;
        }
        if (i2 == 1) {
            this = (SessionsSettings) c32861.L$0;
            ResultKt.m88128b(obj);
        } else {
            if (i2 != 2) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        return Unit.INSTANCE;
        SettingsProvider settingsProvider2 = this.remoteSettings;
        c32861.L$0 = null;
        c32861.label = 2;
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
