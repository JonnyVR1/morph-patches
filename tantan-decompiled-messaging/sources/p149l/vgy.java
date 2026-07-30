package p149l;

import com.clevertap.android.sdk.Constants;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m87232d2 = {"Ll/vgy;", "", "", "minInMemorySizeKB", "optimistic", "maxDiskSizeKB", "Ljava/io/File;", "diskDirectory", "<init>", "(JJJLjava/io/File;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", Constants.INAPP_DATA_TAG, "Ljava/io/File;", "()Ljava/io/File;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final /* data */ class vgy {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long minInMemorySizeKB;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long optimistic;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long maxDiskSizeKB;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final File diskDirectory;

    public vgy(long j, long j2, long j3, @NotNull File file) {
        file.getClass();
        this.minInMemorySizeKB = j;
        this.optimistic = j2;
        this.maxDiskSizeKB = j3;
        this.diskDirectory = file;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final File getDiskDirectory() {
        return this.diskDirectory;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getMaxDiskSizeKB() {
        return this.maxDiskSizeKB;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getMinInMemorySizeKB() {
        return this.minInMemorySizeKB;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getOptimistic() {
        return this.optimistic;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof vgy)) {
            return false;
        }
        vgy vgyVar = (vgy) other;
        return this.minInMemorySizeKB == vgyVar.minInMemorySizeKB && this.optimistic == vgyVar.optimistic && this.maxDiskSizeKB == vgyVar.maxDiskSizeKB && Intrinsics.m87488d(this.diskDirectory, vgyVar.diskDirectory);
    }

    public int hashCode() {
        return (((((Long.hashCode(this.minInMemorySizeKB) * 31) + Long.hashCode(this.optimistic)) * 31) + Long.hashCode(this.maxDiskSizeKB)) * 31) + this.diskDirectory.hashCode();
    }

    @NotNull
    public String toString() {
        return "MemoryConfig(minInMemorySizeKB=" + this.minInMemorySizeKB + ", optimistic=" + this.optimistic + ", maxDiskSizeKB=" + this.maxDiskSizeKB + ", diskDirectory=" + this.diskDirectory + ')';
    }
}
