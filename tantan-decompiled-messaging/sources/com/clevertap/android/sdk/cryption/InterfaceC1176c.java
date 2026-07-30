package com.clevertap.android.sdk.cryption;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.clevertap.android.sdk.cryption.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0005J!\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Lcom/clevertap/android/sdk/cryption/c;", "", "", "plainText", "c", "(Ljava/lang/String;)Ljava/lang/String;", "cipherText", Constants.INAPP_DATA_TAG, "e", "a", "Lcom/clevertap/android/sdk/cryption/CryptHandler$EncryptionAlgorithm;", "algorithm", "f", "(Ljava/lang/String;Lcom/clevertap/android/sdk/cryption/CryptHandler$EncryptionAlgorithm;)Ljava/lang/String;", "", "migrationSuccessful", "", "b", "(Z)V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface InterfaceC1176c {
    @Nullable
    /* JADX INFO: renamed from: a */
    String mo5948a(@NotNull String cipherText);

    /* JADX INFO: renamed from: b */
    void mo5949b(boolean migrationSuccessful);

    @Nullable
    /* JADX INFO: renamed from: c */
    String mo5950c(@NotNull String plainText);

    @Nullable
    /* JADX INFO: renamed from: d */
    String mo5951d(@NotNull String cipherText);

    @Nullable
    /* JADX INFO: renamed from: e */
    String mo5952e(@NotNull String plainText);

    @Nullable
    /* JADX INFO: renamed from: f */
    String mo5953f(@NotNull String cipherText, @NotNull CryptHandler.EncryptionAlgorithm algorithm);
}
