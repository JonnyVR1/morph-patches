package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.account.AccountModule;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.log.Log4Android;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.lo */
/* JADX INFO: loaded from: classes9.dex */
public class C18268lo {
    /* JADX INFO: renamed from: a */
    public static File m150751a(Context context) {
        File fileM150752b = rhi.m179370n() ? m150752b(context) : null;
        if (fileM150752b == null) {
            fileM150752b = context.getCacheDir();
        }
        return fileM150752b == null ? context.getCacheDir() : fileM150752b;
    }

    /* JADX INFO: renamed from: b */
    public static File m150752b(Context context) {
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
    public static File m150753c() {
        File file = new File(m150751a(AccountModule.f16035a), "filterData");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: d */
    public static File m150754d() {
        File file = new File(m150753c().getPath(), "filterImg");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: e */
    public static File m150755e() {
        File file = new File(m150753c().getPath(), "local_filter");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
