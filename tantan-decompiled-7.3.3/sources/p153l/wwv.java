package p153l;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import com.clevertap.android.sdk.Constants;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m88121d2 = {"Ll/wwv;", "Ll/nvv;", "Ljava/util/concurrent/Executor;", "executor", "Ll/fj80;", "pooledByteBufferFactory", "Landroid/content/res/Resources;", "resources", "<init>", "(Ljava/util/concurrent/Executor;Ll/fj80;Landroid/content/res/Resources;)V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "", "g", "(Lcom/facebook/imagepipeline/request/ImageRequest;)I", "Ll/n0f;", Constants.INAPP_DATA_TAG, "(Lcom/facebook/imagepipeline/request/ImageRequest;)Ll/n0f;", "", "f", "()Ljava/lang/String;", "c", "Landroid/content/res/Resources;", "Companion", "a", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class wwv extends nvv {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Resources resources;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwv(@NotNull Executor executor, @NotNull fj80 fj80Var, @NotNull Resources resources) {
        super(executor, fj80Var);
        executor.getClass();
        fj80Var.getClass();
        resources.getClass();
        this.resources = resources;
    }

    /* JADX INFO: renamed from: g */
    private final int m208316g(ImageRequest imageRequest) {
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = null;
        try {
            assetFileDescriptorOpenRawResourceFd = this.resources.openRawResourceFd(INSTANCE.m208318b(imageRequest));
            int length = (int) assetFileDescriptorOpenRawResourceFd.getLength();
            try {
                assetFileDescriptorOpenRawResourceFd.close();
                return length;
            } catch (IOException unused) {
                return length;
            }
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th) {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    @Override // p153l.nvv
    @Nullable
    /* JADX INFO: renamed from: d */
    public n0f mo100405d(@NotNull ImageRequest imageRequest) throws IOException {
        imageRequest.getClass();
        return m164929e(this.resources.openRawResource(INSTANCE.m208318b(imageRequest)), m208316g(imageRequest));
    }

    @Override // p153l.nvv
    @NotNull
    /* JADX INFO: renamed from: f */
    public String mo100406f() {
        return "LocalResourceFetchProducer";
    }

    /* JADX INFO: renamed from: l.wwv$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/wwv$a;", "", "<init>", "()V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "", "b", "(Lcom/facebook/imagepipeline/request/ImageRequest;)I", "", "PRODUCER_NAME", "Ljava/lang/String;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final int m208318b(ImageRequest imageRequest) {
            String path = imageRequest.m8639w().getPath();
            if (path != null) {
                return Integer.parseInt(path.substring(1));
            }
            wtq0.m207906a("Required value was null.");
            return 0;
        }

        public Companion() {
        }
    }
}
