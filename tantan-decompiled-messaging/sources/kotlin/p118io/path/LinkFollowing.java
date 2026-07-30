package kotlin.p118io.path;

import com.clevertap.android.sdk.Constants;
import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, m87232d2 = {"Lkotlin/io/path/LinkFollowing;", "", "<init>", "()V", "", "followLinks", "", "Ljava/nio/file/LinkOption;", "a", "(Z)[Ljava/nio/file/LinkOption;", "", "Ljava/nio/file/FileVisitOption;", "b", "(Z)Ljava/util/Set;", "[Ljava/nio/file/LinkOption;", "nofollowLinkOption", "followLinkOption", "c", "Ljava/util/Set;", "nofollowVisitOption", Constants.INAPP_DATA_TAG, "followVisitOption", "kotlin-stdlib-jdk7"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class LinkFollowing {

    @NotNull
    public static final LinkFollowing INSTANCE = new LinkFollowing();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final LinkOption[] nofollowLinkOption = {LinkOption.NOFOLLOW_LINKS};

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final LinkOption[] followLinkOption = new LinkOption[0];

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Set<FileVisitOption> nofollowVisitOption = SetsKt.emptySet();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Set<FileVisitOption> followVisitOption = SetsKt.setOf(FileVisitOption.FOLLOW_LINKS);

    private LinkFollowing() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final LinkOption[] m87426a(boolean followLinks) {
        return followLinks ? followLinkOption : nofollowLinkOption;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Set<FileVisitOption> m87427b(boolean followLinks) {
        return followLinks ? followVisitOption : nofollowVisitOption;
    }
}
