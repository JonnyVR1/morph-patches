package p149l;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.eclipse.jetty.http.MimeTypes;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes13.dex */
public class rhi {

    /* JADX INFO: renamed from: a */
    public static final String[][] f159365a = {new String[]{".3gp", DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_3GP}, new String[]{ShareConstants.PATCH_SUFFIX, "application/vnd.android.package-archive"}, new String[]{".asf", DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_ASF}, new String[]{".avi", DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_XMS_AVI}, new String[]{".bin", OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE}, new String[]{".bmp", "image/bmp"}, new String[]{".c", MimeTypes.TEXT_PLAIN}, new String[]{".class", OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE}, new String[]{".conf", MimeTypes.TEXT_PLAIN}, new String[]{".cpp", MimeTypes.TEXT_PLAIN}, new String[]{".doc", "application/msword"}, new String[]{".exe", OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE}, new String[]{".gif", "image/gif"}, new String[]{".gtar", "application/x-gtar"}, new String[]{".gz", "application/x-gzip"}, new String[]{".h", MimeTypes.TEXT_PLAIN}, new String[]{".htm", MimeTypes.TEXT_HTML}, new String[]{".html", MimeTypes.TEXT_HTML}, new String[]{ShareConstants.JAR_SUFFIX, "application/java-archive"}, new String[]{".java", MimeTypes.TEXT_PLAIN}, new String[]{".jpeg", DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG}, new String[]{".jpg", DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG}, new String[]{".js", FastJsonJsonView.DEFAULT_JSONP_CONTENT_TYPE}, new String[]{".log", MimeTypes.TEXT_PLAIN}, new String[]{".m3u", "audio/x-mpegurl"}, new String[]{".m4a", "audio/mp4a-latm"}, new String[]{".m4b", "audio/mp4a-latm"}, new String[]{".m4p", "audio/mp4a-latm"}, new String[]{".m4u", "video/vnd.mpegurl"}, new String[]{".m4v", "video/x-m4v"}, new String[]{".mov", "video/quicktime"}, new String[]{".mp2", "audio/x-mpeg"}, new String[]{".mp3", "audio/x-mpeg"}, new String[]{".mp4", DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4}, new String[]{".mpc", "application/vnd.mpohun.certificate"}, new String[]{".mpe", DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG}, new String[]{".mpeg", DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG}, new String[]{".mpg", DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG}, new String[]{".mpg4", DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4}, new String[]{".mpga", DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG}, new String[]{".msg", "application/vnd.ms-outlook"}, new String[]{".ogg", "audio/ogg"}, new String[]{".pdf", "application/pdf"}, new String[]{".png", DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG}, new String[]{".pps", "application/vnd.ms-powerpoint"}, new String[]{".ppt", "application/vnd.ms-powerpoint"}, new String[]{".prop", MimeTypes.TEXT_PLAIN}, new String[]{".rar", "application/x-rar-compressed"}, new String[]{".rc", MimeTypes.TEXT_PLAIN}, new String[]{".rmvb", "audio/x-pn-realaudio"}, new String[]{".rtf", "application/rtf"}, new String[]{".sh", MimeTypes.TEXT_PLAIN}, new String[]{".tar", "application/x-tar"}, new String[]{".tgz", "application/x-compressed"}, new String[]{".txt", MimeTypes.TEXT_PLAIN}, new String[]{".wav", "audio/x-wav"}, new String[]{".wma", DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_WMA}, new String[]{".wmv", "audio/x-ms-wmv"}, new String[]{".wps", "application/vnd.ms-works"}, new String[]{".xml", MimeTypes.TEXT_PLAIN}, new String[]{".z", "application/x-compress"}, new String[]{".zip", "application/zip"}, new String[]{".svg", "image/svg+xml"}, new String[]{".css", "text/css"}, new String[]{"", "*/*"}};

    /* JADX INFO: renamed from: A */
    public static String m179354A(@Nullable File file) throws Throwable {
        if (file == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        t95.m187604b(bufferedReader2);
                        return sb.toString();
                    }
                    sb.append(line);
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    t95.m187604b(bufferedReader);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: B */
    public static String m179355B(String str) {
        return Uri.fromFile(new File(str)).toString();
    }

    /* JADX INFO: renamed from: C */
    public static String m179356C(String str) {
        if (str == null) {
            return null;
        }
        return Uri.fromFile(new File(str)).toString();
    }

    /* JADX INFO: renamed from: a */
    public static int m179357a(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 <= i2 && i4 <= i) {
            return 1;
        }
        int i6 = i3 / 2;
        int i7 = i4 / 2;
        while (i6 / i5 >= i2 && i7 / i5 >= i) {
            i5 *= 2;
        }
        return i5;
    }

