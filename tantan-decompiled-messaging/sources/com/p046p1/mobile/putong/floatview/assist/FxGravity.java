package com.p046p1.mobile.putong.floatview.assist;

import com.google.android.material.badge.BadgeDrawable;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0016"}, m87232d2 = {"Lcom/p1/mobile/putong/floatview/assist/FxGravity;", "", "value", "", "scope", "<init>", "(Ljava/lang/String;III)V", "getValue", "()I", "getScope", RelationshipStatus.DEFAULT, "LEFT_OR_TOP", "LEFT_OR_CENTER", "LEFT_OR_BOTTOM", "RIGHT_OR_TOP", "RIGHT_OR_CENTER", "RIGHT_OR_BOTTOM", "CENTER", "TOP_OR_CENTER", "BOTTOM_OR_CENTER", "isDefault", "", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public enum FxGravity {
    DEFAULT(BadgeDrawable.TOP_START, 1),
    LEFT_OR_TOP(BadgeDrawable.TOP_START, 1),
    LEFT_OR_CENTER(8388627, 2),
    LEFT_OR_BOTTOM(BadgeDrawable.BOTTOM_START, 3),
    RIGHT_OR_TOP(BadgeDrawable.TOP_END, 1),
    RIGHT_OR_CENTER(8388629, 2),
    RIGHT_OR_BOTTOM(BadgeDrawable.BOTTOM_END, 3),
    CENTER(17, 2),
    TOP_OR_CENTER(49, 1),
    BOTTOM_OR_CENTER(81, 3);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());
    private final int scope;
    private final int value;

    FxGravity(int i, int i2) {
        this.value = i;
        this.scope = i2;
    }

    @NotNull
    public static EnumEntries<FxGravity> getEntries() {
        return $ENTRIES;
    }

    public final int getScope() {
        return this.scope;
    }

    public final int getValue() {
        return this.value;
    }

    public final boolean isDefault() {
        return this == DEFAULT;
    }
}
