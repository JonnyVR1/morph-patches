package p149l;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import org.eclipse.jetty.http.MimeTypes;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes2.dex */
public class zwm {

    /* JADX INFO: renamed from: a */
    private static final String f205240a = "zwm";

    /* JADX INFO: renamed from: l.zwm$a */
    public class RunnableC21797a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f205241a;

        public RunnableC21797a(String str) {
            this.f205241a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            File file;
            File fileM218876i = zhw.m218876i(this.f205241a);
            if (fileM218876i.exists()) {
                file = new File(fileM218876i.getAbsolutePath() + ".imgtemp");
            } else {
                file = fileM218876i;
            }
            try {
                phw.m169153b().m169154a().mo87144b(this.f205241a, file, null, null);
                if (!zwm.m220672m(file)) {
                    file.delete();
                } else if (file != fileM218876i) {
                    fileM218876i.delete();
                    file.renameTo(fileM218876i);
                }
            } catch (Exception e) {
                MDLog.printErrStackTrace(zwm.f205240a, e);
            }
        }
    }

    /* JADX INFO: renamed from: l.zwm$b */
    public class RunnableC21798b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f205242a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f205243b;

        public RunnableC21798b(String str, String str2) {
            this.f205242a = str;
            this.f205243b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            File file;
            File fileM154674b = mij.m154674b(this.f205242a);
            String strM218874g = zhw.m218874g(this.f205243b);
            if (TextUtils.isEmpty(strM218874g)) {
                return;
            }
            File file2 = new File(fileM154674b, strM218874g);
            if (file2.exists()) {
                file = new File(file2.getAbsolutePath() + ".gt");
            } else {
                file = file2;
            }
            try {
                phw.m169153b().m169154a().mo87144b(this.f205243b, file, null, null);
                if (!zwm.m220672m(file)) {
                    file.delete();
                } else if (file != file2) {
                    file2.delete();
                    file.renameTo(file2);
                }
            } catch (Exception e) {
                MDLog.printErrStackTrace(zwm.f205240a, e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m220662c(String str) {
        a8e.m95340a().m95341b(new RunnableC21797a(str));
    }

    /* JADX INFO: renamed from: d */
    private static void m220663d(String str, String str2) {
        a8e.m95340a().m95341b(new RunnableC21798b(str, str2));
    }

    /* JADX INFO: renamed from: e */
    public static File m220664e(String str) {
        return zhw.m218875h(str);
    }

    /* JADX INFO: renamed from: f */
    public static File m220665f(String str, String str2) {
        File fileM154674b = mij.m154674b(str);
        if (fileM154674b == null) {
            return null;
        }
        if (!fileM154674b.exists()) {
            fileM154674b.mkdirs();
        }
        String strM218874g = zhw.m218874g(str2);
        if (TextUtils.isEmpty(strM218874g)) {
            return null;
        }
        return new File(fileM154674b, strM218874g);
    }

    /* JADX INFO: renamed from: g */
    public static File m220666g(String str) {
        if (str.startsWith("file://") || shw.m184304x(str)) {
            return null;
        }
        String strM218869b = zhw.m218869b(str);
        if (zhw.m218877j(str)) {
            String strM218868a = zhw.m218868a(str);
            if (TextUtils.isEmpty(strM218868a)) {
                return null;
            }
            return new File(strM218868a);
        }
        if (nij.m159512a(strM218869b)) {
            return m220665f(strM218869b, str);
        }
        File fileM218871d = zhw.m218871d(str);
        return (fileM218871d == null && shw.m184300t(str)) ? m220664e(str) : fileM218871d;
    }

    /* JADX INFO: renamed from: h */
    private static WebResourceResponse m220667h(File file, String str, String str2, String str3) {
        if (file != null && m220672m(file)) {
            return m220671l(str, file, str3);
        }
        m220663d(str, str2);
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static WebResourceResponse m220668i(String str, String str2) {
        String strM218869b = zhw.m218869b(str);
        if (str.startsWith("file://")) {
            try {
                qnw.m175704a("momo-web").m128649e(strM218869b).m128650f("ERR_2.6").m128645a(onw.m165243m(str2)).m128645a(onw.m165235e(str)).m128645a(onw.m165240j("contains file scheme")).m128647c();
            } catch (Exception unused) {
            }
            return null;
        }
        if (!dod0.m112804b(str) || TextUtils.isEmpty(strM218869b)) {
            return null;
        }
        File fileM220666g = m220666g(str);
        if (fileM220666g != null) {
            try {
                if (fileM220666g.getAbsolutePath().contains("..")) {
                    qnw.m175704a("momo-web").m128649e(strM218869b).m128650f("ERR_2.6").m128645a(onw.m165243m(str2)).m128645a(onw.m165235e(str)).m128645a(onw.m165240j("contains unallow path name")).m128647c();
                }
            } catch (Exception unused2) {
            }
        }
        if (!dod0.m112803a(fileM220666g)) {
            return null;
        }
        if (nij.m159512a(strM218869b)) {
            return m220667h(fileM220666g, strM218869b, str, str2);
        }
        if (shw.m184300t(str)) {
            return m220669j(strM218869b, fileM220666g, str, str2);
        }
        if (fileM220666g == null || !m220672m(fileM220666g)) {
            return null;
        }
        return m220671l(strM218869b, fileM220666g, str2);
    }

    /* JADX INFO: renamed from: j */
    private static WebResourceResponse m220669j(String str, File file, String str2, String str3) {
        if (file != null) {
            try {
                if (m220672m(file)) {
                    return m220671l(str, file, str3);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        m220662c(str2);
        return null;
    }

    /* JADX INFO: renamed from: k */
    private static HashMap<String, String> m220670k(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            MDLog.m7399w(f205240a, "newOfflineJsFileHeader---originUrl is null");
            return null;
        }
        p2m p2mVarM184294n = shw.m184294n();
        if (p2mVarM184294n != null && !p2mVarM184294n.mo110236h(shw.m184286f(str))) {
            MDLog.m7399w(f205240a, "newOfflineJsFileHeader---url is not in white list. " + str);
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

    /* JADX INFO: renamed from: l */
    private static WebResourceResponse m220671l(String str, File file, String str2) {
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
            MDLog.m7389d(f205240a, "filePath = " + lowerCase + " mimeType = " + webResourceResponse.getMimeType());
            webResourceResponse.setResponseHeaders(m220670k(file, str2));
            return webResourceResponse;
        } catch (Exception e) {
            MDLog.printErrStackTrace(f205240a, e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static boolean m220672m(File file) {
        return file.exists() && file.length() > 0;
    }
}
