package p149l;

import android.text.TextUtils;
import com.immomo.downloader.DownloadManager;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class x7e {

    /* JADX INFO: renamed from: a */
    public static final String f191356a = DownloadManager.m18307q().f168691b + "/downloader";

    /* JADX INFO: renamed from: a */
    public static void m207285a(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        file.delete();
    }

    /* JADX INFO: renamed from: b */
    public static void m207286b(q8e q8eVar) {
        m207285a(m207287c(q8eVar));
        m207285a(m207289e(q8eVar));
    }

    /* JADX INFO: renamed from: c */
    public static File m207287c(q8e q8eVar) {
        if (!TextUtils.isEmpty(q8eVar.f153172l)) {
            return new File(q8eVar.f153172l);
        }
        if (TextUtils.isEmpty(q8eVar.f153163c)) {
            return new File(m207290f(), j0g0.m139165a(q8eVar.f153162b[0]) + ShareConstants.PATCH_SUFFIX);
        }
        return new File(m207290f(), j0g0.m139165a(q8eVar.f153163c) + ShareConstants.PATCH_SUFFIX);
    }

    /* JADX INFO: renamed from: d */
    public static String m207288d(q8e q8eVar) {
        return m207287c(q8eVar).getAbsolutePath();
    }

    /* JADX INFO: renamed from: e */
    public static File m207289e(q8e q8eVar) {
        if (!TextUtils.isEmpty(q8eVar.f153172l)) {
            return new File(q8eVar.f153172l + "_temp");
        }
        return new File(m207290f(), j0g0.m139165a(q8eVar.f153163c) + ".apk_temp");
    }

    /* JADX INFO: renamed from: f */
    private static File m207290f() {
        File file = new File(f191356a);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m207291g(q8e q8eVar) {
        File fileM207287c = m207287c(q8eVar);
        File fileM207289e = m207289e(q8eVar);
        if (fileM207287c == null || !fileM207287c.exists()) {
            return fileM207289e != null && fileM207289e.exists();
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m207292h(File file, File file2) {
        return file.renameTo(file2);
    }
}
