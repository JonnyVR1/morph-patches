package kotlin.p118io.path;

import com.clevertap.android.sdk.Constants;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p149l.ac60;
import p149l.k1e;
import p149l.l9r;
import p149l.lb60;
import p149l.mb60;
import p149l.pmd;
import p149l.rb60;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0003¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\b*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Lkotlin/io/path/CopyActionResult;", "Ljava/nio/file/FileVisitResult;", "h", "(Lkotlin/io/path/CopyActionResult;)Ljava/nio/file/FileVisitResult;", "Lkotlin/io/path/OnErrorResult;", RXScreenCaptureService.KEY_INDEX, "(Lkotlin/io/path/OnErrorResult;)Ljava/nio/file/FileVisitResult;", "Ljava/nio/file/Path;", "", "c", "(Ljava/nio/file/Path;)V", "parent", Constants.INAPP_DATA_TAG, "(Ljava/nio/file/Path;Ljava/nio/file/Path;)V", "kotlin-stdlib-jdk7"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/io/path/PathsKt")
@SourceDebugExtension
public class PathsKt__PathRecursiveFunctionsKt extends rb60 {

    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f63509a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f63510b;

        static {
            int[] iArr = new int[CopyActionResult.values().length];
            try {
                iArr[CopyActionResult.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CopyActionResult.TERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CopyActionResult.SKIP_SUBTREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f63509a = iArr;
            int[] iArr2 = new int[OnErrorResult.values().length];
            try {
                iArr2[OnErrorResult.TERMINATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OnErrorResult.SKIP_SUBTREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f63510b = iArr2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m87444c(@NotNull Path path) throws IllegalFileNameException {
        path.getClass();
        String strM95716j = ac60.m95716j(path);
        int iHashCode = strM95716j.hashCode();
        if (iHashCode != 46) {
            if (iHashCode != 1518) {
                if (iHashCode != 45679) {
                    if (iHashCode != 45724) {
                        if (iHashCode != 1472) {
                            if (iHashCode != 1473 || !strM95716j.equals("./")) {
                                return;
                            }
                        } else if (!strM95716j.equals("..")) {
                            return;
                        }
                    } else if (!strM95716j.equals("..\\")) {
                        return;
                    }
                } else if (!strM95716j.equals("../")) {
                    return;
                }
            } else if (!strM95716j.equals(".\\")) {
                return;
            }
        } else if (!strM95716j.equals(".")) {
            return;
        }
        throw new IllegalFileNameException(path);
    }

    /* JADX INFO: renamed from: d */
    public static final void m87445d(Path path, Path path2) throws FileSystemLoopException {
        if (Files.isSymbolicLink(path) || !Files.isSameFile(path, path2)) {
            return;
        }
        mb60.m153862a();
        throw lb60.m149214a(path.toString());
    }

    /* JADX INFO: renamed from: e */
    public static final FileVisitResult m87446e(ArrayList<Path> arrayList, Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> function3, Path path, Path path2, Path path3, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function4, Path path4, BasicFileAttributes basicFileAttributes) {
        try {
            if (!arrayList.isEmpty()) {
                m87444c(path4);
                Object objLast = CollectionsKt.last((List<? extends Object>) arrayList);
                objLast.getClass();
                m87445d(path4, k1e.m144157a(objLast));
            }
            return m87449h(function3.invoke(pmd.INSTANCE, path4, m87447f(path, path2, path3, path4)));
        } catch (Exception e) {
            return m87448g(function4, path, path2, path3, path4, e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Path m87447f(Path path, Path path2, Path path3, Path path4) throws IllegalFileNameException {
        Path pathResolve = path2.resolve(ac60.m95717k(path4, path).toString());
        if (!pathResolve.normalize().startsWith(path3)) {
            throw new IllegalFileNameException(path4, pathResolve, "Copying files to outside the specified target directory is prohibited. The directory being recursively copied might contain an entry with an illegal name.");
        }
        pathResolve.getClass();
        return pathResolve;
    }

    /* JADX INFO: renamed from: g */
    public static final FileVisitResult m87448g(Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function3, Path path, Path path2, Path path3, Path path4, Exception exc) {
        return m87450i(function3.invoke(path4, m87447f(path, path2, path3, path4), exc));
    }

    @ExperimentalPathApi
    /* JADX INFO: renamed from: h */
    public static final FileVisitResult m87449h(CopyActionResult copyActionResult) {
        int i = WhenMappings.f63509a[copyActionResult.ordinal()];
        if (i == 1) {
            return FileVisitResult.CONTINUE;
        }
        if (i == 2) {
            return FileVisitResult.TERMINATE;
        }
        if (i == 3) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        l9r.m149037a();
        return null;
    }

    @ExperimentalPathApi
    /* JADX INFO: renamed from: i */
    public static final FileVisitResult m87450i(OnErrorResult onErrorResult) {
        int i = WhenMappings.f63510b[onErrorResult.ordinal()];
        if (i == 1) {
            return FileVisitResult.TERMINATE;
        }
        if (i == 2) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        l9r.m149037a();
        return null;
    }
}
