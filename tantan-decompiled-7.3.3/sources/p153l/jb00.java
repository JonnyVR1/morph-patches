package p153l;

import android.util.Log;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import java.net.URI;
import org.eclipse.jetty.http.MimeTypes;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes7.dex */
public class jb00 {
    /* JADX INFO: renamed from: a */
    private static String m144178a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (str.equalsIgnoreCase("xml")) {
            return MimeTypes.TEXT_XML;
        }
        if (str.equalsIgnoreCase(Constants.INAPP_HTML_TAG)) {
            return MimeTypes.TEXT_HTML;
        }
        if (str.equalsIgnoreCase("js")) {
            return "text/javascript";
        }
        if (str.equalsIgnoreCase("css")) {
            return "text/css";
        }
        if (str.equalsIgnoreCase("jpg") || str.equalsIgnoreCase("jpeg")) {
            return DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        }
        if (str.equalsIgnoreCase("png")) {
            return DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG;
        }
        if (str.equalsIgnoreCase("mp3")) {
            return "audio/mpeg3";
        }
        if (str.equalsIgnoreCase("mp4")) {
            return "video/mpeg4";
        }
        if (str.equalsIgnoreCase("apng")) {
            return "image/apng";
        }
        if (str.equalsIgnoreCase("gif")) {
            return "image/gif";
        }
        if (str.equalsIgnoreCase("webp")) {
            return "image/webp";
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static String m144179b(@NonNull String str) {
        try {
            return m144178a(m144180c(URI.create(str).getPath()));
        } catch (Exception e) {
            Log.e("LOCAL_SERVER_MimeTypeUtils", "", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m144180c(String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf >= 0) {
            return str.substring(iLastIndexOf + 1, str.length());
        }
        return null;
    }
}
