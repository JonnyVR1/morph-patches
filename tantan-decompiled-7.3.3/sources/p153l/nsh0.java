package p153l;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.apibean.LiveClientSwitchesBean;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes13.dex */
public class nsh0 {
    /* JADX INFO: renamed from: a */
    public static nyv m164599a(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            sb.append(m164600b(str2));
        }
        nyv nyvVar = new nyv();
        nyvVar.f144357b = str;
        nyvVar.f144358c = sb.toString();
        return nyvVar;
    }

    /* JADX INFO: renamed from: b */
    public static String m164600b(String str) {
        if (str.startsWith("[")) {
            return str;
        }
        return "[" + str + Constants.AES_SUFFIX;
    }

    /* JADX INFO: renamed from: c */
    public static String m164601c(Application application) {
        return application.getFilesDir().getAbsolutePath();
    }

    /* JADX INFO: renamed from: d */
    public static void m164602d(Application application, LiveClientSwitchesBean.LiveSwitchConfig liveSwitchConfig, x4m x4mVar) {
        int i;
        int i2;
        int i3;
        osh0.C19204a c19204aM169030y = osh0.C19204a.m169030y();
        StringBuilder sb = new StringBuilder();
        sb.append(m164601c(application));
        String str = File.separator;
        sb.append(str);
        sb.append("liveTrace");
        sb.append(str);
        sb.append("cache");
        osh0.C19204a c19204aM169038H = c19204aM169030y.m169049z(sb.toString()).m169038H(m164601c(application) + str + "liveTrace" + str + "report");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(qv5.f159693C);
        sb2.append("/v2/live/realtime/logs");
        osh0.C19204a c19204aM169042L = c19204aM169038H.m169040J(sb2.toString()).m169039I(zvr.m221802b("/live/realtime/client-monitor/logs")).m169042L(700);
        if (liveSwitchConfig == null || (i = liveSwitchConfig.logWriteWindowTime) <= 0) {
            i = 60;
        }
        osh0.C19204a c19204aM169045O = c19204aM169042L.m169045O(i);
        if (liveSwitchConfig == null || (i2 = liveSwitchConfig.unitIntervalMaxRow) <= 0) {
            i2 = 500;
        }
        osh0.C19204a c19204aM169043M = c19204aM169045O.m169044N(i2).m169043M((liveSwitchConfig == null || (i3 = liveSwitchConfig.logFileMaxSize) <= 0) ? 204800L : ((long) i3) * 1024);
        boolean z = false;
        osh0.C19204a c19204aM169034D = c19204aM169043M.m169031A(false).m169036F(liveSwitchConfig != null && liveSwitchConfig.openPkLog).m169034D(liveSwitchConfig != null && liveSwitchConfig.openMutliCallLog);
        if (liveSwitchConfig != null && liveSwitchConfig.delExpireLogEnable.f45084on) {
            z = true;
        }
        m164603e(c19204aM169034D.m169032B(z).m169033C(liveSwitchConfig != null ? liveSwitchConfig.delExpireLogEnable.expireTime : 7).m169047w(new hzv()).m169047w(new e9j()).m169046v(new xyv()).m169041K(x4mVar).m169035E(liveSwitchConfig.liveLogOn).m169037G(liveSwitchConfig.quickChatLogOn).m169048x());
    }

    /* JADX INFO: renamed from: e */
    public static void m164603e(osh0 osh0Var) {
        msh0.m159794i(osh0Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m164604f(@NonNull String str, @NonNull String... strArr) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        msh0.m159798m(m164599a(str, strArr));
        if (strArr.length > 0) {
            fhw.m125605a(strArr[0], str);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m164605g(@NonNull String str, @NonNull String... strArr) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        msh0.m159799n(m164599a(str, strArr));
        if (strArr.length > 0) {
            fhw.m125605a(strArr[0], str);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m164606h() {
        msh0.m159800o();
    }

    /* JADX INFO: renamed from: i */
    public static void m164607i() {
        msh0.m159801p();
    }

    /* JADX INFO: renamed from: j */
    public static void m164608j(@NonNull String str, @NonNull String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        String strM164600b = m164600b(str);
        nyv nyvVar = new nyv();
        nyvVar.f144357b = str2;
        nyvVar.f144358c = strM164600b;
        msh0.m159802q(nyvVar);
        fhw.m125605a(strM164600b, str2);
    }

    /* JADX INFO: renamed from: k */
    public static void m164609k(@NonNull String str, @NonNull String... strArr) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        msh0.m159802q(m164599a(str, strArr));
        if (strArr.length > 0) {
            fhw.m125605a(strArr[0], str);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m164610l(String str, IllegalAccessException illegalAccessException) {
        StringWriter stringWriter = new StringWriter();
        illegalAccessException.printStackTrace(new PrintWriter(stringWriter));
        String strM164600b = m164600b(str);
        nyv nyvVar = new nyv(stringWriter.toString());
        nyvVar.f144358c = strM164600b;
        msh0.m159802q(nyvVar);
        fhw.m125605a(strM164600b, stringWriter.toString());
    }
}
