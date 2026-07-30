package p153l;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.CrashHelper;
import java.net.URLEncoder;
import java.util.Map;
import org.eclipse.jetty.http.HttpHeaderValues;

/* JADX INFO: loaded from: classes9.dex */
public class a6e0 extends o5e0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m96324e(String str, String str2) {
        StringBuilder sb = new StringBuilder("https://affiliate.tantanapp.com/ads/tantanmedia/self-01?");
        sb.append("oaidMd5=" + niw.m163315e(hb00.m134333b()));
        sb.append("&ua=" + URLEncoder.encode(nsb0.m164577k()));
        sb.append("&idfaMd5=__IDFAMD5__&os=android");
        sb.append("&original=" + str);
        sb.append("&ts=" + (System.currentTimeMillis() / 1000));
        sb.append("&pid=" + CoreModule.f18264c.f20381e0.m116593na().publicId);
        sb.append("&app_type=" + str2);
        int i = 0;
        boolean z = false;
        while (i <= 2 && !z) {
            i5d0 i5d0VarExecute = null;
            try {
                try {
                    x1d0.C21228a c21228aBasic = uqb0.f180376H.basic();
                    c21228aBasic.m209034h("Content-Encoding", HttpHeaderValues.GZIP);
                    try {
                        i5d0VarExecute = uqb0.f180368D.mo181341a(c21228aBasic.m209043q(sb.toString()).m209032f().m209028b()).execute();
                    } catch (Exception unused) {
                        i++;
                    }
                    if (i5d0VarExecute != null) {
                        int iM138673q = i5d0VarExecute.m138673q();
                        if (iM138673q < 200 || iM138673q >= 300) {
                            i += 3;
                        } else {
                            z = true;
                        }
                    }
                } catch (Exception e) {
                    i++;
                    CrashHelper.m82479c(e);
                }
                ua5.m195158b(i5d0VarExecute);
            } catch (Throwable th) {
                ua5.m195158b(i5d0VarExecute);
                throw th;
            }
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        Map<String, String> mapM96743f = abe0Var.m96743f();
        String str = mapM96743f.get("apkName");
        String str2 = mapM96743f.get("fallback");
        final String str3 = mapM96743f.get("appType");
        final String str4 = mapM96743f.get("original");
        l51.m152919y(new Runnable() { // from class: l.z5e0
            @Override // java.lang.Runnable
            public final void run() {
                a6e0.m96324e(str4, str3);
            }
        });
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=" + str));
        if (jyb.m147479J(App.f16088e.getPackageManager().queryIntentActivities(intent, 0))) {
            i4g0.m138495D("e_flow_third", null, pf60.m172085a("original", str4), pf60.m172085a("app_type", str3), pf60.m172085a("download_channel", "browser"));
            return new Intent("android.intent.action.VIEW", Uri.parse(str2));
        }
        i4g0.m138495D("e_flow_third", null, pf60.m172085a("original", str4), pf60.m172085a("app_type", str3), pf60.m172085a("download_channel", "market"));
        return intent;
    }
}
