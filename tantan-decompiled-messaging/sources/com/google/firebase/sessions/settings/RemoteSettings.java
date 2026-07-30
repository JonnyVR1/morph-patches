package com.google.firebase.sessions.settings;

import androidx.annotation.VisibleForTesting;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.C15424f;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.ci80;
import p149l.i5c;
import p149l.jh3;
import p149l.ot10;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001f\u0010/\u001a\u0004\u0018\u00010,8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u00103\u001a\u0004\u0018\u0001008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, m87232d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallationsApi", "Lcom/google/firebase/sessions/ApplicationInfo;", "appInfo", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "configsFetcher", "Ll/i5c;", "Ll/ci80;", "dataStore", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/ApplicationInfo;Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;Ll/i5c;)V", "", BLiveStormDanmakuGiftResourceType.f44446s, "removeForwardSlashesIn", "(Ljava/lang/String;)Ljava/lang/String;", "", "updateSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isSettingsStale", "()Z", "clearCachedSettings$com_google_firebase_firebase_sessions", "()V", "clearCachedSettings", "Lkotlin/coroutines/CoroutineContext;", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "Lcom/google/firebase/sessions/ApplicationInfo;", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "Lcom/google/firebase/sessions/settings/SettingsCache;", "settingsCache$delegate", "Lkotlin/Lazy;", "getSettingsCache", "()Lcom/google/firebase/sessions/settings/SettingsCache;", "settingsCache", "Ll/ot10;", "fetchInProgress", "Ll/ot10;", "getSessionEnabled", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/Duration;", "getSessionRestartTimeout-FghU774", "()Lkotlin/time/Duration;", "sessionRestartTimeout", "", "getSamplingRate", "()Ljava/lang/Double;", "samplingRate", "Companion", "com.google.firebase-firebase-sessions"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class RemoteSettings implements SettingsProvider {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String FORWARD_SLASH_STRING = "/";

    @Deprecated
    @NotNull
    public static final String TAG = "SessionConfigFetcher";

    @NotNull
    private final ApplicationInfo appInfo;

    @NotNull
    private final CoroutineContext backgroundDispatcher;

    @NotNull
    private final CrashlyticsSettingsFetcher configsFetcher;

    @NotNull
    private final ot10 fetchInProgress;

    @NotNull
    private final FirebaseInstallationsApi firebaseInstallationsApi;

    /* JADX INFO: renamed from: settingsCache$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy settingsCache;

    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m87232d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings$Companion;", "", "()V", "FORWARD_SLASH_STRING", "", "TAG", "com.google.firebase-firebase-sessions"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1 */
    @Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
    @DebugMetadata(m87373c = "com.google.firebase.sessions.settings.RemoteSettings", m87374f = "RemoteSettings.kt", m87375l = {CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 76, EACTags.LOGIN_DATA}, m87376m = "updateSettings")
    public static final class C32611 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C32611(Continuation<? super C32611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RemoteSettings.this.updateSettings(this);
        }
    }

    public RemoteSettings(@NotNull CoroutineContext coroutineContext, @NotNull FirebaseInstallationsApi firebaseInstallationsApi, @NotNull ApplicationInfo applicationInfo, @NotNull CrashlyticsSettingsFetcher crashlyticsSettingsFetcher, @NotNull final i5c<ci80> i5cVar) {
        coroutineContext.getClass();
        firebaseInstallationsApi.getClass();
        applicationInfo.getClass();
        crashlyticsSettingsFetcher.getClass();
        i5cVar.getClass();
        this.backgroundDispatcher = coroutineContext;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.appInfo = applicationInfo;
        this.configsFetcher = crashlyticsSettingsFetcher;
        this.settingsCache = LazyKt__LazyJVMKt.m87229b(new Function0<SettingsCache>() { // from class: com.google.firebase.sessions.settings.RemoteSettings$settingsCache$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SettingsCache invoke() {
                return new SettingsCache(i5cVar);
            }
        });
        this.fetchInProgress = MutexKt.m94362b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SettingsCache getSettingsCache() {
        return (SettingsCache) this.settingsCache.getValue();
    }

    private final String removeForwardSlashesIn(String s) {
        return new Regex("/").replace(s, "");
    }

    @VisibleForTesting
    public final void clearCachedSettings$com_google_firebase_firebase_sessions() {
        jh3.m141367d(C15424f.m94055a(this.backgroundDispatcher), null, null, new RemoteSettings$clearCachedSettings$1(this, null), 3, null);
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Double getSamplingRate() {
        return getSettingsCache().sessionSamplingRate();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Boolean getSessionEnabled() {
        return getSettingsCache().sessionsEnabled();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774 */
    public Duration mo223794getSessionRestartTimeoutFghU774() {
        Integer numSessionRestartTimeout = getSettingsCache().sessionRestartTimeout();
        if (numSessionRestartTimeout == null) {
            return null;
        }
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m93526i(DurationKt.m93561o(numSessionRestartTimeout.intValue(), DurationUnit.SECONDS));
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public boolean isSettingsStale() {
        return getSettingsCache().hasCacheExpired$com_google_firebase_firebase_sessions();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00bb A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:14:0x0030, B:52:0x0130, B:21:0x0046, B:44:0x00ad, B:46:0x00bb, B:49:0x00c1), top: B:58:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1 A[Catch: all -> 0x0035, TRY_ENTER, TryCatch #1 {all -> 0x0035, blocks: (B:14:0x0030, B:52:0x0130, B:21:0x0046, B:44:0x00ad, B:46:0x00bb, B:49:0x00c1), top: B:58:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012d, code lost:
    
        if (r4.doConfigFetch(r12, r5, r2, r0) == r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.firebase.sessions.settings.RemoteSettings, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [l.ot10] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.google.firebase.sessions.settings.RemoteSettings, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.google.firebase.sessions.settings.RemoteSettings] */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateSettings(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.RemoteSettings.updateSettings(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
