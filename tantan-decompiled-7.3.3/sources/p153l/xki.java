package p153l;

import java.io.File;
import kotlin.Metadata;
import kotlin.p122io.FileTreeWalk;
import kotlin.p122io.FileWalkDirection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"Ljava/io/File;", "Lkotlin/io/FileWalkDirection;", "direction", "Lkotlin/io/FileTreeWalk;", "n", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)Lkotlin/io/FileTreeWalk;", "o", "(Ljava/io/File;)Lkotlin/io/FileTreeWalk;", "kotlin-stdlib"}, m88122k = 5, m88123mv = {2, 2, 0}, m88125xi = 49, m88126xs = "kotlin/io/FilesKt")
public class xki extends wki {
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final FileTreeWalk m211400n(@NotNull File file, @NotNull FileWalkDirection fileWalkDirection) {
        file.getClass();
        fileWalkDirection.getClass();
        return new FileTreeWalk(file, fileWalkDirection);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final FileTreeWalk m211401o(@NotNull File file) {
        file.getClass();
        return m211400n(file, FileWalkDirection.BOTTOM_UP);
    }
}
