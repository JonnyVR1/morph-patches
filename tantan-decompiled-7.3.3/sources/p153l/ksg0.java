package p153l;

import android.content.Context;
import java.io.File;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class ksg0 extends tog0 {
    public ksg0(Context context, olg0 olg0Var) {
        super(olg0Var);
        this.f175405b = new File(context.getFilesDir(), "sud/mgp/utcore/".concat(rsg0.m182968a())).getAbsolutePath();
        this.f175406c = new File(context.getCacheDir(), "sud/mgp/utcache").getAbsolutePath();
    }

    @Override // p153l.tog0
    /* JADX INFO: renamed from: a */
    public final vgg0 mo140624a() {
        ofg0.m167449b(this.f175405b);
        ofg0.m167448a(this.f175405b);
        File file = new File(this.f175406c, "dynamic_load" + File.separator + rsg0.m182968a());
        File file2 = new File(this.f175405b);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            vgg0 vgg0Var = new vgg0();
            vgg0Var.f184033a = -10401;
            vgg0Var.f184034b = "The source directory when the copy runtime is empty";
            return vgg0Var;
        }
        for (File file3 : fileArrListFiles) {
            File file4 = new File(file2, file3.getName());
            vgg0 vgg0VarM182969b = rsg0.m182969b(file3.getAbsolutePath(), file4.getAbsolutePath());
            if (vgg0VarM182969b.f184033a != 0) {
                return vgg0VarM182969b;
            }
            LogUtils.file("UTRealSudGameCoreManager", "setReadOnlyResult:" + file4.setReadOnly() + " path:" + file4.getAbsolutePath());
        }
        vgg0 vgg0Var2 = new vgg0();
        vgg0Var2.f184033a = 0;
        kjg0.m150043a("TechSudMGPGlobal.sp").m150047e("key_fix_android14_read_only_unity");
        return vgg0Var2;
    }

    @Override // p153l.tog0
    /* JADX INFO: renamed from: c */
    public final void mo140625c(long j, Object obj, isg0 isg0Var) {
        this.f175404a.m168112d((jlg0) obj);
    }

    @Override // p153l.tog0
    /* JADX INFO: renamed from: d */
    public final boolean mo140626d(Object obj) {
        return obj instanceof jlg0;
    }

    @Override // p153l.tog0
    /* JADX INFO: renamed from: e */
    public final vyg0 mo140627e() {
        gvg0 gvg0Var;
        i0h0 i0h0Var = utg0.f180950e;
        if (i0h0Var == null || (gvg0Var = i0h0Var.f112370c) == null) {
            return null;
        }
        return gvg0Var.f106632c;
    }
}
