package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.imagepipeline.memory.BasePool;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u000fJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0007H&¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H&¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H&¢\u0006\u0004\b\u0012\u0010\n¨\u0006\u0014"}, m87232d2 = {"Ll/wa80;", "", "Lcom/facebook/imagepipeline/memory/BasePool;", "basePool", "", "g", "(Lcom/facebook/imagepipeline/memory/BasePool;)V", "", "bucketedSize", "b", "(I)V", Constants.INAPP_DATA_TAG, "()V", "c", "size", "a", "sizeInBytes", "e", "f", "Companion", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface wa80 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f185447a;

    /* JADX INFO: renamed from: l.wa80$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m87232d2 = {"Ll/wa80$a;", "", "<init>", "()V", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f185447a = new Companion();
    }

    /* JADX INFO: renamed from: a */
    void mo189424a(int size);

    /* JADX INFO: renamed from: b */
    void mo189425b(int bucketedSize);

    /* JADX INFO: renamed from: c */
    void mo189426c();

    /* JADX INFO: renamed from: d */
    void mo189427d();

    /* JADX INFO: renamed from: e */
    void mo189428e(int sizeInBytes);

    /* JADX INFO: renamed from: f */
    void mo189429f(int sizeInBytes);

    /* JADX INFO: renamed from: g */
    void mo189430g(@NotNull BasePool<?> basePool);
}
