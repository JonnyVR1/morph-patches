package p149l;

import android.content.Context;
import java.io.File;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class adg0 extends lgg0 {
    public adg0(Context context, gdg0 gdg0Var) {
        super(gdg0Var);
        this.f127984b = new File(context.getFilesDir(), "sud/mgp/sudcore/".concat(jkg0.m141869a())).getAbsolutePath();
        this.f127985c = new File(context.getCacheDir(), "sud/mgp/sudcache").getAbsolutePath();
    }

    @Override // p149l.lgg0
    /* JADX INFO: renamed from: a */
    public final n8g0 mo95866a() {
        String strM141869a = jkg0.m141869a();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f127985c);
        sb.append("/dynamic_load");
        String str = File.separator;
        sb.append(str);
        String string = sb.toString();
        String str2 = this.f127984b + str;
        String strConcat = str2.concat("libsud.so");
        n8g0 n8g0VarM141870b = jkg0.m141870b(string + strM141869a + "/libsud.so", strConcat);
        if (n8g0VarM141870b.f137642a != 0) {
            return n8g0VarM141870b;
        }
        LogUtils.file("SUDRealSudGameCoreManager", "setReadOnlyResult:" + new File(strConcat).setReadOnly() + " path:" + strConcat);
        String strConcat2 = str2.concat("sud-dex.jar");
        n8g0 n8g0VarM141870b2 = jkg0.m141870b(string.concat("sud-dex.jar"), strConcat2);
        if (n8g0VarM141870b2.f137642a == 0) {
            LogUtils.file("SUDRealSudGameCoreManager", "setReadOnlyResult:" + new File(strConcat2).setReadOnly() + " path:" + strConcat2);
            cbg0.m105995a("TechSudMGPGlobal.sp").m105999e("key_fix_android14_read_only_cocos");
        }
        return n8g0VarM141870b2;
    }

    @Override // p149l.lgg0
    /* JADX INFO: renamed from: c */
    public final void mo95867c(long j, Object obj, akg0 akg0Var) {
        bkg0 bkg0Var = (bkg0) obj;
        bkg0Var.f76018a = j;
        File file = new File(this.f127984b + "/sud-dex.jar");
        String str = afg0.f69172a;
        long length = file.length();
        long length2 = new File(this.f127984b + "/libsud.so").length();
        bkg0Var.f76019b = length;
        bkg0Var.f76020c = length2;
        this.f127983a.m125552e(bkg0Var);
    }

    @Override // p149l.lgg0
    /* JADX INFO: renamed from: d */
    public final boolean mo95868d(Object obj) {
        return obj instanceof bkg0;
    }

    @Override // p149l.lgg0
    /* JADX INFO: renamed from: e */
    public final nqg0 mo95869e() {
        ymg0 ymg0Var;
        asg0 asg0Var = mlg0.f134430e;
        if (asg0Var == null || (ymg0Var = asg0Var.f71451c) == null) {
            return null;
        }
        return ymg0Var.f199000b;
    }
}
