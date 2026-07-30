package p153l;

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
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import com.tantanapp.beatles.utils.DeviceUtil;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: l.g1 */
/* JADX INFO: loaded from: classes11.dex */
public class C17113g1 {

    /* JADX INFO: renamed from: a */
    public static long f101698a = 15000;

    /* JADX INFO: renamed from: b */
    public static C17614i1 f101699b;

    /* JADX INFO: renamed from: c */
    public static Context f101700c;

    /* JADX INFO: renamed from: d */
    public static ktb f101701d;

    /* JADX INFO: renamed from: e */
    public static zol f101702e = new a();

    /* JADX INFO: renamed from: l.g1$a */
    public class a implements zol {
        @Override // p153l.zol
        /* JADX INFO: renamed from: a */
        public void mo128485a(String str, String str2) {
            Throwable th;
            du2.m118062v("[beatles][crash][anr]", "sAnrCallback -> logPath = " + str + ", emergency = " + str2);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ActivityManager.ProcessErrorStateInfo processErrorStateInfoM200789d = vc60.m200789d(C17113g1.f101700c, C17113g1.f101698a);
            if (processErrorStateInfoM200789d == null) {
                nki.m163623f(new File(str));
                return;
            }
            nki.m163618a(str, "anr short msg", processErrorStateInfoM200789d.shortMsg + SignParameters.NEW_LINE);
            nki.m163618a(str, "anr log msg", processErrorStateInfoM200789d.longMsg + SignParameters.NEW_LINE);
            nki.m163618a(str, "memory info", DeviceUtil.m82398h());
            String str3 = "";
            try {
                Map<String, String> mapM82353c = NativeLogParser.m82353c(new File(str));
                if (mapM82353c.containsKey("mainThread")) {
                    str3 = mapM82353c.get("mainThread");
                }
            } catch (IOException unused) {
            }
            if (TextUtils.isEmpty(str3)) {
                th = new Throwable(processErrorStateInfoM200789d.shortMsg);
                th.setStackTrace(Looper.getMainLooper().getThread().getStackTrace());
            } else {
                th = null;
            }
            C17113g1.m128481e(new File(str), th, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m128480d() {
        File[] fileArrListFiles;
        String strMo82291c = f101699b.mo82291c();
        f610.m124266d("check anr monitor check history:" + strMo82291c, new Object[0]);
        File file = new File(strMo82291c);
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    String name = file2.getName();
                    if (name.startsWith("tombstone_") && name.endsWith(".trace.xcrash")) {
                        if (name.split(".trace.xcrash")[0].endsWith(Process.myPid() + "")) {
                            if (m128483g(file2)) {
                                m128484h(file2);
                            } else {
                                nki.m163623f(file2);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m128481e(File file, Throwable th, boolean z) {
        String strMo82294f;
        du2.m118062v("[beatles][crash][anr]", "anr detected file exists:" + file.exists());
        if (!file.exists()) {
            du2.m118062v("[beatles][crash][anr]", "file not found -> file = " + file);
            return;
        }
        MonitorEvent monitorEvent = new MonitorEvent(f101699b.getEventType(), f101699b.mo82290a(), th);
        if (th != null) {
            monitorEvent.setCrashThread(Looper.getMainLooper().getThread());
        }
        File file2 = new File(file.getParent(), f101699b.mo82290a() + ".dmp");
        file.renameTo(file2);
        monitorEvent.setCacheDir(f101699b.mo82291c() + "/" + monitorEvent.getEventId());
        nki.m163630m(file2.getAbsolutePath(), monitorEvent.getCacheDir());
        if (!z) {
            c610 c610VarM118052l = du2.m118052l("block");
            if (c610VarM118052l != null && (strMo82294f = c610VarM118052l.mo82294f()) != null) {
                monitorEvent.setExtra("msgInfo", new GsonBuilder().setPrettyPrinting().create().toJson(new JsonParser().parse(strMo82294f)));
            }
            if (f101701d.m151345d().size() > 0) {
                monitorEvent.setExtra("cpuScheduler", f101701d.m151345d() + "");
            }
        }
        f101699b.m108092j(monitorEvent);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m128482f(Context context, C17614i1 c17614i1, String str) {
        f101700c = context;
        f101699b = c17614i1;
        int iM82348c = NativeHandler.m82346a().m82348c(context, vc60.m200788c(), vc60.m200791f());
        if (iM82348c != 0) {
            f610.m124264b("init common failed -> initCommon = " + iM82348c, new Object[0]);
            return false;
        }
        int iM82347b = NativeHandler.m82346a().m82347b(new et0(), f101702e, str);
        if (iM82347b != 0) {
            f610.m124264b("init anr failed -> initAnr = " + iM82347b, new Object[0]);
            return false;
        }
        f610.m124264b("init anr succeed!", new Object[0]);
        ktb ktbVar = new ktb();
        f101701d = ktbVar;
        ktbVar.m151347f();
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m128483g(File file) {
        try {
            return NativeLogParser.m82353c(file).containsKey("anr short msg");
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m128484h(File file) {
        f610.m124264b("[anr] found lost log:" + file.getAbsolutePath(), new Object[0]);
        m128481e(file, null, true);
    }
}
