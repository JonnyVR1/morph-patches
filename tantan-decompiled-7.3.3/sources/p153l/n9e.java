package p153l;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class n9e extends HandlerThread {

    /* JADX INFO: renamed from: c */
    private static volatile n9e f140887c;

    /* JADX INFO: renamed from: a */
    private Handler f140888a;

    /* JADX INFO: renamed from: b */
    private ArrayList<Runnable> f140889b;

    public n9e(String str) {
        super(str);
        this.f140889b = new ArrayList<>();
    }

    /* JADX INFO: renamed from: a */
    public static n9e m161974a() {
        if (f140887c == null) {
            synchronized (n9e.class) {
                try {
                    if (f140887c == null) {
                        f140887c = new n9e("downloadhandler");
                        f140887c.start();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f140887c;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m161975b(Runnable runnable) {
        try {
            Handler handler = this.f140888a;
            if (handler == null) {
                this.f140889b.add(runnable);
            } else {
                handler.post(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m161976c() {
        try {
            Handler handler = this.f140888a;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f140889b.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.os.HandlerThread
    public synchronized void onLooperPrepared() {
        this.f140888a = new Handler();
        ArrayList arrayList = (ArrayList) this.f140889b.clone();
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f140888a.post((Runnable) it.next());
            }
        }
    }

    @Override // android.os.HandlerThread
    public synchronized boolean quit() {
        m161976c();
        return super.quit();
    }

    @Override // android.os.HandlerThread
    public synchronized boolean quitSafely() {
        m161976c();
        return super.quitSafely();
    }
}
