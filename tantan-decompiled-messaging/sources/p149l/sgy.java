package p149l;

import com.clevertap.android.sdk.Constants;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\bH&¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u0004\u0018\u00010 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001e¨\u0006&"}, m87232d2 = {"Ll/sgy;", "", "", "close", "()V", "", "isClosed", "()Z", "", "memoryOffset", "", "byteArray", "byteArrayOffset", "count", "b", "(I[BII)I", "p", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "", "r", "(I)B", "other", "otherOffset", Constants.INAPP_DATA_TAG, "(ILl/sgy;II)V", "getSize", "()I", "size", "", "o", "()J", "nativePtr", "Ljava/nio/ByteBuffer;", "getByteBuffer", "()Ljava/nio/ByteBuffer;", "byteBuffer", "getUniqueId", "uniqueId", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface sgy {
    /* JADX INFO: renamed from: b */
    int mo8436b(int memoryOffset, @NotNull byte[] byteArray, int byteArrayOffset, int count);

    void close();

    /* JADX INFO: renamed from: d */
    void mo8437d(int offset, @NotNull sgy other, int otherOffset, int count);

    @Nullable
    ByteBuffer getByteBuffer();

    int getSize();

    long getUniqueId();

    boolean isClosed();

    /* JADX INFO: renamed from: o */
    long mo8438o() throws UnsupportedOperationException;

    /* JADX INFO: renamed from: p */
    int mo8439p(int memoryOffset, @NotNull byte[] byteArray, int byteArrayOffset, int count);

    /* JADX INFO: renamed from: r */
    byte mo8440r(int offset);
}
