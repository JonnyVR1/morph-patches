package p149l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.apache.commons.sudcompress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes.dex */
public class dnq0 {

    /* JADX INFO: renamed from: a */
    private static List<String> f87090a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static String m112650a(Context context, String str, File file) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String strM112651b = m112651b(applicationInfo.sourceDir, str, file);
        if (strM112651b == null) {
            return null;
        }
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            for (String str2 : strArr) {
                strM112651b = m112651b(str2, str, file);
                if (strM112651b == null) {
                    return null;
                }
            }
        }
        try {
            ClassLoader classLoader = dnq0.class.getClassLoader();
            while (!(classLoader instanceof BaseDexClassLoader) && classLoader.getParent() != null) {
                classLoader = classLoader.getParent();
            }
            if (!(classLoader instanceof BaseDexClassLoader)) {
                return strM112651b;
            }
            Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(classLoader);
            Field declaredField2 = obj.getClass().getDeclaredField("nativeLibraryDirectories");
            declaredField2.setAccessible(true);
            for (String str3 : (String[]) declaredField2.get(obj)) {
                File file2 = new File(str3, System.mapLibraryName(str));
                if (file2.exists()) {
                    luq0.m151795i(file2, file);
                    gvq0.m128291b(file.getAbsolutePath(), UnixStat.DEFAULT_DIR_PERM);
                    return null;
                }
            }
            return "not_found";
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m112651b(String str, String str2, File file) {
        InputStream inputStream;
        ZipFile zipFile;
        String message;
        FileOutputStream fileOutputStream = null;
        try {
            zipFile = new ZipFile(new File(str), 1);
            try {
                StringBuilder sb = new StringBuilder("lib/");
                String str3 = Build.CPU_ABI;
                sb.append(str3);
                sb.append("/");
                sb.append(System.mapLibraryName(str2));
                ZipEntry entry = zipFile.getEntry(sb.toString());
                if (entry == null) {
                    int iIndexOf = str3.indexOf(45);
                    StringBuilder sb2 = new StringBuilder("lib/");
                    if (iIndexOf <= 0) {
                        iIndexOf = str3.length();
                    }
                    sb2.append(str3.substring(0, iIndexOf));
                    sb2.append("/");
                    sb2.append(System.mapLibraryName(str2));
                    String string = sb2.toString();
                    ZipEntry entry2 = zipFile.getEntry(string);
                    if (entry2 == null) {
                        message = "Library entry not found:".concat(string);
                        gvq0.m128290a(null);
                        gvq0.m128290a(null);
                        return message;
                    }
                    entry = entry2;
                }
                file.createNewFile();
                InputStream inputStream2 = zipFile.getInputStream(entry);
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i = inputStream2.read(bArr);
                            if (i <= 0) {
                                gvq0.m128291b(file.getAbsolutePath(), UnixStat.DEFAULT_DIR_PERM);
                                gvq0.m128290a(fileOutputStream2);
                                gvq0.m128290a(inputStream2);
                                gvq0.m128292c(zipFile);
                                return null;
                            }
                            fileOutputStream2.write(bArr, 0, i);
                        }
                    } catch (Throwable th) {
                        fileOutputStream = fileOutputStream2;
                        inputStream = inputStream2;
                        th = th;
                        try {
                            message = th.getMessage();
                            gvq0.m128290a(fileOutputStream);
                            gvq0.m128290a(inputStream);
                            return message;
                        } finally {
                            gvq0.m128290a(fileOutputStream);
                            gvq0.m128290a(inputStream);
                            gvq0.m128292c(zipFile);
                        }
                    }
                } catch (Throwable th2) {
                    inputStream = inputStream2;
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            zipFile = null;
        }
    }
}
