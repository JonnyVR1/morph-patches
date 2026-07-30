package okio;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.text.StringsKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000R\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0007\u001a\n\u0010\b\u001a\u00020\u0006*\u00020\t\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\u0006\u001a\n\u0010\n\u001a\u00020\f*\u00020\r\u001a\u0016\u0010\u000e\u001a\u00020\u0006*\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007\u001a\n\u0010\u000e\u001a\u00020\u0006*\u00020\u0010\u001a\n\u0010\u000e\u001a\u00020\u0006*\u00020\u0011\u001a%\u0010\u000e\u001a\u00020\u0006*\u00020\u00122\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001a\n\u0010\u0017\u001a\u00020\r*\u00020\t\u001a\n\u0010\u0017\u001a\u00020\r*\u00020\u0018\u001a\n\u0010\u0017\u001a\u00020\r*\u00020\u0011\u001a%\u0010\u0017\u001a\u00020\r*\u00020\u00122\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0019\"\u001c\u0010\u0000\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0004¨\u0006\u001a"}, m87232d2 = {"isAndroidGetsocknameError", "", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "(Ljava/lang/AssertionError;)Z", "blackholeSink", "Lokio/Sink;", "blackhole", "appendingSink", "Ljava/io/File;", "buffer", "Lokio/BufferedSink;", "Lokio/BufferedSource;", "Lokio/Source;", "sink", RequestParameters.SUBRESOURCE_APPEND, "Ljava/io/OutputStream;", "Ljava/net/Socket;", "Ljava/nio/file/Path;", com.p046p1.mobile.putong.core.data.Options.TYPE, "", "Ljava/nio/file/OpenOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Sink;", "source", "Ljava/io/InputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Source;", "jvm"}, m87233k = 2, m87234mv = {1, 1, 11})
@JvmName
public final class Okio {
    @NotNull
    public static final Sink appendingSink(@NotNull File file) throws FileNotFoundException {
        file.getClass();
        return sink(new FileOutputStream(file, true));
    }

    @JvmName
    @NotNull
    public static final Sink blackhole() {
        return new BlackholeSink();
    }

    @NotNull
    public static final BufferedSource buffer(@NotNull Source source) {
        source.getClass();
        return new RealBufferedSource(source);
    }

    public static final boolean isAndroidGetsocknameError(@NotNull AssertionError assertionError) {
        assertionError.getClass();
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? StringsKt.m93412P(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final Sink sink(@NotNull Socket socket) throws IOException {
        socket.getClass();
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.getClass();
        return socketAsyncTimeout.sink(new OutputStreamSink(outputStream, socketAsyncTimeout));
    }

    @JvmOverloads
    @NotNull
    public static /* bridge */ /* synthetic */ Sink sink$default(File file, boolean z, int i, Object obj) throws FileNotFoundException {
        if ((i & 1) != 0) {
            z = false;
        }
        return sink(file, z);
    }

    @NotNull
    public static final Source source(@NotNull Socket socket) throws IOException {
        socket.getClass();
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        InputStream inputStream = socket.getInputStream();
        inputStream.getClass();
        return socketAsyncTimeout.source(new InputStreamSource(inputStream, socketAsyncTimeout));
    }

    @NotNull
    public static final BufferedSink buffer(@NotNull Sink sink) {
        sink.getClass();
        return new RealBufferedSink(sink);
    }

    @NotNull
    public static final Sink sink(@NotNull OutputStream outputStream) {
        outputStream.getClass();
        return new OutputStreamSink(outputStream, new Timeout());
    }

    @NotNull
    public static final Source source(@NotNull InputStream inputStream) {
        inputStream.getClass();
        return new InputStreamSource(inputStream, new Timeout());
    }

    @JvmOverloads
    @NotNull
    public static final Sink sink(@NotNull File file) throws FileNotFoundException {
        return sink$default(file, false, 1, null);
    }

    @NotNull
    public static final Source source(@NotNull File file) throws FileNotFoundException {
        file.getClass();
        return source(new FileInputStream(file));
    }

    @JvmOverloads
    @NotNull
    public static final Sink sink(@NotNull File file, boolean z) throws FileNotFoundException {
        file.getClass();
        return sink(new FileOutputStream(file, z));
    }

    @IgnoreJRERequirement
    @NotNull
    public static final Source source(@NotNull Path path, @NotNull OpenOption... openOptionArr) throws IOException {
        path.getClass();
        openOptionArr.getClass();
        InputStream inputStreamNewInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        inputStreamNewInputStream.getClass();
        return source(inputStreamNewInputStream);
    }

    @IgnoreJRERequirement
    @NotNull
    public static final Sink sink(@NotNull Path path, @NotNull OpenOption... openOptionArr) throws IOException {
        path.getClass();
        openOptionArr.getClass();
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        outputStreamNewOutputStream.getClass();
        return sink(outputStreamNewOutputStream);
    }
}
