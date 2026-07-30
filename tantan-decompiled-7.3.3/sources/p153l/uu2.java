package p153l;

import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class uu2 {

    /* JADX INFO: renamed from: a */
    public static f6f f181031a;

    /* JADX INFO: renamed from: b */
    public static boolean f181032b;

    /* JADX INFO: renamed from: l.uu2$a */
    public class RunnableC20675a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Throwable f181033a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Thread f181034b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f181035c;

        public RunnableC20675a(Throwable th, Thread thread, String str) {
            this.f181033a = th;
            this.f181034b = thread;
            this.f181035c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            uu2.m198140b(this.f181033a, this.f181034b, this.f181035c);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m198140b(Throwable th, Thread thread, String str) {
        MonitorEvent monitorEvent = new MonitorEvent("exception", str.toLowerCase(), th);
        monitorEvent.setCrashThread(thread);
        f181031a.m108092j(monitorEvent);
    }

    /* JADX INFO: renamed from: c */
    public static void m198141c(f6f f6fVar) {
        f181031a = f6fVar;
        f181032b = true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m198142d() {
        return f181032b;
    }

    /* JADX INFO: renamed from: e */
    public static void m198143e(vrf vrfVar, MonitorEvent monitorEvent) {
        if (vrfVar == null) {
            return;
        }
        HashMap<String, String> mapM202490a = vrfVar.m202490a();
        if (mapM202490a.size() > 0) {
            for (Map.Entry<String, String> entry : mapM202490a.entrySet()) {
                monitorEvent.setExtra(entry.getKey(), entry.getValue());
            }
        }
        HashMap<String, JSONObject> mapM202492c = vrfVar.m202492c();
        if (mapM202492c.size() > 0) {
            for (Map.Entry<String, JSONObject> entry2 : mapM202492c.entrySet()) {
                monitorEvent.setExtra(entry2.getKey(), entry2.getValue().toString());
            }
        }
        ArrayList<File> arrayListM202491b = vrfVar.m202491b();
        if (arrayListM202491b == null || arrayListM202491b.size() <= 0) {
            return;
        }
        monitorEvent.addFiles(arrayListM202491b);
    }

    /* JADX INFO: renamed from: f */
    public static void m198144f(Throwable th, String str) {
        m198145g(th, str, null);
    }

    /* JADX INFO: renamed from: g */
    public static void m198145g(Throwable th, String str, ili iliVar) {
        if (f181032b) {
            if (iliVar == null || !iliVar.mo137107a(th)) {
                xni0.m212212d().m216870a(new RunnableC20675a(th, Thread.currentThread(), str));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m198146h(MonitorEvent monitorEvent) {
        if (f181032b) {
            f181031a.m108092j(monitorEvent);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m198147i(MonitorEvent monitorEvent, vrf vrfVar) {
        if (f181032b) {
            m198143e(vrfVar, monitorEvent);
            f181031a.m108092j(monitorEvent);
        }
    }
}
