package p149l;

import com.google.gson.Gson;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes13.dex */
public class isb {

    /* JADX INFO: renamed from: a */
    public File f114745a;

    /* JADX INFO: renamed from: b */
    public PrintWriter f114746b;

    /* JADX INFO: renamed from: l.isb$a */
    public class RunnableC17613a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f114747a;

        public RunnableC17613a(String str) {
            this.f114747a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            isb.this.m137979b(this.f114747a);
        }
    }

    public isb() {
        String str = nt2.m160825p().m202321l() + "/temp_event";
        xei0.m208581c();
        xei0.m208580b().m214349a(new RunnableC17613a(str));
    }

    /* JADX INFO: renamed from: b */
    public final void m137979b(String str) {
        qhi.m174546g(str);
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            this.f114745a = new File(file, "event.json");
            try {
                this.f114746b = new PrintWriter(new FileWriter(this.f114745a));
            } catch (IOException unused) {
                qhi.m174545f(this.f114745a);
                this.f114746b = null;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m137980c(MonitorEvent monitorEvent) throws IOException {
        vx00.m200472b("saveEvent2DiskCache start!", new Object[0]);
        String cacheDir = monitorEvent.getCacheDir();
        String json = new Gson().toJson(monitorEvent);
        if (this.f114746b == null || !monitorEvent.getEventType().equals("crash")) {
            qhi.m174556q(json, cacheDir, "event.json");
        } else {
            try {
                qhi.m174555p(json, this.f114746b);
                this.f114746b.close();
                this.f114746b = null;
                qhi.m174552m(this.f114745a.getAbsolutePath(), monitorEvent.getCacheDir());
            } catch (Throwable th) {
                this.f114746b.close();
                this.f114746b = null;
                throw th;
            }
        }
        vx00.m200472b("saveEvent2DiskCache end!", new Object[0]);
    }
}
