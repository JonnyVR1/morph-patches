package okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.-DeprecatedOkio, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J)\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\"\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J)\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\"\u00020\u0016H\u0007¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, m88121d2 = {"Lokio/-DeprecatedOkio;", "", "()V", "appendingSink", "Lokio/Sink;", "file", "Ljava/io/File;", "blackhole", "buffer", "Lokio/BufferedSink;", "sink", "Lokio/BufferedSource;", "source", "Lokio/Source;", "outputStream", "Ljava/io/OutputStream;", "socket", "Ljava/net/Socket;", "path", "Ljava/nio/file/Path;", com.p051p1.mobile.putong.core.data.Options.TYPE, "", "Ljava/nio/file/OpenOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Sink;", "inputStream", "Ljava/io/InputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Source;", "jvm"}, m88122k = 1, m88123mv = {1, 1, 11})
public final class DeprecatedOkio {
    public static final DeprecatedOkio INSTANCE = new DeprecatedOkio();

    private DeprecatedOkio() {
    }

    @Deprecated
    @NotNull
    public final Sink appendingSink(@NotNull File file) {
        file.getClass();
        return Okio.appendingSink(file);
    }

    @Deprecated
    @NotNull
    public final Sink blackhole() {
        return Okio.blackhole();
    }

    @Deprecated
    @NotNull
    public final BufferedSink buffer(@NotNull Sink sink) {
        sink.getClass();
        return Okio.buffer(sink);
    }

    @Deprecated
    @NotNull
    public final Sink sink(@NotNull Path path, @NotNull OpenOption... options) {
        path.getClass();
        options.getClass();
        return Okio.sink(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @Deprecated
    @NotNull
    public final Source source(@NotNull Path path, @NotNull OpenOption... options) {
        path.getClass();
        options.getClass();
        return Okio.source(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @Deprecated
    @NotNull
    public final BufferedSource buffer(@NotNull Source source) {
        source.getClass();
        return Okio.buffer(source);
    }

    @Deprecated
    @NotNull
    public final Sink sink(@NotNull OutputStream outputStream) {
        outputStream.getClass();
        return Okio.sink(outputStream);
    }

    @Deprecated
    @NotNull
    public final Source source(@NotNull InputStream inputStream) {
        inputStream.getClass();
        return Okio.source(inputStream);
    }

    @Deprecated
    @NotNull
    public final Sink sink(@NotNull File file) {
        file.getClass();
        return Okio.sink$default(file, false, 1, null);
    }

    @Deprecated
    @NotNull
    public final Source source(@NotNull File file) {
        file.getClass();
        return Okio.source(file);
    }

    @Deprecated
    @NotNull
    public final Sink sink(@NotNull Socket socket) {
        socket.getClass();
        return Okio.sink(socket);
    }

    @Deprecated
    @NotNull
    public final Source source(@NotNull Socket socket) {
        socket.getClass();
        return Okio.source(socket);
    }
}
