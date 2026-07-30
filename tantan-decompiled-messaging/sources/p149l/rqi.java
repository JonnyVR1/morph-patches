package p149l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.p046p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes11.dex */
public class rqi {

    /* JADX INFO: renamed from: a */
    public szl f160655a;

    /* JADX INFO: renamed from: l.rqi$a */
    public static class C19759a {
        private static final rqi INSTANCE = new rqi();
    }

    public rqi() {
        if (bne0.m102778g()) {
            this.f160655a = new p7y();
        } else {
            this.f160655a = new ht0();
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m180452c(Context context) {
        try {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            intent.setFlags(268435456);
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            if (!bne0.m102779h(context, intent)) {
                return false;
            }
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static rqi m180453d() {
        return C19759a.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public boolean m180454a(Context context) {
        if (!m180456e()) {
            return false;
        }
        boolean zMo132806a = this.f160655a.mo132806a(context);
        if (!zMo132806a) {
            try {
                Intent intent = new Intent("android.settings.SETTINGS");
                intent.setFlags(268435456);
                App.f15369e.startActivity(intent);
                return true;
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                lsi0.m151595y("开启失败，请前往系统设置页打开悬浮窗权限");
            }
        }
        return zMo132806a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m180455b(Context context) {
        return this.f160655a.mo132807b(context);
    }

    /* JADX INFO: renamed from: e */
    public boolean m180456e() {
        return this.f160655a.isSupported();
    }
}
