package p149l;

import java.io.File;
import kotlin.Metadata;
import kotlin.p118io.FileTreeWalk;
import kotlin.p118io.FileWalkDirection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"Ljava/io/File;", "Lkotlin/io/FileWalkDirection;", "direction", "Lkotlin/io/FileTreeWalk;", "n", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)Lkotlin/io/FileTreeWalk;", "o", "(Ljava/io/File;)Lkotlin/io/FileTreeWalk;", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/io/FilesKt")
public class aii extends zhi {
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final FileTreeWalk m96816n(@NotNull File file, @NotNull FileWalkDirection fileWalkDirection) {
        file.getClass();
        fileWalkDirection.getClass();
        return new FileTreeWalk(file, fileWalkDirection);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final FileTreeWalk m96817o(@NotNull File file) {
        file.getClass();
        return m96816n(file, FileWalkDirection.BOTTOM_UP);
    }
}
