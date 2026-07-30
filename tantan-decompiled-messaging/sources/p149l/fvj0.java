package p149l;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class fvj0 {

    /* JADX INFO: renamed from: a */
    public static final Uri f99450a = Uri.withAppendedPath((Uri) q11.m172368a(ContactsContract.AUTHORITY_URI), "display_photo");

    /* JADX INFO: renamed from: a */
    public static AssetFileDescriptor m123306a(ContentResolver contentResolver, Uri uri) {
        if (m123317l(uri)) {
            try {
                return contentResolver.openAssetFileDescriptor(uri, "r");
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static String m123307b(boolean z) {
        return "_data";
    }

    /* JADX INFO: renamed from: c */
    public static Uri m123308c(boolean z) {
        return z ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    }

    /* JADX INFO: renamed from: d */
    public static String m123309d(boolean z) {
        return "_id";
    }

    /* JADX INFO: renamed from: e */
    public static String m123310e(ContentResolver contentResolver, Uri uri) {
        Uri uri2;
        String str;
        String[] strArr;
        int columnIndexOrThrow;
        String type = contentResolver.getType(uri);
        String string = null;
        if (!m123317l(uri)) {
            if (m123318m(uri)) {
                return uri.getPath();
            }
            return null;
        }
        boolean z = type != null && type.startsWith("video/");
        if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
            String documentId = DocumentsContract.getDocumentId(uri);
            rf80.m179116g(documentId);
            uri2 = (Uri) rf80.m179116g(m123308c(z));
            str = m123309d(z) + "=?";
            strArr = new String[]{documentId.split(":")[1]};
        } else {
            uri2 = uri;
            str = null;
            strArr = null;
        }
        Cursor cursorQuery = contentResolver.query(uri2, new String[]{m123307b(z)}, str, strArr, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst() && (columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow(m123307b(z))) != -1) {
                    string = cursorQuery.getString(columnIndexOrThrow);
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return string;
    }

    /* JADX INFO: renamed from: f */
    public static String m123311f(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    /* JADX INFO: renamed from: g */
    public static Uri m123312g(int i) {
        return new Uri.Builder().scheme(ShareConstants.RES_PATH).path(String.valueOf(i)).build();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m123313h(Uri uri) {
        return "data".equals(m123311f(uri));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m123314i(Uri uri) {
        return "asset".equals(m123311f(uri));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m123315j(Uri uri) {
        String string = uri.toString();
        return string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    /* JADX INFO: renamed from: k */
    public static boolean m123316k(Uri uri) {
        return uri.getPath() != null && m123317l(uri) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith((String) q11.m172368a(f99450a.getPath()));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m123317l(Uri uri) {
        return "content".equals(m123311f(uri));
    }

    /* JADX INFO: renamed from: m */
    public static boolean m123318m(Uri uri) {
        return "file".equals(m123311f(uri));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m123319n(Uri uri) {
        return ShareConstants.RES_PATH.equals(m123311f(uri));
    }

    /* JADX INFO: renamed from: o */
    public static boolean m123320o(Uri uri) {
        String strM123311f = m123311f(uri);
        return "https".equals(strM123311f) || "http".equals(strM123311f);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m123321p(Uri uri) {
        return "android.resource".equals(m123311f(uri));
    }

    /* JADX INFO: renamed from: q */
    public static URL m123322q(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e) {
            aag0.m95543a(e);
            return null;
        }
    }
}
