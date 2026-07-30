package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ5\u0010\u001f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J=\u0010\"\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00112\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\"\u0010#J5\u0010$\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u001dH\u0016¢\u0006\u0004\b$\u0010 J'\u0010&\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)¨\u0006*"}, m87232d2 = {"Ll/uq2;", "Ll/guc0;", "<init>", "()V", "Lcom/facebook/imagepipeline/request/ImageRequest;", SocialConstants.TYPE_REQUEST, "", "callerContext", "", "requestId", "", "isPrefetch", "", "e", "(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/Object;Ljava/lang/String;Z)V", "b", "(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/String;Z)V", "", "throwable", "j", "(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/String;Ljava/lang/Throwable;Z)V", "k", "(Ljava/lang/String;)V", "producerName", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "eventName", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "extraMap", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", Constants.KEY_T, "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "h", "successful", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ljava/lang/String;Z)V", "f", "(Ljava/lang/String;)Z", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public class uq2 implements guc0 {
    @Override // p149l.zc90
    /* JADX INFO: renamed from: a */
    public void mo109499a(@NotNull String requestId, @NotNull String producerName) {
        requestId.getClass();
        producerName.getClass();
    }

    @Override // p149l.guc0
    /* JADX INFO: renamed from: b */
    public void mo109500b(@NotNull ImageRequest request, @NotNull String requestId, boolean isPrefetch) {
        request.getClass();
        requestId.getClass();
    }

    @Override // p149l.zc90
    /* JADX INFO: renamed from: c */
    public void mo109501c(@NotNull String requestId, @NotNull String producerName, @NotNull Throwable t, @Nullable Map<String, String> extraMap) {
        requestId.getClass();
        producerName.getClass();
        t.getClass();
    }

    @Override // p149l.zc90
    /* JADX INFO: renamed from: d */
    public void mo109502d(@NotNull String requestId, @NotNull String producerName, @NotNull String eventName) {
        requestId.getClass();
        producerName.getClass();
        eventName.getClass();
    }

    @Override // p149l.guc0
    /* JADX INFO: renamed from: e */
    public void mo109503e(@NotNull ImageRequest request, @NotNull Object callerContext, @NotNull String requestId, boolean isPrefetch) {
        request.getClass();
        callerContext.getClass();
        requestId.getClass();
    }

    @Override // p149l.zc90
    /* JADX INFO: renamed from: f */
    public boolean mo109504f(@NotNull String requestId) {
        requestId.getClass();
        return false;
    }

    @Override // p149l.zc90
    /* JADX INFO: renamed from: g */
    public void mo109505g(@NotNull String requestId, @NotNull String producerName, @Nullable Map<String, String> extraMap) {
        requestId.getClass();
        producerName.getClass();
    }

    @Override // p149l.zc90
    /* JADX INFO: renamed from: h */
    public void mo109506h(@NotNull String requestId, @NotNull String producerName, @Nullable Map<String, String> extraMap) {
        requestId.getClass();
        producerName.getClass();
    }

    @Override // p149l.zc90
    /* JADX INFO: renamed from: i */
    public void mo109507i(@NotNull String requestId, @NotNull String producerName, boolean successful) {
        requestId.getClass();
        producerName.getClass();
    }

    @Override // p149l.guc0
    /* JADX INFO: renamed from: j */
    public void mo109508j(@NotNull ImageRequest request, @NotNull String requestId, @NotNull Throwable throwable, boolean isPrefetch) {
        request.getClass();
        requestId.getClass();
        throwable.getClass();
    }

    @Override // p149l.guc0
    /* JADX INFO: renamed from: k */
    public void mo109509k(@NotNull String requestId) {
        requestId.getClass();
    }
}
