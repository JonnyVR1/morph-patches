package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001\bB\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m87232d2 = {"Ll/kze;", "", "Ll/kze$a;", "builder", "<init>", "(Ll/kze$a;)V", "other", "", "a", "(Ll/kze;)Z", "", "hashCode", "()I", "Ll/t050$a;", "b", "()Ll/t050$a;", "Lcom/facebook/imagepipeline/common/Priority;", "Lcom/facebook/imagepipeline/common/Priority;", "getPriority", "()Lcom/facebook/imagepipeline/common/Priority;", "priority", "Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;", "Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;", "getCacheChoice", "()Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;", "cacheChoice", "", "c", "Ljava/lang/String;", "getDiskCacheId", "()Ljava/lang/String;", "diskCacheId", "options_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public class kze {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Priority priority;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final ImageRequest.CacheChoice cacheChoice;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String diskCacheId;

    public kze(@NotNull C18118a<?> c18118a) {
        c18118a.getClass();
        this.priority = c18118a.getPriority();
        this.cacheChoice = c18118a.getCacheChoice();
        String diskCacheId = c18118a.getDiskCacheId();
        this.diskCacheId = diskCacheId;
        if (c18118a.getCacheChoice() == ImageRequest.CacheChoice.DYNAMIC) {
            if (diskCacheId == null) {
                throw new ImageRequestBuilder.BuilderException("Disk cache id must be set for dynamic cache choice");
            }
        } else if (diskCacheId != null && diskCacheId.length() != 0) {
            throw new ImageRequestBuilder.BuilderException("Ensure that if you want to use a disk cache id, you set the CacheChoice to DYNAMIC");
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m147937a(@NotNull kze other) {
        other.getClass();
        return t050.m186814a(this.priority, other.priority) && t050.m186814a(this.cacheChoice, other.cacheChoice) && t050.m186814a(this.diskCacheId, other.diskCacheId);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public t050.C20089a mo96512b() {
        t050.C20089a c20089aM186817b = t050.m186815b(this).m186817b("priority", this.priority).m186817b("cacheChoice", this.cacheChoice).m186817b("diskCacheId", this.diskCacheId);
        c20089aM186817b.getClass();
        return c20089aM186817b;
    }

    public int hashCode() {
        Priority priority = this.priority;
        int iHashCode = (priority != null ? priority.hashCode() : 0) * 31;
        ImageRequest.CacheChoice cacheChoice = this.cacheChoice;
        int iHashCode2 = (iHashCode + (cacheChoice != null ? cacheChoice.hashCode() : 0)) * 31;
        String str = this.diskCacheId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: l.kze$a */
    @Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00028\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\t\u0010\nR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u0012\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m87232d2 = {"Ll/kze$a;", j6f.GPS_DIRECTION_TRUE, "", "<init>", "()V", "Lcom/facebook/imagepipeline/common/Priority;", "priority", "e", "(Lcom/facebook/imagepipeline/common/Priority;)Ll/kze$a;", Constants.INAPP_DATA_TAG, "()Ll/kze$a;", "a", "Lcom/facebook/imagepipeline/common/Priority;", "c", "()Lcom/facebook/imagepipeline/common/Priority;", "setPriority$options_release", "(Lcom/facebook/imagepipeline/common/Priority;)V", "Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;", "b", "Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;", "()Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;", "setCacheChoice$options_release", "(Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;)V", "cacheChoice", "", "Ljava/lang/String;", "()Ljava/lang/String;", "setDiskCacheId$options_release", "(Ljava/lang/String;)V", "diskCacheId", "options_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static class C18118a<T extends C18118a<T>> {

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
        public final T m147942e(@Nullable Priority priority) {
            this.priority = priority;
            return (T) m147941d();
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final T m147941d() {
            return this;
        }
    }
}
