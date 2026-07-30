package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.account.AccountModule;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.log.Log4Android;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.go */
/* JADX INFO: loaded from: classes9.dex */
public class C17263go {
    /* JADX INFO: renamed from: a */
    public static File m131007a(Context context) {
        File fileM131008b = oki.m168026n() ? m131008b(context) : null;
        if (fileM131008b == null) {
            fileM131008b = context.getCacheDir();
        }
        return fileM131008b == null ? context.getCacheDir() : fileM131008b;
    }

    /* JADX INFO: renamed from: b */
    public static File m131008b(Context context) {
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
    public static File m131009c() {
        File file = new File(m131007a(AccountModule.f16754a), "filterData");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: d */
    public static File m131010d() {
        File file = new File(m131009c().getPath(), "filterImg");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: e */
    public static File m131011e() {
        File file = new File(m131009c().getPath(), "local_filter");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
