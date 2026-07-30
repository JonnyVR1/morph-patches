package p149l;

import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Ljava/nio/channels/ReadableByteChannel;", "input", "Ljava/nio/channels/FileChannel;", "output", "", "a", "(Ljava/nio/channels/ReadableByteChannel;Ljava/nio/channels/FileChannel;)V", "room-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
@JvmName
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension
public final class shi {
    @SuppressLint({"LambdaLast"})
    /* JADX INFO: renamed from: a */
    public static final void m184192a(@NotNull ReadableByteChannel readableByteChannel, @NotNull FileChannel fileChannel) throws IOException {
        readableByteChannel.getClass();
        fileChannel.getClass();
        try {
            fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}
