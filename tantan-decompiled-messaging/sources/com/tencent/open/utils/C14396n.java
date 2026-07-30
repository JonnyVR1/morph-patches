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
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
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
public class C14396n {

    /* JADX INFO: renamed from: a */
    private static String f60354a = "";

    /* JADX INFO: renamed from: b */
    private static String f60355b = "";

    /* JADX INFO: renamed from: c */
    private static String f60356c = "";

    /* JADX INFO: renamed from: d */
    private static String f60357d = "";

    /* JADX INFO: renamed from: e */
    private static int f60358e = -1;

    /* JADX INFO: renamed from: f */
    private static String f60359f = "0123456789ABCDEF";

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
    public static boolean m84481a(File file, File file2) throws Throwable {
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
                                    SLog.m84308e("openSDK_LOG.Util", "copyFile error, ", e);
                                }
                            }
                        }
                        fileOutputStream2.close();
                        try {
                            file2.close();
                        } catch (IOException e2) {
                            SLog.m84308e("openSDK_LOG.Util", "copyFile error, ", e2);
                        }
                        return true;
                    } catch (IOException e3) {
                        e = e3;
                        fileOutputStream = fileOutputStream2;
                        file2 = file2;
                        SLog.m84308e("openSDK_LOG.Util", "copyFile error, ", e);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                SLog.m84308e("openSDK_LOG.Util", "copyFile error, ", e4);
                            }
                        }
                        if (file2 != 0) {
                            try {
                                file2.close();
                            } catch (IOException e5) {
                                SLog.m84308e("openSDK_LOG.Util", "copyFile error, ", e5);
                            }
                        }
                        return false;
                    } catch (OutOfMemoryError e6) {
                        e = e6;
                        fileOutputStream = fileOutputStream2;
                        file2 = file2;
                        SLog.m84308e("openSDK_LOG.Util", "copyFile error, ", e);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e7) {
                                SLog.m84308e("openSDK_LOG.Util", "copyFile error, ", e7);
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
                                SLog.m84308e("openSDK_LOG.Util", "copyFile error, ", e8);
                            }
                        }
                        if (file2 == 0) {
                            throw th;
                        }
                        try {
                            file2.close();
                            throw th;
                        } catch (IOException e9) {
                            SLog.m84308e("openSDK_LOG.Util", "copyFile error, ", e9);
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
    public static String m84486b(Context context, Uri uri) {
        Uri uri2;
        if (uri == null) {
            return null;
        }
        if (!DocumentsContract.isDocumentUri(context, uri)) {
            String scheme = uri.getScheme();
            if ("content".equals(scheme)) {
                return m84490c(context, uri);
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
            return documentId.startsWith("raw:") ? documentId.replaceFirst("raw:", "") : m84490c(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(documentId)));
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
            return m84490c(context, ContentUris.withAppendedId(uri2, Long.parseLong(strArrSplit2[1])));
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
    public static String m84490c(Context context, Uri uri) throws Throwable {
        Uri uri2;
        Cursor cursorQuery;
        Throwable th;
        FileOutputStream fileOutputStream;
        ParcelFileDescriptor parcelFileDescriptor;
        Exception exc;
        FileInputStream fileInputStream;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        File fileM84506h;
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
                        SLog.m84307e("openSDK_LOG.Util", "queryAbsolutePath error : " + e.getMessage());
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        try {
                            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri2, "r");
                            try {
                                fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                                try {
                                    fileM84506h = m84506h(context, "Images");
                                    if (fileM84506h == null) {
                                        SLog.m84307e("openSDK_LOG.Util", "getExternalFilesDir return null");
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException e2) {
                                            SLog.m84307e("openSDK_LOG.Util", "close fileIuputStream error" + e2.getMessage());
                                        }
                                        try {
                                            parcelFileDescriptorOpenFileDescriptor.close();
                                        } catch (IOException e3) {
                                            SLog.m84307e("openSDK_LOG.Util", "close ParcelFileDescriptor error" + e3.getMessage());
                                        }
                                        return null;
                                    }
                                    if (!fileM84506h.exists()) {
                                        fileM84506h.mkdirs();
                                    }
                                    file = new File(fileM84506h, uri2.getLastPathSegment());
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
                                            SLog.m84307e("openSDK_LOG.Util", "close fileIuputStream error" + e4.getMessage());
                                        }
                                        try {
                                            fileOutputStream2.close();
                                        } catch (IOException e5) {
                                            SLog.m84307e("openSDK_LOG.Util", "close fileOutputStream error" + e5.getMessage());
                                        }
                                        try {
                                            parcelFileDescriptorOpenFileDescriptor.close();
                                        } catch (IOException e6) {
                                            SLog.m84307e("openSDK_LOG.Util", "close ParcelFileDescriptor error" + e6.getMessage());
                                        }
                                        return absolutePath;
                                    } catch (Exception e7) {
                                        parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                                        fileOutputStream = fileOutputStream2;
                                        exc = e7;
                                        try {
                                            SLog.m84307e("openSDK_LOG.Util", "copy file from uri error : " + exc.getMessage());
                                            if (fileInputStream != null) {
                                                try {
                                                    fileInputStream.close();
                                                } catch (IOException e8) {
                                                    SLog.m84307e("openSDK_LOG.Util", "close fileIuputStream error" + e8.getMessage());
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (IOException e9) {
                                                    SLog.m84307e("openSDK_LOG.Util", "close fileOutputStream error" + e9.getMessage());
                                                }
                                            }
                                            if (parcelFileDescriptor != null) {
                                                try {
                                                    parcelFileDescriptor.close();
                                                } catch (IOException e10) {
                                                    SLog.m84307e("openSDK_LOG.Util", "close ParcelFileDescriptor error" + e10.getMessage());
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
                                                    SLog.m84307e("openSDK_LOG.Util", "close fileIuputStream error" + e11.getMessage());
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (IOException e12) {
                                                    SLog.m84307e("openSDK_LOG.Util", "close fileOutputStream error" + e12.getMessage());
                                                }
                                            }
                                            if (parcelFileDescriptor == null) {
                                                throw th;
                                            }
                                            try {
                                                parcelFileDescriptor.close();
                                                throw th;
                                            } catch (IOException e13) {
                                                SLog.m84307e("openSDK_LOG.Util", "close ParcelFileDescriptor error" + e13.getMessage());
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
                SLog.m84307e("openSDK_LOG.Util", "queryAbsolutePath error : " + e.getMessage());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri2, "r");
                fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                fileM84506h = m84506h(context, "Images");
                if (fileM84506h == null) {
                    SLog.m84307e("openSDK_LOG.Util", "getExternalFilesDir return null");
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                if (!fileM84506h.exists()) {
                    fileM84506h.mkdirs();
                }
                file = new File(fileM84506h, uri2.getLastPathSegment());
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
    public static JSONObject m84495d(String str) throws JSONException {
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
    public static boolean m84499e(String str) {
        return str == null || str.length() == 0;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m84502f(Context context, String str) {
        boolean z = !m84493c(context) || C14394l.m84434a(context, Constants.PACKAGE_QQ_PAD) == null;
        if (z && C14394l.m84434a(context, Constants.PACKAGE_TIM) != null) {
            z = false;
        }
        if (z) {
            return C14394l.m84445c(context, str) < 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m84504g(Context context) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.tencent.mtt", 64);
            String str = packageInfo.versionName;
            if (C14394l.m84428a(str, "4.3") >= 0 && !str.startsWith("4.4") && (signatureArr = packageInfo.signatures) != null) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(signatureArr[0].toByteArray());
                    String strM84474a = m84474a(messageDigest.digest());
                    messageDigest.reset();
                    if (strM84474a.equals("d8391a394d4a179e6fe7bdb8a301258b")) {
                        return true;
                    }
                } catch (NoSuchAlgorithmException e) {
                    SLog.m84307e("openSDK_LOG.Util", "isQQBrowerAvailable has exception: " + e.getMessage());
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static File m84506h(Context context, String str) {
        File[] externalFilesDirs;
        if (context == null) {
            return null;
        }
        try {
            externalFilesDirs = context.getExternalFilesDirs(str);
        } catch (Throwable th) {
            SLog.m84308e("openSDK_LOG.Util", "getExternalFilesDirs exception", th);
            externalFilesDirs = null;
        }
        if (externalFilesDirs == null || externalFilesDirs.length <= 0) {
            return null;
        }
        return externalFilesDirs[0];
    }

    /* JADX INFO: renamed from: i */
    public static boolean m84509i(String str) {
        return str != null && new File(str).exists();
    }

    /* JADX INFO: renamed from: j */
    public static byte[] m84510j(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            SLog.m84308e("openSDK_LOG.Util", "getBytesUTF8: UnsupportedEncodingException", e);
            return new byte[0];
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m84511k(String str) {
        return m84470a(str, 2);
    }

    /* JADX INFO: renamed from: l */
    public static File m84512l(String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            if (file.getParentFile() != null && !file.getParentFile().exists()) {
                if (file.getParentFile().mkdirs()) {
                    file.createNewFile();
                    return file;
                }
                SLog.m84305d("openSDK_LOG.Util", "createFile failed" + str);
                return file;
            }
            file.createNewFile();
        }
        return file;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m84513m(String str) {
        String strM84485b = m84485b();
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(strM84485b) || !str.contains(strM84485b)) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static String m84497e(Context context, String str) {
        if (context == null) {
            return "";
        }
        String strM84494d = m84494d(context, str);
        f60356c = strM84494d;
        return strM84494d;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m84498e(Context context) {
        return C14394l.m84445c(context, "8.1.8") >= 0;
    }

    /* JADX INFO: renamed from: i */
    private static boolean m84508i(Context context, String str) {
        try {
            return context.checkSelfPermission(str) != 0;
        } catch (Exception e) {
            SLog.m84308e("openSDK_LOG.Util", "checkSelfPermission exception", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m84507h(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }

    /* JADX INFO: renamed from: f */
    public static String m84500f(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            SLog.m84308e("openSDK_LOG.Util", "urlEncode: UnsupportedEncodingException", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m84501f(Context context) {
        return C14394l.m84445c(context, "5.9.5") >= 0;
    }

    /* JADX INFO: renamed from: d */
    public static String m84494d(Context context, String str) {
        if (context == null) {
            return "";
        }
        m84487b(context, str);
        return f60354a;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m84496d(Context context) {
        return C14394l.m84445c(context, "8.1.5") >= 0;
    }

    /* JADX INFO: renamed from: g */
    public static String m84503g(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(m84510j(str));
            byte[] bArrDigest = messageDigest.digest();
            if (bArrDigest == null) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(m84459a(b >>> 4));
                sb.append(m84459a(b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            SLog.m84307e("openSDK_LOG.Util", "encrypt has exception: " + e.getMessage());
            return str;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m84505g(Context context, String str) {
        boolean z = !m84493c(context) || C14394l.m84434a(context, Constants.PACKAGE_QQ_PAD) == null;
        if (z) {
            return C14394l.m84445c(context, str) < 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m84464a(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            try {
                for (String str2 : str.split("&")) {
                    String[] strArrM84483a = m84483a(str2, "=");
                    if (strArrM84483a.length == 2) {
                        bundle.putString(URLDecoder.decode(strArrM84483a[0]), URLDecoder.decode(strArrM84483a[1]));
                    }
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public static String[] m84483a(String str, String str2) {
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf == -1) {
            return new String[]{str};
        }
        return new String[]{str.substring(0, iIndexOf), str.substring(iIndexOf + str2.length())};
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m84475a(JSONObject jSONObject, String str) {
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
                        SLog.m84307e("openSDK_LOG.Util", "decodeUrlToJson has exception: " + e.getMessage());
                    }
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m84478a(Context context, String str) {
        boolean zM84504g;
        try {
            zM84504g = m84504g(context);
            try {
                if (zM84504g) {
                    m84476a(context, "com.tencent.mtt", "com.tencent.mtt.MainActivity", str);
                } else {
                    m84476a(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
                }
                return true;
            } catch (Exception unused) {
                if (zM84504g) {
                    try {
                        try {
                            try {
                                m84476a(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
                                return true;
                            } catch (Exception unused2) {
                                return false;
                            }
                        } catch (Exception unused3) {
                            m84476a(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                            return true;
                        }
                    } catch (Exception unused4) {
                        m84476a(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                        return true;
                    }
                }
                try {
                    try {
                        m84476a(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                        return true;
                    } catch (Exception unused5) {
                        return false;
                    }
                } catch (Exception unused6) {
                    m84476a(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                    return true;
                }
            }
        } catch (Exception unused7) {
            zM84504g = false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m84476a(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        intent.setData(Uri.parse(str3));
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m84477a() {
        return (Environment.getExternalStorageState().equals("mounted") ? Environment.getExternalStorageDirectory() : null) != null;
    }

    /* JADX INFO: renamed from: a */
    public static String m84474a(byte[] bArr) {
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
    public static boolean m84488b(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || m84508i(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo[] allNetworkInfo = null;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Throwable th) {
            SLog.m84308e("openSDK_LOG.Util", "Util.isNetWorkAvailable getConnectivity has exception", th);
            connectivityManager = null;
        }
        if (connectivityManager == null) {
            return true;
        }
        try {
            allNetworkInfo = connectivityManager.getAllNetworkInfo();
        } catch (Exception e) {
            SLog.m84308e("openSDK_LOG.Util", "Util.isNetWorkAvailable has exception: ", e);
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
    public static final String m84469a(Context context) {
        CharSequence applicationLabel;
        if (context == null || (applicationLabel = context.getPackageManager().getApplicationLabel(context.getApplicationInfo())) == null) {
            return null;
        }
        return applicationLabel.toString();
    }

    /* JADX INFO: renamed from: a */
    public static final String m84471a(String str, int i, String str2, String str3) {
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
            SLog.m84307e("openSDK_LOG.Util", "Util.subString has exception: " + e.getMessage());
            return str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m84487b(Context context, String str) {
        if (context == null) {
            return;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            String str2 = packageInfo.versionName;
            f60355b = str2;
            f60354a = str2.substring(0, str2.lastIndexOf(46));
            String str3 = f60355b;
            f60357d = str3.substring(str3.lastIndexOf(46) + 1, f60355b.length());
            f60358e = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            SLog.m84307e("openSDK_LOG.Util", "getPackageInfo has exception: " + e.getMessage());
        } catch (Exception e2) {
            SLog.m84307e("openSDK_LOG.Util", "getPackageInfo has exception: " + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m84484b(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            Bundle bundleM84464a = m84464a(url.getQuery());
            bundleM84464a.putAll(m84464a(url.getRef()));
            return bundleM84464a;
        } catch (MalformedURLException unused) {
            return new Bundle();
        }
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m84463a(Bundle bundle, String str) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString(LovePlanetStage.result, str);
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m84467a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
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
    public static String m84485b() {
        File fileM84409d = C14390h.m84409d();
        if (fileM84409d == null) {
            return null;
        }
        if (!fileM84409d.exists()) {
            fileM84409d.mkdirs();
        }
        return fileM84409d.toString();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m84489b(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        try {
            return m84481a(file, m84512l(str2));
        } catch (IOException e) {
            SLog.m84306d("openSDK_LOG.Util", "copy fail from " + str + " to " + str2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, e);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m84465a(String str, String str2, String str3, String str4, String str5) {
        return m84467a(str, str3, str4, str2, str5, "", "", "", "", "", "");
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m84466a(String str, String str2, String str3, String str4, String str5, String str6) {
        return m84468a(str, str3, str4, str2, str5, str6, "", "", "", "", "", "");
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m84468a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        return m84463a(m84467a(str, str2, str3, str4, str5, str7, str8, str9, str10, str11, str12), str6);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m84480a(Context context, boolean z) {
        return (m84493c(context) && C14394l.m84434a(context, Constants.PACKAGE_QQ_PAD) != null) || C14394l.m84445c(context, "4.1") >= 0 || C14394l.m84434a(context, Constants.PACKAGE_TIM) != null;
    }

    /* JADX INFO: renamed from: a */
    public static long m84460a(Context context, Uri uri) {
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
                        SLog.m84308e("openSDK_LOG.Util", "cursor exception", e);
                    }
                    return j;
                }
            } finally {
                try {
                    cursorQuery.close();
                } catch (Exception e2) {
                    SLog.m84308e("openSDK_LOG.Util", "cursor exception", e2);
                }
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public static String m84470a(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Base64.encodeToString(str.getBytes("UTF-8"), i);
            } catch (UnsupportedEncodingException e) {
                SLog.m84307e("openSDK_LOG.Util", "convert2Base64String exception: " + e.getMessage());
                return "";
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public static Drawable m84461a(String str, Context context) throws Throwable {
        InputStream inputStreamOpen;
        StringBuilder sb;
        InputStream inputStream = null;
        drawableCreateFromStream = null;
        Drawable drawableCreateFromStream = null;
        if (context == null) {
            SLog.m84307e("openSDK_LOG.Util", "context null!");
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
                        SLog.m84307e("openSDK_LOG.Util", sb.toString());
                    }
                } catch (IOException e2) {
                    e = e2;
                    SLog.m84307e("openSDK_LOG.Util", "getDrawable exception: " + e.getMessage());
                    try {
                        inputStreamOpen.close();
                    } catch (Exception e3) {
                        e = e3;
                        sb = new StringBuilder("inputStream close exception: ");
                        sb.append(e.getMessage());
                        SLog.m84307e("openSDK_LOG.Util", sb.toString());
                    }
                }
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpen;
                try {
                    inputStream.close();
                } catch (Exception e4) {
                    SLog.m84307e("openSDK_LOG.Util", "inputStream close exception: " + e4.getMessage());
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
    private static char m84459a(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : i2 + 87);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m84479a(Context context, String str, String str2) {
        boolean zM84489b;
        try {
            zM84489b = m84489b(str, str2);
        } catch (Throwable th) {
            SLog.m84308e("openSDK_LOG.Util", "copyFileByCheckPermission catch exception", th);
            zM84489b = false;
        }
        SLog.m84309i("openSDK_LOG.Util", "copyFileByCheckPermission() copy success:" + zM84489b);
        return zM84489b;
    }

    /* JADX INFO: renamed from: a */
    public static String m84472a(String str, Activity activity, String str2, IUiListener iUiListener) {
        String str3;
        try {
            boolean zM84513m = m84513m(str2);
            SLog.m84309i("openSDK_LOG.Util", "doPublishMood() check file: isAppSpecificDir=" + zM84513m);
            if (!zM84513m) {
                File fileM84405a = C14390h.m84405a("Images");
                if (fileM84405a != null) {
                    str3 = fileM84405a.getAbsolutePath() + File.separator + Constants.QQ_SHARE_TEMP_DIR;
                } else {
                    File cacheDir = C14390h.m84404a().getCacheDir();
                    if (cacheDir == null) {
                        SLog.m84307e("openSDK_LOG.Util", "getMediaFileUri error, cacheDir is null");
                        return null;
                    }
                    str3 = cacheDir.getAbsolutePath() + File.separator + Constants.QQ_SHARE_TEMP_DIR;
                }
                File file = new File(str2);
                String absolutePath = file.getAbsolutePath();
                String str4 = str3 + File.separator + file.getName();
                str2 = m84489b(absolutePath, str4) ? str4 : null;
            }
            Uri uriM84462a = m84462a(activity, str, str2);
            if (uriM84462a == null) {
                return null;
            }
            return uriM84462a.toString();
        } catch (Exception e) {
            SLog.m84308e("openSDK_LOG.Util", "getMediaFileUri error", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m84482a(Map<String, Object> map, String str, boolean z) {
        if (map == null) {
            SLog.m84307e("openSDK_LOG.Util", "getBoolean error, params==null");
            return z;
        }
        if (!map.containsKey(str)) {
            SLog.m84307e("openSDK_LOG.Util", "getBoolean error, not comtain : " + str);
            return z;
        }
        Object obj = map.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
    }

    /* JADX INFO: renamed from: a */
    public static String m84473a(Map<String, Object> map, String str, String str2) {
        if (map == null) {
            SLog.m84307e("openSDK_LOG.Util", "getString error, params==null");
            return str2;
        }
        if (!map.containsKey(str)) {
            SLog.m84307e("openSDK_LOG.Util", "getString error, not comtain : " + str);
            return str2;
        }
        Object obj = map.get(str);
        return obj instanceof String ? (String) obj : str2;
    }

    /* JADX INFO: renamed from: a */
    public static Uri m84462a(Activity activity, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            SLog.m84307e("openSDK_LOG.Util", "grantUriPermissionToAllQQVersion -- stringForFileUri is empty");
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
            SLog.m84308e("openSDK_LOG.Util", "grantUriPermissionToAllQQVersion exception:", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m84491c(Context context, String str) {
        if (context == null) {
            return "";
        }
        m84487b(context, str);
        return f60355b;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m84493c(Context context) {
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
    public static JSONObject m84492c(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            JSONObject jSONObjectM84475a = m84475a((JSONObject) null, url.getQuery());
            m84475a(jSONObjectM84475a, url.getRef());
            return jSONObjectM84475a;
        } catch (MalformedURLException unused) {
            return new JSONObject();
        }
    }
}
