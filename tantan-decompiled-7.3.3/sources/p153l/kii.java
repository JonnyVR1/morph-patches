package p153l;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class kii {
    /* JADX INFO: renamed from: a */
    private static String m149872a(Context context, Uri uri) {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        try {
            String strM149873b = m149873b(context, uri);
            if (TextUtils.isEmpty(strM149873b)) {
                strM149873b = "web_choose_" + System.currentTimeMillis();
            }
            File file = new File(context.getCacheDir(), strM149873b);
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Throwable unused) {
                    }
                }
                return null;
            }
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = inputStreamOpenInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    }
                    fileOutputStream2.flush();
                    String absolutePath = file.getAbsolutePath();
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Throwable unused2) {
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (Throwable unused3) {
                    }
                    return absolutePath;
                } catch (Throwable th) {
                    inputStream = inputStreamOpenInputStream;
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    try {
                        jzv.m147731d("FileChooSerUtils", th);
                        return null;
                    } finally {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused4) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable unused5) {
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                inputStream = inputStreamOpenInputStream;
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m149873b(Context context, Uri uri) {
        Cursor cursorQuery;
        int columnIndex;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_display_name")) >= 0) {
                        String string = cursorQuery.getString(columnIndex);
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable unused) {
                    if (cursorQuery != null) {
                    }
                    return null;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Throwable unused2) {
            cursorQuery = null;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m149874c(Context context, Uri uri) {
        return m149875d(context, uri);
    }

    /* JADX INFO: renamed from: d */
    public static String m149875d(Context context, Uri uri) {
        if (context != null && uri != null) {
            try {
                if (DocumentsContract.isDocumentUri(context, uri)) {
                    return m149878g(context, uri);
                }
                String scheme = uri.getScheme();
                if ("content".equals(scheme)) {
                    return m149877f(context, uri);
                }
                if ("file".equals(scheme)) {
                    return uri.getPath();
                }
            } catch (Throwable th) {
                jzv.m147731d("FileChooSerUtils", th);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private static String m149876e(Context context, Uri uri, String str, String[] strArr) {
        Throwable th;
        Cursor cursorQuery;
        int columnIndex;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_data")) >= 0) {
                        String string = cursorQuery.getString(columnIndex);
                        if (!TextUtils.isEmpty(string) && new File(string).exists()) {
                            cursorQuery.close();
                            return string;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        jzv.m147731d("FileChooSerUtils", th);
                        return null;
                    } finally {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                }
            }
            if (cursorQuery != null) {
            }
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private static String m149877f(Context context, Uri uri) {
        if ("com.google.android.apps.photos.content".equals(uri.getAuthority())) {
            return uri.getLastPathSegment();
        }
        String strM149876e = m149876e(context, uri, null, null);
        return !TextUtils.isEmpty(strM149876e) ? strM149876e : m149872a(context, uri);
    }

    /* JADX INFO: renamed from: g */
    private static String m149878g(Context context, Uri uri) {
        String authority = uri.getAuthority();
        String documentId = DocumentsContract.getDocumentId(uri);
        if ("com.android.externalstorage.documents".equals(authority)) {
            return m149880i(documentId);
        }
        if ("com.android.providers.downloads.documents".equals(authority)) {
            return m149879h(context, documentId);
        }
        return "com.android.providers.media.documents".equals(authority) ? m149881j(context, documentId) : m149872a(context, uri);
    }

    /* JADX INFO: renamed from: h */
    private static String m149879h(Context context, String str) {
        if (str.startsWith("raw:")) {
            return str.substring(4);
        }
        if (str.startsWith("msf:")) {
            return m149872a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(str.substring(4))));
        }
        try {
            long j = Long.parseLong(str);
            String[] strArr = {"content://downloads/public_downloads", "content://downloads/my_downloads", "content://downloads/all_downloads"};
            for (int i = 0; i < 3; i++) {
                String strM149876e = m149876e(context, ContentUris.withAppendedId(Uri.parse(strArr[i]), j), null, null);
                if (!TextUtils.isEmpty(strM149876e)) {
                    return strM149876e;
                }
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    private static String m149880i(String str) {
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str2 = strArrSplit[0];
        String str3 = strArrSplit[1];
        if ("primary".equalsIgnoreCase(str2)) {
            return Environment.getExternalStorageDirectory() + "/" + str3;
        }
        return "/storage/" + str2 + "/" + str3;
    }

    /* JADX INFO: renamed from: j */
    private static String m149881j(Context context, String str) {
        Uri contentUri;
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str2 = strArrSplit[0];
        str2.getClass();
        switch (str2) {
            case "audio":
                contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                break;
            case "image":
                contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                break;
            case "video":
                contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                break;
            default:
                contentUri = MediaStore.Files.getContentUri("external");
                break;
        }
        return m149876e(context, contentUri, "_id=?", new String[]{strArrSplit[1]});
    }
}
