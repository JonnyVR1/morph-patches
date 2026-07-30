package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m88121d2 = {"Ll/ovv;", "Ll/nvv;", "Ljava/util/concurrent/Executor;", "executor", "Ll/fj80;", "pooledByteBufferFactory", "<init>", "(Ljava/util/concurrent/Executor;Ll/fj80;)V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "Ll/n0f;", Constants.INAPP_DATA_TAG, "(Lcom/facebook/imagepipeline/request/ImageRequest;)Ll/n0f;", "", "f", "()Ljava/lang/String;", "Companion", "a", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class ovv extends nvv {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovv(@NotNull Executor executor, @NotNull fj80 fj80Var) {
        super(executor, fj80Var);
        executor.getClass();
        fj80Var.getClass();
    }

    @Override // p153l.nvv
    @Nullable
    /* JADX INFO: renamed from: d */
    public n0f mo100405d(@NotNull ImageRequest imageRequest) throws IOException {
        imageRequest.getClass();
        return m164929e(new FileInputStream(imageRequest.m8638v().toString()), (int) imageRequest.m8638v().length());
    }

    @Override // p153l.nvv
    @NotNull
    /* JADX INFO: renamed from: f */
    public String mo100406f() {
        return "LocalFileFetchProducer";
    }
}
