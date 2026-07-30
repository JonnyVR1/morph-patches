package p006l;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import l.gxc0;
import l.rhi;
import l.v95;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll/biw;", "", "<init>", "()V", "Ljava/io/File;", "file", "Ll/gxc0;", "response", "", "a", "(Ljava/io/File;Ll/gxc0;)V", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class biw {

    @NotNull
    public static final biw INSTANCE = new biw();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m12703a(@Nullable File file, @Nullable gxc0 response) {
        ?? Exists;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (file == null || response == null) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && (Exists = parentFile.exists()) == 0) {
            parentFile.mkdirs();
        }
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = null;
        try {
            try {
                InputStream inputStreamByteStream = response.byteStream();
                try {
                    fileOutputStream2 = new FileOutputStream(file);
                    try {
                        rhi.f(inputStreamByteStream, fileOutputStream2);
                        v95.a(inputStreamByteStream);
                        Exists = fileOutputStream2;
                    } catch (Throwable unused) {
                        inputStream = inputStreamByteStream;
                        fileOutputStream = fileOutputStream2;
                        v95.a(inputStream);
                        Exists = fileOutputStream;
                    }
                } catch (Throwable unused2) {
                    fileOutputStream2 = null;
                }
            } catch (Throwable unused3) {
                fileOutputStream = null;
            }
        } catch (IOException unused4) {
        }
        try {
            v95.a((Closeable) Exists);
        } catch (IOException unused5) {
        }
    }
}
