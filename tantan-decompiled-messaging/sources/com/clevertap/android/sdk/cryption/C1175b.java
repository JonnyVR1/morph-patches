package com.clevertap.android.sdk.cryption;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.cryption.C1175b;
import com.clevertap.android.sdk.p013db.Table;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p149l.gwb;
import p149l.isk0;
import p149l.l9r;
import p149l.nul;
import p149l.t4c;
import p149l.tzb;
import p149l.wpq;

/* JADX INFO: renamed from: com.clevertap.android.sdk.cryption.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0080\b\u0018\u0000 L2\u00020\u0001:\u0001CBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b(\u0010'J\u001f\u0010+\u001a\u00020*2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,J'\u00100\u001a\u00020*2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020*2\u0006\u0010/\u001a\u00020-2\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020*2\u0006\u0010/\u001a\u00020-2\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b4\u00103J\u001f\u00105\u001a\u00020*2\u0006\u0010/\u001a\u00020-2\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b5\u00103J\u0017\u00107\u001a\u00020-2\u0006\u00106\u001a\u00020\u0017H\u0002¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020-2\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u001e¢\u0006\u0004\b;\u0010 J\u0010\u0010<\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b>\u0010?J\u001a\u0010A\u001a\u00020\u00172\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010FR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010GR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010HR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010IR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010JR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010K¨\u0006M"}, m87232d2 = {"Lcom/clevertap/android/sdk/cryption/b;", "", "", "logPrefix", "", "configEncryptionLevel", "Ll/nul;", "logger", "Lcom/clevertap/android/sdk/cryption/c;", "cryptHandler", "Ll/gwb;", "cryptRepository", "Ll/t4c;", "dataMigrationRepository", "Ll/isk0;", "variablesRepo", "Ll/tzb;", "dbAdapter", "<init>", "(Ljava/lang/String;ILl/nul;Lcom/clevertap/android/sdk/cryption/c;Ll/gwb;Ll/t4c;Ll/isk0;Ll/tzb;)V", "Lcom/clevertap/android/sdk/cryption/EncryptionLevel;", FirebaseAnalytics.Param.LEVEL, "storedLevel", "", "firstUpgrade", "e", "(Lcom/clevertap/android/sdk/cryption/EncryptionLevel;Lcom/clevertap/android/sdk/cryption/EncryptionLevel;Z)Z", "o", "()Z", "n", "", BLiveStormDanmakuGiftResourceType.f44444l, "()V", RXScreenCaptureService.KEY_INDEX, "(Lcom/clevertap/android/sdk/cryption/EncryptionLevel;Z)Z", "Lorg/json/JSONObject;", "b", "()Lorg/json/JSONObject;", "j", "(Lcom/clevertap/android/sdk/cryption/EncryptionLevel;)Z", "m", "data", "Lcom/clevertap/android/sdk/cryption/d;", "p", "(Lcom/clevertap/android/sdk/cryption/EncryptionLevel;Ljava/lang/String;)Lcom/clevertap/android/sdk/cryption/d;", "Lcom/clevertap/android/sdk/cryption/EncryptionState;", "currentState", "targetState", "q", "(Lcom/clevertap/android/sdk/cryption/EncryptionState;Lcom/clevertap/android/sdk/cryption/EncryptionState;Ljava/lang/String;)Lcom/clevertap/android/sdk/cryption/d;", "g", "(Lcom/clevertap/android/sdk/cryption/EncryptionState;Ljava/lang/String;)Lcom/clevertap/android/sdk/cryption/d;", "f", "h", "encrypt", Constants.INAPP_DATA_TAG, "(Z)Lcom/clevertap/android/sdk/cryption/EncryptionState;", "c", "(Ljava/lang/String;)Lcom/clevertap/android/sdk/cryption/EncryptionState;", "k", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "I", "Ll/nul;", "Lcom/clevertap/android/sdk/cryption/c;", "Ll/gwb;", "Ll/t4c;", "Ll/isk0;", "Ll/tzb;", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final /* data */ class C1175b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String logPrefix;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int configEncryptionLevel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC1176c cryptHandler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final gwb cryptRepository;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final t4c dataMigrationRepository;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final isk0 variablesRepo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final tzb dbAdapter;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.cryption.b$b */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4877a;

        static {
            int[] iArr = new int[EncryptionState.values().length];
            try {
                iArr[EncryptionState.ENCRYPTED_AES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EncryptionState.ENCRYPTED_AES_GCM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EncryptionState.PLAIN_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4877a = iArr;
        }
    }

    public C1175b(@NotNull String str, int i, @NotNull nul nulVar, @NotNull InterfaceC1176c interfaceC1176c, @NotNull gwb gwbVar, @NotNull t4c t4cVar, @NotNull isk0 isk0Var, @NotNull tzb tzbVar) {
        str.getClass();
        nulVar.getClass();
        interfaceC1176c.getClass();
        gwbVar.getClass();
        t4cVar.getClass();
        isk0Var.getClass();
        tzbVar.getClass();
        this.logPrefix = str;
        this.configEncryptionLevel = i;
        this.logger = nulVar;
        this.cryptHandler = interfaceC1176c;
        this.cryptRepository = gwbVar;
        this.dataMigrationRepository = t4cVar;
        this.variablesRepo = isk0Var;
        this.dbAdapter = tzbVar;
    }

    /* JADX INFO: renamed from: a */
    public static String m5961a(C1175b c1175b, EncryptionLevel encryptionLevel, Ref.BooleanRef booleanRef, String str) {
        c1175b.getClass();
        encryptionLevel.getClass();
        booleanRef.getClass();
        str.getClass();
        C1177d c1177dM5975p = c1175b.m5975p(encryptionLevel, str);
        booleanRef.element = booleanRef.element && c1177dM5975p.getMigrationSuccessful();
        return c1177dM5975p.getData();
    }

    /* JADX INFO: renamed from: b */
    private final JSONObject m5962b() {
        JSONObject jSONObjectM187169b = this.dataMigrationRepository.m187169b();
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator<String> itKeys = jSONObjectM187169b.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                next.getClass();
                List listSplit$default = StringsKt.split$default(next, new String[]{"_"}, false, 2, 2, null);
                String str = (String) listSplit$default.get(0);
                C1177d c1177dM5975p = m5975p(EncryptionLevel.NONE, (String) listSplit$default.get(1));
                if (c1177dM5975p.getMigrationSuccessful()) {
                    jSONObject.put(str + '_' + c1177dM5975p.getData(), jSONObjectM187169b.get(next));
                }
            }
            return jSONObject;
        } catch (Throwable th) {
            this.logger.verbose(this.logPrefix, "Error migrating format for cached GUIDs: Clearing and starting fresh " + th);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: c */
    private final EncryptionState m5963c(String data) {
        CryptHandler.Companion companion = CryptHandler.INSTANCE;
        if (companion.m5954a(data)) {
            return EncryptionState.ENCRYPTED_AES;
        }
        return companion.m5955b(data) ? EncryptionState.ENCRYPTED_AES_GCM : EncryptionState.PLAIN_TEXT;
    }

    /* JADX INFO: renamed from: d */
    private final EncryptionState m5964d(boolean encrypt) {
        return encrypt ? EncryptionState.ENCRYPTED_AES_GCM : EncryptionState.PLAIN_TEXT;
    }

    /* JADX INFO: renamed from: e */
    private final boolean m5965e(EncryptionLevel level, EncryptionLevel storedLevel, boolean firstUpgrade) {
        boolean zM5969i = m5969i(level, firstUpgrade);
        boolean zM5970j = m5970j(level);
        boolean zM5972m = m5972m(level);
        EncryptionLevel encryptionLevel = EncryptionLevel.FULL_DATA;
        if (encryptionLevel == storedLevel || encryptionLevel == level) {
            m5974o();
            m5973n();
            m5971l();
        }
        return zM5969i && zM5970j && zM5972m;
    }

    /* JADX INFO: renamed from: f */
    private final C1177d m5966f(EncryptionState targetState, String data) {
        String strMo5948a = this.cryptHandler.mo5948a(data);
        if (b.f4877a[targetState.ordinal()] == 3) {
            if (strMo5948a != null) {
                data = strMo5948a;
            }
            return new C1177d(data, strMo5948a != null);
        }
        this.logger.verbose(this.logPrefix, "Invalid transition from ENCRYPTED_AES_GCM to " + targetState);
        return C1177d.INSTANCE.m5980a(data);
    }

    /* JADX INFO: renamed from: g */
    private final C1177d m5967g(EncryptionState targetState, String data) {
        String strMo5953f = this.cryptHandler.mo5953f(data, CryptHandler.EncryptionAlgorithm.AES);
        int i = b.f4877a[targetState.ordinal()];
        if (i == 2) {
            String strMo5952e = strMo5953f != null ? this.cryptHandler.mo5952e(strMo5953f) : null;
            return new C1177d(strMo5952e == null ? strMo5953f : strMo5952e, strMo5952e != null || strMo5953f == null);
        }
        if (i == 3) {
            if (strMo5953f != null) {
                data = strMo5953f;
            }
            return new C1177d(data, strMo5953f != null);
        }
        this.logger.verbose(this.logPrefix, "Invalid transition from ENCRYPTED_AES to " + targetState);
        return C1177d.INSTANCE.m5980a(data);
    }

    /* JADX INFO: renamed from: h */
    private final C1177d m5968h(EncryptionState targetState, String data) {
        if (b.f4877a[targetState.ordinal()] == 2) {
            String strMo5952e = this.cryptHandler.mo5952e(data);
            if (strMo5952e != null) {
                data = strMo5952e;
            }
            return new C1177d(data, strMo5952e != null);
        }
        this.logger.verbose(this.logPrefix, "Invalid transition from PLAIN_TEXT to " + targetState);
        return C1177d.INSTANCE.m5980a(data);
    }

    /* JADX INFO: renamed from: i */
    private final boolean m5969i(EncryptionLevel level, boolean firstUpgrade) {
        String strM187170c;
        this.logger.verbose(this.logPrefix, "Migrating encryption level for cachedGUIDsKey prefs");
        if (firstUpgrade) {
            JSONObject jSONObjectM5962b = m5962b();
            int length = jSONObjectM5962b.length();
            this.dataMigrationRepository.m187174g(length);
            if (length == 0) {
                this.dataMigrationRepository.m187172e();
                return true;
            }
            strM187170c = jSONObjectM5962b.toString();
            strM187170c.getClass();
        } else {
            strM187170c = this.dataMigrationRepository.m187170c();
            if (strM187170c == null) {
                return true;
            }
        }
        C1177d c1177dM5975p = m5975p(level, strM187170c);
        this.dataMigrationRepository.m187173f(c1177dM5975p.getData());
        this.logger.verbose(this.logPrefix, "Cached GUIDs migrated with success = " + c1177dM5975p + ".migrationSuccessful = " + c1177dM5975p.getData());
        return c1177dM5975p.getMigrationSuccessful();
    }

    /* JADX INFO: renamed from: j */
    private final boolean m5970j(EncryptionLevel level) {
        this.logger.verbose(this.logPrefix, "Migrating encryption level for user profiles in DB");
        boolean z = true;
        for (Map.Entry<String, JSONObject> entry : this.dataMigrationRepository.m187176i().entrySet()) {
            String key = entry.getKey();
            JSONObject value = entry.getValue();
            try {
                HashSet<String> hashSet = Constants.piiDBKeys;
                hashSet.getClass();
                for (String str : hashSet) {
                    str.getClass();
                    String strM204934a = wpq.m204934a(value, str);
                    if (strM204934a != null) {
                        C1177d c1177dM5975p = m5975p(EncryptionLevel.FULL_DATA == level ? EncryptionLevel.NONE : level, strM204934a);
                        z = z && c1177dM5975p.getMigrationSuccessful();
                        value.put(str, c1177dM5975p.getData());
                    }
                }
                this.logger.verbose(this.logPrefix, "DB migrated with success = " + z + " = " + value);
                if (this.dataMigrationRepository.m187175h(key, value) <= -1) {
                    z = false;
                }
            } catch (Exception e) {
                this.logger.verbose(this.logPrefix, "Error migrating profile " + key + ": " + e);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: l */
    private final void m5971l() {
        tzb tzbVar = this.dbAdapter;
        tzbVar.m191158I(Table.EVENTS);
        tzbVar.m191158I(Table.PROFILE_EVENTS);
    }

    /* JADX INFO: renamed from: m */
    private final boolean m5972m(final EncryptionLevel level) {
        this.logger.verbose(this.logPrefix, "Migrating encryption for InAppData");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        Function1<? super String, String> function1 = new Function1() { // from class: l.fwb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C1175b.m5961a(this.f99634a, level, booleanRef, (String) obj);
            }
        };
        this.dataMigrationRepository.m187171d(CollectionsKt.listOf((Object[]) new String[]{"inapp_notifs_cs", "inApp"}), function1);
        return booleanRef.element;
    }

    /* JADX INFO: renamed from: n */
    private final boolean m5973n() {
        Map<String, JSONObject> mapM187176i = this.dataMigrationRepository.m187176i();
        ArrayList arrayList = new ArrayList(mapM187176i.size());
        Iterator<Map.Entry<String, JSONObject>> it = mapM187176i.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.dbAdapter.m191168S(this.dbAdapter.m191185y((String) it2.next()));
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    private final boolean m5974o() {
        String strM138035a = this.variablesRepo.m138035a();
        if (strM138035a != null) {
            this.variablesRepo.m138037c(strM138035a);
            return true;
        }
        this.logger.verbose("Skipping variable migration as there is no data");
        return true;
    }

    /* JADX INFO: renamed from: p */
    private final C1177d m5975p(EncryptionLevel level, String data) {
        return m5976q(m5963c(data), m5964d(level.shouldEncrypt()), data);
    }

    /* JADX INFO: renamed from: q */
    private final C1177d m5976q(EncryptionState currentState, EncryptionState targetState, String data) {
        if (currentState == targetState) {
            return new C1177d(data, true);
        }
        int i = b.f4877a[currentState.ordinal()];
        if (i == 1) {
            return m5967g(targetState, data);
        }
        if (i == 2) {
            return m5966f(targetState, data);
        }
        if (i == 3) {
            return m5968h(targetState, data);
        }
        l9r.m149037a();
        return null;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C1175b)) {
            return false;
        }
        C1175b c1175b = (C1175b) other;
        return Intrinsics.m87488d(this.logPrefix, c1175b.logPrefix) && this.configEncryptionLevel == c1175b.configEncryptionLevel && Intrinsics.m87488d(this.logger, c1175b.logger) && Intrinsics.m87488d(this.cryptHandler, c1175b.cryptHandler) && Intrinsics.m87488d(this.cryptRepository, c1175b.cryptRepository) && Intrinsics.m87488d(this.dataMigrationRepository, c1175b.dataMigrationRepository) && Intrinsics.m87488d(this.variablesRepo, c1175b.variablesRepo) && Intrinsics.m87488d(this.dbAdapter, c1175b.dbAdapter);
    }

    public int hashCode() {
        return (((((((((((((this.logPrefix.hashCode() * 31) + Integer.hashCode(this.configEncryptionLevel)) * 31) + this.logger.hashCode()) * 31) + this.cryptHandler.hashCode()) * 31) + this.cryptRepository.hashCode()) * 31) + this.dataMigrationRepository.hashCode()) * 31) + this.variablesRepo.hashCode()) * 31) + this.dbAdapter.hashCode();
    }

    /* JADX INFO: renamed from: k */
    public final void m5977k() {
        int iM128392c = this.cryptRepository.m128392c();
        int iM128391b = this.cryptRepository.m128391b();
        boolean zM128390a = this.cryptRepository.m128390a();
        if (!zM128390a || (iM128392c != this.configEncryptionLevel && iM128391b != -1)) {
            iM128391b = 1;
        }
        nul nulVar = this.logger;
        if (iM128391b == 0) {
            nulVar.verbose(this.logPrefix, "Migration not required: config-encryption-level " + this.configEncryptionLevel + ", stored-encryption-level " + iM128392c);
            return;
        }
        nulVar.verbose(this.logPrefix, "Starting migration from encryption level " + iM128392c + " to " + this.configEncryptionLevel + " with migrationFailureCount " + iM128391b + " and isSSInAppDataMigrated " + zM128390a);
        EncryptionLevel.Companion companion = EncryptionLevel.INSTANCE;
        boolean zM5965e = m5965e(companion.m5957a(this.configEncryptionLevel), companion.m5957a(iM128392c), iM128391b == -1);
        if (zM5965e) {
            this.cryptRepository.m128393d(this.configEncryptionLevel);
        }
        this.cryptRepository.m128394e(zM5965e);
        this.cryptRepository.m128395f(zM5965e);
    }

    @NotNull
    public String toString() {
        return "CryptMigrator(logPrefix=" + this.logPrefix + ", configEncryptionLevel=" + this.configEncryptionLevel + ", logger=" + this.logger + ", cryptHandler=" + this.cryptHandler + ", cryptRepository=" + this.cryptRepository + ", dataMigrationRepository=" + this.dataMigrationRepository + ", variablesRepo=" + this.variablesRepo + ", dbAdapter=" + this.dbAdapter + ')';
    }
}
