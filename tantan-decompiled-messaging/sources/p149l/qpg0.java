package p149l;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.pm.ConfigurationInfo;
import java.util.HashMap;
import tech.sud.runtime.p137a.C22402c;
import tech.sud.runtime.p137a.InterfaceC22400a;

/* JADX INFO: loaded from: classes.dex */
public final class qpg0 {

    /* JADX INFO: renamed from: h */
    public static y5g0 f155748h;

    /* JADX INFO: renamed from: a */
    public final Activity f155749a;

    /* JADX INFO: renamed from: b */
    public final kpg0 f155750b;

    /* JADX INFO: renamed from: c */
    public C22402c f155751c;

    /* JADX INFO: renamed from: e */
    public HashMap f155753e = null;

    /* JADX INFO: renamed from: f */
    public y5g0 f155754f = null;

    /* JADX INFO: renamed from: g */
    public final HashMap f155755g = new HashMap();

    /* JADX INFO: renamed from: d */
    public boolean f155752d = false;

    public qpg0(Activity activity) {
        this.f155749a = activity;
        kpg0 kpg0Var = new kpg0();
        this.f155750b = kpg0Var;
        kpg0Var.f124146a = true;
        kpg0Var.f124147b = false;
        kpg0Var.f124148c = activity.getFilesDir().getAbsolutePath();
        kpg0Var.f124149d = "";
        kpg0Var.f124150e = false;
        kpg0Var.f124151f = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m175836a(String str, String str2) {
        if (str.compareTo("runtime.LoadPath") == 0) {
            return;
        }
        if (this.f155753e == null) {
            this.f155753e = new HashMap();
        }
        this.f155753e.put(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public final void m175837b(String str, InterfaceC22400a.a aVar) {
        if (str.contains("|")) {
            qkg0.m175376b("function name (" + str + ") have illegal character");
            return;
        }
        if (this.f155752d) {
            this.f155751c.mo221585a(str, aVar);
        } else {
            this.f155755g.put(str, aVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m175838c() {
        ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) this.f155749a.getSystemService("activity")).getDeviceConfigurationInfo();
        String glEsVersion = deviceConfigurationInfo.getGlEsVersion();
        if (glEsVersion != null) {
            try {
                String[] strArrSplit = glEsVersion.split("\\.");
                int i = Integer.parseInt(strArrSplit[0]);
                int i2 = Integer.parseInt(strArrSplit[1]);
                if (i <= 2 && (i != 2 || i2 < 0)) {
                    qkg0.m175376b("checkGlEsVersion 第一次检测不通过，走后面逻辑，当前GlES主版本号为：" + i + " 次版本号为：" + i2);
                }
                return true;
            } catch (Exception e) {
                qkg0.m175376b("checkGlEsVersion 第一次判断报了错误，但不影响什么，内容是：" + qkg0.m175375a(e));
            }
        }
        boolean z = deviceConfigurationInfo.reqGlEsVersion >= 131072;
        if (!z) {
            qkg0.m175376b("checkGlEsVersion 检测出不支持，reqGlEsVersion值为：" + deviceConfigurationInfo.reqGlEsVersion);
        }
        return z;
    }
}
