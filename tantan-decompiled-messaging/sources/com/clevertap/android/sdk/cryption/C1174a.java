package com.clevertap.android.sdk.cryption;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p149l.C16508e;
import p149l.C17211h;
import p149l.dwb;
import p149l.l9r;
import p149l.nv3;

/* JADX INFO: renamed from: com.clevertap.android.sdk.cryption.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m87232d2 = {"Lcom/clevertap/android/sdk/cryption/a;", "", "", "accountId", "Ll/nv3;", "ctKeyGenerator", "<init>", "(Ljava/lang/String;Ll/nv3;)V", "Lcom/clevertap/android/sdk/cryption/CryptHandler$EncryptionAlgorithm;", "algorithm", "Ll/dwb;", "b", "(Lcom/clevertap/android/sdk/cryption/CryptHandler$EncryptionAlgorithm;)Ll/dwb;", "Ll/h;", "a", "()Ll/h;", "Ljava/lang/String;", "Ll/nv3;", "", "c", "Ljava/util/Map;", "cryptInstances", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class C1174a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String accountId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final nv3 ctKeyGenerator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Map<CryptHandler.EncryptionAlgorithm, dwb> cryptInstances;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.cryption.a$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Lcom/clevertap/android/sdk/cryption/a$a;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/cryption/CryptHandler$EncryptionAlgorithm;", "type", "", "accountID", "Ll/nv3;", "ctKeyGenerator", "Ll/dwb;", "a", "(Lcom/clevertap/android/sdk/cryption/CryptHandler$EncryptionAlgorithm;Ljava/lang/String;Ll/nv3;)Ll/dwb;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.clevertap.android.sdk.cryption.a$a$a, reason: collision with other inner class name */
        @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
        public /* synthetic */ class C22662a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f4868a;

            static {
                int[] iArr = new int[CryptHandler.EncryptionAlgorithm.values().length];
                try {
                    iArr[CryptHandler.EncryptionAlgorithm.AES.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CryptHandler.EncryptionAlgorithm.AES_GCM.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f4868a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final dwb m5960a(@NotNull CryptHandler.EncryptionAlgorithm type, @NotNull String accountID, @NotNull nv3 ctKeyGenerator) {
            type.getClass();
            accountID.getClass();
            ctKeyGenerator.getClass();
            int i = C22662a.f4868a[type.ordinal()];
            if (i == 1) {
                return new C16508e(accountID);
            }
            if (i == 2) {
                return new C17211h(ctKeyGenerator);
            }
            l9r.m149037a();
            return null;
        }

        private Companion() {
        }
    }

    public C1174a(@NotNull String str, @NotNull nv3 nv3Var) {
        str.getClass();
        nv3Var.getClass();
        this.accountId = str;
        this.ctKeyGenerator = nv3Var;
        this.cryptInstances = new LinkedHashMap();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C17211h m5958a() {
        Map<CryptHandler.EncryptionAlgorithm, dwb> map = this.cryptInstances;
        CryptHandler.EncryptionAlgorithm encryptionAlgorithm = CryptHandler.EncryptionAlgorithm.AES_GCM;
        dwb dwbVarM5960a = map.get(encryptionAlgorithm);
        if (dwbVarM5960a == null) {
            dwbVarM5960a = INSTANCE.m5960a(encryptionAlgorithm, this.accountId, this.ctKeyGenerator);
            map.put(encryptionAlgorithm, dwbVarM5960a);
        }
        dwbVarM5960a.getClass();
        return (C17211h) dwbVarM5960a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final dwb m5959b(@NotNull CryptHandler.EncryptionAlgorithm algorithm) {
        algorithm.getClass();
        Map<CryptHandler.EncryptionAlgorithm, dwb> map = this.cryptInstances;
        dwb dwbVarM5960a = map.get(algorithm);
        if (dwbVarM5960a == null) {
            dwbVarM5960a = INSTANCE.m5960a(algorithm, this.accountId, this.ctKeyGenerator);
            map.put(algorithm, dwbVarM5960a);
        }
        return dwbVarM5960a;
    }
}
