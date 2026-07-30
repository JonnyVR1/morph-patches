package com.clevertap.android.sdk.cryption;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.gwb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ!\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001a¨\u0006\u001d"}, m87232d2 = {"Lcom/clevertap/android/sdk/cryption/CryptHandler;", "Lcom/clevertap/android/sdk/cryption/c;", "Ll/gwb;", "repository", "Lcom/clevertap/android/sdk/cryption/a;", "cryptFactory", "<init>", "(Ll/gwb;Lcom/clevertap/android/sdk/cryption/a;)V", "", "plainText", "c", "(Ljava/lang/String;)Ljava/lang/String;", "cipherText", Constants.INAPP_DATA_TAG, "e", "a", "Lcom/clevertap/android/sdk/cryption/CryptHandler$EncryptionAlgorithm;", "algorithm", "f", "(Ljava/lang/String;Lcom/clevertap/android/sdk/cryption/CryptHandler$EncryptionAlgorithm;)Ljava/lang/String;", "", "migrationSuccessful", "", "b", "(Z)V", "Ll/gwb;", "Lcom/clevertap/android/sdk/cryption/a;", "Companion", "EncryptionAlgorithm", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class CryptHandler implements InterfaceC1176c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    private static final EncryptionAlgorithm f4862c = EncryptionAlgorithm.AES_GCM;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final gwb repository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final C1174a cryptFactory;

    @Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m87232d2 = {"Lcom/clevertap/android/sdk/cryption/CryptHandler$EncryptionAlgorithm;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "AES", "AES_GCM", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public enum EncryptionAlgorithm {
        AES(0),
        AES_GCM(1);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());
        private final int value;

        EncryptionAlgorithm(int i) {
            this.value = i;
        }

        @NotNull
        public static EnumEntries<EncryptionAlgorithm> getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.cryption.CryptHandler$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, m87232d2 = {"Lcom/clevertap/android/sdk/cryption/CryptHandler$a;", "", "<init>", "()V", "", "plainText", "", "c", "(Ljava/lang/String;)Z", "a", "b", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m5954a(@NotNull String plainText) {
            plainText.getClass();
            return C15386d.m93483J(plainText, "[", false, 2, null) && C15386d.m93489w(plainText, Constants.AES_SUFFIX, false, 2, null);
        }

        /* JADX INFO: renamed from: b */
        public final boolean m5955b(@NotNull String plainText) {
            plainText.getClass();
            return C15386d.m93483J(plainText, Constants.AES_GCM_PREFIX, false, 2, null) && C15386d.m93489w(plainText, Constants.AES_GCM_SUFFIX, false, 2, null);
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final boolean m5956c(@NotNull String plainText) {
            plainText.getClass();
            return m5954a(plainText) || m5955b(plainText);
        }

        private Companion() {
        }
    }

    public CryptHandler(@NotNull gwb gwbVar, @NotNull C1174a c1174a) {
        gwbVar.getClass();
        c1174a.getClass();
        this.repository = gwbVar;
        this.cryptFactory = c1174a;
    }

    @Override // com.clevertap.android.sdk.cryption.InterfaceC1176c
    @Nullable
    /* JADX INFO: renamed from: a */
    public String mo5948a(@NotNull String cipherText) {
        cipherText.getClass();
        return this.cryptFactory.m5959b(f4862c).mo113864a(cipherText);
    }

    @Override // com.clevertap.android.sdk.cryption.InterfaceC1176c
    /* JADX INFO: renamed from: b */
    public void mo5949b(boolean migrationSuccessful) {
        this.repository.m128395f(migrationSuccessful);
    }

    @Override // com.clevertap.android.sdk.cryption.InterfaceC1176c
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo5950c(@NotNull String plainText) {
        plainText.getClass();
        return INSTANCE.m5955b(plainText) ? plainText : this.cryptFactory.m5959b(f4862c).mo113865b(plainText);
    }

    @Override // com.clevertap.android.sdk.cryption.InterfaceC1176c
    @Nullable
    /* JADX INFO: renamed from: d */
    public String mo5951d(@NotNull String cipherText) {
        cipherText.getClass();
        return !INSTANCE.m5955b(cipherText) ? cipherText : this.cryptFactory.m5959b(f4862c).mo113864a(cipherText);
    }

    @Override // com.clevertap.android.sdk.cryption.InterfaceC1176c
    @Nullable
    /* JADX INFO: renamed from: e */
    public String mo5952e(@NotNull String plainText) {
        plainText.getClass();
        return this.cryptFactory.m5959b(f4862c).mo113865b(plainText);
    }

    @Override // com.clevertap.android.sdk.cryption.InterfaceC1176c
    @Nullable
    /* JADX INFO: renamed from: f */
    public String mo5953f(@NotNull String cipherText, @NotNull EncryptionAlgorithm algorithm) {
        cipherText.getClass();
        algorithm.getClass();
        return this.cryptFactory.m5959b(algorithm).mo113864a(cipherText);
    }
}
