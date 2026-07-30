package p153l;

import android.content.ContentResolver;
import com.clevertap.android.sdk.Constants;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m88121d2 = {"Ll/pvb0;", "Ll/nvv;", "Ljava/util/concurrent/Executor;", "executor", "Ll/fj80;", "pooledByteBufferFactory", "Landroid/content/ContentResolver;", "contentResolver", "<init>", "(Ljava/util/concurrent/Executor;Ll/fj80;Landroid/content/ContentResolver;)V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "Ll/n0f;", Constants.INAPP_DATA_TAG, "(Lcom/facebook/imagepipeline/request/ImageRequest;)Ll/n0f;", "", "f", "()Ljava/lang/String;", "c", "Landroid/content/ContentResolver;", "Companion", "a", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class pvb0 extends nvv {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ContentResolver contentResolver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvb0(@NotNull Executor executor, @NotNull fj80 fj80Var, @NotNull ContentResolver contentResolver) {
        super(executor, fj80Var);
        executor.getClass();
        fj80Var.getClass();
        contentResolver.getClass();
        this.contentResolver = contentResolver;
    }

    @Override // p153l.nvv
    @NotNull
    /* JADX INFO: renamed from: d */
    public n0f mo100405d(@NotNull ImageRequest imageRequest) throws IOException {
        imageRequest.getClass();
        InputStream inputStreamOpenInputStream = this.contentResolver.openInputStream(imageRequest.m8639w());
        if (inputStreamOpenInputStream == null) {
            wtq0.m207906a("ContentResolver returned null InputStream");
            return null;
        }
        n0f n0fVarM164929e = m164929e(inputStreamOpenInputStream, -1);
        n0fVarM164929e.getClass();
        return n0fVarM164929e;
    }

    @Override // p153l.nvv
    @NotNull
    /* JADX INFO: renamed from: f */
    public String mo100406f() {
        return "QualifiedResourceFetchProducer";
    }
}
