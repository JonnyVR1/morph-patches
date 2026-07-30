package p009l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import l.bne0;
import l.lsi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rqi {

    /* JADX INFO: renamed from: a */
    public szl f19949a;

    /* JADX INFO: renamed from: l.rqi$a */
    public static class C1178a {
        private static final rqi INSTANCE = new rqi();
    }

    public rqi() {
        if (bne0.g()) {
            this.f19949a = new p7y();
        } else {
            this.f19949a = new ht0();
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m21777c(Context context) {
        try {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            intent.setFlags(268435456);
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            if (!bne0.h(context, intent)) {
                return false;
            }
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            CrashHelper.c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static rqi m21778d() {
        return C1178a.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public boolean m21779a(Context context) {
        if (!m21781e()) {
            return false;
        }
        boolean zMo15948a = this.f19949a.mo15948a(context);
        if (!zMo15948a) {
            try {
                Intent intent = new Intent("android.settings.SETTINGS");
                intent.setFlags(268435456);
                App.e.startActivity(intent);
                return true;
            } catch (Exception e) {
                CrashHelper.c(e);
                lsi0.y("开启失败，请前往系统设置页打开悬浮窗权限");
            }
        }
        return zMo15948a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m21780b(Context context) {
        return this.f19949a.mo15949b(context);
    }

    /* JADX INFO: renamed from: e */
    public boolean m21781e() {
        return this.f19949a.isSupported();
    }
}
