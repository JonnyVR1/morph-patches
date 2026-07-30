package com.google.firebase.sessions.settings;

import android.os.Build;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.InstallationId;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.C15531f;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.hq80;
import p153l.o6c;
import p153l.uyp;
import p153l.w120;
import p153l.wtq0;
import p153l.xh3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001f\u0010/\u001a\u0004\u0018\u00010,8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u00103\u001a\u0004\u0018\u0001008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, m88121d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallationsApi", "Lcom/google/firebase/sessions/ApplicationInfo;", "appInfo", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "configsFetcher", "Ll/o6c;", "Ll/hq80;", "dataStore", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/ApplicationInfo;Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;Ll/o6c;)V", "", BLiveStormDanmakuGiftResourceType.f45294s, "removeForwardSlashesIn", "(Ljava/lang/String;)Ljava/lang/String;", "", "updateSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isSettingsStale", "()Z", "clearCachedSettings$com_google_firebase_firebase_sessions", "()V", "clearCachedSettings", "Lkotlin/coroutines/CoroutineContext;", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "Lcom/google/firebase/sessions/ApplicationInfo;", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "Lcom/google/firebase/sessions/settings/SettingsCache;", "settingsCache$delegate", "Lkotlin/Lazy;", "getSettingsCache", "()Lcom/google/firebase/sessions/settings/SettingsCache;", "settingsCache", "Ll/w120;", "fetchInProgress", "Ll/w120;", "getSessionEnabled", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/Duration;", "getSessionRestartTimeout-FghU774", "()Lkotlin/time/Duration;", "sessionRestartTimeout", "", "getSamplingRate", "()Ljava/lang/Double;", "samplingRate", "Companion", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
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
    private final w120 fetchInProgress;

    @NotNull
    private final FirebaseInstallationsApi firebaseInstallationsApi;

    /* JADX INFO: renamed from: settingsCache$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy settingsCache;

    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m88121d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings$Companion;", "", "()V", "FORWARD_SLASH_STRING", "", "TAG", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1 */
    @Metadata(m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
    @DebugMetadata(m88262c = "com.google.firebase.sessions.settings.RemoteSettings", m88263f = "RemoteSettings.kt", m88264l = {CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 76, EACTags.LOGIN_DATA}, m88265m = "updateSettings")
    public static final class C32841 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C32841(Continuation<? super C32841> continuation) {
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

    public RemoteSettings(@NotNull CoroutineContext coroutineContext, @NotNull FirebaseInstallationsApi firebaseInstallationsApi, @NotNull ApplicationInfo applicationInfo, @NotNull CrashlyticsSettingsFetcher crashlyticsSettingsFetcher, @NotNull final o6c<hq80> o6cVar) {
        coroutineContext.getClass();
        firebaseInstallationsApi.getClass();
        applicationInfo.getClass();
        crashlyticsSettingsFetcher.getClass();
        o6cVar.getClass();
        this.backgroundDispatcher = coroutineContext;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.appInfo = applicationInfo;
        this.configsFetcher = crashlyticsSettingsFetcher;
        this.settingsCache = LazyKt__LazyJVMKt.m88118b(new Function0<SettingsCache>() { // from class: com.google.firebase.sessions.settings.RemoteSettings$settingsCache$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SettingsCache invoke() {
                return new SettingsCache(o6cVar);
            }
        });
        this.fetchInProgress = MutexKt.m95255b(false, 1, null);
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
        xh3.m210980d(C15531f.m94947a(this.backgroundDispatcher), null, null, new RemoteSettings$clearCachedSettings$1(this, null), 3, null);
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
    public Duration mo225040getSessionRestartTimeoutFghU774() {
        Integer numSessionRestartTimeout = getSettingsCache().sessionRestartTimeout();
        if (numSessionRestartTimeout == null) {
            return null;
        }
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m94417i(DurationKt.m94452o(numSessionRestartTimeout.intValue(), DurationUnit.SECONDS));
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
    /* JADX WARN: Type inference failed for: r11v1, types: [l.w120] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.google.firebase.sessions.settings.RemoteSettings, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.google.firebase.sessions.settings.RemoteSettings] */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateSettings(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        C32841 c32841;
        w120 w120Var;
        ?? r11;
        ?? r2;
        w120 w120Var2;
        String fid;
        if (continuation instanceof C32841) {
            c32841 = (C32841) continuation;
            int i = c32841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32841.label = i - Integer.MIN_VALUE;
            } else {
                c32841 = new C32841(continuation);
            }
        } else {
            c32841 = new C32841(continuation);
        }
        Object obj = c32841.result;
        Object objM198688e = uyp.m198688e();
        int i2 = c32841.label;
        try {
            try {
                if (i2 == 0) {
                    ResultKt.m88128b(obj);
                    if (!this.fetchInProgress.mo95246a() && !getSettingsCache().hasCacheExpired$com_google_firebase_firebase_sessions()) {
                        return Unit.INSTANCE;
                    }
                    w120Var = this.fetchInProgress;
                    c32841.L$0 = this;
                    c32841.L$1 = w120Var;
                    c32841.label = 1;
                    this = this;
                    if (w120Var.mo95247c(null, c32841) != objM198688e) {
                    }
                    return objM198688e;
                }
                if (i2 == 1) {
                    w120 w120Var3 = (w120) c32841.L$1;
                    RemoteSettings remoteSettings = (RemoteSettings) c32841.L$0;
                    ResultKt.m88128b(obj);
                    w120Var = w120Var3;
                    r11 = remoteSettings;
                } else if (i2 == 2) {
                    w120Var2 = (w120) c32841.L$1;
                    RemoteSettings remoteSettings2 = (RemoteSettings) c32841.L$0;
                    ResultKt.m88128b(obj);
                    r2 = remoteSettings2;
                    fid = ((InstallationId) obj).getFid();
                    if (Intrinsics.m88377d(fid, "")) {
                        Unit unit = Unit.INSTANCE;
                        w120Var2.mo95248d(null);
                        return unit;
                    }
                    Pair pairM88129a = TuplesKt.m88129a("X-Crashlytics-Installation-ID", fid);
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    Pair pairM88129a2 = TuplesKt.m88129a("X-Crashlytics-Device-Model", r2.removeForwardSlashesIn(String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2))));
                    String str = Build.VERSION.INCREMENTAL;
                    str.getClass();
                    Pair pairM88129a3 = TuplesKt.m88129a("X-Crashlytics-OS-Build-Version", r2.removeForwardSlashesIn(str));
                    String str2 = Build.VERSION.RELEASE;
                    str2.getClass();
                    Map<String, String> mapMapOf = MapsKt.mapOf(pairM88129a, pairM88129a2, pairM88129a3, TuplesKt.m88129a("X-Crashlytics-OS-Display-Version", r2.removeForwardSlashesIn(str2)), TuplesKt.m88129a("X-Crashlytics-API-Client-Version", r2.appInfo.getSessionSdkVersion()));
                    CrashlyticsSettingsFetcher crashlyticsSettingsFetcher = r2.configsFetcher;
                    RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(r2, null);
                    RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(null);
                    c32841.L$0 = w120Var2;
                    c32841.L$1 = null;
                    c32841.label = 3;
                } else {
                    if (i2 != 3) {
                        wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w120Var2 = (w120) c32841.L$0;
                    ResultKt.m88128b(obj);
                }
                Unit unit2 = Unit.INSTANCE;
                w120Var2.mo95248d(null);
                return Unit.INSTANCE;
                if (!r11.getSettingsCache().hasCacheExpired$com_google_firebase_firebase_sessions()) {
                    Unit unit3 = Unit.INSTANCE;
                    w120Var.mo95248d(null);
                    return unit3;
                }
                InstallationId.Companion companion = InstallationId.INSTANCE;
                FirebaseInstallationsApi firebaseInstallationsApi = r11.firebaseInstallationsApi;
                c32841.L$0 = r11;
                c32841.L$1 = w120Var;
                c32841.label = 2;
                Object objCreate = companion.create(firebaseInstallationsApi, c32841);
                if (objCreate != objM198688e) {
                    r2 = r11;
                    w120Var2 = w120Var;
                    obj = objCreate;
                    fid = ((InstallationId) obj).getFid();
                    if (Intrinsics.m88377d(fid, "")) {
                        Unit unit4 = Unit.INSTANCE;
                        w120Var2.mo95248d(null);
                        return unit4;
                    }
                    Pair pairM88129a4 = TuplesKt.m88129a("X-Crashlytics-Installation-ID", fid);
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    Pair pairM88129a5 = TuplesKt.m88129a("X-Crashlytics-Device-Model", r2.removeForwardSlashesIn(String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2))));
                    String str3 = Build.VERSION.INCREMENTAL;
                    str3.getClass();
                    Pair pairM88129a6 = TuplesKt.m88129a("X-Crashlytics-OS-Build-Version", r2.removeForwardSlashesIn(str3));
                    String str4 = Build.VERSION.RELEASE;
                    str4.getClass();
                    Map<String, String> mapMapOf2 = MapsKt.mapOf(pairM88129a4, pairM88129a5, pairM88129a6, TuplesKt.m88129a("X-Crashlytics-OS-Display-Version", r2.removeForwardSlashesIn(str4)), TuplesKt.m88129a("X-Crashlytics-API-Client-Version", r2.appInfo.getSessionSdkVersion()));
                    CrashlyticsSettingsFetcher crashlyticsSettingsFetcher2 = r2.configsFetcher;
                    RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$3 = new RemoteSettings$updateSettings$2$1(r2, null);
                    RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$4 = new RemoteSettings$updateSettings$2$2(null);
                    c32841.L$0 = w120Var2;
                    c32841.L$1 = null;
                    c32841.label = 3;
                }
                return objM198688e;
            } catch (Throwable th) {
                w120 w120Var4 = w120Var;
                th = th;
                this = w120Var4;
                this.mo95248d(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
