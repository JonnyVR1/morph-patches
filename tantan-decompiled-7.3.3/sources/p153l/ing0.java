package p153l;

import com.tencent.could.component.common.p084ai.clipphoto.FileUtils;
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
public abstract class ing0 {

    /* JADX INFO: renamed from: a */
    public static final String f115953a = "SudGIP ".concat(ing0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public static vgg0 m141127a(String str, String str2) throws Throwable {
        ZipFile zipFile;
        vgg0 vgg0Var = new vgg0();
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
                            xeg0.m210678c(zipFile);
                            return vgg0Var;
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
                    vgg0Var.f184033a = -1;
                    vgg0Var.f184034b = e.toString();
                    xeg0.m210678c(zipFile2);
                    return vgg0Var;
                } catch (Throwable th3) {
                    th = th3;
                    xeg0.m210678c(zipFile);
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
    public static boolean m141128b(long j, String str, String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || 0 == j) {
            LogUtils.file(FileUtils.TAG, "checkFileIsOk empty path:" + str + "  fileName:" + str2 + "  size:" + j);
            SudLogger.m222811d(f115953a, "checkFileIsOk empty path:" + str + "  fileName:" + str2 + "  size:" + j);
            return false;
        }
        File file = new File(str, str2);
        String absolutePath = file.getAbsolutePath();
        if (!(absolutePath == null ? false : new File(absolutePath).exists())) {
            LogUtils.file(FileUtils.TAG, "checkFileIsOk notExists path:" + str + "  fileName:" + str2 + "  size:" + j);
            SudLogger.m222811d(f115953a, "checkFileIsOk notExists path:" + str + "  fileName:" + str2 + "  size:" + j);
            return false;
        }
        long length = file.length();
        if (length != 0 && length == j) {
            return true;
        }
        LogUtils.file(FileUtils.TAG, "checkFileIsOk size error:" + str + "  fileName:" + str2 + "  size:" + j + "  fileSize:" + length);
        SudLogger.m222811d(f115953a, "checkFileIsOk size error:" + str + "  fileName:" + str2 + "  size:" + j + "  fileSize:" + length);
        return false;
    }
}
