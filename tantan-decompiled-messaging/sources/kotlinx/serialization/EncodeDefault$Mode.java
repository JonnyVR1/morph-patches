package kotlinx.serialization;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m87232d2 = {"kotlinx/serialization/EncodeDefault$Mode", "", "Lkotlinx/serialization/EncodeDefault$Mode;", "<init>", "(Ljava/lang/String;I)V", "ALWAYS", "NEVER", "kotlinx-serialization-core"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public enum EncodeDefault$Mode {
    ALWAYS,
    NEVER;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

    @NotNull
    public static EnumEntries<EncodeDefault$Mode> getEntries() {
        return $ENTRIES;
    }
}
