package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.tantanapp.beatles.NetConnectivityReceiver;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import com.tantanapp.beatles.p072v2.upload.UploadStatus;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class w3f {

    /* JADX INFO: renamed from: a */
    public final Object f184381a;

    /* JADX INFO: renamed from: b */
    public final List<g4f> f184382b;

    /* JADX INFO: renamed from: c */
    public nuj0 f184383c;

    /* JADX INFO: renamed from: d */
    public ax3 f184384d;

    /* JADX INFO: renamed from: e */
    public p3f f184385e;

    /* JADX INFO: renamed from: f */
    public isb f184386f;

    /* JADX INFO: renamed from: g */
    public o31 f184387g;

    /* JADX INFO: renamed from: l.w3f$a */
    public class RunnableC20790a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MonitorEvent f184388a;

        public RunnableC20790a(MonitorEvent monitorEvent) {
            this.f184388a = monitorEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f184388a.isCache()) {
                w3f.this.m201304n(this.f184388a);
                if (this.f184388a.getEventType().equals("crash")) {
                    nt2.m160831v("[beatles]", "[upload]processEvent done:" + this.f184388a.getEventId());
                }
                try {
                    w3f.this.m201306p(this.f184388a);
                } catch (IOException e) {
                    nt2.m160831v("[beatles]", "[upload] saveEvent2DiskCache exception:" + e.getMessage());
                }
                if (this.f184388a.getEventType().equals("crash")) {
                    nt2.m160831v("[beatles]", "[upload] saveEvent2DiskCache done:" + this.f184388a.getEventId());
                }
            }
            h3f h3fVarM177461a = r1f.m177461a(this.f184388a);
            if ("crash".equals(this.f184388a.getEventType()) && TextUtils.isEmpty(h3fVarM177461a.m129165a())) {
                nt2.m160831v("[beatles]", "[upload] envelope jsonData is empty,  SubEventType:" + this.f184388a.getSubEventType());
                if ("java".equals(this.f184388a.getSubEventType())) {
                    nt2.m160831v("[beatles]", "[upload] envelope jsonData is empty, event:" + new Gson().toJson(this.f184388a));
                }
            }
            UploadStatus uploadStatusM201310t = w3f.this.m201310t(h3fVarM177461a);
            if (UploadStatus.SUCCESS != uploadStatusM201310t && UploadStatus.DISCARD != uploadStatusM201310t) {
                nt2.m160831v("[beatles]", "[upload]event upload failed id:" + this.f184388a.getEventId());
                return;
            }
            vx00.m200472b("event upload success id:" + this.f184388a.getEventId() + "status:" + uploadStatusM201310t, new Object[0]);
            if (nt2.m160830u()) {
                return;
            }
            qhi.m174546g(this.f184388a.getCacheDir());
        }
    }

    /* JADX INFO: renamed from: l.w3f$b */
    public class C20791b implements NetConnectivityReceiver.InterfaceC13539a {
        public C20791b() {
        }

        @Override // com.tantanapp.beatles.NetConnectivityReceiver.InterfaceC13539a
        /* JADX INFO: renamed from: a */
        public void mo81047a(boolean z) {
            if (z) {
                w3f.this.f184383c.m161499m();
                if (!nt2.m160830u()) {
                    w3f.this.f184384d.m99362g();
                }
                w3f.this.f184387g.m162346p();
            }
        }
    }

    /* JADX INFO: renamed from: l.w3f$c */
    public static class C20792c {
        private static w3f INSTANCE = new w3f(null);
    }

    public w3f() {
        this.f184381a = new Object();
        this.f184382b = new CopyOnWriteArrayList();
    }

    /* JADX INFO: renamed from: m */
    public static w3f m201297m() {
        return C20792c.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public final void m201298g(@NonNull g4f g4fVar) {
        this.f184382b.add(g4fVar);
    }

    /* JADX INFO: renamed from: h */
    public final Runnable m201299h(MonitorEvent monitorEvent) {
        return new RunnableC20790a(monitorEvent);
    }

    /* JADX INFO: renamed from: i */
    public o31 m201300i() {
        return this.f184387g;
    }

    /* JADX INFO: renamed from: j */
    public p3f m201301j() {
        return this.f184385e;
    }

    /* JADX INFO: renamed from: k */
    public List<g4f> m201302k() {
        return this.f184382b;
    }

    /* JADX INFO: renamed from: l */
    public void m201303l() {
        w9k0 w9k0VarM160825p = nt2.m160825p();
        String str = w9k0VarM160825p.m202321l() + File.separator + "attachments";
        nuj0 nuj0VarM160824o = nt2.m160824o();
        this.f184383c = nuj0VarM160824o;
        this.f184387g = new o31(nuj0VarM160824o, str);
        m201298g(new kpw(w9k0VarM160825p.m202313d()));
        m201298g(new rkd(nt2.m160814e()));
        m201298g(new p31(this.f184387g));
        this.f184384d = new ax3();
        this.f184385e = new ind();
        this.f184386f = new isb();
        if (w9k0VarM160825p.m202310a()) {
            m201305o();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m201304n(MonitorEvent monitorEvent) {
        Iterator<g4f> it = monitorEvent.getEventProcessors().iterator();
        while (it.hasNext()) {
            it.next().mo81120a(monitorEvent);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m201305o() {
        NetConnectivityReceiver.registerCallBack(new C20791b());
    }

    /* JADX INFO: renamed from: p */
    public final void m201306p(MonitorEvent monitorEvent) throws IOException {
        this.f184386f.m137980c(monitorEvent);
    }

    /* JADX INFO: renamed from: q */
    public void m201307q(MonitorEvent monitorEvent) {
        xei0.m208582d().m214349a(m201299h(monitorEvent));
    }

    /* JADX INFO: renamed from: r */
    public void m201308r(MonitorEvent monitorEvent) {
        Runnable runnableM201299h = m201299h(monitorEvent);
        synchronized (this.f184381a) {
            try {
                xei0.m208580b().m214349a(runnableM201299h);
                vx00.m200474d("[report] current thread wait!!!", new Object[0]);
                this.f184381a.wait(2000L);
                vx00.m200474d("[report] notify the wait thread!!!", new Object[0]);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m201309s(String str) {
        return this.f184383c.m161503q(str);
    }

    /* JADX INFO: renamed from: t */
    public final UploadStatus m201310t(h3f h3fVar) {
        return this.f184383c.m161504r(h3fVar);
    }

    public /* synthetic */ w3f(RunnableC20790a runnableC20790a) {
        this();
    }
}
