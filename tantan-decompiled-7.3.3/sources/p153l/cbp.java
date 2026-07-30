package p153l;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/cbp;", "", "<init>", "()V", "", "contractIntervalDays", "", "a", "(I)Ljava/lang/String;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class cbp {

    @NotNull
    public static final cbp INSTANCE = new cbp();

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m108653a(int contractIntervalDays) {
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
