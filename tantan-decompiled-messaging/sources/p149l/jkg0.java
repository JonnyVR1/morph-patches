package p149l;

import android.os.Build;
import android.text.TextUtils;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jkg0 {
    /* JADX INFO: renamed from: a */
    public static String m141869a() {
        String str = Build.CPU_ABI;
        if (str != null && (str.equals("armeabi-v7a") || str.equals("arm64-v8a") || str.equals("x86") || str.equals("x86_64"))) {
            return str;
        }
        String str2 = Build.CPU_ABI2;
        return (str2 == null || !(str2.equals("armeabi-v7a") || str2.equals("arm64-v8a") || str2.equals("x86") || str2.equals("x86_64"))) ? "arm64-v8a" : str2;
    }

    /* JADX INFO: renamed from: b */
    public static n8g0 m141870b(String str, String str2) {
        FileChannel fileChannel;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        FileChannel fileChannel2;
        FileInputStream fileInputStream2;
        FileChannel fileChannel3;
        FileChannel channel;
        File file = new File(str2);
        if (file.exists()) {
            file.delete();
        }
        n8g0 n8g0Var = new n8g0();
        n8g0Var.f137642a = 0;
        File file2 = new File(str2);
        if (file2.exists()) {
            return n8g0Var;
        }
        File parentFile = file2.getParentFile();
        if (!parentFile.exists() && !parentFile.mkdirs()) {
            n8g0Var.f137642a = -1;
            n8g0Var.f137643b = "Make dir failed";
            LogUtils.file("SudRuntimeUtils", "Make dir failed: " + parentFile.getAbsolutePath());
            return n8g0Var;
        }
        File file3 = new File(str);
        if (!file3.exists()) {
            n8g0Var.f137642a = -10401;
            n8g0Var.f137643b = "File not exist";
            LogUtils.file("SudRuntimeUtils", "File not exist: " + str);
            return n8g0Var;
        }
        FileChannel fileChannel4 = null;
        try {
            fileInputStream2 = new FileInputStream(file3);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    FileChannel channel2 = fileInputStream2.getChannel();
                    try {
                        channel = fileOutputStream.getChannel();
                        try {
                            channel2.transferTo(0L, channel2.size(), channel);
                            m141871c(fileInputStream2);
                            m141871c(channel2);
                            m141871c(fileOutputStream);
                            m141871c(channel);
                            return n8g0Var;
                        } catch (IOException e) {
                            e = e;
                            fileChannel4 = channel2;
                            fileInputStream = fileInputStream2;
                            fileChannel2 = fileChannel4;
                            fileChannel4 = channel;
                            try {
                                n8g0Var.f137642a = -10401;
                                n8g0Var.f137643b = e.toString();
                                LogUtils.file("SudRuntimeUtils", "File copy failed: " + str + " -> " + str2);
                                StringBuilder sb = new StringBuilder("copyIfNotExist error:");
                                sb.append(LogUtils.getErrorInfo(e));
                                LogUtils.file("SudRuntimeUtils", sb.toString());
                                e.printStackTrace();
                                m141871c(fileInputStream);
                                m141871c(fileChannel2);
                                m141871c(fileOutputStream);
                                m141871c(fileChannel4);
                                return n8g0Var;
                            } catch (Throwable th) {
                                th = th;
                                fileChannel = fileChannel4;
                                fileChannel4 = fileChannel2;
                                FileChannel fileChannel5 = fileChannel4;
                                fileChannel4 = fileChannel;
                                fileChannel3 = fileChannel5;
                                fileInputStream2 = fileInputStream;
                                m141871c(fileInputStream2);
                                m141871c(fileChannel3);
                                m141871c(fileOutputStream);
                                m141871c(fileChannel4);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileChannel4 = channel2;
                            fileChannel3 = fileChannel4;
                            fileChannel4 = channel;
                            m141871c(fileInputStream2);
                            m141871c(fileChannel3);
                            m141871c(fileOutputStream);
                            m141871c(fileChannel4);
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        channel = null;
                    } catch (Throwable th3) {
                        th = th3;
                        channel = null;
                    }
                } catch (IOException e3) {
                    e = e3;
                    channel = null;
                } catch (Throwable th4) {
                    th = th4;
                    channel = null;
                }
            } catch (IOException e4) {
                e = e4;
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                fileChannel2 = null;
            } catch (Throwable th5) {
                th = th5;
                fileChannel3 = null;
                fileOutputStream = null;
            }
        } catch (IOException e5) {
            e = e5;
            fileOutputStream = null;
            fileChannel2 = null;
            fileInputStream = null;
        } catch (Throwable th6) {
            th = th6;
            fileChannel = null;
            fileOutputStream = null;
            fileInputStream = null;
            FileChannel fileChannel6 = fileChannel4;
            fileChannel4 = fileChannel;
            fileChannel3 = fileChannel6;
            fileInputStream2 = fileInputStream;
            m141871c(fileInputStream2);
            m141871c(fileChannel3);
            m141871c(fileOutputStream);
            m141871c(fileChannel4);
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m141871c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m141872d(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2 != null) {
                String name = file2.getName();
                if (!TextUtils.isEmpty(name) && !name.endsWith(".prof") && (!file2.isDirectory() || !name.endsWith(ShareConstants.ANDROID_O_DEX_OPTIMIZE_PATH))) {
                    if (file2.isDirectory()) {
                        m141872d(file2);
                    } else {
                        LogUtils.file("SudRuntimeUtils", "setCoreFileReadOnly:" + file2.setReadOnly());
                    }
                }
            }
        }
    }
}
