package p153l;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p122io.path.LinkFollowing;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001b"}, m88121d2 = {"Ll/c3e;", "Ljava/nio/file/SimpleFileVisitor;", "Ljava/nio/file/Path;", "", "followLinks", "<init>", "(Z)V", "Ll/bj60;", "directoryNode", "", "b", "(Ll/bj60;)Ljava/util/List;", "dir", "Ljava/nio/file/attribute/BasicFileAttributes;", "attrs", "Ljava/nio/file/FileVisitResult;", "a", "(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", "file", "c", "Z", "getFollowLinks", "()Z", "Ll/bj60;", "Lkotlin/collections/ArrayDeque;", "Lkotlin/collections/ArrayDeque;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "kotlin-stdlib-jdk7"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class c3e extends SimpleFileVisitor<Path> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean followLinks;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public bj60 directoryNode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public ArrayDeque<bj60> entries = new ArrayDeque<>();

    public c3e(boolean z) {
        this.followLinks = z;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public FileVisitResult m107781a(@NotNull Path dir, @NotNull BasicFileAttributes attrs) throws IOException {
        dir.getClass();
        attrs.getClass();
        this.entries.add(new bj60(dir, attrs.fileKey(), this.directoryNode));
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory(dir, attrs);
        fileVisitResultPreVisitDirectory.getClass();
        return fileVisitResultPreVisitDirectory;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<bj60> m107782b(@NotNull bj60 directoryNode) throws IOException {
        directoryNode.getClass();
        this.directoryNode = directoryNode;
        Files.walkFileTree(directoryNode.getPath(), LinkFollowing.INSTANCE.m88316b(this.followLinks), 1, z2e.m218416a(this));
        this.entries.removeFirst();
        ArrayDeque<bj60> arrayDeque = this.entries;
        this.entries = new ArrayDeque<>();
        return arrayDeque;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public FileVisitResult m107783c(@NotNull Path file, @NotNull BasicFileAttributes attrs) throws IOException {
        file.getClass();
        attrs.getClass();
        this.entries.add(new bj60(file, null, this.directoryNode));
        FileVisitResult fileVisitResultVisitFile = super.visitFile(file, attrs);
        fileVisitResultVisitFile.getClass();
        return fileVisitResultVisitFile;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return m107781a(y2e.m214055a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return m107783c(y2e.m214055a(obj), basicFileAttributes);
    }
}
