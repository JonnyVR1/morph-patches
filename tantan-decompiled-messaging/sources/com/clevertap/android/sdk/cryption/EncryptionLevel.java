package com.clevertap.android.sdk.cryption;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.eclipse.jetty.util.security.Constraint;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m87232d2 = {"Lcom/clevertap/android/sdk/cryption/EncryptionLevel;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "intValue", "()I", "", "shouldEncrypt", "()Z", "I", "Companion", "a", Constraint.NONE, "MEDIUM", "FULL_DATA", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public enum EncryptionLevel {
    NONE(0),
    MEDIUM(1),
    FULL_DATA(2);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.clevertap.android.sdk.cryption.EncryptionLevel$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lcom/clevertap/android/sdk/cryption/EncryptionLevel$a;", "", "<init>", "()V", "", "value", "Lcom/clevertap/android/sdk/cryption/EncryptionLevel;", "a", "(I)Lcom/clevertap/android/sdk/cryption/EncryptionLevel;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final EncryptionLevel m5957a(int value) {
            for (EncryptionLevel encryptionLevel : EncryptionLevel.values()) {
                if (encryptionLevel.value == value) {
                    if (encryptionLevel == null) {
                        return EncryptionLevel.NONE;
                    }
                    return encryptionLevel;
                }
            }
            encryptionLevel = null;
            if (encryptionLevel == null) {
                return EncryptionLevel.NONE;
            }
            return encryptionLevel;
        }

        private Companion() {
        }
    }

    EncryptionLevel(int i) {
        this.value = i;
    }

    @JvmStatic
    @NotNull
    public static final EncryptionLevel fromInt(int i) {
        return INSTANCE.m5957a(i);
    }

    @NotNull
    public static EnumEntries<EncryptionLevel> getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: renamed from: intValue, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final boolean shouldEncrypt() {
        return this.value > 0;
    }
}
