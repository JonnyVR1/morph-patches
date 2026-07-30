package com.clevertap.android.sdk.cryption;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.cryption.C1198b;
import com.clevertap.android.sdk.p014db.Table;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p153l.axl;
import p153l.b6c;
import p153l.h1c;
import p153l.nbr;
import p153l.o1l0;
import p153l.uxb;
import p153l.xrq;

/* JADX INFO: renamed from: com.clevertap.android.sdk.cryption.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0080\b\u0018\u0000 L2\u00020\u0001:\u0001CBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b(\u0010'J\u001f\u0010+\u001a\u00020*2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,J'\u00100\u001a\u00020*2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020*2\u0006\u0010/\u001a\u00020-2\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020*2\u0006\u0010/\u001a\u00020-2\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b4\u00103J\u001f\u00105\u001a\u00020*2\u0006\u0010/\u001a\u00020-2\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b5\u00103J\u0017\u00107\u001a\u00020-2\u0006\u00106\u001a\u00020\u0017H\u0002¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020-2\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u001e¢\u0006\u0004\b;\u0010 J\u0010\u0010<\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b>\u0010?J\u001a\u0010A\u001a\u00020\u00172\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010FR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010GR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010HR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010IR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010JR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010K¨\u0006M"}, m88121d2 = {"Lcom/clevertap/android/sdk/cryption/b;", "", "", "logPrefix", "", "configEncryptionLevel", "Ll/axl;", "logger", "Lcom/clevertap/android/sdk/cryption/c;", "cryptHandler", "Ll/uxb;", "cryptRepository", "Ll/b6c;", "dataMigrationRepository", "Ll/o1l0;", "variablesRepo", "Ll/h1c;", "dbAdapter", "<init>", "(Ljava/lang/String;ILl/axl;Lcom/clevertap/android/sdk/cryption/c;Ll/uxb;Ll/b6c;Ll/o1l0;Ll/h1c;)V", "Lcom/clevertap/android/sdk/cryption/EncryptionLevel;", FirebaseAnalytics.Param.LEVEL, "storedLevel", "", "firstUpgrade", "e", "(Lcom/clevertap/android/sdk/cryption/EncryptionLevel;Lcom/clevertap/android/sdk/cryption/EncryptionLevel;Z)Z", "o", "()Z", "n", "", BLiveStormDanmakuGiftResourceType.f45292l, "()V", RXScreenCaptureService.KEY_INDEX, "(Lcom/clevertap/android/sdk/cryption/EncryptionLevel;Z)Z", "Lorg/json/JSONObject;", "b", "()Lorg/json/JSONObject;", "j", "(Lcom/clevertap/android/sdk/cryption/EncryptionLevel;)Z", "m", "data", "Lcom/clevertap/android/sdk/cryption/d;", "p", "(Lcom/clevertap/android/sdk/cryption/EncryptionLevel;Ljava/lang/String;)Lcom/clevertap/android/sdk/cryption/d;", "Lcom/clevertap/android/sdk/cryption/EncryptionState;", "currentState", "targetState", "q", "(Lcom/clevertap/android/sdk/cryption/EncryptionState;Lcom/clevertap/android/sdk/cryption/EncryptionState;Ljava/lang/String;)Lcom/clevertap/android/sdk/cryption/d;", "g", "(Lcom/clevertap/android/sdk/cryption/EncryptionState;Ljava/lang/String;)Lcom/clevertap/android/sdk/cryption/d;", "f", "h", "encrypt", Constants.INAPP_DATA_TAG, "(Z)Lcom/clevertap/android/sdk/cryption/EncryptionState;", "c", "(Ljava/lang/String;)Lcom/clevertap/android/sdk/cryption/EncryptionState;", "k", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "I", "Ll/axl;", "Lcom/clevertap/android/sdk/cryption/c;", "Ll/uxb;", "Ll/b6c;", "Ll/o1l0;", "Ll/h1c;", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final /* data */ class C1198b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String logPrefix;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int configEncryptionLevel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC1199c cryptHandler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final uxb cryptRepository;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final b6c dataMigrationRepository;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final o1l0 variablesRepo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final h1c dbAdapter;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.cryption.b$b */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4914a;

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
            f4914a = iArr;
        }
    }

    public C1198b(@NotNull String str, int i, @NotNull axl axlVar, @NotNull InterfaceC1199c interfaceC1199c, @NotNull uxb uxbVar, @NotNull b6c b6cVar, @NotNull o1l0 o1l0Var, @NotNull h1c h1cVar) {
        str.getClass();
        axlVar.getClass();
        interfaceC1199c.getClass();
        uxbVar.getClass();
        b6cVar.getClass();
        o1l0Var.getClass();
        h1cVar.getClass();
        this.logPrefix = str;
        this.configEncryptionLevel = i;
        this.logger = axlVar;
        this.cryptHandler = interfaceC1199c;
        this.cryptRepository = uxbVar;
        this.dataMigrationRepository = b6cVar;
        this.variablesRepo = o1l0Var;
        this.dbAdapter = h1cVar;
    }

    /* JADX INFO: renamed from: a */
    public static String m6015a(C1198b c1198b, EncryptionLevel encryptionLevel, Ref.BooleanRef booleanRef, String str) {
        c1198b.getClass();
        encryptionLevel.getClass();
        booleanRef.getClass();
        str.getClass();
        C1200d c1200dM6029p = c1198b.m6029p(encryptionLevel, str);
        booleanRef.element = booleanRef.element && c1200dM6029p.getMigrationSuccessful();
        return c1200dM6029p.getData();
    }

    /* JADX INFO: renamed from: b */
    private final JSONObject m6016b() {
        JSONObject jSONObjectM102727b = this.dataMigrationRepository.m102727b();
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator<String> itKeys = jSONObjectM102727b.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                next.getClass();
                List listSplit$default = StringsKt.split$default(next, new String[]{"_"}, false, 2, 2, null);
                String str = (String) listSplit$default.get(0);
                C1200d c1200dM6029p = m6029p(EncryptionLevel.NONE, (String) listSplit$default.get(1));
                if (c1200dM6029p.getMigrationSuccessful()) {
                    jSONObject.put(str + '_' + c1200dM6029p.getData(), jSONObjectM102727b.get(next));
                }
            }
            return jSONObject;
        } catch (Throwable th) {
            this.logger.verbose(this.logPrefix, "Error migrating format for cached GUIDs: Clearing and starting fresh " + th);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: c */
    private final EncryptionState m6017c(String data) {
        CryptHandler.Companion companion = CryptHandler.INSTANCE;
        if (companion.m6008a(data)) {
            return EncryptionState.ENCRYPTED_AES;
        }
        return companion.m6009b(data) ? EncryptionState.ENCRYPTED_AES_GCM : EncryptionState.PLAIN_TEXT;
    }

    /* JADX INFO: renamed from: d */
    private final EncryptionState m6018d(boolean encrypt) {
        return encrypt ? EncryptionState.ENCRYPTED_AES_GCM : EncryptionState.PLAIN_TEXT;
    }

    /* JADX INFO: renamed from: e */
    private final boolean m6019e(EncryptionLevel level, EncryptionLevel storedLevel, boolean firstUpgrade) {
        boolean zM6023i = m6023i(level, firstUpgrade);
        boolean zM6024j = m6024j(level);
        boolean zM6026m = m6026m(level);
        EncryptionLevel encryptionLevel = EncryptionLevel.FULL_DATA;
        if (encryptionLevel == storedLevel || encryptionLevel == level) {
            m6028o();
            m6027n();
            m6025l();
        }
        return zM6023i && zM6024j && zM6026m;
    }

    /* JADX INFO: renamed from: f */
    private final C1200d m6020f(EncryptionState targetState, String data) {
        String strMo6002a = this.cryptHandler.mo6002a(data);
        if (b.f4914a[targetState.ordinal()] == 3) {
            if (strMo6002a != null) {
                data = strMo6002a;
            }
            return new C1200d(data, strMo6002a != null);
        }
        this.logger.verbose(this.logPrefix, "Invalid transition from ENCRYPTED_AES_GCM to " + targetState);
        return C1200d.INSTANCE.m6034a(data);
    }

    /* JADX INFO: renamed from: g */
    private final C1200d m6021g(EncryptionState targetState, String data) {
        String strMo6007f = this.cryptHandler.mo6007f(data, CryptHandler.EncryptionAlgorithm.AES);
        int i = b.f4914a[targetState.ordinal()];
        if (i == 2) {
            String strMo6006e = strMo6007f != null ? this.cryptHandler.mo6006e(strMo6007f) : null;
            return new C1200d(strMo6006e == null ? strMo6007f : strMo6006e, strMo6006e != null || strMo6007f == null);
        }
        if (i == 3) {
            if (strMo6007f != null) {
                data = strMo6007f;
            }
            return new C1200d(data, strMo6007f != null);
        }
        this.logger.verbose(this.logPrefix, "Invalid transition from ENCRYPTED_AES to " + targetState);
        return C1200d.INSTANCE.m6034a(data);
    }

    /* JADX INFO: renamed from: h */
    private final C1200d m6022h(EncryptionState targetState, String data) {
        if (b.f4914a[targetState.ordinal()] == 2) {
            String strMo6006e = this.cryptHandler.mo6006e(data);
            if (strMo6006e != null) {
                data = strMo6006e;
            }
            return new C1200d(data, strMo6006e != null);
        }
        this.logger.verbose(this.logPrefix, "Invalid transition from PLAIN_TEXT to " + targetState);
        return C1200d.INSTANCE.m6034a(data);
    }

    /* JADX INFO: renamed from: i */
    private final boolean m6023i(EncryptionLevel level, boolean firstUpgrade) {
        String strM102728c;
        this.logger.verbose(this.logPrefix, "Migrating encryption level for cachedGUIDsKey prefs");
        if (firstUpgrade) {
            JSONObject jSONObjectM6016b = m6016b();
            int length = jSONObjectM6016b.length();
            this.dataMigrationRepository.m102732g(length);
            if (length == 0) {
                this.dataMigrationRepository.m102730e();
                return true;
            }
            strM102728c = jSONObjectM6016b.toString();
            strM102728c.getClass();
        } else {
            strM102728c = this.dataMigrationRepository.m102728c();
            if (strM102728c == null) {
                return true;
            }
        }
        C1200d c1200dM6029p = m6029p(level, strM102728c);
        this.dataMigrationRepository.m102731f(c1200dM6029p.getData());
        this.logger.verbose(this.logPrefix, "Cached GUIDs migrated with success = " + c1200dM6029p + ".migrationSuccessful = " + c1200dM6029p.getData());
        return c1200dM6029p.getMigrationSuccessful();
    }

    /* JADX INFO: renamed from: j */
    private final boolean m6024j(EncryptionLevel level) {
        this.logger.verbose(this.logPrefix, "Migrating encryption level for user profiles in DB");
        boolean z = true;
        for (Map.Entry<String, JSONObject> entry : this.dataMigrationRepository.m102734i().entrySet()) {
            String key = entry.getKey();
            JSONObject value = entry.getValue();
            try {
                HashSet<String> hashSet = Constants.piiDBKeys;
                hashSet.getClass();
                for (String str : hashSet) {
                    str.getClass();
                    String strM212846a = xrq.m212846a(value, str);
                    if (strM212846a != null) {
                        C1200d c1200dM6029p = m6029p(EncryptionLevel.FULL_DATA == level ? EncryptionLevel.NONE : level, strM212846a);
                        z = z && c1200dM6029p.getMigrationSuccessful();
                        value.put(str, c1200dM6029p.getData());
                    }
                }
                this.logger.verbose(this.logPrefix, "DB migrated with success = " + z + " = " + value);
                if (this.dataMigrationRepository.m102733h(key, value) <= -1) {
                    z = false;
                }
            } catch (Exception e) {
                this.logger.verbose(this.logPrefix, "Error migrating profile " + key + ": " + e);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: l */
    private final void m6025l() {
        h1c h1cVar = this.dbAdapter;
        h1cVar.m133290I(Table.EVENTS);
        h1cVar.m133290I(Table.PROFILE_EVENTS);
    }

    /* JADX INFO: renamed from: m */
    private final boolean m6026m(final EncryptionLevel level) {
        this.logger.verbose(this.logPrefix, "Migrating encryption for InAppData");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        Function1<? super String, String> function1 = new Function1() { // from class: l.txb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C1198b.m6015a(this.f176537a, level, booleanRef, (String) obj);
            }
        };
        this.dataMigrationRepository.m102729d(CollectionsKt.listOf((Object[]) new String[]{"inapp_notifs_cs", "inApp"}), function1);
        return booleanRef.element;
    }

    /* JADX INFO: renamed from: n */
    private final boolean m6027n() {
        Map<String, JSONObject> mapM102734i = this.dataMigrationRepository.m102734i();
        ArrayList arrayList = new ArrayList(mapM102734i.size());
        Iterator<Map.Entry<String, JSONObject>> it = mapM102734i.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.dbAdapter.m133300S(this.dbAdapter.m133317y((String) it2.next()));
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    private final boolean m6028o() {
        String strM165653a = this.variablesRepo.m165653a();
        if (strM165653a != null) {
            this.variablesRepo.m165655c(strM165653a);
            return true;
        }
        this.logger.verbose("Skipping variable migration as there is no data");
        return true;
    }

    /* JADX INFO: renamed from: p */
    private final C1200d m6029p(EncryptionLevel level, String data) {
        return m6030q(m6017c(data), m6018d(level.shouldEncrypt()), data);
    }

    /* JADX INFO: renamed from: q */
    private final C1200d m6030q(EncryptionState currentState, EncryptionState targetState, String data) {
        if (currentState == targetState) {
            return new C1200d(data, true);
        }
        int i = b.f4914a[currentState.ordinal()];
        if (i == 1) {
            return m6021g(targetState, data);
        }
        if (i == 2) {
            return m6020f(targetState, data);
        }
        if (i == 3) {
            return m6022h(targetState, data);
        }
        nbr.m162172a();
        return null;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C1198b)) {
            return false;
        }
        C1198b c1198b = (C1198b) other;
        return Intrinsics.m88377d(this.logPrefix, c1198b.logPrefix) && this.configEncryptionLevel == c1198b.configEncryptionLevel && Intrinsics.m88377d(this.logger, c1198b.logger) && Intrinsics.m88377d(this.cryptHandler, c1198b.cryptHandler) && Intrinsics.m88377d(this.cryptRepository, c1198b.cryptRepository) && Intrinsics.m88377d(this.dataMigrationRepository, c1198b.dataMigrationRepository) && Intrinsics.m88377d(this.variablesRepo, c1198b.variablesRepo) && Intrinsics.m88377d(this.dbAdapter, c1198b.dbAdapter);
    }

    public int hashCode() {
        return (((((((((((((this.logPrefix.hashCode() * 31) + Integer.hashCode(this.configEncryptionLevel)) * 31) + this.logger.hashCode()) * 31) + this.cryptHandler.hashCode()) * 31) + this.cryptRepository.hashCode()) * 31) + this.dataMigrationRepository.hashCode()) * 31) + this.variablesRepo.hashCode()) * 31) + this.dbAdapter.hashCode();
    }

    /* JADX INFO: renamed from: k */
    public final void m6031k() {
        int iM198408c = this.cryptRepository.m198408c();
        int iM198407b = this.cryptRepository.m198407b();
        boolean zM198406a = this.cryptRepository.m198406a();
        if (!zM198406a || (iM198408c != this.configEncryptionLevel && iM198407b != -1)) {
            iM198407b = 1;
        }
        axl axlVar = this.logger;
        if (iM198407b == 0) {
            axlVar.verbose(this.logPrefix, "Migration not required: config-encryption-level " + this.configEncryptionLevel + ", stored-encryption-level " + iM198408c);
            return;
        }
        axlVar.verbose(this.logPrefix, "Starting migration from encryption level " + iM198408c + " to " + this.configEncryptionLevel + " with migrationFailureCount " + iM198407b + " and isSSInAppDataMigrated " + zM198406a);
        EncryptionLevel.Companion companion = EncryptionLevel.INSTANCE;
        boolean zM6019e = m6019e(companion.m6011a(this.configEncryptionLevel), companion.m6011a(iM198408c), iM198407b == -1);
        if (zM6019e) {
            this.cryptRepository.m198409d(this.configEncryptionLevel);
        }
        this.cryptRepository.m198410e(zM6019e);
        this.cryptRepository.m198411f(zM6019e);
    }

    @NotNull
    public String toString() {
        return "CryptMigrator(logPrefix=" + this.logPrefix + ", configEncryptionLevel=" + this.configEncryptionLevel + ", logger=" + this.logger + ", cryptHandler=" + this.cryptHandler + ", cryptRepository=" + this.cryptRepository + ", dataMigrationRepository=" + this.dataMigrationRepository + ", variablesRepo=" + this.variablesRepo + ", dbAdapter=" + this.dbAdapter + ')';
    }
}
