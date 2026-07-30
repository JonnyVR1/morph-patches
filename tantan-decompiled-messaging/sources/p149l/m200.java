package p149l;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import java.io.File;
import java.net.URI;
import org.eclipse.jetty.http.MimeTypes;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes2.dex */
public class m200 {
    /* JADX INFO: renamed from: a */
    public static String m152645a(@NonNull File file) {
        try {
            return m152646b(m152648d(file.getName()));
        } catch (Exception e) {
            MDLog.printErrStackTrace("LOCAL_SERVER_MimeTypeUtils", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m152646b(String str) {
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

    /* JADX INFO: renamed from: c */
    public static String m152647c(@NonNull String str) {
        try {
            return m152646b(m152648d(URI.create(str).getPath()));
        } catch (Exception e) {
            MDLog.printErrStackTrace("LOCAL_SERVER_MimeTypeUtils", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m152648d(String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf >= 0) {
            return str.substring(iLastIndexOf + 1, str.length());
        }
        return null;
    }
}
