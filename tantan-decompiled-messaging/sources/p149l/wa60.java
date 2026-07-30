package p149l;

import com.clevertap.android.sdk.Constants;
import java.nio.file.Path;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010(\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0013\u001a\u0004\b\b\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m87232d2 = {"Ll/wa60;", "", "Ljava/nio/file/Path;", "path", Constants.KEY_KEY, "parent", "<init>", "(Ljava/nio/file/Path;Ljava/lang/Object;Ll/wa60;)V", "a", "Ljava/nio/file/Path;", Constants.INAPP_DATA_TAG, "()Ljava/nio/file/Path;", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "c", "Ll/wa60;", "()Ll/wa60;", "", "Ljava/util/Iterator;", "()Ljava/util/Iterator;", "e", "(Ljava/util/Iterator;)V", "contentIterator", "kotlin-stdlib-jdk7"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class wa60 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Path path;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Object key;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final wa60 parent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Iterator<wa60> contentIterator;

    public wa60(@NotNull Path path, @Nullable Object obj, @Nullable wa60 wa60Var) {
        path.getClass();
        this.path = path;
        this.key = obj;
        this.parent = wa60Var;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Iterator<wa60> m202376a() {
        return this.contentIterator;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final wa60 getParent() {
        return this.parent;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Path getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: e */
    public final void m202380e(@Nullable Iterator<wa60> it) {
        this.contentIterator = it;
    }
}
