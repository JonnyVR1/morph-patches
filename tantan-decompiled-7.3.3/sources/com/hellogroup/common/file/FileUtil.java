package com.hellogroup.common.file;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;
import com.clevertap.android.sdk.Constants;
import com.momo.mcamera.util.MDLogTag;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p153l.i8g0;
import p153l.jb00;
import p153l.lv0;
import p153l.n1m;
import p153l.ylc0;

/* JADX INFO: loaded from: classes7.dex */
public class FileUtil {
    private static final String DCIM;
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    private static final char DIRECTORY_SEPARATOR = '/';
    private static String DirectoryName = null;
    private static final char EXTENSION_SEPARATOR = '.';
    public static final int FLAG_IMAGE = 1;
    public static final int FLAG_VIDEO = 2;
    private static final String[] INVALID_ZIP_ENTRY_NAME;
    public static String KEY_UNIQUE_ID = "";
    private static final String TAG = "DirectoryCopyUtil";
    private static final String Tag = "momo FileUtil";
    private static String cameraRootDir;
    private static MediaScannerConnection sMediaScannerConnection;
    private static StorageMode storageMode;

    public enum StorageMode {
        SDCARD,
        SDCARD_INNER,
        INNER
    }

    /* JADX INFO: renamed from: com.hellogroup.common.file.FileUtil$a */
    public class C3477a implements MediaScannerConnection.MediaScannerConnectionClient {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f11853a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f11854b;

        public C3477a(int i, String str) {
            this.f11853a = i;
            this.f11854b = str;
        }

        @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
        public void onMediaScannerConnected() {
            String strM17529m;
            int i = this.f11853a;
            if (1 == i) {
                strM17529m = FileUtil.m17528l(this.f11854b);
            } else {
                strM17529m = 2 == i ? FileUtil.m17529m(this.f11854b) : "";
            }
            try {
                FileUtil.sMediaScannerConnection.scanFile(this.f11854b, strM17529m);
            } catch (Exception unused) {
            }
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            FileUtil.sMediaScannerConnection.disconnect();
        }
    }

