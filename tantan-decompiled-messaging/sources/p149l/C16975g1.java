package p149l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.tantanapp.beatles.nativecore.NativeHandler;
import com.tantanapp.beatles.nativecore.NativeLogParser;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import com.tantanapp.beatles.utils.DeviceUtil;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: l.g1 */
/* JADX INFO: loaded from: classes13.dex */
public class C16975g1 {

    /* JADX INFO: renamed from: a */
    public static long f100105a = 15000;

    /* JADX INFO: renamed from: b */
    public static C17458i1 f100106b;

    /* JADX INFO: renamed from: c */
    public static Context f100107c;

    /* JADX INFO: renamed from: d */
    public static wrb f100108d;

    /* JADX INFO: renamed from: e */
    public static nml f100109e = new a();

    /* JADX INFO: renamed from: l.g1$a */
    public class a implements nml {
        @Override // p149l.nml
        /* JADX INFO: renamed from: a */
        public void mo124041a(String str, String str2) {
            Throwable th;
            nt2.m160831v("[beatles][crash][anr]", "sAnrCallback -> logPath = " + str + ", emergency = " + str2);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ActivityManager.ProcessErrorStateInfo processErrorStateInfoM167368d = p460.m167368d(C16975g1.f100107c, C16975g1.f100105a);
            if (processErrorStateInfoM167368d == null) {
                qhi.m174545f(new File(str));
                return;
            }
            qhi.m174540a(str, "anr short msg", processErrorStateInfoM167368d.shortMsg + SignParameters.NEW_LINE);
            qhi.m174540a(str, "anr log msg", processErrorStateInfoM167368d.longMsg + SignParameters.NEW_LINE);
            qhi.m174540a(str, "memory info", DeviceUtil.m81215h());
            String str3 = "";
            try {
                Map<String, String> mapM81170c = NativeLogParser.m81170c(new File(str));
                if (mapM81170c.containsKey("mainThread")) {
                    str3 = mapM81170c.get("mainThread");
                }
            } catch (IOException unused) {
            }
            if (TextUtils.isEmpty(str3)) {
                th = new Throwable(processErrorStateInfoM167368d.shortMsg);
                th.setStackTrace(Looper.getMainLooper().getThread().getStackTrace());
            } else {
                th = null;
            }
            C16975g1.m124037e(new File(str), th, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m124036d() {
        File[] fileArrListFiles;
        String strMo81108c = f100106b.mo81108c();
        vx00.m200474d("check anr monitor check history:" + strMo81108c, new Object[0]);
        File file = new File(strMo81108c);
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    String name = file2.getName();
                    if (name.startsWith("tombstone_") && name.endsWith(".trace.xcrash")) {
                        if (name.split(".trace.xcrash")[0].endsWith(Process.myPid() + "")) {
                            if (m124039g(file2)) {
                                m124040h(file2);
                            } else {
                                qhi.m174545f(file2);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m124037e(File file, Throwable th, boolean z) {
        String strMo81111f;
        nt2.m160831v("[beatles][crash][anr]", "anr detected file exists:" + file.exists());
        if (!file.exists()) {
            nt2.m160831v("[beatles][crash][anr]", "file not found -> file = " + file);
            return;
        }
        MonitorEvent monitorEvent = new MonitorEvent(f100106b.getEventType(), f100106b.mo81107a(), th);
        if (th != null) {
            monitorEvent.setCrashThread(Looper.getMainLooper().getThread());
        }
        File file2 = new File(file.getParent(), f100106b.mo81107a() + ".dmp");
        file.renameTo(file2);
        monitorEvent.setCacheDir(f100106b.mo81108c() + "/" + monitorEvent.getEventId());
        qhi.m174552m(file2.getAbsolutePath(), monitorEvent.getCacheDir());
        if (!z) {
            sx00 sx00VarM160821l = nt2.m160821l("block");
            if (sx00VarM160821l != null && (strMo81111f = sx00VarM160821l.mo81111f()) != null) {
                monitorEvent.setExtra("msgInfo", new GsonBuilder().setPrettyPrinting().create().toJson(new JsonParser().parse(strMo81111f)));
            }
            if (f100108d.m205172d().size() > 0) {
                monitorEvent.setExtra("cpuScheduler", f100108d.m205172d() + "");
            }
        }
        f100106b.m186395j(monitorEvent);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m124038f(Context context, C17458i1 c17458i1, String str) {
        f100107c = context;
        f100106b = c17458i1;
        int iM81165c = NativeHandler.m81163a().m81165c(context, p460.m167367c(), p460.m167370f());
        if (iM81165c != 0) {
            vx00.m200472b("init common failed -> initCommon = " + iM81165c, new Object[0]);
            return false;
        }
        int iM81164b = NativeHandler.m81163a().m81164b(new zs0(), f100109e, str);
        if (iM81164b != 0) {
            vx00.m200472b("init anr failed -> initAnr = " + iM81164b, new Object[0]);
            return false;
        }
        vx00.m200472b("init anr succeed!", new Object[0]);
        wrb wrbVar = new wrb();
        f100108d = wrbVar;
        wrbVar.m205174f();
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m124039g(File file) {
        try {
            return NativeLogParser.m81170c(file).containsKey("anr short msg");
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m124040h(File file) {
        vx00.m200472b("[anr] found lost log:" + file.getAbsolutePath(), new Object[0]);
        m124037e(file, null, true);
    }
}
