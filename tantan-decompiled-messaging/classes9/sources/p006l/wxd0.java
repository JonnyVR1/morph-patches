package p006l;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import java.net.URLEncoder;
import java.util.Map;
import l.e51;
import l.exc0;
import l.f30;
import l.j760;
import l.ogw;
import l.stc0;
import l.t95;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class wxd0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m26859e(String str, String str2) {
        StringBuilder sb = new StringBuilder("https://affiliate.tantanapp.com/ads/tantanmedia/self-01?");
        sb.append("oaidMd5=" + ogw.e(k200.m17914b()));
        sb.append("&ua=" + URLEncoder.encode(jkb0.m17502k()));
        sb.append("&idfaMd5=__IDFAMD5__&os=android");
        sb.append("&original=" + str);
        sb.append("&ts=" + (System.currentTimeMillis() / 1000));
        sb.append("&pid=" + CoreModule.f1534c.f3628e0.m21483na().publicId);
        sb.append("&app_type=" + str2);
        int i = 0;
        boolean z = false;
        while (i <= 2 && !z) {
            exc0 exc0VarExecute = null;
            try {
                try {
                    stc0.a aVarBasic = qib0.f19784H.basic();
                    aVarBasic.h("Content-Encoding", "gzip");
                    try {
                        exc0VarExecute = qib0.f19776D.a(aVarBasic.q(sb.toString()).f().b()).execute();
                    } catch (Exception unused) {
                        i++;
                    }
                    if (exc0VarExecute != null) {
                        int iQ = exc0VarExecute.q();
                        if (iQ < 200 || iQ >= 300) {
                            i += 3;
                        } else {
                            z = true;
                        }
                    }
                } catch (Exception e) {
                    i++;
                    CrashHelper.c(e);
                }
                t95.b(exc0VarExecute);
            } catch (Throwable th) {
                t95.b(exc0VarExecute);
                throw th;
            }
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        Map<String, String> mapM26160f = w2e0Var.m26160f();
        String str = mapM26160f.get("apkName");
        String str2 = mapM26160f.get("fallback");
        final String str3 = mapM26160f.get("appType");
        final String str4 = mapM26160f.get("original");
        e51.y(new Runnable() { // from class: l.vxd0
            @Override // java.lang.Runnable
            public final void run() {
                wxd0.m26859e(str4, str3);
            }
        });
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=" + str));
        if (vwb.J(App.e.getPackageManager().queryIntentActivities(intent, 0))) {
            zvf0.D("e_flow_third", (String) null, new j760[]{j760.a("original", str4), j760.a("app_type", str3), j760.a("download_channel", "browser")});
            return new Intent("android.intent.action.VIEW", Uri.parse(str2));
        }
        zvf0.D("e_flow_third", (String) null, new j760[]{j760.a("original", str4), j760.a("app_type", str3), j760.a("download_channel", "market")});
        return intent;
    }
}
