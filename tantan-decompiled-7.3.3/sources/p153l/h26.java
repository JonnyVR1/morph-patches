package p153l;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Application;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
public class h26 {
    /* JADX INFO: renamed from: a */
    public static void m133364a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                outputStream.flush();
                return;
            }
            outputStream.write(bArr, 0, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:35:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static String m133365b(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Throwable th;
        IllegalArgumentException illegalArgumentException;
        Cursor cursorQuery;
        Cursor cursor = null;
        String string = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
                            if (!cursorQuery.isNull(columnIndexOrThrow)) {
                                string = cursorQuery.getString(columnIndexOrThrow);
                            }
                            cursorQuery.close();
                            return string;
                        }
                    } catch (IllegalArgumentException e) {
                        illegalArgumentException = e;
                        CrashHelper.m82479c(illegalArgumentException);
                        if (cursorQuery != null) {
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (IllegalArgumentException e2) {
            illegalArgumentException = e2;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m133366c(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    /* JADX INFO: renamed from: d */
    public static boolean m133367d(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    /* JADX INFO: renamed from: e */
    public static boolean m133368e(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    /* JADX INFO: renamed from: f */
    public static boolean m133369f(Uri uri) {
        return "com.google.android.apps.photos.contentprovider".equals(uri.getAuthority());
    }

    @SuppressLint({"NewApi"})
    @TargetApi(19)
    /* JADX INFO: renamed from: g */
    public static String m133370g(Uri uri) {
        Application application = App.f16088e;
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(application, uri)) {
            if (m133367d(uri)) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + strArrSplit[1];
                }
            } else {
                if (m133366c(uri)) {
                    return m133365b(application, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                }
                if (m133368e(uri)) {
                    String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str = strArrSplit2[0];
                    if ("image".equals(str)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return m133365b(application, uri2, "_id=?", new String[]{strArrSplit2[1]});
                }
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            String strM133365b = m133365b(application, uri, null, null);
            if (strM133365b != null) {
                return strM133365b;
            }
            if (m133369f(uri)) {
                String path = uri.getPath();
                if (path.contains("content") && path.lastIndexOf("/ACTUAL") != -1) {
                    return m133365b(application, Uri.parse(path.substring(path.indexOf("content"), path.lastIndexOf("/ACTUAL"))), null, null);
                }
            }
        } else if ("file".equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        }
        return null;
    }
}
