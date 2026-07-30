package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.log.Log4Android;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class uli {
    /* JADX INFO: renamed from: a */
    public static File m196552a(Context context) {
        File fileM196553b = oki.m168026n() ? m196553b(context) : null;
        if (fileM196553b == null) {
            fileM196553b = context.getCacheDir();
        }
        return fileM196553b == null ? context.getCacheDir() : fileM196553b;
    }

    /* JADX INFO: renamed from: b */
    public static File m196553b(Context context) {
        File fileM168030r = oki.m168030r();
        if (fileM168030r == null) {
            return null;
        }
        if (!fileM168030r.exists()) {
            if (!fileM168030r.mkdirs()) {
                return null;
            }
            try {
                new File(fileM168030r, ".nomedia").createNewFile();
                return fileM168030r;
            } catch (IOException e) {
                CrashHelper.m82479c(e);
                Log4Android.getInstance().m82580d("tag", e);
            }
        }
        return fileM168030r;
    }

    /* JADX INFO: renamed from: c */
    public static File m196554c() {
        File file = new File(m196552a(FeedModule.f39700a), "filterData");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: d */
    public static File m196555d() {
        File file = new File(m196554c().getPath(), "filterImg");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: e */
    public static File m196556e() {
        File file = new File(m196554c().getPath(), "local_filter");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
