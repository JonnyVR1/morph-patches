package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.immomo.mmutil.task.C3949c;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class qqw implements zxl {

    /* JADX INFO: renamed from: c */
    private ScheduledFuture f159047c;

    /* JADX INFO: renamed from: b */
    private final Object f159046b = new Object();

    /* JADX INFO: renamed from: d */
    private volatile boolean f159048d = false;

    /* JADX INFO: renamed from: e */
    private volatile boolean f159049e = true;

    /* JADX INFO: renamed from: f */
    private lre0 f159050f = lre0.m155619c();

    /* JADX INFO: renamed from: a */
    private lnc0 f159045a = new lnc0(gqw.m131482f(), gqw.m131483g(), gqw.m131484h());

    /* JADX INFO: renamed from: l.qqw$b */
    public final class C19630b extends i510.AbstractRunnableC17649b<Object, Object, Boolean> {
        private C19630b() {
        }

        @Override // p153l.i510.AbstractRunnableC17649b
        /* JADX INFO: renamed from: l */
        public void mo138633l(Exception exc) {
            gqw.m131499w("upload realtime log ---> error:" + exc.getMessage());
        }

        @Override // p153l.i510.AbstractRunnableC17649b
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Boolean mo138629e(Object... objArr) throws Exception {
            if (!qqw.this.m177522m() && !qqw.this.f159050f.m155621a()) {
                synchronized (qqw.this.f159046b) {
                    qqw.this.f159046b.wait();
                    gqw.m131499w("appExit, wait ...");
                }
                return Boolean.TRUE;
            }
            yxl yxlVarM131487k = gqw.m131487k();
            List<hqw> listM154970b = qqw.this.f159045a.m154970b();
            qqw.this.f159050f = lre0.m155619c();
            if (yxlVarM131487k == null || listM154970b == null || listM154970b.size() <= 0) {
                if (qqw.this.f159048d) {
                    synchronized (qqw.this.f159046b) {
                        qqw.this.f159046b.wait();
                        gqw.m131495s("queue empty, wait for input log...");
                    }
                }
                return Boolean.FALSE;
            }
            qqw.this.f159048d = true;
            JSONObject jSONObjectM209466c = x6c.m209466c(listM154970b);
            String strMo192755a = yxlVarM131487k.mo192755a(jSONObjectM209466c);
            if (TextUtils.isEmpty(strMo192755a)) {
                return Boolean.FALSE;
            }
            lre0 lre0VarM155620d = lre0.m155620d(strMo192755a);
            if (gqw.m131491o()) {
                gqw.m131496t("post params ---> " + jSONObjectM209466c.toString());
                gqw.m131496t("post result ---> " + lre0VarM155620d.toString());
            }
            qqw.this.m177523n(lre0VarM155620d);
            return Boolean.valueOf(lre0VarM155620d.m155622e());
        }

        @Override // p153l.i510.AbstractRunnableC17649b
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo138635n(Boolean bool) {
            super.mo138635n(bool);
            if (bool.booleanValue()) {
                gqw.m131495s("upload realtime log ---> success");
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m177513d(qqw qqwVar, fzv fzvVar) {
        qqwVar.f159045a.m154972d(fzvVar);
        qqwVar.m177524o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public boolean m177522m() {
        return this.f159049e || gqw.m131477a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public synchronized void m177523n(lre0 lre0Var) {
        ScheduledFuture scheduledFuture;
        this.f159050f = lre0Var;
        if (lre0Var.m155621a() && (scheduledFuture = this.f159047c) != null) {
            scheduledFuture.cancel(true);
            do {
                gqw.m131499w("channel cooled, wait until scheduledFuture cancelled...");
            } while (!this.f159047c.isCancelled());
            this.f159047c = C3949c.m19429f(5, new C19630b(), lre0Var.f133322d, this.f159045a.m154971c(), TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: renamed from: o */
    private synchronized void m177524o() {
        try {
            if (!gqw.m131493q() || !m177522m()) {
                gqw.m131499w("tryTriggerUpload but ".concat(!gqw.m131493q() ? "realtime disabled" : "app background"));
            } else if (!this.f159045a.m154969a()) {
                gqw.m131499w("tryTriggerUpload --->  record array is null");
            } else if (this.f159048d) {
                gqw.m131495s("queue has data, notify fixed rate task");
                synchronized (this.f159046b) {
                    this.f159046b.notifyAll();
                }
            } else {
                gqw.m131495s("tryTriggerUpload --->  start upload task");
                this.f159047c = C3949c.m19429f(5, new C19630b(), 0L, this.f159045a.m154971c(), TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.bpl
    /* JADX INFO: renamed from: a */
    public void mo105846a() {
        this.f159049e = false;
    }

    @Override // p153l.zxl
    /* JADX INFO: renamed from: b */
    public void mo155510b(@NonNull final fzv fzvVar) {
        if (this.f159050f.m155621a()) {
            gqw.m131499w("channel cooled, drop log record");
        } else {
            C3949c.m19427d(2, new Runnable() { // from class: l.pqw
                @Override // java.lang.Runnable
                public final void run() {
                    qqw.m177513d(this.f153712a, fzvVar);
                }
            });
        }
    }

    @Override // p153l.bpl
    /* JADX INFO: renamed from: c */
    public void mo105847c() {
        this.f159049e = true;
        if (this.f159050f.m155621a()) {
            return;
        }
        synchronized (this.f159046b) {
            this.f159046b.notifyAll();
            gqw.m131499w("appEnter, notify task");
        }
    }
}
