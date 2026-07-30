package p149l;

import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class eu2 {

    /* JADX INFO: renamed from: a */
    public static c5f f93208a;

    /* JADX INFO: renamed from: b */
    public static boolean f93209b;

    /* JADX INFO: renamed from: l.eu2$a */
    public class RunnableC16681a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Throwable f93210a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Thread f93211b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f93212c;

        public RunnableC16681a(Throwable th, Thread thread, String str) {
            this.f93210a = th;
            this.f93211b = thread;
            this.f93212c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            eu2.m118148b(this.f93210a, this.f93211b, this.f93212c);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m118148b(Throwable th, Thread thread, String str) {
        MonitorEvent monitorEvent = new MonitorEvent("exception", str.toLowerCase(), th);
        monitorEvent.setCrashThread(thread);
        f93208a.m186395j(monitorEvent);
    }

    /* JADX INFO: renamed from: c */
    public static void m118149c(c5f c5fVar) {
        f93208a = c5fVar;
        f93209b = true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m118150d() {
        return f93209b;
    }

    /* JADX INFO: renamed from: e */
    public static void m118151e(oqf oqfVar, MonitorEvent monitorEvent) {
        if (oqfVar == null) {
            return;
        }
        HashMap<String, String> mapM165422a = oqfVar.m165422a();
        if (mapM165422a.size() > 0) {
            for (Map.Entry<String, String> entry : mapM165422a.entrySet()) {
                monitorEvent.setExtra(entry.getKey(), entry.getValue());
            }
        }
        HashMap<String, JSONObject> mapM165424c = oqfVar.m165424c();
        if (mapM165424c.size() > 0) {
            for (Map.Entry<String, JSONObject> entry2 : mapM165424c.entrySet()) {
                monitorEvent.setExtra(entry2.getKey(), entry2.getValue().toString());
            }
        }
        ArrayList<File> arrayListM165423b = oqfVar.m165423b();
        if (arrayListM165423b == null || arrayListM165423b.size() <= 0) {
            return;
        }
        monitorEvent.addFiles(arrayListM165423b);
    }

    /* JADX INFO: renamed from: f */
    public static void m118152f(Throwable th, String str) {
        m118153g(th, str, null);
    }

    /* JADX INFO: renamed from: g */
    public static void m118153g(Throwable th, String str, lii liiVar) {
        if (f93209b) {
            if (liiVar == null || !liiVar.mo149900a(th)) {
                xei0.m208582d().m214349a(new RunnableC16681a(th, Thread.currentThread(), str));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m118154h(MonitorEvent monitorEvent) {
        if (f93209b) {
            f93208a.m186395j(monitorEvent);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m118155i(MonitorEvent monitorEvent, oqf oqfVar) {
        if (f93209b) {
            m118151e(oqfVar, monitorEvent);
            f93208a.m186395j(monitorEvent);
        }
    }
}
