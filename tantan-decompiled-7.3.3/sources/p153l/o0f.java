package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001\bB\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m88121d2 = {"Ll/o0f;", "", "Ll/o0f$a;", "builder", "<init>", "(Ll/o0f$a;)V", "other", "", "a", "(Ll/o0f;)Z", "", "hashCode", "()I", "Ll/i950$a;", "b", "()Ll/i950$a;", "Lcom/facebook/imagepipeline/common/Priority;", "Lcom/facebook/imagepipeline/common/Priority;", "getPriority", "()Lcom/facebook/imagepipeline/common/Priority;", "priority", "Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;", "Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;", "getCacheChoice", "()Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;", "cacheChoice", "", "c", "Ljava/lang/String;", "getDiskCacheId", "()Ljava/lang/String;", "diskCacheId", "options_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public class o0f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Priority priority;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final ImageRequest.CacheChoice cacheChoice;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String diskCacheId;

    public o0f(@NotNull C19002a<?> c19002a) {
        c19002a.getClass();
        this.priority = c19002a.getPriority();
        this.cacheChoice = c19002a.getCacheChoice();
        String diskCacheId = c19002a.getDiskCacheId();
        this.diskCacheId = diskCacheId;
        if (c19002a.getCacheChoice() == ImageRequest.CacheChoice.DYNAMIC) {
            if (diskCacheId == null) {
                throw new ImageRequestBuilder.BuilderException("Disk cache id must be set for dynamic cache choice");
            }
        } else if (diskCacheId != null && diskCacheId.length() != 0) {
            throw new ImageRequestBuilder.BuilderException("Ensure that if you want to use a disk cache id, you set the CacheChoice to DYNAMIC");
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m165476a(@NotNull o0f other) {
        other.getClass();
        return i950.m139074a(this.priority, other.priority) && i950.m139074a(this.cacheChoice, other.cacheChoice) && i950.m139074a(this.diskCacheId, other.diskCacheId);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public i950.C17670a mo116112b() {
        i950.C17670a c17670aM139077b = i950.m139075b(this).m139077b("priority", this.priority).m139077b("cacheChoice", this.cacheChoice).m139077b("diskCacheId", this.diskCacheId);
        c17670aM139077b.getClass();
        return c17670aM139077b;
    }

    public int hashCode() {
        Priority priority = this.priority;
        int iHashCode = (priority != null ? priority.hashCode() : 0) * 31;
        ImageRequest.CacheChoice cacheChoice = this.cacheChoice;
        int iHashCode2 = (iHashCode + (cacheChoice != null ? cacheChoice.hashCode() : 0)) * 31;
        String str = this.diskCacheId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: l.o0f$a */
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00028\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\t\u0010\nR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u0012\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m88121d2 = {"Ll/o0f$a;", p7f.GPS_DIRECTION_TRUE, "", "<init>", "()V", "Lcom/facebook/imagepipeline/common/Priority;", "priority", "e", "(Lcom/facebook/imagepipeline/common/Priority;)Ll/o0f$a;", Constants.INAPP_DATA_TAG, "()Ll/o0f$a;", "a", "Lcom/facebook/imagepipeline/common/Priority;", "c", "()Lcom/facebook/imagepipeline/common/Priority;", "setPriority$options_release", "(Lcom/facebook/imagepipeline/common/Priority;)V", "Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;", "b", "Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;", "()Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;", "setCacheChoice$options_release", "(Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;)V", "cacheChoice", "", "Ljava/lang/String;", "()Ljava/lang/String;", "setDiskCacheId$options_release", "(Ljava/lang/String;)V", "diskCacheId", "options_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static class C19002a<T extends C19002a<T>> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Priority priority;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public ImageRequest.CacheChoice cacheChoice;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public String diskCacheId;

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ImageRequest.CacheChoice getCacheChoice() {
            return this.cacheChoice;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDiskCacheId() {
            return this.diskCacheId;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Priority getPriority() {
            return this.priority;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final T m165481e(@Nullable Priority priority) {
            this.priority = priority;
            return (T) m165480d();
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final T m165480d() {
            return this;
        }
    }
}
