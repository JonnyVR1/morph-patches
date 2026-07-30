package kotlin.p118io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"Ljava/io/InputStream;", "Ljava/io/OutputStream;", "out", "", "bufferSize", "", "a", "(Ljava/io/InputStream;Ljava/io/OutputStream;I)J", "kotlin-stdlib"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@JvmName
public final class ByteStreamsKt {
    /* JADX INFO: renamed from: a */
    public static final long m87401a(@NotNull InputStream inputStream, @NotNull OutputStream outputStream, int i) throws IOException {
        inputStream.getClass();
        outputStream.getClass();
        byte[] bArr = new byte[i];
        int i2 = inputStream.read(bArr);
        long j = 0;
        while (i2 >= 0) {
            outputStream.write(bArr, 0, i2);
            j += (long) i2;
            i2 = inputStream.read(bArr);
        }
        return j;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m87402b(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m87401a(inputStream, outputStream, i);
    }
}
