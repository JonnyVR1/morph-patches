package p153l;

import android.content.Context;
import java.io.File;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class ilg0 extends tog0 {
    public ilg0(Context context, olg0 olg0Var) {
        super(olg0Var);
        this.f175405b = new File(context.getFilesDir(), "sud/mgp/sudcore/".concat(rsg0.m182968a())).getAbsolutePath();
        this.f175406c = new File(context.getCacheDir(), "sud/mgp/sudcache").getAbsolutePath();
    }

    @Override // p153l.tog0
    /* JADX INFO: renamed from: a */
    public final vgg0 mo140624a() {
        String strM182968a = rsg0.m182968a();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f175406c);
        sb.append("/dynamic_load");
        String str = File.separator;
        sb.append(str);
        String string = sb.toString();
        String str2 = this.f175405b + str;
        String strConcat = str2.concat("libsud.so");
        vgg0 vgg0VarM182969b = rsg0.m182969b(string + strM182968a + "/libsud.so", strConcat);
        if (vgg0VarM182969b.f184033a != 0) {
            return vgg0VarM182969b;
        }
        LogUtils.file("SUDRealSudGameCoreManager", "setReadOnlyResult:" + new File(strConcat).setReadOnly() + " path:" + strConcat);
        String strConcat2 = str2.concat("sud-dex.jar");
        vgg0 vgg0VarM182969b2 = rsg0.m182969b(string.concat("sud-dex.jar"), strConcat2);
        if (vgg0VarM182969b2.f184033a == 0) {
            LogUtils.file("SUDRealSudGameCoreManager", "setReadOnlyResult:" + new File(strConcat2).setReadOnly() + " path:" + strConcat2);
            kjg0.m150043a("TechSudMGPGlobal.sp").m150047e("key_fix_android14_read_only_cocos");
        }
        return vgg0VarM182969b2;
    }

    @Override // p153l.tog0
    /* JADX INFO: renamed from: c */
    public final void mo140625c(long j, Object obj, isg0 isg0Var) {
        jsg0 jsg0Var = (jsg0) obj;
        jsg0Var.f122461a = j;
        File file = new File(this.f175405b + "/sud-dex.jar");
        String str = ing0.f115953a;
        long length = file.length();
        long length2 = new File(this.f175405b + "/libsud.so").length();
        jsg0Var.f122462b = length;
        jsg0Var.f122463c = length2;
        this.f175404a.m168113e(jsg0Var);
    }

    @Override // p153l.tog0
    /* JADX INFO: renamed from: d */
    public final boolean mo140626d(Object obj) {
        return obj instanceof jsg0;
    }

    @Override // p153l.tog0
    /* JADX INFO: renamed from: e */
    public final vyg0 mo140627e() {
        gvg0 gvg0Var;
        i0h0 i0h0Var = utg0.f180950e;
        if (i0h0Var == null || (gvg0Var = i0h0Var.f112370c) == null) {
            return null;
        }
        return gvg0Var.f106631b;
    }
}
