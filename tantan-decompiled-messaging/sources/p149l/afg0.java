package p149l;

import com.tencent.could.component.common.p079ai.clipphoto.FileUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class afg0 {

    /* JADX INFO: renamed from: a */
    public static final String f69172a = "SudGIP ".concat(afg0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public static n8g0 m96220a(String str, String str2) throws Throwable {
        ZipFile zipFile;
        n8g0 n8g0Var = new n8g0();
        File file = new File(str);
        File file2 = new File(str2);
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(file);
                try {
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
                    byte[] bArr = new byte[1024];
                    while (true) {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry == null) {
                            p6g0.m167665c(zipFile);
                            return n8g0Var;
                        }
                        String name = nextEntry.getName();
                        if (!name.contains("__MACOSX")) {
                            if (nextEntry.isDirectory()) {
                                new File(file2, name).mkdirs();
                            } else {
                                InputStream inputStream = zipFile.getInputStream(nextEntry);
                                FileOutputStream fileOutputStream = new FileOutputStream(new File(file2, name));
                                while (true) {
                                    try {
                                        int i = inputStream.read(bArr);
                                        if (i < 0) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, i);
                                    } catch (Throwable th) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }
                                fileOutputStream.flush();
                                inputStream.close();
                                fileOutputStream.close();
                            }
                        }
                        zipInputStream.closeEntry();
                    }
                } catch (Exception e) {
                    e = e;
                    zipFile2 = zipFile;
                    LogUtils.file(FileUtils.TAG, "unzip2 error:" + LogUtils.getErrorInfo(e));
                    e.printStackTrace();
                    n8g0Var.f137642a = -1;
                    n8g0Var.f137643b = e.toString();
                    p6g0.m167665c(zipFile2);
                    return n8g0Var;
                } catch (Throwable th3) {
                    th = th3;
                    p6g0.m167665c(zipFile);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                zipFile = zipFile2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m96221b(long j, String str, String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || 0 == j) {
            LogUtils.file(FileUtils.TAG, "checkFileIsOk empty path:" + str + "  fileName:" + str2 + "  size:" + j);
            SudLogger.m221565d(f69172a, "checkFileIsOk empty path:" + str + "  fileName:" + str2 + "  size:" + j);
            return false;
        }
        File file = new File(str, str2);
        String absolutePath = file.getAbsolutePath();
        if (!(absolutePath == null ? false : new File(absolutePath).exists())) {
            LogUtils.file(FileUtils.TAG, "checkFileIsOk notExists path:" + str + "  fileName:" + str2 + "  size:" + j);
            SudLogger.m221565d(f69172a, "checkFileIsOk notExists path:" + str + "  fileName:" + str2 + "  size:" + j);
            return false;
        }
        long length = file.length();
        if (length != 0 && length == j) {
            return true;
        }
        LogUtils.file(FileUtils.TAG, "checkFileIsOk size error:" + str + "  fileName:" + str2 + "  size:" + j + "  fileSize:" + length);
        SudLogger.m221565d(f69172a, "checkFileIsOk size error:" + str + "  fileName:" + str2 + "  size:" + j + "  fileSize:" + length);
        return false;
    }
}
