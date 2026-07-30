package p153l;

import android.os.Environment;
import android.os.StatFs;
import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p122io.ByteStreamsKt;
import kotlin.text.StringsKt;
import org.apache.commons.codec.binary.Hex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a\u0017\u0010\u000b\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u0019\u001a\u00020\u0018*\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u001d\u001a\u00020\u001c*\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!¨\u0006\""}, m88121d2 = {"Ljava/io/File;", "", "dirName", "f", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "g", "(Ljava/io/File;)Ljava/lang/String;", "file", "c", "", "data", "b", "([B)Ljava/lang/String;", "Ljava/io/InputStream;", "h", "(Ljava/io/InputStream;)[B", "Ljava/security/MessageDigest;", "digest", "j", "(Ljava/security/MessageDigest;Ljava/io/InputStream;)Ljava/security/MessageDigest;", "a", "(Ljava/security/MessageDigest;Ljava/io/InputStream;)[B", "e", "()Ljava/security/MessageDigest;", "Ljava/util/zip/ZipFile;", "k", "(Ljava/io/File;)Ljava/util/zip/ZipFile;", "dst", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/util/zip/ZipFile;Ljava/lang/String;)V", "", Constants.INAPP_DATA_TAG, "()J", "sharedlibrarymanager_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class o1m {
    /* JADX INFO: renamed from: a */
    public static final byte[] m165657a(MessageDigest messageDigest, InputStream inputStream) {
        return m165666j(messageDigest, inputStream).digest();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m165658b(@Nullable byte[] bArr) {
        char[] cArrEncodeHex = Hex.encodeHex(bArr);
        cArrEncodeHex.getClass();
        return new String(cArrEncodeHex);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m165659c(@Nullable File file) {
        return m165658b(m165664h(new FileInputStream(file)));
    }

    /* JADX INFO: renamed from: d */
    public static final long m165660d() {
        return new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final MessageDigest m165661e() throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.getClass();
        return messageDigest;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final File m165662f(@NotNull File file, @NotNull String str) {
        file.getClass();
        str.getClass();
        if (StringsKt.m94303P(str, "/", false, 2, null)) {
            File absoluteFile = file.getAbsoluteFile();
            absoluteFile.getClass();
            return absoluteFile;
        }
        File file2 = new File(file, str);
        if (file2.mkdir() || file2.exists()) {
            return file2;
        }
        File absoluteFile2 = file.getAbsoluteFile();
        absoluteFile2.getClass();
        return absoluteFile2;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m165663g(@NotNull File file) {
        file.getClass();
        return m165659c(file);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final byte[] m165664h(@NotNull InputStream inputStream) {
        inputStream.getClass();
        return m165657a(m165661e(), inputStream);
    }

    /* JADX INFO: renamed from: i */
    public static final void m165665i(@NotNull ZipFile zipFile, @NotNull String str) throws IOException {
        zipFile.getClass();
        str.getClass();
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        enumerationEntries.getClass();
        Iterator it = CollectionsKt.iterator(enumerationEntries);
        while (it.hasNext()) {
            ZipEntry zipEntry = (ZipEntry) it.next();
            if (zipEntry.isDirectory()) {
                new File(str, zipEntry.getName()).mkdir();
            } else {
                InputStream inputStream = zipFile.getInputStream(zipEntry);
                File file = new File(str, zipEntry.getName());
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                inputStream.getClass();
                ByteStreamsKt.m88291b(inputStream, fileOutputStream, 0, 2, null);
                fileOutputStream.close();
                inputStream.close();
            }
        }
        zipFile.close();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final MessageDigest m165666j(@NotNull MessageDigest messageDigest, @NotNull InputStream inputStream) throws IOException {
        messageDigest.getClass();
        inputStream.getClass();
        byte[] bArr = new byte[1024];
        int i = inputStream.read(bArr, 0, 1024);
        while (i > -1) {
            messageDigest.update(bArr, 0, i);
            i = inputStream.read(bArr, 0, 1024);
        }
        return messageDigest;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final ZipFile m165667k(@NotNull File file) {
        file.getClass();
        return new ZipFile(file);
    }
}
