package p153l;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public class hb00 {

    /* JADX INFO: renamed from: a */
    public static final wyd0 f108549a = new wyd0("miit_oaid", "", false);

    /* JADX INFO: renamed from: b */
    public static final fb00 f108550b = new fb00();

    /* JADX INFO: renamed from: c */
    public static final boolean f108551c = m134335d();

    /* JADX INFO: renamed from: d */
    public static String f108552d = "none";

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f108553e = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    public static String m134333b() {
        String str = f108549a.get();
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        fb00 fb00Var = f108550b;
        if (TextUtils.isEmpty(fb00Var.f98029a)) {
            i4g0.m138495D("e_request_none_oaid", "", jyb.m147494Y(NotificationCompat.CATEGORY_STATUS, f108552d));
            if (!f108551c) {
                l51.m152919y(new Runnable() { // from class: l.gb00
                    @Override // java.lang.Runnable
                    public final void run() {
                        hb00.m134334c(App.f16088e);
                    }
                });
            }
        }
        return fb00Var.f98029a;
    }

    /* JADX INFO: renamed from: c */
    public static void m134334c(Context context) {
        if (context == null) {
            return;
        }
        if (f108551c) {
            f108552d = "uninit";
            return;
        }
        f108552d = "init";
        wyd0 wyd0Var = new wyd0("miit_control", "", true);
        String str = wyd0Var.get();
        if ((TextUtils.isEmpty(str) || "end".equals(str)) && f108553e.compareAndSet(false, true)) {
            wyd0Var.put("start");
            try {
                f108550b.m124813a(context);
            } catch (Throwable th) {
                if ("windows".equalsIgnoreCase(Build.BRAND)) {
                    return;
                }
                wyd0 wyd0Var2 = new wyd0("miit_report_error_app_version", "", false);
                if (!uqb0.f180413s.equals(wyd0Var2.get())) {
                    wyd0Var2.put(uqb0.f180413s);
                    CrashHelper.m82479c(th);
                }
            }
            wyd0Var.put("end");
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m134335d() {
        return ive0.m142296j() && Build.VERSION.SDK_INT < 26;
    }
}