    static {
        String string = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).toString();
        DCIM = string;
        cameraRootDir = string + File.separator + MDLogTag.MOMENT_CAMERA_TAG;
        DirectoryName = "MOMO";
        try {
            try {
                System.loadLibrary("sevenz");
            } catch (Throwable th) {
                Log.e(Tag, "", th);
            }
        } catch (Throwable unused) {
            ylc0.m216566a(lv0.m155971a(), "sevenz");
        }
        INVALID_ZIP_ENTRY_NAME = new String[]{"../", "~/"};
    }

    /* JADX INFO: renamed from: A */
    private static void m17515A(File file, String str, boolean z) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, z);
                try {
                    fileOutputStream2.write(str.getBytes(Charset.forName("UTF-8")));
                    n1m.m161127b(fileOutputStream2);
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    Log.e(Tag, "", e);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    n1m.m161127b(fileOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m17516B(File file, String str) throws Throwable {
        m17515A(file, str, true);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x006a A[Catch: IOException -> 0x0066, TRY_LEAVE, TryCatch #2 {IOException -> 0x0066, blocks: (B:44:0x0062, B:48:0x006a), top: B:55:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static boolean m17520d(Context context, String str, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        if (TextUtils.isEmpty(str) || file == null) {
            return false;
        }
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamOpen.read(bArr);
                        if (i != -1) {
                            fileOutputStream.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (IOException e) {
                                Log.e(Tag, "", e);
                            }
                        }
                    }
                    inputStreamOpen.close();
                    fileOutputStream.close();
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    inputStream = inputStreamOpen;
                    try {
                        Log.e(Tag, "", e);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e3) {
                                Log.e(Tag, "", e3);
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
                                Log.e(Tag, "", e4);
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

    /* JADX INFO: renamed from: e */
    public static boolean m17521e(File file, File file2) {
        return m17522f(file, file2, true);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m17522f(File file, File file2, boolean z) throws Throwable {
        if (!file.exists() || !file.isDirectory()) {
            Log.e(TAG, "源文件夹不存在或不是目录: " + file.getAbsolutePath());
            return false;
        }
        if (!file2.exists() && !file2.mkdirs()) {
            Log.e(TAG, "无法创建目标文件夹: " + file2.getAbsolutePath());
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return true;
        }
        for (File file3 : fileArrListFiles) {
            File file4 = new File(file2, file3.getName());
            if (file3.isDirectory()) {
                m17522f(file3, file4, z);
            } else if (file3.isFile()) {
                m17525i(file3, file4, z);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static void m17523g(File file, File file2) throws Throwable {
        try {
            m17524h(new FileInputStream(file), new FileOutputStream(file2));
        } catch (IOException e) {
            if (file2.exists()) {
                file2.delete();
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x003d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x003f A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #1 {all -> 0x0042, blocks: (B:27:0x003a, B:29:0x003f), top: B:33:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:33:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public static void m17524h(InputStream inputStream, OutputStream outputStream) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream, 4096);
            try {
                bufferedOutputStream = new BufferedOutputStream(outputStream, 4096);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = bufferedInputStream2.read(bArr);
                        if (i == -1) {
                            bufferedOutputStream.flush();
                            try {
                                bufferedInputStream2.close();
                                bufferedOutputStream.close();
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                        bufferedOutputStream.write(bArr, 0, i);
                    }
                } catch (IOException e) {
                    e = e;
                    bufferedInputStream = bufferedInputStream2;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                            } catch (Throwable unused2) {
                                throw th;
                            }
                        } else if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                    } else if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                bufferedOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
            }
        } catch (IOException e3) {
            e = e3;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    private static boolean m17525i(File file, File file2, boolean z) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        Exception e;
        if (file2.exists() && !z) {
            return true;
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i = fileInputStream.read(bArr);
                            if (i <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i);
                            th = th;
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 != null) {
                                try {
                                    fileInputStream2.close();
                                } catch (IOException e2) {
                                    Log.e(TAG, "关闭输入流失败", e2);
                                }
                            }
                            if (fileOutputStream == null) {
                                throw th;
                            }
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (IOException e3) {
                                Log.e(TAG, "关闭输出流失败", e3);
                                throw th;
                            }
                        }
                        fileOutputStream.flush();
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                            Log.e(TAG, "关闭输入流失败", e4);
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                            Log.e(TAG, "关闭输出流失败", e5);
                        }
                        return true;
                    } catch (Exception e6) {
                        e = e6;
                        Log.e(TAG, "复制文件失败: " + file.getAbsolutePath() + " -> " + file2.getAbsolutePath(), e);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e7) {
                                Log.e(TAG, "关闭输入流失败", e7);
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e8) {
                                Log.e(TAG, "关闭输出流失败", e8);
                            }
                        }
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e9) {
                e = e9;
                fileOutputStream = null;
                e = e;
                Log.e(TAG, "复制文件失败: " + file.getAbsolutePath() + " -> " + file2.getAbsolutePath(), e);
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m17526j(Context context, File file, String str) throws Throwable {
        if (str.endsWith(".jpg_") || str.endsWith(".png_")) {
            str = str.substring(0, str.length() - 1);
        }
        if (Build.VERSION.SDK_INT < 29) {
            File file2 = new File(cameraRootDir, str);
            if (file2.exists() || file == null || !file.exists()) {
                return;
            }
            try {
                m17523g(file, file2);
                m17532p(context, file2);
                return;
            } catch (IOException unused) {
                return;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        String strM144179b = jb00.m144179b(str);
        if (i8g0.m139003e(strM144179b)) {
            contentValues.put("mime_type", strM144179b);
        }
        contentValues.put("relative_path", Environment.DIRECTORY_DCIM + File.separator + DirectoryName);
        Uri uriInsert = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (uriInsert == null || file == null || !file.exists()) {
            return;
        }
        try {
            m17524h(new FileInputStream(file), context.getContentResolver().openOutputStream(uriInsert));
        } catch (IOException e) {
            Log.e(Tag, "", e);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m17527k(File file) {
        if (file == null) {
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    m17527k(file2);
                } else {
                    file2.delete();
                }
            }
        }
        file.delete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static String m17528l(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith("jpg") && !lowerCase.endsWith("jpeg")) {
            if (lowerCase.endsWith("png")) {
                return DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG;
            }
            if (lowerCase.endsWith("gif")) {
                return "image/gif";
            }
        }
        return DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static String m17529m(String str) {
        String lowerCase = str.toLowerCase();
        return (lowerCase.endsWith("mp4") || lowerCase.endsWith("mpeg4") || lowerCase.endsWith("mp4_") || !lowerCase.endsWith("3gp")) ? DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4 : "video/3gp";
    }

    /* JADX INFO: renamed from: n */
    private static void m17530n(Context context, long j, File file) {
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", file.getName());
        contentValues.put("_display_name", file.getName());
        contentValues.put("mime_type", m17528l(file.getAbsolutePath()));
        contentValues.put("datetaken", Long.valueOf(j));
        contentValues.put("date_added", Long.valueOf(j));
        contentValues.put("date_modified", Long.valueOf(j));
        contentValues.put(Constants.KEY_ORIENTATION, (Integer) 0);
        contentValues.put("_data", file.getAbsolutePath());
        contentValues.put("_size", Long.valueOf(file.length()));
        contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        m17535s(context, 1, file.getAbsolutePath());
    }

    /* JADX INFO: renamed from: o */
    public static File m17531o(String str) {
        File file = new File(str);
        try {
            if (file.exists()) {
                return file;
            }
            file.createNewFile();
            return file;
        } catch (Throwable th) {
            Log.e(Tag, "", th);
            return file;
        }
    }

    /* JADX INFO: renamed from: p */
    private static void m17532p(Context context, File file) {
        m17530n(context, System.currentTimeMillis(), file);
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file));
        intent.addFlags(1);
        context.sendBroadcast(intent);
    }

    /* JADX INFO: renamed from: q */
    public static byte[] m17533q(File file) throws Throwable {
        byte[] bArr;
        FileInputStream fileInputStream = null;
        byte[] bArr2 = null;
        fileInputStream = null;
        if (file != null) {
            try {
                if (file.exists()) {
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            bArr2 = new byte[fileInputStream2.available()];
                            fileInputStream2.read(bArr2);
                            n1m.m161127b(fileInputStream2);
                            return bArr2;
                        } catch (IOException e) {
                            e = e;
                            bArr = bArr2;
                            fileInputStream = fileInputStream2;
                            Log.e(Tag, "", e);
                            n1m.m161127b(fileInputStream);
                            return bArr;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            n1m.m161127b(fileInputStream);
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        bArr = null;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static String m17534r(File file) throws Throwable {
        IOException e;
        if (!file.exists()) {
            return "";
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i = bufferedInputStream2.read(bArr);
                            if (i == -1) {
                                String str = new String(byteArrayOutputStream.toByteArray());
                                n1m.m161126a(bufferedInputStream2, byteArrayOutputStream);
                                return str;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        Log.e(Tag, "", e);
                        throw e;
                    }
                } catch (IOException e3) {
                    e = e3;
                } catch (Throwable th) {
                    th = th;
                    file = null;
                    bufferedInputStream = bufferedInputStream2;
                    n1m.m161126a(bufferedInputStream, file);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            e = e4;
        } catch (Throwable th3) {
            th = th3;
            file = null;
            n1m.m161126a(bufferedInputStream, file);
            throw th;
        }
    }

    /* JADX INFO: renamed from: s */
    private static void m17535s(Context context, int i, String str) {
        MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(context, new C3477a(i, str));
        sMediaScannerConnection = mediaScannerConnection;
        mediaScannerConnection.connect();
    }

    /* JADX INFO: renamed from: t */
    public static void m17536t(StorageMode storageMode2) {
        storageMode = storageMode2;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m17537u(File file, String str) {
        File file2 = new File(str);
        if (!file2.exists() || !file2.isDirectory()) {
            file2.mkdirs();
        }
        return un7zip(file.getAbsolutePath(), str) == 0;
    }

    private static native int un7zip(String str, String str2);

    /* JADX INFO: renamed from: v */
    public static void m17538v(String str, String str2) throws Exception {
        m17539w(str, str2, false);
    }

    /* JADX INFO: renamed from: w */
    public static void m17539w(String str, String str2, boolean z) throws Exception {
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
        BufferedOutputStream bufferedOutputStream = null;
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return;
                }
                byte[] bArr = new byte[4096];
                String name = nextEntry.getName();
                if (!m17540x(name)) {
                    throw new IllegalArgumentException("unsecurity zipfile!");
                }
                File file = new File(str2, name);
                if (!nextEntry.isDirectory()) {
                    File file2 = new File(file.getParent());
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    if (z) {
                        File file3 = new File(file2, ".nomedia");
                        if (!file3.exists()) {
                            file3.createNewFile();
                        }
                    }
                    try {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file), 4096);
                        while (true) {
                            try {
                                int i = zipInputStream.read(bArr, 0, 4096);
                                if (i == -1) {
                                    break;
                                } else {
                                    bufferedOutputStream2.write(bArr, 0, i);
                                }
                            } catch (Throwable th) {
                                th = th;
                                bufferedOutputStream = bufferedOutputStream2;
                                bufferedOutputStream.close();
                                throw th;
                            }
                        }
                        bufferedOutputStream2.flush();
                        bufferedOutputStream2.close();
                        bufferedOutputStream = bufferedOutputStream2;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Throwable th3) {
                zipInputStream.close();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static boolean m17540x(@NonNull String str) {
        int length = INVALID_ZIP_ENTRY_NAME.length;
        for (int i = 0; i < length; i++) {
            if (str.contains(INVALID_ZIP_ENTRY_NAME[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m17541y(byte[] bArr, File file) throws Throwable {
        if (bArr != null && file != null && !file.isDirectory()) {
            FileOutputStream fileOutputStream = null;
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(bArr);
                    n1m.m161127b(fileOutputStream2);
                    return true;
                } catch (IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    n1m.m161127b(fileOutputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    n1m.m161127b(fileOutputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public static void m17542z(File file, String str) throws Throwable {
        m17515A(file, str, false);
    }
}
