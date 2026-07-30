package p149l;

import android.util.SparseIntArray;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\r\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m87232d2 = {"Ll/nld;", "", "<init>", "()V", "Ll/va80;", "a", "()Ll/va80;", "Landroid/util/SparseIntArray;", "Landroid/util/SparseIntArray;", "DEFAULT_BUCKETS", "", "b", "()I", "maxSizeHardCap", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class nld {

    @NotNull
    public static final nld INSTANCE = new nld();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final SparseIntArray DEFAULT_BUCKETS = new SparseIntArray(0);

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final va80 m160018a() {
        return new va80(0, INSTANCE.m160019b(), DEFAULT_BUCKETS);
    }

    /* JADX INFO: renamed from: b */
    public final int m160019b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return iMin > 16777216 ? (iMin / 4) * 3 : iMin / 2;
    }
}
