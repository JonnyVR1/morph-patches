package kotlin.p122io.path;

import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p153l.fk60;
import p153l.nbr;
import p153l.qj60;
import p153l.rj60;
import p153l.und;
import p153l.wj60;
import p153l.y2e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0003¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\b*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Lkotlin/io/path/CopyActionResult;", "Ljava/nio/file/FileVisitResult;", "h", "(Lkotlin/io/path/CopyActionResult;)Ljava/nio/file/FileVisitResult;", "Lkotlin/io/path/OnErrorResult;", RXScreenCaptureService.KEY_INDEX, "(Lkotlin/io/path/OnErrorResult;)Ljava/nio/file/FileVisitResult;", "Ljava/nio/file/Path;", "", "c", "(Ljava/nio/file/Path;)V", "parent", Constants.INAPP_DATA_TAG, "(Ljava/nio/file/Path;Ljava/nio/file/Path;)V", "kotlin-stdlib-jdk7"}, m88122k = 5, m88123mv = {2, 2, 0}, m88125xi = 49, m88126xs = "kotlin/io/path/PathsKt")
@SourceDebugExtension
public class PathsKt__PathRecursiveFunctionsKt extends wj60 {

    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64183a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f64184b;

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
            f64183a = iArr;
            int[] iArr2 = new int[OnErrorResult.values().length];
            try {
                iArr2[OnErrorResult.TERMINATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OnErrorResult.SKIP_SUBTREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f64184b = iArr2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m88333c(@NotNull Path path) throws IllegalFileNameException {
        path.getClass();
        String strM125978j = fk60.m125978j(path);
        int iHashCode = strM125978j.hashCode();
        if (iHashCode != 46) {
            if (iHashCode != 1518) {
                if (iHashCode != 45679) {
                    if (iHashCode != 45724) {
                        if (iHashCode != 1472) {
                            if (iHashCode != 1473 || !strM125978j.equals("./")) {
                                return;
                            }
                        } else if (!strM125978j.equals("..")) {
                            return;
                        }
                    } else if (!strM125978j.equals("..\\")) {
                        return;
                    }
                } else if (!strM125978j.equals("../")) {
                    return;
                }
            } else if (!strM125978j.equals(".\\")) {
                return;
            }
        } else if (!strM125978j.equals(".")) {
            return;
        }
        throw new IllegalFileNameException(path);
    }

    /* JADX INFO: renamed from: d */
    public static final void m88334d(Path path, Path path2) throws FileSystemLoopException {
        if (Files.isSymbolicLink(path) || !Files.isSameFile(path, path2)) {
            return;
        }
        rj60.m181688a();
        throw qj60.m176828a(path.toString());
    }

    /* JADX INFO: renamed from: e */
    public static final FileVisitResult m88335e(ArrayList<Path> arrayList, Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> function3, Path path, Path path2, Path path3, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function4, Path path4, BasicFileAttributes basicFileAttributes) {
        try {
            if (!arrayList.isEmpty()) {
                m88333c(path4);
                Object objLast = CollectionsKt.last((List<? extends Object>) arrayList);
                objLast.getClass();
                m88334d(path4, y2e.m214055a(objLast));
            }
            return m88338h(function3.invoke(und.INSTANCE, path4, m88336f(path, path2, path3, path4)));
        } catch (Exception e) {
            return m88337g(function4, path, path2, path3, path4, e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Path m88336f(Path path, Path path2, Path path3, Path path4) throws IllegalFileNameException {
        Path pathResolve = path2.resolve(fk60.m125979k(path4, path).toString());
        if (!pathResolve.normalize().startsWith(path3)) {
            throw new IllegalFileNameException(path4, pathResolve, "Copying files to outside the specified target directory is prohibited. The directory being recursively copied might contain an entry with an illegal name.");
        }
        pathResolve.getClass();
        return pathResolve;
    }

    /* JADX INFO: renamed from: g */
    public static final FileVisitResult m88337g(Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function3, Path path, Path path2, Path path3, Path path4, Exception exc) {
        return m88339i(function3.invoke(path4, m88336f(path, path2, path3, path4), exc));
    }

    @ExperimentalPathApi
    /* JADX INFO: renamed from: h */
    public static final FileVisitResult m88338h(CopyActionResult copyActionResult) {
        int i = WhenMappings.f64183a[copyActionResult.ordinal()];
        if (i == 1) {
            return FileVisitResult.CONTINUE;
        }
        if (i == 2) {
            return FileVisitResult.TERMINATE;
        }
        if (i == 3) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        nbr.m162172a();
        return null;
    }

    @ExperimentalPathApi
    /* JADX INFO: renamed from: i */
    public static final FileVisitResult m88339i(OnErrorResult onErrorResult) {
        int i = WhenMappings.f64184b[onErrorResult.ordinal()];
        if (i == 1) {
            return FileVisitResult.TERMINATE;
        }
        if (i == 2) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        nbr.m162172a();
        return null;
    }
}
