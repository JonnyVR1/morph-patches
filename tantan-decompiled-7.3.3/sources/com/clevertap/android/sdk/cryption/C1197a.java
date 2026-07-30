package com.clevertap.android.sdk.cryption;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p153l.C16671e;
import p153l.C17361h;
import p153l.mw3;
import p153l.nbr;
import p153l.rxb;

/* JADX INFO: renamed from: com.clevertap.android.sdk.cryption.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m88121d2 = {"Lcom/clevertap/android/sdk/cryption/a;", "", "", "accountId", "Ll/mw3;", "ctKeyGenerator", "<init>", "(Ljava/lang/String;Ll/mw3;)V", "Lcom/clevertap/android/sdk/cryption/CryptHandler$EncryptionAlgorithm;", "algorithm", "Ll/rxb;", "b", "(Lcom/clevertap/android/sdk/cryption/CryptHandler$EncryptionAlgorithm;)Ll/rxb;", "Ll/h;", "a", "()Ll/h;", "Ljava/lang/String;", "Ll/mw3;", "", "c", "Ljava/util/Map;", "cryptInstances", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C1197a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String accountId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final mw3 ctKeyGenerator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Map<CryptHandler.EncryptionAlgorithm, rxb> cryptInstances;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.cryption.a$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Lcom/clevertap/android/sdk/cryption/a$a;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/cryption/CryptHandler$EncryptionAlgorithm;", "type", "", "accountID", "Ll/mw3;", "ctKeyGenerator", "Ll/rxb;", "a", "(Lcom/clevertap/android/sdk/cryption/CryptHandler$EncryptionAlgorithm;Ljava/lang/String;Ll/mw3;)Ll/rxb;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.clevertap.android.sdk.cryption.a$a$a, reason: collision with other inner class name */
        @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
        public /* synthetic */ class C22778a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f4905a;

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
                f4905a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final rxb m6014a(@NotNull CryptHandler.EncryptionAlgorithm type, @NotNull String accountID, @NotNull mw3 ctKeyGenerator) {
            type.getClass();
            accountID.getClass();
            ctKeyGenerator.getClass();
            int i = C22778a.f4905a[type.ordinal()];
            if (i == 1) {
                return new C16671e(accountID);
            }
            if (i == 2) {
                return new C17361h(ctKeyGenerator);
            }
            nbr.m162172a();
            return null;
        }

        private Companion() {
        }
    }

    public C1197a(@NotNull String str, @NotNull mw3 mw3Var) {
        str.getClass();
        mw3Var.getClass();
        this.accountId = str;
        this.ctKeyGenerator = mw3Var;
        this.cryptInstances = new LinkedHashMap();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C17361h m6012a() {
        Map<CryptHandler.EncryptionAlgorithm, rxb> map = this.cryptInstances;
        CryptHandler.EncryptionAlgorithm encryptionAlgorithm = CryptHandler.EncryptionAlgorithm.AES_GCM;
        rxb rxbVarM6014a = map.get(encryptionAlgorithm);
        if (rxbVarM6014a == null) {
            rxbVarM6014a = INSTANCE.m6014a(encryptionAlgorithm, this.accountId, this.ctKeyGenerator);
            map.put(encryptionAlgorithm, rxbVarM6014a);
        }
        rxbVarM6014a.getClass();
        return (C17361h) rxbVarM6014a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final rxb m6013b(@NotNull CryptHandler.EncryptionAlgorithm algorithm) {
        algorithm.getClass();
        Map<CryptHandler.EncryptionAlgorithm, rxb> map = this.cryptInstances;
        rxb rxbVarM6014a = map.get(algorithm);
        if (rxbVarM6014a == null) {
            rxbVarM6014a = INSTANCE.m6014a(algorithm, this.accountId, this.ctKeyGenerator);
            map.put(algorithm, rxbVarM6014a);
        }
        return rxbVarM6014a;
    }
}
