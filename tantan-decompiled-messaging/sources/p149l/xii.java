package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.log.Log4Android;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class xii {
    /* JADX INFO: renamed from: a */
    public static File m209648a(Context context) {
        File fileM209649b = rhi.m179370n() ? m209649b(context) : null;
        if (fileM209649b == null) {
            fileM209649b = context.getCacheDir();
        }
        return fileM209649b == null ? context.getCacheDir() : fileM209649b;
    }

    /* JADX INFO: renamed from: b */
    public static File m209649b(Context context) {
        File fileM179374r = rhi.m179374r();
        if (fileM179374r == null) {
            return null;
        }
        if (!fileM179374r.exists()) {
            if (!fileM179374r.mkdirs()) {
                return null;
            }
            try {
                new File(fileM179374r, ".nomedia").createNewFile();
                return fileM179374r;
            } catch (IOException e) {
                CrashHelper.m81296c(e);
                Log4Android.getInstance().m81397d("tag", e);
            }
        }
        return fileM179374r;
    }

    /* JADX INFO: renamed from: c */
    public static File m209650c() {
        File file = new File(m209648a(FeedModule.f38852a), "filterData");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: d */
    public static File m209651d() {
        File file = new File(m209650c().getPath(), "filterImg");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: e */
    public static File m209652e() {
        File file = new File(m209650c().getPath(), "local_filter");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
