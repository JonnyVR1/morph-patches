package com.clevertap.android.sdk.inapp;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/InAppActionType;", "", "", "stringValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion", "a", "CLOSE", "OPEN_URL", "KEY_VALUES", "CUSTOM_CODE", "REQUEST_FOR_PERMISSIONS", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public enum InAppActionType {
    CLOSE("close"),
    OPEN_URL("url"),
    KEY_VALUES(Constants.KEY_KV),
    CUSTOM_CODE("custom-code"),
    REQUEST_FOR_PERMISSIONS(Constants.KEY_REQUEST_FOR_NOTIFICATION_PERMISSION);


    @NotNull
    private final String stringValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.InAppActionType$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/InAppActionType$a;", "", "<init>", "()V", "", "string", "Lcom/clevertap/android/sdk/inapp/InAppActionType;", "a", "(Ljava/lang/String;)Lcom/clevertap/android/sdk/inapp/InAppActionType;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final InAppActionType m6270a(@NotNull String string) {
            string.getClass();
            for (InAppActionType inAppActionType : InAppActionType.values()) {
                if (Intrinsics.m88377d(inAppActionType.stringValue, string)) {
                    return inAppActionType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    InAppActionType(String str) {
        this.stringValue = str;
    }

    @NotNull
    public static EnumEntries<InAppActionType> getEntries() {
        return $ENTRIES;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.stringValue;
    }
}
