package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Target;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p118io.ByteStreamsKt;
import kotlin.p118io.CloseableKt;
import kotlin.p118io.FileAlreadyExistsException;
import kotlin.p118io.FileSystemException;
import kotlin.p118io.NoSuchFileException;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\"\u0015\u0010\r\u001a\u00020\n*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0015\u0010\u000f\u001a\u00020\n*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0010"}, m87232d2 = {"Ljava/io/File;", Target.TYPE, "", "overwrite", "", "bufferSize", "p", "(Ljava/io/File;Ljava/io/File;ZI)Ljava/io/File;", "r", "(Ljava/io/File;)Z", "", BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/io/File;)Ljava/lang/String;", "extension", Constants.KEY_T, "nameWithoutExtension", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/io/FilesKt")
@SourceDebugExtension
public class bii extends aii {
    @NotNull
    /* JADX INFO: renamed from: p */
    public static File m102040p(@NotNull File file, @NotNull File file2, boolean z, int i) throws FileSystemException {
        file.getClass();
        file2.getClass();
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (file2.exists()) {
            if (!z) {
                throw new FileAlreadyExistsException(file, file2, "The destination file already exists.");
            }
            if (!file2.delete()) {
                throw new FileAlreadyExistsException(file, file2, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (file2.mkdirs()) {
                return file2;
            }
            throw new FileSystemException(file, file2, "Failed to create target directory.");
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                ByteStreamsKt.m87401a(fileInputStream, fileOutputStream, i);
                CloseableKt.m87404a(fileOutputStream, null);
                CloseableKt.m87404a(fileInputStream, null);
                return file2;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m87404a(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.m87404a(fileInputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ File m102041q(File file, File file2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return m102040p(file, file2, z, i);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m102042r(@NotNull File file) {
        file.getClass();
        while (true) {
            boolean z = true;
            for (File file2 : aii.m96817o(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
            return z;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public static String m102043s(@NotNull File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        return StringsKt.m93411O0(name, '.', "");
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public static String m102044t(@NotNull File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        return StringsKt.m93431Y0(name, ".", null, 2, null);
    }
}
