package p149l;

import android.util.SparseIntArray;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m87232d2 = {"Ll/rnd;", "", "<init>", "()V", "", "min", Constants.PRIORITY_MAX, "numThreads", "Landroid/util/SparseIntArray;", "a", "(III)Landroid/util/SparseIntArray;", "Ll/va80;", "b", "()Ll/va80;", "I", "getDEFAULT_MAX_NUM_THREADS", "()I", "DEFAULT_MAX_NUM_THREADS", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class rnd {

    @NotNull
    public static final rnd INSTANCE = new rnd();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final int DEFAULT_MAX_NUM_THREADS = Runtime.getRuntime().availableProcessors();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final SparseIntArray m180064a(int min, int max, int numThreads) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (min <= max) {
            sparseIntArray.put(min, numThreads);
            min *= 2;
        }
        return sparseIntArray;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final va80 m180065b() {
        int i = DEFAULT_MAX_NUM_THREADS;
        return new va80(4194304, i * 4194304, m180064a(131072, 4194304, i), 131072, 4194304, i);
    }
}
