package com.facebook.fresco.p028ui.common;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m88121d2 = {"Lcom/facebook/fresco/ui/common/VisibilityState;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "a", "UNKNOWN", "VISIBLE", "INVISIBLE", "ui-common_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public enum VisibilityState {
    UNKNOWN(-1),
    VISIBLE(1),
    INVISIBLE(2);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

    @NotNull
    private static final VisibilityState[] VALUES = values();

    VisibilityState(int i) {
        this.value = i;
    }

    @NotNull
    public static EnumEntries<VisibilityState> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
