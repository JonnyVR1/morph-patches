package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.tantanapp.beatles.NetConnectivityReceiver;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import com.tantanapp.beatles.p077v2.upload.UploadStatus;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class a5f {

    /* JADX INFO: renamed from: a */
    public final Object f68546a;

    /* JADX INFO: renamed from: b */
    public final List<k5f> f68547b;

    /* JADX INFO: renamed from: c */
    public q3k0 f68548c;

    /* JADX INFO: renamed from: d */
    public zx3 f68549d;

    /* JADX INFO: renamed from: e */
    public u4f f68550e;

    /* JADX INFO: renamed from: f */
    public wtb f68551f;

    /* JADX INFO: renamed from: g */
    public v31 f68552g;

    /* JADX INFO: renamed from: l.a5f$a */
    public class RunnableC15652a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MonitorEvent f68553a;

        public RunnableC15652a(MonitorEvent monitorEvent) {
            this.f68553a = monitorEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f68553a.isCache()) {
                a5f.this.m96067n(this.f68553a);
                if (this.f68553a.getEventType().equals("crash")) {
                    du2.m118062v("[beatles]", "[upload]processEvent done:" + this.f68553a.getEventId());
                }
                try {
                    a5f.this.m96069p(this.f68553a);
                } catch (IOException e) {
                    du2.m118062v("[beatles]", "[upload] saveEvent2DiskCache exception:" + e.getMessage());
                }
                if (this.f68553a.getEventType().equals("crash")) {
                    du2.m118062v("[beatles]", "[upload] saveEvent2DiskCache done:" + this.f68553a.getEventId());
                }
            }
            m4f m4fVarM204574a = w2f.m204574a(this.f68553a);
            if ("crash".equals(this.f68553a.getEventType()) && TextUtils.isEmpty(m4fVarM204574a.m157003a())) {
                du2.m118062v("[beatles]", "[upload] envelope jsonData is empty,  SubEventType:" + this.f68553a.getSubEventType());
                if ("java".equals(this.f68553a.getSubEventType())) {
                    du2.m118062v("[beatles]", "[upload] envelope jsonData is empty, event:" + new Gson().toJson(this.f68553a));
                }
            }
            UploadStatus uploadStatusM96073t = a5f.this.m96073t(m4fVarM204574a);
            if (UploadStatus.SUCCESS != uploadStatusM96073t && UploadStatus.DISCARD != uploadStatusM96073t) {
                du2.m118062v("[beatles]", "[upload]event upload failed id:" + this.f68553a.getEventId());
                return;
            }
            f610.m124264b("event upload success id:" + this.f68553a.getEventId() + "status:" + uploadStatusM96073t, new Object[0]);
            if (du2.m118061u()) {
                return;
            }
            nki.m163624g(this.f68553a.getCacheDir());
        }
    }

    /* JADX INFO: renamed from: l.a5f$b */
    public class C15653b implements NetConnectivityReceiver.InterfaceC13702a {
        public C15653b() {
        }

        @Override // com.tantanapp.beatles.NetConnectivityReceiver.InterfaceC13702a
        /* JADX INFO: renamed from: a */
        public void mo82230a(boolean z) {
            if (z) {
                a5f.this.f68548c.m175138m();
                if (!du2.m118061u()) {
                    a5f.this.f68549d.m221977g();
                }
                a5f.this.f68552g.m199175p();
            }
        }
    }

    /* JADX INFO: renamed from: l.a5f$c */
    public static class C15654c {
        private static a5f INSTANCE = new a5f(null);
    }

    public a5f() {
        this.f68546a = new Object();
        this.f68547b = new CopyOnWriteArrayList();
    }

    /* JADX INFO: renamed from: m */
    public static a5f m96060m() {
        return C15654c.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public final void m96061g(@NonNull k5f k5fVar) {
        this.f68547b.add(k5fVar);
    }

    /* JADX INFO: renamed from: h */
    public final Runnable m96062h(MonitorEvent monitorEvent) {
        return new RunnableC15652a(monitorEvent);
    }

    /* JADX INFO: renamed from: i */
    public v31 m96063i() {
        return this.f68552g;
    }

    /* JADX INFO: renamed from: j */
    public u4f m96064j() {
        return this.f68550e;
    }

    /* JADX INFO: renamed from: k */
    public List<k5f> m96065k() {
        return this.f68547b;
    }

    /* JADX INFO: renamed from: l */
    public void m96066l() {
        cjk0 cjk0VarM118056p = du2.m118056p();
        String str = cjk0VarM118056p.m110256l() + File.separator + "attachments";
        q3k0 q3k0VarM118055o = du2.m118055o();
        this.f68548c = q3k0VarM118055o;
        this.f68552g = new v31(q3k0VarM118055o, str);
        m96061g(new jsw(cjk0VarM118056p.m110248d()));
        m96061g(new xld(du2.m118045e()));
        m96061g(new w31(this.f68552g));
        this.f68549d = new zx3();
        this.f68550e = new nod();
        this.f68551f = new wtb();
        if (cjk0VarM118056p.m110245a()) {
            m96068o();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m96067n(MonitorEvent monitorEvent) {
        Iterator<k5f> it = monitorEvent.getEventProcessors().iterator();
        while (it.hasNext()) {
            it.next().mo82303a(monitorEvent);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m96068o() {
        NetConnectivityReceiver.registerCallBack(new C15653b());
    }

    /* JADX INFO: renamed from: p */
    public final void m96069p(MonitorEvent monitorEvent) throws IOException {
        this.f68551f.m207829c(monitorEvent);
    }

    /* JADX INFO: renamed from: q */
    public void m96070q(MonitorEvent monitorEvent) {
        xni0.m212212d().m216870a(m96062h(monitorEvent));
    }

    /* JADX INFO: renamed from: r */
    public void m96071r(MonitorEvent monitorEvent) {
        Runnable runnableM96062h = m96062h(monitorEvent);
        synchronized (this.f68546a) {
            try {
                xni0.m212210b().m216870a(runnableM96062h);
                f610.m124266d("[report] current thread wait!!!", new Object[0]);
                this.f68546a.wait(2000L);
                f610.m124266d("[report] notify the wait thread!!!", new Object[0]);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m96072s(String str) {
        return this.f68548c.m175142q(str);
    }

    /* JADX INFO: renamed from: t */
    public final UploadStatus m96073t(m4f m4fVar) {
        return this.f68548c.m175143r(m4fVar);
    }

    public /* synthetic */ a5f(RunnableC15652a runnableC15652a) {
        this();
    }
}
