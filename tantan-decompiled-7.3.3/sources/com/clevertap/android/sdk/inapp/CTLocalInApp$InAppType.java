package com.clevertap.android.sdk.inapp;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m88121d2 = {"com/clevertap/android/sdk/inapp/CTLocalInApp$InAppType", "", "Lcom/clevertap/android/sdk/inapp/CTLocalInApp$InAppType;", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "ALERT", "HALF_INTERSTITIAL", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public enum CTLocalInApp$InAppType {
    ALERT(CTInAppType.CTInAppTypeAlert.getType()),
    HALF_INTERSTITIAL(CTInAppType.CTInAppTypeHalfInterstitial.getType());

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

    @NotNull
    private final String type;

    CTLocalInApp$InAppType(String str) {
        this.type = str;
    }

    @NotNull
    public static EnumEntries<CTLocalInApp$InAppType> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
