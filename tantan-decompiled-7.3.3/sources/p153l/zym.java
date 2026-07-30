package p153l;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.p036mk.core.log.MKCoreLogManager;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.jetty.http.MimeTypes;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes7.dex */
public class zym {

    /* JADX INFO: renamed from: a */
    private static final String f206616a = "zym";

    /* JADX INFO: renamed from: l.zym$a */
    public class RunnableC21936a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f206617a;

        public RunnableC21936a(String str) {
            this.f206617a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            File file;
            File fileM206874j = wkw.m206874j(this.f206617a);
            if (fileM206874j.exists()) {
                file = new File(fileM206874j.getAbsolutePath() + ".imgtemp");
            } else {
                file = fileM206874j;
            }
            try {
                gkw.m130601b().m130602a().mo115345a(this.f206617a, file, null, null);
                if (!zym.m222139l(file)) {
                    file.delete();
                } else if (file != fileM206874j) {
                    fileM206874j.delete();
                    file.renameTo(fileM206874j);
                }
            } catch (Exception e) {
                jzv.m147730c(zym.f206616a, "", e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m222130c(String str) {
        n9e.m161974a().m161975b(new RunnableC21936a(str));
    }

    /* JADX INFO: renamed from: d */
    private static String m222131d(boolean z, String str, String str2) {
        if (z) {
            try {
                if (i8g0.m139002d(str) && (str.startsWith("https://") || str.startsWith("http://"))) {
                    if (!str.contains(".html?") && !str.contains(".js?") && !str.contains(".css?") && i8g0.m139002d(str2) && str.contains(str2)) {
                        Uri uri = Uri.parse(str);
                        String lastPathSegment = uri.getLastPathSegment();
                        if (i8g0.m139002d(lastPathSegment) && !lastPathSegment.contains(".")) {
                            String string = uri.buildUpon().appendEncodedPath("index.html").toString();
                            jzv.m147732e(f206616a, "checkUrlPath=" + string);
                            return string;
                        }
                    }
                }
            } catch (Throwable th) {
                jzv.m147730c(f206616a, "", th);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static File m222132e(String str, x4d0 x4d0Var) {
        return wkw.m206873i(str, x4d0Var);
    }

    /* JADX INFO: renamed from: f */
    public static File m222133f(String str, x4d0 x4d0Var) {
        if (str.startsWith("file://") || a6k0.m96334h(str)) {
            return null;
        }
        if (a6k0.m96335i(str)) {
            String strM206866b = wkw.m206866b(str);
            if (TextUtils.isEmpty(strM206866b)) {
                return null;
            }
            return new File(strM206866b);
        }
        File fileM206870f = wkw.m206870f(str, x4d0Var);
        if (fileM206870f == null && a6k0.m96333g(str)) {
            fileM206870f = m222132e(str, x4d0Var);
        }
        if (sjw.m186324m() && fileM206870f != null && fileM206870f.exists()) {
            jzv.m147728a(f206616a, "intercept getLocalFileByUrl " + fileM206870f.getAbsolutePath());
        }
        return fileM206870f;
    }

    /* JADX INFO: renamed from: g */
    public static WebResourceResponse m222134g(String str, String str2, ekw ekwVar) {
        if (ekwVar == null || str == null) {
            return null;
        }
        try {
            if (!str.startsWith("https://mk.localfile.immomo.com")) {
                return null;
            }
            String strM96329a = a6k0.m96329a(str2);
            String strDecode = URLDecoder.decode(str, "UTF-8");
            if (strDecode.contains("?")) {
                strDecode = strDecode.substring(0, strDecode.indexOf("?"));
            }
            String strReplaceFirst = strDecode.replaceFirst("https://mk.localfile.immomo.com", "");
            if (!ekwVar.m121086c(strDecode) || !i8g0.m139002d(strReplaceFirst)) {
                return null;
            }
            File file = new File(strReplaceFirst);
            if (!file.exists()) {
                return null;
            }
            WebResourceResponse webResourceResponseM222138k = m222138k(strM96329a, file, str2);
            if (webResourceResponseM222138k != null) {
                Map<String, String> responseHeaders = webResourceResponseM222138k.getResponseHeaders();
                if (responseHeaders == null) {
                    responseHeaders = new HashMap<>();
                }
                responseHeaders.put(OSSHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
                webResourceResponseM222138k.setResponseHeaders(responseHeaders);
            }
            return webResourceResponseM222138k;
        } catch (Throwable th) {
            jzv.m147730c(f206616a, "", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static WebResourceResponse m222135h(boolean z, String str, String str2, String str3, boolean z2, x4d0 x4d0Var) {
        if (str.startsWith("file://")) {
            try {
                MKCoreLogManager.m18427e().m18449i(str3, str2, str, "contains file scheme");
            } catch (Exception unused) {
            }
            return null;
        }
        if (!fwd0.m127759b(str)) {
            return null;
        }
        String strM96329a = a6k0.m96329a(str);
        if (TextUtils.isEmpty(strM96329a)) {
            return null;
        }
        dlw.INSTANCE.m116901d(str, strM96329a, str3, z2);
        String strM222131d = m222131d(z, str, str2);
        File fileM222133f = m222133f(strM222131d, x4d0Var);
        if (fileM222133f != null) {
            try {
                if (fileM222133f.getAbsolutePath().contains("..")) {
                    MKCoreLogManager.m18427e().m18449i(strM96329a, str2, strM222131d, "contains unallow path name");
                }
            } catch (Exception unused2) {
            }
        }
        if (!fwd0.m127758a(fileM222133f)) {
            return null;
        }
        if (a6k0.m96333g(strM222131d)) {
            return m222136i(strM96329a, fileM222133f, strM222131d, str2);
        }
        if (fileM222133f == null || !m222139l(fileM222133f)) {
            return null;
        }
        return m222138k(strM96329a, fileM222133f, str2);
    }

    /* JADX INFO: renamed from: i */
    private static WebResourceResponse m222136i(String str, File file, String str2, String str3) {
        if (file != null) {
            try {
                if (m222139l(file)) {
                    return m222138k(str, file, str3);
                }
            } catch (Exception e) {
                jzv.m147730c(f206616a, "", e);
                return null;
            }
        }
        m222130c(str2);
        return null;
    }

    /* JADX INFO: renamed from: j */
    private static HashMap<String, String> m222137j(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            jzv.m147734g(f206616a, "newOfflineJsFileHeader---originUrl is null");
            return null;
        }
        if (!glw.m130713j(sjw.m186317f(str))) {
            jzv.m147734g(f206616a, "newOfflineJsFileHeader---url is not in white list. " + str);
            return null;
        }
        HashMap<String, String> map = new HashMap<>();
        map.put(OSSHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
        map.put(OSSHeaders.ACCESS_CONTROL_ALLOW_HEADERS, "*");
        if (file.getName().contains(".js")) {
            map.put("Content-Type", "text/javascript");
        }
        map.put("Content-Length", file.length() + "");
        map.put("offlineRes", "1");
        return map;
    }

    /* JADX INFO: renamed from: k */
    private static WebResourceResponse m222138k(String str, File file, String str2) {
        try {
            String lowerCase = file.getAbsolutePath().toLowerCase();
            WebResourceResponse webResourceResponse = new WebResourceResponse("", "UTF-8", new FileInputStream(file));
            if (!TextUtils.isEmpty(lowerCase)) {
                if (lowerCase.endsWith(Constants.INAPP_HTML_TAG)) {
                    webResourceResponse.setMimeType(MimeTypes.TEXT_HTML);
                } else if (lowerCase.endsWith("png")) {
                    webResourceResponse.setMimeType(DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG);
                } else if (lowerCase.endsWith("jpeg")) {
                    webResourceResponse.setMimeType(DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG);
                }
            }
            jzv.m147728a(f206616a, "filePath = " + lowerCase + " mimeType = " + webResourceResponse.getMimeType());
            webResourceResponse.setResponseHeaders(m222137j(file, str2));
            return webResourceResponse;
        } catch (Exception e) {
            jzv.m147730c(f206616a, "", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static boolean m222139l(File file) {
        return file.exists() && file.length() > 0;
    }
}
