package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Target;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p122io.ByteStreamsKt;
import kotlin.p122io.CloseableKt;
import kotlin.p122io.FileAlreadyExistsException;
import kotlin.p122io.FileSystemException;
import kotlin.p122io.NoSuchFileException;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\"\u0015\u0010\r\u001a\u00020\n*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0015\u0010\u000f\u001a\u00020\n*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0010"}, m88121d2 = {"Ljava/io/File;", Target.TYPE, "", "overwrite", "", "bufferSize", "p", "(Ljava/io/File;Ljava/io/File;ZI)Ljava/io/File;", "r", "(Ljava/io/File;)Z", "", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/io/File;)Ljava/lang/String;", "extension", Constants.KEY_T, "nameWithoutExtension", "kotlin-stdlib"}, m88122k = 5, m88123mv = {2, 2, 0}, m88125xi = 49, m88126xs = "kotlin/io/FilesKt")
@SourceDebugExtension
public class yki extends xki {
    @NotNull
    /* JADX INFO: renamed from: p */
    public static File m216468p(@NotNull File file, @NotNull File file2, boolean z, int i) throws FileSystemException {
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
                ByteStreamsKt.m88290a(fileInputStream, fileOutputStream, i);
                CloseableKt.m88293a(fileOutputStream, null);
                CloseableKt.m88293a(fileInputStream, null);
                return file2;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m88293a(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.m88293a(fileInputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ File m216469q(File file, File file2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return m216468p(file, file2, z, i);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m216470r(@NotNull File file) {
        file.getClass();
        while (true) {
            boolean z = true;
            for (File file2 : xki.m211401o(file)) {
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
    public static String m216471s(@NotNull File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        return StringsKt.m94302O0(name, '.', "");
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public static String m216472t(@NotNull File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        return StringsKt.m94322Y0(name, ".", null, 2, null);
    }
}
