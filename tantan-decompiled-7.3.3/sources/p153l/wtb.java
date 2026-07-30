package p153l;

import com.google.gson.Gson;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes11.dex */
public class wtb {

    /* JADX INFO: renamed from: a */
    public File f190729a;

    /* JADX INFO: renamed from: b */
    public PrintWriter f190730b;

    /* JADX INFO: renamed from: l.wtb$a */
    public class RunnableC21175a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f190731a;

        public RunnableC21175a(String str) {
            this.f190731a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            wtb.this.m207828b(this.f190731a);
        }
    }

    public wtb() {
        String str = du2.m118056p().m110256l() + "/temp_event";
        xni0.m212211c();
        xni0.m212210b().m216870a(new RunnableC21175a(str));
    }

    /* JADX INFO: renamed from: b */
    public final void m207828b(String str) {
        nki.m163624g(str);
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            this.f190729a = new File(file, "event.json");
            try {
                this.f190730b = new PrintWriter(new FileWriter(this.f190729a));
            } catch (IOException unused) {
                nki.m163623f(this.f190729a);
                this.f190730b = null;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m207829c(MonitorEvent monitorEvent) throws IOException {
        f610.m124264b("saveEvent2DiskCache start!", new Object[0]);
        String cacheDir = monitorEvent.getCacheDir();
        String json = new Gson().toJson(monitorEvent);
        if (this.f190730b == null || !monitorEvent.getEventType().equals("crash")) {
            nki.m163634q(json, cacheDir, "event.json");
        } else {
            try {
                nki.m163633p(json, this.f190730b);
                this.f190730b.close();
                this.f190730b = null;
                nki.m163630m(this.f190729a.getAbsolutePath(), monitorEvent.getCacheDir());
            } catch (Throwable th) {
                this.f190730b.close();
                this.f190730b = null;
                throw th;
            }
        }
        f610.m124264b("saveEvent2DiskCache end!", new Object[0]);
    }
}
