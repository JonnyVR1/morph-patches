package kotlin;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.eclipse.jetty.util.security.Constraint;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m87232d2 = {"Lkotlin/LazyThreadSafetyMode;", "", "<init>", "(Ljava/lang/String;I)V", "SYNCHRONIZED", "PUBLICATION", Constraint.NONE, "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public enum LazyThreadSafetyMode {
    SYNCHRONIZED,
    PUBLICATION,
    NONE;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

    @NotNull
    public static EnumEntries<LazyThreadSafetyMode> getEntries() {
        return $ENTRIES;
    }
}
