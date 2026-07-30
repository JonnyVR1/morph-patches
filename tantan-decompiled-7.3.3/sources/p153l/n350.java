package p153l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/n350;", "", "<init>", "()V", "", "a", "b", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;", "c", "n", "(Ljava/lang/Number;)Ljava/lang/Number;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class n350 {

    @NotNull
    public static final n350 INSTANCE = new n350();

    private n350() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Number m161271a(@NotNull Number a, @NotNull Number b) {
        a.getClass();
        b.getClass();
        if ((a instanceof Double) || (b instanceof Double)) {
            return Double.valueOf(a.doubleValue() + b.doubleValue());
        }
        if ((a instanceof Float) || (b instanceof Float)) {
            return Float.valueOf(a.floatValue() + b.floatValue());
        }
        return ((a instanceof Long) || (b instanceof Long)) ? Long.valueOf(a.longValue() + b.longValue()) : Integer.valueOf(a.intValue() + b.intValue());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Number m161272b(@NotNull Number n) {
        n.getClass();
        if (n instanceof Integer) {
            return Integer.valueOf(-n.intValue());
        }
        if (n instanceof Long) {
            return Long.valueOf(-n.longValue());
        }
        if (n instanceof Float) {
            return Float.valueOf(-n.floatValue());
        }
        return n instanceof Double ? Double.valueOf(-n.doubleValue()) : Double.valueOf(-n.doubleValue());
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Number m161273c(@NotNull Number a, @NotNull Number b) {
        a.getClass();
        b.getClass();
        if ((a instanceof Double) || (b instanceof Double)) {
            return Double.valueOf(a.doubleValue() - b.doubleValue());
        }
        if ((a instanceof Float) || (b instanceof Float)) {
            return Float.valueOf(a.floatValue() - b.floatValue());
        }
        return ((a instanceof Long) || (b instanceof Long)) ? Long.valueOf(a.longValue() - b.longValue()) : Integer.valueOf(a.intValue() - b.intValue());
    }
}
