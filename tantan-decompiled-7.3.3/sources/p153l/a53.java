package p153l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.momocv.bodylandmark.BodyLandmark;
import com.momocv.bodylandmark.BodyLandmarkPostInfo;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public class a53 {

    /* JADX INFO: renamed from: a */
    private String f68483a;

    /* JADX INFO: renamed from: b */
    private ByteBuffer f68484b;

    /* JADX INFO: renamed from: e */
    private boolean f68487e;

    /* JADX INFO: renamed from: g */
    private C15646a f68489g;

    /* JADX INFO: renamed from: h */
    private HandlerC15647b f68490h;

    /* JADX INFO: renamed from: l */
    private BodyLandmark f68494l;

    /* JADX INFO: renamed from: m */
    private ppl f68495m;

    /* JADX INFO: renamed from: i */
    private umw f68491i = new umw();

    /* JADX INFO: renamed from: j */
    private lnw f68492j = new lnw(5);

    /* JADX INFO: renamed from: k */
    private BodyLandmarkPostInfo f68493k = new BodyLandmarkPostInfo();

    /* JADX INFO: renamed from: c */
    private Object f68485c = new Object();

    /* JADX INFO: renamed from: d */
    private Object f68486d = new Object();

    /* JADX INFO: renamed from: f */
    private AtomicBoolean f68488f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l.a53$a */
    public class C15646a extends Thread {
        public C15646a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            a53.this.f68487e = true;
            try {
                synchronized (a53.this.f68485c) {
                    while (a53.this.f68487e) {
                        try {
                            a53.this.f68485c.wait();
                            a53.this.m96020h();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                a53.this.f68484b.clear();
                a53.this.f68484b = null;
            } catch (Exception e) {
                t9c.m189745c("BodyDetector", e.toString());
            }
        }
    }

    /* JADX INFO: renamed from: l.a53$b */
    public class HandlerC15647b extends Handler {
        public HandlerC15647b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (a53.this.f68495m != null) {
                a53.this.f68495m.mo152658b((BodyLandmarkPostInfo) message.obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m96020h() {
        this.f68488f.set(true);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f68494l == null && !TextUtils.isEmpty(this.f68483a)) {
            BodyLandmark bodyLandmark = new BodyLandmark();
            this.f68494l = bodyLandmark;
            bodyLandmark.LoadModel(this.f68483a);
        }
        if (this.f68494l != null) {
            byte[] bArrArray = this.f68484b.array();
            this.f68491i.m196801g(bArrArray);
            this.f68491i.m196800f(bArrArray.length);
            this.f68494l.ProcessFrame(this.f68491i.m196796b(), this.f68492j.m155006a(), this.f68493k);
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f68493k;
            HandlerC15647b handlerC15647b = this.f68490h;
            if (handlerC15647b != null) {
                handlerC15647b.sendMessage(messageObtain);
            }
        }
        u6y.m194722F().m194755d0(SystemClock.elapsedRealtime() - jElapsedRealtime);
        this.f68488f.set(false);
    }

    /* JADX INFO: renamed from: i */
    public void m96021i(ppl pplVar) {
        this.f68495m = pplVar;
    }

    /* JADX INFO: renamed from: j */
    public void m96022j(omw omwVar) {
        if (this.f68488f.get()) {
            return;
        }
        this.f68491i.m196802h(17);
        this.f68491i.m196807m(omwVar.f148018e);
        this.f68491i.m196804j(omwVar.f148019f);
        this.f68491i.m196806l(omwVar.f148018e);
        this.f68484b = ByteBuffer.wrap(omwVar.f148020g);
        this.f68492j.m155021p(omwVar.f148014a);
        this.f68492j.m154993A(omwVar.f148015b);
        this.f68492j.m155031z(omwVar.f148016c);
        this.f68492j.m155000H(true);
        synchronized (this.f68485c) {
            this.f68485c.notify();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m96023k(String str) {
        this.f68483a = str;
    }

    /* JADX INFO: renamed from: l */
    public void m96024l() {
        synchronized (this.f68486d) {
            try {
                if (this.f68489g == null) {
                    this.f68487e = true;
                    C15646a c15646a = new C15646a("BodyDetect");
                    this.f68489g = c15646a;
                    c15646a.start();
                    if (this.f68490h == null) {
                        this.f68490h = new HandlerC15647b(Looper.myLooper());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
