package kotlin.p118io.path;

import com.p046p1.mobile.putong.core.data.Options;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012¨\u0006\u001c"}, m87232d2 = {"Lkotlin/io/path/PathTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/nio/file/Path;", "", "iterator", "()Ljava/util/Iterator;", "g", "f", "a", "Ljava/nio/file/Path;", "start", "", "Lkotlin/io/path/PathWalkOption;", "b", "[Lkotlin/io/path/PathWalkOption;", Options.TYPE, "", "h", "()Z", "followLinks", "Ljava/nio/file/LinkOption;", "j", "()[Ljava/nio/file/LinkOption;", "linkOptions", RXScreenCaptureService.KEY_INDEX, "includeDirectories", "k", "isBFS", "kotlin-stdlib-jdk7"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PathTreeWalk implements Sequence<Path> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Path start;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PathWalkOption[] options;

    /* JADX INFO: renamed from: f */
    public final Iterator<Path> m87432f() {
        return SequencesKt__SequenceBuilderKt.m93261a(new PathTreeWalk$bfsIterator$1(this, null));
    }

    /* JADX INFO: renamed from: g */
    public final Iterator<Path> m87433g() {
        return SequencesKt__SequenceBuilderKt.m93261a(new PathTreeWalk$dfsIterator$1(this, null));
    }

    /* JADX INFO: renamed from: h */
    public final boolean m87434h() {
        return ArraysKt.contains(this.options, PathWalkOption.FOLLOW_LINKS);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m87435i() {
        return ArraysKt.contains(this.options, PathWalkOption.INCLUDE_DIRECTORIES);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<Path> iterator() {
        return m87437k() ? m87432f() : m87433g();
    }

    /* JADX INFO: renamed from: j */
    public final LinkOption[] m87436j() {
        return LinkFollowing.INSTANCE.m87426a(m87434h());
    }

    /* JADX INFO: renamed from: k */
    public final boolean m87437k() {
        return ArraysKt.contains(this.options, PathWalkOption.BREADTH_FIRST);
    }
}
