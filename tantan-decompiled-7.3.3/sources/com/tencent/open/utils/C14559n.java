package com.tencent.open.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import androidx.core.content.FileProvider;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.open.utils.n */
/* JADX INFO: loaded from: classes2.dex */
public class C14559n {

    /* JADX INFO: renamed from: a */
    private static String f61202a = "";

    /* JADX INFO: renamed from: b */
    private static String f61203b = "";

    /* JADX INFO: renamed from: c */
    private static String f61204c = "";

    /* JADX INFO: renamed from: d */
    private static String f61205d = "";

    /* JADX INFO: renamed from: e */
    private static int f61206e = -1;

    /* JADX INFO: renamed from: f */
    private static String f61207f = "0123456789ABCDEF";

    /* JADX WARN: Code duplicated, block: B:81:0x0088 A[EXC_TOP_SPLITTER, PHI: r2 r7
      0x0088: PHI (r2v6 java.io.FileOutputStream) = (r2v4 java.io.FileOutputStream), (r2v7 java.io.FileOutputStream) binds: [B:52:0x0086, B:65:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x0088: PHI (r7v9 ??) = (r7v7 ??), (r7v10 ??) binds: [B:52:0x0086, B:65:0x00a0] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.io.BufferedInputStream] */
    /* JADX INFO: renamed from: a */
    public static boolean m85664a(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (file2.exists()) {
                    file2.delete();
                }
                if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream((File) file2);
                try {
                    file2 = new BufferedInputStream(new FileInputStream(file));
                    try {
                        byte[] bArr = new byte[ShareConstants.MD5_FILE_BUF_LENGTH];
                        while (true) {
                            int i = file2.read(bArr);
                            if (i != -1) {
                                fileOutputStream2.write(bArr, 0, i);
                                fileOutputStream2.flush();
                            } else {
                                try {
                                    break;
                                } catch (IOException e) {
                                    SLog.m85491e("openSDK_LOG.Util", "copyFile error, ", e);
                                }
                            }
                        }
                        fileOutputStream2.close();
                        try {
                            file2.close();
                        } catch (IOException e2) {
                            SLog.m85491e("openSDK_LOG.Util", "copyFile error, ", e2);
                        }
                        return true;
                    } catch (IOException e3) {
                        e = e3;
                        fileOutputStream = fileOutputStream2;
                        file2 = file2;
                        SLog.m85491e("openSDK_LOG.Util", "copyFile error, ", e);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                SLog.m85491e("openSDK_LOG.Util", "copyFile error, ", e4);
                            }
                        }
                        if (file2 != 0) {
                            try {
                                file2.close();
                            } catch (IOException e5) {
                                SLog.m85491e("openSDK_LOG.Util", "copyFile error, ", e5);
                            }
                        }
                        return false;
                    } catch (OutOfMemoryError e6) {
                        e = e6;
                        fileOutputStream = fileOutputStream2;
                        file2 = file2;
                        SLog.m85491e("openSDK_LOG.Util", "copyFile error, ", e);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e7) {
                                SLog.m85491e("openSDK_LOG.Util", "copyFile error, ", e7);
                            }
                        }
                        if (file2 != 0) {
                            file2.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e8) {
                                SLog.m85491e("openSDK_LOG.Util", "copyFile error, ", e8);
                            }
                        }
                        if (file2 == 0) {
                            throw th;
                        }
                        try {
                            file2.close();
                            throw th;
                        } catch (IOException e9) {
                            SLog.m85491e("openSDK_LOG.Util", "copyFile error, ", e9);
                            throw th;
                        }
                    }
                } catch (IOException e10) {
                    e = e10;
                    file2 = 0;
                } catch (OutOfMemoryError e11) {
                    e = e11;
                    file2 = 0;
                } catch (Throwable th2) {
                    th = th2;
                    file2 = 0;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e12) {
            e = e12;
            file2 = 0;
        } catch (OutOfMemoryError e13) {
            e = e13;
            file2 = 0;
        } catch (Throwable th4) {
            th = th4;
            file2 = 0;
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: b */
    public static String m85669b(Context context, Uri uri) {
        Uri uri2;
        if (uri == null) {
            return null;
        }
        if (!DocumentsContract.isDocumentUri(context, uri)) {
            String scheme = uri.getScheme();
            if ("content".equals(scheme)) {
                return m85673c(context, uri);
            }
            if ("file".equals(scheme)) {
                return uri.getPath();
            }
            return null;
        }
        String authority = uri.getAuthority();
        if ("com.android.externalstorage.documents".equals(authority)) {
            String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
            String str = strArrSplit[0];
            return "primary".equals(str) ? Environment.getExternalStorageDirectory().getAbsolutePath().concat("/").concat(strArrSplit[1]) : "/storage/".concat(str).concat("/").concat(strArrSplit[1]);
        }
        if ("com.android.providers.downloads.documents".equals(authority)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            return documentId.startsWith("raw:") ? documentId.replaceFirst("raw:", "") : m85673c(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(documentId)));
        }
        if ("com.android.providers.media.documents".equals(authority)) {
            String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
            String str2 = strArrSplit2[0];
            if ("image".equals(str2)) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if ("video".equals(str2)) {
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else if ("audio".equals(str2)) {
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return m85673c(context, ContentUris.withAppendedId(uri2, Long.parseLong(strArrSplit2[1])));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x01c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x01de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x01f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x00eb A[EDGE_INSN: B:149:0x00eb->B:55:0x00eb BREAK  A[LOOP:0: B:48:0x00d2->B:50:0x00d9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069 A[Catch: all -> 0x00a1, Exception -> 0x00a8, TRY_LEAVE, TryCatch #23 {Exception -> 0x00a8, all -> 0x00a1, blocks: (B:22:0x0061, B:24:0x0069, B:39:0x00ae, B:41:0x00b4, B:42:0x00b7, B:44:0x00c6, B:45:0x00c9), top: B:142:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae A[Catch: all -> 0x00a1, Exception -> 0x00a8, TRY_ENTER, TryCatch #23 {Exception -> 0x00a8, all -> 0x00a1, blocks: (B:22:0x0061, B:24:0x0069, B:39:0x00ae, B:41:0x00b4, B:42:0x00b7, B:44:0x00c6, B:45:0x00c9), top: B:142:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4 A[Catch: all -> 0x00a1, Exception -> 0x00a8, TryCatch #23 {Exception -> 0x00a8, all -> 0x00a1, blocks: (B:22:0x0061, B:24:0x0069, B:39:0x00ae, B:41:0x00b4, B:42:0x00b7, B:44:0x00c6, B:45:0x00c9), top: B:142:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6 A[Catch: all -> 0x00a1, Exception -> 0x00a8, TryCatch #23 {Exception -> 0x00a8, all -> 0x00a1, blocks: (B:22:0x0061, B:24:0x0069, B:39:0x00ae, B:41:0x00b4, B:42:0x00b7, B:44:0x00c6, B:45:0x00c9), top: B:142:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d9 A[Catch: all -> 0x00de, Exception -> 0x00e5, LOOP:0: B:48:0x00d2->B:50:0x00d9, LOOP_END, TryCatch #21 {Exception -> 0x00e5, all -> 0x00de, blocks: (B:47:0x00d0, B:48:0x00d2, B:50:0x00d9, B:55:0x00eb), top: B:145:0x00d0 }] */
    /* JADX INFO: renamed from: c */
    public static String m85673c(Context context, Uri uri) throws Throwable {
        Uri uri2;
        Cursor cursorQuery;
        Throwable th;
        FileOutputStream fileOutputStream;
        ParcelFileDescriptor parcelFileDescriptor;
        Exception exc;
        FileInputStream fileInputStream;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        File fileM85689h;
        File file;
        FileOutputStream fileOutputStream2;
        byte[] bArr;
        int i;
        FileInputStream fileInputStream2 = null;
        try {
            uri2 = uri;
            try {
                cursorQuery = context.getContentResolver().query(uri2, new String[]{"_data"}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            return cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        }
                    } catch (Exception e) {
                        e = e;
                        SLog.m85490e("openSDK_LOG.Util", "queryAbsolutePath error : " + e.getMessage());
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        try {
                            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri2, "r");
                            try {
                                fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                                try {
                                    fileM85689h = m85689h(context, "Images");
                                    if (fileM85689h == null) {
                                        SLog.m85490e("openSDK_LOG.Util", "getExternalFilesDir return null");
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException e2) {
                                            SLog.m85490e("openSDK_LOG.Util", "close fileIuputStream error" + e2.getMessage());
                                        }
                                        try {
                                            parcelFileDescriptorOpenFileDescriptor.close();
                                        } catch (IOException e3) {
                                            SLog.m85490e("openSDK_LOG.Util", "close ParcelFileDescriptor error" + e3.getMessage());
                                        }
                                        return null;
                                    }
                                    if (!fileM85689h.exists()) {
                                        fileM85689h.mkdirs();
                                    }
                                    file = new File(fileM85689h, uri2.getLastPathSegment());
                                    if (!file.exists()) {
                                        file.createNewFile();
                                    }
                                    fileOutputStream2 = new FileOutputStream(file);
                                    try {
                                        bArr = new byte[2048];
                                        while (true) {
                                            i = fileInputStream.read(bArr);
                                            if (i != -1) {
                                                break;
                                            }
                                            fileOutputStream2.write(bArr, 0, i);
                                        }
                                        fileOutputStream2.flush();
                                        String absolutePath = file.getAbsolutePath();
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException e4) {
                                            SLog.m85490e("openSDK_LOG.Util", "close fileIuputStream error" + e4.getMessage());
                                        }
                                        try {
                                            fileOutputStream2.close();
                                        } catch (IOException e5) {
                                            SLog.m85490e("openSDK_LOG.Util", "close fileOutputStream error" + e5.getMessage());
                                        }
                                        try {
                                            parcelFileDescriptorOpenFileDescriptor.close();
                                        } catch (IOException e6) {
                                            SLog.m85490e("openSDK_LOG.Util", "close ParcelFileDescriptor error" + e6.getMessage());
                                        }
                                        return absolutePath;
                                    } catch (Exception e7) {
                                        parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                                        fileOutputStream = fileOutputStream2;
                                        exc = e7;
                                        try {
                                            SLog.m85490e("openSDK_LOG.Util", "copy file from uri error : " + exc.getMessage());
                                            if (fileInputStream != null) {
                                                try {
                                                    fileInputStream.close();
                                                } catch (IOException e8) {
                                                    SLog.m85490e("openSDK_LOG.Util", "close fileIuputStream error" + e8.getMessage());
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (IOException e9) {
                                                    SLog.m85490e("openSDK_LOG.Util", "close fileOutputStream error" + e9.getMessage());
                                                }
                                            }
                                            if (parcelFileDescriptor != null) {
                                                try {
                                                    parcelFileDescriptor.close();
                                                } catch (IOException e10) {
                                                    SLog.m85490e("openSDK_LOG.Util", "close ParcelFileDescriptor error" + e10.getMessage());
                                                }
                                            }
                                            return null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            fileInputStream2 = fileInputStream;
                                            if (fileInputStream2 != null) {
                                                try {
                                                    fileInputStream2.close();
                                                } catch (IOException e11) {
                                                    SLog.m85490e("openSDK_LOG.Util", "close fileIuputStream error" + e11.getMessage());
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (IOException e12) {
                                                    SLog.m85490e("openSDK_LOG.Util", "close fileOutputStream error" + e12.getMessage());
                                                }
                                            }
                                            if (parcelFileDescriptor == null) {
                                                throw th;
                                            }
                                            try {
                                                parcelFileDescriptor.close();
                                                throw th;
                                            } catch (IOException e13) {
                                                SLog.m85490e("openSDK_LOG.Util", "close ParcelFileDescriptor error" + e13.getMessage());
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                                        fileInputStream2 = fileInputStream;
                                        fileOutputStream = fileOutputStream2;
                                        th = th3;
                                        if (fileInputStream2 != null) {
                                            fileInputStream2.close();
                                        }
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        if (parcelFileDescriptor == null) {
                                            throw th;
                                        }
                                        parcelFileDescriptor.close();
                                        throw th;
                                    }
                                } catch (Exception e14) {
                                    exc = e14;
                                    parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                                    fileOutputStream = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                    parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                                    fileOutputStream = null;
                                    fileInputStream2 = fileInputStream;
                                    if (fileInputStream2 != null) {
                                        fileInputStream2.close();
                                    }
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    if (parcelFileDescriptor == null) {
                                        throw th;
                                    }
                                    parcelFileDescriptor.close();
                                    throw th;
                                }
                            } catch (Exception e15) {
                                exc = e15;
                                parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                                fileOutputStream = null;
                                fileInputStream = null;
                            } catch (Throwable th5) {
                                th = th5;
                                parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                                fileOutputStream = null;
                            }
                        } catch (Exception e16) {
                            exc = e16;
                            fileOutputStream = null;
                            parcelFileDescriptor = null;
                            fileInputStream = null;
                        } catch (Throwable th6) {
                            th = th6;
                            fileOutputStream = null;
                            parcelFileDescriptor = null;
                        }
                    }
                }
                return null;
            } catch (Exception e17) {
                e = e17;
                cursorQuery = null;
                SLog.m85490e("openSDK_LOG.Util", "queryAbsolutePath error : " + e.getMessage());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri2, "r");
                fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                fileM85689h = m85689h(context, "Images");
                if (fileM85689h == null) {
                    SLog.m85490e("openSDK_LOG.Util", "getExternalFilesDir return null");
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                if (!fileM85689h.exists()) {
                    fileM85689h.mkdirs();
                }
                file = new File(fileM85689h, uri2.getLastPathSegment());
                if (!file.exists()) {
                    file.createNewFile();
                }
                fileOutputStream2 = new FileOutputStream(file);
                bArr = new byte[2048];
                while (true) {
                    i = fileInputStream.read(bArr);
                    if (i != -1) {
                        break;
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, i);
                }
                fileOutputStream2.flush();
                String absolutePath2 = file.getAbsolutePath();
                fileInputStream.close();
                fileOutputStream2.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return absolutePath2;
            }
        } catch (Exception e18) {
            e = e18;
            uri2 = uri;
        }
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m85678d(String str) throws JSONException {
        if (str.equals("false")) {
            str = "{value : false}";
        }
        if (str.equals("true")) {
            str = "{value : true}";
        }
        if (str.contains("allback(")) {
            str = str.replaceFirst("[\\s\\S]*allback\\(([\\s\\S]*)\\);[^\\)]*\\z", "$1").trim();
        }
        if (str.contains("online[0]=")) {
            str = "{online:" + str.charAt(str.length() - 2) + "}";
        }
        return new JSONObject(str);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m85682e(String str) {
        return str == null || str.length() == 0;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m85685f(Context context, String str) {
        boolean z = !m85676c(context) || C14557l.m85617a(context, Constants.PACKAGE_QQ_PAD) == null;
        if (z && C14557l.m85617a(context, Constants.PACKAGE_TIM) != null) {
            z = false;
        }
        if (z) {
            return C14557l.m85628c(context, str) < 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m85687g(Context context) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.tencent.mtt", 64);
            String str = packageInfo.versionName;
            if (C14557l.m85611a(str, "4.3") >= 0 && !str.startsWith("4.4") && (signatureArr = packageInfo.signatures) != null) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(signatureArr[0].toByteArray());
                    String strM85657a = m85657a(messageDigest.digest());
                    messageDigest.reset();
                    if (strM85657a.equals("d8391a394d4a179e6fe7bdb8a301258b")) {
                        return true;
                    }
                } catch (NoSuchAlgorithmException e) {
                    SLog.m85490e("openSDK_LOG.Util", "isQQBrowerAvailable has exception: " + e.getMessage());
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static File m85689h(Context context, String str) {
        File[] externalFilesDirs;
        if (context == null) {
            return null;
        }
        try {
            externalFilesDirs = context.getExternalFilesDirs(str);
        } catch (Throwable th) {
            SLog.m85491e("openSDK_LOG.Util", "getExternalFilesDirs exception", th);
            externalFilesDirs = null;
        }
        if (externalFilesDirs == null || externalFilesDirs.length <= 0) {
            return null;
        }
        return externalFilesDirs[0];
    }

    /* JADX INFO: renamed from: i */
    public static boolean m85692i(String str) {
        return str != null && new File(str).exists();
    }

    /* JADX INFO: renamed from: j */
    public static byte[] m85693j(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            SLog.m85491e("openSDK_LOG.Util", "getBytesUTF8: UnsupportedEncodingException", e);
            return new byte[0];
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m85694k(String str) {
        return m85653a(str, 2);
    }

    /* JADX INFO: renamed from: l */
    public static File m85695l(String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            if (file.getParentFile() != null && !file.getParentFile().exists()) {
                if (file.getParentFile().mkdirs()) {
                    file.createNewFile();
                    return file;
                }
                SLog.m85488d("openSDK_LOG.Util", "createFile failed" + str);
                return file;
            }
            file.createNewFile();
        }
        return file;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m85696m(String str) {
        String strM85668b = m85668b();
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(strM85668b) || !str.contains(strM85668b)) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static String m85680e(Context context, String str) {
        if (context == null) {
            return "";
        }
        String strM85677d = m85677d(context, str);
        f61204c = strM85677d;
        return strM85677d;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m85681e(Context context) {
        return C14557l.m85628c(context, "8.1.8") >= 0;
    }

    /* JADX INFO: renamed from: i */
    private static boolean m85691i(Context context, String str) {
        try {
            return context.checkSelfPermission(str) != 0;
        } catch (Exception e) {
            SLog.m85491e("openSDK_LOG.Util", "checkSelfPermission exception", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m85690h(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }

    /* JADX INFO: renamed from: f */
    public static String m85683f(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            SLog.m85491e("openSDK_LOG.Util", "urlEncode: UnsupportedEncodingException", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m85684f(Context context) {
        return C14557l.m85628c(context, "5.9.5") >= 0;
    }

    /* JADX INFO: renamed from: d */
    public static String m85677d(Context context, String str) {
        if (context == null) {
            return "";
        }
        m85670b(context, str);
        return f61202a;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m85679d(Context context) {
        return C14557l.m85628c(context, "8.1.5") >= 0;
    }

    /* JADX INFO: renamed from: g */
    public static String m85686g(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(m85693j(str));
            byte[] bArrDigest = messageDigest.digest();
            if (bArrDigest == null) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(m85642a(b >>> 4));
                sb.append(m85642a(b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            SLog.m85490e("openSDK_LOG.Util", "encrypt has exception: " + e.getMessage());
            return str;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m85688g(Context context, String str) {
        boolean z = !m85676c(context) || C14557l.m85617a(context, Constants.PACKAGE_QQ_PAD) == null;
        if (z) {
            return C14557l.m85628c(context, str) < 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m85647a(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            try {
                for (String str2 : str.split("&")) {
                    String[] strArrM85666a = m85666a(str2, "=");
                    if (strArrM85666a.length == 2) {
                        bundle.putString(URLDecoder.decode(strArrM85666a[0]), URLDecoder.decode(strArrM85666a[1]));
                    }
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public static String[] m85666a(String str, String str2) {
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf == -1) {
            return new String[]{str};
        }
        return new String[]{str.substring(0, iIndexOf), str.substring(iIndexOf + str2.length())};
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m85658a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (str != null) {
            for (String str2 : str.split("&")) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length == 2) {
                    try {
                        strArrSplit[0] = URLDecoder.decode(strArrSplit[0]);
                        strArrSplit[1] = URLDecoder.decode(strArrSplit[1]);
                    } catch (Exception unused) {
                    }
                    try {
                        jSONObject.put(strArrSplit[0], strArrSplit[1]);
                    } catch (JSONException e) {
                        SLog.m85490e("openSDK_LOG.Util", "decodeUrlToJson has exception: " + e.getMessage());
                    }
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m85661a(Context context, String str) {
        boolean zM85687g;
        try {
            zM85687g = m85687g(context);
            try {
                if (zM85687g) {
                    m85659a(context, "com.tencent.mtt", "com.tencent.mtt.MainActivity", str);
                } else {
                    m85659a(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
                }
                return true;
            } catch (Exception unused) {
                if (zM85687g) {
                    try {
                        try {
                            try {
                                m85659a(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
                                return true;
                            } catch (Exception unused2) {
                                return false;
                            }
                        } catch (Exception unused3) {
                            m85659a(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                            return true;
                        }
                    } catch (Exception unused4) {
                        m85659a(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                        return true;
                    }
                }
                try {
                    try {
                        m85659a(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                        return true;
                    } catch (Exception unused5) {
                        return false;
                    }
                } catch (Exception unused6) {
                    m85659a(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                    return true;
                }
            }
        } catch (Exception unused7) {
            zM85687g = false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m85659a(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(1073741824);
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        intent.setData(Uri.parse(str3));
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m85660a() {
        return (Environment.getExternalStorageState().equals("mounted") ? Environment.getExternalStorageDirectory() : null) != null;
    }

    /* JADX INFO: renamed from: a */
    public static String m85657a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            String string = Integer.toString(b & 255, 16);
            if (string.length() == 1) {
                string = "0".concat(string);
            }
            sb.append(string);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m85671b(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || m85691i(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo[] allNetworkInfo = null;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Throwable th) {
            SLog.m85491e("openSDK_LOG.Util", "Util.isNetWorkAvailable getConnectivity has exception", th);
            connectivityManager = null;
        }
        if (connectivityManager == null) {
            return true;
        }
        try {
            allNetworkInfo = connectivityManager.getAllNetworkInfo();
        } catch (Exception e) {
            SLog.m85491e("openSDK_LOG.Util", "Util.isNetWorkAvailable has exception: ", e);
        }
        if (allNetworkInfo != null && allNetworkInfo.length != 0) {
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (networkInfo.isConnectedOrConnecting()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static final String m85652a(Context context) {
        CharSequence applicationLabel;
        if (context == null || (applicationLabel = context.getPackageManager().getApplicationLabel(context.getApplicationInfo())) == null) {
            return null;
        }
        return applicationLabel.toString();
    }

    /* JADX INFO: renamed from: a */
    public static final String m85654a(String str, int i, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "UTF-8";
        }
        try {
            if (str.getBytes(str2).length > i) {
                int i2 = 0;
                int length = 0;
                while (i2 < str.length()) {
                    int i3 = i2 + 1;
                    length += str.substring(i2, i3).getBytes(str2).length;
                    if (length > i) {
                        String strSubstring = str.substring(0, i2);
                        if (TextUtils.isEmpty(str3)) {
                            return strSubstring;
                        }
                        return strSubstring + str3;
                    }
                    i2 = i3;
                }
            }
            return str;
        } catch (Exception e) {
            SLog.m85490e("openSDK_LOG.Util", "Util.subString has exception: " + e.getMessage());
            return str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m85670b(Context context, String str) {
        if (context == null) {
            return;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            String str2 = packageInfo.versionName;
            f61203b = str2;
            f61202a = str2.substring(0, str2.lastIndexOf(46));
            String str3 = f61203b;
            f61205d = str3.substring(str3.lastIndexOf(46) + 1, f61203b.length());
            f61206e = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            SLog.m85490e("openSDK_LOG.Util", "getPackageInfo has exception: " + e.getMessage());
        } catch (Exception e2) {
            SLog.m85490e("openSDK_LOG.Util", "getPackageInfo has exception: " + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m85667b(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            Bundle bundleM85647a = m85647a(url.getQuery());
            bundleM85647a.putAll(m85647a(url.getRef()));
            return bundleM85647a;
        } catch (MalformedURLException unused) {
            return new Bundle();
        }
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m85646a(Bundle bundle, String str) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString(LovePlanetStage.result, str);
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m85650a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        Bundle bundle = new Bundle();
        bundle.putString("openid", str);
        bundle.putString("report_type", str2);
        bundle.putString("act_type", str3);
        bundle.putString("via", str4);
        bundle.putString(Constants.JumpUrlConstants.URL_KEY_APPID, str5);
        bundle.putString("type", str6);
        bundle.putString("login_status", str7);
        bundle.putString("need_user_auth", str8);
        bundle.putString("to_uin", str9);
        bundle.putString("call_source", str10);
        bundle.putString("to_type", str11);
        bundle.putString("platform", "1");
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public static String m85668b() {
        File fileM85592d = C14553h.m85592d();
        if (fileM85592d == null) {
            return null;
        }
        if (!fileM85592d.exists()) {
            fileM85592d.mkdirs();
        }
        return fileM85592d.toString();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m85672b(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        try {
            return m85664a(file, m85695l(str2));
        } catch (IOException e) {
            SLog.m85489d("openSDK_LOG.Util", "copy fail from " + str + " to " + str2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, e);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m85648a(String str, String str2, String str3, String str4, String str5) {
        return m85650a(str, str3, str4, str2, str5, "", "", "", "", "", "");
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m85649a(String str, String str2, String str3, String str4, String str5, String str6) {
        return m85651a(str, str3, str4, str2, str5, str6, "", "", "", "", "", "");
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m85651a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        return m85646a(m85650a(str, str2, str3, str4, str5, str7, str8, str9, str10, str11, str12), str6);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m85663a(Context context, boolean z) {
        return (m85676c(context) && C14557l.m85617a(context, Constants.PACKAGE_QQ_PAD) != null) || C14557l.m85628c(context, "4.1") >= 0 || C14557l.m85617a(context, Constants.PACKAGE_TIM) != null;
    }

    /* JADX INFO: renamed from: a */
    public static long m85643a(Context context, Uri uri) {
        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_size"}, null, null, null);
        long j = 0;
        if (cursorQuery != null) {
            try {
                if (cursorQuery.getCount() != 0) {
                    try {
                        int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_size");
                        if (cursorQuery.moveToFirst()) {
                            j = cursorQuery.getLong(columnIndexOrThrow);
                        }
                    } catch (Exception e) {
                        SLog.m85491e("openSDK_LOG.Util", "cursor exception", e);
                    }
                    return j;
                }
            } finally {
                try {
                    cursorQuery.close();
                } catch (Exception e2) {
                    SLog.m85491e("openSDK_LOG.Util", "cursor exception", e2);
                }
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public static String m85653a(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Base64.encodeToString(str.getBytes("UTF-8"), i);
            } catch (UnsupportedEncodingException e) {
                SLog.m85490e("openSDK_LOG.Util", "convert2Base64String exception: " + e.getMessage());
                return "";
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public static Drawable m85644a(String str, Context context) throws Throwable {
        InputStream inputStreamOpen;
        StringBuilder sb;
        InputStream inputStream = null;
        drawableCreateFromStream = null;
        Drawable drawableCreateFromStream = null;
        if (context == null) {
            SLog.m85490e("openSDK_LOG.Util", "context null!");
            return null;
        }
        try {
            inputStreamOpen = context.getAssets().open(str);
            try {
                try {
                    drawableCreateFromStream = Drawable.createFromStream(inputStreamOpen, str);
                    try {
                        inputStreamOpen.close();
                    } catch (Exception e) {
                        e = e;
                        sb = new StringBuilder("inputStream close exception: ");
                        sb.append(e.getMessage());
                        SLog.m85490e("openSDK_LOG.Util", sb.toString());
                    }
                } catch (IOException e2) {
                    e = e2;
                    SLog.m85490e("openSDK_LOG.Util", "getDrawable exception: " + e.getMessage());
                    try {
                        inputStreamOpen.close();
                    } catch (Exception e3) {
                        e = e3;
                        sb = new StringBuilder("inputStream close exception: ");
                        sb.append(e.getMessage());
                        SLog.m85490e("openSDK_LOG.Util", sb.toString());
                    }
                }
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpen;
                try {
                    inputStream.close();
                } catch (Exception e4) {
                    SLog.m85490e("openSDK_LOG.Util", "inputStream close exception: " + e4.getMessage());
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            inputStreamOpen = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream.close();
            throw th;
        }
        return drawableCreateFromStream;
    }

    /* JADX INFO: renamed from: a */
    private static char m85642a(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : i2 + 87);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m85662a(Context context, String str, String str2) {
        boolean zM85672b;
        try {
            zM85672b = m85672b(str, str2);
        } catch (Throwable th) {
            SLog.m85491e("openSDK_LOG.Util", "copyFileByCheckPermission catch exception", th);
            zM85672b = false;
        }
        SLog.m85492i("openSDK_LOG.Util", "copyFileByCheckPermission() copy success:" + zM85672b);
        return zM85672b;
    }

    /* JADX INFO: renamed from: a */
    public static String m85655a(String str, Activity activity, String str2, IUiListener iUiListener) {
        String str3;
        try {
            boolean zM85696m = m85696m(str2);
            SLog.m85492i("openSDK_LOG.Util", "doPublishMood() check file: isAppSpecificDir=" + zM85696m);
            if (!zM85696m) {
                File fileM85588a = C14553h.m85588a("Images");
                if (fileM85588a != null) {
                    str3 = fileM85588a.getAbsolutePath() + File.separator + Constants.QQ_SHARE_TEMP_DIR;
                } else {
                    File cacheDir = C14553h.m85587a().getCacheDir();
                    if (cacheDir == null) {
                        SLog.m85490e("openSDK_LOG.Util", "getMediaFileUri error, cacheDir is null");
                        return null;
                    }
                    str3 = cacheDir.getAbsolutePath() + File.separator + Constants.QQ_SHARE_TEMP_DIR;
                }
                File file = new File(str2);
                String absolutePath = file.getAbsolutePath();
                String str4 = str3 + File.separator + file.getName();
                str2 = m85672b(absolutePath, str4) ? str4 : null;
            }
            Uri uriM85645a = m85645a(activity, str, str2);
            if (uriM85645a == null) {
                return null;
            }
            return uriM85645a.toString();
        } catch (Exception e) {
            SLog.m85491e("openSDK_LOG.Util", "getMediaFileUri error", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m85665a(Map<String, Object> map, String str, boolean z) {
        if (map == null) {
            SLog.m85490e("openSDK_LOG.Util", "getBoolean error, params==null");
            return z;
        }
        if (!map.containsKey(str)) {
            SLog.m85490e("openSDK_LOG.Util", "getBoolean error, not comtain : " + str);
            return z;
        }
        Object obj = map.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
    }

    /* JADX INFO: renamed from: a */
    public static String m85656a(Map<String, Object> map, String str, String str2) {
        if (map == null) {
            SLog.m85490e("openSDK_LOG.Util", "getString error, params==null");
            return str2;
        }
        if (!map.containsKey(str)) {
            SLog.m85490e("openSDK_LOG.Util", "getString error, not comtain : " + str);
            return str2;
        }
        Object obj = map.get(str);
        return obj instanceof String ? (String) obj : str2;
    }

    /* JADX INFO: renamed from: a */
    public static Uri m85645a(Activity activity, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            SLog.m85490e("openSDK_LOG.Util", "grantUriPermissionToAllQQVersion -- stringForFileUri is empty");
            return null;
        }
        try {
            String authorities = Tencent.getAuthorities(str);
            if (TextUtils.isEmpty(authorities)) {
                return null;
            }
            Uri uriForFile = FileProvider.getUriForFile(activity, authorities, new File(str2));
            activity.grantUriPermission("com.tencent.mobileqq", uriForFile, 3);
            activity.grantUriPermission(Constants.PACKAGE_TIM, uriForFile, 3);
            activity.grantUriPermission(Constants.PACKAGE_QQ_PAD, uriForFile, 3);
            activity.grantUriPermission(Constants.PACKAGE_QQ_SPEED, uriForFile, 3);
            return uriForFile;
        } catch (Exception e) {
            SLog.m85491e("openSDK_LOG.Util", "grantUriPermissionToAllQQVersion exception:", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m85674c(Context context, String str) {
        if (context == null) {
            return "";
        }
        m85670b(context, str);
        return f61203b;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m85676c(Context context) {
        double dSqrt;
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            dSqrt = Math.sqrt(Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d) + Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d));
        } catch (Throwable unused) {
            dSqrt = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        return dSqrt > 6.5d;
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m85675c(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            JSONObject jSONObjectM85658a = m85658a((JSONObject) null, url.getQuery());
            m85658a(jSONObjectM85658a, url.getRef());
            return jSONObjectM85658a;
        } catch (MalformedURLException unused) {
            return new JSONObject();
        }
    }
}
