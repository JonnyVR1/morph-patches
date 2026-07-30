package p149l;

import android.os.Process;
import android.text.TextUtils;
import com.tantanapp.beatles.nativecore.NativeLogParser;
import com.tantanapp.beatles.p072v2.data.App;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public abstract class z520 implements g4f {

    /* JADX INFO: renamed from: a */
    public Map<String, String> f201747a;

    @Override // p149l.g4f
    /* JADX INFO: renamed from: a */
    public void mo81120a(MonitorEvent monitorEvent) {
        try {
            Map<String, String> mapM81170c = NativeLogParser.m81170c(new File(monitorEvent.getCacheDir() + "/" + monitorEvent.getSubEventType() + ".dmp"));
            this.f201747a = mapM81170c;
            monitorEvent.setExtra("logcat", mapM81170c.get("logcat"));
            monitorEvent.setExtra("meminfo", this.f201747a.get("memory info"));
            String str = this.f201747a.get("pid");
            String str2 = Process.myPid() + "";
            monitorEvent.setExtra("currentProcessId", str2);
            if (str != null) {
                monitorEvent.setExtra("crashProcessId", str);
                monitorEvent.setExtra("lastProcessId", nt2.m160820k());
                monitorEvent.setExtra("lastPage", nt2.m160819j());
                if (!str.equals(str2)) {
                    m217273b(str, monitorEvent);
                }
            }
            String str3 = this.f201747a.get("Crash time");
            if (!TextUtils.isEmpty(str3)) {
                monitorEvent.setClientTime(j7c.m140086e(NativeLogParser.m81169b(str3)));
            }
            String str4 = this.f201747a.get("App version");
            long jM81168a = NativeLogParser.m81168a("Start time", "Crash time");
            App app = monitorEvent.getApp();
            if (app == null) {
                app = new App();
            }
            if (jM81168a != -1) {
                app.setUpDuration(jM81168a);
            }
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            app.setAppVersion(str4);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m217273b(String str, MonitorEvent monitorEvent) {
        if (str.equals(nt2.m160820k())) {
            String strM160819j = nt2.m160819j();
            if (TextUtils.isEmpty(strM160819j)) {
                return;
            }
            monitorEvent.setTransaction(strM160819j);
        }
    }
}
