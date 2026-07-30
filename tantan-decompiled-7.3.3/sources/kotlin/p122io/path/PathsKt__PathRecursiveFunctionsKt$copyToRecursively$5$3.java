package kotlin.p122io.path;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import p153l.y2e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
final /* synthetic */ class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3 extends FunctionReferenceImpl implements Function2<Path, Exception, FileVisitResult> {
    final /* synthetic */ Path $normalizedTarget;
    final /* synthetic */ Function3<Path, Path, Exception, OnErrorResult> $onError;
    final /* synthetic */ Path $target;
    final /* synthetic */ Path $this_copyToRecursively;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3(Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function3, Path path, Path path2, Path path3) {
        super(2, Intrinsics.Kotlin.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
        this.$onError = function3;
        this.$this_copyToRecursively = path;
        this.$target = path2;
        this.$normalizedTarget = path3;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final FileVisitResult invoke2(Path path, Exception exc) {
        path.getClass();
        exc.getClass();
        return PathsKt__PathRecursiveFunctionsKt.m88337g(this.$onError, this.$this_copyToRecursively, this.$target, this.$normalizedTarget, path, exc);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, Exception exc) {
        return invoke2(y2e.m214055a(path), exc);
    }
}
