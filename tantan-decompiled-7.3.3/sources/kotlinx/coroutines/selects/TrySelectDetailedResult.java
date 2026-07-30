package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m88121d2 = {"Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "", "(Ljava/lang/String;I)V", "SUCCESSFUL", "REREGISTER", "CANCELLED", "ALREADY_SELECTED", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public enum TrySelectDetailedResult {
    SUCCESSFUL,
    REREGISTER,
    CANCELLED,
    ALREADY_SELECTED;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

    @NotNull
    public static EnumEntries<TrySelectDetailedResult> getEntries() {
        return $ENTRIES;
    }
}
