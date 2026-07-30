package p153l;

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
public class jwq0 {

    /* JADX INFO: renamed from: a */
    private static List<String> f122953a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static String m147185a(Context context, String str, File file) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String strM147186b = m147186b(applicationInfo.sourceDir, str, file);
        if (strM147186b == null) {
            return null;
        }
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            for (String str2 : strArr) {
                strM147186b = m147186b(str2, str, file);
                if (strM147186b == null) {
                    return null;
                }
            }
        }
        try {
            ClassLoader classLoader = jwq0.class.getClassLoader();
            while (!(classLoader instanceof BaseDexClassLoader) && classLoader.getParent() != null) {
                classLoader = classLoader.getParent();
            }
            if (!(classLoader instanceof BaseDexClassLoader)) {
                return strM147186b;
            }
            Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(classLoader);
            Field declaredField2 = obj.getClass().getDeclaredField("nativeLibraryDirectories");
            declaredField2.setAccessible(true);
            for (String str3 : (String[]) declaredField2.get(obj)) {
                File file2 = new File(str3, System.mapLibraryName(str));
                if (file2.exists()) {
                    r3r0.m179683i(file2, file);
                    m4r0.m157052b(file.getAbsolutePath(), UnixStat.DEFAULT_DIR_PERM);
                    return null;
                }
            }
            return "not_found";
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m147186b(String str, String str2, File file) {
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
                        m4r0.m157051a(null);
                        m4r0.m157051a(null);
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
                                m4r0.m157052b(file.getAbsolutePath(), UnixStat.DEFAULT_DIR_PERM);
                                m4r0.m157051a(fileOutputStream2);
                                m4r0.m157051a(inputStream2);
                                m4r0.m157053c(zipFile);
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
                            m4r0.m157051a(fileOutputStream);
                            m4r0.m157051a(inputStream);
                            return message;
                        } finally {
                            m4r0.m157051a(fileOutputStream);
                            m4r0.m157051a(inputStream);
                            m4r0.m157053c(zipFile);
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
