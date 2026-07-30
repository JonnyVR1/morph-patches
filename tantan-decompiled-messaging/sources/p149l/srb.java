package p149l;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Ll/srb;", "", "Ljava/io/File;", "file", "", "enable", "<init>", "(Ljava/io/File;Z)V", "a", "Ljava/io/File;", "b", "()Ljava/io/File;", "Z", "()Z", "c", "(Z)V", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class srb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final File file;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean enable;

    public srb(@NotNull File file, boolean z) {
        file.getClass();
        this.file = file;
        this.enable = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: c */
    public final void m185641c(boolean z) {
        this.enable = z;
    }

    public /* synthetic */ srb(File file, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? true : z);
    }
}
