package p149l;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.tantanapp.beatles.nativecore.NativeHandler;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class b620 {

    /* JADX INFO: renamed from: a */
    public static qbq0 f73737a;

    /* JADX INFO: renamed from: b */
    public static Context f73738b;

    /* JADX INFO: renamed from: c */
    public static fpl f73739c = new C15815a();

    /* JADX INFO: renamed from: l.b620$a */
    public class C15815a implements fpl {
        @Override // p149l.fpl
        /* JADX INFO: renamed from: a */
        public void mo100390a(String str, String str2, boolean z, boolean z2, boolean z3, String str3) {
            nt2.m160831v("[beatles][crash][native]", "sCrashCallback -> logPath = " + str + ", emergency = " + str2 + ", dumpJavaStacktrace = " + z + ", dumpAllJavaStacktrace = " + z2 + ", isMainThread = " + z3 + ", threadName = " + str3);
            if (qhi.m174551l(str)) {
                if (TextUtils.isEmpty(str3)) {
                    str3 = BLiveTraceServerLocation.main;
                }
                if (z3) {
                    nt2.m160803C(true);
                }
                if (z) {
                    qhi.m174540a(str, "java stacktrace", jsb.m143008a(str3, z3, z2).getCrashStackTrace());
                }
                b620.m100387b(new File(str), false);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m100386a() {
        File[] fileArrListFiles;
        String strMo81108c = f73737a.mo81108c();
        vx00.m200474d("check native crash check history:" + strMo81108c, new Object[0]);
        File file = new File(strMo81108c);
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    if (m100389d(file2)) {
                        m100387b(file2, true);
                    } else {
                        qhi.m174545f(file2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m100387b(File file, boolean z) {
        if (!file.exists()) {
            vx00.m200474d("file not found -> file = " + file, new Object[0]);
            return;
        }
        if (z) {
            nt2.m160831v("[beatles][crash][native]", "found lost log:" + file.getAbsolutePath() + " size:" + file.length());
        } else {
            nt2.m160831v("[beatles][crash][native]", "handleLog file exists:" + file.exists());
        }
        MonitorEvent monitorEvent = new MonitorEvent(f73737a.getEventType(), f73737a.mo81107a(), null);
        File file2 = new File(file.getParent(), f73737a.mo81107a() + ".dmp");
        file.renameTo(file2);
        monitorEvent.setCacheDir(f73737a.mo81108c() + "/" + monitorEvent.getEventId());
        monitorEvent.setEmergency(z ^ true);
        qhi.m174552m(file2.getAbsolutePath(), monitorEvent.getCacheDir());
        f73737a.m186395j(monitorEvent);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m100388c(Context context, qbq0 qbq0Var, String str) {
        f73737a = qbq0Var;
        f73738b = context;
        int iM81165c = NativeHandler.m81163a().m81165c(context, p460.m167367c(), p460.m167370f());
        if (iM81165c != 0) {
            vx00.m200472b("init common failed -> initCommon = " + iM81165c, new Object[0]);
            return false;
        }
        int iM81166d = NativeHandler.m81163a().m81166d(new bsb(), f73739c, str);
        if (iM81166d == 0) {
            vx00.m200472b("init crash succeed!", new Object[0]);
            return true;
        }
        vx00.m200472b("init crash failed -> initCrash = " + iM81166d, new Object[0]);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m100389d(File file) {
        if (file.length() == 0) {
            return false;
        }
        String name = file.getName();
        if (!name.startsWith("tombstone_") || !name.endsWith(".native.xcrash")) {
            return false;
        }
        String str = name.split(".native.xcrash")[0];
        StringBuilder sb = new StringBuilder();
        sb.append(Process.myPid());
        sb.append("");
        return !str.endsWith(sb.toString());
    }
}
