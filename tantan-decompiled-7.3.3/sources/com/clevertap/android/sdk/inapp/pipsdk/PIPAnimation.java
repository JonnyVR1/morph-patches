package com.clevertap.android.sdk.inapp.pipsdk;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimation;", "", "<init>", "(Ljava/lang/String;I)V", "INSTANT", "DISSOLVE", "MOVE_IN", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public enum PIPAnimation {
    INSTANT,
    DISSOLVE,
    MOVE_IN;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

    @NotNull
    public static EnumEntries<PIPAnimation> getEntries() {
        return $ENTRIES;
    }
}
