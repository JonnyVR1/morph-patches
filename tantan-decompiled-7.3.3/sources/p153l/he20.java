package p153l;

import android.os.Process;
import android.text.TextUtils;
import com.tantanapp.beatles.nativecore.NativeLogParser;
import com.tantanapp.beatles.p077v2.data.App;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class he20 implements k5f {

    /* JADX INFO: renamed from: a */
    public Map<String, String> f109059a;

    @Override // p153l.k5f
    /* JADX INFO: renamed from: a */
    public void mo82303a(MonitorEvent monitorEvent) {
        try {
            Map<String, String> mapM82353c = NativeLogParser.m82353c(new File(monitorEvent.getCacheDir() + "/" + monitorEvent.getSubEventType() + ".dmp"));
            this.f109059a = mapM82353c;
            monitorEvent.setExtra("logcat", mapM82353c.get("logcat"));
            monitorEvent.setExtra("meminfo", this.f109059a.get("memory info"));
            String str = this.f109059a.get("pid");
            String str2 = Process.myPid() + "";
            monitorEvent.setExtra("currentProcessId", str2);
            if (str != null) {
                monitorEvent.setExtra("crashProcessId", str);
                monitorEvent.setExtra("lastProcessId", du2.m118051k());
                monitorEvent.setExtra("lastPage", du2.m118050j());
                if (!str.equals(str2)) {
                    m134620b(str, monitorEvent);
                }
            }
            String str3 = this.f109059a.get("Crash time");
            if (!TextUtils.isEmpty(str3)) {
                monitorEvent.setClientTime(p8c.m171234e(NativeLogParser.m82352b(str3)));
            }
            String str4 = this.f109059a.get("App version");
            long jM82351a = NativeLogParser.m82351a("Start time", "Crash time");
            App app = monitorEvent.getApp();
            if (app == null) {
                app = new App();
            }
            if (jM82351a != -1) {
                app.setUpDuration(jM82351a);
            }
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            app.setAppVersion(str4);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m134620b(String str, MonitorEvent monitorEvent) {
        if (str.equals(du2.m118051k())) {
            String strM118050j = du2.m118050j();
            if (TextUtils.isEmpty(strM118050j)) {
                return;
            }
            monitorEvent.setTransaction(strM118050j);
        }
    }
}
