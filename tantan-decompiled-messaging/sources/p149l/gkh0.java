package p149l;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.apibean.LiveClientSwitchesBean;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes13.dex */
public class gkh0 {
    /* JADX INFO: renamed from: a */
    public static nwv m126618a(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            sb.append(m126619b(str2));
        }
        nwv nwvVar = new nwv();
        nwvVar.f140978b = str;
        nwvVar.f140979c = sb.toString();
        return nwvVar;
    }

    /* JADX INFO: renamed from: b */
    public static String m126619b(String str) {
        if (str.startsWith("[")) {
            return str;
        }
        return "[" + str + Constants.AES_SUFFIX;
    }

    /* JADX INFO: renamed from: c */
    public static String m126620c(Application application) {
        return application.getFilesDir().getAbsolutePath();
    }

    /* JADX INFO: renamed from: d */
    public static void m126621d(Application application, LiveClientSwitchesBean.LiveSwitchConfig liveSwitchConfig, e2m e2mVar) {
        int i;
        int i2;
        int i3;
        hkh0.C17334a c17334aM131546y = hkh0.C17334a.m131546y();
        StringBuilder sb = new StringBuilder();
        sb.append(m126620c(application));
        String str = File.separator;
        sb.append(str);
        sb.append("liveTrace");
        sb.append(str);
        sb.append("cache");
        hkh0.C17334a c17334aM131554H = c17334aM131546y.m131565z(sb.toString()).m131554H(m126620c(application) + str + "liveTrace" + str + "report");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mu5.f135729C);
        sb2.append("/v2/live/realtime/logs");
        hkh0.C17334a c17334aM131558L = c17334aM131554H.m131556J(sb2.toString()).m131555I(ytr.m216073b("/live/realtime/client-monitor/logs")).m131558L(700);
        if (liveSwitchConfig == null || (i = liveSwitchConfig.logWriteWindowTime) <= 0) {
            i = 60;
        }
        hkh0.C17334a c17334aM131561O = c17334aM131558L.m131561O(i);
        if (liveSwitchConfig == null || (i2 = liveSwitchConfig.unitIntervalMaxRow) <= 0) {
            i2 = 500;
        }
        hkh0.C17334a c17334aM131559M = c17334aM131561O.m131560N(i2).m131559M((liveSwitchConfig == null || (i3 = liveSwitchConfig.logFileMaxSize) <= 0) ? 204800L : ((long) i3) * 1024);
        boolean z = false;
        hkh0.C17334a c17334aM131550D = c17334aM131559M.m131547A(false).m131552F(liveSwitchConfig != null && liveSwitchConfig.openPkLog).m131550D(liveSwitchConfig != null && liveSwitchConfig.openMutliCallLog);
        if (liveSwitchConfig != null && liveSwitchConfig.delExpireLogEnable.f44236on) {
            z = true;
        }
        m126622e(c17334aM131550D.m131548B(z).m131549C(liveSwitchConfig != null ? liveSwitchConfig.delExpireLogEnable.expireTime : 7).m131563w(new ixv()).m131563w(new k6j()).m131562v(new ywv()).m131557K(e2mVar).m131551E(liveSwitchConfig.liveLogOn).m131553G(liveSwitchConfig.quickChatLogOn).m131564x());
    }

    /* JADX INFO: renamed from: e */
    public static void m126622e(hkh0 hkh0Var) {
        fkh0.m121863i(hkh0Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m126623f(@NonNull String str, @NonNull String... strArr) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        fkh0.m121867m(m126618a(str, strArr));
        if (strArr.length > 0) {
            hfw.m130790a(strArr[0], str);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m126624g(@NonNull String str, @NonNull String... strArr) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        fkh0.m121868n(m126618a(str, strArr));
        if (strArr.length > 0) {
            hfw.m130790a(strArr[0], str);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m126625h() {
        fkh0.m121869o();
    }

    /* JADX INFO: renamed from: i */
    public static void m126626i() {
        fkh0.m121870p();
    }

    /* JADX INFO: renamed from: j */
    public static void m126627j(@NonNull String str, @NonNull String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        String strM126619b = m126619b(str);
        nwv nwvVar = new nwv();
        nwvVar.f140978b = str2;
        nwvVar.f140979c = strM126619b;
        fkh0.m121871q(nwvVar);
        hfw.m130790a(strM126619b, str2);
    }

    /* JADX INFO: renamed from: k */
    public static void m126628k(@NonNull String str, @NonNull String... strArr) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        fkh0.m121871q(m126618a(str, strArr));
        if (strArr.length > 0) {
            hfw.m130790a(strArr[0], str);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m126629l(String str, IllegalAccessException illegalAccessException) {
        StringWriter stringWriter = new StringWriter();
        illegalAccessException.printStackTrace(new PrintWriter(stringWriter));
        String strM126619b = m126619b(str);
        nwv nwvVar = new nwv(stringWriter.toString());
        nwvVar.f140979c = strM126619b;
        fkh0.m121871q(nwvVar);
        hfw.m130790a(strM126619b, stringWriter.toString());
    }
}
