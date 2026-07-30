package p153l;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000f¨\u0006\u0011"}, m88121d2 = {"Ll/o13;", "", "<init>", "()V", "Ll/n13;", "a", "()Ll/n13;", "", "I", "MAX_BITMAP_TOTAL_SIZE", "b", "maxBitmapCount", "c", "Ll/n13;", "bitmapCounter", "()I", "maxSizeHardCap", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class o13 {

    @NotNull
    public static final o13 INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    public static final int MAX_BITMAP_TOTAL_SIZE;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static int maxBitmapCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static volatile n13 bitmapCounter;

    static {
        o13 o13Var = new o13();
        INSTANCE = o13Var;
        MAX_BITMAP_TOTAL_SIZE = o13Var.m165580b();
        maxBitmapCount = 384;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final n13 m165579a() {
        if (bitmapCounter == null) {
            synchronized (o13.class) {
                try {
                    if (bitmapCounter == null) {
                        bitmapCounter = new n13(maxBitmapCount, MAX_BITMAP_TOTAL_SIZE);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        n13 n13Var = bitmapCounter;
        n13Var.getClass();
        return n13Var;
    }

    /* JADX INFO: renamed from: b */
    public final int m165580b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return ((long) iMin) > 16777216 ? (iMin / 4) * 3 : iMin / 2;
    }
}
