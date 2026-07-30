package p149l;

import android.content.Context;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmutil.FileUtil;
import com.immomo.mmutil.task.C3804c;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.io.File;
import java.io.IOException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class y0f {

    /* JADX INFO: renamed from: a */
    private static String f195303a = "";

    /* JADX INFO: renamed from: l.y0f$a */
    public class C21273a extends ug2<Object> {
        public C21273a(Object obj) {
            super(obj);
        }

        @Override // p149l.ug2
        /* JADX INFO: renamed from: b */
        public void mo97996b(String str) {
            MDLog.m7389d("EnhanceInjectorUtils", "checkUpdate fail --> " + str);
        }

        @Override // p149l.ug2
        /* JADX INFO: renamed from: c */
        public void mo97997c(JSONObject jSONObject) throws Throwable {
            StringBuilder sb = new StringBuilder("checkUpdate suc --> ");
            sb.append(jSONObject != null ? jSONObject.toString() : "null");
            MDLog.m7389d("EnhanceInjectorUtils", sb.toString());
            y0f.m212120i();
        }
    }

    /* JADX INFO: renamed from: l.y0f$b */
    public class C21274b extends ug2<Object> {
        public C21274b(Object obj) {
            super(obj);
        }

        @Override // p149l.ug2
        /* JADX INFO: renamed from: b */
        public void mo97996b(String str) {
            MDLog.m7389d("EnhanceInjectorUtils", "checkUpdate fail --> " + str);
        }

        @Override // p149l.ug2
        /* JADX INFO: renamed from: c */
        public void mo97997c(JSONObject jSONObject) {
            StringBuilder sb = new StringBuilder("checkUpdate suc --> ");
            sb.append(jSONObject != null ? jSONObject.toString() : "null");
            MDLog.m7389d("EnhanceInjectorUtils", sb.toString());
        }
    }

    /* JADX INFO: renamed from: l.y0f$c */
    public class RunnableC21275c implements Runnable {
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            y0f.m212120i();
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m212113b() {
        return "";
    }

    /* JADX INFO: renamed from: c */
    public static String m212114c(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("[CL]")) {
            return null;
        }
        return str.substring(4);
    }

    /* JADX INFO: renamed from: d */
    private static String m212115d() {
        return m212118g() ? "https://test-s.immomo.com/fep/momo/m-fes-sdk/adr-mk-jssdk/index.js" : "https://s.immomo.com/fep/momo/m-fes-sdk/adr-mk-jssdk/index.js";
    }

    /* JADX INFO: renamed from: e */
    private static String m212116e(String str, String str2) {
        String strM197337c;
        h460 h460VarM217446q;
        try {
            v750 v750VarM214871t = yhw.m214862s().m214871t(str);
            if (v750VarM214871t != null && (h460VarM217446q = z750.m217446q((strM197337c = v750VarM214871t.m197337c()))) != null) {
                for (File file : new File(strM197337c + File.separator + h460VarM217446q.m129225f()).listFiles()) {
                    if (file.getName().contains(str2)) {
                        return file.getAbsolutePath();
                    }
                }
            }
            return null;
        } catch (IOException e) {
            MDLog.m7391e("EnhanceInjectorUtils", e.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m212117f(MKWebView mKWebView, String str) {
        String str2;
        if (mKWebView == null || mKWebView.m87089v0() || !mei.m154211q()) {
            return;
        }
        if (TextUtils.isEmpty(f195303a)) {
            MDLog.m7389d("LogTracker", "use default");
            C3804c.m18444d(1, new RunnableC21275c());
            str2 = "javascript:console.error=(function(func){return function(){var args=[].slice.call(arguments);if(!args||!args[0]||typeof(args[0])!=\"string\"){return}try{if(args[0].indexOf(\"[CL]\")===-1){args[0]=\"[CL]\"+args[0]}func.apply(console,args)}catch(err){console.error(\"[CL]console.error注入有问题，可忽略\")}}})(console.error);";
        } else {
            str2 = "javascript:" + f195303a;
            MDLog.m7389d("LogTracker", "use cache");
        }
        MDLog.m7389d("LogTracker", "inject enhance js in " + str);
        mKWebView.loadUrl(str2);
    }

    /* JADX INFO: renamed from: g */
    private static boolean m212118g() {
        WifiInfo connectionInfo;
        String ssid;
        try {
            Context context = ev0.f93300a;
            if (context == null) {
                return false;
            }
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager.isWifiEnabled() && (connectionInfo = wifiManager.getConnectionInfo()) != null && connectionInfo.getSupplicantState() == SupplicantState.COMPLETED && (ssid = connectionInfo.getSSID()) != null && ssid.length() != 0) {
                if (ssid.indexOf(34) == 0) {
                    ssid = ssid.substring(1);
                    int length = ssid.length() - 1;
                    if (ssid.lastIndexOf(34) == length) {
                        ssid = ssid.substring(0, length);
                    }
                }
                MDLog.m7389d("LogTracker", "当前 wifi: ".concat(ssid));
                return ssid.contains("Moji-Stage");
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m212119h() {
        MDLog.m7389d("EnhanceInjectorUtils", "prepareEnhanceJsSdkPackage ... ");
        yhw.m214862s().m214867j("1000597", m212115d(), new C21273a(new Object()));
        yhw.m214862s().m214867j("1000101", m212113b(), new C21274b(new Object()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static void m212120i() throws Throwable {
        try {
            String strM212116e = m212116e("1000597", "index.js");
            if (strM212116e == null || TextUtils.isEmpty(strM212116e)) {
                return;
            }
            File file = new File(strM212116e);
            if (file.exists()) {
                String strM18411h = FileUtil.m18411h(file);
                if (TextUtils.isEmpty(strM18411h)) {
                    strM18411h = f195303a;
                }
                f195303a = strM18411h;
                MDLog.m7389d("EnhanceInjectorUtils", "update enhance js --> " + f195303a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
