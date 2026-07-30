package p149l;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Ll/nzf0;", "", "<init>", "()V", "Ljava/io/InputStream;", "stream", "", "numBytes", "", "isLittleEndian", "a", "(Ljava/io/InputStream;IZ)I", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class nzf0 {

    @NotNull
    public static final nzf0 INSTANCE = new nzf0();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m162039a(@NotNull InputStream stream, int numBytes, boolean isLittleEndian) throws IOException {
        int i;
        stream.getClass();
        int i2 = 0;
        for (int i3 = 0; i3 < numBytes; i3++) {
            int i4 = stream.read();
            if (i4 == -1) {
                rhg0.m179353a("no more bytes");
                return 0;
            }
            if (isLittleEndian) {
                i = (i4 & 255) << (i3 * 8);
            } else {
                i2 <<= 8;
                i = i4 & 255;
            }
            i2 |= i;
        }
        return i2;
    }
}
