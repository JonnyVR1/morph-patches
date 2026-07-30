package p006l;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.AccountMakeupPageAdapter;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import l.bne0;
import l.e51;
import l.j760;
import l.uqd0;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class k200 {

    /* JADX INFO: renamed from: a */
    public static final uqd0 f15551a = new uqd0("miit_oaid", "", false);

    /* JADX INFO: renamed from: b */
    public static final i200 f15552b = new i200();

    /* JADX INFO: renamed from: c */
    public static final boolean f15553c = m17916d();

    /* JADX INFO: renamed from: d */
    public static String f15554d = AccountMakeupPageAdapter.MakeupItem.NONE;

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f15555e = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    public static String m17914b() {
        String str = (String) f15551a.get();
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        i200 i200Var = f15552b;
        if (TextUtils.isEmpty(i200Var.f14203a)) {
            zvf0.D("e_request_none_oaid", "", new j760[]{vwb.Y("status", f15554d)});
            if (!f15553c) {
                e51.y(new Runnable() { // from class: l.j200
                    @Override // java.lang.Runnable
                    public final void run() {
                        k200.m17915c(App.e);
                    }
                });
            }
        }
        return i200Var.f14203a;
    }

    /* JADX INFO: renamed from: c */
    public static void m17915c(Context context) {
        if (context == null) {
            return;
        }
        if (f15553c) {
            f15554d = "uninit";
            return;
        }
        f15554d = "init";
        uqd0 uqd0Var = new uqd0("miit_control", "", true);
        String str = (String) uqd0Var.get();
        if ((TextUtils.isEmpty(str) || "end".equals(str)) && f15555e.compareAndSet(false, true)) {
            uqd0Var.put("start");
            try {
                f15552b.m16460a(context);
            } catch (Throwable th) {
                if ("windows".equalsIgnoreCase(Build.BRAND)) {
                    return;
                }
                uqd0 uqd0Var2 = new uqd0("miit_report_error_app_version", "", false);
                if (!qib0.f19821s.equals(uqd0Var2.get())) {
                    uqd0Var2.put(qib0.f19821s);
                    CrashHelper.c(th);
                }
            }
            uqd0Var.put("end");
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m17916d() {
        return bne0.j() && Build.VERSION.SDK_INT < 26;
    }
}
