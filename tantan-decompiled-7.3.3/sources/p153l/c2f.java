package p153l;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.hellogroup.common.file.FileUtil;
import com.hellogroup.common.thread.C3486c;
import com.hellogroup.fep.base.FepLogLevel;
import com.hellogroup.fep.base.FepLogModuleType;
import com.hellogroup.fep.base.core.FepManager;
import com.hellogroup.fep.feppkg.internal.core.CheckPolicy;
import com.hellogroup.fep.feppkg.model.FepPackageConfig;
import com.hellogroup.fep.feppkg.model.FepPackageStatus;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class c2f {

    /* JADX INFO: renamed from: a */
    private static String f79472a = "";

    /* JADX INFO: renamed from: l.c2f$b */
    public class RunnableC16167b implements Runnable {
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            c2f.m107686g();
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m107681b(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("[CL]")) {
            return null;
        }
        return str.substring(4);
    }

    /* JADX INFO: renamed from: c */
    public static String m107682c() {
        return "https://s.immomo.com/fep/momo/m-fes-sdk/adr-mk-jssdk/index.js?_bid=1000597";
    }

    /* JADX INFO: renamed from: d */
    private static String m107683d(String str, String str2) {
        try {
            zgi zgiVarM17592n = FepManager.m17582z().m17592n(str, null, null, CheckPolicy.LOCAL_ONLY);
            if (zgiVarM17592n != null) {
                String strM219626i = zgiVarM17592n.m219626i();
                FepPackageConfig fepPackageConfigM219623f = zgiVarM17592n.m219623f();
                if (fepPackageConfigM219623f != null) {
                    for (File file : new File(strM219626i + File.separator + fepPackageConfigM219623f.getUrl()).listFiles()) {
                        if (file.getName().contains(str2)) {
                            return file.getAbsolutePath();
                        }
                    }
                }
            }
            return null;
        } catch (Exception e) {
            Log.e("EnhanceInjectorUtils", e.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m107684e(hul hulVar, String str) {
        String str2;
        if (hulVar == null || hulVar.mo17920e() || !rs8.m182921l()) {
            return;
        }
        if (TextUtils.isEmpty(f79472a)) {
            C3486c.m17566d(1, new RunnableC16167b());
            str2 = "javascript:console.error=(function(func){return function(){var args=[].slice.call(arguments);if(!args||!args[0]||typeof(args[0])!=\"string\"){return}try{if(args[0].indexOf(\"[CL]\")===-1){args[0]=\"[CL]\"+args[0]}func.apply(console,args)}catch(err){console.error(\"[CL]console.error注入有问题，可忽略\")}}})(console.error);";
        } else {
            str2 = "javascript:" + f79472a;
        }
        hulVar.mo17922f(str2);
    }

    /* JADX INFO: renamed from: f */
    public static void m107685f() {
        FepManager.m17582z().m17599v(new C16166a());
        FepManager.m17582z().m17590k(m107682c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static void m107686g() throws Throwable {
        try {
            String strM107683d = m107683d("1000597", "index.js");
            if (strM107683d == null || TextUtils.isEmpty(strM107683d)) {
                return;
            }
            File file = new File(strM107683d);
            if (file.exists()) {
                String strM17534r = FileUtil.m17534r(file);
                if (TextUtils.isEmpty(strM17534r)) {
                    strM17534r = f79472a;
                }
                f79472a = strM17534r;
            }
        } catch (Exception e) {
            Log.e("EnhanceInjectorUtils", "", e);
        }
    }

    /* JADX INFO: renamed from: l.c2f$a */
    public class C16166a implements ehi {
        @Override // p153l.ehi
        /* JADX INFO: renamed from: d */
        public void mo17607d(@NonNull zgi zgiVar, @NonNull FepPackageStatus fepPackageStatus) throws Throwable {
            if ("1000597".equals(zgiVar.getBid())) {
                if (fepPackageStatus == FepPackageStatus.Ready) {
                    zgiVar.toString();
                    c2f.m107686g();
                } else if (fepPackageStatus == FepPackageStatus.Failed) {
                    zgiVar.toString();
                }
            }
        }

        @Override // p153l.ehi
        /* JADX INFO: renamed from: e */
        public void mo17608e(@NonNull String str, @Nullable tgi tgiVar, @Nullable Map<String, ?> map) {
        }

        @Override // p153l.ehi
        /* JADX INFO: renamed from: f */
        public void mo17609f(@NonNull FepLogModuleType fepLogModuleType, @NonNull FepLogLevel fepLogLevel, @NonNull String str, @Nullable Map<String, ?> map, int i, @Nullable Throwable th) {
        }
    }
}