    /* JADX INFO: renamed from: b */
    public static void m179358b(File file) throws IOException {
        if (!file.exists()) {
            lhi.m149843a(file, " does not exist");
            return;
        }
        if (!file.isDirectory()) {
            lhi.m149843a(file, " is not a directory");
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            mll.m155165a("Failed to list contents of ", file);
            return;
        }
        IOException e = null;
        for (File file2 : fileArrListFiles) {
            try {
                m179373q(file2);
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e != null) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m179359c(String str, String str2) {
        if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        if (!str2.endsWith("/")) {
            str2 = str2.concat("/");
        }
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        File file2 = new File(str2);
        if (!file2.exists() && !file2.mkdirs()) {
            return false;
        }
        if (file.isFile()) {
            return m179361e(file.getPath(), str2 + file.getName());
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            String str3 = str2 + file.getName() + "/";
            File file3 = new File(str3);
            if (!file3.exists()) {
                file3.mkdir();
                for (int i = 0; i < fileArrListFiles.length; i++) {
                    if (fileArrListFiles[i].isDirectory()) {
                        m179359c(fileArrListFiles[i].getPath() + "/", str3 + fileArrListFiles[i].getName() + "/");
                    } else {
                        m179361e(fileArrListFiles[i].getPath(), str3 + fileArrListFiles[i].getName());
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x009f A[Catch: IOException -> 0x009b, TRY_LEAVE, TryCatch #9 {IOException -> 0x009b, blocks: (B:46:0x0097, B:50:0x009f), top: B:60:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static boolean m179360d(Context context, String str, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        if (TextUtils.isEmpty(str) || file == null) {
            return false;
        }
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpen = context.getResources().getAssets().open(str);
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    m179362f(inputStreamOpen, fileOutputStream);
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException e) {
                            CrashHelper.m81296c(e);
                        }
                    }
                    fileOutputStream.close();
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    inputStream = inputStreamOpen;
                    try {
                        long[] jArrM179376t = m179376t();
                        long j = jArrM179376t[0];
                        long j2 = jArrM179376t[1];
                        if (j2 < 31457280) {
                            CrashHelper.m81296c(new IOException("available space only left less than 30M,the available is:" + j2 + ",the total is:" + j + ",msg:" + e.toString()));
                        } else {
                            CrashHelper.m81296c(e);
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e3) {
                                CrashHelper.m81296c(e3);
                                return false;
                            }
                        }
                        if (fileOutputStream == null) {
                            return false;
                        }
                        fileOutputStream.close();
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } catch (IOException e4) {
                                CrashHelper.m81296c(e4);
                                throw th;
                            }
                        } else if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStreamOpen;
                    if (inputStream != null) {
                        inputStream.close();
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } else if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (IOException e6) {
            e = e6;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.io.Closeable, java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX INFO: renamed from: e */
    public static boolean m179361e(String str, String str2) throws Throwable {
        ?? r3;
        ?? r4;
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream((String) str);
                try {
                    str = new FileOutputStream(str2);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = fileInputStream2.read(bArr);
                            if (i <= 0) {
                                t95.m187604b(fileInputStream2);
                                t95.m187604b(str);
                                return true;
                            }
                            str.write(bArr, 0, i);
                        }
                    } catch (FileNotFoundException e) {
                        e = e;
                        fileInputStream = fileInputStream2;
                        r4 = str;
                        CrashHelper.m81296c(e);
                        str = r4;
                        t95.m187604b(fileInputStream);
                        t95.m187604b(str);
                        return false;
                    } catch (IOException e2) {
                        e = e2;
                        fileInputStream = fileInputStream2;
                        r3 = str;
                        CrashHelper.m81296c(e);
                        str = r3;
                        t95.m187604b(fileInputStream);
                        t95.m187604b(str);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        t95.m187604b(fileInputStream);
                        t95.m187604b(str);
                        throw th;
                    }
                } catch (FileNotFoundException e3) {
                    e = e3;
                    str = 0;
                } catch (IOException e4) {
                    e = e4;
                    str = 0;
                } catch (Throwable th2) {
                    th = th2;
                    str = 0;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (FileNotFoundException e5) {
            e = e5;
            r4 = 0;
        } catch (IOException e6) {
            e = e6;
            r3 = 0;
        } catch (Throwable th4) {
            th = th4;
            str = 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m179362f(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m179363g(File file, File file2) throws Exception {
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    m179365i(fileInputStream2, file2);
                    t95.m187604b(fileInputStream2);
                } catch (Exception e) {
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    t95.m187604b(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m179364h(File file, ZipInputStream zipInputStream) throws Exception {
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                return;
            }
            if (nextEntry.getName().contains("../")) {
                throw new SecurityException("unsecurity zipfile!");
            }
            File file2 = new File(file.getPath() + File.separator + nextEntry.getName());
            m179371o(file2);
            if (nextEntry.isDirectory()) {
                file2.mkdirs();
            } else {
                m179366j(file2, zipInputStream);
            }
            zipInputStream.closeEntry();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m179365i(InputStream inputStream, File file) throws Exception {
        FilterInputStream checkedInputStream;
        ZipInputStream zipInputStream;
        FilterInputStream filterInputStream = null;
        try {
            checkedInputStream = new CheckedInputStream(inputStream, new CRC32());
            try {
                zipInputStream = new ZipInputStream(checkedInputStream);
                try {
                    m179364h(file, zipInputStream);
                    t95.m187604b(zipInputStream);
                    t95.m187604b(checkedInputStream);
                } catch (Exception e) {
                    e = e;
                    filterInputStream = checkedInputStream;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        checkedInputStream = filterInputStream;
                        filterInputStream = zipInputStream;
                        t95.m187604b(filterInputStream);
                        t95.m187604b(checkedInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    filterInputStream = zipInputStream;
                    t95.m187604b(filterInputStream);
                    t95.m187604b(checkedInputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                zipInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                t95.m187604b(filterInputStream);
                t95.m187604b(checkedInputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            zipInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            checkedInputStream = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m179366j(File file, ZipInputStream zipInputStream) throws Exception {
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = zipInputStream.read(bArr, 0, 1024);
                            if (i == -1) {
                                t95.m187604b(bufferedOutputStream2);
                                t95.m187604b(fileOutputStream);
                                return;
                            }
                            bufferedOutputStream2.write(bArr, 0, i);
                        }
                    } catch (Exception e) {
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        t95.m187604b(bufferedOutputStream);
                        t95.m187604b(fileOutputStream);
                        throw th;
                    }
                } catch (Exception e2) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            fileOutputStream = null;
            throw e3;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m179367k(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                m179367k(file2);
            }
        }
        file.delete();
    }

    /* JADX INFO: renamed from: l */
    public static void m179368l(File file) throws IOException {
        if (file.exists()) {
            if (!m179380x(file)) {
                m179358b(file);
            }
            if (file.delete()) {
                return;
            }
            kj10.m146167a("Unable to delete directory ", file, ".");
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m179369m(String str) {
        if (str == null) {
            return false;
        }
        return new File(str).delete();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m179370n() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* JADX INFO: renamed from: o */
    public static void m179371o(File file) {
        File parentFile = file.getParentFile();
        if (parentFile.exists()) {
            return;
        }
        m179371o(parentFile);
        parentFile.mkdir();
    }

    /* JADX INFO: renamed from: p */
    public static long m179372p(File file) {
        file.mkdirs();
        long length = 0;
        for (File file2 : file.listFiles()) {
            length += file2.isFile() ? file2.length() : m179372p(file2);
        }
        return length;
    }

    /* JADX INFO: renamed from: q */
    public static void m179373q(File file) throws IOException {
        if (file.isDirectory()) {
            m179368l(file);
            return;
        }
        boolean zExists = file.exists();
        if (file.delete()) {
            return;
        }
        if (zExists) {
            hj10.m131352a("Unable to delete file: ", file);
        } else {
            csg0.m108511a("File does not exist: ", file);
        }
    }

    /* JADX INFO: renamed from: r */
    public static File m179374r() {
        return m179370n() ? f16.m119092a().getExternalCacheDir() : f16.m119092a().getCacheDir();
    }

    /* JADX INFO: renamed from: s */
    public static File m179375s() {
        return m179370n() ? f16.m119092a().getExternalFilesDir(null) : f16.m119092a().getFilesDir();
    }

    /* JADX INFO: renamed from: t */
    public static long[] m179376t() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = statFs.getBlockSize();
        return new long[]{((long) statFs.getBlockCount()) * blockSize, ((long) statFs.getAvailableBlocks()) * blockSize};
    }

    /* JADX INFO: renamed from: u */
    public static String m179377u(@NonNull String str) {
        try {
            str = URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        return str.startsWith("file:///") ? str.substring(7) : str;
    }

    /* JADX INFO: renamed from: v */
    public static File m179378v() {
        return o460.m162554g() < 30 ? Environment.getExternalStorageDirectory() : m179375s();
    }

    /* JADX INFO: renamed from: w */
    public static boolean m179379w(String str) {
        try {
            return new File(str).exists();
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: x */
    public static boolean m179380x(File file) throws IOException {
        if (file == null) {
            jfd0.m141176a("File must not be null");
            return false;
        }
        if (file.getParent() != null) {
            file = new File(file.getParentFile().getCanonicalFile(), file.getName());
        }
        return !file.getCanonicalFile().equals(file.getAbsoluteFile());
    }

    /* JADX INFO: renamed from: y */
    public static String m179381y(Uri uri) {
        return uri.getPath();
    }

    /* JADX INFO: renamed from: z */
    public static String m179382z(String str) {
        return m179381y(Uri.parse(str));
    }
}
