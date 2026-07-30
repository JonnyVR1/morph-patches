package p153l;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.tantanapp.beatles.nativecore.NativeHandler;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class je20 {

    /* JADX INFO: renamed from: a */
    public static vkq0 f120385a;

    /* JADX INFO: renamed from: b */
    public static Context f120386b;

    /* JADX INFO: renamed from: c */
    public static rrl f120387c = new C17932a();

    /* JADX INFO: renamed from: l.je20$a */
    public class C17932a implements rrl {
        @Override // p153l.rrl
        /* JADX INFO: renamed from: a */
        public void mo144518a(String str, String str2, boolean z, boolean z2, boolean z3, String str3) {
            du2.m118062v("[beatles][crash][native]", "sCrashCallback -> logPath = " + str + ", emergency = " + str2 + ", dumpJavaStacktrace = " + z + ", dumpAllJavaStacktrace = " + z2 + ", isMainThread = " + z3 + ", threadName = " + str3);
            if (nki.m163629l(str)) {
                if (TextUtils.isEmpty(str3)) {
                    str3 = BLiveTraceServerLocation.main;
                }
                if (z3) {
                    du2.m118034C(true);
                }
                if (z) {
                    nki.m163618a(str, "java stacktrace", xtb.m213047a(str3, z3, z2).getCrashStackTrace());
                }
                je20.m144515b(new File(str), false);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m144514a() {
        File[] fileArrListFiles;
        String strMo82291c = f120385a.mo82291c();
        f610.m124266d("check native crash check history:" + strMo82291c, new Object[0]);
        File file = new File(strMo82291c);
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    if (m144517d(file2)) {
                        m144515b(file2, true);
                    } else {
                        nki.m163623f(file2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m144515b(File file, boolean z) {
        if (!file.exists()) {
            f610.m124266d("file not found -> file = " + file, new Object[0]);
            return;
        }
        if (z) {
            du2.m118062v("[beatles][crash][native]", "found lost log:" + file.getAbsolutePath() + " size:" + file.length());
        } else {
            du2.m118062v("[beatles][crash][native]", "handleLog file exists:" + file.exists());
        }
        MonitorEvent monitorEvent = new MonitorEvent(f120385a.getEventType(), f120385a.mo82290a(), null);
        File file2 = new File(file.getParent(), f120385a.mo82290a() + ".dmp");
        file.renameTo(file2);
        monitorEvent.setCacheDir(f120385a.mo82291c() + "/" + monitorEvent.getEventId());
        monitorEvent.setEmergency(z ^ true);
        nki.m163630m(file2.getAbsolutePath(), monitorEvent.getCacheDir());
        f120385a.m108092j(monitorEvent);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m144516c(Context context, vkq0 vkq0Var, String str) {
        f120385a = vkq0Var;
        f120386b = context;
        int iM82348c = NativeHandler.m82346a().m82348c(context, vc60.m200788c(), vc60.m200791f());
        if (iM82348c != 0) {
            f610.m124264b("init common failed -> initCommon = " + iM82348c, new Object[0]);
            return false;
        }
        int iM82349d = NativeHandler.m82346a().m82349d(new ptb(), f120387c, str);
        if (iM82349d == 0) {
            f610.m124264b("init crash succeed!", new Object[0]);
            return true;
        }
        f610.m124264b("init crash failed -> initCrash = " + iM82349d, new Object[0]);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m144517d(File file) {
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
