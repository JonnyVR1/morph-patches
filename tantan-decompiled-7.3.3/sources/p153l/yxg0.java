package p153l;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.pm.ConfigurationInfo;
import java.util.HashMap;
import tech.sud.runtime.p141a.C22517c;
import tech.sud.runtime.p141a.InterfaceC22515a;

/* JADX INFO: loaded from: classes.dex */
public final class yxg0 {

    /* JADX INFO: renamed from: h */
    public static geg0 f201968h;

    /* JADX INFO: renamed from: a */
    public final Activity f201969a;

    /* JADX INFO: renamed from: b */
    public final sxg0 f201970b;

    /* JADX INFO: renamed from: c */
    public C22517c f201971c;

    /* JADX INFO: renamed from: e */
    public HashMap f201973e = null;

    /* JADX INFO: renamed from: f */
    public geg0 f201974f = null;

    /* JADX INFO: renamed from: g */
    public final HashMap f201975g = new HashMap();

    /* JADX INFO: renamed from: d */
    public boolean f201972d = false;

    public yxg0(Activity activity) {
        this.f201969a = activity;
        sxg0 sxg0Var = new sxg0();
        this.f201970b = sxg0Var;
        sxg0Var.f171132a = true;
        sxg0Var.f171133b = false;
        sxg0Var.f171134c = activity.getFilesDir().getAbsolutePath();
        sxg0Var.f171135d = "";
        sxg0Var.f171136e = false;
        sxg0Var.f171137f = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m217713a(String str, String str2) {
        if (str.compareTo("runtime.LoadPath") == 0) {
            return;
        }
        if (this.f201973e == null) {
            this.f201973e = new HashMap();
        }
        this.f201973e.put(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public final void m217714b(String str, InterfaceC22515a.a aVar) {
        if (str.contains("|")) {
            ysg0.m217256b("function name (" + str + ") have illegal character");
            return;
        }
        if (this.f201972d) {
            this.f201971c.mo222831a(str, aVar);
        } else {
            this.f201975g.put(str, aVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m217715c() {
        ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) this.f201969a.getSystemService("activity")).getDeviceConfigurationInfo();
        String glEsVersion = deviceConfigurationInfo.getGlEsVersion();
        if (glEsVersion != null) {
            try {
                String[] strArrSplit = glEsVersion.split("\\.");
                int i = Integer.parseInt(strArrSplit[0]);
                int i2 = Integer.parseInt(strArrSplit[1]);
                if (i <= 2 && (i != 2 || i2 < 0)) {
                    ysg0.m217256b("checkGlEsVersion 第一次检测不通过，走后面逻辑，当前GlES主版本号为：" + i + " 次版本号为：" + i2);
                }
                return true;
            } catch (Exception e) {
                ysg0.m217256b("checkGlEsVersion 第一次判断报了错误，但不影响什么，内容是：" + ysg0.m217255a(e));
            }
        }
        boolean z = deviceConfigurationInfo.reqGlEsVersion >= 131072;
        if (!z) {
            ysg0.m217256b("checkGlEsVersion 检测出不支持，reqGlEsVersion值为：" + deviceConfigurationInfo.reqGlEsVersion);
        }
        return z;
    }
}
