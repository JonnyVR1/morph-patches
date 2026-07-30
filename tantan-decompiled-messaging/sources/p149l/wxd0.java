package p149l;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.CrashHelper;
import java.net.URLEncoder;
import java.util.Map;
import org.eclipse.jetty.http.HttpHeaderValues;

/* JADX INFO: loaded from: classes9.dex */
public class wxd0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m205982e(String str, String str2) {
        StringBuilder sb = new StringBuilder("https://affiliate.tantanapp.com/ads/tantanmedia/self-01?");
        sb.append("oaidMd5=" + ogw.m164284e(k200.m144241b()));
        sb.append("&ua=" + URLEncoder.encode(jkb0.m141841k()));
        sb.append("&idfaMd5=__IDFAMD5__&os=android");
        sb.append("&original=" + str);
        sb.append("&ts=" + (System.currentTimeMillis() / 1000));
        sb.append("&pid=" + CoreModule.f17545c.f19639e0.m169520na().publicId);
        sb.append("&app_type=" + str2);
        int i = 0;
        boolean z = false;
        while (i <= 2 && !z) {
            exc0 exc0VarExecute = null;
            try {
                try {
                    stc0.C20027a c20027aBasic = qib0.f154693H.basic();
                    c20027aBasic.m185889h("Content-Encoding", HttpHeaderValues.GZIP);
                    try {
                        exc0VarExecute = qib0.f154685D.mo144849a(c20027aBasic.m185898q(sb.toString()).m185887f().m185883b()).execute();
                    } catch (Exception unused) {
                        i++;
                    }
                    if (exc0VarExecute != null) {
                        int iM118609q = exc0VarExecute.m118609q();
                        if (iM118609q < 200 || iM118609q >= 300) {
                            i += 3;
                        } else {
                            z = true;
                        }
                    }
                } catch (Exception e) {
                    i++;
                    CrashHelper.m81296c(e);
                }
                t95.m187604b(exc0VarExecute);
            } catch (Throwable th) {
                t95.m187604b(exc0VarExecute);
                throw th;
            }
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        Map<String, String> mapM201098f = w2e0Var.m201098f();
        String str = mapM201098f.get("apkName");
        String str2 = mapM201098f.get("fallback");
        final String str3 = mapM201098f.get("appType");
        final String str4 = mapM201098f.get("original");
        e51.m114774y(new Runnable() { // from class: l.vxd0
            @Override // java.lang.Runnable
            public final void run() {
                wxd0.m205982e(str4, str3);
            }
        });
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=" + str));
        if (vwb.m200296J(App.f15369e.getPackageManager().queryIntentActivities(intent, 0))) {
            zvf0.m220371D("e_flow_third", null, j760.m140076a("original", str4), j760.m140076a("app_type", str3), j760.m140076a("download_channel", "browser"));
            return new Intent("android.intent.action.VIEW", Uri.parse(str2));
        }
        zvf0.m220371D("e_flow_third", null, j760.m140076a("original", str4), j760.m140076a("app_type", str3), j760.m140076a("download_channel", "market"));
        return intent;
    }
}
