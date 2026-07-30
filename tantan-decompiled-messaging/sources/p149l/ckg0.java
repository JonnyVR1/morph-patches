package p149l;

import android.content.Context;
import java.io.File;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class ckg0 extends lgg0 {
    public ckg0(Context context, gdg0 gdg0Var) {
        super(gdg0Var);
        this.f127984b = new File(context.getFilesDir(), "sud/mgp/utcore/".concat(jkg0.m141869a())).getAbsolutePath();
        this.f127985c = new File(context.getCacheDir(), "sud/mgp/utcache").getAbsolutePath();
    }

    @Override // p149l.lgg0
    /* JADX INFO: renamed from: a */
    public final n8g0 mo95866a() {
        g7g0.m124691b(this.f127984b);
        g7g0.m124690a(this.f127984b);
        File file = new File(this.f127985c, "dynamic_load" + File.separator + jkg0.m141869a());
        File file2 = new File(this.f127984b);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            n8g0 n8g0Var = new n8g0();
            n8g0Var.f137642a = -10401;
            n8g0Var.f137643b = "The source directory when the copy runtime is empty";
            return n8g0Var;
        }
        for (File file3 : fileArrListFiles) {
            File file4 = new File(file2, file3.getName());
            n8g0 n8g0VarM141870b = jkg0.m141870b(file3.getAbsolutePath(), file4.getAbsolutePath());
            if (n8g0VarM141870b.f137642a != 0) {
                return n8g0VarM141870b;
            }
            LogUtils.file("UTRealSudGameCoreManager", "setReadOnlyResult:" + file4.setReadOnly() + " path:" + file4.getAbsolutePath());
        }
        n8g0 n8g0Var2 = new n8g0();
        n8g0Var2.f137642a = 0;
        cbg0.m105995a("TechSudMGPGlobal.sp").m105999e("key_fix_android14_read_only_unity");
        return n8g0Var2;
    }

    @Override // p149l.lgg0
    /* JADX INFO: renamed from: c */
    public final void mo95867c(long j, Object obj, akg0 akg0Var) {
        this.f127983a.m125551d((bdg0) obj);
    }

    @Override // p149l.lgg0
    /* JADX INFO: renamed from: d */
    public final boolean mo95868d(Object obj) {
        return obj instanceof bdg0;
    }

    @Override // p149l.lgg0
    /* JADX INFO: renamed from: e */
    public final nqg0 mo95869e() {
        ymg0 ymg0Var;
        asg0 asg0Var = mlg0.f134430e;
        if (asg0Var == null || (ymg0Var = asg0Var.f71451c) == null) {
            return null;
        }
        return ymg0Var.f199001c;
    }
}
