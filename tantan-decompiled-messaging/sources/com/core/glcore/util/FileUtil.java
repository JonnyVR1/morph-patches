package com.core.glcore.util;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import io.agora.utils2.internal.CommonUtility;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p149l.j6f;
import p149l.rhg0;
import p149l.sxf0;

/* JADX INFO: loaded from: classes.dex */
public class FileUtil {
    public static final String FILE_AVATAR_PATH;
    public static final String FILE_CACHE_PATH;
    public static final String FILE_DRAFT_PATH;
    public static final String FILE_INSTALL_PATH;
    public static final String FILE_LOG_PATH;
    public static final String FILE_TEMP_PATH;
    public static String GBK;
    public static String ISO_8859_1;
    public static final String SD_PATH;
    public static String UTF_8;

    static {
        String strM186402b = sxf0.m186402b();
        SD_PATH = strM186402b;
        String str = strM186402b + "/cvmomo";
        FILE_CACHE_PATH = str;
        String str2 = strM186402b + "/cvmomo/temp";
        FILE_TEMP_PATH = str2;
        String str3 = strM186402b + "/cvmomo/log";
        FILE_LOG_PATH = str3;
        FILE_AVATAR_PATH = strM186402b + "/cvmomo/avatar";
        FILE_DRAFT_PATH = strM186402b + "/cvmomo/draft";
        String str4 = strM186402b + "/cvmomo/install";
        FILE_INSTALL_PATH = str4;
        UTF_8 = "UTF-8";
        GBK = "GBK";
        ISO_8859_1 = "ISO-8859-1";
        if (!new File(str).exists()) {
            new File(str).mkdirs();
        }
        if (!new File(str2).exists()) {
            new File(str2).mkdirs();
        }
        if (!new File(str4).exists()) {
            new File(str4).mkdirs();
        }
        if (new File(str3).exists()) {
            return;
        }
        new File(str3).mkdirs();
    }

