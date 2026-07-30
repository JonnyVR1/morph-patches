package p006l;

import android.content.Context;
import com.p000p1.mobile.putong.account.AccountModule;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.log.Log4Android;
import java.io.File;
import java.io.IOException;
import l.rhi;

/* JADX INFO: renamed from: l.lo */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0983lo {
    /* JADX INFO: renamed from: a */
    public static File m18893a(Context context) {
        File fileM18894b = rhi.n() ? m18894b(context) : null;
        if (fileM18894b == null) {
            fileM18894b = context.getCacheDir();
        }
        return fileM18894b == null ? context.getCacheDir() : fileM18894b;
    }

    /* JADX INFO: renamed from: b */
    public static File m18894b(Context context) {
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
                Log4Android.getInstance().d("tag", e);
            }
        }
        return fileR;
    }

    /* JADX INFO: renamed from: c */
    public static File m18895c() {
        File file = new File(m18893a(AccountModule.f24a), "filterData");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: d */
    public static File m18896d() {
        File file = new File(m18895c().getPath(), "filterImg");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: e */
    public static File m18897e() {
        File file = new File(m18895c().getPath(), "local_filter");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
