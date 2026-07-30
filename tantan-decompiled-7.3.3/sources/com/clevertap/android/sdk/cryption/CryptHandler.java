package com.clevertap.android.sdk.cryption;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.uxb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ!\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001a¨\u0006\u001d"}, m88121d2 = {"Lcom/clevertap/android/sdk/cryption/CryptHandler;", "Lcom/clevertap/android/sdk/cryption/c;", "Ll/uxb;", "repository", "Lcom/clevertap/android/sdk/cryption/a;", "cryptFactory", "<init>", "(Ll/uxb;Lcom/clevertap/android/sdk/cryption/a;)V", "", "plainText", "c", "(Ljava/lang/String;)Ljava/lang/String;", "cipherText", Constants.INAPP_DATA_TAG, "e", "a", "Lcom/clevertap/android/sdk/cryption/CryptHandler$EncryptionAlgorithm;", "algorithm", "f", "(Ljava/lang/String;Lcom/clevertap/android/sdk/cryption/CryptHandler$EncryptionAlgorithm;)Ljava/lang/String;", "", "migrationSuccessful", "", "b", "(Z)V", "Ll/uxb;", "Lcom/clevertap/android/sdk/cryption/a;", "Companion", "EncryptionAlgorithm", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class CryptHandler implements InterfaceC1199c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    private static final EncryptionAlgorithm f4899c = EncryptionAlgorithm.AES_GCM;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final uxb repository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final C1197a cryptFactory;

    @Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m88121d2 = {"Lcom/clevertap/android/sdk/cryption/CryptHandler$EncryptionAlgorithm;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "AES", "AES_GCM", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public enum EncryptionAlgorithm {
        AES(0),
        AES_GCM(1);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());
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
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, m88121d2 = {"Lcom/clevertap/android/sdk/cryption/CryptHandler$a;", "", "<init>", "()V", "", "plainText", "", "c", "(Ljava/lang/String;)Z", "a", "b", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m6008a(@NotNull String plainText) {
            plainText.getClass();
            return C15493d.m94374J(plainText, "[", false, 2, null) && C15493d.m94380w(plainText, Constants.AES_SUFFIX, false, 2, null);
        }

        /* JADX INFO: renamed from: b */
        public final boolean m6009b(@NotNull String plainText) {
            plainText.getClass();
            return C15493d.m94374J(plainText, Constants.AES_GCM_PREFIX, false, 2, null) && C15493d.m94380w(plainText, Constants.AES_GCM_SUFFIX, false, 2, null);
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final boolean m6010c(@NotNull String plainText) {
            plainText.getClass();
            return m6008a(plainText) || m6009b(plainText);
        }

        private Companion() {
        }
    }

    public CryptHandler(@NotNull uxb uxbVar, @NotNull C1197a c1197a) {
        uxbVar.getClass();
        c1197a.getClass();
        this.repository = uxbVar;
        this.cryptFactory = c1197a;
    }

    @Override // com.clevertap.android.sdk.cryption.InterfaceC1199c
    @Nullable
    /* JADX INFO: renamed from: a */
    public String mo6002a(@NotNull String cipherText) {
        cipherText.getClass();
        return this.cryptFactory.m6013b(f4899c).mo118774a(cipherText);
    }

    @Override // com.clevertap.android.sdk.cryption.InterfaceC1199c
    /* JADX INFO: renamed from: b */
    public void mo6003b(boolean migrationSuccessful) {
        this.repository.m198411f(migrationSuccessful);
    }

    @Override // com.clevertap.android.sdk.cryption.InterfaceC1199c
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo6004c(@NotNull String plainText) {
        plainText.getClass();
        return INSTANCE.m6009b(plainText) ? plainText : this.cryptFactory.m6013b(f4899c).mo118775b(plainText);
    }

    @Override // com.clevertap.android.sdk.cryption.InterfaceC1199c
    @Nullable
    /* JADX INFO: renamed from: d */
    public String mo6005d(@NotNull String cipherText) {
        cipherText.getClass();
        return !INSTANCE.m6009b(cipherText) ? cipherText : this.cryptFactory.m6013b(f4899c).mo118774a(cipherText);
    }

    @Override // com.clevertap.android.sdk.cryption.InterfaceC1199c
    @Nullable
    /* JADX INFO: renamed from: e */
    public String mo6006e(@NotNull String plainText) {
        plainText.getClass();
        return this.cryptFactory.m6013b(f4899c).mo118775b(plainText);
    }

    @Override // com.clevertap.android.sdk.cryption.InterfaceC1199c
    @Nullable
    /* JADX INFO: renamed from: f */
    public String mo6007f(@NotNull String cipherText, @NotNull EncryptionAlgorithm algorithm) {
        cipherText.getClass();
        algorithm.getClass();
        return this.cryptFactory.m6013b(algorithm).mo118774a(cipherText);
    }
}
