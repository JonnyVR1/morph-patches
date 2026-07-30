package p149l;

import android.content.ContentResolver;
import com.clevertap.android.sdk.Constants;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m87232d2 = {"Ll/lnb0;", "Ll/mtv;", "Ljava/util/concurrent/Executor;", "executor", "Ll/za80;", "pooledByteBufferFactory", "Landroid/content/ContentResolver;", "contentResolver", "<init>", "(Ljava/util/concurrent/Executor;Ll/za80;Landroid/content/ContentResolver;)V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "Ll/jze;", Constants.INAPP_DATA_TAG, "(Lcom/facebook/imagepipeline/request/ImageRequest;)Ll/jze;", "", "f", "()Ljava/lang/String;", "c", "Landroid/content/ContentResolver;", "Companion", "a", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class lnb0 extends mtv {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ContentResolver contentResolver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnb0(@NotNull Executor executor, @NotNull za80 za80Var, @NotNull ContentResolver contentResolver) {
        super(executor, za80Var);
        executor.getClass();
        za80Var.getClass();
        contentResolver.getClass();
        this.contentResolver = contentResolver;
    }

    @Override // p149l.mtv
    @NotNull
    /* JADX INFO: renamed from: d */
    public jze mo98619d(@NotNull ImageRequest imageRequest) throws IOException {
        imageRequest.getClass();
        InputStream inputStreamOpenInputStream = this.contentResolver.openInputStream(imageRequest.m8585w());
        if (inputStreamOpenInputStream == null) {
            qkq0.m175383a("ContentResolver returned null InputStream");
            return null;
        }
        jze jzeVarM156359e = m156359e(inputStreamOpenInputStream, -1);
        jzeVarM156359e.getClass();
        return jzeVarM156359e;
    }

    @Override // p149l.mtv
    @NotNull
    /* JADX INFO: renamed from: f */
    public String mo98620f() {
        return "QualifiedResourceFetchProducer";
    }
}
