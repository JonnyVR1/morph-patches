package p149l;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/c9p;", "", "<init>", "()V", "", "contractIntervalDays", "", "a", "(I)Ljava/lang/String;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class c9p {

    @NotNull
    public static final c9p INSTANCE = new c9p();

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m105898a(int contractIntervalDays) {
        if (contractIntervalDays <= 0) {
            return null;
        }
        if (contractIntervalDays == 7) {
            return "1w";
        }
        if (contractIntervalDays == 31) {
            return "1m";
        }
        if (contractIntervalDays == 93) {
            return "3m";
        }
        if (contractIntervalDays != 365) {
            return null;
        }
        return "12m";
    }
}
