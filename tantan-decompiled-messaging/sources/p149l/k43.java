package p149l;

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
public class k43 {

    /* JADX INFO: renamed from: a */
    private String f120930a;

    /* JADX INFO: renamed from: b */
    private ByteBuffer f120931b;

    /* JADX INFO: renamed from: e */
    private boolean f120934e;

    /* JADX INFO: renamed from: g */
    private C17923a f120936g;

    /* JADX INFO: renamed from: h */
    private HandlerC17924b f120937h;

    /* JADX INFO: renamed from: l */
    private BodyLandmark f120941l;

    /* JADX INFO: renamed from: m */
    private enl f120942m;

    /* JADX INFO: renamed from: i */
    private vjw f120938i = new vjw();

    /* JADX INFO: renamed from: j */
    private mkw f120939j = new mkw(5);

    /* JADX INFO: renamed from: k */
    private BodyLandmarkPostInfo f120940k = new BodyLandmarkPostInfo();

    /* JADX INFO: renamed from: c */
    private Object f120932c = new Object();

    /* JADX INFO: renamed from: d */
    private Object f120933d = new Object();

    /* JADX INFO: renamed from: f */
    private AtomicBoolean f120935f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l.k43$a */
    public class C17923a extends Thread {
        public C17923a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            k43.this.f120934e = true;
            try {
                synchronized (k43.this.f120932c) {
                    while (k43.this.f120934e) {
                        try {
                            k43.this.f120932c.wait();
                            k43.this.m144471h();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                k43.this.f120931b.clear();
                k43.this.f120931b = null;
            } catch (Exception e) {
                n8c.m158485c("BodyDetector", e.toString());
            }
        }
    }

    /* JADX INFO: renamed from: l.k43$b */
    public class HandlerC17924b extends Handler {
        public HandlerC17924b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (k43.this.f120942m != null) {
                k43.this.f120942m.mo117284b((BodyLandmarkPostInfo) message.obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m144471h() {
        this.f120935f.set(true);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f120941l == null && !TextUtils.isEmpty(this.f120930a)) {
            BodyLandmark bodyLandmark = new BodyLandmark();
            this.f120941l = bodyLandmark;
            bodyLandmark.LoadModel(this.f120930a);
        }
        if (this.f120941l != null) {
            byte[] bArrArray = this.f120931b.array();
            this.f120938i.m198694g(bArrArray);
            this.f120938i.m198693f(bArrArray.length);
            this.f120941l.ProcessFrame(this.f120938i.m198689b(), this.f120939j.m155079a(), this.f120940k);
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f120940k;
            HandlerC17924b handlerC17924b = this.f120937h;
            if (handlerC17924b != null) {
                handlerC17924b.sendMessage(messageObtain);
            }
        }
        xxx.m211572F().m211605d0(SystemClock.elapsedRealtime() - jElapsedRealtime);
        this.f120935f.set(false);
    }

    /* JADX INFO: renamed from: i */
    public void m144472i(enl enlVar) {
        this.f120942m = enlVar;
    }

    /* JADX INFO: renamed from: j */
    public void m144473j(pjw pjwVar) {
        if (this.f120935f.get()) {
            return;
        }
        this.f120938i.m198695h(17);
        this.f120938i.m198700m(pjwVar.f149898e);
        this.f120938i.m198697j(pjwVar.f149899f);
        this.f120938i.m198699l(pjwVar.f149898e);
        this.f120931b = ByteBuffer.wrap(pjwVar.f149900g);
        this.f120939j.m155094p(pjwVar.f149894a);
        this.f120939j.m155066A(pjwVar.f149895b);
        this.f120939j.m155104z(pjwVar.f149896c);
        this.f120939j.m155073H(true);
        synchronized (this.f120932c) {
            this.f120932c.notify();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m144474k(String str) {
        this.f120930a = str;
    }

    /* JADX INFO: renamed from: l */
    public void m144475l() {
        synchronized (this.f120933d) {
            try {
                if (this.f120936g == null) {
                    this.f120934e = true;
                    C17923a c17923a = new C17923a("BodyDetect");
                    this.f120936g = c17923a;
                    c17923a.start();
                    if (this.f120937h == null) {
                        this.f120937h = new HandlerC17924b(Looper.myLooper());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
