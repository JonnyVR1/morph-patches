package p149l;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000f¨\u0006\u0011"}, m87232d2 = {"Ll/z03;", "", "<init>", "()V", "Ll/y03;", "a", "()Ll/y03;", "", "I", "MAX_BITMAP_TOTAL_SIZE", "b", "maxBitmapCount", "c", "Ll/y03;", "bitmapCounter", "()I", "maxSizeHardCap", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class z03 {

    @NotNull
    public static final z03 INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    public static final int MAX_BITMAP_TOTAL_SIZE;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static int maxBitmapCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static volatile y03 bitmapCounter;

    static {
        z03 z03Var = new z03();
        INSTANCE = z03Var;
        MAX_BITMAP_TOTAL_SIZE = z03Var.m216716b();
        maxBitmapCount = 384;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final y03 m216715a() {
        if (bitmapCounter == null) {
            synchronized (z03.class) {
                try {
                    if (bitmapCounter == null) {
                        bitmapCounter = new y03(maxBitmapCount, MAX_BITMAP_TOTAL_SIZE);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        y03 y03Var = bitmapCounter;
        y03Var.getClass();
        return y03Var;
    }

    /* JADX INFO: renamed from: b */
    public final int m216716b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return ((long) iMin) > 16777216 ? (iMin / 4) * 3 : iMin / 2;
    }
}
