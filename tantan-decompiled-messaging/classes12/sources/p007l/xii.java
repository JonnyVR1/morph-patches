package p007l;

import android.content.Context;
import com.p000p1.mobile.putong.data.Tag;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.log.Log4Android;
import java.io.File;
import java.io.IOException;
import l.rhi;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class xii {
    /* JADX INFO: renamed from: a */
    public static File m16784a(Context context) {
        File fileM16785b = rhi.n() ? m16785b(context) : null;
        if (fileM16785b == null) {
            fileM16785b = context.getCacheDir();
        }
        return fileM16785b == null ? context.getCacheDir() : fileM16785b;
    }

    /* JADX INFO: renamed from: b */
    public static File m16785b(Context context) {
        File fileR = rhi.r();
        if (fileR == null) {
            return null;
        }
        if (!fileR.exists()) {
            if (!fileR.mkdirs()) {
                return null;
            }
            try {
                new File(fileR, ".nomedia").createNewFile();
                return fileR;
            } catch (IOException e) {
                CrashHelper.c(e);
                Log4Android.getInstance().d(Tag.TYPE, e);
            }
        }
        return fileR;
    }

    /* JADX INFO: renamed from: c */
    public static File m16786c() {
        File file = new File(m16784a(FeedModule.f313a), "filterData");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: d */
    public static File m16787d() {
        File file = new File(m16786c().getPath(), "filterImg");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: e */
    public static File m16788e() {
        File file = new File(m16786c().getPath(), "local_filter");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
