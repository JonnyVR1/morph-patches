package p153l;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes7.dex */
public class fwd0 {

    /* JADX INFO: renamed from: a */
    private static Set<String> f101153a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    private static boolean f101154b;

    static {
        f101154b = true;
        try {
            f101154b = rs8.m182910a();
            f101153a.add("http");
            f101153a.add("https");
            f101153a.add("local");
            f101153a.addAll(rs8.m182923n());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m127758a(File file) {
        if (!f101154b) {
            return true;
        }
        if (file == null) {
            return false;
        }
        try {
            return !file.getAbsolutePath().contains("..");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m127759b(String str) {
        if (!f101154b) {
            return true;
        }
        try {
            return f101153a.contains(Uri.parse(str).getScheme());
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m127760c(String str) {
        if (!f101154b || str == null) {
            return true;
        }
        try {
            Uri uri = Uri.parse(str);
            if (TextUtils.equals(uri.getScheme(), "file")) {
                return !uri.getPath().contains("..");
            }
        } catch (Exception unused) {
        }
        return true;
    }
}
