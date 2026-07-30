package p153l;

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
public class i4k0 {

    /* JADX INFO: renamed from: a */
    public static final Uri f112925a = Uri.withAppendedPath((Uri) x11.m208894a(ContactsContract.AUTHORITY_URI), "display_photo");

    /* JADX INFO: renamed from: a */
    public static AssetFileDescriptor m138552a(ContentResolver contentResolver, Uri uri) {
        if (m138563l(uri)) {
            try {
                return contentResolver.openAssetFileDescriptor(uri, "r");
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static String m138553b(boolean z) {
        return "_data";
    }

    /* JADX INFO: renamed from: c */
    public static Uri m138554c(boolean z) {
        return z ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    }

    /* JADX INFO: renamed from: d */
    public static String m138555d(boolean z) {
        return "_id";
    }

    /* JADX INFO: renamed from: e */
    public static String m138556e(ContentResolver contentResolver, Uri uri) {
        Uri uri2;
        String str;
        String[] strArr;
        int columnIndexOrThrow;
        String type = contentResolver.getType(uri);
        String string = null;
        if (!m138563l(uri)) {
            if (m138564m(uri)) {
                return uri.getPath();
            }
            return null;
        }
        boolean z = type != null && type.startsWith("video/");
        if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
            String documentId = DocumentsContract.getDocumentId(uri);
            wn80.m207182g(documentId);
            uri2 = (Uri) wn80.m207182g(m138554c(z));
            str = m138555d(z) + "=?";
            strArr = new String[]{documentId.split(":")[1]};
        } else {
            uri2 = uri;
            str = null;
            strArr = null;
        }
        Cursor cursorQuery = contentResolver.query(uri2, new String[]{m138553b(z)}, str, strArr, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst() && (columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow(m138553b(z))) != -1) {
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
    public static String m138557f(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    /* JADX INFO: renamed from: g */
    public static Uri m138558g(int i) {
        return new Uri.Builder().scheme(ShareConstants.RES_PATH).path(String.valueOf(i)).build();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m138559h(Uri uri) {
        return "data".equals(m138557f(uri));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m138560i(Uri uri) {
        return "asset".equals(m138557f(uri));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m138561j(Uri uri) {
        String string = uri.toString();
        return string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    /* JADX INFO: renamed from: k */
    public static boolean m138562k(Uri uri) {
        return uri.getPath() != null && m138563l(uri) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith((String) x11.m208894a(f112925a.getPath()));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m138563l(Uri uri) {
        return "content".equals(m138557f(uri));
    }

    /* JADX INFO: renamed from: m */
    public static boolean m138564m(Uri uri) {
        return "file".equals(m138557f(uri));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m138565n(Uri uri) {
        return ShareConstants.RES_PATH.equals(m138557f(uri));
    }

    /* JADX INFO: renamed from: o */
    public static boolean m138566o(Uri uri) {
        String strM138557f = m138557f(uri);
        return "https".equals(strM138557f) || "http".equals(strM138557f);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m138567p(Uri uri) {
        return "android.resource".equals(m138557f(uri));
    }

    /* JADX INFO: renamed from: q */
    public static URL m138568q(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e) {
            iig0.m140070a(e);
            return null;
        }
    }
}
