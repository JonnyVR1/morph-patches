package p153l;

import android.util.SparseIntArray;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\r\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m88121d2 = {"Ll/tmd;", "", "<init>", "()V", "Ll/bj80;", "a", "()Ll/bj80;", "Landroid/util/SparseIntArray;", "Landroid/util/SparseIntArray;", "DEFAULT_BUCKETS", "", "b", "()I", "maxSizeHardCap", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class tmd {

    @NotNull
    public static final tmd INSTANCE = new tmd();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final SparseIntArray DEFAULT_BUCKETS = new SparseIntArray(0);

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final bj80 m191727a() {
        return new bj80(0, INSTANCE.m191728b(), DEFAULT_BUCKETS);
    }

    /* JADX INFO: renamed from: b */
    public final int m191728b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return iMin > 16777216 ? (iMin / 4) * 3 : iMin / 2;
    }
}
