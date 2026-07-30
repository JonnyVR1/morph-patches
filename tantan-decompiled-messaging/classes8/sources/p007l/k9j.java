package p007l;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Environment;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.common.io.Files;
import com.p003p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.proxy.api.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import l.o5d0;
import l.rhi;
import l.x1l0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class k9j extends rhi {

    /* JADX INFO: renamed from: b */
    public static final AtomicInteger f3040b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public static String f3041c = "conversation";

    /* JADX INFO: renamed from: d */
    public static String f3042d = "moment";

    /* JADX INFO: renamed from: e */
    public static int f3043e = 10;

    /* JADX INFO: renamed from: D */
    public static void m9561D() {
        File[] fileArrListFiles;
        File fileM9568K = m9568K();
        if (fileM9568K.exists() && (fileArrListFiles = fileM9568K.listFiles()) != null && fileArrListFiles.length >= f3043e) {
            File file = null;
            long j = Long.MAX_VALUE;
            for (File file2 : fileArrListFiles) {
                long jLastModified = file2.lastModified();
                if (jLastModified < j) {
                    file = file2;
                    j = jLastModified;
                }
            }
            if (file != null) {
                rhi.k(file);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m9562E() {
        a.p().m();
        x1l0.n().k();
    }

    /* JADX INFO: renamed from: F */
    public static void m9563F() {
        rhi.k(rhi.n() ? new File(App.f1068e.getExternalFilesDir(Environment.DIRECTORY_MOVIES), "video") : new File(App.f1068e.getFilesDir(), "video"));
    }

    /* JADX INFO: renamed from: G */
    public static void m9564G(String str, String str2) {
        rhi.k(new File(rhi.n() ? new File(App.f1068e.getExternalFilesDir(Environment.DIRECTORY_MOVIES), "video") : new File(App.f1068e.getFilesDir(), "video"), str + "/" + str2));
    }

    /* JADX INFO: renamed from: H */
    public static void m9565H(File file) {
        if (file == null) {
            return;
        }
        if (!file.exists()) {
            if (file.mkdirs()) {
                return;
            }
            o5d0.a("mkdirs fail : ", file.getAbsolutePath());
        } else if (file.isFile()) {
            if (!file.delete()) {
                o5d0.a("delete file fail : ", file.getAbsolutePath());
            } else {
                if (file.mkdirs()) {
                    return;
                }
                o5d0.a("mkdirs fail : ", file.getAbsolutePath());
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public static File m9566I() {
        if (!rhi.n()) {
            return App.f1068e.getCacheDir();
        }
        File file = new File(App.f1068e.getExternalCacheDir(), ".tantan");
        file.mkdir();
        return file;
    }

    /* JADX INFO: renamed from: J */
    public static String m9567J(String str) {
        int length;
        if (!TextUtils.isEmpty(str) && (length = str.length()) >= 4) {
            int i = 0;
            if (str.substring(0, 4).toLowerCase().equals("http")) {
                boolean z = false;
                while (i < length) {
                    if (str.charAt(i) == '/') {
                        if (z) {
                            return str.substring(i);
                        }
                        i++;
                        z = true;
                    }
                    i++;
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: K */
    public static File m9568K() {
        return rhi.n() ? new File(App.f1068e.getExternalCacheDir(), "video/frame/") : new File(App.f1068e.getCacheDir(), "video/frame/");
    }

    /* JADX INFO: renamed from: L */
    public static File m9569L(String str) {
        File file = new File(m9568K(), str);
        if (file.exists()) {
            file.setLastModified(SystemClock.elapsedRealtime());
            return file;
        }
        m9561D();
        file.mkdirs();
        return file;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[Catch: all -> 0x0009, SYNTHETIC, TryCatch #7 {, blocks: (B:82:0x00c7, B:87:0x00d0, B:89:0x00d5, B:90:0x00d8, B:86:0x00cd, B:57:0x0096, B:62:0x009f, B:64:0x00a4, B:78:0x00bf, B:61:0x009c, B:70:0x00b0, B:75:0x00b9, B:74:0x00b6, B:30:0x005f, B:35:0x0068, B:34:0x0065), top: B:100:0x000e, inners: #0, #5, #10, #14 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00a4 A[Catch: all -> 0x0009, PHI: r2 r4 r11
      0x00a4: PHI (r2v5 java.io.FileOutputStream) = (r2v3 java.io.FileOutputStream), (r2v6 java.io.FileOutputStream) binds: [B:63:0x00a2, B:77:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r4v7 android.graphics.Bitmap) = (r4v5 android.graphics.Bitmap), (r4v8 android.graphics.Bitmap) binds: [B:63:0x00a2, B:77:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r11v10 android.graphics.Bitmap) = (r11v7 android.graphics.Bitmap), (r11v11 android.graphics.Bitmap) binds: [B:63:0x00a2, B:77:0x00be] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #7 {, blocks: (B:82:0x00c7, B:87:0x00d0, B:89:0x00d5, B:90:0x00d8, B:86:0x00cd, B:57:0x0096, B:62:0x009f, B:64:0x00a4, B:78:0x00bf, B:61:0x009c, B:70:0x00b0, B:75:0x00b9, B:74:0x00b6, B:30:0x005f, B:35:0x0068, B:34:0x0065), top: B:100:0x000e, inners: #0, #5, #10, #14 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00be  */
    /* JADX WARN: Code duplicated, block: B:89:0x00d5 A[Catch: all -> 0x0009, TryCatch #7 {, blocks: (B:82:0x00c7, B:87:0x00d0, B:89:0x00d5, B:90:0x00d8, B:86:0x00cd, B:57:0x0096, B:62:0x009f, B:64:0x00a4, B:78:0x00bf, B:61:0x009c, B:70:0x00b0, B:75:0x00b9, B:74:0x00b6, B:30:0x005f, B:35:0x0068, B:34:0x0065), top: B:100:0x000e, inners: #0, #5, #10, #14 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: M */
    public static synchronized String m9570M(Bitmap bitmap, @NonNull File file, int i, int i2) {
        Bitmap bitmap2;
        Throwable th;
        OutOfMemoryError outOfMemoryError;
        IOException iOException;
        if (bitmap == null) {
            return "";
        }
        FileOutputStream fileOutputStream = null;
        bitmapCreateBitmap = null;
        bitmapCreateBitmap = null;
        bitmapCreateBitmap = null;
        bitmapCreateBitmap = null;
        bitmapCreateBitmap = null;
        bitmapCreateBitmap = null;
        bitmapCreateBitmap = null;
        bitmapCreateBitmap = null;
        Bitmap bitmapCreateBitmap = null;
        fileOutputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    float height = i2 / bitmap.getHeight();
                    Matrix matrix = new Matrix();
                    matrix.setScale(height, height);
                    if (i != 0) {
                        try {
                            matrix.postRotate(i);
                        } catch (IOException e) {
                            iOException = e;
                            bitmap2 = bitmap;
                            bitmap = bitmapCreateBitmap;
                            fileOutputStream = fileOutputStream2;
                            CrashHelper.c(iOException);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e2) {
                                    CrashHelper.c(e2);
                                }
                            }
                            bitmap2.recycle();
                            if (bitmap != null) {
                                bitmap.recycle();
                            }
                            return file.getAbsolutePath();
                        } catch (OutOfMemoryError e3) {
                            outOfMemoryError = e3;
                            bitmap2 = bitmap;
                            bitmap = bitmapCreateBitmap;
                            fileOutputStream = fileOutputStream2;
                            CrashHelper.c(outOfMemoryError);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e4) {
                                    CrashHelper.c(e4);
                                }
                            }
                            bitmap2.recycle();
                            if (bitmap != null) {
                                bitmap.recycle();
                            }
                            return file.getAbsolutePath();
                        } catch (Throwable th2) {
                            th = th2;
                            bitmap2 = bitmap;
                            bitmap = bitmapCreateBitmap;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e5) {
                                    CrashHelper.c(e5);
                                }
                            }
                            bitmap2.recycle();
                            if (bitmap != null) {
                                throw th;
                            }
                            bitmap.recycle();
                            throw th;
                        }
                    }
                    bitmap2 = bitmap;
                    try {
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 50, fileOutputStream2);
                        fileOutputStream2.flush();
                        fileOutputStream2.getFD().sync();
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e6) {
                            CrashHelper.c(e6);
                        }
                        bitmap2.recycle();
                        bitmapCreateBitmap.recycle();
                    } catch (IOException e7) {
                        e = e7;
                        iOException = e;
                        bitmap = bitmapCreateBitmap;
                        fileOutputStream = fileOutputStream2;
                        CrashHelper.c(iOException);
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        bitmap2.recycle();
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        return file.getAbsolutePath();
                    } catch (OutOfMemoryError e8) {
                        e = e8;
                        outOfMemoryError = e;
                        bitmap = bitmapCreateBitmap;
                        fileOutputStream = fileOutputStream2;
                        CrashHelper.c(outOfMemoryError);
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        bitmap2.recycle();
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        return file.getAbsolutePath();
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        bitmap = bitmapCreateBitmap;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        bitmap2.recycle();
                        if (bitmap != null) {
                            throw th;
                        }
                        bitmap.recycle();
                        throw th;
                    }
                } catch (IOException e9) {
                    e = e9;
                    bitmap2 = bitmap;
                } catch (OutOfMemoryError e10) {
                    e = e10;
                    bitmap2 = bitmap;
                } catch (Throwable th4) {
                    th = th4;
                    bitmap2 = bitmap;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (IOException e11) {
            bitmap2 = bitmap;
            iOException = e11;
            bitmap = null;
        } catch (OutOfMemoryError e12) {
            bitmap2 = bitmap;
            outOfMemoryError = e12;
            bitmap = null;
        } catch (Throwable th6) {
            bitmap2 = bitmap;
            th = th6;
            bitmap = null;
        }
        return file.getAbsolutePath();
    }

    /* JADX INFO: renamed from: N */
    public static String[] m9571N(String str, String str2, String str3, String str4, boolean z) throws IOException {
        File file;
        if (str.startsWith("file:///")) {
            str = str.substring(7);
        }
        File file2 = new File(str);
        String[] strArr = new String[2];
        if (rhi.n()) {
            file = new File(App.f1068e.getExternalFilesDir(Environment.DIRECTORY_MOVIES), "video/" + str3 + "/" + str4);
        } else {
            file = new File(App.f1068e.getFilesDir(), "video/" + str3 + "/" + str4);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        File file3 = new File(file, z ? "video.mp4" : "original_video.mp4");
        if (!file3.exists()) {
            file3.createNewFile();
            Files.c(file2, file3);
        } else if (!file3.getAbsolutePath().equals(str)) {
            file3.delete();
            file3.createNewFile();
            Files.c(file2, file3);
        }
        strArr[0] = rhi.B(file3.getAbsolutePath());
        if (TextUtils.isEmpty(str2)) {
            strArr[1] = "";
            return strArr;
        }
        if (str2.startsWith("file:///")) {
            str2 = str2.substring(7);
        }
        File file4 = new File(str2);
        File file5 = new File(file, "cover.jpg");
        if (!file5.exists()) {
            file5.createNewFile();
            Files.c(file4, file5);
        } else if (!file5.getAbsolutePath().equals(str2)) {
            file5.delete();
            file5.createNewFile();
            Files.c(file4, file5);
        }
        strArr[1] = rhi.B(file5.getAbsolutePath());
        return strArr;
    }

    /* JADX INFO: renamed from: O */
    public static File m9572O(String str) {
        if (f3040b.get() == 0) {
            try {
                for (File file : App.f1068e.getCacheDir().listFiles()) {
                    file.delete();
                }
                if (rhi.n()) {
                    File file2 = new File(App.f1068e.getExternalCacheDir(), ".tantan");
                    if (file2.exists()) {
                        for (File file3 : file2.listFiles()) {
                            file3.delete();
                        }
                    }
                }
            } catch (Exception e) {
                CrashHelper.c(new Exception("Fu temp exception:" + e.getMessage(), e));
            }
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        String str2 = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date()) + "_" + f3040b.incrementAndGet() + "." + str;
        if (!rhi.n()) {
            return new File(App.f1068e.getCacheDir(), str2);
        }
        File file4 = new File(App.f1068e.getExternalCacheDir(), ".tantan");
        file4.mkdir();
        return new File(file4, str2);
    }
}
