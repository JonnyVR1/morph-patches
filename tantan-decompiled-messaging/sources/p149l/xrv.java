package p149l;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import com.clevertap.android.sdk.Constants;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m87232d2 = {"Ll/xrv;", "Ll/mtv;", "Ljava/util/concurrent/Executor;", "executor", "Ll/za80;", "pooledByteBufferFactory", "Landroid/content/res/AssetManager;", "assetManager", "<init>", "(Ljava/util/concurrent/Executor;Ll/za80;Landroid/content/res/AssetManager;)V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "Ll/jze;", Constants.INAPP_DATA_TAG, "(Lcom/facebook/imagepipeline/request/ImageRequest;)Ll/jze;", "", "f", "()Ljava/lang/String;", "", "g", "(Lcom/facebook/imagepipeline/request/ImageRequest;)I", "c", "Landroid/content/res/AssetManager;", "Companion", "a", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class xrv extends mtv {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AssetManager assetManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrv(@NotNull Executor executor, @NotNull za80 za80Var, @NotNull AssetManager assetManager) {
        super(executor, za80Var);
        executor.getClass();
        za80Var.getClass();
        assetManager.getClass();
        this.assetManager = assetManager;
    }

    @Override // p149l.mtv
    @Nullable
    /* JADX INFO: renamed from: d */
    public jze mo98619d(@NotNull ImageRequest imageRequest) throws IOException {
        imageRequest.getClass();
        return m156359e(this.assetManager.open(INSTANCE.m210725b(imageRequest), 2), m210723g(imageRequest));
    }

    @Override // p149l.mtv
    @NotNull
    /* JADX INFO: renamed from: f */
    public String mo98620f() {
        return "LocalAssetFetchProducer";
    }

    /* JADX INFO: renamed from: g */
    public final int m210723g(ImageRequest imageRequest) {
        AssetFileDescriptor assetFileDescriptorOpenFd = null;
        try {
            assetFileDescriptorOpenFd = this.assetManager.openFd(INSTANCE.m210725b(imageRequest));
            int length = (int) assetFileDescriptorOpenFd.getLength();
            try {
                assetFileDescriptorOpenFd.close();
                return length;
            } catch (IOException unused) {
                return length;
            }
        } catch (IOException unused2) {
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th) {
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: l.xrv$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/xrv$a;", "", "<init>", "()V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "", "b", "(Lcom/facebook/imagepipeline/request/ImageRequest;)Ljava/lang/String;", "PRODUCER_NAME", "Ljava/lang/String;", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final String m210725b(ImageRequest imageRequest) {
            String path = imageRequest.m8585w().getPath();
            path.getClass();
            return path.substring(1);
        }

        public Companion() {
        }
    }
}
