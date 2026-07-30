package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m87232d2 = {"Ll/ntv;", "Ll/mtv;", "Ljava/util/concurrent/Executor;", "executor", "Ll/za80;", "pooledByteBufferFactory", "<init>", "(Ljava/util/concurrent/Executor;Ll/za80;)V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "Ll/jze;", Constants.INAPP_DATA_TAG, "(Lcom/facebook/imagepipeline/request/ImageRequest;)Ll/jze;", "", "f", "()Ljava/lang/String;", "Companion", "a", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class ntv extends mtv {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ntv(@NotNull Executor executor, @NotNull za80 za80Var) {
        super(executor, za80Var);
        executor.getClass();
        za80Var.getClass();
    }

    @Override // p149l.mtv
    @Nullable
    /* JADX INFO: renamed from: d */
    public jze mo98619d(@NotNull ImageRequest imageRequest) throws IOException {
        imageRequest.getClass();
        return m156359e(new FileInputStream(imageRequest.m8584v().toString()), (int) imageRequest.m8584v().length());
    }

    @Override // p149l.mtv
    @NotNull
    /* JADX INFO: renamed from: f */
    public String mo98620f() {
        return "LocalFileFetchProducer";
    }
}
