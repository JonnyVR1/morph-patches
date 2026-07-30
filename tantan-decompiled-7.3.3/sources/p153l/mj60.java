package p153l;

import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import kotlin.text.C15497h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\n \t*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001c\u0010\r\u001a\n \t*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000e"}, m88121d2 = {"Ll/mj60;", "", "<init>", "()V", "Ljava/nio/file/Path;", "path", "base", "a", "(Ljava/nio/file/Path;Ljava/nio/file/Path;)Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "Ljava/nio/file/Path;", "emptyPath", "b", "parentPath", "kotlin-stdlib-jdk7"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class mj60 {

    @NotNull
    public static final mj60 INSTANCE = new mj60();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Path emptyPath = Paths.get("", new String[0]);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Path parentPath = Paths.get("..", new String[0]);

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Path m158569a(@NotNull Path path, @NotNull Path base) {
        path.getClass();
        base.getClass();
        Path pathNormalize = base.normalize();
        Path pathNormalize2 = path.normalize();
        Path pathRelativize = pathNormalize.relativize(pathNormalize2);
        int iMin = Math.min(pathNormalize.getNameCount(), pathNormalize2.getNameCount());
        for (int i = 0; i < iMin; i++) {
            Path name = pathNormalize.getName(i);
            Path path2 = parentPath;
            if (!Intrinsics.m88377d(name, path2)) {
                break;
            }
            if (!Intrinsics.m88377d(pathNormalize2.getName(i), path2)) {
                wg3.m206174a("Unable to compute relative path");
                return null;
            }
        }
        if (Intrinsics.m88377d(pathNormalize2, pathNormalize) || !Intrinsics.m88377d(pathNormalize, emptyPath)) {
            String string = pathRelativize.toString();
            String separator = pathRelativize.getFileSystem().getSeparator();
            separator.getClass();
            pathNormalize2 = C15493d.m94380w(string, separator, false, 2, null) ? pathRelativize.getFileSystem().getPath(C15497h.m94385b1(string, pathRelativize.getFileSystem().getSeparator().length()), new String[0]) : pathRelativize;
        }
        pathNormalize2.getClass();
        return pathNormalize2;
    }
}
