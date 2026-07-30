package p149l;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.p046p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public class k200 {

    /* JADX INFO: renamed from: a */
    public static final uqd0 f120676a = new uqd0("miit_oaid", "", false);

    /* JADX INFO: renamed from: b */
    public static final i200 f120677b = new i200();

    /* JADX INFO: renamed from: c */
    public static final boolean f120678c = m144243d();

    /* JADX INFO: renamed from: d */
    public static String f120679d = "none";

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f120680e = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    public static String m144241b() {
        String str = f120676a.get();
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        i200 i200Var = f120677b;
        if (TextUtils.isEmpty(i200Var.f110529a)) {
            zvf0.m220371D("e_request_none_oaid", "", vwb.m200311Y(NotificationCompat.CATEGORY_STATUS, f120679d));
            if (!f120678c) {
                e51.m114774y(new Runnable() { // from class: l.j200
                    @Override // java.lang.Runnable
                    public final void run() {
                        k200.m144242c(App.f15369e);
                    }
                });
            }
        }
        return i200Var.f110529a;
    }

    /* JADX INFO: renamed from: c */
    public static void m144242c(Context context) {
        if (context == null) {
            return;
        }
        if (f120678c) {
            f120679d = "uninit";
            return;
        }
        f120679d = "init";
        uqd0 uqd0Var = new uqd0("miit_control", "", true);
        String str = uqd0Var.get();
        if ((TextUtils.isEmpty(str) || "end".equals(str)) && f120680e.compareAndSet(false, true)) {
            uqd0Var.put("start");
            try {
                f120677b.m134040a(context);
            } catch (Throwable th) {
                if ("windows".equalsIgnoreCase(Build.BRAND)) {
                    return;
                }
                uqd0 uqd0Var2 = new uqd0("miit_report_error_app_version", "", false);
                if (!qib0.f154730s.equals(uqd0Var2.get())) {
                    uqd0Var2.put(qib0.f154730s);
                    CrashHelper.m81296c(th);
                }
            }
            uqd0Var.put("end");
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m144243d() {
        return bne0.m102781j() && Build.VERSION.SDK_INT < 26;
    }
}