    public static String FormetFileSize(long j) {
        if (j == 0) {
            return "0.00B";
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (j < 1024) {
            return decimalFormat.format(j) + "B";
        }
        if (j < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return decimalFormat.format(j / 1024.0d) + "K";
        }
        if (j < 1073741824) {
            return decimalFormat.format(j / 1048576.0d) + "M";
        }
        return decimalFormat.format(j / 1.073741824E9d) + "G";
    }

    public static void appendString(File file, String str) throws Throwable {
        outString(file, str, null, true);
    }

    public static void checkFile(String str) {
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static File compressFile(Context context, String str, int i) {
        int iRound;
        File file = new File(SD_PATH + "/DCIM/photo");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, System.currentTimeMillis() + ".jpg");
        if (file2.exists()) {
            file2.delete();
        }
        try {
            int i2 = 1;
            new ExifInterface(str).getAttributeInt(j6f.TAG_ORIENTATION, 1);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inJustDecodeBounds = false;
            int i3 = options.outHeight;
            int i4 = options.outWidth;
            float f = i3;
            if (f > 1280.0f || i4 > 720.0f) {
                iRound = Math.round(f / 1280.0f);
                int iRound2 = Math.round(i4 / 720.0f);
                if (iRound <= iRound2) {
                    iRound = iRound2;
                }
            } else {
                iRound = 1;
            }
            if (iRound >= 1) {
                i2 = iRound;
            }
            options.inSampleSize = i2;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
            Matrix matrix = new Matrix();
            if (i != -1) {
                matrix.setRotate(i);
            } else {
                matrix.setRotate(readPictureDegree(str));
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(file2.getPath()));
            bitmapDecodeFile.recycle();
            bitmapCreateBitmap.recycle();
            return file2;
        } catch (Exception e) {
            e.printStackTrace();
            return file2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0044 A[Catch: IOException -> 0x0040, TRY_LEAVE, TryCatch #4 {IOException -> 0x0040, blocks: (B:28:0x003c, B:32:0x0044), top: B:40:0x003c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    private static void copyAndCloseStream(InputStream e, File file) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        while (e.read(bArr) > 0) {
                            fileOutputStream2.write(bArr);
                        }
                        fileOutputStream2.flush();
                        e.close();
                        fileOutputStream2.close();
                    } catch (IOException e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        e.printStackTrace();
                        if (e != 0) {
                            e.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (e != 0) {
                            try {
                                e.close();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } catch (IOException e3) {
                                e3.printStackTrace();
                                throw th;
                            }
                        } else if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    e = e4;
                    e.printStackTrace();
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void copyAssertFileToSDcard(WeakReference<Context> weakReference, String str, String str2) throws Throwable {
        try {
            InputStream inputStreamOpen = weakReference.get().getResources().getAssets().open(str);
            File parentFile = new File(str2).getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            copyAndCloseStream(inputStreamOpen, new File(str2));
        } catch (IOException unused) {
        }
    }

    public static void copyDir(String str, String str2) throws Throwable {
        new File(str2).mkdirs();
        File[] fileArrListFiles = new File(str).listFiles();
        for (int i = 0; i < fileArrListFiles.length; i++) {
            if (fileArrListFiles[i].isFile()) {
                copyFile(fileArrListFiles[i], new File(new File(str2).getAbsolutePath() + File.separator + fileArrListFiles[i].getName()));
            }
            if (fileArrListFiles[i].isDirectory()) {
                copyDir(str + fileArrListFiles[i].getName(), str2 + "/" + fileArrListFiles[i].getName());
            }
        }
    }

    public static void copyFile(File file, File file2) throws Throwable {
        FileInputStream fileInputStream;
        if (file == null || file2 == null) {
            return;
        }
        if (!file.exists() || file2.isDirectory()) {
            rhg0.m179353a("复制出错，请检查参数合法性");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                    try {
                        StreamUtil.copy(fileInputStream, fileOutputStream2);
                        StreamUtil.close(fileOutputStream2);
                        StreamUtil.close(fileInputStream);
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        e.printStackTrace();
                        StreamUtil.close(fileOutputStream);
                        StreamUtil.close(fileInputStream);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        StreamUtil.close(fileOutputStream);
                        StreamUtil.close(fileInputStream);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    public static File copyFileToDir(File file, File file2) throws Throwable {
        if (file == null || file2 == null) {
            return null;
        }
        if (file2.exists() && !file2.isDirectory()) {
            rhg0.m179353a("复制出错，请检查参数合法性");
            return null;
        }
        File file3 = new File(file2, file.getName());
        copyFile(file, file3);
        return file3;
    }

    public static boolean delAllFile(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            return false;
        }
        String[] list = file.list();
        boolean z = false;
        for (int i = 0; i < list.length; i++) {
            String str2 = File.separator;
            File file2 = str.endsWith(str2) ? new File(str + list[i]) : new File(str + str2 + list[i]);
            if (file2.isFile()) {
                file2.delete();
            }
            if (file2.isDirectory()) {
                delAllFile(str + "/" + list[i]);
                delFolder(str + "/" + list[i]);
                z = true;
            }
        }
        return z;
    }

    public static void delFolder(String str) {
        try {
            delAllFile(str);
            new File(str.toString()).delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteFile(File file, long j) {
        if (file != null && file.exists()) {
            if (file.isFile()) {
                if (System.currentTimeMillis() - file.lastModified() < j) {
                    return;
                }
                file.delete();
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                deleteFile(file2);
            }
            file.delete();
        }
    }

    public static boolean exist(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    public static File getCacheDirectory(Context context) {
        File externalCacheDir = SD_PATH.equals("mounted") ? getExternalCacheDir(context) : null;
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        return externalCacheDir == null ? context.getCacheDir() : externalCacheDir;
    }

    public static String getChoosedPicturePath(Uri uri, Activity activity) {
        String strSubstring;
        if (uri == null) {
            return "";
        }
        if (uri.toString().startsWith(CommonUtility.PREFIX_URI)) {
            Cursor cursorManagedQuery = activity.managedQuery(uri, new String[]{"_data"}, null, null, null);
            int columnIndexOrThrow = cursorManagedQuery.getColumnIndexOrThrow("_data");
            cursorManagedQuery.moveToFirst();
            strSubstring = cursorManagedQuery.getString(columnIndexOrThrow);
        } else {
            strSubstring = uri.toString().startsWith("file://") ? uri.toString().substring(7) : uri.toString();
        }
        if (TextUtils.isEmpty(strSubstring)) {
            return null;
        }
        String lowerCase = strSubstring.toLowerCase();
        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".jpeg")) {
            return strSubstring;
        }
        return null;
    }

    private static File getExternalCacheDir(Context context) {
        File file = new File(new File(new File(new File(SD_PATH, "Android"), "data"), context.getPackageName()), "cache");
        if (!file.exists()) {
            if (!file.mkdirs()) {
                return null;
            }
            try {
                new File(file, ".nomedia").createNewFile();
            } catch (IOException unused) {
            }
        }
        return file;
    }

    public static long getFileCount(File file) {
        File[] fileArrListFiles = file.listFiles();
        long length = fileArrListFiles.length;
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                length = (length + getFileCount(file2)) - 1;
            }
        }
        return length;
    }

    public static List<String> getFilePathsByFile(File file, FilenameFilter filenameFilter) {
        if (!file.exists()) {
            return new ArrayList();
        }
        if (file.isFile()) {
            return Arrays.asList(file.getPath());
        }
        return filenameFilter == null ? Arrays.asList(file.list()) : Arrays.asList(file.list(filenameFilter));
    }

    public static long getFileSize(File file, FileFilter fileFilter) {
        long fileSize = 0;
        if (file != null && file.exists()) {
            if (file.isFile()) {
                return file.length();
            }
            for (File file2 : fileFilter == null ? file.listFiles() : file.listFiles(fileFilter)) {
                fileSize += getFileSize(file2, fileFilter);
            }
        }
        return fileSize;
    }

    public static String getPhotoFileName() {
        return new Date(System.currentTimeMillis()).getTime() + ".jpeg";
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0035 A[EXC_TOP_SPLITTER, PHI: r0 r1
      0x0035: PHI (r0v4 java.io.FileInputStream) = (r0v3 java.io.FileInputStream), (r0v6 java.io.FileInputStream) binds: [B:22:0x0033, B:29:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r1v3 byte[]) = (r1v2 byte[]), (r1v5 byte[]) binds: [B:22:0x0033, B:29:0x0042] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static byte[] getRawDataFromFile(String str) throws Throwable {
        byte[] bArr;
        FileInputStream fileInputStream = null;
        bArr = null;
        byte[] bArr2 = null;
        FileInputStream fileInputStream2 = null;
        fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream3 = new FileInputStream(str);
                try {
                    bArr2 = new byte[fileInputStream3.available()];
                    fileInputStream3.read(bArr2);
                    fileInputStream3.close();
                    try {
                        fileInputStream3.close();
                        return bArr2;
                    } catch (IOException e) {
                        e.printStackTrace();
                        return bArr2;
                    }
                } catch (FileNotFoundException e2) {
                    e = e2;
                    bArr = bArr2;
                    fileInputStream = fileInputStream3;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return bArr;
                } catch (IOException e4) {
                    e = e4;
                    bArr = bArr2;
                    fileInputStream = fileInputStream3;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return bArr;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream3;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException e6) {
            e = e6;
            bArr = null;
        } catch (IOException e7) {
            e = e7;
            bArr = null;
        }
    }

    public static String getRealFilePath(Context context, Uri uri) {
        Cursor cursorQuery;
        int columnIndex;
        String string = null;
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if (scheme == null) {
            return uri.getPath();
        }
        if ("file".equals(scheme)) {
            return uri.getPath();
        }
        if ("content".equals(scheme) && (cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null)) != null) {
            if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_data")) > -1) {
                string = cursorQuery.getString(columnIndex);
            }
            cursorQuery.close();
        }
        return string;
    }

    public static File getUpdateApk(int i) {
        String str = FILE_INSTALL_PATH;
        if (!new File(str).exists()) {
            new File(str).mkdirs();
        }
        return new File(str + "/liuxing_" + i + ShareConstants.PATCH_SUFFIX);
    }

    public static void outString(File file, String str, String str2, boolean z) throws Throwable {
        if (file == null || (file.exists() && file.isDirectory())) {
            rhg0.m179353a("复制出错，请检查参数合法性");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, z);
            try {
                fileOutputStream2.write(str2 == null ? str.getBytes() : str.getBytes(str2));
                StreamUtil.close(fileOutputStream2);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                StreamUtil.close(fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public static <T> T readObject(File file) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        ClassNotFoundException e;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream((File) file));
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
                    try {
                        T t = (T) objectInputStream.readObject();
                        StreamUtil.close(objectInputStream);
                        StreamUtil.close(bufferedInputStream);
                        return t;
                    } catch (ClassNotFoundException e2) {
                        e = e2;
                        e.printStackTrace();
                        throw new IOException(e);
                    }
                } catch (ClassNotFoundException e3) {
                    e = e3;
                } catch (Throwable th2) {
                    th = th2;
                    file = 0;
                    StreamUtil.close((InputStream) file);
                    StreamUtil.close(bufferedInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (ClassNotFoundException e4) {
            e = e4;
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            file = 0;
        }
    }

    public static int readPictureDegree(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(j6f.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.content.res.AssetManager] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.InputStream] */
    public static String readStrFromAssert(Context context, String str) throws Throwable {
        BufferedReader bufferedReader;
        Exception e;
        ?? assets = context.getAssets();
        StringBuilder sb = new StringBuilder();
        ?? r1 = 0;
        r1 = 0;
        try {
            try {
                assets = assets.open(str);
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(assets));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        } catch (Exception e2) {
                            e = e2;
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    bufferedReader = null;
                } catch (Throwable th) {
                    th = th;
                    StreamUtil.close((Reader) r1);
                    StreamUtil.close((InputStream) assets);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r1 = str;
            }
        } catch (Exception e4) {
            bufferedReader = null;
            e = e4;
            assets = 0;
        } catch (Throwable th3) {
            th = th3;
            assets = 0;
        }
        StreamUtil.close(bufferedReader);
        StreamUtil.close((InputStream) assets);
        return sb.toString();
    }

    public static String readString(File file) throws Throwable {
        if (file == null || !file.exists()) {
            return "";
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                try {
                    StringBuilder sb = new StringBuilder((int) file.length());
                    while (true) {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            String string = sb.toString();
                            StreamUtil.close(bufferedReader2);
                            return string;
                        }
                        if (sb.length() != 0) {
                            sb.append('\n');
                        }
                        sb.append(line);
                    }
                } catch (IOException e) {
                    e = e;
                    bufferedReader = bufferedReader2;
                    e.printStackTrace();
                    StreamUtil.close(bufferedReader);
                    return "";
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    StreamUtil.close(bufferedReader);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public static void saveBitmap(Bitmap bitmap, String str) throws Throwable {
        if (bitmap == null) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                    fileOutputStream2.flush();
                    bitmap.recycle();
                    StreamUtil.close(fileOutputStream2);
                } catch (Exception e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    StreamUtil.close(fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    StreamUtil.close(fileOutputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void saveByteArrayToFile(byte[] bArr, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(new File(str));
            try {
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                    try {
                        bufferedOutputStream2.write(bArr);
                        try {
                            bufferedOutputStream2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        bufferedOutputStream = bufferedOutputStream2;
                        e.printStackTrace();
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        if (fileOutputStream == null) {
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (fileOutputStream == null) {
                            throw th;
                        }
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException e5) {
                            e5.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e7) {
            e = e7;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        try {
            fileOutputStream.close();
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    public static void saveFileByPath(Context context, String str, Object obj) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        synchronized (gsonBuilder) {
            Gson gsonCreate = gsonBuilder.excludeFieldsWithModifiers(128).create();
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(str, 0);
                new ObjectOutputStream(fileOutputStreamOpenFileOutput).writeObject(gsonCreate.toJson(obj));
                fileOutputStreamOpenFileOutput.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeObject(File file, Object obj) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        if (file == null || (file.exists() && file.isDirectory())) {
            rhg0.m179353a("复制出错，请检查参数合法性");
            return;
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(bufferedOutputStream);
                try {
                    objectOutputStream2.writeObject(obj);
                    StreamUtil.close(objectOutputStream2);
                    StreamUtil.close(bufferedOutputStream);
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    StreamUtil.close(objectOutputStream);
                    StreamUtil.close(bufferedOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream = null;
        }
    }

    public static void writeString(String str, String str2) throws Throwable {
        writeString(new File(str), str2);
    }

    public static class StreamUtil {
        private static int ioBufferSize = 1024;

        public static void close(OutputStream outputStream) {
            if (outputStream != null) {
                try {
                    outputStream.flush();
                } catch (IOException unused) {
                }
                try {
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }

        public static int copy(Reader reader, Writer writer) throws IOException {
            char[] cArr = new char[ioBufferSize];
            int i = 0;
            while (true) {
                int i2 = reader.read(cArr, 0, ioBufferSize);
                if (i2 < 0) {
                    writer.flush();
                    return i;
                }
                writer.write(cArr, 0, i2);
                i += i2;
            }
        }

        public static void close(InputStream inputStream) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
        }

        public static void close(Reader reader) {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException unused) {
                }
            }
        }

        public static void close(Writer writer) {
            if (writer != null) {
                try {
                    writer.flush();
                } catch (IOException unused) {
                }
                try {
                    writer.close();
                } catch (IOException unused2) {
                }
            }
        }

        public static int copy(InputStream inputStream, OutputStream outputStream) throws IOException {
            byte[] bArr = new byte[ioBufferSize];
            int i = 0;
            while (true) {
                int i2 = inputStream.read(bArr, 0, ioBufferSize);
                if (i2 == -1) {
                    return i;
                }
                outputStream.write(bArr, 0, i2);
                i += i2;
            }
        }
    }

    public static void writeString(File file, String str) throws Throwable {
        outString(file, str, null, false);
    }

    public static List<String> getFilePathsByFile(File file) {
        return getFilePathsByFile(file, null);
    }

    public static List<String> getFilePathsByFile(String str) {
        return getFilePathsByFile(new File(str));
    }

    public static void deleteFile(File file) {
        if (file != null && file.exists()) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                deleteFile(file2);
            }
            file.delete();
        }
    }

    public static void writeObject(String str, Object obj) throws Throwable {
        writeObject(new File(str), obj);
    }

    public static void deleteFile(String str) {
        deleteFile(new File(str));
    }

    public static <T> T readObject(String str) throws IOException {
        return (T) readObject(new File(str));
    }

    public static String readString(String str) {
        return readString(new File(str));
    }

    public static String readString(InputStream inputStream, String str) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
            try {
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            sb.append(line);
                            sb.append(SignParameters.NEW_LINE);
                        } else {
                            String string = sb.toString();
                            StreamUtil.close(bufferedReader);
                            return string;
                        }
                        th = th;
                        bufferedReader2 = bufferedReader;
                        StreamUtil.close(bufferedReader2);
                        throw th;
                    }
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    StreamUtil.close(bufferedReader);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
            }
        } catch (IOException e2) {
            e = e2;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static class ZipUtil {
        private static final String BASE_DIR = "";
        private static final int BUFFER = 1024;
        public static final String EXT = ".zip";
        private static final String PATH = File.separator;

        private static void decompress(File file, ZipInputStream zipInputStream) throws Exception {
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        zipInputStream.closeEntry();
                        return;
                    }
                    if (nextEntry.getName().contains("../")) {
                        throw new SecurityException("unsecurity zipfile!");
                    }
                    File file2 = new File(file.getPath() + File.separator + nextEntry.getName());
                    fileProber(file2);
                    if (nextEntry.isDirectory()) {
                        file2.mkdirs();
                    } else {
                        decompressFile(file2, zipInputStream);
                    }
                } catch (Throwable th) {
                    if (zipInputStream != null) {
                        zipInputStream.closeEntry();
                    }
                    throw th;
                }
            }
        }

        private static void decompressFile(File file, ZipInputStream zipInputStream) throws Exception {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = zipInputStream.read(bArr, 0, 1024);
                    if (i == -1) {
                        bufferedOutputStream.close();
                        return;
                    }
                    bufferedOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        private static void fileProber(File file) {
            File parentFile = file.getParentFile();
            if (parentFile.exists()) {
                return;
            }
            fileProber(parentFile);
            parentFile.mkdir();
        }

        public static void decompress(File file) throws Exception {
            decompress(file, file.getParent());
        }

        public static void decompress(File file, File file2) throws Exception {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                decompress(fileInputStream, file2);
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public static void decompress(InputStream inputStream, File file) throws Exception {
            CheckedInputStream checkedInputStream = new CheckedInputStream(inputStream, new CRC32());
            try {
                ZipInputStream zipInputStream = new ZipInputStream(checkedInputStream);
                try {
                    decompress(file, zipInputStream);
                    zipInputStream.close();
                    checkedInputStream.close();
                } catch (Throwable th) {
                    try {
                        zipInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    checkedInputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }

        public static void decompress(File file, String str) throws Exception {
            decompress(file, new File(str));
        }

        public static void decompress(String str, String str2) throws Exception {
            decompress(new File(str), str2);
        }

        public static void decompress(String str) throws Exception {
            decompress(new File(str));
        }
    }
}
