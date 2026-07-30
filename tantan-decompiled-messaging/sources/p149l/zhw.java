package p149l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class zhw {
    /* JADX INFO: renamed from: a */
    public static String m218868a(String str) {
        File parentFile;
        File fileM164470h = ohw.m164470h();
        if (fileM164470h == null || (parentFile = fileM164470h.getParentFile()) == null) {
            return null;
        }
        String parent = parentFile.getParent();
        if (TextUtils.isEmpty(parent)) {
            return null;
        }
        return new File(parent, m218874g(str)).getAbsolutePath();
    }

    /* JADX INFO: renamed from: b */
    public static String m218869b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Uri.parse(str).getQueryParameter("_bid");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m218870c(String str) {
        File fileM164470h;
        File parentFile;
        if (str != null && str.startsWith("/") && (fileM164470h = ohw.m164470h()) != null && (parentFile = fileM164470h.getParentFile()) != null) {
            String parent = parentFile.getParent();
            if (!TextUtils.isEmpty(parent) && str.startsWith(parent)) {
                return "local://".concat(str.replace(parent, "").substring(1));
            }
        }
        return str;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static File m218871d(String str) {
        return m218872e(str, 0L);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static File m218872e(String str, long j) {
        File fileM217437h;
        File[] fileArrListFiles;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = Uri.parse(str);
        String strM218869b = m218869b(str);
        if (TextUtils.isEmpty(strM218869b)) {
            return null;
        }
        List<String> listM217434e = z750.m217434e();
        if (listM217434e != null && listM217434e.contains(strM218869b)) {
            return null;
        }
        List<String> listM217443n = z750.m217443n();
        if ((listM217443n != null && listM217443n.contains(strM218869b)) || (fileM217437h = z750.m217437h(strM218869b)) == null) {
            return null;
        }
        if (!fileM217437h.exists()) {
            fileM217437h.mkdirs();
        }
        if (j > 0 && System.currentTimeMillis() - fileM217437h.lastModified() < j) {
            return null;
        }
        String host = uri.getHost();
        String path = uri.getPath();
        if (!path.startsWith("/")) {
            path = "/".concat(path);
        }
        File file = new File(fileM217437h, host + path);
        if (!file.exists() || file.length() == 0) {
            return null;
        }
        return (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length == 1 && fileArrListFiles[0].getName().contains("index.html")) ? fileArrListFiles[0] : file;
    }

    /* JADX INFO: renamed from: f */
    public static String m218873f(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri uri = Uri.parse(str);
        String str4 = uri.getPort() != -1 ? ":" + uri.getPort() : "";
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(uri.getScheme()).authority(uri.getHost() + str4).path(uri.getPath());
        boolean z = false;
        for (String str5 : uri.getQueryParameterNames()) {
            if (TextUtils.equals(str5, str2)) {
                z = true;
            }
            builder.appendQueryParameter(str5, shw.m184292l(uri, str5));
        }
        if (!z) {
            builder.appendQueryParameter(str2, str3);
        }
        String encodedFragment = uri.getEncodedFragment();
        if (!TextUtils.isEmpty(encodedFragment)) {
            builder.encodedFragment(encodedFragment);
        }
        return builder.build().toString();
    }

    /* JADX INFO: renamed from: g */
    public static String m218874g(String str) {
        Uri uri = Uri.parse(str);
        String host = uri.getHost();
        String path = uri.getPath();
        if (!path.startsWith("/")) {
            path = "/".concat(path);
        }
        return host + path;
    }

    /* JADX INFO: renamed from: h */
    public static File m218875h(String str) {
        File fileM218871d = m218871d(str);
        return fileM218871d != null ? fileM218871d : m218876i(str);
    }

    /* JADX INFO: renamed from: i */
    public static File m218876i(String str) {
        return new File(ohw.m164477o(), pgw.m168922f(str));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m218877j(String str) {
        return str.startsWith("local://");
    }

    /* JADX INFO: renamed from: k */
    public static boolean m218878k(String str) {
        String host = Uri.parse(str).getHost();
        return host != null && host.startsWith("alpha-");
    }
}
