package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.immomo.mmutil.task.C3804c;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class snw implements hvl {

    /* JADX INFO: renamed from: c */
    private ScheduledFuture f165519c;

    /* JADX INFO: renamed from: b */
    private final Object f165518b = new Object();

    /* JADX INFO: renamed from: d */
    private volatile boolean f165520d = false;

    /* JADX INFO: renamed from: e */
    private volatile boolean f165521e = true;

    /* JADX INFO: renamed from: f */
    private gje0 f165522f = gje0.m126478c();

    /* JADX INFO: renamed from: a */
    private efc0 f165517a = new efc0(inw.m137168f(), inw.m137169g(), inw.m137170h());

    /* JADX INFO: renamed from: l.snw$b */
    public final class C20000b extends ax00.AbstractRunnableC15743b<Object, Object, Boolean> {
        private C20000b() {
        }

        @Override // p149l.ax00.AbstractRunnableC15743b
        /* JADX INFO: renamed from: n */
        public void mo87096n(Exception exc) {
            inw.m137185w("upload realtime log ---> error:" + exc.getMessage());
        }

        @Override // p149l.ax00.AbstractRunnableC15743b
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Boolean mo87095f(Object... objArr) throws Exception {
            if (!snw.this.m185206m() && !snw.this.f165522f.m126480a()) {
                synchronized (snw.this.f165518b) {
                    snw.this.f165518b.wait();
                    inw.m137185w("appExit, wait ...");
                }
                return Boolean.TRUE;
            }
            gvl gvlVarM137173k = inw.m137173k();
            List<jnw> listM116028b = snw.this.f165517a.m116028b();
            snw.this.f165522f = gje0.m126478c();
            if (gvlVarM137173k == null || listM116028b == null || listM116028b.size() <= 0) {
                if (snw.this.f165520d) {
                    synchronized (snw.this.f165518b) {
                        snw.this.f165518b.wait();
                        inw.m137181s("queue empty, wait for input log...");
                    }
                }
                return Boolean.FALSE;
            }
            snw.this.f165520d = true;
            JSONObject jSONObjectM177929c = r5c.m177929c(listM116028b);
            String strMo128259a = gvlVarM137173k.mo128259a(jSONObjectM177929c);
            if (TextUtils.isEmpty(strMo128259a)) {
                return Boolean.FALSE;
            }
            gje0 gje0VarM126479d = gje0.m126479d(strMo128259a);
            if (inw.m137177o()) {
                inw.m137182t("post params ---> " + jSONObjectM177929c.toString());
                inw.m137182t("post result ---> " + gje0VarM126479d.toString());
            }
            snw.this.m185207n(gje0VarM126479d);
            return Boolean.valueOf(gje0VarM126479d.m126481e());
        }

        @Override // p149l.ax00.AbstractRunnableC15743b
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void mo87097p(Boolean bool) {
            super.mo87097p(bool);
            if (bool.booleanValue()) {
                inw.m137181s("upload realtime log ---> success");
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m185197d(snw snwVar, gxv gxvVar) {
        snwVar.f165517a.m116030d(gxvVar);
        snwVar.m185208o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public boolean m185206m() {
        return this.f165521e || inw.m137163a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public synchronized void m185207n(gje0 gje0Var) {
        ScheduledFuture scheduledFuture;
        this.f165522f = gje0Var;
        if (gje0Var.m126480a() && (scheduledFuture = this.f165519c) != null) {
            scheduledFuture.cancel(true);
            do {
                inw.m137185w("channel cooled, wait until scheduledFuture cancelled...");
            } while (!this.f165519c.isCancelled());
            this.f165519c = C3804c.m18446f(5, new C20000b(), gje0Var.f103025d, this.f165517a.m116029c(), TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: renamed from: o */
    private synchronized void m185208o() {
        try {
            if (!inw.m137179q() || !m185206m()) {
                inw.m137185w("tryTriggerUpload but ".concat(!inw.m137179q() ? "realtime disabled" : "app background"));
            } else if (!this.f165517a.m116027a()) {
                inw.m137185w("tryTriggerUpload --->  record array is null");
            } else if (this.f165520d) {
                inw.m137181s("queue has data, notify fixed rate task");
                synchronized (this.f165518b) {
                    this.f165518b.notifyAll();
                }
            } else {
                inw.m137181s("tryTriggerUpload --->  start upload task");
                this.f165519c = C3804c.m18446f(5, new C20000b(), 0L, this.f165517a.m116029c(), TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.hvl
    /* JADX INFO: renamed from: a */
    public void mo133190a(@NonNull final gxv gxvVar) {
        if (this.f165522f.m126480a()) {
            inw.m137185w("channel cooled, drop log record");
        } else {
            C3804c.m18444d(2, new Runnable() { // from class: l.rnw
                @Override // java.lang.Runnable
                public final void run() {
                    snw.m185197d(this.f160334a, gxvVar);
                }
            });
        }
    }

    @Override // p149l.qml
    /* JADX INFO: renamed from: b */
    public void mo160373b() {
        this.f165521e = false;
    }

    @Override // p149l.qml
    /* JADX INFO: renamed from: c */
    public void mo160374c() {
        this.f165521e = true;
        if (this.f165522f.m126480a()) {
            return;
        }
        synchronized (this.f165518b) {
            this.f165518b.notifyAll();
            inw.m137185w("appEnter, notify task");
        }
    }
}
